/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.NacelleProfilesType;
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
 * An implementation of the model object '<em><b>Nacelle Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NacelleProfilesTypeImpl#getNacelleProfile <em>Nacelle Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NacelleProfilesTypeImpl extends ComplexBaseTypeImpl implements NacelleProfilesType {
	/**
	 * The cached value of the '{@link #getNacelleProfile() <em>Nacelle Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNacelleProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileGeometry2DType> nacelleProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NacelleProfilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNacelleProfilesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileGeometry2DType> getNacelleProfile() {
		if (nacelleProfile == null) {
			nacelleProfile = new EObjectContainmentEList<ProfileGeometry2DType>(ProfileGeometry2DType.class, this,
					CpacsPackage.NACELLE_PROFILES_TYPE__NACELLE_PROFILE);
		}
		return nacelleProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NACELLE_PROFILES_TYPE__NACELLE_PROFILE:
			return ((InternalEList<?>) getNacelleProfile()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.NACELLE_PROFILES_TYPE__NACELLE_PROFILE:
			return getNacelleProfile();
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
		case CpacsPackage.NACELLE_PROFILES_TYPE__NACELLE_PROFILE:
			getNacelleProfile().clear();
			getNacelleProfile().addAll((Collection<? extends ProfileGeometry2DType>) newValue);
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
		case CpacsPackage.NACELLE_PROFILES_TYPE__NACELLE_PROFILE:
			getNacelleProfile().clear();
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
		case CpacsPackage.NACELLE_PROFILES_TYPE__NACELLE_PROFILE:
			return nacelleProfile != null && !nacelleProfile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NacelleProfilesTypeImpl
