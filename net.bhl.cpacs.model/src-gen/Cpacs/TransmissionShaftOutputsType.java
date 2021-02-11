/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Shaft Outputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TransmissionShaftOutputsType#getShaftoutput <em>Shaftoutput</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransmissionShaftOutputsType()
 * @model extendedMetaData="name='transmissionShaftOutputsType' kind='elementOnly'"
 * @generated
 */
public interface TransmissionShaftOutputsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Shaftoutput</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TransmissionShaftOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaftoutput</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTransmissionShaftOutputsType_Shaftoutput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='shaftoutput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransmissionShaftOutputType> getShaftoutput();

} // TransmissionShaftOutputsType
