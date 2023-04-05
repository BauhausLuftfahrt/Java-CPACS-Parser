/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MUnusable Fuels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MUnusableFuelsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MUnusableFuelsType#getMUnusableFuel <em>MUnusable Fuel</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMUnusableFuelsType()
 * @model extendedMetaData="name='mUnusableFuelsType' kind='elementOnly'"
 * @generated
 */
public interface MUnusableFuelsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMUnusableFuelsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MUnusableFuelsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MUnusable Fuel</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unusable fuel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MUnusable Fuel</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMUnusableFuelsType_MUnusableFuel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mUnusableFuel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMUnusableFuel();

} // MUnusableFuelsType
