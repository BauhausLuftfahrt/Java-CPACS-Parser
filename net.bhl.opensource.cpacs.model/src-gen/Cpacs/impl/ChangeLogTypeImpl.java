/**
 */
package Cpacs.impl;

import Cpacs.ChangeLogType;
import Cpacs.CpacsPackage;
import Cpacs.LogEntryType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Log Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ChangeLogTypeImpl#getLogEntry <em>Log Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeLogTypeImpl extends ComplexBaseTypeImpl implements ChangeLogType {
	/**
	 * The cached value of the '{@link #getLogEntry() <em>Log Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<LogEntryType> logEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeLogTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getChangeLogType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogEntryType> getLogEntry() {
		if (logEntry == null) {
			logEntry = new EObjectContainmentEList<LogEntryType>(LogEntryType.class, this,
					CpacsPackage.CHANGE_LOG_TYPE__LOG_ENTRY);
		}
		return logEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CHANGE_LOG_TYPE__LOG_ENTRY:
			return ((InternalEList<?>) getLogEntry()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CHANGE_LOG_TYPE__LOG_ENTRY:
			return getLogEntry();
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
		case CpacsPackage.CHANGE_LOG_TYPE__LOG_ENTRY:
			getLogEntry().clear();
			getLogEntry().addAll((Collection<? extends LogEntryType>) newValue);
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
		case CpacsPackage.CHANGE_LOG_TYPE__LOG_ENTRY:
			getLogEntry().clear();
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
		case CpacsPackage.CHANGE_LOG_TYPE__LOG_ENTRY:
			return logEntry != null && !logEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangeLogTypeImpl
