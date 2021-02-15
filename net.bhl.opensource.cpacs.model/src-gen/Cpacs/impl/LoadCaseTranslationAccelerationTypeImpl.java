/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LoadCaseTranslationAccelerationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Translation Acceleration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationAccelerationTypeImpl#getUDot <em>UDot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationAccelerationTypeImpl#getVDot <em>VDot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationAccelerationTypeImpl#getWDot <em>WDot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationAccelerationTypeImpl#getXDotDot <em>XDot Dot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationAccelerationTypeImpl#getYDotDot <em>YDot Dot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationAccelerationTypeImpl#getZDotDot <em>ZDot Dot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseTranslationAccelerationTypeImpl extends ComplexBaseTypeImpl
		implements LoadCaseTranslationAccelerationType {
	/**
	 * The cached value of the '{@link #getUDot() <em>UDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType uDot;

	/**
	 * The cached value of the '{@link #getVDot() <em>VDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vDot;

	/**
	 * The cached value of the '{@link #getWDot() <em>WDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType wDot;

	/**
	 * The cached value of the '{@link #getXDotDot() <em>XDot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDotDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xDotDot;

	/**
	 * The cached value of the '{@link #getYDotDot() <em>YDot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDotDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType yDotDot;

	/**
	 * The cached value of the '{@link #getZDotDot() <em>ZDot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDotDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType zDotDot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseTranslationAccelerationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseTranslationAccelerationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getUDot() {
		return uDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUDot(DoubleBaseType newUDot, NotificationChain msgs) {
		DoubleBaseType oldUDot = uDot;
		uDot = newUDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT, oldUDot, newUDot);
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
	public void setUDot(DoubleBaseType newUDot) {
		if (newUDot != uDot) {
			NotificationChain msgs = null;
			if (uDot != null)
				msgs = ((InternalEObject) uDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT, null,
						msgs);
			if (newUDot != null)
				msgs = ((InternalEObject) newUDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT, null,
						msgs);
			msgs = basicSetUDot(newUDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT, newUDot, newUDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVDot() {
		return vDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVDot(DoubleBaseType newVDot, NotificationChain msgs) {
		DoubleBaseType oldVDot = vDot;
		vDot = newVDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT, oldVDot, newVDot);
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
	public void setVDot(DoubleBaseType newVDot) {
		if (newVDot != vDot) {
			NotificationChain msgs = null;
			if (vDot != null)
				msgs = ((InternalEObject) vDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT, null,
						msgs);
			if (newVDot != null)
				msgs = ((InternalEObject) newVDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT, null,
						msgs);
			msgs = basicSetVDot(newVDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT, newVDot, newVDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getWDot() {
		return wDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWDot(DoubleBaseType newWDot, NotificationChain msgs) {
		DoubleBaseType oldWDot = wDot;
		wDot = newWDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT, oldWDot, newWDot);
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
	public void setWDot(DoubleBaseType newWDot) {
		if (newWDot != wDot) {
			NotificationChain msgs = null;
			if (wDot != null)
				msgs = ((InternalEObject) wDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT, null,
						msgs);
			if (newWDot != null)
				msgs = ((InternalEObject) newWDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT, null,
						msgs);
			msgs = basicSetWDot(newWDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT, newWDot, newWDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXDotDot() {
		return xDotDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXDotDot(DoubleBaseType newXDotDot, NotificationChain msgs) {
		DoubleBaseType oldXDotDot = xDotDot;
		xDotDot = newXDotDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT, oldXDotDot, newXDotDot);
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
	public void setXDotDot(DoubleBaseType newXDotDot) {
		if (newXDotDot != xDotDot) {
			NotificationChain msgs = null;
			if (xDotDot != null)
				msgs = ((InternalEObject) xDotDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT, null,
						msgs);
			if (newXDotDot != null)
				msgs = ((InternalEObject) newXDotDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT, null,
						msgs);
			msgs = basicSetXDotDot(newXDotDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT, newXDotDot, newXDotDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getYDotDot() {
		return yDotDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYDotDot(DoubleBaseType newYDotDot, NotificationChain msgs) {
		DoubleBaseType oldYDotDot = yDotDot;
		yDotDot = newYDotDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT, oldYDotDot, newYDotDot);
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
	public void setYDotDot(DoubleBaseType newYDotDot) {
		if (newYDotDot != yDotDot) {
			NotificationChain msgs = null;
			if (yDotDot != null)
				msgs = ((InternalEObject) yDotDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT, null,
						msgs);
			if (newYDotDot != null)
				msgs = ((InternalEObject) newYDotDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT, null,
						msgs);
			msgs = basicSetYDotDot(newYDotDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT, newYDotDot, newYDotDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getZDotDot() {
		return zDotDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZDotDot(DoubleBaseType newZDotDot, NotificationChain msgs) {
		DoubleBaseType oldZDotDot = zDotDot;
		zDotDot = newZDotDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT, oldZDotDot, newZDotDot);
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
	public void setZDotDot(DoubleBaseType newZDotDot) {
		if (newZDotDot != zDotDot) {
			NotificationChain msgs = null;
			if (zDotDot != null)
				msgs = ((InternalEObject) zDotDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT, null,
						msgs);
			if (newZDotDot != null)
				msgs = ((InternalEObject) newZDotDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT, null,
						msgs);
			msgs = basicSetZDotDot(newZDotDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT, newZDotDot, newZDotDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT:
			return basicSetUDot(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT:
			return basicSetVDot(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT:
			return basicSetWDot(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT:
			return basicSetXDotDot(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT:
			return basicSetYDotDot(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT:
			return basicSetZDotDot(null, msgs);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT:
			return getUDot();
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT:
			return getVDot();
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT:
			return getWDot();
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT:
			return getXDotDot();
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT:
			return getYDotDot();
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT:
			return getZDotDot();
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT:
			setUDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT:
			setVDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT:
			setWDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT:
			setXDotDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT:
			setYDotDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT:
			setZDotDot((DoubleBaseType) newValue);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT:
			setUDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT:
			setVDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT:
			setWDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT:
			setXDotDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT:
			setYDotDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT:
			setZDotDot((DoubleBaseType) null);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__UDOT:
			return uDot != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__VDOT:
			return vDot != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__WDOT:
			return wDot != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__XDOT_DOT:
			return xDotDot != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__YDOT_DOT:
			return yDotDot != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE__ZDOT_DOT:
			return zDotDot != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseTranslationAccelerationTypeImpl
