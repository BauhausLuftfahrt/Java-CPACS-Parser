/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LandingGearInterfaceMainFramesType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Interface Main Frames Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceMainFramesTypeImpl#getMainFrame1UID <em>Main Frame1 UID</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceMainFramesTypeImpl#getMainFrame1PressureBulkheadUID <em>Main Frame1 Pressure Bulkhead UID</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceMainFramesTypeImpl#getMainFrame2UID <em>Main Frame2 UID</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceMainFramesTypeImpl#getMainFrame2PressureBulkheadUID <em>Main Frame2 Pressure Bulkhead UID</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceMainFramesTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearInterfaceMainFramesTypeImpl extends ComplexBaseTypeImpl
		implements LandingGearInterfaceMainFramesType {
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
	 * The cached value of the '{@link #getMainFrame2PressureBulkheadUID() <em>Main Frame2 Pressure Bulkhead UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFrame2PressureBulkheadUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType mainFrame2PressureBulkheadUID;

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
	protected LandingGearInterfaceMainFramesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearInterfaceMainFramesType();
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
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, oldMainFrame1UID,
					newMainFrame1UID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID,
						null, msgs);
			if (newMainFrame1UID != null)
				msgs = ((InternalEObject) newMainFrame1UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID,
						null, msgs);
			msgs = basicSetMainFrame1UID(newMainFrame1UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, newMainFrame1UID,
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
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID,
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
				msgs = ((InternalEObject) mainFrame1PressureBulkheadUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID, null,
						msgs);
			if (newMainFrame1PressureBulkheadUID != null)
				msgs = ((InternalEObject) newMainFrame1PressureBulkheadUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID, null,
						msgs);
			msgs = basicSetMainFrame1PressureBulkheadUID(newMainFrame1PressureBulkheadUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID,
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
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, oldMainFrame2UID,
					newMainFrame2UID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID,
						null, msgs);
			if (newMainFrame2UID != null)
				msgs = ((InternalEObject) newMainFrame2UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID,
						null, msgs);
			msgs = basicSetMainFrame2UID(newMainFrame2UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, newMainFrame2UID,
					newMainFrame2UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMainFrame2PressureBulkheadUID() {
		return mainFrame2PressureBulkheadUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFrame2PressureBulkheadUID(StringUIDBaseType newMainFrame2PressureBulkheadUID,
			NotificationChain msgs) {
		StringUIDBaseType oldMainFrame2PressureBulkheadUID = mainFrame2PressureBulkheadUID;
		mainFrame2PressureBulkheadUID = newMainFrame2PressureBulkheadUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID,
					oldMainFrame2PressureBulkheadUID, newMainFrame2PressureBulkheadUID);
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
	public void setMainFrame2PressureBulkheadUID(StringUIDBaseType newMainFrame2PressureBulkheadUID) {
		if (newMainFrame2PressureBulkheadUID != mainFrame2PressureBulkheadUID) {
			NotificationChain msgs = null;
			if (mainFrame2PressureBulkheadUID != null)
				msgs = ((InternalEObject) mainFrame2PressureBulkheadUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID, null,
						msgs);
			if (newMainFrame2PressureBulkheadUID != null)
				msgs = ((InternalEObject) newMainFrame2PressureBulkheadUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID, null,
						msgs);
			msgs = basicSetMainFrame2PressureBulkheadUID(newMainFrame2PressureBulkheadUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID,
					newMainFrame2PressureBulkheadUID, newMainFrame2PressureBulkheadUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return basicSetMainFrame1UID(null, msgs);
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			return basicSetMainFrame1PressureBulkheadUID(null, msgs);
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return basicSetMainFrame2UID(null, msgs);
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID:
			return basicSetMainFrame2PressureBulkheadUID(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return getMainFrame1UID();
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			return getMainFrame1PressureBulkheadUID();
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return getMainFrame2UID();
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID:
			return getMainFrame2PressureBulkheadUID();
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			setMainFrame1UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			setMainFrame1PressureBulkheadUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			setMainFrame2UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID:
			setMainFrame2PressureBulkheadUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			setMainFrame1UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			setMainFrame1PressureBulkheadUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			setMainFrame2UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID:
			setMainFrame2PressureBulkheadUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return mainFrame1UID != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_PRESSURE_BULKHEAD_UID:
			return mainFrame1PressureBulkheadUID != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return mainFrame2UID != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_PRESSURE_BULKHEAD_UID:
			return mainFrame2PressureBulkheadUID != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE__UID:
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

} //LandingGearInterfaceMainFramesTypeImpl
