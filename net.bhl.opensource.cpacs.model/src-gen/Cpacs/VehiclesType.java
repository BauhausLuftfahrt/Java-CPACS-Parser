/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VehiclesType#getAircraft <em>Aircraft</em>}</li>
 *   <li>{@link Cpacs.VehiclesType#getRotorcraft <em>Rotorcraft</em>}</li>
 *   <li>{@link Cpacs.VehiclesType#getEngines <em>Engines</em>}</li>
 *   <li>{@link Cpacs.VehiclesType#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link Cpacs.VehiclesType#getStructuralElements <em>Structural Elements</em>}</li>
 *   <li>{@link Cpacs.VehiclesType#getMaterials <em>Materials</em>}</li>
 *   <li>{@link Cpacs.VehiclesType#getFuels <em>Fuels</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVehiclesType()
 * @model extendedMetaData="name='vehiclesType' kind='elementOnly'"
 * @generated
 */
public interface VehiclesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Aircraft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aircraft</em>' containment reference.
	 * @see #setAircraft(AircraftType)
	 * @see Cpacs.CpacsPackage#getVehiclesType_Aircraft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aircraft' namespace='##targetNamespace'"
	 * @generated
	 */
	AircraftType getAircraft();

	/**
	 * Sets the value of the '{@link Cpacs.VehiclesType#getAircraft <em>Aircraft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aircraft</em>' containment reference.
	 * @see #getAircraft()
	 * @generated
	 */
	void setAircraft(AircraftType value);

	/**
	 * Returns the value of the '<em><b>Rotorcraft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotorcraft</em>' containment reference.
	 * @see #setRotorcraft(RotorcraftType)
	 * @see Cpacs.CpacsPackage#getVehiclesType_Rotorcraft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotorcraft' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorcraftType getRotorcraft();

	/**
	 * Sets the value of the '{@link Cpacs.VehiclesType#getRotorcraft <em>Rotorcraft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotorcraft</em>' containment reference.
	 * @see #getRotorcraft()
	 * @generated
	 */
	void setRotorcraft(RotorcraftType value);

	/**
	 * Returns the value of the '<em><b>Engines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engines</em>' containment reference.
	 * @see #setEngines(EnginesType)
	 * @see Cpacs.CpacsPackage#getVehiclesType_Engines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='engines' namespace='##targetNamespace'"
	 * @generated
	 */
	EnginesType getEngines();

	/**
	 * Sets the value of the '{@link Cpacs.VehiclesType#getEngines <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engines</em>' containment reference.
	 * @see #getEngines()
	 * @generated
	 */
	void setEngines(EnginesType value);

	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference.
	 * @see #setProfiles(ProfilesType)
	 * @see Cpacs.CpacsPackage#getVehiclesType_Profiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profiles' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfilesType getProfiles();

	/**
	 * Sets the value of the '{@link Cpacs.VehiclesType#getProfiles <em>Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profiles</em>' containment reference.
	 * @see #getProfiles()
	 * @generated
	 */
	void setProfiles(ProfilesType value);

	/**
	 * Returns the value of the '<em><b>Structural Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Elements</em>' containment reference.
	 * @see #setStructuralElements(StructuralElementsType)
	 * @see Cpacs.CpacsPackage#getVehiclesType_StructuralElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralElements' namespace='##targetNamespace'"
	 * @generated
	 */
	StructuralElementsType getStructuralElements();

	/**
	 * Sets the value of the '{@link Cpacs.VehiclesType#getStructuralElements <em>Structural Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Elements</em>' containment reference.
	 * @see #getStructuralElements()
	 * @generated
	 */
	void setStructuralElements(StructuralElementsType value);

	/**
	 * Returns the value of the '<em><b>Materials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' containment reference.
	 * @see #setMaterials(MaterialsType)
	 * @see Cpacs.CpacsPackage#getVehiclesType_Materials()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='materials' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialsType getMaterials();

	/**
	 * Sets the value of the '{@link Cpacs.VehiclesType#getMaterials <em>Materials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materials</em>' containment reference.
	 * @see #getMaterials()
	 * @generated
	 */
	void setMaterials(MaterialsType value);

	/**
	 * Returns the value of the '<em><b>Fuels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuels</em>' containment reference.
	 * @see #setFuels(FuelsType)
	 * @see Cpacs.CpacsPackage#getVehiclesType_Fuels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuels' namespace='##targetNamespace'"
	 * @generated
	 */
	FuelsType getFuels();

	/**
	 * Sets the value of the '{@link Cpacs.VehiclesType#getFuels <em>Fuels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuels</em>' containment reference.
	 * @see #getFuels()
	 * @generated
	 */
	void setFuels(FuelsType value);

} // VehiclesType
