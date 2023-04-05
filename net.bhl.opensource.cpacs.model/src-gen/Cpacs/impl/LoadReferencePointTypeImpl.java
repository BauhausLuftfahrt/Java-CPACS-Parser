/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LoadReferencePointType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Reference Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadReferencePointTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferencePointTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferencePointTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferencePointTypeImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferencePointTypeImpl#getXsi <em>Xsi</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferencePointTypeImpl#getRelHeight <em>Rel Height</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferencePointTypeImpl#getReferenceUID <em>Reference UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadReferencePointTypeImpl extends ComplexBaseTypeImpl implements LoadReferencePointType {
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
	 * The cached value of the '{@link #getEta() <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eta;

	/**
	 * The cached value of the '{@link #getXsi() <em>Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsi;

	/**
	 * The cached value of the '{@link #getRelHeight() <em>Rel Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType relHeight;

	/**
	 * The cached value of the '{@link #getReferenceUID() <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType referenceUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadReferencePointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadReferencePointType();
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
					CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X, oldX, newX);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X, newX,
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
					CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y, oldY, newY);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y, newY,
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
					CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z, oldZ, newZ);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z, newZ,
					newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEta() {
		return eta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEta(DoubleBaseType newEta, NotificationChain msgs) {
		DoubleBaseType oldEta = eta;
		eta = newEta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA, oldEta, newEta);
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
	public void setEta(DoubleBaseType newEta) {
		if (newEta != eta) {
			NotificationChain msgs = null;
			if (eta != null)
				msgs = ((InternalEObject) eta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA, null, msgs);
			if (newEta != null)
				msgs = ((InternalEObject) newEta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA, null, msgs);
			msgs = basicSetEta(newEta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA, newEta,
					newEta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsi() {
		return xsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsi(DoubleBaseType newXsi, NotificationChain msgs) {
		DoubleBaseType oldXsi = xsi;
		xsi = newXsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI, oldXsi, newXsi);
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
	public void setXsi(DoubleBaseType newXsi) {
		if (newXsi != xsi) {
			NotificationChain msgs = null;
			if (xsi != null)
				msgs = ((InternalEObject) xsi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI, null, msgs);
			if (newXsi != null)
				msgs = ((InternalEObject) newXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI, null, msgs);
			msgs = basicSetXsi(newXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI, newXsi,
					newXsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRelHeight() {
		return relHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelHeight(DoubleBaseType newRelHeight, NotificationChain msgs) {
		DoubleBaseType oldRelHeight = relHeight;
		relHeight = newRelHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT, oldRelHeight, newRelHeight);
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
	public void setRelHeight(DoubleBaseType newRelHeight) {
		if (newRelHeight != relHeight) {
			NotificationChain msgs = null;
			if (relHeight != null)
				msgs = ((InternalEObject) relHeight).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT, null, msgs);
			if (newRelHeight != null)
				msgs = ((InternalEObject) newRelHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT, null, msgs);
			msgs = basicSetRelHeight(newRelHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT,
					newRelHeight, newRelHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReferenceUID() {
		return referenceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceUID(StringUIDBaseType newReferenceUID, NotificationChain msgs) {
		StringUIDBaseType oldReferenceUID = referenceUID;
		referenceUID = newReferenceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID, oldReferenceUID, newReferenceUID);
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
	public void setReferenceUID(StringUIDBaseType newReferenceUID) {
		if (newReferenceUID != referenceUID) {
			NotificationChain msgs = null;
			if (referenceUID != null)
				msgs = ((InternalEObject) referenceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID, null, msgs);
			if (newReferenceUID != null)
				msgs = ((InternalEObject) newReferenceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID, null, msgs);
			msgs = basicSetReferenceUID(newReferenceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID,
					newReferenceUID, newReferenceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA:
			return basicSetEta(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI:
			return basicSetXsi(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT:
			return basicSetRelHeight(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID:
			return basicSetReferenceUID(null, msgs);
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
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X:
			return getX();
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y:
			return getY();
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z:
			return getZ();
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA:
			return getEta();
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI:
			return getXsi();
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT:
			return getRelHeight();
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID:
			return getReferenceUID();
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
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y:
			setY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z:
			setZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA:
			setEta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI:
			setXsi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT:
			setRelHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID:
			setReferenceUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y:
			setY((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z:
			setZ((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA:
			setEta((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI:
			setXsi((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT:
			setRelHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID:
			setReferenceUID((StringUIDBaseType) null);
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
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__X:
			return x != null;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Y:
			return y != null;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__Z:
			return z != null;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__ETA:
			return eta != null;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__XSI:
			return xsi != null;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REL_HEIGHT:
			return relHeight != null;
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE__REFERENCE_UID:
			return referenceUID != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadReferencePointTypeImpl
