/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.ZCouplingType;
import Cpacs.ZCouplingsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZCouplings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ZCouplingsTypeImpl#getZCoupling <em>ZCoupling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZCouplingsTypeImpl extends ComplexBaseTypeImpl implements ZCouplingsType {
	/**
	 * The cached value of the '{@link #getZCoupling() <em>ZCoupling</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZCoupling()
	 * @generated
	 * @ordered
	 */
	protected EList<ZCouplingType> zCoupling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZCouplingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getZCouplingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZCouplingType> getZCoupling() {
		if (zCoupling == null) {
			zCoupling = new EObjectContainmentEList<ZCouplingType>(ZCouplingType.class, this,
					CpacsPackage.ZCOUPLINGS_TYPE__ZCOUPLING);
		}
		return zCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ZCOUPLINGS_TYPE__ZCOUPLING:
			return ((InternalEList<?>) getZCoupling()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ZCOUPLINGS_TYPE__ZCOUPLING:
			return getZCoupling();
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
		case CpacsPackage.ZCOUPLINGS_TYPE__ZCOUPLING:
			getZCoupling().clear();
			getZCoupling().addAll((Collection<? extends ZCouplingType>) newValue);
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
		case CpacsPackage.ZCOUPLINGS_TYPE__ZCOUPLING:
			getZCoupling().clear();
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
		case CpacsPackage.ZCOUPLINGS_TYPE__ZCOUPLING:
			return zCoupling != null && !zCoupling.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZCouplingsTypeImpl
