/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckComponent2DBaseType;
import Cpacs.LavatoriesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lavatories Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LavatoriesTypeImpl#getLavatory <em>Lavatory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LavatoriesTypeImpl extends ComplexBaseTypeImpl implements LavatoriesType {
	/**
	 * The cached value of the '{@link #getLavatory() <em>Lavatory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLavatory()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckComponent2DBaseType> lavatory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LavatoriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLavatoriesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckComponent2DBaseType> getLavatory() {
		if (lavatory == null) {
			lavatory = new EObjectContainmentEList<DeckComponent2DBaseType>(DeckComponent2DBaseType.class, this,
					CpacsPackage.LAVATORIES_TYPE__LAVATORY);
		}
		return lavatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LAVATORIES_TYPE__LAVATORY:
			return ((InternalEList<?>) getLavatory()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LAVATORIES_TYPE__LAVATORY:
			return getLavatory();
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
		case CpacsPackage.LAVATORIES_TYPE__LAVATORY:
			getLavatory().clear();
			getLavatory().addAll((Collection<? extends DeckComponent2DBaseType>) newValue);
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
		case CpacsPackage.LAVATORIES_TYPE__LAVATORY:
			getLavatory().clear();
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
		case CpacsPackage.LAVATORIES_TYPE__LAVATORY:
			return lavatory != null && !lavatory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LavatoriesTypeImpl
