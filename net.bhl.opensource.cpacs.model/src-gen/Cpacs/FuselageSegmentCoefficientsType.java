/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Segment Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageSegmentCoefficientsType#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentCoefficientsType#getStrip <em>Strip</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageSegmentCoefficientsType()
 * @model extendedMetaData="name='fuselageSegmentCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface FuselageSegmentCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the fuselage segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment UID</em>' containment reference.
	 * @see #setSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentCoefficientsType_SegmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentCoefficientsType#getSegmentUID <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UID</em>' containment reference.
	 * @see #getSegmentUID()
	 * @generated
	 */
	void setSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Strip</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageSegmentStripCoefficientsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselageSegmentCoefficientsType_Strip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strip' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageSegmentStripCoefficientsType> getStrip();

} // FuselageSegmentCoefficientsType
