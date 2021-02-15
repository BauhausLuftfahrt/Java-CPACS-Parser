/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FuselageType;
import Cpacs.FuselagesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselages Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselagesTypeImpl#getFuselage <em>Fuselage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselagesTypeImpl extends ComplexBaseTypeImpl implements FuselagesType {
	/**
	 * The cached value of the '{@link #getFuselage() <em>Fuselage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselage()
	 * @generated
	 * @ordered
	 */
	protected EList<FuselageType> fuselage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuselagesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselagesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuselageType> getFuselage() {
		if (fuselage == null) {
			fuselage = new EObjectContainmentEList<FuselageType>(FuselageType.class, this,
					CpacsPackage.FUSELAGES_TYPE__FUSELAGE);
		}
		return fuselage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGES_TYPE__FUSELAGE:
			return ((InternalEList<?>) getFuselage()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FUSELAGES_TYPE__FUSELAGE:
			return getFuselage();
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
		case CpacsPackage.FUSELAGES_TYPE__FUSELAGE:
			getFuselage().clear();
			getFuselage().addAll((Collection<? extends FuselageType>) newValue);
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
		case CpacsPackage.FUSELAGES_TYPE__FUSELAGE:
			getFuselage().clear();
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
		case CpacsPackage.FUSELAGES_TYPE__FUSELAGE:
			return fuselage != null && !fuselage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FuselagesTypeImpl
