/**
 */
package Cpacs.impl;

import Cpacs.BooleanBaseType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.WheelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wheel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WheelTypeImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link Cpacs.impl.WheelTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.impl.WheelTypeImpl#getBraked <em>Braked</em>}</li>
 *   <li>{@link Cpacs.impl.WheelTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WheelTypeImpl extends ComplexBaseTypeImpl implements WheelType {
	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType radius;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType width;

	/**
	 * The cached value of the '{@link #getBraked() <em>Braked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBraked()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType braked;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WheelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWheelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadius(DoubleBaseType newRadius, NotificationChain msgs) {
		DoubleBaseType oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WHEEL_TYPE__RADIUS, oldRadius, newRadius);
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
	public void setRadius(DoubleBaseType newRadius) {
		if (newRadius != radius) {
			NotificationChain msgs = null;
			if (radius != null)
				msgs = ((InternalEObject) radius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WHEEL_TYPE__RADIUS, null, msgs);
			if (newRadius != null)
				msgs = ((InternalEObject) newRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WHEEL_TYPE__RADIUS, null, msgs);
			msgs = basicSetRadius(newRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WHEEL_TYPE__RADIUS, newRadius,
					newRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(DoubleBaseType newWidth, NotificationChain msgs) {
		DoubleBaseType oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WHEEL_TYPE__WIDTH, oldWidth, newWidth);
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
	public void setWidth(DoubleBaseType newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject) width).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WHEEL_TYPE__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WHEEL_TYPE__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WHEEL_TYPE__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getBraked() {
		return braked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBraked(BooleanBaseType newBraked, NotificationChain msgs) {
		BooleanBaseType oldBraked = braked;
		braked = newBraked;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WHEEL_TYPE__BRAKED, oldBraked, newBraked);
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
	public void setBraked(BooleanBaseType newBraked) {
		if (newBraked != braked) {
			NotificationChain msgs = null;
			if (braked != null)
				msgs = ((InternalEObject) braked).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WHEEL_TYPE__BRAKED, null, msgs);
			if (newBraked != null)
				msgs = ((InternalEObject) newBraked).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WHEEL_TYPE__BRAKED, null, msgs);
			msgs = basicSetBraked(newBraked, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WHEEL_TYPE__BRAKED, newBraked,
					newBraked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WHEEL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WHEEL_TYPE__RADIUS:
			return basicSetRadius(null, msgs);
		case CpacsPackage.WHEEL_TYPE__WIDTH:
			return basicSetWidth(null, msgs);
		case CpacsPackage.WHEEL_TYPE__BRAKED:
			return basicSetBraked(null, msgs);
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
		case CpacsPackage.WHEEL_TYPE__RADIUS:
			return getRadius();
		case CpacsPackage.WHEEL_TYPE__WIDTH:
			return getWidth();
		case CpacsPackage.WHEEL_TYPE__BRAKED:
			return getBraked();
		case CpacsPackage.WHEEL_TYPE__UID:
			return getUID();
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
		case CpacsPackage.WHEEL_TYPE__RADIUS:
			setRadius((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WHEEL_TYPE__WIDTH:
			setWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WHEEL_TYPE__BRAKED:
			setBraked((BooleanBaseType) newValue);
			return;
		case CpacsPackage.WHEEL_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.WHEEL_TYPE__RADIUS:
			setRadius((DoubleBaseType) null);
			return;
		case CpacsPackage.WHEEL_TYPE__WIDTH:
			setWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.WHEEL_TYPE__BRAKED:
			setBraked((BooleanBaseType) null);
			return;
		case CpacsPackage.WHEEL_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.WHEEL_TYPE__RADIUS:
			return radius != null;
		case CpacsPackage.WHEEL_TYPE__WIDTH:
			return width != null;
		case CpacsPackage.WHEEL_TYPE__BRAKED:
			return braked != null;
		case CpacsPackage.WHEEL_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //WheelTypeImpl
