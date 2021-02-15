/**
 */
package Cpacs.impl;

import Cpacs.AeroelasticDivergenceType;
import Cpacs.CpacsPackage;
import Cpacs.DivergenceCasesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aeroelastic Divergence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroelasticDivergenceTypeImpl#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroelasticDivergenceTypeImpl extends ComplexBaseTypeImpl implements AeroelasticDivergenceType {
	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected DivergenceCasesType cases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroelasticDivergenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroelasticDivergenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergenceCasesType getCases() {
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCases(DivergenceCasesType newCases, NotificationChain msgs) {
		DivergenceCasesType oldCases = cases;
		cases = newCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES, oldCases, newCases);
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
	public void setCases(DivergenceCasesType newCases) {
		if (newCases != cases) {
			NotificationChain msgs = null;
			if (cases != null)
				msgs = ((InternalEObject) cases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES, null, msgs);
			if (newCases != null)
				msgs = ((InternalEObject) newCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES, null, msgs);
			msgs = basicSetCases(newCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES,
					newCases, newCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES:
			return basicSetCases(null, msgs);
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
		case CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES:
			return getCases();
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
		case CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES:
			setCases((DivergenceCasesType) newValue);
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
		case CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES:
			setCases((DivergenceCasesType) null);
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
		case CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE__CASES:
			return cases != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroelasticDivergenceTypeImpl
