/**
 */
package Cpacs.impl;

import Cpacs.AeroLimitsIncrementMapsType;
import Cpacs.AeroLimitsMapType;
import Cpacs.AeroMapOperationLimitType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Limits Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroLimitsMapTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsMapTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsMapTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsMapTypeImpl#getOperationLimit <em>Operation Limit</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsMapTypeImpl#getIncrementMaps <em>Increment Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroLimitsMapTypeImpl extends ComplexBaseTypeImpl implements AeroLimitsMapType {
	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType altitude;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType machNumber;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType angleOfSideslip;

	/**
	 * The cached value of the '{@link #getOperationLimit() <em>Operation Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationLimit()
	 * @generated
	 * @ordered
	 */
	protected AeroMapOperationLimitType operationLimit;

	/**
	 * The cached value of the '{@link #getIncrementMaps() <em>Increment Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementMaps()
	 * @generated
	 * @ordered
	 */
	protected AeroLimitsIncrementMapsType incrementMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroLimitsMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroLimitsMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleVectorBaseType newAltitude, NotificationChain msgs) {
		DoubleVectorBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleVectorBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(DoubleVectorBaseType newMachNumber, NotificationChain msgs) {
		DoubleVectorBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(DoubleVectorBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER,
					newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(DoubleVectorBaseType newAngleOfSideslip, NotificationChain msgs) {
		DoubleVectorBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip, newAngleOfSideslip);
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
	public void setAngleOfSideslip(DoubleVectorBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP,
					newAngleOfSideslip, newAngleOfSideslip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroMapOperationLimitType getOperationLimit() {
		return operationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationLimit(AeroMapOperationLimitType newOperationLimit,
			NotificationChain msgs) {
		AeroMapOperationLimitType oldOperationLimit = operationLimit;
		operationLimit = newOperationLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT, oldOperationLimit, newOperationLimit);
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
	public void setOperationLimit(AeroMapOperationLimitType newOperationLimit) {
		if (newOperationLimit != operationLimit) {
			NotificationChain msgs = null;
			if (operationLimit != null)
				msgs = ((InternalEObject) operationLimit).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT, null, msgs);
			if (newOperationLimit != null)
				msgs = ((InternalEObject) newOperationLimit).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT, null, msgs);
			msgs = basicSetOperationLimit(newOperationLimit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT,
					newOperationLimit, newOperationLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroLimitsIncrementMapsType getIncrementMaps() {
		return incrementMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrementMaps(AeroLimitsIncrementMapsType newIncrementMaps,
			NotificationChain msgs) {
		AeroLimitsIncrementMapsType oldIncrementMaps = incrementMaps;
		incrementMaps = newIncrementMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS, oldIncrementMaps, newIncrementMaps);
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
	public void setIncrementMaps(AeroLimitsIncrementMapsType newIncrementMaps) {
		if (newIncrementMaps != incrementMaps) {
			NotificationChain msgs = null;
			if (incrementMaps != null)
				msgs = ((InternalEObject) incrementMaps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS, null, msgs);
			if (newIncrementMaps != null)
				msgs = ((InternalEObject) newIncrementMaps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS, null, msgs);
			msgs = basicSetIncrementMaps(newIncrementMaps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS,
					newIncrementMaps, newIncrementMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT:
			return basicSetOperationLimit(null, msgs);
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS:
			return basicSetIncrementMaps(null, msgs);
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
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT:
			return getOperationLimit();
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS:
			return getIncrementMaps();
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
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE:
			setAltitude((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER:
			setMachNumber((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT:
			setOperationLimit((AeroMapOperationLimitType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS:
			setIncrementMaps((AeroLimitsIncrementMapsType) newValue);
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
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE:
			setAltitude((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER:
			setMachNumber((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT:
			setOperationLimit((AeroMapOperationLimitType) null);
			return;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS:
			setIncrementMaps((AeroLimitsIncrementMapsType) null);
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
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__OPERATION_LIMIT:
			return operationLimit != null;
		case CpacsPackage.AERO_LIMITS_MAP_TYPE__INCREMENT_MAPS:
			return incrementMaps != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroLimitsMapTypeImpl
