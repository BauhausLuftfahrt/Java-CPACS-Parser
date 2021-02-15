/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericGeometricComponentType;
import Cpacs.GenericGeometryComponentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Geometry Components Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericGeometryComponentsTypeImpl#getGenericGeometryComponent <em>Generic Geometry Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericGeometryComponentsTypeImpl extends ComplexBaseTypeImpl implements GenericGeometryComponentsType {
	/**
	 * The cached value of the '{@link #getGenericGeometryComponent() <em>Generic Geometry Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericGeometryComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericGeometricComponentType> genericGeometryComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericGeometryComponentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericGeometryComponentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericGeometricComponentType> getGenericGeometryComponent() {
		if (genericGeometryComponent == null) {
			genericGeometryComponent = new EObjectContainmentEList<GenericGeometricComponentType>(
					GenericGeometricComponentType.class, this,
					CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE__GENERIC_GEOMETRY_COMPONENT);
		}
		return genericGeometryComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE__GENERIC_GEOMETRY_COMPONENT:
			return ((InternalEList<?>) getGenericGeometryComponent()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE__GENERIC_GEOMETRY_COMPONENT:
			return getGenericGeometryComponent();
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
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE__GENERIC_GEOMETRY_COMPONENT:
			getGenericGeometryComponent().clear();
			getGenericGeometryComponent().addAll((Collection<? extends GenericGeometricComponentType>) newValue);
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
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE__GENERIC_GEOMETRY_COMPONENT:
			getGenericGeometryComponent().clear();
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
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE__GENERIC_GEOMETRY_COMPONENT:
			return genericGeometryComponent != null && !genericGeometryComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericGeometryComponentsTypeImpl
