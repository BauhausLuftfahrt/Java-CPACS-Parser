/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.WingAttachmentPositioningType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Attachment Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingAttachmentPositioningTypeImpl#getRelHeight <em>Rel Height</em>}</li>
 *   <li>{@link Cpacs.impl.WingAttachmentPositioningTypeImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.impl.WingAttachmentPositioningTypeImpl#getXsi <em>Xsi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingAttachmentPositioningTypeImpl extends ComplexBaseTypeImpl implements WingAttachmentPositioningType {
	/**
	 * The cached value of the '{@link #getRelHeight() <em>Rel Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType relHeight;

	/**
	 * The cached value of the '{@link #getEta() <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eta;

	/**
	 * The cached value of the '{@link #getXsi() <em>Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingAttachmentPositioningTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingAttachmentPositioningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRelHeight() {
		return relHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelHeight(DoubleBaseType newRelHeight, NotificationChain msgs) {
		DoubleBaseType oldRelHeight = relHeight;
		relHeight = newRelHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT, oldRelHeight, newRelHeight);
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
	public void setRelHeight(DoubleBaseType newRelHeight) {
		if (newRelHeight != relHeight) {
			NotificationChain msgs = null;
			if (relHeight != null)
				msgs = ((InternalEObject) relHeight).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT, null, msgs);
			if (newRelHeight != null)
				msgs = ((InternalEObject) newRelHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT, null, msgs);
			msgs = basicSetRelHeight(newRelHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT, newRelHeight, newRelHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEta() {
		return eta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEta(DoubleBaseType newEta, NotificationChain msgs) {
		DoubleBaseType oldEta = eta;
		eta = newEta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA, oldEta, newEta);
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
	public void setEta(DoubleBaseType newEta) {
		if (newEta != eta) {
			NotificationChain msgs = null;
			if (eta != null)
				msgs = ((InternalEObject) eta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA, null, msgs);
			if (newEta != null)
				msgs = ((InternalEObject) newEta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA, null, msgs);
			msgs = basicSetEta(newEta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA,
					newEta, newEta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsi() {
		return xsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsi(DoubleBaseType newXsi, NotificationChain msgs) {
		DoubleBaseType oldXsi = xsi;
		xsi = newXsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI, oldXsi, newXsi);
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
	public void setXsi(DoubleBaseType newXsi) {
		if (newXsi != xsi) {
			NotificationChain msgs = null;
			if (xsi != null)
				msgs = ((InternalEObject) xsi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI, null, msgs);
			if (newXsi != null)
				msgs = ((InternalEObject) newXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI, null, msgs);
			msgs = basicSetXsi(newXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI,
					newXsi, newXsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT:
			return basicSetRelHeight(null, msgs);
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA:
			return basicSetEta(null, msgs);
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI:
			return basicSetXsi(null, msgs);
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
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT:
			return getRelHeight();
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA:
			return getEta();
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI:
			return getXsi();
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
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT:
			setRelHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA:
			setEta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI:
			setXsi((DoubleBaseType) newValue);
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
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT:
			setRelHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA:
			setEta((DoubleBaseType) null);
			return;
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI:
			setXsi((DoubleBaseType) null);
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
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__REL_HEIGHT:
			return relHeight != null;
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__ETA:
			return eta != null;
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE__XSI:
			return xsi != null;
		}
		return super.eIsSet(featureID);
	}

} //WingAttachmentPositioningTypeImpl
