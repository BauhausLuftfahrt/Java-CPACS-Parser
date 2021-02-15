/**
 */
package Cpacs.impl;

import Cpacs.CostBleedAirSystemsType;
import Cpacs.CostEquippedEnginesType;
import Cpacs.CostFuelSystemsType;
import Cpacs.CostNacellesType;
import Cpacs.CostPowerUnitsType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Power Units Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostPowerUnitsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostPowerUnitsTypeImpl#getEquippedEngines <em>Equipped Engines</em>}</li>
 *   <li>{@link Cpacs.impl.CostPowerUnitsTypeImpl#getNacelles <em>Nacelles</em>}</li>
 *   <li>{@link Cpacs.impl.CostPowerUnitsTypeImpl#getBleedAirSystems <em>Bleed Air Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostPowerUnitsTypeImpl#getFuelSystems <em>Fuel Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostPowerUnitsTypeImpl extends ComplexBaseTypeImpl implements CostPowerUnitsType {
	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType costDescription;

	/**
	 * The cached value of the '{@link #getEquippedEngines() <em>Equipped Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquippedEngines()
	 * @generated
	 * @ordered
	 */
	protected CostEquippedEnginesType equippedEngines;

	/**
	 * The cached value of the '{@link #getNacelles() <em>Nacelles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNacelles()
	 * @generated
	 * @ordered
	 */
	protected CostNacellesType nacelles;

	/**
	 * The cached value of the '{@link #getBleedAirSystems() <em>Bleed Air Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBleedAirSystems()
	 * @generated
	 * @ordered
	 */
	protected CostBleedAirSystemsType bleedAirSystems;

	/**
	 * The cached value of the '{@link #getFuelSystems() <em>Fuel Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSystems()
	 * @generated
	 * @ordered
	 */
	protected CostFuelSystemsType fuelSystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostPowerUnitsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostPowerUnitsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getCostDescription() {
		return costDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostDescription(GenericCostType newCostDescription, NotificationChain msgs) {
		GenericCostType oldCostDescription = costDescription;
		costDescription = newCostDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
	public void setCostDescription(GenericCostType newCostDescription) {
		if (newCostDescription != costDescription) {
			NotificationChain msgs = null;
			if (costDescription != null)
				msgs = ((InternalEObject) costDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION,
					newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostEquippedEnginesType getEquippedEngines() {
		return equippedEngines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquippedEngines(CostEquippedEnginesType newEquippedEngines,
			NotificationChain msgs) {
		CostEquippedEnginesType oldEquippedEngines = equippedEngines;
		equippedEngines = newEquippedEngines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES, oldEquippedEngines, newEquippedEngines);
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
	public void setEquippedEngines(CostEquippedEnginesType newEquippedEngines) {
		if (newEquippedEngines != equippedEngines) {
			NotificationChain msgs = null;
			if (equippedEngines != null)
				msgs = ((InternalEObject) equippedEngines).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES, null, msgs);
			if (newEquippedEngines != null)
				msgs = ((InternalEObject) newEquippedEngines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES, null, msgs);
			msgs = basicSetEquippedEngines(newEquippedEngines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES,
					newEquippedEngines, newEquippedEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostNacellesType getNacelles() {
		return nacelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNacelles(CostNacellesType newNacelles, NotificationChain msgs) {
		CostNacellesType oldNacelles = nacelles;
		nacelles = newNacelles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES, oldNacelles, newNacelles);
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
	public void setNacelles(CostNacellesType newNacelles) {
		if (newNacelles != nacelles) {
			NotificationChain msgs = null;
			if (nacelles != null)
				msgs = ((InternalEObject) nacelles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES, null, msgs);
			if (newNacelles != null)
				msgs = ((InternalEObject) newNacelles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES, null, msgs);
			msgs = basicSetNacelles(newNacelles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES,
					newNacelles, newNacelles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostBleedAirSystemsType getBleedAirSystems() {
		return bleedAirSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBleedAirSystems(CostBleedAirSystemsType newBleedAirSystems,
			NotificationChain msgs) {
		CostBleedAirSystemsType oldBleedAirSystems = bleedAirSystems;
		bleedAirSystems = newBleedAirSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS, oldBleedAirSystems, newBleedAirSystems);
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
	public void setBleedAirSystems(CostBleedAirSystemsType newBleedAirSystems) {
		if (newBleedAirSystems != bleedAirSystems) {
			NotificationChain msgs = null;
			if (bleedAirSystems != null)
				msgs = ((InternalEObject) bleedAirSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS, null, msgs);
			if (newBleedAirSystems != null)
				msgs = ((InternalEObject) newBleedAirSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS, null, msgs);
			msgs = basicSetBleedAirSystems(newBleedAirSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS,
					newBleedAirSystems, newBleedAirSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFuelSystemsType getFuelSystems() {
		return fuelSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelSystems(CostFuelSystemsType newFuelSystems, NotificationChain msgs) {
		CostFuelSystemsType oldFuelSystems = fuelSystems;
		fuelSystems = newFuelSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS, oldFuelSystems, newFuelSystems);
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
	public void setFuelSystems(CostFuelSystemsType newFuelSystems) {
		if (newFuelSystems != fuelSystems) {
			NotificationChain msgs = null;
			if (fuelSystems != null)
				msgs = ((InternalEObject) fuelSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS, null, msgs);
			if (newFuelSystems != null)
				msgs = ((InternalEObject) newFuelSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS, null, msgs);
			msgs = basicSetFuelSystems(newFuelSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS,
					newFuelSystems, newFuelSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES:
			return basicSetEquippedEngines(null, msgs);
		case CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES:
			return basicSetNacelles(null, msgs);
		case CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS:
			return basicSetBleedAirSystems(null, msgs);
		case CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS:
			return basicSetFuelSystems(null, msgs);
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
		case CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES:
			return getEquippedEngines();
		case CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES:
			return getNacelles();
		case CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS:
			return getBleedAirSystems();
		case CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS:
			return getFuelSystems();
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
		case CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES:
			setEquippedEngines((CostEquippedEnginesType) newValue);
			return;
		case CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES:
			setNacelles((CostNacellesType) newValue);
			return;
		case CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS:
			setBleedAirSystems((CostBleedAirSystemsType) newValue);
			return;
		case CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS:
			setFuelSystems((CostFuelSystemsType) newValue);
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
		case CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES:
			setEquippedEngines((CostEquippedEnginesType) null);
			return;
		case CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES:
			setNacelles((CostNacellesType) null);
			return;
		case CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS:
			setBleedAirSystems((CostBleedAirSystemsType) null);
			return;
		case CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS:
			setFuelSystems((CostFuelSystemsType) null);
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
		case CpacsPackage.COST_POWER_UNITS_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.COST_POWER_UNITS_TYPE__EQUIPPED_ENGINES:
			return equippedEngines != null;
		case CpacsPackage.COST_POWER_UNITS_TYPE__NACELLES:
			return nacelles != null;
		case CpacsPackage.COST_POWER_UNITS_TYPE__BLEED_AIR_SYSTEMS:
			return bleedAirSystems != null;
		case CpacsPackage.COST_POWER_UNITS_TYPE__FUEL_SYSTEMS:
			return fuelSystems != null;
		}
		return super.eIsSet(featureID);
	}

} //CostPowerUnitsTypeImpl
