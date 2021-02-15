/**
 */
package Cpacs.impl;

import Cpacs.CostInstrumentSystemsType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Instrument Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostInstrumentSystemsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostInstrumentSystemsTypeImpl#getInstrumentSystem <em>Instrument System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostInstrumentSystemsTypeImpl extends ComplexBaseTypeImpl implements CostInstrumentSystemsType {
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
	 * The cached value of the '{@link #getInstrumentSystem() <em>Instrument System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrumentSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericCostType> instrumentSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostInstrumentSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostInstrumentSystemsType();
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
					CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION, oldCostDescription,
					newCostDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION, null,
						msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION, null,
						msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION, newCostDescription,
					newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericCostType> getInstrumentSystem() {
		if (instrumentSystem == null) {
			instrumentSystem = new EObjectContainmentEList<GenericCostType>(GenericCostType.class, this,
					CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__INSTRUMENT_SYSTEM);
		}
		return instrumentSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__INSTRUMENT_SYSTEM:
			return ((InternalEList<?>) getInstrumentSystem()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__INSTRUMENT_SYSTEM:
			return getInstrumentSystem();
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
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__INSTRUMENT_SYSTEM:
			getInstrumentSystem().clear();
			getInstrumentSystem().addAll((Collection<? extends GenericCostType>) newValue);
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
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__INSTRUMENT_SYSTEM:
			getInstrumentSystem().clear();
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
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE__INSTRUMENT_SYSTEM:
			return instrumentSystem != null && !instrumentSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CostInstrumentSystemsTypeImpl
