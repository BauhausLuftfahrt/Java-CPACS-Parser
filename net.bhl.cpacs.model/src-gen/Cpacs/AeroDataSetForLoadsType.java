/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Data Set For Loads Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroDataSetForLoadsType#getFlowCondition <em>Flow Condition</em>}</li>
 *   <li>{@link Cpacs.AeroDataSetForLoadsType#getTotalCoefficients <em>Total Coefficients</em>}</li>
 *   <li>{@link Cpacs.AeroDataSetForLoadsType#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.AeroDataSetForLoadsType#getFuselages <em>Fuselages</em>}</li>
 *   <li>{@link Cpacs.AeroDataSetForLoadsType#getGenericComponents <em>Generic Components</em>}</li>
 *   <li>{@link Cpacs.AeroDataSetForLoadsType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroDataSetForLoadsType()
 * @model extendedMetaData="name='aeroDataSetForLoadsType' kind='elementOnly'"
 * @generated
 */
public interface AeroDataSetForLoadsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flow Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Condition</em>' containment reference.
	 * @see #setFlowCondition(FlowConditionType)
	 * @see Cpacs.CpacsPackage#getAeroDataSetForLoadsType_FlowCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flowCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	FlowConditionType getFlowCondition();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataSetForLoadsType#getFlowCondition <em>Flow Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Condition</em>' containment reference.
	 * @see #getFlowCondition()
	 * @generated
	 */
	void setFlowCondition(FlowConditionType value);

	/**
	 * Returns the value of the '<em><b>Total Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Coefficients</em>' containment reference.
	 * @see #setTotalCoefficients(CoefficientsType)
	 * @see Cpacs.CpacsPackage#getAeroDataSetForLoadsType_TotalCoefficients()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalCoefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsType getTotalCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataSetForLoadsType#getTotalCoefficients <em>Total Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Coefficients</em>' containment reference.
	 * @see #getTotalCoefficients()
	 * @generated
	 */
	void setTotalCoefficients(CoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Wings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wings</em>' containment reference.
	 * @see #setWings(WingsCoefficientsType)
	 * @see Cpacs.CpacsPackage#getAeroDataSetForLoadsType_Wings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wings' namespace='##targetNamespace'"
	 * @generated
	 */
	WingsCoefficientsType getWings();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataSetForLoadsType#getWings <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wings</em>' containment reference.
	 * @see #getWings()
	 * @generated
	 */
	void setWings(WingsCoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Fuselages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselages</em>' containment reference.
	 * @see #setFuselages(FuselagesCoefficientsType)
	 * @see Cpacs.CpacsPackage#getAeroDataSetForLoadsType_Fuselages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselages' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselagesCoefficientsType getFuselages();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataSetForLoadsType#getFuselages <em>Fuselages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselages</em>' containment reference.
	 * @see #getFuselages()
	 * @generated
	 */
	void setFuselages(FuselagesCoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Generic Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Components</em>' containment reference.
	 * @see #setGenericComponents(GenericComponentsCoefficientsType)
	 * @see Cpacs.CpacsPackage#getAeroDataSetForLoadsType_GenericComponents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genericComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericComponentsCoefficientsType getGenericComponents();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataSetForLoadsType#getGenericComponents <em>Generic Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Components</em>' containment reference.
	 * @see #getGenericComponents()
	 * @generated
	 */
	void setGenericComponents(GenericComponentsCoefficientsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAeroDataSetForLoadsType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataSetForLoadsType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AeroDataSetForLoadsType
