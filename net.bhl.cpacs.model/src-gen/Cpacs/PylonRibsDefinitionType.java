/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Ribs Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonRibsDefinitionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.PylonRibsDefinitionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.PylonRibsDefinitionType#getRibCrossSection <em>Rib Cross Section</em>}</li>
 *   <li>{@link Cpacs.PylonRibsDefinitionType#getRibsPositioning <em>Ribs Positioning</em>}</li>
 *   <li>{@link Cpacs.PylonRibsDefinitionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonRibsDefinitionType()
 * @model extendedMetaData="name='pylonRibsDefinitionType' kind='elementOnly'"
 * @generated
 */
public interface PylonRibsDefinitionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the rib set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPylonRibsDefinitionType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsDefinitionType#getName <em>Name</em>}' containment reference.
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
	 * Description of the rib set.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPylonRibsDefinitionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsDefinitionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Cross Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Cross Section</em>' containment reference.
	 * @see #setRibCrossSection(WingRibCrossSectionType)
	 * @see Cpacs.CpacsPackage#getPylonRibsDefinitionType_RibCrossSection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribCrossSection' namespace='##targetNamespace'"
	 * @generated
	 */
	WingRibCrossSectionType getRibCrossSection();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsDefinitionType#getRibCrossSection <em>Rib Cross Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Cross Section</em>' containment reference.
	 * @see #getRibCrossSection()
	 * @generated
	 */
	void setRibCrossSection(WingRibCrossSectionType value);

	/**
	 * Returns the value of the '<em><b>Ribs Positioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ribs Positioning</em>' containment reference.
	 * @see #setRibsPositioning(PylonRibsPositioningType)
	 * @see Cpacs.CpacsPackage#getPylonRibsDefinitionType_RibsPositioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribsPositioning' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonRibsPositioningType getRibsPositioning();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsDefinitionType#getRibsPositioning <em>Ribs Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ribs Positioning</em>' containment reference.
	 * @see #getRibsPositioning()
	 * @generated
	 */
	void setRibsPositioning(PylonRibsPositioningType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPylonRibsDefinitionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsDefinitionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PylonRibsDefinitionType
