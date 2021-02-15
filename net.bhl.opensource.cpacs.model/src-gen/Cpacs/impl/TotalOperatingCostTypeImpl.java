/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DirectOperatingCostType;
import Cpacs.GenericCostType;
import Cpacs.IndirectOperatingCostType;
import Cpacs.TotalOperatingCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Total Operating Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TotalOperatingCostTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.TotalOperatingCostTypeImpl#getDirectOperatingCost <em>Direct Operating Cost</em>}</li>
 *   <li>{@link Cpacs.impl.TotalOperatingCostTypeImpl#getIndirectOperatingCost <em>Indirect Operating Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TotalOperatingCostTypeImpl extends ComplexBaseTypeImpl implements TotalOperatingCostType {
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
	 * The cached value of the '{@link #getDirectOperatingCost() <em>Direct Operating Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectOperatingCost()
	 * @generated
	 * @ordered
	 */
	protected DirectOperatingCostType directOperatingCost;

	/**
	 * The cached value of the '{@link #getIndirectOperatingCost() <em>Indirect Operating Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectOperatingCost()
	 * @generated
	 * @ordered
	 */
	protected IndirectOperatingCostType indirectOperatingCost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TotalOperatingCostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTotalOperatingCostType();
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
					CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION, newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectOperatingCostType getDirectOperatingCost() {
		return directOperatingCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectOperatingCost(DirectOperatingCostType newDirectOperatingCost,
			NotificationChain msgs) {
		DirectOperatingCostType oldDirectOperatingCost = directOperatingCost;
		directOperatingCost = newDirectOperatingCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST, oldDirectOperatingCost,
					newDirectOperatingCost);
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
	public void setDirectOperatingCost(DirectOperatingCostType newDirectOperatingCost) {
		if (newDirectOperatingCost != directOperatingCost) {
			NotificationChain msgs = null;
			if (directOperatingCost != null)
				msgs = ((InternalEObject) directOperatingCost).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST, null,
						msgs);
			if (newDirectOperatingCost != null)
				msgs = ((InternalEObject) newDirectOperatingCost).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST, null,
						msgs);
			msgs = basicSetDirectOperatingCost(newDirectOperatingCost, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST, newDirectOperatingCost,
					newDirectOperatingCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndirectOperatingCostType getIndirectOperatingCost() {
		return indirectOperatingCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndirectOperatingCost(IndirectOperatingCostType newIndirectOperatingCost,
			NotificationChain msgs) {
		IndirectOperatingCostType oldIndirectOperatingCost = indirectOperatingCost;
		indirectOperatingCost = newIndirectOperatingCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST, oldIndirectOperatingCost,
					newIndirectOperatingCost);
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
	public void setIndirectOperatingCost(IndirectOperatingCostType newIndirectOperatingCost) {
		if (newIndirectOperatingCost != indirectOperatingCost) {
			NotificationChain msgs = null;
			if (indirectOperatingCost != null)
				msgs = ((InternalEObject) indirectOperatingCost).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST, null,
						msgs);
			if (newIndirectOperatingCost != null)
				msgs = ((InternalEObject) newIndirectOperatingCost).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST, null,
						msgs);
			msgs = basicSetIndirectOperatingCost(newIndirectOperatingCost, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST, newIndirectOperatingCost,
					newIndirectOperatingCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST:
			return basicSetDirectOperatingCost(null, msgs);
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST:
			return basicSetIndirectOperatingCost(null, msgs);
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
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST:
			return getDirectOperatingCost();
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST:
			return getIndirectOperatingCost();
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
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST:
			setDirectOperatingCost((DirectOperatingCostType) newValue);
			return;
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST:
			setIndirectOperatingCost((IndirectOperatingCostType) newValue);
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
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST:
			setDirectOperatingCost((DirectOperatingCostType) null);
			return;
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST:
			setIndirectOperatingCost((IndirectOperatingCostType) null);
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
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__DIRECT_OPERATING_COST:
			return directOperatingCost != null;
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE__INDIRECT_OPERATING_COST:
			return indirectOperatingCost != null;
		}
		return super.eIsSet(featureID);
	}

} //TotalOperatingCostTypeImpl
