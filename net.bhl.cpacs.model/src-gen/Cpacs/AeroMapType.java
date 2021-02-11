/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroMapType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.AeroMapType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.AeroMapType#getBoundaryConditions <em>Boundary Conditions</em>}</li>
 *   <li>{@link Cpacs.AeroMapType#getAeroPerformanceMap <em>Aero Performance Map</em>}</li>
 *   <li>{@link Cpacs.AeroMapType#getAeroLimitsMap <em>Aero Limits Map</em>}</li>
 *   <li>{@link Cpacs.AeroMapType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroMapType()
 * @model extendedMetaData="name='aeroMapType' kind='elementOnly'"
 * @generated
 */
public interface AeroMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getAeroMapType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getAeroMapType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Boundary Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Conditions</em>' containment reference.
	 * @see #setBoundaryConditions(AeroPerformanceBoundaryConditionsType)
	 * @see Cpacs.CpacsPackage#getAeroMapType_BoundaryConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='boundaryConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceBoundaryConditionsType getBoundaryConditions();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapType#getBoundaryConditions <em>Boundary Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary Conditions</em>' containment reference.
	 * @see #getBoundaryConditions()
	 * @generated
	 */
	void setBoundaryConditions(AeroPerformanceBoundaryConditionsType value);

	/**
	 * Returns the value of the '<em><b>Aero Performance Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Performance Map</em>' containment reference.
	 * @see #setAeroPerformanceMap(AeroPerformanceMapType)
	 * @see Cpacs.CpacsPackage#getAeroMapType_AeroPerformanceMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroPerformanceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceMapType getAeroPerformanceMap();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapType#getAeroPerformanceMap <em>Aero Performance Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Performance Map</em>' containment reference.
	 * @see #getAeroPerformanceMap()
	 * @generated
	 */
	void setAeroPerformanceMap(AeroPerformanceMapType value);

	/**
	 * Returns the value of the '<em><b>Aero Limits Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Limits Map</em>' containment reference.
	 * @see #setAeroLimitsMap(AeroLimitsMapType)
	 * @see Cpacs.CpacsPackage#getAeroMapType_AeroLimitsMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroLimitsMap' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroLimitsMapType getAeroLimitsMap();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapType#getAeroLimitsMap <em>Aero Limits Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Limits Map</em>' containment reference.
	 * @see #getAeroLimitsMap()
	 * @generated
	 */
	void setAeroLimitsMap(AeroLimitsMapType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAeroMapType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AeroMapType
