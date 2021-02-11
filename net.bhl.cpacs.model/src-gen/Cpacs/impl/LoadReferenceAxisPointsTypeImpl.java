/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadReferenceAxisPointType;
import Cpacs.LoadReferenceAxisPointsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Reference Axis Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadReferenceAxisPointsTypeImpl#getLoadReferenceAxisPoint <em>Load Reference Axis Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadReferenceAxisPointsTypeImpl extends ComplexBaseTypeImpl implements LoadReferenceAxisPointsType {
	/**
	 * The cached value of the '{@link #getLoadReferenceAxisPoint() <em>Load Reference Axis Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReferenceAxisPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadReferenceAxisPointType> loadReferenceAxisPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadReferenceAxisPointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadReferenceAxisPointsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadReferenceAxisPointType> getLoadReferenceAxisPoint() {
		if (loadReferenceAxisPoint == null) {
			loadReferenceAxisPoint = new EObjectContainmentEList<LoadReferenceAxisPointType>(
					LoadReferenceAxisPointType.class, this,
					CpacsPackage.LOAD_REFERENCE_AXIS_POINTS_TYPE__LOAD_REFERENCE_AXIS_POINT);
		}
		return loadReferenceAxisPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINTS_TYPE__LOAD_REFERENCE_AXIS_POINT:
			return ((InternalEList<?>) getLoadReferenceAxisPoint()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINTS_TYPE__LOAD_REFERENCE_AXIS_POINT:
			return getLoadReferenceAxisPoint();
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
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINTS_TYPE__LOAD_REFERENCE_AXIS_POINT:
			getLoadReferenceAxisPoint().clear();
			getLoadReferenceAxisPoint().addAll((Collection<? extends LoadReferenceAxisPointType>) newValue);
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
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINTS_TYPE__LOAD_REFERENCE_AXIS_POINT:
			getLoadReferenceAxisPoint().clear();
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
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINTS_TYPE__LOAD_REFERENCE_AXIS_POINT:
			return loadReferenceAxisPoint != null && !loadReferenceAxisPoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadReferenceAxisPointsTypeImpl
