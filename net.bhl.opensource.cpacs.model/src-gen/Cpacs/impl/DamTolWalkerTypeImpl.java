/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DamTolWalkerType;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dam Tol Walker Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DamTolWalkerTypeImpl#getKIc <em>KIc</em>}</li>
 *   <li>{@link Cpacs.impl.DamTolWalkerTypeImpl#getC0 <em>C0</em>}</li>
 *   <li>{@link Cpacs.impl.DamTolWalkerTypeImpl#getM <em>M</em>}</li>
 *   <li>{@link Cpacs.impl.DamTolWalkerTypeImpl#getGamma <em>Gamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DamTolWalkerTypeImpl extends ComplexBaseTypeImpl implements DamTolWalkerType {
	/**
	 * The cached value of the '{@link #getKIc() <em>KIc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKIc()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kIc;

	/**
	 * The cached value of the '{@link #getC0() <em>C0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC0()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c0;

	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType m;

	/**
	 * The cached value of the '{@link #getGamma() <em>Gamma</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DamTolWalkerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDamTolWalkerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKIc() {
		return kIc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKIc(DoubleBaseType newKIc, NotificationChain msgs) {
		DoubleBaseType oldKIc = kIc;
		kIc = newKIc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_WALKER_TYPE__KIC, oldKIc, newKIc);
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
	public void setKIc(DoubleBaseType newKIc) {
		if (newKIc != kIc) {
			NotificationChain msgs = null;
			if (kIc != null)
				msgs = ((InternalEObject) kIc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_WALKER_TYPE__KIC, null, msgs);
			if (newKIc != null)
				msgs = ((InternalEObject) newKIc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_WALKER_TYPE__KIC, null, msgs);
			msgs = basicSetKIc(newKIc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAM_TOL_WALKER_TYPE__KIC, newKIc,
					newKIc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC0() {
		return c0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC0(DoubleBaseType newC0, NotificationChain msgs) {
		DoubleBaseType oldC0 = c0;
		c0 = newC0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_WALKER_TYPE__C0, oldC0, newC0);
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
	public void setC0(DoubleBaseType newC0) {
		if (newC0 != c0) {
			NotificationChain msgs = null;
			if (c0 != null)
				msgs = ((InternalEObject) c0).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_WALKER_TYPE__C0, null, msgs);
			if (newC0 != null)
				msgs = ((InternalEObject) newC0).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_WALKER_TYPE__C0, null, msgs);
			msgs = basicSetC0(newC0, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAM_TOL_WALKER_TYPE__C0, newC0, newC0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getM() {
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM(DoubleBaseType newM, NotificationChain msgs) {
		DoubleBaseType oldM = m;
		m = newM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_WALKER_TYPE__M, oldM, newM);
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
	public void setM(DoubleBaseType newM) {
		if (newM != m) {
			NotificationChain msgs = null;
			if (m != null)
				msgs = ((InternalEObject) m).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_WALKER_TYPE__M, null, msgs);
			if (newM != null)
				msgs = ((InternalEObject) newM).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_WALKER_TYPE__M, null, msgs);
			msgs = basicSetM(newM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAM_TOL_WALKER_TYPE__M, newM, newM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGamma() {
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGamma(DoubleBaseType newGamma, NotificationChain msgs) {
		DoubleBaseType oldGamma = gamma;
		gamma = newGamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA, oldGamma, newGamma);
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
	public void setGamma(DoubleBaseType newGamma) {
		if (newGamma != gamma) {
			NotificationChain msgs = null;
			if (gamma != null)
				msgs = ((InternalEObject) gamma).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA, null, msgs);
			if (newGamma != null)
				msgs = ((InternalEObject) newGamma).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA, null, msgs);
			msgs = basicSetGamma(newGamma, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA, newGamma,
					newGamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DAM_TOL_WALKER_TYPE__KIC:
			return basicSetKIc(null, msgs);
		case CpacsPackage.DAM_TOL_WALKER_TYPE__C0:
			return basicSetC0(null, msgs);
		case CpacsPackage.DAM_TOL_WALKER_TYPE__M:
			return basicSetM(null, msgs);
		case CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA:
			return basicSetGamma(null, msgs);
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
		case CpacsPackage.DAM_TOL_WALKER_TYPE__KIC:
			return getKIc();
		case CpacsPackage.DAM_TOL_WALKER_TYPE__C0:
			return getC0();
		case CpacsPackage.DAM_TOL_WALKER_TYPE__M:
			return getM();
		case CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA:
			return getGamma();
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
		case CpacsPackage.DAM_TOL_WALKER_TYPE__KIC:
			setKIc((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__C0:
			setC0((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__M:
			setM((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA:
			setGamma((DoubleBaseType) newValue);
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
		case CpacsPackage.DAM_TOL_WALKER_TYPE__KIC:
			setKIc((DoubleBaseType) null);
			return;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__C0:
			setC0((DoubleBaseType) null);
			return;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__M:
			setM((DoubleBaseType) null);
			return;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA:
			setGamma((DoubleBaseType) null);
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
		case CpacsPackage.DAM_TOL_WALKER_TYPE__KIC:
			return kIc != null;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__C0:
			return c0 != null;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__M:
			return m != null;
		case CpacsPackage.DAM_TOL_WALKER_TYPE__GAMMA:
			return gamma != null;
		}
		return super.eIsSet(featureID);
	}

} //DamTolWalkerTypeImpl
