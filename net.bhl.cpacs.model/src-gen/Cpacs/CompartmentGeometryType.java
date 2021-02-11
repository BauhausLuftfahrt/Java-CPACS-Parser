/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CompartmentGeometryType#getBoundaryElementUID <em>Boundary Element UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCompartmentGeometryType()
 * @model extendedMetaData="name='compartmentGeometryType' kind='elementOnly'"
 * @generated
 */
public interface CompartmentGeometryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Boundary Element UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UIDs of 2d structural fuselage elements
	 *                                 (e.g., pressure bulkheads, walls or
	 *                                 floors). The compartment will be
	 *                                 enclosed with the fuselage skin
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boundary Element UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCompartmentGeometryType_BoundaryElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='boundaryElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getBoundaryElementUID();

} // CompartmentGeometryType
