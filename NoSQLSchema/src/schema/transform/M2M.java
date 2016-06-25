package schema.transform;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.tuple.Triple;
import org.eclipse.emf.common.util.EList;

import Extended_NoSQL_Schema.Extended_NoSQL_SchemaFactory;
import Extended_NoSQL_Schema.NoSQLDataModel;
import Extended_NoSQL_Schema.SchemaVersion;
import schema.analyzer.SchemaCollector;

/**
 * Class used to transform NoSQL_Schema models into Extended_NoSQL_Schema models.
 * @author Alberto Hernández Chillón
 */
public class M2M
{
	/**
	 * Singleton reference.
	 */
	private static M2M instance = null;

	/**
	 * Map in which we store a relation between a NoSQL_Schema.Entity and the corresponding Extended_NoSQL_Schema.Entity.
	 */
	private Map<NoSQL_Schema.Entity, Extended_NoSQL_Schema.Entity> eDictionary;

	/**
	 * Map in which we store a relation between a NoSQL_Schema.EntityVersion and the corresponding Extended_NoSQL_Schema.EntityVersion.
	 */
	private Map<NoSQL_Schema.EntityVersion, Extended_NoSQL_Schema.EntityVersion> evDictionary;

	/**
	 * Map in which we store a Extended_NoSQL_Schema.Reference and the corresponding NoSQL_Schema.Entity to resolve later.
	 */
	private Map<Extended_NoSQL_Schema.Reference, NoSQL_Schema.Entity> pendingReferences;

	/**
	 * Map in which we store a Extended_NoSQL_Schema.Aggregate and the corresponding NoSQL_Schema.EntityVersion list to resolve later.
	 */
	private Map<Extended_NoSQL_Schema.Aggregate, EList<NoSQL_Schema.EntityVersion>> pendingAggregates;

	/**
	 * Method used to get the M2M instance.
	 * @return M2M instance.
	 */
	public static M2M getInstance()
	{
		if (instance == null)
			instance = new M2M();

		return instance;
	}

	/**
	 * Default private constructor.
	 */
	private M2M()
	{
		evDictionary = new HashMap<NoSQL_Schema.EntityVersion, Extended_NoSQL_Schema.EntityVersion>();
		eDictionary = new HashMap<NoSQL_Schema.Entity, Extended_NoSQL_Schema.Entity>();

		pendingReferences = new HashMap<Extended_NoSQL_Schema.Reference, NoSQL_Schema.Entity>();
		pendingAggregates = new HashMap<Extended_NoSQL_Schema.Aggregate, EList<NoSQL_Schema.EntityVersion>>();
	}

	/**
	 * Transform method used to transform NoSQL_Schema.NoSQLSchema into Extended_NoSQL_Schema.NoSQLDataModel.
	 * @param baseModel The NoSQL_Schema.NoSQLSchema object to be transformed.
	 * @return An equivalent Extended_NoSQL_Schema.NoSQLDataModel.
	 */
	public Extended_NoSQL_Schema.NoSQLDataModel transform(NoSQL_Schema.NoSQLSchema baseModel)
	{
		SchemaCollector sCollector = new SchemaCollector();

		NoSQLDataModel dataModel = Extended_NoSQL_SchemaFactory.eINSTANCE.createNoSQLDataModel();
		dataModel.setName(baseModel.getName());

		for (NoSQL_Schema.Entity e : baseModel.getEntities())
			dataModel.getEntities().add(transform(e));

		// Lazy reference resolution.
		for (Extended_NoSQL_Schema.Reference reference : pendingReferences.keySet())
			reference.setRefTo(eDictionary.get(pendingReferences.get(reference)));

		// Lazy aggregate resolution.
		for (Extended_NoSQL_Schema.Aggregate aggregate: pendingAggregates.keySet())
			for (NoSQL_Schema.EntityVersion ev : pendingAggregates.get(aggregate))
				aggregate.getRefTo().add(evDictionary.get(ev));

		for (Triple<NoSQL_Schema.EntityVersion, Set<NoSQL_Schema.EntityVersion>, Set<NoSQL_Schema.Entity>> triple : sCollector.generateSchemas(baseModel))
		{
			SchemaVersion sVersion = Extended_NoSQL_SchemaFactory.eINSTANCE.createSchemaVersion();
			sVersion.setRoot(evDictionary.get(triple.getLeft()));

			for (NoSQL_Schema.EntityVersion ev : triple.getMiddle())
				sVersion.getEntityVersions().add(evDictionary.get(ev));

			for (NoSQL_Schema.Entity e : triple.getRight())
				sVersion.getEntities().add(eDictionary.get(e));

			dataModel.getSchemaVersions().add(sVersion);
		}

		evDictionary.clear();
		eDictionary.clear();

		pendingReferences.clear();
		pendingAggregates.clear();

		return dataModel;
	}

