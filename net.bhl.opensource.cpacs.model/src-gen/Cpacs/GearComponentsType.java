/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gear Components Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GearComponentsType#getMainStrut <em>Main Strut</em>}</li>
 *   <li>{@link Cpacs.GearComponentsType#getPiston <em>Piston</em>}</li>
 *   <li>{@link Cpacs.GearComponentsType#getDragStrut <em>Drag Strut</em>}</li>
 *   <li>{@link Cpacs.GearComponentsType#getPintleStrut <em>Pintle Strut</em>}</li>
 *   <li>{@link Cpacs.GearComponentsType#getSideStruts <em>Side Struts</em>}</li>
 *   <li>{@link Cpacs.GearComponentsType#getMainActuator <em>Main Actuator</em>}</li>
 *   <li>{@link Cpacs.GearComponentsType#getBogie <em>Bogie</em>}</li>
 *   <li>{@link Cpacs.GearComponentsType#getAxles <em>Axles</em>}</li>
 *   <li>{@link Cpacs.GearComponentsType#getWheels <em>Wheels</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGearComponentsType()
 * @model extendedMetaData="name='gearComponentsType' kind='elementOnly'"
 * @generated
 */
public interface GearComponentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Main Strut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Strut</em>' containment reference.
	 * @see #setMainStrut(StrutType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_MainStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutType getMainStrut();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getMainStrut <em>Main Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Strut</em>' containment reference.
	 * @see #getMainStrut()
	 * @generated
	 */
	void setMainStrut(StrutType value);

	/**
	 * Returns the value of the '<em><b>Piston</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piston</em>' containment reference.
	 * @see #setPiston(PistonType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_Piston()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='piston' namespace='##targetNamespace'"
	 * @generated
	 */
	PistonType getPiston();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getPiston <em>Piston</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piston</em>' containment reference.
	 * @see #getPiston()
	 * @generated
	 */
	void setPiston(PistonType value);

	/**
	 * Returns the value of the '<em><b>Drag Strut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drag Strut</em>' containment reference.
	 * @see #setDragStrut(StrutWithActuatorType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_DragStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dragStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutWithActuatorType getDragStrut();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getDragStrut <em>Drag Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drag Strut</em>' containment reference.
	 * @see #getDragStrut()
	 * @generated
	 */
	void setDragStrut(StrutWithActuatorType value);

	/**
	 * Returns the value of the '<em><b>Pintle Strut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pintle Strut</em>' containment reference.
	 * @see #setPintleStrut(StrutType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_PintleStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pintleStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutType getPintleStrut();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getPintleStrut <em>Pintle Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pintle Strut</em>' containment reference.
	 * @see #getPintleStrut()
	 * @generated
	 */
	void setPintleStrut(StrutType value);

	/**
	 * Returns the value of the '<em><b>Side Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Struts</em>' containment reference.
	 * @see #setSideStruts(SideStrutsType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_SideStruts()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sideStruts' namespace='##targetNamespace'"
	 * @generated
	 */
	SideStrutsType getSideStruts();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getSideStruts <em>Side Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Struts</em>' containment reference.
	 * @see #getSideStruts()
	 * @generated
	 */
	void setSideStruts(SideStrutsType value);

	/**
	 * Returns the value of the '<em><b>Main Actuator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Actuator</em>' containment reference.
	 * @see #setMainActuator(MainActuatorType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_MainActuator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainActuator' namespace='##targetNamespace'"
	 * @generated
	 */
	MainActuatorType getMainActuator();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getMainActuator <em>Main Actuator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Actuator</em>' containment reference.
	 * @see #getMainActuator()
	 * @generated
	 */
	void setMainActuator(MainActuatorType value);

	/**
	 * Returns the value of the '<em><b>Bogie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bogie</em>' containment reference.
	 * @see #setBogie(BogieType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_Bogie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bogie' namespace='##targetNamespace'"
	 * @generated
	 */
	BogieType getBogie();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getBogie <em>Bogie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bogie</em>' containment reference.
	 * @see #getBogie()
	 * @generated
	 */
	void setBogie(BogieType value);

	/**
	 * Returns the value of the '<em><b>Axles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axles</em>' containment reference.
	 * @see #setAxles(AxlesType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_Axles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axles' namespace='##targetNamespace'"
	 * @generated
	 */
	AxlesType getAxles();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getAxles <em>Axles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axles</em>' containment reference.
	 * @see #getAxles()
	 * @generated
	 */
	void setAxles(AxlesType value);

	/**
	 * Returns the value of the '<em><b>Wheels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheels</em>' containment reference.
	 * @see #setWheels(WheelsType)
	 * @see Cpacs.CpacsPackage#getGearComponentsType_Wheels()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wheels' namespace='##targetNamespace'"
	 * @generated
	 */
	WheelsType getWheels();

	/**
	 * Sets the value of the '{@link Cpacs.GearComponentsType#getWheels <em>Wheels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheels</em>' containment reference.
	 * @see #getWheels()
	 * @generated
	 */
	void setWheels(WheelsType value);

} // GearComponentsType
