/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Fuselage Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CenterFuselageAreaType#getStartFrameUID <em>Start Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageAreaType#getEndFrameUID <em>End Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageAreaType#getStartStringerUID <em>Start Stringer UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageAreaType#getEndStringerUID <em>End Stringer UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageAreaType#getCenterFuselageLowWingConfiguration <em>Center Fuselage Low Wing Configuration</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageAreaType#getCenterFuselageHighWingConfiguration <em>Center Fuselage High Wing Configuration</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageAreaType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCenterFuselageAreaType()
 * @model extendedMetaData="name='centerFuselageAreaType' kind='elementOnly'"
 * @generated
 */
public interface CenterFuselageAreaType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Start Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of first frame in rigid center fuselage
	 *                                     area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Frame UID</em>' containment reference.
	 * @see #setStartFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageAreaType_StartFrameUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageAreaType#getStartFrameUID <em>Start Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Frame UID</em>' containment reference.
	 * @see #getStartFrameUID()
	 * @generated
	 */
	void setStartFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of last frame in rigid center fuselage
	 *                                     area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Frame UID</em>' containment reference.
	 * @see #setEndFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageAreaType_EndFrameUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageAreaType#getEndFrameUID <em>End Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Frame UID</em>' containment reference.
	 * @see #getEndFrameUID()
	 * @generated
	 */
	void setEndFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of start stringer to define center
	 *                                     fuselage area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Stringer UID</em>' containment reference.
	 * @see #setStartStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageAreaType_StartStringerUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageAreaType#getStartStringerUID <em>Start Stringer UID</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * UID of end stringer to define center fuselage
	 *                                     area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Stringer UID</em>' containment reference.
	 * @see #setEndStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageAreaType_EndStringerUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageAreaType#getEndStringerUID <em>End Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Stringer UID</em>' containment reference.
	 * @see #getEndStringerUID()
	 * @generated
	 */
	void setEndStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Center Fuselage Low Wing Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Fuselage Low Wing Configuration</em>' containment reference.
	 * @see #setCenterFuselageLowWingConfiguration(CenterFuselageLowWingConfigurationType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageAreaType_CenterFuselageLowWingConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='centerFuselageLowWingConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	CenterFuselageLowWingConfigurationType getCenterFuselageLowWingConfiguration();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageAreaType#getCenterFuselageLowWingConfiguration <em>Center Fuselage Low Wing Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Fuselage Low Wing Configuration</em>' containment reference.
	 * @see #getCenterFuselageLowWingConfiguration()
	 * @generated
	 */
	void setCenterFuselageLowWingConfiguration(CenterFuselageLowWingConfigurationType value);

	/**
	 * Returns the value of the '<em><b>Center Fuselage High Wing Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Fuselage High Wing Configuration</em>' containment reference.
	 * @see #setCenterFuselageHighWingConfiguration(CenterFuselageHighWingConfigurationType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageAreaType_CenterFuselageHighWingConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='centerFuselageHighWingConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	CenterFuselageHighWingConfigurationType getCenterFuselageHighWingConfiguration();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageAreaType#getCenterFuselageHighWingConfiguration <em>Center Fuselage High Wing Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Fuselage High Wing Configuration</em>' containment reference.
	 * @see #getCenterFuselageHighWingConfiguration()
	 * @generated
	 */
	void setCenterFuselageHighWingConfiguration(CenterFuselageHighWingConfigurationType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCenterFuselageAreaType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageAreaType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CenterFuselageAreaType
