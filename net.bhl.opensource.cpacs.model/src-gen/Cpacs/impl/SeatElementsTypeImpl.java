/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SeatElementType;
import Cpacs.SeatElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SeatElementsTypeImpl#getSeatElement <em>Seat Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeatElementsTypeImpl extends ComplexBaseTypeImpl implements SeatElementsType {
	/**
	 * The cached value of the '{@link #getSeatElement() <em>Seat Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SeatElementType> seatElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeatElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSeatElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeatElementType> getSeatElement() {
		if (seatElement == null) {
			seatElement = new EObjectContainmentEList<SeatElementType>(SeatElementType.class, this,
					CpacsPackage.SEAT_ELEMENTS_TYPE__SEAT_ELEMENT);
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
		case CpacsPackage.SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
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
		case CpacsPackage.SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
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
		case CpacsPackage.SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
			getSeatElement().clear();
			getSeatElement().addAll((Collection<? extends SeatElementType>) newValue);
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
		case CpacsPackage.SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
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
		case CpacsPackage.SEAT_ELEMENTS_TYPE__SEAT_ELEMENT:
			return seatElement != null && !seatElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SeatElementsTypeImpl
