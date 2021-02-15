/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PositioningType;
import Cpacs.PositioningsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positionings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PositioningsTypeImpl#getPositioning <em>Positioning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositioningsTypeImpl extends ComplexBaseTypeImpl implements PositioningsType {
	/**
	 * The cached value of the '{@link #getPositioning() <em>Positioning</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioning()
	 * @generated
	 * @ordered
	 */
	protected EList<PositioningType> positioning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositioningsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPositioningsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositioningType> getPositioning() {
		if (positioning == null) {
			positioning = new EObjectContainmentEList<PositioningType>(PositioningType.class, this,
					CpacsPackage.POSITIONINGS_TYPE__POSITIONING);
		}
		return positioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POSITIONINGS_TYPE__POSITIONING:
			return ((InternalEList<?>) getPositioning()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.POSITIONINGS_TYPE__POSITIONING:
			return getPositioning();
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
		case CpacsPackage.POSITIONINGS_TYPE__POSITIONING:
			getPositioning().clear();
			getPositioning().addAll((Collection<? extends PositioningType>) newValue);
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
		case CpacsPackage.POSITIONINGS_TYPE__POSITIONING:
			getPositioning().clear();
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
		case CpacsPackage.POSITIONINGS_TYPE__POSITIONING:
			return positioning != null && !positioning.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PositioningsTypeImpl
