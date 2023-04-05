/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Envelopes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadEnvelopesType#getLoadEnvelope <em>Load Envelope</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadEnvelopesType()
 * @model extendedMetaData="name='loadEnvelopesType' kind='elementOnly'"
 * @generated
 */
public interface LoadEnvelopesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Envelope</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LoadEnvelopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Envelope</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadEnvelopesType_LoadEnvelope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoadEnvelopeType> getLoadEnvelope();

} // LoadEnvelopesType
