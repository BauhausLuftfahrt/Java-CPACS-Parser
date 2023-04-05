/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckComponentBaseType;
import Cpacs.SidewallPanelsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sidewall Panels Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SidewallPanelsTypeImpl#getSidewallPanel <em>Sidewall Panel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SidewallPanelsTypeImpl extends ComplexBaseTypeImpl implements SidewallPanelsType {
	/**
	 * The cached value of the '{@link #getSidewallPanel() <em>Sidewall Panel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidewallPanel()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckComponentBaseType> sidewallPanel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SidewallPanelsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSidewallPanelsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckComponentBaseType> getSidewallPanel() {
		if (sidewallPanel == null) {
			sidewallPanel = new EObjectContainmentEList<DeckComponentBaseType>(DeckComponentBaseType.class, this,
					CpacsPackage.SIDEWALL_PANELS_TYPE__SIDEWALL_PANEL);
		}
		return sidewallPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SIDEWALL_PANELS_TYPE__SIDEWALL_PANEL:
			return ((InternalEList<?>) getSidewallPanel()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SIDEWALL_PANELS_TYPE__SIDEWALL_PANEL:
			return getSidewallPanel();
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
		case CpacsPackage.SIDEWALL_PANELS_TYPE__SIDEWALL_PANEL:
			getSidewallPanel().clear();
			getSidewallPanel().addAll((Collection<? extends DeckComponentBaseType>) newValue);
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
		case CpacsPackage.SIDEWALL_PANELS_TYPE__SIDEWALL_PANEL:
			getSidewallPanel().clear();
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
		case CpacsPackage.SIDEWALL_PANELS_TYPE__SIDEWALL_PANEL:
			return sidewallPanel != null && !sidewallPanel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SidewallPanelsTypeImpl
