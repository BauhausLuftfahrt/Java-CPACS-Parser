/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surfaces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfacesType#getLeadingEdgeDevices <em>Leading Edge Devices</em>}</li>
 *   <li>{@link Cpacs.ControlSurfacesType#getTrailingEdgeDevices <em>Trailing Edge Devices</em>}</li>
 *   <li>{@link Cpacs.ControlSurfacesType#getSpoilers <em>Spoilers</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfacesType()
 * @model extendedMetaData="name='controlSurfacesType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfacesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Leading Edge Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leading Edge Devices</em>' containment reference.
	 * @see #setLeadingEdgeDevices(LeadingEdgeDevicesType)
	 * @see Cpacs.CpacsPackage#getControlSurfacesType_LeadingEdgeDevices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leadingEdgeDevices' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadingEdgeDevicesType getLeadingEdgeDevices();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfacesType#getLeadingEdgeDevices <em>Leading Edge Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leading Edge Devices</em>' containment reference.
	 * @see #getLeadingEdgeDevices()
	 * @generated
	 */
	void setLeadingEdgeDevices(LeadingEdgeDevicesType value);

	/**
	 * Returns the value of the '<em><b>Trailing Edge Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trailing Edge Devices</em>' containment reference.
	 * @see #setTrailingEdgeDevices(TrailingEdgeDevicesType)
	 * @see Cpacs.CpacsPackage#getControlSurfacesType_TrailingEdgeDevices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trailingEdgeDevices' namespace='##targetNamespace'"
	 * @generated
	 */
	TrailingEdgeDevicesType getTrailingEdgeDevices();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfacesType#getTrailingEdgeDevices <em>Trailing Edge Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trailing Edge Devices</em>' containment reference.
	 * @see #getTrailingEdgeDevices()
	 * @generated
	 */
	void setTrailingEdgeDevices(TrailingEdgeDevicesType value);

	/**
	 * Returns the value of the '<em><b>Spoilers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spoilers</em>' containment reference.
	 * @see #setSpoilers(SpoilersType)
	 * @see Cpacs.CpacsPackage#getControlSurfacesType_Spoilers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spoilers' namespace='##targetNamespace'"
	 * @generated
	 */
	SpoilersType getSpoilers();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfacesType#getSpoilers <em>Spoilers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spoilers</em>' containment reference.
	 * @see #getSpoilers()
	 * @generated
	 */
	void setSpoilers(SpoilersType value);

} // ControlSurfacesType
