/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingWingAttachmentSparsType;
import Cpacs.WingWingAttachmentsSparsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Wing Attachments Spars Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingWingAttachmentsSparsTypeImpl#getSparAttachment <em>Spar Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingWingAttachmentsSparsTypeImpl extends ComplexBaseTypeImpl implements WingWingAttachmentsSparsType {
	/**
	 * The cached value of the '{@link #getSparAttachment() <em>Spar Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<WingWingAttachmentSparsType> sparAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingWingAttachmentsSparsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingWingAttachmentsSparsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingWingAttachmentSparsType> getSparAttachment() {
		if (sparAttachment == null) {
			sparAttachment = new EObjectContainmentEList<WingWingAttachmentSparsType>(WingWingAttachmentSparsType.class,
					this, CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE__SPAR_ATTACHMENT);
		}
		return sparAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE__SPAR_ATTACHMENT:
			return ((InternalEList<?>) getSparAttachment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE__SPAR_ATTACHMENT:
			return getSparAttachment();
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
		case CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE__SPAR_ATTACHMENT:
			getSparAttachment().clear();
			getSparAttachment().addAll((Collection<? extends WingWingAttachmentSparsType>) newValue);
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
		case CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE__SPAR_ATTACHMENT:
			getSparAttachment().clear();
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
		case CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE__SPAR_ATTACHMENT:
			return sparAttachment != null && !sparAttachment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingWingAttachmentsSparsTypeImpl
