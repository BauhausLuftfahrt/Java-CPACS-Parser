/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.WingInterfaceMainFramesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Interface Main Frames Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingInterfaceMainFramesTypeImpl#getMainFrame1UID <em>Main Frame1 UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceMainFramesTypeImpl#getMainFrame2UID <em>Main Frame2 UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceMainFramesTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingInterfaceMainFramesTypeImpl extends ComplexBaseTypeImpl implements WingInterfaceMainFramesType {
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
	 * The cached value of the '{@link #getMainFrame2UID() <em>Main Frame2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFrame2UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType mainFrame2UID;

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
	protected WingInterfaceMainFramesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingInterfaceMainFramesType();
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
					CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, oldMainFrame1UID, newMainFrame1UID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, null,
						msgs);
			if (newMainFrame1UID != null)
				msgs = ((InternalEObject) newMainFrame1UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, null,
						msgs);
			msgs = basicSetMainFrame1UID(newMainFrame1UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID, newMainFrame1UID, newMainFrame1UID));
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
					CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, oldMainFrame2UID, newMainFrame2UID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, null,
						msgs);
			if (newMainFrame2UID != null)
				msgs = ((InternalEObject) newMainFrame2UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, null,
						msgs);
			msgs = basicSetMainFrame2UID(newMainFrame2UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID, newMainFrame2UID, newMainFrame2UID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__UID,
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
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return basicSetMainFrame1UID(null, msgs);
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return basicSetMainFrame2UID(null, msgs);
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
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return getMainFrame1UID();
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return getMainFrame2UID();
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			setMainFrame1UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			setMainFrame2UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			setMainFrame1UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			setMainFrame2UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME1_UID:
			return mainFrame1UID != null;
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__MAIN_FRAME2_UID:
			return mainFrame2UID != null;
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE__UID:
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

} //WingInterfaceMainFramesTypeImpl
