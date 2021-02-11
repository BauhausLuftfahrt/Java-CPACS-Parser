/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Fuel Tanks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageFuelTanksType#getFuselageFuelTank <em>Fuselage Fuel Tank</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageFuelTanksType()
 * @model extendedMetaData="name='fuselageFuelTanksType' kind='elementOnly'"
 * @generated
 */
public interface FuselageFuelTanksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage Fuel Tank</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageFuelTankType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fuselage fuel tank geometry is defined by a link to a fuselage geometry compartment.
	 * The fuel tank volume type should also be used for the wing fuel tank
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuselage Fuel Tank</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselageFuelTanksType_FuselageFuelTank()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageFuelTank' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageFuelTankType> getFuselageFuelTank();

} // FuselageFuelTanksType
