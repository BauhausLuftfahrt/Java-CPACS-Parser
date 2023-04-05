/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceType;
import Cpacs.AeroelasticsType;
import Cpacs.AircraftAnalysesGlobalType;
import Cpacs.AircraftAnalysesType;
import Cpacs.CpacsPackage;
import Cpacs.FlightDynamicsAnalysisType;
import Cpacs.FlightSystemsType;
import Cpacs.LandingGearPositionSafetyMarginsType;
import Cpacs.LoadAnalysisType;
import Cpacs.MassBreakdownType;
import Cpacs.MonetaryValuesAnalysisType;
import Cpacs.NoiseAnalysisType;
import Cpacs.TrajectoriesType;
import Cpacs.WeightAndBalanceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aircraft Analyses Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getAeroPerformance <em>Aero Performance</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getAeroelastics <em>Aeroelastics</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getFlightDynamics <em>Flight Dynamics</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getFlightSystems <em>Flight Systems</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getLandingGearPositionSafetyMargins <em>Landing Gear Position Safety Margins</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getLoadAnalysis <em>Load Analysis</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getMassBreakdown <em>Mass Breakdown</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getMonetaryValues <em>Monetary Values</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getNoise <em>Noise</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getTrajectories <em>Trajectories</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftAnalysesTypeImpl#getWeightAndBalance <em>Weight And Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AircraftAnalysesTypeImpl extends ComplexBaseTypeImpl implements AircraftAnalysesType {
	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected AircraftAnalysesGlobalType global;

	/**
	 * The cached value of the '{@link #getAeroPerformance() <em>Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected AeroPerformanceType aeroPerformance;

	/**
	 * The cached value of the '{@link #getAeroelastics() <em>Aeroelastics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroelastics()
	 * @generated
	 * @ordered
	 */
	protected AeroelasticsType aeroelastics;

	/**
	 * The cached value of the '{@link #getFlightDynamics() <em>Flight Dynamics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightDynamics()
	 * @generated
	 * @ordered
	 */
	protected FlightDynamicsAnalysisType flightDynamics;

	/**
	 * The cached value of the '{@link #getFlightSystems() <em>Flight Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightSystems()
	 * @generated
	 * @ordered
	 */
	protected FlightSystemsType flightSystems;

	/**
	 * The cached value of the '{@link #getLandingGearPositionSafetyMargins() <em>Landing Gear Position Safety Margins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearPositionSafetyMargins()
	 * @generated
	 * @ordered
	 */
	protected LandingGearPositionSafetyMarginsType landingGearPositionSafetyMargins;

	/**
	 * The cached value of the '{@link #getLoadAnalysis() <em>Load Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadAnalysis()
	 * @generated
	 * @ordered
	 */
	protected LoadAnalysisType loadAnalysis;

	/**
	 * The cached value of the '{@link #getMassBreakdown() <em>Mass Breakdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassBreakdown()
	 * @generated
	 * @ordered
	 */
	protected MassBreakdownType massBreakdown;

	/**
	 * The cached value of the '{@link #getMonetaryValues() <em>Monetary Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryValues()
	 * @generated
	 * @ordered
	 */
	protected MonetaryValuesAnalysisType monetaryValues;

	/**
	 * The cached value of the '{@link #getNoise() <em>Noise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoise()
	 * @generated
	 * @ordered
	 */
	protected NoiseAnalysisType noise;

	/**
	 * The cached value of the '{@link #getTrajectories() <em>Trajectories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectories()
	 * @generated
	 * @ordered
	 */
	protected TrajectoriesType trajectories;

	/**
	 * The cached value of the '{@link #getWeightAndBalance() <em>Weight And Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightAndBalance()
	 * @generated
	 * @ordered
	 */
	protected WeightAndBalanceType weightAndBalance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AircraftAnalysesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAircraftAnalysesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftAnalysesGlobalType getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobal(AircraftAnalysesGlobalType newGlobal, NotificationChain msgs) {
		AircraftAnalysesGlobalType oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL, oldGlobal, newGlobal);
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
	public void setGlobal(AircraftAnalysesGlobalType newGlobal) {
		if (newGlobal != global) {
			NotificationChain msgs = null;
			if (global != null)
				msgs = ((InternalEObject) global).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL, null, msgs);
			if (newGlobal != null)
				msgs = ((InternalEObject) newGlobal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL, null, msgs);
			msgs = basicSetGlobal(newGlobal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL,
					newGlobal, newGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceType getAeroPerformance() {
		return aeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroPerformance(AeroPerformanceType newAeroPerformance, NotificationChain msgs) {
		AeroPerformanceType oldAeroPerformance = aeroPerformance;
		aeroPerformance = newAeroPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE, oldAeroPerformance, newAeroPerformance);
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
	public void setAeroPerformance(AeroPerformanceType newAeroPerformance) {
		if (newAeroPerformance != aeroPerformance) {
			NotificationChain msgs = null;
			if (aeroPerformance != null)
				msgs = ((InternalEObject) aeroPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE, null, msgs);
			if (newAeroPerformance != null)
				msgs = ((InternalEObject) newAeroPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE, null, msgs);
			msgs = basicSetAeroPerformance(newAeroPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE,
					newAeroPerformance, newAeroPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroelasticsType getAeroelastics() {
		return aeroelastics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroelastics(AeroelasticsType newAeroelastics, NotificationChain msgs) {
		AeroelasticsType oldAeroelastics = aeroelastics;
		aeroelastics = newAeroelastics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS, oldAeroelastics, newAeroelastics);
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
	public void setAeroelastics(AeroelasticsType newAeroelastics) {
		if (newAeroelastics != aeroelastics) {
			NotificationChain msgs = null;
			if (aeroelastics != null)
				msgs = ((InternalEObject) aeroelastics).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS, null, msgs);
			if (newAeroelastics != null)
				msgs = ((InternalEObject) newAeroelastics).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS, null, msgs);
			msgs = basicSetAeroelastics(newAeroelastics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS,
					newAeroelastics, newAeroelastics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsAnalysisType getFlightDynamics() {
		return flightDynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightDynamics(FlightDynamicsAnalysisType newFlightDynamics,
			NotificationChain msgs) {
		FlightDynamicsAnalysisType oldFlightDynamics = flightDynamics;
		flightDynamics = newFlightDynamics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS, oldFlightDynamics, newFlightDynamics);
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
	public void setFlightDynamics(FlightDynamicsAnalysisType newFlightDynamics) {
		if (newFlightDynamics != flightDynamics) {
			NotificationChain msgs = null;
			if (flightDynamics != null)
				msgs = ((InternalEObject) flightDynamics).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS, null, msgs);
			if (newFlightDynamics != null)
				msgs = ((InternalEObject) newFlightDynamics).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS, null, msgs);
			msgs = basicSetFlightDynamics(newFlightDynamics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS,
					newFlightDynamics, newFlightDynamics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightSystemsType getFlightSystems() {
		return flightSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightSystems(FlightSystemsType newFlightSystems, NotificationChain msgs) {
		FlightSystemsType oldFlightSystems = flightSystems;
		flightSystems = newFlightSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS, oldFlightSystems, newFlightSystems);
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
	public void setFlightSystems(FlightSystemsType newFlightSystems) {
		if (newFlightSystems != flightSystems) {
			NotificationChain msgs = null;
			if (flightSystems != null)
				msgs = ((InternalEObject) flightSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS, null, msgs);
			if (newFlightSystems != null)
				msgs = ((InternalEObject) newFlightSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS, null, msgs);
			msgs = basicSetFlightSystems(newFlightSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS,
					newFlightSystems, newFlightSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearPositionSafetyMarginsType getLandingGearPositionSafetyMargins() {
		return landingGearPositionSafetyMargins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearPositionSafetyMargins(
			LandingGearPositionSafetyMarginsType newLandingGearPositionSafetyMargins, NotificationChain msgs) {
		LandingGearPositionSafetyMarginsType oldLandingGearPositionSafetyMargins = landingGearPositionSafetyMargins;
		landingGearPositionSafetyMargins = newLandingGearPositionSafetyMargins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS,
					oldLandingGearPositionSafetyMargins, newLandingGearPositionSafetyMargins);
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
	public void setLandingGearPositionSafetyMargins(
			LandingGearPositionSafetyMarginsType newLandingGearPositionSafetyMargins) {
		if (newLandingGearPositionSafetyMargins != landingGearPositionSafetyMargins) {
			NotificationChain msgs = null;
			if (landingGearPositionSafetyMargins != null)
				msgs = ((InternalEObject) landingGearPositionSafetyMargins).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS,
						null, msgs);
			if (newLandingGearPositionSafetyMargins != null)
				msgs = ((InternalEObject) newLandingGearPositionSafetyMargins).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS,
						null, msgs);
			msgs = basicSetLandingGearPositionSafetyMargins(newLandingGearPositionSafetyMargins, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS,
					newLandingGearPositionSafetyMargins, newLandingGearPositionSafetyMargins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadAnalysisType getLoadAnalysis() {
		return loadAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadAnalysis(LoadAnalysisType newLoadAnalysis, NotificationChain msgs) {
		LoadAnalysisType oldLoadAnalysis = loadAnalysis;
		loadAnalysis = newLoadAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS, oldLoadAnalysis, newLoadAnalysis);
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
	public void setLoadAnalysis(LoadAnalysisType newLoadAnalysis) {
		if (newLoadAnalysis != loadAnalysis) {
			NotificationChain msgs = null;
			if (loadAnalysis != null)
				msgs = ((InternalEObject) loadAnalysis).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS, null, msgs);
			if (newLoadAnalysis != null)
				msgs = ((InternalEObject) newLoadAnalysis).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS, null, msgs);
			msgs = basicSetLoadAnalysis(newLoadAnalysis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS,
					newLoadAnalysis, newLoadAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassBreakdownType getMassBreakdown() {
		return massBreakdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassBreakdown(MassBreakdownType newMassBreakdown, NotificationChain msgs) {
		MassBreakdownType oldMassBreakdown = massBreakdown;
		massBreakdown = newMassBreakdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN, oldMassBreakdown, newMassBreakdown);
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
	public void setMassBreakdown(MassBreakdownType newMassBreakdown) {
		if (newMassBreakdown != massBreakdown) {
			NotificationChain msgs = null;
			if (massBreakdown != null)
				msgs = ((InternalEObject) massBreakdown).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN, null, msgs);
			if (newMassBreakdown != null)
				msgs = ((InternalEObject) newMassBreakdown).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN, null, msgs);
			msgs = basicSetMassBreakdown(newMassBreakdown, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN,
					newMassBreakdown, newMassBreakdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonetaryValuesAnalysisType getMonetaryValues() {
		return monetaryValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonetaryValues(MonetaryValuesAnalysisType newMonetaryValues,
			NotificationChain msgs) {
		MonetaryValuesAnalysisType oldMonetaryValues = monetaryValues;
		monetaryValues = newMonetaryValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES, oldMonetaryValues, newMonetaryValues);
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
	public void setMonetaryValues(MonetaryValuesAnalysisType newMonetaryValues) {
		if (newMonetaryValues != monetaryValues) {
			NotificationChain msgs = null;
			if (monetaryValues != null)
				msgs = ((InternalEObject) monetaryValues).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES, null, msgs);
			if (newMonetaryValues != null)
				msgs = ((InternalEObject) newMonetaryValues).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES, null, msgs);
			msgs = basicSetMonetaryValues(newMonetaryValues, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES,
					newMonetaryValues, newMonetaryValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoiseAnalysisType getNoise() {
		return noise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoise(NoiseAnalysisType newNoise, NotificationChain msgs) {
		NoiseAnalysisType oldNoise = noise;
		noise = newNoise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE, oldNoise, newNoise);
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
	public void setNoise(NoiseAnalysisType newNoise) {
		if (newNoise != noise) {
			NotificationChain msgs = null;
			if (noise != null)
				msgs = ((InternalEObject) noise).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE, null, msgs);
			if (newNoise != null)
				msgs = ((InternalEObject) newNoise).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE, null, msgs);
			msgs = basicSetNoise(newNoise, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE, newNoise,
					newNoise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrajectoriesType getTrajectories() {
		return trajectories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrajectories(TrajectoriesType newTrajectories, NotificationChain msgs) {
		TrajectoriesType oldTrajectories = trajectories;
		trajectories = newTrajectories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES, oldTrajectories, newTrajectories);
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
	public void setTrajectories(TrajectoriesType newTrajectories) {
		if (newTrajectories != trajectories) {
			NotificationChain msgs = null;
			if (trajectories != null)
				msgs = ((InternalEObject) trajectories).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES, null, msgs);
			if (newTrajectories != null)
				msgs = ((InternalEObject) newTrajectories).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES, null, msgs);
			msgs = basicSetTrajectories(newTrajectories, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES,
					newTrajectories, newTrajectories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalanceType getWeightAndBalance() {
		return weightAndBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeightAndBalance(WeightAndBalanceType newWeightAndBalance,
			NotificationChain msgs) {
		WeightAndBalanceType oldWeightAndBalance = weightAndBalance;
		weightAndBalance = newWeightAndBalance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE, oldWeightAndBalance, newWeightAndBalance);
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
	public void setWeightAndBalance(WeightAndBalanceType newWeightAndBalance) {
		if (newWeightAndBalance != weightAndBalance) {
			NotificationChain msgs = null;
			if (weightAndBalance != null)
				msgs = ((InternalEObject) weightAndBalance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE, null, msgs);
			if (newWeightAndBalance != null)
				msgs = ((InternalEObject) newWeightAndBalance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE, null, msgs);
			msgs = basicSetWeightAndBalance(newWeightAndBalance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE, newWeightAndBalance, newWeightAndBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL:
			return basicSetGlobal(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			return basicSetAeroPerformance(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS:
			return basicSetAeroelastics(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS:
			return basicSetFlightDynamics(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS:
			return basicSetFlightSystems(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			return basicSetLandingGearPositionSafetyMargins(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			return basicSetLoadAnalysis(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			return basicSetMassBreakdown(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES:
			return basicSetMonetaryValues(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE:
			return basicSetNoise(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			return basicSetTrajectories(null, msgs);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			return basicSetWeightAndBalance(null, msgs);
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
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL:
			return getGlobal();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			return getAeroPerformance();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS:
			return getAeroelastics();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS:
			return getFlightDynamics();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS:
			return getFlightSystems();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			return getLandingGearPositionSafetyMargins();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			return getLoadAnalysis();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			return getMassBreakdown();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES:
			return getMonetaryValues();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE:
			return getNoise();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			return getTrajectories();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			return getWeightAndBalance();
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
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL:
			setGlobal((AircraftAnalysesGlobalType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			setAeroPerformance((AeroPerformanceType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS:
			setAeroelastics((AeroelasticsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS:
			setFlightDynamics((FlightDynamicsAnalysisType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS:
			setFlightSystems((FlightSystemsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			setLandingGearPositionSafetyMargins((LandingGearPositionSafetyMarginsType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			setLoadAnalysis((LoadAnalysisType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			setMassBreakdown((MassBreakdownType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES:
			setMonetaryValues((MonetaryValuesAnalysisType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE:
			setNoise((NoiseAnalysisType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			setTrajectories((TrajectoriesType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			setWeightAndBalance((WeightAndBalanceType) newValue);
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
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL:
			setGlobal((AircraftAnalysesGlobalType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			setAeroPerformance((AeroPerformanceType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS:
			setAeroelastics((AeroelasticsType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS:
			setFlightDynamics((FlightDynamicsAnalysisType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS:
			setFlightSystems((FlightSystemsType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			setLandingGearPositionSafetyMargins((LandingGearPositionSafetyMarginsType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			setLoadAnalysis((LoadAnalysisType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			setMassBreakdown((MassBreakdownType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES:
			setMonetaryValues((MonetaryValuesAnalysisType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE:
			setNoise((NoiseAnalysisType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			setTrajectories((TrajectoriesType) null);
			return;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			setWeightAndBalance((WeightAndBalanceType) null);
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
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__GLOBAL:
			return global != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			return aeroPerformance != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__AEROELASTICS:
			return aeroelastics != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_DYNAMICS:
			return flightDynamics != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__FLIGHT_SYSTEMS:
			return flightSystems != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			return landingGearPositionSafetyMargins != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			return loadAnalysis != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			return massBreakdown != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__MONETARY_VALUES:
			return monetaryValues != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__NOISE:
			return noise != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			return trajectories != null;
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			return weightAndBalance != null;
		}
		return super.eIsSet(featureID);
	}

} //AircraftAnalysesTypeImpl
