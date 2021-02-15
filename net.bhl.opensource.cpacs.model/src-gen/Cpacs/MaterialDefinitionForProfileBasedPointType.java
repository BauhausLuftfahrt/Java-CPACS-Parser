/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Definition For Profile Based Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getPointUID <em>Point UID</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getOptionalAux1 <em>Optional Aux1</em>}</li>
 *   <li>{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getOptionalAux2 <em>Optional Aux2</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedPointType()
 * @model extendedMetaData="name='materialDefinitionForProfileBasedPointType' kind='elementOnly'"
 * @generated
 */
public interface MaterialDefinitionForProfileBasedPointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uID of the profile point to which the
	 *                                 additional stiffness shall be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point UID</em>' containment reference.
	 * @see #setPointUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedPointType_PointUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPointUID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getPointUID <em>Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point UID</em>' containment reference.
	 * @see #getPointUID()
	 * @generated
	 */
	void setPointUID(StringUIDBaseType value);

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
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedPointType_MaterialUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='materialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMaterialUID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getMaterialUID <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material UID</em>' containment reference.
	 * @see #getMaterialUID()
	 * @generated
	 */
	void setMaterialUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Cross Section Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cross sectional area of additional long.
	 *                                 stiffener at strctural element point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Section Area</em>' containment reference.
	 * @see #setCrossSectionArea(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedPointType_CrossSectionArea()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='crossSectionArea' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCrossSectionArea();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getCrossSectionArea <em>Cross Section Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Area</em>' containment reference.
	 * @see #getCrossSectionArea()
	 * @generated
	 */
	void setCrossSectionArea(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Optional Aux1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * optional auxiliary parameter for special use
	 *                                 (no physical meaning)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional Aux1</em>' containment reference.
	 * @see #setOptionalAux1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedPointType_OptionalAux1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='optionalAux1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOptionalAux1();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getOptionalAux1 <em>Optional Aux1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Aux1</em>' containment reference.
	 * @see #getOptionalAux1()
	 * @generated
	 */
	void setOptionalAux1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Optional Aux2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * optional auxiliary parameter for special use
	 *                                 (no physical meaning)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional Aux2</em>' containment reference.
	 * @see #setOptionalAux2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialDefinitionForProfileBasedPointType_OptionalAux2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='optionalAux2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOptionalAux2();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialDefinitionForProfileBasedPointType#getOptionalAux2 <em>Optional Aux2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Aux2</em>' containment reference.
	 * @see #getOptionalAux2()
	 * @generated
	 */
	void setOptionalAux2(DoubleBaseType value);

} // MaterialDefinitionForProfileBasedPointType
