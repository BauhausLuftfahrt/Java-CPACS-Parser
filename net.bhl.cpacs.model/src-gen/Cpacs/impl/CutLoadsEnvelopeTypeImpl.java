/**
 */
package Cpacs.impl;

import Cpacs.ComponentCutLoadsEnvelopeType;
import Cpacs.CpacsPackage;
import Cpacs.CutLoadsEnvelopeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cut Loads Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CutLoadsEnvelopeTypeImpl#getFuselageCutLoadsEnvelope <em>Fuselage Cut Loads Envelope</em>}</li>
 *   <li>{@link Cpacs.impl.CutLoadsEnvelopeTypeImpl#getWingCutLoadsEnvelope <em>Wing Cut Loads Envelope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CutLoadsEnvelopeTypeImpl extends ComplexBaseTypeImpl implements CutLoadsEnvelopeType {
	/**
	 * The cached value of the '{@link #getFuselageCutLoadsEnvelope() <em>Fuselage Cut Loads Envelope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageCutLoadsEnvelope()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentCutLoadsEnvelopeType> fuselageCutLoadsEnvelope;

	/**
	 * The cached value of the '{@link #getWingCutLoadsEnvelope() <em>Wing Cut Loads Envelope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingCutLoadsEnvelope()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentCutLoadsEnvelopeType> wingCutLoadsEnvelope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CutLoadsEnvelopeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCutLoadsEnvelopeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentCutLoadsEnvelopeType> getFuselageCutLoadsEnvelope() {
		if (fuselageCutLoadsEnvelope == null) {
			fuselageCutLoadsEnvelope = new EObjectContainmentEList<ComponentCutLoadsEnvelopeType>(
					ComponentCutLoadsEnvelopeType.class, this,
					CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__FUSELAGE_CUT_LOADS_ENVELOPE);
		}
		return fuselageCutLoadsEnvelope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentCutLoadsEnvelopeType> getWingCutLoadsEnvelope() {
		if (wingCutLoadsEnvelope == null) {
			wingCutLoadsEnvelope = new EObjectContainmentEList<ComponentCutLoadsEnvelopeType>(
					ComponentCutLoadsEnvelopeType.class, this,
					CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__WING_CUT_LOADS_ENVELOPE);
		}
		return wingCutLoadsEnvelope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__FUSELAGE_CUT_LOADS_ENVELOPE:
			return ((InternalEList<?>) getFuselageCutLoadsEnvelope()).basicRemove(otherEnd, msgs);
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__WING_CUT_LOADS_ENVELOPE:
			return ((InternalEList<?>) getWingCutLoadsEnvelope()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__FUSELAGE_CUT_LOADS_ENVELOPE:
			return getFuselageCutLoadsEnvelope();
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__WING_CUT_LOADS_ENVELOPE:
			return getWingCutLoadsEnvelope();
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
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__FUSELAGE_CUT_LOADS_ENVELOPE:
			getFuselageCutLoadsEnvelope().clear();
			getFuselageCutLoadsEnvelope().addAll((Collection<? extends ComponentCutLoadsEnvelopeType>) newValue);
			return;
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__WING_CUT_LOADS_ENVELOPE:
			getWingCutLoadsEnvelope().clear();
			getWingCutLoadsEnvelope().addAll((Collection<? extends ComponentCutLoadsEnvelopeType>) newValue);
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
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__FUSELAGE_CUT_LOADS_ENVELOPE:
			getFuselageCutLoadsEnvelope().clear();
			return;
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__WING_CUT_LOADS_ENVELOPE:
			getWingCutLoadsEnvelope().clear();
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
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__FUSELAGE_CUT_LOADS_ENVELOPE:
			return fuselageCutLoadsEnvelope != null && !fuselageCutLoadsEnvelope.isEmpty();
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE__WING_CUT_LOADS_ENVELOPE:
			return wingCutLoadsEnvelope != null && !wingCutLoadsEnvelope.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CutLoadsEnvelopeTypeImpl
