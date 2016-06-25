/**
 */
package Extended_NoSQL_Schema.impl;

import Extended_NoSQL_Schema.Entity;
import Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage;
import Extended_NoSQL_Schema.NoSQLDataModel;
import Extended_NoSQL_Schema.SchemaVersion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No SQL Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Extended_NoSQL_Schema.impl.NoSQLDataModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link Extended_NoSQL_Schema.impl.NoSQLDataModelImpl#getSchemaVersions <em>Schema Versions</em>}</li>
 *   <li>{@link Extended_NoSQL_Schema.impl.NoSQLDataModelImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoSQLDataModelImpl extends MinimalEObjectImpl.Container implements NoSQLDataModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchemaVersions() <em>Schema Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaVersion> schemaVersions;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoSQLDataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Extended_NoSQL_SchemaPackage.Literals.NO_SQL_DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemaVersion> getSchemaVersions() {
		if (schemaVersions == null) {
			schemaVersions = new EObjectContainmentEList<SchemaVersion>(SchemaVersion.class, this, Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__SCHEMA_VERSIONS);
		}
		return schemaVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__SCHEMA_VERSIONS:
				return ((InternalEList<?>)getSchemaVersions()).basicRemove(otherEnd, msgs);
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__NAME:
				return getName();
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__SCHEMA_VERSIONS:
				return getSchemaVersions();
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__ENTITIES:
				return getEntities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__NAME:
				setName((String)newValue);
				return;
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__SCHEMA_VERSIONS:
				getSchemaVersions().clear();
				getSchemaVersions().addAll((Collection<? extends SchemaVersion>)newValue);
				return;
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__SCHEMA_VERSIONS:
				getSchemaVersions().clear();
				return;
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__ENTITIES:
				getEntities().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__SCHEMA_VERSIONS:
				return schemaVersions != null && !schemaVersions.isEmpty();
			case Extended_NoSQL_SchemaPackage.NO_SQL_DATA_MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NoSQLDataModelImpl
