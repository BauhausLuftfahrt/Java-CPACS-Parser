/**
 */
package Cpacs.impl;

import Cpacs.CostElectricalSystemsType;
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
 * An implementation of the model object '<em><b>Cost Electrical Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostElectricalSystemsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostElectricalSystemsTypeImpl#getElectricalSystem <em>Electrical System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostElectricalSystemsTypeImpl extends ComplexBaseTypeImpl implements CostElectricalSystemsType {
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
	 * The cached value of the '{@link #getElectricalSystem() <em>Electrical System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericCostType> electricalSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostElectricalSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostElectricalSystemsType();
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
					CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION, oldCostDescription,
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
				msgs = ((InternalEObject) costDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION, null,
						msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION, null,
						msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION, newCostDescription,
					newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericCostType> getElectricalSystem() {
		if (electricalSystem == null) {
			electricalSystem = new EObjectContainmentEList<GenericCostType>(GenericCostType.class, this,
					CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__ELECTRICAL_SYSTEM);
		}
		return electricalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__ELECTRICAL_SYSTEM:
			return ((InternalEList<?>) getElectricalSystem()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__ELECTRICAL_SYSTEM:
			return getElectricalSystem();
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
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__ELECTRICAL_SYSTEM:
			getElectricalSystem().clear();
			getElectricalSystem().addAll((Collection<? extends GenericCostType>) newValue);
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
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__ELECTRICAL_SYSTEM:
			getElectricalSystem().clear();
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
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE__ELECTRICAL_SYSTEM:
			return electricalSystem != null && !electricalSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CostElectricalSystemsTypeImpl
