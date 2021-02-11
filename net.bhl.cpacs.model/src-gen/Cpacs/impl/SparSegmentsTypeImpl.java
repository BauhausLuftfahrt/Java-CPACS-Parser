/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SparSegmentType;
import Cpacs.SparSegmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spar Segments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SparSegmentsTypeImpl#getSparSegment <em>Spar Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparSegmentsTypeImpl extends ComplexBaseTypeImpl implements SparSegmentsType {
	/**
	 * The cached value of the '{@link #getSparSegment() <em>Spar Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<SparSegmentType> sparSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparSegmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSparSegmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SparSegmentType> getSparSegment() {
		if (sparSegment == null) {
			sparSegment = new EObjectContainmentEList<SparSegmentType>(SparSegmentType.class, this,
					CpacsPackage.SPAR_SEGMENTS_TYPE__SPAR_SEGMENT);
		}
		return sparSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPAR_SEGMENTS_TYPE__SPAR_SEGMENT:
			return ((InternalEList<?>) getSparSegment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SPAR_SEGMENTS_TYPE__SPAR_SEGMENT:
			return getSparSegment();
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
		case CpacsPackage.SPAR_SEGMENTS_TYPE__SPAR_SEGMENT:
			getSparSegment().clear();
			getSparSegment().addAll((Collection<? extends SparSegmentType>) newValue);
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
		case CpacsPackage.SPAR_SEGMENTS_TYPE__SPAR_SEGMENT:
			getSparSegment().clear();
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
		case CpacsPackage.SPAR_SEGMENTS_TYPE__SPAR_SEGMENT:
			return sparSegment != null && !sparSegment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SparSegmentsTypeImpl
