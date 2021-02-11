/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FloorPanelType;
import Cpacs.FloorPanelsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor Panels Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FloorPanelsTypeImpl#getFloorPanel <em>Floor Panel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloorPanelsTypeImpl extends ComplexBaseTypeImpl implements FloorPanelsType {
	/**
	 * The cached value of the '{@link #getFloorPanel() <em>Floor Panel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloorPanel()
	 * @generated
	 * @ordered
	 */
	protected EList<FloorPanelType> floorPanel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorPanelsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFloorPanelsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FloorPanelType> getFloorPanel() {
		if (floorPanel == null) {
			floorPanel = new EObjectContainmentEList<FloorPanelType>(FloorPanelType.class, this,
					CpacsPackage.FLOOR_PANELS_TYPE__FLOOR_PANEL);
		}
		return floorPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLOOR_PANELS_TYPE__FLOOR_PANEL:
			return ((InternalEList<?>) getFloorPanel()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLOOR_PANELS_TYPE__FLOOR_PANEL:
			return getFloorPanel();
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
		case CpacsPackage.FLOOR_PANELS_TYPE__FLOOR_PANEL:
			getFloorPanel().clear();
			getFloorPanel().addAll((Collection<? extends FloorPanelType>) newValue);
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
		case CpacsPackage.FLOOR_PANELS_TYPE__FLOOR_PANEL:
			getFloorPanel().clear();
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
		case CpacsPackage.FLOOR_PANELS_TYPE__FLOOR_PANEL:
			return floorPanel != null && !floorPanel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FloorPanelsTypeImpl
