/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.TransmissionGearRatioType;
import Cpacs.TransmissionShaftOutputType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Shaft Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TransmissionShaftOutputTypeImpl#getNominalRotationsPerMinute <em>Nominal Rotations Per Minute</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionShaftOutputTypeImpl#getGearRatio <em>Gear Ratio</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionShaftOutputTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionShaftOutputTypeImpl extends ComplexBaseTypeImpl implements TransmissionShaftOutputType {
	/**
	 * The cached value of the '{@link #getNominalRotationsPerMinute() <em>Nominal Rotations Per Minute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalRotationsPerMinute()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nominalRotationsPerMinute;

	/**
	 * The cached value of the '{@link #getGearRatio() <em>Gear Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGearRatio()
	 * @generated
	 * @ordered
	 */
	protected TransmissionGearRatioType gearRatio;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionShaftOutputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTransmissionShaftOutputType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNominalRotationsPerMinute() {
		return nominalRotationsPerMinute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominalRotationsPerMinute(DoubleBaseType newNominalRotationsPerMinute,
			NotificationChain msgs) {
		DoubleBaseType oldNominalRotationsPerMinute = nominalRotationsPerMinute;
		nominalRotationsPerMinute = newNominalRotationsPerMinute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE,
					oldNominalRotationsPerMinute, newNominalRotationsPerMinute);
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
	public void setNominalRotationsPerMinute(DoubleBaseType newNominalRotationsPerMinute) {
		if (newNominalRotationsPerMinute != nominalRotationsPerMinute) {
			NotificationChain msgs = null;
			if (nominalRotationsPerMinute != null)
				msgs = ((InternalEObject) nominalRotationsPerMinute).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE,
						null, msgs);
			if (newNominalRotationsPerMinute != null)
				msgs = ((InternalEObject) newNominalRotationsPerMinute).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE,
						null, msgs);
			msgs = basicSetNominalRotationsPerMinute(newNominalRotationsPerMinute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE,
					newNominalRotationsPerMinute, newNominalRotationsPerMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionGearRatioType getGearRatio() {
		return gearRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGearRatio(TransmissionGearRatioType newGearRatio, NotificationChain msgs) {
		TransmissionGearRatioType oldGearRatio = gearRatio;
		gearRatio = newGearRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO, oldGearRatio, newGearRatio);
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
	public void setGearRatio(TransmissionGearRatioType newGearRatio) {
		if (newGearRatio != gearRatio) {
			NotificationChain msgs = null;
			if (gearRatio != null)
				msgs = ((InternalEObject) gearRatio).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO, null, msgs);
			if (newGearRatio != null)
				msgs = ((InternalEObject) newGearRatio).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO, null, msgs);
			msgs = basicSetGearRatio(newGearRatio, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO, newGearRatio, newGearRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			return basicSetNominalRotationsPerMinute(null, msgs);
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO:
			return basicSetGearRatio(null, msgs);
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
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			return getNominalRotationsPerMinute();
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO:
			return getGearRatio();
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__UID:
			return getUID();
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
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			setNominalRotationsPerMinute((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO:
			setGearRatio((TransmissionGearRatioType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			setNominalRotationsPerMinute((DoubleBaseType) null);
			return;
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO:
			setGearRatio((TransmissionGearRatioType) null);
			return;
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			return nominalRotationsPerMinute != null;
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__GEAR_RATIO:
			return gearRatio != null;
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //TransmissionShaftOutputTypeImpl
