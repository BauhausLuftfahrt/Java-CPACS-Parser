/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skin Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SkinSegmentsType#getSkinSegment <em>Skin Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSkinSegmentsType()
 * @model extendedMetaData="name='skinSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface SkinSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Skin Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SkinSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skin Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSkinSegmentsType_SkinSegment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='skinSegment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SkinSegmentType> getSkinSegment();

} // SkinSegmentsType
