/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Fuselage Sidebox Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CenterFuselageSideboxType#getSideboxWidthFactor <em>Sidebox Width Factor</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageSideboxType#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageSideboxType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCenterFuselageSideboxType()
 * @model extendedMetaData="name='centerFuselageSideboxType' kind='elementOnly'"
 * @generated
 */
public interface CenterFuselageSideboxType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sidebox Width Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sidebox Width Factor</em>' containment reference.
	 * @see #setSideboxWidthFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageSideboxType_SideboxWidthFactor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sideboxWidthFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSideboxWidthFactor();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageSideboxType#getSideboxWidthFactor <em>Sidebox Width Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sidebox Width Factor</em>' containment reference.
	 * @see #getSideboxWidthFactor()
	 * @generated
	 */
	void setSideboxWidthFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #setSheetElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageSideboxType_SheetElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageSideboxType#getSheetElementUID <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #getSheetElementUID()
	 * @generated
	 */
	void setSheetElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCenterFuselageSideboxType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageSideboxType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CenterFuselageSideboxType
