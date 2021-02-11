/**
 */
package Cpacs.impl;

import Cpacs.AttachmentPinType;
import Cpacs.AttachmentPinsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Pins Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AttachmentPinsTypeImpl#getAttachmentPin <em>Attachment Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentPinsTypeImpl extends ComplexBaseTypeImpl implements AttachmentPinsType {
	/**
	 * The cached value of the '{@link #getAttachmentPin() <em>Attachment Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentPin()
	 * @generated
	 * @ordered
	 */
	protected EList<AttachmentPinType> attachmentPin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentPinsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAttachmentPinsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttachmentPinType> getAttachmentPin() {
		if (attachmentPin == null) {
			attachmentPin = new EObjectContainmentEList<AttachmentPinType>(AttachmentPinType.class, this,
					CpacsPackage.ATTACHMENT_PINS_TYPE__ATTACHMENT_PIN);
		}
		return attachmentPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ATTACHMENT_PINS_TYPE__ATTACHMENT_PIN:
			return ((InternalEList<?>) getAttachmentPin()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ATTACHMENT_PINS_TYPE__ATTACHMENT_PIN:
			return getAttachmentPin();
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
		case CpacsPackage.ATTACHMENT_PINS_TYPE__ATTACHMENT_PIN:
			getAttachmentPin().clear();
			getAttachmentPin().addAll((Collection<? extends AttachmentPinType>) newValue);
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
		case CpacsPackage.ATTACHMENT_PINS_TYPE__ATTACHMENT_PIN:
			getAttachmentPin().clear();
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
		case CpacsPackage.ATTACHMENT_PINS_TYPE__ATTACHMENT_PIN:
			return attachmentPin != null && !attachmentPin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttachmentPinsTypeImpl
