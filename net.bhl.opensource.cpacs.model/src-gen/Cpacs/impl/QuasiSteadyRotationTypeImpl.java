/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.QuasiSteadyRotationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quasi Steady Rotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.QuasiSteadyRotationTypeImpl#getPstar <em>Pstar</em>}</li>
 *   <li>{@link Cpacs.impl.QuasiSteadyRotationTypeImpl#getQstar <em>Qstar</em>}</li>
 *   <li>{@link Cpacs.impl.QuasiSteadyRotationTypeImpl#getRstar <em>Rstar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuasiSteadyRotationTypeImpl extends ComplexBaseTypeImpl implements QuasiSteadyRotationType {
	/**
	 * The cached value of the '{@link #getPstar() <em>Pstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPstar()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType pstar;

	/**
	 * The cached value of the '{@link #getQstar() <em>Qstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQstar()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType qstar;

	/**
	 * The cached value of the '{@link #getRstar() <em>Rstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRstar()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rstar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuasiSteadyRotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getQuasiSteadyRotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPstar() {
		return pstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPstar(DoubleBaseType newPstar, NotificationChain msgs) {
		DoubleBaseType oldPstar = pstar;
		pstar = newPstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR, oldPstar, newPstar);
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
	public void setPstar(DoubleBaseType newPstar) {
		if (newPstar != pstar) {
			NotificationChain msgs = null;
			if (pstar != null)
				msgs = ((InternalEObject) pstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR, null, msgs);
			if (newPstar != null)
				msgs = ((InternalEObject) newPstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR, null, msgs);
			msgs = basicSetPstar(newPstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR,
					newPstar, newPstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQstar() {
		return qstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQstar(DoubleBaseType newQstar, NotificationChain msgs) {
		DoubleBaseType oldQstar = qstar;
		qstar = newQstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR, oldQstar, newQstar);
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
	public void setQstar(DoubleBaseType newQstar) {
		if (newQstar != qstar) {
			NotificationChain msgs = null;
			if (qstar != null)
				msgs = ((InternalEObject) qstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR, null, msgs);
			if (newQstar != null)
				msgs = ((InternalEObject) newQstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR, null, msgs);
			msgs = basicSetQstar(newQstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR,
					newQstar, newQstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRstar() {
		return rstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRstar(DoubleBaseType newRstar, NotificationChain msgs) {
		DoubleBaseType oldRstar = rstar;
		rstar = newRstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR, oldRstar, newRstar);
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
	public void setRstar(DoubleBaseType newRstar) {
		if (newRstar != rstar) {
			NotificationChain msgs = null;
			if (rstar != null)
				msgs = ((InternalEObject) rstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR, null, msgs);
			if (newRstar != null)
				msgs = ((InternalEObject) newRstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR, null, msgs);
			msgs = basicSetRstar(newRstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR,
					newRstar, newRstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR:
			return basicSetPstar(null, msgs);
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR:
			return basicSetQstar(null, msgs);
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR:
			return basicSetRstar(null, msgs);
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
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR:
			return getPstar();
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR:
			return getQstar();
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR:
			return getRstar();
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
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR:
			setPstar((DoubleBaseType) newValue);
			return;
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR:
			setQstar((DoubleBaseType) newValue);
			return;
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR:
			setRstar((DoubleBaseType) newValue);
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
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR:
			setPstar((DoubleBaseType) null);
			return;
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR:
			setQstar((DoubleBaseType) null);
			return;
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR:
			setRstar((DoubleBaseType) null);
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
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__PSTAR:
			return pstar != null;
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__QSTAR:
			return qstar != null;
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE__RSTAR:
			return rstar != null;
		}
		return super.eIsSet(featureID);
	}

} //QuasiSteadyRotationTypeImpl
