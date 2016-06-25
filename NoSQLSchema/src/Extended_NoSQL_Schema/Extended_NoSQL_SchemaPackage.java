/**
 */
package Extended_NoSQL_Schema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaFactory
 * @model kind="package"
 * @generated
 */
public interface Extended_NoSQL_SchemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Extended_NoSQL_Schema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelum.es/extended_nosql_schema";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Extended_NoSQL_Schema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Extended_NoSQL_SchemaPackage eINSTANCE = Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.NoSQLDataModelImpl <em>No SQL Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.NoSQLDataModelImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getNoSQLDataModel()
	 * @generated
	 */
	int NO_SQL_DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATA_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATA_MODEL__SCHEMA_VERSIONS = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATA_MODEL__ENTITIES = 2;

	/**
	 * The number of structural features of the '<em>No SQL Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATA_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>No SQL Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.SchemaVersionImpl <em>Schema Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.SchemaVersionImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getSchemaVersion()
	 * @generated
	 */
	int SCHEMA_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_VERSION__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Entity Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_VERSION__ENTITY_VERSIONS = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_VERSION__ENTITIES = 2;

	/**
	 * The number of structural features of the '<em>Schema Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_VERSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Schema Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.EntityImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entityversions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITYVERSIONS = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.EntityVersionImpl <em>Entity Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.EntityVersionImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getEntityVersion()
	 * @generated
	 */
	int ENTITY_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VERSION__VERSION_ID = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VERSION__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Entity Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VERSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.PropertyImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.AttributeImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.TypeImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.TupleImpl <em>Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.TupleImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getTuple()
	 * @generated
	 */
	int TUPLE = 7;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__ELEMENTS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.AssociationImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LOWER_BOUND = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__UPPER_BOUND = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.ReferenceImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LOWER_BOUND = ASSOCIATION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__UPPER_BOUND = ASSOCIATION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OPPOSITE = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REF_TO = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.AggregateImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__LOWER_BOUND = ASSOCIATION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__UPPER_BOUND = ASSOCIATION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Ref To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__REF_TO = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Extended_NoSQL_Schema.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Extended_NoSQL_Schema.impl.PrimitiveTypeImpl
	 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.NoSQLDataModel <em>No SQL Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No SQL Data Model</em>'.
	 * @see Extended_NoSQL_Schema.NoSQLDataModel
	 * @generated
	 */
	EClass getNoSQLDataModel();

	/**
	 * Returns the meta object for the attribute '{@link Extended_NoSQL_Schema.NoSQLDataModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Extended_NoSQL_Schema.NoSQLDataModel#getName()
	 * @see #getNoSQLDataModel()
	 * @generated
	 */
	EAttribute getNoSQLDataModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Extended_NoSQL_Schema.NoSQLDataModel#getSchemaVersions <em>Schema Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Versions</em>'.
	 * @see Extended_NoSQL_Schema.NoSQLDataModel#getSchemaVersions()
	 * @see #getNoSQLDataModel()
	 * @generated
	 */
	EReference getNoSQLDataModel_SchemaVersions();

	/**
	 * Returns the meta object for the containment reference list '{@link Extended_NoSQL_Schema.NoSQLDataModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see Extended_NoSQL_Schema.NoSQLDataModel#getEntities()
	 * @see #getNoSQLDataModel()
	 * @generated
	 */
	EReference getNoSQLDataModel_Entities();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.SchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Version</em>'.
	 * @see Extended_NoSQL_Schema.SchemaVersion
	 * @generated
	 */
	EClass getSchemaVersion();

	/**
	 * Returns the meta object for the reference '{@link Extended_NoSQL_Schema.SchemaVersion#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see Extended_NoSQL_Schema.SchemaVersion#getRoot()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	EReference getSchemaVersion_Root();

	/**
	 * Returns the meta object for the reference list '{@link Extended_NoSQL_Schema.SchemaVersion#getEntityVersions <em>Entity Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity Versions</em>'.
	 * @see Extended_NoSQL_Schema.SchemaVersion#getEntityVersions()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	EReference getSchemaVersion_EntityVersions();

	/**
	 * Returns the meta object for the reference list '{@link Extended_NoSQL_Schema.SchemaVersion#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see Extended_NoSQL_Schema.SchemaVersion#getEntities()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	EReference getSchemaVersion_Entities();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see Extended_NoSQL_Schema.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link Extended_NoSQL_Schema.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Extended_NoSQL_Schema.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Extended_NoSQL_Schema.Entity#getEntityversions <em>Entityversions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entityversions</em>'.
	 * @see Extended_NoSQL_Schema.Entity#getEntityversions()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entityversions();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.EntityVersion <em>Entity Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Version</em>'.
	 * @see Extended_NoSQL_Schema.EntityVersion
	 * @generated
	 */
	EClass getEntityVersion();

	/**
	 * Returns the meta object for the attribute '{@link Extended_NoSQL_Schema.EntityVersion#getVersionId <em>Version Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Id</em>'.
	 * @see Extended_NoSQL_Schema.EntityVersion#getVersionId()
	 * @see #getEntityVersion()
	 * @generated
	 */
	EAttribute getEntityVersion_VersionId();

	/**
	 * Returns the meta object for the containment reference list '{@link Extended_NoSQL_Schema.EntityVersion#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see Extended_NoSQL_Schema.EntityVersion#getProperties()
	 * @see #getEntityVersion()
	 * @generated
	 */
	EReference getEntityVersion_Properties();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see Extended_NoSQL_Schema.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link Extended_NoSQL_Schema.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Extended_NoSQL_Schema.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see Extended_NoSQL_Schema.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link Extended_NoSQL_Schema.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Extended_NoSQL_Schema.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see Extended_NoSQL_Schema.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple</em>'.
	 * @see Extended_NoSQL_Schema.Tuple
	 * @generated
	 */
	EClass getTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link Extended_NoSQL_Schema.Tuple#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see Extended_NoSQL_Schema.Tuple#getElements()
	 * @see #getTuple()
	 * @generated
	 */
	EReference getTuple_Elements();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see Extended_NoSQL_Schema.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link Extended_NoSQL_Schema.Association#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see Extended_NoSQL_Schema.Association#getLowerBound()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link Extended_NoSQL_Schema.Association#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see Extended_NoSQL_Schema.Association#getUpperBound()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_UpperBound();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see Extended_NoSQL_Schema.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link Extended_NoSQL_Schema.Reference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see Extended_NoSQL_Schema.Reference#getOpposite()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Opposite();

	/**
	 * Returns the meta object for the reference '{@link Extended_NoSQL_Schema.Reference#getRefTo <em>Ref To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref To</em>'.
	 * @see Extended_NoSQL_Schema.Reference#getRefTo()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_RefTo();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see Extended_NoSQL_Schema.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the reference list '{@link Extended_NoSQL_Schema.Aggregate#getRefTo <em>Ref To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref To</em>'.
	 * @see Extended_NoSQL_Schema.Aggregate#getRefTo()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_RefTo();

	/**
	 * Returns the meta object for class '{@link Extended_NoSQL_Schema.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see Extended_NoSQL_Schema.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link Extended_NoSQL_Schema.PrimitiveType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Extended_NoSQL_Schema.PrimitiveType#getName()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Extended_NoSQL_SchemaFactory getExtended_NoSQL_SchemaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.NoSQLDataModelImpl <em>No SQL Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.NoSQLDataModelImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getNoSQLDataModel()
		 * @generated
		 */
		EClass NO_SQL_DATA_MODEL = eINSTANCE.getNoSQLDataModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_SQL_DATA_MODEL__NAME = eINSTANCE.getNoSQLDataModel_Name();

		/**
		 * The meta object literal for the '<em><b>Schema Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_SQL_DATA_MODEL__SCHEMA_VERSIONS = eINSTANCE.getNoSQLDataModel_SchemaVersions();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_SQL_DATA_MODEL__ENTITIES = eINSTANCE.getNoSQLDataModel_Entities();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.SchemaVersionImpl <em>Schema Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.SchemaVersionImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getSchemaVersion()
		 * @generated
		 */
		EClass SCHEMA_VERSION = eINSTANCE.getSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_VERSION__ROOT = eINSTANCE.getSchemaVersion_Root();

		/**
		 * The meta object literal for the '<em><b>Entity Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_VERSION__ENTITY_VERSIONS = eINSTANCE.getSchemaVersion_EntityVersions();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_VERSION__ENTITIES = eINSTANCE.getSchemaVersion_Entities();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.EntityImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Entityversions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITYVERSIONS = eINSTANCE.getEntity_Entityversions();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.EntityVersionImpl <em>Entity Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.EntityVersionImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getEntityVersion()
		 * @generated
		 */
		EClass ENTITY_VERSION = eINSTANCE.getEntityVersion();

		/**
		 * The meta object literal for the '<em><b>Version Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_VERSION__VERSION_ID = eINSTANCE.getEntityVersion_VersionId();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_VERSION__PROPERTIES = eINSTANCE.getEntityVersion_Properties();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.PropertyImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.AttributeImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.TypeImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.TupleImpl <em>Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.TupleImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getTuple()
		 * @generated
		 */
		EClass TUPLE = eINSTANCE.getTuple();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE__ELEMENTS = eINSTANCE.getTuple_Elements();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.AssociationImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__LOWER_BOUND = eINSTANCE.getAssociation_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__UPPER_BOUND = eINSTANCE.getAssociation_UpperBound();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.ReferenceImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

		/**
		 * The meta object literal for the '<em><b>Ref To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REF_TO = eINSTANCE.getReference_RefTo();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.AggregateImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Ref To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__REF_TO = eINSTANCE.getAggregate_RefTo();

		/**
		 * The meta object literal for the '{@link Extended_NoSQL_Schema.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Extended_NoSQL_Schema.impl.PrimitiveTypeImpl
		 * @see Extended_NoSQL_Schema.impl.Extended_NoSQL_SchemaPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__NAME = eINSTANCE.getPrimitiveType_Name();

	}

} //Extended_NoSQL_SchemaPackage
