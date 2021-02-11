/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutLoadsType;
import Cpacs.GroundLoadCaseType;
import Cpacs.LoadCaseMassType;
import Cpacs.LoadCaseSettingsType;
import Cpacs.LoadCaseStateType;
import Cpacs.LoadConditionType;
import Cpacs.NodalLoadsType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Load Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getAeroDataSetUID <em>Aero Data Set UID</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getLoadCondition <em>Load Condition</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getAircraftSettings <em>Aircraft Settings</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getNodalLoads <em>Nodal Loads</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getCutLoads <em>Cut Loads</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getExternalAmifFile <em>External Amif File</em>}</li>
 *   <li>{@link Cpacs.impl.GroundLoadCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundLoadCaseTypeImpl extends ComplexBaseTypeImpl implements GroundLoadCaseType {
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
	 * The cached value of the '{@link #getAeroDataSetUID() <em>Aero Data Set UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroDataSetUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType aeroDataSetUID;

	/**
	 * The cached value of the '{@link #getLoadCondition() <em>Load Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadCondition()
	 * @generated
	 * @ordered
	 */
	protected LoadConditionType loadCondition;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseStateType state;

	/**
	 * The cached value of the '{@link #getAircraftSettings() <em>Aircraft Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftSettings()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseSettingsType aircraftSettings;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseMassType mass;

	/**
	 * The cached value of the '{@link #getNodalLoads() <em>Nodal Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodalLoads()
	 * @generated
	 * @ordered
	 */
	protected NodalLoadsType nodalLoads;

	/**
	 * The cached value of the '{@link #getCutLoads() <em>Cut Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLoads()
	 * @generated
	 * @ordered
	 */
	protected CutLoadsType cutLoads;

	/**
	 * The cached value of the '{@link #getExternalAmifFile() <em>External Amif File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAmifFile()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType externalAmifFile;

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
	protected GroundLoadCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGroundLoadCaseType();
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
					CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME, newName,
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
					CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getAeroDataSetUID() {
		return aeroDataSetUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroDataSetUID(StringUIDBaseType newAeroDataSetUID, NotificationChain msgs) {
		StringUIDBaseType oldAeroDataSetUID = aeroDataSetUID;
		aeroDataSetUID = newAeroDataSetUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID, oldAeroDataSetUID, newAeroDataSetUID);
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
	public void setAeroDataSetUID(StringUIDBaseType newAeroDataSetUID) {
		if (newAeroDataSetUID != aeroDataSetUID) {
			NotificationChain msgs = null;
			if (aeroDataSetUID != null)
				msgs = ((InternalEObject) aeroDataSetUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID, null, msgs);
			if (newAeroDataSetUID != null)
				msgs = ((InternalEObject) newAeroDataSetUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID, null, msgs);
			msgs = basicSetAeroDataSetUID(newAeroDataSetUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID,
					newAeroDataSetUID, newAeroDataSetUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadConditionType getLoadCondition() {
		return loadCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadCondition(LoadConditionType newLoadCondition, NotificationChain msgs) {
		LoadConditionType oldLoadCondition = loadCondition;
		loadCondition = newLoadCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION, oldLoadCondition, newLoadCondition);
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
	public void setLoadCondition(LoadConditionType newLoadCondition) {
		if (newLoadCondition != loadCondition) {
			NotificationChain msgs = null;
			if (loadCondition != null)
				msgs = ((InternalEObject) loadCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION, null, msgs);
			if (newLoadCondition != null)
				msgs = ((InternalEObject) newLoadCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION, null, msgs);
			msgs = basicSetLoadCondition(newLoadCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION,
					newLoadCondition, newLoadCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseStateType getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(LoadCaseStateType newState, NotificationChain msgs) {
		LoadCaseStateType oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE, oldState, newState);
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
	public void setState(LoadCaseStateType newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject) state).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE, newState,
					newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseSettingsType getAircraftSettings() {
		return aircraftSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAircraftSettings(LoadCaseSettingsType newAircraftSettings,
			NotificationChain msgs) {
		LoadCaseSettingsType oldAircraftSettings = aircraftSettings;
		aircraftSettings = newAircraftSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS, oldAircraftSettings, newAircraftSettings);
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
	public void setAircraftSettings(LoadCaseSettingsType newAircraftSettings) {
		if (newAircraftSettings != aircraftSettings) {
			NotificationChain msgs = null;
			if (aircraftSettings != null)
				msgs = ((InternalEObject) aircraftSettings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS, null, msgs);
			if (newAircraftSettings != null)
				msgs = ((InternalEObject) newAircraftSettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS, null, msgs);
			msgs = basicSetAircraftSettings(newAircraftSettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS,
					newAircraftSettings, newAircraftSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseMassType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(LoadCaseMassType newMass, NotificationChain msgs) {
		LoadCaseMassType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS, oldMass, newMass);
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
	public void setMass(LoadCaseMassType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS, newMass,
					newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodalLoadsType getNodalLoads() {
		return nodalLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodalLoads(NodalLoadsType newNodalLoads, NotificationChain msgs) {
		NodalLoadsType oldNodalLoads = nodalLoads;
		nodalLoads = newNodalLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS, oldNodalLoads, newNodalLoads);
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
	public void setNodalLoads(NodalLoadsType newNodalLoads) {
		if (newNodalLoads != nodalLoads) {
			NotificationChain msgs = null;
			if (nodalLoads != null)
				msgs = ((InternalEObject) nodalLoads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS, null, msgs);
			if (newNodalLoads != null)
				msgs = ((InternalEObject) newNodalLoads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS, null, msgs);
			msgs = basicSetNodalLoads(newNodalLoads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS,
					newNodalLoads, newNodalLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutLoadsType getCutLoads() {
		return cutLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutLoads(CutLoadsType newCutLoads, NotificationChain msgs) {
		CutLoadsType oldCutLoads = cutLoads;
		cutLoads = newCutLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS, oldCutLoads, newCutLoads);
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
	public void setCutLoads(CutLoadsType newCutLoads) {
		if (newCutLoads != cutLoads) {
			NotificationChain msgs = null;
			if (cutLoads != null)
				msgs = ((InternalEObject) cutLoads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS, null, msgs);
			if (newCutLoads != null)
				msgs = ((InternalEObject) newCutLoads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS, null, msgs);
			msgs = basicSetCutLoads(newCutLoads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS,
					newCutLoads, newCutLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getExternalAmifFile() {
		return externalAmifFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalAmifFile(StringBaseType newExternalAmifFile, NotificationChain msgs) {
		StringBaseType oldExternalAmifFile = externalAmifFile;
		externalAmifFile = newExternalAmifFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE, oldExternalAmifFile, newExternalAmifFile);
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
	public void setExternalAmifFile(StringBaseType newExternalAmifFile) {
		if (newExternalAmifFile != externalAmifFile) {
			NotificationChain msgs = null;
			if (externalAmifFile != null)
				msgs = ((InternalEObject) externalAmifFile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE, null, msgs);
			if (newExternalAmifFile != null)
				msgs = ((InternalEObject) newExternalAmifFile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE, null, msgs);
			msgs = basicSetExternalAmifFile(newExternalAmifFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE, newExternalAmifFile, newExternalAmifFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GROUND_LOAD_CASE_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID:
			return basicSetAeroDataSetUID(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION:
			return basicSetLoadCondition(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE:
			return basicSetState(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS:
			return basicSetAircraftSettings(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS:
			return basicSetNodalLoads(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS:
			return basicSetCutLoads(null, msgs);
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE:
			return basicSetExternalAmifFile(null, msgs);
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
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME:
			return getName();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID:
			return getAeroDataSetUID();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION:
			return getLoadCondition();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE:
			return getState();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS:
			return getAircraftSettings();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS:
			return getMass();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS:
			return getNodalLoads();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS:
			return getCutLoads();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE:
			return getExternalAmifFile();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__UID:
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
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID:
			setAeroDataSetUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION:
			setLoadCondition((LoadConditionType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE:
			setState((LoadCaseStateType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS:
			setAircraftSettings((LoadCaseSettingsType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS:
			setMass((LoadCaseMassType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS:
			setNodalLoads((NodalLoadsType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS:
			setCutLoads((CutLoadsType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE:
			setExternalAmifFile((StringBaseType) newValue);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__UID:
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
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID:
			setAeroDataSetUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION:
			setLoadCondition((LoadConditionType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE:
			setState((LoadCaseStateType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS:
			setAircraftSettings((LoadCaseSettingsType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS:
			setMass((LoadCaseMassType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS:
			setNodalLoads((NodalLoadsType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS:
			setCutLoads((CutLoadsType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE:
			setExternalAmifFile((StringBaseType) null);
			return;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__UID:
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
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AERO_DATA_SET_UID:
			return aeroDataSetUID != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__LOAD_CONDITION:
			return loadCondition != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__STATE:
			return state != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__AIRCRAFT_SETTINGS:
			return aircraftSettings != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__MASS:
			return mass != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__NODAL_LOADS:
			return nodalLoads != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__CUT_LOADS:
			return cutLoads != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__EXTERNAL_AMIF_FILE:
			return externalAmifFile != null;
		case CpacsPackage.GROUND_LOAD_CASE_TYPE__UID:
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

} //GroundLoadCaseTypeImpl
