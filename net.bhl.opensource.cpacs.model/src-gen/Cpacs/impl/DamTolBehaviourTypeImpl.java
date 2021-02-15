/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DamTolBehaviourType;
import Cpacs.DamTolFormanType;
import Cpacs.DamTolWalkerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dam Tol Behaviour Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DamTolBehaviourTypeImpl#getWalkerDamageTolerance <em>Walker Damage Tolerance</em>}</li>
 *   <li>{@link Cpacs.impl.DamTolBehaviourTypeImpl#getFormanDamageTolerance <em>Forman Damage Tolerance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DamTolBehaviourTypeImpl extends ComplexBaseTypeImpl implements DamTolBehaviourType {
	/**
	 * The cached value of the '{@link #getWalkerDamageTolerance() <em>Walker Damage Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalkerDamageTolerance()
	 * @generated
	 * @ordered
	 */
	protected DamTolWalkerType walkerDamageTolerance;

	/**
	 * The cached value of the '{@link #getFormanDamageTolerance() <em>Forman Damage Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormanDamageTolerance()
	 * @generated
	 * @ordered
	 */
	protected DamTolFormanType formanDamageTolerance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DamTolBehaviourTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDamTolBehaviourType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DamTolWalkerType getWalkerDamageTolerance() {
		return walkerDamageTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWalkerDamageTolerance(DamTolWalkerType newWalkerDamageTolerance,
			NotificationChain msgs) {
		DamTolWalkerType oldWalkerDamageTolerance = walkerDamageTolerance;
		walkerDamageTolerance = newWalkerDamageTolerance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE, oldWalkerDamageTolerance,
					newWalkerDamageTolerance);
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
	public void setWalkerDamageTolerance(DamTolWalkerType newWalkerDamageTolerance) {
		if (newWalkerDamageTolerance != walkerDamageTolerance) {
			NotificationChain msgs = null;
			if (walkerDamageTolerance != null)
				msgs = ((InternalEObject) walkerDamageTolerance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE, null,
						msgs);
			if (newWalkerDamageTolerance != null)
				msgs = ((InternalEObject) newWalkerDamageTolerance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE, null,
						msgs);
			msgs = basicSetWalkerDamageTolerance(newWalkerDamageTolerance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE, newWalkerDamageTolerance,
					newWalkerDamageTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DamTolFormanType getFormanDamageTolerance() {
		return formanDamageTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormanDamageTolerance(DamTolFormanType newFormanDamageTolerance,
			NotificationChain msgs) {
		DamTolFormanType oldFormanDamageTolerance = formanDamageTolerance;
		formanDamageTolerance = newFormanDamageTolerance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE, oldFormanDamageTolerance,
					newFormanDamageTolerance);
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
	public void setFormanDamageTolerance(DamTolFormanType newFormanDamageTolerance) {
		if (newFormanDamageTolerance != formanDamageTolerance) {
			NotificationChain msgs = null;
			if (formanDamageTolerance != null)
				msgs = ((InternalEObject) formanDamageTolerance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE, null,
						msgs);
			if (newFormanDamageTolerance != null)
				msgs = ((InternalEObject) newFormanDamageTolerance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE, null,
						msgs);
			msgs = basicSetFormanDamageTolerance(newFormanDamageTolerance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE, newFormanDamageTolerance,
					newFormanDamageTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE:
			return basicSetWalkerDamageTolerance(null, msgs);
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE:
			return basicSetFormanDamageTolerance(null, msgs);
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
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE:
			return getWalkerDamageTolerance();
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE:
			return getFormanDamageTolerance();
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
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE:
			setWalkerDamageTolerance((DamTolWalkerType) newValue);
			return;
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE:
			setFormanDamageTolerance((DamTolFormanType) newValue);
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
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE:
			setWalkerDamageTolerance((DamTolWalkerType) null);
			return;
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE:
			setFormanDamageTolerance((DamTolFormanType) null);
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
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__WALKER_DAMAGE_TOLERANCE:
			return walkerDamageTolerance != null;
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE__FORMAN_DAMAGE_TOLERANCE:
			return formanDamageTolerance != null;
		}
		return super.eIsSet(featureID);
	}

} //DamTolBehaviourTypeImpl
