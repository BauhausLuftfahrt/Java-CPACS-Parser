/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SheetBasedStructuralElementType;
import Cpacs.SheetBasedStructuralElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet Based Structural Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SheetBasedStructuralElementsTypeImpl#getSheetBasedStructuralElement <em>Sheet Based Structural Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetBasedStructuralElementsTypeImpl extends ComplexBaseTypeImpl
		implements SheetBasedStructuralElementsType {
	/**
	 * The cached value of the '{@link #getSheetBasedStructuralElement() <em>Sheet Based Structural Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetBasedStructuralElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SheetBasedStructuralElementType> sheetBasedStructuralElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetBasedStructuralElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSheetBasedStructuralElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SheetBasedStructuralElementType> getSheetBasedStructuralElement() {
		if (sheetBasedStructuralElement == null) {
			sheetBasedStructuralElement = new EObjectContainmentEList<SheetBasedStructuralElementType>(
					SheetBasedStructuralElementType.class, this,
					CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENT);
		}
		return sheetBasedStructuralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENT:
			return ((InternalEList<?>) getSheetBasedStructuralElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENT:
			return getSheetBasedStructuralElement();
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENT:
			getSheetBasedStructuralElement().clear();
			getSheetBasedStructuralElement().addAll((Collection<? extends SheetBasedStructuralElementType>) newValue);
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENT:
			getSheetBasedStructuralElement().clear();
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENT:
			return sheetBasedStructuralElement != null && !sheetBasedStructuralElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SheetBasedStructuralElementsTypeImpl
