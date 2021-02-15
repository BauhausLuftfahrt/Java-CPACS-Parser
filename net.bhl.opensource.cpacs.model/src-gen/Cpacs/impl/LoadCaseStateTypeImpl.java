/**
 */
package Cpacs.impl;

import Cpacs.AtmosphericConditionsType;
import Cpacs.AttitudeAndMotionType;
import Cpacs.CpacsPackage;
import Cpacs.LoadCaseStateType;
import Cpacs.PointXYZType;
import Cpacs.TrimParametersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case State Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseStateTypeImpl#getAtmosphericConditions <em>Atmospheric Conditions</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseStateTypeImpl#getTrimParameters <em>Trim Parameters</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseStateTypeImpl#getWind <em>Wind</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseStateTypeImpl#getAttitudeAndMotion <em>Attitude And Motion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseStateTypeImpl extends ComplexBaseTypeImpl implements LoadCaseStateType {
	/**
	 * The cached value of the '{@link #getAtmosphericConditions() <em>Atmospheric Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtmosphericConditions()
	 * @generated
	 * @ordered
	 */
	protected AtmosphericConditionsType atmosphericConditions;

	/**
	 * The cached value of the '{@link #getTrimParameters() <em>Trim Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimParameters()
	 * @generated
	 * @ordered
	 */
	protected TrimParametersType trimParameters;

	/**
	 * The cached value of the '{@link #getWind() <em>Wind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType wind;

	/**
	 * The cached value of the '{@link #getAttitudeAndMotion() <em>Attitude And Motion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeAndMotion()
	 * @generated
	 * @ordered
	 */
	protected AttitudeAndMotionType attitudeAndMotion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseStateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseStateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosphericConditionsType getAtmosphericConditions() {
		return atmosphericConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtmosphericConditions(AtmosphericConditionsType newAtmosphericConditions,
			NotificationChain msgs) {
		AtmosphericConditionsType oldAtmosphericConditions = atmosphericConditions;
		atmosphericConditions = newAtmosphericConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS, oldAtmosphericConditions,
					newAtmosphericConditions);
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
	public void setAtmosphericConditions(AtmosphericConditionsType newAtmosphericConditions) {
		if (newAtmosphericConditions != atmosphericConditions) {
			NotificationChain msgs = null;
			if (atmosphericConditions != null)
				msgs = ((InternalEObject) atmosphericConditions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS, null, msgs);
			if (newAtmosphericConditions != null)
				msgs = ((InternalEObject) newAtmosphericConditions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS, null, msgs);
			msgs = basicSetAtmosphericConditions(newAtmosphericConditions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS, newAtmosphericConditions,
					newAtmosphericConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrimParametersType getTrimParameters() {
		return trimParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrimParameters(TrimParametersType newTrimParameters, NotificationChain msgs) {
		TrimParametersType oldTrimParameters = trimParameters;
		trimParameters = newTrimParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS, oldTrimParameters, newTrimParameters);
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
	public void setTrimParameters(TrimParametersType newTrimParameters) {
		if (newTrimParameters != trimParameters) {
			NotificationChain msgs = null;
			if (trimParameters != null)
				msgs = ((InternalEObject) trimParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS, null, msgs);
			if (newTrimParameters != null)
				msgs = ((InternalEObject) newTrimParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS, null, msgs);
			msgs = basicSetTrimParameters(newTrimParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS,
					newTrimParameters, newTrimParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getWind() {
		return wind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWind(PointXYZType newWind, NotificationChain msgs) {
		PointXYZType oldWind = wind;
		wind = newWind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_STATE_TYPE__WIND, oldWind, newWind);
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
	public void setWind(PointXYZType newWind) {
		if (newWind != wind) {
			NotificationChain msgs = null;
			if (wind != null)
				msgs = ((InternalEObject) wind).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_STATE_TYPE__WIND, null, msgs);
			if (newWind != null)
				msgs = ((InternalEObject) newWind).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_STATE_TYPE__WIND, null, msgs);
			msgs = basicSetWind(newWind, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_STATE_TYPE__WIND, newWind,
					newWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttitudeAndMotionType getAttitudeAndMotion() {
		return attitudeAndMotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttitudeAndMotion(AttitudeAndMotionType newAttitudeAndMotion,
			NotificationChain msgs) {
		AttitudeAndMotionType oldAttitudeAndMotion = attitudeAndMotion;
		attitudeAndMotion = newAttitudeAndMotion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION, oldAttitudeAndMotion, newAttitudeAndMotion);
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
	public void setAttitudeAndMotion(AttitudeAndMotionType newAttitudeAndMotion) {
		if (newAttitudeAndMotion != attitudeAndMotion) {
			NotificationChain msgs = null;
			if (attitudeAndMotion != null)
				msgs = ((InternalEObject) attitudeAndMotion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION, null, msgs);
			if (newAttitudeAndMotion != null)
				msgs = ((InternalEObject) newAttitudeAndMotion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION, null, msgs);
			msgs = basicSetAttitudeAndMotion(newAttitudeAndMotion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION, newAttitudeAndMotion,
					newAttitudeAndMotion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS:
			return basicSetAtmosphericConditions(null, msgs);
		case CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS:
			return basicSetTrimParameters(null, msgs);
		case CpacsPackage.LOAD_CASE_STATE_TYPE__WIND:
			return basicSetWind(null, msgs);
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION:
			return basicSetAttitudeAndMotion(null, msgs);
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
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS:
			return getAtmosphericConditions();
		case CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS:
			return getTrimParameters();
		case CpacsPackage.LOAD_CASE_STATE_TYPE__WIND:
			return getWind();
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION:
			return getAttitudeAndMotion();
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
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS:
			setAtmosphericConditions((AtmosphericConditionsType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS:
			setTrimParameters((TrimParametersType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__WIND:
			setWind((PointXYZType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION:
			setAttitudeAndMotion((AttitudeAndMotionType) newValue);
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
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS:
			setAtmosphericConditions((AtmosphericConditionsType) null);
			return;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS:
			setTrimParameters((TrimParametersType) null);
			return;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__WIND:
			setWind((PointXYZType) null);
			return;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION:
			setAttitudeAndMotion((AttitudeAndMotionType) null);
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
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATMOSPHERIC_CONDITIONS:
			return atmosphericConditions != null;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__TRIM_PARAMETERS:
			return trimParameters != null;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__WIND:
			return wind != null;
		case CpacsPackage.LOAD_CASE_STATE_TYPE__ATTITUDE_AND_MOTION:
			return attitudeAndMotion != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseStateTypeImpl
