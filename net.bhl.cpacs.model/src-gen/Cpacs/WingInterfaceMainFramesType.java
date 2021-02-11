/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Interface Main Frames Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingInterfaceMainFramesType#getMainFrame1UID <em>Main Frame1 UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceMainFramesType#getMainFrame2UID <em>Main Frame2 UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceMainFramesType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingInterfaceMainFramesType()
 * @model extendedMetaData="name='wingInterfaceMainFramesType' kind='elementOnly'"
 * @generated
 */
public interface WingInterfaceMainFramesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Main Frame1 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Frame1 UID</em>' containment reference.
	 * @see #setMainFrame1UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceMainFramesType_MainFrame1UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainFrame1UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMainFrame1UID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceMainFramesType#getMainFrame1UID <em>Main Frame1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Frame1 UID</em>' containment reference.
	 * @see #getMainFrame1UID()
	 * @generated
	 */
	void setMainFrame1UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Main Frame2 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Frame2 UID</em>' containment reference.
	 * @see #setMainFrame2UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceMainFramesType_MainFrame2UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainFrame2UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMainFrame2UID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceMainFramesType#getMainFrame2UID <em>Main Frame2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Frame2 UID</em>' containment reference.
	 * @see #getMainFrame2UID()
	 * @generated
	 */
	void setMainFrame2UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingInterfaceMainFramesType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceMainFramesType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingInterfaceMainFramesType
