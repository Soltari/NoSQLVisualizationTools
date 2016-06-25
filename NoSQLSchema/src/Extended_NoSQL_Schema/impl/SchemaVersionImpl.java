/**
 */
package Extended_NoSQL_Schema.impl;

import Extended_NoSQL_Schema.Entity;
import Extended_NoSQL_Schema.EntityVersion;
import Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage;
import Extended_NoSQL_Schema.SchemaVersion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Extended_NoSQL_Schema.impl.SchemaVersionImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link Extended_NoSQL_Schema.impl.SchemaVersionImpl#getEntityVersions <em>Entity Versions</em>}</li>
 *   <li>{@link Extended_NoSQL_Schema.impl.SchemaVersionImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaVersionImpl extends MinimalEObjectImpl.Container implements SchemaVersion {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected EntityVersion root;

	/**
	 * The cached value of the '{@link #getEntityVersions() <em>Entity Versions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityVersion> entityVersions;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
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
	protected SchemaVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Extended_NoSQL_SchemaPackage.Literals.SCHEMA_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityVersion getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (EntityVersion)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityVersion basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(EntityVersion newRoot) {
		EntityVersion oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityVersion> getEntityVersions() {
		if (entityVersions == null) {
			entityVersions = new EObjectResolvingEList<EntityVersion>(EntityVersion.class, this, Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITY_VERSIONS);
		}
		return entityVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITY_VERSIONS:
				return getEntityVersions();
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITIES:
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
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ROOT:
				setRoot((EntityVersion)newValue);
				return;
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITY_VERSIONS:
				getEntityVersions().clear();
				getEntityVersions().addAll((Collection<? extends EntityVersion>)newValue);
				return;
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITIES:
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
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ROOT:
				setRoot((EntityVersion)null);
				return;
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITY_VERSIONS:
				getEntityVersions().clear();
				return;
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITIES:
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
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ROOT:
				return root != null;
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITY_VERSIONS:
				return entityVersions != null && !entityVersions.isEmpty();
			case Extended_NoSQL_SchemaPackage.SCHEMA_VERSION__ENTITIES:
				return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaVersionImpl
