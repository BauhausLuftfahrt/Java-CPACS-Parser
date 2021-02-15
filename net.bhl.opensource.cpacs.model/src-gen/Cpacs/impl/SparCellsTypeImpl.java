/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SparCellType;
import Cpacs.SparCellsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spar Cells Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SparCellsTypeImpl#getSparCell <em>Spar Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparCellsTypeImpl extends ComplexBaseTypeImpl implements SparCellsType {
	/**
	 * The cached value of the '{@link #getSparCell() <em>Spar Cell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparCell()
	 * @generated
	 * @ordered
	 */
	protected EList<SparCellType> sparCell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparCellsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSparCellsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SparCellType> getSparCell() {
		if (sparCell == null) {
			sparCell = new EObjectContainmentEList<SparCellType>(SparCellType.class, this,
					CpacsPackage.SPAR_CELLS_TYPE__SPAR_CELL);
		}
		return sparCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPAR_CELLS_TYPE__SPAR_CELL:
			return ((InternalEList<?>) getSparCell()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SPAR_CELLS_TYPE__SPAR_CELL:
			return getSparCell();
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
		case CpacsPackage.SPAR_CELLS_TYPE__SPAR_CELL:
			getSparCell().clear();
			getSparCell().addAll((Collection<? extends SparCellType>) newValue);
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
		case CpacsPackage.SPAR_CELLS_TYPE__SPAR_CELL:
			getSparCell().clear();
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
		case CpacsPackage.SPAR_CELLS_TYPE__SPAR_CELL:
			return sparCell != null && !sparCell.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SparCellsTypeImpl
