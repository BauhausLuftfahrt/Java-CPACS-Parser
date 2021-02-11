/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.HandbookAeroPolynomialCoefficientsType;
import Cpacs.HandbookAeroTransitionRegionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handbook Aero Transition Region Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.HandbookAeroTransitionRegionTypeImpl#getMaxReynoldsNumber <em>Max Reynolds Number</em>}</li>
 *   <li>{@link Cpacs.impl.HandbookAeroTransitionRegionTypeImpl#getLaminarFormFactor <em>Laminar Form Factor</em>}</li>
 *   <li>{@link Cpacs.impl.HandbookAeroTransitionRegionTypeImpl#getTurbulentFormFactor <em>Turbulent Form Factor</em>}</li>
 *   <li>{@link Cpacs.impl.HandbookAeroTransitionRegionTypeImpl#getPolynomialCoefficients <em>Polynomial Coefficients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HandbookAeroTransitionRegionTypeImpl extends ComplexBaseTypeImpl
		implements HandbookAeroTransitionRegionType {
	/**
	 * The cached value of the '{@link #getMaxReynoldsNumber() <em>Max Reynolds Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReynoldsNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType maxReynoldsNumber;

	/**
	 * The cached value of the '{@link #getLaminarFormFactor() <em>Laminar Form Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaminarFormFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType laminarFormFactor;

	/**
	 * The cached value of the '{@link #getTurbulentFormFactor() <em>Turbulent Form Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbulentFormFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType turbulentFormFactor;

	/**
	 * The cached value of the '{@link #getPolynomialCoefficients() <em>Polynomial Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolynomialCoefficients()
	 * @generated
	 * @ordered
	 */
	protected HandbookAeroPolynomialCoefficientsType polynomialCoefficients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandbookAeroTransitionRegionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getHandbookAeroTransitionRegionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMaxReynoldsNumber() {
		return maxReynoldsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxReynoldsNumber(DoubleBaseType newMaxReynoldsNumber, NotificationChain msgs) {
		DoubleBaseType oldMaxReynoldsNumber = maxReynoldsNumber;
		maxReynoldsNumber = newMaxReynoldsNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER, oldMaxReynoldsNumber,
					newMaxReynoldsNumber);
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
	public void setMaxReynoldsNumber(DoubleBaseType newMaxReynoldsNumber) {
		if (newMaxReynoldsNumber != maxReynoldsNumber) {
			NotificationChain msgs = null;
			if (maxReynoldsNumber != null)
				msgs = ((InternalEObject) maxReynoldsNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER,
						null, msgs);
			if (newMaxReynoldsNumber != null)
				msgs = ((InternalEObject) newMaxReynoldsNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER,
						null, msgs);
			msgs = basicSetMaxReynoldsNumber(newMaxReynoldsNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER, newMaxReynoldsNumber,
					newMaxReynoldsNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLaminarFormFactor() {
		return laminarFormFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaminarFormFactor(DoubleBaseType newLaminarFormFactor, NotificationChain msgs) {
		DoubleBaseType oldLaminarFormFactor = laminarFormFactor;
		laminarFormFactor = newLaminarFormFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR, oldLaminarFormFactor,
					newLaminarFormFactor);
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
	public void setLaminarFormFactor(DoubleBaseType newLaminarFormFactor) {
		if (newLaminarFormFactor != laminarFormFactor) {
			NotificationChain msgs = null;
			if (laminarFormFactor != null)
				msgs = ((InternalEObject) laminarFormFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR,
						null, msgs);
			if (newLaminarFormFactor != null)
				msgs = ((InternalEObject) newLaminarFormFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR,
						null, msgs);
			msgs = basicSetLaminarFormFactor(newLaminarFormFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR, newLaminarFormFactor,
					newLaminarFormFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTurbulentFormFactor() {
		return turbulentFormFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurbulentFormFactor(DoubleBaseType newTurbulentFormFactor,
			NotificationChain msgs) {
		DoubleBaseType oldTurbulentFormFactor = turbulentFormFactor;
		turbulentFormFactor = newTurbulentFormFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR, oldTurbulentFormFactor,
					newTurbulentFormFactor);
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
	public void setTurbulentFormFactor(DoubleBaseType newTurbulentFormFactor) {
		if (newTurbulentFormFactor != turbulentFormFactor) {
			NotificationChain msgs = null;
			if (turbulentFormFactor != null)
				msgs = ((InternalEObject) turbulentFormFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR, null, msgs);
			if (newTurbulentFormFactor != null)
				msgs = ((InternalEObject) newTurbulentFormFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR, null, msgs);
			msgs = basicSetTurbulentFormFactor(newTurbulentFormFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR, newTurbulentFormFactor,
					newTurbulentFormFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HandbookAeroPolynomialCoefficientsType getPolynomialCoefficients() {
		return polynomialCoefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolynomialCoefficients(
			HandbookAeroPolynomialCoefficientsType newPolynomialCoefficients, NotificationChain msgs) {
		HandbookAeroPolynomialCoefficientsType oldPolynomialCoefficients = polynomialCoefficients;
		polynomialCoefficients = newPolynomialCoefficients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS,
					oldPolynomialCoefficients, newPolynomialCoefficients);
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
	public void setPolynomialCoefficients(HandbookAeroPolynomialCoefficientsType newPolynomialCoefficients) {
		if (newPolynomialCoefficients != polynomialCoefficients) {
			NotificationChain msgs = null;
			if (polynomialCoefficients != null)
				msgs = ((InternalEObject) polynomialCoefficients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS,
						null, msgs);
			if (newPolynomialCoefficients != null)
				msgs = ((InternalEObject) newPolynomialCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS,
						null, msgs);
			msgs = basicSetPolynomialCoefficients(newPolynomialCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS,
					newPolynomialCoefficients, newPolynomialCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER:
			return basicSetMaxReynoldsNumber(null, msgs);
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR:
			return basicSetLaminarFormFactor(null, msgs);
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR:
			return basicSetTurbulentFormFactor(null, msgs);
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS:
			return basicSetPolynomialCoefficients(null, msgs);
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
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER:
			return getMaxReynoldsNumber();
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR:
			return getLaminarFormFactor();
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR:
			return getTurbulentFormFactor();
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS:
			return getPolynomialCoefficients();
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
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER:
			setMaxReynoldsNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR:
			setLaminarFormFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR:
			setTurbulentFormFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS:
			setPolynomialCoefficients((HandbookAeroPolynomialCoefficientsType) newValue);
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
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER:
			setMaxReynoldsNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR:
			setLaminarFormFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR:
			setTurbulentFormFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS:
			setPolynomialCoefficients((HandbookAeroPolynomialCoefficientsType) null);
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
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__MAX_REYNOLDS_NUMBER:
			return maxReynoldsNumber != null;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__LAMINAR_FORM_FACTOR:
			return laminarFormFactor != null;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__TURBULENT_FORM_FACTOR:
			return turbulentFormFactor != null;
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE__POLYNOMIAL_COEFFICIENTS:
			return polynomialCoefficients != null;
		}
		return super.eIsSet(featureID);
	}

} //HandbookAeroTransitionRegionTypeImpl
