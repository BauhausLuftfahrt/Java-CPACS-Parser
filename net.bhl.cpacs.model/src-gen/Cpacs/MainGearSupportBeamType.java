/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Gear Support Beam Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MainGearSupportBeamType#getPosition <em>Position</em>}</li>
 *   <li>{@link Cpacs.MainGearSupportBeamType#getStructure <em>Structure</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMainGearSupportBeamType()
 * @model extendedMetaData="name='mainGearSupportBeamType' kind='elementOnly'"
 * @generated
 */
public interface MainGearSupportBeamType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(MainGearSupportBeamPositionType)
	 * @see Cpacs.CpacsPackage#getMainGearSupportBeamType_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	MainGearSupportBeamPositionType getPosition();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearSupportBeamType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(MainGearSupportBeamPositionType value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(SparCrossSectionType)
	 * @see Cpacs.CpacsPackage#getMainGearSupportBeamType_Structure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	SparCrossSectionType getStructure();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearSupportBeamType#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(SparCrossSectionType value);

} // MainGearSupportBeamType
