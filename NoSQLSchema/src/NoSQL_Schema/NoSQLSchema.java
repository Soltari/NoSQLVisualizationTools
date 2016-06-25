/**
 */
package NoSQL_Schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No SQL Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NoSQL_Schema.NoSQLSchema#getName <em>Name</em>}</li>
 *   <li>{@link NoSQL_Schema.NoSQLSchema#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see NoSQL_Schema.NoSQL_SchemaPackage#getNoSQLSchema()
 * @model
 * @generated
 */
public interface NoSQLSchema extends EObject {
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
	 * @see NoSQL_Schema.NoSQL_SchemaPackage#getNoSQLSchema_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link NoSQL_Schema.NoSQLSchema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link NoSQL_Schema.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see NoSQL_Schema.NoSQL_SchemaPackage#getNoSQLSchema_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

} // NoSQLSchema
