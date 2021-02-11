/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCargo Floors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MCargoFloorsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MCargoFloorsType#getMCargoFloor <em>MCargo Floor</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMCargoFloorsType()
 * @model extendedMetaData="name='mCargoFloorsType' kind='elementOnly'"
 * @generated
 */
public interface MCargoFloorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMCargoFloorsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MCargoFloorsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MCargo Floor</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCargo Floor</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMCargoFloorsType_MCargoFloor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCargoFloor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMCargoFloor();

} // MCargoFloorsType
