/**
 */
package Cpacs.impl;

import Cpacs.AxleAssembliesType;
import Cpacs.AxleAssemblyType;
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
 * An implementation of the model object '<em><b>Axle Assemblies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AxleAssembliesTypeImpl#getAxleAssembly <em>Axle Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxleAssembliesTypeImpl extends ComplexBaseTypeImpl implements AxleAssembliesType {
	/**
	 * The cached value of the '{@link #getAxleAssembly() <em>Axle Assembly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxleAssembly()
	 * @generated
	 * @ordered
	 */
	protected EList<AxleAssemblyType> axleAssembly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxleAssembliesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAxleAssembliesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AxleAssemblyType> getAxleAssembly() {
		if (axleAssembly == null) {
			axleAssembly = new EObjectContainmentEList<AxleAssemblyType>(AxleAssemblyType.class, this,
					CpacsPackage.AXLE_ASSEMBLIES_TYPE__AXLE_ASSEMBLY);
		}
		return axleAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AXLE_ASSEMBLIES_TYPE__AXLE_ASSEMBLY:
			return ((InternalEList<?>) getAxleAssembly()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.AXLE_ASSEMBLIES_TYPE__AXLE_ASSEMBLY:
			return getAxleAssembly();
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
		case CpacsPackage.AXLE_ASSEMBLIES_TYPE__AXLE_ASSEMBLY:
			getAxleAssembly().clear();
			getAxleAssembly().addAll((Collection<? extends AxleAssemblyType>) newValue);
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
		case CpacsPackage.AXLE_ASSEMBLIES_TYPE__AXLE_ASSEMBLY:
			getAxleAssembly().clear();
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
		case CpacsPackage.AXLE_ASSEMBLIES_TYPE__AXLE_ASSEMBLY:
			return axleAssembly != null && !axleAssembly.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AxleAssembliesTypeImpl
