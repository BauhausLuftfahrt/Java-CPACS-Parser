/**
 */
package Cpacs.impl;

import Cpacs.BlockedDOFType;
import Cpacs.CpacsPackage;
import Cpacs.CruiseRollerType;
import Cpacs.EtaXsiRelHeightPointType;
import Cpacs.MaterialDefinitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cruise Roller Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CruiseRollerTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link Cpacs.impl.CruiseRollerTypeImpl#getParentAttachment <em>Parent Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.CruiseRollerTypeImpl#getControlSurfaceAttachment <em>Control Surface Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.CruiseRollerTypeImpl#getBlockedDOF <em>Blocked DOF</em>}</li>
 *   <li>{@link Cpacs.impl.CruiseRollerTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CruiseRollerTypeImpl extends ComplexBaseTypeImpl implements CruiseRollerType {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiRelHeightPointType position;

	/**
	 * The cached value of the '{@link #getParentAttachment() <em>Parent Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAttachment()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType parentAttachment;

	/**
	 * The cached value of the '{@link #getControlSurfaceAttachment() <em>Control Surface Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaceAttachment()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType controlSurfaceAttachment;

	/**
	 * The cached value of the '{@link #getBlockedDOF() <em>Blocked DOF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockedDOF()
	 * @generated
	 * @ordered
	 */
	protected BlockedDOFType blockedDOF;

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
	protected CruiseRollerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCruiseRollerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(EtaXsiRelHeightPointType newPosition, NotificationChain msgs) {
		EtaXsiRelHeightPointType oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRUISE_ROLLER_TYPE__POSITION, oldPosition, newPosition);
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
	public void setPosition(EtaXsiRelHeightPointType newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRUISE_ROLLER_TYPE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRUISE_ROLLER_TYPE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRUISE_ROLLER_TYPE__POSITION,
					newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getParentAttachment() {
		return parentAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAttachment(MaterialDefinitionType newParentAttachment,
			NotificationChain msgs) {
		MaterialDefinitionType oldParentAttachment = parentAttachment;
		parentAttachment = newParentAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT, oldParentAttachment, newParentAttachment);
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
	public void setParentAttachment(MaterialDefinitionType newParentAttachment) {
		if (newParentAttachment != parentAttachment) {
			NotificationChain msgs = null;
			if (parentAttachment != null)
				msgs = ((InternalEObject) parentAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT, null, msgs);
			if (newParentAttachment != null)
				msgs = ((InternalEObject) newParentAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT, null, msgs);
			msgs = basicSetParentAttachment(newParentAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT,
					newParentAttachment, newParentAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getControlSurfaceAttachment() {
		return controlSurfaceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaceAttachment(MaterialDefinitionType newControlSurfaceAttachment,
			NotificationChain msgs) {
		MaterialDefinitionType oldControlSurfaceAttachment = controlSurfaceAttachment;
		controlSurfaceAttachment = newControlSurfaceAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT, oldControlSurfaceAttachment,
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
	public void setControlSurfaceAttachment(MaterialDefinitionType newControlSurfaceAttachment) {
		if (newControlSurfaceAttachment != controlSurfaceAttachment) {
			NotificationChain msgs = null;
			if (controlSurfaceAttachment != null)
				msgs = ((InternalEObject) controlSurfaceAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT, null,
						msgs);
			if (newControlSurfaceAttachment != null)
				msgs = ((InternalEObject) newControlSurfaceAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT, null,
						msgs);
			msgs = basicSetControlSurfaceAttachment(newControlSurfaceAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT, newControlSurfaceAttachment,
					newControlSurfaceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockedDOFType getBlockedDOF() {
		return blockedDOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockedDOF(BlockedDOFType newBlockedDOF, NotificationChain msgs) {
		BlockedDOFType oldBlockedDOF = blockedDOF;
		blockedDOF = newBlockedDOF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF, oldBlockedDOF, newBlockedDOF);
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
	public void setBlockedDOF(BlockedDOFType newBlockedDOF) {
		if (newBlockedDOF != blockedDOF) {
			NotificationChain msgs = null;
			if (blockedDOF != null)
				msgs = ((InternalEObject) blockedDOF).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF, null, msgs);
			if (newBlockedDOF != null)
				msgs = ((InternalEObject) newBlockedDOF).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF, null, msgs);
			msgs = basicSetBlockedDOF(newBlockedDOF, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF,
					newBlockedDOF, newBlockedDOF));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRUISE_ROLLER_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CRUISE_ROLLER_TYPE__POSITION:
			return basicSetPosition(null, msgs);
		case CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT:
			return basicSetParentAttachment(null, msgs);
		case CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return basicSetControlSurfaceAttachment(null, msgs);
		case CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF:
			return basicSetBlockedDOF(null, msgs);
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
		case CpacsPackage.CRUISE_ROLLER_TYPE__POSITION:
			return getPosition();
		case CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT:
			return getParentAttachment();
		case CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return getControlSurfaceAttachment();
		case CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF:
			return getBlockedDOF();
		case CpacsPackage.CRUISE_ROLLER_TYPE__UID:
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
		case CpacsPackage.CRUISE_ROLLER_TYPE__POSITION:
			setPosition((EtaXsiRelHeightPointType) newValue);
			return;
		case CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT:
			setParentAttachment((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT:
			setControlSurfaceAttachment((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF:
			setBlockedDOF((BlockedDOFType) newValue);
			return;
		case CpacsPackage.CRUISE_ROLLER_TYPE__UID:
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
		case CpacsPackage.CRUISE_ROLLER_TYPE__POSITION:
			setPosition((EtaXsiRelHeightPointType) null);
			return;
		case CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT:
			setParentAttachment((MaterialDefinitionType) null);
			return;
		case CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT:
			setControlSurfaceAttachment((MaterialDefinitionType) null);
			return;
		case CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF:
			setBlockedDOF((BlockedDOFType) null);
			return;
		case CpacsPackage.CRUISE_ROLLER_TYPE__UID:
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
		case CpacsPackage.CRUISE_ROLLER_TYPE__POSITION:
			return position != null;
		case CpacsPackage.CRUISE_ROLLER_TYPE__PARENT_ATTACHMENT:
			return parentAttachment != null;
		case CpacsPackage.CRUISE_ROLLER_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return controlSurfaceAttachment != null;
		case CpacsPackage.CRUISE_ROLLER_TYPE__BLOCKED_DOF:
			return blockedDOF != null;
		case CpacsPackage.CRUISE_ROLLER_TYPE__UID:
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

} //CruiseRollerTypeImpl
