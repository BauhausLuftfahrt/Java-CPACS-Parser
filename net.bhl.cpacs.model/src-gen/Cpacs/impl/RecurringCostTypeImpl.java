/**
 */
package Cpacs.impl;

import Cpacs.CostComponentsType;
import Cpacs.CostFurnishingsType;
import Cpacs.CostPowerUnitsType;
import Cpacs.CostSystemsType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;
import Cpacs.IntegerBaseType;
import Cpacs.RecurringCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurring Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RecurringCostTypeImpl#getProductionQuantity <em>Production Quantity</em>}</li>
 *   <li>{@link Cpacs.impl.RecurringCostTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.RecurringCostTypeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link Cpacs.impl.RecurringCostTypeImpl#getPowerUnits <em>Power Units</em>}</li>
 *   <li>{@link Cpacs.impl.RecurringCostTypeImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link Cpacs.impl.RecurringCostTypeImpl#getFurnishings <em>Furnishings</em>}</li>
 *   <li>{@link Cpacs.impl.RecurringCostTypeImpl#getOperatorItems <em>Operator Items</em>}</li>
 *   <li>{@link Cpacs.impl.RecurringCostTypeImpl#getFinalAssembly <em>Final Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecurringCostTypeImpl extends ComplexBaseTypeImpl implements RecurringCostType {
	/**
	 * The cached value of the '{@link #getProductionQuantity() <em>Production Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionQuantity()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType productionQuantity;

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
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected CostComponentsType components;

	/**
	 * The cached value of the '{@link #getPowerUnits() <em>Power Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUnits()
	 * @generated
	 * @ordered
	 */
	protected CostPowerUnitsType powerUnits;

	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected CostSystemsType systems;

	/**
	 * The cached value of the '{@link #getFurnishings() <em>Furnishings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurnishings()
	 * @generated
	 * @ordered
	 */
	protected CostFurnishingsType furnishings;

	/**
	 * The cached value of the '{@link #getOperatorItems() <em>Operator Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorItems()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType operatorItems;

	/**
	 * The cached value of the '{@link #getFinalAssembly() <em>Final Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalAssembly()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType finalAssembly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurringCostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRecurringCostType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getProductionQuantity() {
		return productionQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductionQuantity(IntegerBaseType newProductionQuantity, NotificationChain msgs) {
		IntegerBaseType oldProductionQuantity = productionQuantity;
		productionQuantity = newProductionQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY, oldProductionQuantity,
					newProductionQuantity);
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
	public void setProductionQuantity(IntegerBaseType newProductionQuantity) {
		if (newProductionQuantity != productionQuantity) {
			NotificationChain msgs = null;
			if (productionQuantity != null)
				msgs = ((InternalEObject) productionQuantity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY, null, msgs);
			if (newProductionQuantity != null)
				msgs = ((InternalEObject) newProductionQuantity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY, null, msgs);
			msgs = basicSetProductionQuantity(newProductionQuantity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY,
					newProductionQuantity, newProductionQuantity));
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
					CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION,
					newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentsType getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(CostComponentsType newComponents, NotificationChain msgs) {
		CostComponentsType oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECURRING_COST_TYPE__COMPONENTS, oldComponents, newComponents);
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
	public void setComponents(CostComponentsType newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject) components).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject) newComponents).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECURRING_COST_TYPE__COMPONENTS,
					newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostPowerUnitsType getPowerUnits() {
		return powerUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerUnits(CostPowerUnitsType newPowerUnits, NotificationChain msgs) {
		CostPowerUnitsType oldPowerUnits = powerUnits;
		powerUnits = newPowerUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS, oldPowerUnits, newPowerUnits);
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
	public void setPowerUnits(CostPowerUnitsType newPowerUnits) {
		if (newPowerUnits != powerUnits) {
			NotificationChain msgs = null;
			if (powerUnits != null)
				msgs = ((InternalEObject) powerUnits).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS, null, msgs);
			if (newPowerUnits != null)
				msgs = ((InternalEObject) newPowerUnits).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS, null, msgs);
			msgs = basicSetPowerUnits(newPowerUnits, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS,
					newPowerUnits, newPowerUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostSystemsType getSystems() {
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystems(CostSystemsType newSystems, NotificationChain msgs) {
		CostSystemsType oldSystems = systems;
		systems = newSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECURRING_COST_TYPE__SYSTEMS, oldSystems, newSystems);
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
	public void setSystems(CostSystemsType newSystems) {
		if (newSystems != systems) {
			NotificationChain msgs = null;
			if (systems != null)
				msgs = ((InternalEObject) systems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__SYSTEMS, null, msgs);
			if (newSystems != null)
				msgs = ((InternalEObject) newSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__SYSTEMS, null, msgs);
			msgs = basicSetSystems(newSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECURRING_COST_TYPE__SYSTEMS, newSystems,
					newSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFurnishingsType getFurnishings() {
		return furnishings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFurnishings(CostFurnishingsType newFurnishings, NotificationChain msgs) {
		CostFurnishingsType oldFurnishings = furnishings;
		furnishings = newFurnishings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS, oldFurnishings, newFurnishings);
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
	public void setFurnishings(CostFurnishingsType newFurnishings) {
		if (newFurnishings != furnishings) {
			NotificationChain msgs = null;
			if (furnishings != null)
				msgs = ((InternalEObject) furnishings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS, null, msgs);
			if (newFurnishings != null)
				msgs = ((InternalEObject) newFurnishings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS, null, msgs);
			msgs = basicSetFurnishings(newFurnishings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS,
					newFurnishings, newFurnishings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getOperatorItems() {
		return operatorItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorItems(GenericCostType newOperatorItems, NotificationChain msgs) {
		GenericCostType oldOperatorItems = operatorItems;
		operatorItems = newOperatorItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS, oldOperatorItems, newOperatorItems);
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
	public void setOperatorItems(GenericCostType newOperatorItems) {
		if (newOperatorItems != operatorItems) {
			NotificationChain msgs = null;
			if (operatorItems != null)
				msgs = ((InternalEObject) operatorItems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS, null, msgs);
			if (newOperatorItems != null)
				msgs = ((InternalEObject) newOperatorItems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS, null, msgs);
			msgs = basicSetOperatorItems(newOperatorItems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS,
					newOperatorItems, newOperatorItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getFinalAssembly() {
		return finalAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalAssembly(GenericCostType newFinalAssembly, NotificationChain msgs) {
		GenericCostType oldFinalAssembly = finalAssembly;
		finalAssembly = newFinalAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY, oldFinalAssembly, newFinalAssembly);
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
	public void setFinalAssembly(GenericCostType newFinalAssembly) {
		if (newFinalAssembly != finalAssembly) {
			NotificationChain msgs = null;
			if (finalAssembly != null)
				msgs = ((InternalEObject) finalAssembly).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY, null, msgs);
			if (newFinalAssembly != null)
				msgs = ((InternalEObject) newFinalAssembly).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY, null, msgs);
			msgs = basicSetFinalAssembly(newFinalAssembly, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY,
					newFinalAssembly, newFinalAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY:
			return basicSetProductionQuantity(null, msgs);
		case CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.RECURRING_COST_TYPE__COMPONENTS:
			return basicSetComponents(null, msgs);
		case CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS:
			return basicSetPowerUnits(null, msgs);
		case CpacsPackage.RECURRING_COST_TYPE__SYSTEMS:
			return basicSetSystems(null, msgs);
		case CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS:
			return basicSetFurnishings(null, msgs);
		case CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS:
			return basicSetOperatorItems(null, msgs);
		case CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY:
			return basicSetFinalAssembly(null, msgs);
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
		case CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY:
			return getProductionQuantity();
		case CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.RECURRING_COST_TYPE__COMPONENTS:
			return getComponents();
		case CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS:
			return getPowerUnits();
		case CpacsPackage.RECURRING_COST_TYPE__SYSTEMS:
			return getSystems();
		case CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS:
			return getFurnishings();
		case CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS:
			return getOperatorItems();
		case CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY:
			return getFinalAssembly();
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
		case CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY:
			setProductionQuantity((IntegerBaseType) newValue);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__COMPONENTS:
			setComponents((CostComponentsType) newValue);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS:
			setPowerUnits((CostPowerUnitsType) newValue);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__SYSTEMS:
			setSystems((CostSystemsType) newValue);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS:
			setFurnishings((CostFurnishingsType) newValue);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS:
			setOperatorItems((GenericCostType) newValue);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY:
			setFinalAssembly((GenericCostType) newValue);
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
		case CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY:
			setProductionQuantity((IntegerBaseType) null);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__COMPONENTS:
			setComponents((CostComponentsType) null);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS:
			setPowerUnits((CostPowerUnitsType) null);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__SYSTEMS:
			setSystems((CostSystemsType) null);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS:
			setFurnishings((CostFurnishingsType) null);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS:
			setOperatorItems((GenericCostType) null);
			return;
		case CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY:
			setFinalAssembly((GenericCostType) null);
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
		case CpacsPackage.RECURRING_COST_TYPE__PRODUCTION_QUANTITY:
			return productionQuantity != null;
		case CpacsPackage.RECURRING_COST_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.RECURRING_COST_TYPE__COMPONENTS:
			return components != null;
		case CpacsPackage.RECURRING_COST_TYPE__POWER_UNITS:
			return powerUnits != null;
		case CpacsPackage.RECURRING_COST_TYPE__SYSTEMS:
			return systems != null;
		case CpacsPackage.RECURRING_COST_TYPE__FURNISHINGS:
			return furnishings != null;
		case CpacsPackage.RECURRING_COST_TYPE__OPERATOR_ITEMS:
			return operatorItems != null;
		case CpacsPackage.RECURRING_COST_TYPE__FINAL_ASSEMBLY:
			return finalAssembly != null;
		}
		return super.eIsSet(featureID);
	}

} //RecurringCostTypeImpl
