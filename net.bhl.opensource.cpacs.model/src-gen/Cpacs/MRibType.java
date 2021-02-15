/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MRib Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MRibType#getRibNumber <em>Rib Number</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMRibType()
 * @model extendedMetaData="name='mRibType' kind='elementOnly'"
 * @generated
 */
public interface MRibType extends GenericMassType {
	/**
	 * Returns the value of the '<em><b>Rib Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Number</em>' containment reference.
	 * @see #setRibNumber(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getMRibType_RibNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getRibNumber();

	/**
	 * Sets the value of the '{@link Cpacs.MRibType#getRibNumber <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Number</em>' containment reference.
	 * @see #getRibNumber()
	 * @generated
	 */
	void setRibNumber(IntegerBaseType value);

} // MRibType
