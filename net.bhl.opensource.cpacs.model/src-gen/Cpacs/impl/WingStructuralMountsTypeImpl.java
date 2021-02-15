/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StructuralMountType;
import Cpacs.WingStructuralMountsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Structural Mounts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingStructuralMountsTypeImpl#getWingStructuralMount <em>Wing Structural Mount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingStructuralMountsTypeImpl extends ComplexBaseTypeImpl implements WingStructuralMountsType {
	/**
	 * The cached value of the '{@link #getWingStructuralMount() <em>Wing Structural Mount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingStructuralMount()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralMountType> wingStructuralMount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingStructuralMountsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingStructuralMountsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructuralMountType> getWingStructuralMount() {
		if (wingStructuralMount == null) {
			wingStructuralMount = new EObjectContainmentEList<StructuralMountType>(StructuralMountType.class, this,
					CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE__WING_STRUCTURAL_MOUNT);
		}
		return wingStructuralMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE__WING_STRUCTURAL_MOUNT:
			return ((InternalEList<?>) getWingStructuralMount()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE__WING_STRUCTURAL_MOUNT:
			return getWingStructuralMount();
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
		case CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE__WING_STRUCTURAL_MOUNT:
			getWingStructuralMount().clear();
			getWingStructuralMount().addAll((Collection<? extends StructuralMountType>) newValue);
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
		case CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE__WING_STRUCTURAL_MOUNT:
			getWingStructuralMount().clear();
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
		case CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE__WING_STRUCTURAL_MOUNT:
			return wingStructuralMount != null && !wingStructuralMount.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingStructuralMountsTypeImpl
