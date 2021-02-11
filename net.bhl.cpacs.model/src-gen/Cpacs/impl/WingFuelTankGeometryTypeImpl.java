/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingFuelTankBorderType;
import Cpacs.WingFuelTankGeometryType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Fuel Tank Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingFuelTankGeometryTypeImpl#getBorder <em>Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingFuelTankGeometryTypeImpl extends ComplexBaseTypeImpl implements WingFuelTankGeometryType {
	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected EList<WingFuelTankBorderType> border;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingFuelTankGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingFuelTankGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingFuelTankBorderType> getBorder() {
		if (border == null) {
			border = new EObjectContainmentEList<WingFuelTankBorderType>(WingFuelTankBorderType.class, this,
					CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE__BORDER);
		}
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE__BORDER:
			return ((InternalEList<?>) getBorder()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE__BORDER:
			return getBorder();
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
		case CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE__BORDER:
			getBorder().clear();
			getBorder().addAll((Collection<? extends WingFuelTankBorderType>) newValue);
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
		case CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE__BORDER:
			getBorder().clear();
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
		case CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE__BORDER:
			return border != null && !border.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingFuelTankGeometryTypeImpl
