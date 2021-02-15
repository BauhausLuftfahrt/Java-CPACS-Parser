/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor Panels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FloorPanelsType#getFloorPanel <em>Floor Panel</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFloorPanelsType()
 * @model extendedMetaData="name='floorPanelsType' kind='elementOnly'"
 * @generated
 */
public interface FloorPanelsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Floor Panel</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FloorPanelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor Panel</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFloorPanelsType_FloorPanel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='floorPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FloorPanelType> getFloorPanel();

} // FloorPanelsType
