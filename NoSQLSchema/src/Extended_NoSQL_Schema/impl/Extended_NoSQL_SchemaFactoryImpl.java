/**
 */
package Extended_NoSQL_Schema.impl;

import Extended_NoSQL_Schema.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Extended_NoSQL_SchemaFactoryImpl extends EFactoryImpl implements Extended_NoSQL_SchemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Extended_NoSQL_SchemaFactory init() {
		try {
			Extended_NoSQL_SchemaFactory theExtended_NoSQL_SchemaFactory = (Extended_NoSQL_SchemaFactory)EPackage.Registry.INSTANCE.getEFactory(Extended_NoSQL_SchemaPackage.eNS_URI);
			if (theExtended_NoSQL_SchemaFactory != null) {
				return theExtended_NoSQL_SchemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Extended_NoSQL_SchemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extended_NoSQL_SchemaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL: return createNoSQLDataModel();
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION: return createSchemaVersion();
			case Extended_NoSQL_SchemaPackage.ENTITY: return createEntity();
			case Extended_NoSQL_SchemaPackage.ENTITY_VERSION: return createEntityVersion();
			case Extended_NoSQL_SchemaPackage.ATTRIBUTE: return createAttribute();
			case Extended_NoSQL_SchemaPackage.TUPLE: return createTuple();
			case Extended_NoSQL_SchemaPackage.REFERENCE: return createReference();
			case Extended_NoSQL_SchemaPackage.AGGREGATE: return createAggregate();
			case Extended_NoSQL_SchemaPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoSQLDataModel createNoSQLDataModel() {
		NoSQLDataModelImpl noSQLDataModel = new NoSQLDataModelImpl();
		return noSQLDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion createSchemaVersion() {
		SchemaVersionImpl schemaVersion = new SchemaVersionImpl();
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityVersion createEntityVersion() {
		EntityVersionImpl entityVersion = new EntityVersionImpl();
		return entityVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple createTuple() {
		TupleImpl tuple = new TupleImpl();
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extended_NoSQL_SchemaPackage getExtended_NoSQL_SchemaPackage() {
		return (Extended_NoSQL_SchemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Extended_NoSQL_SchemaPackage getPackage() {
		return Extended_NoSQL_SchemaPackage.eINSTANCE;
	}

} //Extended_NoSQL_SchemaFactoryImpl
