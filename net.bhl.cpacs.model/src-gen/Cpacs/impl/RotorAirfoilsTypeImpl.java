/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.ProfileGeometryType;
import Cpacs.RotorAirfoilsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotor Airfoils Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorAirfoilsTypeImpl#getRotorAirfoil <em>Rotor Airfoil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorAirfoilsTypeImpl extends ComplexBaseTypeImpl implements RotorAirfoilsType {
	/**
	 * The cached value of the '{@link #getRotorAirfoil() <em>Rotor Airfoil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotorAirfoil()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileGeometryType> rotorAirfoil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotorAirfoilsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorAirfoilsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileGeometryType> getRotorAirfoil() {
		if (rotorAirfoil == null) {
			rotorAirfoil = new EObjectContainmentEList<ProfileGeometryType>(ProfileGeometryType.class, this,
					CpacsPackage.ROTOR_AIRFOILS_TYPE__ROTOR_AIRFOIL);
		}
		return rotorAirfoil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTOR_AIRFOILS_TYPE__ROTOR_AIRFOIL:
			return ((InternalEList<?>) getRotorAirfoil()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ROTOR_AIRFOILS_TYPE__ROTOR_AIRFOIL:
			return getRotorAirfoil();
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
		case CpacsPackage.ROTOR_AIRFOILS_TYPE__ROTOR_AIRFOIL:
			getRotorAirfoil().clear();
			getRotorAirfoil().addAll((Collection<? extends ProfileGeometryType>) newValue);
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
		case CpacsPackage.ROTOR_AIRFOILS_TYPE__ROTOR_AIRFOIL:
			getRotorAirfoil().clear();
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
		case CpacsPackage.ROTOR_AIRFOILS_TYPE__ROTOR_AIRFOIL:
			return rotorAirfoil != null && !rotorAirfoil.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RotorAirfoilsTypeImpl
