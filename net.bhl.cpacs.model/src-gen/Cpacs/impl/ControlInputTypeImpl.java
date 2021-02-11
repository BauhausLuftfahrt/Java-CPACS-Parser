/**
 */
package Cpacs.impl;

import Cpacs.ControlInputType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlInputTypeImpl#getCockpitControlUID <em>Cockpit Control UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlInputTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlInputTypeImpl extends ComplexBaseTypeImpl implements ControlInputType {
	/**
	 * The cached value of the '{@link #getCockpitControlUID() <em>Cockpit Control UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCockpitControlUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType cockpitControlUID;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlInputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlInputType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCockpitControlUID() {
		return cockpitControlUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCockpitControlUID(StringUIDBaseType newCockpitControlUID, NotificationChain msgs) {
		StringUIDBaseType oldCockpitControlUID = cockpitControlUID;
		cockpitControlUID = newCockpitControlUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID, oldCockpitControlUID, newCockpitControlUID);
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
	public void setCockpitControlUID(StringUIDBaseType newCockpitControlUID) {
		if (newCockpitControlUID != cockpitControlUID) {
			NotificationChain msgs = null;
			if (cockpitControlUID != null)
				msgs = ((InternalEObject) cockpitControlUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID, null, msgs);
			if (newCockpitControlUID != null)
				msgs = ((InternalEObject) newCockpitControlUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID, null, msgs);
			msgs = basicSetCockpitControlUID(newCockpitControlUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID,
					newCockpitControlUID, newCockpitControlUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(StringVectorBaseType newValue, NotificationChain msgs) {
		StringVectorBaseType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_INPUT_TYPE__VALUE, oldValue, newValue);
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
	public void setValue(StringVectorBaseType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_INPUT_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_INPUT_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_INPUT_TYPE__VALUE, newValue,
					newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID:
			return basicSetCockpitControlUID(null, msgs);
		case CpacsPackage.CONTROL_INPUT_TYPE__VALUE:
			return basicSetValue(null, msgs);
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
		case CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID:
			return getCockpitControlUID();
		case CpacsPackage.CONTROL_INPUT_TYPE__VALUE:
			return getValue();
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
		case CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID:
			setCockpitControlUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_INPUT_TYPE__VALUE:
			setValue((StringVectorBaseType) newValue);
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
		case CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID:
			setCockpitControlUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_INPUT_TYPE__VALUE:
			setValue((StringVectorBaseType) null);
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
		case CpacsPackage.CONTROL_INPUT_TYPE__COCKPIT_CONTROL_UID:
			return cockpitControlUID != null;
		case CpacsPackage.CONTROL_INPUT_TYPE__VALUE:
			return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlInputTypeImpl
