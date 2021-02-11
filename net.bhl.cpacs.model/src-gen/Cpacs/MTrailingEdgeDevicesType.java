/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTrailing Edge Devices Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MTrailingEdgeDevicesType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MTrailingEdgeDevicesType#getMTrailingEdgeDevice <em>MTrailing Edge Device</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMTrailingEdgeDevicesType()
 * @model extendedMetaData="name='mTrailingEdgeDevicesType' kind='elementOnly'"
 * @generated
 */
public interface MTrailingEdgeDevicesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMTrailingEdgeDevicesType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MTrailingEdgeDevicesType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MTrailing Edge Device</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MTrailingEdgeDeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTrailing Edge Device</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMTrailingEdgeDevicesType_MTrailingEdgeDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mTrailingEdgeDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MTrailingEdgeDeviceType> getMTrailingEdgeDevice();

} // MTrailingEdgeDevicesType
