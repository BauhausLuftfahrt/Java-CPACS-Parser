/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MToilet Fluids Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MToiletFluidsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MToiletFluidsType#getMToiletFluid <em>MToilet Fluid</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMToiletFluidsType()
 * @model extendedMetaData="name='mToiletFluidsType' kind='elementOnly'"
 * @generated
 */
public interface MToiletFluidsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMToiletFluidsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MToiletFluidsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MToilet Fluid</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toilet fluid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MToilet Fluid</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMToiletFluidsType_MToiletFluid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mToiletFluid' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMToiletFluid();

} // MToiletFluidsType
