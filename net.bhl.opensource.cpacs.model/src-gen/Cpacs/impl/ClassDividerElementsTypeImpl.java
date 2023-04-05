/**
 */
package Cpacs.impl;

import Cpacs.ClassDividerElementsType;
import Cpacs.CpacsPackage;
import Cpacs.DeckElementBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Divider Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ClassDividerElementsTypeImpl#getClassDividerElement <em>Class Divider Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDividerElementsTypeImpl extends ComplexBaseTypeImpl implements ClassDividerElementsType {
	/**
	 * The cached value of the '{@link #getClassDividerElement() <em>Class Divider Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDividerElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckElementBaseType> classDividerElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDividerElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getClassDividerElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckElementBaseType> getClassDividerElement() {
		if (classDividerElement == null) {
			classDividerElement = new EObjectContainmentEList<DeckElementBaseType>(DeckElementBaseType.class, this,
					CpacsPackage.CLASS_DIVIDER_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENT);
		}
		return classDividerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CLASS_DIVIDER_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENT:
			return ((InternalEList<?>) getClassDividerElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CLASS_DIVIDER_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENT:
			return getClassDividerElement();
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
		case CpacsPackage.CLASS_DIVIDER_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENT:
			getClassDividerElement().clear();
			getClassDividerElement().addAll((Collection<? extends DeckElementBaseType>) newValue);
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
		case CpacsPackage.CLASS_DIVIDER_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENT:
			getClassDividerElement().clear();
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
		case CpacsPackage.CLASS_DIVIDER_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENT:
			return classDividerElement != null && !classDividerElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassDividerElementsTypeImpl
