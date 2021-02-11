/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alignment Cross Beam Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AlignmentCrossBeamType#getOffset1LocX <em>Offset1 Loc X</em>}</li>
 *   <li>{@link Cpacs.AlignmentCrossBeamType#getOffset2LocX <em>Offset2 Loc X</em>}</li>
 *   <li>{@link Cpacs.AlignmentCrossBeamType#getRotationLocX <em>Rotation Loc X</em>}</li>
 *   <li>{@link Cpacs.AlignmentCrossBeamType#getTranslationLocY <em>Translation Loc Y</em>}</li>
 *   <li>{@link Cpacs.AlignmentCrossBeamType#getTranslationLocZ <em>Translation Loc Z</em>}</li>
 *   <li>{@link Cpacs.AlignmentCrossBeamType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAlignmentCrossBeamType()
 * @model extendedMetaData="name='alignmentCrossBeamType' kind='elementOnly'"
 * @generated
 */
public interface AlignmentCrossBeamType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Offset1 Loc X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset in direction of extrusion, first side
	 *                                 (absolute value)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset1 Loc X</em>' containment reference.
	 * @see #setOffset1LocX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAlignmentCrossBeamType_Offset1LocX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset1LocX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOffset1LocX();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentCrossBeamType#getOffset1LocX <em>Offset1 Loc X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset1 Loc X</em>' containment reference.
	 * @see #getOffset1LocX()
	 * @generated
	 */
	void setOffset1LocX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Offset2 Loc X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset in direction of extrusion, second side
	 *                                 (absolute value)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset2 Loc X</em>' containment reference.
	 * @see #setOffset2LocX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAlignmentCrossBeamType_Offset2LocX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset2LocX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOffset2LocX();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentCrossBeamType#getOffset2LocX <em>Offset2 Loc X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset2 Loc X</em>' containment reference.
	 * @see #getOffset2LocX()
	 * @generated
	 */
	void setOffset2LocX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Rotation Loc X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotation around local x axis (extrusion axis)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation Loc X</em>' containment reference.
	 * @see #setRotationLocX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAlignmentCrossBeamType_RotationLocX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotationLocX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotationLocX();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentCrossBeamType#getRotationLocX <em>Rotation Loc X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Loc X</em>' containment reference.
	 * @see #getRotationLocX()
	 * @generated
	 */
	void setRotationLocX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Translation Loc Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation along local y axis (perpendicular
	 *                                 to extrusion axis)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation Loc Y</em>' containment reference.
	 * @see #setTranslationLocY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAlignmentCrossBeamType_TranslationLocY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translationLocY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTranslationLocY();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentCrossBeamType#getTranslationLocY <em>Translation Loc Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Loc Y</em>' containment reference.
	 * @see #getTranslationLocY()
	 * @generated
	 */
	void setTranslationLocY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Translation Loc Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation along local z axis (perpendicular
	 *                                 to x ynd y axes)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation Loc Z</em>' containment reference.
	 * @see #setTranslationLocZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAlignmentCrossBeamType_TranslationLocZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translationLocZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTranslationLocZ();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentCrossBeamType#getTranslationLocZ <em>Translation Loc Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Loc Z</em>' containment reference.
	 * @see #getTranslationLocZ()
	 * @generated
	 */
	void setTranslationLocZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAlignmentCrossBeamType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentCrossBeamType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AlignmentCrossBeamType
