/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PylonPinType;
import Cpacs.PylonPinsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Pins Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonPinsTypeImpl#getPylonPin <em>Pylon Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonPinsTypeImpl extends ComplexBaseTypeImpl implements PylonPinsType {
	/**
	 * The cached value of the '{@link #getPylonPin() <em>Pylon Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPylonPin()
	 * @generated
	 * @ordered
	 */
	protected EList<PylonPinType> pylonPin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PylonPinsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonPinsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PylonPinType> getPylonPin() {
		if (pylonPin == null) {
			pylonPin = new EObjectContainmentEList<PylonPinType>(PylonPinType.class, this,
					CpacsPackage.PYLON_PINS_TYPE__PYLON_PIN);
		}
		return pylonPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_PINS_TYPE__PYLON_PIN:
			return ((InternalEList<?>) getPylonPin()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PYLON_PINS_TYPE__PYLON_PIN:
			return getPylonPin();
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
		case CpacsPackage.PYLON_PINS_TYPE__PYLON_PIN:
			getPylonPin().clear();
			getPylonPin().addAll((Collection<? extends PylonPinType>) newValue);
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
		case CpacsPackage.PYLON_PINS_TYPE__PYLON_PIN:
			getPylonPin().clear();
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
		case CpacsPackage.PYLON_PINS_TYPE__PYLON_PIN:
			return pylonPin != null && !pylonPin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PylonPinsTypeImpl
