/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EngineNacelleType;
import Cpacs.NacelleCenterCowlType;
import Cpacs.NacelleCowlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Nacelle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineNacelleTypeImpl#getFanCowl <em>Fan Cowl</em>}</li>
 *   <li>{@link Cpacs.impl.EngineNacelleTypeImpl#getCoreCowl <em>Core Cowl</em>}</li>
 *   <li>{@link Cpacs.impl.EngineNacelleTypeImpl#getCenterCowl <em>Center Cowl</em>}</li>
 *   <li>{@link Cpacs.impl.EngineNacelleTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineNacelleTypeImpl extends ComplexBaseTypeImpl implements EngineNacelleType {
	/**
	 * The cached value of the '{@link #getFanCowl() <em>Fan Cowl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanCowl()
	 * @generated
	 * @ordered
	 */
	protected NacelleCowlType fanCowl;

	/**
	 * The cached value of the '{@link #getCoreCowl() <em>Core Cowl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCowl()
	 * @generated
	 * @ordered
	 */
	protected NacelleCowlType coreCowl;

	/**
	 * The cached value of the '{@link #getCenterCowl() <em>Center Cowl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterCowl()
	 * @generated
	 * @ordered
	 */
	protected NacelleCenterCowlType centerCowl;

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
	protected EngineNacelleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineNacelleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleCowlType getFanCowl() {
		return fanCowl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFanCowl(NacelleCowlType newFanCowl, NotificationChain msgs) {
		NacelleCowlType oldFanCowl = fanCowl;
		fanCowl = newFanCowl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL, oldFanCowl, newFanCowl);
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
	public void setFanCowl(NacelleCowlType newFanCowl) {
		if (newFanCowl != fanCowl) {
			NotificationChain msgs = null;
			if (fanCowl != null)
				msgs = ((InternalEObject) fanCowl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL, null, msgs);
			if (newFanCowl != null)
				msgs = ((InternalEObject) newFanCowl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL, null, msgs);
			msgs = basicSetFanCowl(newFanCowl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL,
					newFanCowl, newFanCowl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleCowlType getCoreCowl() {
		return coreCowl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreCowl(NacelleCowlType newCoreCowl, NotificationChain msgs) {
		NacelleCowlType oldCoreCowl = coreCowl;
		coreCowl = newCoreCowl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL, oldCoreCowl, newCoreCowl);
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
	public void setCoreCowl(NacelleCowlType newCoreCowl) {
		if (newCoreCowl != coreCowl) {
			NotificationChain msgs = null;
			if (coreCowl != null)
				msgs = ((InternalEObject) coreCowl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL, null, msgs);
			if (newCoreCowl != null)
				msgs = ((InternalEObject) newCoreCowl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL, null, msgs);
			msgs = basicSetCoreCowl(newCoreCowl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL,
					newCoreCowl, newCoreCowl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleCenterCowlType getCenterCowl() {
		return centerCowl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterCowl(NacelleCenterCowlType newCenterCowl, NotificationChain msgs) {
		NacelleCenterCowlType oldCenterCowl = centerCowl;
		centerCowl = newCenterCowl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL, oldCenterCowl, newCenterCowl);
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
	public void setCenterCowl(NacelleCenterCowlType newCenterCowl) {
		if (newCenterCowl != centerCowl) {
			NotificationChain msgs = null;
			if (centerCowl != null)
				msgs = ((InternalEObject) centerCowl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL, null, msgs);
			if (newCenterCowl != null)
				msgs = ((InternalEObject) newCenterCowl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL, null, msgs);
			msgs = basicSetCenterCowl(newCenterCowl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL,
					newCenterCowl, newCenterCowl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_NACELLE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL:
			return basicSetFanCowl(null, msgs);
		case CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL:
			return basicSetCoreCowl(null, msgs);
		case CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL:
			return basicSetCenterCowl(null, msgs);
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
		case CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL:
			return getFanCowl();
		case CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL:
			return getCoreCowl();
		case CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL:
			return getCenterCowl();
		case CpacsPackage.ENGINE_NACELLE_TYPE__UID:
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
		case CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL:
			setFanCowl((NacelleCowlType) newValue);
			return;
		case CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL:
			setCoreCowl((NacelleCowlType) newValue);
			return;
		case CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL:
			setCenterCowl((NacelleCenterCowlType) newValue);
			return;
		case CpacsPackage.ENGINE_NACELLE_TYPE__UID:
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
		case CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL:
			setFanCowl((NacelleCowlType) null);
			return;
		case CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL:
			setCoreCowl((NacelleCowlType) null);
			return;
		case CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL:
			setCenterCowl((NacelleCenterCowlType) null);
			return;
		case CpacsPackage.ENGINE_NACELLE_TYPE__UID:
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
		case CpacsPackage.ENGINE_NACELLE_TYPE__FAN_COWL:
			return fanCowl != null;
		case CpacsPackage.ENGINE_NACELLE_TYPE__CORE_COWL:
			return coreCowl != null;
		case CpacsPackage.ENGINE_NACELLE_TYPE__CENTER_COWL:
			return centerCowl != null;
		case CpacsPackage.ENGINE_NACELLE_TYPE__UID:
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

} //EngineNacelleTypeImpl
