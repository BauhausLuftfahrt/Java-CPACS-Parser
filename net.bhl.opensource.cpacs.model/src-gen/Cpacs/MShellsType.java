/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MShells Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MShellsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MShellsType#getMUpperShell <em>MUpper Shell</em>}</li>
 *   <li>{@link Cpacs.MShellsType#getMLowerShell <em>MLower Shell</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMShellsType()
 * @model extendedMetaData="name='mShellsType' kind='elementOnly'"
 * @generated
 */
public interface MShellsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMShellsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MShellsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MUpper Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpper Shell</em>' containment reference.
	 * @see #setMUpperShell(MShellType)
	 * @see Cpacs.CpacsPackage#getMShellsType_MUpperShell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mUpperShell' namespace='##targetNamespace'"
	 * @generated
	 */
	MShellType getMUpperShell();

	/**
	 * Sets the value of the '{@link Cpacs.MShellsType#getMUpperShell <em>MUpper Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MUpper Shell</em>' containment reference.
	 * @see #getMUpperShell()
	 * @generated
	 */
	void setMUpperShell(MShellType value);

	/**
	 * Returns the value of the '<em><b>MLower Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLower Shell</em>' containment reference.
	 * @see #setMLowerShell(MShellType)
	 * @see Cpacs.CpacsPackage#getMShellsType_MLowerShell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mLowerShell' namespace='##targetNamespace'"
	 * @generated
	 */
	MShellType getMLowerShell();

	/**
	 * Sets the value of the '{@link Cpacs.MShellsType#getMLowerShell <em>MLower Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLower Shell</em>' containment reference.
	 * @see #getMLowerShell()
	 * @generated
	 */
	void setMLowerShell(MShellType value);

} // MShellsType
