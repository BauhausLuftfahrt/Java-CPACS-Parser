/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SpecificHeatMapType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Heat Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SpecificHeatMapTypeImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link Cpacs.impl.SpecificHeatMapTypeImpl#getSpecificHeat <em>Specific Heat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificHeatMapTypeImpl extends ComplexBaseTypeImpl implements SpecificHeatMapType {
	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType temperature;

	/**
	 * The cached value of the '{@link #getSpecificHeat() <em>Specific Heat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeat()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType specificHeat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificHeatMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSpecificHeatMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperature(StringVectorBaseType newTemperature, NotificationChain msgs) {
		StringVectorBaseType oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE, oldTemperature, newTemperature);
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
	public void setTemperature(StringVectorBaseType newTemperature) {
		if (newTemperature != temperature) {
			NotificationChain msgs = null;
			if (temperature != null)
				msgs = ((InternalEObject) temperature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE, null, msgs);
			if (newTemperature != null)
				msgs = ((InternalEObject) newTemperature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE, null, msgs);
			msgs = basicSetTemperature(newTemperature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE,
					newTemperature, newTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getSpecificHeat() {
		return specificHeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificHeat(StringVectorBaseType newSpecificHeat, NotificationChain msgs) {
		StringVectorBaseType oldSpecificHeat = specificHeat;
		specificHeat = newSpecificHeat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT, oldSpecificHeat, newSpecificHeat);
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
	public void setSpecificHeat(StringVectorBaseType newSpecificHeat) {
		if (newSpecificHeat != specificHeat) {
			NotificationChain msgs = null;
			if (specificHeat != null)
				msgs = ((InternalEObject) specificHeat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT, null, msgs);
			if (newSpecificHeat != null)
				msgs = ((InternalEObject) newSpecificHeat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT, null, msgs);
			msgs = basicSetSpecificHeat(newSpecificHeat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT,
					newSpecificHeat, newSpecificHeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE:
			return basicSetTemperature(null, msgs);
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT:
			return basicSetSpecificHeat(null, msgs);
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
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE:
			return getTemperature();
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT:
			return getSpecificHeat();
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
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE:
			setTemperature((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT:
			setSpecificHeat((StringVectorBaseType) newValue);
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
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE:
			setTemperature((StringVectorBaseType) null);
			return;
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT:
			setSpecificHeat((StringVectorBaseType) null);
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
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__TEMPERATURE:
			return temperature != null;
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE__SPECIFIC_HEAT:
			return specificHeat != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificHeatMapTypeImpl
