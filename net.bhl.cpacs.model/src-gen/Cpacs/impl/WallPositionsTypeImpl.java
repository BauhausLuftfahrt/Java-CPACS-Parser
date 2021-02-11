/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WallPositionType;
import Cpacs.WallPositionsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall Positions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WallPositionsTypeImpl#getWallPosition <em>Wall Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallPositionsTypeImpl extends ComplexBaseTypeImpl implements WallPositionsType {
	/**
	 * The cached value of the '{@link #getWallPosition() <em>Wall Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<WallPositionType> wallPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallPositionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWallPositionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WallPositionType> getWallPosition() {
		if (wallPosition == null) {
			wallPosition = new EObjectContainmentEList<WallPositionType>(WallPositionType.class, this,
					CpacsPackage.WALL_POSITIONS_TYPE__WALL_POSITION);
		}
		return wallPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WALL_POSITIONS_TYPE__WALL_POSITION:
			return ((InternalEList<?>) getWallPosition()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WALL_POSITIONS_TYPE__WALL_POSITION:
			return getWallPosition();
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
		case CpacsPackage.WALL_POSITIONS_TYPE__WALL_POSITION:
			getWallPosition().clear();
			getWallPosition().addAll((Collection<? extends WallPositionType>) newValue);
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
		case CpacsPackage.WALL_POSITIONS_TYPE__WALL_POSITION:
			getWallPosition().clear();
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
		case CpacsPackage.WALL_POSITIONS_TYPE__WALL_POSITION:
			return wallPosition != null && !wallPosition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WallPositionsTypeImpl
