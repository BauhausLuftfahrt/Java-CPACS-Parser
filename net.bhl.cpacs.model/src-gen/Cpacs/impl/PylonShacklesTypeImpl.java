/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PylonShackleType;
import Cpacs.PylonShacklesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Shackles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonShacklesTypeImpl#getFrontAttachmentShackle <em>Front Attachment Shackle</em>}</li>
 *   <li>{@link Cpacs.impl.PylonShacklesTypeImpl#getRearAttachmentShackle <em>Rear Attachment Shackle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonShacklesTypeImpl extends ComplexBaseTypeImpl implements PylonShacklesType {
	/**
	 * The cached value of the '{@link #getFrontAttachmentShackle() <em>Front Attachment Shackle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontAttachmentShackle()
	 * @generated
	 * @ordered
	 */
	protected EList<PylonShackleType> frontAttachmentShackle;

	/**
	 * The cached value of the '{@link #getRearAttachmentShackle() <em>Rear Attachment Shackle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearAttachmentShackle()
	 * @generated
	 * @ordered
	 */
	protected EList<PylonShackleType> rearAttachmentShackle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PylonShacklesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonShacklesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PylonShackleType> getFrontAttachmentShackle() {
		if (frontAttachmentShackle == null) {
			frontAttachmentShackle = new EObjectContainmentEList<PylonShackleType>(PylonShackleType.class, this,
					CpacsPackage.PYLON_SHACKLES_TYPE__FRONT_ATTACHMENT_SHACKLE);
		}
		return frontAttachmentShackle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PylonShackleType> getRearAttachmentShackle() {
		if (rearAttachmentShackle == null) {
			rearAttachmentShackle = new EObjectContainmentEList<PylonShackleType>(PylonShackleType.class, this,
					CpacsPackage.PYLON_SHACKLES_TYPE__REAR_ATTACHMENT_SHACKLE);
		}
		return rearAttachmentShackle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_SHACKLES_TYPE__FRONT_ATTACHMENT_SHACKLE:
			return ((InternalEList<?>) getFrontAttachmentShackle()).basicRemove(otherEnd, msgs);
		case CpacsPackage.PYLON_SHACKLES_TYPE__REAR_ATTACHMENT_SHACKLE:
			return ((InternalEList<?>) getRearAttachmentShackle()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PYLON_SHACKLES_TYPE__FRONT_ATTACHMENT_SHACKLE:
			return getFrontAttachmentShackle();
		case CpacsPackage.PYLON_SHACKLES_TYPE__REAR_ATTACHMENT_SHACKLE:
			return getRearAttachmentShackle();
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
		case CpacsPackage.PYLON_SHACKLES_TYPE__FRONT_ATTACHMENT_SHACKLE:
			getFrontAttachmentShackle().clear();
			getFrontAttachmentShackle().addAll((Collection<? extends PylonShackleType>) newValue);
			return;
		case CpacsPackage.PYLON_SHACKLES_TYPE__REAR_ATTACHMENT_SHACKLE:
			getRearAttachmentShackle().clear();
			getRearAttachmentShackle().addAll((Collection<? extends PylonShackleType>) newValue);
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
		case CpacsPackage.PYLON_SHACKLES_TYPE__FRONT_ATTACHMENT_SHACKLE:
			getFrontAttachmentShackle().clear();
			return;
		case CpacsPackage.PYLON_SHACKLES_TYPE__REAR_ATTACHMENT_SHACKLE:
			getRearAttachmentShackle().clear();
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
		case CpacsPackage.PYLON_SHACKLES_TYPE__FRONT_ATTACHMENT_SHACKLE:
			return frontAttachmentShackle != null && !frontAttachmentShackle.isEmpty();
		case CpacsPackage.PYLON_SHACKLES_TYPE__REAR_ATTACHMENT_SHACKLE:
			return rearAttachmentShackle != null && !rearAttachmentShackle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PylonShacklesTypeImpl
