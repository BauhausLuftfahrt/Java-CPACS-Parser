/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MissionDefinitionsType;
import Cpacs.MissionSegmentBlocksType;
import Cpacs.MissionSegmentsType;
import Cpacs.MissionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionDefinitionsTypeImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link Cpacs.impl.MissionDefinitionsTypeImpl#getSegmentBlocks <em>Segment Blocks</em>}</li>
 *   <li>{@link Cpacs.impl.MissionDefinitionsTypeImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionDefinitionsTypeImpl extends ComplexBaseTypeImpl implements MissionDefinitionsType {
	/**
	 * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissions()
	 * @generated
	 * @ordered
	 */
	protected MissionsType missions;

	/**
	 * The cached value of the '{@link #getSegmentBlocks() <em>Segment Blocks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentBlocks()
	 * @generated
	 * @ordered
	 */
	protected MissionSegmentBlocksType segmentBlocks;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected MissionSegmentsType segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionsType getMissions() {
		return missions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissions(MissionsType newMissions, NotificationChain msgs) {
		MissionsType oldMissions = missions;
		missions = newMissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS, oldMissions, newMissions);
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
	public void setMissions(MissionsType newMissions) {
		if (newMissions != missions) {
			NotificationChain msgs = null;
			if (missions != null)
				msgs = ((InternalEObject) missions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS, null, msgs);
			if (newMissions != null)
				msgs = ((InternalEObject) newMissions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS, null, msgs);
			msgs = basicSetMissions(newMissions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS,
					newMissions, newMissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentBlocksType getSegmentBlocks() {
		return segmentBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentBlocks(MissionSegmentBlocksType newSegmentBlocks, NotificationChain msgs) {
		MissionSegmentBlocksType oldSegmentBlocks = segmentBlocks;
		segmentBlocks = newSegmentBlocks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS, oldSegmentBlocks, newSegmentBlocks);
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
	public void setSegmentBlocks(MissionSegmentBlocksType newSegmentBlocks) {
		if (newSegmentBlocks != segmentBlocks) {
			NotificationChain msgs = null;
			if (segmentBlocks != null)
				msgs = ((InternalEObject) segmentBlocks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS, null, msgs);
			if (newSegmentBlocks != null)
				msgs = ((InternalEObject) newSegmentBlocks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS, null, msgs);
			msgs = basicSetSegmentBlocks(newSegmentBlocks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS,
					newSegmentBlocks, newSegmentBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentsType getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(MissionSegmentsType newSegments, NotificationChain msgs) {
		MissionSegmentsType oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS, oldSegments, newSegments);
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
	public void setSegments(MissionSegmentsType newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject) segments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject) newSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS,
					newSegments, newSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS:
			return basicSetMissions(null, msgs);
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS:
			return basicSetSegmentBlocks(null, msgs);
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS:
			return basicSetSegments(null, msgs);
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
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS:
			return getMissions();
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS:
			return getSegmentBlocks();
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS:
			return getSegments();
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
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS:
			setMissions((MissionsType) newValue);
			return;
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS:
			setSegmentBlocks((MissionSegmentBlocksType) newValue);
			return;
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS:
			setSegments((MissionSegmentsType) newValue);
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
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS:
			setMissions((MissionsType) null);
			return;
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS:
			setSegmentBlocks((MissionSegmentBlocksType) null);
			return;
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS:
			setSegments((MissionSegmentsType) null);
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
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__MISSIONS:
			return missions != null;
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENT_BLOCKS:
			return segmentBlocks != null;
		case CpacsPackage.MISSION_DEFINITIONS_TYPE__SEGMENTS:
			return segments != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionDefinitionsTypeImpl
