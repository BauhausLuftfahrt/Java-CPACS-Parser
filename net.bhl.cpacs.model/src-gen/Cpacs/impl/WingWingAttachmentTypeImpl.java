/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.WingWingAttachmentElementsType;
import Cpacs.WingWingAttachmentType;
import Cpacs.WingWingAttachmentsSparsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Wing Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingWingAttachmentTypeImpl#getToComponentSegmentUID <em>To Component Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingWingAttachmentTypeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link Cpacs.impl.WingWingAttachmentTypeImpl#getSparAttachments <em>Spar Attachments</em>}</li>
 *   <li>{@link Cpacs.impl.WingWingAttachmentTypeImpl#getUpperShellAttachment <em>Upper Shell Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.WingWingAttachmentTypeImpl#getLowerShellAttachment <em>Lower Shell Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingWingAttachmentTypeImpl extends ComplexBaseTypeImpl implements WingWingAttachmentType {
	/**
	 * The cached value of the '{@link #getToComponentSegmentUID() <em>To Component Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToComponentSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toComponentSegmentUID;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected WingWingAttachmentElementsType elements;

	/**
	 * The cached value of the '{@link #getSparAttachments() <em>Spar Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparAttachments()
	 * @generated
	 * @ordered
	 */
	protected WingWingAttachmentsSparsType sparAttachments;

	/**
	 * The cached value of the '{@link #getUpperShellAttachment() <em>Upper Shell Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperShellAttachment()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType upperShellAttachment;

	/**
	 * The cached value of the '{@link #getLowerShellAttachment() <em>Lower Shell Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerShellAttachment()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType lowerShellAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingWingAttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingWingAttachmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToComponentSegmentUID() {
		return toComponentSegmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToComponentSegmentUID(StringUIDBaseType newToComponentSegmentUID,
			NotificationChain msgs) {
		StringUIDBaseType oldToComponentSegmentUID = toComponentSegmentUID;
		toComponentSegmentUID = newToComponentSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID, oldToComponentSegmentUID,
					newToComponentSegmentUID);
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
	public void setToComponentSegmentUID(StringUIDBaseType newToComponentSegmentUID) {
		if (newToComponentSegmentUID != toComponentSegmentUID) {
			NotificationChain msgs = null;
			if (toComponentSegmentUID != null)
				msgs = ((InternalEObject) toComponentSegmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID, null,
						msgs);
			if (newToComponentSegmentUID != null)
				msgs = ((InternalEObject) newToComponentSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID, null,
						msgs);
			msgs = basicSetToComponentSegmentUID(newToComponentSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID, newToComponentSegmentUID,
					newToComponentSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingWingAttachmentElementsType getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(WingWingAttachmentElementsType newElements, NotificationChain msgs) {
		WingWingAttachmentElementsType oldElements = elements;
		elements = newElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS, oldElements, newElements);
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
	public void setElements(WingWingAttachmentElementsType newElements) {
		if (newElements != elements) {
			NotificationChain msgs = null;
			if (elements != null)
				msgs = ((InternalEObject) elements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS, null, msgs);
			if (newElements != null)
				msgs = ((InternalEObject) newElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS, null, msgs);
			msgs = basicSetElements(newElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS,
					newElements, newElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingWingAttachmentsSparsType getSparAttachments() {
		return sparAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparAttachments(WingWingAttachmentsSparsType newSparAttachments,
			NotificationChain msgs) {
		WingWingAttachmentsSparsType oldSparAttachments = sparAttachments;
		sparAttachments = newSparAttachments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS, oldSparAttachments, newSparAttachments);
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
	public void setSparAttachments(WingWingAttachmentsSparsType newSparAttachments) {
		if (newSparAttachments != sparAttachments) {
			NotificationChain msgs = null;
			if (sparAttachments != null)
				msgs = ((InternalEObject) sparAttachments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS, null, msgs);
			if (newSparAttachments != null)
				msgs = ((InternalEObject) newSparAttachments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS, null, msgs);
			msgs = basicSetSparAttachments(newSparAttachments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS, newSparAttachments, newSparAttachments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getUpperShellAttachment() {
		return upperShellAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperShellAttachment(StringUIDBaseType newUpperShellAttachment,
			NotificationChain msgs) {
		StringUIDBaseType oldUpperShellAttachment = upperShellAttachment;
		upperShellAttachment = newUpperShellAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT, oldUpperShellAttachment,
					newUpperShellAttachment);
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
	public void setUpperShellAttachment(StringUIDBaseType newUpperShellAttachment) {
		if (newUpperShellAttachment != upperShellAttachment) {
			NotificationChain msgs = null;
			if (upperShellAttachment != null)
				msgs = ((InternalEObject) upperShellAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT, null,
						msgs);
			if (newUpperShellAttachment != null)
				msgs = ((InternalEObject) newUpperShellAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT, null,
						msgs);
			msgs = basicSetUpperShellAttachment(newUpperShellAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT, newUpperShellAttachment,
					newUpperShellAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getLowerShellAttachment() {
		return lowerShellAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerShellAttachment(StringUIDBaseType newLowerShellAttachment,
			NotificationChain msgs) {
		StringUIDBaseType oldLowerShellAttachment = lowerShellAttachment;
		lowerShellAttachment = newLowerShellAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT, oldLowerShellAttachment,
					newLowerShellAttachment);
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
	public void setLowerShellAttachment(StringUIDBaseType newLowerShellAttachment) {
		if (newLowerShellAttachment != lowerShellAttachment) {
			NotificationChain msgs = null;
			if (lowerShellAttachment != null)
				msgs = ((InternalEObject) lowerShellAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT, null,
						msgs);
			if (newLowerShellAttachment != null)
				msgs = ((InternalEObject) newLowerShellAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT, null,
						msgs);
			msgs = basicSetLowerShellAttachment(newLowerShellAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT, newLowerShellAttachment,
					newLowerShellAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID:
			return basicSetToComponentSegmentUID(null, msgs);
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS:
			return basicSetElements(null, msgs);
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS:
			return basicSetSparAttachments(null, msgs);
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT:
			return basicSetUpperShellAttachment(null, msgs);
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT:
			return basicSetLowerShellAttachment(null, msgs);
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
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID:
			return getToComponentSegmentUID();
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS:
			return getElements();
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS:
			return getSparAttachments();
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT:
			return getUpperShellAttachment();
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT:
			return getLowerShellAttachment();
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
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID:
			setToComponentSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS:
			setElements((WingWingAttachmentElementsType) newValue);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS:
			setSparAttachments((WingWingAttachmentsSparsType) newValue);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT:
			setUpperShellAttachment((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT:
			setLowerShellAttachment((StringUIDBaseType) newValue);
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
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID:
			setToComponentSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS:
			setElements((WingWingAttachmentElementsType) null);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS:
			setSparAttachments((WingWingAttachmentsSparsType) null);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT:
			setUpperShellAttachment((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT:
			setLowerShellAttachment((StringUIDBaseType) null);
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
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__TO_COMPONENT_SEGMENT_UID:
			return toComponentSegmentUID != null;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__ELEMENTS:
			return elements != null;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__SPAR_ATTACHMENTS:
			return sparAttachments != null;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__UPPER_SHELL_ATTACHMENT:
			return upperShellAttachment != null;
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE__LOWER_SHELL_ATTACHMENT:
			return lowerShellAttachment != null;
		}
		return super.eIsSet(featureID);
	}

} //WingWingAttachmentTypeImpl
