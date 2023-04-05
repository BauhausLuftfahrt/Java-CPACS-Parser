/**
 */
package Cpacs.impl;

import Cpacs.CoefficientsBreakdownComponentsType;
import Cpacs.CoefficientsBreakdownType;
import Cpacs.CoefficientsBreakdownWingsType;
import Cpacs.CpacsPackage;
import Cpacs.RemainingContributionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coefficients Breakdown Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownTypeImpl#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownTypeImpl#getOtherComponents <em>Other Components</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownTypeImpl#getRemainingContributions <em>Remaining Contributions</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownTypeImpl#getOtherComponents1 <em>Other Components1</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownTypeImpl#getRemainingContributions1 <em>Remaining Contributions1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientsBreakdownTypeImpl extends ComplexBaseTypeImpl implements CoefficientsBreakdownType {
	/**
	 * The cached value of the '{@link #getWings() <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWings()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsBreakdownWingsType wings;

	/**
	 * The cached value of the '{@link #getOtherComponents() <em>Other Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherComponents()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsBreakdownComponentsType otherComponents;

	/**
	 * The cached value of the '{@link #getRemainingContributions() <em>Remaining Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingContributions()
	 * @generated
	 * @ordered
	 */
	protected RemainingContributionsType remainingContributions;

	/**
	 * The cached value of the '{@link #getOtherComponents1() <em>Other Components1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherComponents1()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsBreakdownComponentsType otherComponents1;

	/**
	 * The cached value of the '{@link #getRemainingContributions1() <em>Remaining Contributions1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingContributions1()
	 * @generated
	 * @ordered
	 */
	protected RemainingContributionsType remainingContributions1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoefficientsBreakdownTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCoefficientsBreakdownType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsBreakdownWingsType getWings() {
		return wings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWings(CoefficientsBreakdownWingsType newWings, NotificationChain msgs) {
		CoefficientsBreakdownWingsType oldWings = wings;
		wings = newWings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS, oldWings, newWings);
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
	public void setWings(CoefficientsBreakdownWingsType newWings) {
		if (newWings != wings) {
			NotificationChain msgs = null;
			if (wings != null)
				msgs = ((InternalEObject) wings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS, null, msgs);
			if (newWings != null)
				msgs = ((InternalEObject) newWings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS, null, msgs);
			msgs = basicSetWings(newWings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS,
					newWings, newWings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsBreakdownComponentsType getOtherComponents() {
		return otherComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherComponents(CoefficientsBreakdownComponentsType newOtherComponents,
			NotificationChain msgs) {
		CoefficientsBreakdownComponentsType oldOtherComponents = otherComponents;
		otherComponents = newOtherComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS, oldOtherComponents, newOtherComponents);
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
	public void setOtherComponents(CoefficientsBreakdownComponentsType newOtherComponents) {
		if (newOtherComponents != otherComponents) {
			NotificationChain msgs = null;
			if (otherComponents != null)
				msgs = ((InternalEObject) otherComponents).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS, null,
						msgs);
			if (newOtherComponents != null)
				msgs = ((InternalEObject) newOtherComponents).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS, null,
						msgs);
			msgs = basicSetOtherComponents(newOtherComponents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS, newOtherComponents,
					newOtherComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemainingContributionsType getRemainingContributions() {
		return remainingContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemainingContributions(RemainingContributionsType newRemainingContributions,
			NotificationChain msgs) {
		RemainingContributionsType oldRemainingContributions = remainingContributions;
		remainingContributions = newRemainingContributions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS, oldRemainingContributions,
					newRemainingContributions);
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
	public void setRemainingContributions(RemainingContributionsType newRemainingContributions) {
		if (newRemainingContributions != remainingContributions) {
			NotificationChain msgs = null;
			if (remainingContributions != null)
				msgs = ((InternalEObject) remainingContributions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS,
						null, msgs);
			if (newRemainingContributions != null)
				msgs = ((InternalEObject) newRemainingContributions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS,
						null, msgs);
			msgs = basicSetRemainingContributions(newRemainingContributions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS, newRemainingContributions,
					newRemainingContributions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsBreakdownComponentsType getOtherComponents1() {
		return otherComponents1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherComponents1(CoefficientsBreakdownComponentsType newOtherComponents1,
			NotificationChain msgs) {
		CoefficientsBreakdownComponentsType oldOtherComponents1 = otherComponents1;
		otherComponents1 = newOtherComponents1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1, oldOtherComponents1,
					newOtherComponents1);
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
	public void setOtherComponents1(CoefficientsBreakdownComponentsType newOtherComponents1) {
		if (newOtherComponents1 != otherComponents1) {
			NotificationChain msgs = null;
			if (otherComponents1 != null)
				msgs = ((InternalEObject) otherComponents1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1, null,
						msgs);
			if (newOtherComponents1 != null)
				msgs = ((InternalEObject) newOtherComponents1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1, null,
						msgs);
			msgs = basicSetOtherComponents1(newOtherComponents1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1, newOtherComponents1,
					newOtherComponents1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemainingContributionsType getRemainingContributions1() {
		return remainingContributions1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemainingContributions1(RemainingContributionsType newRemainingContributions1,
			NotificationChain msgs) {
		RemainingContributionsType oldRemainingContributions1 = remainingContributions1;
		remainingContributions1 = newRemainingContributions1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1, oldRemainingContributions1,
					newRemainingContributions1);
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
	public void setRemainingContributions1(RemainingContributionsType newRemainingContributions1) {
		if (newRemainingContributions1 != remainingContributions1) {
			NotificationChain msgs = null;
			if (remainingContributions1 != null)
				msgs = ((InternalEObject) remainingContributions1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1,
						null, msgs);
			if (newRemainingContributions1 != null)
				msgs = ((InternalEObject) newRemainingContributions1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1,
						null, msgs);
			msgs = basicSetRemainingContributions1(newRemainingContributions1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1, newRemainingContributions1,
					newRemainingContributions1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS:
			return basicSetWings(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS:
			return basicSetOtherComponents(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS:
			return basicSetRemainingContributions(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1:
			return basicSetOtherComponents1(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1:
			return basicSetRemainingContributions1(null, msgs);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS:
			return getWings();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS:
			return getOtherComponents();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS:
			return getRemainingContributions();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1:
			return getOtherComponents1();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1:
			return getRemainingContributions1();
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS:
			setWings((CoefficientsBreakdownWingsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS:
			setOtherComponents((CoefficientsBreakdownComponentsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS:
			setRemainingContributions((RemainingContributionsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1:
			setOtherComponents1((CoefficientsBreakdownComponentsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1:
			setRemainingContributions1((RemainingContributionsType) newValue);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS:
			setWings((CoefficientsBreakdownWingsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS:
			setOtherComponents((CoefficientsBreakdownComponentsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS:
			setRemainingContributions((RemainingContributionsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1:
			setOtherComponents1((CoefficientsBreakdownComponentsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1:
			setRemainingContributions1((RemainingContributionsType) null);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__WINGS:
			return wings != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS:
			return otherComponents != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS:
			return remainingContributions != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__OTHER_COMPONENTS1:
			return otherComponents1 != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE__REMAINING_CONTRIBUTIONS1:
			return remainingContributions1 != null;
		}
		return super.eIsSet(featureID);
	}

} //CoefficientsBreakdownTypeImpl
