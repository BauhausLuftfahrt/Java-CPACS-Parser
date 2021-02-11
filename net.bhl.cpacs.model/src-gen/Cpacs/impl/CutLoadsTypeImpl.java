/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutLoadType;
import Cpacs.CutLoadsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cut Loads Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CutLoadsTypeImpl#getFuselageCutLoad <em>Fuselage Cut Load</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadsTypeImpl#getWingCutLoad <em>Wing Cut Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CutLoadsTypeImpl extends ComplexBaseTypeImpl implements CutLoadsType {
	/**
	 * The cached value of the '{@link #getFuselageCutLoad() <em>Fuselage Cut Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageCutLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<CutLoadType> fuselageCutLoad;

	/**
	 * The cached value of the '{@link #getWingCutLoad() <em>Wing Cut Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingCutLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<CutLoadType> wingCutLoad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CutLoadsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCutLoadsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CutLoadType> getFuselageCutLoad() {
		if (fuselageCutLoad == null) {
			fuselageCutLoad = new EObjectContainmentEList<CutLoadType>(CutLoadType.class, this,
					CpacsPackage.CUT_LOADS_TYPE__FUSELAGE_CUT_LOAD);
		}
		return fuselageCutLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CutLoadType> getWingCutLoad() {
		if (wingCutLoad == null) {
			wingCutLoad = new EObjectContainmentEList<CutLoadType>(CutLoadType.class, this,
					CpacsPackage.CUT_LOADS_TYPE__WING_CUT_LOAD);
		}
		return wingCutLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CUT_LOADS_TYPE__FUSELAGE_CUT_LOAD:
			return ((InternalEList<?>) getFuselageCutLoad()).basicRemove(otherEnd, msgs);
		case CpacsPackage.CUT_LOADS_TYPE__WING_CUT_LOAD:
			return ((InternalEList<?>) getWingCutLoad()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CUT_LOADS_TYPE__FUSELAGE_CUT_LOAD:
			return getFuselageCutLoad();
		case CpacsPackage.CUT_LOADS_TYPE__WING_CUT_LOAD:
			return getWingCutLoad();
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
		case CpacsPackage.CUT_LOADS_TYPE__FUSELAGE_CUT_LOAD:
			getFuselageCutLoad().clear();
			getFuselageCutLoad().addAll((Collection<? extends CutLoadType>) newValue);
			return;
		case CpacsPackage.CUT_LOADS_TYPE__WING_CUT_LOAD:
			getWingCutLoad().clear();
			getWingCutLoad().addAll((Collection<? extends CutLoadType>) newValue);
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
		case CpacsPackage.CUT_LOADS_TYPE__FUSELAGE_CUT_LOAD:
			getFuselageCutLoad().clear();
			return;
		case CpacsPackage.CUT_LOADS_TYPE__WING_CUT_LOAD:
			getWingCutLoad().clear();
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
		case CpacsPackage.CUT_LOADS_TYPE__FUSELAGE_CUT_LOAD:
			return fuselageCutLoad != null && !fuselageCutLoad.isEmpty();
		case CpacsPackage.CUT_LOADS_TYPE__WING_CUT_LOAD:
			return wingCutLoad != null && !wingCutLoad.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CutLoadsTypeImpl
