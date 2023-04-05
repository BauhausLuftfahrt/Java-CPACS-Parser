/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseAeroDataType;
import Cpacs.AeroDataComponentsType;
import Cpacs.AeroDataVehicleType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Case Aero Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroCaseAeroDataTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseAeroDataTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseAeroDataTypeImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseAeroDataTypeImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroCaseAeroDataTypeImpl extends ComplexBaseTypeImpl implements AeroCaseAeroDataType {
	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleOfSideslip;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected AeroDataVehicleType vehicle;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected AeroDataComponentsType components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroCaseAeroDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroCaseAeroDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(DoubleBaseType newAngleOfAttack, NotificationChain msgs) {
		DoubleBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
	public void setAngleOfAttack(DoubleBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK, null, msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK, null, msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK, newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(DoubleBaseType newAngleOfSideslip, NotificationChain msgs) {
		DoubleBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip, newAngleOfSideslip);
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
	public void setAngleOfSideslip(DoubleBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP, newAngleOfSideslip, newAngleOfSideslip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroDataVehicleType getVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicle(AeroDataVehicleType newVehicle, NotificationChain msgs) {
		AeroDataVehicleType oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE, oldVehicle, newVehicle);
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
	public void setVehicle(AeroDataVehicleType newVehicle) {
		if (newVehicle != vehicle) {
			NotificationChain msgs = null;
			if (vehicle != null)
				msgs = ((InternalEObject) vehicle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE, null, msgs);
			if (newVehicle != null)
				msgs = ((InternalEObject) newVehicle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE, null, msgs);
			msgs = basicSetVehicle(newVehicle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE,
					newVehicle, newVehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroDataComponentsType getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(AeroDataComponentsType newComponents, NotificationChain msgs) {
		AeroDataComponentsType oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS, oldComponents, newComponents);
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
	public void setComponents(AeroDataComponentsType newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject) components).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject) newComponents).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS,
					newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE:
			return basicSetVehicle(null, msgs);
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS:
			return basicSetComponents(null, msgs);
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
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE:
			return getVehicle();
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS:
			return getComponents();
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
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE:
			setVehicle((AeroDataVehicleType) newValue);
			return;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS:
			setComponents((AeroDataComponentsType) newValue);
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
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE:
			setVehicle((AeroDataVehicleType) null);
			return;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS:
			setComponents((AeroDataComponentsType) null);
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
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__VEHICLE:
			return vehicle != null;
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE__COMPONENTS:
			return components != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroCaseAeroDataTypeImpl
