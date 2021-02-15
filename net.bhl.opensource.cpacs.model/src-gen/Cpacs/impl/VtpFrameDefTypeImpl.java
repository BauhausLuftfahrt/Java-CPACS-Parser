/**
 */
package Cpacs.impl;

import Cpacs.BooleanBaseType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.VtpFrameDefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vtp Frame Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.VtpFrameDefTypeImpl#getVtpFrameUID <em>Vtp Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.VtpFrameDefTypeImpl#getVtpFramePlus1 <em>Vtp Frame Plus1</em>}</li>
 *   <li>{@link Cpacs.impl.VtpFrameDefTypeImpl#getVtpFrameSheetElemUID <em>Vtp Frame Sheet Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.VtpFrameDefTypeImpl#getVtpFrameReinfBaseStructElemUID <em>Vtp Frame Reinf Base Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.VtpFrameDefTypeImpl#getVtpFrameReinfHorizStructElemUID <em>Vtp Frame Reinf Horiz Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.VtpFrameDefTypeImpl#getVtpFrameReinfRadialStructElemUID <em>Vtp Frame Reinf Radial Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.VtpFrameDefTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VtpFrameDefTypeImpl extends ComplexBaseTypeImpl implements VtpFrameDefType {
	/**
	 * The cached value of the '{@link #getVtpFrameUID() <em>Vtp Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vtpFrameUID;

	/**
	 * The cached value of the '{@link #getVtpFramePlus1() <em>Vtp Frame Plus1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpFramePlus1()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType vtpFramePlus1;

	/**
	 * The cached value of the '{@link #getVtpFrameSheetElemUID() <em>Vtp Frame Sheet Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpFrameSheetElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vtpFrameSheetElemUID;

	/**
	 * The cached value of the '{@link #getVtpFrameReinfBaseStructElemUID() <em>Vtp Frame Reinf Base Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpFrameReinfBaseStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vtpFrameReinfBaseStructElemUID;

	/**
	 * The cached value of the '{@link #getVtpFrameReinfHorizStructElemUID() <em>Vtp Frame Reinf Horiz Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpFrameReinfHorizStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vtpFrameReinfHorizStructElemUID;

	/**
	 * The cached value of the '{@link #getVtpFrameReinfRadialStructElemUID() <em>Vtp Frame Reinf Radial Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpFrameReinfRadialStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vtpFrameReinfRadialStructElemUID;

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
	protected VtpFrameDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getVtpFrameDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVtpFrameUID() {
		return vtpFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpFrameUID(StringUIDBaseType newVtpFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldVtpFrameUID = vtpFrameUID;
		vtpFrameUID = newVtpFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID, oldVtpFrameUID, newVtpFrameUID);
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
	public void setVtpFrameUID(StringUIDBaseType newVtpFrameUID) {
		if (newVtpFrameUID != vtpFrameUID) {
			NotificationChain msgs = null;
			if (vtpFrameUID != null)
				msgs = ((InternalEObject) vtpFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID, null, msgs);
			if (newVtpFrameUID != null)
				msgs = ((InternalEObject) newVtpFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID, null, msgs);
			msgs = basicSetVtpFrameUID(newVtpFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID,
					newVtpFrameUID, newVtpFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getVtpFramePlus1() {
		return vtpFramePlus1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpFramePlus1(BooleanBaseType newVtpFramePlus1, NotificationChain msgs) {
		BooleanBaseType oldVtpFramePlus1 = vtpFramePlus1;
		vtpFramePlus1 = newVtpFramePlus1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1, oldVtpFramePlus1, newVtpFramePlus1);
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
	public void setVtpFramePlus1(BooleanBaseType newVtpFramePlus1) {
		if (newVtpFramePlus1 != vtpFramePlus1) {
			NotificationChain msgs = null;
			if (vtpFramePlus1 != null)
				msgs = ((InternalEObject) vtpFramePlus1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1, null, msgs);
			if (newVtpFramePlus1 != null)
				msgs = ((InternalEObject) newVtpFramePlus1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1, null, msgs);
			msgs = basicSetVtpFramePlus1(newVtpFramePlus1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1,
					newVtpFramePlus1, newVtpFramePlus1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVtpFrameSheetElemUID() {
		return vtpFrameSheetElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpFrameSheetElemUID(StringUIDBaseType newVtpFrameSheetElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldVtpFrameSheetElemUID = vtpFrameSheetElemUID;
		vtpFrameSheetElemUID = newVtpFrameSheetElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID, oldVtpFrameSheetElemUID,
					newVtpFrameSheetElemUID);
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
	public void setVtpFrameSheetElemUID(StringUIDBaseType newVtpFrameSheetElemUID) {
		if (newVtpFrameSheetElemUID != vtpFrameSheetElemUID) {
			NotificationChain msgs = null;
			if (vtpFrameSheetElemUID != null)
				msgs = ((InternalEObject) vtpFrameSheetElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID, null, msgs);
			if (newVtpFrameSheetElemUID != null)
				msgs = ((InternalEObject) newVtpFrameSheetElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID, null, msgs);
			msgs = basicSetVtpFrameSheetElemUID(newVtpFrameSheetElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID, newVtpFrameSheetElemUID,
					newVtpFrameSheetElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVtpFrameReinfBaseStructElemUID() {
		return vtpFrameReinfBaseStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpFrameReinfBaseStructElemUID(StringUIDBaseType newVtpFrameReinfBaseStructElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldVtpFrameReinfBaseStructElemUID = vtpFrameReinfBaseStructElemUID;
		vtpFrameReinfBaseStructElemUID = newVtpFrameReinfBaseStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID,
					oldVtpFrameReinfBaseStructElemUID, newVtpFrameReinfBaseStructElemUID);
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
	public void setVtpFrameReinfBaseStructElemUID(StringUIDBaseType newVtpFrameReinfBaseStructElemUID) {
		if (newVtpFrameReinfBaseStructElemUID != vtpFrameReinfBaseStructElemUID) {
			NotificationChain msgs = null;
			if (vtpFrameReinfBaseStructElemUID != null)
				msgs = ((InternalEObject) vtpFrameReinfBaseStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID,
						null, msgs);
			if (newVtpFrameReinfBaseStructElemUID != null)
				msgs = ((InternalEObject) newVtpFrameReinfBaseStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetVtpFrameReinfBaseStructElemUID(newVtpFrameReinfBaseStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID,
					newVtpFrameReinfBaseStructElemUID, newVtpFrameReinfBaseStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVtpFrameReinfHorizStructElemUID() {
		return vtpFrameReinfHorizStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpFrameReinfHorizStructElemUID(
			StringUIDBaseType newVtpFrameReinfHorizStructElemUID, NotificationChain msgs) {
		StringUIDBaseType oldVtpFrameReinfHorizStructElemUID = vtpFrameReinfHorizStructElemUID;
		vtpFrameReinfHorizStructElemUID = newVtpFrameReinfHorizStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID,
					oldVtpFrameReinfHorizStructElemUID, newVtpFrameReinfHorizStructElemUID);
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
	public void setVtpFrameReinfHorizStructElemUID(StringUIDBaseType newVtpFrameReinfHorizStructElemUID) {
		if (newVtpFrameReinfHorizStructElemUID != vtpFrameReinfHorizStructElemUID) {
			NotificationChain msgs = null;
			if (vtpFrameReinfHorizStructElemUID != null)
				msgs = ((InternalEObject) vtpFrameReinfHorizStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID,
						null, msgs);
			if (newVtpFrameReinfHorizStructElemUID != null)
				msgs = ((InternalEObject) newVtpFrameReinfHorizStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetVtpFrameReinfHorizStructElemUID(newVtpFrameReinfHorizStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID,
					newVtpFrameReinfHorizStructElemUID, newVtpFrameReinfHorizStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVtpFrameReinfRadialStructElemUID() {
		return vtpFrameReinfRadialStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpFrameReinfRadialStructElemUID(
			StringUIDBaseType newVtpFrameReinfRadialStructElemUID, NotificationChain msgs) {
		StringUIDBaseType oldVtpFrameReinfRadialStructElemUID = vtpFrameReinfRadialStructElemUID;
		vtpFrameReinfRadialStructElemUID = newVtpFrameReinfRadialStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID,
					oldVtpFrameReinfRadialStructElemUID, newVtpFrameReinfRadialStructElemUID);
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
	public void setVtpFrameReinfRadialStructElemUID(StringUIDBaseType newVtpFrameReinfRadialStructElemUID) {
		if (newVtpFrameReinfRadialStructElemUID != vtpFrameReinfRadialStructElemUID) {
			NotificationChain msgs = null;
			if (vtpFrameReinfRadialStructElemUID != null)
				msgs = ((InternalEObject) vtpFrameReinfRadialStructElemUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID, null, msgs);
			if (newVtpFrameReinfRadialStructElemUID != null)
				msgs = ((InternalEObject) newVtpFrameReinfRadialStructElemUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID, null, msgs);
			msgs = basicSetVtpFrameReinfRadialStructElemUID(newVtpFrameReinfRadialStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID,
					newVtpFrameReinfRadialStructElemUID, newVtpFrameReinfRadialStructElemUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VTP_FRAME_DEF_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID:
			return basicSetVtpFrameUID(null, msgs);
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1:
			return basicSetVtpFramePlus1(null, msgs);
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID:
			return basicSetVtpFrameSheetElemUID(null, msgs);
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID:
			return basicSetVtpFrameReinfBaseStructElemUID(null, msgs);
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID:
			return basicSetVtpFrameReinfHorizStructElemUID(null, msgs);
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID:
			return basicSetVtpFrameReinfRadialStructElemUID(null, msgs);
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
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID:
			return getVtpFrameUID();
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1:
			return getVtpFramePlus1();
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID:
			return getVtpFrameSheetElemUID();
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID:
			return getVtpFrameReinfBaseStructElemUID();
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID:
			return getVtpFrameReinfHorizStructElemUID();
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID:
			return getVtpFrameReinfRadialStructElemUID();
		case CpacsPackage.VTP_FRAME_DEF_TYPE__UID:
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
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID:
			setVtpFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1:
			setVtpFramePlus1((BooleanBaseType) newValue);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID:
			setVtpFrameSheetElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID:
			setVtpFrameReinfBaseStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID:
			setVtpFrameReinfHorizStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID:
			setVtpFrameReinfRadialStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__UID:
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
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID:
			setVtpFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1:
			setVtpFramePlus1((BooleanBaseType) null);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID:
			setVtpFrameSheetElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID:
			setVtpFrameReinfBaseStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID:
			setVtpFrameReinfHorizStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID:
			setVtpFrameReinfRadialStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__UID:
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
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_UID:
			return vtpFrameUID != null;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_PLUS1:
			return vtpFramePlus1 != null;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_SHEET_ELEM_UID:
			return vtpFrameSheetElemUID != null;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_BASE_STRUCT_ELEM_UID:
			return vtpFrameReinfBaseStructElemUID != null;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_HORIZ_STRUCT_ELEM_UID:
			return vtpFrameReinfHorizStructElemUID != null;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__VTP_FRAME_REINF_RADIAL_STRUCT_ELEM_UID:
			return vtpFrameReinfRadialStructElemUID != null;
		case CpacsPackage.VTP_FRAME_DEF_TYPE__UID:
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

} //VtpFrameDefTypeImpl
