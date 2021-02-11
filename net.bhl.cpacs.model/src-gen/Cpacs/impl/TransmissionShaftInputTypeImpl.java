/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.TransmissionShaftInputType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Shaft Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TransmissionShaftInputTypeImpl#getNominalRotationsPerMinute <em>Nominal Rotations Per Minute</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionShaftInputTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionShaftInputTypeImpl extends ComplexBaseTypeImpl implements TransmissionShaftInputType {
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
	protected TransmissionShaftInputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTransmissionShaftInputType();
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
					CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE,
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
				msgs = ((InternalEObject) nominalRotationsPerMinute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE, null, msgs);
			if (newNominalRotationsPerMinute != null)
				msgs = ((InternalEObject) newNominalRotationsPerMinute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE, null, msgs);
			msgs = basicSetNominalRotationsPerMinute(newNominalRotationsPerMinute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE,
					newNominalRotationsPerMinute, newNominalRotationsPerMinute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__UID,
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			return basicSetNominalRotationsPerMinute(null, msgs);
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			return getNominalRotationsPerMinute();
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__UID:
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			setNominalRotationsPerMinute((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__UID:
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			setNominalRotationsPerMinute((DoubleBaseType) null);
			return;
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__UID:
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__NOMINAL_ROTATIONS_PER_MINUTE:
			return nominalRotationsPerMinute != null;
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE__UID:
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

} //TransmissionShaftInputTypeImpl
