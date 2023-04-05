/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Data Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroDataVehicleType#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.AeroDataVehicleType#getCoefficientsBreakdown <em>Coefficients Breakdown</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroDataVehicleType()
 * @model extendedMetaData="name='aeroDataVehicleType' kind='elementOnly'"
 * @generated
 */
public interface AeroDataVehicleType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(AeroCaseCoefficientsType)
	 * @see Cpacs.CpacsPackage#getAeroDataVehicleType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroCaseCoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataVehicleType#getCoefficients <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients</em>' containment reference.
	 * @see #getCoefficients()
	 * @generated
	 */
	void setCoefficients(AeroCaseCoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Coefficients Breakdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients Breakdown</em>' containment reference.
	 * @see #setCoefficientsBreakdown(CoefficientsBreakdownType)
	 * @see Cpacs.CpacsPackage#getAeroDataVehicleType_CoefficientsBreakdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coefficientsBreakdown' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsBreakdownType getCoefficientsBreakdown();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataVehicleType#getCoefficientsBreakdown <em>Coefficients Breakdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients Breakdown</em>' containment reference.
	 * @see #getCoefficientsBreakdown()
	 * @generated
	 */
	void setCoefficientsBreakdown(CoefficientsBreakdownType value);

} // AeroDataVehicleType
