/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Steps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceStepsType#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceStepsType()
 * @model extendedMetaData="name='controlSurfaceStepsType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceStepsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlSurfaceStepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlSurfaceStepsType_Step()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSurfaceStepType> getStep();

} // ControlSurfaceStepsType
