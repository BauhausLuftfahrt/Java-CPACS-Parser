/**
 */
package Cpacs.impl;

import Cpacs.AtmosphericModelOldType;
import Cpacs.AtmosphericModelType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atmospheric Model Old Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AtmosphericModelOldTypeImpl#getAtmosphericModel <em>Atmospheric Model</em>}</li>
 *   <li>{@link Cpacs.impl.AtmosphericModelOldTypeImpl#getDeltaTemperature <em>Delta Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtmosphericModelOldTypeImpl extends ComplexBaseTypeImpl implements AtmosphericModelOldType {
	/**
	 * The cached value of the '{@link #getAtmosphericModel() <em>Atmospheric Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtmosphericModel()
	 * @generated
	 * @ordered
	 */
	protected AtmosphericModelType atmosphericModel;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtmosphericModelOldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAtmosphericModelOldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosphericModelType getAtmosphericModel() {
		return atmosphericModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtmosphericModel(AtmosphericModelType newAtmosphericModel,
			NotificationChain msgs) {
		AtmosphericModelType oldAtmosphericModel = atmosphericModel;
		atmosphericModel = newAtmosphericModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL, oldAtmosphericModel,
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
	public void setAtmosphericModel(AtmosphericModelType newAtmosphericModel) {
		if (newAtmosphericModel != atmosphericModel) {
			NotificationChain msgs = null;
			if (atmosphericModel != null)
				msgs = ((InternalEObject) atmosphericModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL, null,
						msgs);
			if (newAtmosphericModel != null)
				msgs = ((InternalEObject) newAtmosphericModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL, null,
						msgs);
			msgs = basicSetAtmosphericModel(newAtmosphericModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL, newAtmosphericModel,
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
					CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE, oldDeltaTemperature,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE, null,
						msgs);
			if (newDeltaTemperature != null)
				msgs = ((InternalEObject) newDeltaTemperature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE, null,
						msgs);
			msgs = basicSetDeltaTemperature(newDeltaTemperature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE, newDeltaTemperature,
					newDeltaTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL:
			return basicSetAtmosphericModel(null, msgs);
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE:
			return basicSetDeltaTemperature(null, msgs);
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
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL:
			return getAtmosphericModel();
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE:
			return getDeltaTemperature();
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
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL:
			setAtmosphericModel((AtmosphericModelType) newValue);
			return;
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DoubleBaseType) newValue);
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
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL:
			setAtmosphericModel((AtmosphericModelType) null);
			return;
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DoubleBaseType) null);
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
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__ATMOSPHERIC_MODEL:
			return atmosphericModel != null;
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE__DELTA_TEMPERATURE:
			return deltaTemperature != null;
		}
		return super.eIsSet(featureID);
	}

} //AtmosphericModelOldTypeImpl
