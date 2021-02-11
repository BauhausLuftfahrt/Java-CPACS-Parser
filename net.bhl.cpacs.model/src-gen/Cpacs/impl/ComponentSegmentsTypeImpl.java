/**
 */
package Cpacs.impl;

import Cpacs.ComponentSegmentType;
import Cpacs.ComponentSegmentsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Segments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ComponentSegmentsTypeImpl#getComponentSegment <em>Component Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSegmentsTypeImpl extends ComplexBaseTypeImpl implements ComponentSegmentsType {
	/**
	 * The cached value of the '{@link #getComponentSegment() <em>Component Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentSegmentType> componentSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSegmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getComponentSegmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentSegmentType> getComponentSegment() {
		if (componentSegment == null) {
			componentSegment = new EObjectContainmentEList<ComponentSegmentType>(ComponentSegmentType.class, this,
					CpacsPackage.COMPONENT_SEGMENTS_TYPE__COMPONENT_SEGMENT);
		}
		return componentSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COMPONENT_SEGMENTS_TYPE__COMPONENT_SEGMENT:
			return ((InternalEList<?>) getComponentSegment()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COMPONENT_SEGMENTS_TYPE__COMPONENT_SEGMENT:
			return getComponentSegment();
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
		case CpacsPackage.COMPONENT_SEGMENTS_TYPE__COMPONENT_SEGMENT:
			getComponentSegment().clear();
			getComponentSegment().addAll((Collection<? extends ComponentSegmentType>) newValue);
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
		case CpacsPackage.COMPONENT_SEGMENTS_TYPE__COMPONENT_SEGMENT:
			getComponentSegment().clear();
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
		case CpacsPackage.COMPONENT_SEGMENTS_TYPE__COMPONENT_SEGMENT:
			return componentSegment != null && !componentSegment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentSegmentsTypeImpl
