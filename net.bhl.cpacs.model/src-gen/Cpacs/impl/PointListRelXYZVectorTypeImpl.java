/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PointListRelXYZVectorType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point List Rel XYZ Vector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PointListRelXYZVectorTypeImpl#getRX <em>RX</em>}</li>
 *   <li>{@link Cpacs.impl.PointListRelXYZVectorTypeImpl#getRY <em>RY</em>}</li>
 *   <li>{@link Cpacs.impl.PointListRelXYZVectorTypeImpl#getRZ <em>RZ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointListRelXYZVectorTypeImpl extends ComplexBaseTypeImpl implements PointListRelXYZVectorType {
	/**
	 * The cached value of the '{@link #getRX() <em>RX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRX()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType rX;

	/**
	 * The cached value of the '{@link #getRY() <em>RY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRY()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType rY;

	/**
	 * The cached value of the '{@link #getRZ() <em>RZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRZ()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType rZ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointListRelXYZVectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPointListRelXYZVectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getRX() {
		return rX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRX(StringVectorBaseType newRX, NotificationChain msgs) {
		StringVectorBaseType oldRX = rX;
		rX = newRX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX, oldRX, newRX);
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
	public void setRX(StringVectorBaseType newRX) {
		if (newRX != rX) {
			NotificationChain msgs = null;
			if (rX != null)
				msgs = ((InternalEObject) rX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX, null, msgs);
			if (newRX != null)
				msgs = ((InternalEObject) newRX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX, null, msgs);
			msgs = basicSetRX(newRX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX,
					newRX, newRX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getRY() {
		return rY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRY(StringVectorBaseType newRY, NotificationChain msgs) {
		StringVectorBaseType oldRY = rY;
		rY = newRY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY, oldRY, newRY);
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
	public void setRY(StringVectorBaseType newRY) {
		if (newRY != rY) {
			NotificationChain msgs = null;
			if (rY != null)
				msgs = ((InternalEObject) rY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY, null, msgs);
			if (newRY != null)
				msgs = ((InternalEObject) newRY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY, null, msgs);
			msgs = basicSetRY(newRY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY,
					newRY, newRY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getRZ() {
		return rZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRZ(StringVectorBaseType newRZ, NotificationChain msgs) {
		StringVectorBaseType oldRZ = rZ;
		rZ = newRZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ, oldRZ, newRZ);
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
	public void setRZ(StringVectorBaseType newRZ) {
		if (newRZ != rZ) {
			NotificationChain msgs = null;
			if (rZ != null)
				msgs = ((InternalEObject) rZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ, null, msgs);
			if (newRZ != null)
				msgs = ((InternalEObject) newRZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ, null, msgs);
			msgs = basicSetRZ(newRZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ,
					newRZ, newRZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX:
			return basicSetRX(null, msgs);
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY:
			return basicSetRY(null, msgs);
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ:
			return basicSetRZ(null, msgs);
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
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX:
			return getRX();
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY:
			return getRY();
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ:
			return getRZ();
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
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX:
			setRX((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY:
			setRY((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ:
			setRZ((StringVectorBaseType) newValue);
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
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX:
			setRX((StringVectorBaseType) null);
			return;
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY:
			setRY((StringVectorBaseType) null);
			return;
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ:
			setRZ((StringVectorBaseType) null);
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
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RX:
			return rX != null;
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RY:
			return rY != null;
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE__RZ:
			return rZ != null;
		}
		return super.eIsSet(featureID);
	}

} //PointListRelXYZVectorTypeImpl
