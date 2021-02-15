/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PerformanceTargetsGlobalType;
import Cpacs.RequirementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Targets Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PerformanceTargetsGlobalTypeImpl#getCruiseMach <em>Cruise Mach</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceTargetsGlobalTypeImpl#getMaximumOperatingVelocity <em>Maximum Operating Velocity</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceTargetsGlobalTypeImpl#getMaximumOperatingMach <em>Maximum Operating Mach</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceTargetsGlobalTypeImpl#getInitialCruiseAltitude <em>Initial Cruise Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceTargetsGlobalTypeImpl#getTimeToClimb <em>Time To Climb</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceTargetsGlobalTypeImpl#getMaxOperatingAltitude <em>Max Operating Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceTargetsGlobalTypeImpl#getApproachSpeed <em>Approach Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceTargetsGlobalTypeImpl extends ComplexBaseTypeImpl implements PerformanceTargetsGlobalType {
	/**
	 * The cached value of the '{@link #getCruiseMach() <em>Cruise Mach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCruiseMach()
	 * @generated
	 * @ordered
	 */
	protected RequirementType cruiseMach;

	/**
	 * The cached value of the '{@link #getMaximumOperatingVelocity() <em>Maximum Operating Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOperatingVelocity()
	 * @generated
	 * @ordered
	 */
	protected RequirementType maximumOperatingVelocity;

	/**
	 * The cached value of the '{@link #getMaximumOperatingMach() <em>Maximum Operating Mach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOperatingMach()
	 * @generated
	 * @ordered
	 */
	protected RequirementType maximumOperatingMach;

	/**
	 * The cached value of the '{@link #getInitialCruiseAltitude() <em>Initial Cruise Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCruiseAltitude()
	 * @generated
	 * @ordered
	 */
	protected RequirementType initialCruiseAltitude;

	/**
	 * The cached value of the '{@link #getTimeToClimb() <em>Time To Climb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToClimb()
	 * @generated
	 * @ordered
	 */
	protected RequirementType timeToClimb;

	/**
	 * The cached value of the '{@link #getMaxOperatingAltitude() <em>Max Operating Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingAltitude()
	 * @generated
	 * @ordered
	 */
	protected RequirementType maxOperatingAltitude;

	/**
	 * The cached value of the '{@link #getApproachSpeed() <em>Approach Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproachSpeed()
	 * @generated
	 * @ordered
	 */
	protected RequirementType approachSpeed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceTargetsGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPerformanceTargetsGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getCruiseMach() {
		return cruiseMach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCruiseMach(RequirementType newCruiseMach, NotificationChain msgs) {
		RequirementType oldCruiseMach = cruiseMach;
		cruiseMach = newCruiseMach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH, oldCruiseMach, newCruiseMach);
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
	public void setCruiseMach(RequirementType newCruiseMach) {
		if (newCruiseMach != cruiseMach) {
			NotificationChain msgs = null;
			if (cruiseMach != null)
				msgs = ((InternalEObject) cruiseMach).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH, null, msgs);
			if (newCruiseMach != null)
				msgs = ((InternalEObject) newCruiseMach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH, null, msgs);
			msgs = basicSetCruiseMach(newCruiseMach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH, newCruiseMach, newCruiseMach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getMaximumOperatingVelocity() {
		return maximumOperatingVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumOperatingVelocity(RequirementType newMaximumOperatingVelocity,
			NotificationChain msgs) {
		RequirementType oldMaximumOperatingVelocity = maximumOperatingVelocity;
		maximumOperatingVelocity = newMaximumOperatingVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY,
					oldMaximumOperatingVelocity, newMaximumOperatingVelocity);
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
	public void setMaximumOperatingVelocity(RequirementType newMaximumOperatingVelocity) {
		if (newMaximumOperatingVelocity != maximumOperatingVelocity) {
			NotificationChain msgs = null;
			if (maximumOperatingVelocity != null)
				msgs = ((InternalEObject) maximumOperatingVelocity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY, null, msgs);
			if (newMaximumOperatingVelocity != null)
				msgs = ((InternalEObject) newMaximumOperatingVelocity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY, null, msgs);
			msgs = basicSetMaximumOperatingVelocity(newMaximumOperatingVelocity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY,
					newMaximumOperatingVelocity, newMaximumOperatingVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getMaximumOperatingMach() {
		return maximumOperatingMach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumOperatingMach(RequirementType newMaximumOperatingMach,
			NotificationChain msgs) {
		RequirementType oldMaximumOperatingMach = maximumOperatingMach;
		maximumOperatingMach = newMaximumOperatingMach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH, oldMaximumOperatingMach,
					newMaximumOperatingMach);
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
	public void setMaximumOperatingMach(RequirementType newMaximumOperatingMach) {
		if (newMaximumOperatingMach != maximumOperatingMach) {
			NotificationChain msgs = null;
			if (maximumOperatingMach != null)
				msgs = ((InternalEObject) maximumOperatingMach).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH,
						null, msgs);
			if (newMaximumOperatingMach != null)
				msgs = ((InternalEObject) newMaximumOperatingMach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH,
						null, msgs);
			msgs = basicSetMaximumOperatingMach(newMaximumOperatingMach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH, newMaximumOperatingMach,
					newMaximumOperatingMach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getInitialCruiseAltitude() {
		return initialCruiseAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialCruiseAltitude(RequirementType newInitialCruiseAltitude,
			NotificationChain msgs) {
		RequirementType oldInitialCruiseAltitude = initialCruiseAltitude;
		initialCruiseAltitude = newInitialCruiseAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE, oldInitialCruiseAltitude,
					newInitialCruiseAltitude);
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
	public void setInitialCruiseAltitude(RequirementType newInitialCruiseAltitude) {
		if (newInitialCruiseAltitude != initialCruiseAltitude) {
			NotificationChain msgs = null;
			if (initialCruiseAltitude != null)
				msgs = ((InternalEObject) initialCruiseAltitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE,
						null, msgs);
			if (newInitialCruiseAltitude != null)
				msgs = ((InternalEObject) newInitialCruiseAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE,
						null, msgs);
			msgs = basicSetInitialCruiseAltitude(newInitialCruiseAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE, newInitialCruiseAltitude,
					newInitialCruiseAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getTimeToClimb() {
		return timeToClimb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeToClimb(RequirementType newTimeToClimb, NotificationChain msgs) {
		RequirementType oldTimeToClimb = timeToClimb;
		timeToClimb = newTimeToClimb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB, oldTimeToClimb, newTimeToClimb);
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
	public void setTimeToClimb(RequirementType newTimeToClimb) {
		if (newTimeToClimb != timeToClimb) {
			NotificationChain msgs = null;
			if (timeToClimb != null)
				msgs = ((InternalEObject) timeToClimb).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB, null,
						msgs);
			if (newTimeToClimb != null)
				msgs = ((InternalEObject) newTimeToClimb).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB, null,
						msgs);
			msgs = basicSetTimeToClimb(newTimeToClimb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB, newTimeToClimb, newTimeToClimb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getMaxOperatingAltitude() {
		return maxOperatingAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxOperatingAltitude(RequirementType newMaxOperatingAltitude,
			NotificationChain msgs) {
		RequirementType oldMaxOperatingAltitude = maxOperatingAltitude;
		maxOperatingAltitude = newMaxOperatingAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE, oldMaxOperatingAltitude,
					newMaxOperatingAltitude);
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
	public void setMaxOperatingAltitude(RequirementType newMaxOperatingAltitude) {
		if (newMaxOperatingAltitude != maxOperatingAltitude) {
			NotificationChain msgs = null;
			if (maxOperatingAltitude != null)
				msgs = ((InternalEObject) maxOperatingAltitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE,
						null, msgs);
			if (newMaxOperatingAltitude != null)
				msgs = ((InternalEObject) newMaxOperatingAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE,
						null, msgs);
			msgs = basicSetMaxOperatingAltitude(newMaxOperatingAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE, newMaxOperatingAltitude,
					newMaxOperatingAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getApproachSpeed() {
		return approachSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproachSpeed(RequirementType newApproachSpeed, NotificationChain msgs) {
		RequirementType oldApproachSpeed = approachSpeed;
		approachSpeed = newApproachSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED, oldApproachSpeed, newApproachSpeed);
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
	public void setApproachSpeed(RequirementType newApproachSpeed) {
		if (newApproachSpeed != approachSpeed) {
			NotificationChain msgs = null;
			if (approachSpeed != null)
				msgs = ((InternalEObject) approachSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED, null,
						msgs);
			if (newApproachSpeed != null)
				msgs = ((InternalEObject) newApproachSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED, null,
						msgs);
			msgs = basicSetApproachSpeed(newApproachSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED, newApproachSpeed, newApproachSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH:
			return basicSetCruiseMach(null, msgs);
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY:
			return basicSetMaximumOperatingVelocity(null, msgs);
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH:
			return basicSetMaximumOperatingMach(null, msgs);
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE:
			return basicSetInitialCruiseAltitude(null, msgs);
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB:
			return basicSetTimeToClimb(null, msgs);
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE:
			return basicSetMaxOperatingAltitude(null, msgs);
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED:
			return basicSetApproachSpeed(null, msgs);
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
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH:
			return getCruiseMach();
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY:
			return getMaximumOperatingVelocity();
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH:
			return getMaximumOperatingMach();
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE:
			return getInitialCruiseAltitude();
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB:
			return getTimeToClimb();
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE:
			return getMaxOperatingAltitude();
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED:
			return getApproachSpeed();
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
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH:
			setCruiseMach((RequirementType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY:
			setMaximumOperatingVelocity((RequirementType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH:
			setMaximumOperatingMach((RequirementType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE:
			setInitialCruiseAltitude((RequirementType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB:
			setTimeToClimb((RequirementType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE:
			setMaxOperatingAltitude((RequirementType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED:
			setApproachSpeed((RequirementType) newValue);
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
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH:
			setCruiseMach((RequirementType) null);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY:
			setMaximumOperatingVelocity((RequirementType) null);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH:
			setMaximumOperatingMach((RequirementType) null);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE:
			setInitialCruiseAltitude((RequirementType) null);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB:
			setTimeToClimb((RequirementType) null);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE:
			setMaxOperatingAltitude((RequirementType) null);
			return;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED:
			setApproachSpeed((RequirementType) null);
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
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__CRUISE_MACH:
			return cruiseMach != null;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_VELOCITY:
			return maximumOperatingVelocity != null;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAXIMUM_OPERATING_MACH:
			return maximumOperatingMach != null;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__INITIAL_CRUISE_ALTITUDE:
			return initialCruiseAltitude != null;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__TIME_TO_CLIMB:
			return timeToClimb != null;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__MAX_OPERATING_ALTITUDE:
			return maxOperatingAltitude != null;
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE__APPROACH_SPEED:
			return approachSpeed != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformanceTargetsGlobalTypeImpl
