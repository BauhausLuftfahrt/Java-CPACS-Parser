/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runway Start Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RunwayStartPositionType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.RunwayStartPositionType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.RunwayStartPositionType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.RunwayStartPositionType#getDistance <em>Distance</em>}</li>
 *   <li>{@link Cpacs.RunwayStartPositionType#getLateralOffset <em>Lateral Offset</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRunwayStartPositionType()
 * @model extendedMetaData="name='runwayStartPositionType' kind='elementOnly'"
 * @generated
 */
public interface RunwayStartPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     X-position in cartesian coordinates in the runway coordinate system
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayStartPositionType_X()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayStartPositionType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Y-position in cartesian coordinates in the runway coordinate system
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayStartPositionType_Y()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayStartPositionType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Z-position in cartesian coordinates in the runway coordinate system
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayStartPositionType_Z()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayStartPositionType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Lengthwise distance along the runway centerline from the runway threshold
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayStartPositionType_Distance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDistance();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayStartPositionType#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Lateral Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Lateral offset from the runway centerline. Positive values on the starboard side.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lateral Offset</em>' containment reference.
	 * @see #setLateralOffset(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayStartPositionType_LateralOffset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lateralOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLateralOffset();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayStartPositionType#getLateralOffset <em>Lateral Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lateral Offset</em>' containment reference.
	 * @see #getLateralOffset()
	 * @generated
	 */
	void setLateralOffset(DoubleBaseType value);

} // RunwayStartPositionType
