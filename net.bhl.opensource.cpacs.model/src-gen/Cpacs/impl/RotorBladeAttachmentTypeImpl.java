/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.IntegerBaseType;
import Cpacs.RotorBladeAttachmentType;
import Cpacs.RotorHubHingesType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotor Blade Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorBladeAttachmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.RotorBladeAttachmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.RotorBladeAttachmentTypeImpl#getAzimuthAngles <em>Azimuth Angles</em>}</li>
 *   <li>{@link Cpacs.impl.RotorBladeAttachmentTypeImpl#getNumberOfBlades <em>Number Of Blades</em>}</li>
 *   <li>{@link Cpacs.impl.RotorBladeAttachmentTypeImpl#getHinges <em>Hinges</em>}</li>
 *   <li>{@link Cpacs.impl.RotorBladeAttachmentTypeImpl#getRotorBladeUID <em>Rotor Blade UID</em>}</li>
 *   <li>{@link Cpacs.impl.RotorBladeAttachmentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorBladeAttachmentTypeImpl extends ComplexBaseTypeImpl implements RotorBladeAttachmentType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getAzimuthAngles() <em>Azimuth Angles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthAngles()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType azimuthAngles;

	/**
	 * The cached value of the '{@link #getNumberOfBlades() <em>Number Of Blades</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBlades()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfBlades;

	/**
	 * The cached value of the '{@link #getHinges() <em>Hinges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinges()
	 * @generated
	 * @ordered
	 */
	protected RotorHubHingesType hinges;

	/**
	 * The cached value of the '{@link #getRotorBladeUID() <em>Rotor Blade UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotorBladeUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType rotorBladeUID;

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
	protected RotorBladeAttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorBladeAttachmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME,
					newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAzimuthAngles() {
		return azimuthAngles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAzimuthAngles(StringVectorBaseType newAzimuthAngles, NotificationChain msgs) {
		StringVectorBaseType oldAzimuthAngles = azimuthAngles;
		azimuthAngles = newAzimuthAngles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES, oldAzimuthAngles, newAzimuthAngles);
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
	public void setAzimuthAngles(StringVectorBaseType newAzimuthAngles) {
		if (newAzimuthAngles != azimuthAngles) {
			NotificationChain msgs = null;
			if (azimuthAngles != null)
				msgs = ((InternalEObject) azimuthAngles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES, null, msgs);
			if (newAzimuthAngles != null)
				msgs = ((InternalEObject) newAzimuthAngles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES, null, msgs);
			msgs = basicSetAzimuthAngles(newAzimuthAngles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES, newAzimuthAngles, newAzimuthAngles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfBlades() {
		return numberOfBlades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfBlades(IntegerBaseType newNumberOfBlades, NotificationChain msgs) {
		IntegerBaseType oldNumberOfBlades = numberOfBlades;
		numberOfBlades = newNumberOfBlades;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES, oldNumberOfBlades, newNumberOfBlades);
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
	public void setNumberOfBlades(IntegerBaseType newNumberOfBlades) {
		if (newNumberOfBlades != numberOfBlades) {
			NotificationChain msgs = null;
			if (numberOfBlades != null)
				msgs = ((InternalEObject) numberOfBlades).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES, null,
						msgs);
			if (newNumberOfBlades != null)
				msgs = ((InternalEObject) newNumberOfBlades).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES, null,
						msgs);
			msgs = basicSetNumberOfBlades(newNumberOfBlades, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES, newNumberOfBlades, newNumberOfBlades));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorHubHingesType getHinges() {
		return hinges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHinges(RotorHubHingesType newHinges, NotificationChain msgs) {
		RotorHubHingesType oldHinges = hinges;
		hinges = newHinges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES, oldHinges, newHinges);
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
	public void setHinges(RotorHubHingesType newHinges) {
		if (newHinges != hinges) {
			NotificationChain msgs = null;
			if (hinges != null)
				msgs = ((InternalEObject) hinges).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES, null, msgs);
			if (newHinges != null)
				msgs = ((InternalEObject) newHinges).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES, null, msgs);
			msgs = basicSetHinges(newHinges, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES,
					newHinges, newHinges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRotorBladeUID() {
		return rotorBladeUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotorBladeUID(StringUIDBaseType newRotorBladeUID, NotificationChain msgs) {
		StringUIDBaseType oldRotorBladeUID = rotorBladeUID;
		rotorBladeUID = newRotorBladeUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID, oldRotorBladeUID, newRotorBladeUID);
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
	public void setRotorBladeUID(StringUIDBaseType newRotorBladeUID) {
		if (newRotorBladeUID != rotorBladeUID) {
			NotificationChain msgs = null;
			if (rotorBladeUID != null)
				msgs = ((InternalEObject) rotorBladeUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID, null, msgs);
			if (newRotorBladeUID != null)
				msgs = ((InternalEObject) newRotorBladeUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID, null, msgs);
			msgs = basicSetRotorBladeUID(newRotorBladeUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID, newRotorBladeUID, newRotorBladeUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__UID, oldUID,
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES:
			return basicSetAzimuthAngles(null, msgs);
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES:
			return basicSetNumberOfBlades(null, msgs);
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES:
			return basicSetHinges(null, msgs);
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID:
			return basicSetRotorBladeUID(null, msgs);
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES:
			return getAzimuthAngles();
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES:
			return getNumberOfBlades();
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES:
			return getHinges();
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID:
			return getRotorBladeUID();
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__UID:
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES:
			setAzimuthAngles((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES:
			setNumberOfBlades((IntegerBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES:
			setHinges((RotorHubHingesType) newValue);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID:
			setRotorBladeUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__UID:
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES:
			setAzimuthAngles((StringVectorBaseType) null);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES:
			setNumberOfBlades((IntegerBaseType) null);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES:
			setHinges((RotorHubHingesType) null);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID:
			setRotorBladeUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__UID:
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__AZIMUTH_ANGLES:
			return azimuthAngles != null;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__NUMBER_OF_BLADES:
			return numberOfBlades != null;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__HINGES:
			return hinges != null;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__ROTOR_BLADE_UID:
			return rotorBladeUID != null;
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE__UID:
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

} //RotorBladeAttachmentTypeImpl
