/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Gear Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MainGearGlobalType#getTotalLength <em>Total Length</em>}</li>
 *   <li>{@link Cpacs.MainGearGlobalType#getRetractAngle <em>Retract Angle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMainGearGlobalType()
 * @model extendedMetaData="name='mainGearGlobalType' kind='elementOnly'"
 * @generated
 */
public interface MainGearGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Total Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total length of main landing gear, equals the
	 *                                 distance form the middle of the bogie/axles to the middle of the
	 *                                 pintle strut. Distance is measured while main landing gear is
	 *                                 fully extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Length</em>' containment reference.
	 * @see #setTotalLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMainGearGlobalType_TotalLength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='totalLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTotalLength();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearGlobalType#getTotalLength <em>Total Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Length</em>' containment reference.
	 * @see #getTotalLength()
	 * @generated
	 */
	void setTotalLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Retract Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retraction angle of the main landing gear.
	 *                                 Equals a rotation around the global z-axis in degrees. 0 =
	 *                                 retraction to the front; 90 = retraction to the left; 180 =
	 *                                 retraction to the rear; 270 = retraction to the right.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retract Angle</em>' containment reference.
	 * @see #setRetractAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMainGearGlobalType_RetractAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='retractAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRetractAngle();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearGlobalType#getRetractAngle <em>Retract Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retract Angle</em>' containment reference.
	 * @see #getRetractAngle()
	 * @generated
	 */
	void setRetractAngle(DoubleBaseType value);

} // MainGearGlobalType
