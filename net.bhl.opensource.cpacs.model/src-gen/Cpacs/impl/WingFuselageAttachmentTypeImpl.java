/**
 */
package Cpacs.impl;

import Cpacs.ActuatorsFuselageWingType;
import Cpacs.AttachmentPinsType;
import Cpacs.CpacsPackage;
import Cpacs.RibIdentificationType;
import Cpacs.WingFuselageAttachmentType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Fuselage Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingFuselageAttachmentTypeImpl#getRib1 <em>Rib1</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuselageAttachmentTypeImpl#getRib2 <em>Rib2</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuselageAttachmentTypeImpl#getAttachmentPins <em>Attachment Pins</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuselageAttachmentTypeImpl#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingFuselageAttachmentTypeImpl extends ComplexBaseTypeImpl implements WingFuselageAttachmentType {
	/**
	 * The cached value of the '{@link #getRib1() <em>Rib1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRib1()
	 * @generated
	 * @ordered
	 */
	protected RibIdentificationType rib1;

	/**
	 * The cached value of the '{@link #getRib2() <em>Rib2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRib2()
	 * @generated
	 * @ordered
	 */
	protected RibIdentificationType rib2;

	/**
	 * The cached value of the '{@link #getAttachmentPins() <em>Attachment Pins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentPins()
	 * @generated
	 * @ordered
	 */
	protected AttachmentPinsType attachmentPins;

	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected ActuatorsFuselageWingType actuators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingFuselageAttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingFuselageAttachmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibIdentificationType getRib1() {
		return rib1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRib1(RibIdentificationType newRib1, NotificationChain msgs) {
		RibIdentificationType oldRib1 = rib1;
		rib1 = newRib1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1, oldRib1, newRib1);
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
	public void setRib1(RibIdentificationType newRib1) {
		if (newRib1 != rib1) {
			NotificationChain msgs = null;
			if (rib1 != null)
				msgs = ((InternalEObject) rib1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1, null, msgs);
			if (newRib1 != null)
				msgs = ((InternalEObject) newRib1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1, null, msgs);
			msgs = basicSetRib1(newRib1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1,
					newRib1, newRib1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibIdentificationType getRib2() {
		return rib2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRib2(RibIdentificationType newRib2, NotificationChain msgs) {
		RibIdentificationType oldRib2 = rib2;
		rib2 = newRib2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2, oldRib2, newRib2);
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
	public void setRib2(RibIdentificationType newRib2) {
		if (newRib2 != rib2) {
			NotificationChain msgs = null;
			if (rib2 != null)
				msgs = ((InternalEObject) rib2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2, null, msgs);
			if (newRib2 != null)
				msgs = ((InternalEObject) newRib2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2, null, msgs);
			msgs = basicSetRib2(newRib2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2,
					newRib2, newRib2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachmentPinsType getAttachmentPins() {
		return attachmentPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentPins(AttachmentPinsType newAttachmentPins, NotificationChain msgs) {
		AttachmentPinsType oldAttachmentPins = attachmentPins;
		attachmentPins = newAttachmentPins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS, oldAttachmentPins, newAttachmentPins);
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
	public void setAttachmentPins(AttachmentPinsType newAttachmentPins) {
		if (newAttachmentPins != attachmentPins) {
			NotificationChain msgs = null;
			if (attachmentPins != null)
				msgs = ((InternalEObject) attachmentPins).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS, null,
						msgs);
			if (newAttachmentPins != null)
				msgs = ((InternalEObject) newAttachmentPins).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS, null,
						msgs);
			msgs = basicSetAttachmentPins(newAttachmentPins, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS, newAttachmentPins, newAttachmentPins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorsFuselageWingType getActuators() {
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuators(ActuatorsFuselageWingType newActuators, NotificationChain msgs) {
		ActuatorsFuselageWingType oldActuators = actuators;
		actuators = newActuators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS, oldActuators, newActuators);
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
	public void setActuators(ActuatorsFuselageWingType newActuators) {
		if (newActuators != actuators) {
			NotificationChain msgs = null;
			if (actuators != null)
				msgs = ((InternalEObject) actuators).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS, null, msgs);
			if (newActuators != null)
				msgs = ((InternalEObject) newActuators).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS, null, msgs);
			msgs = basicSetActuators(newActuators, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS,
					newActuators, newActuators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1:
			return basicSetRib1(null, msgs);
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2:
			return basicSetRib2(null, msgs);
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS:
			return basicSetAttachmentPins(null, msgs);
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS:
			return basicSetActuators(null, msgs);
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
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1:
			return getRib1();
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2:
			return getRib2();
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS:
			return getAttachmentPins();
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS:
			return getActuators();
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
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1:
			setRib1((RibIdentificationType) newValue);
			return;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2:
			setRib2((RibIdentificationType) newValue);
			return;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS:
			setAttachmentPins((AttachmentPinsType) newValue);
			return;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS:
			setActuators((ActuatorsFuselageWingType) newValue);
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
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1:
			setRib1((RibIdentificationType) null);
			return;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2:
			setRib2((RibIdentificationType) null);
			return;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS:
			setAttachmentPins((AttachmentPinsType) null);
			return;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS:
			setActuators((ActuatorsFuselageWingType) null);
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
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB1:
			return rib1 != null;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__RIB2:
			return rib2 != null;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ATTACHMENT_PINS:
			return attachmentPins != null;
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE__ACTUATORS:
			return actuators != null;
		}
		return super.eIsSet(featureID);
	}

} //WingFuselageAttachmentTypeImpl
