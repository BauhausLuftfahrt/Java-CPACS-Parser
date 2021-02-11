/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TransmissionGearRatioType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Gear Ratio Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TransmissionGearRatioTypeImpl#getReferenceShaftInputUID <em>Reference Shaft Input UID</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionGearRatioTypeImpl#getRatio <em>Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionGearRatioTypeImpl extends ComplexBaseTypeImpl implements TransmissionGearRatioType {
	/**
	 * The cached value of the '{@link #getReferenceShaftInputUID() <em>Reference Shaft Input UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceShaftInputUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType referenceShaftInputUID;

	/**
	 * The cached value of the '{@link #getRatio() <em>Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType ratio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionGearRatioTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTransmissionGearRatioType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReferenceShaftInputUID() {
		return referenceShaftInputUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceShaftInputUID(StringUIDBaseType newReferenceShaftInputUID,
			NotificationChain msgs) {
		StringUIDBaseType oldReferenceShaftInputUID = referenceShaftInputUID;
		referenceShaftInputUID = newReferenceShaftInputUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID, oldReferenceShaftInputUID,
					newReferenceShaftInputUID);
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
	public void setReferenceShaftInputUID(StringUIDBaseType newReferenceShaftInputUID) {
		if (newReferenceShaftInputUID != referenceShaftInputUID) {
			NotificationChain msgs = null;
			if (referenceShaftInputUID != null)
				msgs = ((InternalEObject) referenceShaftInputUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID,
						null, msgs);
			if (newReferenceShaftInputUID != null)
				msgs = ((InternalEObject) newReferenceShaftInputUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID,
						null, msgs);
			msgs = basicSetReferenceShaftInputUID(newReferenceShaftInputUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID, newReferenceShaftInputUID,
					newReferenceShaftInputUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRatio() {
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatio(DoubleBaseType newRatio, NotificationChain msgs) {
		DoubleBaseType oldRatio = ratio;
		ratio = newRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO, oldRatio, newRatio);
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
	public void setRatio(DoubleBaseType newRatio) {
		if (newRatio != ratio) {
			NotificationChain msgs = null;
			if (ratio != null)
				msgs = ((InternalEObject) ratio).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO, null, msgs);
			if (newRatio != null)
				msgs = ((InternalEObject) newRatio).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO, null, msgs);
			msgs = basicSetRatio(newRatio, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO,
					newRatio, newRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID:
			return basicSetReferenceShaftInputUID(null, msgs);
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO:
			return basicSetRatio(null, msgs);
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
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID:
			return getReferenceShaftInputUID();
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO:
			return getRatio();
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
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID:
			setReferenceShaftInputUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO:
			setRatio((DoubleBaseType) newValue);
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
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID:
			setReferenceShaftInputUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO:
			setRatio((DoubleBaseType) null);
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
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__REFERENCE_SHAFT_INPUT_UID:
			return referenceShaftInputUID != null;
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE__RATIO:
			return ratio != null;
		}
		return super.eIsSet(featureID);
	}

} //TransmissionGearRatioTypeImpl
