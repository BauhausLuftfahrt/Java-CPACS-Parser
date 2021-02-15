/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TopologyEntriesType;
import Cpacs.TopologyEntryType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Entries Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TopologyEntriesTypeImpl#getTopologyEntry <em>Topology Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyEntriesTypeImpl extends ComplexBaseTypeImpl implements TopologyEntriesType {
	/**
	 * The cached value of the '{@link #getTopologyEntry() <em>Topology Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologyEntryType> topologyEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyEntriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTopologyEntriesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TopologyEntryType> getTopologyEntry() {
		if (topologyEntry == null) {
			topologyEntry = new EObjectContainmentEList<TopologyEntryType>(TopologyEntryType.class, this,
					CpacsPackage.TOPOLOGY_ENTRIES_TYPE__TOPOLOGY_ENTRY);
		}
		return topologyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TOPOLOGY_ENTRIES_TYPE__TOPOLOGY_ENTRY:
			return ((InternalEList<?>) getTopologyEntry()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TOPOLOGY_ENTRIES_TYPE__TOPOLOGY_ENTRY:
			return getTopologyEntry();
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
		case CpacsPackage.TOPOLOGY_ENTRIES_TYPE__TOPOLOGY_ENTRY:
			getTopologyEntry().clear();
			getTopologyEntry().addAll((Collection<? extends TopologyEntryType>) newValue);
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
		case CpacsPackage.TOPOLOGY_ENTRIES_TYPE__TOPOLOGY_ENTRY:
			getTopologyEntry().clear();
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
		case CpacsPackage.TOPOLOGY_ENTRIES_TYPE__TOPOLOGY_ENTRY:
			return topologyEntry != null && !topologyEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopologyEntriesTypeImpl
