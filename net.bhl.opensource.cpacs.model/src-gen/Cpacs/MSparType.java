/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSpar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MSparType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MSparType#getMSparSkins <em>MSpar Skins</em>}</li>
 *   <li>{@link Cpacs.MSparType#getMSparCells <em>MSpar Cells</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMSparType()
 * @model extendedMetaData="name='mSparType' kind='elementOnly'"
 * @generated
 */
public interface MSparType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMSparType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MSparType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MSpar Skins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpar Skins</em>' containment reference.
	 * @see #setMSparSkins(MSparSkinsType)
	 * @see Cpacs.CpacsPackage#getMSparType_MSparSkins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSparSkins' namespace='##targetNamespace'"
	 * @generated
	 */
	MSparSkinsType getMSparSkins();

	/**
	 * Sets the value of the '{@link Cpacs.MSparType#getMSparSkins <em>MSpar Skins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSpar Skins</em>' containment reference.
	 * @see #getMSparSkins()
	 * @generated
	 */
	void setMSparSkins(MSparSkinsType value);

	/**
	 * Returns the value of the '<em><b>MSpar Cells</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpar Cells</em>' containment reference.
	 * @see #setMSparCells(MSparCellsType)
	 * @see Cpacs.CpacsPackage#getMSparType_MSparCells()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSparCells' namespace='##targetNamespace'"
	 * @generated
	 */
	MSparCellsType getMSparCells();

	/**
	 * Sets the value of the '{@link Cpacs.MSparType#getMSparCells <em>MSpar Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSpar Cells</em>' containment reference.
	 * @see #getMSparCells()
	 * @generated
	 */
	void setMSparCells(MSparCellsType value);

} // MSparType
