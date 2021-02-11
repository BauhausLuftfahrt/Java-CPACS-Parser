/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WindowAssemblyPositionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WindowAssemblyPositionTypeImpl#getWindowElementUID <em>Window Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.WindowAssemblyPositionTypeImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Cpacs.impl.WindowAssemblyPositionTypeImpl#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link Cpacs.impl.WindowAssemblyPositionTypeImpl#getAngleX <em>Angle X</em>}</li>
 *   <li>{@link Cpacs.impl.WindowAssemblyPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowAssemblyPositionTypeImpl extends ComplexBaseTypeImpl implements WindowAssemblyPositionType {
	/**
	 * The cached value of the '{@link #getWindowElementUID() <em>Window Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType windowElementUID;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionX;

	/**
	 * The cached value of the '{@link #getPositionZ() <em>Position Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionZ;

	/**
	 * The cached value of the '{@link #getAngleX() <em>Angle X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleX;

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
	protected WindowAssemblyPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWindowAssemblyPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getWindowElementUID() {
		return windowElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindowElementUID(StringUIDBaseType newWindowElementUID, NotificationChain msgs) {
		StringUIDBaseType oldWindowElementUID = windowElementUID;
		windowElementUID = newWindowElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID, oldWindowElementUID,
					newWindowElementUID);
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
	public void setWindowElementUID(StringUIDBaseType newWindowElementUID) {
		if (newWindowElementUID != windowElementUID) {
			NotificationChain msgs = null;
			if (windowElementUID != null)
				msgs = ((InternalEObject) windowElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID, null,
						msgs);
			if (newWindowElementUID != null)
				msgs = ((InternalEObject) newWindowElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID, null,
						msgs);
			msgs = basicSetWindowElementUID(newWindowElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID, newWindowElementUID,
					newWindowElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionX(DoubleBaseType newPositionX, NotificationChain msgs) {
		DoubleBaseType oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X, oldPositionX, newPositionX);
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
	public void setPositionX(DoubleBaseType newPositionX) {
		if (newPositionX != positionX) {
			NotificationChain msgs = null;
			if (positionX != null)
				msgs = ((InternalEObject) positionX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X, null, msgs);
			if (newPositionX != null)
				msgs = ((InternalEObject) newPositionX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X, null, msgs);
			msgs = basicSetPositionX(newPositionX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X, newPositionX, newPositionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionZ() {
		return positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionZ(DoubleBaseType newPositionZ, NotificationChain msgs) {
		DoubleBaseType oldPositionZ = positionZ;
		positionZ = newPositionZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z, oldPositionZ, newPositionZ);
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
	public void setPositionZ(DoubleBaseType newPositionZ) {
		if (newPositionZ != positionZ) {
			NotificationChain msgs = null;
			if (positionZ != null)
				msgs = ((InternalEObject) positionZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z, null, msgs);
			if (newPositionZ != null)
				msgs = ((InternalEObject) newPositionZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z, null, msgs);
			msgs = basicSetPositionZ(newPositionZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z, newPositionZ, newPositionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleX() {
		return angleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleX(DoubleBaseType newAngleX, NotificationChain msgs) {
		DoubleBaseType oldAngleX = angleX;
		angleX = newAngleX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X, oldAngleX, newAngleX);
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
	public void setAngleX(DoubleBaseType newAngleX) {
		if (newAngleX != angleX) {
			NotificationChain msgs = null;
			if (angleX != null)
				msgs = ((InternalEObject) angleX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X, null, msgs);
			if (newAngleX != null)
				msgs = ((InternalEObject) newAngleX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X, null, msgs);
			msgs = basicSetAngleX(newAngleX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X,
					newAngleX, newAngleX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID:
			return basicSetWindowElementUID(null, msgs);
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X:
			return basicSetPositionX(null, msgs);
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			return basicSetPositionZ(null, msgs);
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			return basicSetAngleX(null, msgs);
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
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID:
			return getWindowElementUID();
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X:
			return getPositionX();
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			return getPositionZ();
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			return getAngleX();
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID:
			setWindowElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X:
			setPositionX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			setPositionZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			setAngleX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID:
			setWindowElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X:
			setPositionX((DoubleBaseType) null);
			return;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			setPositionZ((DoubleBaseType) null);
			return;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			setAngleX((DoubleBaseType) null);
			return;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__WINDOW_ELEMENT_UID:
			return windowElementUID != null;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_X:
			return positionX != null;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			return positionZ != null;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			return angleX != null;
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE__UID:
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

} //WindowAssemblyPositionTypeImpl
