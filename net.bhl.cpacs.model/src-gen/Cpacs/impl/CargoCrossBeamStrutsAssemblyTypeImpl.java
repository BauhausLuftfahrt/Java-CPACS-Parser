/**
 */
package Cpacs.impl;

import Cpacs.CargoCrossBeamStrutsAssemblyType;
import Cpacs.CpacsPackage;
import Cpacs.CrossBeamStrutAssemblyPositionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cargo Cross Beam Struts Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CargoCrossBeamStrutsAssemblyTypeImpl#getCargoCrossBeamStrut <em>Cargo Cross Beam Strut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CargoCrossBeamStrutsAssemblyTypeImpl extends ComplexBaseTypeImpl
		implements CargoCrossBeamStrutsAssemblyType {
	/**
	 * The cached value of the '{@link #getCargoCrossBeamStrut() <em>Cargo Cross Beam Strut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoCrossBeamStrut()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossBeamStrutAssemblyPositionType> cargoCrossBeamStrut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CargoCrossBeamStrutsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCargoCrossBeamStrutsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossBeamStrutAssemblyPositionType> getCargoCrossBeamStrut() {
		if (cargoCrossBeamStrut == null) {
			cargoCrossBeamStrut = new EObjectContainmentEList<CrossBeamStrutAssemblyPositionType>(
					CrossBeamStrutAssemblyPositionType.class, this,
					CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM_STRUT);
		}
		return cargoCrossBeamStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM_STRUT:
			return ((InternalEList<?>) getCargoCrossBeamStrut()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM_STRUT:
			return getCargoCrossBeamStrut();
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
		case CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM_STRUT:
			getCargoCrossBeamStrut().clear();
			getCargoCrossBeamStrut().addAll((Collection<? extends CrossBeamStrutAssemblyPositionType>) newValue);
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
		case CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM_STRUT:
			getCargoCrossBeamStrut().clear();
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
		case CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__CARGO_CROSS_BEAM_STRUT:
			return cargoCrossBeamStrut != null && !cargoCrossBeamStrut.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CargoCrossBeamStrutsAssemblyTypeImpl
