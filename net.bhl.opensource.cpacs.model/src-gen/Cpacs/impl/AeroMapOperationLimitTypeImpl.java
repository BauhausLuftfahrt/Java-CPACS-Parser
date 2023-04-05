/**
 */
package Cpacs.impl;

import Cpacs.AeroMapOperationLimitType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Map Operation Limit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroMapOperationLimitTypeImpl#getAngleOfAttackMin <em>Angle Of Attack Min</em>}</li>
 *   <li>{@link Cpacs.impl.AeroMapOperationLimitTypeImpl#getAngleOfAttackMax <em>Angle Of Attack Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroMapOperationLimitTypeImpl extends ComplexBaseTypeImpl implements AeroMapOperationLimitType {
	/**
	 * The cached value of the '{@link #getAngleOfAttackMin() <em>Angle Of Attack Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttackMin()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType angleOfAttackMin;

	/**
	 * The cached value of the '{@link #getAngleOfAttackMax() <em>Angle Of Attack Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttackMax()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType angleOfAttackMax;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroMapOperationLimitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroMapOperationLimitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getAngleOfAttackMin() {
		return angleOfAttackMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttackMin(DoubleVectorBaseType newAngleOfAttackMin,
			NotificationChain msgs) {
		DoubleVectorBaseType oldAngleOfAttackMin = angleOfAttackMin;
		angleOfAttackMin = newAngleOfAttackMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN, oldAngleOfAttackMin,
					newAngleOfAttackMin);
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
	public void setAngleOfAttackMin(DoubleVectorBaseType newAngleOfAttackMin) {
		if (newAngleOfAttackMin != angleOfAttackMin) {
			NotificationChain msgs = null;
			if (angleOfAttackMin != null)
				msgs = ((InternalEObject) angleOfAttackMin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN, null,
						msgs);
			if (newAngleOfAttackMin != null)
				msgs = ((InternalEObject) newAngleOfAttackMin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN, null,
						msgs);
			msgs = basicSetAngleOfAttackMin(newAngleOfAttackMin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN, newAngleOfAttackMin,
					newAngleOfAttackMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getAngleOfAttackMax() {
		return angleOfAttackMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttackMax(DoubleVectorBaseType newAngleOfAttackMax,
			NotificationChain msgs) {
		DoubleVectorBaseType oldAngleOfAttackMax = angleOfAttackMax;
		angleOfAttackMax = newAngleOfAttackMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX, oldAngleOfAttackMax,
					newAngleOfAttackMax);
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
	public void setAngleOfAttackMax(DoubleVectorBaseType newAngleOfAttackMax) {
		if (newAngleOfAttackMax != angleOfAttackMax) {
			NotificationChain msgs = null;
			if (angleOfAttackMax != null)
				msgs = ((InternalEObject) angleOfAttackMax).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX, null,
						msgs);
			if (newAngleOfAttackMax != null)
				msgs = ((InternalEObject) newAngleOfAttackMax).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX, null,
						msgs);
			msgs = basicSetAngleOfAttackMax(newAngleOfAttackMax, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX, newAngleOfAttackMax,
					newAngleOfAttackMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN:
			return basicSetAngleOfAttackMin(null, msgs);
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX:
			return basicSetAngleOfAttackMax(null, msgs);
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
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN:
			return getAngleOfAttackMin();
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX:
			return getAngleOfAttackMax();
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
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN:
			setAngleOfAttackMin((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX:
			setAngleOfAttackMax((DoubleVectorBaseType) newValue);
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
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN:
			setAngleOfAttackMin((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX:
			setAngleOfAttackMax((DoubleVectorBaseType) null);
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
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MIN:
			return angleOfAttackMin != null;
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE__ANGLE_OF_ATTACK_MAX:
			return angleOfAttackMax != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroMapOperationLimitTypeImpl
