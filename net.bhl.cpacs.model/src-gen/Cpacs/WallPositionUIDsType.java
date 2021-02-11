/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall Position UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WallPositionUIDsType#getWallPositionUID <em>Wall Position UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWallPositionUIDsType()
 * @model extendedMetaData="name='wallPositionUIDsType' kind='elementOnly'"
 * @generated
 */
public interface WallPositionUIDsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Wall Position UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Reference to wall position uID.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wall Position UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWallPositionUIDsType_WallPositionUID()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='wallPositionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getWallPositionUID();

} // WallPositionUIDsType
