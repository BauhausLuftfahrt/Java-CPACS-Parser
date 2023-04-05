/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Released Store Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ReleasedStoreType#getUID <em>UID</em>}</li>
 *   <li>{@link Cpacs.ReleasedStoreType#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getReleasedStoreType()
 * @model extendedMetaData="name='releasedStoreType' kind='elementOnly'"
 * @generated
 */
public interface ReleasedStoreType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 uID of the released store(s).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' containment reference.
	 * @see #setUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getReleasedStoreType_UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ReleasedStoreType#getUID <em>UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' containment reference.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Quantity of  released stores
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getReleasedStoreType_Quantity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getQuantity();

	/**
	 * Sets the value of the '{@link Cpacs.ReleasedStoreType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(IntegerBaseType value);

} // ReleasedStoreType
