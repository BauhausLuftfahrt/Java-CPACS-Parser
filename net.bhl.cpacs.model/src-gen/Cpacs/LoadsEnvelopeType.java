/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loads Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadsEnvelopeType#getCutLoadsEnvelope <em>Cut Loads Envelope</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadsEnvelopeType()
 * @model extendedMetaData="name='loadsEnvelopeType' kind='elementOnly'"
 * @generated
 */
public interface LoadsEnvelopeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cut Loads Envelope</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CutLoadsEnvelopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Loads Envelope</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadsEnvelopeType_CutLoadsEnvelope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cutLoadsEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CutLoadsEnvelopeType> getCutLoadsEnvelope();

} // LoadsEnvelopeType
