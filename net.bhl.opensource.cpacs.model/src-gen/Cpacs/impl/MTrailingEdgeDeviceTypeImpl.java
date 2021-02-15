/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MCarriagesType;
import Cpacs.MTrailingEdgeDeviceType;
import Cpacs.SingleGenericMassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTrailing Edge Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MTrailingEdgeDeviceTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MTrailingEdgeDeviceTypeImpl#getMBody <em>MBody</em>}</li>
 *   <li>{@link Cpacs.impl.MTrailingEdgeDeviceTypeImpl#getMCarriages <em>MCarriages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTrailingEdgeDeviceTypeImpl extends ComplexBaseTypeImpl implements MTrailingEdgeDeviceType {
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
	 * The cached value of the '{@link #getMBody() <em>MBody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBody()
	 * @generated
	 * @ordered
	 */
	protected SingleGenericMassType mBody;

	/**
	 * The cached value of the '{@link #getMCarriages() <em>MCarriages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCarriages()
	 * @generated
	 * @ordered
	 */
	protected MCarriagesType mCarriages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTrailingEdgeDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMTrailingEdgeDeviceType();
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
					CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION, newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleGenericMassType getMBody() {
		return mBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMBody(SingleGenericMassType newMBody, NotificationChain msgs) {
		SingleGenericMassType oldMBody = mBody;
		mBody = newMBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY, oldMBody, newMBody);
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
	public void setMBody(SingleGenericMassType newMBody) {
		if (newMBody != mBody) {
			NotificationChain msgs = null;
			if (mBody != null)
				msgs = ((InternalEObject) mBody).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY, null, msgs);
			if (newMBody != null)
				msgs = ((InternalEObject) newMBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY, null, msgs);
			msgs = basicSetMBody(newMBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY,
					newMBody, newMBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCarriagesType getMCarriages() {
		return mCarriages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCarriages(MCarriagesType newMCarriages, NotificationChain msgs) {
		MCarriagesType oldMCarriages = mCarriages;
		mCarriages = newMCarriages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES, oldMCarriages, newMCarriages);
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
	public void setMCarriages(MCarriagesType newMCarriages) {
		if (newMCarriages != mCarriages) {
			NotificationChain msgs = null;
			if (mCarriages != null)
				msgs = ((InternalEObject) mCarriages).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES, null, msgs);
			if (newMCarriages != null)
				msgs = ((InternalEObject) newMCarriages).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES, null, msgs);
			msgs = basicSetMCarriages(newMCarriages, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES,
					newMCarriages, newMCarriages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY:
			return basicSetMBody(null, msgs);
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES:
			return basicSetMCarriages(null, msgs);
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
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY:
			return getMBody();
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES:
			return getMCarriages();
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
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY:
			setMBody((SingleGenericMassType) newValue);
			return;
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES:
			setMCarriages((MCarriagesType) newValue);
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
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY:
			setMBody((SingleGenericMassType) null);
			return;
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES:
			setMCarriages((MCarriagesType) null);
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
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MBODY:
			return mBody != null;
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE__MCARRIAGES:
			return mCarriages != null;
		}
		return super.eIsSet(featureID);
	}

} //MTrailingEdgeDeviceTypeImpl
