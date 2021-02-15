/**
 */
package Cpacs.impl;

import Cpacs.CostComponentsType;
import Cpacs.CostEnginePylonsType;
import Cpacs.CostFuselagesType;
import Cpacs.CostLandingGearType;
import Cpacs.CostWingsType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Components Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostComponentsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostComponentsTypeImpl#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.impl.CostComponentsTypeImpl#getFuselages <em>Fuselages</em>}</li>
 *   <li>{@link Cpacs.impl.CostComponentsTypeImpl#getEnginePylons <em>Engine Pylons</em>}</li>
 *   <li>{@link Cpacs.impl.CostComponentsTypeImpl#getLandingGear <em>Landing Gear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostComponentsTypeImpl extends ComplexBaseTypeImpl implements CostComponentsType {
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
	 * The cached value of the '{@link #getWings() <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWings()
	 * @generated
	 * @ordered
	 */
	protected CostWingsType wings;

	/**
	 * The cached value of the '{@link #getFuselages() <em>Fuselages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselages()
	 * @generated
	 * @ordered
	 */
	protected CostFuselagesType fuselages;

	/**
	 * The cached value of the '{@link #getEnginePylons() <em>Engine Pylons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnginePylons()
	 * @generated
	 * @ordered
	 */
	protected CostEnginePylonsType enginePylons;

	/**
	 * The cached value of the '{@link #getLandingGear() <em>Landing Gear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGear()
	 * @generated
	 * @ordered
	 */
	protected CostLandingGearType landingGear;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostComponentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostComponentsType();
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
					CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION,
					newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostWingsType getWings() {
		return wings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWings(CostWingsType newWings, NotificationChain msgs) {
		CostWingsType oldWings = wings;
		wings = newWings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_COMPONENTS_TYPE__WINGS, oldWings, newWings);
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
	public void setWings(CostWingsType newWings) {
		if (newWings != wings) {
			NotificationChain msgs = null;
			if (wings != null)
				msgs = ((InternalEObject) wings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__WINGS, null, msgs);
			if (newWings != null)
				msgs = ((InternalEObject) newWings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__WINGS, null, msgs);
			msgs = basicSetWings(newWings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_COMPONENTS_TYPE__WINGS, newWings,
					newWings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFuselagesType getFuselages() {
		return fuselages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselages(CostFuselagesType newFuselages, NotificationChain msgs) {
		CostFuselagesType oldFuselages = fuselages;
		fuselages = newFuselages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES, oldFuselages, newFuselages);
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
	public void setFuselages(CostFuselagesType newFuselages) {
		if (newFuselages != fuselages) {
			NotificationChain msgs = null;
			if (fuselages != null)
				msgs = ((InternalEObject) fuselages).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES, null, msgs);
			if (newFuselages != null)
				msgs = ((InternalEObject) newFuselages).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES, null, msgs);
			msgs = basicSetFuselages(newFuselages, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES,
					newFuselages, newFuselages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostEnginePylonsType getEnginePylons() {
		return enginePylons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnginePylons(CostEnginePylonsType newEnginePylons, NotificationChain msgs) {
		CostEnginePylonsType oldEnginePylons = enginePylons;
		enginePylons = newEnginePylons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS, oldEnginePylons, newEnginePylons);
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
	public void setEnginePylons(CostEnginePylonsType newEnginePylons) {
		if (newEnginePylons != enginePylons) {
			NotificationChain msgs = null;
			if (enginePylons != null)
				msgs = ((InternalEObject) enginePylons).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS, null, msgs);
			if (newEnginePylons != null)
				msgs = ((InternalEObject) newEnginePylons).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS, null, msgs);
			msgs = basicSetEnginePylons(newEnginePylons, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS,
					newEnginePylons, newEnginePylons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostLandingGearType getLandingGear() {
		return landingGear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGear(CostLandingGearType newLandingGear, NotificationChain msgs) {
		CostLandingGearType oldLandingGear = landingGear;
		landingGear = newLandingGear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR, oldLandingGear, newLandingGear);
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
	public void setLandingGear(CostLandingGearType newLandingGear) {
		if (newLandingGear != landingGear) {
			NotificationChain msgs = null;
			if (landingGear != null)
				msgs = ((InternalEObject) landingGear).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR, null, msgs);
			if (newLandingGear != null)
				msgs = ((InternalEObject) newLandingGear).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR, null, msgs);
			msgs = basicSetLandingGear(newLandingGear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR,
					newLandingGear, newLandingGear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.COST_COMPONENTS_TYPE__WINGS:
			return basicSetWings(null, msgs);
		case CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES:
			return basicSetFuselages(null, msgs);
		case CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS:
			return basicSetEnginePylons(null, msgs);
		case CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR:
			return basicSetLandingGear(null, msgs);
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
		case CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_COMPONENTS_TYPE__WINGS:
			return getWings();
		case CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES:
			return getFuselages();
		case CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS:
			return getEnginePylons();
		case CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR:
			return getLandingGear();
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
		case CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.COST_COMPONENTS_TYPE__WINGS:
			setWings((CostWingsType) newValue);
			return;
		case CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES:
			setFuselages((CostFuselagesType) newValue);
			return;
		case CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS:
			setEnginePylons((CostEnginePylonsType) newValue);
			return;
		case CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR:
			setLandingGear((CostLandingGearType) newValue);
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
		case CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.COST_COMPONENTS_TYPE__WINGS:
			setWings((CostWingsType) null);
			return;
		case CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES:
			setFuselages((CostFuselagesType) null);
			return;
		case CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS:
			setEnginePylons((CostEnginePylonsType) null);
			return;
		case CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR:
			setLandingGear((CostLandingGearType) null);
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
		case CpacsPackage.COST_COMPONENTS_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.COST_COMPONENTS_TYPE__WINGS:
			return wings != null;
		case CpacsPackage.COST_COMPONENTS_TYPE__FUSELAGES:
			return fuselages != null;
		case CpacsPackage.COST_COMPONENTS_TYPE__ENGINE_PYLONS:
			return enginePylons != null;
		case CpacsPackage.COST_COMPONENTS_TYPE__LANDING_GEAR:
			return landingGear != null;
		}
		return super.eIsSet(featureID);
	}

} //CostComponentsTypeImpl
