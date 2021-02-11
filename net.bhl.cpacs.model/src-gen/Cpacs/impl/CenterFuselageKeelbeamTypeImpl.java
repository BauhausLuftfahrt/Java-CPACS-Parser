/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselageKeelbeamType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Fuselage Keelbeam Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getKeelWidthStringerUID <em>Keel Width Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getKeelHeightStringerUID <em>Keel Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getHFwdConLengthFrameUID <em>HFwd Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getHFwdConHeightStringerUID <em>HFwd Con Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getHRearConLengthFrameUID <em>HRear Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getHRearConHeightStringerUID <em>HRear Con Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getVFwdConLengthFrameUID <em>VFwd Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getVRearConLengthFrameUID <em>VRear Con Length Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getStartCwbConFrameUID <em>Start Cwb Con Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getEndCwbConFrameUID <em>End Cwb Con Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getHFwdReinfocementElementUID <em>HFwd Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getHRearReinfocementElementUID <em>HRear Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getVFwdReinfocementElementUID <em>VFwd Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getVRearReinfocementElementUID <em>VRear Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getCwbConReinfocementElementUID <em>Cwb Con Reinfocement Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageKeelbeamTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselageKeelbeamTypeImpl extends ComplexBaseTypeImpl implements CenterFuselageKeelbeamType {
	/**
	 * The cached value of the '{@link #getSheetElementUID() <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sheetElementUID;

	/**
	 * The cached value of the '{@link #getKeelWidthStringerUID() <em>Keel Width Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeelWidthStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType keelWidthStringerUID;

	/**
	 * The cached value of the '{@link #getKeelHeightStringerUID() <em>Keel Height Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeelHeightStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType keelHeightStringerUID;

	/**
	 * The cached value of the '{@link #getHFwdConLengthFrameUID() <em>HFwd Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHFwdConLengthFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType hFwdConLengthFrameUID;

	/**
	 * The cached value of the '{@link #getHFwdConHeightStringerUID() <em>HFwd Con Height Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHFwdConHeightStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType hFwdConHeightStringerUID;

	/**
	 * The cached value of the '{@link #getHRearConLengthFrameUID() <em>HRear Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRearConLengthFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType hRearConLengthFrameUID;

	/**
	 * The cached value of the '{@link #getHRearConHeightStringerUID() <em>HRear Con Height Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRearConHeightStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType hRearConHeightStringerUID;

	/**
	 * The cached value of the '{@link #getVFwdConLengthFrameUID() <em>VFwd Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVFwdConLengthFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vFwdConLengthFrameUID;

	/**
	 * The cached value of the '{@link #getVRearConLengthFrameUID() <em>VRear Con Length Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRearConLengthFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vRearConLengthFrameUID;

	/**
	 * The cached value of the '{@link #getStartCwbConFrameUID() <em>Start Cwb Con Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCwbConFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startCwbConFrameUID;

	/**
	 * The cached value of the '{@link #getEndCwbConFrameUID() <em>End Cwb Con Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCwbConFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endCwbConFrameUID;

	/**
	 * The cached value of the '{@link #getHFwdReinfocementElementUID() <em>HFwd Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHFwdReinfocementElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType hFwdReinfocementElementUID;

	/**
	 * The cached value of the '{@link #getHRearReinfocementElementUID() <em>HRear Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRearReinfocementElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType hRearReinfocementElementUID;

	/**
	 * The cached value of the '{@link #getVFwdReinfocementElementUID() <em>VFwd Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVFwdReinfocementElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vFwdReinfocementElementUID;

	/**
	 * The cached value of the '{@link #getVRearReinfocementElementUID() <em>VRear Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRearReinfocementElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vRearReinfocementElementUID;

	/**
	 * The cached value of the '{@link #getCwbConReinfocementElementUID() <em>Cwb Con Reinfocement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCwbConReinfocementElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType cwbConReinfocementElementUID;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CenterFuselageKeelbeamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselageKeelbeamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSheetElementUID() {
		return sheetElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetElementUID(StringUIDBaseType newSheetElementUID, NotificationChain msgs) {
		StringUIDBaseType oldSheetElementUID = sheetElementUID;
		sheetElementUID = newSheetElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID, oldSheetElementUID,
					newSheetElementUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSheetElementUID(StringUIDBaseType newSheetElementUID) {
		if (newSheetElementUID != sheetElementUID) {
			NotificationChain msgs = null;
			if (sheetElementUID != null)
				msgs = ((InternalEObject) sheetElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID, null,
						msgs);
			if (newSheetElementUID != null)
				msgs = ((InternalEObject) newSheetElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID, null,
						msgs);
			msgs = basicSetSheetElementUID(newSheetElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID, newSheetElementUID,
					newSheetElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getKeelWidthStringerUID() {
		return keelWidthStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeelWidthStringerUID(StringUIDBaseType newKeelWidthStringerUID,
			NotificationChain msgs) {
		StringUIDBaseType oldKeelWidthStringerUID = keelWidthStringerUID;
		keelWidthStringerUID = newKeelWidthStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID, oldKeelWidthStringerUID,
					newKeelWidthStringerUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeelWidthStringerUID(StringUIDBaseType newKeelWidthStringerUID) {
		if (newKeelWidthStringerUID != keelWidthStringerUID) {
			NotificationChain msgs = null;
			if (keelWidthStringerUID != null)
				msgs = ((InternalEObject) keelWidthStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID,
						null, msgs);
			if (newKeelWidthStringerUID != null)
				msgs = ((InternalEObject) newKeelWidthStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID,
						null, msgs);
			msgs = basicSetKeelWidthStringerUID(newKeelWidthStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID, newKeelWidthStringerUID,
					newKeelWidthStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getKeelHeightStringerUID() {
		return keelHeightStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeelHeightStringerUID(StringUIDBaseType newKeelHeightStringerUID,
			NotificationChain msgs) {
		StringUIDBaseType oldKeelHeightStringerUID = keelHeightStringerUID;
		keelHeightStringerUID = newKeelHeightStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID, oldKeelHeightStringerUID,
					newKeelHeightStringerUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeelHeightStringerUID(StringUIDBaseType newKeelHeightStringerUID) {
		if (newKeelHeightStringerUID != keelHeightStringerUID) {
			NotificationChain msgs = null;
			if (keelHeightStringerUID != null)
				msgs = ((InternalEObject) keelHeightStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID,
						null, msgs);
			if (newKeelHeightStringerUID != null)
				msgs = ((InternalEObject) newKeelHeightStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID,
						null, msgs);
			msgs = basicSetKeelHeightStringerUID(newKeelHeightStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID, newKeelHeightStringerUID,
					newKeelHeightStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHFwdConLengthFrameUID() {
		return hFwdConLengthFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHFwdConLengthFrameUID(StringUIDBaseType newHFwdConLengthFrameUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHFwdConLengthFrameUID = hFwdConLengthFrameUID;
		hFwdConLengthFrameUID = newHFwdConLengthFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID, oldHFwdConLengthFrameUID,
					newHFwdConLengthFrameUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHFwdConLengthFrameUID(StringUIDBaseType newHFwdConLengthFrameUID) {
		if (newHFwdConLengthFrameUID != hFwdConLengthFrameUID) {
			NotificationChain msgs = null;
			if (hFwdConLengthFrameUID != null)
				msgs = ((InternalEObject) hFwdConLengthFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID,
						null, msgs);
			if (newHFwdConLengthFrameUID != null)
				msgs = ((InternalEObject) newHFwdConLengthFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID,
						null, msgs);
			msgs = basicSetHFwdConLengthFrameUID(newHFwdConLengthFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID, newHFwdConLengthFrameUID,
					newHFwdConLengthFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHFwdConHeightStringerUID() {
		return hFwdConHeightStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHFwdConHeightStringerUID(StringUIDBaseType newHFwdConHeightStringerUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHFwdConHeightStringerUID = hFwdConHeightStringerUID;
		hFwdConHeightStringerUID = newHFwdConHeightStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID,
					oldHFwdConHeightStringerUID, newHFwdConHeightStringerUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHFwdConHeightStringerUID(StringUIDBaseType newHFwdConHeightStringerUID) {
		if (newHFwdConHeightStringerUID != hFwdConHeightStringerUID) {
			NotificationChain msgs = null;
			if (hFwdConHeightStringerUID != null)
				msgs = ((InternalEObject) hFwdConHeightStringerUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID, null, msgs);
			if (newHFwdConHeightStringerUID != null)
				msgs = ((InternalEObject) newHFwdConHeightStringerUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID, null, msgs);
			msgs = basicSetHFwdConHeightStringerUID(newHFwdConHeightStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID,
					newHFwdConHeightStringerUID, newHFwdConHeightStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHRearConLengthFrameUID() {
		return hRearConLengthFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHRearConLengthFrameUID(StringUIDBaseType newHRearConLengthFrameUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHRearConLengthFrameUID = hRearConLengthFrameUID;
		hRearConLengthFrameUID = newHRearConLengthFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID, oldHRearConLengthFrameUID,
					newHRearConLengthFrameUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHRearConLengthFrameUID(StringUIDBaseType newHRearConLengthFrameUID) {
		if (newHRearConLengthFrameUID != hRearConLengthFrameUID) {
			NotificationChain msgs = null;
			if (hRearConLengthFrameUID != null)
				msgs = ((InternalEObject) hRearConLengthFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID,
						null, msgs);
			if (newHRearConLengthFrameUID != null)
				msgs = ((InternalEObject) newHRearConLengthFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID,
						null, msgs);
			msgs = basicSetHRearConLengthFrameUID(newHRearConLengthFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID, newHRearConLengthFrameUID,
					newHRearConLengthFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHRearConHeightStringerUID() {
		return hRearConHeightStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHRearConHeightStringerUID(StringUIDBaseType newHRearConHeightStringerUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHRearConHeightStringerUID = hRearConHeightStringerUID;
		hRearConHeightStringerUID = newHRearConHeightStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID,
					oldHRearConHeightStringerUID, newHRearConHeightStringerUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHRearConHeightStringerUID(StringUIDBaseType newHRearConHeightStringerUID) {
		if (newHRearConHeightStringerUID != hRearConHeightStringerUID) {
			NotificationChain msgs = null;
			if (hRearConHeightStringerUID != null)
				msgs = ((InternalEObject) hRearConHeightStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID,
						null, msgs);
			if (newHRearConHeightStringerUID != null)
				msgs = ((InternalEObject) newHRearConHeightStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID,
						null, msgs);
			msgs = basicSetHRearConHeightStringerUID(newHRearConHeightStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID,
					newHRearConHeightStringerUID, newHRearConHeightStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVFwdConLengthFrameUID() {
		return vFwdConLengthFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVFwdConLengthFrameUID(StringUIDBaseType newVFwdConLengthFrameUID,
			NotificationChain msgs) {
		StringUIDBaseType oldVFwdConLengthFrameUID = vFwdConLengthFrameUID;
		vFwdConLengthFrameUID = newVFwdConLengthFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID, oldVFwdConLengthFrameUID,
					newVFwdConLengthFrameUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVFwdConLengthFrameUID(StringUIDBaseType newVFwdConLengthFrameUID) {
		if (newVFwdConLengthFrameUID != vFwdConLengthFrameUID) {
			NotificationChain msgs = null;
			if (vFwdConLengthFrameUID != null)
				msgs = ((InternalEObject) vFwdConLengthFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID,
						null, msgs);
			if (newVFwdConLengthFrameUID != null)
				msgs = ((InternalEObject) newVFwdConLengthFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID,
						null, msgs);
			msgs = basicSetVFwdConLengthFrameUID(newVFwdConLengthFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID, newVFwdConLengthFrameUID,
					newVFwdConLengthFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVRearConLengthFrameUID() {
		return vRearConLengthFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVRearConLengthFrameUID(StringUIDBaseType newVRearConLengthFrameUID,
			NotificationChain msgs) {
		StringUIDBaseType oldVRearConLengthFrameUID = vRearConLengthFrameUID;
		vRearConLengthFrameUID = newVRearConLengthFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID, oldVRearConLengthFrameUID,
					newVRearConLengthFrameUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVRearConLengthFrameUID(StringUIDBaseType newVRearConLengthFrameUID) {
		if (newVRearConLengthFrameUID != vRearConLengthFrameUID) {
			NotificationChain msgs = null;
			if (vRearConLengthFrameUID != null)
				msgs = ((InternalEObject) vRearConLengthFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID,
						null, msgs);
			if (newVRearConLengthFrameUID != null)
				msgs = ((InternalEObject) newVRearConLengthFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID,
						null, msgs);
			msgs = basicSetVRearConLengthFrameUID(newVRearConLengthFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID, newVRearConLengthFrameUID,
					newVRearConLengthFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartCwbConFrameUID() {
		return startCwbConFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartCwbConFrameUID(StringUIDBaseType newStartCwbConFrameUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStartCwbConFrameUID = startCwbConFrameUID;
		startCwbConFrameUID = newStartCwbConFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID, oldStartCwbConFrameUID,
					newStartCwbConFrameUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartCwbConFrameUID(StringUIDBaseType newStartCwbConFrameUID) {
		if (newStartCwbConFrameUID != startCwbConFrameUID) {
			NotificationChain msgs = null;
			if (startCwbConFrameUID != null)
				msgs = ((InternalEObject) startCwbConFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID,
						null, msgs);
			if (newStartCwbConFrameUID != null)
				msgs = ((InternalEObject) newStartCwbConFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID,
						null, msgs);
			msgs = basicSetStartCwbConFrameUID(newStartCwbConFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID, newStartCwbConFrameUID,
					newStartCwbConFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndCwbConFrameUID() {
		return endCwbConFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndCwbConFrameUID(StringUIDBaseType newEndCwbConFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldEndCwbConFrameUID = endCwbConFrameUID;
		endCwbConFrameUID = newEndCwbConFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID, oldEndCwbConFrameUID,
					newEndCwbConFrameUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndCwbConFrameUID(StringUIDBaseType newEndCwbConFrameUID) {
		if (newEndCwbConFrameUID != endCwbConFrameUID) {
			NotificationChain msgs = null;
			if (endCwbConFrameUID != null)
				msgs = ((InternalEObject) endCwbConFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID,
						null, msgs);
			if (newEndCwbConFrameUID != null)
				msgs = ((InternalEObject) newEndCwbConFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID,
						null, msgs);
			msgs = basicSetEndCwbConFrameUID(newEndCwbConFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID, newEndCwbConFrameUID,
					newEndCwbConFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHFwdReinfocementElementUID() {
		return hFwdReinfocementElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHFwdReinfocementElementUID(StringUIDBaseType newHFwdReinfocementElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHFwdReinfocementElementUID = hFwdReinfocementElementUID;
		hFwdReinfocementElementUID = newHFwdReinfocementElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID,
					oldHFwdReinfocementElementUID, newHFwdReinfocementElementUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHFwdReinfocementElementUID(StringUIDBaseType newHFwdReinfocementElementUID) {
		if (newHFwdReinfocementElementUID != hFwdReinfocementElementUID) {
			NotificationChain msgs = null;
			if (hFwdReinfocementElementUID != null)
				msgs = ((InternalEObject) hFwdReinfocementElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			if (newHFwdReinfocementElementUID != null)
				msgs = ((InternalEObject) newHFwdReinfocementElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			msgs = basicSetHFwdReinfocementElementUID(newHFwdReinfocementElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID,
					newHFwdReinfocementElementUID, newHFwdReinfocementElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHRearReinfocementElementUID() {
		return hRearReinfocementElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHRearReinfocementElementUID(StringUIDBaseType newHRearReinfocementElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHRearReinfocementElementUID = hRearReinfocementElementUID;
		hRearReinfocementElementUID = newHRearReinfocementElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID,
					oldHRearReinfocementElementUID, newHRearReinfocementElementUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHRearReinfocementElementUID(StringUIDBaseType newHRearReinfocementElementUID) {
		if (newHRearReinfocementElementUID != hRearReinfocementElementUID) {
			NotificationChain msgs = null;
			if (hRearReinfocementElementUID != null)
				msgs = ((InternalEObject) hRearReinfocementElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			if (newHRearReinfocementElementUID != null)
				msgs = ((InternalEObject) newHRearReinfocementElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			msgs = basicSetHRearReinfocementElementUID(newHRearReinfocementElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID,
					newHRearReinfocementElementUID, newHRearReinfocementElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVFwdReinfocementElementUID() {
		return vFwdReinfocementElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVFwdReinfocementElementUID(StringUIDBaseType newVFwdReinfocementElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldVFwdReinfocementElementUID = vFwdReinfocementElementUID;
		vFwdReinfocementElementUID = newVFwdReinfocementElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID,
					oldVFwdReinfocementElementUID, newVFwdReinfocementElementUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVFwdReinfocementElementUID(StringUIDBaseType newVFwdReinfocementElementUID) {
		if (newVFwdReinfocementElementUID != vFwdReinfocementElementUID) {
			NotificationChain msgs = null;
			if (vFwdReinfocementElementUID != null)
				msgs = ((InternalEObject) vFwdReinfocementElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			if (newVFwdReinfocementElementUID != null)
				msgs = ((InternalEObject) newVFwdReinfocementElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			msgs = basicSetVFwdReinfocementElementUID(newVFwdReinfocementElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID,
					newVFwdReinfocementElementUID, newVFwdReinfocementElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVRearReinfocementElementUID() {
		return vRearReinfocementElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVRearReinfocementElementUID(StringUIDBaseType newVRearReinfocementElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldVRearReinfocementElementUID = vRearReinfocementElementUID;
		vRearReinfocementElementUID = newVRearReinfocementElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID,
					oldVRearReinfocementElementUID, newVRearReinfocementElementUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVRearReinfocementElementUID(StringUIDBaseType newVRearReinfocementElementUID) {
		if (newVRearReinfocementElementUID != vRearReinfocementElementUID) {
			NotificationChain msgs = null;
			if (vRearReinfocementElementUID != null)
				msgs = ((InternalEObject) vRearReinfocementElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			if (newVRearReinfocementElementUID != null)
				msgs = ((InternalEObject) newVRearReinfocementElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			msgs = basicSetVRearReinfocementElementUID(newVRearReinfocementElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID,
					newVRearReinfocementElementUID, newVRearReinfocementElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCwbConReinfocementElementUID() {
		return cwbConReinfocementElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCwbConReinfocementElementUID(StringUIDBaseType newCwbConReinfocementElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldCwbConReinfocementElementUID = cwbConReinfocementElementUID;
		cwbConReinfocementElementUID = newCwbConReinfocementElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID,
					oldCwbConReinfocementElementUID, newCwbConReinfocementElementUID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCwbConReinfocementElementUID(StringUIDBaseType newCwbConReinfocementElementUID) {
		if (newCwbConReinfocementElementUID != cwbConReinfocementElementUID) {
			NotificationChain msgs = null;
			if (cwbConReinfocementElementUID != null)
				msgs = ((InternalEObject) cwbConReinfocementElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			if (newCwbConReinfocementElementUID != null)
				msgs = ((InternalEObject) newCwbConReinfocementElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID,
						null, msgs);
			msgs = basicSetCwbConReinfocementElementUID(newCwbConReinfocementElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID,
					newCwbConReinfocementElementUID, newCwbConReinfocementElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID:
			return basicSetSheetElementUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID:
			return basicSetKeelWidthStringerUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID:
			return basicSetKeelHeightStringerUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID:
			return basicSetHFwdConLengthFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID:
			return basicSetHFwdConHeightStringerUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID:
			return basicSetHRearConLengthFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID:
			return basicSetHRearConHeightStringerUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID:
			return basicSetVFwdConLengthFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID:
			return basicSetVRearConLengthFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID:
			return basicSetStartCwbConFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID:
			return basicSetEndCwbConFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID:
			return basicSetHFwdReinfocementElementUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID:
			return basicSetHRearReinfocementElementUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID:
			return basicSetVFwdReinfocementElementUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID:
			return basicSetVRearReinfocementElementUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID:
			return basicSetCwbConReinfocementElementUID(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID:
			return getSheetElementUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID:
			return getKeelWidthStringerUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID:
			return getKeelHeightStringerUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID:
			return getHFwdConLengthFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID:
			return getHFwdConHeightStringerUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID:
			return getHRearConLengthFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID:
			return getHRearConHeightStringerUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID:
			return getVFwdConLengthFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID:
			return getVRearConLengthFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID:
			return getStartCwbConFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID:
			return getEndCwbConFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID:
			return getHFwdReinfocementElementUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID:
			return getHRearReinfocementElementUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID:
			return getVFwdReinfocementElementUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID:
			return getVRearReinfocementElementUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID:
			return getCwbConReinfocementElementUID();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__UID:
			return getUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID:
			setKeelWidthStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID:
			setKeelHeightStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID:
			setHFwdConLengthFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID:
			setHFwdConHeightStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID:
			setHRearConLengthFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID:
			setHRearConHeightStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID:
			setVFwdConLengthFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID:
			setVRearConLengthFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID:
			setStartCwbConFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID:
			setEndCwbConFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID:
			setHFwdReinfocementElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID:
			setHRearReinfocementElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID:
			setVFwdReinfocementElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID:
			setVRearReinfocementElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID:
			setCwbConReinfocementElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__UID:
			setUID((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID:
			setKeelWidthStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID:
			setKeelHeightStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID:
			setHFwdConLengthFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID:
			setHFwdConHeightStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID:
			setHRearConLengthFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID:
			setHRearConHeightStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID:
			setVFwdConLengthFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID:
			setVRearConLengthFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID:
			setStartCwbConFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID:
			setEndCwbConFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID:
			setHFwdReinfocementElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID:
			setHRearReinfocementElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID:
			setVFwdReinfocementElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID:
			setVRearReinfocementElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID:
			setCwbConReinfocementElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__UID:
			setUID(UID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__SHEET_ELEMENT_UID:
			return sheetElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_WIDTH_STRINGER_UID:
			return keelWidthStringerUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__KEEL_HEIGHT_STRINGER_UID:
			return keelHeightStringerUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_LENGTH_FRAME_UID:
			return hFwdConLengthFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_CON_HEIGHT_STRINGER_UID:
			return hFwdConHeightStringerUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_LENGTH_FRAME_UID:
			return hRearConLengthFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_CON_HEIGHT_STRINGER_UID:
			return hRearConHeightStringerUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_CON_LENGTH_FRAME_UID:
			return vFwdConLengthFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_CON_LENGTH_FRAME_UID:
			return vRearConLengthFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__START_CWB_CON_FRAME_UID:
			return startCwbConFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__END_CWB_CON_FRAME_UID:
			return endCwbConFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HFWD_REINFOCEMENT_ELEMENT_UID:
			return hFwdReinfocementElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__HREAR_REINFOCEMENT_ELEMENT_UID:
			return hRearReinfocementElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VFWD_REINFOCEMENT_ELEMENT_UID:
			return vFwdReinfocementElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__VREAR_REINFOCEMENT_ELEMENT_UID:
			return vRearReinfocementElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__CWB_CON_REINFOCEMENT_ELEMENT_UID:
			return cwbConReinfocementElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //CenterFuselageKeelbeamTypeImpl
