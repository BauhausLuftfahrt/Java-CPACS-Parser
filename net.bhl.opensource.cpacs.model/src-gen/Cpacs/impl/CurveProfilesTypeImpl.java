/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CurveProfilesType;
import Cpacs.ProfileGeometry2DType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CurveProfilesTypeImpl#getCurveProfile <em>Curve Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveProfilesTypeImpl extends ComplexBaseTypeImpl implements CurveProfilesType {
	/**
	 * The cached value of the '{@link #getCurveProfile() <em>Curve Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileGeometry2DType> curveProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveProfilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCurveProfilesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileGeometry2DType> getCurveProfile() {
		if (curveProfile == null) {
			curveProfile = new EObjectContainmentEList<ProfileGeometry2DType>(ProfileGeometry2DType.class, this,
					CpacsPackage.CURVE_PROFILES_TYPE__CURVE_PROFILE);
		}
		return curveProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CURVE_PROFILES_TYPE__CURVE_PROFILE:
			return ((InternalEList<?>) getCurveProfile()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CURVE_PROFILES_TYPE__CURVE_PROFILE:
			return getCurveProfile();
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
		case CpacsPackage.CURVE_PROFILES_TYPE__CURVE_PROFILE:
			getCurveProfile().clear();
			getCurveProfile().addAll((Collection<? extends ProfileGeometry2DType>) newValue);
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
		case CpacsPackage.CURVE_PROFILES_TYPE__CURVE_PROFILE:
			getCurveProfile().clear();
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
		case CpacsPackage.CURVE_PROFILES_TYPE__CURVE_PROFILE:
			return curveProfile != null && !curveProfile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CurveProfilesTypeImpl
