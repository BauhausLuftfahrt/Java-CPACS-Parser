/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TransmissionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.TransmissionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.TransmissionType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.TransmissionType#getShaftInputs <em>Shaft Inputs</em>}</li>
 *   <li>{@link Cpacs.TransmissionType#getShaftOutputs <em>Shaft Outputs</em>}</li>
 *   <li>{@link Cpacs.TransmissionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransmissionType()
 * @model extendedMetaData="name='transmissionType' kind='elementOnly'"
 * @generated
 */
public interface TransmissionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTransmissionType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getTransmissionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see Cpacs.CpacsPackage#getTransmissionType_Transformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

	/**
	 * Returns the value of the '<em><b>Shaft Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft Inputs</em>' containment reference.
	 * @see #setShaftInputs(TransmissionShaftInputsType)
	 * @see Cpacs.CpacsPackage#getTransmissionType_ShaftInputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shaftInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmissionShaftInputsType getShaftInputs();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionType#getShaftInputs <em>Shaft Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft Inputs</em>' containment reference.
	 * @see #getShaftInputs()
	 * @generated
	 */
	void setShaftInputs(TransmissionShaftInputsType value);

	/**
	 * Returns the value of the '<em><b>Shaft Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft Outputs</em>' containment reference.
	 * @see #setShaftOutputs(TransmissionShaftOutputsType)
	 * @see Cpacs.CpacsPackage#getTransmissionType_ShaftOutputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shaftOutputs' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmissionShaftOutputsType getShaftOutputs();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionType#getShaftOutputs <em>Shaft Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft Outputs</em>' containment reference.
	 * @see #getShaftOutputs()
	 * @generated
	 */
	void setShaftOutputs(TransmissionShaftOutputsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTransmissionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TransmissionType
