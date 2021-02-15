/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DampingDerivativesRatesType;
import Cpacs.DampingDerivativesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Damping Derivatives Rates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DampingDerivativesRatesTypeImpl#getPositiveRates <em>Positive Rates</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesRatesTypeImpl#getNegativeRates <em>Negative Rates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DampingDerivativesRatesTypeImpl extends ComplexBaseTypeImpl implements DampingDerivativesRatesType {
	/**
	 * The cached value of the '{@link #getPositiveRates() <em>Positive Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveRates()
	 * @generated
	 * @ordered
	 */
	protected DampingDerivativesType positiveRates;

	/**
	 * The cached value of the '{@link #getNegativeRates() <em>Negative Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeRates()
	 * @generated
	 * @ordered
	 */
	protected DampingDerivativesType negativeRates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DampingDerivativesRatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDampingDerivativesRatesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DampingDerivativesType getPositiveRates() {
		return positiveRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositiveRates(DampingDerivativesType newPositiveRates, NotificationChain msgs) {
		DampingDerivativesType oldPositiveRates = positiveRates;
		positiveRates = newPositiveRates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES, oldPositiveRates, newPositiveRates);
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
	public void setPositiveRates(DampingDerivativesType newPositiveRates) {
		if (newPositiveRates != positiveRates) {
			NotificationChain msgs = null;
			if (positiveRates != null)
				msgs = ((InternalEObject) positiveRates).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES, null,
						msgs);
			if (newPositiveRates != null)
				msgs = ((InternalEObject) newPositiveRates).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES, null,
						msgs);
			msgs = basicSetPositiveRates(newPositiveRates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES, newPositiveRates, newPositiveRates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DampingDerivativesType getNegativeRates() {
		return negativeRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegativeRates(DampingDerivativesType newNegativeRates, NotificationChain msgs) {
		DampingDerivativesType oldNegativeRates = negativeRates;
		negativeRates = newNegativeRates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES, oldNegativeRates, newNegativeRates);
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
	public void setNegativeRates(DampingDerivativesType newNegativeRates) {
		if (newNegativeRates != negativeRates) {
			NotificationChain msgs = null;
			if (negativeRates != null)
				msgs = ((InternalEObject) negativeRates).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES, null,
						msgs);
			if (newNegativeRates != null)
				msgs = ((InternalEObject) newNegativeRates).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES, null,
						msgs);
			msgs = basicSetNegativeRates(newNegativeRates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES, newNegativeRates, newNegativeRates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES:
			return basicSetPositiveRates(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES:
			return basicSetNegativeRates(null, msgs);
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
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES:
			return getPositiveRates();
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES:
			return getNegativeRates();
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
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES:
			setPositiveRates((DampingDerivativesType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES:
			setNegativeRates((DampingDerivativesType) newValue);
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
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES:
			setPositiveRates((DampingDerivativesType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES:
			setNegativeRates((DampingDerivativesType) null);
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
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__POSITIVE_RATES:
			return positiveRates != null;
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE__NEGATIVE_RATES:
			return negativeRates != null;
		}
		return super.eIsSet(featureID);
	}

} //DampingDerivativesRatesTypeImpl
