/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MRemovable Crew Rests Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MRemovableCrewRestsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MRemovableCrewRestsType#getMRemovableCrewRest <em>MRemovable Crew Rest</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMRemovableCrewRestsType()
 * @model extendedMetaData="name='mRemovableCrewRestsType' kind='elementOnly'"
 * @generated
 */
public interface MRemovableCrewRestsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMRemovableCrewRestsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MRemovableCrewRestsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MRemovable Crew Rest</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removable crew rest
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MRemovable Crew Rest</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMRemovableCrewRestsType_MRemovableCrewRest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mRemovableCrewRest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMRemovableCrewRest();

} // MRemovableCrewRestsType
