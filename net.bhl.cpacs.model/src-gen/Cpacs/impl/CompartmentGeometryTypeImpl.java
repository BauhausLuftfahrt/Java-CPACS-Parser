/**
 */
package Cpacs.impl;

import Cpacs.CompartmentGeometryType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CompartmentGeometryTypeImpl#getBoundaryElementUID <em>Boundary Element UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentGeometryTypeImpl extends ComplexBaseTypeImpl implements CompartmentGeometryType {
	/**
	 * The cached value of the '{@link #getBoundaryElementUID() <em>Boundary Element UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryElementUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> boundaryElementUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCompartmentGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getBoundaryElementUID() {
		if (boundaryElementUID == null) {
			boundaryElementUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.COMPARTMENT_GEOMETRY_TYPE__BOUNDARY_ELEMENT_UID);
		}
		return boundaryElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COMPARTMENT_GEOMETRY_TYPE__BOUNDARY_ELEMENT_UID:
			return ((InternalEList<?>) getBoundaryElementUID()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COMPARTMENT_GEOMETRY_TYPE__BOUNDARY_ELEMENT_UID:
			return getBoundaryElementUID();
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
		case CpacsPackage.COMPARTMENT_GEOMETRY_TYPE__BOUNDARY_ELEMENT_UID:
			getBoundaryElementUID().clear();
			getBoundaryElementUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
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
		case CpacsPackage.COMPARTMENT_GEOMETRY_TYPE__BOUNDARY_ELEMENT_UID:
			getBoundaryElementUID().clear();
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
		case CpacsPackage.COMPARTMENT_GEOMETRY_TYPE__BOUNDARY_ELEMENT_UID:
			return boundaryElementUID != null && !boundaryElementUID.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompartmentGeometryTypeImpl
