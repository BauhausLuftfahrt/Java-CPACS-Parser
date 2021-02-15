/**
 */
package Cpacs.impl;

import Cpacs.ActuatorAttachmentType;
import Cpacs.ControlSurfaceActuatorType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Actuator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceActuatorTypeImpl#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceActuatorTypeImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceActuatorTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceActuatorTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceActuatorType {
	/**
	 * The cached value of the '{@link #getActuatorUID() <em>Actuator UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType actuatorUID;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected ActuatorAttachmentType attachment;

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
	protected ControlSurfaceActuatorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceActuatorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getActuatorUID() {
		return actuatorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuatorUID(StringUIDBaseType newActuatorUID, NotificationChain msgs) {
		StringUIDBaseType oldActuatorUID = actuatorUID;
		actuatorUID = newActuatorUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID, oldActuatorUID, newActuatorUID);
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
	public void setActuatorUID(StringUIDBaseType newActuatorUID) {
		if (newActuatorUID != actuatorUID) {
			NotificationChain msgs = null;
			if (actuatorUID != null)
				msgs = ((InternalEObject) actuatorUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID, null, msgs);
			if (newActuatorUID != null)
				msgs = ((InternalEObject) newActuatorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID, null, msgs);
			msgs = basicSetActuatorUID(newActuatorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID, newActuatorUID, newActuatorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorAttachmentType getAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment(ActuatorAttachmentType newAttachment, NotificationChain msgs) {
		ActuatorAttachmentType oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT, oldAttachment, newAttachment);
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
	public void setAttachment(ActuatorAttachmentType newAttachment) {
		if (newAttachment != attachment) {
			NotificationChain msgs = null;
			if (attachment != null)
				msgs = ((InternalEObject) attachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT, null, msgs);
			if (newAttachment != null)
				msgs = ((InternalEObject) newAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT, null, msgs);
			msgs = basicSetAttachment(newAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT, newAttachment, newAttachment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__UID,
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
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID:
			return basicSetActuatorUID(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT:
			return basicSetAttachment(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID:
			return getActuatorUID();
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT:
			return getAttachment();
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__UID:
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
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID:
			setActuatorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT:
			setAttachment((ActuatorAttachmentType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__UID:
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
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID:
			setActuatorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT:
			setAttachment((ActuatorAttachmentType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__UID:
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
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ACTUATOR_UID:
			return actuatorUID != null;
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__ATTACHMENT:
			return attachment != null;
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE__UID:
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

} //ControlSurfaceActuatorTypeImpl
