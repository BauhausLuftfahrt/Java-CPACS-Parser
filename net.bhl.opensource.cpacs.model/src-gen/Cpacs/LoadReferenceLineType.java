/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Reference Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadReferenceLineType#getLoadReferencePoint <em>Load Reference Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadReferenceLineType()
 * @model extendedMetaData="name='loadReferenceLineType' kind='elementOnly'"
 * @generated
 */
public interface LoadReferenceLineType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Reference Point</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LoadReferencePointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Reference Point</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadReferenceLineType_LoadReferencePoint()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='loadReferencePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoadReferencePointType> getLoadReferencePoint();

} // LoadReferenceLineType
