/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SideStrutsType;
import Cpacs.StrutAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Side Struts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SideStrutsTypeImpl#getSideStrut <em>Side Strut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SideStrutsTypeImpl extends MinimalEObjectImpl.Container implements SideStrutsType {
	/**
	 * The cached value of the '{@link #getSideStrut() <em>Side Strut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideStrut()
	 * @generated
	 * @ordered
	 */
	protected EList<StrutAssemblyType> sideStrut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SideStrutsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSideStrutsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrutAssemblyType> getSideStrut() {
		if (sideStrut == null) {
			sideStrut = new EObjectContainmentEList<StrutAssemblyType>(StrutAssemblyType.class, this,
					CpacsPackage.SIDE_STRUTS_TYPE__SIDE_STRUT);
		}
		return sideStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SIDE_STRUTS_TYPE__SIDE_STRUT:
			return ((InternalEList<?>) getSideStrut()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SIDE_STRUTS_TYPE__SIDE_STRUT:
			return getSideStrut();
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
		case CpacsPackage.SIDE_STRUTS_TYPE__SIDE_STRUT:
			getSideStrut().clear();
			getSideStrut().addAll((Collection<? extends StrutAssemblyType>) newValue);
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
		case CpacsPackage.SIDE_STRUTS_TYPE__SIDE_STRUT:
			getSideStrut().clear();
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
		case CpacsPackage.SIDE_STRUTS_TYPE__SIDE_STRUT:
			return sideStrut != null && !sideStrut.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SideStrutsTypeImpl
