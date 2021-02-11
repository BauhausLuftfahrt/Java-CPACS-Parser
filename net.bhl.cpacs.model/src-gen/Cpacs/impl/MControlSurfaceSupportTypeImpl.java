/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MControlSurfaceSupportType;
import Cpacs.SingleGenericMassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MControl Surface Support Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MControlSurfaceSupportTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MControlSurfaceSupportTypeImpl#getMStructure <em>MStructure</em>}</li>
 *   <li>{@link Cpacs.impl.MControlSurfaceSupportTypeImpl#getMFairing <em>MFairing</em>}</li>
 *   <li>{@link Cpacs.impl.MControlSurfaceSupportTypeImpl#getMParentAttachment <em>MParent Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MControlSurfaceSupportTypeImpl extends ComplexBaseTypeImpl implements MControlSurfaceSupportType {
	/**
	 * The cached value of the '{@link #getMassDescription() <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType massDescription;

	/**
	 * The cached value of the '{@link #getMStructure() <em>MStructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStructure()
	 * @generated
	 * @ordered
	 */
	protected SingleGenericMassType mStructure;

	/**
	 * The cached value of the '{@link #getMFairing() <em>MFairing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFairing()
	 * @generated
	 * @ordered
	 */
	protected SingleGenericMassType mFairing;

	/**
	 * The cached value of the '{@link #getMParentAttachment() <em>MParent Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMParentAttachment()
	 * @generated
	 * @ordered
	 */
	protected SingleGenericMassType mParentAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MControlSurfaceSupportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMControlSurfaceSupportType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMassDescription() {
		return massDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassDescription(GenericMassType newMassDescription, NotificationChain msgs) {
		GenericMassType oldMassDescription = massDescription;
		massDescription = newMassDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION, oldMassDescription,
					newMassDescription);
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
	public void setMassDescription(GenericMassType newMassDescription) {
		if (newMassDescription != massDescription) {
			NotificationChain msgs = null;
			if (massDescription != null)
				msgs = ((InternalEObject) massDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION, null,
						msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION, null,
						msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION, newMassDescription,
					newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleGenericMassType getMStructure() {
		return mStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStructure(SingleGenericMassType newMStructure, NotificationChain msgs) {
		SingleGenericMassType oldMStructure = mStructure;
		mStructure = newMStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE, oldMStructure, newMStructure);
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
	public void setMStructure(SingleGenericMassType newMStructure) {
		if (newMStructure != mStructure) {
			NotificationChain msgs = null;
			if (mStructure != null)
				msgs = ((InternalEObject) mStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE, null, msgs);
			if (newMStructure != null)
				msgs = ((InternalEObject) newMStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE, null, msgs);
			msgs = basicSetMStructure(newMStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE, newMStructure, newMStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleGenericMassType getMFairing() {
		return mFairing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFairing(SingleGenericMassType newMFairing, NotificationChain msgs) {
		SingleGenericMassType oldMFairing = mFairing;
		mFairing = newMFairing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING, oldMFairing, newMFairing);
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
	public void setMFairing(SingleGenericMassType newMFairing) {
		if (newMFairing != mFairing) {
			NotificationChain msgs = null;
			if (mFairing != null)
				msgs = ((InternalEObject) mFairing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING, null, msgs);
			if (newMFairing != null)
				msgs = ((InternalEObject) newMFairing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING, null, msgs);
			msgs = basicSetMFairing(newMFairing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING,
					newMFairing, newMFairing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleGenericMassType getMParentAttachment() {
		return mParentAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMParentAttachment(SingleGenericMassType newMParentAttachment,
			NotificationChain msgs) {
		SingleGenericMassType oldMParentAttachment = mParentAttachment;
		mParentAttachment = newMParentAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT, oldMParentAttachment,
					newMParentAttachment);
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
	public void setMParentAttachment(SingleGenericMassType newMParentAttachment) {
		if (newMParentAttachment != mParentAttachment) {
			NotificationChain msgs = null;
			if (mParentAttachment != null)
				msgs = ((InternalEObject) mParentAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT, null,
						msgs);
			if (newMParentAttachment != null)
				msgs = ((InternalEObject) newMParentAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT, null,
						msgs);
			msgs = basicSetMParentAttachment(newMParentAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT, newMParentAttachment,
					newMParentAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE:
			return basicSetMStructure(null, msgs);
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING:
			return basicSetMFairing(null, msgs);
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT:
			return basicSetMParentAttachment(null, msgs);
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
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE:
			return getMStructure();
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING:
			return getMFairing();
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT:
			return getMParentAttachment();
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
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE:
			setMStructure((SingleGenericMassType) newValue);
			return;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING:
			setMFairing((SingleGenericMassType) newValue);
			return;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT:
			setMParentAttachment((SingleGenericMassType) newValue);
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
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE:
			setMStructure((SingleGenericMassType) null);
			return;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING:
			setMFairing((SingleGenericMassType) null);
			return;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT:
			setMParentAttachment((SingleGenericMassType) null);
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
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MSTRUCTURE:
			return mStructure != null;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MFAIRING:
			return mFairing != null;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE__MPARENT_ATTACHMENT:
			return mParentAttachment != null;
		}
		return super.eIsSet(featureID);
	}

} //MControlSurfaceSupportTypeImpl
