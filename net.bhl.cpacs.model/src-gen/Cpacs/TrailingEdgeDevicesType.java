/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trailing Edge Devices Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrailingEdgeDevicesType#getTrailingEdgeDevice <em>Trailing Edge Device</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrailingEdgeDevicesType()
 * @model extendedMetaData="name='trailingEdgeDevicesType' kind='elementOnly'"
 * @generated
 */
public interface TrailingEdgeDevicesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Trailing Edge Device</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TrailingEdgeDeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trailing Edge Device</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDevicesType_TrailingEdgeDevice()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trailingEdgeDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrailingEdgeDeviceType> getTrailingEdgeDevice();

} // TrailingEdgeDevicesType
