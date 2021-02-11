/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alignment String Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AlignmentStringFrameType#getRotationLocX <em>Rotation Loc X</em>}</li>
 *   <li>{@link Cpacs.AlignmentStringFrameType#getTranslationLocY <em>Translation Loc Y</em>}</li>
 *   <li>{@link Cpacs.AlignmentStringFrameType#getTranslationLocZ <em>Translation Loc Z</em>}</li>
 *   <li>{@link Cpacs.AlignmentStringFrameType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAlignmentStringFrameType()
 * @model extendedMetaData="name='alignmentStringFrameType' kind='elementOnly'"
 * @generated
 */
public interface AlignmentStringFrameType extends ComplexBaseType {
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
	 * @see Cpacs.CpacsPackage#getAlignmentStringFrameType_RotationLocX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotationLocX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotationLocX();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentStringFrameType#getRotationLocX <em>Rotation Loc X</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getAlignmentStringFrameType_TranslationLocY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translationLocY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTranslationLocY();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentStringFrameType#getTranslationLocY <em>Translation Loc Y</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getAlignmentStringFrameType_TranslationLocZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translationLocZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTranslationLocZ();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentStringFrameType#getTranslationLocZ <em>Translation Loc Z</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getAlignmentStringFrameType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentStringFrameType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AlignmentStringFrameType
