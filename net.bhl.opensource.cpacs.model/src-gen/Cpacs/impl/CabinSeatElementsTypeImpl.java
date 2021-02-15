/**
 */
package Cpacs.impl;

import Cpacs.CabinSeatElementType;
import Cpacs.CabinSeatElementsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin Seat Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabinSeatElementsTypeImpl#getSeatElement <em>Seat Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinSeatElementsTypeImpl extends ComplexBaseTypeImpl implements CabinSeatElementsType {
	/**
	 * The cached value of the '{@link #getSeatElement() <em>Seat Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CabinSeatElementType> seatElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CabinSeatElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabinSeatElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CabinSeatElementType> getSeatElement() {
		if (seatElement == null) {
			seatElement = new EObjectContainmentEList<CabinSeatElementType>(CabinSeatElementType.class, this,
					CpacsPackage.CABIN_SEAT_ELEMENTS_TYPE__SEAT_ELEMENT);
		}
		return seatElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CABIN_SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
			return ((InternalEList<?>) getSeatElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CABIN_SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
			return getSeatElement();
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
		case CpacsPackage.CABIN_SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
			getSeatElement().clear();
			getSeatElement().addAll((Collection<? extends CabinSeatElementType>) newValue);
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
		case CpacsPackage.CABIN_SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
			getSeatElement().clear();
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
		case CpacsPackage.CABIN_SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
			return seatElement != null && !seatElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CabinSeatElementsTypeImpl
