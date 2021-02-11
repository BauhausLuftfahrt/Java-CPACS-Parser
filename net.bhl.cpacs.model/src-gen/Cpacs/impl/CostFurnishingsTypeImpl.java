/**
 */
package Cpacs.impl;

import Cpacs.CostFixedEmergencyOxygenSystemsType;
import Cpacs.CostFurnishingElementsType;
import Cpacs.CostFurnishingsType;
import Cpacs.CostLightingSystemsType;
import Cpacs.CostWaterInstallationSystemsType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Furnishings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostFurnishingsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostFurnishingsTypeImpl#getFurnishingElements <em>Furnishing Elements</em>}</li>
 *   <li>{@link Cpacs.impl.CostFurnishingsTypeImpl#getFixedEmergencyOxygenSystems <em>Fixed Emergency Oxygen Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostFurnishingsTypeImpl#getLightingSystems <em>Lighting Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostFurnishingsTypeImpl#getWaterInstallationSystems <em>Water Installation Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostFurnishingsTypeImpl extends ComplexBaseTypeImpl implements CostFurnishingsType {
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
	 * The cached value of the '{@link #getFurnishingElements() <em>Furnishing Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurnishingElements()
	 * @generated
	 * @ordered
	 */
	protected CostFurnishingElementsType furnishingElements;

	/**
	 * The cached value of the '{@link #getFixedEmergencyOxygenSystems() <em>Fixed Emergency Oxygen Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedEmergencyOxygenSystems()
	 * @generated
	 * @ordered
	 */
	protected CostFixedEmergencyOxygenSystemsType fixedEmergencyOxygenSystems;

	/**
	 * The cached value of the '{@link #getLightingSystems() <em>Lighting Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightingSystems()
	 * @generated
	 * @ordered
	 */
	protected CostLightingSystemsType lightingSystems;

	/**
	 * The cached value of the '{@link #getWaterInstallationSystems() <em>Water Installation Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterInstallationSystems()
	 * @generated
	 * @ordered
	 */
	protected CostWaterInstallationSystemsType waterInstallationSystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostFurnishingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostFurnishingsType();
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
					CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION,
					newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFurnishingElementsType getFurnishingElements() {
		return furnishingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFurnishingElements(CostFurnishingElementsType newFurnishingElements,
			NotificationChain msgs) {
		CostFurnishingElementsType oldFurnishingElements = furnishingElements;
		furnishingElements = newFurnishingElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS, oldFurnishingElements,
					newFurnishingElements);
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
	public void setFurnishingElements(CostFurnishingElementsType newFurnishingElements) {
		if (newFurnishingElements != furnishingElements) {
			NotificationChain msgs = null;
			if (furnishingElements != null)
				msgs = ((InternalEObject) furnishingElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS, null, msgs);
			if (newFurnishingElements != null)
				msgs = ((InternalEObject) newFurnishingElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS, null, msgs);
			msgs = basicSetFurnishingElements(newFurnishingElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS, newFurnishingElements,
					newFurnishingElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFixedEmergencyOxygenSystemsType getFixedEmergencyOxygenSystems() {
		return fixedEmergencyOxygenSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedEmergencyOxygenSystems(
			CostFixedEmergencyOxygenSystemsType newFixedEmergencyOxygenSystems, NotificationChain msgs) {
		CostFixedEmergencyOxygenSystemsType oldFixedEmergencyOxygenSystems = fixedEmergencyOxygenSystems;
		fixedEmergencyOxygenSystems = newFixedEmergencyOxygenSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS, oldFixedEmergencyOxygenSystems,
					newFixedEmergencyOxygenSystems);
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
	public void setFixedEmergencyOxygenSystems(CostFixedEmergencyOxygenSystemsType newFixedEmergencyOxygenSystems) {
		if (newFixedEmergencyOxygenSystems != fixedEmergencyOxygenSystems) {
			NotificationChain msgs = null;
			if (fixedEmergencyOxygenSystems != null)
				msgs = ((InternalEObject) fixedEmergencyOxygenSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS,
						null, msgs);
			if (newFixedEmergencyOxygenSystems != null)
				msgs = ((InternalEObject) newFixedEmergencyOxygenSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS,
						null, msgs);
			msgs = basicSetFixedEmergencyOxygenSystems(newFixedEmergencyOxygenSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS, newFixedEmergencyOxygenSystems,
					newFixedEmergencyOxygenSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostLightingSystemsType getLightingSystems() {
		return lightingSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightingSystems(CostLightingSystemsType newLightingSystems,
			NotificationChain msgs) {
		CostLightingSystemsType oldLightingSystems = lightingSystems;
		lightingSystems = newLightingSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS, oldLightingSystems, newLightingSystems);
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
	public void setLightingSystems(CostLightingSystemsType newLightingSystems) {
		if (newLightingSystems != lightingSystems) {
			NotificationChain msgs = null;
			if (lightingSystems != null)
				msgs = ((InternalEObject) lightingSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS, null, msgs);
			if (newLightingSystems != null)
				msgs = ((InternalEObject) newLightingSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS, null, msgs);
			msgs = basicSetLightingSystems(newLightingSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS,
					newLightingSystems, newLightingSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostWaterInstallationSystemsType getWaterInstallationSystems() {
		return waterInstallationSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaterInstallationSystems(
			CostWaterInstallationSystemsType newWaterInstallationSystems, NotificationChain msgs) {
		CostWaterInstallationSystemsType oldWaterInstallationSystems = waterInstallationSystems;
		waterInstallationSystems = newWaterInstallationSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS, oldWaterInstallationSystems,
					newWaterInstallationSystems);
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
	public void setWaterInstallationSystems(CostWaterInstallationSystemsType newWaterInstallationSystems) {
		if (newWaterInstallationSystems != waterInstallationSystems) {
			NotificationChain msgs = null;
			if (waterInstallationSystems != null)
				msgs = ((InternalEObject) waterInstallationSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS, null,
						msgs);
			if (newWaterInstallationSystems != null)
				msgs = ((InternalEObject) newWaterInstallationSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS, null,
						msgs);
			msgs = basicSetWaterInstallationSystems(newWaterInstallationSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS, newWaterInstallationSystems,
					newWaterInstallationSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS:
			return basicSetFurnishingElements(null, msgs);
		case CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS:
			return basicSetFixedEmergencyOxygenSystems(null, msgs);
		case CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS:
			return basicSetLightingSystems(null, msgs);
		case CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS:
			return basicSetWaterInstallationSystems(null, msgs);
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
		case CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS:
			return getFurnishingElements();
		case CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS:
			return getFixedEmergencyOxygenSystems();
		case CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS:
			return getLightingSystems();
		case CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS:
			return getWaterInstallationSystems();
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
		case CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS:
			setFurnishingElements((CostFurnishingElementsType) newValue);
			return;
		case CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS:
			setFixedEmergencyOxygenSystems((CostFixedEmergencyOxygenSystemsType) newValue);
			return;
		case CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS:
			setLightingSystems((CostLightingSystemsType) newValue);
			return;
		case CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS:
			setWaterInstallationSystems((CostWaterInstallationSystemsType) newValue);
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
		case CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS:
			setFurnishingElements((CostFurnishingElementsType) null);
			return;
		case CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS:
			setFixedEmergencyOxygenSystems((CostFixedEmergencyOxygenSystemsType) null);
			return;
		case CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS:
			setLightingSystems((CostLightingSystemsType) null);
			return;
		case CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS:
			setWaterInstallationSystems((CostWaterInstallationSystemsType) null);
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
		case CpacsPackage.COST_FURNISHINGS_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.COST_FURNISHINGS_TYPE__FURNISHING_ELEMENTS:
			return furnishingElements != null;
		case CpacsPackage.COST_FURNISHINGS_TYPE__FIXED_EMERGENCY_OXYGEN_SYSTEMS:
			return fixedEmergencyOxygenSystems != null;
		case CpacsPackage.COST_FURNISHINGS_TYPE__LIGHTING_SYSTEMS:
			return lightingSystems != null;
		case CpacsPackage.COST_FURNISHINGS_TYPE__WATER_INSTALLATION_SYSTEMS:
			return waterInstallationSystems != null;
		}
		return super.eIsSet(featureID);
	}

} //CostFurnishingsTypeImpl
