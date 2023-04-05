/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.IntegerBaseType;
import Cpacs.LandingGearStrutAttachmentType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringerFramePositionUIDsType;
import Cpacs.SupportBeamType;
import Cpacs.UIDSequenceType;
import Cpacs.WingAttachmentPositioningType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Strut Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearStrutAttachmentTypeImpl#getSparSegmentUID <em>Spar Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearStrutAttachmentTypeImpl#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearStrutAttachmentTypeImpl#getRibNumber <em>Rib Number</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearStrutAttachmentTypeImpl#getSupportBeam <em>Support Beam</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearStrutAttachmentTypeImpl#getStringerFramePositionUIDs <em>Stringer Frame Position UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearStrutAttachmentTypeImpl#getStructuralMountUIDs <em>Structural Mount UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearStrutAttachmentTypeImpl#getPositioning <em>Positioning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearStrutAttachmentTypeImpl extends ComplexBaseTypeImpl implements LandingGearStrutAttachmentType {
	/**
	 * The cached value of the '{@link #getSparSegmentUID() <em>Spar Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sparSegmentUID;

	/**
	 * The cached value of the '{@link #getRibDefinitionUID() <em>Rib Definition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibDefinitionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType ribDefinitionUID;

	/**
	 * The cached value of the '{@link #getRibNumber() <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibNumber()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType ribNumber;

	/**
	 * The cached value of the '{@link #getSupportBeam() <em>Support Beam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportBeam()
	 * @generated
	 * @ordered
	 */
	protected SupportBeamType supportBeam;

	/**
	 * The cached value of the '{@link #getStringerFramePositionUIDs() <em>Stringer Frame Position UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringerFramePositionUIDs()
	 * @generated
	 * @ordered
	 */
	protected StringerFramePositionUIDsType stringerFramePositionUIDs;

	/**
	 * The cached value of the '{@link #getStructuralMountUIDs() <em>Structural Mount UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralMountUIDs()
	 * @generated
	 * @ordered
	 */
	protected UIDSequenceType structuralMountUIDs;

	/**
	 * The cached value of the '{@link #getPositioning() <em>Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioning()
	 * @generated
	 * @ordered
	 */
	protected WingAttachmentPositioningType positioning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearStrutAttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearStrutAttachmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSparSegmentUID() {
		return sparSegmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparSegmentUID(StringUIDBaseType newSparSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldSparSegmentUID = sparSegmentUID;
		sparSegmentUID = newSparSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID, oldSparSegmentUID,
					newSparSegmentUID);
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
	public void setSparSegmentUID(StringUIDBaseType newSparSegmentUID) {
		if (newSparSegmentUID != sparSegmentUID) {
			NotificationChain msgs = null;
			if (sparSegmentUID != null)
				msgs = ((InternalEObject) sparSegmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID,
						null, msgs);
			if (newSparSegmentUID != null)
				msgs = ((InternalEObject) newSparSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID,
						null, msgs);
			msgs = basicSetSparSegmentUID(newSparSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID, newSparSegmentUID,
					newSparSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRibDefinitionUID() {
		return ribDefinitionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibDefinitionUID(StringUIDBaseType newRibDefinitionUID, NotificationChain msgs) {
		StringUIDBaseType oldRibDefinitionUID = ribDefinitionUID;
		ribDefinitionUID = newRibDefinitionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID, oldRibDefinitionUID,
					newRibDefinitionUID);
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
	public void setRibDefinitionUID(StringUIDBaseType newRibDefinitionUID) {
		if (newRibDefinitionUID != ribDefinitionUID) {
			NotificationChain msgs = null;
			if (ribDefinitionUID != null)
				msgs = ((InternalEObject) ribDefinitionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID,
						null, msgs);
			if (newRibDefinitionUID != null)
				msgs = ((InternalEObject) newRibDefinitionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID,
						null, msgs);
			msgs = basicSetRibDefinitionUID(newRibDefinitionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID, newRibDefinitionUID,
					newRibDefinitionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getRibNumber() {
		return ribNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibNumber(IntegerBaseType newRibNumber, NotificationChain msgs) {
		IntegerBaseType oldRibNumber = ribNumber;
		ribNumber = newRibNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER, oldRibNumber, newRibNumber);
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
	public void setRibNumber(IntegerBaseType newRibNumber) {
		if (newRibNumber != ribNumber) {
			NotificationChain msgs = null;
			if (ribNumber != null)
				msgs = ((InternalEObject) ribNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER, null,
						msgs);
			if (newRibNumber != null)
				msgs = ((InternalEObject) newRibNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER, null,
						msgs);
			msgs = basicSetRibNumber(newRibNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER, newRibNumber, newRibNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportBeamType getSupportBeam() {
		return supportBeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportBeam(SupportBeamType newSupportBeam, NotificationChain msgs) {
		SupportBeamType oldSupportBeam = supportBeam;
		supportBeam = newSupportBeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM, oldSupportBeam, newSupportBeam);
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
	public void setSupportBeam(SupportBeamType newSupportBeam) {
		if (newSupportBeam != supportBeam) {
			NotificationChain msgs = null;
			if (supportBeam != null)
				msgs = ((InternalEObject) supportBeam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM, null,
						msgs);
			if (newSupportBeam != null)
				msgs = ((InternalEObject) newSupportBeam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM, null,
						msgs);
			msgs = basicSetSupportBeam(newSupportBeam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM, newSupportBeam, newSupportBeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringerFramePositionUIDsType getStringerFramePositionUIDs() {
		return stringerFramePositionUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringerFramePositionUIDs(
			StringerFramePositionUIDsType newStringerFramePositionUIDs, NotificationChain msgs) {
		StringerFramePositionUIDsType oldStringerFramePositionUIDs = stringerFramePositionUIDs;
		stringerFramePositionUIDs = newStringerFramePositionUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS,
					oldStringerFramePositionUIDs, newStringerFramePositionUIDs);
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
	public void setStringerFramePositionUIDs(StringerFramePositionUIDsType newStringerFramePositionUIDs) {
		if (newStringerFramePositionUIDs != stringerFramePositionUIDs) {
			NotificationChain msgs = null;
			if (stringerFramePositionUIDs != null)
				msgs = ((InternalEObject) stringerFramePositionUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS,
						null, msgs);
			if (newStringerFramePositionUIDs != null)
				msgs = ((InternalEObject) newStringerFramePositionUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS,
						null, msgs);
			msgs = basicSetStringerFramePositionUIDs(newStringerFramePositionUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS,
					newStringerFramePositionUIDs, newStringerFramePositionUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDSequenceType getStructuralMountUIDs() {
		return structuralMountUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralMountUIDs(UIDSequenceType newStructuralMountUIDs,
			NotificationChain msgs) {
		UIDSequenceType oldStructuralMountUIDs = structuralMountUIDs;
		structuralMountUIDs = newStructuralMountUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS, oldStructuralMountUIDs,
					newStructuralMountUIDs);
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
	public void setStructuralMountUIDs(UIDSequenceType newStructuralMountUIDs) {
		if (newStructuralMountUIDs != structuralMountUIDs) {
			NotificationChain msgs = null;
			if (structuralMountUIDs != null)
				msgs = ((InternalEObject) structuralMountUIDs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS, null, msgs);
			if (newStructuralMountUIDs != null)
				msgs = ((InternalEObject) newStructuralMountUIDs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS, null, msgs);
			msgs = basicSetStructuralMountUIDs(newStructuralMountUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS, newStructuralMountUIDs,
					newStructuralMountUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingAttachmentPositioningType getPositioning() {
		return positioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioning(WingAttachmentPositioningType newPositioning, NotificationChain msgs) {
		WingAttachmentPositioningType oldPositioning = positioning;
		positioning = newPositioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING, oldPositioning, newPositioning);
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
	public void setPositioning(WingAttachmentPositioningType newPositioning) {
		if (newPositioning != positioning) {
			NotificationChain msgs = null;
			if (positioning != null)
				msgs = ((InternalEObject) positioning).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING, null,
						msgs);
			if (newPositioning != null)
				msgs = ((InternalEObject) newPositioning).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING, null,
						msgs);
			msgs = basicSetPositioning(newPositioning, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING, newPositioning, newPositioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID:
			return basicSetSparSegmentUID(null, msgs);
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID:
			return basicSetRibDefinitionUID(null, msgs);
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER:
			return basicSetRibNumber(null, msgs);
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM:
			return basicSetSupportBeam(null, msgs);
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS:
			return basicSetStringerFramePositionUIDs(null, msgs);
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS:
			return basicSetStructuralMountUIDs(null, msgs);
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING:
			return basicSetPositioning(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID:
			return getSparSegmentUID();
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID:
			return getRibDefinitionUID();
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER:
			return getRibNumber();
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM:
			return getSupportBeam();
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS:
			return getStringerFramePositionUIDs();
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS:
			return getStructuralMountUIDs();
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING:
			return getPositioning();
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
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID:
			setSparSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM:
			setSupportBeam((SupportBeamType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS:
			setStringerFramePositionUIDs((StringerFramePositionUIDsType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS:
			setStructuralMountUIDs((UIDSequenceType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING:
			setPositioning((WingAttachmentPositioningType) newValue);
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
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID:
			setSparSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM:
			setSupportBeam((SupportBeamType) null);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS:
			setStringerFramePositionUIDs((StringerFramePositionUIDsType) null);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS:
			setStructuralMountUIDs((UIDSequenceType) null);
			return;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING:
			setPositioning((WingAttachmentPositioningType) null);
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
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SPAR_SEGMENT_UID:
			return sparSegmentUID != null;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_DEFINITION_UID:
			return ribDefinitionUID != null;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__RIB_NUMBER:
			return ribNumber != null;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__SUPPORT_BEAM:
			return supportBeam != null;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRINGER_FRAME_POSITION_UI_DS:
			return stringerFramePositionUIDs != null;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__STRUCTURAL_MOUNT_UI_DS:
			return structuralMountUIDs != null;
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE__POSITIONING:
			return positioning != null;
		}
		return super.eIsSet(featureID);
	}

} //LandingGearStrutAttachmentTypeImpl
