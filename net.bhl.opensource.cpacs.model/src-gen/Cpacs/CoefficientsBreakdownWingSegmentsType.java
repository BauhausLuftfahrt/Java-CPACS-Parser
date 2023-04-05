/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Breakdown Wing Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsBreakdownWingSegmentsType#getSegment <em>Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingSegmentsType()
 * @model extendedMetaData="name='coefficientsBreakdownWingSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsBreakdownWingSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CoefficientsBreakdownSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingSegmentsType_Segment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoefficientsBreakdownSegmentType> getSegment();

} // CoefficientsBreakdownWingSegmentsType
