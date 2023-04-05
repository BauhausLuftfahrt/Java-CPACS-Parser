/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.NameType;
import Cpacs.TrackJointCoordinatesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Joint Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrackJointCoordinatesTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.TrackJointCoordinatesTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.TrackJointCoordinatesTypeImpl#getDy <em>Dy</em>}</li>
 *   <li>{@link Cpacs.impl.TrackJointCoordinatesTypeImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackJointCoordinatesTypeImpl extends ComplexBaseTypeImpl implements TrackJointCoordinatesType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name;

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
	 * The cached value of the '{@link #getDy() <em>Dy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType dy;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackJointCoordinatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrackJointCoordinatesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		NameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME, oldName, newName);
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
	public void setName(NameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME,
					newName, newName));
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
					CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X, oldX, newX);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X, newX,
					newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDy() {
		return dy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDy(DoubleBaseType newDy, NotificationChain msgs) {
		DoubleBaseType oldDy = dy;
		dy = newDy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY, oldDy, newDy);
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
	public void setDy(DoubleBaseType newDy) {
		if (newDy != dy) {
			NotificationChain msgs = null;
			if (dy != null)
				msgs = ((InternalEObject) dy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY, null, msgs);
			if (newDy != null)
				msgs = ((InternalEObject) newDy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY, null, msgs);
			msgs = basicSetDy(newDy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY, newDy,
					newDy));
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
					CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z, oldZ, newZ);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z, newZ,
					newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY:
			return basicSetDy(null, msgs);
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z:
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
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME:
			return getName();
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X:
			return getX();
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY:
			return getDy();
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z:
			return getZ();
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
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME:
			setName((NameType) newValue);
			return;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY:
			setDy((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z:
			setZ((DoubleBaseType) newValue);
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
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME:
			setName((NameType) null);
			return;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY:
			setDy((DoubleBaseType) null);
			return;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z:
			setZ((DoubleBaseType) null);
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
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__NAME:
			return name != null;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__X:
			return x != null;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__DY:
			return dy != null;
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE__Z:
			return z != null;
		}
		return super.eIsSet(featureID);
	}

} //TrackJointCoordinatesTypeImpl
