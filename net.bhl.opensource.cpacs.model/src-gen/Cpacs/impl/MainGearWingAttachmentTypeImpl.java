/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EtaXsiRelHeightPointType;
import Cpacs.MainGearSupportBeamType;
import Cpacs.MainGearWingAttachmentType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Gear Wing Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MainGearWingAttachmentTypeImpl#getFirstSparUID <em>First Spar UID</em>}</li>
 *   <li>{@link Cpacs.impl.MainGearWingAttachmentTypeImpl#getPositioning <em>Positioning</em>}</li>
 *   <li>{@link Cpacs.impl.MainGearWingAttachmentTypeImpl#getSecondSparUID <em>Second Spar UID</em>}</li>
 *   <li>{@link Cpacs.impl.MainGearWingAttachmentTypeImpl#getSupportBeam <em>Support Beam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainGearWingAttachmentTypeImpl extends ComplexBaseTypeImpl implements MainGearWingAttachmentType {
	/**
	 * The cached value of the '{@link #getFirstSparUID() <em>First Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstSparUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType firstSparUID;

	/**
	 * The cached value of the '{@link #getPositioning() <em>Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioning()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiRelHeightPointType positioning;

	/**
	 * The cached value of the '{@link #getSecondSparUID() <em>Second Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondSparUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType secondSparUID;

	/**
	 * The cached value of the '{@link #getSupportBeam() <em>Support Beam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportBeam()
	 * @generated
	 * @ordered
	 */
	protected MainGearSupportBeamType supportBeam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainGearWingAttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMainGearWingAttachmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFirstSparUID() {
		return firstSparUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstSparUID(StringUIDBaseType newFirstSparUID, NotificationChain msgs) {
		StringUIDBaseType oldFirstSparUID = firstSparUID;
		firstSparUID = newFirstSparUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID, oldFirstSparUID, newFirstSparUID);
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
	public void setFirstSparUID(StringUIDBaseType newFirstSparUID) {
		if (newFirstSparUID != firstSparUID) {
			NotificationChain msgs = null;
			if (firstSparUID != null)
				msgs = ((InternalEObject) firstSparUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID, null,
						msgs);
			if (newFirstSparUID != null)
				msgs = ((InternalEObject) newFirstSparUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID, null,
						msgs);
			msgs = basicSetFirstSparUID(newFirstSparUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID, newFirstSparUID, newFirstSparUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType getPositioning() {
		return positioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioning(EtaXsiRelHeightPointType newPositioning, NotificationChain msgs) {
		EtaXsiRelHeightPointType oldPositioning = positioning;
		positioning = newPositioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING, oldPositioning, newPositioning);
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
	public void setPositioning(EtaXsiRelHeightPointType newPositioning) {
		if (newPositioning != positioning) {
			NotificationChain msgs = null;
			if (positioning != null)
				msgs = ((InternalEObject) positioning).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING, null, msgs);
			if (newPositioning != null)
				msgs = ((InternalEObject) newPositioning).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING, null, msgs);
			msgs = basicSetPositioning(newPositioning, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING, newPositioning, newPositioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSecondSparUID() {
		return secondSparUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondSparUID(StringUIDBaseType newSecondSparUID, NotificationChain msgs) {
		StringUIDBaseType oldSecondSparUID = secondSparUID;
		secondSparUID = newSecondSparUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID, oldSecondSparUID, newSecondSparUID);
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
	public void setSecondSparUID(StringUIDBaseType newSecondSparUID) {
		if (newSecondSparUID != secondSparUID) {
			NotificationChain msgs = null;
			if (secondSparUID != null)
				msgs = ((InternalEObject) secondSparUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID, null,
						msgs);
			if (newSecondSparUID != null)
				msgs = ((InternalEObject) newSecondSparUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID, null,
						msgs);
			msgs = basicSetSecondSparUID(newSecondSparUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID, newSecondSparUID, newSecondSparUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearSupportBeamType getSupportBeam() {
		return supportBeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportBeam(MainGearSupportBeamType newSupportBeam, NotificationChain msgs) {
		MainGearSupportBeamType oldSupportBeam = supportBeam;
		supportBeam = newSupportBeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM, oldSupportBeam, newSupportBeam);
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
	public void setSupportBeam(MainGearSupportBeamType newSupportBeam) {
		if (newSupportBeam != supportBeam) {
			NotificationChain msgs = null;
			if (supportBeam != null)
				msgs = ((InternalEObject) supportBeam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM, null, msgs);
			if (newSupportBeam != null)
				msgs = ((InternalEObject) newSupportBeam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM, null, msgs);
			msgs = basicSetSupportBeam(newSupportBeam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM, newSupportBeam, newSupportBeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID:
			return basicSetFirstSparUID(null, msgs);
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING:
			return basicSetPositioning(null, msgs);
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID:
			return basicSetSecondSparUID(null, msgs);
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM:
			return basicSetSupportBeam(null, msgs);
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
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID:
			return getFirstSparUID();
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING:
			return getPositioning();
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID:
			return getSecondSparUID();
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM:
			return getSupportBeam();
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
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID:
			setFirstSparUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING:
			setPositioning((EtaXsiRelHeightPointType) newValue);
			return;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID:
			setSecondSparUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM:
			setSupportBeam((MainGearSupportBeamType) newValue);
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
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID:
			setFirstSparUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING:
			setPositioning((EtaXsiRelHeightPointType) null);
			return;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID:
			setSecondSparUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM:
			setSupportBeam((MainGearSupportBeamType) null);
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
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__FIRST_SPAR_UID:
			return firstSparUID != null;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__POSITIONING:
			return positioning != null;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SECOND_SPAR_UID:
			return secondSparUID != null;
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE__SUPPORT_BEAM:
			return supportBeam != null;
		}
		return super.eIsSet(featureID);
	}

} //MainGearWingAttachmentTypeImpl
