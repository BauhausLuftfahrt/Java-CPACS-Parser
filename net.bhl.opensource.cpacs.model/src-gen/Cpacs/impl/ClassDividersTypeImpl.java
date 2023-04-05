/**
 */
package Cpacs.impl;

import Cpacs.ClassDividersType;
import Cpacs.CpacsPackage;
import Cpacs.DeckComponent2DBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Dividers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ClassDividersTypeImpl#getClassDivider <em>Class Divider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDividersTypeImpl extends ComplexBaseTypeImpl implements ClassDividersType {
	/**
	 * The cached value of the '{@link #getClassDivider() <em>Class Divider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDivider()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckComponent2DBaseType> classDivider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDividersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getClassDividersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckComponent2DBaseType> getClassDivider() {
		if (classDivider == null) {
			classDivider = new EObjectContainmentEList<DeckComponent2DBaseType>(DeckComponent2DBaseType.class, this,
					CpacsPackage.CLASS_DIVIDERS_TYPE__CLASS_DIVIDER);
		}
		return classDivider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CLASS_DIVIDERS_TYPE__CLASS_DIVIDER:
			return ((InternalEList<?>) getClassDivider()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CLASS_DIVIDERS_TYPE__CLASS_DIVIDER:
			return getClassDivider();
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
		case CpacsPackage.CLASS_DIVIDERS_TYPE__CLASS_DIVIDER:
			getClassDivider().clear();
			getClassDivider().addAll((Collection<? extends DeckComponent2DBaseType>) newValue);
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
		case CpacsPackage.CLASS_DIVIDERS_TYPE__CLASS_DIVIDER:
			getClassDivider().clear();
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
		case CpacsPackage.CLASS_DIVIDERS_TYPE__CLASS_DIVIDER:
			return classDivider != null && !classDivider.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassDividersTypeImpl
