/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SpoilerType;
import Cpacs.SpoilersType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spoilers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SpoilersTypeImpl#getSpoiler <em>Spoiler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpoilersTypeImpl extends ComplexBaseTypeImpl implements SpoilersType {
	/**
	 * The cached value of the '{@link #getSpoiler() <em>Spoiler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoiler()
	 * @generated
	 * @ordered
	 */
	protected EList<SpoilerType> spoiler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpoilersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSpoilersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpoilerType> getSpoiler() {
		if (spoiler == null) {
			spoiler = new EObjectContainmentEList<SpoilerType>(SpoilerType.class, this,
					CpacsPackage.SPOILERS_TYPE__SPOILER);
		}
		return spoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPOILERS_TYPE__SPOILER:
			return ((InternalEList<?>) getSpoiler()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SPOILERS_TYPE__SPOILER:
			return getSpoiler();
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
		case CpacsPackage.SPOILERS_TYPE__SPOILER:
			getSpoiler().clear();
			getSpoiler().addAll((Collection<? extends SpoilerType>) newValue);
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
		case CpacsPackage.SPOILERS_TYPE__SPOILER:
			getSpoiler().clear();
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
		case CpacsPackage.SPOILERS_TYPE__SPOILER:
			return spoiler != null && !spoiler.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpoilersTypeImpl
