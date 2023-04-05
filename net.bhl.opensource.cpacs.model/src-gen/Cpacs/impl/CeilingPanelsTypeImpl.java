/**
 */
package Cpacs.impl;

import Cpacs.CeilingPanelsType;
import Cpacs.CpacsPackage;
import Cpacs.DeckComponentBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ceiling Panels Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CeilingPanelsTypeImpl#getCeilingPanel <em>Ceiling Panel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CeilingPanelsTypeImpl extends ComplexBaseTypeImpl implements CeilingPanelsType {
	/**
	 * The cached value of the '{@link #getCeilingPanel() <em>Ceiling Panel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeilingPanel()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckComponentBaseType> ceilingPanel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilingPanelsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCeilingPanelsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckComponentBaseType> getCeilingPanel() {
		if (ceilingPanel == null) {
			ceilingPanel = new EObjectContainmentEList<DeckComponentBaseType>(DeckComponentBaseType.class, this,
					CpacsPackage.CEILING_PANELS_TYPE__CEILING_PANEL);
		}
		return ceilingPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CEILING_PANELS_TYPE__CEILING_PANEL:
			return ((InternalEList<?>) getCeilingPanel()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CEILING_PANELS_TYPE__CEILING_PANEL:
			return getCeilingPanel();
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
		case CpacsPackage.CEILING_PANELS_TYPE__CEILING_PANEL:
			getCeilingPanel().clear();
			getCeilingPanel().addAll((Collection<? extends DeckComponentBaseType>) newValue);
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
		case CpacsPackage.CEILING_PANELS_TYPE__CEILING_PANEL:
			getCeilingPanel().clear();
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
		case CpacsPackage.CEILING_PANELS_TYPE__CEILING_PANEL:
			return ceilingPanel != null && !ceilingPanel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CeilingPanelsTypeImpl
