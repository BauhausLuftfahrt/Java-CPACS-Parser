/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckComponent2DBaseType;
import Cpacs.GalleysType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Galleys Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GalleysTypeImpl#getGalley <em>Galley</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GalleysTypeImpl extends ComplexBaseTypeImpl implements GalleysType {
	/**
	 * The cached value of the '{@link #getGalley() <em>Galley</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGalley()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckComponent2DBaseType> galley;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GalleysTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGalleysType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckComponent2DBaseType> getGalley() {
		if (galley == null) {
			galley = new EObjectContainmentEList<DeckComponent2DBaseType>(DeckComponent2DBaseType.class, this,
					CpacsPackage.GALLEYS_TYPE__GALLEY);
		}
		return galley;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GALLEYS_TYPE__GALLEY:
			return ((InternalEList<?>) getGalley()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GALLEYS_TYPE__GALLEY:
			return getGalley();
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
		case CpacsPackage.GALLEYS_TYPE__GALLEY:
			getGalley().clear();
			getGalley().addAll((Collection<? extends DeckComponent2DBaseType>) newValue);
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
		case CpacsPackage.GALLEYS_TYPE__GALLEY:
			getGalley().clear();
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
		case CpacsPackage.GALLEYS_TYPE__GALLEY:
			return galley != null && !galley.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GalleysTypeImpl
