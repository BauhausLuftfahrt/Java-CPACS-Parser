/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WallSegmentsType#getWallSegment <em>Wall Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWallSegmentsType()
 * @model extendedMetaData="name='wallSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface WallSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wall Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WallSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wall segment definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wall Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWallSegmentsType_WallSegment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wallSegment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WallSegmentType> getWallSegment();

} // WallSegmentsType
