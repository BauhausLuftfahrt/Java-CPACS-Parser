/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GuideCurveProfileGeometryType;
import Cpacs.GuideCurveProfilesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guide Curve Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GuideCurveProfilesTypeImpl#getGuideCurveProfile <em>Guide Curve Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuideCurveProfilesTypeImpl extends ComplexBaseTypeImpl implements GuideCurveProfilesType {
	/**
	 * The cached value of the '{@link #getGuideCurveProfile() <em>Guide Curve Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideCurveProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<GuideCurveProfileGeometryType> guideCurveProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuideCurveProfilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGuideCurveProfilesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuideCurveProfileGeometryType> getGuideCurveProfile() {
		if (guideCurveProfile == null) {
			guideCurveProfile = new EObjectContainmentEList<GuideCurveProfileGeometryType>(
					GuideCurveProfileGeometryType.class, this,
					CpacsPackage.GUIDE_CURVE_PROFILES_TYPE__GUIDE_CURVE_PROFILE);
		}
		return guideCurveProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GUIDE_CURVE_PROFILES_TYPE__GUIDE_CURVE_PROFILE:
			return ((InternalEList<?>) getGuideCurveProfile()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GUIDE_CURVE_PROFILES_TYPE__GUIDE_CURVE_PROFILE:
			return getGuideCurveProfile();
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
		case CpacsPackage.GUIDE_CURVE_PROFILES_TYPE__GUIDE_CURVE_PROFILE:
			getGuideCurveProfile().clear();
			getGuideCurveProfile().addAll((Collection<? extends GuideCurveProfileGeometryType>) newValue);
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
		case CpacsPackage.GUIDE_CURVE_PROFILES_TYPE__GUIDE_CURVE_PROFILE:
			getGuideCurveProfile().clear();
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
		case CpacsPackage.GUIDE_CURVE_PROFILES_TYPE__GUIDE_CURVE_PROFILE:
			return guideCurveProfile != null && !guideCurveProfile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuideCurveProfilesTypeImpl
