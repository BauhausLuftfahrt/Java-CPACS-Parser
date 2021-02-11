/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cruise Rollers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CruiseRollersType#getCruiseRoller <em>Cruise Roller</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCruiseRollersType()
 * @model extendedMetaData="name='cruiseRollersType' kind='elementOnly'"
 * @generated
 */
public interface CruiseRollersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cruise Roller</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CruiseRollerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of one cruise rollers/mid-span
	 *                                 stops.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cruise Roller</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCruiseRollersType_CruiseRoller()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cruiseRoller' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CruiseRollerType> getCruiseRoller();

} // CruiseRollersType
