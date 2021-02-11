/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance Control Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceControlElementsType#getControlElement <em>Control Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceControlElementsType()
 * @model extendedMetaData="name='aeroPerformanceControlElementsType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceControlElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AeroPerformanceControlElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAeroPerformanceControlElementsType_ControlElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AeroPerformanceControlElementType> getControlElement();

} // AeroPerformanceControlElementsType
