/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DriveSystemType;
import Cpacs.DriveSystemsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DriveSystemsTypeImpl#getDriveSystem <em>Drive System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriveSystemsTypeImpl extends ComplexBaseTypeImpl implements DriveSystemsType {
	/**
	 * The cached value of the '{@link #getDriveSystem() <em>Drive System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<DriveSystemType> driveSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriveSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDriveSystemsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DriveSystemType> getDriveSystem() {
		if (driveSystem == null) {
			driveSystem = new EObjectContainmentEList<DriveSystemType>(DriveSystemType.class, this,
					CpacsPackage.DRIVE_SYSTEMS_TYPE__DRIVE_SYSTEM);
		}
		return driveSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DRIVE_SYSTEMS_TYPE__DRIVE_SYSTEM:
			return ((InternalEList<?>) getDriveSystem()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.DRIVE_SYSTEMS_TYPE__DRIVE_SYSTEM:
			return getDriveSystem();
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
		case CpacsPackage.DRIVE_SYSTEMS_TYPE__DRIVE_SYSTEM:
			getDriveSystem().clear();
			getDriveSystem().addAll((Collection<? extends DriveSystemType>) newValue);
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
		case CpacsPackage.DRIVE_SYSTEMS_TYPE__DRIVE_SYSTEM:
			getDriveSystem().clear();
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
		case CpacsPackage.DRIVE_SYSTEMS_TYPE__DRIVE_SYSTEM:
			return driveSystem != null && !driveSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DriveSystemsTypeImpl
