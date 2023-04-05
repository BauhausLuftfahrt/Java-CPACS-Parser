/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckComponentBaseType;
import Cpacs.LuggageCompartmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luggage Compartments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LuggageCompartmentsTypeImpl#getLuggageCompartment <em>Luggage Compartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LuggageCompartmentsTypeImpl extends ComplexBaseTypeImpl implements LuggageCompartmentsType {
	/**
	 * The cached value of the '{@link #getLuggageCompartment() <em>Luggage Compartment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageCompartment()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckComponentBaseType> luggageCompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LuggageCompartmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLuggageCompartmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckComponentBaseType> getLuggageCompartment() {
		if (luggageCompartment == null) {
			luggageCompartment = new EObjectContainmentEList<DeckComponentBaseType>(DeckComponentBaseType.class, this,
					CpacsPackage.LUGGAGE_COMPARTMENTS_TYPE__LUGGAGE_COMPARTMENT);
		}
		return luggageCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LUGGAGE_COMPARTMENTS_TYPE__LUGGAGE_COMPARTMENT:
			return ((InternalEList<?>) getLuggageCompartment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LUGGAGE_COMPARTMENTS_TYPE__LUGGAGE_COMPARTMENT:
			return getLuggageCompartment();
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
		case CpacsPackage.LUGGAGE_COMPARTMENTS_TYPE__LUGGAGE_COMPARTMENT:
			getLuggageCompartment().clear();
			getLuggageCompartment().addAll((Collection<? extends DeckComponentBaseType>) newValue);
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
		case CpacsPackage.LUGGAGE_COMPARTMENTS_TYPE__LUGGAGE_COMPARTMENT:
			getLuggageCompartment().clear();
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
		case CpacsPackage.LUGGAGE_COMPARTMENTS_TYPE__LUGGAGE_COMPARTMENT:
			return luggageCompartment != null && !luggageCompartment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LuggageCompartmentsTypeImpl
