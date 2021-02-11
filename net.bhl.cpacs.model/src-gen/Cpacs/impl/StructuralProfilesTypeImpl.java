/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StructuralProfile3DType;
import Cpacs.StructuralProfileType;
import Cpacs.StructuralProfilesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StructuralProfilesTypeImpl#getStructuralProfile2D <em>Structural Profile2 D</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfilesTypeImpl#getStructuralProfile3D <em>Structural Profile3 D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralProfilesTypeImpl extends ComplexBaseTypeImpl implements StructuralProfilesType {
	/**
	 * The cached value of the '{@link #getStructuralProfile2D() <em>Structural Profile2 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralProfile2D()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralProfileType> structuralProfile2D;

	/**
	 * The cached value of the '{@link #getStructuralProfile3D() <em>Structural Profile3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralProfile3D()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralProfile3DType> structuralProfile3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralProfilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStructuralProfilesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructuralProfileType> getStructuralProfile2D() {
		if (structuralProfile2D == null) {
			structuralProfile2D = new EObjectContainmentEList<StructuralProfileType>(StructuralProfileType.class, this,
					CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE2_D);
		}
		return structuralProfile2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructuralProfile3DType> getStructuralProfile3D() {
		if (structuralProfile3D == null) {
			structuralProfile3D = new EObjectContainmentEList<StructuralProfile3DType>(StructuralProfile3DType.class,
					this, CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE3_D);
		}
		return structuralProfile3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE2_D:
			return ((InternalEList<?>) getStructuralProfile2D()).basicRemove(otherEnd, msgs);
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE3_D:
			return ((InternalEList<?>) getStructuralProfile3D()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE2_D:
			return getStructuralProfile2D();
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE3_D:
			return getStructuralProfile3D();
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
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE2_D:
			getStructuralProfile2D().clear();
			getStructuralProfile2D().addAll((Collection<? extends StructuralProfileType>) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE3_D:
			getStructuralProfile3D().clear();
			getStructuralProfile3D().addAll((Collection<? extends StructuralProfile3DType>) newValue);
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
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE2_D:
			getStructuralProfile2D().clear();
			return;
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE3_D:
			getStructuralProfile3D().clear();
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
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE2_D:
			return structuralProfile2D != null && !structuralProfile2D.isEmpty();
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE__STRUCTURAL_PROFILE3_D:
			return structuralProfile3D != null && !structuralProfile3D.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuralProfilesTypeImpl
