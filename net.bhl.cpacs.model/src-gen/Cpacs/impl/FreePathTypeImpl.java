/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FreePathType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FreePathTypeImpl#getPositive <em>Positive</em>}</li>
 *   <li>{@link Cpacs.impl.FreePathTypeImpl#getNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreePathTypeImpl extends ComplexBaseTypeImpl implements FreePathType {
	/**
	 * The cached value of the '{@link #getPositive() <em>Positive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositive()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positive;

	/**
	 * The cached value of the '{@link #getNegative() <em>Negative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegative()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType negative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreePathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFreePathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositive() {
		return positive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositive(DoubleBaseType newPositive, NotificationChain msgs) {
		DoubleBaseType oldPositive = positive;
		positive = newPositive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FREE_PATH_TYPE__POSITIVE, oldPositive, newPositive);
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
	public void setPositive(DoubleBaseType newPositive) {
		if (newPositive != positive) {
			NotificationChain msgs = null;
			if (positive != null)
				msgs = ((InternalEObject) positive).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FREE_PATH_TYPE__POSITIVE, null, msgs);
			if (newPositive != null)
				msgs = ((InternalEObject) newPositive).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FREE_PATH_TYPE__POSITIVE, null, msgs);
			msgs = basicSetPositive(newPositive, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FREE_PATH_TYPE__POSITIVE, newPositive,
					newPositive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNegative() {
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegative(DoubleBaseType newNegative, NotificationChain msgs) {
		DoubleBaseType oldNegative = negative;
		negative = newNegative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FREE_PATH_TYPE__NEGATIVE, oldNegative, newNegative);
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
	public void setNegative(DoubleBaseType newNegative) {
		if (newNegative != negative) {
			NotificationChain msgs = null;
			if (negative != null)
				msgs = ((InternalEObject) negative).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FREE_PATH_TYPE__NEGATIVE, null, msgs);
			if (newNegative != null)
				msgs = ((InternalEObject) newNegative).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FREE_PATH_TYPE__NEGATIVE, null, msgs);
			msgs = basicSetNegative(newNegative, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FREE_PATH_TYPE__NEGATIVE, newNegative,
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
		case CpacsPackage.FREE_PATH_TYPE__POSITIVE:
			return basicSetPositive(null, msgs);
		case CpacsPackage.FREE_PATH_TYPE__NEGATIVE:
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
		case CpacsPackage.FREE_PATH_TYPE__POSITIVE:
			return getPositive();
		case CpacsPackage.FREE_PATH_TYPE__NEGATIVE:
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
		case CpacsPackage.FREE_PATH_TYPE__POSITIVE:
			setPositive((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FREE_PATH_TYPE__NEGATIVE:
			setNegative((DoubleBaseType) newValue);
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
		case CpacsPackage.FREE_PATH_TYPE__POSITIVE:
			setPositive((DoubleBaseType) null);
			return;
		case CpacsPackage.FREE_PATH_TYPE__NEGATIVE:
			setNegative((DoubleBaseType) null);
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
		case CpacsPackage.FREE_PATH_TYPE__POSITIVE:
			return positive != null;
		case CpacsPackage.FREE_PATH_TYPE__NEGATIVE:
			return negative != null;
		}
		return super.eIsSet(featureID);
	}

} //FreePathTypeImpl
