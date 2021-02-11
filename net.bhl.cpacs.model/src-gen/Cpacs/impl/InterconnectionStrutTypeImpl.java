/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FreePathType;
import Cpacs.InterConnectionStrutAttachmentType;
import Cpacs.InterconnectionStrutType;
import Cpacs.MaterialDefinitionType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interconnection Strut Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.InterconnectionStrutTypeImpl#getToControlSurfaceUID <em>To Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.impl.InterconnectionStrutTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.impl.InterconnectionStrutTypeImpl#getFromAttachment <em>From Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.InterconnectionStrutTypeImpl#getToAttachment <em>To Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.InterconnectionStrutTypeImpl#getFreePath <em>Free Path</em>}</li>
 *   <li>{@link Cpacs.impl.InterconnectionStrutTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterconnectionStrutTypeImpl extends ComplexBaseTypeImpl implements InterconnectionStrutType {
	/**
	 * The cached value of the '{@link #getToControlSurfaceUID() <em>To Control Surface UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToControlSurfaceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toControlSurfaceUID;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType material;

	/**
	 * The cached value of the '{@link #getFromAttachment() <em>From Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAttachment()
	 * @generated
	 * @ordered
	 */
	protected InterConnectionStrutAttachmentType fromAttachment;

	/**
	 * The cached value of the '{@link #getToAttachment() <em>To Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAttachment()
	 * @generated
	 * @ordered
	 */
	protected InterConnectionStrutAttachmentType toAttachment;

	/**
	 * The cached value of the '{@link #getFreePath() <em>Free Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePath()
	 * @generated
	 * @ordered
	 */
	protected FreePathType freePath;

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
	protected InterconnectionStrutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getInterconnectionStrutType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToControlSurfaceUID() {
		return toControlSurfaceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToControlSurfaceUID(StringUIDBaseType newToControlSurfaceUID,
			NotificationChain msgs) {
		StringUIDBaseType oldToControlSurfaceUID = toControlSurfaceUID;
		toControlSurfaceUID = newToControlSurfaceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID, oldToControlSurfaceUID,
					newToControlSurfaceUID);
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
	public void setToControlSurfaceUID(StringUIDBaseType newToControlSurfaceUID) {
		if (newToControlSurfaceUID != toControlSurfaceUID) {
			NotificationChain msgs = null;
			if (toControlSurfaceUID != null)
				msgs = ((InternalEObject) toControlSurfaceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID, null,
						msgs);
			if (newToControlSurfaceUID != null)
				msgs = ((InternalEObject) newToControlSurfaceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID, null,
						msgs);
			msgs = basicSetToControlSurfaceUID(newToControlSurfaceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID, newToControlSurfaceUID,
					newToControlSurfaceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(MaterialDefinitionType newMaterial, NotificationChain msgs) {
		MaterialDefinitionType oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL, oldMaterial, newMaterial);
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
	public void setMaterial(MaterialDefinitionType newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject) material).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject) newMaterial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL,
					newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterConnectionStrutAttachmentType getFromAttachment() {
		return fromAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromAttachment(InterConnectionStrutAttachmentType newFromAttachment,
			NotificationChain msgs) {
		InterConnectionStrutAttachmentType oldFromAttachment = fromAttachment;
		fromAttachment = newFromAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT, oldFromAttachment, newFromAttachment);
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
	public void setFromAttachment(InterConnectionStrutAttachmentType newFromAttachment) {
		if (newFromAttachment != fromAttachment) {
			NotificationChain msgs = null;
			if (fromAttachment != null)
				msgs = ((InternalEObject) fromAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT, null, msgs);
			if (newFromAttachment != null)
				msgs = ((InternalEObject) newFromAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT, null, msgs);
			msgs = basicSetFromAttachment(newFromAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT, newFromAttachment, newFromAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterConnectionStrutAttachmentType getToAttachment() {
		return toAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToAttachment(InterConnectionStrutAttachmentType newToAttachment,
			NotificationChain msgs) {
		InterConnectionStrutAttachmentType oldToAttachment = toAttachment;
		toAttachment = newToAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT, oldToAttachment, newToAttachment);
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
	public void setToAttachment(InterConnectionStrutAttachmentType newToAttachment) {
		if (newToAttachment != toAttachment) {
			NotificationChain msgs = null;
			if (toAttachment != null)
				msgs = ((InternalEObject) toAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT, null, msgs);
			if (newToAttachment != null)
				msgs = ((InternalEObject) newToAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT, null, msgs);
			msgs = basicSetToAttachment(newToAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT, newToAttachment, newToAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreePathType getFreePath() {
		return freePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreePath(FreePathType newFreePath, NotificationChain msgs) {
		FreePathType oldFreePath = freePath;
		freePath = newFreePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH, oldFreePath, newFreePath);
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
	public void setFreePath(FreePathType newFreePath) {
		if (newFreePath != freePath) {
			NotificationChain msgs = null;
			if (freePath != null)
				msgs = ((InternalEObject) freePath).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH, null, msgs);
			if (newFreePath != null)
				msgs = ((InternalEObject) newFreePath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH, null, msgs);
			msgs = basicSetFreePath(newFreePath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH,
					newFreePath, newFreePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERCONNECTION_STRUT_TYPE__UID, oldUID,
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
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID:
			return basicSetToControlSurfaceUID(null, msgs);
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL:
			return basicSetMaterial(null, msgs);
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT:
			return basicSetFromAttachment(null, msgs);
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT:
			return basicSetToAttachment(null, msgs);
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH:
			return basicSetFreePath(null, msgs);
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
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID:
			return getToControlSurfaceUID();
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL:
			return getMaterial();
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT:
			return getFromAttachment();
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT:
			return getToAttachment();
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH:
			return getFreePath();
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__UID:
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
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID:
			setToControlSurfaceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT:
			setFromAttachment((InterConnectionStrutAttachmentType) newValue);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT:
			setToAttachment((InterConnectionStrutAttachmentType) newValue);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH:
			setFreePath((FreePathType) newValue);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__UID:
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
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID:
			setToControlSurfaceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) null);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT:
			setFromAttachment((InterConnectionStrutAttachmentType) null);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT:
			setToAttachment((InterConnectionStrutAttachmentType) null);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH:
			setFreePath((FreePathType) null);
			return;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__UID:
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
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_CONTROL_SURFACE_UID:
			return toControlSurfaceUID != null;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__MATERIAL:
			return material != null;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FROM_ATTACHMENT:
			return fromAttachment != null;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__TO_ATTACHMENT:
			return toAttachment != null;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__FREE_PATH:
			return freePath != null;
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE__UID:
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

} //InterconnectionStrutTypeImpl
