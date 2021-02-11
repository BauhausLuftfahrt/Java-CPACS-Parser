/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OEM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.OEMType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.OEMType#getMEM <em>MEM</em>}</li>
 *   <li>{@link Cpacs.OEMType#getMOperatorItems <em>MOperator Items</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOEMType()
 * @model extendedMetaData="name='oEMType' kind='elementOnly'"
 * @generated
 */
public interface OEMType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operating empty mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getOEMType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.OEMType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MEM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEM</em>' containment reference.
	 * @see #setMEM(MManufacturerEmptyType)
	 * @see Cpacs.CpacsPackage#getOEMType_MEM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEM' namespace='##targetNamespace'"
	 * @generated
	 */
	MManufacturerEmptyType getMEM();

	/**
	 * Sets the value of the '{@link Cpacs.OEMType#getMEM <em>MEM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEM</em>' containment reference.
	 * @see #getMEM()
	 * @generated
	 */
	void setMEM(MManufacturerEmptyType value);

	/**
	 * Returns the value of the '<em><b>MOperator Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOperator Items</em>' containment reference.
	 * @see #setMOperatorItems(MOperatorItemsType)
	 * @see Cpacs.CpacsPackage#getOEMType_MOperatorItems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mOperatorItems' namespace='##targetNamespace'"
	 * @generated
	 */
	MOperatorItemsType getMOperatorItems();

	/**
	 * Sets the value of the '{@link Cpacs.OEMType#getMOperatorItems <em>MOperator Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOperator Items</em>' containment reference.
	 * @see #getMOperatorItems()
	 * @generated
	 */
	void setMOperatorItems(MOperatorItemsType value);

} // OEMType
