/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Segments Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageSegmentsCoefficientsType#getSegment <em>Segment</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentsCoefficientsType#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageSegmentsCoefficientsType()
 * @model extendedMetaData="name='fuselageSegmentsCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface FuselageSegmentsCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageSegmentCoefficientsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselageSegmentsCoefficientsType_Segment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageSegmentCoefficientsType> getSegment();

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference.
	 * @see #setCalibration(CoefficientsType)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentsCoefficientsType_Calibration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibration' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsType getCalibration();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentsCoefficientsType#getCalibration <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration</em>' containment reference.
	 * @see #getCalibration()
	 * @generated
	 */
	void setCalibration(CoefficientsType value);

} // FuselageSegmentsCoefficientsType
