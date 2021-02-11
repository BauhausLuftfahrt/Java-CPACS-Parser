/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rivet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RivetType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.RivetType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.RivetType#getTensileStrength <em>Tensile Strength</em>}</li>
 *   <li>{@link Cpacs.RivetType#getShearStrength <em>Shear Strength</em>}</li>
 *   <li>{@link Cpacs.RivetType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRivetType()
 * @model extendedMetaData="name='rivetType' kind='elementOnly'"
 * @generated
 */
public interface RivetType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the rivet type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRivetType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.RivetType#getName <em>Name</em>}' containment reference.
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
	 * Description of the rivet type
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRivetType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RivetType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Tensile Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tensile Strength of the rivet type
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tensile Strength</em>' containment reference.
	 * @see #setTensileStrength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRivetType_TensileStrength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tensileStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTensileStrength();

	/**
	 * Sets the value of the '{@link Cpacs.RivetType#getTensileStrength <em>Tensile Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tensile Strength</em>' containment reference.
	 * @see #getTensileStrength()
	 * @generated
	 */
	void setTensileStrength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Shear Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shear Strength of the rivet type
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shear Strength</em>' containment reference.
	 * @see #setShearStrength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRivetType_ShearStrength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='shearStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getShearStrength();

	/**
	 * Sets the value of the '{@link Cpacs.RivetType#getShearStrength <em>Shear Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Strength</em>' containment reference.
	 * @see #getShearStrength()
	 * @generated
	 */
	void setShearStrength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getRivetType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.RivetType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // RivetType
