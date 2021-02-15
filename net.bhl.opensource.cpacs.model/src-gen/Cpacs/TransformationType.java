/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TransformationType#getScaling <em>Scaling</em>}</li>
 *   <li>{@link Cpacs.TransformationType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.TransformationType#getTranslation <em>Translation</em>}</li>
 *   <li>{@link Cpacs.TransformationType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransformationType()
 * @model extendedMetaData="name='transformationType' kind='elementOnly'"
 * @generated
 */
public interface TransformationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scaling data default: 1,1,1. Those parameters
	 *                                 describe the scaling of the x-, y-, and z-axis.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scaling</em>' containment reference.
	 * @see #setScaling(PointType)
	 * @see Cpacs.CpacsPackage#getTransformationType_Scaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getScaling();

	/**
	 * Sets the value of the '{@link Cpacs.TransformationType#getScaling <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling</em>' containment reference.
	 * @see #getScaling()
	 * @generated
	 */
	void setScaling(PointType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotation data default: 0,0,0. The rotation
	 *                                 angles are the three Euler angles to describe the orientation of
	 *                                 the coordinate system. The order is allways xyz in CPACS.
	 *                                 Therefore the first rotation is around the x-axis, the second
	 *                                 rotation is around the rotated y-axis (y') and the third
	 *                                 rotation is around the two times rotated z-axis (z'').
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(PointType)
	 * @see Cpacs.CpacsPackage#getTransformationType_Rotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.TransformationType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(PointType value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation data default: 0,0,0. Translations
	 *                                 can either be made absolute in the global coordinate system
	 *                                 (absGlobal), absolute in the local Coordinate system (absLocal)
	 *                                 or relative (relative), normalized with the maximum dimensions
	 *                                 of the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(PointAbsRelType)
	 * @see Cpacs.CpacsPackage#getTransformationType_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointAbsRelType getTranslation();

	/**
	 * Sets the value of the '{@link Cpacs.TransformationType#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(PointAbsRelType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTransformationType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TransformationType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TransformationType
