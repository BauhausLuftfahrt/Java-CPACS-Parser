/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselageAreaType;
import Cpacs.CenterFuselageAreasAssemblyType;
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
 * An implementation of the model object '<em><b>Center Fuselage Areas Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselageAreasAssemblyTypeImpl#getCenterFuselageArea <em>Center Fuselage Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselageAreasAssemblyTypeImpl extends ComplexBaseTypeImpl
		implements CenterFuselageAreasAssemblyType {
	/**
	 * The cached value of the '{@link #getCenterFuselageArea() <em>Center Fuselage Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageArea()
	 * @generated
	 * @ordered
	 */
	protected EList<CenterFuselageAreaType> centerFuselageArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CenterFuselageAreasAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselageAreasAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CenterFuselageAreaType> getCenterFuselageArea() {
		if (centerFuselageArea == null) {
			centerFuselageArea = new EObjectContainmentEList<CenterFuselageAreaType>(CenterFuselageAreaType.class, this,
					CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE__CENTER_FUSELAGE_AREA);
		}
		return centerFuselageArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE__CENTER_FUSELAGE_AREA:
			return ((InternalEList<?>) getCenterFuselageArea()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE__CENTER_FUSELAGE_AREA:
			return getCenterFuselageArea();
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
		case CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE__CENTER_FUSELAGE_AREA:
			getCenterFuselageArea().clear();
			getCenterFuselageArea().addAll((Collection<? extends CenterFuselageAreaType>) newValue);
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
		case CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE__CENTER_FUSELAGE_AREA:
			getCenterFuselageArea().clear();
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
		case CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE__CENTER_FUSELAGE_AREA:
			return centerFuselageArea != null && !centerFuselageArea.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CenterFuselageAreasAssemblyTypeImpl
