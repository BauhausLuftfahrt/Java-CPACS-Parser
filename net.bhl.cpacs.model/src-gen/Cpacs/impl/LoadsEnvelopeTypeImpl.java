/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutLoadsEnvelopeType;
import Cpacs.LoadsEnvelopeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loads Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadsEnvelopeTypeImpl#getCutLoadsEnvelope <em>Cut Loads Envelope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadsEnvelopeTypeImpl extends ComplexBaseTypeImpl implements LoadsEnvelopeType {
	/**
	 * The cached value of the '{@link #getCutLoadsEnvelope() <em>Cut Loads Envelope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLoadsEnvelope()
	 * @generated
	 * @ordered
	 */
	protected EList<CutLoadsEnvelopeType> cutLoadsEnvelope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadsEnvelopeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadsEnvelopeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CutLoadsEnvelopeType> getCutLoadsEnvelope() {
		if (cutLoadsEnvelope == null) {
			cutLoadsEnvelope = new EObjectContainmentEList<CutLoadsEnvelopeType>(CutLoadsEnvelopeType.class, this,
					CpacsPackage.LOADS_ENVELOPE_TYPE__CUT_LOADS_ENVELOPE);
		}
		return cutLoadsEnvelope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOADS_ENVELOPE_TYPE__CUT_LOADS_ENVELOPE:
			return ((InternalEList<?>) getCutLoadsEnvelope()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LOADS_ENVELOPE_TYPE__CUT_LOADS_ENVELOPE:
			return getCutLoadsEnvelope();
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
		case CpacsPackage.LOADS_ENVELOPE_TYPE__CUT_LOADS_ENVELOPE:
			getCutLoadsEnvelope().clear();
			getCutLoadsEnvelope().addAll((Collection<? extends CutLoadsEnvelopeType>) newValue);
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
		case CpacsPackage.LOADS_ENVELOPE_TYPE__CUT_LOADS_ENVELOPE:
			getCutLoadsEnvelope().clear();
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
		case CpacsPackage.LOADS_ENVELOPE_TYPE__CUT_LOADS_ENVELOPE:
			return cutLoadsEnvelope != null && !cutLoadsEnvelope.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadsEnvelopeTypeImpl
