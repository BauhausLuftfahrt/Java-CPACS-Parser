/**
 */
package Cpacs.impl;

import Cpacs.ActuatorFuselageWingAttachmentType;
import Cpacs.CpacsPackage;
import Cpacs.EtaXsiRelHeightPointType;
import Cpacs.MaterialDefinitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Fuselage Wing Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ActuatorFuselageWingAttachmentTypeImpl#getRefPoint <em>Ref Point</em>}</li>
 *   <li>{@link Cpacs.impl.ActuatorFuselageWingAttachmentTypeImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorFuselageWingAttachmentTypeImpl extends ComplexBaseTypeImpl
		implements ActuatorFuselageWingAttachmentType {
	/**
	 * The cached value of the '{@link #getRefPoint() <em>Ref Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPoint()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiRelHeightPointType refPoint;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType material;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorFuselageWingAttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getActuatorFuselageWingAttachmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType getRefPoint() {
		return refPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefPoint(EtaXsiRelHeightPointType newRefPoint, NotificationChain msgs) {
		EtaXsiRelHeightPointType oldRefPoint = refPoint;
		refPoint = newRefPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT, oldRefPoint, newRefPoint);
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
	public void setRefPoint(EtaXsiRelHeightPointType newRefPoint) {
		if (newRefPoint != refPoint) {
			NotificationChain msgs = null;
			if (refPoint != null)
				msgs = ((InternalEObject) refPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT, null,
						msgs);
			if (newRefPoint != null)
				msgs = ((InternalEObject) newRefPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT, null,
						msgs);
			msgs = basicSetRefPoint(newRefPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT, newRefPoint, newRefPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(MaterialDefinitionType newMaterial, NotificationChain msgs) {
		MaterialDefinitionType oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL, oldMaterial, newMaterial);
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
	public void setMaterial(MaterialDefinitionType newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject) material).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL, null,
						msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject) newMaterial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL, null,
						msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL, newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT:
			return basicSetRefPoint(null, msgs);
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL:
			return basicSetMaterial(null, msgs);
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
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT:
			return getRefPoint();
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL:
			return getMaterial();
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
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT:
			setRefPoint((EtaXsiRelHeightPointType) newValue);
			return;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) newValue);
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
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT:
			setRefPoint((EtaXsiRelHeightPointType) null);
			return;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) null);
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
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__REF_POINT:
			return refPoint != null;
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE__MATERIAL:
			return material != null;
		}
		return super.eIsSet(featureID);
	}

} //ActuatorFuselageWingAttachmentTypeImpl
