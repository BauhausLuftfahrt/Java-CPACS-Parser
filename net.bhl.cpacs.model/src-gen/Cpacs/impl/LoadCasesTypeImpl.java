/**
 */
package Cpacs.impl;

import Cpacs.AeroDataSetsForLoadsType;
import Cpacs.CpacsPackage;
import Cpacs.CrashLoadCasesType;
import Cpacs.FlightLoadCasesType;
import Cpacs.GroundLoadCasesType;
import Cpacs.LoadCasesType;
import Cpacs.LoadsEnvelopeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCasesTypeImpl#getCrashLoadCases <em>Crash Load Cases</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCasesTypeImpl#getFlightLoadCases <em>Flight Load Cases</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCasesTypeImpl#getGroundLoadCases <em>Ground Load Cases</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCasesTypeImpl#getAeroDataSetsForLoads <em>Aero Data Sets For Loads</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCasesTypeImpl#getLoadsEnvelope <em>Loads Envelope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCasesTypeImpl extends ComplexBaseTypeImpl implements LoadCasesType {
	/**
	 * The cached value of the '{@link #getCrashLoadCases() <em>Crash Load Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrashLoadCases()
	 * @generated
	 * @ordered
	 */
	protected CrashLoadCasesType crashLoadCases;

	/**
	 * The cached value of the '{@link #getFlightLoadCases() <em>Flight Load Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightLoadCases()
	 * @generated
	 * @ordered
	 */
	protected FlightLoadCasesType flightLoadCases;

	/**
	 * The cached value of the '{@link #getGroundLoadCases() <em>Ground Load Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundLoadCases()
	 * @generated
	 * @ordered
	 */
	protected GroundLoadCasesType groundLoadCases;

	/**
	 * The cached value of the '{@link #getAeroDataSetsForLoads() <em>Aero Data Sets For Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroDataSetsForLoads()
	 * @generated
	 * @ordered
	 */
	protected AeroDataSetsForLoadsType aeroDataSetsForLoads;

	/**
	 * The cached value of the '{@link #getLoadsEnvelope() <em>Loads Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadsEnvelope()
	 * @generated
	 * @ordered
	 */
	protected LoadsEnvelopeType loadsEnvelope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrashLoadCasesType getCrashLoadCases() {
		return crashLoadCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrashLoadCases(CrashLoadCasesType newCrashLoadCases, NotificationChain msgs) {
		CrashLoadCasesType oldCrashLoadCases = crashLoadCases;
		crashLoadCases = newCrashLoadCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES, oldCrashLoadCases, newCrashLoadCases);
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
	public void setCrashLoadCases(CrashLoadCasesType newCrashLoadCases) {
		if (newCrashLoadCases != crashLoadCases) {
			NotificationChain msgs = null;
			if (crashLoadCases != null)
				msgs = ((InternalEObject) crashLoadCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES, null, msgs);
			if (newCrashLoadCases != null)
				msgs = ((InternalEObject) newCrashLoadCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES, null, msgs);
			msgs = basicSetCrashLoadCases(newCrashLoadCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES,
					newCrashLoadCases, newCrashLoadCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightLoadCasesType getFlightLoadCases() {
		return flightLoadCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightLoadCases(FlightLoadCasesType newFlightLoadCases, NotificationChain msgs) {
		FlightLoadCasesType oldFlightLoadCases = flightLoadCases;
		flightLoadCases = newFlightLoadCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES, oldFlightLoadCases, newFlightLoadCases);
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
	public void setFlightLoadCases(FlightLoadCasesType newFlightLoadCases) {
		if (newFlightLoadCases != flightLoadCases) {
			NotificationChain msgs = null;
			if (flightLoadCases != null)
				msgs = ((InternalEObject) flightLoadCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES, null, msgs);
			if (newFlightLoadCases != null)
				msgs = ((InternalEObject) newFlightLoadCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES, null, msgs);
			msgs = basicSetFlightLoadCases(newFlightLoadCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES,
					newFlightLoadCases, newFlightLoadCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundLoadCasesType getGroundLoadCases() {
		return groundLoadCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundLoadCases(GroundLoadCasesType newGroundLoadCases, NotificationChain msgs) {
		GroundLoadCasesType oldGroundLoadCases = groundLoadCases;
		groundLoadCases = newGroundLoadCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES, oldGroundLoadCases, newGroundLoadCases);
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
	public void setGroundLoadCases(GroundLoadCasesType newGroundLoadCases) {
		if (newGroundLoadCases != groundLoadCases) {
			NotificationChain msgs = null;
			if (groundLoadCases != null)
				msgs = ((InternalEObject) groundLoadCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES, null, msgs);
			if (newGroundLoadCases != null)
				msgs = ((InternalEObject) newGroundLoadCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES, null, msgs);
			msgs = basicSetGroundLoadCases(newGroundLoadCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES,
					newGroundLoadCases, newGroundLoadCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroDataSetsForLoadsType getAeroDataSetsForLoads() {
		return aeroDataSetsForLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroDataSetsForLoads(AeroDataSetsForLoadsType newAeroDataSetsForLoads,
			NotificationChain msgs) {
		AeroDataSetsForLoadsType oldAeroDataSetsForLoads = aeroDataSetsForLoads;
		aeroDataSetsForLoads = newAeroDataSetsForLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS, oldAeroDataSetsForLoads,
					newAeroDataSetsForLoads);
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
	public void setAeroDataSetsForLoads(AeroDataSetsForLoadsType newAeroDataSetsForLoads) {
		if (newAeroDataSetsForLoads != aeroDataSetsForLoads) {
			NotificationChain msgs = null;
			if (aeroDataSetsForLoads != null)
				msgs = ((InternalEObject) aeroDataSetsForLoads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS, null, msgs);
			if (newAeroDataSetsForLoads != null)
				msgs = ((InternalEObject) newAeroDataSetsForLoads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS, null, msgs);
			msgs = basicSetAeroDataSetsForLoads(newAeroDataSetsForLoads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS, newAeroDataSetsForLoads,
					newAeroDataSetsForLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadsEnvelopeType getLoadsEnvelope() {
		return loadsEnvelope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadsEnvelope(LoadsEnvelopeType newLoadsEnvelope, NotificationChain msgs) {
		LoadsEnvelopeType oldLoadsEnvelope = loadsEnvelope;
		loadsEnvelope = newLoadsEnvelope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE, oldLoadsEnvelope, newLoadsEnvelope);
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
	public void setLoadsEnvelope(LoadsEnvelopeType newLoadsEnvelope) {
		if (newLoadsEnvelope != loadsEnvelope) {
			NotificationChain msgs = null;
			if (loadsEnvelope != null)
				msgs = ((InternalEObject) loadsEnvelope).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE, null, msgs);
			if (newLoadsEnvelope != null)
				msgs = ((InternalEObject) newLoadsEnvelope).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE, null, msgs);
			msgs = basicSetLoadsEnvelope(newLoadsEnvelope, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE,
					newLoadsEnvelope, newLoadsEnvelope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES:
			return basicSetCrashLoadCases(null, msgs);
		case CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES:
			return basicSetFlightLoadCases(null, msgs);
		case CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES:
			return basicSetGroundLoadCases(null, msgs);
		case CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS:
			return basicSetAeroDataSetsForLoads(null, msgs);
		case CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE:
			return basicSetLoadsEnvelope(null, msgs);
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
		case CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES:
			return getCrashLoadCases();
		case CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES:
			return getFlightLoadCases();
		case CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES:
			return getGroundLoadCases();
		case CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS:
			return getAeroDataSetsForLoads();
		case CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE:
			return getLoadsEnvelope();
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
		case CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES:
			setCrashLoadCases((CrashLoadCasesType) newValue);
			return;
		case CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES:
			setFlightLoadCases((FlightLoadCasesType) newValue);
			return;
		case CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES:
			setGroundLoadCases((GroundLoadCasesType) newValue);
			return;
		case CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS:
			setAeroDataSetsForLoads((AeroDataSetsForLoadsType) newValue);
			return;
		case CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE:
			setLoadsEnvelope((LoadsEnvelopeType) newValue);
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
		case CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES:
			setCrashLoadCases((CrashLoadCasesType) null);
			return;
		case CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES:
			setFlightLoadCases((FlightLoadCasesType) null);
			return;
		case CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES:
			setGroundLoadCases((GroundLoadCasesType) null);
			return;
		case CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS:
			setAeroDataSetsForLoads((AeroDataSetsForLoadsType) null);
			return;
		case CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE:
			setLoadsEnvelope((LoadsEnvelopeType) null);
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
		case CpacsPackage.LOAD_CASES_TYPE__CRASH_LOAD_CASES:
			return crashLoadCases != null;
		case CpacsPackage.LOAD_CASES_TYPE__FLIGHT_LOAD_CASES:
			return flightLoadCases != null;
		case CpacsPackage.LOAD_CASES_TYPE__GROUND_LOAD_CASES:
			return groundLoadCases != null;
		case CpacsPackage.LOAD_CASES_TYPE__AERO_DATA_SETS_FOR_LOADS:
			return aeroDataSetsForLoads != null;
		case CpacsPackage.LOAD_CASES_TYPE__LOADS_ENVELOPE:
			return loadsEnvelope != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCasesTypeImpl
