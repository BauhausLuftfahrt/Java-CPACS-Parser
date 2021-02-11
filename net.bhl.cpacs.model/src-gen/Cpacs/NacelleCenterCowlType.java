/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nacelle Center Cowl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NacelleCenterCowlType#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link Cpacs.NacelleCenterCowlType#getCurveUID <em>Curve UID</em>}</li>
 *   <li>{@link Cpacs.NacelleCenterCowlType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNacelleCenterCowlType()
 * @model extendedMetaData="name='nacelleCenterCowlType' kind='elementOnly'"
 * @generated
 */
public interface NacelleCenterCowlType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>XOffset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XOffset</em>' containment reference.
	 * @see #setXOffset(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNacelleCenterCowlType_XOffset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXOffset();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleCenterCowlType#getXOffset <em>XOffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XOffset</em>' containment reference.
	 * @see #getXOffset()
	 * @generated
	 */
	void setXOffset(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Curve UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve UID</em>' containment reference.
	 * @see #setCurveUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getNacelleCenterCowlType_CurveUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='curveUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCurveUID();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleCenterCowlType#getCurveUID <em>Curve UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve UID</em>' containment reference.
	 * @see #getCurveUID()
	 * @generated
	 */
	void setCurveUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getNacelleCenterCowlType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleCenterCowlType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // NacelleCenterCowlType
