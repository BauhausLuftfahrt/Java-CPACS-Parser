/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageCoefficientsType#getFuselageUID <em>Fuselage UID</em>}</li>
 *   <li>{@link Cpacs.FuselageCoefficientsType#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.FuselageCoefficientsType#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageCoefficientsType()
 * @model extendedMetaData="name='fuselageCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface FuselageCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the fuselage segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuselage UID</em>' containment reference.
	 * @see #setFuselageUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCoefficientsType_FuselageUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFuselageUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCoefficientsType#getFuselageUID <em>Fuselage UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage UID</em>' containment reference.
	 * @see #getFuselageUID()
	 * @generated
	 */
	void setFuselageUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(CoefficientsType)
	 * @see Cpacs.CpacsPackage#getFuselageCoefficientsType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCoefficientsType#getCoefficients <em>Coefficients</em>}' containment reference.
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
	 * @see #setSegments(FuselageSegmentsCoefficientsType)
	 * @see Cpacs.CpacsPackage#getFuselageCoefficientsType_Segments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselageSegmentsCoefficientsType getSegments();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCoefficientsType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(FuselageSegmentsCoefficientsType value);

} // FuselageCoefficientsType
