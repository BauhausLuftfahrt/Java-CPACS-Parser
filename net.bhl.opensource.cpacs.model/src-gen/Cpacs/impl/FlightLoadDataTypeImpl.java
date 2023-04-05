/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightLoadDataType;
import Cpacs.LoadSetsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Load Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightLoadDataTypeImpl#getNodalLoadSets <em>Nodal Load Sets</em>}</li>
 *   <li>{@link Cpacs.impl.FlightLoadDataTypeImpl#getCutLoadSets <em>Cut Load Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightLoadDataTypeImpl extends ComplexBaseTypeImpl implements FlightLoadDataType {
	/**
	 * The cached value of the '{@link #getNodalLoadSets() <em>Nodal Load Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodalLoadSets()
	 * @generated
	 * @ordered
	 */
	protected LoadSetsType nodalLoadSets;

	/**
	 * The cached value of the '{@link #getCutLoadSets() <em>Cut Load Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLoadSets()
	 * @generated
	 * @ordered
	 */
	protected LoadSetsType cutLoadSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightLoadDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightLoadDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadSetsType getNodalLoadSets() {
		return nodalLoadSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodalLoadSets(LoadSetsType newNodalLoadSets, NotificationChain msgs) {
		LoadSetsType oldNodalLoadSets = nodalLoadSets;
		nodalLoadSets = newNodalLoadSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS, oldNodalLoadSets, newNodalLoadSets);
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
	public void setNodalLoadSets(LoadSetsType newNodalLoadSets) {
		if (newNodalLoadSets != nodalLoadSets) {
			NotificationChain msgs = null;
			if (nodalLoadSets != null)
				msgs = ((InternalEObject) nodalLoadSets).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS, null, msgs);
			if (newNodalLoadSets != null)
				msgs = ((InternalEObject) newNodalLoadSets).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS, null, msgs);
			msgs = basicSetNodalLoadSets(newNodalLoadSets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS,
					newNodalLoadSets, newNodalLoadSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadSetsType getCutLoadSets() {
		return cutLoadSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutLoadSets(LoadSetsType newCutLoadSets, NotificationChain msgs) {
		LoadSetsType oldCutLoadSets = cutLoadSets;
		cutLoadSets = newCutLoadSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS, oldCutLoadSets, newCutLoadSets);
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
	public void setCutLoadSets(LoadSetsType newCutLoadSets) {
		if (newCutLoadSets != cutLoadSets) {
			NotificationChain msgs = null;
			if (cutLoadSets != null)
				msgs = ((InternalEObject) cutLoadSets).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS, null, msgs);
			if (newCutLoadSets != null)
				msgs = ((InternalEObject) newCutLoadSets).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS, null, msgs);
			msgs = basicSetCutLoadSets(newCutLoadSets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS,
					newCutLoadSets, newCutLoadSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS:
			return basicSetNodalLoadSets(null, msgs);
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS:
			return basicSetCutLoadSets(null, msgs);
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
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS:
			return getNodalLoadSets();
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS:
			return getCutLoadSets();
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
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS:
			setNodalLoadSets((LoadSetsType) newValue);
			return;
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS:
			setCutLoadSets((LoadSetsType) newValue);
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
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS:
			setNodalLoadSets((LoadSetsType) null);
			return;
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS:
			setCutLoadSets((LoadSetsType) null);
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
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__NODAL_LOAD_SETS:
			return nodalLoadSets != null;
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE__CUT_LOAD_SETS:
			return cutLoadSets != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightLoadDataTypeImpl
