/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EngineMountType;
import Cpacs.EngineMountsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Mounts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineMountsTypeImpl#getEngineMount <em>Engine Mount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineMountsTypeImpl extends ComplexBaseTypeImpl implements EngineMountsType {
	/**
	 * The cached value of the '{@link #getEngineMount() <em>Engine Mount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineMount()
	 * @generated
	 * @ordered
	 */
	protected EList<EngineMountType> engineMount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineMountsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineMountsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EngineMountType> getEngineMount() {
		if (engineMount == null) {
			engineMount = new EObjectContainmentEList<EngineMountType>(EngineMountType.class, this,
					CpacsPackage.ENGINE_MOUNTS_TYPE__ENGINE_MOUNT);
		}
		return engineMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_MOUNTS_TYPE__ENGINE_MOUNT:
			return ((InternalEList<?>) getEngineMount()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ENGINE_MOUNTS_TYPE__ENGINE_MOUNT:
			return getEngineMount();
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
		case CpacsPackage.ENGINE_MOUNTS_TYPE__ENGINE_MOUNT:
			getEngineMount().clear();
			getEngineMount().addAll((Collection<? extends EngineMountType>) newValue);
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
		case CpacsPackage.ENGINE_MOUNTS_TYPE__ENGINE_MOUNT:
			getEngineMount().clear();
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
		case CpacsPackage.ENGINE_MOUNTS_TYPE__ENGINE_MOUNT:
			return engineMount != null && !engineMount.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EngineMountsTypeImpl
