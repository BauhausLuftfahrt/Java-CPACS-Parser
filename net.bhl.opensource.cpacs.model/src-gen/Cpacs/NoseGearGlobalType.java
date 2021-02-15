/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nose Gear Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NoseGearGlobalType#getTotalLength <em>Total Length</em>}</li>
 *   <li>{@link Cpacs.NoseGearGlobalType#getRetractAngle <em>Retract Angle</em>}</li>
 *   <li>{@link Cpacs.NoseGearGlobalType#getExtAngle <em>Ext Angle</em>}</li>
 *   <li>{@link Cpacs.NoseGearGlobalType#getOffset <em>Offset</em>}</li>
 *   <li>{@link Cpacs.NoseGearGlobalType#getExtractedAngle <em>Extracted Angle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNoseGearGlobalType()
 * @model extendedMetaData="name='noseGearGlobalType' kind='elementOnly'"
 * @generated
 */
public interface NoseGearGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Total Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total length of nose landing gear, equals the
	 *                                 distance form the middle of the bogie/axles to the axis of
	 *                                 rotation of the pintle strut. Distance is measured while nose
	 *                                 landing gear is fully extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Length</em>' containment reference.
	 * @see #setTotalLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNoseGearGlobalType_TotalLength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='totalLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTotalLength();

	/**
	 * Sets the value of the '{@link Cpacs.NoseGearGlobalType#getTotalLength <em>Total Length</em>}' containment reference.
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
	 * Retraction angle of the nose landing gear.
	 *                                 Equals a rotation around the global z-axis in degrees. 0 =
	 *                                 retraction to the front; 90 = retraction to the left; 180 =
	 *                                 retraction to the rear; 270 = retraction to the right.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retract Angle</em>' containment reference.
	 * @see #setRetractAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNoseGearGlobalType_RetractAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='retractAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRetractAngle();

	/**
	 * Sets the value of the '{@link Cpacs.NoseGearGlobalType#getRetractAngle <em>Retract Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retract Angle</em>' containment reference.
	 * @see #getRetractAngle()
	 * @generated
	 */
	void setRetractAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Ext Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle between the full extended and the full
	 *                                 retracted main strut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Angle</em>' containment reference.
	 * @see #setExtAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNoseGearGlobalType_ExtAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getExtAngle();

	/**
	 * Sets the value of the '{@link Cpacs.NoseGearGlobalType#getExtAngle <em>Ext Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Angle</em>' containment reference.
	 * @see #getExtAngle()
	 * @generated
	 */
	void setExtAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance from the upper end of the main strut
	 *                                 to the axis of rotation of the pintle strut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNoseGearGlobalType_Offset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOffset();

	/**
	 * Sets the value of the '{@link Cpacs.NoseGearGlobalType#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Extracted Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of the main strut in extracted position
	 *                                 around the landing gears y-axis. Defaults to 90 degrees which is
	 *                                 vertal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extracted Angle</em>' containment reference.
	 * @see #setExtractedAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNoseGearGlobalType_ExtractedAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extractedAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getExtractedAngle();

	/**
	 * Sets the value of the '{@link Cpacs.NoseGearGlobalType#getExtractedAngle <em>Extracted Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extracted Angle</em>' containment reference.
	 * @see #getExtractedAngle()
	 * @generated
	 */
	void setExtractedAngle(DoubleBaseType value);

} // NoseGearGlobalType
