/**
 */
package Cpacs.impl;

import Cpacs.CargoCrossBeamsAssemblyType;
import Cpacs.CpacsPackage;
import Cpacs.CrossBeamAssemblyPositionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cargo Cross Beams Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CargoCrossBeamsAssemblyTypeImpl#getCargoCrossBeam <em>Cargo Cross Beam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CargoCrossBeamsAssemblyTypeImpl extends ComplexBaseTypeImpl implements CargoCrossBeamsAssemblyType {
	/**
	 * The cached value of the '{@link #getCargoCrossBeam() <em>Cargo Cross Beam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoCrossBeam()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossBeamAssemblyPositionType> cargoCrossBeam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CargoCrossBeamsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCargoCrossBeamsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossBeamAssemblyPositionType> getCargoCrossBeam() {
		if (cargoCrossBeam == null) {
			cargoCrossBeam = new EObjectContainmentEList<CrossBeamAssemblyPositionType>(
					CrossBeamAssemblyPositionType.class, this,
					CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM);
		}
		return cargoCrossBeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM:
			return ((InternalEList<?>) getCargoCrossBeam()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM:
			return getCargoCrossBeam();
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
		case CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM:
			getCargoCrossBeam().clear();
			getCargoCrossBeam().addAll((Collection<? extends CrossBeamAssemblyPositionType>) newValue);
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
		case CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM:
			getCargoCrossBeam().clear();
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
		case CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM:
			return cargoCrossBeam != null && !cargoCrossBeam.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CargoCrossBeamsAssemblyTypeImpl
