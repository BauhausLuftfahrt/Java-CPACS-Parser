/**
 */
package Cpacs.impl;

import Cpacs.BooleanBaseType;
import Cpacs.CpacsPackage;
import Cpacs.EngineSettingType;
import Cpacs.IntegerBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Setting Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineSettingTypeImpl#getModelEngineUID <em>Model Engine UID</em>}</li>
 *   <li>{@link Cpacs.impl.EngineSettingTypeImpl#getThrustLevel <em>Thrust Level</em>}</li>
 *   <li>{@link Cpacs.impl.EngineSettingTypeImpl#getInoperative <em>Inoperative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineSettingTypeImpl extends ComplexBaseTypeImpl implements EngineSettingType {
	/**
	 * The cached value of the '{@link #getModelEngineUID() <em>Model Engine UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelEngineUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType modelEngineUID;

	/**
	 * The cached value of the '{@link #getThrustLevel() <em>Thrust Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrustLevel()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType thrustLevel;

	/**
	 * The cached value of the '{@link #getInoperative() <em>Inoperative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInoperative()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType inoperative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineSettingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineSettingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getModelEngineUID() {
		return modelEngineUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelEngineUID(StringUIDBaseType newModelEngineUID, NotificationChain msgs) {
		StringUIDBaseType oldModelEngineUID = modelEngineUID;
		modelEngineUID = newModelEngineUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID, oldModelEngineUID, newModelEngineUID);
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
	public void setModelEngineUID(StringUIDBaseType newModelEngineUID) {
		if (newModelEngineUID != modelEngineUID) {
			NotificationChain msgs = null;
			if (modelEngineUID != null)
				msgs = ((InternalEObject) modelEngineUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID, null, msgs);
			if (newModelEngineUID != null)
				msgs = ((InternalEObject) newModelEngineUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID, null, msgs);
			msgs = basicSetModelEngineUID(newModelEngineUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID,
					newModelEngineUID, newModelEngineUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getThrustLevel() {
		return thrustLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrustLevel(IntegerBaseType newThrustLevel, NotificationChain msgs) {
		IntegerBaseType oldThrustLevel = thrustLevel;
		thrustLevel = newThrustLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL, oldThrustLevel, newThrustLevel);
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
	public void setThrustLevel(IntegerBaseType newThrustLevel) {
		if (newThrustLevel != thrustLevel) {
			NotificationChain msgs = null;
			if (thrustLevel != null)
				msgs = ((InternalEObject) thrustLevel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL, null, msgs);
			if (newThrustLevel != null)
				msgs = ((InternalEObject) newThrustLevel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL, null, msgs);
			msgs = basicSetThrustLevel(newThrustLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL,
					newThrustLevel, newThrustLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getInoperative() {
		return inoperative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInoperative(BooleanBaseType newInoperative, NotificationChain msgs) {
		BooleanBaseType oldInoperative = inoperative;
		inoperative = newInoperative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE, oldInoperative, newInoperative);
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
	public void setInoperative(BooleanBaseType newInoperative) {
		if (newInoperative != inoperative) {
			NotificationChain msgs = null;
			if (inoperative != null)
				msgs = ((InternalEObject) inoperative).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE, null, msgs);
			if (newInoperative != null)
				msgs = ((InternalEObject) newInoperative).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE, null, msgs);
			msgs = basicSetInoperative(newInoperative, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE,
					newInoperative, newInoperative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID:
			return basicSetModelEngineUID(null, msgs);
		case CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL:
			return basicSetThrustLevel(null, msgs);
		case CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE:
			return basicSetInoperative(null, msgs);
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
		case CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID:
			return getModelEngineUID();
		case CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL:
			return getThrustLevel();
		case CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE:
			return getInoperative();
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
		case CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID:
			setModelEngineUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL:
			setThrustLevel((IntegerBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE:
			setInoperative((BooleanBaseType) newValue);
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
		case CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID:
			setModelEngineUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL:
			setThrustLevel((IntegerBaseType) null);
			return;
		case CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE:
			setInoperative((BooleanBaseType) null);
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
		case CpacsPackage.ENGINE_SETTING_TYPE__MODEL_ENGINE_UID:
			return modelEngineUID != null;
		case CpacsPackage.ENGINE_SETTING_TYPE__THRUST_LEVEL:
			return thrustLevel != null;
		case CpacsPackage.ENGINE_SETTING_TYPE__INOPERATIVE:
			return inoperative != null;
		}
		return super.eIsSet(featureID);
	}

} //EngineSettingTypeImpl
