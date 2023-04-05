/**
 */
package Cpacs.impl;

import Cpacs.AeroCasesType;
import Cpacs.CpacsPackage;
import Cpacs.CrashLoadCasesType;
import Cpacs.FlightLoadCasesType;
import Cpacs.GroundLoadCasesType;
import Cpacs.LoadCasesType;

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
 *   <li>{@link Cpacs.impl.LoadCasesTypeImpl#getAeroCases <em>Aero Cases</em>}</li>
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
	 * The cached value of the '{@link #getAeroCases() <em>Aero Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroCases()
	 * @generated
	 * @ordered
	 */
	protected AeroCasesType aeroCases;

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
	public AeroCasesType getAeroCases() {
		return aeroCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroCases(AeroCasesType newAeroCases, NotificationChain msgs) {
		AeroCasesType oldAeroCases = aeroCases;
		aeroCases = newAeroCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASES_TYPE__AERO_CASES, oldAeroCases, newAeroCases);
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
	public void setAeroCases(AeroCasesType newAeroCases) {
		if (newAeroCases != aeroCases) {
			NotificationChain msgs = null;
			if (aeroCases != null)
				msgs = ((InternalEObject) aeroCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__AERO_CASES, null, msgs);
			if (newAeroCases != null)
				msgs = ((InternalEObject) newAeroCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASES_TYPE__AERO_CASES, null, msgs);
			msgs = basicSetAeroCases(newAeroCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASES_TYPE__AERO_CASES,
					newAeroCases, newAeroCases));
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
		case CpacsPackage.LOAD_CASES_TYPE__AERO_CASES:
			return basicSetAeroCases(null, msgs);
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
		case CpacsPackage.LOAD_CASES_TYPE__AERO_CASES:
			return getAeroCases();
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
		case CpacsPackage.LOAD_CASES_TYPE__AERO_CASES:
			setAeroCases((AeroCasesType) newValue);
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
		case CpacsPackage.LOAD_CASES_TYPE__AERO_CASES:
			setAeroCases((AeroCasesType) null);
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
		case CpacsPackage.LOAD_CASES_TYPE__AERO_CASES:
			return aeroCases != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCasesTypeImpl
