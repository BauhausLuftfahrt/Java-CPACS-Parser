/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Configuration Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpecificConfigurationSegmentsType#getSegment <em>Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpecificConfigurationSegmentsType()
 * @model extendedMetaData="name='specificConfigurationSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface SpecificConfigurationSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SpecificConfigurationSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSpecificConfigurationSegmentsType_Segment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecificConfigurationSegmentType> getSegment();

} // SpecificConfigurationSegmentsType
