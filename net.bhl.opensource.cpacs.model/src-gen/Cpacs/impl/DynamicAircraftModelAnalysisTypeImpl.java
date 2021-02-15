/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DynamicAircraftModelAnalysisType;
import Cpacs.TopologyEntriesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Aircraft Model Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DynamicAircraftModelAnalysisTypeImpl#getTopologyEntries <em>Topology Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicAircraftModelAnalysisTypeImpl extends ComplexBaseTypeImpl
		implements DynamicAircraftModelAnalysisType {
	/**
	 * The cached value of the '{@link #getTopologyEntries() <em>Topology Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyEntries()
	 * @generated
	 * @ordered
	 */
	protected TopologyEntriesType topologyEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicAircraftModelAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDynamicAircraftModelAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopologyEntriesType getTopologyEntries() {
		return topologyEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyEntries(TopologyEntriesType newTopologyEntries, NotificationChain msgs) {
		TopologyEntriesType oldTopologyEntries = topologyEntries;
		topologyEntries = newTopologyEntries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES, oldTopologyEntries,
					newTopologyEntries);
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
	public void setTopologyEntries(TopologyEntriesType newTopologyEntries) {
		if (newTopologyEntries != topologyEntries) {
			NotificationChain msgs = null;
			if (topologyEntries != null)
				msgs = ((InternalEObject) topologyEntries).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES,
						null, msgs);
			if (newTopologyEntries != null)
				msgs = ((InternalEObject) newTopologyEntries).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES,
						null, msgs);
			msgs = basicSetTopologyEntries(newTopologyEntries, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES, newTopologyEntries,
					newTopologyEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES:
			return basicSetTopologyEntries(null, msgs);
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
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES:
			return getTopologyEntries();
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
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES:
			setTopologyEntries((TopologyEntriesType) newValue);
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
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES:
			setTopologyEntries((TopologyEntriesType) null);
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
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE__TOPOLOGY_ENTRIES:
			return topologyEntries != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicAircraftModelAnalysisTypeImpl
