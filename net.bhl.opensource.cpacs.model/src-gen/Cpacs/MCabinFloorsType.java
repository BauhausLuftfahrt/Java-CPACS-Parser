/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCabin Floors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MCabinFloorsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MCabinFloorsType#getMCabinFloor <em>MCabin Floor</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMCabinFloorsType()
 * @model extendedMetaData="name='mCabinFloorsType' kind='elementOnly'"
 * @generated
 */
public interface MCabinFloorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMCabinFloorsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MCabinFloorsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MCabin Floor</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCabin Floor</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMCabinFloorsType_MCabinFloor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCabinFloor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMCabinFloor();

} // MCabinFloorsType
