/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Spinner Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineSpinnerType#getNosePos <em>Nose Pos</em>}</li>
 *   <li>{@link Cpacs.EngineSpinnerType#getBasePos <em>Base Pos</em>}</li>
 *   <li>{@link Cpacs.EngineSpinnerType#getBaseRadius <em>Base Radius</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineSpinnerType()
 * @model extendedMetaData="name='engineSpinnerType' kind='elementOnly'"
 * @generated
 */
public interface EngineSpinnerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Nose Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Most forward x-position of the spinner.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nose Pos</em>' containment reference.
	 * @see #setNosePos(PointXType)
	 * @see Cpacs.CpacsPackage#getEngineSpinnerType_NosePos()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nosePos' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXType getNosePos();

	/**
	 * Sets the value of the '{@link Cpacs.EngineSpinnerType#getNosePos <em>Nose Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nose Pos</em>' containment reference.
	 * @see #getNosePos()
	 * @generated
	 */
	void setNosePos(PointXType value);

	/**
	 * Returns the value of the '<em><b>Base Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-position of the spinner base.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Pos</em>' containment reference.
	 * @see #setBasePos(PointXType)
	 * @see Cpacs.CpacsPackage#getEngineSpinnerType_BasePos()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='basePos' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXType getBasePos();

	/**
	 * Sets the value of the '{@link Cpacs.EngineSpinnerType#getBasePos <em>Base Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Pos</em>' containment reference.
	 * @see #getBasePos()
	 * @generated
	 */
	void setBasePos(PointXType value);

	/**
	 * Returns the value of the '<em><b>Base Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Radius of the spinner at the base position.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Radius</em>' containment reference.
	 * @see #setBaseRadius(PointYType)
	 * @see Cpacs.CpacsPackage#getEngineSpinnerType_BaseRadius()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	PointYType getBaseRadius();

	/**
	 * Sets the value of the '{@link Cpacs.EngineSpinnerType#getBaseRadius <em>Base Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Radius</em>' containment reference.
	 * @see #getBaseRadius()
	 * @generated
	 */
	void setBaseRadius(PointYType value);

} // EngineSpinnerType
