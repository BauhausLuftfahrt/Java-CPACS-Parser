/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselageMainFramesType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Fuselage Main Frames Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselageMainFramesTypeImpl#getMainFrame1UID <em>Main Frame1 UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageMainFramesTypeImpl#getMainFrame1PressureBulkheadUID <em>Main Frame1 Pressure Bulkhead UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageMainFramesTypeImpl#getMainFrame2UID <em>Main Frame2 UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageMainFramesTypeImpl#getMainFrame3UID <em>Main Frame3 UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageMainFramesTypeImpl#getMainFrame3PressureBulkheadUID <em>Main Frame3 Pressure Bulkhead UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageMainFramesTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselageMainFramesTypeImpl extends ComplexBaseTypeImpl implements CenterFuselageMainFramesType {
	/**
	 * The cached value of the '{@link #getMainFrame1UID() <em>Main Frame1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFrame1UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType mainFrame1UID;

	/**
	 * The cached value of the '{@link #getMainFrame1PressureBulkheadUID() <em>Main Frame1 Pressure Bulkhead UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFrame1PressureBulkheadUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType mainFrame1PressureBulkheadUID;

	/**
	 * The cached value of the '{@link #getMainFrame2UID() <em>Main Frame2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFrame2UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType mainFrame2UID;

	/**
	 * The cached value of the '{@link #getMainFrame3UID() <em>Main Frame3 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFrame3UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType mainFrame3UID;

	/**
	 * The cached value of the '{@link #getMainFrame3PressureBulkheadUID() <em>Main Frame3 Pressure Bulkhead UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFrame3PressureBulkheadUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType mainFrame3PressureBulkheadUID;

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
	protected CenterFuselageMainFramesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselageMainFramesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMainFrame1UID() {
		return mainFrame1UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFrame1UID(StringUIDBaseType newMainFrame1UID, NotificationChain msgs) {
		StringUIDBaseType oldMainFrame1UID = mainFrame1UID;
		mainFrame1UID = newMainFrame1UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, oldMainFrame1UID, newMainFrame1UID);
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
	public void setMainFrame1UID(StringUIDBaseType newMainFrame1UID) {
		if (newMainFrame1UID != mainFrame1UID) {
			NotificationChain msgs = null;
			if (mainFrame1UID != null)
				msgs = ((InternalEObject) mainFrame1UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, null,
						msgs);
			if (newMainFrame1UID != null)
				msgs = ((InternalEObject) newMainFrame1UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, null,
						msgs);
			msgs = basicSetMainFrame1UID(newMainFrame1UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, newMainFrame1UID,
					newMainFrame1UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMainFrame1PressureBulkheadUID() {
		return mainFrame1PressureBulkheadUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFrame1PressureBulkheadUID(StringUIDBaseType newMainFrame1PressureBulkheadUID,
			NotificationChain msgs) {
		StringUIDBaseType oldMainFrame1PressureBulkheadUID = mainFrame1PressureBulkheadUID;
		mainFrame1PressureBulkheadUID = newMainFrame1PressureBulkheadUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID,
					oldMainFrame1PressureBulkheadUID, newMainFrame1PressureBulkheadUID);
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
	public void setMainFrame1PressureBulkheadUID(StringUIDBaseType newMainFrame1PressureBulkheadUID) {
		if (newMainFrame1PressureBulkheadUID != mainFrame1PressureBulkheadUID) {
			NotificationChain msgs = null;
			if (mainFrame1PressureBulkheadUID != null)
				msgs = ((InternalEObject) mainFrame1PressureBulkheadUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID,
						null, msgs);
			if (newMainFrame1PressureBulkheadUID != null)
				msgs = ((InternalEObject) newMainFrame1PressureBulkheadUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID,
						null, msgs);
			msgs = basicSetMainFrame1PressureBulkheadUID(newMainFrame1PressureBulkheadUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID,
					newMainFrame1PressureBulkheadUID, newMainFrame1PressureBulkheadUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMainFrame2UID() {
		return mainFrame2UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFrame2UID(StringUIDBaseType newMainFrame2UID, NotificationChain msgs) {
		StringUIDBaseType oldMainFrame2UID = mainFrame2UID;
		mainFrame2UID = newMainFrame2UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, oldMainFrame2UID, newMainFrame2UID);
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
	public void setMainFrame2UID(StringUIDBaseType newMainFrame2UID) {
		if (newMainFrame2UID != mainFrame2UID) {
			NotificationChain msgs = null;
			if (mainFrame2UID != null)
				msgs = ((InternalEObject) mainFrame2UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, null,
						msgs);
			if (newMainFrame2UID != null)
				msgs = ((InternalEObject) newMainFrame2UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, null,
						msgs);
			msgs = basicSetMainFrame2UID(newMainFrame2UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, newMainFrame2UID,
					newMainFrame2UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMainFrame3UID() {
		return mainFrame3UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFrame3UID(StringUIDBaseType newMainFrame3UID, NotificationChain msgs) {
		StringUIDBaseType oldMainFrame3UID = mainFrame3UID;
		mainFrame3UID = newMainFrame3UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID, oldMainFrame3UID, newMainFrame3UID);
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
	public void setMainFrame3UID(StringUIDBaseType newMainFrame3UID) {
		if (newMainFrame3UID != mainFrame3UID) {
			NotificationChain msgs = null;
			if (mainFrame3UID != null)
				msgs = ((InternalEObject) mainFrame3UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID, null,
						msgs);
			if (newMainFrame3UID != null)
				msgs = ((InternalEObject) newMainFrame3UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID, null,
						msgs);
			msgs = basicSetMainFrame3UID(newMainFrame3UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID, newMainFrame3UID,
					newMainFrame3UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMainFrame3PressureBulkheadUID() {
		return mainFrame3PressureBulkheadUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFrame3PressureBulkheadUID(StringUIDBaseType newMainFrame3PressureBulkheadUID,
			NotificationChain msgs) {
		StringUIDBaseType oldMainFrame3PressureBulkheadUID = mainFrame3PressureBulkheadUID;
		mainFrame3PressureBulkheadUID = newMainFrame3PressureBulkheadUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID,
					oldMainFrame3PressureBulkheadUID, newMainFrame3PressureBulkheadUID);
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
	public void setMainFrame3PressureBulkheadUID(StringUIDBaseType newMainFrame3PressureBulkheadUID) {
		if (newMainFrame3PressureBulkheadUID != mainFrame3PressureBulkheadUID) {
			NotificationChain msgs = null;
			if (mainFrame3PressureBulkheadUID != null)
				msgs = ((InternalEObject) mainFrame3PressureBulkheadUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID,
						null, msgs);
			if (newMainFrame3PressureBulkheadUID != null)
				msgs = ((InternalEObject) newMainFrame3PressureBulkheadUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID,
						null, msgs);
			msgs = basicSetMainFrame3PressureBulkheadUID(newMainFrame3PressureBulkheadUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID,
					newMainFrame3PressureBulkheadUID, newMainFrame3PressureBulkheadUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__UID,
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
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return basicSetMainFrame1UID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			return basicSetMainFrame1PressureBulkheadUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return basicSetMainFrame2UID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID:
			return basicSetMainFrame3UID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID:
			return basicSetMainFrame3PressureBulkheadUID(null, msgs);
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
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return getMainFrame1UID();
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			return getMainFrame1PressureBulkheadUID();
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return getMainFrame2UID();
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID:
			return getMainFrame3UID();
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID:
			return getMainFrame3PressureBulkheadUID();
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			setMainFrame1UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			setMainFrame1PressureBulkheadUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			setMainFrame2UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID:
			setMainFrame3UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID:
			setMainFrame3PressureBulkheadUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			setMainFrame1UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			setMainFrame1PressureBulkheadUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			setMainFrame2UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID:
			setMainFrame3UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID:
			setMainFrame3PressureBulkheadUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return mainFrame1UID != null;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			return mainFrame1PressureBulkheadUID != null;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return mainFrame2UID != null;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_UID:
			return mainFrame3UID != null;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__MAIN_FRAME3_PRESSURE_BULKHEAD_UID:
			return mainFrame3PressureBulkheadUID != null;
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE__UID:
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

} //CenterFuselageMainFramesTypeImpl
