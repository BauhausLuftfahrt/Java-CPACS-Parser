/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EnginePerformanceMapType;
import Cpacs.StringBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Performance Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getBleedAirOfftake <em>Bleed Air Offtake</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getPowerOfftake <em>Power Offtake</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getFlightLevel <em>Flight Level</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getThrust <em>Thrust</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getMDotFuel <em>MDot Fuel</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getV8 <em>V8</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getT8 <em>T8</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getMDot8 <em>MDot8</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getV18 <em>V18</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getT18 <em>T18</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getMDot18 <em>MDot18</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getN1 <em>N1</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getN2 <em>N2</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getPiFan <em>Pi Fan</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getEtaPFan <em>Eta PFan</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getTET <em>TET</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getEiCO <em>Ei CO</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getEiNOx <em>Ei NOx</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getEiSOx <em>Ei SOx</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getEiSoot <em>Ei Soot</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getEiHC <em>Ei HC</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getRho8 <em>Rho8</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getRho18 <em>Rho18</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getNozzA8 <em>Nozz A8</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getNozzA18 <em>Nozz A18</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnginePerformanceMapTypeImpl extends ComplexBaseTypeImpl implements EnginePerformanceMapType {
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
	 * The cached value of the '{@link #getBleedAirOfftake() <em>Bleed Air Offtake</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBleedAirOfftake()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType bleedAirOfftake;

	/**
	 * The cached value of the '{@link #getPowerOfftake() <em>Power Offtake</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOfftake()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType powerOfftake;

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
	 * The cached value of the '{@link #getFlightLevel() <em>Flight Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightLevel()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType flightLevel;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType machNumber;

	/**
	 * The cached value of the '{@link #getThrust() <em>Thrust</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrust()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType thrust;

	/**
	 * The cached value of the '{@link #getMDotFuel() <em>MDot Fuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDotFuel()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mDotFuel;

	/**
	 * The cached value of the '{@link #getV8() <em>V8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV8()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType v8;

	/**
	 * The cached value of the '{@link #getT8() <em>T8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT8()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType t8;

	/**
	 * The cached value of the '{@link #getMDot8() <em>MDot8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDot8()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mDot8;

	/**
	 * The cached value of the '{@link #getV18() <em>V18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV18()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType v18;

	/**
	 * The cached value of the '{@link #getT18() <em>T18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT18()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType t18;

	/**
	 * The cached value of the '{@link #getMDot18() <em>MDot18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDot18()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mDot18;

	/**
	 * The cached value of the '{@link #getN1() <em>N1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN1()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType n1;

	/**
	 * The cached value of the '{@link #getN2() <em>N2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN2()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType n2;

	/**
	 * The cached value of the '{@link #getPiFan() <em>Pi Fan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiFan()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType piFan;

	/**
	 * The cached value of the '{@link #getEtaPFan() <em>Eta PFan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtaPFan()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType etaPFan;

	/**
	 * The cached value of the '{@link #getTET() <em>TET</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTET()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType tET;

	/**
	 * The cached value of the '{@link #getEiCO() <em>Ei CO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEiCO()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType eiCO;

	/**
	 * The cached value of the '{@link #getEiNOx() <em>Ei NOx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEiNOx()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType eiNOx;

	/**
	 * The cached value of the '{@link #getEiSOx() <em>Ei SOx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEiSOx()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType eiSOx;

	/**
	 * The cached value of the '{@link #getEiSoot() <em>Ei Soot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEiSoot()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType eiSoot;

	/**
	 * The cached value of the '{@link #getEiHC() <em>Ei HC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEiHC()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType eiHC;

	/**
	 * The cached value of the '{@link #getRho8() <em>Rho8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRho8()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType rho8;

	/**
	 * The cached value of the '{@link #getRho18() <em>Rho18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRho18()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType rho18;

	/**
	 * The cached value of the '{@link #getNozzA8() <em>Nozz A8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNozzA8()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType nozzA8;

	/**
	 * The cached value of the '{@link #getNozzA18() <em>Nozz A18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNozzA18()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType nozzA18;

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
	protected EnginePerformanceMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEnginePerformanceMapType();
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
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME,
					newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getBleedAirOfftake() {
		return bleedAirOfftake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBleedAirOfftake(DoubleBaseType newBleedAirOfftake, NotificationChain msgs) {
		DoubleBaseType oldBleedAirOfftake = bleedAirOfftake;
		bleedAirOfftake = newBleedAirOfftake;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE, oldBleedAirOfftake,
					newBleedAirOfftake);
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
	public void setBleedAirOfftake(DoubleBaseType newBleedAirOfftake) {
		if (newBleedAirOfftake != bleedAirOfftake) {
			NotificationChain msgs = null;
			if (bleedAirOfftake != null)
				msgs = ((InternalEObject) bleedAirOfftake).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE, null,
						msgs);
			if (newBleedAirOfftake != null)
				msgs = ((InternalEObject) newBleedAirOfftake).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE, null,
						msgs);
			msgs = basicSetBleedAirOfftake(newBleedAirOfftake, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE, newBleedAirOfftake,
					newBleedAirOfftake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPowerOfftake() {
		return powerOfftake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerOfftake(DoubleBaseType newPowerOfftake, NotificationChain msgs) {
		DoubleBaseType oldPowerOfftake = powerOfftake;
		powerOfftake = newPowerOfftake;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE, oldPowerOfftake, newPowerOfftake);
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
	public void setPowerOfftake(DoubleBaseType newPowerOfftake) {
		if (newPowerOfftake != powerOfftake) {
			NotificationChain msgs = null;
			if (powerOfftake != null)
				msgs = ((InternalEObject) powerOfftake).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE, null, msgs);
			if (newPowerOfftake != null)
				msgs = ((InternalEObject) newPowerOfftake).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE, null, msgs);
			msgs = basicSetPowerOfftake(newPowerOfftake, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE, newPowerOfftake, newPowerOfftake));
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
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getFlightLevel() {
		return flightLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightLevel(StringVectorBaseType newFlightLevel, NotificationChain msgs) {
		StringVectorBaseType oldFlightLevel = flightLevel;
		flightLevel = newFlightLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL, oldFlightLevel, newFlightLevel);
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
	public void setFlightLevel(StringVectorBaseType newFlightLevel) {
		if (newFlightLevel != flightLevel) {
			NotificationChain msgs = null;
			if (flightLevel != null)
				msgs = ((InternalEObject) flightLevel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL, null, msgs);
			if (newFlightLevel != null)
				msgs = ((InternalEObject) newFlightLevel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL, null, msgs);
			msgs = basicSetFlightLevel(newFlightLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL, newFlightLevel, newFlightLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(StringVectorBaseType newMachNumber, NotificationChain msgs) {
		StringVectorBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(StringVectorBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER,
					newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getThrust() {
		return thrust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrust(StringVectorBaseType newThrust, NotificationChain msgs) {
		StringVectorBaseType oldThrust = thrust;
		thrust = newThrust;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST, oldThrust, newThrust);
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
	public void setThrust(StringVectorBaseType newThrust) {
		if (newThrust != thrust) {
			NotificationChain msgs = null;
			if (thrust != null)
				msgs = ((InternalEObject) thrust).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST, null, msgs);
			if (newThrust != null)
				msgs = ((InternalEObject) newThrust).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST, null, msgs);
			msgs = basicSetThrust(newThrust, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST,
					newThrust, newThrust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMDotFuel() {
		return mDotFuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDotFuel(StringVectorBaseType newMDotFuel, NotificationChain msgs) {
		StringVectorBaseType oldMDotFuel = mDotFuel;
		mDotFuel = newMDotFuel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL, oldMDotFuel, newMDotFuel);
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
	public void setMDotFuel(StringVectorBaseType newMDotFuel) {
		if (newMDotFuel != mDotFuel) {
			NotificationChain msgs = null;
			if (mDotFuel != null)
				msgs = ((InternalEObject) mDotFuel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL, null, msgs);
			if (newMDotFuel != null)
				msgs = ((InternalEObject) newMDotFuel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL, null, msgs);
			msgs = basicSetMDotFuel(newMDotFuel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL,
					newMDotFuel, newMDotFuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getV8() {
		return v8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV8(StringVectorBaseType newV8, NotificationChain msgs) {
		StringVectorBaseType oldV8 = v8;
		v8 = newV8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8, oldV8, newV8);
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
	public void setV8(StringVectorBaseType newV8) {
		if (newV8 != v8) {
			NotificationChain msgs = null;
			if (v8 != null)
				msgs = ((InternalEObject) v8).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8, null, msgs);
			if (newV8 != null)
				msgs = ((InternalEObject) newV8).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8, null, msgs);
			msgs = basicSetV8(newV8, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8, newV8,
					newV8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getT8() {
		return t8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT8(StringVectorBaseType newT8, NotificationChain msgs) {
		StringVectorBaseType oldT8 = t8;
		t8 = newT8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8, oldT8, newT8);
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
	public void setT8(StringVectorBaseType newT8) {
		if (newT8 != t8) {
			NotificationChain msgs = null;
			if (t8 != null)
				msgs = ((InternalEObject) t8).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8, null, msgs);
			if (newT8 != null)
				msgs = ((InternalEObject) newT8).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8, null, msgs);
			msgs = basicSetT8(newT8, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8, newT8,
					newT8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMDot8() {
		return mDot8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDot8(StringVectorBaseType newMDot8, NotificationChain msgs) {
		StringVectorBaseType oldMDot8 = mDot8;
		mDot8 = newMDot8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8, oldMDot8, newMDot8);
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
	public void setMDot8(StringVectorBaseType newMDot8) {
		if (newMDot8 != mDot8) {
			NotificationChain msgs = null;
			if (mDot8 != null)
				msgs = ((InternalEObject) mDot8).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8, null, msgs);
			if (newMDot8 != null)
				msgs = ((InternalEObject) newMDot8).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8, null, msgs);
			msgs = basicSetMDot8(newMDot8, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8,
					newMDot8, newMDot8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getV18() {
		return v18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV18(StringVectorBaseType newV18, NotificationChain msgs) {
		StringVectorBaseType oldV18 = v18;
		v18 = newV18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18, oldV18, newV18);
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
	public void setV18(StringVectorBaseType newV18) {
		if (newV18 != v18) {
			NotificationChain msgs = null;
			if (v18 != null)
				msgs = ((InternalEObject) v18).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18, null, msgs);
			if (newV18 != null)
				msgs = ((InternalEObject) newV18).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18, null, msgs);
			msgs = basicSetV18(newV18, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18, newV18,
					newV18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getT18() {
		return t18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT18(StringVectorBaseType newT18, NotificationChain msgs) {
		StringVectorBaseType oldT18 = t18;
		t18 = newT18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18, oldT18, newT18);
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
	public void setT18(StringVectorBaseType newT18) {
		if (newT18 != t18) {
			NotificationChain msgs = null;
			if (t18 != null)
				msgs = ((InternalEObject) t18).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18, null, msgs);
			if (newT18 != null)
				msgs = ((InternalEObject) newT18).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18, null, msgs);
			msgs = basicSetT18(newT18, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18, newT18,
					newT18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMDot18() {
		return mDot18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDot18(StringVectorBaseType newMDot18, NotificationChain msgs) {
		StringVectorBaseType oldMDot18 = mDot18;
		mDot18 = newMDot18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18, oldMDot18, newMDot18);
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
	public void setMDot18(StringVectorBaseType newMDot18) {
		if (newMDot18 != mDot18) {
			NotificationChain msgs = null;
			if (mDot18 != null)
				msgs = ((InternalEObject) mDot18).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18, null, msgs);
			if (newMDot18 != null)
				msgs = ((InternalEObject) newMDot18).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18, null, msgs);
			msgs = basicSetMDot18(newMDot18, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18,
					newMDot18, newMDot18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getN1() {
		return n1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetN1(StringVectorBaseType newN1, NotificationChain msgs) {
		StringVectorBaseType oldN1 = n1;
		n1 = newN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1, oldN1, newN1);
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
	public void setN1(StringVectorBaseType newN1) {
		if (newN1 != n1) {
			NotificationChain msgs = null;
			if (n1 != null)
				msgs = ((InternalEObject) n1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1, null, msgs);
			if (newN1 != null)
				msgs = ((InternalEObject) newN1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1, null, msgs);
			msgs = basicSetN1(newN1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1, newN1,
					newN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getN2() {
		return n2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetN2(StringVectorBaseType newN2, NotificationChain msgs) {
		StringVectorBaseType oldN2 = n2;
		n2 = newN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2, oldN2, newN2);
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
	public void setN2(StringVectorBaseType newN2) {
		if (newN2 != n2) {
			NotificationChain msgs = null;
			if (n2 != null)
				msgs = ((InternalEObject) n2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2, null, msgs);
			if (newN2 != null)
				msgs = ((InternalEObject) newN2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2, null, msgs);
			msgs = basicSetN2(newN2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2, newN2,
					newN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getPiFan() {
		return piFan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPiFan(StringVectorBaseType newPiFan, NotificationChain msgs) {
		StringVectorBaseType oldPiFan = piFan;
		piFan = newPiFan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN, oldPiFan, newPiFan);
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
	public void setPiFan(StringVectorBaseType newPiFan) {
		if (newPiFan != piFan) {
			NotificationChain msgs = null;
			if (piFan != null)
				msgs = ((InternalEObject) piFan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN, null, msgs);
			if (newPiFan != null)
				msgs = ((InternalEObject) newPiFan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN, null, msgs);
			msgs = basicSetPiFan(newPiFan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN,
					newPiFan, newPiFan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getEtaPFan() {
		return etaPFan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtaPFan(StringVectorBaseType newEtaPFan, NotificationChain msgs) {
		StringVectorBaseType oldEtaPFan = etaPFan;
		etaPFan = newEtaPFan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN, oldEtaPFan, newEtaPFan);
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
	public void setEtaPFan(StringVectorBaseType newEtaPFan) {
		if (newEtaPFan != etaPFan) {
			NotificationChain msgs = null;
			if (etaPFan != null)
				msgs = ((InternalEObject) etaPFan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN, null, msgs);
			if (newEtaPFan != null)
				msgs = ((InternalEObject) newEtaPFan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN, null, msgs);
			msgs = basicSetEtaPFan(newEtaPFan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN,
					newEtaPFan, newEtaPFan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getTET() {
		return tET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTET(StringVectorBaseType newTET, NotificationChain msgs) {
		StringVectorBaseType oldTET = tET;
		tET = newTET;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET, oldTET, newTET);
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
	public void setTET(StringVectorBaseType newTET) {
		if (newTET != tET) {
			NotificationChain msgs = null;
			if (tET != null)
				msgs = ((InternalEObject) tET).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET, null, msgs);
			if (newTET != null)
				msgs = ((InternalEObject) newTET).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET, null, msgs);
			msgs = basicSetTET(newTET, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET, newTET,
					newTET));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getEiCO() {
		return eiCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEiCO(StringVectorBaseType newEiCO, NotificationChain msgs) {
		StringVectorBaseType oldEiCO = eiCO;
		eiCO = newEiCO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO, oldEiCO, newEiCO);
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
	public void setEiCO(StringVectorBaseType newEiCO) {
		if (newEiCO != eiCO) {
			NotificationChain msgs = null;
			if (eiCO != null)
				msgs = ((InternalEObject) eiCO).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO, null, msgs);
			if (newEiCO != null)
				msgs = ((InternalEObject) newEiCO).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO, null, msgs);
			msgs = basicSetEiCO(newEiCO, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO,
					newEiCO, newEiCO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getEiNOx() {
		return eiNOx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEiNOx(StringVectorBaseType newEiNOx, NotificationChain msgs) {
		StringVectorBaseType oldEiNOx = eiNOx;
		eiNOx = newEiNOx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX, oldEiNOx, newEiNOx);
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
	public void setEiNOx(StringVectorBaseType newEiNOx) {
		if (newEiNOx != eiNOx) {
			NotificationChain msgs = null;
			if (eiNOx != null)
				msgs = ((InternalEObject) eiNOx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX, null, msgs);
			if (newEiNOx != null)
				msgs = ((InternalEObject) newEiNOx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX, null, msgs);
			msgs = basicSetEiNOx(newEiNOx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX,
					newEiNOx, newEiNOx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getEiSOx() {
		return eiSOx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEiSOx(StringVectorBaseType newEiSOx, NotificationChain msgs) {
		StringVectorBaseType oldEiSOx = eiSOx;
		eiSOx = newEiSOx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX, oldEiSOx, newEiSOx);
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
	public void setEiSOx(StringVectorBaseType newEiSOx) {
		if (newEiSOx != eiSOx) {
			NotificationChain msgs = null;
			if (eiSOx != null)
				msgs = ((InternalEObject) eiSOx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX, null, msgs);
			if (newEiSOx != null)
				msgs = ((InternalEObject) newEiSOx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX, null, msgs);
			msgs = basicSetEiSOx(newEiSOx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX,
					newEiSOx, newEiSOx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getEiSoot() {
		return eiSoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEiSoot(StringVectorBaseType newEiSoot, NotificationChain msgs) {
		StringVectorBaseType oldEiSoot = eiSoot;
		eiSoot = newEiSoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT, oldEiSoot, newEiSoot);
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
	public void setEiSoot(StringVectorBaseType newEiSoot) {
		if (newEiSoot != eiSoot) {
			NotificationChain msgs = null;
			if (eiSoot != null)
				msgs = ((InternalEObject) eiSoot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT, null, msgs);
			if (newEiSoot != null)
				msgs = ((InternalEObject) newEiSoot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT, null, msgs);
			msgs = basicSetEiSoot(newEiSoot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT,
					newEiSoot, newEiSoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getEiHC() {
		return eiHC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEiHC(StringVectorBaseType newEiHC, NotificationChain msgs) {
		StringVectorBaseType oldEiHC = eiHC;
		eiHC = newEiHC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC, oldEiHC, newEiHC);
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
	public void setEiHC(StringVectorBaseType newEiHC) {
		if (newEiHC != eiHC) {
			NotificationChain msgs = null;
			if (eiHC != null)
				msgs = ((InternalEObject) eiHC).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC, null, msgs);
			if (newEiHC != null)
				msgs = ((InternalEObject) newEiHC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC, null, msgs);
			msgs = basicSetEiHC(newEiHC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC,
					newEiHC, newEiHC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getRho8() {
		return rho8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRho8(StringVectorBaseType newRho8, NotificationChain msgs) {
		StringVectorBaseType oldRho8 = rho8;
		rho8 = newRho8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8, oldRho8, newRho8);
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
	public void setRho8(StringVectorBaseType newRho8) {
		if (newRho8 != rho8) {
			NotificationChain msgs = null;
			if (rho8 != null)
				msgs = ((InternalEObject) rho8).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8, null, msgs);
			if (newRho8 != null)
				msgs = ((InternalEObject) newRho8).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8, null, msgs);
			msgs = basicSetRho8(newRho8, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8,
					newRho8, newRho8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getRho18() {
		return rho18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRho18(StringVectorBaseType newRho18, NotificationChain msgs) {
		StringVectorBaseType oldRho18 = rho18;
		rho18 = newRho18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18, oldRho18, newRho18);
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
	public void setRho18(StringVectorBaseType newRho18) {
		if (newRho18 != rho18) {
			NotificationChain msgs = null;
			if (rho18 != null)
				msgs = ((InternalEObject) rho18).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18, null, msgs);
			if (newRho18 != null)
				msgs = ((InternalEObject) newRho18).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18, null, msgs);
			msgs = basicSetRho18(newRho18, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18,
					newRho18, newRho18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNozzA8() {
		return nozzA8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNozzA8(StringVectorBaseType newNozzA8, NotificationChain msgs) {
		StringVectorBaseType oldNozzA8 = nozzA8;
		nozzA8 = newNozzA8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8, oldNozzA8, newNozzA8);
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
	public void setNozzA8(StringVectorBaseType newNozzA8) {
		if (newNozzA8 != nozzA8) {
			NotificationChain msgs = null;
			if (nozzA8 != null)
				msgs = ((InternalEObject) nozzA8).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8, null, msgs);
			if (newNozzA8 != null)
				msgs = ((InternalEObject) newNozzA8).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8, null, msgs);
			msgs = basicSetNozzA8(newNozzA8, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8,
					newNozzA8, newNozzA8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNozzA18() {
		return nozzA18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNozzA18(StringVectorBaseType newNozzA18, NotificationChain msgs) {
		StringVectorBaseType oldNozzA18 = nozzA18;
		nozzA18 = newNozzA18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18, oldNozzA18, newNozzA18);
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
	public void setNozzA18(StringVectorBaseType newNozzA18) {
		if (newNozzA18 != nozzA18) {
			NotificationChain msgs = null;
			if (nozzA18 != null)
				msgs = ((InternalEObject) nozzA18).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18, null, msgs);
			if (newNozzA18 != null)
				msgs = ((InternalEObject) newNozzA18).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18, null, msgs);
			msgs = basicSetNozzA18(newNozzA18, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18,
					newNozzA18, newNozzA18));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__UID, oldUID,
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE:
			return basicSetBleedAirOfftake(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE:
			return basicSetPowerOfftake(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL:
			return basicSetFlightLevel(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST:
			return basicSetThrust(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL:
			return basicSetMDotFuel(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8:
			return basicSetV8(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8:
			return basicSetT8(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8:
			return basicSetMDot8(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18:
			return basicSetV18(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18:
			return basicSetT18(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18:
			return basicSetMDot18(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1:
			return basicSetN1(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2:
			return basicSetN2(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN:
			return basicSetPiFan(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN:
			return basicSetEtaPFan(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET:
			return basicSetTET(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO:
			return basicSetEiCO(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX:
			return basicSetEiNOx(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX:
			return basicSetEiSOx(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT:
			return basicSetEiSoot(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC:
			return basicSetEiHC(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8:
			return basicSetRho8(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18:
			return basicSetRho18(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8:
			return basicSetNozzA8(null, msgs);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18:
			return basicSetNozzA18(null, msgs);
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME:
			return getName();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE:
			return getBleedAirOfftake();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE:
			return getPowerOfftake();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL:
			return getFlightLevel();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST:
			return getThrust();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL:
			return getMDotFuel();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8:
			return getV8();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8:
			return getT8();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8:
			return getMDot8();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18:
			return getV18();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18:
			return getT18();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18:
			return getMDot18();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1:
			return getN1();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2:
			return getN2();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN:
			return getPiFan();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN:
			return getEtaPFan();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET:
			return getTET();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO:
			return getEiCO();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX:
			return getEiNOx();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX:
			return getEiSOx();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT:
			return getEiSoot();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC:
			return getEiHC();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8:
			return getRho8();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18:
			return getRho18();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8:
			return getNozzA8();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18:
			return getNozzA18();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__UID:
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE:
			setBleedAirOfftake((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE:
			setPowerOfftake((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL:
			setFlightLevel((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			setMachNumber((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST:
			setThrust((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL:
			setMDotFuel((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8:
			setV8((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8:
			setT8((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8:
			setMDot8((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18:
			setV18((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18:
			setT18((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18:
			setMDot18((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1:
			setN1((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2:
			setN2((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN:
			setPiFan((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN:
			setEtaPFan((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET:
			setTET((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO:
			setEiCO((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX:
			setEiNOx((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX:
			setEiSOx((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT:
			setEiSoot((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC:
			setEiHC((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8:
			setRho8((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18:
			setRho18((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8:
			setNozzA8((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18:
			setNozzA18((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__UID:
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE:
			setBleedAirOfftake((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE:
			setPowerOfftake((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL:
			setFlightLevel((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			setMachNumber((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST:
			setThrust((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL:
			setMDotFuel((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8:
			setV8((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8:
			setT8((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8:
			setMDot8((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18:
			setV18((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18:
			setT18((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18:
			setMDot18((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1:
			setN1((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2:
			setN2((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN:
			setPiFan((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN:
			setEtaPFan((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET:
			setTET((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO:
			setEiCO((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX:
			setEiNOx((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX:
			setEiSOx((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT:
			setEiSoot((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC:
			setEiHC((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8:
			setRho8((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18:
			setRho18((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8:
			setNozzA8((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18:
			setNozzA18((StringVectorBaseType) null);
			return;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__UID:
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NAME:
			return name != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__BLEED_AIR_OFFTAKE:
			return bleedAirOfftake != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__POWER_OFFTAKE:
			return powerOfftake != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__FLIGHT_LEVEL:
			return flightLevel != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__THRUST:
			return thrust != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT_FUEL:
			return mDotFuel != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V8:
			return v8 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T8:
			return t8 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT8:
			return mDot8 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__V18:
			return v18 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__T18:
			return t18 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__MDOT18:
			return mDot18 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N1:
			return n1 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__N2:
			return n2 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__PI_FAN:
			return piFan != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__ETA_PFAN:
			return etaPFan != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__TET:
			return tET != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_CO:
			return eiCO != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_NOX:
			return eiNOx != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOX:
			return eiSOx != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_SOOT:
			return eiSoot != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__EI_HC:
			return eiHC != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO8:
			return rho8 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__RHO18:
			return rho18 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A8:
			return nozzA8 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__NOZZ_A18:
			return nozzA18 != null;
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE__UID:
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

} //EnginePerformanceMapTypeImpl
