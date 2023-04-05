/**
 */
package Cpacs.impl;

import Cpacs.CoefficientsBreakdownWingType;
import Cpacs.CoefficientsBreakdownWingsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coefficients Breakdown Wings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownWingsTypeImpl#getWing <em>Wing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientsBreakdownWingsTypeImpl extends ComplexBaseTypeImpl implements CoefficientsBreakdownWingsType {
	/**
	 * The cached value of the '{@link #getWing() <em>Wing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWing()
	 * @generated
	 * @ordered
	 */
	protected EList<CoefficientsBreakdownWingType> wing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoefficientsBreakdownWingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCoefficientsBreakdownWingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoefficientsBreakdownWingType> getWing() {
		if (wing == null) {
			wing = new EObjectContainmentEList<CoefficientsBreakdownWingType>(CoefficientsBreakdownWingType.class, this,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WINGS_TYPE__WING);
		}
		return wing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WINGS_TYPE__WING:
			return ((InternalEList<?>) getWing()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WINGS_TYPE__WING:
			return getWing();
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WINGS_TYPE__WING:
			getWing().clear();
			getWing().addAll((Collection<? extends CoefficientsBreakdownWingType>) newValue);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WINGS_TYPE__WING:
			getWing().clear();
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WINGS_TYPE__WING:
			return wing != null && !wing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoefficientsBreakdownWingsTypeImpl
