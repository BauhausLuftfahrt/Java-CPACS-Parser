/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutLoadPointsType;
import Cpacs.DoubleVectorBaseType;
import Cpacs.PosIntVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cut Load Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CutLoadPointsTypeImpl#getPointIDs <em>Point IDs</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadPointsTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadPointsTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadPointsTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadPointsTypeImpl#getOrientationX <em>Orientation X</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadPointsTypeImpl#getOrientationY <em>Orientation Y</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadPointsTypeImpl#getOrientationZ <em>Orientation Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CutLoadPointsTypeImpl extends ComplexBaseTypeImpl implements CutLoadPointsType {
	/**
	 * The cached value of the '{@link #getPointIDs() <em>Point IDs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointIDs()
	 * @generated
	 * @ordered
	 */
	protected PosIntVectorBaseType pointIDs;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType x;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType y;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType z;

	/**
	 * The cached value of the '{@link #getOrientationX() <em>Orientation X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationX()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType orientationX;

	/**
	 * The cached value of the '{@link #getOrientationY() <em>Orientation Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationY()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType orientationY;

	/**
	 * The cached value of the '{@link #getOrientationZ() <em>Orientation Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType orientationZ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CutLoadPointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCutLoadPointsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosIntVectorBaseType getPointIDs() {
		return pointIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointIDs(PosIntVectorBaseType newPointIDs, NotificationChain msgs) {
		PosIntVectorBaseType oldPointIDs = pointIDs;
		pointIDs = newPointIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS, oldPointIDs, newPointIDs);
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
	public void setPointIDs(PosIntVectorBaseType newPointIDs) {
		if (newPointIDs != pointIDs) {
			NotificationChain msgs = null;
			if (pointIDs != null)
				msgs = ((InternalEObject) pointIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS, null, msgs);
			if (newPointIDs != null)
				msgs = ((InternalEObject) newPointIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS, null, msgs);
			msgs = basicSetPointIDs(newPointIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS,
					newPointIDs, newPointIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(DoubleVectorBaseType newX, NotificationChain msgs) {
		DoubleVectorBaseType oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_POINTS_TYPE__X, oldX, newX);
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
	public void setX(DoubleVectorBaseType newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_POINTS_TYPE__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(DoubleVectorBaseType newY, NotificationChain msgs) {
		DoubleVectorBaseType oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_POINTS_TYPE__Y, oldY, newY);
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
	public void setY(DoubleVectorBaseType newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject) y).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_POINTS_TYPE__Y, newY, newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(DoubleVectorBaseType newZ, NotificationChain msgs) {
		DoubleVectorBaseType oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_POINTS_TYPE__Z, oldZ, newZ);
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
	public void setZ(DoubleVectorBaseType newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject) z).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_POINTS_TYPE__Z, newZ, newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getOrientationX() {
		return orientationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationX(DoubleVectorBaseType newOrientationX, NotificationChain msgs) {
		DoubleVectorBaseType oldOrientationX = orientationX;
		orientationX = newOrientationX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X, oldOrientationX, newOrientationX);
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
	public void setOrientationX(DoubleVectorBaseType newOrientationX) {
		if (newOrientationX != orientationX) {
			NotificationChain msgs = null;
			if (orientationX != null)
				msgs = ((InternalEObject) orientationX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X, null, msgs);
			if (newOrientationX != null)
				msgs = ((InternalEObject) newOrientationX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X, null, msgs);
			msgs = basicSetOrientationX(newOrientationX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X,
					newOrientationX, newOrientationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getOrientationY() {
		return orientationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationY(DoubleVectorBaseType newOrientationY, NotificationChain msgs) {
		DoubleVectorBaseType oldOrientationY = orientationY;
		orientationY = newOrientationY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y, oldOrientationY, newOrientationY);
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
	public void setOrientationY(DoubleVectorBaseType newOrientationY) {
		if (newOrientationY != orientationY) {
			NotificationChain msgs = null;
			if (orientationY != null)
				msgs = ((InternalEObject) orientationY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y, null, msgs);
			if (newOrientationY != null)
				msgs = ((InternalEObject) newOrientationY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y, null, msgs);
			msgs = basicSetOrientationY(newOrientationY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y,
					newOrientationY, newOrientationY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getOrientationZ() {
		return orientationZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationZ(DoubleVectorBaseType newOrientationZ, NotificationChain msgs) {
		DoubleVectorBaseType oldOrientationZ = orientationZ;
		orientationZ = newOrientationZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z, oldOrientationZ, newOrientationZ);
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
	public void setOrientationZ(DoubleVectorBaseType newOrientationZ) {
		if (newOrientationZ != orientationZ) {
			NotificationChain msgs = null;
			if (orientationZ != null)
				msgs = ((InternalEObject) orientationZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z, null, msgs);
			if (newOrientationZ != null)
				msgs = ((InternalEObject) newOrientationZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z, null, msgs);
			msgs = basicSetOrientationZ(newOrientationZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z,
					newOrientationZ, newOrientationZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS:
			return basicSetPointIDs(null, msgs);
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X:
			return basicSetOrientationX(null, msgs);
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y:
			return basicSetOrientationY(null, msgs);
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z:
			return basicSetOrientationZ(null, msgs);
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
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS:
			return getPointIDs();
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__X:
			return getX();
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Y:
			return getY();
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Z:
			return getZ();
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X:
			return getOrientationX();
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y:
			return getOrientationY();
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z:
			return getOrientationZ();
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
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS:
			setPointIDs((PosIntVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__X:
			setX((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Y:
			setY((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Z:
			setZ((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X:
			setOrientationX((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y:
			setOrientationY((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z:
			setOrientationZ((DoubleVectorBaseType) newValue);
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
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS:
			setPointIDs((PosIntVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__X:
			setX((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Y:
			setY((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Z:
			setZ((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X:
			setOrientationX((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y:
			setOrientationY((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z:
			setOrientationZ((DoubleVectorBaseType) null);
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
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__POINT_IDS:
			return pointIDs != null;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__X:
			return x != null;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Y:
			return y != null;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__Z:
			return z != null;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_X:
			return orientationX != null;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Y:
			return orientationY != null;
		case CpacsPackage.CUT_LOAD_POINTS_TYPE__ORIENTATION_Z:
			return orientationZ != null;
		}
		return super.eIsSet(featureID);
	}

} //CutLoadPointsTypeImpl
