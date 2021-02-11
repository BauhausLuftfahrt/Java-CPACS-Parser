/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.NodalLoadType;
import Cpacs.NodalLoadsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodal Loads Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NodalLoadsTypeImpl#getFuselageNodalLoad <em>Fuselage Nodal Load</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadsTypeImpl#getWingNodalLoad <em>Wing Nodal Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodalLoadsTypeImpl extends ComplexBaseTypeImpl implements NodalLoadsType {
	/**
	 * The cached value of the '{@link #getFuselageNodalLoad() <em>Fuselage Nodal Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageNodalLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<NodalLoadType> fuselageNodalLoad;

	/**
	 * The cached value of the '{@link #getWingNodalLoad() <em>Wing Nodal Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingNodalLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<NodalLoadType> wingNodalLoad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodalLoadsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNodalLoadsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodalLoadType> getFuselageNodalLoad() {
		if (fuselageNodalLoad == null) {
			fuselageNodalLoad = new EObjectContainmentEList<NodalLoadType>(NodalLoadType.class, this,
					CpacsPackage.NODAL_LOADS_TYPE__FUSELAGE_NODAL_LOAD);
		}
		return fuselageNodalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodalLoadType> getWingNodalLoad() {
		if (wingNodalLoad == null) {
			wingNodalLoad = new EObjectContainmentEList<NodalLoadType>(NodalLoadType.class, this,
					CpacsPackage.NODAL_LOADS_TYPE__WING_NODAL_LOAD);
		}
		return wingNodalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NODAL_LOADS_TYPE__FUSELAGE_NODAL_LOAD:
			return ((InternalEList<?>) getFuselageNodalLoad()).basicRemove(otherEnd, msgs);
		case CpacsPackage.NODAL_LOADS_TYPE__WING_NODAL_LOAD:
			return ((InternalEList<?>) getWingNodalLoad()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.NODAL_LOADS_TYPE__FUSELAGE_NODAL_LOAD:
			return getFuselageNodalLoad();
		case CpacsPackage.NODAL_LOADS_TYPE__WING_NODAL_LOAD:
			return getWingNodalLoad();
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
		case CpacsPackage.NODAL_LOADS_TYPE__FUSELAGE_NODAL_LOAD:
			getFuselageNodalLoad().clear();
			getFuselageNodalLoad().addAll((Collection<? extends NodalLoadType>) newValue);
			return;
		case CpacsPackage.NODAL_LOADS_TYPE__WING_NODAL_LOAD:
			getWingNodalLoad().clear();
			getWingNodalLoad().addAll((Collection<? extends NodalLoadType>) newValue);
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
		case CpacsPackage.NODAL_LOADS_TYPE__FUSELAGE_NODAL_LOAD:
			getFuselageNodalLoad().clear();
			return;
		case CpacsPackage.NODAL_LOADS_TYPE__WING_NODAL_LOAD:
			getWingNodalLoad().clear();
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
		case CpacsPackage.NODAL_LOADS_TYPE__FUSELAGE_NODAL_LOAD:
			return fuselageNodalLoad != null && !fuselageNodalLoad.isEmpty();
		case CpacsPackage.NODAL_LOADS_TYPE__WING_NODAL_LOAD:
			return wingNodalLoad != null && !wingNodalLoad.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodalLoadsTypeImpl
