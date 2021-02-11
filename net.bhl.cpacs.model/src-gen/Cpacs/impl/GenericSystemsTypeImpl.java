/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericSystemType;
import Cpacs.GenericSystemsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericSystemsTypeImpl#getGenericSystem <em>Generic System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericSystemsTypeImpl extends ComplexBaseTypeImpl implements GenericSystemsType {
	/**
	 * The cached value of the '{@link #getGenericSystem() <em>Generic System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericSystemType> genericSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericSystemsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericSystemType> getGenericSystem() {
		if (genericSystem == null) {
			genericSystem = new EObjectContainmentEList<GenericSystemType>(GenericSystemType.class, this,
					CpacsPackage.GENERIC_SYSTEMS_TYPE__GENERIC_SYSTEM);
		}
		return genericSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERIC_SYSTEMS_TYPE__GENERIC_SYSTEM:
			return ((InternalEList<?>) getGenericSystem()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GENERIC_SYSTEMS_TYPE__GENERIC_SYSTEM:
			return getGenericSystem();
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
		case CpacsPackage.GENERIC_SYSTEMS_TYPE__GENERIC_SYSTEM:
			getGenericSystem().clear();
			getGenericSystem().addAll((Collection<? extends GenericSystemType>) newValue);
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
		case CpacsPackage.GENERIC_SYSTEMS_TYPE__GENERIC_SYSTEM:
			getGenericSystem().clear();
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
		case CpacsPackage.GENERIC_SYSTEMS_TYPE__GENERIC_SYSTEM:
			return genericSystem != null && !genericSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericSystemsTypeImpl
