/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trim Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrimRequirementType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.TrimRequirementType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.TrimRequirementType#getFlightPointUID <em>Flight Point UID</em>}</li>
 *   <li>{@link Cpacs.TrimRequirementType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 *   <li>{@link Cpacs.TrimRequirementType#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link Cpacs.TrimRequirementType#getPerformanceMaps <em>Performance Maps</em>}</li>
 *   <li>{@link Cpacs.TrimRequirementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrimRequirementType()
 * @model extendedMetaData="name='trimRequirementType' kind='elementOnly'"
 * @generated
 */
public interface TrimRequirementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTrimRequirementType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.TrimRequirementType#getName <em>Name</em>}' containment reference.
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
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTrimRequirementType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.TrimRequirementType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Flight Point UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of a predefined flight point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flight Point UID</em>' containment reference.
	 * @see #setFlightPointUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrimRequirementType_FlightPointUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightPointUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFlightPointUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrimRequirementType#getFlightPointUID <em>Flight Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Point UID</em>' containment reference.
	 * @see #getFlightPointUID()
	 * @generated
	 */
	void setFlightPointUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Weight And Balance UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of weight and balance description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #setWeightAndBalanceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrimRequirementType_WeightAndBalanceUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weightAndBalanceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWeightAndBalanceUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrimRequirementType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #getWeightAndBalanceUID()
	 * @generated
	 */
	void setWeightAndBalanceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference.
	 * @see #setConfigurations(PerformanceRequirementConfigurationsType)
	 * @see Cpacs.CpacsPackage#getTrimRequirementType_Configurations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurations' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceRequirementConfigurationsType getConfigurations();

	/**
	 * Sets the value of the '{@link Cpacs.TrimRequirementType#getConfigurations <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' containment reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(PerformanceRequirementConfigurationsType value);

	/**
	 * Returns the value of the '<em><b>Performance Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Maps</em>' containment reference.
	 * @see #setPerformanceMaps(PerformanceMapSelectionType)
	 * @see Cpacs.CpacsPackage#getTrimRequirementType_PerformanceMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceMapSelectionType getPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.TrimRequirementType#getPerformanceMaps <em>Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Maps</em>' containment reference.
	 * @see #getPerformanceMaps()
	 * @generated
	 */
	void setPerformanceMaps(PerformanceMapSelectionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTrimRequirementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrimRequirementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TrimRequirementType
