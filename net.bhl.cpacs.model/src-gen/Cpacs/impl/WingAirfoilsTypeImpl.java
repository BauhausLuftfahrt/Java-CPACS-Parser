/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.ProfileGeometryType;
import Cpacs.WingAirfoilsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Airfoils Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingAirfoilsTypeImpl#getWingAirfoil <em>Wing Airfoil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingAirfoilsTypeImpl extends ComplexBaseTypeImpl implements WingAirfoilsType {
	/**
	 * The cached value of the '{@link #getWingAirfoil() <em>Wing Airfoil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingAirfoil()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileGeometryType> wingAirfoil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingAirfoilsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingAirfoilsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileGeometryType> getWingAirfoil() {
		if (wingAirfoil == null) {
			wingAirfoil = new EObjectContainmentEList<ProfileGeometryType>(ProfileGeometryType.class, this,
					CpacsPackage.WING_AIRFOILS_TYPE__WING_AIRFOIL);
		}
		return wingAirfoil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_AIRFOILS_TYPE__WING_AIRFOIL:
			return ((InternalEList<?>) getWingAirfoil()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_AIRFOILS_TYPE__WING_AIRFOIL:
			return getWingAirfoil();
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
		case CpacsPackage.WING_AIRFOILS_TYPE__WING_AIRFOIL:
			getWingAirfoil().clear();
			getWingAirfoil().addAll((Collection<? extends ProfileGeometryType>) newValue);
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
		case CpacsPackage.WING_AIRFOILS_TYPE__WING_AIRFOIL:
			getWingAirfoil().clear();
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
		case CpacsPackage.WING_AIRFOILS_TYPE__WING_AIRFOIL:
			return wingAirfoil != null && !wingAirfoil.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingAirfoilsTypeImpl
