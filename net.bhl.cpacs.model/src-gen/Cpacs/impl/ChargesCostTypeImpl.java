/**
 */
package Cpacs.impl;

import Cpacs.ChargesCostType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charges Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ChargesCostTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.ChargesCostTypeImpl#getNavigation <em>Navigation</em>}</li>
 *   <li>{@link Cpacs.impl.ChargesCostTypeImpl#getLanding <em>Landing</em>}</li>
 *   <li>{@link Cpacs.impl.ChargesCostTypeImpl#getGround <em>Ground</em>}</li>
 *   <li>{@link Cpacs.impl.ChargesCostTypeImpl#getEnvironmentalFees <em>Environmental Fees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargesCostTypeImpl extends ComplexBaseTypeImpl implements ChargesCostType {
	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType costDescription;

	/**
	 * The cached value of the '{@link #getNavigation() <em>Navigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigation()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType navigation;

	/**
	 * The cached value of the '{@link #getLanding() <em>Landing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanding()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType landing;

	/**
	 * The cached value of the '{@link #getGround() <em>Ground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGround()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType ground;

	/**
	 * The cached value of the '{@link #getEnvironmentalFees() <em>Environmental Fees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalFees()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType environmentalFees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargesCostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getChargesCostType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getCostDescription() {
		return costDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostDescription(GenericCostType newCostDescription, NotificationChain msgs) {
		GenericCostType oldCostDescription = costDescription;
		costDescription = newCostDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
	public void setCostDescription(GenericCostType newCostDescription) {
		if (newCostDescription != costDescription) {
			NotificationChain msgs = null;
			if (costDescription != null)
				msgs = ((InternalEObject) costDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION,
					newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getNavigation() {
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigation(GenericCostType newNavigation, NotificationChain msgs) {
		GenericCostType oldNavigation = navigation;
		navigation = newNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHARGES_COST_TYPE__NAVIGATION, oldNavigation, newNavigation);
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
	public void setNavigation(GenericCostType newNavigation) {
		if (newNavigation != navigation) {
			NotificationChain msgs = null;
			if (navigation != null)
				msgs = ((InternalEObject) navigation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__NAVIGATION, null, msgs);
			if (newNavigation != null)
				msgs = ((InternalEObject) newNavigation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__NAVIGATION, null, msgs);
			msgs = basicSetNavigation(newNavigation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CHARGES_COST_TYPE__NAVIGATION,
					newNavigation, newNavigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getLanding() {
		return landing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanding(GenericCostType newLanding, NotificationChain msgs) {
		GenericCostType oldLanding = landing;
		landing = newLanding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHARGES_COST_TYPE__LANDING, oldLanding, newLanding);
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
	public void setLanding(GenericCostType newLanding) {
		if (newLanding != landing) {
			NotificationChain msgs = null;
			if (landing != null)
				msgs = ((InternalEObject) landing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__LANDING, null, msgs);
			if (newLanding != null)
				msgs = ((InternalEObject) newLanding).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__LANDING, null, msgs);
			msgs = basicSetLanding(newLanding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CHARGES_COST_TYPE__LANDING, newLanding,
					newLanding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getGround() {
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGround(GenericCostType newGround, NotificationChain msgs) {
		GenericCostType oldGround = ground;
		ground = newGround;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHARGES_COST_TYPE__GROUND, oldGround, newGround);
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
	public void setGround(GenericCostType newGround) {
		if (newGround != ground) {
			NotificationChain msgs = null;
			if (ground != null)
				msgs = ((InternalEObject) ground).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__GROUND, null, msgs);
			if (newGround != null)
				msgs = ((InternalEObject) newGround).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__GROUND, null, msgs);
			msgs = basicSetGround(newGround, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CHARGES_COST_TYPE__GROUND, newGround,
					newGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getEnvironmentalFees() {
		return environmentalFees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentalFees(GenericCostType newEnvironmentalFees, NotificationChain msgs) {
		GenericCostType oldEnvironmentalFees = environmentalFees;
		environmentalFees = newEnvironmentalFees;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES, oldEnvironmentalFees, newEnvironmentalFees);
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
	public void setEnvironmentalFees(GenericCostType newEnvironmentalFees) {
		if (newEnvironmentalFees != environmentalFees) {
			NotificationChain msgs = null;
			if (environmentalFees != null)
				msgs = ((InternalEObject) environmentalFees).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES, null, msgs);
			if (newEnvironmentalFees != null)
				msgs = ((InternalEObject) newEnvironmentalFees).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES, null, msgs);
			msgs = basicSetEnvironmentalFees(newEnvironmentalFees, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES,
					newEnvironmentalFees, newEnvironmentalFees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.CHARGES_COST_TYPE__NAVIGATION:
			return basicSetNavigation(null, msgs);
		case CpacsPackage.CHARGES_COST_TYPE__LANDING:
			return basicSetLanding(null, msgs);
		case CpacsPackage.CHARGES_COST_TYPE__GROUND:
			return basicSetGround(null, msgs);
		case CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES:
			return basicSetEnvironmentalFees(null, msgs);
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
		case CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.CHARGES_COST_TYPE__NAVIGATION:
			return getNavigation();
		case CpacsPackage.CHARGES_COST_TYPE__LANDING:
			return getLanding();
		case CpacsPackage.CHARGES_COST_TYPE__GROUND:
			return getGround();
		case CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES:
			return getEnvironmentalFees();
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
		case CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.CHARGES_COST_TYPE__NAVIGATION:
			setNavigation((GenericCostType) newValue);
			return;
		case CpacsPackage.CHARGES_COST_TYPE__LANDING:
			setLanding((GenericCostType) newValue);
			return;
		case CpacsPackage.CHARGES_COST_TYPE__GROUND:
			setGround((GenericCostType) newValue);
			return;
		case CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES:
			setEnvironmentalFees((GenericCostType) newValue);
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
		case CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.CHARGES_COST_TYPE__NAVIGATION:
			setNavigation((GenericCostType) null);
			return;
		case CpacsPackage.CHARGES_COST_TYPE__LANDING:
			setLanding((GenericCostType) null);
			return;
		case CpacsPackage.CHARGES_COST_TYPE__GROUND:
			setGround((GenericCostType) null);
			return;
		case CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES:
			setEnvironmentalFees((GenericCostType) null);
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
		case CpacsPackage.CHARGES_COST_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.CHARGES_COST_TYPE__NAVIGATION:
			return navigation != null;
		case CpacsPackage.CHARGES_COST_TYPE__LANDING:
			return landing != null;
		case CpacsPackage.CHARGES_COST_TYPE__GROUND:
			return ground != null;
		case CpacsPackage.CHARGES_COST_TYPE__ENVIRONMENTAL_FEES:
			return environmentalFees != null;
		}
		return super.eIsSet(featureID);
	}

} //ChargesCostTypeImpl
