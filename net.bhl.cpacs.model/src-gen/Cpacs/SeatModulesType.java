/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat Modules Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SeatModulesType#getSeatModule <em>Seat Module</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSeatModulesType()
 * @model extendedMetaData="name='seatModulesType' kind='elementOnly'"
 * @generated
 */
public interface SeatModulesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Seat Module</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SeatModuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Module</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSeatModulesType_SeatModule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seatModule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SeatModuleType> getSeatModule();

} // SeatModulesType
