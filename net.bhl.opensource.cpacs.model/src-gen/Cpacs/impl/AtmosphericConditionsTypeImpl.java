/**
 */
package Cpacs.impl;

import Cpacs.AtmosphericConditionsType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.ModelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atmospheric Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getStaticPressure <em>Static Pressure</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getDensity <em>Density</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getSpeedOfSound <em>Speed Of Sound</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getDynamicViscosity <em>Dynamic Viscosity</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericConditionsTypeImpl#getKinematicViscosity <em>Kinematic Viscosity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtmosphericConditionsTypeImpl extends ComplexBaseTypeImpl implements AtmosphericConditionsType {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected ModelType model;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType altitude;

	/**
	 * The cached value of the '{@link #getDeltaTemperature() <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTemperature()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaTemperature;

	/**
	 * The cached value of the '{@link #getStaticPressure() <em>Static Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticPressure()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType staticPressure;

	/**
	 * The cached value of the '{@link #getDensity() <em>Density</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType density;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType temperature;

	/**
	 * The cached value of the '{@link #getSpeedOfSound() <em>Speed Of Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOfSound()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType speedOfSound;

	/**
	 * The cached value of the '{@link #getDynamicViscosity() <em>Dynamic Viscosity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicViscosity()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType dynamicViscosity;

	/**
	 * The cached value of the '{@link #getKinematicViscosity() <em>Kinematic Viscosity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinematicViscosity()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kinematicViscosity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtmosphericConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAtmosphericConditionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelType getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ModelType newModel, NotificationChain msgs) {
		ModelType oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL, oldModel, newModel);
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
	public void setModel(ModelType newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL,
					newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleBaseType newAltitude, NotificationChain msgs) {
		DoubleBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaTemperature() {
		return deltaTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaTemperature(DoubleBaseType newDeltaTemperature, NotificationChain msgs) {
		DoubleBaseType oldDeltaTemperature = deltaTemperature;
		deltaTemperature = newDeltaTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE, oldDeltaTemperature,
					newDeltaTemperature);
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
	public void setDeltaTemperature(DoubleBaseType newDeltaTemperature) {
		if (newDeltaTemperature != deltaTemperature) {
			NotificationChain msgs = null;
			if (deltaTemperature != null)
				msgs = ((InternalEObject) deltaTemperature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE, null,
						msgs);
			if (newDeltaTemperature != null)
				msgs = ((InternalEObject) newDeltaTemperature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE, null,
						msgs);
			msgs = basicSetDeltaTemperature(newDeltaTemperature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE, newDeltaTemperature,
					newDeltaTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStaticPressure() {
		return staticPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticPressure(DoubleBaseType newStaticPressure, NotificationChain msgs) {
		DoubleBaseType oldStaticPressure = staticPressure;
		staticPressure = newStaticPressure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE, oldStaticPressure, newStaticPressure);
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
	public void setStaticPressure(DoubleBaseType newStaticPressure) {
		if (newStaticPressure != staticPressure) {
			NotificationChain msgs = null;
			if (staticPressure != null)
				msgs = ((InternalEObject) staticPressure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE, null, msgs);
			if (newStaticPressure != null)
				msgs = ((InternalEObject) newStaticPressure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE, null, msgs);
			msgs = basicSetStaticPressure(newStaticPressure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE, newStaticPressure, newStaticPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDensity() {
		return density;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDensity(DoubleBaseType newDensity, NotificationChain msgs) {
		DoubleBaseType oldDensity = density;
		density = newDensity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY, oldDensity, newDensity);
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
	public void setDensity(DoubleBaseType newDensity) {
		if (newDensity != density) {
			NotificationChain msgs = null;
			if (density != null)
				msgs = ((InternalEObject) density).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY, null, msgs);
			if (newDensity != null)
				msgs = ((InternalEObject) newDensity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY, null, msgs);
			msgs = basicSetDensity(newDensity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY,
					newDensity, newDensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperature(DoubleBaseType newTemperature, NotificationChain msgs) {
		DoubleBaseType oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE, oldTemperature, newTemperature);
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
	public void setTemperature(DoubleBaseType newTemperature) {
		if (newTemperature != temperature) {
			NotificationChain msgs = null;
			if (temperature != null)
				msgs = ((InternalEObject) temperature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE, null, msgs);
			if (newTemperature != null)
				msgs = ((InternalEObject) newTemperature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE, null, msgs);
			msgs = basicSetTemperature(newTemperature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE,
					newTemperature, newTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpeedOfSound() {
		return speedOfSound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedOfSound(DoubleBaseType newSpeedOfSound, NotificationChain msgs) {
		DoubleBaseType oldSpeedOfSound = speedOfSound;
		speedOfSound = newSpeedOfSound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND, oldSpeedOfSound, newSpeedOfSound);
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
	public void setSpeedOfSound(DoubleBaseType newSpeedOfSound) {
		if (newSpeedOfSound != speedOfSound) {
			NotificationChain msgs = null;
			if (speedOfSound != null)
				msgs = ((InternalEObject) speedOfSound).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND, null, msgs);
			if (newSpeedOfSound != null)
				msgs = ((InternalEObject) newSpeedOfSound).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND, null, msgs);
			msgs = basicSetSpeedOfSound(newSpeedOfSound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND, newSpeedOfSound, newSpeedOfSound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDynamicViscosity() {
		return dynamicViscosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicViscosity(DoubleBaseType newDynamicViscosity, NotificationChain msgs) {
		DoubleBaseType oldDynamicViscosity = dynamicViscosity;
		dynamicViscosity = newDynamicViscosity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY, oldDynamicViscosity,
					newDynamicViscosity);
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
	public void setDynamicViscosity(DoubleBaseType newDynamicViscosity) {
		if (newDynamicViscosity != dynamicViscosity) {
			NotificationChain msgs = null;
			if (dynamicViscosity != null)
				msgs = ((InternalEObject) dynamicViscosity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY, null,
						msgs);
			if (newDynamicViscosity != null)
				msgs = ((InternalEObject) newDynamicViscosity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY, null,
						msgs);
			msgs = basicSetDynamicViscosity(newDynamicViscosity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY, newDynamicViscosity,
					newDynamicViscosity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKinematicViscosity() {
		return kinematicViscosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinematicViscosity(DoubleBaseType newKinematicViscosity, NotificationChain msgs) {
		DoubleBaseType oldKinematicViscosity = kinematicViscosity;
		kinematicViscosity = newKinematicViscosity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY, oldKinematicViscosity,
					newKinematicViscosity);
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
	public void setKinematicViscosity(DoubleBaseType newKinematicViscosity) {
		if (newKinematicViscosity != kinematicViscosity) {
			NotificationChain msgs = null;
			if (kinematicViscosity != null)
				msgs = ((InternalEObject) kinematicViscosity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY, null,
						msgs);
			if (newKinematicViscosity != null)
				msgs = ((InternalEObject) newKinematicViscosity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY, null,
						msgs);
			msgs = basicSetKinematicViscosity(newKinematicViscosity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY, newKinematicViscosity,
					newKinematicViscosity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL:
			return basicSetModel(null, msgs);
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			return basicSetDeltaTemperature(null, msgs);
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE:
			return basicSetStaticPressure(null, msgs);
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY:
			return basicSetDensity(null, msgs);
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE:
			return basicSetTemperature(null, msgs);
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND:
			return basicSetSpeedOfSound(null, msgs);
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY:
			return basicSetDynamicViscosity(null, msgs);
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY:
			return basicSetKinematicViscosity(null, msgs);
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
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL:
			return getModel();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			return getDeltaTemperature();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE:
			return getStaticPressure();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY:
			return getDensity();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE:
			return getTemperature();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND:
			return getSpeedOfSound();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY:
			return getDynamicViscosity();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY:
			return getKinematicViscosity();
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
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL:
			setModel((ModelType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE:
			setStaticPressure((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY:
			setDensity((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE:
			setTemperature((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND:
			setSpeedOfSound((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY:
			setDynamicViscosity((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY:
			setKinematicViscosity((DoubleBaseType) newValue);
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
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL:
			setModel((ModelType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DoubleBaseType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE:
			setStaticPressure((DoubleBaseType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY:
			setDensity((DoubleBaseType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE:
			setTemperature((DoubleBaseType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND:
			setSpeedOfSound((DoubleBaseType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY:
			setDynamicViscosity((DoubleBaseType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY:
			setKinematicViscosity((DoubleBaseType) null);
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
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__MODEL:
			return model != null;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			return deltaTemperature != null;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__STATIC_PRESSURE:
			return staticPressure != null;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DENSITY:
			return density != null;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__TEMPERATURE:
			return temperature != null;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__SPEED_OF_SOUND:
			return speedOfSound != null;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__DYNAMIC_VISCOSITY:
			return dynamicViscosity != null;
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE__KINEMATIC_VISCOSITY:
			return kinematicViscosity != null;
		}
		return super.eIsSet(featureID);
	}

} //AtmosphericConditionsTypeImpl
