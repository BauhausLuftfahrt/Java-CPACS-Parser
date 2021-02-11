/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PressureBulkheadAssemblyPositionType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressure Bulkhead Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PressureBulkheadAssemblyPositionTypeImpl#getFrameUID <em>Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadAssemblyPositionTypeImpl#getPressureBulkheadElementUID <em>Pressure Bulkhead Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadAssemblyPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PressureBulkheadAssemblyPositionTypeImpl extends ComplexBaseTypeImpl
		implements PressureBulkheadAssemblyPositionType {
	/**
	 * The cached value of the '{@link #getFrameUID() <em>Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType frameUID;

	/**
	 * The cached value of the '{@link #getPressureBulkheadElementUID() <em>Pressure Bulkhead Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureBulkheadElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType pressureBulkheadElementUID;

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
	protected PressureBulkheadAssemblyPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPressureBulkheadAssemblyPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFrameUID() {
		return frameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrameUID(StringUIDBaseType newFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldFrameUID = frameUID;
		frameUID = newFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID, oldFrameUID, newFrameUID);
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
	public void setFrameUID(StringUIDBaseType newFrameUID) {
		if (newFrameUID != frameUID) {
			NotificationChain msgs = null;
			if (frameUID != null)
				msgs = ((InternalEObject) frameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID, null,
						msgs);
			if (newFrameUID != null)
				msgs = ((InternalEObject) newFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID, null,
						msgs);
			msgs = basicSetFrameUID(newFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID, newFrameUID, newFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPressureBulkheadElementUID() {
		return pressureBulkheadElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPressureBulkheadElementUID(StringUIDBaseType newPressureBulkheadElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldPressureBulkheadElementUID = pressureBulkheadElementUID;
		pressureBulkheadElementUID = newPressureBulkheadElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID,
					oldPressureBulkheadElementUID, newPressureBulkheadElementUID);
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
	public void setPressureBulkheadElementUID(StringUIDBaseType newPressureBulkheadElementUID) {
		if (newPressureBulkheadElementUID != pressureBulkheadElementUID) {
			NotificationChain msgs = null;
			if (pressureBulkheadElementUID != null)
				msgs = ((InternalEObject) pressureBulkheadElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID,
						null, msgs);
			if (newPressureBulkheadElementUID != null)
				msgs = ((InternalEObject) newPressureBulkheadElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID,
						null, msgs);
			msgs = basicSetPressureBulkheadElementUID(newPressureBulkheadElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID,
					newPressureBulkheadElementUID, newPressureBulkheadElementUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return basicSetFrameUID(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID:
			return basicSetPressureBulkheadElementUID(null, msgs);
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
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return getFrameUID();
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID:
			return getPressureBulkheadElementUID();
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			setFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID:
			setPressureBulkheadElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			setFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID:
			setPressureBulkheadElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return frameUID != null;
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__PRESSURE_BULKHEAD_ELEMENT_UID:
			return pressureBulkheadElementUID != null;
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE__UID:
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

} //PressureBulkheadAssemblyPositionTypeImpl