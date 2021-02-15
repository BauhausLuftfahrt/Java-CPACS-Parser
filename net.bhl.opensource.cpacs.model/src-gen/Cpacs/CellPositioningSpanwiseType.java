/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Positioning Spanwise Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CellPositioningSpanwiseType#getEta1 <em>Eta1</em>}</li>
 *   <li>{@link Cpacs.CellPositioningSpanwiseType#getEta2 <em>Eta2</em>}</li>
 *   <li>{@link Cpacs.CellPositioningSpanwiseType#getRibNumber <em>Rib Number</em>}</li>
 *   <li>{@link Cpacs.CellPositioningSpanwiseType#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCellPositioningSpanwiseType()
 * @model extendedMetaData="name='cellPositioningSpanwiseType' kind='elementOnly'"
 * @generated
 */
public interface CellPositioningSpanwiseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Eta1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise position of the forward
	 *                                         end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta1</em>' containment reference.
	 * @see #setEta1(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getCellPositioningSpanwiseType_Eta1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eta1' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEta1();

	/**
	 * Sets the value of the '{@link Cpacs.CellPositioningSpanwiseType#getEta1 <em>Eta1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta1</em>' containment reference.
	 * @see #getEta1()
	 * @generated
	 */
	void setEta1(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Eta2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise position of the rear end.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta2</em>' containment reference.
	 * @see #setEta2(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getCellPositioningSpanwiseType_Eta2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eta2' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEta2();

	/**
	 * Sets the value of the '{@link Cpacs.CellPositioningSpanwiseType#getEta2 <em>Eta2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta2</em>' containment reference.
	 * @see #getEta2()
	 * @generated
	 */
	void setEta2(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Rib Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RibNumber is the reference to the rib number
	 *                                         of the rib set which is referenced by 'ribDefinitionUID'.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Number</em>' containment reference.
	 * @see #setRibNumber(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getCellPositioningSpanwiseType_RibNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getRibNumber();

	/**
	 * Sets the value of the '{@link Cpacs.CellPositioningSpanwiseType#getRibNumber <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Number</em>' containment reference.
	 * @see #getRibNumber()
	 * @generated
	 */
	void setRibNumber(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Definition UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a ribDefinition set. The single
	 *                                         rib of this ribDefinition set is defined by using 'ribNumber'.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #setRibDefinitionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCellPositioningSpanwiseType_RibDefinitionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribDefinitionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRibDefinitionUID();

	/**
	 * Sets the value of the '{@link Cpacs.CellPositioningSpanwiseType#getRibDefinitionUID <em>Rib Definition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #getRibDefinitionUID()
	 * @generated
	 */
	void setRibDefinitionUID(StringUIDBaseType value);

} // CellPositioningSpanwiseType
