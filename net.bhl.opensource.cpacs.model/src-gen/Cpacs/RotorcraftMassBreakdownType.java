/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotorcraft Mass Breakdown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorcraftMassBreakdownType#getDesignMasses <em>Design Masses</em>}</li>
 *   <li>{@link Cpacs.RotorcraftMassBreakdownType#getPayload <em>Payload</em>}</li>
 *   <li>{@link Cpacs.RotorcraftMassBreakdownType#getFuel <em>Fuel</em>}</li>
 *   <li>{@link Cpacs.RotorcraftMassBreakdownType#getMOEM <em>MOEM</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorcraftMassBreakdownType()
 * @model extendedMetaData="name='rotorcraftMassBreakdownType' kind='elementOnly'"
 * @generated
 */
public interface RotorcraftMassBreakdownType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Design Masses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Masses</em>' containment reference.
	 * @see #setDesignMasses(DesignMassesType)
	 * @see Cpacs.CpacsPackage#getRotorcraftMassBreakdownType_DesignMasses()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='designMasses' namespace='##targetNamespace'"
	 * @generated
	 */
	DesignMassesType getDesignMasses();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassBreakdownType#getDesignMasses <em>Design Masses</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getRotorcraftMassBreakdownType_Payload()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='payload' namespace='##targetNamespace'"
	 * @generated
	 */
	MPayloadType getPayload();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassBreakdownType#getPayload <em>Payload</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getRotorcraftMassBreakdownType_Fuel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuel' namespace='##targetNamespace'"
	 * @generated
	 */
	MFuelType getFuel();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassBreakdownType#getFuel <em>Fuel</em>}' containment reference.
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
	 * @see #setMOEM(RotorcraftMassOEMType)
	 * @see Cpacs.CpacsPackage#getRotorcraftMassBreakdownType_MOEM()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mOEM' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorcraftMassOEMType getMOEM();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassBreakdownType#getMOEM <em>MOEM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOEM</em>' containment reference.
	 * @see #getMOEM()
	 * @generated
	 */
	void setMOEM(RotorcraftMassOEMType value);

} // RotorcraftMassBreakdownType
