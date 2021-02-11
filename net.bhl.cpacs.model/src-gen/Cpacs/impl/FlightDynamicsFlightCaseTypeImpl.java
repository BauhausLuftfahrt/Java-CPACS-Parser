/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlightDynamicsFlightCaseType;
import Cpacs.FlightDynamicsLinearModelType;
import Cpacs.FlightDynamicsTrimResultType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Dynamics Flight Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getStandardAltitude <em>Standard Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getVCAS <em>VCAS</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getGear <em>Gear</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getLinearModel <em>Linear Model</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getTrimResult <em>Trim Result</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightDynamicsFlightCaseTypeImpl extends ComplexBaseTypeImpl implements FlightDynamicsFlightCaseType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

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
	 * The cached value of the '{@link #getStandardAltitude() <em>Standard Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType standardAltitude;

	/**
	 * The cached value of the '{@link #getVCAS() <em>VCAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVCAS()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vCAS;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType configuration;

	/**
	 * The cached value of the '{@link #getGear() <em>Gear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGear()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType gear;

	/**
	 * The cached value of the '{@link #getLinearModel() <em>Linear Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearModel()
	 * @generated
	 * @ordered
	 */
	protected FlightDynamicsLinearModelType linearModel;

	/**
	 * The cached value of the '{@link #getTrimResult() <em>Trim Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimResult()
	 * @generated
	 * @ordered
	 */
	protected FlightDynamicsTrimResultType trimResult;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightDynamicsFlightCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightDynamicsFlightCaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME,
					newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION, null,
						msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION, null,
						msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION, newDescription, newDescription));
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
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID, oldWeightAndBalanceUID,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID,
						null, msgs);
			if (newWeightAndBalanceUID != null)
				msgs = ((InternalEObject) newWeightAndBalanceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID,
						null, msgs);
			msgs = basicSetWeightAndBalanceUID(newWeightAndBalanceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID, newWeightAndBalanceUID,
					newWeightAndBalanceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStandardAltitude() {
		return standardAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardAltitude(DoubleBaseType newStandardAltitude, NotificationChain msgs) {
		DoubleBaseType oldStandardAltitude = standardAltitude;
		standardAltitude = newStandardAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE, oldStandardAltitude,
					newStandardAltitude);
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
	public void setStandardAltitude(DoubleBaseType newStandardAltitude) {
		if (newStandardAltitude != standardAltitude) {
			NotificationChain msgs = null;
			if (standardAltitude != null)
				msgs = ((InternalEObject) standardAltitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE, null,
						msgs);
			if (newStandardAltitude != null)
				msgs = ((InternalEObject) newStandardAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE, null,
						msgs);
			msgs = basicSetStandardAltitude(newStandardAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE, newStandardAltitude,
					newStandardAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVCAS() {
		return vCAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVCAS(DoubleBaseType newVCAS, NotificationChain msgs) {
		DoubleBaseType oldVCAS = vCAS;
		vCAS = newVCAS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS, oldVCAS, newVCAS);
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
	public void setVCAS(DoubleBaseType newVCAS) {
		if (newVCAS != vCAS) {
			NotificationChain msgs = null;
			if (vCAS != null)
				msgs = ((InternalEObject) vCAS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS, null, msgs);
			if (newVCAS != null)
				msgs = ((InternalEObject) newVCAS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS, null, msgs);
			msgs = basicSetVCAS(newVCAS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS,
					newVCAS, newVCAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(IntegerBaseType newConfiguration, NotificationChain msgs) {
		IntegerBaseType oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION, oldConfiguration, newConfiguration);
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
	public void setConfiguration(IntegerBaseType newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION, null,
						msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION, null,
						msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getGear() {
		return gear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGear(IntegerBaseType newGear, NotificationChain msgs) {
		IntegerBaseType oldGear = gear;
		gear = newGear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR, oldGear, newGear);
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
	public void setGear(IntegerBaseType newGear) {
		if (newGear != gear) {
			NotificationChain msgs = null;
			if (gear != null)
				msgs = ((InternalEObject) gear).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR, null, msgs);
			if (newGear != null)
				msgs = ((InternalEObject) newGear).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR, null, msgs);
			msgs = basicSetGear(newGear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR,
					newGear, newGear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsLinearModelType getLinearModel() {
		return linearModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearModel(FlightDynamicsLinearModelType newLinearModel, NotificationChain msgs) {
		FlightDynamicsLinearModelType oldLinearModel = linearModel;
		linearModel = newLinearModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL, oldLinearModel, newLinearModel);
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
	public void setLinearModel(FlightDynamicsLinearModelType newLinearModel) {
		if (newLinearModel != linearModel) {
			NotificationChain msgs = null;
			if (linearModel != null)
				msgs = ((InternalEObject) linearModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL, null,
						msgs);
			if (newLinearModel != null)
				msgs = ((InternalEObject) newLinearModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL, null,
						msgs);
			msgs = basicSetLinearModel(newLinearModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL, newLinearModel, newLinearModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsTrimResultType getTrimResult() {
		return trimResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrimResult(FlightDynamicsTrimResultType newTrimResult, NotificationChain msgs) {
		FlightDynamicsTrimResultType oldTrimResult = trimResult;
		trimResult = newTrimResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT, oldTrimResult, newTrimResult);
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
	public void setTrimResult(FlightDynamicsTrimResultType newTrimResult) {
		if (newTrimResult != trimResult) {
			NotificationChain msgs = null;
			if (trimResult != null)
				msgs = ((InternalEObject) trimResult).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT, null,
						msgs);
			if (newTrimResult != null)
				msgs = ((InternalEObject) newTrimResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT, null,
						msgs);
			msgs = basicSetTrimResult(newTrimResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT, newTrimResult, newTrimResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID:
			return basicSetWeightAndBalanceUID(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE:
			return basicSetStandardAltitude(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS:
			return basicSetVCAS(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR:
			return basicSetGear(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL:
			return basicSetLinearModel(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT:
			return basicSetTrimResult(null, msgs);
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
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME:
			return getName();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID:
			return getWeightAndBalanceUID();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE:
			return getStandardAltitude();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS:
			return getVCAS();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION:
			return getConfiguration();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR:
			return getGear();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL:
			return getLinearModel();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT:
			return getTrimResult();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__UID:
			return getUID();
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
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID:
			setWeightAndBalanceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE:
			setStandardAltitude((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS:
			setVCAS((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION:
			setConfiguration((IntegerBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR:
			setGear((IntegerBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL:
			setLinearModel((FlightDynamicsLinearModelType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT:
			setTrimResult((FlightDynamicsTrimResultType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID:
			setWeightAndBalanceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE:
			setStandardAltitude((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS:
			setVCAS((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION:
			setConfiguration((IntegerBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR:
			setGear((IntegerBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL:
			setLinearModel((FlightDynamicsLinearModelType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT:
			setTrimResult((FlightDynamicsTrimResultType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__WEIGHT_AND_BALANCE_UID:
			return weightAndBalanceUID != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__STANDARD_ALTITUDE:
			return standardAltitude != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__VCAS:
			return vCAS != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__CONFIGURATION:
			return configuration != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__GEAR:
			return gear != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__LINEAR_MODEL:
			return linearModel != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__TRIM_RESULT:
			return trimResult != null;
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //FlightDynamicsFlightCaseTypeImpl
