/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MShell Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MShellType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MShellType#getMSkins <em>MSkins</em>}</li>
 *   <li>{@link Cpacs.MShellType#getMCells <em>MCells</em>}</li>
 *   <li>{@link Cpacs.MShellType#getMStringers <em>MStringers</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMShellType()
 * @model extendedMetaData="name='mShellType' kind='elementOnly'"
 * @generated
 */
public interface MShellType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMShellType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MShellType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MSkins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSkins</em>' containment reference.
	 * @see #setMSkins(MSkinsType)
	 * @see Cpacs.CpacsPackage#getMShellType_MSkins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSkins' namespace='##targetNamespace'"
	 * @generated
	 */
	MSkinsType getMSkins();

	/**
	 * Sets the value of the '{@link Cpacs.MShellType#getMSkins <em>MSkins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSkins</em>' containment reference.
	 * @see #getMSkins()
	 * @generated
	 */
	void setMSkins(MSkinsType value);

	/**
	 * Returns the value of the '<em><b>MCells</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCells</em>' containment reference.
	 * @see #setMCells(MCellsType)
	 * @see Cpacs.CpacsPackage#getMShellType_MCells()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCells' namespace='##targetNamespace'"
	 * @generated
	 */
	MCellsType getMCells();

	/**
	 * Sets the value of the '{@link Cpacs.MShellType#getMCells <em>MCells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCells</em>' containment reference.
	 * @see #getMCells()
	 * @generated
	 */
	void setMCells(MCellsType value);

	/**
	 * Returns the value of the '<em><b>MStringers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStringers</em>' containment reference.
	 * @see #setMStringers(MStringersType)
	 * @see Cpacs.CpacsPackage#getMShellType_MStringers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mStringers' namespace='##targetNamespace'"
	 * @generated
	 */
	MStringersType getMStringers();

	/**
	 * Sets the value of the '{@link Cpacs.MShellType#getMStringers <em>MStringers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStringers</em>' containment reference.
	 * @see #getMStringers()
	 * @generated
	 */
	void setMStringers(MStringersType value);

} // MShellType
