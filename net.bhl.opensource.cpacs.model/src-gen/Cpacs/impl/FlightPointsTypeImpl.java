/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPointsType;
import Cpacs.GlobalFlightPointType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPointsTypeImpl#getFlightPoint <em>Flight Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPointsTypeImpl extends ComplexBaseTypeImpl implements FlightPointsType {
	/**
	 * The cached value of the '{@link #getFlightPoint() <em>Flight Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalFlightPointType> flightPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPointsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlobalFlightPointType> getFlightPoint() {
		if (flightPoint == null) {
			flightPoint = new EObjectContainmentEList<GlobalFlightPointType>(GlobalFlightPointType.class, this,
					CpacsPackage.FLIGHT_POINTS_TYPE__FLIGHT_POINT);
		}
		return flightPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_POINTS_TYPE__FLIGHT_POINT:
			return ((InternalEList<?>) getFlightPoint()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLIGHT_POINTS_TYPE__FLIGHT_POINT:
			return getFlightPoint();
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
		case CpacsPackage.FLIGHT_POINTS_TYPE__FLIGHT_POINT:
			getFlightPoint().clear();
			getFlightPoint().addAll((Collection<? extends GlobalFlightPointType>) newValue);
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
		case CpacsPackage.FLIGHT_POINTS_TYPE__FLIGHT_POINT:
			getFlightPoint().clear();
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
		case CpacsPackage.FLIGHT_POINTS_TYPE__FLIGHT_POINT:
			return flightPoint != null && !flightPoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlightPointsTypeImpl
