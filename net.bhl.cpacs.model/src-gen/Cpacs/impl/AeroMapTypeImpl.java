/**
 */
package Cpacs.impl;

import Cpacs.AeroLimitsMapType;
import Cpacs.AeroMapType;
import Cpacs.AeroPerformanceBoundaryConditionsType;
import Cpacs.AeroPerformanceMapType;
import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroMapTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.AeroMapTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.AeroMapTypeImpl#getBoundaryConditions <em>Boundary Conditions</em>}</li>
 *   <li>{@link Cpacs.impl.AeroMapTypeImpl#getAeroPerformanceMap <em>Aero Performance Map</em>}</li>
 *   <li>{@link Cpacs.impl.AeroMapTypeImpl#getAeroLimitsMap <em>Aero Limits Map</em>}</li>
 *   <li>{@link Cpacs.impl.AeroMapTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroMapTypeImpl extends ComplexBaseTypeImpl implements AeroMapType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getBoundaryConditions() <em>Boundary Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryConditions()
	 * @generated
	 * @ordered
	 */
	protected AeroPerformanceBoundaryConditionsType boundaryConditions;

	/**
	 * The cached value of the '{@link #getAeroPerformanceMap() <em>Aero Performance Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroPerformanceMap()
	 * @generated
	 * @ordered
	 */
	protected AeroPerformanceMapType aeroPerformanceMap;

	/**
	 * The cached value of the '{@link #getAeroLimitsMap() <em>Aero Limits Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroLimitsMap()
	 * @generated
	 * @ordered
	 */
	protected AeroLimitsMapType aeroLimitsMap;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_MAP_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_MAP_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceBoundaryConditionsType getBoundaryConditions() {
		return boundaryConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundaryConditions(AeroPerformanceBoundaryConditionsType newBoundaryConditions,
			NotificationChain msgs) {
		AeroPerformanceBoundaryConditionsType oldBoundaryConditions = boundaryConditions;
		boundaryConditions = newBoundaryConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS, oldBoundaryConditions, newBoundaryConditions);
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
	public void setBoundaryConditions(AeroPerformanceBoundaryConditionsType newBoundaryConditions) {
		if (newBoundaryConditions != boundaryConditions) {
			NotificationChain msgs = null;
			if (boundaryConditions != null)
				msgs = ((InternalEObject) boundaryConditions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS, null, msgs);
			if (newBoundaryConditions != null)
				msgs = ((InternalEObject) newBoundaryConditions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS, null, msgs);
			msgs = basicSetBoundaryConditions(newBoundaryConditions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS,
					newBoundaryConditions, newBoundaryConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceMapType getAeroPerformanceMap() {
		return aeroPerformanceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroPerformanceMap(AeroPerformanceMapType newAeroPerformanceMap,
			NotificationChain msgs) {
		AeroPerformanceMapType oldAeroPerformanceMap = aeroPerformanceMap;
		aeroPerformanceMap = newAeroPerformanceMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP, oldAeroPerformanceMap, newAeroPerformanceMap);
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
	public void setAeroPerformanceMap(AeroPerformanceMapType newAeroPerformanceMap) {
		if (newAeroPerformanceMap != aeroPerformanceMap) {
			NotificationChain msgs = null;
			if (aeroPerformanceMap != null)
				msgs = ((InternalEObject) aeroPerformanceMap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP, null, msgs);
			if (newAeroPerformanceMap != null)
				msgs = ((InternalEObject) newAeroPerformanceMap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP, null, msgs);
			msgs = basicSetAeroPerformanceMap(newAeroPerformanceMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP,
					newAeroPerformanceMap, newAeroPerformanceMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroLimitsMapType getAeroLimitsMap() {
		return aeroLimitsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroLimitsMap(AeroLimitsMapType newAeroLimitsMap, NotificationChain msgs) {
		AeroLimitsMapType oldAeroLimitsMap = aeroLimitsMap;
		aeroLimitsMap = newAeroLimitsMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP, oldAeroLimitsMap, newAeroLimitsMap);
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
	public void setAeroLimitsMap(AeroLimitsMapType newAeroLimitsMap) {
		if (newAeroLimitsMap != aeroLimitsMap) {
			NotificationChain msgs = null;
			if (aeroLimitsMap != null)
				msgs = ((InternalEObject) aeroLimitsMap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP, null, msgs);
			if (newAeroLimitsMap != null)
				msgs = ((InternalEObject) newAeroLimitsMap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP, null, msgs);
			msgs = basicSetAeroLimitsMap(newAeroLimitsMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP,
					newAeroLimitsMap, newAeroLimitsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_MAP_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_MAP_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.AERO_MAP_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS:
			return basicSetBoundaryConditions(null, msgs);
		case CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP:
			return basicSetAeroPerformanceMap(null, msgs);
		case CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP:
			return basicSetAeroLimitsMap(null, msgs);
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
		case CpacsPackage.AERO_MAP_TYPE__NAME:
			return getName();
		case CpacsPackage.AERO_MAP_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS:
			return getBoundaryConditions();
		case CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP:
			return getAeroPerformanceMap();
		case CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP:
			return getAeroLimitsMap();
		case CpacsPackage.AERO_MAP_TYPE__UID:
			return getUID();
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
		case CpacsPackage.AERO_MAP_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.AERO_MAP_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS:
			setBoundaryConditions((AeroPerformanceBoundaryConditionsType) newValue);
			return;
		case CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP:
			setAeroPerformanceMap((AeroPerformanceMapType) newValue);
			return;
		case CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP:
			setAeroLimitsMap((AeroLimitsMapType) newValue);
			return;
		case CpacsPackage.AERO_MAP_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.AERO_MAP_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.AERO_MAP_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS:
			setBoundaryConditions((AeroPerformanceBoundaryConditionsType) null);
			return;
		case CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP:
			setAeroPerformanceMap((AeroPerformanceMapType) null);
			return;
		case CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP:
			setAeroLimitsMap((AeroLimitsMapType) null);
			return;
		case CpacsPackage.AERO_MAP_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.AERO_MAP_TYPE__NAME:
			return name != null;
		case CpacsPackage.AERO_MAP_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.AERO_MAP_TYPE__BOUNDARY_CONDITIONS:
			return boundaryConditions != null;
		case CpacsPackage.AERO_MAP_TYPE__AERO_PERFORMANCE_MAP:
			return aeroPerformanceMap != null;
		case CpacsPackage.AERO_MAP_TYPE__AERO_LIMITS_MAP:
			return aeroLimitsMap != null;
		case CpacsPackage.AERO_MAP_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
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
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //AeroMapTypeImpl
