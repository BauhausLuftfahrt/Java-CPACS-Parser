/**
 */
package Cpacs.impl;

import Cpacs.BlockedDOFType;
import Cpacs.BooleanBaseType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blocked DOF Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BlockedDOFTypeImpl#getPositive <em>Positive</em>}</li>
 *   <li>{@link Cpacs.impl.BlockedDOFTypeImpl#getNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockedDOFTypeImpl extends ComplexBaseTypeImpl implements BlockedDOFType {
	/**
	 * The cached value of the '{@link #getPositive() <em>Positive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositive()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType positive;

	/**
	 * The cached value of the '{@link #getNegative() <em>Negative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegative()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType negative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockedDOFTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBlockedDOFType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getPositive() {
		return positive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositive(BooleanBaseType newPositive, NotificationChain msgs) {
		BooleanBaseType oldPositive = positive;
		positive = newPositive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE, oldPositive, newPositive);
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
	public void setPositive(BooleanBaseType newPositive) {
		if (newPositive != positive) {
			NotificationChain msgs = null;
			if (positive != null)
				msgs = ((InternalEObject) positive).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE, null, msgs);
			if (newPositive != null)
				msgs = ((InternalEObject) newPositive).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE, null, msgs);
			msgs = basicSetPositive(newPositive, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE, newPositive,
					newPositive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getNegative() {
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegative(BooleanBaseType newNegative, NotificationChain msgs) {
		BooleanBaseType oldNegative = negative;
		negative = newNegative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE, oldNegative, newNegative);
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
	public void setNegative(BooleanBaseType newNegative) {
		if (newNegative != negative) {
			NotificationChain msgs = null;
			if (negative != null)
				msgs = ((InternalEObject) negative).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE, null, msgs);
			if (newNegative != null)
				msgs = ((InternalEObject) newNegative).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE, null, msgs);
			msgs = basicSetNegative(newNegative, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE, newNegative,
					newNegative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE:
			return basicSetPositive(null, msgs);
		case CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE:
			return basicSetNegative(null, msgs);
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
		case CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE:
			return getPositive();
		case CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE:
			return getNegative();
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
		case CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE:
			setPositive((BooleanBaseType) newValue);
			return;
		case CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE:
			setNegative((BooleanBaseType) newValue);
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
		case CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE:
			setPositive((BooleanBaseType) null);
			return;
		case CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE:
			setNegative((BooleanBaseType) null);
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
		case CpacsPackage.BLOCKED_DOF_TYPE__POSITIVE:
			return positive != null;
		case CpacsPackage.BLOCKED_DOF_TYPE__NEGATIVE:
			return negative != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockedDOFTypeImpl
