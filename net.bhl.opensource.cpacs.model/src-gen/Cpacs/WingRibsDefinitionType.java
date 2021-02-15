/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Ribs Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingRibsDefinitionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.WingRibsDefinitionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.WingRibsDefinitionType#getRibsPositioning <em>Ribs Positioning</em>}</li>
 *   <li>{@link Cpacs.WingRibsDefinitionType#getRibExplicitPositioning <em>Rib Explicit Positioning</em>}</li>
 *   <li>{@link Cpacs.WingRibsDefinitionType#getRibCrossSection <em>Rib Cross Section</em>}</li>
 *   <li>{@link Cpacs.WingRibsDefinitionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingRibsDefinitionType()
 * @model extendedMetaData="name='wingRibsDefinitionType' kind='elementOnly'"
 * @generated
 */
public interface WingRibsDefinitionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the rib set
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibsDefinitionType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsDefinitionType#getName <em>Name</em>}' containment reference.
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
	 * Description of the rib set
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibsDefinitionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsDefinitionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Ribs Positioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ribs Positioning</em>' containment reference.
	 * @see #setRibsPositioning(WingRibsPositioningType)
	 * @see Cpacs.CpacsPackage#getWingRibsDefinitionType_RibsPositioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribsPositioning' namespace='##targetNamespace'"
	 * @generated
	 */
	WingRibsPositioningType getRibsPositioning();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsDefinitionType#getRibsPositioning <em>Ribs Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ribs Positioning</em>' containment reference.
	 * @see #getRibsPositioning()
	 * @generated
	 */
	void setRibsPositioning(WingRibsPositioningType value);

	/**
	 * Returns the value of the '<em><b>Rib Explicit Positioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Explicit Positioning</em>' containment reference.
	 * @see #setRibExplicitPositioning(WingRibExplicitPositioningType)
	 * @see Cpacs.CpacsPackage#getWingRibsDefinitionType_RibExplicitPositioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribExplicitPositioning' namespace='##targetNamespace'"
	 * @generated
	 */
	WingRibExplicitPositioningType getRibExplicitPositioning();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsDefinitionType#getRibExplicitPositioning <em>Rib Explicit Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Explicit Positioning</em>' containment reference.
	 * @see #getRibExplicitPositioning()
	 * @generated
	 */
	void setRibExplicitPositioning(WingRibExplicitPositioningType value);

	/**
	 * Returns the value of the '<em><b>Rib Cross Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Cross Section</em>' containment reference.
	 * @see #setRibCrossSection(WingRibCrossSectionType)
	 * @see Cpacs.CpacsPackage#getWingRibsDefinitionType_RibCrossSection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribCrossSection' namespace='##targetNamespace'"
	 * @generated
	 */
	WingRibCrossSectionType getRibCrossSection();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsDefinitionType#getRibCrossSection <em>Rib Cross Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Cross Section</em>' containment reference.
	 * @see #getRibCrossSection()
	 * @generated
	 */
	void setRibCrossSection(WingRibCrossSectionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingRibsDefinitionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsDefinitionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingRibsDefinitionType
