/**
 */
package Cpacs.impl;

import Cpacs.ActuatorAttachmentType;
import Cpacs.ActuatorControlSurfaceAttachmentType;
import Cpacs.ActuatorParentAttachmentType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ActuatorAttachmentTypeImpl#getEtaControlSurface <em>Eta Control Surface</em>}</li>
 *   <li>{@link Cpacs.impl.ActuatorAttachmentTypeImpl#getParentAttachment <em>Parent Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.ActuatorAttachmentTypeImpl#getControlSurfaceAttachment <em>Control Surface Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorAttachmentTypeImpl extends ComplexBaseTypeImpl implements ActuatorAttachmentType {
	/**
	 * The cached value of the '{@link #getEtaControlSurface() <em>Eta Control Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtaControlSurface()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType etaControlSurface;

	/**
	 * The cached value of the '{@link #getParentAttachment() <em>Parent Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAttachment()
	 * @generated
	 * @ordered
	 */
	protected ActuatorParentAttachmentType parentAttachment;

	/**
	 * The cached value of the '{@link #getControlSurfaceAttachment() <em>Control Surface Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaceAttachment()
	 * @generated
	 * @ordered
	 */
	protected ActuatorControlSurfaceAttachmentType controlSurfaceAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorAttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getActuatorAttachmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEtaControlSurface() {
		return etaControlSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtaControlSurface(DoubleBaseType newEtaControlSurface, NotificationChain msgs) {
		DoubleBaseType oldEtaControlSurface = etaControlSurface;
		etaControlSurface = newEtaControlSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE, oldEtaControlSurface,
					newEtaControlSurface);
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
	public void setEtaControlSurface(DoubleBaseType newEtaControlSurface) {
		if (newEtaControlSurface != etaControlSurface) {
			NotificationChain msgs = null;
			if (etaControlSurface != null)
				msgs = ((InternalEObject) etaControlSurface).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE, null,
						msgs);
			if (newEtaControlSurface != null)
				msgs = ((InternalEObject) newEtaControlSurface).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE, null,
						msgs);
			msgs = basicSetEtaControlSurface(newEtaControlSurface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE, newEtaControlSurface,
					newEtaControlSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorParentAttachmentType getParentAttachment() {
		return parentAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAttachment(ActuatorParentAttachmentType newParentAttachment,
			NotificationChain msgs) {
		ActuatorParentAttachmentType oldParentAttachment = parentAttachment;
		parentAttachment = newParentAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT, oldParentAttachment, newParentAttachment);
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
	public void setParentAttachment(ActuatorParentAttachmentType newParentAttachment) {
		if (newParentAttachment != parentAttachment) {
			NotificationChain msgs = null;
			if (parentAttachment != null)
				msgs = ((InternalEObject) parentAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT, null, msgs);
			if (newParentAttachment != null)
				msgs = ((InternalEObject) newParentAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT, null, msgs);
			msgs = basicSetParentAttachment(newParentAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT, newParentAttachment,
					newParentAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorControlSurfaceAttachmentType getControlSurfaceAttachment() {
		return controlSurfaceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaceAttachment(
			ActuatorControlSurfaceAttachmentType newControlSurfaceAttachment, NotificationChain msgs) {
		ActuatorControlSurfaceAttachmentType oldControlSurfaceAttachment = controlSurfaceAttachment;
		controlSurfaceAttachment = newControlSurfaceAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT, oldControlSurfaceAttachment,
					newControlSurfaceAttachment);
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
	public void setControlSurfaceAttachment(ActuatorControlSurfaceAttachmentType newControlSurfaceAttachment) {
		if (newControlSurfaceAttachment != controlSurfaceAttachment) {
			NotificationChain msgs = null;
			if (controlSurfaceAttachment != null)
				msgs = ((InternalEObject) controlSurfaceAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT,
						null, msgs);
			if (newControlSurfaceAttachment != null)
				msgs = ((InternalEObject) newControlSurfaceAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT,
						null, msgs);
			msgs = basicSetControlSurfaceAttachment(newControlSurfaceAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT, newControlSurfaceAttachment,
					newControlSurfaceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE:
			return basicSetEtaControlSurface(null, msgs);
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT:
			return basicSetParentAttachment(null, msgs);
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return basicSetControlSurfaceAttachment(null, msgs);
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
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE:
			return getEtaControlSurface();
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT:
			return getParentAttachment();
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return getControlSurfaceAttachment();
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
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE:
			setEtaControlSurface((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT:
			setParentAttachment((ActuatorParentAttachmentType) newValue);
			return;
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT:
			setControlSurfaceAttachment((ActuatorControlSurfaceAttachmentType) newValue);
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
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE:
			setEtaControlSurface((DoubleBaseType) null);
			return;
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT:
			setParentAttachment((ActuatorParentAttachmentType) null);
			return;
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT:
			setControlSurfaceAttachment((ActuatorControlSurfaceAttachmentType) null);
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
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__ETA_CONTROL_SURFACE:
			return etaControlSurface != null;
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__PARENT_ATTACHMENT:
			return parentAttachment != null;
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return controlSurfaceAttachment != null;
		}
		return super.eIsSet(featureID);
	}

} //ActuatorAttachmentTypeImpl
