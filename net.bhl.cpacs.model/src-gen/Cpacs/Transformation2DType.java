/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation2 DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.Transformation2DType#getScaling <em>Scaling</em>}</li>
 *   <li>{@link Cpacs.Transformation2DType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.Transformation2DType#getTranslation <em>Translation</em>}</li>
 *   <li>{@link Cpacs.Transformation2DType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransformation2DType()
 * @model extendedMetaData="name='transformation2DType' kind='elementOnly'"
 * @generated
 */
public interface Transformation2DType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scaling of the structural profile
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scaling</em>' containment reference.
	 * @see #setScaling(PointXYType)
	 * @see Cpacs.CpacsPackage#getTransformation2DType_Scaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYType getScaling();

	/**
	 * Sets the value of the '{@link Cpacs.Transformation2DType#getScaling <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling</em>' containment reference.
	 * @see #getScaling()
	 * @generated
	 */
	void setScaling(PointXYType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * rotation around z-axis of profile definition
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(PointZType)
	 * @see Cpacs.CpacsPackage#getTransformation2DType_Rotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointZType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.Transformation2DType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(PointZType value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * translation of profile definition
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(PointXYType)
	 * @see Cpacs.CpacsPackage#getTransformation2DType_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYType getTranslation();

	/**
	 * Sets the value of the '{@link Cpacs.Transformation2DType#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(PointXYType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTransformation2DType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.Transformation2DType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // Transformation2DType
