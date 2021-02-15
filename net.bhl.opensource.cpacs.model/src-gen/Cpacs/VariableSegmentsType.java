/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VariableSegmentsType#getVariableSegment <em>Variable Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVariableSegmentsType()
 * @model extendedMetaData="name='variableSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface VariableSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Variable Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.VariableSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getVariableSegmentsType_VariableSegment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variableSegment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VariableSegmentType> getVariableSegment();

} // VariableSegmentsType
