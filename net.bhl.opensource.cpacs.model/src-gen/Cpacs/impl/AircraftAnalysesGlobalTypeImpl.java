/**
 */
package Cpacs.impl;

import Cpacs.AircraftAnalysesGlobalType;
import Cpacs.CpacsPackage;
import Cpacs.LoadApplicationPointSetsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aircraft Analyses Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AircraftAnalysesGlobalTypeImpl#getLoadApplicationPointSets <em>Load Application Point Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AircraftAnalysesGlobalTypeImpl extends ComplexBaseTypeImpl implements AircraftAnalysesGlobalType {
	/**
	 * The cached value of the '{@link #getLoadApplicationPointSets() <em>Load Application Point Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadApplicationPointSets()
	 * @generated
	 * @ordered
	 */
	protected LoadApplicationPointSetsType loadApplicationPointSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AircraftAnalysesGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAircraftAnalysesGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadApplicationPointSetsType getLoadApplicationPointSets() {
		return loadApplicationPointSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadApplicationPointSets(LoadApplicationPointSetsType newLoadApplicationPointSets,
			NotificationChain msgs) {
		LoadApplicationPointSetsType oldLoadApplicationPointSets = loadApplicationPointSets;
		loadApplicationPointSets = newLoadApplicationPointSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS,
					oldLoadApplicationPointSets, newLoadApplicationPointSets);
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
	public void setLoadApplicationPointSets(LoadApplicationPointSetsType newLoadApplicationPointSets) {
		if (newLoadApplicationPointSets != loadApplicationPointSets) {
			NotificationChain msgs = null;
			if (loadApplicationPointSets != null)
				msgs = ((InternalEObject) loadApplicationPointSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS, null, msgs);
			if (newLoadApplicationPointSets != null)
				msgs = ((InternalEObject) newLoadApplicationPointSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS, null, msgs);
			msgs = basicSetLoadApplicationPointSets(newLoadApplicationPointSets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS,
					newLoadApplicationPointSets, newLoadApplicationPointSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS:
			return basicSetLoadApplicationPointSets(null, msgs);
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
		case CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS:
			return getLoadApplicationPointSets();
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
		case CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS:
			setLoadApplicationPointSets((LoadApplicationPointSetsType) newValue);
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
		case CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS:
			setLoadApplicationPointSets((LoadApplicationPointSetsType) null);
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
		case CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE__LOAD_APPLICATION_POINT_SETS:
			return loadApplicationPointSets != null;
		}
		return super.eIsSet(featureID);
	}

} //AircraftAnalysesGlobalTypeImpl
