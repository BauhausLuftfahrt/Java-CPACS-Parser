/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PylonAttachmentType;
import Cpacs.PylonAttachmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Attachments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonAttachmentsTypeImpl#getFrontAttachment <em>Front Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.PylonAttachmentsTypeImpl#getRearAttachment <em>Rear Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonAttachmentsTypeImpl extends ComplexBaseTypeImpl implements PylonAttachmentsType {
	/**
	 * The cached value of the '{@link #getFrontAttachment() <em>Front Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<PylonAttachmentType> frontAttachment;

	/**
	 * The cached value of the '{@link #getRearAttachment() <em>Rear Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<PylonAttachmentType> rearAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PylonAttachmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonAttachmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PylonAttachmentType> getFrontAttachment() {
		if (frontAttachment == null) {
			frontAttachment = new EObjectContainmentEList<PylonAttachmentType>(PylonAttachmentType.class, this,
					CpacsPackage.PYLON_ATTACHMENTS_TYPE__FRONT_ATTACHMENT);
		}
		return frontAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PylonAttachmentType> getRearAttachment() {
		if (rearAttachment == null) {
			rearAttachment = new EObjectContainmentEList<PylonAttachmentType>(PylonAttachmentType.class, this,
					CpacsPackage.PYLON_ATTACHMENTS_TYPE__REAR_ATTACHMENT);
		}
		return rearAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__FRONT_ATTACHMENT:
			return ((InternalEList<?>) getFrontAttachment()).basicRemove(otherEnd, msgs);
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__REAR_ATTACHMENT:
			return ((InternalEList<?>) getRearAttachment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__FRONT_ATTACHMENT:
			return getFrontAttachment();
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__REAR_ATTACHMENT:
			return getRearAttachment();
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
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__FRONT_ATTACHMENT:
			getFrontAttachment().clear();
			getFrontAttachment().addAll((Collection<? extends PylonAttachmentType>) newValue);
			return;
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__REAR_ATTACHMENT:
			getRearAttachment().clear();
			getRearAttachment().addAll((Collection<? extends PylonAttachmentType>) newValue);
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
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__FRONT_ATTACHMENT:
			getFrontAttachment().clear();
			return;
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__REAR_ATTACHMENT:
			getRearAttachment().clear();
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
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__FRONT_ATTACHMENT:
			return frontAttachment != null && !frontAttachment.isEmpty();
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE__REAR_ATTACHMENT:
			return rearAttachment != null && !rearAttachment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PylonAttachmentsTypeImpl
