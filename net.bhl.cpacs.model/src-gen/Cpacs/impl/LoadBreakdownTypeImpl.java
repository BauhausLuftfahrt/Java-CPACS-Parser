/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadBreakdownType;
import Cpacs.SubLoadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Breakdown Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadBreakdownTypeImpl#getInertialLoads <em>Inertial Loads</em>}</li>
 *   <li>{@link Cpacs.impl.LoadBreakdownTypeImpl#getAeroLoads <em>Aero Loads</em>}</li>
 *   <li>{@link Cpacs.impl.LoadBreakdownTypeImpl#getPropulsionLoads <em>Propulsion Loads</em>}</li>
 *   <li>{@link Cpacs.impl.LoadBreakdownTypeImpl#getLandingGearLoads <em>Landing Gear Loads</em>}</li>
 *   <li>{@link Cpacs.impl.LoadBreakdownTypeImpl#getCalibrationLoads <em>Calibration Loads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBreakdownTypeImpl extends ComplexBaseTypeImpl implements LoadBreakdownType {
	/**
	 * The cached value of the '{@link #getInertialLoads() <em>Inertial Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertialLoads()
	 * @generated
	 * @ordered
	 */
	protected SubLoadType inertialLoads;

	/**
	 * The cached value of the '{@link #getAeroLoads() <em>Aero Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroLoads()
	 * @generated
	 * @ordered
	 */
	protected SubLoadType aeroLoads;

	/**
	 * The cached value of the '{@link #getPropulsionLoads() <em>Propulsion Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropulsionLoads()
	 * @generated
	 * @ordered
	 */
	protected SubLoadType propulsionLoads;

	/**
	 * The cached value of the '{@link #getLandingGearLoads() <em>Landing Gear Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearLoads()
	 * @generated
	 * @ordered
	 */
	protected SubLoadType landingGearLoads;

	/**
	 * The cached value of the '{@link #getCalibrationLoads() <em>Calibration Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibrationLoads()
	 * @generated
	 * @ordered
	 */
	protected SubLoadType calibrationLoads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBreakdownTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadBreakdownType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLoadType getInertialLoads() {
		return inertialLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInertialLoads(SubLoadType newInertialLoads, NotificationChain msgs) {
		SubLoadType oldInertialLoads = inertialLoads;
		inertialLoads = newInertialLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS, oldInertialLoads, newInertialLoads);
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
	public void setInertialLoads(SubLoadType newInertialLoads) {
		if (newInertialLoads != inertialLoads) {
			NotificationChain msgs = null;
			if (inertialLoads != null)
				msgs = ((InternalEObject) inertialLoads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS, null, msgs);
			if (newInertialLoads != null)
				msgs = ((InternalEObject) newInertialLoads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS, null, msgs);
			msgs = basicSetInertialLoads(newInertialLoads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS,
					newInertialLoads, newInertialLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLoadType getAeroLoads() {
		return aeroLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroLoads(SubLoadType newAeroLoads, NotificationChain msgs) {
		SubLoadType oldAeroLoads = aeroLoads;
		aeroLoads = newAeroLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS, oldAeroLoads, newAeroLoads);
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
	public void setAeroLoads(SubLoadType newAeroLoads) {
		if (newAeroLoads != aeroLoads) {
			NotificationChain msgs = null;
			if (aeroLoads != null)
				msgs = ((InternalEObject) aeroLoads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS, null, msgs);
			if (newAeroLoads != null)
				msgs = ((InternalEObject) newAeroLoads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS, null, msgs);
			msgs = basicSetAeroLoads(newAeroLoads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS,
					newAeroLoads, newAeroLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLoadType getPropulsionLoads() {
		return propulsionLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropulsionLoads(SubLoadType newPropulsionLoads, NotificationChain msgs) {
		SubLoadType oldPropulsionLoads = propulsionLoads;
		propulsionLoads = newPropulsionLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS, oldPropulsionLoads, newPropulsionLoads);
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
	public void setPropulsionLoads(SubLoadType newPropulsionLoads) {
		if (newPropulsionLoads != propulsionLoads) {
			NotificationChain msgs = null;
			if (propulsionLoads != null)
				msgs = ((InternalEObject) propulsionLoads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS, null, msgs);
			if (newPropulsionLoads != null)
				msgs = ((InternalEObject) newPropulsionLoads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS, null, msgs);
			msgs = basicSetPropulsionLoads(newPropulsionLoads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS,
					newPropulsionLoads, newPropulsionLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLoadType getLandingGearLoads() {
		return landingGearLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearLoads(SubLoadType newLandingGearLoads, NotificationChain msgs) {
		SubLoadType oldLandingGearLoads = landingGearLoads;
		landingGearLoads = newLandingGearLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS, oldLandingGearLoads, newLandingGearLoads);
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
	public void setLandingGearLoads(SubLoadType newLandingGearLoads) {
		if (newLandingGearLoads != landingGearLoads) {
			NotificationChain msgs = null;
			if (landingGearLoads != null)
				msgs = ((InternalEObject) landingGearLoads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS, null, msgs);
			if (newLandingGearLoads != null)
				msgs = ((InternalEObject) newLandingGearLoads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS, null, msgs);
			msgs = basicSetLandingGearLoads(newLandingGearLoads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS,
					newLandingGearLoads, newLandingGearLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLoadType getCalibrationLoads() {
		return calibrationLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibrationLoads(SubLoadType newCalibrationLoads, NotificationChain msgs) {
		SubLoadType oldCalibrationLoads = calibrationLoads;
		calibrationLoads = newCalibrationLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS, oldCalibrationLoads, newCalibrationLoads);
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
	public void setCalibrationLoads(SubLoadType newCalibrationLoads) {
		if (newCalibrationLoads != calibrationLoads) {
			NotificationChain msgs = null;
			if (calibrationLoads != null)
				msgs = ((InternalEObject) calibrationLoads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS, null, msgs);
			if (newCalibrationLoads != null)
				msgs = ((InternalEObject) newCalibrationLoads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS, null, msgs);
			msgs = basicSetCalibrationLoads(newCalibrationLoads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS,
					newCalibrationLoads, newCalibrationLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS:
			return basicSetInertialLoads(null, msgs);
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS:
			return basicSetAeroLoads(null, msgs);
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS:
			return basicSetPropulsionLoads(null, msgs);
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS:
			return basicSetLandingGearLoads(null, msgs);
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS:
			return basicSetCalibrationLoads(null, msgs);
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
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS:
			return getInertialLoads();
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS:
			return getAeroLoads();
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS:
			return getPropulsionLoads();
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS:
			return getLandingGearLoads();
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS:
			return getCalibrationLoads();
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
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS:
			setInertialLoads((SubLoadType) newValue);
			return;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS:
			setAeroLoads((SubLoadType) newValue);
			return;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS:
			setPropulsionLoads((SubLoadType) newValue);
			return;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS:
			setLandingGearLoads((SubLoadType) newValue);
			return;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS:
			setCalibrationLoads((SubLoadType) newValue);
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
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS:
			setInertialLoads((SubLoadType) null);
			return;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS:
			setAeroLoads((SubLoadType) null);
			return;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS:
			setPropulsionLoads((SubLoadType) null);
			return;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS:
			setLandingGearLoads((SubLoadType) null);
			return;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS:
			setCalibrationLoads((SubLoadType) null);
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
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__INERTIAL_LOADS:
			return inertialLoads != null;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__AERO_LOADS:
			return aeroLoads != null;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__PROPULSION_LOADS:
			return propulsionLoads != null;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__LANDING_GEAR_LOADS:
			return landingGearLoads != null;
		case CpacsPackage.LOAD_BREAKDOWN_TYPE__CALIBRATION_LOADS:
			return calibrationLoads != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadBreakdownTypeImpl
