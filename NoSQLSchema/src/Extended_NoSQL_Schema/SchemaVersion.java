/**
 */
package Extended_NoSQL_Schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Extended_NoSQL_Schema.SchemaVersion#getRoot <em>Root</em>}</li>
 *   <li>{@link Extended_NoSQL_Schema.SchemaVersion#getEntityVersions <em>Entity Versions</em>}</li>
 *   <li>{@link Extended_NoSQL_Schema.SchemaVersion#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getSchemaVersion()
 * @model
 * @generated
 */
public interface SchemaVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(EntityVersion)
	 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getSchemaVersion_Root()
	 * @model required="true"
	 * @generated
	 */
	EntityVersion getRoot();

	/**
	 * Sets the value of the '{@link Extended_NoSQL_Schema.SchemaVersion#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(EntityVersion value);

	/**
	 * Returns the value of the '<em><b>Entity Versions</b></em>' reference list.
	 * The list contents are of type {@link Extended_NoSQL_Schema.EntityVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Versions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Versions</em>' reference list.
	 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getSchemaVersion_EntityVersions()
	 * @model
	 * @generated
	 */
	EList<EntityVersion> getEntityVersions();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link Extended_NoSQL_Schema.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getSchemaVersion_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

} // SchemaVersion
