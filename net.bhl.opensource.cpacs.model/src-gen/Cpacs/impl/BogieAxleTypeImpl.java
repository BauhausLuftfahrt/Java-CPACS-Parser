/**
 */
package Cpacs.impl;

import Cpacs.BogieAxleType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bogie Axle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BogieAxleTypeImpl#getAxleUID <em>Axle UID</em>}</li>
 *   <li>{@link Cpacs.impl.BogieAxleTypeImpl#getPosOnBogie <em>Pos On Bogie</em>}</li>
 *   <li>{@link Cpacs.impl.BogieAxleTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BogieAxleTypeImpl extends ComplexBaseTypeImpl implements BogieAxleType {
	/**
	 * The cached value of the '{@link #getAxleUID() <em>Axle UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxleUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType axleUID;

	/**
	 * The cached value of the '{@link #getPosOnBogie() <em>Pos On Bogie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosOnBogie()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType posOnBogie;

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
	protected BogieAxleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBogieAxleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getAxleUID() {
		return axleUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxleUID(StringUIDBaseType newAxleUID, NotificationChain msgs) {
		StringUIDBaseType oldAxleUID = axleUID;
		axleUID = newAxleUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID, oldAxleUID, newAxleUID);
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
	public void setAxleUID(StringUIDBaseType newAxleUID) {
		if (newAxleUID != axleUID) {
			NotificationChain msgs = null;
			if (axleUID != null)
				msgs = ((InternalEObject) axleUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID, null, msgs);
			if (newAxleUID != null)
				msgs = ((InternalEObject) newAxleUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID, null, msgs);
			msgs = basicSetAxleUID(newAxleUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID, newAxleUID,
					newAxleUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPosOnBogie() {
		return posOnBogie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosOnBogie(DoubleBaseType newPosOnBogie, NotificationChain msgs) {
		DoubleBaseType oldPosOnBogie = posOnBogie;
		posOnBogie = newPosOnBogie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE, oldPosOnBogie, newPosOnBogie);
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
	public void setPosOnBogie(DoubleBaseType newPosOnBogie) {
		if (newPosOnBogie != posOnBogie) {
			NotificationChain msgs = null;
			if (posOnBogie != null)
				msgs = ((InternalEObject) posOnBogie).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE, null, msgs);
			if (newPosOnBogie != null)
				msgs = ((InternalEObject) newPosOnBogie).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE, null, msgs);
			msgs = basicSetPosOnBogie(newPosOnBogie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE,
					newPosOnBogie, newPosOnBogie));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_AXLE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID:
			return basicSetAxleUID(null, msgs);
		case CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE:
			return basicSetPosOnBogie(null, msgs);
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
		case CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID:
			return getAxleUID();
		case CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE:
			return getPosOnBogie();
		case CpacsPackage.BOGIE_AXLE_TYPE__UID:
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
		case CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID:
			setAxleUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE:
			setPosOnBogie((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BOGIE_AXLE_TYPE__UID:
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
		case CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID:
			setAxleUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE:
			setPosOnBogie((DoubleBaseType) null);
			return;
		case CpacsPackage.BOGIE_AXLE_TYPE__UID:
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
		case CpacsPackage.BOGIE_AXLE_TYPE__AXLE_UID:
			return axleUID != null;
		case CpacsPackage.BOGIE_AXLE_TYPE__POS_ON_BOGIE:
			return posOnBogie != null;
		case CpacsPackage.BOGIE_AXLE_TYPE__UID:
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

} //BogieAxleTypeImpl
