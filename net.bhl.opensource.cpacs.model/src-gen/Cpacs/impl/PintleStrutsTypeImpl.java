/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PintleStrutsType;
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
 * An implementation of the model object '<em><b>Pintle Struts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PintleStrutsTypeImpl#getPintleStrut <em>Pintle Strut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PintleStrutsTypeImpl extends MinimalEObjectImpl.Container implements PintleStrutsType {
	/**
	 * The cached value of the '{@link #getPintleStrut() <em>Pintle Strut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPintleStrut()
	 * @generated
	 * @ordered
	 */
	protected EList<StrutAssemblyType> pintleStrut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PintleStrutsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPintleStrutsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrutAssemblyType> getPintleStrut() {
		if (pintleStrut == null) {
			pintleStrut = new EObjectContainmentEList<StrutAssemblyType>(StrutAssemblyType.class, this,
					CpacsPackage.PINTLE_STRUTS_TYPE__PINTLE_STRUT);
		}
		return pintleStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PINTLE_STRUTS_TYPE__PINTLE_STRUT:
			return ((InternalEList<?>) getPintleStrut()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PINTLE_STRUTS_TYPE__PINTLE_STRUT:
			return getPintleStrut();
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
		case CpacsPackage.PINTLE_STRUTS_TYPE__PINTLE_STRUT:
			getPintleStrut().clear();
			getPintleStrut().addAll((Collection<? extends StrutAssemblyType>) newValue);
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
		case CpacsPackage.PINTLE_STRUTS_TYPE__PINTLE_STRUT:
			getPintleStrut().clear();
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
		case CpacsPackage.PINTLE_STRUTS_TYPE__PINTLE_STRUT:
			return pintleStrut != null && !pintleStrut.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PintleStrutsTypeImpl
