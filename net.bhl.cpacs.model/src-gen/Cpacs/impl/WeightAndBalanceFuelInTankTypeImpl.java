/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MassInertiaVectorType;
import Cpacs.PointListXYZVectorType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;
import Cpacs.WeightAndBalanceFuelInTankType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weight And Balance Fuel In Tank Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WeightAndBalanceFuelInTankTypeImpl#getTankUID <em>Tank UID</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalanceFuelInTankTypeImpl#getFuelUID <em>Fuel UID</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalanceFuelInTankTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalanceFuelInTankTypeImpl#getCoG <em>Co G</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalanceFuelInTankTypeImpl#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalanceFuelInTankTypeImpl#getTankFillLevel <em>Tank Fill Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeightAndBalanceFuelInTankTypeImpl extends ComplexBaseTypeImpl implements WeightAndBalanceFuelInTankType {
	/**
	 * The cached value of the '{@link #getTankUID() <em>Tank UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTankUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType tankUID;

	/**
	 * The cached value of the '{@link #getFuelUID() <em>Fuel UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fuelUID;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mass;

	/**
	 * The cached value of the '{@link #getCoG() <em>Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoG()
	 * @generated
	 * @ordered
	 */
	protected PointListXYZVectorType coG;

	/**
	 * The cached value of the '{@link #getMassInertia() <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassInertia()
	 * @generated
	 * @ordered
	 */
	protected MassInertiaVectorType massInertia;

	/**
	 * The cached value of the '{@link #getTankFillLevel() <em>Tank Fill Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTankFillLevel()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType tankFillLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeightAndBalanceFuelInTankTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWeightAndBalanceFuelInTankType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getTankUID() {
		return tankUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTankUID(StringUIDBaseType newTankUID, NotificationChain msgs) {
		StringUIDBaseType oldTankUID = tankUID;
		tankUID = newTankUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID, oldTankUID, newTankUID);
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
	public void setTankUID(StringUIDBaseType newTankUID) {
		if (newTankUID != tankUID) {
			NotificationChain msgs = null;
			if (tankUID != null)
				msgs = ((InternalEObject) tankUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID, null,
						msgs);
			if (newTankUID != null)
				msgs = ((InternalEObject) newTankUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID, null,
						msgs);
			msgs = basicSetTankUID(newTankUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID, newTankUID, newTankUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFuelUID() {
		return fuelUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelUID(StringUIDBaseType newFuelUID, NotificationChain msgs) {
		StringUIDBaseType oldFuelUID = fuelUID;
		fuelUID = newFuelUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID, oldFuelUID, newFuelUID);
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
	public void setFuelUID(StringUIDBaseType newFuelUID) {
		if (newFuelUID != fuelUID) {
			NotificationChain msgs = null;
			if (fuelUID != null)
				msgs = ((InternalEObject) fuelUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID, null,
						msgs);
			if (newFuelUID != null)
				msgs = ((InternalEObject) newFuelUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID, null,
						msgs);
			msgs = basicSetFuelUID(newFuelUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID, newFuelUID, newFuelUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(StringVectorBaseType newMass, NotificationChain msgs) {
		StringVectorBaseType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS, oldMass, newMass);
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
	public void setMass(StringVectorBaseType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS, newMass, newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYZVectorType getCoG() {
		return coG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoG(PointListXYZVectorType newCoG, NotificationChain msgs) {
		PointListXYZVectorType oldCoG = coG;
		coG = newCoG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G, oldCoG, newCoG);
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
	public void setCoG(PointListXYZVectorType newCoG) {
		if (newCoG != coG) {
			NotificationChain msgs = null;
			if (coG != null)
				msgs = ((InternalEObject) coG).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G, null, msgs);
			if (newCoG != null)
				msgs = ((InternalEObject) newCoG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G, null, msgs);
			msgs = basicSetCoG(newCoG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G, newCoG, newCoG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassInertiaVectorType getMassInertia() {
		return massInertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassInertia(MassInertiaVectorType newMassInertia, NotificationChain msgs) {
		MassInertiaVectorType oldMassInertia = massInertia;
		massInertia = newMassInertia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA, oldMassInertia, newMassInertia);
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
	public void setMassInertia(MassInertiaVectorType newMassInertia) {
		if (newMassInertia != massInertia) {
			NotificationChain msgs = null;
			if (massInertia != null)
				msgs = ((InternalEObject) massInertia).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA, null,
						msgs);
			if (newMassInertia != null)
				msgs = ((InternalEObject) newMassInertia).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA, null,
						msgs);
			msgs = basicSetMassInertia(newMassInertia, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA, newMassInertia, newMassInertia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getTankFillLevel() {
		return tankFillLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTankFillLevel(StringVectorBaseType newTankFillLevel, NotificationChain msgs) {
		StringVectorBaseType oldTankFillLevel = tankFillLevel;
		tankFillLevel = newTankFillLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL, oldTankFillLevel,
					newTankFillLevel);
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
	public void setTankFillLevel(StringVectorBaseType newTankFillLevel) {
		if (newTankFillLevel != tankFillLevel) {
			NotificationChain msgs = null;
			if (tankFillLevel != null)
				msgs = ((InternalEObject) tankFillLevel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL,
						null, msgs);
			if (newTankFillLevel != null)
				msgs = ((InternalEObject) newTankFillLevel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL,
						null, msgs);
			msgs = basicSetTankFillLevel(newTankFillLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL, newTankFillLevel,
					newTankFillLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID:
			return basicSetTankUID(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID:
			return basicSetFuelUID(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G:
			return basicSetCoG(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA:
			return basicSetMassInertia(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL:
			return basicSetTankFillLevel(null, msgs);
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
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID:
			return getTankUID();
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID:
			return getFuelUID();
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS:
			return getMass();
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G:
			return getCoG();
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA:
			return getMassInertia();
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL:
			return getTankFillLevel();
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
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID:
			setTankUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID:
			setFuelUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS:
			setMass((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G:
			setCoG((PointListXYZVectorType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaVectorType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL:
			setTankFillLevel((StringVectorBaseType) newValue);
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
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID:
			setTankUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID:
			setFuelUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS:
			setMass((StringVectorBaseType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G:
			setCoG((PointListXYZVectorType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaVectorType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL:
			setTankFillLevel((StringVectorBaseType) null);
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
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_UID:
			return tankUID != null;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__FUEL_UID:
			return fuelUID != null;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS:
			return mass != null;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__CO_G:
			return coG != null;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__MASS_INERTIA:
			return massInertia != null;
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE__TANK_FILL_LEVEL:
			return tankFillLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //WeightAndBalanceFuelInTankTypeImpl
