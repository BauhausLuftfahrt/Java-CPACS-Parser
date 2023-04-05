/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Geometry Contours Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinGeometryContoursType#getContour <em>Contour</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinGeometryContoursType()
 * @model extendedMetaData="name='cabinGeometryContoursType' kind='elementOnly'"
 * @generated
 */
public interface CabinGeometryContoursType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Contour</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CabinGeometryContourType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contour</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCabinGeometryContoursType_Contour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contour' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CabinGeometryContourType> getContour();

} // CabinGeometryContoursType
