/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VehicleConfigurationType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.VehicleConfigurationType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.VehicleConfigurationType#getControlElements <em>Control Elements</em>}</li>
 *   <li>{@link Cpacs.VehicleConfigurationType#getInternalPressures <em>Internal Pressures</em>}</li>
 *   <li>{@link Cpacs.VehicleConfigurationType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVehicleConfigurationType()
 * @model extendedMetaData="name='vehicleConfigurationType' kind='elementOnly'"
 * @generated
 */
public interface VehicleConfigurationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Name
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getVehicleConfigurationType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.VehicleConfigurationType#getName <em>Name</em>}' containment reference.
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
	 * 
	 *                                 Description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getVehicleConfigurationType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.VehicleConfigurationType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Elements</em>' containment reference.
	 * @see #setControlElements(AircraftControlElementsType)
	 * @see Cpacs.CpacsPackage#getVehicleConfigurationType_ControlElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlElements' namespace='##targetNamespace'"
	 * @generated
	 */
	AircraftControlElementsType getControlElements();

	/**
	 * Sets the value of the '{@link Cpacs.VehicleConfigurationType#getControlElements <em>Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Elements</em>' containment reference.
	 * @see #getControlElements()
	 * @generated
	 */
	void setControlElements(AircraftControlElementsType value);

	/**
	 * Returns the value of the '<em><b>Internal Pressures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Deck configurations
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Pressures</em>' containment reference.
	 * @see #setInternalPressures(InternalPressuresType)
	 * @see Cpacs.CpacsPackage#getVehicleConfigurationType_InternalPressures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='internalPressures' namespace='##targetNamespace'"
	 * @generated
	 */
	InternalPressuresType getInternalPressures();

	/**
	 * Sets the value of the '{@link Cpacs.VehicleConfigurationType#getInternalPressures <em>Internal Pressures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Pressures</em>' containment reference.
	 * @see #getInternalPressures()
	 * @generated
	 */
	void setInternalPressures(InternalPressuresType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getVehicleConfigurationType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.VehicleConfigurationType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // VehicleConfigurationType
