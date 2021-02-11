/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FqTreffType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Treff Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqTreffTypeImpl#getTreff <em>Treff</em>}</li>
 *   <li>{@link Cpacs.impl.FqTreffTypeImpl#getTtan <em>Ttan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqTreffTypeImpl extends ComplexBaseTypeImpl implements FqTreffType {
	/**
	 * The cached value of the '{@link #getTreff() <em>Treff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreff()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType treff;

	/**
	 * The cached value of the '{@link #getTtan() <em>Ttan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtan()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType ttan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqTreffTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqTreffType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTreff() {
		return treff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreff(DoubleBaseType newTreff, NotificationChain msgs) {
		DoubleBaseType oldTreff = treff;
		treff = newTreff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_TREFF_TYPE__TREFF, oldTreff, newTreff);
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
	public void setTreff(DoubleBaseType newTreff) {
		if (newTreff != treff) {
			NotificationChain msgs = null;
			if (treff != null)
				msgs = ((InternalEObject) treff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_TREFF_TYPE__TREFF, null, msgs);
			if (newTreff != null)
				msgs = ((InternalEObject) newTreff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_TREFF_TYPE__TREFF, null, msgs);
			msgs = basicSetTreff(newTreff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_TREFF_TYPE__TREFF, newTreff,
					newTreff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTtan() {
		return ttan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTtan(DoubleBaseType newTtan, NotificationChain msgs) {
		DoubleBaseType oldTtan = ttan;
		ttan = newTtan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_TREFF_TYPE__TTAN, oldTtan, newTtan);
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
	public void setTtan(DoubleBaseType newTtan) {
		if (newTtan != ttan) {
			NotificationChain msgs = null;
			if (ttan != null)
				msgs = ((InternalEObject) ttan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_TREFF_TYPE__TTAN, null, msgs);
			if (newTtan != null)
				msgs = ((InternalEObject) newTtan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_TREFF_TYPE__TTAN, null, msgs);
			msgs = basicSetTtan(newTtan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_TREFF_TYPE__TTAN, newTtan, newTtan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_TREFF_TYPE__TREFF:
			return basicSetTreff(null, msgs);
		case CpacsPackage.FQ_TREFF_TYPE__TTAN:
			return basicSetTtan(null, msgs);
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
		case CpacsPackage.FQ_TREFF_TYPE__TREFF:
			return getTreff();
		case CpacsPackage.FQ_TREFF_TYPE__TTAN:
			return getTtan();
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
		case CpacsPackage.FQ_TREFF_TYPE__TREFF:
			setTreff((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_TREFF_TYPE__TTAN:
			setTtan((DoubleBaseType) newValue);
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
		case CpacsPackage.FQ_TREFF_TYPE__TREFF:
			setTreff((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_TREFF_TYPE__TTAN:
			setTtan((DoubleBaseType) null);
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
		case CpacsPackage.FQ_TREFF_TYPE__TREFF:
			return treff != null;
		case CpacsPackage.FQ_TREFF_TYPE__TTAN:
			return ttan != null;
		}
		return super.eIsSet(featureID);
	}

} //FqTreffTypeImpl
