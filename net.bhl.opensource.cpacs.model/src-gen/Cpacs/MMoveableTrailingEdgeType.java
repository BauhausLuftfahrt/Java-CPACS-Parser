/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMoveable Trailing Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MMoveableTrailingEdgeType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MMoveableTrailingEdgeType#getMSpoilers <em>MSpoilers</em>}</li>
 *   <li>{@link Cpacs.MMoveableTrailingEdgeType#getMTrailingEdgeDevices <em>MTrailing Edge Devices</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMMoveableTrailingEdgeType()
 * @model extendedMetaData="name='mMoveableTrailingEdgeType' kind='elementOnly'"
 * @generated
 */
public interface MMoveableTrailingEdgeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMMoveableTrailingEdgeType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MMoveableTrailingEdgeType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MSpoilers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpoilers</em>' containment reference.
	 * @see #setMSpoilers(MSpoilersType)
	 * @see Cpacs.CpacsPackage#getMMoveableTrailingEdgeType_MSpoilers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSpoilers' namespace='##targetNamespace'"
	 * @generated
	 */
	MSpoilersType getMSpoilers();

	/**
	 * Sets the value of the '{@link Cpacs.MMoveableTrailingEdgeType#getMSpoilers <em>MSpoilers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSpoilers</em>' containment reference.
	 * @see #getMSpoilers()
	 * @generated
	 */
	void setMSpoilers(MSpoilersType value);

	/**
	 * Returns the value of the '<em><b>MTrailing Edge Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTrailing Edge Devices</em>' containment reference.
	 * @see #setMTrailingEdgeDevices(MTrailingEdgeDevicesType)
	 * @see Cpacs.CpacsPackage#getMMoveableTrailingEdgeType_MTrailingEdgeDevices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mTrailingEdgeDevices' namespace='##targetNamespace'"
	 * @generated
	 */
	MTrailingEdgeDevicesType getMTrailingEdgeDevices();

	/**
	 * Sets the value of the '{@link Cpacs.MMoveableTrailingEdgeType#getMTrailingEdgeDevices <em>MTrailing Edge Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTrailing Edge Devices</em>' containment reference.
	 * @see #getMTrailingEdgeDevices()
	 * @generated
	 */
	void setMTrailingEdgeDevices(MTrailingEdgeDevicesType value);

} // MMoveableTrailingEdgeType
