/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GlobalPerformanceCasesType;
import Cpacs.MissionDefinitionsType;
import Cpacs.PointPerformanceDefinitionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Performance Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GlobalPerformanceCasesTypeImpl#getMissionDefinitions <em>Mission Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalPerformanceCasesTypeImpl#getPointPerformanceDefinitions <em>Point Performance Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalPerformanceCasesTypeImpl extends ComplexBaseTypeImpl implements GlobalPerformanceCasesType {
	/**
	 * The cached value of the '{@link #getMissionDefinitions() <em>Mission Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected MissionDefinitionsType missionDefinitions;

	/**
	 * The cached value of the '{@link #getPointPerformanceDefinitions() <em>Point Performance Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointPerformanceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected PointPerformanceDefinitionsType pointPerformanceDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalPerformanceCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGlobalPerformanceCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionDefinitionsType getMissionDefinitions() {
		return missionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissionDefinitions(MissionDefinitionsType newMissionDefinitions,
			NotificationChain msgs) {
		MissionDefinitionsType oldMissionDefinitions = missionDefinitions;
		missionDefinitions = newMissionDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS, oldMissionDefinitions,
					newMissionDefinitions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMissionDefinitions(MissionDefinitionsType newMissionDefinitions) {
		if (newMissionDefinitions != missionDefinitions) {
			NotificationChain msgs = null;
			if (missionDefinitions != null)
				msgs = ((InternalEObject) missionDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS, null,
						msgs);
			if (newMissionDefinitions != null)
				msgs = ((InternalEObject) newMissionDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS, null,
						msgs);
			msgs = basicSetMissionDefinitions(newMissionDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS, newMissionDefinitions,
					newMissionDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPerformanceDefinitionsType getPointPerformanceDefinitions() {
		return pointPerformanceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointPerformanceDefinitions(
			PointPerformanceDefinitionsType newPointPerformanceDefinitions, NotificationChain msgs) {
		PointPerformanceDefinitionsType oldPointPerformanceDefinitions = pointPerformanceDefinitions;
		pointPerformanceDefinitions = newPointPerformanceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS,
					oldPointPerformanceDefinitions, newPointPerformanceDefinitions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointPerformanceDefinitions(PointPerformanceDefinitionsType newPointPerformanceDefinitions) {
		if (newPointPerformanceDefinitions != pointPerformanceDefinitions) {
			NotificationChain msgs = null;
			if (pointPerformanceDefinitions != null)
				msgs = ((InternalEObject) pointPerformanceDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS,
						null, msgs);
			if (newPointPerformanceDefinitions != null)
				msgs = ((InternalEObject) newPointPerformanceDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS,
						null, msgs);
			msgs = basicSetPointPerformanceDefinitions(newPointPerformanceDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS,
					newPointPerformanceDefinitions, newPointPerformanceDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS:
			return basicSetMissionDefinitions(null, msgs);
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS:
			return basicSetPointPerformanceDefinitions(null, msgs);
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
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS:
			return getMissionDefinitions();
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS:
			return getPointPerformanceDefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS:
			setMissionDefinitions((MissionDefinitionsType) newValue);
			return;
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS:
			setPointPerformanceDefinitions((PointPerformanceDefinitionsType) newValue);
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
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS:
			setMissionDefinitions((MissionDefinitionsType) null);
			return;
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS:
			setPointPerformanceDefinitions((PointPerformanceDefinitionsType) null);
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
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__MISSION_DEFINITIONS:
			return missionDefinitions != null;
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE__POINT_PERFORMANCE_DEFINITIONS:
			return pointPerformanceDefinitions != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalPerformanceCasesTypeImpl
