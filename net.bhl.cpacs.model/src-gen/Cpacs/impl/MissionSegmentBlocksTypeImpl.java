/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MissionSegmentBlockType;
import Cpacs.MissionSegmentBlocksType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Segment Blocks Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionSegmentBlocksTypeImpl#getSegmentBlock <em>Segment Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionSegmentBlocksTypeImpl extends ComplexBaseTypeImpl implements MissionSegmentBlocksType {
	/**
	 * The cached value of the '{@link #getSegmentBlock() <em>Segment Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<MissionSegmentBlockType> segmentBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionSegmentBlocksTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionSegmentBlocksType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MissionSegmentBlockType> getSegmentBlock() {
		if (segmentBlock == null) {
			segmentBlock = new EObjectContainmentEList<MissionSegmentBlockType>(MissionSegmentBlockType.class, this,
					CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE__SEGMENT_BLOCK);
		}
		return segmentBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE__SEGMENT_BLOCK:
			return ((InternalEList<?>) getSegmentBlock()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE__SEGMENT_BLOCK:
			return getSegmentBlock();
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
		case CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE__SEGMENT_BLOCK:
			getSegmentBlock().clear();
			getSegmentBlock().addAll((Collection<? extends MissionSegmentBlockType>) newValue);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE__SEGMENT_BLOCK:
			getSegmentBlock().clear();
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
		case CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE__SEGMENT_BLOCK:
			return segmentBlock != null && !segmentBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MissionSegmentBlocksTypeImpl
