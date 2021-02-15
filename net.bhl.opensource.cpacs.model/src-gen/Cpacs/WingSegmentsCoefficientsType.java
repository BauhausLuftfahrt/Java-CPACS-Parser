/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Segments Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingSegmentsCoefficientsType#getSegment <em>Segment</em>}</li>
 *   <li>{@link Cpacs.WingSegmentsCoefficientsType#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingSegmentsCoefficientsType()
 * @model extendedMetaData="name='wingSegmentsCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface WingSegmentsCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingSegmentCoefficientsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingSegmentsCoefficientsType_Segment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingSegmentCoefficientsType> getSegment();

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference.
	 * @see #setCalibration(CoefficientsType)
	 * @see Cpacs.CpacsPackage#getWingSegmentsCoefficientsType_Calibration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibration' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsType getCalibration();

	/**
	 * Sets the value of the '{@link Cpacs.WingSegmentsCoefficientsType#getCalibration <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration</em>' containment reference.
	 * @see #getCalibration()
	 * @generated
	 */
	void setCalibration(CoefficientsType value);

} // WingSegmentsCoefficientsType
