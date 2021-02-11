/**
 */
package Cpacs.impl;

import Cpacs.AircraftAnalysesType;
import Cpacs.AircraftGlobalType;
import Cpacs.AircraftModelType;
import Cpacs.CpacsPackage;
import Cpacs.EnginePositionsType;
import Cpacs.EnginePylonsType;
import Cpacs.FuselagesType;
import Cpacs.GenericGeometryComponentsType;
import Cpacs.LandingGearType;
import Cpacs.PerformanceRequirementsType;
import Cpacs.ReferenceType;
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
 * An implementation of the model object '<em><b>Aircraft Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getFuselages <em>Fuselages</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getEnginePylons <em>Engine Pylons</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getLandingGear <em>Landing Gear</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getGenericGeometryComponents <em>Generic Geometry Components</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getAnalyses <em>Analyses</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getPerformanceRequirements <em>Performance Requirements</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftModelTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AircraftModelTypeImpl extends ComplexBaseTypeImpl implements AircraftModelType {
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
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EnginePositionsType engines;

	/**
	 * The cached value of the '{@link #getEnginePylons() <em>Engine Pylons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnginePylons()
	 * @generated
	 * @ordered
	 */
	protected EnginePylonsType enginePylons;

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
	 * The cached value of the '{@link #getGenericGeometryComponents() <em>Generic Geometry Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericGeometryComponents()
	 * @generated
	 * @ordered
	 */
	protected GenericGeometryComponentsType genericGeometryComponents;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected AircraftGlobalType global;

	/**
	 * The cached value of the '{@link #getAnalyses() <em>Analyses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyses()
	 * @generated
	 * @ordered
	 */
	protected AircraftAnalysesType analyses;

	/**
	 * The cached value of the '{@link #getPerformanceRequirements() <em>Performance Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceRequirements()
	 * @generated
	 * @ordered
	 */
	protected PerformanceRequirementsType performanceRequirements;

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
	protected AircraftModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAircraftModelType();
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
					CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME, newName,
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
					CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION,
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
					CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE, oldReference, newReference);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject) newReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE,
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
					CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES, oldFuselages, newFuselages);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES, null, msgs);
			if (newFuselages != null)
				msgs = ((InternalEObject) newFuselages).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES, null, msgs);
			msgs = basicSetFuselages(newFuselages, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES,
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
					CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS, oldWings, newWings);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS, null, msgs);
			if (newWings != null)
				msgs = ((InternalEObject) newWings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS, null, msgs);
			msgs = basicSetWings(newWings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS, newWings,
					newWings));
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
					CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES, oldEngines, newEngines);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES, null, msgs);
			if (newEngines != null)
				msgs = ((InternalEObject) newEngines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES, null, msgs);
			msgs = basicSetEngines(newEngines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES, newEngines,
					newEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePylonsType getEnginePylons() {
		return enginePylons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnginePylons(EnginePylonsType newEnginePylons, NotificationChain msgs) {
		EnginePylonsType oldEnginePylons = enginePylons;
		enginePylons = newEnginePylons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS, oldEnginePylons, newEnginePylons);
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
	public void setEnginePylons(EnginePylonsType newEnginePylons) {
		if (newEnginePylons != enginePylons) {
			NotificationChain msgs = null;
			if (enginePylons != null)
				msgs = ((InternalEObject) enginePylons).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS, null, msgs);
			if (newEnginePylons != null)
				msgs = ((InternalEObject) newEnginePylons).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS, null, msgs);
			msgs = basicSetEnginePylons(newEnginePylons, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS,
					newEnginePylons, newEnginePylons));
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
					CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR, oldLandingGear, newLandingGear);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR, null, msgs);
			if (newLandingGear != null)
				msgs = ((InternalEObject) newLandingGear).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR, null, msgs);
			msgs = basicSetLandingGear(newLandingGear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR,
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
					CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS, oldSystems, newSystems);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS, null, msgs);
			if (newSystems != null)
				msgs = ((InternalEObject) newSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS, null, msgs);
			msgs = basicSetSystems(newSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS, newSystems,
					newSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericGeometryComponentsType getGenericGeometryComponents() {
		return genericGeometryComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericGeometryComponents(
			GenericGeometryComponentsType newGenericGeometryComponents, NotificationChain msgs) {
		GenericGeometryComponentsType oldGenericGeometryComponents = genericGeometryComponents;
		genericGeometryComponents = newGenericGeometryComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS, oldGenericGeometryComponents,
					newGenericGeometryComponents);
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
	public void setGenericGeometryComponents(GenericGeometryComponentsType newGenericGeometryComponents) {
		if (newGenericGeometryComponents != genericGeometryComponents) {
			NotificationChain msgs = null;
			if (genericGeometryComponents != null)
				msgs = ((InternalEObject) genericGeometryComponents).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS, null,
						msgs);
			if (newGenericGeometryComponents != null)
				msgs = ((InternalEObject) newGenericGeometryComponents).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS, null,
						msgs);
			msgs = basicSetGenericGeometryComponents(newGenericGeometryComponents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS, newGenericGeometryComponents,
					newGenericGeometryComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftGlobalType getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobal(AircraftGlobalType newGlobal, NotificationChain msgs) {
		AircraftGlobalType oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL, oldGlobal, newGlobal);
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
	public void setGlobal(AircraftGlobalType newGlobal) {
		if (newGlobal != global) {
			NotificationChain msgs = null;
			if (global != null)
				msgs = ((InternalEObject) global).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL, null, msgs);
			if (newGlobal != null)
				msgs = ((InternalEObject) newGlobal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL, null, msgs);
			msgs = basicSetGlobal(newGlobal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL, newGlobal,
					newGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftAnalysesType getAnalyses() {
		return analyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalyses(AircraftAnalysesType newAnalyses, NotificationChain msgs) {
		AircraftAnalysesType oldAnalyses = analyses;
		analyses = newAnalyses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES, oldAnalyses, newAnalyses);
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
	public void setAnalyses(AircraftAnalysesType newAnalyses) {
		if (newAnalyses != analyses) {
			NotificationChain msgs = null;
			if (analyses != null)
				msgs = ((InternalEObject) analyses).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES, null, msgs);
			if (newAnalyses != null)
				msgs = ((InternalEObject) newAnalyses).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES, null, msgs);
			msgs = basicSetAnalyses(newAnalyses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES,
					newAnalyses, newAnalyses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceRequirementsType getPerformanceRequirements() {
		return performanceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceRequirements(PerformanceRequirementsType newPerformanceRequirements,
			NotificationChain msgs) {
		PerformanceRequirementsType oldPerformanceRequirements = performanceRequirements;
		performanceRequirements = newPerformanceRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS, oldPerformanceRequirements,
					newPerformanceRequirements);
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
	public void setPerformanceRequirements(PerformanceRequirementsType newPerformanceRequirements) {
		if (newPerformanceRequirements != performanceRequirements) {
			NotificationChain msgs = null;
			if (performanceRequirements != null)
				msgs = ((InternalEObject) performanceRequirements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS, null,
						msgs);
			if (newPerformanceRequirements != null)
				msgs = ((InternalEObject) newPerformanceRequirements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS, null,
						msgs);
			msgs = basicSetPerformanceRequirements(newPerformanceRequirements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS, newPerformanceRequirements,
					newPerformanceRequirements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_MODEL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE:
			return basicSetReference(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES:
			return basicSetFuselages(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS:
			return basicSetWings(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES:
			return basicSetEngines(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS:
			return basicSetEnginePylons(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR:
			return basicSetLandingGear(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS:
			return basicSetSystems(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS:
			return basicSetGenericGeometryComponents(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL:
			return basicSetGlobal(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES:
			return basicSetAnalyses(null, msgs);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS:
			return basicSetPerformanceRequirements(null, msgs);
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
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME:
			return getName();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE:
			return getReference();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES:
			return getFuselages();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS:
			return getWings();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES:
			return getEngines();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS:
			return getEnginePylons();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR:
			return getLandingGear();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS:
			return getSystems();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS:
			return getGenericGeometryComponents();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL:
			return getGlobal();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES:
			return getAnalyses();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS:
			return getPerformanceRequirements();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__UID:
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
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE:
			setReference((ReferenceType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES:
			setFuselages((FuselagesType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS:
			setWings((WingsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES:
			setEngines((EnginePositionsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS:
			setEnginePylons((EnginePylonsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR:
			setLandingGear((LandingGearType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS:
			setSystems((SystemsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS:
			setGenericGeometryComponents((GenericGeometryComponentsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL:
			setGlobal((AircraftGlobalType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES:
			setAnalyses((AircraftAnalysesType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS:
			setPerformanceRequirements((PerformanceRequirementsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__UID:
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
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE:
			setReference((ReferenceType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES:
			setFuselages((FuselagesType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS:
			setWings((WingsType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES:
			setEngines((EnginePositionsType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS:
			setEnginePylons((EnginePylonsType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR:
			setLandingGear((LandingGearType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS:
			setSystems((SystemsType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS:
			setGenericGeometryComponents((GenericGeometryComponentsType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL:
			setGlobal((AircraftGlobalType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES:
			setAnalyses((AircraftAnalysesType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS:
			setPerformanceRequirements((PerformanceRequirementsType) null);
			return;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__UID:
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
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__NAME:
			return name != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__REFERENCE:
			return reference != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__FUSELAGES:
			return fuselages != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__WINGS:
			return wings != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINES:
			return engines != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ENGINE_PYLONS:
			return enginePylons != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__LANDING_GEAR:
			return landingGear != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__SYSTEMS:
			return systems != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GENERIC_GEOMETRY_COMPONENTS:
			return genericGeometryComponents != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__GLOBAL:
			return global != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__ANALYSES:
			return analyses != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__PERFORMANCE_REQUIREMENTS:
			return performanceRequirements != null;
		case CpacsPackage.AIRCRAFT_MODEL_TYPE__UID:
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

} //AircraftModelTypeImpl
