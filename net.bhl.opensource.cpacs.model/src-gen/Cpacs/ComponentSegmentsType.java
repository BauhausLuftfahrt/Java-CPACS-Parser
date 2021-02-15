/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ComponentSegmentsType#getComponentSegment <em>Component Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getComponentSegmentsType()
 * @model extendedMetaData="name='componentSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface ComponentSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Component Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ComponentSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getComponentSegmentsType_ComponentSegment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentSegment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentSegmentType> getComponentSegment();

} // ComponentSegmentsType
