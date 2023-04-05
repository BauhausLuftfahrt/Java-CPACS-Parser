/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficient Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientReferenceType#getArea <em>Area</em>}</li>
 *   <li>{@link Cpacs.CoefficientReferenceType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.CoefficientReferenceType#getGeometryPoint <em>Geometry Point</em>}</li>
 *   <li>{@link Cpacs.CoefficientReferenceType#getDeformationTranslation <em>Deformation Translation</em>}</li>
 *   <li>{@link Cpacs.CoefficientReferenceType#getDeformationRotation <em>Deformation Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientReferenceType()
 * @model extendedMetaData="name='coefficientReferenceType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientReferenceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference area
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientReferenceType_Area()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getArea();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientReferenceType#getArea <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' containment reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference length
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientReferenceType_Length()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientReferenceType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Geometry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference point
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Point</em>' containment reference.
	 * @see #setGeometryPoint(PointXYZType)
	 * @see Cpacs.CpacsPackage#getCoefficientReferenceType_GeometryPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geometryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getGeometryPoint();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientReferenceType#getGeometryPoint <em>Geometry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Point</em>' containment reference.
	 * @see #getGeometryPoint()
	 * @generated
	 */
	void setGeometryPoint(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Deformation Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference translation
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deformation Translation</em>' containment reference.
	 * @see #setDeformationTranslation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getCoefficientReferenceType_DeformationTranslation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deformationTranslation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getDeformationTranslation();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientReferenceType#getDeformationTranslation <em>Deformation Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deformation Translation</em>' containment reference.
	 * @see #getDeformationTranslation()
	 * @generated
	 */
	void setDeformationTranslation(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Deformation Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference rotation
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deformation Rotation</em>' containment reference.
	 * @see #setDeformationRotation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getCoefficientReferenceType_DeformationRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deformationRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getDeformationRotation();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientReferenceType#getDeformationRotation <em>Deformation Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deformation Rotation</em>' containment reference.
	 * @see #getDeformationRotation()
	 * @generated
	 */
	void setDeformationRotation(PointXYZType value);

} // CoefficientReferenceType