	/**
	 * Method used to transform NoSQL_Schema.Entity into Extended_NoSQL_Schema.Entity.
	 * @param entity The NoSQL_Schema.Entity object to be transformed.
	 * @return An equivalent Extended_NoSQL_Schema.Entity.
	 */
	private Extended_NoSQL_Schema.Entity transform(NoSQL_Schema.Entity entity)
	{
		Extended_NoSQL_Schema.Entity resultEntity = Extended_NoSQL_SchemaFactory.eINSTANCE.createEntity();
		resultEntity.setName(entity.getName());

		for (NoSQL_Schema.EntityVersion eVersion : entity.getEntityversions())
			resultEntity.getEntityversions().add(transform(eVersion));

		eDictionary.put(entity, resultEntity);

		return resultEntity;
	}

	/**
	 * Method used to transform NoSQL_Schema.EntityVersion into Extended_NoSQL_Schema.EntityVersion.
	 * @param entity The NoSQL_Schema.EntityVersion object to be transformed.
	 * @return An equivalent Extended_NoSQL_Schema.EntityVersion.
	 */
	private Extended_NoSQL_Schema.EntityVersion transform(NoSQL_Schema.EntityVersion eVersion)
	{
		Extended_NoSQL_Schema.EntityVersion resultEVersion = Extended_NoSQL_SchemaFactory.eINSTANCE.createEntityVersion();
		resultEVersion.setVersionId(eVersion.getVersionId());

		for (NoSQL_Schema.Property property : eVersion.getProperties())
		{
			if (property instanceof NoSQL_Schema.Attribute)
				resultEVersion.getProperties().add(transform((NoSQL_Schema.Attribute)property));
			else if (property instanceof NoSQL_Schema.Association)
				resultEVersion.getProperties().add(transform((NoSQL_Schema.Association)property));
		}

		evDictionary.put(eVersion, resultEVersion);

		return resultEVersion;
	}

	/**
	 * Method used to transform NoSQL_Schema.Attribute into Extended_NoSQL_Schema.Attribute.
	 * @param entity The NoSQL_Schema.Attribute object to be transformed.
	 * @return An equivalent Extended_NoSQL_Schema.Attribute.
	 */
	private Extended_NoSQL_Schema.Attribute transform(NoSQL_Schema.Attribute attribute)
	{
		Extended_NoSQL_Schema.Attribute resultAttribute = Extended_NoSQL_SchemaFactory.eINSTANCE.createAttribute();
		resultAttribute.setName(attribute.getName());
		resultAttribute.setType(transform(attribute.getType()));

		return resultAttribute;
	}

	/**
	 * Method used to transform NoSQL_Schema.Type into Extended_NoSQL_Schema.Type.
	 * @param entity The NoSQL_Schema.Type object to be transformed.
	 * @return An equivalent Extended_NoSQL_Schema.Type.
	 */
	private Extended_NoSQL_Schema.Type transform(NoSQL_Schema.Type type)
	{
		if (type instanceof NoSQL_Schema.PrimitiveType)
		{
			Extended_NoSQL_Schema.PrimitiveType resultType = Extended_NoSQL_SchemaFactory.eINSTANCE.createPrimitiveType();
			resultType.setName(((NoSQL_Schema.PrimitiveType)type).getName());

			return resultType;
		}
		else if (type instanceof NoSQL_Schema.Tuple)
		{
			Extended_NoSQL_Schema.Tuple resultType = Extended_NoSQL_SchemaFactory.eINSTANCE.createTuple();
			for (NoSQL_Schema.Type inType : ((NoSQL_Schema.Tuple)type).getElements())
				resultType.getElements().add(transform(inType));

			return resultType;
		}

		return null;
	}

	/**
	 * Method used to transform NoSQL_Schema.Association into Extended_NoSQL_Schema.Association.
	 * @param entity The NoSQL_Schema.Association object to be transformed.
	 * @return An equivalent Extended_NoSQL_Schema.Association.
	 */
	private Extended_NoSQL_Schema.Association transform(NoSQL_Schema.Association association)
	{
		if (association instanceof NoSQL_Schema.Reference)
		{
			Extended_NoSQL_Schema.Reference resultAssociation = Extended_NoSQL_SchemaFactory.eINSTANCE.createReference();
			NoSQL_Schema.Reference source = (NoSQL_Schema.Reference)association;
			resultAssociation.setName(source.getName());
			resultAssociation.setLowerBound(source.getLowerBound());
			resultAssociation.setUpperBound(source.getUpperBound());
			resultAssociation.setOpposite((Extended_NoSQL_Schema.Reference)transform(source.getOpposite()));

			pendingReferences.put(resultAssociation, source.getRefTo());

			return resultAssociation;
		}
		else if (association instanceof NoSQL_Schema.Aggregate)
		{
			Extended_NoSQL_Schema.Aggregate resultAssociation = Extended_NoSQL_SchemaFactory.eINSTANCE.createAggregate();
			NoSQL_Schema.Aggregate source = (NoSQL_Schema.Aggregate)association;
			resultAssociation.setName(source.getName());
			resultAssociation.setLowerBound(source.getLowerBound());
			resultAssociation.setUpperBound(source.getUpperBound());

			pendingAggregates.put(resultAssociation, source.getRefTo());

			return resultAssociation;
		}

		return null;
	}
}
