/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FuselageProfilesType;
import Cpacs.ProfileGeometryType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselage Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageProfilesTypeImpl#getFuselageProfile <em>Fuselage Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageProfilesTypeImpl extends ComplexBaseTypeImpl implements FuselageProfilesType {
	/**
	 * The cached value of the '{@link #getFuselageProfile() <em>Fuselage Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileGeometryType> fuselageProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuselageProfilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageProfilesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileGeometryType> getFuselageProfile() {
		if (fuselageProfile == null) {
			fuselageProfile = new EObjectContainmentEList<ProfileGeometryType>(ProfileGeometryType.class, this,
					CpacsPackage.FUSELAGE_PROFILES_TYPE__FUSELAGE_PROFILE);
		}
		return fuselageProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGE_PROFILES_TYPE__FUSELAGE_PROFILE:
			return ((InternalEList<?>) getFuselageProfile()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FUSELAGE_PROFILES_TYPE__FUSELAGE_PROFILE:
			return getFuselageProfile();
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
		case CpacsPackage.FUSELAGE_PROFILES_TYPE__FUSELAGE_PROFILE:
			getFuselageProfile().clear();
			getFuselageProfile().addAll((Collection<? extends ProfileGeometryType>) newValue);
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
		case CpacsPackage.FUSELAGE_PROFILES_TYPE__FUSELAGE_PROFILE:
			getFuselageProfile().clear();
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
		case CpacsPackage.FUSELAGE_PROFILES_TYPE__FUSELAGE_PROFILE:
			return fuselageProfile != null && !fuselageProfile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FuselageProfilesTypeImpl
