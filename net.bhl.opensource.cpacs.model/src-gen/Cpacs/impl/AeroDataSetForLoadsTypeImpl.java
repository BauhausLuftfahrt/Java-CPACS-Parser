/**
 */
package Cpacs.impl;

import Cpacs.AeroDataSetForLoadsType;
import Cpacs.CoefficientsType;
import Cpacs.CpacsPackage;
import Cpacs.FlowConditionType;
import Cpacs.FuselagesCoefficientsType;
import Cpacs.GenericComponentsCoefficientsType;
import Cpacs.WingsCoefficientsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Data Set For Loads Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroDataSetForLoadsTypeImpl#getFlowCondition <em>Flow Condition</em>}</li>
 *   <li>{@link Cpacs.impl.AeroDataSetForLoadsTypeImpl#getTotalCoefficients <em>Total Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.AeroDataSetForLoadsTypeImpl#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.impl.AeroDataSetForLoadsTypeImpl#getFuselages <em>Fuselages</em>}</li>
 *   <li>{@link Cpacs.impl.AeroDataSetForLoadsTypeImpl#getGenericComponents <em>Generic Components</em>}</li>
 *   <li>{@link Cpacs.impl.AeroDataSetForLoadsTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroDataSetForLoadsTypeImpl extends ComplexBaseTypeImpl implements AeroDataSetForLoadsType {
	/**
	 * The cached value of the '{@link #getFlowCondition() <em>Flow Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowCondition()
	 * @generated
	 * @ordered
	 */
	protected FlowConditionType flowCondition;

	/**
	 * The cached value of the '{@link #getTotalCoefficients() <em>Total Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCoefficients()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsType totalCoefficients;

	/**
	 * The cached value of the '{@link #getWings() <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWings()
	 * @generated
	 * @ordered
	 */
	protected WingsCoefficientsType wings;

	/**
	 * The cached value of the '{@link #getFuselages() <em>Fuselages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselages()
	 * @generated
	 * @ordered
	 */
	protected FuselagesCoefficientsType fuselages;

	/**
	 * The cached value of the '{@link #getGenericComponents() <em>Generic Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericComponents()
	 * @generated
	 * @ordered
	 */
	protected GenericComponentsCoefficientsType genericComponents;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroDataSetForLoadsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroDataSetForLoadsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowConditionType getFlowCondition() {
		return flowCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowCondition(FlowConditionType newFlowCondition, NotificationChain msgs) {
		FlowConditionType oldFlowCondition = flowCondition;
		flowCondition = newFlowCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION, oldFlowCondition, newFlowCondition);
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
	public void setFlowCondition(FlowConditionType newFlowCondition) {
		if (newFlowCondition != flowCondition) {
			NotificationChain msgs = null;
			if (flowCondition != null)
				msgs = ((InternalEObject) flowCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION, null, msgs);
			if (newFlowCondition != null)
				msgs = ((InternalEObject) newFlowCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION, null, msgs);
			msgs = basicSetFlowCondition(newFlowCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION, newFlowCondition, newFlowCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsType getTotalCoefficients() {
		return totalCoefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalCoefficients(CoefficientsType newTotalCoefficients, NotificationChain msgs) {
		CoefficientsType oldTotalCoefficients = totalCoefficients;
		totalCoefficients = newTotalCoefficients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS, oldTotalCoefficients,
					newTotalCoefficients);
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
	public void setTotalCoefficients(CoefficientsType newTotalCoefficients) {
		if (newTotalCoefficients != totalCoefficients) {
			NotificationChain msgs = null;
			if (totalCoefficients != null)
				msgs = ((InternalEObject) totalCoefficients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS, null,
						msgs);
			if (newTotalCoefficients != null)
				msgs = ((InternalEObject) newTotalCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS, null,
						msgs);
			msgs = basicSetTotalCoefficients(newTotalCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS, newTotalCoefficients,
					newTotalCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingsCoefficientsType getWings() {
		return wings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWings(WingsCoefficientsType newWings, NotificationChain msgs) {
		WingsCoefficientsType oldWings = wings;
		wings = newWings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS, oldWings, newWings);
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
	public void setWings(WingsCoefficientsType newWings) {
		if (newWings != wings) {
			NotificationChain msgs = null;
			if (wings != null)
				msgs = ((InternalEObject) wings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS, null, msgs);
			if (newWings != null)
				msgs = ((InternalEObject) newWings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS, null, msgs);
			msgs = basicSetWings(newWings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS,
					newWings, newWings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselagesCoefficientsType getFuselages() {
		return fuselages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselages(FuselagesCoefficientsType newFuselages, NotificationChain msgs) {
		FuselagesCoefficientsType oldFuselages = fuselages;
		fuselages = newFuselages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES, oldFuselages, newFuselages);
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
	public void setFuselages(FuselagesCoefficientsType newFuselages) {
		if (newFuselages != fuselages) {
			NotificationChain msgs = null;
			if (fuselages != null)
				msgs = ((InternalEObject) fuselages).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES, null, msgs);
			if (newFuselages != null)
				msgs = ((InternalEObject) newFuselages).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES, null, msgs);
			msgs = basicSetFuselages(newFuselages, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES,
					newFuselages, newFuselages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericComponentsCoefficientsType getGenericComponents() {
		return genericComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericComponents(GenericComponentsCoefficientsType newGenericComponents,
			NotificationChain msgs) {
		GenericComponentsCoefficientsType oldGenericComponents = genericComponents;
		genericComponents = newGenericComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS, oldGenericComponents,
					newGenericComponents);
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
	public void setGenericComponents(GenericComponentsCoefficientsType newGenericComponents) {
		if (newGenericComponents != genericComponents) {
			NotificationChain msgs = null;
			if (genericComponents != null)
				msgs = ((InternalEObject) genericComponents).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS, null,
						msgs);
			if (newGenericComponents != null)
				msgs = ((InternalEObject) newGenericComponents).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS, null,
						msgs);
			msgs = basicSetGenericComponents(newGenericComponents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS, newGenericComponents,
					newGenericComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION:
			return basicSetFlowCondition(null, msgs);
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS:
			return basicSetTotalCoefficients(null, msgs);
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS:
			return basicSetWings(null, msgs);
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES:
			return basicSetFuselages(null, msgs);
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS:
			return basicSetGenericComponents(null, msgs);
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
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION:
			return getFlowCondition();
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS:
			return getTotalCoefficients();
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS:
			return getWings();
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES:
			return getFuselages();
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS:
			return getGenericComponents();
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__UID:
			return getUID();
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
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION:
			setFlowCondition((FlowConditionType) newValue);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS:
			setTotalCoefficients((CoefficientsType) newValue);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS:
			setWings((WingsCoefficientsType) newValue);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES:
			setFuselages((FuselagesCoefficientsType) newValue);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS:
			setGenericComponents((GenericComponentsCoefficientsType) newValue);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION:
			setFlowCondition((FlowConditionType) null);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS:
			setTotalCoefficients((CoefficientsType) null);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS:
			setWings((WingsCoefficientsType) null);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES:
			setFuselages((FuselagesCoefficientsType) null);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS:
			setGenericComponents((GenericComponentsCoefficientsType) null);
			return;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FLOW_CONDITION:
			return flowCondition != null;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__TOTAL_COEFFICIENTS:
			return totalCoefficients != null;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__WINGS:
			return wings != null;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__FUSELAGES:
			return fuselages != null;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__GENERIC_COMPONENTS:
			return genericComponents != null;
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //AeroDataSetForLoadsTypeImpl
