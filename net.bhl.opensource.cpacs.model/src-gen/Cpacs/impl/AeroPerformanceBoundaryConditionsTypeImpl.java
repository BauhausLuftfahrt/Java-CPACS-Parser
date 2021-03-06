/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceBoundaryConditionsType;
import Cpacs.AeroPerformanceControlElementsType;
import Cpacs.AtmosphericModelType1;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Performance Boundary Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroPerformanceBoundaryConditionsTypeImpl#getAtmosphericModel <em>Atmospheric Model</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceBoundaryConditionsTypeImpl#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceBoundaryConditionsTypeImpl#getControlElements <em>Control Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroPerformanceBoundaryConditionsTypeImpl extends ComplexBaseTypeImpl
		implements AeroPerformanceBoundaryConditionsType {
	/**
	 * The cached value of the '{@link #getAtmosphericModel() <em>Atmospheric Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtmosphericModel()
	 * @generated
	 * @ordered
	 */
	protected AtmosphericModelType1 atmosphericModel;

	/**
	 * The cached value of the '{@link #getDeltaTemperature() <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTemperature()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaTemperature;

	/**
	 * The cached value of the '{@link #getControlElements() <em>Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlElements()
	 * @generated
	 * @ordered
	 */
	protected AeroPerformanceControlElementsType controlElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroPerformanceBoundaryConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroPerformanceBoundaryConditionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosphericModelType1 getAtmosphericModel() {
		return atmosphericModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtmosphericModel(AtmosphericModelType1 newAtmosphericModel,
			NotificationChain msgs) {
		AtmosphericModelType1 oldAtmosphericModel = atmosphericModel;
		atmosphericModel = newAtmosphericModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL, oldAtmosphericModel,
					newAtmosphericModel);
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
	public void setAtmosphericModel(AtmosphericModelType1 newAtmosphericModel) {
		if (newAtmosphericModel != atmosphericModel) {
			NotificationChain msgs = null;
			if (atmosphericModel != null)
				msgs = ((InternalEObject) atmosphericModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL,
						null, msgs);
			if (newAtmosphericModel != null)
				msgs = ((InternalEObject) newAtmosphericModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL,
						null, msgs);
			msgs = basicSetAtmosphericModel(newAtmosphericModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL, newAtmosphericModel,
					newAtmosphericModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaTemperature() {
		return deltaTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaTemperature(DoubleBaseType newDeltaTemperature, NotificationChain msgs) {
		DoubleBaseType oldDeltaTemperature = deltaTemperature;
		deltaTemperature = newDeltaTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE, oldDeltaTemperature,
					newDeltaTemperature);
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
	public void setDeltaTemperature(DoubleBaseType newDeltaTemperature) {
		if (newDeltaTemperature != deltaTemperature) {
			NotificationChain msgs = null;
			if (deltaTemperature != null)
				msgs = ((InternalEObject) deltaTemperature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE,
						null, msgs);
			if (newDeltaTemperature != null)
				msgs = ((InternalEObject) newDeltaTemperature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE,
						null, msgs);
			msgs = basicSetDeltaTemperature(newDeltaTemperature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE, newDeltaTemperature,
					newDeltaTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceControlElementsType getControlElements() {
		return controlElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlElements(AeroPerformanceControlElementsType newControlElements,
			NotificationChain msgs) {
		AeroPerformanceControlElementsType oldControlElements = controlElements;
		controlElements = newControlElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS, oldControlElements,
					newControlElements);
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
	public void setControlElements(AeroPerformanceControlElementsType newControlElements) {
		if (newControlElements != controlElements) {
			NotificationChain msgs = null;
			if (controlElements != null)
				msgs = ((InternalEObject) controlElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS, null, msgs);
			if (newControlElements != null)
				msgs = ((InternalEObject) newControlElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS, null, msgs);
			msgs = basicSetControlElements(newControlElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS, newControlElements,
					newControlElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL:
			return basicSetAtmosphericModel(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			return basicSetDeltaTemperature(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS:
			return basicSetControlElements(null, msgs);
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
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL:
			return getAtmosphericModel();
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			return getDeltaTemperature();
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS:
			return getControlElements();
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
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL:
			setAtmosphericModel((AtmosphericModelType1) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS:
			setControlElements((AeroPerformanceControlElementsType) newValue);
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
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL:
			setAtmosphericModel((AtmosphericModelType1) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS:
			setControlElements((AeroPerformanceControlElementsType) null);
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
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__ATMOSPHERIC_MODEL:
			return atmosphericModel != null;
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__DELTA_TEMPERATURE:
			return deltaTemperature != null;
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE__CONTROL_ELEMENTS:
			return controlElements != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroPerformanceBoundaryConditionsTypeImpl
