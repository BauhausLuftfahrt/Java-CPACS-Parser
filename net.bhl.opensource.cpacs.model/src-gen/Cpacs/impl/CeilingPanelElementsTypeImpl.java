/**
 */
package Cpacs.impl;

import Cpacs.CeilingPanelElementsType;
import Cpacs.CpacsPackage;
import Cpacs.DeckElementBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ceiling Panel Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CeilingPanelElementsTypeImpl#getCeilingPanelElement <em>Ceiling Panel Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CeilingPanelElementsTypeImpl extends ComplexBaseTypeImpl implements CeilingPanelElementsType {
	/**
	 * The cached value of the '{@link #getCeilingPanelElement() <em>Ceiling Panel Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeilingPanelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckElementBaseType> ceilingPanelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilingPanelElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCeilingPanelElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckElementBaseType> getCeilingPanelElement() {
		if (ceilingPanelElement == null) {
			ceilingPanelElement = new EObjectContainmentEList<DeckElementBaseType>(DeckElementBaseType.class, this,
					CpacsPackage.CEILING_PANEL_ELEMENTS_TYPE__CEILING_PANEL_ELEMENT);
		}
		return ceilingPanelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CEILING_PANEL_ELEMENTS_TYPE__CEILING_PANEL_ELEMENT:
			return ((InternalEList<?>) getCeilingPanelElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CEILING_PANEL_ELEMENTS_TYPE__CEILING_PANEL_ELEMENT:
			return getCeilingPanelElement();
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
		case CpacsPackage.CEILING_PANEL_ELEMENTS_TYPE__CEILING_PANEL_ELEMENT:
			getCeilingPanelElement().clear();
			getCeilingPanelElement().addAll((Collection<? extends DeckElementBaseType>) newValue);
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
		case CpacsPackage.CEILING_PANEL_ELEMENTS_TYPE__CEILING_PANEL_ELEMENT:
			getCeilingPanelElement().clear();
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
		case CpacsPackage.CEILING_PANEL_ELEMENTS_TYPE__CEILING_PANEL_ELEMENT:
			return ceilingPanelElement != null && !ceilingPanelElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CeilingPanelElementsTypeImpl
