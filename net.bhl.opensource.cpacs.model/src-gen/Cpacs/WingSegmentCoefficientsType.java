/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Segment Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingSegmentCoefficientsType#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.WingSegmentCoefficientsType#getStrip <em>Strip</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingSegmentCoefficientsType()
 * @model extendedMetaData="name='wingSegmentCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface WingSegmentCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the wing segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment UID</em>' containment reference.
	 * @see #setSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingSegmentCoefficientsType_SegmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingSegmentCoefficientsType#getSegmentUID <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UID</em>' containment reference.
	 * @see #getSegmentUID()
	 * @generated
	 */
	void setSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Strip</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingSegmentStripCoefficientsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingSegmentCoefficientsType_Strip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strip' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingSegmentStripCoefficientsType> getStrip();

} // WingSegmentCoefficientsType
