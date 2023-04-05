/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Gust Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseGustType#getGustShape <em>Gust Shape</em>}</li>
 *   <li>{@link Cpacs.LoadCaseGustType#getGustAngle <em>Gust Angle</em>}</li>
 *   <li>{@link Cpacs.LoadCaseGustType#getGustLength <em>Gust Length</em>}</li>
 *   <li>{@link Cpacs.LoadCaseGustType#getGustVelocity <em>Gust Velocity</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseGustType()
 * @model extendedMetaData="name='loadCaseGustType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseGustType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Gust Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters describing the shape of the gust
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gust Shape</em>' containment reference.
	 * @see #setGustShape(GustShapeType)
	 * @see Cpacs.CpacsPackage#getLoadCaseGustType_GustShape()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gustShape' namespace='##targetNamespace'"
	 * @generated
	 */
	GustShapeType getGustShape();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseGustType#getGustShape <em>Gust Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gust Shape</em>' containment reference.
	 * @see #getGustShape()
	 * @generated
	 */
	void setGustShape(GustShapeType value);

	/**
	 * Returns the value of the '<em><b>Gust Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle between gust and vehicle [deg] (e.g., 0deg: from right to left; 90 deg: downwards; 180deg: from left to right; 270/-90deg: upwards)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gust Angle</em>' containment reference.
	 * @see #setGustAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseGustType_GustAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gustAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGustAngle();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseGustType#getGustAngle <em>Gust Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gust Angle</em>' containment reference.
	 * @see #getGustAngle()
	 * @generated
	 */
	void setGustAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gust Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Gust length: length of ramp or gradient distance of 1-cos gust
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gust Length</em>' containment reference.
	 * @see #setGustLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseGustType_GustLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gustLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGustLength();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseGustType#getGustLength <em>Gust Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gust Length</em>' containment reference.
	 * @see #getGustLength()
	 * @generated
	 */
	void setGustLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gust Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Gust velocity
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gust Velocity</em>' containment reference.
	 * @see #setGustVelocity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseGustType_GustVelocity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gustVelocity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGustVelocity();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseGustType#getGustVelocity <em>Gust Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gust Velocity</em>' containment reference.
	 * @see #getGustVelocity()
	 * @generated
	 */
	void setGustVelocity(DoubleBaseType value);

} // LoadCaseGustType
