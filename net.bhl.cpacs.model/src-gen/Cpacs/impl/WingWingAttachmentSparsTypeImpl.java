/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.WingWingAttachmentSparsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Wing Attachment Spars Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingWingAttachmentSparsTypeImpl#getFromSparUID <em>From Spar UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingWingAttachmentSparsTypeImpl#getToSparUID <em>To Spar UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingWingAttachmentSparsTypeImpl extends ComplexBaseTypeImpl implements WingWingAttachmentSparsType {
	/**
	 * The cached value of the '{@link #getFromSparUID() <em>From Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSparUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromSparUID;

	/**
	 * The cached value of the '{@link #getToSparUID() <em>To Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSparUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toSparUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingWingAttachmentSparsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingWingAttachmentSparsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromSparUID() {
		return fromSparUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromSparUID(StringUIDBaseType newFromSparUID, NotificationChain msgs) {
		StringUIDBaseType oldFromSparUID = fromSparUID;
		fromSparUID = newFromSparUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID, oldFromSparUID, newFromSparUID);
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
	public void setFromSparUID(StringUIDBaseType newFromSparUID) {
		if (newFromSparUID != fromSparUID) {
			NotificationChain msgs = null;
			if (fromSparUID != null)
				msgs = ((InternalEObject) fromSparUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID, null,
						msgs);
			if (newFromSparUID != null)
				msgs = ((InternalEObject) newFromSparUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID, null,
						msgs);
			msgs = basicSetFromSparUID(newFromSparUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID, newFromSparUID, newFromSparUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToSparUID() {
		return toSparUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToSparUID(StringUIDBaseType newToSparUID, NotificationChain msgs) {
		StringUIDBaseType oldToSparUID = toSparUID;
		toSparUID = newToSparUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID, oldToSparUID, newToSparUID);
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
	public void setToSparUID(StringUIDBaseType newToSparUID) {
		if (newToSparUID != toSparUID) {
			NotificationChain msgs = null;
			if (toSparUID != null)
				msgs = ((InternalEObject) toSparUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID, null, msgs);
			if (newToSparUID != null)
				msgs = ((InternalEObject) newToSparUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID, null, msgs);
			msgs = basicSetToSparUID(newToSparUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID, newToSparUID, newToSparUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID:
			return basicSetFromSparUID(null, msgs);
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID:
			return basicSetToSparUID(null, msgs);
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
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID:
			return getFromSparUID();
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID:
			return getToSparUID();
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
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID:
			setFromSparUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID:
			setToSparUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID:
			setFromSparUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID:
			setToSparUID((StringUIDBaseType) null);
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
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__FROM_SPAR_UID:
			return fromSparUID != null;
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE__TO_SPAR_UID:
			return toSparUID != null;
		}
		return super.eIsSet(featureID);
	}

} //WingWingAttachmentSparsTypeImpl
