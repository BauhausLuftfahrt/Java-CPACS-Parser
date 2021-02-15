/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCarry Ons Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MCarryOnsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MCarryOnsType#getMCarryOn <em>MCarry On</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMCarryOnsType()
 * @model extendedMetaData="name='mCarryOnsType' kind='elementOnly'"
 * @generated
 */
public interface MCarryOnsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMCarryOnsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MCarryOnsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MCarry On</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MCarryOnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCarry On</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMCarryOnsType_MCarryOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCarryOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MCarryOnType> getMCarryOn();

} // MCarryOnsType
