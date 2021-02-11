/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RivetJointAreaAssemblyPositionType;
import Cpacs.RivetJointAreasAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rivet Joint Areas Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RivetJointAreasAssemblyTypeImpl#getRivetJointArea <em>Rivet Joint Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RivetJointAreasAssemblyTypeImpl extends ComplexBaseTypeImpl implements RivetJointAreasAssemblyType {
	/**
	 * The cached value of the '{@link #getRivetJointArea() <em>Rivet Joint Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRivetJointArea()
	 * @generated
	 * @ordered
	 */
	protected EList<RivetJointAreaAssemblyPositionType> rivetJointArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RivetJointAreasAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRivetJointAreasAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RivetJointAreaAssemblyPositionType> getRivetJointArea() {
		if (rivetJointArea == null) {
			rivetJointArea = new EObjectContainmentEList<RivetJointAreaAssemblyPositionType>(
					RivetJointAreaAssemblyPositionType.class, this,
					CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE__RIVET_JOINT_AREA);
		}
		return rivetJointArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE__RIVET_JOINT_AREA:
			return ((InternalEList<?>) getRivetJointArea()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE__RIVET_JOINT_AREA:
			return getRivetJointArea();
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
		case CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE__RIVET_JOINT_AREA:
			getRivetJointArea().clear();
			getRivetJointArea().addAll((Collection<? extends RivetJointAreaAssemblyPositionType>) newValue);
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
		case CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE__RIVET_JOINT_AREA:
			getRivetJointArea().clear();
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
		case CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE__RIVET_JOINT_AREA:
			return rivetJointArea != null && !rivetJointArea.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RivetJointAreasAssemblyTypeImpl
