/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MWing Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MWingBoxType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MWingBoxType#getMShells <em>MShells</em>}</li>
 *   <li>{@link Cpacs.MWingBoxType#getMSpars <em>MSpars</em>}</li>
 *   <li>{@link Cpacs.MWingBoxType#getMRibs <em>MRibs</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMWingBoxType()
 * @model extendedMetaData="name='mWingBoxType' kind='elementOnly'"
 * @generated
 */
public interface MWingBoxType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMWingBoxType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MWingBoxType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MShells</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MShells</em>' containment reference.
	 * @see #setMShells(MShellsType)
	 * @see Cpacs.CpacsPackage#getMWingBoxType_MShells()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mShells' namespace='##targetNamespace'"
	 * @generated
	 */
	MShellsType getMShells();

	/**
	 * Sets the value of the '{@link Cpacs.MWingBoxType#getMShells <em>MShells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MShells</em>' containment reference.
	 * @see #getMShells()
	 * @generated
	 */
	void setMShells(MShellsType value);

	/**
	 * Returns the value of the '<em><b>MSpars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpars</em>' containment reference.
	 * @see #setMSpars(MSparsType)
	 * @see Cpacs.CpacsPackage#getMWingBoxType_MSpars()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSpars' namespace='##targetNamespace'"
	 * @generated
	 */
	MSparsType getMSpars();

	/**
	 * Sets the value of the '{@link Cpacs.MWingBoxType#getMSpars <em>MSpars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSpars</em>' containment reference.
	 * @see #getMSpars()
	 * @generated
	 */
	void setMSpars(MSparsType value);

	/**
	 * Returns the value of the '<em><b>MRibs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRibs</em>' containment reference.
	 * @see #setMRibs(MRibsType)
	 * @see Cpacs.CpacsPackage#getMWingBoxType_MRibs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mRibs' namespace='##targetNamespace'"
	 * @generated
	 */
	MRibsType getMRibs();

	/**
	 * Sets the value of the '{@link Cpacs.MWingBoxType#getMRibs <em>MRibs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRibs</em>' containment reference.
	 * @see #getMRibs()
	 * @generated
	 */
	void setMRibs(MRibsType value);

} // MWingBoxType
