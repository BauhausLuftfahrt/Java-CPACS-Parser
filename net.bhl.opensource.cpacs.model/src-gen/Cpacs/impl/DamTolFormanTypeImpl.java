/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DamTolFormanType;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dam Tol Forman Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DamTolFormanTypeImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link Cpacs.impl.DamTolFormanTypeImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link Cpacs.impl.DamTolFormanTypeImpl#getM2 <em>M2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DamTolFormanTypeImpl extends ComplexBaseTypeImpl implements DamTolFormanType {
	/**
	 * The cached value of the '{@link #getKc() <em>Kc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKc()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kc;

	/**
	 * The cached value of the '{@link #getC2() <em>C2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c2;

	/**
	 * The cached value of the '{@link #getM2() <em>M2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType m2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DamTolFormanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDamTolFormanType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKc() {
		return kc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKc(DoubleBaseType newKc, NotificationChain msgs) {
		DoubleBaseType oldKc = kc;
		kc = newKc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_FORMAN_TYPE__KC, oldKc, newKc);
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
	public void setKc(DoubleBaseType newKc) {
		if (newKc != kc) {
			NotificationChain msgs = null;
			if (kc != null)
				msgs = ((InternalEObject) kc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_FORMAN_TYPE__KC, null, msgs);
			if (newKc != null)
				msgs = ((InternalEObject) newKc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_FORMAN_TYPE__KC, null, msgs);
			msgs = basicSetKc(newKc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAM_TOL_FORMAN_TYPE__KC, newKc, newKc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC2() {
		return c2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC2(DoubleBaseType newC2, NotificationChain msgs) {
		DoubleBaseType oldC2 = c2;
		c2 = newC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_FORMAN_TYPE__C2, oldC2, newC2);
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
	public void setC2(DoubleBaseType newC2) {
		if (newC2 != c2) {
			NotificationChain msgs = null;
			if (c2 != null)
				msgs = ((InternalEObject) c2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_FORMAN_TYPE__C2, null, msgs);
			if (newC2 != null)
				msgs = ((InternalEObject) newC2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_FORMAN_TYPE__C2, null, msgs);
			msgs = basicSetC2(newC2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAM_TOL_FORMAN_TYPE__C2, newC2, newC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getM2() {
		return m2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM2(DoubleBaseType newM2, NotificationChain msgs) {
		DoubleBaseType oldM2 = m2;
		m2 = newM2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_FORMAN_TYPE__M2, oldM2, newM2);
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
	public void setM2(DoubleBaseType newM2) {
		if (newM2 != m2) {
			NotificationChain msgs = null;
			if (m2 != null)
				msgs = ((InternalEObject) m2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_FORMAN_TYPE__M2, null, msgs);
			if (newM2 != null)
				msgs = ((InternalEObject) newM2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_FORMAN_TYPE__M2, null, msgs);
			msgs = basicSetM2(newM2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAM_TOL_FORMAN_TYPE__M2, newM2, newM2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__KC:
			return basicSetKc(null, msgs);
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__C2:
			return basicSetC2(null, msgs);
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__M2:
			return basicSetM2(null, msgs);
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
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__KC:
			return getKc();
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__C2:
			return getC2();
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__M2:
			return getM2();
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
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__KC:
			setKc((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__C2:
			setC2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__M2:
			setM2((DoubleBaseType) newValue);
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
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__KC:
			setKc((DoubleBaseType) null);
			return;
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__C2:
			setC2((DoubleBaseType) null);
			return;
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__M2:
			setM2((DoubleBaseType) null);
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
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__KC:
			return kc != null;
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__C2:
			return c2 != null;
		case CpacsPackage.DAM_TOL_FORMAN_TYPE__M2:
			return m2 != null;
		}
		return super.eIsSet(featureID);
	}

} //DamTolFormanTypeImpl
