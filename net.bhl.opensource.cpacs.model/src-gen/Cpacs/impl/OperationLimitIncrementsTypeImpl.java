/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleArrayBaseType;
import Cpacs.OperationLimitIncrementsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Limit Increments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.OperationLimitIncrementsTypeImpl#getDeltaAngleOfAttackMin <em>Delta Angle Of Attack Min</em>}</li>
 *   <li>{@link Cpacs.impl.OperationLimitIncrementsTypeImpl#getDeltaAngleOfAttackMax <em>Delta Angle Of Attack Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationLimitIncrementsTypeImpl extends ComplexBaseTypeImpl implements OperationLimitIncrementsType {
	/**
	 * The cached value of the '{@link #getDeltaAngleOfAttackMin() <em>Delta Angle Of Attack Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaAngleOfAttackMin()
	 * @generated
	 * @ordered
	 */
	protected DoubleArrayBaseType deltaAngleOfAttackMin;

	/**
	 * The cached value of the '{@link #getDeltaAngleOfAttackMax() <em>Delta Angle Of Attack Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaAngleOfAttackMax()
	 * @generated
	 * @ordered
	 */
	protected DoubleArrayBaseType deltaAngleOfAttackMax;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationLimitIncrementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getOperationLimitIncrementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleArrayBaseType getDeltaAngleOfAttackMin() {
		return deltaAngleOfAttackMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaAngleOfAttackMin(DoubleArrayBaseType newDeltaAngleOfAttackMin,
			NotificationChain msgs) {
		DoubleArrayBaseType oldDeltaAngleOfAttackMin = deltaAngleOfAttackMin;
		deltaAngleOfAttackMin = newDeltaAngleOfAttackMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN, oldDeltaAngleOfAttackMin,
					newDeltaAngleOfAttackMin);
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
	public void setDeltaAngleOfAttackMin(DoubleArrayBaseType newDeltaAngleOfAttackMin) {
		if (newDeltaAngleOfAttackMin != deltaAngleOfAttackMin) {
			NotificationChain msgs = null;
			if (deltaAngleOfAttackMin != null)
				msgs = ((InternalEObject) deltaAngleOfAttackMin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN, null, msgs);
			if (newDeltaAngleOfAttackMin != null)
				msgs = ((InternalEObject) newDeltaAngleOfAttackMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN, null, msgs);
			msgs = basicSetDeltaAngleOfAttackMin(newDeltaAngleOfAttackMin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN, newDeltaAngleOfAttackMin,
					newDeltaAngleOfAttackMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleArrayBaseType getDeltaAngleOfAttackMax() {
		return deltaAngleOfAttackMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaAngleOfAttackMax(DoubleArrayBaseType newDeltaAngleOfAttackMax,
			NotificationChain msgs) {
		DoubleArrayBaseType oldDeltaAngleOfAttackMax = deltaAngleOfAttackMax;
		deltaAngleOfAttackMax = newDeltaAngleOfAttackMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX, oldDeltaAngleOfAttackMax,
					newDeltaAngleOfAttackMax);
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
	public void setDeltaAngleOfAttackMax(DoubleArrayBaseType newDeltaAngleOfAttackMax) {
		if (newDeltaAngleOfAttackMax != deltaAngleOfAttackMax) {
			NotificationChain msgs = null;
			if (deltaAngleOfAttackMax != null)
				msgs = ((InternalEObject) deltaAngleOfAttackMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX, null, msgs);
			if (newDeltaAngleOfAttackMax != null)
				msgs = ((InternalEObject) newDeltaAngleOfAttackMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX, null, msgs);
			msgs = basicSetDeltaAngleOfAttackMax(newDeltaAngleOfAttackMax, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX, newDeltaAngleOfAttackMax,
					newDeltaAngleOfAttackMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN:
			return basicSetDeltaAngleOfAttackMin(null, msgs);
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX:
			return basicSetDeltaAngleOfAttackMax(null, msgs);
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
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN:
			return getDeltaAngleOfAttackMin();
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX:
			return getDeltaAngleOfAttackMax();
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
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN:
			setDeltaAngleOfAttackMin((DoubleArrayBaseType) newValue);
			return;
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX:
			setDeltaAngleOfAttackMax((DoubleArrayBaseType) newValue);
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
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN:
			setDeltaAngleOfAttackMin((DoubleArrayBaseType) null);
			return;
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX:
			setDeltaAngleOfAttackMax((DoubleArrayBaseType) null);
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
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MIN:
			return deltaAngleOfAttackMin != null;
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE__DELTA_ANGLE_OF_ATTACK_MAX:
			return deltaAngleOfAttackMax != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationLimitIncrementsTypeImpl
