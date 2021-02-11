/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MComponentSegmentType;
import Cpacs.MFixedLeadingEdgesType;
import Cpacs.MFixedTrailingEdgesType;
import Cpacs.MLandingGearSupportsType;
import Cpacs.MMiscellaneousType;
import Cpacs.MMoveablesType;
import Cpacs.MPylonAttachmentsType;
import Cpacs.MWingBoxType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MComponent Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MComponentSegmentTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MComponentSegmentTypeImpl#getMPylonAttachments <em>MPylon Attachments</em>}</li>
 *   <li>{@link Cpacs.impl.MComponentSegmentTypeImpl#getMLandingGearSupports <em>MLanding Gear Supports</em>}</li>
 *   <li>{@link Cpacs.impl.MComponentSegmentTypeImpl#getMMiscellaneous <em>MMiscellaneous</em>}</li>
 *   <li>{@link Cpacs.impl.MComponentSegmentTypeImpl#getMWingBox <em>MWing Box</em>}</li>
 *   <li>{@link Cpacs.impl.MComponentSegmentTypeImpl#getMMoveables <em>MMoveables</em>}</li>
 *   <li>{@link Cpacs.impl.MComponentSegmentTypeImpl#getMFixedLeadingEdges <em>MFixed Leading Edges</em>}</li>
 *   <li>{@link Cpacs.impl.MComponentSegmentTypeImpl#getMFixedTrailingEdges <em>MFixed Trailing Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MComponentSegmentTypeImpl extends ComplexBaseTypeImpl implements MComponentSegmentType {
	/**
	 * The cached value of the '{@link #getMassDescription() <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType massDescription;

	/**
	 * The cached value of the '{@link #getMPylonAttachments() <em>MPylon Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPylonAttachments()
	 * @generated
	 * @ordered
	 */
	protected MPylonAttachmentsType mPylonAttachments;

	/**
	 * The cached value of the '{@link #getMLandingGearSupports() <em>MLanding Gear Supports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLandingGearSupports()
	 * @generated
	 * @ordered
	 */
	protected MLandingGearSupportsType mLandingGearSupports;

	/**
	 * The cached value of the '{@link #getMMiscellaneous() <em>MMiscellaneous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMiscellaneous()
	 * @generated
	 * @ordered
	 */
	protected MMiscellaneousType mMiscellaneous;

	/**
	 * The cached value of the '{@link #getMWingBox() <em>MWing Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWingBox()
	 * @generated
	 * @ordered
	 */
	protected MWingBoxType mWingBox;

	/**
	 * The cached value of the '{@link #getMMoveables() <em>MMoveables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMoveables()
	 * @generated
	 * @ordered
	 */
	protected MMoveablesType mMoveables;

	/**
	 * The cached value of the '{@link #getMFixedLeadingEdges() <em>MFixed Leading Edges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFixedLeadingEdges()
	 * @generated
	 * @ordered
	 */
	protected MFixedLeadingEdgesType mFixedLeadingEdges;

	/**
	 * The cached value of the '{@link #getMFixedTrailingEdges() <em>MFixed Trailing Edges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFixedTrailingEdges()
	 * @generated
	 * @ordered
	 */
	protected MFixedTrailingEdgesType mFixedTrailingEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MComponentSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMComponentSegmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMassDescription() {
		return massDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassDescription(GenericMassType newMassDescription, NotificationChain msgs) {
		GenericMassType oldMassDescription = massDescription;
		massDescription = newMassDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
	public void setMassDescription(GenericMassType newMassDescription) {
		if (newMassDescription != massDescription) {
			NotificationChain msgs = null;
			if (massDescription != null)
				msgs = ((InternalEObject) massDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION, newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPylonAttachmentsType getMPylonAttachments() {
		return mPylonAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPylonAttachments(MPylonAttachmentsType newMPylonAttachments,
			NotificationChain msgs) {
		MPylonAttachmentsType oldMPylonAttachments = mPylonAttachments;
		mPylonAttachments = newMPylonAttachments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS, oldMPylonAttachments,
					newMPylonAttachments);
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
	public void setMPylonAttachments(MPylonAttachmentsType newMPylonAttachments) {
		if (newMPylonAttachments != mPylonAttachments) {
			NotificationChain msgs = null;
			if (mPylonAttachments != null)
				msgs = ((InternalEObject) mPylonAttachments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS, null, msgs);
			if (newMPylonAttachments != null)
				msgs = ((InternalEObject) newMPylonAttachments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS, null, msgs);
			msgs = basicSetMPylonAttachments(newMPylonAttachments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS, newMPylonAttachments,
					newMPylonAttachments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLandingGearSupportsType getMLandingGearSupports() {
		return mLandingGearSupports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLandingGearSupports(MLandingGearSupportsType newMLandingGearSupports,
			NotificationChain msgs) {
		MLandingGearSupportsType oldMLandingGearSupports = mLandingGearSupports;
		mLandingGearSupports = newMLandingGearSupports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS, oldMLandingGearSupports,
					newMLandingGearSupports);
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
	public void setMLandingGearSupports(MLandingGearSupportsType newMLandingGearSupports) {
		if (newMLandingGearSupports != mLandingGearSupports) {
			NotificationChain msgs = null;
			if (mLandingGearSupports != null)
				msgs = ((InternalEObject) mLandingGearSupports).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS, null,
						msgs);
			if (newMLandingGearSupports != null)
				msgs = ((InternalEObject) newMLandingGearSupports).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS, null,
						msgs);
			msgs = basicSetMLandingGearSupports(newMLandingGearSupports, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS, newMLandingGearSupports,
					newMLandingGearSupports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMiscellaneousType getMMiscellaneous() {
		return mMiscellaneous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMiscellaneous(MMiscellaneousType newMMiscellaneous, NotificationChain msgs) {
		MMiscellaneousType oldMMiscellaneous = mMiscellaneous;
		mMiscellaneous = newMMiscellaneous;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS, oldMMiscellaneous, newMMiscellaneous);
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
	public void setMMiscellaneous(MMiscellaneousType newMMiscellaneous) {
		if (newMMiscellaneous != mMiscellaneous) {
			NotificationChain msgs = null;
			if (mMiscellaneous != null)
				msgs = ((InternalEObject) mMiscellaneous).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS, null, msgs);
			if (newMMiscellaneous != null)
				msgs = ((InternalEObject) newMMiscellaneous).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS, null, msgs);
			msgs = basicSetMMiscellaneous(newMMiscellaneous, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS,
					newMMiscellaneous, newMMiscellaneous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWingBoxType getMWingBox() {
		return mWingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWingBox(MWingBoxType newMWingBox, NotificationChain msgs) {
		MWingBoxType oldMWingBox = mWingBox;
		mWingBox = newMWingBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX, oldMWingBox, newMWingBox);
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
	public void setMWingBox(MWingBoxType newMWingBox) {
		if (newMWingBox != mWingBox) {
			NotificationChain msgs = null;
			if (mWingBox != null)
				msgs = ((InternalEObject) mWingBox).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX, null, msgs);
			if (newMWingBox != null)
				msgs = ((InternalEObject) newMWingBox).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX, null, msgs);
			msgs = basicSetMWingBox(newMWingBox, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX,
					newMWingBox, newMWingBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMoveablesType getMMoveables() {
		return mMoveables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMoveables(MMoveablesType newMMoveables, NotificationChain msgs) {
		MMoveablesType oldMMoveables = mMoveables;
		mMoveables = newMMoveables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES, oldMMoveables, newMMoveables);
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
	public void setMMoveables(MMoveablesType newMMoveables) {
		if (newMMoveables != mMoveables) {
			NotificationChain msgs = null;
			if (mMoveables != null)
				msgs = ((InternalEObject) mMoveables).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES, null, msgs);
			if (newMMoveables != null)
				msgs = ((InternalEObject) newMMoveables).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES, null, msgs);
			msgs = basicSetMMoveables(newMMoveables, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES,
					newMMoveables, newMMoveables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFixedLeadingEdgesType getMFixedLeadingEdges() {
		return mFixedLeadingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFixedLeadingEdges(MFixedLeadingEdgesType newMFixedLeadingEdges,
			NotificationChain msgs) {
		MFixedLeadingEdgesType oldMFixedLeadingEdges = mFixedLeadingEdges;
		mFixedLeadingEdges = newMFixedLeadingEdges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES, oldMFixedLeadingEdges,
					newMFixedLeadingEdges);
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
	public void setMFixedLeadingEdges(MFixedLeadingEdgesType newMFixedLeadingEdges) {
		if (newMFixedLeadingEdges != mFixedLeadingEdges) {
			NotificationChain msgs = null;
			if (mFixedLeadingEdges != null)
				msgs = ((InternalEObject) mFixedLeadingEdges).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES, null,
						msgs);
			if (newMFixedLeadingEdges != null)
				msgs = ((InternalEObject) newMFixedLeadingEdges).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES, null,
						msgs);
			msgs = basicSetMFixedLeadingEdges(newMFixedLeadingEdges, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES, newMFixedLeadingEdges,
					newMFixedLeadingEdges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFixedTrailingEdgesType getMFixedTrailingEdges() {
		return mFixedTrailingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFixedTrailingEdges(MFixedTrailingEdgesType newMFixedTrailingEdges,
			NotificationChain msgs) {
		MFixedTrailingEdgesType oldMFixedTrailingEdges = mFixedTrailingEdges;
		mFixedTrailingEdges = newMFixedTrailingEdges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES, oldMFixedTrailingEdges,
					newMFixedTrailingEdges);
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
	public void setMFixedTrailingEdges(MFixedTrailingEdgesType newMFixedTrailingEdges) {
		if (newMFixedTrailingEdges != mFixedTrailingEdges) {
			NotificationChain msgs = null;
			if (mFixedTrailingEdges != null)
				msgs = ((InternalEObject) mFixedTrailingEdges).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES, null,
						msgs);
			if (newMFixedTrailingEdges != null)
				msgs = ((InternalEObject) newMFixedTrailingEdges).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES, null,
						msgs);
			msgs = basicSetMFixedTrailingEdges(newMFixedTrailingEdges, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES, newMFixedTrailingEdges,
					newMFixedTrailingEdges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS:
			return basicSetMPylonAttachments(null, msgs);
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS:
			return basicSetMLandingGearSupports(null, msgs);
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS:
			return basicSetMMiscellaneous(null, msgs);
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX:
			return basicSetMWingBox(null, msgs);
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES:
			return basicSetMMoveables(null, msgs);
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES:
			return basicSetMFixedLeadingEdges(null, msgs);
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES:
			return basicSetMFixedTrailingEdges(null, msgs);
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
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS:
			return getMPylonAttachments();
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS:
			return getMLandingGearSupports();
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS:
			return getMMiscellaneous();
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX:
			return getMWingBox();
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES:
			return getMMoveables();
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES:
			return getMFixedLeadingEdges();
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES:
			return getMFixedTrailingEdges();
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
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS:
			setMPylonAttachments((MPylonAttachmentsType) newValue);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS:
			setMLandingGearSupports((MLandingGearSupportsType) newValue);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS:
			setMMiscellaneous((MMiscellaneousType) newValue);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX:
			setMWingBox((MWingBoxType) newValue);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES:
			setMMoveables((MMoveablesType) newValue);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES:
			setMFixedLeadingEdges((MFixedLeadingEdgesType) newValue);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES:
			setMFixedTrailingEdges((MFixedTrailingEdgesType) newValue);
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
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS:
			setMPylonAttachments((MPylonAttachmentsType) null);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS:
			setMLandingGearSupports((MLandingGearSupportsType) null);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS:
			setMMiscellaneous((MMiscellaneousType) null);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX:
			setMWingBox((MWingBoxType) null);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES:
			setMMoveables((MMoveablesType) null);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES:
			setMFixedLeadingEdges((MFixedLeadingEdgesType) null);
			return;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES:
			setMFixedTrailingEdges((MFixedTrailingEdgesType) null);
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
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MPYLON_ATTACHMENTS:
			return mPylonAttachments != null;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MLANDING_GEAR_SUPPORTS:
			return mLandingGearSupports != null;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMISCELLANEOUS:
			return mMiscellaneous != null;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MWING_BOX:
			return mWingBox != null;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MMOVEABLES:
			return mMoveables != null;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_LEADING_EDGES:
			return mFixedLeadingEdges != null;
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE__MFIXED_TRAILING_EDGES:
			return mFixedTrailingEdges != null;
		}
		return super.eIsSet(featureID);
	}

} //MComponentSegmentTypeImpl
