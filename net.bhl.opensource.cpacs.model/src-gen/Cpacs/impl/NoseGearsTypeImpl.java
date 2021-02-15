/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.NoseGearType;
import Cpacs.NoseGearsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nose Gears Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NoseGearsTypeImpl#getNoseGear <em>Nose Gear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoseGearsTypeImpl extends ComplexBaseTypeImpl implements NoseGearsType {
	/**
	 * The cached value of the '{@link #getNoseGear() <em>Nose Gear</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoseGear()
	 * @generated
	 * @ordered
	 */
	protected EList<NoseGearType> noseGear;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoseGearsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNoseGearsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoseGearType> getNoseGear() {
		if (noseGear == null) {
			noseGear = new EObjectContainmentEList<NoseGearType>(NoseGearType.class, this,
					CpacsPackage.NOSE_GEARS_TYPE__NOSE_GEAR);
		}
		return noseGear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NOSE_GEARS_TYPE__NOSE_GEAR:
			return ((InternalEList<?>) getNoseGear()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.NOSE_GEARS_TYPE__NOSE_GEAR:
			return getNoseGear();
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
		case CpacsPackage.NOSE_GEARS_TYPE__NOSE_GEAR:
			getNoseGear().clear();
			getNoseGear().addAll((Collection<? extends NoseGearType>) newValue);
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
		case CpacsPackage.NOSE_GEARS_TYPE__NOSE_GEAR:
			getNoseGear().clear();
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
		case CpacsPackage.NOSE_GEARS_TYPE__NOSE_GEAR:
			return noseGear != null && !noseGear.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NoseGearsTypeImpl
