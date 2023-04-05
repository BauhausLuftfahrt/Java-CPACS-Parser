/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Definition For Profile Based Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedType#getSheetUID <em>Sheet UID</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedType#getStandardProfileSheetID <em>Standard Profile Sheet ID</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedType#getCompositeUID <em>Composite UID</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedType#getOrthotropyDirection <em>Orthotropy Direction</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedType#getThicknessScaling <em>Thickness Scaling</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedType#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedType#getThickness <em>Thickness</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType()
 * @model extendedMetaData="name='materialDefinitionForProfileBasedType' kind='elementOnly'"
 * @generated
 */
public interface MaterialDefinitionForProfileBasedType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the sheet to which the material
	 *                                     properties shall be applied
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sheet UID</em>' containment reference.
	 * @see #setSheetUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType_SheetUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sheetUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSheetUID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedType#getSheetUID <em>Sheet UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet UID</em>' containment reference.
	 * @see #getSheetUID()
	 * @generated
	 */
	void setSheetUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Standard Profile Sheet ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Predefined ID of the sheet of a standard profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Profile Sheet ID</em>' containment reference.
	 * @see #setStandardProfileSheetID(StandardProfileSheetIDType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType_StandardProfileSheetID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardProfileSheetID' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardProfileSheetIDType getStandardProfileSheetID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedType#getStandardProfileSheetID <em>Standard Profile Sheet ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Profile Sheet ID</em>' containment reference.
	 * @see #getStandardProfileSheetID()
	 * @generated
	 */
	void setStandardProfileSheetID(StandardProfileSheetIDType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the sheet of a standard profile [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

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
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType_CompositeUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compositeUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCompositeUID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedType#getCompositeUID <em>Composite UID</em>}' containment reference.
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
	 * Orthoropy direction of the composite.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orthotropy Direction</em>' containment reference.
	 * @see #setOrthotropyDirection(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType_OrthotropyDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orthotropyDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOrthotropyDirection();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedType#getOrthotropyDirection <em>Orthotropy Direction</em>}' containment reference.
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
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thickness Scaling</em>' containment reference.
	 * @see #setThicknessScaling(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType_ThicknessScaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thicknessScaling' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThicknessScaling();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedType#getThicknessScaling <em>Thickness Scaling</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType_MaterialUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='materialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMaterialUID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedType#getMaterialUID <em>Material UID</em>}' containment reference.
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
	 * Absolute thickness of the material [m]
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thickness</em>' containment reference.
	 * @see #setThickness(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedType_Thickness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thickness' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThickness();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedType#getThickness <em>Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' containment reference.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(DoubleBaseType value);

} // MaterialDefinitionForProfileBasedType
