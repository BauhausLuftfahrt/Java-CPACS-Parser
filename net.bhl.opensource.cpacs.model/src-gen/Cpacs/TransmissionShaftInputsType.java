/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Shaft Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TransmissionShaftInputsType#getShaftInput <em>Shaft Input</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransmissionShaftInputsType()
 * @model extendedMetaData="name='transmissionShaftInputsType' kind='elementOnly'"
 * @generated
 */
public interface TransmissionShaftInputsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Shaft Input</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TransmissionShaftInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft Input</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTransmissionShaftInputsType_ShaftInput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='shaftInput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransmissionShaftInputType> getShaftInput();

} // TransmissionShaftInputsType
