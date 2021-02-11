/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MWings Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MWingsStructureType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MWingsStructureType#getMWingStructure <em>MWing Structure</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMWingsStructureType()
 * @model extendedMetaData="name='mWingsStructureType' kind='elementOnly'"
 * @generated
 */
public interface MWingsStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wings structure mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMWingsStructureType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MWingsStructureType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MWing Structure</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MWingStructureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWing Structure</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMWingsStructureType_MWingStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mWingStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MWingStructureType> getMWingStructure();

} // MWingsStructureType
