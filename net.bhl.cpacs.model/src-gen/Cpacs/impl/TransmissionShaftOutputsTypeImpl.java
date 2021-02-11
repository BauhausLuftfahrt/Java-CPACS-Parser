/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TransmissionShaftOutputType;
import Cpacs.TransmissionShaftOutputsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Shaft Outputs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TransmissionShaftOutputsTypeImpl#getShaftoutput <em>Shaftoutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionShaftOutputsTypeImpl extends ComplexBaseTypeImpl implements TransmissionShaftOutputsType {
	/**
	 * The cached value of the '{@link #getShaftoutput() <em>Shaftoutput</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaftoutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionShaftOutputType> shaftoutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionShaftOutputsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTransmissionShaftOutputsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransmissionShaftOutputType> getShaftoutput() {
		if (shaftoutput == null) {
			shaftoutput = new EObjectContainmentEList<TransmissionShaftOutputType>(TransmissionShaftOutputType.class,
					this, CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE__SHAFTOUTPUT);
		}
		return shaftoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE__SHAFTOUTPUT:
			return ((InternalEList<?>) getShaftoutput()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE__SHAFTOUTPUT:
			return getShaftoutput();
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
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE__SHAFTOUTPUT:
			getShaftoutput().clear();
			getShaftoutput().addAll((Collection<? extends TransmissionShaftOutputType>) newValue);
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
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE__SHAFTOUTPUT:
			getShaftoutput().clear();
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
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE__SHAFTOUTPUT:
			return shaftoutput != null && !shaftoutput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransmissionShaftOutputsTypeImpl
