/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Segment Steps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ComponentSegmentStepsType#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getComponentSegmentStepsType()
 * @model extendedMetaData="name='componentSegmentStepsType' kind='elementOnly'"
 * @generated
 */
public interface ComponentSegmentStepsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ComponentSegmentStepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of one step of the deflection path.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getComponentSegmentStepsType_Step()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentSegmentStepType> getStep();

} // ComponentSegmentStepsType
