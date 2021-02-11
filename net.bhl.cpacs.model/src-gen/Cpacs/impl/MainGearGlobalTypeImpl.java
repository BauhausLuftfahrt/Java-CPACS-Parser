/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MainGearGlobalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Gear Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MainGearGlobalTypeImpl#getTotalLength <em>Total Length</em>}</li>
 *   <li>{@link Cpacs.impl.MainGearGlobalTypeImpl#getRetractAngle <em>Retract Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainGearGlobalTypeImpl extends ComplexBaseTypeImpl implements MainGearGlobalType {
	/**
	 * The cached value of the '{@link #getTotalLength() <em>Total Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType totalLength;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainGearGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMainGearGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTotalLength() {
		return totalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalLength(DoubleBaseType newTotalLength, NotificationChain msgs) {
		DoubleBaseType oldTotalLength = totalLength;
		totalLength = newTotalLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, oldTotalLength, newTotalLength);
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
	public void setTotalLength(DoubleBaseType newTotalLength) {
		if (newTotalLength != totalLength) {
			NotificationChain msgs = null;
			if (totalLength != null)
				msgs = ((InternalEObject) totalLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, null, msgs);
			if (newTotalLength != null)
				msgs = ((InternalEObject) newTotalLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, null, msgs);
			msgs = basicSetTotalLength(newTotalLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH,
					newTotalLength, newTotalLength));
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
					CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE, oldRetractAngle, newRetractAngle);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE, null, msgs);
			if (newRetractAngle != null)
				msgs = ((InternalEObject) newRetractAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE, null, msgs);
			msgs = basicSetRetractAngle(newRetractAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE,
					newRetractAngle, newRetractAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return basicSetTotalLength(null, msgs);
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			return basicSetRetractAngle(null, msgs);
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
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return getTotalLength();
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			return getRetractAngle();
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
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			setTotalLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			setRetractAngle((DoubleBaseType) newValue);
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
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			setTotalLength((DoubleBaseType) null);
			return;
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			setRetractAngle((DoubleBaseType) null);
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
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return totalLength != null;
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			return retractAngle != null;
		}
		return super.eIsSet(featureID);
	}

} //MainGearGlobalTypeImpl
