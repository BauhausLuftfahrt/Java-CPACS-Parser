/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightDynamicsAnalysisType;
import Cpacs.FlightDynamicsFlightCasesType;
import Cpacs.FlightDynamicsModelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Dynamics Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightDynamicsAnalysisTypeImpl#getFlightCases <em>Flight Cases</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsAnalysisTypeImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightDynamicsAnalysisTypeImpl extends ComplexBaseTypeImpl implements FlightDynamicsAnalysisType {
	/**
	 * The cached value of the '{@link #getFlightCases() <em>Flight Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightCases()
	 * @generated
	 * @ordered
	 */
	protected FlightDynamicsFlightCasesType flightCases;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected FlightDynamicsModelType model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightDynamicsAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightDynamicsAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsFlightCasesType getFlightCases() {
		return flightCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightCases(FlightDynamicsFlightCasesType newFlightCases, NotificationChain msgs) {
		FlightDynamicsFlightCasesType oldFlightCases = flightCases;
		flightCases = newFlightCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES, oldFlightCases, newFlightCases);
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
	public void setFlightCases(FlightDynamicsFlightCasesType newFlightCases) {
		if (newFlightCases != flightCases) {
			NotificationChain msgs = null;
			if (flightCases != null)
				msgs = ((InternalEObject) flightCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES, null, msgs);
			if (newFlightCases != null)
				msgs = ((InternalEObject) newFlightCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES, null, msgs);
			msgs = basicSetFlightCases(newFlightCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES, newFlightCases, newFlightCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsModelType getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(FlightDynamicsModelType newModel, NotificationChain msgs) {
		FlightDynamicsModelType oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL, oldModel, newModel);
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
	public void setModel(FlightDynamicsModelType newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL,
					newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES:
			return basicSetFlightCases(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL:
			return basicSetModel(null, msgs);
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
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES:
			return getFlightCases();
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL:
			return getModel();
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
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES:
			setFlightCases((FlightDynamicsFlightCasesType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL:
			setModel((FlightDynamicsModelType) newValue);
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
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES:
			setFlightCases((FlightDynamicsFlightCasesType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL:
			setModel((FlightDynamicsModelType) null);
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
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_CASES:
			return flightCases != null;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__MODEL:
			return model != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightDynamicsAnalysisTypeImpl
