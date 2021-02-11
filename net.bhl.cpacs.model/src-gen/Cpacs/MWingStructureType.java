/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MWing Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MWingStructureType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MWingStructureType#getMComponentSegments <em>MComponent Segments</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMWingStructureType()
 * @model extendedMetaData="name='mWingStructureType' kind='elementOnly'"
 * @generated
 */
public interface MWingStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wing structure mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMWingStructureType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MWingStructureType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MComponent Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MComponent Segments</em>' containment reference.
	 * @see #setMComponentSegments(MComponentSegmentsType)
	 * @see Cpacs.CpacsPackage#getMWingStructureType_MComponentSegments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mComponentSegments' namespace='##targetNamespace'"
	 * @generated
	 */
	MComponentSegmentsType getMComponentSegments();

	/**
	 * Sets the value of the '{@link Cpacs.MWingStructureType#getMComponentSegments <em>MComponent Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MComponent Segments</em>' containment reference.
	 * @see #getMComponentSegments()
	 * @generated
	 */
	void setMComponentSegments(MComponentSegmentsType value);

} // MWingStructureType
