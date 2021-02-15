/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTrailing Edge Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MTrailingEdgeDeviceType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MTrailingEdgeDeviceType#getMBody <em>MBody</em>}</li>
 *   <li>{@link Cpacs.MTrailingEdgeDeviceType#getMCarriages <em>MCarriages</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMTrailingEdgeDeviceType()
 * @model extendedMetaData="name='mTrailingEdgeDeviceType' kind='elementOnly'"
 * @generated
 */
public interface MTrailingEdgeDeviceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMTrailingEdgeDeviceType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MTrailingEdgeDeviceType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MBody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBody</em>' containment reference.
	 * @see #setMBody(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMTrailingEdgeDeviceType_MBody()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mBody' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMBody();

	/**
	 * Sets the value of the '{@link Cpacs.MTrailingEdgeDeviceType#getMBody <em>MBody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBody</em>' containment reference.
	 * @see #getMBody()
	 * @generated
	 */
	void setMBody(SingleGenericMassType value);

	/**
	 * Returns the value of the '<em><b>MCarriages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCarriages</em>' containment reference.
	 * @see #setMCarriages(MCarriagesType)
	 * @see Cpacs.CpacsPackage#getMTrailingEdgeDeviceType_MCarriages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCarriages' namespace='##targetNamespace'"
	 * @generated
	 */
	MCarriagesType getMCarriages();

	/**
	 * Sets the value of the '{@link Cpacs.MTrailingEdgeDeviceType#getMCarriages <em>MCarriages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCarriages</em>' containment reference.
	 * @see #getMCarriages()
	 * @generated
	 */
	void setMCarriages(MCarriagesType value);

} // MTrailingEdgeDeviceType
