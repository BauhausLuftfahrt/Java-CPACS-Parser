/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckElementBaseType;
import Cpacs.SidewallPanelElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sidewall Panel Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SidewallPanelElementsTypeImpl#getSidewallPanelElement <em>Sidewall Panel Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SidewallPanelElementsTypeImpl extends ComplexBaseTypeImpl implements SidewallPanelElementsType {
	/**
	 * The cached value of the '{@link #getSidewallPanelElement() <em>Sidewall Panel Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidewallPanelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckElementBaseType> sidewallPanelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SidewallPanelElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSidewallPanelElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckElementBaseType> getSidewallPanelElement() {
		if (sidewallPanelElement == null) {
			sidewallPanelElement = new EObjectContainmentEList<DeckElementBaseType>(DeckElementBaseType.class, this,
					CpacsPackage.SIDEWALL_PANEL_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENT);
		}
		return sidewallPanelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SIDEWALL_PANEL_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENT:
			return ((InternalEList<?>) getSidewallPanelElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SIDEWALL_PANEL_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENT:
			return getSidewallPanelElement();
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
		case CpacsPackage.SIDEWALL_PANEL_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENT:
			getSidewallPanelElement().clear();
			getSidewallPanelElement().addAll((Collection<? extends DeckElementBaseType>) newValue);
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
		case CpacsPackage.SIDEWALL_PANEL_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENT:
			getSidewallPanelElement().clear();
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
		case CpacsPackage.SIDEWALL_PANEL_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENT:
			return sidewallPanelElement != null && !sidewallPanelElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SidewallPanelElementsTypeImpl
