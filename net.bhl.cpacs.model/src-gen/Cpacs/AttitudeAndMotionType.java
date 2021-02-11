/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attitude And Motion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AttitudeAndMotionType#getRefPointUID <em>Ref Point UID</em>}</li>
 *   <li>{@link Cpacs.AttitudeAndMotionType#getRefRotation <em>Ref Rotation</em>}</li>
 *   <li>{@link Cpacs.AttitudeAndMotionType#getTranslation <em>Translation</em>}</li>
 *   <li>{@link Cpacs.AttitudeAndMotionType#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAttitudeAndMotionType()
 * @model extendedMetaData="name='attitudeAndMotionType' kind='elementOnly'"
 * @generated
 */
public interface AttitudeAndMotionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ref Point UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID for reference point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Point UID</em>' containment reference.
	 * @see #setRefPointUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAttitudeAndMotionType_RefPointUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='refPointUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRefPointUID();

	/**
	 * Sets the value of the '{@link Cpacs.AttitudeAndMotionType#getRefPointUID <em>Ref Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Point UID</em>' containment reference.
	 * @see #getRefPointUID()
	 * @generated
	 */
	void setRefPointUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Ref Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID for reference coordinate system (as
	 *                                 aircraft fix coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Rotation</em>' containment reference.
	 * @see #setRefRotation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getAttitudeAndMotionType_RefRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getRefRotation();

	/**
	 * Sets the value of the '{@link Cpacs.AttitudeAndMotionType#getRefRotation <em>Ref Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Rotation</em>' containment reference.
	 * @see #getRefRotation()
	 * @generated
	 */
	void setRefRotation(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(LoadCaseTranslationType)
	 * @see Cpacs.CpacsPackage#getAttitudeAndMotionType_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseTranslationType getTranslation();

	/**
	 * Sets the value of the '{@link Cpacs.AttitudeAndMotionType#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(LoadCaseTranslationType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(LoadCaseRotationType)
	 * @see Cpacs.CpacsPackage#getAttitudeAndMotionType_Rotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseRotationType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.AttitudeAndMotionType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(LoadCaseRotationType value);

} // AttitudeAndMotionType
