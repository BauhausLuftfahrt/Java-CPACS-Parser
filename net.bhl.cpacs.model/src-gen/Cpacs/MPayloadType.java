/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPayload Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MPayloadType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MPayloadType#getMPax <em>MPax</em>}</li>
 *   <li>{@link Cpacs.MPayloadType#getMCargo <em>MCargo</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMPayloadType()
 * @model extendedMetaData="name='mPayloadType' kind='elementOnly'"
 * @generated
 */
public interface MPayloadType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payload mass description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMPayloadType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MPayloadType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MPax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPax</em>' containment reference.
	 * @see #setMPax(MPaxType)
	 * @see Cpacs.CpacsPackage#getMPayloadType_MPax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPax' namespace='##targetNamespace'"
	 * @generated
	 */
	MPaxType getMPax();

	/**
	 * Sets the value of the '{@link Cpacs.MPayloadType#getMPax <em>MPax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPax</em>' containment reference.
	 * @see #getMPax()
	 * @generated
	 */
	void setMPax(MPaxType value);

	/**
	 * Returns the value of the '<em><b>MCargo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCargo</em>' containment reference.
	 * @see #setMCargo(MCargoType)
	 * @see Cpacs.CpacsPackage#getMPayloadType_MCargo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCargo' namespace='##targetNamespace'"
	 * @generated
	 */
	MCargoType getMCargo();

	/**
	 * Sets the value of the '{@link Cpacs.MPayloadType#getMCargo <em>MCargo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCargo</em>' containment reference.
	 * @see #getMCargo()
	 * @generated
	 */
	void setMCargo(MCargoType value);

} // MPayloadType
