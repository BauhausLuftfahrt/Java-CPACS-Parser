/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DoorCutOutType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.DoorCutOutType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.DoorCutOutType#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link Cpacs.DoorCutOutType#getDssDesignUID <em>Dss Design UID</em>}</li>
 *   <li>{@link Cpacs.DoorCutOutType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDoorCutOutType()
 * @model extendedMetaData="name='doorCutOutType' kind='elementOnly'"
 * @generated
 */
public interface DoorCutOutType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of door cutout element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDoorCutOutType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.DoorCutOutType#getName <em>Name</em>}' containment reference.
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
	 * Description of door cutout
	 *                                 element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDoorCutOutType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DoorCutOutType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Fillet Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fillet radius of door cutout
	 *                                 element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fillet Radius</em>' containment reference.
	 * @see #setFilletRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDoorCutOutType_FilletRadius()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filletRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFilletRadius();

	/**
	 * Sets the value of the '{@link Cpacs.DoorCutOutType#getFilletRadius <em>Fillet Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fillet Radius</em>' containment reference.
	 * @see #getFilletRadius()
	 * @generated
	 */
	void setFilletRadius(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Dss Design UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference UID to the description of a DSS (door
	 *                                 surround structure)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dss Design UID</em>' containment reference.
	 * @see #setDssDesignUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDoorCutOutType_DssDesignUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dssDesignUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDssDesignUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorCutOutType#getDssDesignUID <em>Dss Design UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dss Design UID</em>' containment reference.
	 * @see #getDssDesignUID()
	 * @generated
	 */
	void setDssDesignUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDoorCutOutType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorCutOutType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DoorCutOutType
