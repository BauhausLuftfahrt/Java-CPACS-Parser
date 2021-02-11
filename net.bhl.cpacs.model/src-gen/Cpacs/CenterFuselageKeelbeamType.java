/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Fuselage Keelbeam Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getKeelWidthStringerUID <em>Keel Width Stringer UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getKeelHeightStringerUID <em>Keel Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getHFwdConLengthFrameUID <em>HFwd Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getHFwdConHeightStringerUID <em>HFwd Con Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getHRearConLengthFrameUID <em>HRear Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getHRearConHeightStringerUID <em>HRear Con Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getVFwdConLengthFrameUID <em>VFwd Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getVRearConLengthFrameUID <em>VRear Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getStartCwbConFrameUID <em>Start Cwb Con Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getEndCwbConFrameUID <em>End Cwb Con Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getHFwdReinfocementElementUID <em>HFwd Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getHRearReinfocementElementUID <em>HRear Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getVFwdReinfocementElementUID <em>VFwd Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getVRearReinfocementElementUID <em>VRear Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getCwbConReinfocementElementUID <em>Cwb Con Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageKeelbeamType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType()
 * @model extendedMetaData="name='centerFuselageKeelbeamType' kind='elementOnly'"
 * @generated
 */
public interface CenterFuselageKeelbeamType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #setSheetElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_SheetElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getSheetElementUID <em>Sheet Element UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_KeelWidthStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='keelWidthStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getKeelWidthStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getKeelWidthStringerUID <em>Keel Width Stringer UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_KeelHeightStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='keelHeightStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getKeelHeightStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getKeelHeightStringerUID <em>Keel Height Stringer UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_HFwdConLengthFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hFwdConLengthFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHFwdConLengthFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getHFwdConLengthFrameUID <em>HFwd Con Length Frame UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_HFwdConHeightStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hFwdConHeightStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHFwdConHeightStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getHFwdConHeightStringerUID <em>HFwd Con Height Stringer UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_HRearConLengthFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hRearConLengthFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHRearConLengthFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getHRearConLengthFrameUID <em>HRear Con Length Frame UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_HRearConHeightStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hRearConHeightStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHRearConHeightStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getHRearConHeightStringerUID <em>HRear Con Height Stringer UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_VFwdConLengthFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vFwdConLengthFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVFwdConLengthFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getVFwdConLengthFrameUID <em>VFwd Con Length Frame UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_VRearConLengthFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vRearConLengthFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVRearConLengthFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getVRearConLengthFrameUID <em>VRear Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRear Con Length Frame UID</em>' containment reference.
	 * @see #getVRearConLengthFrameUID()
	 * @generated
	 */
	void setVRearConLengthFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Cwb Con Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Cwb Con Frame UID</em>' containment reference.
	 * @see #setStartCwbConFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_StartCwbConFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startCwbConFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartCwbConFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getStartCwbConFrameUID <em>Start Cwb Con Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Cwb Con Frame UID</em>' containment reference.
	 * @see #getStartCwbConFrameUID()
	 * @generated
	 */
	void setStartCwbConFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Cwb Con Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Cwb Con Frame UID</em>' containment reference.
	 * @see #setEndCwbConFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_EndCwbConFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endCwbConFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndCwbConFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getEndCwbConFrameUID <em>End Cwb Con Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Cwb Con Frame UID</em>' containment reference.
	 * @see #getEndCwbConFrameUID()
	 * @generated
	 */
	void setEndCwbConFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>HFwd Reinfocement Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HFwd Reinfocement Element UID</em>' containment reference.
	 * @see #setHFwdReinfocementElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_HFwdReinfocementElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hFwdReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHFwdReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getHFwdReinfocementElementUID <em>HFwd Reinfocement Element UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_HRearReinfocementElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hRearReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHRearReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getHRearReinfocementElementUID <em>HRear Reinfocement Element UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_VFwdReinfocementElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vFwdReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVFwdReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getVFwdReinfocementElementUID <em>VFwd Reinfocement Element UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_VRearReinfocementElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vRearReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVRearReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getVRearReinfocementElementUID <em>VRear Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRear Reinfocement Element UID</em>' containment reference.
	 * @see #getVRearReinfocementElementUID()
	 * @generated
	 */
	void setVRearReinfocementElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Cwb Con Reinfocement Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwb Con Reinfocement Element UID</em>' containment reference.
	 * @see #setCwbConReinfocementElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_CwbConReinfocementElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cwbConReinfocementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCwbConReinfocementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getCwbConReinfocementElementUID <em>Cwb Con Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cwb Con Reinfocement Element UID</em>' containment reference.
	 * @see #getCwbConReinfocementElementUID()
	 * @generated
	 */
	void setCwbConReinfocementElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCenterFuselageKeelbeamType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageKeelbeamType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CenterFuselageKeelbeamType
