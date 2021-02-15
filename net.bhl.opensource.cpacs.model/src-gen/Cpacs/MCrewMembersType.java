/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCrew Members Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MCrewMembersType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MCrewMembersType#getMCrewMember <em>MCrew Member</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMCrewMembersType()
 * @model extendedMetaData="name='mCrewMembersType' kind='elementOnly'"
 * @generated
 */
public interface MCrewMembersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMCrewMembersType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MCrewMembersType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MCrew Member</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCrew Member</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMCrewMembersType_MCrewMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCrewMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMCrewMember();

} // MCrewMembersType
