/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Control Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AircraftControlElementsType#getControlElement <em>Control Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAircraftControlElementsType()
 * @model extendedMetaData="name='aircraftControlElementsType' kind='elementOnly'"
 * @generated
 */
public interface AircraftControlElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AircraftControlElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAircraftControlElementsType_ControlElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AircraftControlElementType> getControlElement();

} // AircraftControlElementsType
