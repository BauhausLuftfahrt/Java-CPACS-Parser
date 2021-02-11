/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.WingWingAttachmentElementsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Wing Attachment Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingWingAttachmentElementsTypeImpl#getFromElementUID <em>From Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingWingAttachmentElementsTypeImpl#getToElementUID <em>To Element UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingWingAttachmentElementsTypeImpl extends ComplexBaseTypeImpl implements WingWingAttachmentElementsType {
	/**
	 * The cached value of the '{@link #getFromElementUID() <em>From Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromElementUID;

	/**
	 * The cached value of the '{@link #getToElementUID() <em>To Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toElementUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingWingAttachmentElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingWingAttachmentElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromElementUID() {
		return fromElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromElementUID(StringUIDBaseType newFromElementUID, NotificationChain msgs) {
		StringUIDBaseType oldFromElementUID = fromElementUID;
		fromElementUID = newFromElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID, oldFromElementUID,
					newFromElementUID);
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
	public void setFromElementUID(StringUIDBaseType newFromElementUID) {
		if (newFromElementUID != fromElementUID) {
			NotificationChain msgs = null;
			if (fromElementUID != null)
				msgs = ((InternalEObject) fromElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID,
						null, msgs);
			if (newFromElementUID != null)
				msgs = ((InternalEObject) newFromElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID,
						null, msgs);
			msgs = basicSetFromElementUID(newFromElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID, newFromElementUID,
					newFromElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToElementUID() {
		return toElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToElementUID(StringUIDBaseType newToElementUID, NotificationChain msgs) {
		StringUIDBaseType oldToElementUID = toElementUID;
		toElementUID = newToElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID, oldToElementUID, newToElementUID);
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
	public void setToElementUID(StringUIDBaseType newToElementUID) {
		if (newToElementUID != toElementUID) {
			NotificationChain msgs = null;
			if (toElementUID != null)
				msgs = ((InternalEObject) toElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID, null,
						msgs);
			if (newToElementUID != null)
				msgs = ((InternalEObject) newToElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID, null,
						msgs);
			msgs = basicSetToElementUID(newToElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID, newToElementUID, newToElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID:
			return basicSetFromElementUID(null, msgs);
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID:
			return basicSetToElementUID(null, msgs);
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
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID:
			return getFromElementUID();
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID:
			return getToElementUID();
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
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID:
			setFromElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID:
			setToElementUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID:
			setFromElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID:
			setToElementUID((StringUIDBaseType) null);
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
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__FROM_ELEMENT_UID:
			return fromElementUID != null;
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE__TO_ELEMENT_UID:
			return toElementUID != null;
		}
		return super.eIsSet(featureID);
	}

} //WingWingAttachmentElementsTypeImpl
