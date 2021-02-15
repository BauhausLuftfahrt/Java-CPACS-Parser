/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Floor Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinFloorElementsType#getFloorElement <em>Floor Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinFloorElementsType()
 * @model extendedMetaData="name='cabinFloorElementsType' kind='elementOnly'"
 * @generated
 */
public interface CabinFloorElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Floor Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CabinFloorElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCabinFloorElementsType_FloorElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='floorElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CabinFloorElementType> getFloorElement();

} // CabinFloorElementsType
