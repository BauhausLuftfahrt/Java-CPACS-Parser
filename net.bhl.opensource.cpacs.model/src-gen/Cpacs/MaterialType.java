/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MaterialType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getRho <em>Rho</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getIsotropicProperties <em>Isotropic Properties</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getOrthotropicShellProperties <em>Orthotropic Shell Properties</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getAnisotropicShellProperties <em>Anisotropic Shell Properties</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getOrthotropicSolidProperties <em>Orthotropic Solid Properties</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getAnisotropicSolidProperties <em>Anisotropic Solid Properties</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getReferenceTemperature <em>Reference Temperature</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getSpecificHeatMap <em>Specific Heat Map</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getEmissivityMap <em>Emissivity Map</em>}</li>
 *   <li>{@link Cpacs.MaterialType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMaterialType()
 * @model extendedMetaData="name='materialType' kind='elementOnly'"
 * @generated
 */
public interface MaterialType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the material 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getName <em>Name</em>}' containment reference.
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
	 *  Description of the material 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Rho</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Material density [kg/m^3] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rho</em>' containment reference.
	 * @see #setRho(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialType_Rho()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rho' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRho();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getRho <em>Rho</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rho</em>' containment reference.
	 * @see #getRho()
	 * @generated
	 */
	void setRho(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Isotropic Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isotropic Properties</em>' containment reference.
	 * @see #setIsotropicProperties(IsotropicPropertiesType)
	 * @see Cpacs.CpacsPackage#getMaterialType_IsotropicProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isotropicProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	IsotropicPropertiesType getIsotropicProperties();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getIsotropicProperties <em>Isotropic Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isotropic Properties</em>' containment reference.
	 * @see #getIsotropicProperties()
	 * @generated
	 */
	void setIsotropicProperties(IsotropicPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Orthotropic Shell Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orthotropic Shell Properties</em>' containment reference.
	 * @see #setOrthotropicShellProperties(OrthotropicShellPropertiesType)
	 * @see Cpacs.CpacsPackage#getMaterialType_OrthotropicShellProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orthotropicShellProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	OrthotropicShellPropertiesType getOrthotropicShellProperties();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getOrthotropicShellProperties <em>Orthotropic Shell Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orthotropic Shell Properties</em>' containment reference.
	 * @see #getOrthotropicShellProperties()
	 * @generated
	 */
	void setOrthotropicShellProperties(OrthotropicShellPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Anisotropic Shell Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anisotropic Shell Properties</em>' containment reference.
	 * @see #setAnisotropicShellProperties(AnisotropicShellPropertiesType)
	 * @see Cpacs.CpacsPackage#getMaterialType_AnisotropicShellProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anisotropicShellProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	AnisotropicShellPropertiesType getAnisotropicShellProperties();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getAnisotropicShellProperties <em>Anisotropic Shell Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anisotropic Shell Properties</em>' containment reference.
	 * @see #getAnisotropicShellProperties()
	 * @generated
	 */
	void setAnisotropicShellProperties(AnisotropicShellPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Orthotropic Solid Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orthotropic Solid Properties</em>' containment reference.
	 * @see #setOrthotropicSolidProperties(OrthotropicSolidPropertiesType)
	 * @see Cpacs.CpacsPackage#getMaterialType_OrthotropicSolidProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orthotropicSolidProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	OrthotropicSolidPropertiesType getOrthotropicSolidProperties();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getOrthotropicSolidProperties <em>Orthotropic Solid Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orthotropic Solid Properties</em>' containment reference.
	 * @see #getOrthotropicSolidProperties()
	 * @generated
	 */
	void setOrthotropicSolidProperties(OrthotropicSolidPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Anisotropic Solid Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anisotropic Solid Properties</em>' containment reference.
	 * @see #setAnisotropicSolidProperties(AnisotropicSolidPropertiesType)
	 * @see Cpacs.CpacsPackage#getMaterialType_AnisotropicSolidProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anisotropicSolidProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	AnisotropicSolidPropertiesType getAnisotropicSolidProperties();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getAnisotropicSolidProperties <em>Anisotropic Solid Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anisotropic Solid Properties</em>' containment reference.
	 * @see #getAnisotropicSolidProperties()
	 * @generated
	 */
	void setAnisotropicSolidProperties(AnisotropicSolidPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Reference Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Reference temperature for thermal expansion
	 *                                 coefficient [K]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Temperature</em>' containment reference.
	 * @see #setReferenceTemperature(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMaterialType_ReferenceTemperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReferenceTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getReferenceTemperature <em>Reference Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Temperature</em>' containment reference.
	 * @see #getReferenceTemperature()
	 * @generated
	 */
	void setReferenceTemperature(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Specific Heat Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Heat Map</em>' containment reference.
	 * @see #setSpecificHeatMap(SpecificHeatMapType)
	 * @see Cpacs.CpacsPackage#getMaterialType_SpecificHeatMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificHeatMap' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificHeatMapType getSpecificHeatMap();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getSpecificHeatMap <em>Specific Heat Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Heat Map</em>' containment reference.
	 * @see #getSpecificHeatMap()
	 * @generated
	 */
	void setSpecificHeatMap(SpecificHeatMapType value);

	/**
	 * Returns the value of the '<em><b>Emissivity Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emissivity Map</em>' containment reference.
	 * @see #setEmissivityMap(EmissivityMapType)
	 * @see Cpacs.CpacsPackage#getMaterialType_EmissivityMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='emissivityMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EmissivityMapType getEmissivityMap();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getEmissivityMap <em>Emissivity Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emissivity Map</em>' containment reference.
	 * @see #getEmissivityMap()
	 * @generated
	 */
	void setEmissivityMap(EmissivityMapType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getMaterialType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // MaterialType
