/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FrameType#getFramePosition <em>Frame Position</em>}</li>
 *   <li>{@link Cpacs.FrameType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFrameType()
 * @model extendedMetaData="name='frameType' kind='elementOnly'"
 * @generated
 */
public interface FrameType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Frame Position</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringerFramePositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Position</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFrameType_FramePosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='framePosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringerFramePositionType> getFramePosition();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFrameType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FrameType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FrameType
