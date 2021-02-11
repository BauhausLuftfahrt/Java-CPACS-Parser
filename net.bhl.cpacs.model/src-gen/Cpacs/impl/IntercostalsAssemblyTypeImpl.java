/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.IntercostalPositionType;
import Cpacs.IntercostalsAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercostals Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.IntercostalsAssemblyTypeImpl#getIntercostal <em>Intercostal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntercostalsAssemblyTypeImpl extends ComplexBaseTypeImpl implements IntercostalsAssemblyType {
	/**
	 * The cached value of the '{@link #getIntercostal() <em>Intercostal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercostal()
	 * @generated
	 * @ordered
	 */
	protected EList<IntercostalPositionType> intercostal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercostalsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getIntercostalsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntercostalPositionType> getIntercostal() {
		if (intercostal == null) {
			intercostal = new EObjectContainmentEList<IntercostalPositionType>(IntercostalPositionType.class, this,
					CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE__INTERCOSTAL);
		}
		return intercostal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE__INTERCOSTAL:
			return ((InternalEList<?>) getIntercostal()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE__INTERCOSTAL:
			return getIntercostal();
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
		case CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE__INTERCOSTAL:
			getIntercostal().clear();
			getIntercostal().addAll((Collection<? extends IntercostalPositionType>) newValue);
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
		case CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE__INTERCOSTAL:
			getIntercostal().clear();
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
		case CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE__INTERCOSTAL:
			return intercostal != null && !intercostal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntercostalsAssemblyTypeImpl
