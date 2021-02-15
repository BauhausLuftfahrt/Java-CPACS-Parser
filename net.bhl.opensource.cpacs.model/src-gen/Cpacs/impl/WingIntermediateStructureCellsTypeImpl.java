/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingIntermediateStructureCellType;
import Cpacs.WingIntermediateStructureCellsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Intermediate Structure Cells Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellsTypeImpl#getCell <em>Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingIntermediateStructureCellsTypeImpl extends ComplexBaseTypeImpl
		implements WingIntermediateStructureCellsType {
	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected EList<WingIntermediateStructureCellType> cell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingIntermediateStructureCellsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingIntermediateStructureCellsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingIntermediateStructureCellType> getCell() {
		if (cell == null) {
			cell = new EObjectContainmentEList<WingIntermediateStructureCellType>(
					WingIntermediateStructureCellType.class, this,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE__CELL);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE__CELL:
			return ((InternalEList<?>) getCell()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE__CELL:
			return getCell();
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
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE__CELL:
			getCell().clear();
			getCell().addAll((Collection<? extends WingIntermediateStructureCellType>) newValue);
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
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE__CELL:
			getCell().clear();
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
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE__CELL:
			return cell != null && !cell.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingIntermediateStructureCellsTypeImpl
