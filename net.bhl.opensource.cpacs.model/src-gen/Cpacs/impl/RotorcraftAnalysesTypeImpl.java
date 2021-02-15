/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceRCType;
import Cpacs.AeroelasticsType;
import Cpacs.CpacsPackage;
import Cpacs.DynamicAircraftModelAnalysisType;
import Cpacs.LandingGearPositionSafetyMarginsType;
import Cpacs.LoadAnalysisType;
import Cpacs.NoiseAnalysisType;
import Cpacs.RotorcraftAnalysesType;
import Cpacs.RotorcraftMassBreakdownType;
import Cpacs.TrajectoriesType;
import Cpacs.WeightAndBalanceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotorcraft Analyses Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getAeroPerformance <em>Aero Performance</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getPaxFlow <em>Pax Flow</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getAeroelastics <em>Aeroelastics</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getMassBreakdown <em>Mass Breakdown</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getLandingGearPositionSafetyMargins <em>Landing Gear Position Safety Margins</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getLoadAnalysis <em>Load Analysis</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getWeightAndBalance <em>Weight And Balance</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getTrajectories <em>Trajectories</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getNoise <em>Noise</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftAnalysesTypeImpl#getEmission <em>Emission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorcraftAnalysesTypeImpl extends ComplexBaseTypeImpl implements RotorcraftAnalysesType {
	/**
	 * The cached value of the '{@link #getAeroPerformance() <em>Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected AeroPerformanceRCType aeroPerformance;

	/**
	 * The default value of the '{@link #getPaxFlow() <em>Pax Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxFlow()
	 * @generated
	 * @ordered
	 */
	protected static final String PAX_FLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaxFlow() <em>Pax Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxFlow()
	 * @generated
	 * @ordered
	 */
	protected String paxFlow = PAX_FLOW_EDEFAULT;

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
	 * The cached value of the '{@link #getMassBreakdown() <em>Mass Breakdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassBreakdown()
	 * @generated
	 * @ordered
	 */
	protected RotorcraftMassBreakdownType massBreakdown;

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
	 * The cached value of the '{@link #getDynamicAircraftModel() <em>Dynamic Aircraft Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAircraftModel()
	 * @generated
	 * @ordered
	 */
	protected DynamicAircraftModelAnalysisType dynamicAircraftModel;

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
	 * The cached value of the '{@link #getTrajectories() <em>Trajectories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectories()
	 * @generated
	 * @ordered
	 */
	protected TrajectoriesType trajectories;

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
	 * The default value of the '{@link #getEmission() <em>Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmission()
	 * @generated
	 * @ordered
	 */
	protected static final String EMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmission() <em>Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmission()
	 * @generated
	 * @ordered
	 */
	protected String emission = EMISSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotorcraftAnalysesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorcraftAnalysesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceRCType getAeroPerformance() {
		return aeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroPerformance(AeroPerformanceRCType newAeroPerformance, NotificationChain msgs) {
		AeroPerformanceRCType oldAeroPerformance = aeroPerformance;
		aeroPerformance = newAeroPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE, oldAeroPerformance, newAeroPerformance);
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
	public void setAeroPerformance(AeroPerformanceRCType newAeroPerformance) {
		if (newAeroPerformance != aeroPerformance) {
			NotificationChain msgs = null;
			if (aeroPerformance != null)
				msgs = ((InternalEObject) aeroPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE, null, msgs);
			if (newAeroPerformance != null)
				msgs = ((InternalEObject) newAeroPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE, null, msgs);
			msgs = basicSetAeroPerformance(newAeroPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE, newAeroPerformance, newAeroPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaxFlow() {
		return paxFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaxFlow(String newPaxFlow) {
		String oldPaxFlow = paxFlow;
		paxFlow = newPaxFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__PAX_FLOW,
					oldPaxFlow, paxFlow));
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
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS, oldAeroelastics, newAeroelastics);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS, null, msgs);
			if (newAeroelastics != null)
				msgs = ((InternalEObject) newAeroelastics).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS, null, msgs);
			msgs = basicSetAeroelastics(newAeroelastics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS,
					newAeroelastics, newAeroelastics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassBreakdownType getMassBreakdown() {
		return massBreakdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassBreakdown(RotorcraftMassBreakdownType newMassBreakdown,
			NotificationChain msgs) {
		RotorcraftMassBreakdownType oldMassBreakdown = massBreakdown;
		massBreakdown = newMassBreakdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN, oldMassBreakdown, newMassBreakdown);
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
	public void setMassBreakdown(RotorcraftMassBreakdownType newMassBreakdown) {
		if (newMassBreakdown != massBreakdown) {
			NotificationChain msgs = null;
			if (massBreakdown != null)
				msgs = ((InternalEObject) massBreakdown).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN, null, msgs);
			if (newMassBreakdown != null)
				msgs = ((InternalEObject) newMassBreakdown).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN, null, msgs);
			msgs = basicSetMassBreakdown(newMassBreakdown, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN,
					newMassBreakdown, newMassBreakdown));
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
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS,
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
								- CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS,
						null, msgs);
			if (newLandingGearPositionSafetyMargins != null)
				msgs = ((InternalEObject) newLandingGearPositionSafetyMargins).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS,
						null, msgs);
			msgs = basicSetLandingGearPositionSafetyMargins(newLandingGearPositionSafetyMargins, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS,
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
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS, oldLoadAnalysis, newLoadAnalysis);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS, null, msgs);
			if (newLoadAnalysis != null)
				msgs = ((InternalEObject) newLoadAnalysis).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS, null, msgs);
			msgs = basicSetLoadAnalysis(newLoadAnalysis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS,
					newLoadAnalysis, newLoadAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicAircraftModelAnalysisType getDynamicAircraftModel() {
		return dynamicAircraftModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicAircraftModel(DynamicAircraftModelAnalysisType newDynamicAircraftModel,
			NotificationChain msgs) {
		DynamicAircraftModelAnalysisType oldDynamicAircraftModel = dynamicAircraftModel;
		dynamicAircraftModel = newDynamicAircraftModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL, oldDynamicAircraftModel,
					newDynamicAircraftModel);
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
	public void setDynamicAircraftModel(DynamicAircraftModelAnalysisType newDynamicAircraftModel) {
		if (newDynamicAircraftModel != dynamicAircraftModel) {
			NotificationChain msgs = null;
			if (dynamicAircraftModel != null)
				msgs = ((InternalEObject) dynamicAircraftModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL, null,
						msgs);
			if (newDynamicAircraftModel != null)
				msgs = ((InternalEObject) newDynamicAircraftModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL, null,
						msgs);
			msgs = basicSetDynamicAircraftModel(newDynamicAircraftModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL, newDynamicAircraftModel,
					newDynamicAircraftModel));
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
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE, oldWeightAndBalance,
					newWeightAndBalance);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE, null, msgs);
			if (newWeightAndBalance != null)
				msgs = ((InternalEObject) newWeightAndBalance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE, null, msgs);
			msgs = basicSetWeightAndBalance(newWeightAndBalance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE, newWeightAndBalance,
					newWeightAndBalance));
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
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES, oldTrajectories, newTrajectories);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES, null, msgs);
			if (newTrajectories != null)
				msgs = ((InternalEObject) newTrajectories).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES, null, msgs);
			msgs = basicSetTrajectories(newTrajectories, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES,
					newTrajectories, newTrajectories));
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
					CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE, oldNoise, newNoise);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE, null, msgs);
			if (newNoise != null)
				msgs = ((InternalEObject) newNoise).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE, null, msgs);
			msgs = basicSetNoise(newNoise, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE,
					newNoise, newNoise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmission() {
		return emission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmission(String newEmission) {
		String oldEmission = emission;
		emission = newEmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__EMISSION,
					oldEmission, emission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			return basicSetAeroPerformance(null, msgs);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS:
			return basicSetAeroelastics(null, msgs);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			return basicSetMassBreakdown(null, msgs);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			return basicSetLandingGearPositionSafetyMargins(null, msgs);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			return basicSetLoadAnalysis(null, msgs);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL:
			return basicSetDynamicAircraftModel(null, msgs);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			return basicSetWeightAndBalance(null, msgs);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			return basicSetTrajectories(null, msgs);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE:
			return basicSetNoise(null, msgs);
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
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			return getAeroPerformance();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__PAX_FLOW:
			return getPaxFlow();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS:
			return getAeroelastics();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			return getMassBreakdown();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			return getLandingGearPositionSafetyMargins();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			return getLoadAnalysis();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL:
			return getDynamicAircraftModel();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			return getWeightAndBalance();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			return getTrajectories();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE:
			return getNoise();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__EMISSION:
			return getEmission();
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
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			setAeroPerformance((AeroPerformanceRCType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__PAX_FLOW:
			setPaxFlow((String) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS:
			setAeroelastics((AeroelasticsType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			setMassBreakdown((RotorcraftMassBreakdownType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			setLandingGearPositionSafetyMargins((LandingGearPositionSafetyMarginsType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			setLoadAnalysis((LoadAnalysisType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL:
			setDynamicAircraftModel((DynamicAircraftModelAnalysisType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			setWeightAndBalance((WeightAndBalanceType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			setTrajectories((TrajectoriesType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE:
			setNoise((NoiseAnalysisType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__EMISSION:
			setEmission((String) newValue);
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
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			setAeroPerformance((AeroPerformanceRCType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__PAX_FLOW:
			setPaxFlow(PAX_FLOW_EDEFAULT);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS:
			setAeroelastics((AeroelasticsType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			setMassBreakdown((RotorcraftMassBreakdownType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			setLandingGearPositionSafetyMargins((LandingGearPositionSafetyMarginsType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			setLoadAnalysis((LoadAnalysisType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL:
			setDynamicAircraftModel((DynamicAircraftModelAnalysisType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			setWeightAndBalance((WeightAndBalanceType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			setTrajectories((TrajectoriesType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE:
			setNoise((NoiseAnalysisType) null);
			return;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__EMISSION:
			setEmission(EMISSION_EDEFAULT);
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
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AERO_PERFORMANCE:
			return aeroPerformance != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__PAX_FLOW:
			return PAX_FLOW_EDEFAULT == null ? paxFlow != null : !PAX_FLOW_EDEFAULT.equals(paxFlow);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__AEROELASTICS:
			return aeroelastics != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__MASS_BREAKDOWN:
			return massBreakdown != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LANDING_GEAR_POSITION_SAFETY_MARGINS:
			return landingGearPositionSafetyMargins != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__LOAD_ANALYSIS:
			return loadAnalysis != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__DYNAMIC_AIRCRAFT_MODEL:
			return dynamicAircraftModel != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__WEIGHT_AND_BALANCE:
			return weightAndBalance != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__TRAJECTORIES:
			return trajectories != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__NOISE:
			return noise != null;
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE__EMISSION:
			return EMISSION_EDEFAULT == null ? emission != null : !EMISSION_EDEFAULT.equals(emission);
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
		result.append(" (paxFlow: ");
		result.append(paxFlow);
		result.append(", emission: ");
		result.append(emission);
		result.append(')');
		return result.toString();
	}

} //RotorcraftAnalysesTypeImpl
