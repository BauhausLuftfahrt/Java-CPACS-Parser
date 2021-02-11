/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SkinSegmentType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skin Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SkinSegmentTypeImpl#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.SkinSegmentTypeImpl#getStartFrameUID <em>Start Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.SkinSegmentTypeImpl#getEndFrameUID <em>End Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.SkinSegmentTypeImpl#getStartStringerUID <em>Start Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.SkinSegmentTypeImpl#getEndStringerUID <em>End Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.SkinSegmentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkinSegmentTypeImpl extends ComplexBaseTypeImpl implements SkinSegmentType {
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
	 * The cached value of the '{@link #getStartFrameUID() <em>Start Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startFrameUID;

	/**
	 * The cached value of the '{@link #getEndFrameUID() <em>End Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endFrameUID;

	/**
	 * The cached value of the '{@link #getStartStringerUID() <em>Start Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startStringerUID;

	/**
	 * The cached value of the '{@link #getEndStringerUID() <em>End Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endStringerUID;

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
	protected SkinSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSkinSegmentType();
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
					CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID, oldSheetElementUID, newSheetElementUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID, null, msgs);
			if (newSheetElementUID != null)
				msgs = ((InternalEObject) newSheetElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID, null, msgs);
			msgs = basicSetSheetElementUID(newSheetElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID,
					newSheetElementUID, newSheetElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartFrameUID() {
		return startFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartFrameUID(StringUIDBaseType newStartFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldStartFrameUID = startFrameUID;
		startFrameUID = newStartFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID, oldStartFrameUID, newStartFrameUID);
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
	public void setStartFrameUID(StringUIDBaseType newStartFrameUID) {
		if (newStartFrameUID != startFrameUID) {
			NotificationChain msgs = null;
			if (startFrameUID != null)
				msgs = ((InternalEObject) startFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID, null, msgs);
			if (newStartFrameUID != null)
				msgs = ((InternalEObject) newStartFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID, null, msgs);
			msgs = basicSetStartFrameUID(newStartFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID,
					newStartFrameUID, newStartFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndFrameUID() {
		return endFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndFrameUID(StringUIDBaseType newEndFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldEndFrameUID = endFrameUID;
		endFrameUID = newEndFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID, oldEndFrameUID, newEndFrameUID);
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
	public void setEndFrameUID(StringUIDBaseType newEndFrameUID) {
		if (newEndFrameUID != endFrameUID) {
			NotificationChain msgs = null;
			if (endFrameUID != null)
				msgs = ((InternalEObject) endFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID, null, msgs);
			if (newEndFrameUID != null)
				msgs = ((InternalEObject) newEndFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID, null, msgs);
			msgs = basicSetEndFrameUID(newEndFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID,
					newEndFrameUID, newEndFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartStringerUID() {
		return startStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartStringerUID(StringUIDBaseType newStartStringerUID, NotificationChain msgs) {
		StringUIDBaseType oldStartStringerUID = startStringerUID;
		startStringerUID = newStartStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID, oldStartStringerUID, newStartStringerUID);
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
	public void setStartStringerUID(StringUIDBaseType newStartStringerUID) {
		if (newStartStringerUID != startStringerUID) {
			NotificationChain msgs = null;
			if (startStringerUID != null)
				msgs = ((InternalEObject) startStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID, null, msgs);
			if (newStartStringerUID != null)
				msgs = ((InternalEObject) newStartStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID, null, msgs);
			msgs = basicSetStartStringerUID(newStartStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID,
					newStartStringerUID, newStartStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndStringerUID() {
		return endStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndStringerUID(StringUIDBaseType newEndStringerUID, NotificationChain msgs) {
		StringUIDBaseType oldEndStringerUID = endStringerUID;
		endStringerUID = newEndStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID, oldEndStringerUID, newEndStringerUID);
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
	public void setEndStringerUID(StringUIDBaseType newEndStringerUID) {
		if (newEndStringerUID != endStringerUID) {
			NotificationChain msgs = null;
			if (endStringerUID != null)
				msgs = ((InternalEObject) endStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID, null, msgs);
			if (newEndStringerUID != null)
				msgs = ((InternalEObject) newEndStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID, null, msgs);
			msgs = basicSetEndStringerUID(newEndStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID,
					newEndStringerUID, newEndStringerUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKIN_SEGMENT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID:
			return basicSetSheetElementUID(null, msgs);
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID:
			return basicSetStartFrameUID(null, msgs);
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID:
			return basicSetEndFrameUID(null, msgs);
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID:
			return basicSetStartStringerUID(null, msgs);
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID:
			return basicSetEndStringerUID(null, msgs);
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
		case CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID:
			return getSheetElementUID();
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID:
			return getStartFrameUID();
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID:
			return getEndFrameUID();
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID:
			return getStartStringerUID();
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID:
			return getEndStringerUID();
		case CpacsPackage.SKIN_SEGMENT_TYPE__UID:
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
		case CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID:
			setStartFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID:
			setEndFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID:
			setStartStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID:
			setEndStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__UID:
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
		case CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID:
			setStartFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID:
			setEndFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID:
			setStartStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID:
			setEndStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SKIN_SEGMENT_TYPE__UID:
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
		case CpacsPackage.SKIN_SEGMENT_TYPE__SHEET_ELEMENT_UID:
			return sheetElementUID != null;
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_FRAME_UID:
			return startFrameUID != null;
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_FRAME_UID:
			return endFrameUID != null;
		case CpacsPackage.SKIN_SEGMENT_TYPE__START_STRINGER_UID:
			return startStringerUID != null;
		case CpacsPackage.SKIN_SEGMENT_TYPE__END_STRINGER_UID:
			return endStringerUID != null;
		case CpacsPackage.SKIN_SEGMENT_TYPE__UID:
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

} //SkinSegmentTypeImpl
