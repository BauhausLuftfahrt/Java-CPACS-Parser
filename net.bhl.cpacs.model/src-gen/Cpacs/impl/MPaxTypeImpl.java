/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MCarryOnsType;
import Cpacs.MPassengersType;
import Cpacs.MPaxType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPax Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MPaxTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MPaxTypeImpl#getMPassengers <em>MPassengers</em>}</li>
 *   <li>{@link Cpacs.impl.MPaxTypeImpl#getMCarryOns <em>MCarry Ons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPaxTypeImpl extends ComplexBaseTypeImpl implements MPaxType {
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
	 * The cached value of the '{@link #getMPassengers() <em>MPassengers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPassengers()
	 * @generated
	 * @ordered
	 */
	protected MPassengersType mPassengers;

	/**
	 * The cached value of the '{@link #getMCarryOns() <em>MCarry Ons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCarryOns()
	 * @generated
	 * @ordered
	 */
	protected MCarryOnsType mCarryOns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPaxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMPaxType();
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
					CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPassengersType getMPassengers() {
		return mPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPassengers(MPassengersType newMPassengers, NotificationChain msgs) {
		MPassengersType oldMPassengers = mPassengers;
		mPassengers = newMPassengers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPAX_TYPE__MPASSENGERS, oldMPassengers, newMPassengers);
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
	public void setMPassengers(MPassengersType newMPassengers) {
		if (newMPassengers != mPassengers) {
			NotificationChain msgs = null;
			if (mPassengers != null)
				msgs = ((InternalEObject) mPassengers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAX_TYPE__MPASSENGERS, null, msgs);
			if (newMPassengers != null)
				msgs = ((InternalEObject) newMPassengers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAX_TYPE__MPASSENGERS, null, msgs);
			msgs = basicSetMPassengers(newMPassengers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPAX_TYPE__MPASSENGERS, newMPassengers,
					newMPassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCarryOnsType getMCarryOns() {
		return mCarryOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCarryOns(MCarryOnsType newMCarryOns, NotificationChain msgs) {
		MCarryOnsType oldMCarryOns = mCarryOns;
		mCarryOns = newMCarryOns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MPAX_TYPE__MCARRY_ONS, oldMCarryOns, newMCarryOns);
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
	public void setMCarryOns(MCarryOnsType newMCarryOns) {
		if (newMCarryOns != mCarryOns) {
			NotificationChain msgs = null;
			if (mCarryOns != null)
				msgs = ((InternalEObject) mCarryOns).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAX_TYPE__MCARRY_ONS, null, msgs);
			if (newMCarryOns != null)
				msgs = ((InternalEObject) newMCarryOns).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MPAX_TYPE__MCARRY_ONS, null, msgs);
			msgs = basicSetMCarryOns(newMCarryOns, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MPAX_TYPE__MCARRY_ONS, newMCarryOns,
					newMCarryOns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MPAX_TYPE__MPASSENGERS:
			return basicSetMPassengers(null, msgs);
		case CpacsPackage.MPAX_TYPE__MCARRY_ONS:
			return basicSetMCarryOns(null, msgs);
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
		case CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MPAX_TYPE__MPASSENGERS:
			return getMPassengers();
		case CpacsPackage.MPAX_TYPE__MCARRY_ONS:
			return getMCarryOns();
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
		case CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MPAX_TYPE__MPASSENGERS:
			setMPassengers((MPassengersType) newValue);
			return;
		case CpacsPackage.MPAX_TYPE__MCARRY_ONS:
			setMCarryOns((MCarryOnsType) newValue);
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
		case CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MPAX_TYPE__MPASSENGERS:
			setMPassengers((MPassengersType) null);
			return;
		case CpacsPackage.MPAX_TYPE__MCARRY_ONS:
			setMCarryOns((MCarryOnsType) null);
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
		case CpacsPackage.MPAX_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MPAX_TYPE__MPASSENGERS:
			return mPassengers != null;
		case CpacsPackage.MPAX_TYPE__MCARRY_ONS:
			return mCarryOns != null;
		}
		return super.eIsSet(featureID);
	}

} //MPaxTypeImpl
