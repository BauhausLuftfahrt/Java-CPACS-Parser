/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CrossBeamAssemblyPositionType;
import Cpacs.PaxCrossBeamsAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pax Cross Beams Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PaxCrossBeamsAssemblyTypeImpl#getPaxCrossBeam <em>Pax Cross Beam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaxCrossBeamsAssemblyTypeImpl extends ComplexBaseTypeImpl implements PaxCrossBeamsAssemblyType {
	/**
	 * The cached value of the '{@link #getPaxCrossBeam() <em>Pax Cross Beam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxCrossBeam()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossBeamAssemblyPositionType> paxCrossBeam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaxCrossBeamsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPaxCrossBeamsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossBeamAssemblyPositionType> getPaxCrossBeam() {
		if (paxCrossBeam == null) {
			paxCrossBeam = new EObjectContainmentEList<CrossBeamAssemblyPositionType>(
					CrossBeamAssemblyPositionType.class, this,
					CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE__PAX_CROSS_BEAM);
		}
		return paxCrossBeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE__PAX_CROSS_BEAM:
			return ((InternalEList<?>) getPaxCrossBeam()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE__PAX_CROSS_BEAM:
			return getPaxCrossBeam();
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
		case CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE__PAX_CROSS_BEAM:
			getPaxCrossBeam().clear();
			getPaxCrossBeam().addAll((Collection<? extends CrossBeamAssemblyPositionType>) newValue);
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
		case CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE__PAX_CROSS_BEAM:
			getPaxCrossBeam().clear();
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
		case CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE__PAX_CROSS_BEAM:
			return paxCrossBeam != null && !paxCrossBeam.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PaxCrossBeamsAssemblyTypeImpl
