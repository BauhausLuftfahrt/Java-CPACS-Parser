/**
 */
package Cpacs.impl;

import Cpacs.ControlDistributorType;
import Cpacs.ControlDistributorsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Distributors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlDistributorsTypeImpl#getControlDistributor <em>Control Distributor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlDistributorsTypeImpl extends ComplexBaseTypeImpl implements ControlDistributorsType {
	/**
	 * The cached value of the '{@link #getControlDistributor() <em>Control Distributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDistributor()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlDistributorType> controlDistributor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlDistributorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlDistributorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlDistributorType> getControlDistributor() {
		if (controlDistributor == null) {
			controlDistributor = new EObjectContainmentEList<ControlDistributorType>(ControlDistributorType.class, this,
					CpacsPackage.CONTROL_DISTRIBUTORS_TYPE__CONTROL_DISTRIBUTOR);
		}
		return controlDistributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_DISTRIBUTORS_TYPE__CONTROL_DISTRIBUTOR:
			return ((InternalEList<?>) getControlDistributor()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CONTROL_DISTRIBUTORS_TYPE__CONTROL_DISTRIBUTOR:
			return getControlDistributor();
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
		case CpacsPackage.CONTROL_DISTRIBUTORS_TYPE__CONTROL_DISTRIBUTOR:
			getControlDistributor().clear();
			getControlDistributor().addAll((Collection<? extends ControlDistributorType>) newValue);
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
		case CpacsPackage.CONTROL_DISTRIBUTORS_TYPE__CONTROL_DISTRIBUTOR:
			getControlDistributor().clear();
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
		case CpacsPackage.CONTROL_DISTRIBUTORS_TYPE__CONTROL_DISTRIBUTOR:
			return controlDistributor != null && !controlDistributor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlDistributorsTypeImpl
