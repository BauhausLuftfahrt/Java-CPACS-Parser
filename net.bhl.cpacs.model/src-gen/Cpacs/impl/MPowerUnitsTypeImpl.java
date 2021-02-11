/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MBleedAirSystemType;
import Cpacs.MEngineControlType;
import Cpacs.MEquippedEnginesType;
import Cpacs.MFuelSystemType;
import Cpacs.MInterGasSystemType;
import Cpacs.MPowerUnitsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPower Units Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MPowerUnitsTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MPowerUnitsTypeImpl#getMEngines <em>MEngines</em>}</li>
 *   <li>{@link Cpacs.impl.MPowerUnitsTypeImpl#getMBleedAirSystem <em>MBleed Air System</em>}</li>
 *   <li>{@link Cpacs.impl.MPowerUnitsTypeImpl#getMEngineControl <em>MEngine Control</em>}</li>
 *   <li>{@link Cpacs.impl.MPowerUnitsTypeImpl#getMFuelSystem <em>MFuel System</em>}</li>
 *   <li>{@link Cpacs.impl.MPowerUnitsTypeImpl#getMInterGasSystem <em>MInter Gas System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPowerUnitsTypeImpl extends ComplexBaseTypeImpl implements MPowerUnitsType {
	/**
	 * The cached value of the '{@link #getMassDescription() <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType massDescription;

	/**
	 * The cached value of the '{@link #getMEngines() <em>MEngines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEngines()
	 * @generated
	 * @ordered
	 */
	protected MEquippedEnginesType mEngines;

	/**
	 * The cached value of the '{@link #getMBleedAirSystem() <em>MBleed Air System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBleedAirSystem()
	 * @generated
	 * @ordered
	 */
	protected MBleedAirSystemType mBleedAirSystem;

	/**
	 * The cached value of the '{@link #getMEngineControl() <em>MEngine Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEngineControl()
	 * @generated
	 * @ordered
	 */
	protected MEngineControlType mEngineControl;

	/**
	 * The cached value of the '{@link #getMFuelSystem() <em>MFuel System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFuelSystem()
	 * @generated
	 * @ordered
	 */
	protected MFuelSystemType mFuelSystem;

	/**
	 * The cached value of the '{@link #getMInterGasSystem() <em>MInter Gas System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMInterGasSystem()
	 * @generated
	 * @ordered
	 */
	protected MInterGasSystemType mInterGasSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPowerUnitsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMPowerUnitsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMassDescription() {
		return massDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassDescription(GenericMassType newMassDescription, NotificationChain msgs) {
		GenericMassType oldMassDescription = massDescription;
		massDescription = newMassDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
	public void setMassDescription(GenericMassType newMassDescription) {
		if (newMassDescription != massDescription) {
			NotificationChain msgs = null;
			if (massDescription != null)
				msgs = ((InternalEObject) massDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEquippedEnginesType getMEngines() {
		return mEngines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEngines(MEquippedEnginesType newMEngines, NotificationChain msgs) {
		MEquippedEnginesType oldMEngines = mEngines;
		mEngines = newMEngines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPOWER_UNITS_TYPE__MENGINES, oldMEngines, newMEngines);
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
	public void setMEngines(MEquippedEnginesType newMEngines) {
		if (newMEngines != mEngines) {
			NotificationChain msgs = null;
			if (mEngines != null)
				msgs = ((InternalEObject) mEngines).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MENGINES, null, msgs);
			if (newMEngines != null)
				msgs = ((InternalEObject) newMEngines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MENGINES, null, msgs);
			msgs = basicSetMEngines(newMEngines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPOWER_UNITS_TYPE__MENGINES, newMEngines,
					newMEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBleedAirSystemType getMBleedAirSystem() {
		return mBleedAirSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMBleedAirSystem(MBleedAirSystemType newMBleedAirSystem, NotificationChain msgs) {
		MBleedAirSystemType oldMBleedAirSystem = mBleedAirSystem;
		mBleedAirSystem = newMBleedAirSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM, oldMBleedAirSystem, newMBleedAirSystem);
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
	public void setMBleedAirSystem(MBleedAirSystemType newMBleedAirSystem) {
		if (newMBleedAirSystem != mBleedAirSystem) {
			NotificationChain msgs = null;
			if (mBleedAirSystem != null)
				msgs = ((InternalEObject) mBleedAirSystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM, null, msgs);
			if (newMBleedAirSystem != null)
				msgs = ((InternalEObject) newMBleedAirSystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM, null, msgs);
			msgs = basicSetMBleedAirSystem(newMBleedAirSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM,
					newMBleedAirSystem, newMBleedAirSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEngineControlType getMEngineControl() {
		return mEngineControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEngineControl(MEngineControlType newMEngineControl, NotificationChain msgs) {
		MEngineControlType oldMEngineControl = mEngineControl;
		mEngineControl = newMEngineControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL, oldMEngineControl, newMEngineControl);
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
	public void setMEngineControl(MEngineControlType newMEngineControl) {
		if (newMEngineControl != mEngineControl) {
			NotificationChain msgs = null;
			if (mEngineControl != null)
				msgs = ((InternalEObject) mEngineControl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL, null, msgs);
			if (newMEngineControl != null)
				msgs = ((InternalEObject) newMEngineControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL, null, msgs);
			msgs = basicSetMEngineControl(newMEngineControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL,
					newMEngineControl, newMEngineControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFuelSystemType getMFuelSystem() {
		return mFuelSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFuelSystem(MFuelSystemType newMFuelSystem, NotificationChain msgs) {
		MFuelSystemType oldMFuelSystem = mFuelSystem;
		mFuelSystem = newMFuelSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM, oldMFuelSystem, newMFuelSystem);
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
	public void setMFuelSystem(MFuelSystemType newMFuelSystem) {
		if (newMFuelSystem != mFuelSystem) {
			NotificationChain msgs = null;
			if (mFuelSystem != null)
				msgs = ((InternalEObject) mFuelSystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM, null, msgs);
			if (newMFuelSystem != null)
				msgs = ((InternalEObject) newMFuelSystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM, null, msgs);
			msgs = basicSetMFuelSystem(newMFuelSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM,
					newMFuelSystem, newMFuelSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MInterGasSystemType getMInterGasSystem() {
		return mInterGasSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMInterGasSystem(MInterGasSystemType newMInterGasSystem, NotificationChain msgs) {
		MInterGasSystemType oldMInterGasSystem = mInterGasSystem;
		mInterGasSystem = newMInterGasSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM, oldMInterGasSystem, newMInterGasSystem);
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
	public void setMInterGasSystem(MInterGasSystemType newMInterGasSystem) {
		if (newMInterGasSystem != mInterGasSystem) {
			NotificationChain msgs = null;
			if (mInterGasSystem != null)
				msgs = ((InternalEObject) mInterGasSystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM, null, msgs);
			if (newMInterGasSystem != null)
				msgs = ((InternalEObject) newMInterGasSystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM, null, msgs);
			msgs = basicSetMInterGasSystem(newMInterGasSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM,
					newMInterGasSystem, newMInterGasSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINES:
			return basicSetMEngines(null, msgs);
		case CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM:
			return basicSetMBleedAirSystem(null, msgs);
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL:
			return basicSetMEngineControl(null, msgs);
		case CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM:
			return basicSetMFuelSystem(null, msgs);
		case CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM:
			return basicSetMInterGasSystem(null, msgs);
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
		case CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINES:
			return getMEngines();
		case CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM:
			return getMBleedAirSystem();
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL:
			return getMEngineControl();
		case CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM:
			return getMFuelSystem();
		case CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM:
			return getMInterGasSystem();
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
		case CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINES:
			setMEngines((MEquippedEnginesType) newValue);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM:
			setMBleedAirSystem((MBleedAirSystemType) newValue);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL:
			setMEngineControl((MEngineControlType) newValue);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM:
			setMFuelSystem((MFuelSystemType) newValue);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM:
			setMInterGasSystem((MInterGasSystemType) newValue);
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
		case CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINES:
			setMEngines((MEquippedEnginesType) null);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM:
			setMBleedAirSystem((MBleedAirSystemType) null);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL:
			setMEngineControl((MEngineControlType) null);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM:
			setMFuelSystem((MFuelSystemType) null);
			return;
		case CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM:
			setMInterGasSystem((MInterGasSystemType) null);
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
		case CpacsPackage.MPOWER_UNITS_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINES:
			return mEngines != null;
		case CpacsPackage.MPOWER_UNITS_TYPE__MBLEED_AIR_SYSTEM:
			return mBleedAirSystem != null;
		case CpacsPackage.MPOWER_UNITS_TYPE__MENGINE_CONTROL:
			return mEngineControl != null;
		case CpacsPackage.MPOWER_UNITS_TYPE__MFUEL_SYSTEM:
			return mFuelSystem != null;
		case CpacsPackage.MPOWER_UNITS_TYPE__MINTER_GAS_SYSTEM:
			return mInterGasSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //MPowerUnitsTypeImpl
