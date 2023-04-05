/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stringer Frame Position UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StringerFramePositionUIDsType#getStringerFramePositionUID <em>Stringer Frame Position UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStringerFramePositionUIDsType()
 * @model extendedMetaData="name='stringerFramePositionUIDsType' kind='elementOnly'"
 * @generated
 */
public interface StringerFramePositionUIDsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Stringer Frame Position UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * framePositionUID of the frame, where the landing gear
	 *                                 is attached to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stringer Frame Position UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getStringerFramePositionUIDsType_StringerFramePositionUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stringerFramePositionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getStringerFramePositionUID();

} // StringerFramePositionUIDsType
