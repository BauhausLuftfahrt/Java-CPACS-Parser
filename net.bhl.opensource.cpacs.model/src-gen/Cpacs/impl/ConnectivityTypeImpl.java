/**
 */
package Cpacs.impl;

import Cpacs.ConnectivityType;
import Cpacs.CpacsPackage;
import Cpacs.IntegerBaseType;
import Cpacs.PointXYZType;
import Cpacs.StiffnessType;

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
 *   <li>{@link Cpacs.impl.ConnectivityTypeImpl#getLoadAppPoint1ID <em>Load App Point1 ID</em>}</li>
 *   <li>{@link Cpacs.impl.ConnectivityTypeImpl#getLoadAppPoint2ID <em>Load App Point2 ID</em>}</li>
 *   <li>{@link Cpacs.impl.ConnectivityTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.ConnectivityTypeImpl#getStiffness <em>Stiffness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityTypeImpl extends ComplexBaseTypeImpl implements ConnectivityType {
	/**
	 * The cached value of the '{@link #getLoadAppPoint1ID() <em>Load App Point1 ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadAppPoint1ID()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType loadAppPoint1ID;

	/**
	 * The cached value of the '{@link #getLoadAppPoint2ID() <em>Load App Point2 ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadAppPoint2ID()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType loadAppPoint2ID;

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
	public IntegerBaseType getLoadAppPoint1ID() {
		return loadAppPoint1ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadAppPoint1ID(IntegerBaseType newLoadAppPoint1ID, NotificationChain msgs) {
		IntegerBaseType oldLoadAppPoint1ID = loadAppPoint1ID;
		loadAppPoint1ID = newLoadAppPoint1ID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID, oldLoadAppPoint1ID, newLoadAppPoint1ID);
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
	public void setLoadAppPoint1ID(IntegerBaseType newLoadAppPoint1ID) {
		if (newLoadAppPoint1ID != loadAppPoint1ID) {
			NotificationChain msgs = null;
			if (loadAppPoint1ID != null)
				msgs = ((InternalEObject) loadAppPoint1ID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID, null, msgs);
			if (newLoadAppPoint1ID != null)
				msgs = ((InternalEObject) newLoadAppPoint1ID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID, null, msgs);
			msgs = basicSetLoadAppPoint1ID(newLoadAppPoint1ID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID,
					newLoadAppPoint1ID, newLoadAppPoint1ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getLoadAppPoint2ID() {
		return loadAppPoint2ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadAppPoint2ID(IntegerBaseType newLoadAppPoint2ID, NotificationChain msgs) {
		IntegerBaseType oldLoadAppPoint2ID = loadAppPoint2ID;
		loadAppPoint2ID = newLoadAppPoint2ID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID, oldLoadAppPoint2ID, newLoadAppPoint2ID);
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
	public void setLoadAppPoint2ID(IntegerBaseType newLoadAppPoint2ID) {
		if (newLoadAppPoint2ID != loadAppPoint2ID) {
			NotificationChain msgs = null;
			if (loadAppPoint2ID != null)
				msgs = ((InternalEObject) loadAppPoint2ID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID, null, msgs);
			if (newLoadAppPoint2ID != null)
				msgs = ((InternalEObject) newLoadAppPoint2ID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID, null, msgs);
			msgs = basicSetLoadAppPoint2ID(newLoadAppPoint2ID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID,
					newLoadAppPoint2ID, newLoadAppPoint2ID));
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
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID:
			return basicSetLoadAppPoint1ID(null, msgs);
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID:
			return basicSetLoadAppPoint2ID(null, msgs);
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
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID:
			return getLoadAppPoint1ID();
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID:
			return getLoadAppPoint2ID();
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
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID:
			setLoadAppPoint1ID((IntegerBaseType) newValue);
			return;
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID:
			setLoadAppPoint2ID((IntegerBaseType) newValue);
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
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID:
			setLoadAppPoint1ID((IntegerBaseType) null);
			return;
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID:
			setLoadAppPoint2ID((IntegerBaseType) null);
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
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT1_ID:
			return loadAppPoint1ID != null;
		case CpacsPackage.CONNECTIVITY_TYPE__LOAD_APP_POINT2_ID:
			return loadAppPoint2ID != null;
		case CpacsPackage.CONNECTIVITY_TYPE__ROTATION:
			return rotation != null;
		case CpacsPackage.CONNECTIVITY_TYPE__STIFFNESS:
			return stiffness != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectivityTypeImpl
