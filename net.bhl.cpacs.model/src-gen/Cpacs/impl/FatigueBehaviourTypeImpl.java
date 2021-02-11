/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FatigueBehaviourType;
import Cpacs.FatigueStressBasedBrownMillerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fatigue Behaviour Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FatigueBehaviourTypeImpl#getStressBasedBrownMillerFatigue <em>Stress Based Brown Miller Fatigue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FatigueBehaviourTypeImpl extends ComplexBaseTypeImpl implements FatigueBehaviourType {
	/**
	 * The cached value of the '{@link #getStressBasedBrownMillerFatigue() <em>Stress Based Brown Miller Fatigue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStressBasedBrownMillerFatigue()
	 * @generated
	 * @ordered
	 */
	protected FatigueStressBasedBrownMillerType stressBasedBrownMillerFatigue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FatigueBehaviourTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFatigueBehaviourType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FatigueStressBasedBrownMillerType getStressBasedBrownMillerFatigue() {
		return stressBasedBrownMillerFatigue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStressBasedBrownMillerFatigue(
			FatigueStressBasedBrownMillerType newStressBasedBrownMillerFatigue, NotificationChain msgs) {
		FatigueStressBasedBrownMillerType oldStressBasedBrownMillerFatigue = stressBasedBrownMillerFatigue;
		stressBasedBrownMillerFatigue = newStressBasedBrownMillerFatigue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE,
					oldStressBasedBrownMillerFatigue, newStressBasedBrownMillerFatigue);
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
	public void setStressBasedBrownMillerFatigue(FatigueStressBasedBrownMillerType newStressBasedBrownMillerFatigue) {
		if (newStressBasedBrownMillerFatigue != stressBasedBrownMillerFatigue) {
			NotificationChain msgs = null;
			if (stressBasedBrownMillerFatigue != null)
				msgs = ((InternalEObject) stressBasedBrownMillerFatigue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE,
						null, msgs);
			if (newStressBasedBrownMillerFatigue != null)
				msgs = ((InternalEObject) newStressBasedBrownMillerFatigue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE,
						null, msgs);
			msgs = basicSetStressBasedBrownMillerFatigue(newStressBasedBrownMillerFatigue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE,
					newStressBasedBrownMillerFatigue, newStressBasedBrownMillerFatigue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE:
			return basicSetStressBasedBrownMillerFatigue(null, msgs);
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
		case CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE:
			return getStressBasedBrownMillerFatigue();
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
		case CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE:
			setStressBasedBrownMillerFatigue((FatigueStressBasedBrownMillerType) newValue);
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
		case CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE:
			setStressBasedBrownMillerFatigue((FatigueStressBasedBrownMillerType) null);
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
		case CpacsPackage.FATIGUE_BEHAVIOUR_TYPE__STRESS_BASED_BROWN_MILLER_FATIGUE:
			return stressBasedBrownMillerFatigue != null;
		}
		return super.eIsSet(featureID);
	}

} //FatigueBehaviourTypeImpl
