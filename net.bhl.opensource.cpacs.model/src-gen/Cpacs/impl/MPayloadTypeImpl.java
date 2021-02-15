/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MCargoType;
import Cpacs.MPaxType;
import Cpacs.MPayloadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPayload Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MPayloadTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MPayloadTypeImpl#getMPax <em>MPax</em>}</li>
 *   <li>{@link Cpacs.impl.MPayloadTypeImpl#getMCargo <em>MCargo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPayloadTypeImpl extends ComplexBaseTypeImpl implements MPayloadType {
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
	 * The cached value of the '{@link #getMPax() <em>MPax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPax()
	 * @generated
	 * @ordered
	 */
	protected MPaxType mPax;

	/**
	 * The cached value of the '{@link #getMCargo() <em>MCargo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCargo()
	 * @generated
	 * @ordered
	 */
	protected MCargoType mCargo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPayloadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMPayloadType();
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
					CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPaxType getMPax() {
		return mPax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPax(MPaxType newMPax, NotificationChain msgs) {
		MPaxType oldMPax = mPax;
		mPax = newMPax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPAYLOAD_TYPE__MPAX, oldMPax, newMPax);
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
	public void setMPax(MPaxType newMPax) {
		if (newMPax != mPax) {
			NotificationChain msgs = null;
			if (mPax != null)
				msgs = ((InternalEObject) mPax).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAYLOAD_TYPE__MPAX, null, msgs);
			if (newMPax != null)
				msgs = ((InternalEObject) newMPax).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAYLOAD_TYPE__MPAX, null, msgs);
			msgs = basicSetMPax(newMPax, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPAYLOAD_TYPE__MPAX, newMPax, newMPax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCargoType getMCargo() {
		return mCargo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCargo(MCargoType newMCargo, NotificationChain msgs) {
		MCargoType oldMCargo = mCargo;
		mCargo = newMCargo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPAYLOAD_TYPE__MCARGO, oldMCargo, newMCargo);
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
	public void setMCargo(MCargoType newMCargo) {
		if (newMCargo != mCargo) {
			NotificationChain msgs = null;
			if (mCargo != null)
				msgs = ((InternalEObject) mCargo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAYLOAD_TYPE__MCARGO, null, msgs);
			if (newMCargo != null)
				msgs = ((InternalEObject) newMCargo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAYLOAD_TYPE__MCARGO, null, msgs);
			msgs = basicSetMCargo(newMCargo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPAYLOAD_TYPE__MCARGO, newMCargo,
					newMCargo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MPAYLOAD_TYPE__MPAX:
			return basicSetMPax(null, msgs);
		case CpacsPackage.MPAYLOAD_TYPE__MCARGO:
			return basicSetMCargo(null, msgs);
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
		case CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MPAYLOAD_TYPE__MPAX:
			return getMPax();
		case CpacsPackage.MPAYLOAD_TYPE__MCARGO:
			return getMCargo();
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
		case CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MPAYLOAD_TYPE__MPAX:
			setMPax((MPaxType) newValue);
			return;
		case CpacsPackage.MPAYLOAD_TYPE__MCARGO:
			setMCargo((MCargoType) newValue);
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
		case CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MPAYLOAD_TYPE__MPAX:
			setMPax((MPaxType) null);
			return;
		case CpacsPackage.MPAYLOAD_TYPE__MCARGO:
			setMCargo((MCargoType) null);
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
		case CpacsPackage.MPAYLOAD_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MPAYLOAD_TYPE__MPAX:
			return mPax != null;
		case CpacsPackage.MPAYLOAD_TYPE__MCARGO:
			return mCargo != null;
		}
		return super.eIsSet(featureID);
	}

} //MPayloadTypeImpl
