/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.HtpInterfaceDefType;
import Cpacs.TailplaneAttachmentAreaType;
import Cpacs.TailplaneAttachmentTypeType;
import Cpacs.VtpInterfaceDefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tailplane Attachment Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TailplaneAttachmentAreaTypeImpl#getTailplaneAttachmentType <em>Tailplane Attachment Type</em>}</li>
 *   <li>{@link Cpacs.impl.TailplaneAttachmentAreaTypeImpl#getVtpInterfaceDefinitions <em>Vtp Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.TailplaneAttachmentAreaTypeImpl#getHtpInterfaceDefinitions <em>Htp Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.TailplaneAttachmentAreaTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TailplaneAttachmentAreaTypeImpl extends ComplexBaseTypeImpl implements TailplaneAttachmentAreaType {
	/**
	 * The cached value of the '{@link #getTailplaneAttachmentType() <em>Tailplane Attachment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailplaneAttachmentType()
	 * @generated
	 * @ordered
	 */
	protected TailplaneAttachmentTypeType tailplaneAttachmentType;

	/**
	 * The cached value of the '{@link #getVtpInterfaceDefinitions() <em>Vtp Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpInterfaceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected VtpInterfaceDefType vtpInterfaceDefinitions;

	/**
	 * The cached value of the '{@link #getHtpInterfaceDefinitions() <em>Htp Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpInterfaceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected HtpInterfaceDefType htpInterfaceDefinitions;

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
	protected TailplaneAttachmentAreaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTailplaneAttachmentAreaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TailplaneAttachmentTypeType getTailplaneAttachmentType() {
		return tailplaneAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTailplaneAttachmentType(TailplaneAttachmentTypeType newTailplaneAttachmentType,
			NotificationChain msgs) {
		TailplaneAttachmentTypeType oldTailplaneAttachmentType = tailplaneAttachmentType;
		tailplaneAttachmentType = newTailplaneAttachmentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE, oldTailplaneAttachmentType,
					newTailplaneAttachmentType);
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
	public void setTailplaneAttachmentType(TailplaneAttachmentTypeType newTailplaneAttachmentType) {
		if (newTailplaneAttachmentType != tailplaneAttachmentType) {
			NotificationChain msgs = null;
			if (tailplaneAttachmentType != null)
				msgs = ((InternalEObject) tailplaneAttachmentType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE,
						null, msgs);
			if (newTailplaneAttachmentType != null)
				msgs = ((InternalEObject) newTailplaneAttachmentType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE,
						null, msgs);
			msgs = basicSetTailplaneAttachmentType(newTailplaneAttachmentType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE, newTailplaneAttachmentType,
					newTailplaneAttachmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VtpInterfaceDefType getVtpInterfaceDefinitions() {
		return vtpInterfaceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpInterfaceDefinitions(VtpInterfaceDefType newVtpInterfaceDefinitions,
			NotificationChain msgs) {
		VtpInterfaceDefType oldVtpInterfaceDefinitions = vtpInterfaceDefinitions;
		vtpInterfaceDefinitions = newVtpInterfaceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS, oldVtpInterfaceDefinitions,
					newVtpInterfaceDefinitions);
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
	public void setVtpInterfaceDefinitions(VtpInterfaceDefType newVtpInterfaceDefinitions) {
		if (newVtpInterfaceDefinitions != vtpInterfaceDefinitions) {
			NotificationChain msgs = null;
			if (vtpInterfaceDefinitions != null)
				msgs = ((InternalEObject) vtpInterfaceDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS,
						null, msgs);
			if (newVtpInterfaceDefinitions != null)
				msgs = ((InternalEObject) newVtpInterfaceDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS,
						null, msgs);
			msgs = basicSetVtpInterfaceDefinitions(newVtpInterfaceDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS, newVtpInterfaceDefinitions,
					newVtpInterfaceDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtpInterfaceDefType getHtpInterfaceDefinitions() {
		return htpInterfaceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpInterfaceDefinitions(HtpInterfaceDefType newHtpInterfaceDefinitions,
			NotificationChain msgs) {
		HtpInterfaceDefType oldHtpInterfaceDefinitions = htpInterfaceDefinitions;
		htpInterfaceDefinitions = newHtpInterfaceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS, oldHtpInterfaceDefinitions,
					newHtpInterfaceDefinitions);
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
	public void setHtpInterfaceDefinitions(HtpInterfaceDefType newHtpInterfaceDefinitions) {
		if (newHtpInterfaceDefinitions != htpInterfaceDefinitions) {
			NotificationChain msgs = null;
			if (htpInterfaceDefinitions != null)
				msgs = ((InternalEObject) htpInterfaceDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS,
						null, msgs);
			if (newHtpInterfaceDefinitions != null)
				msgs = ((InternalEObject) newHtpInterfaceDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS,
						null, msgs);
			msgs = basicSetHtpInterfaceDefinitions(newHtpInterfaceDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS, newHtpInterfaceDefinitions,
					newHtpInterfaceDefinitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__UID,
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
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE:
			return basicSetTailplaneAttachmentType(null, msgs);
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS:
			return basicSetVtpInterfaceDefinitions(null, msgs);
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS:
			return basicSetHtpInterfaceDefinitions(null, msgs);
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
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE:
			return getTailplaneAttachmentType();
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS:
			return getVtpInterfaceDefinitions();
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS:
			return getHtpInterfaceDefinitions();
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__UID:
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
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE:
			setTailplaneAttachmentType((TailplaneAttachmentTypeType) newValue);
			return;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS:
			setVtpInterfaceDefinitions((VtpInterfaceDefType) newValue);
			return;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS:
			setHtpInterfaceDefinitions((HtpInterfaceDefType) newValue);
			return;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__UID:
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
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE:
			setTailplaneAttachmentType((TailplaneAttachmentTypeType) null);
			return;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS:
			setVtpInterfaceDefinitions((VtpInterfaceDefType) null);
			return;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS:
			setHtpInterfaceDefinitions((HtpInterfaceDefType) null);
			return;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__UID:
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
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__TAILPLANE_ATTACHMENT_TYPE:
			return tailplaneAttachmentType != null;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__VTP_INTERFACE_DEFINITIONS:
			return vtpInterfaceDefinitions != null;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__HTP_INTERFACE_DEFINITIONS:
			return htpInterfaceDefinitions != null;
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE__UID:
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

} //TailplaneAttachmentAreaTypeImpl
