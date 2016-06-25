package schema.analyzer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;

import NoSQL_Schema.Aggregate;
import NoSQL_Schema.Entity;
import NoSQL_Schema.EntityVersion;
import NoSQL_Schema.NoSQLSchema;
import NoSQL_Schema.Property;
import NoSQL_Schema.Reference;

/**
 * Class used to generate the a Triple collection Entity and EntityVersion from a given NoSQLSchema model.
 * @author Alberto Hernández Chillón
 */
public class SchemaCollector
{
	/**
	 * Method used to generate a collection list from a NoSQLSchema.
	 * @param theSchema The NoSQLSchema to be analyzed.
	 */
	public List<Triple<EntityVersion, Set<EntityVersion>, Set<Entity>>> generateSchemas(NoSQLSchema theSchema)
	{
		Set<EntityVersion> allEntityVersions = new HashSet<EntityVersion>();
		Set<EntityVersion> notPrimitiveEVersions = new HashSet<EntityVersion>();

		// Gather the EntityVersion roots.
		for (Entity entity : theSchema.getEntities())
		{
			for (EntityVersion eVersion : entity.getEntityversions())
			{
				allEntityVersions.add(eVersion);

				// Every time an EntityVersion aggregates another EntityVersion, we are sure that EntityVersion is not a root.
				for (Property property : eVersion.getProperties())
					if (property instanceof Aggregate)
						notPrimitiveEVersions.addAll(((Aggregate)property).getRefTo());
			}
		}

		// For each Root EntityVersion...generate schemas.
		allEntityVersions.removeAll(notPrimitiveEVersions);
		return generateEntityVersionSchemas(allEntityVersions);
	}

	/**
	 * Method used to generate Triple schemas starting from a set of Root EntityVersions.
	 * @param primitiveEntityVersions The primitive EntityVersions for which the schemas will be generated.
	 * @return A List<Triple<EntityVersion, Set<EntityVersion>, Set<Entity>>> containing all the information to generate a schema.
	 */
	private List<Triple<EntityVersion, Set<EntityVersion>, Set<Entity>>> generateEntityVersionSchemas(Set<EntityVersion> primitiveEntityVersions)
	{
		boolean keepDiscovering;
		List<Triple<EntityVersion, Set<EntityVersion>, Set<Entity>>> entityVersionList = new ArrayList<Triple<EntityVersion, Set<EntityVersion>, Set<Entity>>>();

		for (EntityVersion eVersion : primitiveEntityVersions)
		{
			Triple<EntityVersion, Set<EntityVersion>, Set<Entity>> newTriple =
					new ImmutableTriple<EntityVersion, Set<EntityVersion>, Set<Entity>>(eVersion, new HashSet<EntityVersion>(), new HashSet<Entity>());
			entityVersionList.add(newTriple);

			keepDiscovering = true;

			Set<EntityVersion> eVToDiscover = new HashSet<EntityVersion>();
			Set<EntityVersion> newEntityVersions = new HashSet<EntityVersion>();
			Set<Entity> newEntities = new HashSet<Entity>();

			eVToDiscover.add(eVersion);

			/*
			 * Discovery loop.
			 */
			while (keepDiscovering)
			{
				// For each EntityVersion to discover, add more EntityVersions to an auxiliar list.
				for (EntityVersion eV : eVToDiscover)
					newEntityVersions.addAll(getAllEntityVersionsFor(eV));

				// For each EntityVersion to discover, add its Entities to an auxiliar list.
				for (EntityVersion eV : eVToDiscover)
					newEntities.addAll(getAllEntitiesFor(eV));

				// Now that we iterated over each EntityVersion to discover, prepare the list for next iteration.
				// Add the new EntityVersions discovered and the EntityVersions contained in the Entities discovered.
				eVToDiscover.clear();
				eVToDiscover.addAll(newEntityVersions);

				for (Entity entity : newEntities)
					eVToDiscover.addAll(entity.getEntityversions());

				// Now remove EntityVersions that were already discovered before.
				eVToDiscover.removeAll(newTriple.getMiddle());

				// And add to the final lists new discoveries.
				newTriple.getMiddle().addAll(eVToDiscover);
				newTriple.getRight().addAll(newEntities);

				newEntityVersions.clear();
				newEntities.clear();

				// Exit if, and only if, there is no more discovers to do.
				keepDiscovering = !eVToDiscover.isEmpty();
			}
		}

		return entityVersionList;
	}

	/**
	 * Simple method used to return all EntityVersions aggregated by a given EntityVersion.
	 * @param eVersion The EntityVersion whose aggregates will be returned.
	 * @return A Set<EntityVersion> containing all the EntityVersions aggregated.
	 */
	private Set<EntityVersion> getAllEntityVersionsFor(EntityVersion eVersion)
	{
		Set<EntityVersion> newEVersions = new HashSet<EntityVersion>();

		for (Property property : eVersion.getProperties())
			if (property instanceof Aggregate)
				for (EntityVersion refToeVersion : ((Aggregate)property).getRefTo())
					newEVersions.add(refToeVersion);

		return newEVersions;
	}

	/**
	 * Simple method used to return all Entities referenced by a given EntityVersion.
	 * @param eVersion The EntityVersion whose aggregates will be returned.
	 * @return A Set<Entity> containing all the Entities aggregated.
	 */
	private Set<Entity> getAllEntitiesFor(EntityVersion eVersion)
	{
		Set<Entity> newEntities = new HashSet<Entity>();

		for (Property property : eVersion.getProperties())
			if (property instanceof Reference)
				newEntities.add(((Reference)property).getRefTo());

		return newEntities;
	}
}
