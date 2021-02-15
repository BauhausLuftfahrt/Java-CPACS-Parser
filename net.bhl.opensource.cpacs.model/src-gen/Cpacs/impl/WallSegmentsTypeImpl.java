/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WallSegmentType;
import Cpacs.WallSegmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall Segments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WallSegmentsTypeImpl#getWallSegment <em>Wall Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallSegmentsTypeImpl extends ComplexBaseTypeImpl implements WallSegmentsType {
	/**
	 * The cached value of the '{@link #getWallSegment() <em>Wall Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<WallSegmentType> wallSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallSegmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWallSegmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WallSegmentType> getWallSegment() {
		if (wallSegment == null) {
			wallSegment = new EObjectContainmentEList<WallSegmentType>(WallSegmentType.class, this,
					CpacsPackage.WALL_SEGMENTS_TYPE__WALL_SEGMENT);
		}
		return wallSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WALL_SEGMENTS_TYPE__WALL_SEGMENT:
			return ((InternalEList<?>) getWallSegment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WALL_SEGMENTS_TYPE__WALL_SEGMENT:
			return getWallSegment();
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
		case CpacsPackage.WALL_SEGMENTS_TYPE__WALL_SEGMENT:
			getWallSegment().clear();
			getWallSegment().addAll((Collection<? extends WallSegmentType>) newValue);
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
		case CpacsPackage.WALL_SEGMENTS_TYPE__WALL_SEGMENT:
			getWallSegment().clear();
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
		case CpacsPackage.WALL_SEGMENTS_TYPE__WALL_SEGMENT:
			return wallSegment != null && !wallSegment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WallSegmentsTypeImpl
