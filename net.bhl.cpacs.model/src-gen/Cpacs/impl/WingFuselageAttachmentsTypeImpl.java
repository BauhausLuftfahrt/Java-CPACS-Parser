/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingFuselageAttachmentType;
import Cpacs.WingFuselageAttachmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Fuselage Attachments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingFuselageAttachmentsTypeImpl#getWingFuselageAttachment <em>Wing Fuselage Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingFuselageAttachmentsTypeImpl extends ComplexBaseTypeImpl implements WingFuselageAttachmentsType {
	/**
	 * The cached value of the '{@link #getWingFuselageAttachment() <em>Wing Fuselage Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingFuselageAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<WingFuselageAttachmentType> wingFuselageAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingFuselageAttachmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingFuselageAttachmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingFuselageAttachmentType> getWingFuselageAttachment() {
		if (wingFuselageAttachment == null) {
			wingFuselageAttachment = new EObjectContainmentEList<WingFuselageAttachmentType>(
					WingFuselageAttachmentType.class, this,
					CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE__WING_FUSELAGE_ATTACHMENT);
		}
		return wingFuselageAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE__WING_FUSELAGE_ATTACHMENT:
			return ((InternalEList<?>) getWingFuselageAttachment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE__WING_FUSELAGE_ATTACHMENT:
			return getWingFuselageAttachment();
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
		case CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE__WING_FUSELAGE_ATTACHMENT:
			getWingFuselageAttachment().clear();
			getWingFuselageAttachment().addAll((Collection<? extends WingFuselageAttachmentType>) newValue);
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
		case CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE__WING_FUSELAGE_ATTACHMENT:
			getWingFuselageAttachment().clear();
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
		case CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE__WING_FUSELAGE_ATTACHMENT:
			return wingFuselageAttachment != null && !wingFuselageAttachment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingFuselageAttachmentsTypeImpl
