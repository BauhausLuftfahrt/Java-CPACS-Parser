/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leading Edge Devices Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LeadingEdgeDevicesType#getLeadingEdgeDevice <em>Leading Edge Device</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLeadingEdgeDevicesType()
 * @model extendedMetaData="name='leadingEdgeDevicesType' kind='elementOnly'"
 * @generated
 */
public interface LeadingEdgeDevicesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Leading Edge Device</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LeadingEdgeDeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leading Edge Device</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLeadingEdgeDevicesType_LeadingEdgeDevice()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='leadingEdgeDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LeadingEdgeDeviceType> getLeadingEdgeDevice();

} // LeadingEdgeDevicesType
