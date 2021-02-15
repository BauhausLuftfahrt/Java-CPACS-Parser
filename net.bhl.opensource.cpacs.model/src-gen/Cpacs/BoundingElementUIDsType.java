/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Element UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 A list of uIDs referencing other structural/geometric
 *                 elements that shall serve as a boundary of the wall
 *                 element. Possible references are floor, wall or
 *                 genericGeometryComponent. A major requirement is that
 *                 the referenced element has an intersection with the wall
 *                 for at least the distance between two wall positions. So
 *                 that a full geometric face of the wall is bounded by it.
 *                 Neighbouring wall faces that are not completely bounded
 *                 by the reference element are not affected.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BoundingElementUIDsType#getBoundingElementUID <em>Bounding Element UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBoundingElementUIDsType()
 * @model extendedMetaData="name='boundingElementUIDsType' kind='elementOnly'"
 * @generated
 */
public interface BoundingElementUIDsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Bounding Element UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID referencing another
	 *                                 structural/geometric element that shall
	 *                                 serve as a boundary of the wall element.
	 *                                 Possible references are floor, wall or
	 *                                 genericGeometryComponent.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounding Element UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getBoundingElementUIDsType_BoundingElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='boundingElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getBoundingElementUID();

} // BoundingElementUIDsType
