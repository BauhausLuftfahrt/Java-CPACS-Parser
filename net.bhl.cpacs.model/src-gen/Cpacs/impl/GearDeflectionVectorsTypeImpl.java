/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GearDeflectionVectorType;
import Cpacs.GearDeflectionVectorsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gear Deflection Vectors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GearDeflectionVectorsTypeImpl#getGear <em>Gear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GearDeflectionVectorsTypeImpl extends ComplexBaseTypeImpl implements GearDeflectionVectorsType {
	/**
	 * The cached value of the '{@link #getGear() <em>Gear</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGear()
	 * @generated
	 * @ordered
	 */
	protected EList<GearDeflectionVectorType> gear;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GearDeflectionVectorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGearDeflectionVectorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GearDeflectionVectorType> getGear() {
		if (gear == null) {
			gear = new EObjectContainmentEList<GearDeflectionVectorType>(GearDeflectionVectorType.class, this,
					CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE__GEAR);
		}
		return gear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE__GEAR:
			return ((InternalEList<?>) getGear()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE__GEAR:
			return getGear();
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
		case CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE__GEAR:
			getGear().clear();
			getGear().addAll((Collection<? extends GearDeflectionVectorType>) newValue);
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
		case CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE__GEAR:
			getGear().clear();
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
		case CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE__GEAR:
			return gear != null && !gear.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GearDeflectionVectorsTypeImpl
