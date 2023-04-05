/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckElementBaseType;
import Cpacs.LuggageCompartmentElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luggage Compartment Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LuggageCompartmentElementsTypeImpl#getLuggageCompartmentElement <em>Luggage Compartment Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LuggageCompartmentElementsTypeImpl extends ComplexBaseTypeImpl implements LuggageCompartmentElementsType {
	/**
	 * The cached value of the '{@link #getLuggageCompartmentElement() <em>Luggage Compartment Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageCompartmentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckElementBaseType> luggageCompartmentElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LuggageCompartmentElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLuggageCompartmentElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckElementBaseType> getLuggageCompartmentElement() {
		if (luggageCompartmentElement == null) {
			luggageCompartmentElement = new EObjectContainmentEList<DeckElementBaseType>(DeckElementBaseType.class,
					this, CpacsPackage.LUGGAGE_COMPARTMENT_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENT);
		}
		return luggageCompartmentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LUGGAGE_COMPARTMENT_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENT:
			return ((InternalEList<?>) getLuggageCompartmentElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LUGGAGE_COMPARTMENT_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENT:
			return getLuggageCompartmentElement();
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
		case CpacsPackage.LUGGAGE_COMPARTMENT_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENT:
			getLuggageCompartmentElement().clear();
			getLuggageCompartmentElement().addAll((Collection<? extends DeckElementBaseType>) newValue);
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
		case CpacsPackage.LUGGAGE_COMPARTMENT_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENT:
			getLuggageCompartmentElement().clear();
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
		case CpacsPackage.LUGGAGE_COMPARTMENT_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENT:
			return luggageCompartmentElement != null && !luggageCompartmentElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LuggageCompartmentElementsTypeImpl
