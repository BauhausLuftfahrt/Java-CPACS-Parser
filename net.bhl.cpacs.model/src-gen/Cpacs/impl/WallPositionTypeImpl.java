/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WallPositionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WallPositionTypeImpl#getBulkheadUID <em>Bulkhead UID</em>}</li>
 *   <li>{@link Cpacs.impl.WallPositionTypeImpl#getWallSegmentUID <em>Wall Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.WallPositionTypeImpl#getFuselageSectionUID <em>Fuselage Section UID</em>}</li>
 *   <li>{@link Cpacs.impl.WallPositionTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.WallPositionTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.WallPositionTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.WallPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallPositionTypeImpl extends MinimalEObjectImpl.Container implements WallPositionType {
	/**
	 * The cached value of the '{@link #getBulkheadUID() <em>Bulkhead UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType bulkheadUID;

	/**
	 * The cached value of the '{@link #getWallSegmentUID() <em>Wall Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType wallSegmentUID;

	/**
	 * The cached value of the '{@link #getFuselageSectionUID() <em>Fuselage Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageSectionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fuselageSectionUID;

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
	protected WallPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWallPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getBulkheadUID() {
		return bulkheadUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBulkheadUID(StringUIDBaseType newBulkheadUID, NotificationChain msgs) {
		StringUIDBaseType oldBulkheadUID = bulkheadUID;
		bulkheadUID = newBulkheadUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID, oldBulkheadUID, newBulkheadUID);
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
	public void setBulkheadUID(StringUIDBaseType newBulkheadUID) {
		if (newBulkheadUID != bulkheadUID) {
			NotificationChain msgs = null;
			if (bulkheadUID != null)
				msgs = ((InternalEObject) bulkheadUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID, null, msgs);
			if (newBulkheadUID != null)
				msgs = ((InternalEObject) newBulkheadUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID, null, msgs);
			msgs = basicSetBulkheadUID(newBulkheadUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID,
					newBulkheadUID, newBulkheadUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getWallSegmentUID() {
		return wallSegmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWallSegmentUID(StringUIDBaseType newWallSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldWallSegmentUID = wallSegmentUID;
		wallSegmentUID = newWallSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID, oldWallSegmentUID, newWallSegmentUID);
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
	public void setWallSegmentUID(StringUIDBaseType newWallSegmentUID) {
		if (newWallSegmentUID != wallSegmentUID) {
			NotificationChain msgs = null;
			if (wallSegmentUID != null)
				msgs = ((InternalEObject) wallSegmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID, null, msgs);
			if (newWallSegmentUID != null)
				msgs = ((InternalEObject) newWallSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID, null, msgs);
			msgs = basicSetWallSegmentUID(newWallSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID,
					newWallSegmentUID, newWallSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFuselageSectionUID() {
		return fuselageSectionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselageSectionUID(StringUIDBaseType newFuselageSectionUID,
			NotificationChain msgs) {
		StringUIDBaseType oldFuselageSectionUID = fuselageSectionUID;
		fuselageSectionUID = newFuselageSectionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID, oldFuselageSectionUID,
					newFuselageSectionUID);
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
	public void setFuselageSectionUID(StringUIDBaseType newFuselageSectionUID) {
		if (newFuselageSectionUID != fuselageSectionUID) {
			NotificationChain msgs = null;
			if (fuselageSectionUID != null)
				msgs = ((InternalEObject) fuselageSectionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID, null, msgs);
			if (newFuselageSectionUID != null)
				msgs = ((InternalEObject) newFuselageSectionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID, null, msgs);
			msgs = basicSetFuselageSectionUID(newFuselageSectionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID,
					newFuselageSectionUID, newFuselageSectionUID));
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
					CpacsPackage.WALL_POSITION_TYPE__X, oldX, newX);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_POSITION_TYPE__X, newX, newX));
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
					CpacsPackage.WALL_POSITION_TYPE__Y, oldY, newY);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_POSITION_TYPE__Y, newY, newY));
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
					CpacsPackage.WALL_POSITION_TYPE__Z, oldZ, newZ);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_POSITION_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_POSITION_TYPE__Z, newZ, newZ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_POSITION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID:
			return basicSetBulkheadUID(null, msgs);
		case CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID:
			return basicSetWallSegmentUID(null, msgs);
		case CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID:
			return basicSetFuselageSectionUID(null, msgs);
		case CpacsPackage.WALL_POSITION_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.WALL_POSITION_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.WALL_POSITION_TYPE__Z:
			return basicSetZ(null, msgs);
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
		case CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID:
			return getBulkheadUID();
		case CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID:
			return getWallSegmentUID();
		case CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID:
			return getFuselageSectionUID();
		case CpacsPackage.WALL_POSITION_TYPE__X:
			return getX();
		case CpacsPackage.WALL_POSITION_TYPE__Y:
			return getY();
		case CpacsPackage.WALL_POSITION_TYPE__Z:
			return getZ();
		case CpacsPackage.WALL_POSITION_TYPE__UID:
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
		case CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID:
			setBulkheadUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID:
			setWallSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID:
			setFuselageSectionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__Y:
			setY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__Z:
			setZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__UID:
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
		case CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID:
			setBulkheadUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID:
			setWallSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID:
			setFuselageSectionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__Y:
			setY((DoubleBaseType) null);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__Z:
			setZ((DoubleBaseType) null);
			return;
		case CpacsPackage.WALL_POSITION_TYPE__UID:
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
		case CpacsPackage.WALL_POSITION_TYPE__BULKHEAD_UID:
			return bulkheadUID != null;
		case CpacsPackage.WALL_POSITION_TYPE__WALL_SEGMENT_UID:
			return wallSegmentUID != null;
		case CpacsPackage.WALL_POSITION_TYPE__FUSELAGE_SECTION_UID:
			return fuselageSectionUID != null;
		case CpacsPackage.WALL_POSITION_TYPE__X:
			return x != null;
		case CpacsPackage.WALL_POSITION_TYPE__Y:
			return y != null;
		case CpacsPackage.WALL_POSITION_TYPE__Z:
			return z != null;
		case CpacsPackage.WALL_POSITION_TYPE__UID:
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

} //WallPositionTypeImpl
