/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EnginePylonType;
import Cpacs.EnginePylonsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Pylons Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EnginePylonsTypeImpl#getEnginePylon <em>Engine Pylon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnginePylonsTypeImpl extends ComplexBaseTypeImpl implements EnginePylonsType {
	/**
	 * The cached value of the '{@link #getEnginePylon() <em>Engine Pylon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnginePylon()
	 * @generated
	 * @ordered
	 */
	protected EList<EnginePylonType> enginePylon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnginePylonsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEnginePylonsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnginePylonType> getEnginePylon() {
		if (enginePylon == null) {
			enginePylon = new EObjectContainmentEList<EnginePylonType>(EnginePylonType.class, this,
					CpacsPackage.ENGINE_PYLONS_TYPE__ENGINE_PYLON);
		}
		return enginePylon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_PYLONS_TYPE__ENGINE_PYLON:
			return ((InternalEList<?>) getEnginePylon()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ENGINE_PYLONS_TYPE__ENGINE_PYLON:
			return getEnginePylon();
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
		case CpacsPackage.ENGINE_PYLONS_TYPE__ENGINE_PYLON:
			getEnginePylon().clear();
			getEnginePylon().addAll((Collection<? extends EnginePylonType>) newValue);
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
		case CpacsPackage.ENGINE_PYLONS_TYPE__ENGINE_PYLON:
			getEnginePylon().clear();
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
		case CpacsPackage.ENGINE_PYLONS_TYPE__ENGINE_PYLON:
			return enginePylon != null && !enginePylon.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnginePylonsTypeImpl
