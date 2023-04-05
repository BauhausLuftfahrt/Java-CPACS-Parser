/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GalleyElementType;
import Cpacs.GalleyElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Galley Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GalleyElementsTypeImpl#getGalleyElement <em>Galley Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GalleyElementsTypeImpl extends ComplexBaseTypeImpl implements GalleyElementsType {
	/**
	 * The cached value of the '{@link #getGalleyElement() <em>Galley Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGalleyElement()
	 * @generated
	 * @ordered
	 */
	protected EList<GalleyElementType> galleyElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GalleyElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGalleyElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GalleyElementType> getGalleyElement() {
		if (galleyElement == null) {
			galleyElement = new EObjectContainmentEList<GalleyElementType>(GalleyElementType.class, this,
					CpacsPackage.GALLEY_ELEMENTS_TYPE__GALLEY_ELEMENT);
		}
		return galleyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GALLEY_ELEMENTS_TYPE__GALLEY_ELEMENT:
			return ((InternalEList<?>) getGalleyElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GALLEY_ELEMENTS_TYPE__GALLEY_ELEMENT:
			return getGalleyElement();
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
		case CpacsPackage.GALLEY_ELEMENTS_TYPE__GALLEY_ELEMENT:
			getGalleyElement().clear();
			getGalleyElement().addAll((Collection<? extends GalleyElementType>) newValue);
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
		case CpacsPackage.GALLEY_ELEMENTS_TYPE__GALLEY_ELEMENT:
			getGalleyElement().clear();
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
		case CpacsPackage.GALLEY_ELEMENTS_TYPE__GALLEY_ELEMENT:
			return galleyElement != null && !galleyElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GalleyElementsTypeImpl
