/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAdditional Center Tanks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MAdditionalCenterTanksType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MAdditionalCenterTanksType#getMAdditionalCenterTank <em>MAdditional Center Tank</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMAdditionalCenterTanksType()
 * @model extendedMetaData="name='mAdditionalCenterTanksType' kind='elementOnly'"
 * @generated
 */
public interface MAdditionalCenterTanksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMAdditionalCenterTanksType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MAdditionalCenterTanksType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MAdditional Center Tank</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional center tank
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MAdditional Center Tank</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMAdditionalCenterTanksType_MAdditionalCenterTank()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mAdditionalCenterTank' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMAdditionalCenterTank();

} // MAdditionalCenterTanksType
