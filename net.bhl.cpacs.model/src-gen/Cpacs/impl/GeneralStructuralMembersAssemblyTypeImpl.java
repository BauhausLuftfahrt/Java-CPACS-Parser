/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GeneralStructuralMemberType;
import Cpacs.GeneralStructuralMembersAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Structural Members Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GeneralStructuralMembersAssemblyTypeImpl#getGeneralStructuralMember <em>General Structural Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralStructuralMembersAssemblyTypeImpl extends ComplexBaseTypeImpl
		implements GeneralStructuralMembersAssemblyType {
	/**
	 * The cached value of the '{@link #getGeneralStructuralMember() <em>General Structural Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStructuralMember()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralStructuralMemberType> generalStructuralMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralStructuralMembersAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGeneralStructuralMembersAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeneralStructuralMemberType> getGeneralStructuralMember() {
		if (generalStructuralMember == null) {
			generalStructuralMember = new EObjectContainmentEList<GeneralStructuralMemberType>(
					GeneralStructuralMemberType.class, this,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE__GENERAL_STRUCTURAL_MEMBER);
		}
		return generalStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE__GENERAL_STRUCTURAL_MEMBER:
			return ((InternalEList<?>) getGeneralStructuralMember()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE__GENERAL_STRUCTURAL_MEMBER:
			return getGeneralStructuralMember();
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE__GENERAL_STRUCTURAL_MEMBER:
			getGeneralStructuralMember().clear();
			getGeneralStructuralMember().addAll((Collection<? extends GeneralStructuralMemberType>) newValue);
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE__GENERAL_STRUCTURAL_MEMBER:
			getGeneralStructuralMember().clear();
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE__GENERAL_STRUCTURAL_MEMBER:
			return generalStructuralMember != null && !generalStructuralMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneralStructuralMembersAssemblyTypeImpl
