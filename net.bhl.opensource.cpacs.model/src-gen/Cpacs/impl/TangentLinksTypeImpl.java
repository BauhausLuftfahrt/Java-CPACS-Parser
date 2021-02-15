/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StrutType;
import Cpacs.TangentLinksType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tangent Links Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TangentLinksTypeImpl#getTangentLink <em>Tangent Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TangentLinksTypeImpl extends ComplexBaseTypeImpl implements TangentLinksType {
	/**
	 * The cached value of the '{@link #getTangentLink() <em>Tangent Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTangentLink()
	 * @generated
	 * @ordered
	 */
	protected EList<StrutType> tangentLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TangentLinksTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTangentLinksType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrutType> getTangentLink() {
		if (tangentLink == null) {
			tangentLink = new EObjectContainmentEList<StrutType>(StrutType.class, this,
					CpacsPackage.TANGENT_LINKS_TYPE__TANGENT_LINK);
		}
		return tangentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TANGENT_LINKS_TYPE__TANGENT_LINK:
			return ((InternalEList<?>) getTangentLink()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TANGENT_LINKS_TYPE__TANGENT_LINK:
			return getTangentLink();
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
		case CpacsPackage.TANGENT_LINKS_TYPE__TANGENT_LINK:
			getTangentLink().clear();
			getTangentLink().addAll((Collection<? extends StrutType>) newValue);
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
		case CpacsPackage.TANGENT_LINKS_TYPE__TANGENT_LINK:
			getTangentLink().clear();
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
		case CpacsPackage.TANGENT_LINKS_TYPE__TANGENT_LINK:
			return tangentLink != null && !tangentLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TangentLinksTypeImpl
