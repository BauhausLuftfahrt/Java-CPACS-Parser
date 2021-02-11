/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TransmissionsType#getTransmission <em>Transmission</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransmissionsType()
 * @model extendedMetaData="name='transmissionsType' kind='elementOnly'"
 * @generated
 */
public interface TransmissionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Transmission</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TransmissionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTransmissionsType_Transmission()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transmission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransmissionType> getTransmission();

} // TransmissionsType
