/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point List XY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointListXYType#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointListXYType()
 * @model extendedMetaData="name='pointListXYType' kind='elementOnly'"
 * @generated
 */
public interface PointListXYType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PointXYType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data points in x-y-space.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPointListXYType_Point()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointXYType> getPoint();

} // PointListXYType
