/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckStructuralMountType;
import Cpacs.DeckStructuralMountsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Structural Mounts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckStructuralMountsTypeImpl#getStructuralMount <em>Structural Mount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckStructuralMountsTypeImpl extends ComplexBaseTypeImpl implements DeckStructuralMountsType {
	/**
	 * The cached value of the '{@link #getStructuralMount() <em>Structural Mount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralMount()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckStructuralMountType> structuralMount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeckStructuralMountsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckStructuralMountsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckStructuralMountType> getStructuralMount() {
		if (structuralMount == null) {
			structuralMount = new EObjectContainmentEList<DeckStructuralMountType>(DeckStructuralMountType.class, this,
					CpacsPackage.DECK_STRUCTURAL_MOUNTS_TYPE__STRUCTURAL_MOUNT);
		}
		return structuralMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DECK_STRUCTURAL_MOUNTS_TYPE__STRUCTURAL_MOUNT:
			return ((InternalEList<?>) getStructuralMount()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNTS_TYPE__STRUCTURAL_MOUNT:
			return getStructuralMount();
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNTS_TYPE__STRUCTURAL_MOUNT:
			getStructuralMount().clear();
			getStructuralMount().addAll((Collection<? extends DeckStructuralMountType>) newValue);
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNTS_TYPE__STRUCTURAL_MOUNT:
			getStructuralMount().clear();
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNTS_TYPE__STRUCTURAL_MOUNT:
			return structuralMount != null && !structuralMount.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeckStructuralMountsTypeImpl
