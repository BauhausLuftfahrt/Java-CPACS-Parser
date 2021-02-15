/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getFuelMass <em>Fuel Mass</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getTime <em>Time</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getDistance <em>Distance</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getRadiativeForcing <em>Radiative Forcing</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getNOXMass <em>NOX Mass</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getNOXMassHumid <em>NOX Mass Humid</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getCO2Mass <em>CO2 Mass</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getCOMass <em>CO Mass</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getH2OMass <em>H2O Mass</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getSO2Mass <em>SO2 Mass</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getHCMass <em>HC Mass</em>}</li>
 *   <li>{@link Cpacs.TrajectoryGlobalType#getSootMass <em>Soot Mass</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType()
 * @model extendedMetaData="name='trajectoryGlobalType' kind='elementOnly'"
 * @generated
 */
public interface TrajectoryGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuel Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Mass</em>' containment reference.
	 * @see #setFuelMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_FuelMass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuelMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFuelMass();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getFuelMass <em>Fuel Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Mass</em>' containment reference.
	 * @see #getFuelMass()
	 * @generated
	 */
	void setFuelMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_Time()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTime();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_Distance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDistance();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Radiative Forcing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radiative Forcing</em>' containment reference.
	 * @see #setRadiativeForcing(RadiativeForcingType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_RadiativeForcing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='radiativeForcing' namespace='##targetNamespace'"
	 * @generated
	 */
	RadiativeForcingType getRadiativeForcing();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getRadiativeForcing <em>Radiative Forcing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radiative Forcing</em>' containment reference.
	 * @see #getRadiativeForcing()
	 * @generated
	 */
	void setRadiativeForcing(RadiativeForcingType value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #setDeltaTemperature(DeltaTemperatureType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_DeltaTemperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DeltaTemperatureType getDeltaTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getDeltaTemperature <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #getDeltaTemperature()
	 * @generated
	 */
	void setDeltaTemperature(DeltaTemperatureType value);

	/**
	 * Returns the value of the '<em><b>NOX Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOX Mass</em>' containment reference.
	 * @see #setNOXMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_NOXMass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nOXMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNOXMass();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getNOXMass <em>NOX Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOX Mass</em>' containment reference.
	 * @see #getNOXMass()
	 * @generated
	 */
	void setNOXMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>NOX Mass Humid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOX Mass Humid</em>' containment reference.
	 * @see #setNOXMassHumid(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_NOXMassHumid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nOXMassHumid' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNOXMassHumid();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getNOXMassHumid <em>NOX Mass Humid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOX Mass Humid</em>' containment reference.
	 * @see #getNOXMassHumid()
	 * @generated
	 */
	void setNOXMassHumid(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>CO2 Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO2 Mass</em>' containment reference.
	 * @see #setCO2Mass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_CO2Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cO2Mass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCO2Mass();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getCO2Mass <em>CO2 Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO2 Mass</em>' containment reference.
	 * @see #getCO2Mass()
	 * @generated
	 */
	void setCO2Mass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>CO Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO Mass</em>' containment reference.
	 * @see #setCOMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_COMass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cOMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCOMass();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getCOMass <em>CO Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO Mass</em>' containment reference.
	 * @see #getCOMass()
	 * @generated
	 */
	void setCOMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>H2O Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2O Mass</em>' containment reference.
	 * @see #setH2OMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_H2OMass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='h2OMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getH2OMass();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getH2OMass <em>H2O Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H2O Mass</em>' containment reference.
	 * @see #getH2OMass()
	 * @generated
	 */
	void setH2OMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>SO2 Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SO2 Mass</em>' containment reference.
	 * @see #setSO2Mass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_SO2Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sO2Mass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSO2Mass();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getSO2Mass <em>SO2 Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SO2 Mass</em>' containment reference.
	 * @see #getSO2Mass()
	 * @generated
	 */
	void setSO2Mass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>HC Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HC Mass</em>' containment reference.
	 * @see #setHCMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_HCMass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hCMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHCMass();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getHCMass <em>HC Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HC Mass</em>' containment reference.
	 * @see #getHCMass()
	 * @generated
	 */
	void setHCMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Soot Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soot Mass</em>' containment reference.
	 * @see #setSootMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryGlobalType_SootMass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sootMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSootMass();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryGlobalType#getSootMass <em>Soot Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soot Mass</em>' containment reference.
	 * @see #getSootMass()
	 * @generated
	 */
	void setSootMass(DoubleBaseType value);

} // TrajectoryGlobalType
