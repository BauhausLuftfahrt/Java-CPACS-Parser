/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MainStrutInterfaceDefinitionsType;
import Cpacs.MainStrutWingFuselageAttachmentType;
import Cpacs.StringUIDBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Strut Interface Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MainStrutInterfaceDefinitionsTypeImpl#getMainStrutWingUID <em>Main Strut Wing UID</em>}</li>
 *   <li>{@link Cpacs.impl.MainStrutInterfaceDefinitionsTypeImpl#getMainStrutWingFuselageAttachment <em>Main Strut Wing Fuselage Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.MainStrutInterfaceDefinitionsTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainStrutInterfaceDefinitionsTypeImpl extends ComplexBaseTypeImpl
		implements MainStrutInterfaceDefinitionsType {
	/**
	 * The cached value of the '{@link #getMainStrutWingUID() <em>Main Strut Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainStrutWingUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType mainStrutWingUID;

	/**
	 * The cached value of the '{@link #getMainStrutWingFuselageAttachment() <em>Main Strut Wing Fuselage Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainStrutWingFuselageAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<MainStrutWingFuselageAttachmentType> mainStrutWingFuselageAttachment;

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
	protected MainStrutInterfaceDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMainStrutInterfaceDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMainStrutWingUID() {
		return mainStrutWingUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainStrutWingUID(StringUIDBaseType newMainStrutWingUID, NotificationChain msgs) {
		StringUIDBaseType oldMainStrutWingUID = mainStrutWingUID;
		mainStrutWingUID = newMainStrutWingUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID, oldMainStrutWingUID,
					newMainStrutWingUID);
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
	public void setMainStrutWingUID(StringUIDBaseType newMainStrutWingUID) {
		if (newMainStrutWingUID != mainStrutWingUID) {
			NotificationChain msgs = null;
			if (mainStrutWingUID != null)
				msgs = ((InternalEObject) mainStrutWingUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID, null, msgs);
			if (newMainStrutWingUID != null)
				msgs = ((InternalEObject) newMainStrutWingUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID, null, msgs);
			msgs = basicSetMainStrutWingUID(newMainStrutWingUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID, newMainStrutWingUID,
					newMainStrutWingUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MainStrutWingFuselageAttachmentType> getMainStrutWingFuselageAttachment() {
		if (mainStrutWingFuselageAttachment == null) {
			mainStrutWingFuselageAttachment = new EObjectContainmentEList<MainStrutWingFuselageAttachmentType>(
					MainStrutWingFuselageAttachmentType.class, this,
					CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_FUSELAGE_ATTACHMENT);
		}
		return mainStrutWingFuselageAttachment;
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
					CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID:
			return basicSetMainStrutWingUID(null, msgs);
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_FUSELAGE_ATTACHMENT:
			return ((InternalEList<?>) getMainStrutWingFuselageAttachment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID:
			return getMainStrutWingUID();
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_FUSELAGE_ATTACHMENT:
			return getMainStrutWingFuselageAttachment();
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__UID:
			return getUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID:
			setMainStrutWingUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_FUSELAGE_ATTACHMENT:
			getMainStrutWingFuselageAttachment().clear();
			getMainStrutWingFuselageAttachment()
					.addAll((Collection<? extends MainStrutWingFuselageAttachmentType>) newValue);
			return;
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__UID:
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
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID:
			setMainStrutWingUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_FUSELAGE_ATTACHMENT:
			getMainStrutWingFuselageAttachment().clear();
			return;
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__UID:
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
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_UID:
			return mainStrutWingUID != null;
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__MAIN_STRUT_WING_FUSELAGE_ATTACHMENT:
			return mainStrutWingFuselageAttachment != null && !mainStrutWingFuselageAttachment.isEmpty();
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE__UID:
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

} //MainStrutInterfaceDefinitionsTypeImpl
