/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckDoorType;
import Cpacs.DeckDoorsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Doors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckDoorsTypeImpl#getDeckDoor <em>Deck Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckDoorsTypeImpl extends ComplexBaseTypeImpl implements DeckDoorsType {
	/**
	 * The cached value of the '{@link #getDeckDoor() <em>Deck Door</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckDoor()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckDoorType> deckDoor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeckDoorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckDoorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckDoorType> getDeckDoor() {
		if (deckDoor == null) {
			deckDoor = new EObjectContainmentEList<DeckDoorType>(DeckDoorType.class, this,
					CpacsPackage.DECK_DOORS_TYPE__DECK_DOOR);
		}
		return deckDoor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DECK_DOORS_TYPE__DECK_DOOR:
			return ((InternalEList<?>) getDeckDoor()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.DECK_DOORS_TYPE__DECK_DOOR:
			return getDeckDoor();
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
		case CpacsPackage.DECK_DOORS_TYPE__DECK_DOOR:
			getDeckDoor().clear();
			getDeckDoor().addAll((Collection<? extends DeckDoorType>) newValue);
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
		case CpacsPackage.DECK_DOORS_TYPE__DECK_DOOR:
			getDeckDoor().clear();
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
		case CpacsPackage.DECK_DOORS_TYPE__DECK_DOOR:
			return deckDoor != null && !deckDoor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeckDoorsTypeImpl
