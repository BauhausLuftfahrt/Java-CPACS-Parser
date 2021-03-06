/**
 */
package Cpacs.impl;

import Cpacs.ActuatorFuselageWingType;
import Cpacs.ActuatorsFuselageWingType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuators Fuselage Wing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ActuatorsFuselageWingTypeImpl#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorsFuselageWingTypeImpl extends ComplexBaseTypeImpl implements ActuatorsFuselageWingType {
	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorFuselageWingType> actuator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorsFuselageWingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getActuatorsFuselageWingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActuatorFuselageWingType> getActuator() {
		if (actuator == null) {
			actuator = new EObjectContainmentEList<ActuatorFuselageWingType>(ActuatorFuselageWingType.class, this,
					CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE__ACTUATOR);
		}
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE__ACTUATOR:
			return ((InternalEList<?>) getActuator()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE__ACTUATOR:
			return getActuator();
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
		case CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE__ACTUATOR:
			getActuator().clear();
			getActuator().addAll((Collection<? extends ActuatorFuselageWingType>) newValue);
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
		case CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE__ACTUATOR:
			getActuator().clear();
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
		case CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE__ACTUATOR:
			return actuator != null && !actuator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActuatorsFuselageWingTypeImpl
