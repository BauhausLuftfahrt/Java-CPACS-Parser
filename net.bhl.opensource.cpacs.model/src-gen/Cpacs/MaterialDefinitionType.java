/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MaterialDefinitionType#getCompositeUID <em>Composite UID</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionType#getOrthotropyDirection <em>Orthotropy Direction</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionType#getThicknessScaling <em>Thickness Scaling</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionType#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionType#getThickness <em>Thickness</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMaterialDefinitionType()
 * @model extendedMetaData="name='materialDefinitionType' kind='elementOnly'"
 * @generated
 */
public interface MaterialDefinitionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Composite UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uID of a composite definition.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite UID</em>' containment reference.
	 * @see #setCompositeUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionType_CompositeUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compositeUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCompositeUID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionType#getCompositeUID <em>Composite UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite UID</em>' containment reference.
	 * @see #getCompositeUID()
	 * @generated
	 */
	void setCompositeUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Orthotropy Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orthotropy direction of the composite.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orthotropy Direction</em>' containment reference.
	 * @see #setOrthotropyDirection(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionType_OrthotropyDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orthotropyDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOrthotropyDirection();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionType#getOrthotropyDirection <em>Orthotropy Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orthotropy Direction</em>' containment reference.
	 * @see #getOrthotropyDirection()
	 * @generated
	 */
	void setOrthotropyDirection(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thickness Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scaling factor of the composite thickness.
	 *                                     Absolute thicknesses are defined in each composite material
	 *                                     separately
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thickness Scaling</em>' containment reference.
	 * @see #setThicknessScaling(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionType_ThicknessScaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thicknessScaling' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThicknessScaling();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionType#getThicknessScaling <em>Thickness Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness Scaling</em>' containment reference.
	 * @see #getThicknessScaling()
	 * @generated
	 */
	void setThicknessScaling(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Material UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uID of a material definition.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material UID</em>' containment reference.
	 * @see #setMaterialUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionType_MaterialUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='materialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMaterialUID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionType#getMaterialUID <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material UID</em>' containment reference.
	 * @see #getMaterialUID()
	 * @generated
	 */
	void setMaterialUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute thickness of the material.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thickness</em>' containment reference.
	 * @see #setThickness(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionType_Thickness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thickness' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThickness();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionType#getThickness <em>Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' containment reference.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(DoubleBaseType value);

} // MaterialDefinitionType
