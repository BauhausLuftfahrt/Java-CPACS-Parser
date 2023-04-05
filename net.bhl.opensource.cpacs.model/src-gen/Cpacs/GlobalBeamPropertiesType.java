/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Beam Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getSource <em>Source</em>}</li>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getConsistency <em>Consistency</em>}</li>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getBeamCrossSection <em>Beam Cross Section</em>}</li>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getBeamCOG <em>Beam COG</em>}</li>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getBeamShearCenter <em>Beam Shear Center</em>}</li>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getBeamStiffness <em>Beam Stiffness</em>}</li>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getBeamSpecificMass <em>Beam Specific Mass</em>}</li>
 *   <li>{@link Cpacs.GlobalBeamPropertiesType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType()
 * @model extendedMetaData="name='globalBeamPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface GlobalBeamPropertiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Material UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material UID</em>' containment reference.
	 * @see #setMaterialUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_MaterialUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='materialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMaterialUID();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getMaterialUID <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material UID</em>' containment reference.
	 * @see #getMaterialUID()
	 * @generated
	 */
	void setMaterialUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getSource();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Consistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consistency</em>' containment reference.
	 * @see #setConsistency(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_Consistency()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consistency' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getConsistency();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getConsistency <em>Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency</em>' containment reference.
	 * @see #getConsistency()
	 * @generated
	 */
	void setConsistency(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Beam Cross Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beam Cross Section</em>' containment reference.
	 * @see #setBeamCrossSection(BeamCrossSectionType)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_BeamCrossSection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='beamCrossSection' namespace='##targetNamespace'"
	 * @generated
	 */
	BeamCrossSectionType getBeamCrossSection();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getBeamCrossSection <em>Beam Cross Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beam Cross Section</em>' containment reference.
	 * @see #getBeamCrossSection()
	 * @generated
	 */
	void setBeamCrossSection(BeamCrossSectionType value);

	/**
	 * Returns the value of the '<em><b>Beam COG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beam COG</em>' containment reference.
	 * @see #setBeamCOG(PointXYType)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_BeamCOG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='beamCOG' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYType getBeamCOG();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getBeamCOG <em>Beam COG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beam COG</em>' containment reference.
	 * @see #getBeamCOG()
	 * @generated
	 */
	void setBeamCOG(PointXYType value);

	/**
	 * Returns the value of the '<em><b>Beam Shear Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beam Shear Center</em>' containment reference.
	 * @see #setBeamShearCenter(PointXYType)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_BeamShearCenter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beamShearCenter' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYType getBeamShearCenter();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getBeamShearCenter <em>Beam Shear Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beam Shear Center</em>' containment reference.
	 * @see #getBeamShearCenter()
	 * @generated
	 */
	void setBeamShearCenter(PointXYType value);

	/**
	 * Returns the value of the '<em><b>Beam Stiffness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beam Stiffness</em>' containment reference.
	 * @see #setBeamStiffness(BeamStiffnessType)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_BeamStiffness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beamStiffness' namespace='##targetNamespace'"
	 * @generated
	 */
	BeamStiffnessType getBeamStiffness();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getBeamStiffness <em>Beam Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beam Stiffness</em>' containment reference.
	 * @see #getBeamStiffness()
	 * @generated
	 */
	void setBeamStiffness(BeamStiffnessType value);

	/**
	 * Returns the value of the '<em><b>Beam Specific Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beam Specific Mass</em>' containment reference.
	 * @see #setBeamSpecificMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_BeamSpecificMass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beamSpecificMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getBeamSpecificMass();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getBeamSpecificMass <em>Beam Specific Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beam Specific Mass</em>' containment reference.
	 * @see #getBeamSpecificMass()
	 * @generated
	 */
	void setBeamSpecificMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getGlobalBeamPropertiesType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalBeamPropertiesType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GlobalBeamPropertiesType
