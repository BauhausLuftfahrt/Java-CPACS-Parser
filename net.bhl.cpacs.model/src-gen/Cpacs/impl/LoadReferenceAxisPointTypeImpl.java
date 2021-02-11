/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EtaXsiRelHeightPointType;
import Cpacs.LoadReferenceAxisPointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Reference Axis Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadReferenceAxisPointTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferenceAxisPointTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferenceAxisPointTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferenceAxisPointTypeImpl#getRefPoint <em>Ref Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadReferenceAxisPointTypeImpl extends ComplexBaseTypeImpl implements LoadReferenceAxisPointType {
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
	 * The cached value of the '{@link #getRefPoint() <em>Ref Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPoint()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiRelHeightPointType refPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadReferenceAxisPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadReferenceAxisPointType();
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
					CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X, oldX, newX);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X, newX,
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
					CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y, oldY, newY);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y, newY,
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
					CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z, oldZ, newZ);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z, newZ,
					newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType getRefPoint() {
		return refPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefPoint(EtaXsiRelHeightPointType newRefPoint, NotificationChain msgs) {
		EtaXsiRelHeightPointType oldRefPoint = refPoint;
		refPoint = newRefPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT, oldRefPoint, newRefPoint);
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
	public void setRefPoint(EtaXsiRelHeightPointType newRefPoint) {
		if (newRefPoint != refPoint) {
			NotificationChain msgs = null;
			if (refPoint != null)
				msgs = ((InternalEObject) refPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT, null, msgs);
			if (newRefPoint != null)
				msgs = ((InternalEObject) newRefPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT, null, msgs);
			msgs = basicSetRefPoint(newRefPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT, newRefPoint, newRefPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT:
			return basicSetRefPoint(null, msgs);
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
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X:
			return getX();
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y:
			return getY();
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z:
			return getZ();
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT:
			return getRefPoint();
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
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y:
			setY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z:
			setZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT:
			setRefPoint((EtaXsiRelHeightPointType) newValue);
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
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y:
			setY((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z:
			setZ((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT:
			setRefPoint((EtaXsiRelHeightPointType) null);
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
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__X:
			return x != null;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Y:
			return y != null;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__Z:
			return z != null;
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE__REF_POINT:
			return refPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadReferenceAxisPointTypeImpl
