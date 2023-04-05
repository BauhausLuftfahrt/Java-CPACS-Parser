/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Load Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getSafetyFactor <em>Safety Factor</em>}</li>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getAccelerations <em>Accelerations</em>}</li>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getRotationRates <em>Rotation Rates</em>}</li>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getSizingType <em>Sizing Type</em>}</li>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getGust <em>Gust</em>}</li>
 *   <li>{@link Cpacs.FlightLoadConditionsType#getDesignSpeed <em>Design Speed</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType()
 * @model extendedMetaData="name='flightLoadConditionsType' kind='elementOnly'"
 * @generated
 */
public interface FlightLoadConditionsType extends ComplexBaseType {
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
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Safety Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Safety factor applied on the loads
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Safety Factor</em>' containment reference.
	 * @see #setSafetyFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_SafetyFactor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='safetyFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSafetyFactor();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getSafetyFactor <em>Safety Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Factor</em>' containment reference.
	 * @see #getSafetyFactor()
	 * @generated
	 */
	void setSafetyFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Accelerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accelerations</em>' containment reference.
	 * @see #setAccelerations(LoadCaseAccelerationsType)
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_Accelerations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accelerations' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseAccelerationsType getAccelerations();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getAccelerations <em>Accelerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accelerations</em>' containment reference.
	 * @see #getAccelerations()
	 * @generated
	 */
	void setAccelerations(LoadCaseAccelerationsType value);

	/**
	 * Returns the value of the '<em><b>Rotation Rates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Rotational rates around centre of gravity
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation Rates</em>' containment reference.
	 * @see #setRotationRates(PointXYZType)
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_RotationRates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotationRates' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getRotationRates();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getRotationRates <em>Rotation Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Rates</em>' containment reference.
	 * @see #getRotationRates()
	 * @generated
	 */
	void setRotationRates(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Sizing Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.SizingTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Enumeration flag stating the typ of the load
	 *                                 case (i.e. limit or ultimate loads)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sizing Type</em>' attribute.
	 * @see Cpacs.SizingTypeType
	 * @see #isSetSizingType()
	 * @see #unsetSizingType()
	 * @see #setSizingType(SizingTypeType)
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_SizingType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sizingType' namespace='##targetNamespace'"
	 * @generated
	 */
	SizingTypeType getSizingType();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getSizingType <em>Sizing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizing Type</em>' attribute.
	 * @see Cpacs.SizingTypeType
	 * @see #isSetSizingType()
	 * @see #unsetSizingType()
	 * @see #getSizingType()
	 * @generated
	 */
	void setSizingType(SizingTypeType value);

	/**
	 * Unsets the value of the '{@link Cpacs.FlightLoadConditionsType#getSizingType <em>Sizing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizingType()
	 * @see #getSizingType()
	 * @see #setSizingType(SizingTypeType)
	 * @generated
	 */
	void unsetSizingType();

	/**
	 * Returns whether the value of the '{@link Cpacs.FlightLoadConditionsType#getSizingType <em>Sizing Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sizing Type</em>' attribute is set.
	 * @see #unsetSizingType()
	 * @see #getSizingType()
	 * @see #setSizingType(SizingTypeType)
	 * @generated
	 */
	boolean isSetSizingType();

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle of sideslip [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_AngleOfSideslip()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle of attack [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_AngleOfAttack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gust</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gust</em>' containment reference.
	 * @see #setGust(LoadCaseGustType)
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_Gust()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gust' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseGustType getGust();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getGust <em>Gust</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gust</em>' containment reference.
	 * @see #getGust()
	 * @generated
	 */
	void setGust(LoadCaseGustType value);

	/**
	 * Returns the value of the '<em><b>Design Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Speed</em>' containment reference.
	 * @see #setDesignSpeed(SpeedDesignatorsType)
	 * @see Cpacs.CpacsPackage#getFlightLoadConditionsType_DesignSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeedDesignatorsType getDesignSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadConditionsType#getDesignSpeed <em>Design Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Speed</em>' containment reference.
	 * @see #getDesignSpeed()
	 * @generated
	 */
	void setDesignSpeed(SpeedDesignatorsType value);

} // FlightLoadConditionsType
