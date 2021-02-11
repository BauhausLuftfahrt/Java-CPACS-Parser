/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LoadCaseTranslationVelocityType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Translation Velocity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationVelocityTypeImpl#getU <em>U</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationVelocityTypeImpl#getV <em>V</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationVelocityTypeImpl#getW <em>W</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationVelocityTypeImpl#getXDot <em>XDot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationVelocityTypeImpl#getYDot <em>YDot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationVelocityTypeImpl#getZDot <em>ZDot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseTranslationVelocityTypeImpl extends ComplexBaseTypeImpl
		implements LoadCaseTranslationVelocityType {
	/**
	 * The cached value of the '{@link #getU() <em>U</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType u;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType v;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType w;

	/**
	 * The cached value of the '{@link #getXDot() <em>XDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xDot;

	/**
	 * The cached value of the '{@link #getYDot() <em>YDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType yDot;

	/**
	 * The cached value of the '{@link #getZDot() <em>ZDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType zDot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseTranslationVelocityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseTranslationVelocityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getU() {
		return u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetU(DoubleBaseType newU, NotificationChain msgs) {
		DoubleBaseType oldU = u;
		u = newU;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U, oldU, newU);
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
	public void setU(DoubleBaseType newU) {
		if (newU != u) {
			NotificationChain msgs = null;
			if (u != null)
				msgs = ((InternalEObject) u).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U, null, msgs);
			if (newU != null)
				msgs = ((InternalEObject) newU).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U, null, msgs);
			msgs = basicSetU(newU, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U,
					newU, newU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV(DoubleBaseType newV, NotificationChain msgs) {
		DoubleBaseType oldV = v;
		v = newV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V, oldV, newV);
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
	public void setV(DoubleBaseType newV) {
		if (newV != v) {
			NotificationChain msgs = null;
			if (v != null)
				msgs = ((InternalEObject) v).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V, null, msgs);
			if (newV != null)
				msgs = ((InternalEObject) newV).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V, null, msgs);
			msgs = basicSetV(newV, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V,
					newV, newV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getW() {
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetW(DoubleBaseType newW, NotificationChain msgs) {
		DoubleBaseType oldW = w;
		w = newW;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W, oldW, newW);
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
	public void setW(DoubleBaseType newW) {
		if (newW != w) {
			NotificationChain msgs = null;
			if (w != null)
				msgs = ((InternalEObject) w).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W, null, msgs);
			if (newW != null)
				msgs = ((InternalEObject) newW).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W, null, msgs);
			msgs = basicSetW(newW, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W,
					newW, newW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXDot() {
		return xDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXDot(DoubleBaseType newXDot, NotificationChain msgs) {
		DoubleBaseType oldXDot = xDot;
		xDot = newXDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT, oldXDot, newXDot);
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
	public void setXDot(DoubleBaseType newXDot) {
		if (newXDot != xDot) {
			NotificationChain msgs = null;
			if (xDot != null)
				msgs = ((InternalEObject) xDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT, null, msgs);
			if (newXDot != null)
				msgs = ((InternalEObject) newXDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT, null, msgs);
			msgs = basicSetXDot(newXDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT, newXDot, newXDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getYDot() {
		return yDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYDot(DoubleBaseType newYDot, NotificationChain msgs) {
		DoubleBaseType oldYDot = yDot;
		yDot = newYDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT, oldYDot, newYDot);
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
	public void setYDot(DoubleBaseType newYDot) {
		if (newYDot != yDot) {
			NotificationChain msgs = null;
			if (yDot != null)
				msgs = ((InternalEObject) yDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT, null, msgs);
			if (newYDot != null)
				msgs = ((InternalEObject) newYDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT, null, msgs);
			msgs = basicSetYDot(newYDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT, newYDot, newYDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getZDot() {
		return zDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZDot(DoubleBaseType newZDot, NotificationChain msgs) {
		DoubleBaseType oldZDot = zDot;
		zDot = newZDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT, oldZDot, newZDot);
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
	public void setZDot(DoubleBaseType newZDot) {
		if (newZDot != zDot) {
			NotificationChain msgs = null;
			if (zDot != null)
				msgs = ((InternalEObject) zDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT, null, msgs);
			if (newZDot != null)
				msgs = ((InternalEObject) newZDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT, null, msgs);
			msgs = basicSetZDot(newZDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT, newZDot, newZDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U:
			return basicSetU(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V:
			return basicSetV(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W:
			return basicSetW(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT:
			return basicSetXDot(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT:
			return basicSetYDot(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT:
			return basicSetZDot(null, msgs);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U:
			return getU();
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V:
			return getV();
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W:
			return getW();
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT:
			return getXDot();
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT:
			return getYDot();
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT:
			return getZDot();
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U:
			setU((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V:
			setV((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W:
			setW((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT:
			setXDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT:
			setYDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT:
			setZDot((DoubleBaseType) newValue);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U:
			setU((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V:
			setV((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W:
			setW((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT:
			setXDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT:
			setYDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT:
			setZDot((DoubleBaseType) null);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__U:
			return u != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__V:
			return v != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__W:
			return w != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__XDOT:
			return xDot != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__YDOT:
			return yDot != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE__ZDOT:
			return zDot != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseTranslationVelocityTypeImpl
