/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Reference Axis Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadReferenceAxisPointsType#getLoadReferenceAxisPoint <em>Load Reference Axis Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadReferenceAxisPointsType()
 * @model extendedMetaData="name='loadReferenceAxisPointsType' kind='elementOnly'"
 * @generated
 */
public interface LoadReferenceAxisPointsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Reference Axis Point</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LoadReferenceAxisPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Reference Axis Point</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadReferenceAxisPointsType_LoadReferenceAxisPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadReferenceAxisPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoadReferenceAxisPointType> getLoadReferenceAxisPoint();

} // LoadReferenceAxisPointsType
