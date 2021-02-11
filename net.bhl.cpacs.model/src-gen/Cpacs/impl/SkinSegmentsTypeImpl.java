/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SkinSegmentType;
import Cpacs.SkinSegmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skin Segments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SkinSegmentsTypeImpl#getSkinSegment <em>Skin Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkinSegmentsTypeImpl extends ComplexBaseTypeImpl implements SkinSegmentsType {
	/**
	 * The cached value of the '{@link #getSkinSegment() <em>Skin Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkinSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<SkinSegmentType> skinSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkinSegmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSkinSegmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SkinSegmentType> getSkinSegment() {
		if (skinSegment == null) {
			skinSegment = new EObjectContainmentEList<SkinSegmentType>(SkinSegmentType.class, this,
					CpacsPackage.SKIN_SEGMENTS_TYPE__SKIN_SEGMENT);
		}
		return skinSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SKIN_SEGMENTS_TYPE__SKIN_SEGMENT:
			return ((InternalEList<?>) getSkinSegment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SKIN_SEGMENTS_TYPE__SKIN_SEGMENT:
			return getSkinSegment();
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
		case CpacsPackage.SKIN_SEGMENTS_TYPE__SKIN_SEGMENT:
			getSkinSegment().clear();
			getSkinSegment().addAll((Collection<? extends SkinSegmentType>) newValue);
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
		case CpacsPackage.SKIN_SEGMENTS_TYPE__SKIN_SEGMENT:
			getSkinSegment().clear();
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
		case CpacsPackage.SKIN_SEGMENTS_TYPE__SKIN_SEGMENT:
			return skinSegment != null && !skinSegment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SkinSegmentsTypeImpl
