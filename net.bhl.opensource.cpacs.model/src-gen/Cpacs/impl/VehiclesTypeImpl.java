/**
 */
package Cpacs.impl;

import Cpacs.AircraftType;
import Cpacs.CpacsPackage;
import Cpacs.DeckElementsType;
import Cpacs.EnginesType;
import Cpacs.FlightPointsType;
import Cpacs.FuelsType;
import Cpacs.GlobalPerformanceCasesType;
import Cpacs.MaterialsType;
import Cpacs.ProfilesType;
import Cpacs.RotorcraftType;
import Cpacs.StructuralElementsType;
import Cpacs.VehiclesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getAircraft <em>Aircraft</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getRotorcraft <em>Rotorcraft</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getPerformanceCases <em>Performance Cases</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getFlightPoints <em>Flight Points</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getStructuralElements <em>Structural Elements</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getDeckElements <em>Deck Elements</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getMaterials <em>Materials</em>}</li>
 *   <li>{@link Cpacs.impl.VehiclesTypeImpl#getFuels <em>Fuels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehiclesTypeImpl extends ComplexBaseTypeImpl implements VehiclesType {
	/**
	 * The cached value of the '{@link #getAircraft() <em>Aircraft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraft()
	 * @generated
	 * @ordered
	 */
	protected AircraftType aircraft;

	/**
	 * The cached value of the '{@link #getRotorcraft() <em>Rotorcraft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotorcraft()
	 * @generated
	 * @ordered
	 */
	protected RotorcraftType rotorcraft;

	/**
	 * The cached value of the '{@link #getPerformanceCases() <em>Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceCases()
	 * @generated
	 * @ordered
	 */
	protected GlobalPerformanceCasesType performanceCases;

	/**
	 * The cached value of the '{@link #getFlightPoints() <em>Flight Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPoints()
	 * @generated
	 * @ordered
	 */
	protected FlightPointsType flightPoints;

	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EnginesType engines;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected ProfilesType profiles;

	/**
	 * The cached value of the '{@link #getStructuralElements() <em>Structural Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElements()
	 * @generated
	 * @ordered
	 */
	protected StructuralElementsType structuralElements;

	/**
	 * The cached value of the '{@link #getDeckElements() <em>Deck Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckElements()
	 * @generated
	 * @ordered
	 */
	protected DeckElementsType deckElements;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected MaterialsType materials;

	/**
	 * The cached value of the '{@link #getFuels() <em>Fuels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuels()
	 * @generated
	 * @ordered
	 */
	protected FuelsType fuels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiclesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getVehiclesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftType getAircraft() {
		return aircraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAircraft(AircraftType newAircraft, NotificationChain msgs) {
		AircraftType oldAircraft = aircraft;
		aircraft = newAircraft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__AIRCRAFT, oldAircraft, newAircraft);
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
	public void setAircraft(AircraftType newAircraft) {
		if (newAircraft != aircraft) {
			NotificationChain msgs = null;
			if (aircraft != null)
				msgs = ((InternalEObject) aircraft).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__AIRCRAFT, null, msgs);
			if (newAircraft != null)
				msgs = ((InternalEObject) newAircraft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__AIRCRAFT, null, msgs);
			msgs = basicSetAircraft(newAircraft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__AIRCRAFT, newAircraft,
					newAircraft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftType getRotorcraft() {
		return rotorcraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotorcraft(RotorcraftType newRotorcraft, NotificationChain msgs) {
		RotorcraftType oldRotorcraft = rotorcraft;
		rotorcraft = newRotorcraft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__ROTORCRAFT, oldRotorcraft, newRotorcraft);
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
	public void setRotorcraft(RotorcraftType newRotorcraft) {
		if (newRotorcraft != rotorcraft) {
			NotificationChain msgs = null;
			if (rotorcraft != null)
				msgs = ((InternalEObject) rotorcraft).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__ROTORCRAFT, null, msgs);
			if (newRotorcraft != null)
				msgs = ((InternalEObject) newRotorcraft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__ROTORCRAFT, null, msgs);
			msgs = basicSetRotorcraft(newRotorcraft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__ROTORCRAFT, newRotorcraft,
					newRotorcraft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalPerformanceCasesType getPerformanceCases() {
		return performanceCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceCases(GlobalPerformanceCasesType newPerformanceCases,
			NotificationChain msgs) {
		GlobalPerformanceCasesType oldPerformanceCases = performanceCases;
		performanceCases = newPerformanceCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES, oldPerformanceCases, newPerformanceCases);
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
	public void setPerformanceCases(GlobalPerformanceCasesType newPerformanceCases) {
		if (newPerformanceCases != performanceCases) {
			NotificationChain msgs = null;
			if (performanceCases != null)
				msgs = ((InternalEObject) performanceCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES, null, msgs);
			if (newPerformanceCases != null)
				msgs = ((InternalEObject) newPerformanceCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES, null, msgs);
			msgs = basicSetPerformanceCases(newPerformanceCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES,
					newPerformanceCases, newPerformanceCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPointsType getFlightPoints() {
		return flightPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPoints(FlightPointsType newFlightPoints, NotificationChain msgs) {
		FlightPointsType oldFlightPoints = flightPoints;
		flightPoints = newFlightPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS, oldFlightPoints, newFlightPoints);
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
	public void setFlightPoints(FlightPointsType newFlightPoints) {
		if (newFlightPoints != flightPoints) {
			NotificationChain msgs = null;
			if (flightPoints != null)
				msgs = ((InternalEObject) flightPoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS, null, msgs);
			if (newFlightPoints != null)
				msgs = ((InternalEObject) newFlightPoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS, null, msgs);
			msgs = basicSetFlightPoints(newFlightPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS,
					newFlightPoints, newFlightPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginesType getEngines() {
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngines(EnginesType newEngines, NotificationChain msgs) {
		EnginesType oldEngines = engines;
		engines = newEngines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__ENGINES, oldEngines, newEngines);
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
	public void setEngines(EnginesType newEngines) {
		if (newEngines != engines) {
			NotificationChain msgs = null;
			if (engines != null)
				msgs = ((InternalEObject) engines).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__ENGINES, null, msgs);
			if (newEngines != null)
				msgs = ((InternalEObject) newEngines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__ENGINES, null, msgs);
			msgs = basicSetEngines(newEngines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__ENGINES, newEngines,
					newEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfilesType getProfiles() {
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfiles(ProfilesType newProfiles, NotificationChain msgs) {
		ProfilesType oldProfiles = profiles;
		profiles = newProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__PROFILES, oldProfiles, newProfiles);
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
	public void setProfiles(ProfilesType newProfiles) {
		if (newProfiles != profiles) {
			NotificationChain msgs = null;
			if (profiles != null)
				msgs = ((InternalEObject) profiles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__PROFILES, null, msgs);
			if (newProfiles != null)
				msgs = ((InternalEObject) newProfiles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__PROFILES, null, msgs);
			msgs = basicSetProfiles(newProfiles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__PROFILES, newProfiles,
					newProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralElementsType getStructuralElements() {
		return structuralElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralElements(StructuralElementsType newStructuralElements,
			NotificationChain msgs) {
		StructuralElementsType oldStructuralElements = structuralElements;
		structuralElements = newStructuralElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS, oldStructuralElements, newStructuralElements);
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
	public void setStructuralElements(StructuralElementsType newStructuralElements) {
		if (newStructuralElements != structuralElements) {
			NotificationChain msgs = null;
			if (structuralElements != null)
				msgs = ((InternalEObject) structuralElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS, null, msgs);
			if (newStructuralElements != null)
				msgs = ((InternalEObject) newStructuralElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS, null, msgs);
			msgs = basicSetStructuralElements(newStructuralElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS,
					newStructuralElements, newStructuralElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeckElementsType getDeckElements() {
		return deckElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeckElements(DeckElementsType newDeckElements, NotificationChain msgs) {
		DeckElementsType oldDeckElements = deckElements;
		deckElements = newDeckElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS, oldDeckElements, newDeckElements);
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
	public void setDeckElements(DeckElementsType newDeckElements) {
		if (newDeckElements != deckElements) {
			NotificationChain msgs = null;
			if (deckElements != null)
				msgs = ((InternalEObject) deckElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS, null, msgs);
			if (newDeckElements != null)
				msgs = ((InternalEObject) newDeckElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS, null, msgs);
			msgs = basicSetDeckElements(newDeckElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS,
					newDeckElements, newDeckElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialsType getMaterials() {
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterials(MaterialsType newMaterials, NotificationChain msgs) {
		MaterialsType oldMaterials = materials;
		materials = newMaterials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__MATERIALS, oldMaterials, newMaterials);
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
	public void setMaterials(MaterialsType newMaterials) {
		if (newMaterials != materials) {
			NotificationChain msgs = null;
			if (materials != null)
				msgs = ((InternalEObject) materials).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__MATERIALS, null, msgs);
			if (newMaterials != null)
				msgs = ((InternalEObject) newMaterials).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__MATERIALS, null, msgs);
			msgs = basicSetMaterials(newMaterials, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__MATERIALS, newMaterials,
					newMaterials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelsType getFuels() {
		return fuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuels(FuelsType newFuels, NotificationChain msgs) {
		FuelsType oldFuels = fuels;
		fuels = newFuels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLES_TYPE__FUELS, oldFuels, newFuels);
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
	public void setFuels(FuelsType newFuels) {
		if (newFuels != fuels) {
			NotificationChain msgs = null;
			if (fuels != null)
				msgs = ((InternalEObject) fuels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__FUELS, null, msgs);
			if (newFuels != null)
				msgs = ((InternalEObject) newFuels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLES_TYPE__FUELS, null, msgs);
			msgs = basicSetFuels(newFuels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLES_TYPE__FUELS, newFuels,
					newFuels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.VEHICLES_TYPE__AIRCRAFT:
			return basicSetAircraft(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__ROTORCRAFT:
			return basicSetRotorcraft(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES:
			return basicSetPerformanceCases(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS:
			return basicSetFlightPoints(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__ENGINES:
			return basicSetEngines(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__PROFILES:
			return basicSetProfiles(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS:
			return basicSetStructuralElements(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS:
			return basicSetDeckElements(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__MATERIALS:
			return basicSetMaterials(null, msgs);
		case CpacsPackage.VEHICLES_TYPE__FUELS:
			return basicSetFuels(null, msgs);
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
		case CpacsPackage.VEHICLES_TYPE__AIRCRAFT:
			return getAircraft();
		case CpacsPackage.VEHICLES_TYPE__ROTORCRAFT:
			return getRotorcraft();
		case CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES:
			return getPerformanceCases();
		case CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS:
			return getFlightPoints();
		case CpacsPackage.VEHICLES_TYPE__ENGINES:
			return getEngines();
		case CpacsPackage.VEHICLES_TYPE__PROFILES:
			return getProfiles();
		case CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS:
			return getStructuralElements();
		case CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS:
			return getDeckElements();
		case CpacsPackage.VEHICLES_TYPE__MATERIALS:
			return getMaterials();
		case CpacsPackage.VEHICLES_TYPE__FUELS:
			return getFuels();
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
		case CpacsPackage.VEHICLES_TYPE__AIRCRAFT:
			setAircraft((AircraftType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__ROTORCRAFT:
			setRotorcraft((RotorcraftType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES:
			setPerformanceCases((GlobalPerformanceCasesType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS:
			setFlightPoints((FlightPointsType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__ENGINES:
			setEngines((EnginesType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__PROFILES:
			setProfiles((ProfilesType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS:
			setStructuralElements((StructuralElementsType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS:
			setDeckElements((DeckElementsType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__MATERIALS:
			setMaterials((MaterialsType) newValue);
			return;
		case CpacsPackage.VEHICLES_TYPE__FUELS:
			setFuels((FuelsType) newValue);
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
		case CpacsPackage.VEHICLES_TYPE__AIRCRAFT:
			setAircraft((AircraftType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__ROTORCRAFT:
			setRotorcraft((RotorcraftType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES:
			setPerformanceCases((GlobalPerformanceCasesType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS:
			setFlightPoints((FlightPointsType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__ENGINES:
			setEngines((EnginesType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__PROFILES:
			setProfiles((ProfilesType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS:
			setStructuralElements((StructuralElementsType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS:
			setDeckElements((DeckElementsType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__MATERIALS:
			setMaterials((MaterialsType) null);
			return;
		case CpacsPackage.VEHICLES_TYPE__FUELS:
			setFuels((FuelsType) null);
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
		case CpacsPackage.VEHICLES_TYPE__AIRCRAFT:
			return aircraft != null;
		case CpacsPackage.VEHICLES_TYPE__ROTORCRAFT:
			return rotorcraft != null;
		case CpacsPackage.VEHICLES_TYPE__PERFORMANCE_CASES:
			return performanceCases != null;
		case CpacsPackage.VEHICLES_TYPE__FLIGHT_POINTS:
			return flightPoints != null;
		case CpacsPackage.VEHICLES_TYPE__ENGINES:
			return engines != null;
		case CpacsPackage.VEHICLES_TYPE__PROFILES:
			return profiles != null;
		case CpacsPackage.VEHICLES_TYPE__STRUCTURAL_ELEMENTS:
			return structuralElements != null;
		case CpacsPackage.VEHICLES_TYPE__DECK_ELEMENTS:
			return deckElements != null;
		case CpacsPackage.VEHICLES_TYPE__MATERIALS:
			return materials != null;
		case CpacsPackage.VEHICLES_TYPE__FUELS:
			return fuels != null;
		}
		return super.eIsSet(featureID);
	}

} //VehiclesTypeImpl
