/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.OperationalCaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.OperationalCaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.OperationalCaseType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.OperationalCaseType#getCoG <em>Co G</em>}</li>
 *   <li>{@link Cpacs.OperationalCaseType#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.OperationalCaseType#getMFuel <em>MFuel</em>}</li>
 *   <li>{@link Cpacs.OperationalCaseType#getMPayload <em>MPayload</em>}</li>
 *   <li>{@link Cpacs.OperationalCaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOperationalCaseType()
 * @model extendedMetaData="name='operationalCaseType' kind='elementOnly'"
 * @generated
 */
public interface OperationalCaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getOperationalCaseType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.OperationalCaseType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOperationalCaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.OperationalCaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getOperationalCaseType_Mass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.OperationalCaseType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Co G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co G</em>' containment reference.
	 * @see #setCoG(PointListXYZVectorType)
	 * @see Cpacs.CpacsPackage#getOperationalCaseType_CoG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coG' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListXYZVectorType getCoG();

	/**
	 * Sets the value of the '{@link Cpacs.OperationalCaseType#getCoG <em>Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co G</em>' containment reference.
	 * @see #getCoG()
	 * @generated
	 */
	void setCoG(PointListXYZVectorType value);

	/**
	 * Returns the value of the '<em><b>Mass Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #setMassInertia(MassInertiaVectorType)
	 * @see Cpacs.CpacsPackage#getOperationalCaseType_MassInertia()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massInertia' namespace='##targetNamespace'"
	 * @generated
	 */
	MassInertiaVectorType getMassInertia();

	/**
	 * Sets the value of the '{@link Cpacs.OperationalCaseType#getMassInertia <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #getMassInertia()
	 * @generated
	 */
	void setMassInertia(MassInertiaVectorType value);

	/**
	 * Returns the value of the '<em><b>MFuel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFuel</em>' containment reference.
	 * @see #setMFuel(WeightAndBalanceFuelType)
	 * @see Cpacs.CpacsPackage#getOperationalCaseType_MFuel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFuel' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightAndBalanceFuelType getMFuel();

	/**
	 * Sets the value of the '{@link Cpacs.OperationalCaseType#getMFuel <em>MFuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFuel</em>' containment reference.
	 * @see #getMFuel()
	 * @generated
	 */
	void setMFuel(WeightAndBalanceFuelType value);

	/**
	 * Returns the value of the '<em><b>MPayload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPayload</em>' containment reference.
	 * @see #setMPayload(WeightAndBalancePayloadType)
	 * @see Cpacs.CpacsPackage#getOperationalCaseType_MPayload()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mPayload' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightAndBalancePayloadType getMPayload();

	/**
	 * Sets the value of the '{@link Cpacs.OperationalCaseType#getMPayload <em>MPayload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPayload</em>' containment reference.
	 * @see #getMPayload()
	 * @generated
	 */
	void setMPayload(WeightAndBalancePayloadType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getOperationalCaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.OperationalCaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // OperationalCaseType
