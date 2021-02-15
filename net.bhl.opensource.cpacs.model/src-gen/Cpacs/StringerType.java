/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stringer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StringerType#getStringerPosition <em>Stringer Position</em>}</li>
 *   <li>{@link Cpacs.StringerType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStringerType()
 * @model extendedMetaData="name='stringerType' kind='elementOnly'"
 * @generated
 */
public interface StringerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Stringer Position</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringerFramePositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringer Position</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getStringerType_StringerPosition()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='stringerPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringerFramePositionType> getStringerPosition();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getStringerType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.StringerType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StringerType
