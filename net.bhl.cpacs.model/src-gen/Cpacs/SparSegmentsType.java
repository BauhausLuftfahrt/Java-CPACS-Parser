/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spar Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SparSegmentsType#getSparSegment <em>Spar Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSparSegmentsType()
 * @model extendedMetaData="name='sparSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface SparSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SparSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSparSegmentsType_SparSegment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sparSegment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SparSegmentType> getSparSegment();

} // SparSegmentsType
