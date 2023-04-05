/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LandingGearBaseType;
import Cpacs.SkidGearsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skid Gears Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SkidGearsTypeImpl#getSkidGear <em>Skid Gear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkidGearsTypeImpl extends ComplexBaseTypeImpl implements SkidGearsType {
	/**
	 * The cached value of the '{@link #getSkidGear() <em>Skid Gear</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkidGear()
	 * @generated
	 * @ordered
	 */
	protected EList<LandingGearBaseType> skidGear;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkidGearsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSkidGearsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LandingGearBaseType> getSkidGear() {
		if (skidGear == null) {
			skidGear = new EObjectContainmentEList<LandingGearBaseType>(LandingGearBaseType.class, this,
					CpacsPackage.SKID_GEARS_TYPE__SKID_GEAR);
		}
		return skidGear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SKID_GEARS_TYPE__SKID_GEAR:
			return ((InternalEList<?>) getSkidGear()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SKID_GEARS_TYPE__SKID_GEAR:
			return getSkidGear();
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
		case CpacsPackage.SKID_GEARS_TYPE__SKID_GEAR:
			getSkidGear().clear();
			getSkidGear().addAll((Collection<? extends LandingGearBaseType>) newValue);
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
		case CpacsPackage.SKID_GEARS_TYPE__SKID_GEAR:
			getSkidGear().clear();
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
		case CpacsPackage.SKID_GEARS_TYPE__SKID_GEAR:
			return skidGear != null && !skidGear.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SkidGearsTypeImpl
