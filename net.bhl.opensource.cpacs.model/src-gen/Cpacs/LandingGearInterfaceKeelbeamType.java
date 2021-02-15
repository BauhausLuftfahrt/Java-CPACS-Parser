/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Interface Keelbeam Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getKeelWidthStringerUID <em>Keel Width Stringer UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getKeelHeightStringerUID <em>Keel Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getHFwdConLengthFrameUID <em>HFwd Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getHFwdConHeightStringerUID <em>HFwd Con Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getHRearConLengthFrameUID <em>HRear Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getHRearConHeightStringerUID <em>HRear Con Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getVFwdConLengthFrameUID <em>VFwd Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getVRearConLengthFrameUID <em>VRear Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getHFwdReinfocementElementUID <em>HFwd Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getHRearReinfocementElementUID <em>HRear Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getVFwdReinfocementElementUID <em>VFwd Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getVRearReinfocementElementUID <em>VRear Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceKeelbeamType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType()
 * @model extendedMetaData="name='landingGearInterfaceKeelbeamType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearInterfaceKeelbeamType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #setSheetElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_SheetElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getSheetElementUID <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #getSheetElementUID()
	 * @generated
	 */
	void setSheetElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Keel Width Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keel Width Stringer UID</em>' containment reference.
	 * @see #setKeelWidthStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_KeelWidthStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='keelWidthStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getKeelWidthStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getKeelWidthStringerUID <em>Keel Width Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keel Width Stringer UID</em>' containment reference.
	 * @see #getKeelWidthStringerUID()
	 * @generated
	 */
	void setKeelWidthStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Keel Height Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keel Height Stringer UID</em>' containment reference.
	 * @see #setKeelHeightStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_KeelHeightStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='keelHeightStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getKeelHeightStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getKeelHeightStringerUID <em>Keel Height Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keel Height Stringer UID</em>' containment reference.
	 * @see #getKeelHeightStringerUID()
	 * @generated
	 */
	void setKeelHeightStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>HFwd Con Length Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HFwd Con Length Frame UID</em>' containment reference.
	 * @see #setHFwdConLengthFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_HFwdConLengthFrameUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hFwdConLengthFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHFwdConLengthFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getHFwdConLengthFrameUID <em>HFwd Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HFwd Con Length Frame UID</em>' containment reference.
	 * @see #getHFwdConLengthFrameUID()
	 * @generated
	 */
	void setHFwdConLengthFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>HFwd Con Height Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HFwd Con Height Stringer UID</em>' containment reference.
	 * @see #setHFwdConHeightStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_HFwdConHeightStringerUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hFwdConHeightStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHFwdConHeightStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getHFwdConHeightStringerUID <em>HFwd Con Height Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HFwd Con Height Stringer UID</em>' containment reference.
	 * @see #getHFwdConHeightStringerUID()
	 * @generated
	 */
	void setHFwdConHeightStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>HRear Con Length Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRear Con Length Frame UID</em>' containment reference.
	 * @see #setHRearConLengthFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_HRearConLengthFrameUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hRearConLengthFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHRearConLengthFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getHRearConLengthFrameUID <em>HRear Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HRear Con Length Frame UID</em>' containment reference.
	 * @see #getHRearConLengthFrameUID()
	 * @generated
	 */
	void setHRearConLengthFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>HRear Con Height Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRear Con Height Stringer UID</em>' containment reference.
	 * @see #setHRearConHeightStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_HRearConHeightStringerUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hRearConHeightStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHRearConHeightStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getHRearConHeightStringerUID <em>HRear Con Height Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HRear Con Height Stringer UID</em>' containment reference.
	 * @see #getHRearConHeightStringerUID()
	 * @generated
	 */
	void setHRearConHeightStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>VFwd Con Length Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VFwd Con Length Frame UID</em>' containment reference.
	 * @see #setVFwdConLengthFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_VFwdConLengthFrameUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vFwdConLengthFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVFwdConLengthFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getVFwdConLengthFrameUID <em>VFwd Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VFwd Con Length Frame UID</em>' containment reference.
	 * @see #getVFwdConLengthFrameUID()
	 * @generated
	 */
	void setVFwdConLengthFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>VRear Con Length Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VRear Con Length Frame UID</em>' containment reference.
	 * @see #setVRearConLengthFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_VRearConLengthFrameUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vRearConLengthFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVRearConLengthFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getVRearConLengthFrameUID <em>VRear Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRear Con Length Frame UID</em>' containment reference.
	 * @see #getVRearConLengthFrameUID()
	 * @generated
	 */
	void setVRearConLengthFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>HFwd Reinfocement Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HFwd Reinfocement Element UID</em>' containment reference.
	 * @see #setHFwdReinfocementElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_HFwdReinfocementElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hFwdReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHFwdReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getHFwdReinfocementElementUID <em>HFwd Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HFwd Reinfocement Element UID</em>' containment reference.
	 * @see #getHFwdReinfocementElementUID()
	 * @generated
	 */
	void setHFwdReinfocementElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>HRear Reinfocement Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRear Reinfocement Element UID</em>' containment reference.
	 * @see #setHRearReinfocementElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_HRearReinfocementElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hRearReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHRearReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getHRearReinfocementElementUID <em>HRear Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HRear Reinfocement Element UID</em>' containment reference.
	 * @see #getHRearReinfocementElementUID()
	 * @generated
	 */
	void setHRearReinfocementElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>VFwd Reinfocement Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VFwd Reinfocement Element UID</em>' containment reference.
	 * @see #setVFwdReinfocementElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_VFwdReinfocementElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vFwdReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVFwdReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getVFwdReinfocementElementUID <em>VFwd Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VFwd Reinfocement Element UID</em>' containment reference.
	 * @see #getVFwdReinfocementElementUID()
	 * @generated
	 */
	void setVFwdReinfocementElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>VRear Reinfocement Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VRear Reinfocement Element UID</em>' containment reference.
	 * @see #setVRearReinfocementElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_VRearReinfocementElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vRearReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVRearReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getVRearReinfocementElementUID <em>VRear Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRear Reinfocement Element UID</em>' containment reference.
	 * @see #getVRearReinfocementElementUID()
	 * @generated
	 */
	void setVRearReinfocementElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceKeelbeamType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceKeelbeamType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LandingGearInterfaceKeelbeamType
