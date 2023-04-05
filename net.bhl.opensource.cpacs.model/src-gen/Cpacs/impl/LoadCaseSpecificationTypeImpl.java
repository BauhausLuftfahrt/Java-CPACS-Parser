/**
 */
package Cpacs.impl;

import Cpacs.ConfigurationType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EnvironmentType;
import Cpacs.FlightLoadConditionsType;
import Cpacs.LoadCaseSpecificationType;
import Cpacs.LoadCaseSuperpositionType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Specification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getAeroCaseUID <em>Aero Case UID</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getControllerDescription <em>Controller Description</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getLoadCaseSuperposition <em>Load Case Superposition</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getLoadConditions <em>Load Conditions</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseSpecificationTypeImpl#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseSpecificationTypeImpl extends ComplexBaseTypeImpl implements LoadCaseSpecificationType {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentType environment;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType altitude;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType machNumber;

	/**
	 * The cached value of the '{@link #getAeroCaseUID() <em>Aero Case UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroCaseUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType aeroCaseUID;

	/**
	 * The cached value of the '{@link #getControllerDescription() <em>Controller Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType controllerDescription;

	/**
	 * The cached value of the '{@link #getLoadCaseSuperposition() <em>Load Case Superposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadCaseSuperposition()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseSuperpositionType loadCaseSuperposition;

	/**
	 * The cached value of the '{@link #getLoadConditions() <em>Load Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadConditions()
	 * @generated
	 * @ordered
	 */
	protected FlightLoadConditionsType loadConditions;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationType configuration;

	/**
	 * The cached value of the '{@link #getWeightAndBalanceUID() <em>Weight And Balance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightAndBalanceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType weightAndBalanceUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseSpecificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseSpecificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentType getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(EnvironmentType newEnvironment, NotificationChain msgs) {
		EnvironmentType oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT, oldEnvironment, newEnvironment);
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
	public void setEnvironment(EnvironmentType newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject) environment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleBaseType newAltitude, NotificationChain msgs) {
		DoubleBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(DoubleBaseType newMachNumber, NotificationChain msgs) {
		DoubleBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(DoubleBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER, newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getAeroCaseUID() {
		return aeroCaseUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroCaseUID(StringUIDBaseType newAeroCaseUID, NotificationChain msgs) {
		StringUIDBaseType oldAeroCaseUID = aeroCaseUID;
		aeroCaseUID = newAeroCaseUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID, oldAeroCaseUID, newAeroCaseUID);
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
	public void setAeroCaseUID(StringUIDBaseType newAeroCaseUID) {
		if (newAeroCaseUID != aeroCaseUID) {
			NotificationChain msgs = null;
			if (aeroCaseUID != null)
				msgs = ((InternalEObject) aeroCaseUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID, null, msgs);
			if (newAeroCaseUID != null)
				msgs = ((InternalEObject) newAeroCaseUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID, null, msgs);
			msgs = basicSetAeroCaseUID(newAeroCaseUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID, newAeroCaseUID, newAeroCaseUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getControllerDescription() {
		return controllerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControllerDescription(StringBaseType newControllerDescription,
			NotificationChain msgs) {
		StringBaseType oldControllerDescription = controllerDescription;
		controllerDescription = newControllerDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION, oldControllerDescription,
					newControllerDescription);
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
	public void setControllerDescription(StringBaseType newControllerDescription) {
		if (newControllerDescription != controllerDescription) {
			NotificationChain msgs = null;
			if (controllerDescription != null)
				msgs = ((InternalEObject) controllerDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION,
						null, msgs);
			if (newControllerDescription != null)
				msgs = ((InternalEObject) newControllerDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION,
						null, msgs);
			msgs = basicSetControllerDescription(newControllerDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION, newControllerDescription,
					newControllerDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseSuperpositionType getLoadCaseSuperposition() {
		return loadCaseSuperposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadCaseSuperposition(LoadCaseSuperpositionType newLoadCaseSuperposition,
			NotificationChain msgs) {
		LoadCaseSuperpositionType oldLoadCaseSuperposition = loadCaseSuperposition;
		loadCaseSuperposition = newLoadCaseSuperposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION, oldLoadCaseSuperposition,
					newLoadCaseSuperposition);
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
	public void setLoadCaseSuperposition(LoadCaseSuperpositionType newLoadCaseSuperposition) {
		if (newLoadCaseSuperposition != loadCaseSuperposition) {
			NotificationChain msgs = null;
			if (loadCaseSuperposition != null)
				msgs = ((InternalEObject) loadCaseSuperposition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION,
						null, msgs);
			if (newLoadCaseSuperposition != null)
				msgs = ((InternalEObject) newLoadCaseSuperposition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION,
						null, msgs);
			msgs = basicSetLoadCaseSuperposition(newLoadCaseSuperposition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION, newLoadCaseSuperposition,
					newLoadCaseSuperposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightLoadConditionsType getLoadConditions() {
		return loadConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadConditions(FlightLoadConditionsType newLoadConditions,
			NotificationChain msgs) {
		FlightLoadConditionsType oldLoadConditions = loadConditions;
		loadConditions = newLoadConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS, oldLoadConditions, newLoadConditions);
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
	public void setLoadConditions(FlightLoadConditionsType newLoadConditions) {
		if (newLoadConditions != loadConditions) {
			NotificationChain msgs = null;
			if (loadConditions != null)
				msgs = ((InternalEObject) loadConditions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS, null,
						msgs);
			if (newLoadConditions != null)
				msgs = ((InternalEObject) newLoadConditions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS, null,
						msgs);
			msgs = basicSetLoadConditions(newLoadConditions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS, newLoadConditions, newLoadConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationType getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(ConfigurationType newConfiguration, NotificationChain msgs) {
		ConfigurationType oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION, oldConfiguration, newConfiguration);
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
	public void setConfiguration(ConfigurationType newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getWeightAndBalanceUID() {
		return weightAndBalanceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeightAndBalanceUID(StringUIDBaseType newWeightAndBalanceUID,
			NotificationChain msgs) {
		StringUIDBaseType oldWeightAndBalanceUID = weightAndBalanceUID;
		weightAndBalanceUID = newWeightAndBalanceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID, oldWeightAndBalanceUID,
					newWeightAndBalanceUID);
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
	public void setWeightAndBalanceUID(StringUIDBaseType newWeightAndBalanceUID) {
		if (newWeightAndBalanceUID != weightAndBalanceUID) {
			NotificationChain msgs = null;
			if (weightAndBalanceUID != null)
				msgs = ((InternalEObject) weightAndBalanceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID,
						null, msgs);
			if (newWeightAndBalanceUID != null)
				msgs = ((InternalEObject) newWeightAndBalanceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID,
						null, msgs);
			msgs = basicSetWeightAndBalanceUID(newWeightAndBalanceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID, newWeightAndBalanceUID,
					newWeightAndBalanceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID:
			return basicSetAeroCaseUID(null, msgs);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION:
			return basicSetControllerDescription(null, msgs);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION:
			return basicSetLoadCaseSuperposition(null, msgs);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS:
			return basicSetLoadConditions(null, msgs);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			return basicSetWeightAndBalanceUID(null, msgs);
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
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			return getEnvironment();
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID:
			return getAeroCaseUID();
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION:
			return getControllerDescription();
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION:
			return getLoadCaseSuperposition();
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS:
			return getLoadConditions();
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			return getConfiguration();
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			return getWeightAndBalanceUID();
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
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID:
			setAeroCaseUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION:
			setControllerDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION:
			setLoadCaseSuperposition((LoadCaseSuperpositionType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS:
			setLoadConditions((FlightLoadConditionsType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			setConfiguration((ConfigurationType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			setWeightAndBalanceUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) null);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID:
			setAeroCaseUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION:
			setControllerDescription((StringBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION:
			setLoadCaseSuperposition((LoadCaseSuperpositionType) null);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS:
			setLoadConditions((FlightLoadConditionsType) null);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			setConfiguration((ConfigurationType) null);
			return;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			setWeightAndBalanceUID((StringUIDBaseType) null);
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
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			return environment != null;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__AERO_CASE_UID:
			return aeroCaseUID != null;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONTROLLER_DESCRIPTION:
			return controllerDescription != null;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CASE_SUPERPOSITION:
			return loadCaseSuperposition != null;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__LOAD_CONDITIONS:
			return loadConditions != null;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			return configuration != null;
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			return weightAndBalanceUID != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseSpecificationTypeImpl
