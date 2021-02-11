/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.Sheet3DType;
import Cpacs.SheetList3DType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet List3 DType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SheetList3DTypeImpl#getSheet3D <em>Sheet3 D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetList3DTypeImpl extends ComplexBaseTypeImpl implements SheetList3DType {
	/**
	 * The cached value of the '{@link #getSheet3D() <em>Sheet3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet3D()
	 * @generated
	 * @ordered
	 */
	protected EList<Sheet3DType> sheet3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetList3DTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSheetList3DType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sheet3DType> getSheet3D() {
		if (sheet3D == null) {
			sheet3D = new EObjectContainmentEList<Sheet3DType>(Sheet3DType.class, this,
					CpacsPackage.SHEET_LIST3_DTYPE__SHEET3_D);
		}
		return sheet3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SHEET_LIST3_DTYPE__SHEET3_D:
			return ((InternalEList<?>) getSheet3D()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SHEET_LIST3_DTYPE__SHEET3_D:
			return getSheet3D();
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
		case CpacsPackage.SHEET_LIST3_DTYPE__SHEET3_D:
			getSheet3D().clear();
			getSheet3D().addAll((Collection<? extends Sheet3DType>) newValue);
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
		case CpacsPackage.SHEET_LIST3_DTYPE__SHEET3_D:
			getSheet3D().clear();
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
		case CpacsPackage.SHEET_LIST3_DTYPE__SHEET3_D:
			return sheet3D != null && !sheet3D.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SheetList3DTypeImpl
