/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMain Gears Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MMainGearsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MMainGearsType#getMMainGear <em>MMain Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMMainGearsType()
 * @model extendedMetaData="name='mMainGearsType' kind='elementOnly'"
 * @generated
 */
public interface MMainGearsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMMainGearsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MMainGearsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MMain Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMain Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMMainGearsType_MMainGear()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMainGear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMMainGear();

} // MMainGearsType
