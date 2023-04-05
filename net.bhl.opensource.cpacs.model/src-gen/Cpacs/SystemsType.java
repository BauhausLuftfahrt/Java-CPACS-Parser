/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SystemsType#getGenericSystems <em>Generic Systems</em>}</li>
 *   <li>{@link Cpacs.SystemsType#getCockpitControls <em>Cockpit Controls</em>}</li>
 *   <li>{@link Cpacs.SystemsType#getCommandCases <em>Command Cases</em>}</li>
 *   <li>{@link Cpacs.SystemsType#getControlDistributors <em>Control Distributors</em>}</li>
 *   <li>{@link Cpacs.SystemsType#getControlLaws <em>Control Laws</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSystemsType()
 * @model extendedMetaData="name='systemsType' kind='elementOnly'"
 * @generated
 */
public interface SystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Generic Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Node for geometrical layout of system components
	 *                                 based on simple geometric shapes
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Systems</em>' containment reference.
	 * @see #setGenericSystems(GenericSystemsType)
	 * @see Cpacs.CpacsPackage#getSystemsType_GenericSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genericSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericSystemsType getGenericSystems();

	/**
	 * Sets the value of the '{@link Cpacs.SystemsType#getGenericSystems <em>Generic Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Systems</em>' containment reference.
	 * @see #getGenericSystems()
	 * @generated
	 */
	void setGenericSystems(GenericSystemsType value);

	/**
	 * Returns the value of the '<em><b>Cockpit Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cockpit controls, e.g. stickRoll, pedals
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cockpit Controls</em>' containment reference.
	 * @see #setCockpitControls(CockpitControlsType)
	 * @see Cpacs.CpacsPackage#getSystemsType_CockpitControls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cockpitControls' namespace='##targetNamespace'"
	 * @generated
	 */
	CockpitControlsType getCockpitControls();

	/**
	 * Sets the value of the '{@link Cpacs.SystemsType#getCockpitControls <em>Cockpit Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cockpit Controls</em>' containment reference.
	 * @see #getCockpitControls()
	 * @generated
	 */
	void setCockpitControls(CockpitControlsType value);

	/**
	 * Returns the value of the '<em><b>Command Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Different commandCases that are commanded,
	 *                                 e.g. roll, accelerate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Cases</em>' containment reference.
	 * @see #setCommandCases(CommandCasesType)
	 * @see Cpacs.CpacsPackage#getSystemsType_CommandCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commandCases' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandCasesType getCommandCases();

	/**
	 * Sets the value of the '{@link Cpacs.SystemsType#getCommandCases <em>Command Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Cases</em>' containment reference.
	 * @see #getCommandCases()
	 * @generated
	 */
	void setCommandCases(CommandCasesType value);

	/**
	 * Returns the value of the '<em><b>Control Distributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control Distributors, deliver inputs to the
	 *                                 control actuators. E.g. different angles of different ailerons.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Distributors</em>' containment reference.
	 * @see #setControlDistributors(ControlDistributorsType)
	 * @see Cpacs.CpacsPackage#getSystemsType_ControlDistributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlDistributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlDistributorsType getControlDistributors();

	/**
	 * Sets the value of the '{@link Cpacs.SystemsType#getControlDistributors <em>Control Distributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Distributors</em>' containment reference.
	 * @see #getControlDistributors()
	 * @generated
	 */
	void setControlDistributors(ControlDistributorsType value);

	/**
	 * Returns the value of the '<em><b>Control Laws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control laws, for regulated actuation
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Laws</em>' containment reference.
	 * @see #setControlLaws(ControlLawsType)
	 * @see Cpacs.CpacsPackage#getSystemsType_ControlLaws()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlLaws' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlLawsType getControlLaws();

	/**
	 * Sets the value of the '{@link Cpacs.SystemsType#getControlLaws <em>Control Laws</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Laws</em>' containment reference.
	 * @see #getControlLaws()
	 * @generated
	 */
	void setControlLaws(ControlLawsType value);

} // SystemsType
