/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PerformanceCasesType;
import Cpacs.PerformanceRequirementsType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PerformanceRequirementsTypeImpl#getRequiredPerformanceCases <em>Required Performance Cases</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceRequirementsTypeImpl#getOptionalPerformanceCases <em>Optional Performance Cases</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceRequirementsTypeImpl#getPerformanceCases <em>Performance Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceRequirementsTypeImpl extends ComplexBaseTypeImpl implements PerformanceRequirementsType {
	/**
	 * The cached value of the '{@link #getRequiredPerformanceCases() <em>Required Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPerformanceCases()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType requiredPerformanceCases;

	/**
	 * The cached value of the '{@link #getOptionalPerformanceCases() <em>Optional Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalPerformanceCases()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType optionalPerformanceCases;

	/**
	 * The cached value of the '{@link #getPerformanceCases() <em>Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceCases()
	 * @generated
	 * @ordered
	 */
	protected PerformanceCasesType performanceCases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceRequirementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPerformanceRequirementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getRequiredPerformanceCases() {
		return requiredPerformanceCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredPerformanceCases(StringVectorBaseType newRequiredPerformanceCases,
			NotificationChain msgs) {
		StringVectorBaseType oldRequiredPerformanceCases = requiredPerformanceCases;
		requiredPerformanceCases = newRequiredPerformanceCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES, oldRequiredPerformanceCases,
					newRequiredPerformanceCases);
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
	public void setRequiredPerformanceCases(StringVectorBaseType newRequiredPerformanceCases) {
		if (newRequiredPerformanceCases != requiredPerformanceCases) {
			NotificationChain msgs = null;
			if (requiredPerformanceCases != null)
				msgs = ((InternalEObject) requiredPerformanceCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES,
						null, msgs);
			if (newRequiredPerformanceCases != null)
				msgs = ((InternalEObject) newRequiredPerformanceCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES,
						null, msgs);
			msgs = basicSetRequiredPerformanceCases(newRequiredPerformanceCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES, newRequiredPerformanceCases,
					newRequiredPerformanceCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getOptionalPerformanceCases() {
		return optionalPerformanceCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalPerformanceCases(StringVectorBaseType newOptionalPerformanceCases,
			NotificationChain msgs) {
		StringVectorBaseType oldOptionalPerformanceCases = optionalPerformanceCases;
		optionalPerformanceCases = newOptionalPerformanceCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES, oldOptionalPerformanceCases,
					newOptionalPerformanceCases);
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
	public void setOptionalPerformanceCases(StringVectorBaseType newOptionalPerformanceCases) {
		if (newOptionalPerformanceCases != optionalPerformanceCases) {
			NotificationChain msgs = null;
			if (optionalPerformanceCases != null)
				msgs = ((InternalEObject) optionalPerformanceCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES,
						null, msgs);
			if (newOptionalPerformanceCases != null)
				msgs = ((InternalEObject) newOptionalPerformanceCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES,
						null, msgs);
			msgs = basicSetOptionalPerformanceCases(newOptionalPerformanceCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES, newOptionalPerformanceCases,
					newOptionalPerformanceCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceCasesType getPerformanceCases() {
		return performanceCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceCases(PerformanceCasesType newPerformanceCases,
			NotificationChain msgs) {
		PerformanceCasesType oldPerformanceCases = performanceCases;
		performanceCases = newPerformanceCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES, oldPerformanceCases,
					newPerformanceCases);
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
	public void setPerformanceCases(PerformanceCasesType newPerformanceCases) {
		if (newPerformanceCases != performanceCases) {
			NotificationChain msgs = null;
			if (performanceCases != null)
				msgs = ((InternalEObject) performanceCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES, null,
						msgs);
			if (newPerformanceCases != null)
				msgs = ((InternalEObject) newPerformanceCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES, null,
						msgs);
			msgs = basicSetPerformanceCases(newPerformanceCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES, newPerformanceCases,
					newPerformanceCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES:
			return basicSetRequiredPerformanceCases(null, msgs);
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES:
			return basicSetOptionalPerformanceCases(null, msgs);
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES:
			return basicSetPerformanceCases(null, msgs);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES:
			return getRequiredPerformanceCases();
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES:
			return getOptionalPerformanceCases();
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES:
			return getPerformanceCases();
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
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES:
			setRequiredPerformanceCases((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES:
			setOptionalPerformanceCases((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES:
			setPerformanceCases((PerformanceCasesType) newValue);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES:
			setRequiredPerformanceCases((StringVectorBaseType) null);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES:
			setOptionalPerformanceCases((StringVectorBaseType) null);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES:
			setPerformanceCases((PerformanceCasesType) null);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__REQUIRED_PERFORMANCE_CASES:
			return requiredPerformanceCases != null;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__OPTIONAL_PERFORMANCE_CASES:
			return optionalPerformanceCases != null;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__PERFORMANCE_CASES:
			return performanceCases != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformanceRequirementsTypeImpl
