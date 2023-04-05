/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckComponent2DBaseType;
import Cpacs.SeatModulesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat Modules Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SeatModulesTypeImpl#getSeatModule <em>Seat Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeatModulesTypeImpl extends ComplexBaseTypeImpl implements SeatModulesType {
	/**
	 * The cached value of the '{@link #getSeatModule() <em>Seat Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatModule()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckComponent2DBaseType> seatModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeatModulesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSeatModulesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckComponent2DBaseType> getSeatModule() {
		if (seatModule == null) {
			seatModule = new EObjectContainmentEList<DeckComponent2DBaseType>(DeckComponent2DBaseType.class, this,
					CpacsPackage.SEAT_MODULES_TYPE__SEAT_MODULE);
		}
		return seatModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SEAT_MODULES_TYPE__SEAT_MODULE:
			return ((InternalEList<?>) getSeatModule()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SEAT_MODULES_TYPE__SEAT_MODULE:
			return getSeatModule();
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
		case CpacsPackage.SEAT_MODULES_TYPE__SEAT_MODULE:
			getSeatModule().clear();
			getSeatModule().addAll((Collection<? extends DeckComponent2DBaseType>) newValue);
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
		case CpacsPackage.SEAT_MODULES_TYPE__SEAT_MODULE:
			getSeatModule().clear();
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
		case CpacsPackage.SEAT_MODULES_TYPE__SEAT_MODULE:
			return seatModule != null && !seatModule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SeatModulesTypeImpl
