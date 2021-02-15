/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightSystemsType;
import Cpacs.HingeMomentsMapType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightSystemsTypeImpl#getHingeMomentMap <em>Hinge Moment Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightSystemsTypeImpl extends ComplexBaseTypeImpl implements FlightSystemsType {
	/**
	 * The cached value of the '{@link #getHingeMomentMap() <em>Hinge Moment Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHingeMomentMap()
	 * @generated
	 * @ordered
	 */
	protected HingeMomentsMapType hingeMomentMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightSystemsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HingeMomentsMapType getHingeMomentMap() {
		return hingeMomentMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHingeMomentMap(HingeMomentsMapType newHingeMomentMap, NotificationChain msgs) {
		HingeMomentsMapType oldHingeMomentMap = hingeMomentMap;
		hingeMomentMap = newHingeMomentMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP, oldHingeMomentMap, newHingeMomentMap);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHingeMomentMap(HingeMomentsMapType newHingeMomentMap) {
		if (newHingeMomentMap != hingeMomentMap) {
			NotificationChain msgs = null;
			if (hingeMomentMap != null)
				msgs = ((InternalEObject) hingeMomentMap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP, null, msgs);
			if (newHingeMomentMap != null)
				msgs = ((InternalEObject) newHingeMomentMap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP, null, msgs);
			msgs = basicSetHingeMomentMap(newHingeMomentMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP,
					newHingeMomentMap, newHingeMomentMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP:
			return basicSetHingeMomentMap(null, msgs);
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
		case CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP:
			return getHingeMomentMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP:
			setHingeMomentMap((HingeMomentsMapType) newValue);
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
		case CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP:
			setHingeMomentMap((HingeMomentsMapType) null);
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
		case CpacsPackage.FLIGHT_SYSTEMS_TYPE__HINGE_MOMENT_MAP:
			return hingeMomentMap != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightSystemsTypeImpl
