/**
 */
package Cpacs.impl;

import Cpacs.AirframeMaintenanceCostType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;
import Cpacs.MaintenanceCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MaintenanceCostTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.MaintenanceCostTypeImpl#getAirframe <em>Airframe</em>}</li>
 *   <li>{@link Cpacs.impl.MaintenanceCostTypeImpl#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceCostTypeImpl extends ComplexBaseTypeImpl implements MaintenanceCostType {
	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType costDescription;

	/**
	 * The cached value of the '{@link #getAirframe() <em>Airframe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirframe()
	 * @generated
	 * @ordered
	 */
	protected AirframeMaintenanceCostType airframe;

	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType engine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenanceCostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMaintenanceCostType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getCostDescription() {
		return costDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostDescription(GenericCostType newCostDescription, NotificationChain msgs) {
		GenericCostType oldCostDescription = costDescription;
		costDescription = newCostDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
	public void setCostDescription(GenericCostType newCostDescription) {
		if (newCostDescription != costDescription) {
			NotificationChain msgs = null;
			if (costDescription != null)
				msgs = ((InternalEObject) costDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION,
					newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirframeMaintenanceCostType getAirframe() {
		return airframe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirframe(AirframeMaintenanceCostType newAirframe, NotificationChain msgs) {
		AirframeMaintenanceCostType oldAirframe = airframe;
		airframe = newAirframe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME, oldAirframe, newAirframe);
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
	public void setAirframe(AirframeMaintenanceCostType newAirframe) {
		if (newAirframe != airframe) {
			NotificationChain msgs = null;
			if (airframe != null)
				msgs = ((InternalEObject) airframe).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME, null, msgs);
			if (newAirframe != null)
				msgs = ((InternalEObject) newAirframe).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME, null, msgs);
			msgs = basicSetAirframe(newAirframe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME,
					newAirframe, newAirframe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngine(GenericCostType newEngine, NotificationChain msgs) {
		GenericCostType oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE, oldEngine, newEngine);
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
	public void setEngine(GenericCostType newEngine) {
		if (newEngine != engine) {
			NotificationChain msgs = null;
			if (engine != null)
				msgs = ((InternalEObject) engine).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE, null, msgs);
			if (newEngine != null)
				msgs = ((InternalEObject) newEngine).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE, null, msgs);
			msgs = basicSetEngine(newEngine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE, newEngine,
					newEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME:
			return basicSetAirframe(null, msgs);
		case CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE:
			return basicSetEngine(null, msgs);
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
		case CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME:
			return getAirframe();
		case CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE:
			return getEngine();
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
		case CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME:
			setAirframe((AirframeMaintenanceCostType) newValue);
			return;
		case CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE:
			setEngine((GenericCostType) newValue);
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
		case CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME:
			setAirframe((AirframeMaintenanceCostType) null);
			return;
		case CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE:
			setEngine((GenericCostType) null);
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
		case CpacsPackage.MAINTENANCE_COST_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.MAINTENANCE_COST_TYPE__AIRFRAME:
			return airframe != null;
		case CpacsPackage.MAINTENANCE_COST_TYPE__ENGINE:
			return engine != null;
		}
		return super.eIsSet(featureID);
	}

} //MaintenanceCostTypeImpl
