/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadAnalysisType;
import Cpacs.LoadCasesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadAnalysisTypeImpl#getLoadCases <em>Load Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadAnalysisTypeImpl extends ComplexBaseTypeImpl implements LoadAnalysisType {
	/**
	 * The cached value of the '{@link #getLoadCases() <em>Load Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadCases()
	 * @generated
	 * @ordered
	 */
	protected LoadCasesType loadCases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCasesType getLoadCases() {
		return loadCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadCases(LoadCasesType newLoadCases, NotificationChain msgs) {
		LoadCasesType oldLoadCases = loadCases;
		loadCases = newLoadCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES, oldLoadCases, newLoadCases);
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
	public void setLoadCases(LoadCasesType newLoadCases) {
		if (newLoadCases != loadCases) {
			NotificationChain msgs = null;
			if (loadCases != null)
				msgs = ((InternalEObject) loadCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES, null, msgs);
			if (newLoadCases != null)
				msgs = ((InternalEObject) newLoadCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES, null, msgs);
			msgs = basicSetLoadCases(newLoadCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES,
					newLoadCases, newLoadCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES:
			return basicSetLoadCases(null, msgs);
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
		case CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES:
			return getLoadCases();
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
		case CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES:
			setLoadCases((LoadCasesType) newValue);
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
		case CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES:
			setLoadCases((LoadCasesType) null);
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
		case CpacsPackage.LOAD_ANALYSIS_TYPE__LOAD_CASES:
			return loadCases != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadAnalysisTypeImpl
