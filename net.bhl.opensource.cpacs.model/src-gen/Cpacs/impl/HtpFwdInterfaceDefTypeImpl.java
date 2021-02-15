/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.HtpFwdInterfaceDefType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Htp Fwd Interface Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.HtpFwdInterfaceDefTypeImpl#getHtpFwdReinfRelWidth <em>Htp Fwd Reinf Rel Width</em>}</li>
 *   <li>{@link Cpacs.impl.HtpFwdInterfaceDefTypeImpl#getHtpFwdPlateWidth <em>Htp Fwd Plate Width</em>}</li>
 *   <li>{@link Cpacs.impl.HtpFwdInterfaceDefTypeImpl#getHtpFwdPlateXElemUID <em>Htp Fwd Plate XElem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpFwdInterfaceDefTypeImpl#getHtpFwdPlateZElemUID <em>Htp Fwd Plate ZElem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpFwdInterfaceDefTypeImpl#getHtpFwdPlateZReinfStructElemUID <em>Htp Fwd Plate ZReinf Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpFwdInterfaceDefTypeImpl#getHtpFwdAttachmentStructElemUID <em>Htp Fwd Attachment Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpFwdInterfaceDefTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HtpFwdInterfaceDefTypeImpl extends ComplexBaseTypeImpl implements HtpFwdInterfaceDefType {
	/**
	 * The cached value of the '{@link #getHtpFwdReinfRelWidth() <em>Htp Fwd Reinf Rel Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpFwdReinfRelWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType htpFwdReinfRelWidth;

	/**
	 * The cached value of the '{@link #getHtpFwdPlateWidth() <em>Htp Fwd Plate Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpFwdPlateWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType htpFwdPlateWidth;

	/**
	 * The cached value of the '{@link #getHtpFwdPlateXElemUID() <em>Htp Fwd Plate XElem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpFwdPlateXElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpFwdPlateXElemUID;

	/**
	 * The cached value of the '{@link #getHtpFwdPlateZElemUID() <em>Htp Fwd Plate ZElem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpFwdPlateZElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpFwdPlateZElemUID;

	/**
	 * The cached value of the '{@link #getHtpFwdPlateZReinfStructElemUID() <em>Htp Fwd Plate ZReinf Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpFwdPlateZReinfStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpFwdPlateZReinfStructElemUID;

	/**
	 * The cached value of the '{@link #getHtpFwdAttachmentStructElemUID() <em>Htp Fwd Attachment Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpFwdAttachmentStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpFwdAttachmentStructElemUID;

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
	protected HtpFwdInterfaceDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getHtpFwdInterfaceDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHtpFwdReinfRelWidth() {
		return htpFwdReinfRelWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpFwdReinfRelWidth(DoubleBaseType newHtpFwdReinfRelWidth,
			NotificationChain msgs) {
		DoubleBaseType oldHtpFwdReinfRelWidth = htpFwdReinfRelWidth;
		htpFwdReinfRelWidth = newHtpFwdReinfRelWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH, oldHtpFwdReinfRelWidth,
					newHtpFwdReinfRelWidth);
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
	public void setHtpFwdReinfRelWidth(DoubleBaseType newHtpFwdReinfRelWidth) {
		if (newHtpFwdReinfRelWidth != htpFwdReinfRelWidth) {
			NotificationChain msgs = null;
			if (htpFwdReinfRelWidth != null)
				msgs = ((InternalEObject) htpFwdReinfRelWidth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH, null,
						msgs);
			if (newHtpFwdReinfRelWidth != null)
				msgs = ((InternalEObject) newHtpFwdReinfRelWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH, null,
						msgs);
			msgs = basicSetHtpFwdReinfRelWidth(newHtpFwdReinfRelWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH, newHtpFwdReinfRelWidth,
					newHtpFwdReinfRelWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHtpFwdPlateWidth() {
		return htpFwdPlateWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpFwdPlateWidth(DoubleBaseType newHtpFwdPlateWidth, NotificationChain msgs) {
		DoubleBaseType oldHtpFwdPlateWidth = htpFwdPlateWidth;
		htpFwdPlateWidth = newHtpFwdPlateWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH, oldHtpFwdPlateWidth,
					newHtpFwdPlateWidth);
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
	public void setHtpFwdPlateWidth(DoubleBaseType newHtpFwdPlateWidth) {
		if (newHtpFwdPlateWidth != htpFwdPlateWidth) {
			NotificationChain msgs = null;
			if (htpFwdPlateWidth != null)
				msgs = ((InternalEObject) htpFwdPlateWidth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH, null,
						msgs);
			if (newHtpFwdPlateWidth != null)
				msgs = ((InternalEObject) newHtpFwdPlateWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH, null,
						msgs);
			msgs = basicSetHtpFwdPlateWidth(newHtpFwdPlateWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH, newHtpFwdPlateWidth,
					newHtpFwdPlateWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpFwdPlateXElemUID() {
		return htpFwdPlateXElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpFwdPlateXElemUID(StringUIDBaseType newHtpFwdPlateXElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHtpFwdPlateXElemUID = htpFwdPlateXElemUID;
		htpFwdPlateXElemUID = newHtpFwdPlateXElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID, oldHtpFwdPlateXElemUID,
					newHtpFwdPlateXElemUID);
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
	public void setHtpFwdPlateXElemUID(StringUIDBaseType newHtpFwdPlateXElemUID) {
		if (newHtpFwdPlateXElemUID != htpFwdPlateXElemUID) {
			NotificationChain msgs = null;
			if (htpFwdPlateXElemUID != null)
				msgs = ((InternalEObject) htpFwdPlateXElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID, null,
						msgs);
			if (newHtpFwdPlateXElemUID != null)
				msgs = ((InternalEObject) newHtpFwdPlateXElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID, null,
						msgs);
			msgs = basicSetHtpFwdPlateXElemUID(newHtpFwdPlateXElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID, newHtpFwdPlateXElemUID,
					newHtpFwdPlateXElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpFwdPlateZElemUID() {
		return htpFwdPlateZElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpFwdPlateZElemUID(StringUIDBaseType newHtpFwdPlateZElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHtpFwdPlateZElemUID = htpFwdPlateZElemUID;
		htpFwdPlateZElemUID = newHtpFwdPlateZElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID, oldHtpFwdPlateZElemUID,
					newHtpFwdPlateZElemUID);
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
	public void setHtpFwdPlateZElemUID(StringUIDBaseType newHtpFwdPlateZElemUID) {
		if (newHtpFwdPlateZElemUID != htpFwdPlateZElemUID) {
			NotificationChain msgs = null;
			if (htpFwdPlateZElemUID != null)
				msgs = ((InternalEObject) htpFwdPlateZElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID, null,
						msgs);
			if (newHtpFwdPlateZElemUID != null)
				msgs = ((InternalEObject) newHtpFwdPlateZElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID, null,
						msgs);
			msgs = basicSetHtpFwdPlateZElemUID(newHtpFwdPlateZElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID, newHtpFwdPlateZElemUID,
					newHtpFwdPlateZElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpFwdPlateZReinfStructElemUID() {
		return htpFwdPlateZReinfStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpFwdPlateZReinfStructElemUID(StringUIDBaseType newHtpFwdPlateZReinfStructElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHtpFwdPlateZReinfStructElemUID = htpFwdPlateZReinfStructElemUID;
		htpFwdPlateZReinfStructElemUID = newHtpFwdPlateZReinfStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID,
					oldHtpFwdPlateZReinfStructElemUID, newHtpFwdPlateZReinfStructElemUID);
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
	public void setHtpFwdPlateZReinfStructElemUID(StringUIDBaseType newHtpFwdPlateZReinfStructElemUID) {
		if (newHtpFwdPlateZReinfStructElemUID != htpFwdPlateZReinfStructElemUID) {
			NotificationChain msgs = null;
			if (htpFwdPlateZReinfStructElemUID != null)
				msgs = ((InternalEObject) htpFwdPlateZReinfStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID,
						null, msgs);
			if (newHtpFwdPlateZReinfStructElemUID != null)
				msgs = ((InternalEObject) newHtpFwdPlateZReinfStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetHtpFwdPlateZReinfStructElemUID(newHtpFwdPlateZReinfStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID,
					newHtpFwdPlateZReinfStructElemUID, newHtpFwdPlateZReinfStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpFwdAttachmentStructElemUID() {
		return htpFwdAttachmentStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpFwdAttachmentStructElemUID(StringUIDBaseType newHtpFwdAttachmentStructElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHtpFwdAttachmentStructElemUID = htpFwdAttachmentStructElemUID;
		htpFwdAttachmentStructElemUID = newHtpFwdAttachmentStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID,
					oldHtpFwdAttachmentStructElemUID, newHtpFwdAttachmentStructElemUID);
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
	public void setHtpFwdAttachmentStructElemUID(StringUIDBaseType newHtpFwdAttachmentStructElemUID) {
		if (newHtpFwdAttachmentStructElemUID != htpFwdAttachmentStructElemUID) {
			NotificationChain msgs = null;
			if (htpFwdAttachmentStructElemUID != null)
				msgs = ((InternalEObject) htpFwdAttachmentStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID,
						null, msgs);
			if (newHtpFwdAttachmentStructElemUID != null)
				msgs = ((InternalEObject) newHtpFwdAttachmentStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetHtpFwdAttachmentStructElemUID(newHtpFwdAttachmentStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID,
					newHtpFwdAttachmentStructElemUID, newHtpFwdAttachmentStructElemUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__UID, oldUID,
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
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH:
			return basicSetHtpFwdReinfRelWidth(null, msgs);
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH:
			return basicSetHtpFwdPlateWidth(null, msgs);
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID:
			return basicSetHtpFwdPlateXElemUID(null, msgs);
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID:
			return basicSetHtpFwdPlateZElemUID(null, msgs);
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID:
			return basicSetHtpFwdPlateZReinfStructElemUID(null, msgs);
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID:
			return basicSetHtpFwdAttachmentStructElemUID(null, msgs);
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
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH:
			return getHtpFwdReinfRelWidth();
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH:
			return getHtpFwdPlateWidth();
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID:
			return getHtpFwdPlateXElemUID();
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID:
			return getHtpFwdPlateZElemUID();
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID:
			return getHtpFwdPlateZReinfStructElemUID();
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID:
			return getHtpFwdAttachmentStructElemUID();
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH:
			setHtpFwdReinfRelWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH:
			setHtpFwdPlateWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID:
			setHtpFwdPlateXElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID:
			setHtpFwdPlateZElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID:
			setHtpFwdPlateZReinfStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID:
			setHtpFwdAttachmentStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH:
			setHtpFwdReinfRelWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH:
			setHtpFwdPlateWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID:
			setHtpFwdPlateXElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID:
			setHtpFwdPlateZElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID:
			setHtpFwdPlateZReinfStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID:
			setHtpFwdAttachmentStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_REINF_REL_WIDTH:
			return htpFwdReinfRelWidth != null;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_WIDTH:
			return htpFwdPlateWidth != null;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_XELEM_UID:
			return htpFwdPlateXElemUID != null;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZELEM_UID:
			return htpFwdPlateZElemUID != null;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_PLATE_ZREINF_STRUCT_ELEM_UID:
			return htpFwdPlateZReinfStructElemUID != null;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__HTP_FWD_ATTACHMENT_STRUCT_ELEM_UID:
			return htpFwdAttachmentStructElemUID != null;
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE__UID:
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

} //HtpFwdInterfaceDefTypeImpl
