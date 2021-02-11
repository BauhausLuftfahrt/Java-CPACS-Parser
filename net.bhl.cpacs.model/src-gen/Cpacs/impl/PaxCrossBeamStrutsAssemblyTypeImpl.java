/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CrossBeamStrutAssemblyPositionType;
import Cpacs.PaxCrossBeamStrutsAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pax Cross Beam Struts Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PaxCrossBeamStrutsAssemblyTypeImpl#getPaxCrossBeamStrut <em>Pax Cross Beam Strut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaxCrossBeamStrutsAssemblyTypeImpl extends ComplexBaseTypeImpl implements PaxCrossBeamStrutsAssemblyType {
	/**
	 * The cached value of the '{@link #getPaxCrossBeamStrut() <em>Pax Cross Beam Strut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxCrossBeamStrut()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossBeamStrutAssemblyPositionType> paxCrossBeamStrut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaxCrossBeamStrutsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPaxCrossBeamStrutsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossBeamStrutAssemblyPositionType> getPaxCrossBeamStrut() {
		if (paxCrossBeamStrut == null) {
			paxCrossBeamStrut = new EObjectContainmentEList<CrossBeamStrutAssemblyPositionType>(
					CrossBeamStrutAssemblyPositionType.class, this,
					CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__PAX_CROSS_BEAM_STRUT);
		}
		return paxCrossBeamStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__PAX_CROSS_BEAM_STRUT:
			return ((InternalEList<?>) getPaxCrossBeamStrut()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__PAX_CROSS_BEAM_STRUT:
			return getPaxCrossBeamStrut();
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
		case CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__PAX_CROSS_BEAM_STRUT:
			getPaxCrossBeamStrut().clear();
			getPaxCrossBeamStrut().addAll((Collection<? extends CrossBeamStrutAssemblyPositionType>) newValue);
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
		case CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__PAX_CROSS_BEAM_STRUT:
			getPaxCrossBeamStrut().clear();
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
		case CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE__PAX_CROSS_BEAM_STRUT:
			return paxCrossBeamStrut != null && !paxCrossBeamStrut.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PaxCrossBeamStrutsAssemblyTypeImpl
