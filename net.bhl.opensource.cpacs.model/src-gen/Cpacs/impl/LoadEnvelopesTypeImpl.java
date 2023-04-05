/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadEnvelopeType;
import Cpacs.LoadEnvelopesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Envelopes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadEnvelopesTypeImpl#getLoadEnvelope <em>Load Envelope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadEnvelopesTypeImpl extends ComplexBaseTypeImpl implements LoadEnvelopesType {
	/**
	 * The cached value of the '{@link #getLoadEnvelope() <em>Load Envelope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadEnvelope()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadEnvelopeType> loadEnvelope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadEnvelopesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadEnvelopesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadEnvelopeType> getLoadEnvelope() {
		if (loadEnvelope == null) {
			loadEnvelope = new EObjectContainmentEList<LoadEnvelopeType>(LoadEnvelopeType.class, this,
					CpacsPackage.LOAD_ENVELOPES_TYPE__LOAD_ENVELOPE);
		}
		return loadEnvelope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_ENVELOPES_TYPE__LOAD_ENVELOPE:
			return ((InternalEList<?>) getLoadEnvelope()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LOAD_ENVELOPES_TYPE__LOAD_ENVELOPE:
			return getLoadEnvelope();
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
		case CpacsPackage.LOAD_ENVELOPES_TYPE__LOAD_ENVELOPE:
			getLoadEnvelope().clear();
			getLoadEnvelope().addAll((Collection<? extends LoadEnvelopeType>) newValue);
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
		case CpacsPackage.LOAD_ENVELOPES_TYPE__LOAD_ENVELOPE:
			getLoadEnvelope().clear();
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
		case CpacsPackage.LOAD_ENVELOPES_TYPE__LOAD_ENVELOPE:
			return loadEnvelope != null && !loadEnvelope.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadEnvelopesTypeImpl
