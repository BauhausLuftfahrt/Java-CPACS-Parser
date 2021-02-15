/**
 */
package Cpacs.impl;

import Cpacs.CockpitControlType;
import Cpacs.CockpitControlsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cockpit Controls Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CockpitControlsTypeImpl#getStickPitch <em>Stick Pitch</em>}</li>
 *   <li>{@link Cpacs.impl.CockpitControlsTypeImpl#getStickRoll <em>Stick Roll</em>}</li>
 *   <li>{@link Cpacs.impl.CockpitControlsTypeImpl#getPedals <em>Pedals</em>}</li>
 *   <li>{@link Cpacs.impl.CockpitControlsTypeImpl#getCockpitControl <em>Cockpit Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CockpitControlsTypeImpl extends ComplexBaseTypeImpl implements CockpitControlsType {
	/**
	 * The cached value of the '{@link #getStickPitch() <em>Stick Pitch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStickPitch()
	 * @generated
	 * @ordered
	 */
	protected CockpitControlType stickPitch;

	/**
	 * The cached value of the '{@link #getStickRoll() <em>Stick Roll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStickRoll()
	 * @generated
	 * @ordered
	 */
	protected CockpitControlType stickRoll;

	/**
	 * The cached value of the '{@link #getPedals() <em>Pedals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedals()
	 * @generated
	 * @ordered
	 */
	protected CockpitControlType pedals;

	/**
	 * The cached value of the '{@link #getCockpitControl() <em>Cockpit Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCockpitControl()
	 * @generated
	 * @ordered
	 */
	protected EList<CockpitControlType> cockpitControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CockpitControlsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCockpitControlsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CockpitControlType getStickPitch() {
		return stickPitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStickPitch(CockpitControlType newStickPitch, NotificationChain msgs) {
		CockpitControlType oldStickPitch = stickPitch;
		stickPitch = newStickPitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH, oldStickPitch, newStickPitch);
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
	public void setStickPitch(CockpitControlType newStickPitch) {
		if (newStickPitch != stickPitch) {
			NotificationChain msgs = null;
			if (stickPitch != null)
				msgs = ((InternalEObject) stickPitch).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH, null, msgs);
			if (newStickPitch != null)
				msgs = ((InternalEObject) newStickPitch).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH, null, msgs);
			msgs = basicSetStickPitch(newStickPitch, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH,
					newStickPitch, newStickPitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CockpitControlType getStickRoll() {
		return stickRoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStickRoll(CockpitControlType newStickRoll, NotificationChain msgs) {
		CockpitControlType oldStickRoll = stickRoll;
		stickRoll = newStickRoll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL, oldStickRoll, newStickRoll);
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
	public void setStickRoll(CockpitControlType newStickRoll) {
		if (newStickRoll != stickRoll) {
			NotificationChain msgs = null;
			if (stickRoll != null)
				msgs = ((InternalEObject) stickRoll).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL, null, msgs);
			if (newStickRoll != null)
				msgs = ((InternalEObject) newStickRoll).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL, null, msgs);
			msgs = basicSetStickRoll(newStickRoll, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL,
					newStickRoll, newStickRoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CockpitControlType getPedals() {
		return pedals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPedals(CockpitControlType newPedals, NotificationChain msgs) {
		CockpitControlType oldPedals = pedals;
		pedals = newPedals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS, oldPedals, newPedals);
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
	public void setPedals(CockpitControlType newPedals) {
		if (newPedals != pedals) {
			NotificationChain msgs = null;
			if (pedals != null)
				msgs = ((InternalEObject) pedals).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS, null, msgs);
			if (newPedals != null)
				msgs = ((InternalEObject) newPedals).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS, null, msgs);
			msgs = basicSetPedals(newPedals, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS, newPedals,
					newPedals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CockpitControlType> getCockpitControl() {
		if (cockpitControl == null) {
			cockpitControl = new EObjectContainmentEList<CockpitControlType>(CockpitControlType.class, this,
					CpacsPackage.COCKPIT_CONTROLS_TYPE__COCKPIT_CONTROL);
		}
		return cockpitControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH:
			return basicSetStickPitch(null, msgs);
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL:
			return basicSetStickRoll(null, msgs);
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS:
			return basicSetPedals(null, msgs);
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__COCKPIT_CONTROL:
			return ((InternalEList<?>) getCockpitControl()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH:
			return getStickPitch();
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL:
			return getStickRoll();
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS:
			return getPedals();
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__COCKPIT_CONTROL:
			return getCockpitControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH:
			setStickPitch((CockpitControlType) newValue);
			return;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL:
			setStickRoll((CockpitControlType) newValue);
			return;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS:
			setPedals((CockpitControlType) newValue);
			return;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__COCKPIT_CONTROL:
			getCockpitControl().clear();
			getCockpitControl().addAll((Collection<? extends CockpitControlType>) newValue);
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
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH:
			setStickPitch((CockpitControlType) null);
			return;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL:
			setStickRoll((CockpitControlType) null);
			return;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS:
			setPedals((CockpitControlType) null);
			return;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__COCKPIT_CONTROL:
			getCockpitControl().clear();
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
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_PITCH:
			return stickPitch != null;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__STICK_ROLL:
			return stickRoll != null;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__PEDALS:
			return pedals != null;
		case CpacsPackage.COCKPIT_CONTROLS_TYPE__COCKPIT_CONTROL:
			return cockpitControl != null && !cockpitControl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CockpitControlsTypeImpl
