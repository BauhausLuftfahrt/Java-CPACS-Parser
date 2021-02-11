/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FuelType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getDensity <em>Density</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getFlashPoint <em>Flash Point</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getAutoFlammability <em>Auto Flammability</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getKinematicViscosity <em>Kinematic Viscosity</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getAvgSulfurLevel <em>Avg Sulfur Level</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuelTypeImpl extends ComplexBaseTypeImpl implements FuelType {
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
	 * The cached value of the '{@link #getLowerHeatingValue() <em>Lower Heating Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType lowerHeatingValue;

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
	 * The cached value of the '{@link #getFreezingPoint() <em>Freezing Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezingPoint()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType freezingPoint;

	/**
	 * The cached value of the '{@link #getBoilingPoint() <em>Boiling Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilingPoint()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType boilingPoint;

	/**
	 * The cached value of the '{@link #getFlashPoint() <em>Flash Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlashPoint()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType flashPoint;

	/**
	 * The cached value of the '{@link #getAutoFlammability() <em>Auto Flammability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFlammability()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType autoFlammability;

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
	 * The cached value of the '{@link #getAvgSulfurLevel() <em>Avg Sulfur Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgSulfurLevel()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType avgSulfurLevel;

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
	protected FuelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuelType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__NAME,
					oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__NAME, newName, newName));
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
					CpacsPackage.FUEL_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLowerHeatingValue() {
		return lowerHeatingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerHeatingValue(DoubleBaseType newLowerHeatingValue, NotificationChain msgs) {
		DoubleBaseType oldLowerHeatingValue = lowerHeatingValue;
		lowerHeatingValue = newLowerHeatingValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE, oldLowerHeatingValue, newLowerHeatingValue);
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
	public void setLowerHeatingValue(DoubleBaseType newLowerHeatingValue) {
		if (newLowerHeatingValue != lowerHeatingValue) {
			NotificationChain msgs = null;
			if (lowerHeatingValue != null)
				msgs = ((InternalEObject) lowerHeatingValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE, null, msgs);
			if (newLowerHeatingValue != null)
				msgs = ((InternalEObject) newLowerHeatingValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE, null, msgs);
			msgs = basicSetLowerHeatingValue(newLowerHeatingValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE,
					newLowerHeatingValue, newLowerHeatingValue));
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
					CpacsPackage.FUEL_TYPE__DENSITY, oldDensity, newDensity);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__DENSITY, null, msgs);
			if (newDensity != null)
				msgs = ((InternalEObject) newDensity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__DENSITY, null, msgs);
			msgs = basicSetDensity(newDensity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__DENSITY, newDensity,
					newDensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFreezingPoint() {
		return freezingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreezingPoint(DoubleBaseType newFreezingPoint, NotificationChain msgs) {
		DoubleBaseType oldFreezingPoint = freezingPoint;
		freezingPoint = newFreezingPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TYPE__FREEZING_POINT, oldFreezingPoint, newFreezingPoint);
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
	public void setFreezingPoint(DoubleBaseType newFreezingPoint) {
		if (newFreezingPoint != freezingPoint) {
			NotificationChain msgs = null;
			if (freezingPoint != null)
				msgs = ((InternalEObject) freezingPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__FREEZING_POINT, null, msgs);
			if (newFreezingPoint != null)
				msgs = ((InternalEObject) newFreezingPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__FREEZING_POINT, null, msgs);
			msgs = basicSetFreezingPoint(newFreezingPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__FREEZING_POINT,
					newFreezingPoint, newFreezingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getBoilingPoint() {
		return boilingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoilingPoint(DoubleBaseType newBoilingPoint, NotificationChain msgs) {
		DoubleBaseType oldBoilingPoint = boilingPoint;
		boilingPoint = newBoilingPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TYPE__BOILING_POINT, oldBoilingPoint, newBoilingPoint);
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
	public void setBoilingPoint(DoubleBaseType newBoilingPoint) {
		if (newBoilingPoint != boilingPoint) {
			NotificationChain msgs = null;
			if (boilingPoint != null)
				msgs = ((InternalEObject) boilingPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__BOILING_POINT, null, msgs);
			if (newBoilingPoint != null)
				msgs = ((InternalEObject) newBoilingPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__BOILING_POINT, null, msgs);
			msgs = basicSetBoilingPoint(newBoilingPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__BOILING_POINT,
					newBoilingPoint, newBoilingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFlashPoint() {
		return flashPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlashPoint(DoubleBaseType newFlashPoint, NotificationChain msgs) {
		DoubleBaseType oldFlashPoint = flashPoint;
		flashPoint = newFlashPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TYPE__FLASH_POINT, oldFlashPoint, newFlashPoint);
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
	public void setFlashPoint(DoubleBaseType newFlashPoint) {
		if (newFlashPoint != flashPoint) {
			NotificationChain msgs = null;
			if (flashPoint != null)
				msgs = ((InternalEObject) flashPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__FLASH_POINT, null, msgs);
			if (newFlashPoint != null)
				msgs = ((InternalEObject) newFlashPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__FLASH_POINT, null, msgs);
			msgs = basicSetFlashPoint(newFlashPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__FLASH_POINT, newFlashPoint,
					newFlashPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAutoFlammability() {
		return autoFlammability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoFlammability(DoubleBaseType newAutoFlammability, NotificationChain msgs) {
		DoubleBaseType oldAutoFlammability = autoFlammability;
		autoFlammability = newAutoFlammability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY, oldAutoFlammability, newAutoFlammability);
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
	public void setAutoFlammability(DoubleBaseType newAutoFlammability) {
		if (newAutoFlammability != autoFlammability) {
			NotificationChain msgs = null;
			if (autoFlammability != null)
				msgs = ((InternalEObject) autoFlammability).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY, null, msgs);
			if (newAutoFlammability != null)
				msgs = ((InternalEObject) newAutoFlammability).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY, null, msgs);
			msgs = basicSetAutoFlammability(newAutoFlammability, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY,
					newAutoFlammability, newAutoFlammability));
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
					CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY, oldKinematicViscosity, newKinematicViscosity);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY, null, msgs);
			if (newKinematicViscosity != null)
				msgs = ((InternalEObject) newKinematicViscosity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY, null, msgs);
			msgs = basicSetKinematicViscosity(newKinematicViscosity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY,
					newKinematicViscosity, newKinematicViscosity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAvgSulfurLevel() {
		return avgSulfurLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvgSulfurLevel(DoubleBaseType newAvgSulfurLevel, NotificationChain msgs) {
		DoubleBaseType oldAvgSulfurLevel = avgSulfurLevel;
		avgSulfurLevel = newAvgSulfurLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL, oldAvgSulfurLevel, newAvgSulfurLevel);
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
	public void setAvgSulfurLevel(DoubleBaseType newAvgSulfurLevel) {
		if (newAvgSulfurLevel != avgSulfurLevel) {
			NotificationChain msgs = null;
			if (avgSulfurLevel != null)
				msgs = ((InternalEObject) avgSulfurLevel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL, null, msgs);
			if (newAvgSulfurLevel != null)
				msgs = ((InternalEObject) newAvgSulfurLevel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL, null, msgs);
			msgs = basicSetAvgSulfurLevel(newAvgSulfurLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL,
					newAvgSulfurLevel, newAvgSulfurLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUEL_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FUEL_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE:
			return basicSetLowerHeatingValue(null, msgs);
		case CpacsPackage.FUEL_TYPE__DENSITY:
			return basicSetDensity(null, msgs);
		case CpacsPackage.FUEL_TYPE__FREEZING_POINT:
			return basicSetFreezingPoint(null, msgs);
		case CpacsPackage.FUEL_TYPE__BOILING_POINT:
			return basicSetBoilingPoint(null, msgs);
		case CpacsPackage.FUEL_TYPE__FLASH_POINT:
			return basicSetFlashPoint(null, msgs);
		case CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY:
			return basicSetAutoFlammability(null, msgs);
		case CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY:
			return basicSetKinematicViscosity(null, msgs);
		case CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL:
			return basicSetAvgSulfurLevel(null, msgs);
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
		case CpacsPackage.FUEL_TYPE__NAME:
			return getName();
		case CpacsPackage.FUEL_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE:
			return getLowerHeatingValue();
		case CpacsPackage.FUEL_TYPE__DENSITY:
			return getDensity();
		case CpacsPackage.FUEL_TYPE__FREEZING_POINT:
			return getFreezingPoint();
		case CpacsPackage.FUEL_TYPE__BOILING_POINT:
			return getBoilingPoint();
		case CpacsPackage.FUEL_TYPE__FLASH_POINT:
			return getFlashPoint();
		case CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY:
			return getAutoFlammability();
		case CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY:
			return getKinematicViscosity();
		case CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL:
			return getAvgSulfurLevel();
		case CpacsPackage.FUEL_TYPE__UID:
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
		case CpacsPackage.FUEL_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE:
			setLowerHeatingValue((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__DENSITY:
			setDensity((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__FREEZING_POINT:
			setFreezingPoint((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__BOILING_POINT:
			setBoilingPoint((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__FLASH_POINT:
			setFlashPoint((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY:
			setAutoFlammability((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY:
			setKinematicViscosity((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL:
			setAvgSulfurLevel((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TYPE__UID:
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
		case CpacsPackage.FUEL_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE:
			setLowerHeatingValue((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__DENSITY:
			setDensity((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__FREEZING_POINT:
			setFreezingPoint((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__BOILING_POINT:
			setBoilingPoint((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__FLASH_POINT:
			setFlashPoint((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY:
			setAutoFlammability((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY:
			setKinematicViscosity((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL:
			setAvgSulfurLevel((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TYPE__UID:
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
		case CpacsPackage.FUEL_TYPE__NAME:
			return name != null;
		case CpacsPackage.FUEL_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FUEL_TYPE__LOWER_HEATING_VALUE:
			return lowerHeatingValue != null;
		case CpacsPackage.FUEL_TYPE__DENSITY:
			return density != null;
		case CpacsPackage.FUEL_TYPE__FREEZING_POINT:
			return freezingPoint != null;
		case CpacsPackage.FUEL_TYPE__BOILING_POINT:
			return boilingPoint != null;
		case CpacsPackage.FUEL_TYPE__FLASH_POINT:
			return flashPoint != null;
		case CpacsPackage.FUEL_TYPE__AUTO_FLAMMABILITY:
			return autoFlammability != null;
		case CpacsPackage.FUEL_TYPE__KINEMATIC_VISCOSITY:
			return kinematicViscosity != null;
		case CpacsPackage.FUEL_TYPE__AVG_SULFUR_LEVEL:
			return avgSulfurLevel != null;
		case CpacsPackage.FUEL_TYPE__UID:
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

} //FuelTypeImpl
