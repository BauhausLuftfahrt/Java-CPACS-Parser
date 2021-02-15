/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Interface Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingInterfaceDefinitionsType#getCutoutReinfStructElemUID <em>Cutout Reinf Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceDefinitionsType#getWingInterfaceMainFrames <em>Wing Interface Main Frames</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceDefinitionsType#getStartStringerUID <em>Start Stringer UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceDefinitionsType#getEndStringerUID <em>End Stringer UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceDefinitionsType#getWingInterfaceSupportStruts <em>Wing Interface Support Struts</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceDefinitionsType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingInterfaceDefinitionsType()
 * @model extendedMetaData="name='wingInterfaceDefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface WingInterfaceDefinitionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cutout Reinf Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cutout Reinf Struct Elem UID</em>' containment reference.
	 * @see #setCutoutReinfStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceDefinitionsType_CutoutReinfStructElemUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutoutReinfStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCutoutReinfStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceDefinitionsType#getCutoutReinfStructElemUID <em>Cutout Reinf Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cutout Reinf Struct Elem UID</em>' containment reference.
	 * @see #getCutoutReinfStructElemUID()
	 * @generated
	 */
	void setCutoutReinfStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Wing Interface Main Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Interface Main Frames</em>' containment reference.
	 * @see #setWingInterfaceMainFrames(WingInterfaceMainFramesType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceDefinitionsType_WingInterfaceMainFrames()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingInterfaceMainFrames' namespace='##targetNamespace'"
	 * @generated
	 */
	WingInterfaceMainFramesType getWingInterfaceMainFrames();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceDefinitionsType#getWingInterfaceMainFrames <em>Wing Interface Main Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Interface Main Frames</em>' containment reference.
	 * @see #getWingInterfaceMainFrames()
	 * @generated
	 */
	void setWingInterfaceMainFrames(WingInterfaceMainFramesType value);

	/**
	 * Returns the value of the '<em><b>Start Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Stringer UID</em>' containment reference.
	 * @see #setStartStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceDefinitionsType_StartStringerUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceDefinitionsType#getStartStringerUID <em>Start Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Stringer UID</em>' containment reference.
	 * @see #getStartStringerUID()
	 * @generated
	 */
	void setStartStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Stringer UID</em>' containment reference.
	 * @see #setEndStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceDefinitionsType_EndStringerUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceDefinitionsType#getEndStringerUID <em>End Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Stringer UID</em>' containment reference.
	 * @see #getEndStringerUID()
	 * @generated
	 */
	void setEndStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Wing Interface Support Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Interface Support Struts</em>' containment reference.
	 * @see #setWingInterfaceSupportStruts(WingInterfaceSupportStrutsAssemblyType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceDefinitionsType_WingInterfaceSupportStruts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingInterfaceSupportStruts' namespace='##targetNamespace'"
	 * @generated
	 */
	WingInterfaceSupportStrutsAssemblyType getWingInterfaceSupportStruts();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceDefinitionsType#getWingInterfaceSupportStruts <em>Wing Interface Support Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Interface Support Struts</em>' containment reference.
	 * @see #getWingInterfaceSupportStruts()
	 * @generated
	 */
	void setWingInterfaceSupportStruts(WingInterfaceSupportStrutsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingInterfaceDefinitionsType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceDefinitionsType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingInterfaceDefinitionsType
