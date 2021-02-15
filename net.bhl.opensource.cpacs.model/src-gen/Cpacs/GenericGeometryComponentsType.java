/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Geometry Components Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericGeometryComponentsType#getGenericGeometryComponent <em>Generic Geometry Component</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericGeometryComponentsType()
 * @model extendedMetaData="name='genericGeometryComponentsType' kind='elementOnly'"
 * @generated
 */
public interface GenericGeometryComponentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Generic Geometry Component</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericGeometricComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Geometry Component</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGenericGeometryComponentsType_GenericGeometryComponent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='genericGeometryComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericGeometricComponentType> getGenericGeometryComponent();

} // GenericGeometryComponentsType
