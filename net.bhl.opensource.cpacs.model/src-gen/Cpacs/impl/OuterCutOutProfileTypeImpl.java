/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.OuterCutOutProfileType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outer Cut Out Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.OuterCutOutProfileTypeImpl#getProfileUID <em>Profile UID</em>}</li>
 *   <li>{@link Cpacs.impl.OuterCutOutProfileTypeImpl#getRotZ <em>Rot Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OuterCutOutProfileTypeImpl extends ComplexBaseTypeImpl implements OuterCutOutProfileType {
	/**
	 * The cached value of the '{@link #getProfileUID() <em>Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType profileUID;

	/**
	 * The cached value of the '{@link #getRotZ() <em>Rot Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rotZ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OuterCutOutProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getOuterCutOutProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getProfileUID() {
		return profileUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileUID(StringUIDBaseType newProfileUID, NotificationChain msgs) {
		StringUIDBaseType oldProfileUID = profileUID;
		profileUID = newProfileUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID, oldProfileUID, newProfileUID);
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
	public void setProfileUID(StringUIDBaseType newProfileUID) {
		if (newProfileUID != profileUID) {
			NotificationChain msgs = null;
			if (profileUID != null)
				msgs = ((InternalEObject) profileUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID, null, msgs);
			if (newProfileUID != null)
				msgs = ((InternalEObject) newProfileUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID, null, msgs);
			msgs = basicSetProfileUID(newProfileUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID,
					newProfileUID, newProfileUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRotZ() {
		return rotZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotZ(DoubleBaseType newRotZ, NotificationChain msgs) {
		DoubleBaseType oldRotZ = rotZ;
		rotZ = newRotZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z, oldRotZ, newRotZ);
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
	public void setRotZ(DoubleBaseType newRotZ) {
		if (newRotZ != rotZ) {
			NotificationChain msgs = null;
			if (rotZ != null)
				msgs = ((InternalEObject) rotZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z, null, msgs);
			if (newRotZ != null)
				msgs = ((InternalEObject) newRotZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z, null, msgs);
			msgs = basicSetRotZ(newRotZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z,
					newRotZ, newRotZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID:
			return basicSetProfileUID(null, msgs);
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z:
			return basicSetRotZ(null, msgs);
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
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID:
			return getProfileUID();
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z:
			return getRotZ();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID:
			setProfileUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z:
			setRotZ((DoubleBaseType) newValue);
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
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID:
			setProfileUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z:
			setRotZ((DoubleBaseType) null);
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
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__PROFILE_UID:
			return profileUID != null;
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE__ROT_Z:
			return rotZ != null;
		}
		return super.eIsSet(featureID);
	}

} //OuterCutOutProfileTypeImpl
