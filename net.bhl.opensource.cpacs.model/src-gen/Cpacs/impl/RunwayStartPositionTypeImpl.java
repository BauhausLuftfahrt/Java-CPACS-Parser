/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RunwayStartPositionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runway Start Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RunwayStartPositionTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayStartPositionTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayStartPositionTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayStartPositionTypeImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayStartPositionTypeImpl#getLateralOffset <em>Lateral Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunwayStartPositionTypeImpl extends ComplexBaseTypeImpl implements RunwayStartPositionType {
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
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType y;

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
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType distance;

	/**
	 * The cached value of the '{@link #getLateralOffset() <em>Lateral Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateralOffset()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType lateralOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunwayStartPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRunwayStartPositionType();
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
					CpacsPackage.RUNWAY_START_POSITION_TYPE__X, oldX, newX);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_START_POSITION_TYPE__X, newX,
					newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(DoubleBaseType newY, NotificationChain msgs) {
		DoubleBaseType oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_START_POSITION_TYPE__Y, oldY, newY);
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
	public void setY(DoubleBaseType newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject) y).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_START_POSITION_TYPE__Y, newY,
					newY));
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
					CpacsPackage.RUNWAY_START_POSITION_TYPE__Z, oldZ, newZ);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_START_POSITION_TYPE__Z, newZ,
					newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(DoubleBaseType newDistance, NotificationChain msgs) {
		DoubleBaseType oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE, oldDistance, newDistance);
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
	public void setDistance(DoubleBaseType newDistance) {
		if (newDistance != distance) {
			NotificationChain msgs = null;
			if (distance != null)
				msgs = ((InternalEObject) distance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE, null, msgs);
			if (newDistance != null)
				msgs = ((InternalEObject) newDistance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE, null, msgs);
			msgs = basicSetDistance(newDistance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE,
					newDistance, newDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLateralOffset() {
		return lateralOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLateralOffset(DoubleBaseType newLateralOffset, NotificationChain msgs) {
		DoubleBaseType oldLateralOffset = lateralOffset;
		lateralOffset = newLateralOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET, oldLateralOffset, newLateralOffset);
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
	public void setLateralOffset(DoubleBaseType newLateralOffset) {
		if (newLateralOffset != lateralOffset) {
			NotificationChain msgs = null;
			if (lateralOffset != null)
				msgs = ((InternalEObject) lateralOffset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET, null, msgs);
			if (newLateralOffset != null)
				msgs = ((InternalEObject) newLateralOffset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET, null, msgs);
			msgs = basicSetLateralOffset(newLateralOffset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET, newLateralOffset, newLateralOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE:
			return basicSetDistance(null, msgs);
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET:
			return basicSetLateralOffset(null, msgs);
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
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__X:
			return getX();
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Y:
			return getY();
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Z:
			return getZ();
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE:
			return getDistance();
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET:
			return getLateralOffset();
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
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Y:
			setY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Z:
			setZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE:
			setDistance((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET:
			setLateralOffset((DoubleBaseType) newValue);
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
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Y:
			setY((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Z:
			setZ((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE:
			setDistance((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET:
			setLateralOffset((DoubleBaseType) null);
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
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__X:
			return x != null;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Y:
			return y != null;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__Z:
			return z != null;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__DISTANCE:
			return distance != null;
		case CpacsPackage.RUNWAY_START_POSITION_TYPE__LATERAL_OFFSET:
			return lateralOffset != null;
		}
		return super.eIsSet(featureID);
	}

} //RunwayStartPositionTypeImpl
