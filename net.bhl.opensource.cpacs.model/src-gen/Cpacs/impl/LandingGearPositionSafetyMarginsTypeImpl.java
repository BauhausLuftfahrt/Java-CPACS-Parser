/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LandingGearPositionSafetyMarginsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Position Safety Margins Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearPositionSafetyMarginsTypeImpl#getTakeOff <em>Take Off</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearPositionSafetyMarginsTypeImpl#getTouchDown <em>Touch Down</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearPositionSafetyMarginsTypeImpl#getTurnOver <em>Turn Over</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearPositionSafetyMarginsTypeImpl#getRollAngle <em>Roll Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearPositionSafetyMarginsTypeImpl extends ComplexBaseTypeImpl
		implements LandingGearPositionSafetyMarginsType {
	/**
	 * The cached value of the '{@link #getTakeOff() <em>Take Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeOff()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType takeOff;

	/**
	 * The cached value of the '{@link #getTouchDown() <em>Touch Down</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchDown()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType touchDown;

	/**
	 * The cached value of the '{@link #getTurnOver() <em>Turn Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnOver()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType turnOver;

	/**
	 * The cached value of the '{@link #getRollAngle() <em>Roll Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollAngle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearPositionSafetyMarginsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearPositionSafetyMarginsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTakeOff() {
		return takeOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTakeOff(DoubleBaseType newTakeOff, NotificationChain msgs) {
		DoubleBaseType oldTakeOff = takeOff;
		takeOff = newTakeOff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF, oldTakeOff, newTakeOff);
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
	public void setTakeOff(DoubleBaseType newTakeOff) {
		if (newTakeOff != takeOff) {
			NotificationChain msgs = null;
			if (takeOff != null)
				msgs = ((InternalEObject) takeOff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF, null,
						msgs);
			if (newTakeOff != null)
				msgs = ((InternalEObject) newTakeOff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF, null,
						msgs);
			msgs = basicSetTakeOff(newTakeOff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF, newTakeOff, newTakeOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTouchDown() {
		return touchDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTouchDown(DoubleBaseType newTouchDown, NotificationChain msgs) {
		DoubleBaseType oldTouchDown = touchDown;
		touchDown = newTouchDown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN, oldTouchDown, newTouchDown);
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
	public void setTouchDown(DoubleBaseType newTouchDown) {
		if (newTouchDown != touchDown) {
			NotificationChain msgs = null;
			if (touchDown != null)
				msgs = ((InternalEObject) touchDown).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN,
						null, msgs);
			if (newTouchDown != null)
				msgs = ((InternalEObject) newTouchDown).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN,
						null, msgs);
			msgs = basicSetTouchDown(newTouchDown, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN, newTouchDown, newTouchDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTurnOver() {
		return turnOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnOver(DoubleBaseType newTurnOver, NotificationChain msgs) {
		DoubleBaseType oldTurnOver = turnOver;
		turnOver = newTurnOver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER, oldTurnOver, newTurnOver);
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
	public void setTurnOver(DoubleBaseType newTurnOver) {
		if (newTurnOver != turnOver) {
			NotificationChain msgs = null;
			if (turnOver != null)
				msgs = ((InternalEObject) turnOver).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER,
						null, msgs);
			if (newTurnOver != null)
				msgs = ((InternalEObject) newTurnOver).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER,
						null, msgs);
			msgs = basicSetTurnOver(newTurnOver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER, newTurnOver, newTurnOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollAngle() {
		return rollAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollAngle(DoubleBaseType newRollAngle, NotificationChain msgs) {
		DoubleBaseType oldRollAngle = rollAngle;
		rollAngle = newRollAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE, oldRollAngle, newRollAngle);
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
	public void setRollAngle(DoubleBaseType newRollAngle) {
		if (newRollAngle != rollAngle) {
			NotificationChain msgs = null;
			if (rollAngle != null)
				msgs = ((InternalEObject) rollAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE,
						null, msgs);
			if (newRollAngle != null)
				msgs = ((InternalEObject) newRollAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE,
						null, msgs);
			msgs = basicSetRollAngle(newRollAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE, newRollAngle, newRollAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF:
			return basicSetTakeOff(null, msgs);
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN:
			return basicSetTouchDown(null, msgs);
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER:
			return basicSetTurnOver(null, msgs);
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE:
			return basicSetRollAngle(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF:
			return getTakeOff();
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN:
			return getTouchDown();
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER:
			return getTurnOver();
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE:
			return getRollAngle();
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
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF:
			setTakeOff((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN:
			setTouchDown((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER:
			setTurnOver((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE:
			setRollAngle((DoubleBaseType) newValue);
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
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF:
			setTakeOff((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN:
			setTouchDown((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER:
			setTurnOver((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE:
			setRollAngle((DoubleBaseType) null);
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
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TAKE_OFF:
			return takeOff != null;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TOUCH_DOWN:
			return touchDown != null;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__TURN_OVER:
			return turnOver != null;
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE__ROLL_ANGLE:
			return rollAngle != null;
		}
		return super.eIsSet(featureID);
	}

} //LandingGearPositionSafetyMarginsTypeImpl
