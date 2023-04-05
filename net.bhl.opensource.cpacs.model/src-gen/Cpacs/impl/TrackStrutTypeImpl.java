/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.NameType1;
import Cpacs.StringUIDBaseType;
import Cpacs.TrackStrutType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Strut Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrackStrutTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStrutTypeImpl#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStrutTypeImpl#getProfileUID <em>Profile UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackStrutTypeImpl extends ComplexBaseTypeImpl implements TrackStrutType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType1 name;

	/**
	 * The cached value of the '{@link #getMaterialUID() <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType materialUID;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackStrutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrackStrutType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameType1 getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType1 newName, NotificationChain msgs) {
		NameType1 oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUT_TYPE__NAME, oldName, newName);
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
	public void setName(NameType1 newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUT_TYPE__NAME, newName,
					newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMaterialUID() {
		return materialUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialUID(StringUIDBaseType newMaterialUID, NotificationChain msgs) {
		StringUIDBaseType oldMaterialUID = materialUID;
		materialUID = newMaterialUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID, oldMaterialUID, newMaterialUID);
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
	public void setMaterialUID(StringUIDBaseType newMaterialUID) {
		if (newMaterialUID != materialUID) {
			NotificationChain msgs = null;
			if (materialUID != null)
				msgs = ((InternalEObject) materialUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID, null, msgs);
			if (newMaterialUID != null)
				msgs = ((InternalEObject) newMaterialUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID, null, msgs);
			msgs = basicSetMaterialUID(newMaterialUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID,
					newMaterialUID, newMaterialUID));
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
					CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID, oldProfileUID, newProfileUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID, null, msgs);
			if (newProfileUID != null)
				msgs = ((InternalEObject) newProfileUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID, null, msgs);
			msgs = basicSetProfileUID(newProfileUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID,
					newProfileUID, newProfileUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRACK_STRUT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID:
			return basicSetMaterialUID(null, msgs);
		case CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID:
			return basicSetProfileUID(null, msgs);
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
		case CpacsPackage.TRACK_STRUT_TYPE__NAME:
			return getName();
		case CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID:
			return getMaterialUID();
		case CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID:
			return getProfileUID();
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
		case CpacsPackage.TRACK_STRUT_TYPE__NAME:
			setName((NameType1) newValue);
			return;
		case CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID:
			setProfileUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.TRACK_STRUT_TYPE__NAME:
			setName((NameType1) null);
			return;
		case CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID:
			setProfileUID((StringUIDBaseType) null);
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
		case CpacsPackage.TRACK_STRUT_TYPE__NAME:
			return name != null;
		case CpacsPackage.TRACK_STRUT_TYPE__MATERIAL_UID:
			return materialUID != null;
		case CpacsPackage.TRACK_STRUT_TYPE__PROFILE_UID:
			return profileUID != null;
		}
		return super.eIsSet(featureID);
	}

} //TrackStrutTypeImpl
