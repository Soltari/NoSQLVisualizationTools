/**
 */
package Extended_NoSQL_Schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Extended_NoSQL_Schema.PrimitiveType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
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
	 * @see Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage#getPrimitiveType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Extended_NoSQL_Schema.PrimitiveType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PrimitiveType
