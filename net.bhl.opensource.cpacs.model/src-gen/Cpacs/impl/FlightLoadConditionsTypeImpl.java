/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlightLoadConditionsType;
import Cpacs.LoadCaseAccelerationsType;
import Cpacs.LoadCaseGustType;
import Cpacs.PointXYZType;
import Cpacs.SizingTypeType;
import Cpacs.SpeedDesignatorsType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Load Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getSafetyFactor <em>Safety Factor</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getAccelerations <em>Accelerations</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getRotationRates <em>Rotation Rates</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getSizingType <em>Sizing Type</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getGust <em>Gust</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadConditionsTypeImpl#getDesignSpeed <em>Design Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightLoadConditionsTypeImpl extends ComplexBaseTypeImpl implements FlightLoadConditionsType {
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
	 * The cached value of the '{@link #getSafetyFactor() <em>Safety Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType safetyFactor;

	/**
	 * The cached value of the '{@link #getAccelerations() <em>Accelerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccelerations()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseAccelerationsType accelerations;

	/**
	 * The cached value of the '{@link #getRotationRates() <em>Rotation Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationRates()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType rotationRates;

	/**
	 * The default value of the '{@link #getSizingType() <em>Sizing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizingType()
	 * @generated
	 * @ordered
	 */
	protected static final SizingTypeType SIZING_TYPE_EDEFAULT = SizingTypeType.LIMIT_LOAD;

	/**
	 * The cached value of the '{@link #getSizingType() <em>Sizing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizingType()
	 * @generated
	 * @ordered
	 */
	protected SizingTypeType sizingType = SIZING_TYPE_EDEFAULT;

	/**
	 * This is true if the Sizing Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizingTypeESet;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleOfSideslip;

	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getGust() <em>Gust</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGust()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseGustType gust;

	/**
	 * The cached value of the '{@link #getDesignSpeed() <em>Design Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignSpeed()
	 * @generated
	 * @ordered
	 */
	protected SpeedDesignatorsType designSpeed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightLoadConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightLoadConditionsType();
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
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSafetyFactor() {
		return safetyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSafetyFactor(DoubleBaseType newSafetyFactor, NotificationChain msgs) {
		DoubleBaseType oldSafetyFactor = safetyFactor;
		safetyFactor = newSafetyFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR, oldSafetyFactor, newSafetyFactor);
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
	public void setSafetyFactor(DoubleBaseType newSafetyFactor) {
		if (newSafetyFactor != safetyFactor) {
			NotificationChain msgs = null;
			if (safetyFactor != null)
				msgs = ((InternalEObject) safetyFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR, null, msgs);
			if (newSafetyFactor != null)
				msgs = ((InternalEObject) newSafetyFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR, null, msgs);
			msgs = basicSetSafetyFactor(newSafetyFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR, newSafetyFactor, newSafetyFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseAccelerationsType getAccelerations() {
		return accelerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccelerations(LoadCaseAccelerationsType newAccelerations, NotificationChain msgs) {
		LoadCaseAccelerationsType oldAccelerations = accelerations;
		accelerations = newAccelerations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS, oldAccelerations, newAccelerations);
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
	public void setAccelerations(LoadCaseAccelerationsType newAccelerations) {
		if (newAccelerations != accelerations) {
			NotificationChain msgs = null;
			if (accelerations != null)
				msgs = ((InternalEObject) accelerations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS, null, msgs);
			if (newAccelerations != null)
				msgs = ((InternalEObject) newAccelerations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS, null, msgs);
			msgs = basicSetAccelerations(newAccelerations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS, newAccelerations, newAccelerations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getRotationRates() {
		return rotationRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationRates(PointXYZType newRotationRates, NotificationChain msgs) {
		PointXYZType oldRotationRates = rotationRates;
		rotationRates = newRotationRates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES, oldRotationRates, newRotationRates);
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
	public void setRotationRates(PointXYZType newRotationRates) {
		if (newRotationRates != rotationRates) {
			NotificationChain msgs = null;
			if (rotationRates != null)
				msgs = ((InternalEObject) rotationRates).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES, null, msgs);
			if (newRotationRates != null)
				msgs = ((InternalEObject) newRotationRates).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES, null, msgs);
			msgs = basicSetRotationRates(newRotationRates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES, newRotationRates, newRotationRates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizingTypeType getSizingType() {
		return sizingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizingType(SizingTypeType newSizingType) {
		SizingTypeType oldSizingType = sizingType;
		sizingType = newSizingType == null ? SIZING_TYPE_EDEFAULT : newSizingType;
		boolean oldSizingTypeESet = sizingTypeESet;
		sizingTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SIZING_TYPE,
					oldSizingType, sizingType, !oldSizingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSizingType() {
		SizingTypeType oldSizingType = sizingType;
		boolean oldSizingTypeESet = sizingTypeESet;
		sizingType = SIZING_TYPE_EDEFAULT;
		sizingTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SIZING_TYPE, oldSizingType, SIZING_TYPE_EDEFAULT,
					oldSizingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSizingType() {
		return sizingTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(DoubleBaseType newAngleOfSideslip, NotificationChain msgs) {
		DoubleBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip,
					newAngleOfSideslip);
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
	public void setAngleOfSideslip(DoubleBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP, null,
						msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP, null,
						msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP, newAngleOfSideslip,
					newAngleOfSideslip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(DoubleBaseType newAngleOfAttack, NotificationChain msgs) {
		DoubleBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
	public void setAngleOfAttack(DoubleBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK, null, msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK, null, msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK, newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseGustType getGust() {
		return gust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGust(LoadCaseGustType newGust, NotificationChain msgs) {
		LoadCaseGustType oldGust = gust;
		gust = newGust;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST, oldGust, newGust);
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
	public void setGust(LoadCaseGustType newGust) {
		if (newGust != gust) {
			NotificationChain msgs = null;
			if (gust != null)
				msgs = ((InternalEObject) gust).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST, null, msgs);
			if (newGust != null)
				msgs = ((InternalEObject) newGust).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST, null, msgs);
			msgs = basicSetGust(newGust, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST,
					newGust, newGust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeedDesignatorsType getDesignSpeed() {
		return designSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignSpeed(SpeedDesignatorsType newDesignSpeed, NotificationChain msgs) {
		SpeedDesignatorsType oldDesignSpeed = designSpeed;
		designSpeed = newDesignSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED, oldDesignSpeed, newDesignSpeed);
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
	public void setDesignSpeed(SpeedDesignatorsType newDesignSpeed) {
		if (newDesignSpeed != designSpeed) {
			NotificationChain msgs = null;
			if (designSpeed != null)
				msgs = ((InternalEObject) designSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED, null, msgs);
			if (newDesignSpeed != null)
				msgs = ((InternalEObject) newDesignSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED, null, msgs);
			msgs = basicSetDesignSpeed(newDesignSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED, newDesignSpeed, newDesignSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR:
			return basicSetSafetyFactor(null, msgs);
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS:
			return basicSetAccelerations(null, msgs);
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES:
			return basicSetRotationRates(null, msgs);
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST:
			return basicSetGust(null, msgs);
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED:
			return basicSetDesignSpeed(null, msgs);
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
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR:
			return getSafetyFactor();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS:
			return getAccelerations();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES:
			return getRotationRates();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SIZING_TYPE:
			return getSizingType();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST:
			return getGust();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED:
			return getDesignSpeed();
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
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR:
			setSafetyFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS:
			setAccelerations((LoadCaseAccelerationsType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES:
			setRotationRates((PointXYZType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SIZING_TYPE:
			setSizingType((SizingTypeType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST:
			setGust((LoadCaseGustType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED:
			setDesignSpeed((SpeedDesignatorsType) newValue);
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
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR:
			setSafetyFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS:
			setAccelerations((LoadCaseAccelerationsType) null);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES:
			setRotationRates((PointXYZType) null);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SIZING_TYPE:
			unsetSizingType();
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST:
			setGust((LoadCaseGustType) null);
			return;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED:
			setDesignSpeed((SpeedDesignatorsType) null);
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
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SAFETY_FACTOR:
			return safetyFactor != null;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ACCELERATIONS:
			return accelerations != null;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ROTATION_RATES:
			return rotationRates != null;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__SIZING_TYPE:
			return isSetSizingType();
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__GUST:
			return gust != null;
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE__DESIGN_SPEED:
			return designSpeed != null;
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
		result.append(" (sizingType: ");
		if (sizingTypeESet)
			result.append(sizingType);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FlightLoadConditionsTypeImpl
