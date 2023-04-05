/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEngine APU Oils Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MEngineAPUOilsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MEngineAPUOilsType#getMEngineAPUOil <em>MEngine APU Oil</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMEngineAPUOilsType()
 * @model extendedMetaData="name='mEngineAPUOilsType' kind='elementOnly'"
 * @generated
 */
public interface MEngineAPUOilsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMEngineAPUOilsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MEngineAPUOilsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MEngine APU Oil</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engine APU oil
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MEngine APU Oil</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMEngineAPUOilsType_MEngineAPUOil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEngineAPUOil' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMEngineAPUOil();

} // MEngineAPUOilsType
