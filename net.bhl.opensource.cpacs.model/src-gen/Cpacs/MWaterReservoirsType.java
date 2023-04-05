/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MWater Reservoirs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MWaterReservoirsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MWaterReservoirsType#getMWaterReservoir <em>MWater Reservoir</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMWaterReservoirsType()
 * @model extendedMetaData="name='mWaterReservoirsType' kind='elementOnly'"
 * @generated
 */
public interface MWaterReservoirsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMWaterReservoirsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MWaterReservoirsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MWater Reservoir</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Water reservoir
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MWater Reservoir</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMWaterReservoirsType_MWaterReservoir()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mWaterReservoir' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMWaterReservoir();

} // MWaterReservoirsType
