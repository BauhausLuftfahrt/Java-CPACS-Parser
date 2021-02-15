/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MissionPerformanceMapDefinitionType;
import Cpacs.SpecificPerformanceMapsType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Performance Map Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionPerformanceMapDefinitionTypeImpl#getDefaultPerformanceMapUID <em>Default Performance Map UID</em>}</li>
 *   <li>{@link Cpacs.impl.MissionPerformanceMapDefinitionTypeImpl#getSpecificPerformanceMaps <em>Specific Performance Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionPerformanceMapDefinitionTypeImpl extends ComplexBaseTypeImpl
		implements MissionPerformanceMapDefinitionType {
	/**
	 * The cached value of the '{@link #getDefaultPerformanceMapUID() <em>Default Performance Map UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPerformanceMapUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType defaultPerformanceMapUID;

	/**
	 * The cached value of the '{@link #getSpecificPerformanceMaps() <em>Specific Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificPerformanceMaps()
	 * @generated
	 * @ordered
	 */
	protected SpecificPerformanceMapsType specificPerformanceMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionPerformanceMapDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionPerformanceMapDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getDefaultPerformanceMapUID() {
		return defaultPerformanceMapUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultPerformanceMapUID(StringUIDBaseType newDefaultPerformanceMapUID,
			NotificationChain msgs) {
		StringUIDBaseType oldDefaultPerformanceMapUID = defaultPerformanceMapUID;
		defaultPerformanceMapUID = newDefaultPerformanceMapUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID,
					oldDefaultPerformanceMapUID, newDefaultPerformanceMapUID);
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
	public void setDefaultPerformanceMapUID(StringUIDBaseType newDefaultPerformanceMapUID) {
		if (newDefaultPerformanceMapUID != defaultPerformanceMapUID) {
			NotificationChain msgs = null;
			if (defaultPerformanceMapUID != null)
				msgs = ((InternalEObject) defaultPerformanceMapUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID,
						null, msgs);
			if (newDefaultPerformanceMapUID != null)
				msgs = ((InternalEObject) newDefaultPerformanceMapUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID,
						null, msgs);
			msgs = basicSetDefaultPerformanceMapUID(newDefaultPerformanceMapUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID,
					newDefaultPerformanceMapUID, newDefaultPerformanceMapUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificPerformanceMapsType getSpecificPerformanceMaps() {
		return specificPerformanceMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificPerformanceMaps(SpecificPerformanceMapsType newSpecificPerformanceMaps,
			NotificationChain msgs) {
		SpecificPerformanceMapsType oldSpecificPerformanceMaps = specificPerformanceMaps;
		specificPerformanceMaps = newSpecificPerformanceMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS,
					oldSpecificPerformanceMaps, newSpecificPerformanceMaps);
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
	public void setSpecificPerformanceMaps(SpecificPerformanceMapsType newSpecificPerformanceMaps) {
		if (newSpecificPerformanceMaps != specificPerformanceMaps) {
			NotificationChain msgs = null;
			if (specificPerformanceMaps != null)
				msgs = ((InternalEObject) specificPerformanceMaps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS,
						null, msgs);
			if (newSpecificPerformanceMaps != null)
				msgs = ((InternalEObject) newSpecificPerformanceMaps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS,
						null, msgs);
			msgs = basicSetSpecificPerformanceMaps(newSpecificPerformanceMaps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS,
					newSpecificPerformanceMaps, newSpecificPerformanceMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID:
			return basicSetDefaultPerformanceMapUID(null, msgs);
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS:
			return basicSetSpecificPerformanceMaps(null, msgs);
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
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID:
			return getDefaultPerformanceMapUID();
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS:
			return getSpecificPerformanceMaps();
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
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID:
			setDefaultPerformanceMapUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS:
			setSpecificPerformanceMaps((SpecificPerformanceMapsType) newValue);
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
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID:
			setDefaultPerformanceMapUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS:
			setSpecificPerformanceMaps((SpecificPerformanceMapsType) null);
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
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__DEFAULT_PERFORMANCE_MAP_UID:
			return defaultPerformanceMapUID != null;
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE__SPECIFIC_PERFORMANCE_MAPS:
			return specificPerformanceMaps != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionPerformanceMapDefinitionTypeImpl
