/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MLanding Gears Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MLandingGearsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MLandingGearsType#getMNoseGears <em>MNose Gears</em>}</li>
 *   <li>{@link Cpacs.MLandingGearsType#getMMainGears <em>MMain Gears</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMLandingGearsType()
 * @model extendedMetaData="name='mLandingGearsType' kind='elementOnly'"
 * @generated
 */
public interface MLandingGearsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Landing Gears mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMLandingGearsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MLandingGearsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MNose Gears</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MNose Gears</em>' containment reference.
	 * @see #setMNoseGears(MNoseGearsType)
	 * @see Cpacs.CpacsPackage#getMLandingGearsType_MNoseGears()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mNoseGears' namespace='##targetNamespace'"
	 * @generated
	 */
	MNoseGearsType getMNoseGears();

	/**
	 * Sets the value of the '{@link Cpacs.MLandingGearsType#getMNoseGears <em>MNose Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MNose Gears</em>' containment reference.
	 * @see #getMNoseGears()
	 * @generated
	 */
	void setMNoseGears(MNoseGearsType value);

	/**
	 * Returns the value of the '<em><b>MMain Gears</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMain Gears</em>' containment reference.
	 * @see #setMMainGears(MMainGearsType)
	 * @see Cpacs.CpacsPackage#getMLandingGearsType_MMainGears()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMainGears' namespace='##targetNamespace'"
	 * @generated
	 */
	MMainGearsType getMMainGears();

	/**
	 * Sets the value of the '{@link Cpacs.MLandingGearsType#getMMainGears <em>MMain Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMain Gears</em>' containment reference.
	 * @see #getMMainGears()
	 * @generated
	 */
	void setMMainGears(MMainGearsType value);

} // MLandingGearsType
