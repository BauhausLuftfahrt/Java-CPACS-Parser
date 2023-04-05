/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TrackJointPositionType;
import Cpacs.TrackJointPositionsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Joint Positions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrackJointPositionsTypeImpl#getJointPosition <em>Joint Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackJointPositionsTypeImpl extends ComplexBaseTypeImpl implements TrackJointPositionsType {
	/**
	 * The cached value of the '{@link #getJointPosition() <em>Joint Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackJointPositionType> jointPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackJointPositionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrackJointPositionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrackJointPositionType> getJointPosition() {
		if (jointPosition == null) {
			jointPosition = new EObjectContainmentEList<TrackJointPositionType>(TrackJointPositionType.class, this,
					CpacsPackage.TRACK_JOINT_POSITIONS_TYPE__JOINT_POSITION);
		}
		return jointPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRACK_JOINT_POSITIONS_TYPE__JOINT_POSITION:
			return ((InternalEList<?>) getJointPosition()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TRACK_JOINT_POSITIONS_TYPE__JOINT_POSITION:
			return getJointPosition();
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
		case CpacsPackage.TRACK_JOINT_POSITIONS_TYPE__JOINT_POSITION:
			getJointPosition().clear();
			getJointPosition().addAll((Collection<? extends TrackJointPositionType>) newValue);
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
		case CpacsPackage.TRACK_JOINT_POSITIONS_TYPE__JOINT_POSITION:
			getJointPosition().clear();
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
		case CpacsPackage.TRACK_JOINT_POSITIONS_TYPE__JOINT_POSITION:
			return jointPosition != null && !jointPosition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrackJointPositionsTypeImpl
