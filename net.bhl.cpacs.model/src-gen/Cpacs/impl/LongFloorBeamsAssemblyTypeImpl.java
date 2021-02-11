/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LongFloorBeamType;
import Cpacs.LongFloorBeamsAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Floor Beams Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LongFloorBeamsAssemblyTypeImpl#getLongFloorBeam <em>Long Floor Beam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LongFloorBeamsAssemblyTypeImpl extends ComplexBaseTypeImpl implements LongFloorBeamsAssemblyType {
	/**
	 * The cached value of the '{@link #getLongFloorBeam() <em>Long Floor Beam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFloorBeam()
	 * @generated
	 * @ordered
	 */
	protected EList<LongFloorBeamType> longFloorBeam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongFloorBeamsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLongFloorBeamsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongFloorBeamType> getLongFloorBeam() {
		if (longFloorBeam == null) {
			longFloorBeam = new EObjectContainmentEList<LongFloorBeamType>(LongFloorBeamType.class, this,
					CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE__LONG_FLOOR_BEAM);
		}
		return longFloorBeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE__LONG_FLOOR_BEAM:
			return ((InternalEList<?>) getLongFloorBeam()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE__LONG_FLOOR_BEAM:
			return getLongFloorBeam();
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
		case CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE__LONG_FLOOR_BEAM:
			getLongFloorBeam().clear();
			getLongFloorBeam().addAll((Collection<? extends LongFloorBeamType>) newValue);
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
		case CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE__LONG_FLOOR_BEAM:
			getLongFloorBeam().clear();
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
		case CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE__LONG_FLOOR_BEAM:
			return longFloorBeam != null && !longFloorBeam.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LongFloorBeamsAssemblyTypeImpl
