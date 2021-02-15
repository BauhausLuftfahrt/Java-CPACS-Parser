/**
 */
package Cpacs.impl;

import Cpacs.ConnectivitiesType;
import Cpacs.CpacsPackage;
import Cpacs.CutLoadIntegrationPointsType;
import Cpacs.DynamicAircraftModelPointsType;
import Cpacs.DynamicAircraftModelType;
import Cpacs.LoadReferenceAxisPointsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Aircraft Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DynamicAircraftModelTypeImpl#getLoadReferenceAxisPoints <em>Load Reference Axis Points</em>}</li>
 *   <li>{@link Cpacs.impl.DynamicAircraftModelTypeImpl#getDynamicAircraftModelPoints <em>Dynamic Aircraft Model Points</em>}</li>
 *   <li>{@link Cpacs.impl.DynamicAircraftModelTypeImpl#getCutLoadIntegrationPoints <em>Cut Load Integration Points</em>}</li>
 *   <li>{@link Cpacs.impl.DynamicAircraftModelTypeImpl#getConnectivities <em>Connectivities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicAircraftModelTypeImpl extends ComplexBaseTypeImpl implements DynamicAircraftModelType {
	/**
	 * The cached value of the '{@link #getLoadReferenceAxisPoints() <em>Load Reference Axis Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReferenceAxisPoints()
	 * @generated
	 * @ordered
	 */
	protected LoadReferenceAxisPointsType loadReferenceAxisPoints;

	/**
	 * The cached value of the '{@link #getDynamicAircraftModelPoints() <em>Dynamic Aircraft Model Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAircraftModelPoints()
	 * @generated
	 * @ordered
	 */
	protected DynamicAircraftModelPointsType dynamicAircraftModelPoints;

	/**
	 * The cached value of the '{@link #getCutLoadIntegrationPoints() <em>Cut Load Integration Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLoadIntegrationPoints()
	 * @generated
	 * @ordered
	 */
	protected CutLoadIntegrationPointsType cutLoadIntegrationPoints;

	/**
	 * The cached value of the '{@link #getConnectivities() <em>Connectivities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivities()
	 * @generated
	 * @ordered
	 */
	protected ConnectivitiesType connectivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicAircraftModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDynamicAircraftModelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadReferenceAxisPointsType getLoadReferenceAxisPoints() {
		return loadReferenceAxisPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadReferenceAxisPoints(LoadReferenceAxisPointsType newLoadReferenceAxisPoints,
			NotificationChain msgs) {
		LoadReferenceAxisPointsType oldLoadReferenceAxisPoints = loadReferenceAxisPoints;
		loadReferenceAxisPoints = newLoadReferenceAxisPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS, oldLoadReferenceAxisPoints,
					newLoadReferenceAxisPoints);
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
	public void setLoadReferenceAxisPoints(LoadReferenceAxisPointsType newLoadReferenceAxisPoints) {
		if (newLoadReferenceAxisPoints != loadReferenceAxisPoints) {
			NotificationChain msgs = null;
			if (loadReferenceAxisPoints != null)
				msgs = ((InternalEObject) loadReferenceAxisPoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS,
						null, msgs);
			if (newLoadReferenceAxisPoints != null)
				msgs = ((InternalEObject) newLoadReferenceAxisPoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS,
						null, msgs);
			msgs = basicSetLoadReferenceAxisPoints(newLoadReferenceAxisPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS, newLoadReferenceAxisPoints,
					newLoadReferenceAxisPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicAircraftModelPointsType getDynamicAircraftModelPoints() {
		return dynamicAircraftModelPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicAircraftModelPoints(
			DynamicAircraftModelPointsType newDynamicAircraftModelPoints, NotificationChain msgs) {
		DynamicAircraftModelPointsType oldDynamicAircraftModelPoints = dynamicAircraftModelPoints;
		dynamicAircraftModelPoints = newDynamicAircraftModelPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS,
					oldDynamicAircraftModelPoints, newDynamicAircraftModelPoints);
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
	public void setDynamicAircraftModelPoints(DynamicAircraftModelPointsType newDynamicAircraftModelPoints) {
		if (newDynamicAircraftModelPoints != dynamicAircraftModelPoints) {
			NotificationChain msgs = null;
			if (dynamicAircraftModelPoints != null)
				msgs = ((InternalEObject) dynamicAircraftModelPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS, null, msgs);
			if (newDynamicAircraftModelPoints != null)
				msgs = ((InternalEObject) newDynamicAircraftModelPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS, null, msgs);
			msgs = basicSetDynamicAircraftModelPoints(newDynamicAircraftModelPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS,
					newDynamicAircraftModelPoints, newDynamicAircraftModelPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutLoadIntegrationPointsType getCutLoadIntegrationPoints() {
		return cutLoadIntegrationPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutLoadIntegrationPoints(CutLoadIntegrationPointsType newCutLoadIntegrationPoints,
			NotificationChain msgs) {
		CutLoadIntegrationPointsType oldCutLoadIntegrationPoints = cutLoadIntegrationPoints;
		cutLoadIntegrationPoints = newCutLoadIntegrationPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS, oldCutLoadIntegrationPoints,
					newCutLoadIntegrationPoints);
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
	public void setCutLoadIntegrationPoints(CutLoadIntegrationPointsType newCutLoadIntegrationPoints) {
		if (newCutLoadIntegrationPoints != cutLoadIntegrationPoints) {
			NotificationChain msgs = null;
			if (cutLoadIntegrationPoints != null)
				msgs = ((InternalEObject) cutLoadIntegrationPoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS,
						null, msgs);
			if (newCutLoadIntegrationPoints != null)
				msgs = ((InternalEObject) newCutLoadIntegrationPoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS,
						null, msgs);
			msgs = basicSetCutLoadIntegrationPoints(newCutLoadIntegrationPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS, newCutLoadIntegrationPoints,
					newCutLoadIntegrationPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectivitiesType getConnectivities() {
		return connectivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectivities(ConnectivitiesType newConnectivities, NotificationChain msgs) {
		ConnectivitiesType oldConnectivities = connectivities;
		connectivities = newConnectivities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES, oldConnectivities, newConnectivities);
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
	public void setConnectivities(ConnectivitiesType newConnectivities) {
		if (newConnectivities != connectivities) {
			NotificationChain msgs = null;
			if (connectivities != null)
				msgs = ((InternalEObject) connectivities).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES, null, msgs);
			if (newConnectivities != null)
				msgs = ((InternalEObject) newConnectivities).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES, null, msgs);
			msgs = basicSetConnectivities(newConnectivities, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES, newConnectivities, newConnectivities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS:
			return basicSetLoadReferenceAxisPoints(null, msgs);
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS:
			return basicSetDynamicAircraftModelPoints(null, msgs);
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			return basicSetCutLoadIntegrationPoints(null, msgs);
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES:
			return basicSetConnectivities(null, msgs);
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
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS:
			return getLoadReferenceAxisPoints();
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS:
			return getDynamicAircraftModelPoints();
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			return getCutLoadIntegrationPoints();
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES:
			return getConnectivities();
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
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS:
			setLoadReferenceAxisPoints((LoadReferenceAxisPointsType) newValue);
			return;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS:
			setDynamicAircraftModelPoints((DynamicAircraftModelPointsType) newValue);
			return;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			setCutLoadIntegrationPoints((CutLoadIntegrationPointsType) newValue);
			return;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES:
			setConnectivities((ConnectivitiesType) newValue);
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
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS:
			setLoadReferenceAxisPoints((LoadReferenceAxisPointsType) null);
			return;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS:
			setDynamicAircraftModelPoints((DynamicAircraftModelPointsType) null);
			return;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			setCutLoadIntegrationPoints((CutLoadIntegrationPointsType) null);
			return;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES:
			setConnectivities((ConnectivitiesType) null);
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
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__LOAD_REFERENCE_AXIS_POINTS:
			return loadReferenceAxisPoints != null;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__DYNAMIC_AIRCRAFT_MODEL_POINTS:
			return dynamicAircraftModelPoints != null;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			return cutLoadIntegrationPoints != null;
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE__CONNECTIVITIES:
			return connectivities != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicAircraftModelTypeImpl
