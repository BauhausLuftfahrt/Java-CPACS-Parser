/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TiedInterfaceType;
import Cpacs.TiedInterfacesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tied Interfaces Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TiedInterfacesTypeImpl#getTiedInterface <em>Tied Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TiedInterfacesTypeImpl extends ComplexBaseTypeImpl implements TiedInterfacesType {
	/**
	 * The cached value of the '{@link #getTiedInterface() <em>Tied Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiedInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<TiedInterfaceType> tiedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TiedInterfacesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTiedInterfacesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TiedInterfaceType> getTiedInterface() {
		if (tiedInterface == null) {
			tiedInterface = new EObjectContainmentEList<TiedInterfaceType>(TiedInterfaceType.class, this,
					CpacsPackage.TIED_INTERFACES_TYPE__TIED_INTERFACE);
		}
		return tiedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TIED_INTERFACES_TYPE__TIED_INTERFACE:
			return ((InternalEList<?>) getTiedInterface()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TIED_INTERFACES_TYPE__TIED_INTERFACE:
			return getTiedInterface();
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
		case CpacsPackage.TIED_INTERFACES_TYPE__TIED_INTERFACE:
			getTiedInterface().clear();
			getTiedInterface().addAll((Collection<? extends TiedInterfaceType>) newValue);
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
		case CpacsPackage.TIED_INTERFACES_TYPE__TIED_INTERFACE:
			getTiedInterface().clear();
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
		case CpacsPackage.TIED_INTERFACES_TYPE__TIED_INTERFACE:
			return tiedInterface != null && !tiedInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TiedInterfacesTypeImpl
