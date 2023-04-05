/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightEnvelopeType;
import Cpacs.FlightEnvelopesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Envelopes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightEnvelopesTypeImpl#getFlightEnvelope <em>Flight Envelope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightEnvelopesTypeImpl extends ComplexBaseTypeImpl implements FlightEnvelopesType {
	/**
	 * The cached value of the '{@link #getFlightEnvelope() <em>Flight Envelope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightEnvelope()
	 * @generated
	 * @ordered
	 */
	protected EList<FlightEnvelopeType> flightEnvelope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightEnvelopesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightEnvelopesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlightEnvelopeType> getFlightEnvelope() {
		if (flightEnvelope == null) {
			flightEnvelope = new EObjectContainmentEList<FlightEnvelopeType>(FlightEnvelopeType.class, this,
					CpacsPackage.FLIGHT_ENVELOPES_TYPE__FLIGHT_ENVELOPE);
		}
		return flightEnvelope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_ENVELOPES_TYPE__FLIGHT_ENVELOPE:
			return ((InternalEList<?>) getFlightEnvelope()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLIGHT_ENVELOPES_TYPE__FLIGHT_ENVELOPE:
			return getFlightEnvelope();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_ENVELOPES_TYPE__FLIGHT_ENVELOPE:
			getFlightEnvelope().clear();
			getFlightEnvelope().addAll((Collection<? extends FlightEnvelopeType>) newValue);
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
		case CpacsPackage.FLIGHT_ENVELOPES_TYPE__FLIGHT_ENVELOPE:
			getFlightEnvelope().clear();
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
		case CpacsPackage.FLIGHT_ENVELOPES_TYPE__FLIGHT_ENVELOPE:
			return flightEnvelope != null && !flightEnvelope.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlightEnvelopesTypeImpl
