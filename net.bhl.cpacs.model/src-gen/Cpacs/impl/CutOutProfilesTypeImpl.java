/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutOutProfileType;
import Cpacs.CutOutProfilesType;
import Cpacs.OuterCutOutProfileType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cut Out Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CutOutProfilesTypeImpl#getOuterCutOutProfile <em>Outer Cut Out Profile</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutProfilesTypeImpl#getInnerCutOutProfile <em>Inner Cut Out Profile</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutProfilesTypeImpl#getCutOutProfile <em>Cut Out Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CutOutProfilesTypeImpl extends ComplexBaseTypeImpl implements CutOutProfilesType {
	/**
	 * The cached value of the '{@link #getOuterCutOutProfile() <em>Outer Cut Out Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterCutOutProfile()
	 * @generated
	 * @ordered
	 */
	protected OuterCutOutProfileType outerCutOutProfile;

	/**
	 * The cached value of the '{@link #getInnerCutOutProfile() <em>Inner Cut Out Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerCutOutProfile()
	 * @generated
	 * @ordered
	 */
	protected OuterCutOutProfileType innerCutOutProfile;

	/**
	 * The cached value of the '{@link #getCutOutProfile() <em>Cut Out Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<CutOutProfileType> cutOutProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CutOutProfilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCutOutProfilesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OuterCutOutProfileType getOuterCutOutProfile() {
		return outerCutOutProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterCutOutProfile(OuterCutOutProfileType newOuterCutOutProfile,
			NotificationChain msgs) {
		OuterCutOutProfileType oldOuterCutOutProfile = outerCutOutProfile;
		outerCutOutProfile = newOuterCutOutProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE, oldOuterCutOutProfile,
					newOuterCutOutProfile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterCutOutProfile(OuterCutOutProfileType newOuterCutOutProfile) {
		if (newOuterCutOutProfile != outerCutOutProfile) {
			NotificationChain msgs = null;
			if (outerCutOutProfile != null)
				msgs = ((InternalEObject) outerCutOutProfile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE, null, msgs);
			if (newOuterCutOutProfile != null)
				msgs = ((InternalEObject) newOuterCutOutProfile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE, null, msgs);
			msgs = basicSetOuterCutOutProfile(newOuterCutOutProfile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE, newOuterCutOutProfile,
					newOuterCutOutProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OuterCutOutProfileType getInnerCutOutProfile() {
		return innerCutOutProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerCutOutProfile(OuterCutOutProfileType newInnerCutOutProfile,
			NotificationChain msgs) {
		OuterCutOutProfileType oldInnerCutOutProfile = innerCutOutProfile;
		innerCutOutProfile = newInnerCutOutProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE, oldInnerCutOutProfile,
					newInnerCutOutProfile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInnerCutOutProfile(OuterCutOutProfileType newInnerCutOutProfile) {
		if (newInnerCutOutProfile != innerCutOutProfile) {
			NotificationChain msgs = null;
			if (innerCutOutProfile != null)
				msgs = ((InternalEObject) innerCutOutProfile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE, null, msgs);
			if (newInnerCutOutProfile != null)
				msgs = ((InternalEObject) newInnerCutOutProfile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE, null, msgs);
			msgs = basicSetInnerCutOutProfile(newInnerCutOutProfile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE, newInnerCutOutProfile,
					newInnerCutOutProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CutOutProfileType> getCutOutProfile() {
		if (cutOutProfile == null) {
			cutOutProfile = new EObjectContainmentEList<CutOutProfileType>(CutOutProfileType.class, this,
					CpacsPackage.CUT_OUT_PROFILES_TYPE__CUT_OUT_PROFILE);
		}
		return cutOutProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE:
			return basicSetOuterCutOutProfile(null, msgs);
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE:
			return basicSetInnerCutOutProfile(null, msgs);
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__CUT_OUT_PROFILE:
			return ((InternalEList<?>) getCutOutProfile()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE:
			return getOuterCutOutProfile();
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE:
			return getInnerCutOutProfile();
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__CUT_OUT_PROFILE:
			return getCutOutProfile();
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
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE:
			setOuterCutOutProfile((OuterCutOutProfileType) newValue);
			return;
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE:
			setInnerCutOutProfile((OuterCutOutProfileType) newValue);
			return;
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__CUT_OUT_PROFILE:
			getCutOutProfile().clear();
			getCutOutProfile().addAll((Collection<? extends CutOutProfileType>) newValue);
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
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE:
			setOuterCutOutProfile((OuterCutOutProfileType) null);
			return;
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE:
			setInnerCutOutProfile((OuterCutOutProfileType) null);
			return;
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__CUT_OUT_PROFILE:
			getCutOutProfile().clear();
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
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__OUTER_CUT_OUT_PROFILE:
			return outerCutOutProfile != null;
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__INNER_CUT_OUT_PROFILE:
			return innerCutOutProfile != null;
		case CpacsPackage.CUT_OUT_PROFILES_TYPE__CUT_OUT_PROFILE:
			return cutOutProfile != null && !cutOutProfile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CutOutProfilesTypeImpl
