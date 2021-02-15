/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Dynamics Flight Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getStandardAltitude <em>Standard Altitude</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getVCAS <em>VCAS</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getGear <em>Gear</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getLinearModel <em>Linear Model</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getTrimResult <em>Trim Result</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsFlightCaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType()
 * @model extendedMetaData="name='flightDynamicsFlightCaseType' kind='elementOnly'"
 * @generated
 */
public interface FlightDynamicsFlightCaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Weight And Balance UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #setWeightAndBalanceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_WeightAndBalanceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='weightAndBalanceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWeightAndBalanceUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #getWeightAndBalanceUID()
	 * @generated
	 */
	void setWeightAndBalanceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Standard Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Altitude</em>' containment reference.
	 * @see #setStandardAltitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_StandardAltitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='standardAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStandardAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getStandardAltitude <em>Standard Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Altitude</em>' containment reference.
	 * @see #getStandardAltitude()
	 * @generated
	 */
	void setStandardAltitude(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>VCAS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VCAS</em>' containment reference.
	 * @see #setVCAS(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_VCAS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vCAS' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVCAS();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getVCAS <em>VCAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VCAS</em>' containment reference.
	 * @see #getVCAS()
	 * @generated
	 */
	void setVCAS(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_Configuration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getConfiguration();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Gear</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gear</em>' containment reference.
	 * @see #setGear(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_Gear()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gear' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getGear();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getGear <em>Gear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gear</em>' containment reference.
	 * @see #getGear()
	 * @generated
	 */
	void setGear(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Linear Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Model</em>' containment reference.
	 * @see #setLinearModel(FlightDynamicsLinearModelType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_LinearModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linearModel' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightDynamicsLinearModelType getLinearModel();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getLinearModel <em>Linear Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Model</em>' containment reference.
	 * @see #getLinearModel()
	 * @generated
	 */
	void setLinearModel(FlightDynamicsLinearModelType value);

	/**
	 * Returns the value of the '<em><b>Trim Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim Result</em>' containment reference.
	 * @see #setTrimResult(FlightDynamicsTrimResultType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_TrimResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trimResult' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightDynamicsTrimResultType getTrimResult();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getTrimResult <em>Trim Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim Result</em>' containment reference.
	 * @see #getTrimResult()
	 * @generated
	 */
	void setTrimResult(FlightDynamicsTrimResultType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsFlightCaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FlightDynamicsFlightCaseType
