/**
 */
package NoSQL_Schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NoSQL_Schema.Entity#getName <em>Name</em>}</li>
 *   <li>{@link NoSQL_Schema.Entity#getEntityversions <em>Entityversions</em>}</li>
 * </ul>
 *
 * @see NoSQL_Schema.NoSQL_SchemaPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see NoSQL_Schema.NoSQL_SchemaPackage#getEntity_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link NoSQL_Schema.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entityversions</b></em>' containment reference list.
	 * The list contents are of type {@link NoSQL_Schema.EntityVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entityversions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entityversions</em>' containment reference list.
	 * @see NoSQL_Schema.NoSQL_SchemaPackage#getEntity_Entityversions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EntityVersion> getEntityversions();

} // Entity
