/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceAirfoilType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EtaIsoLineType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Airfoil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceAirfoilTypeImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceAirfoilTypeImpl#getAirfoilUID <em>Airfoil UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceAirfoilTypeImpl#getRotX <em>Rot X</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceAirfoilTypeImpl#getRotZ <em>Rot Z</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceAirfoilTypeImpl#getScalY <em>Scal Y</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceAirfoilTypeImpl#getScalZ <em>Scal Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceAirfoilTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceAirfoilType {
	/**
	 * The cached value of the '{@link #getEta() <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType eta;

	/**
	 * The cached value of the '{@link #getAirfoilUID() <em>Airfoil UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirfoilUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType airfoilUID;

	/**
	 * The cached value of the '{@link #getRotX() <em>Rot X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rotX;

	/**
	 * The cached value of the '{@link #getRotZ() <em>Rot Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rotZ;

	/**
	 * The cached value of the '{@link #getScalY() <em>Scal Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType scalY;

	/**
	 * The cached value of the '{@link #getScalZ() <em>Scal Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType scalZ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceAirfoilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceAirfoilType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEta() {
		return eta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEta(EtaIsoLineType newEta, NotificationChain msgs) {
		EtaIsoLineType oldEta = eta;
		eta = newEta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA, oldEta, newEta);
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
	public void setEta(EtaIsoLineType newEta) {
		if (newEta != eta) {
			NotificationChain msgs = null;
			if (eta != null)
				msgs = ((InternalEObject) eta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA, null, msgs);
			if (newEta != null)
				msgs = ((InternalEObject) newEta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA, null, msgs);
			msgs = basicSetEta(newEta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA,
					newEta, newEta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getAirfoilUID() {
		return airfoilUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirfoilUID(StringUIDBaseType newAirfoilUID, NotificationChain msgs) {
		StringUIDBaseType oldAirfoilUID = airfoilUID;
		airfoilUID = newAirfoilUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID, oldAirfoilUID, newAirfoilUID);
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
	public void setAirfoilUID(StringUIDBaseType newAirfoilUID) {
		if (newAirfoilUID != airfoilUID) {
			NotificationChain msgs = null;
			if (airfoilUID != null)
				msgs = ((InternalEObject) airfoilUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID, null, msgs);
			if (newAirfoilUID != null)
				msgs = ((InternalEObject) newAirfoilUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID, null, msgs);
			msgs = basicSetAirfoilUID(newAirfoilUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID, newAirfoilUID, newAirfoilUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRotX() {
		return rotX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotX(DoubleBaseType newRotX, NotificationChain msgs) {
		DoubleBaseType oldRotX = rotX;
		rotX = newRotX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X, oldRotX, newRotX);
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
	public void setRotX(DoubleBaseType newRotX) {
		if (newRotX != rotX) {
			NotificationChain msgs = null;
			if (rotX != null)
				msgs = ((InternalEObject) rotX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X, null, msgs);
			if (newRotX != null)
				msgs = ((InternalEObject) newRotX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X, null, msgs);
			msgs = basicSetRotX(newRotX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X,
					newRotX, newRotX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRotZ() {
		return rotZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotZ(DoubleBaseType newRotZ, NotificationChain msgs) {
		DoubleBaseType oldRotZ = rotZ;
		rotZ = newRotZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z, oldRotZ, newRotZ);
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
	public void setRotZ(DoubleBaseType newRotZ) {
		if (newRotZ != rotZ) {
			NotificationChain msgs = null;
			if (rotZ != null)
				msgs = ((InternalEObject) rotZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z, null, msgs);
			if (newRotZ != null)
				msgs = ((InternalEObject) newRotZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z, null, msgs);
			msgs = basicSetRotZ(newRotZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z,
					newRotZ, newRotZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getScalY() {
		return scalY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalY(DoubleBaseType newScalY, NotificationChain msgs) {
		DoubleBaseType oldScalY = scalY;
		scalY = newScalY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y, oldScalY, newScalY);
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
	public void setScalY(DoubleBaseType newScalY) {
		if (newScalY != scalY) {
			NotificationChain msgs = null;
			if (scalY != null)
				msgs = ((InternalEObject) scalY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y, null, msgs);
			if (newScalY != null)
				msgs = ((InternalEObject) newScalY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y, null, msgs);
			msgs = basicSetScalY(newScalY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y,
					newScalY, newScalY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getScalZ() {
		return scalZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalZ(DoubleBaseType newScalZ, NotificationChain msgs) {
		DoubleBaseType oldScalZ = scalZ;
		scalZ = newScalZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z, oldScalZ, newScalZ);
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
	public void setScalZ(DoubleBaseType newScalZ) {
		if (newScalZ != scalZ) {
			NotificationChain msgs = null;
			if (scalZ != null)
				msgs = ((InternalEObject) scalZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z, null, msgs);
			if (newScalZ != null)
				msgs = ((InternalEObject) newScalZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z, null, msgs);
			msgs = basicSetScalZ(newScalZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z,
					newScalZ, newScalZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA:
			return basicSetEta(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID:
			return basicSetAirfoilUID(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X:
			return basicSetRotX(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z:
			return basicSetRotZ(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y:
			return basicSetScalY(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z:
			return basicSetScalZ(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA:
			return getEta();
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID:
			return getAirfoilUID();
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X:
			return getRotX();
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z:
			return getRotZ();
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y:
			return getScalY();
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z:
			return getScalZ();
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
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA:
			setEta((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID:
			setAirfoilUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X:
			setRotX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z:
			setRotZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y:
			setScalY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z:
			setScalZ((DoubleBaseType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA:
			setEta((EtaIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID:
			setAirfoilUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X:
			setRotX((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z:
			setRotZ((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y:
			setScalY((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z:
			setScalZ((DoubleBaseType) null);
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
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ETA:
			return eta != null;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__AIRFOIL_UID:
			return airfoilUID != null;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_X:
			return rotX != null;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__ROT_Z:
			return rotZ != null;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Y:
			return scalY != null;
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE__SCAL_Z:
			return scalZ != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceAirfoilTypeImpl
