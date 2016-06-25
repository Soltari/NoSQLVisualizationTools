/**
 */
package NoSQL_Schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NoSQL_Schema.Reference#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link NoSQL_Schema.Reference#getRefTo <em>Ref To</em>}</li>
 * </ul>
 *
 * @see NoSQL_Schema.NoSQL_SchemaPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Association {
	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Reference)
	 * @see NoSQL_Schema.NoSQL_SchemaPackage#getReference_Opposite()
	 * @model required="true"
	 * @generated
	 */
	Reference getOpposite();

	/**
	 * Sets the value of the '{@link NoSQL_Schema.Reference#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Reference value);

	/**
	 * Returns the value of the '<em><b>Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref To</em>' reference.
	 * @see #setRefTo(Entity)
	 * @see NoSQL_Schema.NoSQL_SchemaPackage#getReference_RefTo()
	 * @model required="true"
	 * @generated
	 */
	Entity getRefTo();

	/**
	 * Sets the value of the '{@link NoSQL_Schema.Reference#getRefTo <em>Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref To</em>' reference.
	 * @see #getRefTo()
	 * @generated
	 */
	void setRefTo(Entity value);

} // Reference
