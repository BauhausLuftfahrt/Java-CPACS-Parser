/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeltaTemperatureType;
import Cpacs.DoubleBaseType;
import Cpacs.RadiativeForcingType;
import Cpacs.TrajectoryGlobalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getFuelMass <em>Fuel Mass</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getRadiativeForcing <em>Radiative Forcing</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getNOXMass <em>NOX Mass</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getNOXMassHumid <em>NOX Mass Humid</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getCO2Mass <em>CO2 Mass</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getCOMass <em>CO Mass</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getH2OMass <em>H2O Mass</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getSO2Mass <em>SO2 Mass</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getHCMass <em>HC Mass</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryGlobalTypeImpl#getSootMass <em>Soot Mass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrajectoryGlobalTypeImpl extends ComplexBaseTypeImpl implements TrajectoryGlobalType {
	/**
	 * The cached value of the '{@link #getFuelMass() <em>Fuel Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fuelMass;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType time;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType distance;

	/**
	 * The cached value of the '{@link #getRadiativeForcing() <em>Radiative Forcing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiativeForcing()
	 * @generated
	 * @ordered
	 */
	protected RadiativeForcingType radiativeForcing;

	/**
	 * The cached value of the '{@link #getDeltaTemperature() <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTemperature()
	 * @generated
	 * @ordered
	 */
	protected DeltaTemperatureType deltaTemperature;

	/**
	 * The cached value of the '{@link #getNOXMass() <em>NOX Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOXMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nOXMass;

	/**
	 * The cached value of the '{@link #getNOXMassHumid() <em>NOX Mass Humid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOXMassHumid()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nOXMassHumid;

	/**
	 * The cached value of the '{@link #getCO2Mass() <em>CO2 Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2Mass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cO2Mass;

	/**
	 * The cached value of the '{@link #getCOMass() <em>CO Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cOMass;

	/**
	 * The cached value of the '{@link #getH2OMass() <em>H2O Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH2OMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType h2OMass;

	/**
	 * The cached value of the '{@link #getSO2Mass() <em>SO2 Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSO2Mass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sO2Mass;

	/**
	 * The cached value of the '{@link #getHCMass() <em>HC Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHCMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType hCMass;

	/**
	 * The cached value of the '{@link #getSootMass() <em>Soot Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSootMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sootMass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrajectoryGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrajectoryGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFuelMass() {
		return fuelMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelMass(DoubleBaseType newFuelMass, NotificationChain msgs) {
		DoubleBaseType oldFuelMass = fuelMass;
		fuelMass = newFuelMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS, oldFuelMass, newFuelMass);
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
	public void setFuelMass(DoubleBaseType newFuelMass) {
		if (newFuelMass != fuelMass) {
			NotificationChain msgs = null;
			if (fuelMass != null)
				msgs = ((InternalEObject) fuelMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS, null, msgs);
			if (newFuelMass != null)
				msgs = ((InternalEObject) newFuelMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS, null, msgs);
			msgs = basicSetFuelMass(newFuelMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS,
					newFuelMass, newFuelMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(DoubleBaseType newTime, NotificationChain msgs) {
		DoubleBaseType oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME, oldTime, newTime);
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
	public void setTime(DoubleBaseType newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject) time).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject) newTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME, newTime,
					newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(DoubleBaseType newDistance, NotificationChain msgs) {
		DoubleBaseType oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE, oldDistance, newDistance);
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
	public void setDistance(DoubleBaseType newDistance) {
		if (newDistance != distance) {
			NotificationChain msgs = null;
			if (distance != null)
				msgs = ((InternalEObject) distance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE, null, msgs);
			if (newDistance != null)
				msgs = ((InternalEObject) newDistance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE, null, msgs);
			msgs = basicSetDistance(newDistance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE,
					newDistance, newDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RadiativeForcingType getRadiativeForcing() {
		return radiativeForcing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadiativeForcing(RadiativeForcingType newRadiativeForcing,
			NotificationChain msgs) {
		RadiativeForcingType oldRadiativeForcing = radiativeForcing;
		radiativeForcing = newRadiativeForcing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING, oldRadiativeForcing, newRadiativeForcing);
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
	public void setRadiativeForcing(RadiativeForcingType newRadiativeForcing) {
		if (newRadiativeForcing != radiativeForcing) {
			NotificationChain msgs = null;
			if (radiativeForcing != null)
				msgs = ((InternalEObject) radiativeForcing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING, null, msgs);
			if (newRadiativeForcing != null)
				msgs = ((InternalEObject) newRadiativeForcing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING, null, msgs);
			msgs = basicSetRadiativeForcing(newRadiativeForcing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING, newRadiativeForcing, newRadiativeForcing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaTemperatureType getDeltaTemperature() {
		return deltaTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaTemperature(DeltaTemperatureType newDeltaTemperature,
			NotificationChain msgs) {
		DeltaTemperatureType oldDeltaTemperature = deltaTemperature;
		deltaTemperature = newDeltaTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE, oldDeltaTemperature, newDeltaTemperature);
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
	public void setDeltaTemperature(DeltaTemperatureType newDeltaTemperature) {
		if (newDeltaTemperature != deltaTemperature) {
			NotificationChain msgs = null;
			if (deltaTemperature != null)
				msgs = ((InternalEObject) deltaTemperature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE, null, msgs);
			if (newDeltaTemperature != null)
				msgs = ((InternalEObject) newDeltaTemperature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE, null, msgs);
			msgs = basicSetDeltaTemperature(newDeltaTemperature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE, newDeltaTemperature, newDeltaTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNOXMass() {
		return nOXMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNOXMass(DoubleBaseType newNOXMass, NotificationChain msgs) {
		DoubleBaseType oldNOXMass = nOXMass;
		nOXMass = newNOXMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS, oldNOXMass, newNOXMass);
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
	public void setNOXMass(DoubleBaseType newNOXMass) {
		if (newNOXMass != nOXMass) {
			NotificationChain msgs = null;
			if (nOXMass != null)
				msgs = ((InternalEObject) nOXMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS, null, msgs);
			if (newNOXMass != null)
				msgs = ((InternalEObject) newNOXMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS, null, msgs);
			msgs = basicSetNOXMass(newNOXMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS,
					newNOXMass, newNOXMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNOXMassHumid() {
		return nOXMassHumid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNOXMassHumid(DoubleBaseType newNOXMassHumid, NotificationChain msgs) {
		DoubleBaseType oldNOXMassHumid = nOXMassHumid;
		nOXMassHumid = newNOXMassHumid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID, oldNOXMassHumid, newNOXMassHumid);
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
	public void setNOXMassHumid(DoubleBaseType newNOXMassHumid) {
		if (newNOXMassHumid != nOXMassHumid) {
			NotificationChain msgs = null;
			if (nOXMassHumid != null)
				msgs = ((InternalEObject) nOXMassHumid).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID, null, msgs);
			if (newNOXMassHumid != null)
				msgs = ((InternalEObject) newNOXMassHumid).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID, null, msgs);
			msgs = basicSetNOXMassHumid(newNOXMassHumid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID,
					newNOXMassHumid, newNOXMassHumid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCO2Mass() {
		return cO2Mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCO2Mass(DoubleBaseType newCO2Mass, NotificationChain msgs) {
		DoubleBaseType oldCO2Mass = cO2Mass;
		cO2Mass = newCO2Mass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS, oldCO2Mass, newCO2Mass);
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
	public void setCO2Mass(DoubleBaseType newCO2Mass) {
		if (newCO2Mass != cO2Mass) {
			NotificationChain msgs = null;
			if (cO2Mass != null)
				msgs = ((InternalEObject) cO2Mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS, null, msgs);
			if (newCO2Mass != null)
				msgs = ((InternalEObject) newCO2Mass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS, null, msgs);
			msgs = basicSetCO2Mass(newCO2Mass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS,
					newCO2Mass, newCO2Mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCOMass() {
		return cOMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCOMass(DoubleBaseType newCOMass, NotificationChain msgs) {
		DoubleBaseType oldCOMass = cOMass;
		cOMass = newCOMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS, oldCOMass, newCOMass);
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
	public void setCOMass(DoubleBaseType newCOMass) {
		if (newCOMass != cOMass) {
			NotificationChain msgs = null;
			if (cOMass != null)
				msgs = ((InternalEObject) cOMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS, null, msgs);
			if (newCOMass != null)
				msgs = ((InternalEObject) newCOMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS, null, msgs);
			msgs = basicSetCOMass(newCOMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS,
					newCOMass, newCOMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getH2OMass() {
		return h2OMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH2OMass(DoubleBaseType newH2OMass, NotificationChain msgs) {
		DoubleBaseType oldH2OMass = h2OMass;
		h2OMass = newH2OMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS, oldH2OMass, newH2OMass);
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
	public void setH2OMass(DoubleBaseType newH2OMass) {
		if (newH2OMass != h2OMass) {
			NotificationChain msgs = null;
			if (h2OMass != null)
				msgs = ((InternalEObject) h2OMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS, null, msgs);
			if (newH2OMass != null)
				msgs = ((InternalEObject) newH2OMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS, null, msgs);
			msgs = basicSetH2OMass(newH2OMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS,
					newH2OMass, newH2OMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSO2Mass() {
		return sO2Mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSO2Mass(DoubleBaseType newSO2Mass, NotificationChain msgs) {
		DoubleBaseType oldSO2Mass = sO2Mass;
		sO2Mass = newSO2Mass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS, oldSO2Mass, newSO2Mass);
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
	public void setSO2Mass(DoubleBaseType newSO2Mass) {
		if (newSO2Mass != sO2Mass) {
			NotificationChain msgs = null;
			if (sO2Mass != null)
				msgs = ((InternalEObject) sO2Mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS, null, msgs);
			if (newSO2Mass != null)
				msgs = ((InternalEObject) newSO2Mass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS, null, msgs);
			msgs = basicSetSO2Mass(newSO2Mass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS,
					newSO2Mass, newSO2Mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHCMass() {
		return hCMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHCMass(DoubleBaseType newHCMass, NotificationChain msgs) {
		DoubleBaseType oldHCMass = hCMass;
		hCMass = newHCMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS, oldHCMass, newHCMass);
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
	public void setHCMass(DoubleBaseType newHCMass) {
		if (newHCMass != hCMass) {
			NotificationChain msgs = null;
			if (hCMass != null)
				msgs = ((InternalEObject) hCMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS, null, msgs);
			if (newHCMass != null)
				msgs = ((InternalEObject) newHCMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS, null, msgs);
			msgs = basicSetHCMass(newHCMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS,
					newHCMass, newHCMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSootMass() {
		return sootMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSootMass(DoubleBaseType newSootMass, NotificationChain msgs) {
		DoubleBaseType oldSootMass = sootMass;
		sootMass = newSootMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS, oldSootMass, newSootMass);
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
	public void setSootMass(DoubleBaseType newSootMass) {
		if (newSootMass != sootMass) {
			NotificationChain msgs = null;
			if (sootMass != null)
				msgs = ((InternalEObject) sootMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS, null, msgs);
			if (newSootMass != null)
				msgs = ((InternalEObject) newSootMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS, null, msgs);
			msgs = basicSetSootMass(newSootMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS,
					newSootMass, newSootMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS:
			return basicSetFuelMass(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME:
			return basicSetTime(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE:
			return basicSetDistance(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING:
			return basicSetRadiativeForcing(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE:
			return basicSetDeltaTemperature(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS:
			return basicSetNOXMass(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID:
			return basicSetNOXMassHumid(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS:
			return basicSetCO2Mass(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS:
			return basicSetCOMass(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS:
			return basicSetH2OMass(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS:
			return basicSetSO2Mass(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS:
			return basicSetHCMass(null, msgs);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS:
			return basicSetSootMass(null, msgs);
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
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS:
			return getFuelMass();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME:
			return getTime();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE:
			return getDistance();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING:
			return getRadiativeForcing();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE:
			return getDeltaTemperature();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS:
			return getNOXMass();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID:
			return getNOXMassHumid();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS:
			return getCO2Mass();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS:
			return getCOMass();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS:
			return getH2OMass();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS:
			return getSO2Mass();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS:
			return getHCMass();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS:
			return getSootMass();
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
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS:
			setFuelMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME:
			setTime((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE:
			setDistance((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING:
			setRadiativeForcing((RadiativeForcingType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DeltaTemperatureType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS:
			setNOXMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID:
			setNOXMassHumid((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS:
			setCO2Mass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS:
			setCOMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS:
			setH2OMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS:
			setSO2Mass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS:
			setHCMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS:
			setSootMass((DoubleBaseType) newValue);
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
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS:
			setFuelMass((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME:
			setTime((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE:
			setDistance((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING:
			setRadiativeForcing((RadiativeForcingType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DeltaTemperatureType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS:
			setNOXMass((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID:
			setNOXMassHumid((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS:
			setCO2Mass((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS:
			setCOMass((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS:
			setH2OMass((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS:
			setSO2Mass((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS:
			setHCMass((DoubleBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS:
			setSootMass((DoubleBaseType) null);
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
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__FUEL_MASS:
			return fuelMass != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__TIME:
			return time != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DISTANCE:
			return distance != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__RADIATIVE_FORCING:
			return radiativeForcing != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__DELTA_TEMPERATURE:
			return deltaTemperature != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS:
			return nOXMass != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__NOX_MASS_HUMID:
			return nOXMassHumid != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO2_MASS:
			return cO2Mass != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__CO_MASS:
			return cOMass != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__H2_OMASS:
			return h2OMass != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SO2_MASS:
			return sO2Mass != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__HC_MASS:
			return hCMass != null;
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE__SOOT_MASS:
			return sootMass != null;
		}
		return super.eIsSet(featureID);
	}

} //TrajectoryGlobalTypeImpl
