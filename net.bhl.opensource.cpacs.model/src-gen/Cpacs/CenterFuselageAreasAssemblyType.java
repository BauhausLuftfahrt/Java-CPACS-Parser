/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Fuselage Areas Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CenterFuselageAreasAssemblyType#getCenterFuselageArea <em>Center Fuselage Area</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCenterFuselageAreasAssemblyType()
 * @model extendedMetaData="name='centerFuselageAreasAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface CenterFuselageAreasAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Center Fuselage Area</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CenterFuselageAreaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Fuselage Area</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCenterFuselageAreasAssemblyType_CenterFuselageArea()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='centerFuselageArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CenterFuselageAreaType> getCenterFuselageArea();

} // CenterFuselageAreasAssemblyType
