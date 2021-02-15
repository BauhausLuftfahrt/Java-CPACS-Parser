/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselages Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselagesCoefficientsType#getFuselage <em>Fuselage</em>}</li>
 *   <li>{@link Cpacs.FuselagesCoefficientsType#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselagesCoefficientsType()
 * @model extendedMetaData="name='fuselagesCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface FuselagesCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageCoefficientsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselagesCoefficientsType_Fuselage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageCoefficientsType> getFuselage();

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference.
	 * @see #setCalibration(CoefficientsType)
	 * @see Cpacs.CpacsPackage#getFuselagesCoefficientsType_Calibration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibration' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsType getCalibration();

	/**
	 * Sets the value of the '{@link Cpacs.FuselagesCoefficientsType#getCalibration <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration</em>' containment reference.
	 * @see #getCalibration()
	 * @generated
	 */
	void setCalibration(CoefficientsType value);

} // FuselagesCoefficientsType
