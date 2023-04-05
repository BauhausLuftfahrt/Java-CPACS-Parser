/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckElementBaseType;
import Cpacs.LavatoryElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lavatory Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LavatoryElementsTypeImpl#getLavatoryElement <em>Lavatory Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LavatoryElementsTypeImpl extends ComplexBaseTypeImpl implements LavatoryElementsType {
	/**
	 * The cached value of the '{@link #getLavatoryElement() <em>Lavatory Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLavatoryElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckElementBaseType> lavatoryElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LavatoryElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLavatoryElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckElementBaseType> getLavatoryElement() {
		if (lavatoryElement == null) {
			lavatoryElement = new EObjectContainmentEList<DeckElementBaseType>(DeckElementBaseType.class, this,
					CpacsPackage.LAVATORY_ELEMENTS_TYPE__LAVATORY_ELEMENT);
		}
		return lavatoryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LAVATORY_ELEMENTS_TYPE__LAVATORY_ELEMENT:
			return ((InternalEList<?>) getLavatoryElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LAVATORY_ELEMENTS_TYPE__LAVATORY_ELEMENT:
			return getLavatoryElement();
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
		case CpacsPackage.LAVATORY_ELEMENTS_TYPE__LAVATORY_ELEMENT:
			getLavatoryElement().clear();
			getLavatoryElement().addAll((Collection<? extends DeckElementBaseType>) newValue);
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
		case CpacsPackage.LAVATORY_ELEMENTS_TYPE__LAVATORY_ELEMENT:
			getLavatoryElement().clear();
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
		case CpacsPackage.LAVATORY_ELEMENTS_TYPE__LAVATORY_ELEMENT:
			return lavatoryElement != null && !lavatoryElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LavatoryElementsTypeImpl
