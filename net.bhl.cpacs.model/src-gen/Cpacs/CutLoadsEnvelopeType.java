/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Loads Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutLoadsEnvelopeType#getFuselageCutLoadsEnvelope <em>Fuselage Cut Loads Envelope</em>}</li>
 *   <li>{@link Cpacs.CutLoadsEnvelopeType#getWingCutLoadsEnvelope <em>Wing Cut Loads Envelope</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutLoadsEnvelopeType()
 * @model extendedMetaData="name='cutLoadsEnvelopeType' kind='elementOnly'"
 * @generated
 */
public interface CutLoadsEnvelopeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage Cut Loads Envelope</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ComponentCutLoadsEnvelopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Cut Loads Envelope</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCutLoadsEnvelopeType_FuselageCutLoadsEnvelope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselageCutLoadsEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentCutLoadsEnvelopeType> getFuselageCutLoadsEnvelope();

	/**
	 * Returns the value of the '<em><b>Wing Cut Loads Envelope</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ComponentCutLoadsEnvelopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Cut Loads Envelope</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCutLoadsEnvelopeType_WingCutLoadsEnvelope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingCutLoadsEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentCutLoadsEnvelopeType> getWingCutLoadsEnvelope();

} // CutLoadsEnvelopeType
