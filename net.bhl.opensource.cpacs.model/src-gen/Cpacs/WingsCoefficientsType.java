/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wings Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingsCoefficientsType#getWing <em>Wing</em>}</li>
 *   <li>{@link Cpacs.WingsCoefficientsType#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingsCoefficientsType()
 * @model extendedMetaData="name='wingsCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface WingsCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingCoefficientsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingsCoefficientsType_Wing()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingCoefficientsType> getWing();

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference.
	 * @see #setCalibration(CoefficientsType)
	 * @see Cpacs.CpacsPackage#getWingsCoefficientsType_Calibration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibration' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsType getCalibration();

	/**
	 * Sets the value of the '{@link Cpacs.WingsCoefficientsType#getCalibration <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration</em>' containment reference.
	 * @see #getCalibration()
	 * @generated
	 */
	void setCalibration(CoefficientsType value);

} // WingsCoefficientsType
