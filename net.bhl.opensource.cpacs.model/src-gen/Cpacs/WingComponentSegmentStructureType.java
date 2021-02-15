/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Component Segment Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingComponentSegmentStructureType#getUpperShell <em>Upper Shell</em>}</li>
 *   <li>{@link Cpacs.WingComponentSegmentStructureType#getLowerShell <em>Lower Shell</em>}</li>
 *   <li>{@link Cpacs.WingComponentSegmentStructureType#getIntermediateStructure <em>Intermediate Structure</em>}</li>
 *   <li>{@link Cpacs.WingComponentSegmentStructureType#getRibsDefinitions <em>Ribs Definitions</em>}</li>
 *   <li>{@link Cpacs.WingComponentSegmentStructureType#getSpars <em>Spars</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingComponentSegmentStructureType()
 * @model extendedMetaData="name='wingComponentSegmentStructureType' kind='elementOnly'"
 * @generated
 */
public interface WingComponentSegmentStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Upper Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Shell</em>' containment reference.
	 * @see #setUpperShell(WingShellType)
	 * @see Cpacs.CpacsPackage#getWingComponentSegmentStructureType_UpperShell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperShell' namespace='##targetNamespace'"
	 * @generated
	 */
	WingShellType getUpperShell();

	/**
	 * Sets the value of the '{@link Cpacs.WingComponentSegmentStructureType#getUpperShell <em>Upper Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Shell</em>' containment reference.
	 * @see #getUpperShell()
	 * @generated
	 */
	void setUpperShell(WingShellType value);

	/**
	 * Returns the value of the '<em><b>Lower Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Shell</em>' containment reference.
	 * @see #setLowerShell(WingShellType)
	 * @see Cpacs.CpacsPackage#getWingComponentSegmentStructureType_LowerShell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerShell' namespace='##targetNamespace'"
	 * @generated
	 */
	WingShellType getLowerShell();

	/**
	 * Sets the value of the '{@link Cpacs.WingComponentSegmentStructureType#getLowerShell <em>Lower Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Shell</em>' containment reference.
	 * @see #getLowerShell()
	 * @generated
	 */
	void setLowerShell(WingShellType value);

	/**
	 * Returns the value of the '<em><b>Intermediate Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Structure</em>' containment reference.
	 * @see #setIntermediateStructure(WingIntermediateStructureCellsType)
	 * @see Cpacs.CpacsPackage#getWingComponentSegmentStructureType_IntermediateStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intermediateStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	WingIntermediateStructureCellsType getIntermediateStructure();

	/**
	 * Sets the value of the '{@link Cpacs.WingComponentSegmentStructureType#getIntermediateStructure <em>Intermediate Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Structure</em>' containment reference.
	 * @see #getIntermediateStructure()
	 * @generated
	 */
	void setIntermediateStructure(WingIntermediateStructureCellsType value);

	/**
	 * Returns the value of the '<em><b>Ribs Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ribs Definitions</em>' containment reference.
	 * @see #setRibsDefinitions(WingRibsDefinitionsType)
	 * @see Cpacs.CpacsPackage#getWingComponentSegmentStructureType_RibsDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribsDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	WingRibsDefinitionsType getRibsDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.WingComponentSegmentStructureType#getRibsDefinitions <em>Ribs Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ribs Definitions</em>' containment reference.
	 * @see #getRibsDefinitions()
	 * @generated
	 */
	void setRibsDefinitions(WingRibsDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Spars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spars</em>' containment reference.
	 * @see #setSpars(WingSparType)
	 * @see Cpacs.CpacsPackage#getWingComponentSegmentStructureType_Spars()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spars' namespace='##targetNamespace'"
	 * @generated
	 */
	WingSparType getSpars();

	/**
	 * Sets the value of the '{@link Cpacs.WingComponentSegmentStructureType#getSpars <em>Spars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spars</em>' containment reference.
	 * @see #getSpars()
	 * @generated
	 */
	void setSpars(WingSparType value);

} // WingComponentSegmentStructureType
