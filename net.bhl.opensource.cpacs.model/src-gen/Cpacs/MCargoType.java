/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCargo Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MCargoType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MCargoType#getMEmptyULDs <em>MEmpty UL Ds</em>}</li>
 *   <li>{@link Cpacs.MCargoType#getMULDContents <em>MULD Contents</em>}</li>
 *   <li>{@link Cpacs.MCargoType#getMBulkCargos <em>MBulk Cargos</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMCargoType()
 * @model extendedMetaData="name='mCargoType' kind='elementOnly'"
 * @generated
 */
public interface MCargoType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cargo masses description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMCargoType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MCargoType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MEmpty UL Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cargo mass description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MEmpty UL Ds</em>' containment reference.
	 * @see #setMEmptyULDs(MEmptyULDsType)
	 * @see Cpacs.CpacsPackage#getMCargoType_MEmptyULDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEmptyULDs' namespace='##targetNamespace'"
	 * @generated
	 */
	MEmptyULDsType getMEmptyULDs();

	/**
	 * Sets the value of the '{@link Cpacs.MCargoType#getMEmptyULDs <em>MEmpty UL Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEmpty UL Ds</em>' containment reference.
	 * @see #getMEmptyULDs()
	 * @generated
	 */
	void setMEmptyULDs(MEmptyULDsType value);

	/**
	 * Returns the value of the '<em><b>MULD Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MULD Contents</em>' containment reference.
	 * @see #setMULDContents(MULDContentsType)
	 * @see Cpacs.CpacsPackage#getMCargoType_MULDContents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mULDContents' namespace='##targetNamespace'"
	 * @generated
	 */
	MULDContentsType getMULDContents();

	/**
	 * Sets the value of the '{@link Cpacs.MCargoType#getMULDContents <em>MULD Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MULD Contents</em>' containment reference.
	 * @see #getMULDContents()
	 * @generated
	 */
	void setMULDContents(MULDContentsType value);

	/**
	 * Returns the value of the '<em><b>MBulk Cargos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBulk Cargos</em>' containment reference.
	 * @see #setMBulkCargos(MBulkCargosType)
	 * @see Cpacs.CpacsPackage#getMCargoType_MBulkCargos()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mBulkCargos' namespace='##targetNamespace'"
	 * @generated
	 */
	MBulkCargosType getMBulkCargos();

	/**
	 * Sets the value of the '{@link Cpacs.MCargoType#getMBulkCargos <em>MBulk Cargos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBulk Cargos</em>' containment reference.
	 * @see #getMBulkCargos()
	 * @generated
	 */
	void setMBulkCargos(MBulkCargosType value);

} // MCargoType
