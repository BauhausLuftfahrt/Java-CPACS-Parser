/**
 */
package Cpacs.impl;

import Cpacs.ConnectivitiesType;
import Cpacs.CpacsPackage;
import Cpacs.CutLoadPointsType;
import Cpacs.LoadApplicationPointSetType;
import Cpacs.LoadApplicationPointsType;
import Cpacs.LoadReferenceLineType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Application Point Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadApplicationPointSetTypeImpl#getComponentUID <em>Component UID</em>}</li>
 *   <li>{@link Cpacs.impl.LoadApplicationPointSetTypeImpl#getLoadReferenceLine <em>Load Reference Line</em>}</li>
 *   <li>{@link Cpacs.impl.LoadApplicationPointSetTypeImpl#getLoadApplicationPoints <em>Load Application Points</em>}</li>
 *   <li>{@link Cpacs.impl.LoadApplicationPointSetTypeImpl#getCutLoadIntegrationPoints <em>Cut Load Integration Points</em>}</li>
 *   <li>{@link Cpacs.impl.LoadApplicationPointSetTypeImpl#getConnectivities <em>Connectivities</em>}</li>
 *   <li>{@link Cpacs.impl.LoadApplicationPointSetTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadApplicationPointSetTypeImpl extends ComplexBaseTypeImpl implements LoadApplicationPointSetType {
	/**
	 * The cached value of the '{@link #getComponentUID() <em>Component UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType componentUID;

	/**
	 * The cached value of the '{@link #getLoadReferenceLine() <em>Load Reference Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReferenceLine()
	 * @generated
	 * @ordered
	 */
	protected LoadReferenceLineType loadReferenceLine;

	/**
	 * The cached value of the '{@link #getLoadApplicationPoints() <em>Load Application Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadApplicationPoints()
	 * @generated
	 * @ordered
	 */
	protected LoadApplicationPointsType loadApplicationPoints;

	/**
	 * The cached value of the '{@link #getCutLoadIntegrationPoints() <em>Cut Load Integration Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLoadIntegrationPoints()
	 * @generated
	 * @ordered
	 */
	protected CutLoadPointsType cutLoadIntegrationPoints;

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
	protected LoadApplicationPointSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadApplicationPointSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getComponentUID() {
		return componentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentUID(StringUIDBaseType newComponentUID, NotificationChain msgs) {
		StringUIDBaseType oldComponentUID = componentUID;
		componentUID = newComponentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID, oldComponentUID, newComponentUID);
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
	public void setComponentUID(StringUIDBaseType newComponentUID) {
		if (newComponentUID != componentUID) {
			NotificationChain msgs = null;
			if (componentUID != null)
				msgs = ((InternalEObject) componentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID, null,
						msgs);
			if (newComponentUID != null)
				msgs = ((InternalEObject) newComponentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID, null,
						msgs);
			msgs = basicSetComponentUID(newComponentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID, newComponentUID, newComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadReferenceLineType getLoadReferenceLine() {
		return loadReferenceLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadReferenceLine(LoadReferenceLineType newLoadReferenceLine,
			NotificationChain msgs) {
		LoadReferenceLineType oldLoadReferenceLine = loadReferenceLine;
		loadReferenceLine = newLoadReferenceLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE, oldLoadReferenceLine,
					newLoadReferenceLine);
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
	public void setLoadReferenceLine(LoadReferenceLineType newLoadReferenceLine) {
		if (newLoadReferenceLine != loadReferenceLine) {
			NotificationChain msgs = null;
			if (loadReferenceLine != null)
				msgs = ((InternalEObject) loadReferenceLine).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE,
						null, msgs);
			if (newLoadReferenceLine != null)
				msgs = ((InternalEObject) newLoadReferenceLine).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE,
						null, msgs);
			msgs = basicSetLoadReferenceLine(newLoadReferenceLine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE, newLoadReferenceLine,
					newLoadReferenceLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadApplicationPointsType getLoadApplicationPoints() {
		return loadApplicationPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadApplicationPoints(LoadApplicationPointsType newLoadApplicationPoints,
			NotificationChain msgs) {
		LoadApplicationPointsType oldLoadApplicationPoints = loadApplicationPoints;
		loadApplicationPoints = newLoadApplicationPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS, oldLoadApplicationPoints,
					newLoadApplicationPoints);
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
	public void setLoadApplicationPoints(LoadApplicationPointsType newLoadApplicationPoints) {
		if (newLoadApplicationPoints != loadApplicationPoints) {
			NotificationChain msgs = null;
			if (loadApplicationPoints != null)
				msgs = ((InternalEObject) loadApplicationPoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS,
						null, msgs);
			if (newLoadApplicationPoints != null)
				msgs = ((InternalEObject) newLoadApplicationPoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS,
						null, msgs);
			msgs = basicSetLoadApplicationPoints(newLoadApplicationPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS, newLoadApplicationPoints,
					newLoadApplicationPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutLoadPointsType getCutLoadIntegrationPoints() {
		return cutLoadIntegrationPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutLoadIntegrationPoints(CutLoadPointsType newCutLoadIntegrationPoints,
			NotificationChain msgs) {
		CutLoadPointsType oldCutLoadIntegrationPoints = cutLoadIntegrationPoints;
		cutLoadIntegrationPoints = newCutLoadIntegrationPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS,
					oldCutLoadIntegrationPoints, newCutLoadIntegrationPoints);
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
	public void setCutLoadIntegrationPoints(CutLoadPointsType newCutLoadIntegrationPoints) {
		if (newCutLoadIntegrationPoints != cutLoadIntegrationPoints) {
			NotificationChain msgs = null;
			if (cutLoadIntegrationPoints != null)
				msgs = ((InternalEObject) cutLoadIntegrationPoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS,
						null, msgs);
			if (newCutLoadIntegrationPoints != null)
				msgs = ((InternalEObject) newCutLoadIntegrationPoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS,
						null, msgs);
			msgs = basicSetCutLoadIntegrationPoints(newCutLoadIntegrationPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS,
					newCutLoadIntegrationPoints, newCutLoadIntegrationPoints));
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
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES, oldConnectivities, newConnectivities);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES, null,
						msgs);
			if (newConnectivities != null)
				msgs = ((InternalEObject) newConnectivities).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES, null,
						msgs);
			msgs = basicSetConnectivities(newConnectivities, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES, newConnectivities,
					newConnectivities));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID:
			return basicSetComponentUID(null, msgs);
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE:
			return basicSetLoadReferenceLine(null, msgs);
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS:
			return basicSetLoadApplicationPoints(null, msgs);
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			return basicSetCutLoadIntegrationPoints(null, msgs);
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES:
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
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID:
			return getComponentUID();
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE:
			return getLoadReferenceLine();
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS:
			return getLoadApplicationPoints();
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			return getCutLoadIntegrationPoints();
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES:
			return getConnectivities();
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__UID:
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
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID:
			setComponentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE:
			setLoadReferenceLine((LoadReferenceLineType) newValue);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS:
			setLoadApplicationPoints((LoadApplicationPointsType) newValue);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			setCutLoadIntegrationPoints((CutLoadPointsType) newValue);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES:
			setConnectivities((ConnectivitiesType) newValue);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__UID:
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
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID:
			setComponentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE:
			setLoadReferenceLine((LoadReferenceLineType) null);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS:
			setLoadApplicationPoints((LoadApplicationPointsType) null);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			setCutLoadIntegrationPoints((CutLoadPointsType) null);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES:
			setConnectivities((ConnectivitiesType) null);
			return;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__UID:
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
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__COMPONENT_UID:
			return componentUID != null;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_REFERENCE_LINE:
			return loadReferenceLine != null;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__LOAD_APPLICATION_POINTS:
			return loadApplicationPoints != null;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CUT_LOAD_INTEGRATION_POINTS:
			return cutLoadIntegrationPoints != null;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__CONNECTIVITIES:
			return connectivities != null;
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE__UID:
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

} //LoadApplicationPointSetTypeImpl
