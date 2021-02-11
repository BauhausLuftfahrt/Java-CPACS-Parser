/**
 */
package Cpacs.impl;

import Cpacs.ActuatorFuselageWingAttachmentType;
import Cpacs.ActuatorFuselageWingType;
import Cpacs.CpacsPackage;
import Cpacs.PointXYZType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Fuselage Wing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ActuatorFuselageWingTypeImpl#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.impl.ActuatorFuselageWingTypeImpl#getFuselageAttachment <em>Fuselage Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.ActuatorFuselageWingTypeImpl#getWingAttachment <em>Wing Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.ActuatorFuselageWingTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorFuselageWingTypeImpl extends ComplexBaseTypeImpl implements ActuatorFuselageWingType {
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
	 * The cached value of the '{@link #getFuselageAttachment() <em>Fuselage Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageAttachment()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType fuselageAttachment;

	/**
	 * The cached value of the '{@link #getWingAttachment() <em>Wing Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingAttachment()
	 * @generated
	 * @ordered
	 */
	protected ActuatorFuselageWingAttachmentType wingAttachment;

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
	protected ActuatorFuselageWingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getActuatorFuselageWingType();
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
					CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID, oldActuatorUID, newActuatorUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID, null, msgs);
			if (newActuatorUID != null)
				msgs = ((InternalEObject) newActuatorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID, null, msgs);
			msgs = basicSetActuatorUID(newActuatorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID, newActuatorUID, newActuatorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getFuselageAttachment() {
		return fuselageAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselageAttachment(PointXYZType newFuselageAttachment, NotificationChain msgs) {
		PointXYZType oldFuselageAttachment = fuselageAttachment;
		fuselageAttachment = newFuselageAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT, oldFuselageAttachment,
					newFuselageAttachment);
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
	public void setFuselageAttachment(PointXYZType newFuselageAttachment) {
		if (newFuselageAttachment != fuselageAttachment) {
			NotificationChain msgs = null;
			if (fuselageAttachment != null)
				msgs = ((InternalEObject) fuselageAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT, null,
						msgs);
			if (newFuselageAttachment != null)
				msgs = ((InternalEObject) newFuselageAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT, null,
						msgs);
			msgs = basicSetFuselageAttachment(newFuselageAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT, newFuselageAttachment,
					newFuselageAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorFuselageWingAttachmentType getWingAttachment() {
		return wingAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingAttachment(ActuatorFuselageWingAttachmentType newWingAttachment,
			NotificationChain msgs) {
		ActuatorFuselageWingAttachmentType oldWingAttachment = wingAttachment;
		wingAttachment = newWingAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT, oldWingAttachment, newWingAttachment);
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
	public void setWingAttachment(ActuatorFuselageWingAttachmentType newWingAttachment) {
		if (newWingAttachment != wingAttachment) {
			NotificationChain msgs = null;
			if (wingAttachment != null)
				msgs = ((InternalEObject) wingAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT, null, msgs);
			if (newWingAttachment != null)
				msgs = ((InternalEObject) newWingAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT, null, msgs);
			msgs = basicSetWingAttachment(newWingAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT, newWingAttachment, newWingAttachment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID:
			return basicSetActuatorUID(null, msgs);
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT:
			return basicSetFuselageAttachment(null, msgs);
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT:
			return basicSetWingAttachment(null, msgs);
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
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID:
			return getActuatorUID();
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT:
			return getFuselageAttachment();
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT:
			return getWingAttachment();
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__UID:
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
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID:
			setActuatorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT:
			setFuselageAttachment((PointXYZType) newValue);
			return;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT:
			setWingAttachment((ActuatorFuselageWingAttachmentType) newValue);
			return;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__UID:
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
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID:
			setActuatorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT:
			setFuselageAttachment((PointXYZType) null);
			return;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT:
			setWingAttachment((ActuatorFuselageWingAttachmentType) null);
			return;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__UID:
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
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__ACTUATOR_UID:
			return actuatorUID != null;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__FUSELAGE_ATTACHMENT:
			return fuselageAttachment != null;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__WING_ATTACHMENT:
			return wingAttachment != null;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE__UID:
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

} //ActuatorFuselageWingTypeImpl
