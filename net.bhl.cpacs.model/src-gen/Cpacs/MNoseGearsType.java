/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MNose Gears Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MNoseGearsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MNoseGearsType#getMNoseGear <em>MNose Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMNoseGearsType()
 * @model extendedMetaData="name='mNoseGearsType' kind='elementOnly'"
 * @generated
 */
public interface MNoseGearsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMNoseGearsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MNoseGearsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MNose Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MNose Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMNoseGearsType_MNoseGear()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mNoseGear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMNoseGear();

} // MNoseGearsType
