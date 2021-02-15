/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.ShaftLinkedComponentsType;
import Cpacs.StringUIDBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shaft Linked Components Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ShaftLinkedComponentsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Cpacs.impl.ShaftLinkedComponentsTypeImpl#getEngineUID <em>Engine UID</em>}</li>
 *   <li>{@link Cpacs.impl.ShaftLinkedComponentsTypeImpl#getTransmissionShaftInputUID <em>Transmission Shaft Input UID</em>}</li>
 *   <li>{@link Cpacs.impl.ShaftLinkedComponentsTypeImpl#getTransmissionShaftOutputUID <em>Transmission Shaft Output UID</em>}</li>
 *   <li>{@link Cpacs.impl.ShaftLinkedComponentsTypeImpl#getRotorUID <em>Rotor UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShaftLinkedComponentsTypeImpl extends ComplexBaseTypeImpl implements ShaftLinkedComponentsType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShaftLinkedComponentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getShaftLinkedComponentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getEngineUID() {
		return getGroup().list(CpacsPackage.eINSTANCE.getShaftLinkedComponentsType_EngineUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getTransmissionShaftInputUID() {
		return getGroup().list(CpacsPackage.eINSTANCE.getShaftLinkedComponentsType_TransmissionShaftInputUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getTransmissionShaftOutputUID() {
		return getGroup().list(CpacsPackage.eINSTANCE.getShaftLinkedComponentsType_TransmissionShaftOutputUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getRotorUID() {
		return getGroup().list(CpacsPackage.eINSTANCE.getShaftLinkedComponentsType_RotorUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ENGINE_UID:
			return ((InternalEList<?>) getEngineUID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_INPUT_UID:
			return ((InternalEList<?>) getTransmissionShaftInputUID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_OUTPUT_UID:
			return ((InternalEList<?>) getTransmissionShaftOutputUID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ROTOR_UID:
			return ((InternalEList<?>) getRotorUID()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ENGINE_UID:
			return getEngineUID();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_INPUT_UID:
			return getTransmissionShaftInputUID();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_OUTPUT_UID:
			return getTransmissionShaftOutputUID();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ROTOR_UID:
			return getRotorUID();
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
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ENGINE_UID:
			getEngineUID().clear();
			getEngineUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_INPUT_UID:
			getTransmissionShaftInputUID().clear();
			getTransmissionShaftInputUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_OUTPUT_UID:
			getTransmissionShaftOutputUID().clear();
			getTransmissionShaftOutputUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ROTOR_UID:
			getRotorUID().clear();
			getRotorUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
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
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__GROUP:
			getGroup().clear();
			return;
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ENGINE_UID:
			getEngineUID().clear();
			return;
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_INPUT_UID:
			getTransmissionShaftInputUID().clear();
			return;
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_OUTPUT_UID:
			getTransmissionShaftOutputUID().clear();
			return;
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ROTOR_UID:
			getRotorUID().clear();
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
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__GROUP:
			return group != null && !group.isEmpty();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ENGINE_UID:
			return !getEngineUID().isEmpty();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_INPUT_UID:
			return !getTransmissionShaftInputUID().isEmpty();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__TRANSMISSION_SHAFT_OUTPUT_UID:
			return !getTransmissionShaftOutputUID().isEmpty();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE__ROTOR_UID:
			return !getRotorUID().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ShaftLinkedComponentsTypeImpl
