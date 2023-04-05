/**
 */
package Cpacs.impl;

import Cpacs.AircraftControlElementType;
import Cpacs.AircraftControlElementsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aircraft Control Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AircraftControlElementsTypeImpl#getControlElement <em>Control Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AircraftControlElementsTypeImpl extends ComplexBaseTypeImpl implements AircraftControlElementsType {
	/**
	 * The cached value of the '{@link #getControlElement() <em>Control Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AircraftControlElementType> controlElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AircraftControlElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAircraftControlElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AircraftControlElementType> getControlElement() {
		if (controlElement == null) {
			controlElement = new EObjectContainmentEList<AircraftControlElementType>(AircraftControlElementType.class,
					this, CpacsPackage.AIRCRAFT_CONTROL_ELEMENTS_TYPE__CONTROL_ELEMENT);
		}
		return controlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRCRAFT_CONTROL_ELEMENTS_TYPE__CONTROL_ELEMENT:
			return ((InternalEList<?>) getControlElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.AIRCRAFT_CONTROL_ELEMENTS_TYPE__CONTROL_ELEMENT:
			return getControlElement();
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
		case CpacsPackage.AIRCRAFT_CONTROL_ELEMENTS_TYPE__CONTROL_ELEMENT:
			getControlElement().clear();
			getControlElement().addAll((Collection<? extends AircraftControlElementType>) newValue);
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
		case CpacsPackage.AIRCRAFT_CONTROL_ELEMENTS_TYPE__CONTROL_ELEMENT:
			getControlElement().clear();
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
		case CpacsPackage.AIRCRAFT_CONTROL_ELEMENTS_TYPE__CONTROL_ELEMENT:
			return controlElement != null && !controlElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AircraftControlElementsTypeImpl
