/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RotorBladeAttachmentType;
import Cpacs.RotorBladeAttachmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotor Blade Attachments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorBladeAttachmentsTypeImpl#getRotorBladeAttachment <em>Rotor Blade Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorBladeAttachmentsTypeImpl extends ComplexBaseTypeImpl implements RotorBladeAttachmentsType {
	/**
	 * The cached value of the '{@link #getRotorBladeAttachment() <em>Rotor Blade Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotorBladeAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<RotorBladeAttachmentType> rotorBladeAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotorBladeAttachmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorBladeAttachmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RotorBladeAttachmentType> getRotorBladeAttachment() {
		if (rotorBladeAttachment == null) {
			rotorBladeAttachment = new EObjectContainmentEList<RotorBladeAttachmentType>(RotorBladeAttachmentType.class,
					this, CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE__ROTOR_BLADE_ATTACHMENT);
		}
		return rotorBladeAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE__ROTOR_BLADE_ATTACHMENT:
			return ((InternalEList<?>) getRotorBladeAttachment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE__ROTOR_BLADE_ATTACHMENT:
			return getRotorBladeAttachment();
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE__ROTOR_BLADE_ATTACHMENT:
			getRotorBladeAttachment().clear();
			getRotorBladeAttachment().addAll((Collection<? extends RotorBladeAttachmentType>) newValue);
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE__ROTOR_BLADE_ATTACHMENT:
			getRotorBladeAttachment().clear();
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
		case CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE__ROTOR_BLADE_ATTACHMENT:
			return rotorBladeAttachment != null && !rotorBladeAttachment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RotorBladeAttachmentsTypeImpl
