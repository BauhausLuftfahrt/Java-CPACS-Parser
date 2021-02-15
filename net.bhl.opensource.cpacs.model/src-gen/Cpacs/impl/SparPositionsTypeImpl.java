/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SparPositionType;
import Cpacs.SparPositionsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spar Positions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SparPositionsTypeImpl#getSparPosition <em>Spar Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparPositionsTypeImpl extends ComplexBaseTypeImpl implements SparPositionsType {
	/**
	 * The cached value of the '{@link #getSparPosition() <em>Spar Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<SparPositionType> sparPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparPositionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSparPositionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SparPositionType> getSparPosition() {
		if (sparPosition == null) {
			sparPosition = new EObjectContainmentEList<SparPositionType>(SparPositionType.class, this,
					CpacsPackage.SPAR_POSITIONS_TYPE__SPAR_POSITION);
		}
		return sparPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPAR_POSITIONS_TYPE__SPAR_POSITION:
			return ((InternalEList<?>) getSparPosition()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SPAR_POSITIONS_TYPE__SPAR_POSITION:
			return getSparPosition();
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
		case CpacsPackage.SPAR_POSITIONS_TYPE__SPAR_POSITION:
			getSparPosition().clear();
			getSparPosition().addAll((Collection<? extends SparPositionType>) newValue);
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
		case CpacsPackage.SPAR_POSITIONS_TYPE__SPAR_POSITION:
			getSparPosition().clear();
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
		case CpacsPackage.SPAR_POSITIONS_TYPE__SPAR_POSITION:
			return sparPosition != null && !sparPosition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SparPositionsTypeImpl
