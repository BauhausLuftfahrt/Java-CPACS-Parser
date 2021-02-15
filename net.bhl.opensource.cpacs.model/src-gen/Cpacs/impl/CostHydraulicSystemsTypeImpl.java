/**
 */
package Cpacs.impl;

import Cpacs.CostHydraulicSystemsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Hydraulic Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostHydraulicSystemsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostHydraulicSystemsTypeImpl#getHydraulicSystem <em>Hydraulic System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostHydraulicSystemsTypeImpl extends ComplexBaseTypeImpl implements CostHydraulicSystemsType {
	/**
	 * The default value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected String costDescription = COST_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHydraulicSystem() <em>Hydraulic System</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydraulicSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hydraulicSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostHydraulicSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostHydraulicSystemsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostDescription() {
		return costDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostDescription(String newCostDescription) {
		String oldCostDescription = costDescription;
		costDescription = newCostDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__COST_DESCRIPTION, oldCostDescription, costDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getHydraulicSystem() {
		if (hydraulicSystem == null) {
			hydraulicSystem = new EDataTypeEList<String>(String.class, this,
					CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__HYDRAULIC_SYSTEM);
		}
		return hydraulicSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__HYDRAULIC_SYSTEM:
			return getHydraulicSystem();
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
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((String) newValue);
			return;
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__HYDRAULIC_SYSTEM:
			getHydraulicSystem().clear();
			getHydraulicSystem().addAll((Collection<? extends String>) newValue);
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
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription(COST_DESCRIPTION_EDEFAULT);
			return;
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__HYDRAULIC_SYSTEM:
			getHydraulicSystem().clear();
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
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__COST_DESCRIPTION:
			return COST_DESCRIPTION_EDEFAULT == null ? costDescription != null
					: !COST_DESCRIPTION_EDEFAULT.equals(costDescription);
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE__HYDRAULIC_SYSTEM:
			return hydraulicSystem != null && !hydraulicSystem.isEmpty();
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
		result.append(" (costDescription: ");
		result.append(costDescription);
		result.append(", hydraulicSystem: ");
		result.append(hydraulicSystem);
		result.append(')');
		return result.toString();
	}

} //CostHydraulicSystemsTypeImpl
