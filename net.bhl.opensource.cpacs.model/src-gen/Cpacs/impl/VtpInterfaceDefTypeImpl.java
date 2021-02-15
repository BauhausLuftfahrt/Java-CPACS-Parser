/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.VtpFrameDefType;
import Cpacs.VtpInterfaceDefType;

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
 * An implementation of the model object '<em><b>Vtp Interface Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.VtpInterfaceDefTypeImpl#getVtpFrameDefinitions <em>Vtp Frame Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.VtpInterfaceDefTypeImpl#getVtpAreaToleranceX <em>Vtp Area Tolerance X</em>}</li>
 *   <li>{@link Cpacs.impl.VtpInterfaceDefTypeImpl#getVtpAreaToleranceZ <em>Vtp Area Tolerance Z</em>}</li>
 *   <li>{@link Cpacs.impl.VtpInterfaceDefTypeImpl#getVtpReinfRelZ <em>Vtp Reinf Rel Z</em>}</li>
 *   <li>{@link Cpacs.impl.VtpInterfaceDefTypeImpl#getVtpReinfRelWidth <em>Vtp Reinf Rel Width</em>}</li>
 *   <li>{@link Cpacs.impl.VtpInterfaceDefTypeImpl#getVtpIntersectionArc <em>Vtp Intersection Arc</em>}</li>
 *   <li>{@link Cpacs.impl.VtpInterfaceDefTypeImpl#getVtpAttachmentStructElemUID <em>Vtp Attachment Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.VtpInterfaceDefTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VtpInterfaceDefTypeImpl extends ComplexBaseTypeImpl implements VtpInterfaceDefType {
	/**
	 * The cached value of the '{@link #getVtpFrameDefinitions() <em>Vtp Frame Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpFrameDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<VtpFrameDefType> vtpFrameDefinitions;

	/**
	 * The cached value of the '{@link #getVtpAreaToleranceX() <em>Vtp Area Tolerance X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpAreaToleranceX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vtpAreaToleranceX;

	/**
	 * The cached value of the '{@link #getVtpAreaToleranceZ() <em>Vtp Area Tolerance Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpAreaToleranceZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vtpAreaToleranceZ;

	/**
	 * The cached value of the '{@link #getVtpReinfRelZ() <em>Vtp Reinf Rel Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpReinfRelZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vtpReinfRelZ;

	/**
	 * The cached value of the '{@link #getVtpReinfRelWidth() <em>Vtp Reinf Rel Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpReinfRelWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vtpReinfRelWidth;

	/**
	 * The cached value of the '{@link #getVtpIntersectionArc() <em>Vtp Intersection Arc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpIntersectionArc()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vtpIntersectionArc;

	/**
	 * The cached value of the '{@link #getVtpAttachmentStructElemUID() <em>Vtp Attachment Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtpAttachmentStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType vtpAttachmentStructElemUID;

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
	protected VtpInterfaceDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getVtpInterfaceDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VtpFrameDefType> getVtpFrameDefinitions() {
		if (vtpFrameDefinitions == null) {
			vtpFrameDefinitions = new EObjectContainmentEList<VtpFrameDefType>(VtpFrameDefType.class, this,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_FRAME_DEFINITIONS);
		}
		return vtpFrameDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVtpAreaToleranceX() {
		return vtpAreaToleranceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpAreaToleranceX(DoubleBaseType newVtpAreaToleranceX, NotificationChain msgs) {
		DoubleBaseType oldVtpAreaToleranceX = vtpAreaToleranceX;
		vtpAreaToleranceX = newVtpAreaToleranceX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X, oldVtpAreaToleranceX,
					newVtpAreaToleranceX);
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
	public void setVtpAreaToleranceX(DoubleBaseType newVtpAreaToleranceX) {
		if (newVtpAreaToleranceX != vtpAreaToleranceX) {
			NotificationChain msgs = null;
			if (vtpAreaToleranceX != null)
				msgs = ((InternalEObject) vtpAreaToleranceX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X, null, msgs);
			if (newVtpAreaToleranceX != null)
				msgs = ((InternalEObject) newVtpAreaToleranceX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X, null, msgs);
			msgs = basicSetVtpAreaToleranceX(newVtpAreaToleranceX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X, newVtpAreaToleranceX,
					newVtpAreaToleranceX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVtpAreaToleranceZ() {
		return vtpAreaToleranceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpAreaToleranceZ(DoubleBaseType newVtpAreaToleranceZ, NotificationChain msgs) {
		DoubleBaseType oldVtpAreaToleranceZ = vtpAreaToleranceZ;
		vtpAreaToleranceZ = newVtpAreaToleranceZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z, oldVtpAreaToleranceZ,
					newVtpAreaToleranceZ);
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
	public void setVtpAreaToleranceZ(DoubleBaseType newVtpAreaToleranceZ) {
		if (newVtpAreaToleranceZ != vtpAreaToleranceZ) {
			NotificationChain msgs = null;
			if (vtpAreaToleranceZ != null)
				msgs = ((InternalEObject) vtpAreaToleranceZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z, null, msgs);
			if (newVtpAreaToleranceZ != null)
				msgs = ((InternalEObject) newVtpAreaToleranceZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z, null, msgs);
			msgs = basicSetVtpAreaToleranceZ(newVtpAreaToleranceZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z, newVtpAreaToleranceZ,
					newVtpAreaToleranceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVtpReinfRelZ() {
		return vtpReinfRelZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpReinfRelZ(DoubleBaseType newVtpReinfRelZ, NotificationChain msgs) {
		DoubleBaseType oldVtpReinfRelZ = vtpReinfRelZ;
		vtpReinfRelZ = newVtpReinfRelZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z, oldVtpReinfRelZ, newVtpReinfRelZ);
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
	public void setVtpReinfRelZ(DoubleBaseType newVtpReinfRelZ) {
		if (newVtpReinfRelZ != vtpReinfRelZ) {
			NotificationChain msgs = null;
			if (vtpReinfRelZ != null)
				msgs = ((InternalEObject) vtpReinfRelZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z, null, msgs);
			if (newVtpReinfRelZ != null)
				msgs = ((InternalEObject) newVtpReinfRelZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z, null, msgs);
			msgs = basicSetVtpReinfRelZ(newVtpReinfRelZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z,
					newVtpReinfRelZ, newVtpReinfRelZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVtpReinfRelWidth() {
		return vtpReinfRelWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpReinfRelWidth(DoubleBaseType newVtpReinfRelWidth, NotificationChain msgs) {
		DoubleBaseType oldVtpReinfRelWidth = vtpReinfRelWidth;
		vtpReinfRelWidth = newVtpReinfRelWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH, oldVtpReinfRelWidth, newVtpReinfRelWidth);
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
	public void setVtpReinfRelWidth(DoubleBaseType newVtpReinfRelWidth) {
		if (newVtpReinfRelWidth != vtpReinfRelWidth) {
			NotificationChain msgs = null;
			if (vtpReinfRelWidth != null)
				msgs = ((InternalEObject) vtpReinfRelWidth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH, null, msgs);
			if (newVtpReinfRelWidth != null)
				msgs = ((InternalEObject) newVtpReinfRelWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH, null, msgs);
			msgs = basicSetVtpReinfRelWidth(newVtpReinfRelWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH, newVtpReinfRelWidth,
					newVtpReinfRelWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVtpIntersectionArc() {
		return vtpIntersectionArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpIntersectionArc(DoubleBaseType newVtpIntersectionArc, NotificationChain msgs) {
		DoubleBaseType oldVtpIntersectionArc = vtpIntersectionArc;
		vtpIntersectionArc = newVtpIntersectionArc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC, oldVtpIntersectionArc,
					newVtpIntersectionArc);
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
	public void setVtpIntersectionArc(DoubleBaseType newVtpIntersectionArc) {
		if (newVtpIntersectionArc != vtpIntersectionArc) {
			NotificationChain msgs = null;
			if (vtpIntersectionArc != null)
				msgs = ((InternalEObject) vtpIntersectionArc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC, null, msgs);
			if (newVtpIntersectionArc != null)
				msgs = ((InternalEObject) newVtpIntersectionArc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC, null, msgs);
			msgs = basicSetVtpIntersectionArc(newVtpIntersectionArc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC, newVtpIntersectionArc,
					newVtpIntersectionArc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getVtpAttachmentStructElemUID() {
		return vtpAttachmentStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtpAttachmentStructElemUID(StringUIDBaseType newVtpAttachmentStructElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldVtpAttachmentStructElemUID = vtpAttachmentStructElemUID;
		vtpAttachmentStructElemUID = newVtpAttachmentStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID, oldVtpAttachmentStructElemUID,
					newVtpAttachmentStructElemUID);
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
	public void setVtpAttachmentStructElemUID(StringUIDBaseType newVtpAttachmentStructElemUID) {
		if (newVtpAttachmentStructElemUID != vtpAttachmentStructElemUID) {
			NotificationChain msgs = null;
			if (vtpAttachmentStructElemUID != null)
				msgs = ((InternalEObject) vtpAttachmentStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID,
						null, msgs);
			if (newVtpAttachmentStructElemUID != null)
				msgs = ((InternalEObject) newVtpAttachmentStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetVtpAttachmentStructElemUID(newVtpAttachmentStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID, newVtpAttachmentStructElemUID,
					newVtpAttachmentStructElemUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VTP_INTERFACE_DEF_TYPE__UID, oldUID,
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
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_FRAME_DEFINITIONS:
			return ((InternalEList<?>) getVtpFrameDefinitions()).basicRemove(otherEnd, msgs);
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X:
			return basicSetVtpAreaToleranceX(null, msgs);
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z:
			return basicSetVtpAreaToleranceZ(null, msgs);
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z:
			return basicSetVtpReinfRelZ(null, msgs);
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH:
			return basicSetVtpReinfRelWidth(null, msgs);
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC:
			return basicSetVtpIntersectionArc(null, msgs);
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID:
			return basicSetVtpAttachmentStructElemUID(null, msgs);
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
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_FRAME_DEFINITIONS:
			return getVtpFrameDefinitions();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X:
			return getVtpAreaToleranceX();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z:
			return getVtpAreaToleranceZ();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z:
			return getVtpReinfRelZ();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH:
			return getVtpReinfRelWidth();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC:
			return getVtpIntersectionArc();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID:
			return getVtpAttachmentStructElemUID();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_FRAME_DEFINITIONS:
			getVtpFrameDefinitions().clear();
			getVtpFrameDefinitions().addAll((Collection<? extends VtpFrameDefType>) newValue);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X:
			setVtpAreaToleranceX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z:
			setVtpAreaToleranceZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z:
			setVtpReinfRelZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH:
			setVtpReinfRelWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC:
			setVtpIntersectionArc((DoubleBaseType) newValue);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID:
			setVtpAttachmentStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_FRAME_DEFINITIONS:
			getVtpFrameDefinitions().clear();
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X:
			setVtpAreaToleranceX((DoubleBaseType) null);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z:
			setVtpAreaToleranceZ((DoubleBaseType) null);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z:
			setVtpReinfRelZ((DoubleBaseType) null);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH:
			setVtpReinfRelWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC:
			setVtpIntersectionArc((DoubleBaseType) null);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID:
			setVtpAttachmentStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_FRAME_DEFINITIONS:
			return vtpFrameDefinitions != null && !vtpFrameDefinitions.isEmpty();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_X:
			return vtpAreaToleranceX != null;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_AREA_TOLERANCE_Z:
			return vtpAreaToleranceZ != null;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_Z:
			return vtpReinfRelZ != null;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_REINF_REL_WIDTH:
			return vtpReinfRelWidth != null;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_INTERSECTION_ARC:
			return vtpIntersectionArc != null;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__VTP_ATTACHMENT_STRUCT_ELEM_UID:
			return vtpAttachmentStructElemUID != null;
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE__UID:
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

} //VtpInterfaceDefTypeImpl
