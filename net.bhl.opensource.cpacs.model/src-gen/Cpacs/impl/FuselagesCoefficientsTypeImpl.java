/**
 */
package Cpacs.impl;

import Cpacs.CoefficientsType;
import Cpacs.CpacsPackage;
import Cpacs.FuselageCoefficientsType;
import Cpacs.FuselagesCoefficientsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselages Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselagesCoefficientsTypeImpl#getFuselage <em>Fuselage</em>}</li>
 *   <li>{@link Cpacs.impl.FuselagesCoefficientsTypeImpl#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselagesCoefficientsTypeImpl extends ComplexBaseTypeImpl implements FuselagesCoefficientsType {
	/**
	 * The cached value of the '{@link #getFuselage() <em>Fuselage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselage()
	 * @generated
	 * @ordered
	 */
	protected EList<FuselageCoefficientsType> fuselage;

	/**
	 * The cached value of the '{@link #getCalibration() <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibration()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsType calibration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuselagesCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselagesCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuselageCoefficientsType> getFuselage() {
		if (fuselage == null) {
			fuselage = new EObjectContainmentEList<FuselageCoefficientsType>(FuselageCoefficientsType.class, this,
					CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__FUSELAGE);
		}
		return fuselage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsType getCalibration() {
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibration(CoefficientsType newCalibration, NotificationChain msgs) {
		CoefficientsType oldCalibration = calibration;
		calibration = newCalibration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION, oldCalibration, newCalibration);
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
	public void setCalibration(CoefficientsType newCalibration) {
		if (newCalibration != calibration) {
			NotificationChain msgs = null;
			if (calibration != null)
				msgs = ((InternalEObject) calibration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION, null, msgs);
			if (newCalibration != null)
				msgs = ((InternalEObject) newCalibration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION, null, msgs);
			msgs = basicSetCalibration(newCalibration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION,
					newCalibration, newCalibration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__FUSELAGE:
			return ((InternalEList<?>) getFuselage()).basicRemove(otherEnd, msgs);
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION:
			return basicSetCalibration(null, msgs);
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
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__FUSELAGE:
			return getFuselage();
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION:
			return getCalibration();
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
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__FUSELAGE:
			getFuselage().clear();
			getFuselage().addAll((Collection<? extends FuselageCoefficientsType>) newValue);
			return;
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION:
			setCalibration((CoefficientsType) newValue);
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
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__FUSELAGE:
			getFuselage().clear();
			return;
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION:
			setCalibration((CoefficientsType) null);
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
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__FUSELAGE:
			return fuselage != null && !fuselage.isEmpty();
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE__CALIBRATION:
			return calibration != null;
		}
		return super.eIsSet(featureID);
	}

} //FuselagesCoefficientsTypeImpl
