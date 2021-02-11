/**
 */
package Cpacs.impl;

import Cpacs.ActuatorParentAttachmentType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MaterialDefinitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Parent Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ActuatorParentAttachmentTypeImpl#getParentXsi <em>Parent Xsi</em>}</li>
 *   <li>{@link Cpacs.impl.ActuatorParentAttachmentTypeImpl#getParentHeight <em>Parent Height</em>}</li>
 *   <li>{@link Cpacs.impl.ActuatorParentAttachmentTypeImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorParentAttachmentTypeImpl extends ComplexBaseTypeImpl implements ActuatorParentAttachmentType {
	/**
	 * The cached value of the '{@link #getParentXsi() <em>Parent Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentXsi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType parentXsi;

	/**
	 * The cached value of the '{@link #getParentHeight() <em>Parent Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType parentHeight;

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
	protected ActuatorParentAttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getActuatorParentAttachmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getParentXsi() {
		return parentXsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentXsi(DoubleBaseType newParentXsi, NotificationChain msgs) {
		DoubleBaseType oldParentXsi = parentXsi;
		parentXsi = newParentXsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI, oldParentXsi, newParentXsi);
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
	public void setParentXsi(DoubleBaseType newParentXsi) {
		if (newParentXsi != parentXsi) {
			NotificationChain msgs = null;
			if (parentXsi != null)
				msgs = ((InternalEObject) parentXsi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI, null, msgs);
			if (newParentXsi != null)
				msgs = ((InternalEObject) newParentXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI, null, msgs);
			msgs = basicSetParentXsi(newParentXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI, newParentXsi, newParentXsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getParentHeight() {
		return parentHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentHeight(DoubleBaseType newParentHeight, NotificationChain msgs) {
		DoubleBaseType oldParentHeight = parentHeight;
		parentHeight = newParentHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT, oldParentHeight, newParentHeight);
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
	public void setParentHeight(DoubleBaseType newParentHeight) {
		if (newParentHeight != parentHeight) {
			NotificationChain msgs = null;
			if (parentHeight != null)
				msgs = ((InternalEObject) parentHeight).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT, null,
						msgs);
			if (newParentHeight != null)
				msgs = ((InternalEObject) newParentHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT, null,
						msgs);
			msgs = basicSetParentHeight(newParentHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT, newParentHeight, newParentHeight));
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
					CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL, oldMaterial, newMaterial);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject) newMaterial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL, newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI:
			return basicSetParentXsi(null, msgs);
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT:
			return basicSetParentHeight(null, msgs);
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL:
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
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI:
			return getParentXsi();
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT:
			return getParentHeight();
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL:
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
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI:
			setParentXsi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT:
			setParentHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL:
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
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI:
			setParentXsi((DoubleBaseType) null);
			return;
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT:
			setParentHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL:
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
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_XSI:
			return parentXsi != null;
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__PARENT_HEIGHT:
			return parentHeight != null;
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE__MATERIAL:
			return material != null;
		}
		return super.eIsSet(featureID);
	}

} //ActuatorParentAttachmentTypeImpl
