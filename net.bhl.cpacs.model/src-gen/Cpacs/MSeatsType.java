/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSeats Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MSeatsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MSeatsType#getMSeat <em>MSeat</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMSeatsType()
 * @model extendedMetaData="name='mSeatsType' kind='elementOnly'"
 * @generated
 */
public interface MSeatsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMSeatsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MSeatsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MSeat</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSeat</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMSeatsType_MSeat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSeat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMSeat();

} // MSeatsType
