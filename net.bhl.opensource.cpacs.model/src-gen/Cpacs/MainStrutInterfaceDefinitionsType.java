/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Strut Interface Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MainStrutInterfaceDefinitionsType#getMainStrutWingUID <em>Main Strut Wing UID</em>}</li>
 *   <li>{@link Cpacs.MainStrutInterfaceDefinitionsType#getMainStrutWingFuselageAttachment <em>Main Strut Wing Fuselage Attachment</em>}</li>
 *   <li>{@link Cpacs.MainStrutInterfaceDefinitionsType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMainStrutInterfaceDefinitionsType()
 * @model extendedMetaData="name='mainStrutInterfaceDefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface MainStrutInterfaceDefinitionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Main Strut Wing UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Strut Wing UID</em>' containment reference.
	 * @see #setMainStrutWingUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMainStrutInterfaceDefinitionsType_MainStrutWingUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainStrutWingUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMainStrutWingUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainStrutInterfaceDefinitionsType#getMainStrutWingUID <em>Main Strut Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Strut Wing UID</em>' containment reference.
	 * @see #getMainStrutWingUID()
	 * @generated
	 */
	void setMainStrutWingUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Main Strut Wing Fuselage Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MainStrutWingFuselageAttachmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Strut Wing Fuselage Attachment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMainStrutInterfaceDefinitionsType_MainStrutWingFuselageAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainStrutWingFuselageAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MainStrutWingFuselageAttachmentType> getMainStrutWingFuselageAttachment();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getMainStrutInterfaceDefinitionsType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainStrutInterfaceDefinitionsType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // MainStrutInterfaceDefinitionsType
