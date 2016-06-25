/**
 */
package NoSQL_Schema.impl;

import NoSQL_Schema.*;

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
public class NoSQL_SchemaFactoryImpl extends EFactoryImpl implements NoSQL_SchemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoSQL_SchemaFactory init() {
		try {
			NoSQL_SchemaFactory theNoSQL_SchemaFactory = (NoSQL_SchemaFactory)EPackage.Registry.INSTANCE.getEFactory(NoSQL_SchemaPackage.eNS_URI);
			if (theNoSQL_SchemaFactory != null) {
				return theNoSQL_SchemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NoSQL_SchemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoSQL_SchemaFactoryImpl() {
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
			case NoSQL_SchemaPackage.NO_SQL_SCHEMA: return createNoSQLSchema();
			case NoSQL_SchemaPackage.ENTITY: return createEntity();
			case NoSQL_SchemaPackage.ENTITY_VERSION: return createEntityVersion();
			case NoSQL_SchemaPackage.ATTRIBUTE: return createAttribute();
			case NoSQL_SchemaPackage.TUPLE: return createTuple();
			case NoSQL_SchemaPackage.REFERENCE: return createReference();
			case NoSQL_SchemaPackage.AGGREGATE: return createAggregate();
			case NoSQL_SchemaPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoSQLSchema createNoSQLSchema() {
		NoSQLSchemaImpl noSQLSchema = new NoSQLSchemaImpl();
		return noSQLSchema;
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
	public NoSQL_SchemaPackage getNoSQL_SchemaPackage() {
		return (NoSQL_SchemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NoSQL_SchemaPackage getPackage() {
		return NoSQL_SchemaPackage.eINSTANCE;
	}

} //NoSQL_SchemaFactoryImpl
