/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Segment Blocks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionSegmentBlocksType#getSegmentBlock <em>Segment Block</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionSegmentBlocksType()
 * @model extendedMetaData="name='missionSegmentBlocksType' kind='elementOnly'"
 * @generated
 */
public interface MissionSegmentBlocksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment Block</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MissionSegmentBlockType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Block</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlocksType_SegmentBlock()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MissionSegmentBlockType> getSegmentBlock();

} // MissionSegmentBlocksType
