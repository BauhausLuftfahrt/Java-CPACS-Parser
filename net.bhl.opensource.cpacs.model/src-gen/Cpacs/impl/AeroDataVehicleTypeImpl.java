/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseCoefficientsType;
import Cpacs.AeroDataVehicleType;
import Cpacs.CoefficientsBreakdownType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Data Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroDataVehicleTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.AeroDataVehicleTypeImpl#getCoefficientsBreakdown <em>Coefficients Breakdown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroDataVehicleTypeImpl extends ComplexBaseTypeImpl implements AeroDataVehicleType {
	/**
	 * The cached value of the '{@link #getCoefficients() <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficients()
	 * @generated
	 * @ordered
	 */
	protected AeroCaseCoefficientsType coefficients;

	/**
	 * The cached value of the '{@link #getCoefficientsBreakdown() <em>Coefficients Breakdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficientsBreakdown()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsBreakdownType coefficientsBreakdown;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroDataVehicleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroDataVehicleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroCaseCoefficientsType getCoefficients() {
		return coefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoefficients(AeroCaseCoefficientsType newCoefficients, NotificationChain msgs) {
		AeroCaseCoefficientsType oldCoefficients = coefficients;
		coefficients = newCoefficients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
	public void setCoefficients(AeroCaseCoefficientsType newCoefficients) {
		if (newCoefficients != coefficients) {
			NotificationChain msgs = null;
			if (coefficients != null)
				msgs = ((InternalEObject) coefficients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS, null, msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS, null, msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS,
					newCoefficients, newCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsBreakdownType getCoefficientsBreakdown() {
		return coefficientsBreakdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoefficientsBreakdown(CoefficientsBreakdownType newCoefficientsBreakdown,
			NotificationChain msgs) {
		CoefficientsBreakdownType oldCoefficientsBreakdown = coefficientsBreakdown;
		coefficientsBreakdown = newCoefficientsBreakdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN, oldCoefficientsBreakdown,
					newCoefficientsBreakdown);
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
	public void setCoefficientsBreakdown(CoefficientsBreakdownType newCoefficientsBreakdown) {
		if (newCoefficientsBreakdown != coefficientsBreakdown) {
			NotificationChain msgs = null;
			if (coefficientsBreakdown != null)
				msgs = ((InternalEObject) coefficientsBreakdown).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN, null,
						msgs);
			if (newCoefficientsBreakdown != null)
				msgs = ((InternalEObject) newCoefficientsBreakdown).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN, null,
						msgs);
			msgs = basicSetCoefficientsBreakdown(newCoefficientsBreakdown, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN, newCoefficientsBreakdown,
					newCoefficientsBreakdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN:
			return basicSetCoefficientsBreakdown(null, msgs);
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
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS:
			return getCoefficients();
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN:
			return getCoefficientsBreakdown();
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
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) newValue);
			return;
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN:
			setCoefficientsBreakdown((CoefficientsBreakdownType) newValue);
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
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) null);
			return;
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN:
			setCoefficientsBreakdown((CoefficientsBreakdownType) null);
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
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS:
			return coefficients != null;
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE__COEFFICIENTS_BREAKDOWN:
			return coefficientsBreakdown != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroDataVehicleTypeImpl
