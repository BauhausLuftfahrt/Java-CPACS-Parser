/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DriveSystemsType;
import Cpacs.EnginePositionsType;
import Cpacs.FuselagesType;
import Cpacs.LandingGearType;
import Cpacs.ReferenceType;
import Cpacs.RotorBladesType;
import Cpacs.RotorcraftAnalysesType;
import Cpacs.RotorcraftGlobalType;
import Cpacs.RotorcraftModelType;
import Cpacs.RotorsType;
import Cpacs.StringBaseType;
import Cpacs.SystemsType;
import Cpacs.WingsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotorcraft Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getFuselages <em>Fuselages</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getRotors <em>Rotors</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getRotorBlades <em>Rotor Blades</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getDriveSystems <em>Drive Systems</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getLandingGear <em>Landing Gear</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getAnalyses <em>Analyses</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftModelTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorcraftModelTypeImpl extends ComplexBaseTypeImpl implements RotorcraftModelType {
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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType reference;

	/**
	 * The cached value of the '{@link #getFuselages() <em>Fuselages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselages()
	 * @generated
	 * @ordered
	 */
	protected FuselagesType fuselages;

	/**
	 * The cached value of the '{@link #getWings() <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWings()
	 * @generated
	 * @ordered
	 */
	protected WingsType wings;

	/**
	 * The cached value of the '{@link #getRotors() <em>Rotors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotors()
	 * @generated
	 * @ordered
	 */
	protected RotorsType rotors;

	/**
	 * The cached value of the '{@link #getRotorBlades() <em>Rotor Blades</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotorBlades()
	 * @generated
	 * @ordered
	 */
	protected RotorBladesType rotorBlades;

	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EnginePositionsType engines;

	/**
	 * The cached value of the '{@link #getDriveSystems() <em>Drive Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveSystems()
	 * @generated
	 * @ordered
	 */
	protected DriveSystemsType driveSystems;

	/**
	 * The cached value of the '{@link #getLandingGear() <em>Landing Gear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGear()
	 * @generated
	 * @ordered
	 */
	protected LandingGearType landingGear;

	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected SystemsType systems;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected RotorcraftGlobalType global;

	/**
	 * The cached value of the '{@link #getAnalyses() <em>Analyses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyses()
	 * @generated
	 * @ordered
	 */
	protected RotorcraftAnalysesType analyses;

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
	protected RotorcraftModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorcraftModelType();
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
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME, newName,
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
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType newReference, NotificationChain msgs) {
		ReferenceType oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE, oldReference, newReference);
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
	public void setReference(ReferenceType newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject) reference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject) newReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE,
					newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselagesType getFuselages() {
		return fuselages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselages(FuselagesType newFuselages, NotificationChain msgs) {
		FuselagesType oldFuselages = fuselages;
		fuselages = newFuselages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES, oldFuselages, newFuselages);
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
	public void setFuselages(FuselagesType newFuselages) {
		if (newFuselages != fuselages) {
			NotificationChain msgs = null;
			if (fuselages != null)
				msgs = ((InternalEObject) fuselages).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES, null, msgs);
			if (newFuselages != null)
				msgs = ((InternalEObject) newFuselages).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES, null, msgs);
			msgs = basicSetFuselages(newFuselages, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES,
					newFuselages, newFuselages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingsType getWings() {
		return wings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWings(WingsType newWings, NotificationChain msgs) {
		WingsType oldWings = wings;
		wings = newWings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS, oldWings, newWings);
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
	public void setWings(WingsType newWings) {
		if (newWings != wings) {
			NotificationChain msgs = null;
			if (wings != null)
				msgs = ((InternalEObject) wings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS, null, msgs);
			if (newWings != null)
				msgs = ((InternalEObject) newWings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS, null, msgs);
			msgs = basicSetWings(newWings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS, newWings,
					newWings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorsType getRotors() {
		return rotors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotors(RotorsType newRotors, NotificationChain msgs) {
		RotorsType oldRotors = rotors;
		rotors = newRotors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS, oldRotors, newRotors);
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
	public void setRotors(RotorsType newRotors) {
		if (newRotors != rotors) {
			NotificationChain msgs = null;
			if (rotors != null)
				msgs = ((InternalEObject) rotors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS, null, msgs);
			if (newRotors != null)
				msgs = ((InternalEObject) newRotors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS, null, msgs);
			msgs = basicSetRotors(newRotors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS, newRotors,
					newRotors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorBladesType getRotorBlades() {
		return rotorBlades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotorBlades(RotorBladesType newRotorBlades, NotificationChain msgs) {
		RotorBladesType oldRotorBlades = rotorBlades;
		rotorBlades = newRotorBlades;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES, oldRotorBlades, newRotorBlades);
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
	public void setRotorBlades(RotorBladesType newRotorBlades) {
		if (newRotorBlades != rotorBlades) {
			NotificationChain msgs = null;
			if (rotorBlades != null)
				msgs = ((InternalEObject) rotorBlades).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES, null, msgs);
			if (newRotorBlades != null)
				msgs = ((InternalEObject) newRotorBlades).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES, null, msgs);
			msgs = basicSetRotorBlades(newRotorBlades, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES,
					newRotorBlades, newRotorBlades));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePositionsType getEngines() {
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngines(EnginePositionsType newEngines, NotificationChain msgs) {
		EnginePositionsType oldEngines = engines;
		engines = newEngines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES, oldEngines, newEngines);
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
	public void setEngines(EnginePositionsType newEngines) {
		if (newEngines != engines) {
			NotificationChain msgs = null;
			if (engines != null)
				msgs = ((InternalEObject) engines).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES, null, msgs);
			if (newEngines != null)
				msgs = ((InternalEObject) newEngines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES, null, msgs);
			msgs = basicSetEngines(newEngines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES,
					newEngines, newEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveSystemsType getDriveSystems() {
		return driveSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriveSystems(DriveSystemsType newDriveSystems, NotificationChain msgs) {
		DriveSystemsType oldDriveSystems = driveSystems;
		driveSystems = newDriveSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS, oldDriveSystems, newDriveSystems);
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
	public void setDriveSystems(DriveSystemsType newDriveSystems) {
		if (newDriveSystems != driveSystems) {
			NotificationChain msgs = null;
			if (driveSystems != null)
				msgs = ((InternalEObject) driveSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS, null, msgs);
			if (newDriveSystems != null)
				msgs = ((InternalEObject) newDriveSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS, null, msgs);
			msgs = basicSetDriveSystems(newDriveSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS,
					newDriveSystems, newDriveSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearType getLandingGear() {
		return landingGear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGear(LandingGearType newLandingGear, NotificationChain msgs) {
		LandingGearType oldLandingGear = landingGear;
		landingGear = newLandingGear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR, oldLandingGear, newLandingGear);
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
	public void setLandingGear(LandingGearType newLandingGear) {
		if (newLandingGear != landingGear) {
			NotificationChain msgs = null;
			if (landingGear != null)
				msgs = ((InternalEObject) landingGear).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR, null, msgs);
			if (newLandingGear != null)
				msgs = ((InternalEObject) newLandingGear).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR, null, msgs);
			msgs = basicSetLandingGear(newLandingGear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR,
					newLandingGear, newLandingGear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemsType getSystems() {
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystems(SystemsType newSystems, NotificationChain msgs) {
		SystemsType oldSystems = systems;
		systems = newSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS, oldSystems, newSystems);
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
	public void setSystems(SystemsType newSystems) {
		if (newSystems != systems) {
			NotificationChain msgs = null;
			if (systems != null)
				msgs = ((InternalEObject) systems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS, null, msgs);
			if (newSystems != null)
				msgs = ((InternalEObject) newSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS, null, msgs);
			msgs = basicSetSystems(newSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS,
					newSystems, newSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftGlobalType getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobal(RotorcraftGlobalType newGlobal, NotificationChain msgs) {
		RotorcraftGlobalType oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL, oldGlobal, newGlobal);
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
	public void setGlobal(RotorcraftGlobalType newGlobal) {
		if (newGlobal != global) {
			NotificationChain msgs = null;
			if (global != null)
				msgs = ((InternalEObject) global).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL, null, msgs);
			if (newGlobal != null)
				msgs = ((InternalEObject) newGlobal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL, null, msgs);
			msgs = basicSetGlobal(newGlobal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL, newGlobal,
					newGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftAnalysesType getAnalyses() {
		return analyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalyses(RotorcraftAnalysesType newAnalyses, NotificationChain msgs) {
		RotorcraftAnalysesType oldAnalyses = analyses;
		analyses = newAnalyses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES, oldAnalyses, newAnalyses);
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
	public void setAnalyses(RotorcraftAnalysesType newAnalyses) {
		if (newAnalyses != analyses) {
			NotificationChain msgs = null;
			if (analyses != null)
				msgs = ((InternalEObject) analyses).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES, null, msgs);
			if (newAnalyses != null)
				msgs = ((InternalEObject) newAnalyses).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES, null, msgs);
			msgs = basicSetAnalyses(newAnalyses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES,
					newAnalyses, newAnalyses));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MODEL_TYPE__UID, oldUID,
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
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE:
			return basicSetReference(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES:
			return basicSetFuselages(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS:
			return basicSetWings(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS:
			return basicSetRotors(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES:
			return basicSetRotorBlades(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES:
			return basicSetEngines(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS:
			return basicSetDriveSystems(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR:
			return basicSetLandingGear(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS:
			return basicSetSystems(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL:
			return basicSetGlobal(null, msgs);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES:
			return basicSetAnalyses(null, msgs);
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
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME:
			return getName();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE:
			return getReference();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES:
			return getFuselages();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS:
			return getWings();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS:
			return getRotors();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES:
			return getRotorBlades();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES:
			return getEngines();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS:
			return getDriveSystems();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR:
			return getLandingGear();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS:
			return getSystems();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL:
			return getGlobal();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES:
			return getAnalyses();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__UID:
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
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE:
			setReference((ReferenceType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES:
			setFuselages((FuselagesType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS:
			setWings((WingsType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS:
			setRotors((RotorsType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES:
			setRotorBlades((RotorBladesType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES:
			setEngines((EnginePositionsType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS:
			setDriveSystems((DriveSystemsType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR:
			setLandingGear((LandingGearType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS:
			setSystems((SystemsType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL:
			setGlobal((RotorcraftGlobalType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES:
			setAnalyses((RotorcraftAnalysesType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__UID:
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
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE:
			setReference((ReferenceType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES:
			setFuselages((FuselagesType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS:
			setWings((WingsType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS:
			setRotors((RotorsType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES:
			setRotorBlades((RotorBladesType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES:
			setEngines((EnginePositionsType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS:
			setDriveSystems((DriveSystemsType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR:
			setLandingGear((LandingGearType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS:
			setSystems((SystemsType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL:
			setGlobal((RotorcraftGlobalType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES:
			setAnalyses((RotorcraftAnalysesType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__UID:
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
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__NAME:
			return name != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__REFERENCE:
			return reference != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__FUSELAGES:
			return fuselages != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__WINGS:
			return wings != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTORS:
			return rotors != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ROTOR_BLADES:
			return rotorBlades != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ENGINES:
			return engines != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__DRIVE_SYSTEMS:
			return driveSystems != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__LANDING_GEAR:
			return landingGear != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__SYSTEMS:
			return systems != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__GLOBAL:
			return global != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__ANALYSES:
			return analyses != null;
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE__UID:
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

} //RotorcraftModelTypeImpl
