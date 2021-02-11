/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.NacelleCenterCowlType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nacelle Center Cowl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NacelleCenterCowlTypeImpl#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleCenterCowlTypeImpl#getCurveUID <em>Curve UID</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleCenterCowlTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NacelleCenterCowlTypeImpl extends ComplexBaseTypeImpl implements NacelleCenterCowlType {
	/**
	 * The cached value of the '{@link #getXOffset() <em>XOffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXOffset()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xOffset;

	/**
	 * The cached value of the '{@link #getCurveUID() <em>Curve UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType curveUID;

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
	protected NacelleCenterCowlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNacelleCenterCowlType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXOffset() {
		return xOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXOffset(DoubleBaseType newXOffset, NotificationChain msgs) {
		DoubleBaseType oldXOffset = xOffset;
		xOffset = newXOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET, oldXOffset, newXOffset);
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
	public void setXOffset(DoubleBaseType newXOffset) {
		if (newXOffset != xOffset) {
			NotificationChain msgs = null;
			if (xOffset != null)
				msgs = ((InternalEObject) xOffset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET, null, msgs);
			if (newXOffset != null)
				msgs = ((InternalEObject) newXOffset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET, null, msgs);
			msgs = basicSetXOffset(newXOffset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET,
					newXOffset, newXOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCurveUID() {
		return curveUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveUID(StringUIDBaseType newCurveUID, NotificationChain msgs) {
		StringUIDBaseType oldCurveUID = curveUID;
		curveUID = newCurveUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID, oldCurveUID, newCurveUID);
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
	public void setCurveUID(StringUIDBaseType newCurveUID) {
		if (newCurveUID != curveUID) {
			NotificationChain msgs = null;
			if (curveUID != null)
				msgs = ((InternalEObject) curveUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID, null, msgs);
			if (newCurveUID != null)
				msgs = ((InternalEObject) newCurveUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID, null, msgs);
			msgs = basicSetCurveUID(newCurveUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID,
					newCurveUID, newCurveUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_CENTER_COWL_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET:
			return basicSetXOffset(null, msgs);
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID:
			return basicSetCurveUID(null, msgs);
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
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET:
			return getXOffset();
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID:
			return getCurveUID();
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__UID:
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
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET:
			setXOffset((DoubleBaseType) newValue);
			return;
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID:
			setCurveUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__UID:
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
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET:
			setXOffset((DoubleBaseType) null);
			return;
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID:
			setCurveUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__UID:
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
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__XOFFSET:
			return xOffset != null;
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__CURVE_UID:
			return curveUID != null;
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE__UID:
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

} //NacelleCenterCowlTypeImpl
