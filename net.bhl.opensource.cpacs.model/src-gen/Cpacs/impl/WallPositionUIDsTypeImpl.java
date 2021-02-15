/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.WallPositionUIDsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall Position UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WallPositionUIDsTypeImpl#getWallPositionUID <em>Wall Position UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallPositionUIDsTypeImpl extends MinimalEObjectImpl.Container implements WallPositionUIDsType {
	/**
	 * The cached value of the '{@link #getWallPositionUID() <em>Wall Position UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallPositionUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> wallPositionUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallPositionUIDsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWallPositionUIDsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getWallPositionUID() {
		if (wallPositionUID == null) {
			wallPositionUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.WALL_POSITION_UI_DS_TYPE__WALL_POSITION_UID);
		}
		return wallPositionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WALL_POSITION_UI_DS_TYPE__WALL_POSITION_UID:
			return ((InternalEList<?>) getWallPositionUID()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WALL_POSITION_UI_DS_TYPE__WALL_POSITION_UID:
			return getWallPositionUID();
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
		case CpacsPackage.WALL_POSITION_UI_DS_TYPE__WALL_POSITION_UID:
			getWallPositionUID().clear();
			getWallPositionUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
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
		case CpacsPackage.WALL_POSITION_UI_DS_TYPE__WALL_POSITION_UID:
			getWallPositionUID().clear();
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
		case CpacsPackage.WALL_POSITION_UI_DS_TYPE__WALL_POSITION_UID:
			return wallPositionUID != null && !wallPositionUID.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WallPositionUIDsTypeImpl
