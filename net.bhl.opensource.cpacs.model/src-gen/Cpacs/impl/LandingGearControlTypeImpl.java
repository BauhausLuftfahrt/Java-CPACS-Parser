/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LandingGearControlFunctionsType;
import Cpacs.LandingGearControlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Control Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearControlTypeImpl#getRetractAngle <em>Retract Angle</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearControlTypeImpl#getControlFunctions <em>Control Functions</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearControlTypeImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearControlTypeImpl extends ComplexBaseTypeImpl implements LandingGearControlType {
	/**
	 * The cached value of the '{@link #getRetractAngle() <em>Retract Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetractAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType retractAngle;

	/**
	 * The cached value of the '{@link #getControlFunctions() <em>Control Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFunctions()
	 * @generated
	 * @ordered
	 */
	protected LandingGearControlFunctionsType controlFunctions;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearControlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearControlType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRetractAngle() {
		return retractAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetractAngle(DoubleBaseType newRetractAngle, NotificationChain msgs) {
		DoubleBaseType oldRetractAngle = retractAngle;
		retractAngle = newRetractAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE, oldRetractAngle, newRetractAngle);
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
	public void setRetractAngle(DoubleBaseType newRetractAngle) {
		if (newRetractAngle != retractAngle) {
			NotificationChain msgs = null;
			if (retractAngle != null)
				msgs = ((InternalEObject) retractAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE, null, msgs);
			if (newRetractAngle != null)
				msgs = ((InternalEObject) newRetractAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE, null, msgs);
			msgs = basicSetRetractAngle(newRetractAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE,
					newRetractAngle, newRetractAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearControlFunctionsType getControlFunctions() {
		return controlFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlFunctions(LandingGearControlFunctionsType newControlFunctions,
			NotificationChain msgs) {
		LandingGearControlFunctionsType oldControlFunctions = controlFunctions;
		controlFunctions = newControlFunctions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS, oldControlFunctions,
					newControlFunctions);
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
	public void setControlFunctions(LandingGearControlFunctionsType newControlFunctions) {
		if (newControlFunctions != controlFunctions) {
			NotificationChain msgs = null;
			if (controlFunctions != null)
				msgs = ((InternalEObject) controlFunctions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS, null, msgs);
			if (newControlFunctions != null)
				msgs = ((InternalEObject) newControlFunctions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS, null, msgs);
			msgs = basicSetControlFunctions(newControlFunctions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS, newControlFunctions,
					newControlFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(DoubleBaseType newOffset, NotificationChain msgs) {
		DoubleBaseType oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET, oldOffset, newOffset);
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
	public void setOffset(DoubleBaseType newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject) offset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject) newOffset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET,
					newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE:
			return basicSetRetractAngle(null, msgs);
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS:
			return basicSetControlFunctions(null, msgs);
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET:
			return basicSetOffset(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE:
			return getRetractAngle();
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS:
			return getControlFunctions();
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET:
			return getOffset();
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
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE:
			setRetractAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS:
			setControlFunctions((LandingGearControlFunctionsType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET:
			setOffset((DoubleBaseType) newValue);
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
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE:
			setRetractAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS:
			setControlFunctions((LandingGearControlFunctionsType) null);
			return;
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET:
			setOffset((DoubleBaseType) null);
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
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__RETRACT_ANGLE:
			return retractAngle != null;
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__CONTROL_FUNCTIONS:
			return controlFunctions != null;
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE__OFFSET:
			return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //LandingGearControlTypeImpl
