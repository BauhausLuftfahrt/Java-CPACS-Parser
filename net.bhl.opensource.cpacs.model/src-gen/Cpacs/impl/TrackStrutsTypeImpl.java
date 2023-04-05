/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TrackStrutType;
import Cpacs.TrackStrutsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Struts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrackStrutsTypeImpl#getStrut <em>Strut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackStrutsTypeImpl extends ComplexBaseTypeImpl implements TrackStrutsType {
	/**
	 * The cached value of the '{@link #getStrut() <em>Strut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrut()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackStrutType> strut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackStrutsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrackStrutsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrackStrutType> getStrut() {
		if (strut == null) {
			strut = new EObjectContainmentEList<TrackStrutType>(TrackStrutType.class, this,
					CpacsPackage.TRACK_STRUTS_TYPE__STRUT);
		}
		return strut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRACK_STRUTS_TYPE__STRUT:
			return ((InternalEList<?>) getStrut()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TRACK_STRUTS_TYPE__STRUT:
			return getStrut();
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
		case CpacsPackage.TRACK_STRUTS_TYPE__STRUT:
			getStrut().clear();
			getStrut().addAll((Collection<? extends TrackStrutType>) newValue);
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
		case CpacsPackage.TRACK_STRUTS_TYPE__STRUT:
			getStrut().clear();
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
		case CpacsPackage.TRACK_STRUTS_TYPE__STRUT:
			return strut != null && !strut.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrackStrutsTypeImpl
