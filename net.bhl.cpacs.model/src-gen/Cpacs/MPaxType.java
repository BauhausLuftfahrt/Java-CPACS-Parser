/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPax Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MPaxType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MPaxType#getMPassengers <em>MPassengers</em>}</li>
 *   <li>{@link Cpacs.MPaxType#getMCarryOns <em>MCarry Ons</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMPaxType()
 * @model extendedMetaData="name='mPaxType' kind='elementOnly'"
 * @generated
 */
public interface MPaxType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Passanger masses Description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMPaxType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MPaxType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MPassengers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Passanger mass Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MPassengers</em>' containment reference.
	 * @see #setMPassengers(MPassengersType)
	 * @see Cpacs.CpacsPackage#getMPaxType_MPassengers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPassengers' namespace='##targetNamespace'"
	 * @generated
	 */
	MPassengersType getMPassengers();

	/**
	 * Sets the value of the '{@link Cpacs.MPaxType#getMPassengers <em>MPassengers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPassengers</em>' containment reference.
	 * @see #getMPassengers()
	 * @generated
	 */
	void setMPassengers(MPassengersType value);

	/**
	 * Returns the value of the '<em><b>MCarry Ons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCarry Ons</em>' containment reference.
	 * @see #setMCarryOns(MCarryOnsType)
	 * @see Cpacs.CpacsPackage#getMPaxType_MCarryOns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCarryOns' namespace='##targetNamespace'"
	 * @generated
	 */
	MCarryOnsType getMCarryOns();

	/**
	 * Sets the value of the '{@link Cpacs.MPaxType#getMCarryOns <em>MCarry Ons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCarry Ons</em>' containment reference.
	 * @see #getMCarryOns()
	 * @generated
	 */
	void setMCarryOns(MCarryOnsType value);

} // MPaxType
