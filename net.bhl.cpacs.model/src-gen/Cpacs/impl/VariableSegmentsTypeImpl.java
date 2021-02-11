/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.VariableSegmentType;
import Cpacs.VariableSegmentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Segments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.VariableSegmentsTypeImpl#getVariableSegment <em>Variable Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableSegmentsTypeImpl extends ComplexBaseTypeImpl implements VariableSegmentsType {
	/**
	 * The cached value of the '{@link #getVariableSegment() <em>Variable Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableSegmentType> variableSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableSegmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getVariableSegmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableSegmentType> getVariableSegment() {
		if (variableSegment == null) {
			variableSegment = new EObjectContainmentEList<VariableSegmentType>(VariableSegmentType.class, this,
					CpacsPackage.VARIABLE_SEGMENTS_TYPE__VARIABLE_SEGMENT);
		}
		return variableSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.VARIABLE_SEGMENTS_TYPE__VARIABLE_SEGMENT:
			return ((InternalEList<?>) getVariableSegment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.VARIABLE_SEGMENTS_TYPE__VARIABLE_SEGMENT:
			return getVariableSegment();
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
		case CpacsPackage.VARIABLE_SEGMENTS_TYPE__VARIABLE_SEGMENT:
			getVariableSegment().clear();
			getVariableSegment().addAll((Collection<? extends VariableSegmentType>) newValue);
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
		case CpacsPackage.VARIABLE_SEGMENTS_TYPE__VARIABLE_SEGMENT:
			getVariableSegment().clear();
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
		case CpacsPackage.VARIABLE_SEGMENTS_TYPE__VARIABLE_SEGMENT:
			return variableSegment != null && !variableSegment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableSegmentsTypeImpl
