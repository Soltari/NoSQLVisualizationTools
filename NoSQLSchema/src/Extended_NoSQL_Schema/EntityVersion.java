/**
 */
package Extended_NoSQL_Schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Extended_NoSQL_Schema.EntityVersion#getVersionId <em>Version Id</em>}</li>
 *   <li>{@link Extended_NoSQL_Schema.EntityVersion#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getEntityVersion()
 * @model
 * @generated
 */
public interface EntityVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Id</em>' attribute.
	 * @see #setVersionId(int)
	 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getEntityVersion_VersionId()
	 * @model required="true"
	 * @generated
	 */
	int getVersionId();

	/**
	 * Sets the value of the '{@link Extended_NoSQL_Schema.EntityVersion#getVersionId <em>Version Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Id</em>' attribute.
	 * @see #getVersionId()
	 * @generated
	 */
	void setVersionId(int value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link Extended_NoSQL_Schema.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getEntityVersion_Properties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // EntityVersion
