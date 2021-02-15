/**
 */
package Cpacs.impl;

import Cpacs.CostFixedEmergencyOxygenSystemsType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Fixed Emergency Oxygen Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostFixedEmergencyOxygenSystemsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostFixedEmergencyOxygenSystemsTypeImpl#getFixedEmergencyOxygenSystem <em>Fixed Emergency Oxygen System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostFixedEmergencyOxygenSystemsTypeImpl extends ComplexBaseTypeImpl
		implements CostFixedEmergencyOxygenSystemsType {
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
	 * The cached value of the '{@link #getFixedEmergencyOxygenSystem() <em>Fixed Emergency Oxygen System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedEmergencyOxygenSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericCostType> fixedEmergencyOxygenSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostFixedEmergencyOxygenSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostFixedEmergencyOxygenSystemsType();
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
					CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION, oldCostDescription,
					newCostDescription);
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
				msgs = ((InternalEObject) costDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION, newCostDescription,
					newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericCostType> getFixedEmergencyOxygenSystem() {
		if (fixedEmergencyOxygenSystem == null) {
			fixedEmergencyOxygenSystem = new EObjectContainmentEList<GenericCostType>(GenericCostType.class, this,
					CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEM);
		}
		return fixedEmergencyOxygenSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEM:
			return ((InternalEList<?>) getFixedEmergencyOxygenSystem()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEM:
			return getFixedEmergencyOxygenSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEM:
			getFixedEmergencyOxygenSystem().clear();
			getFixedEmergencyOxygenSystem().addAll((Collection<? extends GenericCostType>) newValue);
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
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEM:
			getFixedEmergencyOxygenSystem().clear();
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
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEM:
			return fixedEmergencyOxygenSystem != null && !fixedEmergencyOxygenSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CostFixedEmergencyOxygenSystemsTypeImpl
