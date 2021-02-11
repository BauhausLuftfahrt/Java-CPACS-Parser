/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBelly Fairings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MBellyFairingsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MBellyFairingsType#getMBellyFairing <em>MBelly Fairing</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMBellyFairingsType()
 * @model extendedMetaData="name='mBellyFairingsType' kind='elementOnly'"
 * @generated
 */
public interface MBellyFairingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMBellyFairingsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MBellyFairingsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MBelly Fairing</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBelly Fairing</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMBellyFairingsType_MBellyFairing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mBellyFairing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMBellyFairing();

} // MBellyFairingsType
