/**
 */
package Cpacs.impl;

import Cpacs.AxleType;
import Cpacs.CpacsPackage;
import Cpacs.IntegerBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StrutType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getShaft <em>Shaft</em>}</li>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getWheelUID <em>Wheel UID</em>}</li>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getNumberOfWheels <em>Number Of Wheels</em>}</li>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxleTypeImpl extends ComplexBaseTypeImpl implements AxleType {
	/**
	 * The cached value of the '{@link #getShaft() <em>Shaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft()
	 * @generated
	 * @ordered
	 */
	protected StrutType shaft;

	/**
	 * The cached value of the '{@link #getWheelUID() <em>Wheel UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType wheelUID;

	/**
	 * The cached value of the '{@link #getNumberOfWheels() <em>Number Of Wheels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWheels()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfWheels;

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
	protected AxleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAxleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutType getShaft() {
		return shaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShaft(StrutType newShaft, NotificationChain msgs) {
		StrutType oldShaft = shaft;
		shaft = newShaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AXLE_TYPE__SHAFT, oldShaft, newShaft);
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
	public void setShaft(StrutType newShaft) {
		if (newShaft != shaft) {
			NotificationChain msgs = null;
			if (shaft != null)
				msgs = ((InternalEObject) shaft).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__SHAFT, null, msgs);
			if (newShaft != null)
				msgs = ((InternalEObject) newShaft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__SHAFT, null, msgs);
			msgs = basicSetShaft(newShaft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__SHAFT, newShaft, newShaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getWheelUID() {
		return wheelUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWheelUID(StringUIDBaseType newWheelUID, NotificationChain msgs) {
		StringUIDBaseType oldWheelUID = wheelUID;
		wheelUID = newWheelUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AXLE_TYPE__WHEEL_UID, oldWheelUID, newWheelUID);
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
	public void setWheelUID(StringUIDBaseType newWheelUID) {
		if (newWheelUID != wheelUID) {
			NotificationChain msgs = null;
			if (wheelUID != null)
				msgs = ((InternalEObject) wheelUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__WHEEL_UID, null, msgs);
			if (newWheelUID != null)
				msgs = ((InternalEObject) newWheelUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__WHEEL_UID, null, msgs);
			msgs = basicSetWheelUID(newWheelUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__WHEEL_UID, newWheelUID,
					newWheelUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfWheels(IntegerBaseType newNumberOfWheels, NotificationChain msgs) {
		IntegerBaseType oldNumberOfWheels = numberOfWheels;
		numberOfWheels = newNumberOfWheels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS, oldNumberOfWheels, newNumberOfWheels);
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
	public void setNumberOfWheels(IntegerBaseType newNumberOfWheels) {
		if (newNumberOfWheels != numberOfWheels) {
			NotificationChain msgs = null;
			if (numberOfWheels != null)
				msgs = ((InternalEObject) numberOfWheels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS, null, msgs);
			if (newNumberOfWheels != null)
				msgs = ((InternalEObject) newNumberOfWheels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS, null, msgs);
			msgs = basicSetNumberOfWheels(newNumberOfWheels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS,
					newNumberOfWheels, newNumberOfWheels));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AXLE_TYPE__SHAFT:
			return basicSetShaft(null, msgs);
		case CpacsPackage.AXLE_TYPE__WHEEL_UID:
			return basicSetWheelUID(null, msgs);
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			return basicSetNumberOfWheels(null, msgs);
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
		case CpacsPackage.AXLE_TYPE__SHAFT:
			return getShaft();
		case CpacsPackage.AXLE_TYPE__WHEEL_UID:
			return getWheelUID();
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			return getNumberOfWheels();
		case CpacsPackage.AXLE_TYPE__UID:
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
		case CpacsPackage.AXLE_TYPE__SHAFT:
			setShaft((StrutType) newValue);
			return;
		case CpacsPackage.AXLE_TYPE__WHEEL_UID:
			setWheelUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			setNumberOfWheels((IntegerBaseType) newValue);
			return;
		case CpacsPackage.AXLE_TYPE__UID:
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
		case CpacsPackage.AXLE_TYPE__SHAFT:
			setShaft((StrutType) null);
			return;
		case CpacsPackage.AXLE_TYPE__WHEEL_UID:
			setWheelUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			setNumberOfWheels((IntegerBaseType) null);
			return;
		case CpacsPackage.AXLE_TYPE__UID:
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
		case CpacsPackage.AXLE_TYPE__SHAFT:
			return shaft != null;
		case CpacsPackage.AXLE_TYPE__WHEEL_UID:
			return wheelUID != null;
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			return numberOfWheels != null;
		case CpacsPackage.AXLE_TYPE__UID:
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

} //AxleTypeImpl
