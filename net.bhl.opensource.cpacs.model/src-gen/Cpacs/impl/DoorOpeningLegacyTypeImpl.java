/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoorOpeningLegacyType;
import Cpacs.DoubleBaseType;
import Cpacs.SideType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Opening Legacy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DoorOpeningLegacyTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.DoorOpeningLegacyTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.DoorOpeningLegacyTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.impl.DoorOpeningLegacyTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.impl.DoorOpeningLegacyTypeImpl#getSide <em>Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorOpeningLegacyTypeImpl extends ComplexBaseTypeImpl implements DoorOpeningLegacyType {
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType x;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType z;

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
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType height;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected SideType side;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorOpeningLegacyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDoorOpeningLegacyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(DoubleBaseType newX, NotificationChain msgs) {
		DoubleBaseType oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X, oldX, newX);
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
	public void setX(DoubleBaseType newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X, newX,
					newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(DoubleBaseType newZ, NotificationChain msgs) {
		DoubleBaseType oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z, oldZ, newZ);
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
	public void setZ(DoubleBaseType newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject) z).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z, newZ,
					newZ));
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
					CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH, oldWidth, newWidth);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH,
					newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(DoubleBaseType newHeight, NotificationChain msgs) {
		DoubleBaseType oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT, oldHeight, newHeight);
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
	public void setHeight(DoubleBaseType newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject) height).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject) newHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT,
					newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SideType getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSide(SideType newSide, NotificationChain msgs) {
		SideType oldSide = side;
		side = newSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE, oldSide, newSide);
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
	public void setSide(SideType newSide) {
		if (newSide != side) {
			NotificationChain msgs = null;
			if (side != null)
				msgs = ((InternalEObject) side).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE, null, msgs);
			if (newSide != null)
				msgs = ((InternalEObject) newSide).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE, null, msgs);
			msgs = basicSetSide(newSide, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE, newSide,
					newSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH:
			return basicSetWidth(null, msgs);
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT:
			return basicSetHeight(null, msgs);
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE:
			return basicSetSide(null, msgs);
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
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X:
			return getX();
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z:
			return getZ();
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH:
			return getWidth();
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT:
			return getHeight();
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE:
			return getSide();
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
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z:
			setZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH:
			setWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT:
			setHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE:
			setSide((SideType) newValue);
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
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z:
			setZ((DoubleBaseType) null);
			return;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH:
			setWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT:
			setHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE:
			setSide((SideType) null);
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
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__X:
			return x != null;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__Z:
			return z != null;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__WIDTH:
			return width != null;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__HEIGHT:
			return height != null;
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE__SIDE:
			return side != null;
		}
		return super.eIsSet(featureID);
	}

} //DoorOpeningLegacyTypeImpl
