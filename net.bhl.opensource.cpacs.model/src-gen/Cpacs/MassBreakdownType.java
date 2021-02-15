/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass Breakdown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MassBreakdownType#getDesignMasses <em>Design Masses</em>}</li>
 *   <li>{@link Cpacs.MassBreakdownType#getPayload <em>Payload</em>}</li>
 *   <li>{@link Cpacs.MassBreakdownType#getFuel <em>Fuel</em>}</li>
 *   <li>{@link Cpacs.MassBreakdownType#getMOEM <em>MOEM</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMassBreakdownType()
 * @model extendedMetaData="name='massBreakdownType' kind='elementOnly'"
 * @generated
 */
public interface MassBreakdownType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Design Masses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Masses</em>' containment reference.
	 * @see #setDesignMasses(DesignMassesType)
	 * @see Cpacs.CpacsPackage#getMassBreakdownType_DesignMasses()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='designMasses' namespace='##targetNamespace'"
	 * @generated
	 */
	DesignMassesType getDesignMasses();

	/**
	 * Sets the value of the '{@link Cpacs.MassBreakdownType#getDesignMasses <em>Design Masses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Masses</em>' containment reference.
	 * @see #getDesignMasses()
	 * @generated
	 */
	void setDesignMasses(DesignMassesType value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference.
	 * @see #setPayload(MPayloadType)
	 * @see Cpacs.CpacsPackage#getMassBreakdownType_Payload()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='payload' namespace='##targetNamespace'"
	 * @generated
	 */
	MPayloadType getPayload();

	/**
	 * Sets the value of the '{@link Cpacs.MassBreakdownType#getPayload <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' containment reference.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(MPayloadType value);

	/**
	 * Returns the value of the '<em><b>Fuel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel</em>' containment reference.
	 * @see #setFuel(MFuelType)
	 * @see Cpacs.CpacsPackage#getMassBreakdownType_Fuel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuel' namespace='##targetNamespace'"
	 * @generated
	 */
	MFuelType getFuel();

	/**
	 * Sets the value of the '{@link Cpacs.MassBreakdownType#getFuel <em>Fuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel</em>' containment reference.
	 * @see #getFuel()
	 * @generated
	 */
	void setFuel(MFuelType value);

	/**
	 * Returns the value of the '<em><b>MOEM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOEM</em>' containment reference.
	 * @see #setMOEM(OEMType)
	 * @see Cpacs.CpacsPackage#getMassBreakdownType_MOEM()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mOEM' namespace='##targetNamespace'"
	 * @generated
	 */
	OEMType getMOEM();

	/**
	 * Sets the value of the '{@link Cpacs.MassBreakdownType#getMOEM <em>MOEM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOEM</em>' containment reference.
	 * @see #getMOEM()
	 * @generated
	 */
	void setMOEM(OEMType value);

} // MassBreakdownType
