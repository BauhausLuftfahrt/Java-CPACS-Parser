/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCrew Seats Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MCrewSeatsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MCrewSeatsType#getMCrewSeat <em>MCrew Seat</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMCrewSeatsType()
 * @model extendedMetaData="name='mCrewSeatsType' kind='elementOnly'"
 * @generated
 */
public interface MCrewSeatsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMCrewSeatsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MCrewSeatsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MCrew Seat</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCrew Seat</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMCrewSeatsType_MCrewSeat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCrewSeat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMCrewSeat();

} // MCrewSeatsType
