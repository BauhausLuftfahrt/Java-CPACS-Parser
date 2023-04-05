/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPerformanceRequirementType;
import Cpacs.PerformanceMapSelectionType;
import Cpacs.PerformanceRequirementConfigurationsType;
import Cpacs.RequirementClassificationType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.UIDSequenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getRequirementClassification <em>Requirement Classification</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getMissionUID <em>Mission UID</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getPerformanceMaps <em>Performance Maps</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceRequirementTypeImpl extends ComplexBaseTypeImpl
		implements FlightPerformanceRequirementType {
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
	 * The cached value of the '{@link #getRequirementClassification() <em>Requirement Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementClassification()
	 * @generated
	 * @ordered
	 */
	protected RequirementClassificationType requirementClassification;

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
	 * The cached value of the '{@link #getMissionUID() <em>Mission UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType missionUID;

	/**
	 * The cached value of the '{@link #getPointPerformanceUIDs() <em>Point Performance UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointPerformanceUIDs()
	 * @generated
	 * @ordered
	 */
	protected UIDSequenceType pointPerformanceUIDs;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected PerformanceRequirementConfigurationsType configurations;

	/**
	 * The cached value of the '{@link #getPerformanceMaps() <em>Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMaps()
	 * @generated
	 * @ordered
	 */
	protected PerformanceMapSelectionType performanceMaps;

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
	protected FlightPerformanceRequirementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceRequirementType();
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
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME, newName, newName));
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
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION, null,
						msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION, null,
						msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementClassificationType getRequirementClassification() {
		return requirementClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirementClassification(
			RequirementClassificationType newRequirementClassification, NotificationChain msgs) {
		RequirementClassificationType oldRequirementClassification = requirementClassification;
		requirementClassification = newRequirementClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION,
					oldRequirementClassification, newRequirementClassification);
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
	public void setRequirementClassification(RequirementClassificationType newRequirementClassification) {
		if (newRequirementClassification != requirementClassification) {
			NotificationChain msgs = null;
			if (requirementClassification != null)
				msgs = ((InternalEObject) requirementClassification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION,
						null, msgs);
			if (newRequirementClassification != null)
				msgs = ((InternalEObject) newRequirementClassification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION,
						null, msgs);
			msgs = basicSetRequirementClassification(newRequirementClassification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION,
					newRequirementClassification, newRequirementClassification));
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
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID, oldWeightAndBalanceUID,
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
				msgs = ((InternalEObject) weightAndBalanceUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID, null, msgs);
			if (newWeightAndBalanceUID != null)
				msgs = ((InternalEObject) newWeightAndBalanceUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID, null, msgs);
			msgs = basicSetWeightAndBalanceUID(newWeightAndBalanceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID, newWeightAndBalanceUID,
					newWeightAndBalanceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMissionUID() {
		return missionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissionUID(StringUIDBaseType newMissionUID, NotificationChain msgs) {
		StringUIDBaseType oldMissionUID = missionUID;
		missionUID = newMissionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID, oldMissionUID, newMissionUID);
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
	public void setMissionUID(StringUIDBaseType newMissionUID) {
		if (newMissionUID != missionUID) {
			NotificationChain msgs = null;
			if (missionUID != null)
				msgs = ((InternalEObject) missionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID, null,
						msgs);
			if (newMissionUID != null)
				msgs = ((InternalEObject) newMissionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID, null,
						msgs);
			msgs = basicSetMissionUID(newMissionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID, newMissionUID, newMissionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDSequenceType getPointPerformanceUIDs() {
		return pointPerformanceUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointPerformanceUIDs(UIDSequenceType newPointPerformanceUIDs,
			NotificationChain msgs) {
		UIDSequenceType oldPointPerformanceUIDs = pointPerformanceUIDs;
		pointPerformanceUIDs = newPointPerformanceUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS, oldPointPerformanceUIDs,
					newPointPerformanceUIDs);
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
	public void setPointPerformanceUIDs(UIDSequenceType newPointPerformanceUIDs) {
		if (newPointPerformanceUIDs != pointPerformanceUIDs) {
			NotificationChain msgs = null;
			if (pointPerformanceUIDs != null)
				msgs = ((InternalEObject) pointPerformanceUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS,
						null, msgs);
			if (newPointPerformanceUIDs != null)
				msgs = ((InternalEObject) newPointPerformanceUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS,
						null, msgs);
			msgs = basicSetPointPerformanceUIDs(newPointPerformanceUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS, newPointPerformanceUIDs,
					newPointPerformanceUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceRequirementConfigurationsType getConfigurations() {
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurations(PerformanceRequirementConfigurationsType newConfigurations,
			NotificationChain msgs) {
		PerformanceRequirementConfigurationsType oldConfigurations = configurations;
		configurations = newConfigurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS, oldConfigurations,
					newConfigurations);
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
	public void setConfigurations(PerformanceRequirementConfigurationsType newConfigurations) {
		if (newConfigurations != configurations) {
			NotificationChain msgs = null;
			if (configurations != null)
				msgs = ((InternalEObject) configurations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS, null,
						msgs);
			if (newConfigurations != null)
				msgs = ((InternalEObject) newConfigurations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS, null,
						msgs);
			msgs = basicSetConfigurations(newConfigurations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS, newConfigurations,
					newConfigurations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceMapSelectionType getPerformanceMaps() {
		return performanceMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceMaps(PerformanceMapSelectionType newPerformanceMaps,
			NotificationChain msgs) {
		PerformanceMapSelectionType oldPerformanceMaps = performanceMaps;
		performanceMaps = newPerformanceMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS, oldPerformanceMaps,
					newPerformanceMaps);
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
	public void setPerformanceMaps(PerformanceMapSelectionType newPerformanceMaps) {
		if (newPerformanceMaps != performanceMaps) {
			NotificationChain msgs = null;
			if (performanceMaps != null)
				msgs = ((InternalEObject) performanceMaps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS,
						null, msgs);
			if (newPerformanceMaps != null)
				msgs = ((InternalEObject) newPerformanceMaps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS,
						null, msgs);
			msgs = basicSetPerformanceMaps(newPerformanceMaps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS, newPerformanceMaps,
					newPerformanceMaps));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__UID,
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION:
			return basicSetRequirementClassification(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID:
			return basicSetWeightAndBalanceUID(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID:
			return basicSetMissionUID(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS:
			return basicSetPointPerformanceUIDs(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS:
			return basicSetConfigurations(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS:
			return basicSetPerformanceMaps(null, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION:
			return getRequirementClassification();
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID:
			return getWeightAndBalanceUID();
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID:
			return getMissionUID();
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS:
			return getPointPerformanceUIDs();
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS:
			return getConfigurations();
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS:
			return getPerformanceMaps();
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__UID:
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION:
			setRequirementClassification((RequirementClassificationType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID:
			setWeightAndBalanceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID:
			setMissionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS:
			setPointPerformanceUIDs((UIDSequenceType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS:
			setConfigurations((PerformanceRequirementConfigurationsType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS:
			setPerformanceMaps((PerformanceMapSelectionType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__UID:
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION:
			setRequirementClassification((RequirementClassificationType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID:
			setWeightAndBalanceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID:
			setMissionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS:
			setPointPerformanceUIDs((UIDSequenceType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS:
			setConfigurations((PerformanceRequirementConfigurationsType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS:
			setPerformanceMaps((PerformanceMapSelectionType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__UID:
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__REQUIREMENT_CLASSIFICATION:
			return requirementClassification != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__WEIGHT_AND_BALANCE_UID:
			return weightAndBalanceUID != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__MISSION_UID:
			return missionUID != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__POINT_PERFORMANCE_UI_DS:
			return pointPerformanceUIDs != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__CONFIGURATIONS:
			return configurations != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__PERFORMANCE_MAPS:
			return performanceMaps != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE__UID:
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

} //FlightPerformanceRequirementTypeImpl
