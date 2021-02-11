/**
 */
package Cpacs.impl;

import Cpacs.ConstraintSettingsType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MassFractionType;
import Cpacs.MissionSegmentEndConditionType;
import Cpacs.MissionSegmentType;
import Cpacs.SegmentTypeType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getSegmentType <em>Segment Type</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getEndCondition <em>End Condition</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getConstraintSettings <em>Constraint Settings</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionSegmentTypeImpl extends ComplexBaseTypeImpl implements MissionSegmentType {
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
	 * The cached value of the '{@link #getSegmentType() <em>Segment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentType()
	 * @generated
	 * @ordered
	 */
	protected SegmentTypeType segmentType;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType mass;

	/**
	 * The cached value of the '{@link #getMassFraction() <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassFraction()
	 * @generated
	 * @ordered
	 */
	protected MassFractionType massFraction;

	/**
	 * The cached value of the '{@link #getEndCondition() <em>End Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCondition()
	 * @generated
	 * @ordered
	 */
	protected MissionSegmentEndConditionType endCondition;

	/**
	 * The cached value of the '{@link #getConstraintSettings() <em>Constraint Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSettings()
	 * @generated
	 * @ordered
	 */
	protected ConstraintSettingsType constraintSettings;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType configuration;

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
	protected MissionSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionSegmentType();
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
					CpacsPackage.MISSION_SEGMENT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__NAME, newName,
					newName));
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
					CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentTypeType getSegmentType() {
		return segmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentType(SegmentTypeType newSegmentType, NotificationChain msgs) {
		SegmentTypeType oldSegmentType = segmentType;
		segmentType = newSegmentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE, oldSegmentType, newSegmentType);
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
	public void setSegmentType(SegmentTypeType newSegmentType) {
		if (newSegmentType != segmentType) {
			NotificationChain msgs = null;
			if (segmentType != null)
				msgs = ((InternalEObject) segmentType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE, null, msgs);
			if (newSegmentType != null)
				msgs = ((InternalEObject) newSegmentType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE, null, msgs);
			msgs = basicSetSegmentType(newSegmentType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE,
					newSegmentType, newSegmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(DoubleBaseType newMass, NotificationChain msgs) {
		DoubleBaseType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__MASS, oldMass, newMass);
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
	public void setMass(DoubleBaseType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__MASS, newMass,
					newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassFractionType getMassFraction() {
		return massFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassFraction(MassFractionType newMassFraction, NotificationChain msgs) {
		MassFractionType oldMassFraction = massFraction;
		massFraction = newMassFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION, oldMassFraction, newMassFraction);
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
	public void setMassFraction(MassFractionType newMassFraction) {
		if (newMassFraction != massFraction) {
			NotificationChain msgs = null;
			if (massFraction != null)
				msgs = ((InternalEObject) massFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION, null, msgs);
			if (newMassFraction != null)
				msgs = ((InternalEObject) newMassFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION, null, msgs);
			msgs = basicSetMassFraction(newMassFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION,
					newMassFraction, newMassFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentEndConditionType getEndCondition() {
		return endCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndCondition(MissionSegmentEndConditionType newEndCondition,
			NotificationChain msgs) {
		MissionSegmentEndConditionType oldEndCondition = endCondition;
		endCondition = newEndCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION, oldEndCondition, newEndCondition);
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
	public void setEndCondition(MissionSegmentEndConditionType newEndCondition) {
		if (newEndCondition != endCondition) {
			NotificationChain msgs = null;
			if (endCondition != null)
				msgs = ((InternalEObject) endCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION, null, msgs);
			if (newEndCondition != null)
				msgs = ((InternalEObject) newEndCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION, null, msgs);
			msgs = basicSetEndCondition(newEndCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION,
					newEndCondition, newEndCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintSettingsType getConstraintSettings() {
		return constraintSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintSettings(ConstraintSettingsType newConstraintSettings,
			NotificationChain msgs) {
		ConstraintSettingsType oldConstraintSettings = constraintSettings;
		constraintSettings = newConstraintSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS, oldConstraintSettings,
					newConstraintSettings);
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
	public void setConstraintSettings(ConstraintSettingsType newConstraintSettings) {
		if (newConstraintSettings != constraintSettings) {
			NotificationChain msgs = null;
			if (constraintSettings != null)
				msgs = ((InternalEObject) constraintSettings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS, null, msgs);
			if (newConstraintSettings != null)
				msgs = ((InternalEObject) newConstraintSettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS, null, msgs);
			msgs = basicSetConstraintSettings(newConstraintSettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS, newConstraintSettings,
					newConstraintSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(StringBaseType newConfiguration, NotificationChain msgs) {
		StringBaseType oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION, oldConfiguration, newConfiguration);
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
	public void setConfiguration(StringBaseType newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION,
					newConfiguration, newConfiguration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			return basicSetSegmentType(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION:
			return basicSetMassFraction(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			return basicSetEndCondition(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS:
			return basicSetConstraintSettings(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
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
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			return getSegmentType();
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS:
			return getMass();
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION:
			return getMassFraction();
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			return getEndCondition();
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS:
			return getConstraintSettings();
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION:
			return getConfiguration();
		case CpacsPackage.MISSION_SEGMENT_TYPE__UID:
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
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			setSegmentType((SegmentTypeType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS:
			setMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION:
			setMassFraction((MassFractionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			setEndCondition((MissionSegmentEndConditionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS:
			setConstraintSettings((ConstraintSettingsType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION:
			setConfiguration((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__UID:
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
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			setSegmentType((SegmentTypeType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS:
			setMass((DoubleBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION:
			setMassFraction((MassFractionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			setEndCondition((MissionSegmentEndConditionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS:
			setConstraintSettings((ConstraintSettingsType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION:
			setConfiguration((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__UID:
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
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			return segmentType != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS:
			return mass != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__MASS_FRACTION:
			return massFraction != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			return endCondition != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINT_SETTINGS:
			return constraintSettings != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONFIGURATION:
			return configuration != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__UID:
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

} //MissionSegmentTypeImpl
