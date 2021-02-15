/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingWingAttachmentType;
import Cpacs.WingWingAttachmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Wing Attachments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingWingAttachmentsTypeImpl#getWingWingAttachment <em>Wing Wing Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingWingAttachmentsTypeImpl extends ComplexBaseTypeImpl implements WingWingAttachmentsType {
	/**
	 * The cached value of the '{@link #getWingWingAttachment() <em>Wing Wing Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingWingAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<WingWingAttachmentType> wingWingAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingWingAttachmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingWingAttachmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingWingAttachmentType> getWingWingAttachment() {
		if (wingWingAttachment == null) {
			wingWingAttachment = new EObjectContainmentEList<WingWingAttachmentType>(WingWingAttachmentType.class, this,
					CpacsPackage.WING_WING_ATTACHMENTS_TYPE__WING_WING_ATTACHMENT);
		}
		return wingWingAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_WING_ATTACHMENTS_TYPE__WING_WING_ATTACHMENT:
			return ((InternalEList<?>) getWingWingAttachment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_WING_ATTACHMENTS_TYPE__WING_WING_ATTACHMENT:
			return getWingWingAttachment();
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
		case CpacsPackage.WING_WING_ATTACHMENTS_TYPE__WING_WING_ATTACHMENT:
			getWingWingAttachment().clear();
			getWingWingAttachment().addAll((Collection<? extends WingWingAttachmentType>) newValue);
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
		case CpacsPackage.WING_WING_ATTACHMENTS_TYPE__WING_WING_ATTACHMENT:
			getWingWingAttachment().clear();
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
		case CpacsPackage.WING_WING_ATTACHMENTS_TYPE__WING_WING_ATTACHMENT:
			return wingWingAttachment != null && !wingWingAttachment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingWingAttachmentsTypeImpl
