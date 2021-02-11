/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TrajectoriesType;
import Cpacs.TrajectoryType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectories Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrajectoriesTypeImpl#getTrajectory <em>Trajectory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrajectoriesTypeImpl extends ComplexBaseTypeImpl implements TrajectoriesType {
	/**
	 * The cached value of the '{@link #getTrajectory() <em>Trajectory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectory()
	 * @generated
	 * @ordered
	 */
	protected EList<TrajectoryType> trajectory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrajectoriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrajectoriesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrajectoryType> getTrajectory() {
		if (trajectory == null) {
			trajectory = new EObjectContainmentEList<TrajectoryType>(TrajectoryType.class, this,
					CpacsPackage.TRAJECTORIES_TYPE__TRAJECTORY);
		}
		return trajectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRAJECTORIES_TYPE__TRAJECTORY:
			return ((InternalEList<?>) getTrajectory()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TRAJECTORIES_TYPE__TRAJECTORY:
			return getTrajectory();
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
		case CpacsPackage.TRAJECTORIES_TYPE__TRAJECTORY:
			getTrajectory().clear();
			getTrajectory().addAll((Collection<? extends TrajectoryType>) newValue);
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
		case CpacsPackage.TRAJECTORIES_TYPE__TRAJECTORY:
			getTrajectory().clear();
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
		case CpacsPackage.TRAJECTORIES_TYPE__TRAJECTORY:
			return trajectory != null && !trajectory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrajectoriesTypeImpl
