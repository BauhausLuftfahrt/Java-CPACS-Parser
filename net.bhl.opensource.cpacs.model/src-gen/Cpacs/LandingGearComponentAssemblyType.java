/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Component Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearComponentAssemblyType#getMainStrut <em>Main Strut</em>}</li>
 *   <li>{@link Cpacs.LandingGearComponentAssemblyType#getPiston <em>Piston</em>}</li>
 *   <li>{@link Cpacs.LandingGearComponentAssemblyType#getAxle <em>Axle</em>}</li>
 *   <li>{@link Cpacs.LandingGearComponentAssemblyType#getBogie <em>Bogie</em>}</li>
 *   <li>{@link Cpacs.LandingGearComponentAssemblyType#getDragStrut <em>Drag Strut</em>}</li>
 *   <li>{@link Cpacs.LandingGearComponentAssemblyType#getPintleStruts <em>Pintle Struts</em>}</li>
 *   <li>{@link Cpacs.LandingGearComponentAssemblyType#getSideStruts <em>Side Struts</em>}</li>
 *   <li>{@link Cpacs.LandingGearComponentAssemblyType#getMainActuator <em>Main Actuator</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType()
 * @model extendedMetaData="name='landingGearComponentAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearComponentAssemblyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Strut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main strut
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Strut</em>' containment reference.
	 * @see #setMainStrut(StrutType)
	 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType_MainStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutType getMainStrut();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearComponentAssemblyType#getMainStrut <em>Main Strut</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType_Piston()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='piston' namespace='##targetNamespace'"
	 * @generated
	 */
	PistonType getPiston();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearComponentAssemblyType#getPiston <em>Piston</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piston</em>' containment reference.
	 * @see #getPiston()
	 * @generated
	 */
	void setPiston(PistonType value);

	/**
	 * Returns the value of the '<em><b>Axle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axle</em>' containment reference.
	 * @see #setAxle(AxleType)
	 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType_Axle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='axle' namespace='##targetNamespace'"
	 * @generated
	 */
	AxleType getAxle();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearComponentAssemblyType#getAxle <em>Axle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axle</em>' containment reference.
	 * @see #getAxle()
	 * @generated
	 */
	void setAxle(AxleType value);

	/**
	 * Returns the value of the '<em><b>Bogie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bogie</em>' containment reference.
	 * @see #setBogie(BogieType)
	 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType_Bogie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bogie' namespace='##targetNamespace'"
	 * @generated
	 */
	BogieType getBogie();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearComponentAssemblyType#getBogie <em>Bogie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bogie</em>' containment reference.
	 * @see #getBogie()
	 * @generated
	 */
	void setBogie(BogieType value);

	/**
	 * Returns the value of the '<em><b>Drag Strut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Drag strut (Assumption: one end of the strut will connect to the main strut and the other end will be given as endPoint)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drag Strut</em>' containment reference.
	 * @see #setDragStrut(StrutAssemblyType)
	 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType_DragStrut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dragStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutAssemblyType getDragStrut();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearComponentAssemblyType#getDragStrut <em>Drag Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drag Strut</em>' containment reference.
	 * @see #getDragStrut()
	 * @generated
	 */
	void setDragStrut(StrutAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Pintle Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pintle Struts</em>' containment reference.
	 * @see #setPintleStruts(PintleStrutsType)
	 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType_PintleStruts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pintleStruts' namespace='##targetNamespace'"
	 * @generated
	 */
	PintleStrutsType getPintleStruts();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearComponentAssemblyType#getPintleStruts <em>Pintle Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pintle Struts</em>' containment reference.
	 * @see #getPintleStruts()
	 * @generated
	 */
	void setPintleStruts(PintleStrutsType value);

	/**
	 * Returns the value of the '<em><b>Side Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Struts</em>' containment reference.
	 * @see #setSideStruts(SideStrutsType)
	 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType_SideStruts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sideStruts' namespace='##targetNamespace'"
	 * @generated
	 */
	SideStrutsType getSideStruts();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearComponentAssemblyType#getSideStruts <em>Side Struts</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getLandingGearComponentAssemblyType_MainActuator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mainActuator' namespace='##targetNamespace'"
	 * @generated
	 */
	MainActuatorType getMainActuator();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearComponentAssemblyType#getMainActuator <em>Main Actuator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Actuator</em>' containment reference.
	 * @see #getMainActuator()
	 * @generated
	 */
	void setMainActuator(MainActuatorType value);

} // LandingGearComponentAssemblyType
