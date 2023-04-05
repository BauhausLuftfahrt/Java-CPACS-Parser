/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PointPerformanceRequirementsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Performance Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PointPerformanceRequirementsTypeImpl#getSustainedLoadFactor <em>Sustained Load Factor</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceRequirementsTypeImpl#getInstantaneousLoadFactor <em>Instantaneous Load Factor</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceRequirementsTypeImpl#getSpecificExcessPower <em>Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceRequirementsTypeImpl#getRollRate <em>Roll Rate</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceRequirementsTypeImpl#getRollAccelerationOnset <em>Roll Acceleration Onset</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceRequirementsTypeImpl#getRollAccelerationStop <em>Roll Acceleration Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointPerformanceRequirementsTypeImpl extends ComplexBaseTypeImpl
		implements PointPerformanceRequirementsType {
	/**
	 * The cached value of the '{@link #getSustainedLoadFactor() <em>Sustained Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSustainedLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sustainedLoadFactor;

	/**
	 * The cached value of the '{@link #getInstantaneousLoadFactor() <em>Instantaneous Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantaneousLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType instantaneousLoadFactor;

	/**
	 * The cached value of the '{@link #getSpecificExcessPower() <em>Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificExcessPower()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType specificExcessPower;

	/**
	 * The cached value of the '{@link #getRollRate() <em>Roll Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollRate()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollRate;

	/**
	 * The cached value of the '{@link #getRollAccelerationOnset() <em>Roll Acceleration Onset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAccelerationOnset()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollAccelerationOnset;

	/**
	 * The cached value of the '{@link #getRollAccelerationStop() <em>Roll Acceleration Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAccelerationStop()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollAccelerationStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointPerformanceRequirementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPointPerformanceRequirementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSustainedLoadFactor() {
		return sustainedLoadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSustainedLoadFactor(DoubleBaseType newSustainedLoadFactor,
			NotificationChain msgs) {
		DoubleBaseType oldSustainedLoadFactor = sustainedLoadFactor;
		sustainedLoadFactor = newSustainedLoadFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR, oldSustainedLoadFactor,
					newSustainedLoadFactor);
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
	public void setSustainedLoadFactor(DoubleBaseType newSustainedLoadFactor) {
		if (newSustainedLoadFactor != sustainedLoadFactor) {
			NotificationChain msgs = null;
			if (sustainedLoadFactor != null)
				msgs = ((InternalEObject) sustainedLoadFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR, null, msgs);
			if (newSustainedLoadFactor != null)
				msgs = ((InternalEObject) newSustainedLoadFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR, null, msgs);
			msgs = basicSetSustainedLoadFactor(newSustainedLoadFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR, newSustainedLoadFactor,
					newSustainedLoadFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getInstantaneousLoadFactor() {
		return instantaneousLoadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantaneousLoadFactor(DoubleBaseType newInstantaneousLoadFactor,
			NotificationChain msgs) {
		DoubleBaseType oldInstantaneousLoadFactor = instantaneousLoadFactor;
		instantaneousLoadFactor = newInstantaneousLoadFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR,
					oldInstantaneousLoadFactor, newInstantaneousLoadFactor);
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
	public void setInstantaneousLoadFactor(DoubleBaseType newInstantaneousLoadFactor) {
		if (newInstantaneousLoadFactor != instantaneousLoadFactor) {
			NotificationChain msgs = null;
			if (instantaneousLoadFactor != null)
				msgs = ((InternalEObject) instantaneousLoadFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR,
						null, msgs);
			if (newInstantaneousLoadFactor != null)
				msgs = ((InternalEObject) newInstantaneousLoadFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR,
						null, msgs);
			msgs = basicSetInstantaneousLoadFactor(newInstantaneousLoadFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR,
					newInstantaneousLoadFactor, newInstantaneousLoadFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpecificExcessPower() {
		return specificExcessPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificExcessPower(DoubleBaseType newSpecificExcessPower,
			NotificationChain msgs) {
		DoubleBaseType oldSpecificExcessPower = specificExcessPower;
		specificExcessPower = newSpecificExcessPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER, oldSpecificExcessPower,
					newSpecificExcessPower);
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
	public void setSpecificExcessPower(DoubleBaseType newSpecificExcessPower) {
		if (newSpecificExcessPower != specificExcessPower) {
			NotificationChain msgs = null;
			if (specificExcessPower != null)
				msgs = ((InternalEObject) specificExcessPower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER, null, msgs);
			if (newSpecificExcessPower != null)
				msgs = ((InternalEObject) newSpecificExcessPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER, null, msgs);
			msgs = basicSetSpecificExcessPower(newSpecificExcessPower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER, newSpecificExcessPower,
					newSpecificExcessPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollRate() {
		return rollRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollRate(DoubleBaseType newRollRate, NotificationChain msgs) {
		DoubleBaseType oldRollRate = rollRate;
		rollRate = newRollRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE, oldRollRate, newRollRate);
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
	public void setRollRate(DoubleBaseType newRollRate) {
		if (newRollRate != rollRate) {
			NotificationChain msgs = null;
			if (rollRate != null)
				msgs = ((InternalEObject) rollRate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE, null,
						msgs);
			if (newRollRate != null)
				msgs = ((InternalEObject) newRollRate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE, null,
						msgs);
			msgs = basicSetRollRate(newRollRate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE, newRollRate, newRollRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollAccelerationOnset() {
		return rollAccelerationOnset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollAccelerationOnset(DoubleBaseType newRollAccelerationOnset,
			NotificationChain msgs) {
		DoubleBaseType oldRollAccelerationOnset = rollAccelerationOnset;
		rollAccelerationOnset = newRollAccelerationOnset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET, oldRollAccelerationOnset,
					newRollAccelerationOnset);
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
	public void setRollAccelerationOnset(DoubleBaseType newRollAccelerationOnset) {
		if (newRollAccelerationOnset != rollAccelerationOnset) {
			NotificationChain msgs = null;
			if (rollAccelerationOnset != null)
				msgs = ((InternalEObject) rollAccelerationOnset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET,
						null, msgs);
			if (newRollAccelerationOnset != null)
				msgs = ((InternalEObject) newRollAccelerationOnset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET,
						null, msgs);
			msgs = basicSetRollAccelerationOnset(newRollAccelerationOnset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET, newRollAccelerationOnset,
					newRollAccelerationOnset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollAccelerationStop() {
		return rollAccelerationStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollAccelerationStop(DoubleBaseType newRollAccelerationStop,
			NotificationChain msgs) {
		DoubleBaseType oldRollAccelerationStop = rollAccelerationStop;
		rollAccelerationStop = newRollAccelerationStop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP, oldRollAccelerationStop,
					newRollAccelerationStop);
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
	public void setRollAccelerationStop(DoubleBaseType newRollAccelerationStop) {
		if (newRollAccelerationStop != rollAccelerationStop) {
			NotificationChain msgs = null;
			if (rollAccelerationStop != null)
				msgs = ((InternalEObject) rollAccelerationStop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP, null, msgs);
			if (newRollAccelerationStop != null)
				msgs = ((InternalEObject) newRollAccelerationStop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP, null, msgs);
			msgs = basicSetRollAccelerationStop(newRollAccelerationStop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP, newRollAccelerationStop,
					newRollAccelerationStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR:
			return basicSetSustainedLoadFactor(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			return basicSetInstantaneousLoadFactor(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER:
			return basicSetSpecificExcessPower(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE:
			return basicSetRollRate(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET:
			return basicSetRollAccelerationOnset(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP:
			return basicSetRollAccelerationStop(null, msgs);
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
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR:
			return getSustainedLoadFactor();
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			return getInstantaneousLoadFactor();
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER:
			return getSpecificExcessPower();
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE:
			return getRollRate();
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET:
			return getRollAccelerationOnset();
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP:
			return getRollAccelerationStop();
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
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR:
			setSustainedLoadFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			setInstantaneousLoadFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER:
			setSpecificExcessPower((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE:
			setRollRate((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET:
			setRollAccelerationOnset((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP:
			setRollAccelerationStop((DoubleBaseType) newValue);
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
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR:
			setSustainedLoadFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			setInstantaneousLoadFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER:
			setSpecificExcessPower((DoubleBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE:
			setRollRate((DoubleBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET:
			setRollAccelerationOnset((DoubleBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP:
			setRollAccelerationStop((DoubleBaseType) null);
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
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SUSTAINED_LOAD_FACTOR:
			return sustainedLoadFactor != null;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			return instantaneousLoadFactor != null;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__SPECIFIC_EXCESS_POWER:
			return specificExcessPower != null;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_RATE:
			return rollRate != null;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_ONSET:
			return rollAccelerationOnset != null;
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE__ROLL_ACCELERATION_STOP:
			return rollAccelerationStop != null;
		}
		return super.eIsSet(featureID);
	}

} //PointPerformanceRequirementsTypeImpl
