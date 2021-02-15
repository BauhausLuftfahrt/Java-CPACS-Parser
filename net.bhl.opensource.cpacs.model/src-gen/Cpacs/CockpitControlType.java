/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cockpit Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CockpitControlType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CockpitControlType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CockpitControlType#getCommandCaseUID <em>Command Case UID</em>}</li>
 *   <li>{@link Cpacs.CockpitControlType#getPilotInput <em>Pilot Input</em>}</li>
 *   <li>{@link Cpacs.CockpitControlType#getCommandOutput <em>Command Output</em>}</li>
 *   <li>{@link Cpacs.CockpitControlType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCockpitControlType()
 * @model extendedMetaData="name='cockpitControlType' kind='elementOnly'"
 * @generated
 */
public interface CockpitControlType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCockpitControlType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CockpitControlType#getName <em>Name</em>}' containment reference.
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
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCockpitControlType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CockpitControlType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Command Case UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Case UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCockpitControlType_CommandCaseUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='commandCaseUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getCommandCaseUID();

	/**
	 * Returns the value of the '<em><b>Pilot Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pilot Input</em>' containment reference.
	 * @see #setPilotInput(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCockpitControlType_PilotInput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pilotInput' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getPilotInput();

	/**
	 * Sets the value of the '{@link Cpacs.CockpitControlType#getPilotInput <em>Pilot Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pilot Input</em>' containment reference.
	 * @see #getPilotInput()
	 * @generated
	 */
	void setPilotInput(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Command Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Output</em>' containment reference.
	 * @see #setCommandOutput(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCockpitControlType_CommandOutput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='commandOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCommandOutput();

	/**
	 * Sets the value of the '{@link Cpacs.CockpitControlType#getCommandOutput <em>Command Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Output</em>' containment reference.
	 * @see #getCommandOutput()
	 * @generated
	 */
	void setCommandOutput(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCockpitControlType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CockpitControlType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CockpitControlType
