/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Distributor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlDistributorType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.ControlDistributorType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.ControlDistributorType#getCommandInputs <em>Command Inputs</em>}</li>
 *   <li>{@link Cpacs.ControlDistributorType#getControlElements <em>Control Elements</em>}</li>
 *   <li>{@link Cpacs.ControlDistributorType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlDistributorType()
 * @model extendedMetaData="name='controlDistributorType' kind='elementOnly'"
 * @generated
 */
public interface ControlDistributorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getControlDistributorType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.ControlDistributorType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getControlDistributorType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.ControlDistributorType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Command Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of command inputs. The minimum and maximum value is given by the lowest and highest entry of the vector, respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Inputs</em>' containment reference.
	 * @see #setCommandInputs(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getControlDistributorType_CommandInputs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='commandInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCommandInputs();

	/**
	 * Sets the value of the '{@link Cpacs.ControlDistributorType#getCommandInputs <em>Command Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Inputs</em>' containment reference.
	 * @see #getCommandInputs()
	 * @generated
	 */
	void setCommandInputs(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Elements</em>' containment reference.
	 * @see #setControlElements(ControlElementsType)
	 * @see Cpacs.CpacsPackage#getControlDistributorType_ControlElements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlElements' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlElementsType getControlElements();

	/**
	 * Sets the value of the '{@link Cpacs.ControlDistributorType#getControlElements <em>Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Elements</em>' containment reference.
	 * @see #getControlElements()
	 * @generated
	 */
	void setControlElements(ControlElementsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getControlDistributorType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlDistributorType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ControlDistributorType
