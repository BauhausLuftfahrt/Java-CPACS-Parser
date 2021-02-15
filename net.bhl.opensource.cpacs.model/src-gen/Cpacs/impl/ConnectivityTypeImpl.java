/**
 */
package Cpacs.impl;

import Cpacs.ConnectivityType;
import Cpacs.CpacsPackage;
import Cpacs.PointXYZType;
import Cpacs.StiffnessType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ConnectivityTypeImpl#getDamPoint1UID <em>Dam Point1 UID</em>}</li>
 *   <li>{@link Cpacs.impl.ConnectivityTypeImpl#getDamPoint2UID <em>Dam Point2 UID</em>}</li>
 *   <li>{@link Cpacs.impl.ConnectivityTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.ConnectivityTypeImpl#getStiffness <em>Stiffness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityTypeImpl extends ComplexBaseTypeImpl implements ConnectivityType {
	/**
	 * The cached value of the '{@link #getDamPoint1UID() <em>Dam Point1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamPoint1UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType damPoint1UID;

	/**
	 * The cached value of the '{@link #getDamPoint2UID() <em>Dam Point2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamPoint2UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType damPoint2UID;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType rotation;

	/**
	 * The cached value of the '{@link #getStiffness() <em>Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStiffness()
	 * @generated
	 * @ordered
	 */
	protected StiffnessType stiffness;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getConnectivityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getDamPoint1UID() {
		return damPoint1UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDamPoint1UID(StringUIDBaseType newDamPoint1UID, NotificationChain msgs) {
		StringUIDBaseType oldDamPoint1UID = damPoint1UID;
		damPoint1UID = newDamPoint1UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID, oldDamPoint1UID, newDamPoint1UID);
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
	public void setDamPoint1UID(StringUIDBaseType newDamPoint1UID) {
		if (newDamPoint1UID != damPoint1UID) {
			NotificationChain msgs = null;
			if (damPoint1UID != null)
				msgs = ((InternalEObject) damPoint1UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID, null, msgs);
			if (newDamPoint1UID != null)
				msgs = ((InternalEObject) newDamPoint1UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID, null, msgs);
			msgs = basicSetDamPoint1UID(newDamPoint1UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID,
					newDamPoint1UID, newDamPoint1UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getDamPoint2UID() {
		return damPoint2UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDamPoint2UID(StringUIDBaseType newDamPoint2UID, NotificationChain msgs) {
		StringUIDBaseType oldDamPoint2UID = damPoint2UID;
		damPoint2UID = newDamPoint2UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID, oldDamPoint2UID, newDamPoint2UID);
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
	public void setDamPoint2UID(StringUIDBaseType newDamPoint2UID) {
		if (newDamPoint2UID != damPoint2UID) {
			NotificationChain msgs = null;
			if (damPoint2UID != null)
				msgs = ((InternalEObject) damPoint2UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID, null, msgs);
			if (newDamPoint2UID != null)
				msgs = ((InternalEObject) newDamPoint2UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID, null, msgs);
			msgs = basicSetDamPoint2UID(newDamPoint2UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID,
					newDamPoint2UID, newDamPoint2UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(PointXYZType newRotation, NotificationChain msgs) {
		PointXYZType oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONNECTIVITY_TYPE__ROTATION, oldRotation, newRotation);
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
	public void setRotation(PointXYZType newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONNECTIVITY_TYPE__ROTATION, newRotation,
					newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StiffnessType getStiffness() {
		return stiffness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStiffness(StiffnessType newStiffness, NotificationChain msgs) {
		StiffnessType oldStiffness = stiffness;
		stiffness = newStiffness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS, oldStiffness, newStiffness);
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
	public void setStiffness(StiffnessType newStiffness) {
		if (newStiffness != stiffness) {
			NotificationChain msgs = null;
			if (stiffness != null)
				msgs = ((InternalEObject) stiffness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS, null, msgs);
			if (newStiffness != null)
				msgs = ((InternalEObject) newStiffness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS, null, msgs);
			msgs = basicSetStiffness(newStiffness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS,
					newStiffness, newStiffness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID:
			return basicSetDamPoint1UID(null, msgs);
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID:
			return basicSetDamPoint2UID(null, msgs);
		case CpacsPackage.CONNECTIVITY_TYPE__ROTATION:
			return basicSetRotation(null, msgs);
		case CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS:
			return basicSetStiffness(null, msgs);
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
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID:
			return getDamPoint1UID();
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID:
			return getDamPoint2UID();
		case CpacsPackage.CONNECTIVITY_TYPE__ROTATION:
			return getRotation();
		case CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS:
			return getStiffness();
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
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID:
			setDamPoint1UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID:
			setDamPoint2UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONNECTIVITY_TYPE__ROTATION:
			setRotation((PointXYZType) newValue);
			return;
		case CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS:
			setStiffness((StiffnessType) newValue);
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
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID:
			setDamPoint1UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID:
			setDamPoint2UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONNECTIVITY_TYPE__ROTATION:
			setRotation((PointXYZType) null);
			return;
		case CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS:
			setStiffness((StiffnessType) null);
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
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT1_UID:
			return damPoint1UID != null;
		case CpacsPackage.CONNECTIVITY_TYPE__DAM_POINT2_UID:
			return damPoint2UID != null;
		case CpacsPackage.CONNECTIVITY_TYPE__ROTATION:
			return rotation != null;
		case CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS:
			return stiffness != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectivityTypeImpl
