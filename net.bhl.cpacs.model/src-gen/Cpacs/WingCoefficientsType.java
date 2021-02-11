/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingCoefficientsType#getWingUID <em>Wing UID</em>}</li>
 *   <li>{@link Cpacs.WingCoefficientsType#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.WingCoefficientsType#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingCoefficientsType()
 * @model extendedMetaData="name='wingCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface WingCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the wing segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wing UID</em>' containment reference.
	 * @see #setWingUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingCoefficientsType_WingUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWingUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingCoefficientsType#getWingUID <em>Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing UID</em>' containment reference.
	 * @see #getWingUID()
	 * @generated
	 */
	void setWingUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(CoefficientsType)
	 * @see Cpacs.CpacsPackage#getWingCoefficientsType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.WingCoefficientsType#getCoefficients <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients</em>' containment reference.
	 * @see #getCoefficients()
	 * @generated
	 */
	void setCoefficients(CoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(WingSegmentsCoefficientsType)
	 * @see Cpacs.CpacsPackage#getWingCoefficientsType_Segments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	WingSegmentsCoefficientsType getSegments();

	/**
	 * Sets the value of the '{@link Cpacs.WingCoefficientsType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(WingSegmentsCoefficientsType value);

} // WingCoefficientsType
