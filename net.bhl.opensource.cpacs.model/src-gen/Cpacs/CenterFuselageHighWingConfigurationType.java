/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Fuselage High Wing Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CenterFuselageHighWingConfigurationType#getWingInterfaceDefinitions <em>Wing Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageHighWingConfigurationType#getLandingGearInterfaceDefinitions <em>Landing Gear Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageHighWingConfigurationType#getMainStrutInterfaceDefinitions <em>Main Strut Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageHighWingConfigurationType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCenterFuselageHighWingConfigurationType()
 * @model extendedMetaData="name='centerFuselageHighWingConfigurationType' kind='elementOnly'"
 * @generated
 */
public interface CenterFuselageHighWingConfigurationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Interface Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Interface Definitions</em>' containment reference.
	 * @see #setWingInterfaceDefinitions(WingInterfaceDefinitionsType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageHighWingConfigurationType_WingInterfaceDefinitions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingInterfaceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	WingInterfaceDefinitionsType getWingInterfaceDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageHighWingConfigurationType#getWingInterfaceDefinitions <em>Wing Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Interface Definitions</em>' containment reference.
	 * @see #getWingInterfaceDefinitions()
	 * @generated
	 */
	void setWingInterfaceDefinitions(WingInterfaceDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Landing Gear Interface Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear Interface Definitions</em>' containment reference.
	 * @see #setLandingGearInterfaceDefinitions(LandingGearInterfaceDefinitionsType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageHighWingConfigurationType_LandingGearInterfaceDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGearInterfaceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearInterfaceDefinitionsType getLandingGearInterfaceDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageHighWingConfigurationType#getLandingGearInterfaceDefinitions <em>Landing Gear Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Gear Interface Definitions</em>' containment reference.
	 * @see #getLandingGearInterfaceDefinitions()
	 * @generated
	 */
	void setLandingGearInterfaceDefinitions(LandingGearInterfaceDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Main Strut Interface Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Strut Interface Definitions</em>' containment reference.
	 * @see #setMainStrutInterfaceDefinitions(MainStrutInterfaceDefinitionsType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageHighWingConfigurationType_MainStrutInterfaceDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mainStrutInterfaceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	MainStrutInterfaceDefinitionsType getMainStrutInterfaceDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageHighWingConfigurationType#getMainStrutInterfaceDefinitions <em>Main Strut Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Strut Interface Definitions</em>' containment reference.
	 * @see #getMainStrutInterfaceDefinitions()
	 * @generated
	 */
	void setMainStrutInterfaceDefinitions(MainStrutInterfaceDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCenterFuselageHighWingConfigurationType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageHighWingConfigurationType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CenterFuselageHighWingConfigurationType
