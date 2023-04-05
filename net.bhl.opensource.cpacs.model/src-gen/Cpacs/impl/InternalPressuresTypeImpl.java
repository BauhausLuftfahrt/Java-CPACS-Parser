/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.InternalPressureType;
import Cpacs.InternalPressuresType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Pressures Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.InternalPressuresTypeImpl#getInternalPressure <em>Internal Pressure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalPressuresTypeImpl extends ComplexBaseTypeImpl implements InternalPressuresType {
	/**
	 * The cached value of the '{@link #getInternalPressure() <em>Internal Pressure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPressure()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalPressureType> internalPressure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalPressuresTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getInternalPressuresType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternalPressureType> getInternalPressure() {
		if (internalPressure == null) {
			internalPressure = new EObjectContainmentEList<InternalPressureType>(InternalPressureType.class, this,
					CpacsPackage.INTERNAL_PRESSURES_TYPE__INTERNAL_PRESSURE);
		}
		return internalPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.INTERNAL_PRESSURES_TYPE__INTERNAL_PRESSURE:
			return ((InternalEList<?>) getInternalPressure()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.INTERNAL_PRESSURES_TYPE__INTERNAL_PRESSURE:
			return getInternalPressure();
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
		case CpacsPackage.INTERNAL_PRESSURES_TYPE__INTERNAL_PRESSURE:
			getInternalPressure().clear();
			getInternalPressure().addAll((Collection<? extends InternalPressureType>) newValue);
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
		case CpacsPackage.INTERNAL_PRESSURES_TYPE__INTERNAL_PRESSURE:
			getInternalPressure().clear();
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
		case CpacsPackage.INTERNAL_PRESSURES_TYPE__INTERNAL_PRESSURE:
			return internalPressure != null && !internalPressure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternalPressuresTypeImpl
