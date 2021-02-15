/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageSegmentsType#getSegment <em>Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageSegmentsType()
 * @model extendedMetaData="name='fuselageSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface FuselageSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselageSegmentsType_Segment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageSegmentType> getSegment();

} // FuselageSegmentsType
