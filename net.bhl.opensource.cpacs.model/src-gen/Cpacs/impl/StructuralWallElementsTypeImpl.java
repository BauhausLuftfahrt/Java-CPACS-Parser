/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StructuralWallElementType;
import Cpacs.StructuralWallElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Wall Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StructuralWallElementsTypeImpl#getStructuralWallElement <em>Structural Wall Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralWallElementsTypeImpl extends ComplexBaseTypeImpl implements StructuralWallElementsType {
	/**
	 * The cached value of the '{@link #getStructuralWallElement() <em>Structural Wall Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralWallElement()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralWallElementType> structuralWallElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralWallElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStructuralWallElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructuralWallElementType> getStructuralWallElement() {
		if (structuralWallElement == null) {
			structuralWallElement = new EObjectContainmentEList<StructuralWallElementType>(
					StructuralWallElementType.class, this,
					CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENT);
		}
		return structuralWallElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENT:
			return ((InternalEList<?>) getStructuralWallElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENT:
			return getStructuralWallElement();
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
		case CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENT:
			getStructuralWallElement().clear();
			getStructuralWallElement().addAll((Collection<? extends StructuralWallElementType>) newValue);
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
		case CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENT:
			getStructuralWallElement().clear();
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
		case CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENT:
			return structuralWallElement != null && !structuralWallElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuralWallElementsTypeImpl
