/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Hinge Moment Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceHingeMomentMapType#getControlSurfaceUID <em>Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceHingeMomentMapType#getControlParameters <em>Control Parameters</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcd <em>Dcd</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcs <em>Dcs</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcl <em>Dcl</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcmd <em>Dcmd</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcms <em>Dcms</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcml <em>Dcml</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType()
 * @model extendedMetaData="name='controlSurfaceHingeMomentMapType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceHingeMomentMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Surface UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the control surface
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Surface UID</em>' containment reference.
	 * @see #setControlSurfaceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType_ControlSurfaceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurfaceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlSurfaceUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingeMomentMapType#getControlSurfaceUID <em>Control Surface UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surface UID</em>' containment reference.
	 * @see #getControlSurfaceUID()
	 * @generated
	 */
	void setControlSurfaceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameters of the control surface
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameters</em>' containment reference.
	 * @see #setControlParameters(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType_ControlParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getControlParameters();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingeMomentMapType#getControlParameters <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameters</em>' containment reference.
	 * @see #getControlParameters()
	 * @generated
	 */
	void setControlParameters(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcd</em>' containment reference.
	 * @see #setDcd(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType_Dcd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcd' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getDcd();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcd <em>Dcd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcd</em>' containment reference.
	 * @see #getDcd()
	 * @generated
	 */
	void setDcd(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcs</em>' containment reference.
	 * @see #setDcs(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType_Dcs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getDcs();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcs <em>Dcs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcs</em>' containment reference.
	 * @see #getDcs()
	 * @generated
	 */
	void setDcs(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcl</em>' containment reference.
	 * @see #setDcl(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType_Dcl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcl' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getDcl();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcl <em>Dcl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcl</em>' containment reference.
	 * @see #getDcl()
	 * @generated
	 */
	void setDcl(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcmd</em>' containment reference.
	 * @see #setDcmd(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType_Dcmd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmd' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getDcmd();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcmd <em>Dcmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmd</em>' containment reference.
	 * @see #getDcmd()
	 * @generated
	 */
	void setDcmd(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcms</em>' containment reference.
	 * @see #setDcms(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType_Dcms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcms' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getDcms();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcms <em>Dcms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcms</em>' containment reference.
	 * @see #getDcms()
	 * @generated
	 */
	void setDcms(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcml</em>' containment reference.
	 * @see #setDcml(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingeMomentMapType_Dcml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcml' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getDcml();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingeMomentMapType#getDcml <em>Dcml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcml</em>' containment reference.
	 * @see #getDcml()
	 * @generated
	 */
	void setDcml(StringArrayBaseType value);

} // ControlSurfaceHingeMomentMapType
