/**
 */
package Cpacs.impl;

import Cpacs.CoefficientsType;
import Cpacs.CpacsPackage;
import Cpacs.FuselageSegmentCoefficientsType;
import Cpacs.FuselageSegmentsCoefficientsType;

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
 * An implementation of the model object '<em><b>Fuselage Segments Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageSegmentsCoefficientsTypeImpl#getSegment <em>Segment</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentsCoefficientsTypeImpl#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageSegmentsCoefficientsTypeImpl extends ComplexBaseTypeImpl
		implements FuselageSegmentsCoefficientsType {
	/**
	 * The cached value of the '{@link #getSegment() <em>Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<FuselageSegmentCoefficientsType> segment;

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
	protected FuselageSegmentsCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageSegmentsCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuselageSegmentCoefficientsType> getSegment() {
		if (segment == null) {
			segment = new EObjectContainmentEList<FuselageSegmentCoefficientsType>(
					FuselageSegmentCoefficientsType.class, this,
					CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__SEGMENT);
		}
		return segment;
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
					CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION, oldCalibration, newCalibration);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION, null,
						msgs);
			if (newCalibration != null)
				msgs = ((InternalEObject) newCalibration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION, null,
						msgs);
			msgs = basicSetCalibration(newCalibration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION, newCalibration, newCalibration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__SEGMENT:
			return ((InternalEList<?>) getSegment()).basicRemove(otherEnd, msgs);
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION:
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
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__SEGMENT:
			return getSegment();
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION:
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
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__SEGMENT:
			getSegment().clear();
			getSegment().addAll((Collection<? extends FuselageSegmentCoefficientsType>) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION:
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
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__SEGMENT:
			getSegment().clear();
			return;
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION:
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
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__SEGMENT:
			return segment != null && !segment.isEmpty();
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE__CALIBRATION:
			return calibration != null;
		}
		return super.eIsSet(featureID);
	}

} //FuselageSegmentsCoefficientsTypeImpl
