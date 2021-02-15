/**
 */
package Cpacs.impl;

import Cpacs.ControlInputsType;
import Cpacs.ControlSurfaceDeflectionsType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LoadCaseEnginesType;
import Cpacs.LoadCaseLandingGearsType;
import Cpacs.LoadCaseSettingsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseSettingsTypeImpl#getControlSurfaces <em>Control Surfaces</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSettingsTypeImpl#getControlInputs <em>Control Inputs</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSettingsTypeImpl#getLandingGears <em>Landing Gears</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSettingsTypeImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSettingsTypeImpl#getCabinPressure <em>Cabin Pressure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseSettingsTypeImpl extends ComplexBaseTypeImpl implements LoadCaseSettingsType {
	/**
	 * The cached value of the '{@link #getControlSurfaces() <em>Control Surfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaces()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceDeflectionsType controlSurfaces;

	/**
	 * The cached value of the '{@link #getControlInputs() <em>Control Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlInputs()
	 * @generated
	 * @ordered
	 */
	protected ControlInputsType controlInputs;

	/**
	 * The cached value of the '{@link #getLandingGears() <em>Landing Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGears()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseLandingGearsType landingGears;

	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseEnginesType engines;

	/**
	 * The cached value of the '{@link #getCabinPressure() <em>Cabin Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabinPressure()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cabinPressure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseSettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseSettingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceDeflectionsType getControlSurfaces() {
		return controlSurfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaces(ControlSurfaceDeflectionsType newControlSurfaces,
			NotificationChain msgs) {
		ControlSurfaceDeflectionsType oldControlSurfaces = controlSurfaces;
		controlSurfaces = newControlSurfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES, oldControlSurfaces, newControlSurfaces);
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
	public void setControlSurfaces(ControlSurfaceDeflectionsType newControlSurfaces) {
		if (newControlSurfaces != controlSurfaces) {
			NotificationChain msgs = null;
			if (controlSurfaces != null)
				msgs = ((InternalEObject) controlSurfaces).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES, null, msgs);
			if (newControlSurfaces != null)
				msgs = ((InternalEObject) newControlSurfaces).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES, null, msgs);
			msgs = basicSetControlSurfaces(newControlSurfaces, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES, newControlSurfaces, newControlSurfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlInputsType getControlInputs() {
		return controlInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlInputs(ControlInputsType newControlInputs, NotificationChain msgs) {
		ControlInputsType oldControlInputs = controlInputs;
		controlInputs = newControlInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS, oldControlInputs, newControlInputs);
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
	public void setControlInputs(ControlInputsType newControlInputs) {
		if (newControlInputs != controlInputs) {
			NotificationChain msgs = null;
			if (controlInputs != null)
				msgs = ((InternalEObject) controlInputs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS, null, msgs);
			if (newControlInputs != null)
				msgs = ((InternalEObject) newControlInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS, null, msgs);
			msgs = basicSetControlInputs(newControlInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS,
					newControlInputs, newControlInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseLandingGearsType getLandingGears() {
		return landingGears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGears(LoadCaseLandingGearsType newLandingGears, NotificationChain msgs) {
		LoadCaseLandingGearsType oldLandingGears = landingGears;
		landingGears = newLandingGears;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS, oldLandingGears, newLandingGears);
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
	public void setLandingGears(LoadCaseLandingGearsType newLandingGears) {
		if (newLandingGears != landingGears) {
			NotificationChain msgs = null;
			if (landingGears != null)
				msgs = ((InternalEObject) landingGears).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS, null, msgs);
			if (newLandingGears != null)
				msgs = ((InternalEObject) newLandingGears).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS, null, msgs);
			msgs = basicSetLandingGears(newLandingGears, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS,
					newLandingGears, newLandingGears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseEnginesType getEngines() {
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngines(LoadCaseEnginesType newEngines, NotificationChain msgs) {
		LoadCaseEnginesType oldEngines = engines;
		engines = newEngines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES, oldEngines, newEngines);
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
	public void setEngines(LoadCaseEnginesType newEngines) {
		if (newEngines != engines) {
			NotificationChain msgs = null;
			if (engines != null)
				msgs = ((InternalEObject) engines).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES, null, msgs);
			if (newEngines != null)
				msgs = ((InternalEObject) newEngines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES, null, msgs);
			msgs = basicSetEngines(newEngines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES,
					newEngines, newEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCabinPressure() {
		return cabinPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCabinPressure(DoubleBaseType newCabinPressure, NotificationChain msgs) {
		DoubleBaseType oldCabinPressure = cabinPressure;
		cabinPressure = newCabinPressure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE, oldCabinPressure, newCabinPressure);
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
	public void setCabinPressure(DoubleBaseType newCabinPressure) {
		if (newCabinPressure != cabinPressure) {
			NotificationChain msgs = null;
			if (cabinPressure != null)
				msgs = ((InternalEObject) cabinPressure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE, null, msgs);
			if (newCabinPressure != null)
				msgs = ((InternalEObject) newCabinPressure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE, null, msgs);
			msgs = basicSetCabinPressure(newCabinPressure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE,
					newCabinPressure, newCabinPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES:
			return basicSetControlSurfaces(null, msgs);
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS:
			return basicSetControlInputs(null, msgs);
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS:
			return basicSetLandingGears(null, msgs);
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES:
			return basicSetEngines(null, msgs);
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE:
			return basicSetCabinPressure(null, msgs);
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
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES:
			return getControlSurfaces();
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS:
			return getControlInputs();
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS:
			return getLandingGears();
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES:
			return getEngines();
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE:
			return getCabinPressure();
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
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES:
			setControlSurfaces((ControlSurfaceDeflectionsType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS:
			setControlInputs((ControlInputsType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS:
			setLandingGears((LoadCaseLandingGearsType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES:
			setEngines((LoadCaseEnginesType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE:
			setCabinPressure((DoubleBaseType) newValue);
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
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES:
			setControlSurfaces((ControlSurfaceDeflectionsType) null);
			return;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS:
			setControlInputs((ControlInputsType) null);
			return;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS:
			setLandingGears((LoadCaseLandingGearsType) null);
			return;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES:
			setEngines((LoadCaseEnginesType) null);
			return;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE:
			setCabinPressure((DoubleBaseType) null);
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
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_SURFACES:
			return controlSurfaces != null;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CONTROL_INPUTS:
			return controlInputs != null;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__LANDING_GEARS:
			return landingGears != null;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__ENGINES:
			return engines != null;
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE__CABIN_PRESSURE:
			return cabinPressure != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseSettingsTypeImpl
