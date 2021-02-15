/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutLoadIntegrationPointsType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cut Load Integration Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CutLoadIntegrationPointsTypeImpl#getUIDs <em>UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadIntegrationPointsTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadIntegrationPointsTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadIntegrationPointsTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadIntegrationPointsTypeImpl#getOrientationX <em>Orientation X</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadIntegrationPointsTypeImpl#getOrientationY <em>Orientation Y</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadIntegrationPointsTypeImpl#getOrientationZ <em>Orientation Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CutLoadIntegrationPointsTypeImpl extends ComplexBaseTypeImpl implements CutLoadIntegrationPointsType {
	/**
	 * The cached value of the '{@link #getUIDs() <em>UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIDs()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType uIDs;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType x;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType y;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType z;

	/**
	 * The cached value of the '{@link #getOrientationX() <em>Orientation X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationX()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType orientationX;

	/**
	 * The cached value of the '{@link #getOrientationY() <em>Orientation Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationY()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType orientationY;

	/**
	 * The cached value of the '{@link #getOrientationZ() <em>Orientation Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationZ()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType orientationZ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CutLoadIntegrationPointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCutLoadIntegrationPointsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getUIDs() {
		return uIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUIDs(StringVectorBaseType newUIDs, NotificationChain msgs) {
		StringVectorBaseType oldUIDs = uIDs;
		uIDs = newUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS, oldUIDs, newUIDs);
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
	public void setUIDs(StringVectorBaseType newUIDs) {
		if (newUIDs != uIDs) {
			NotificationChain msgs = null;
			if (uIDs != null)
				msgs = ((InternalEObject) uIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS, null, msgs);
			if (newUIDs != null)
				msgs = ((InternalEObject) newUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS, null, msgs);
			msgs = basicSetUIDs(newUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS,
					newUIDs, newUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(StringVectorBaseType newX, NotificationChain msgs) {
		StringVectorBaseType oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X, oldX, newX);
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
	public void setX(StringVectorBaseType newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X,
					newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(StringVectorBaseType newY, NotificationChain msgs) {
		StringVectorBaseType oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y, oldY, newY);
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
	public void setY(StringVectorBaseType newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject) y).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y,
					newY, newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(StringVectorBaseType newZ, NotificationChain msgs) {
		StringVectorBaseType oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z, oldZ, newZ);
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
	public void setZ(StringVectorBaseType newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject) z).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z,
					newZ, newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getOrientationX() {
		return orientationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationX(StringVectorBaseType newOrientationX, NotificationChain msgs) {
		StringVectorBaseType oldOrientationX = orientationX;
		orientationX = newOrientationX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X, oldOrientationX, newOrientationX);
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
	public void setOrientationX(StringVectorBaseType newOrientationX) {
		if (newOrientationX != orientationX) {
			NotificationChain msgs = null;
			if (orientationX != null)
				msgs = ((InternalEObject) orientationX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X, null,
						msgs);
			if (newOrientationX != null)
				msgs = ((InternalEObject) newOrientationX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X, null,
						msgs);
			msgs = basicSetOrientationX(newOrientationX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X, newOrientationX, newOrientationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getOrientationY() {
		return orientationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationY(StringVectorBaseType newOrientationY, NotificationChain msgs) {
		StringVectorBaseType oldOrientationY = orientationY;
		orientationY = newOrientationY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y, oldOrientationY, newOrientationY);
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
	public void setOrientationY(StringVectorBaseType newOrientationY) {
		if (newOrientationY != orientationY) {
			NotificationChain msgs = null;
			if (orientationY != null)
				msgs = ((InternalEObject) orientationY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y, null,
						msgs);
			if (newOrientationY != null)
				msgs = ((InternalEObject) newOrientationY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y, null,
						msgs);
			msgs = basicSetOrientationY(newOrientationY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y, newOrientationY, newOrientationY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getOrientationZ() {
		return orientationZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationZ(StringVectorBaseType newOrientationZ, NotificationChain msgs) {
		StringVectorBaseType oldOrientationZ = orientationZ;
		orientationZ = newOrientationZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z, oldOrientationZ, newOrientationZ);
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
	public void setOrientationZ(StringVectorBaseType newOrientationZ) {
		if (newOrientationZ != orientationZ) {
			NotificationChain msgs = null;
			if (orientationZ != null)
				msgs = ((InternalEObject) orientationZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z, null,
						msgs);
			if (newOrientationZ != null)
				msgs = ((InternalEObject) newOrientationZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z, null,
						msgs);
			msgs = basicSetOrientationZ(newOrientationZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z, newOrientationZ, newOrientationZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS:
			return basicSetUIDs(null, msgs);
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X:
			return basicSetOrientationX(null, msgs);
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y:
			return basicSetOrientationY(null, msgs);
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z:
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
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS:
			return getUIDs();
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X:
			return getX();
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y:
			return getY();
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z:
			return getZ();
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X:
			return getOrientationX();
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y:
			return getOrientationY();
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z:
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
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS:
			setUIDs((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X:
			setX((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y:
			setY((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z:
			setZ((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X:
			setOrientationX((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y:
			setOrientationY((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z:
			setOrientationZ((StringVectorBaseType) newValue);
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
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS:
			setUIDs((StringVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X:
			setX((StringVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y:
			setY((StringVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z:
			setZ((StringVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X:
			setOrientationX((StringVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y:
			setOrientationY((StringVectorBaseType) null);
			return;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z:
			setOrientationZ((StringVectorBaseType) null);
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
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__UI_DS:
			return uIDs != null;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__X:
			return x != null;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Y:
			return y != null;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__Z:
			return z != null;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_X:
			return orientationX != null;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Y:
			return orientationY != null;
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE__ORIENTATION_Z:
			return orientationZ != null;
		}
		return super.eIsSet(featureID);
	}

} //CutLoadIntegrationPointsTypeImpl
