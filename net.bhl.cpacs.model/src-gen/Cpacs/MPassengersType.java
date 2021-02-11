/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPassengers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MPassengersType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MPassengersType#getMPassenger <em>MPassenger</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMPassengersType()
 * @model extendedMetaData="name='mPassengersType' kind='elementOnly'"
 * @generated
 */
public interface MPassengersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMPassengersType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MPassengersType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MPassenger</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MPassengerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPassenger</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMPassengersType_MPassenger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPassenger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MPassengerType> getMPassenger();

} // MPassengersType
