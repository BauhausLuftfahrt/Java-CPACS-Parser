/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointListType#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointListType()
 * @model extendedMetaData="name='pointListType' kind='elementOnly'"
 * @generated
 */
public interface PointListType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPointListType_Point()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointType> getPoint();

} // PointListType
