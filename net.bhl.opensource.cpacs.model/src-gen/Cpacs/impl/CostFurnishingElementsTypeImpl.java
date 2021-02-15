/**
 */
package Cpacs.impl;

import Cpacs.CostFurnishingElementsType;
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
 * An implementation of the model object '<em><b>Cost Furnishing Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostFurnishingElementsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostFurnishingElementsTypeImpl#getFurnishingElement <em>Furnishing Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostFurnishingElementsTypeImpl extends ComplexBaseTypeImpl implements CostFurnishingElementsType {
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
	 * The cached value of the '{@link #getFurnishingElement() <em>Furnishing Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurnishingElement()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericCostType> furnishingElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostFurnishingElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostFurnishingElementsType();
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
					CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION, oldCostDescription,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION, null,
						msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION, null,
						msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION, newCostDescription,
					newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericCostType> getFurnishingElement() {
		if (furnishingElement == null) {
			furnishingElement = new EObjectContainmentEList<GenericCostType>(GenericCostType.class, this,
					CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__FURNISHING_ELEMENT);
		}
		return furnishingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__FURNISHING_ELEMENT:
			return ((InternalEList<?>) getFurnishingElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__FURNISHING_ELEMENT:
			return getFurnishingElement();
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
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__FURNISHING_ELEMENT:
			getFurnishingElement().clear();
			getFurnishingElement().addAll((Collection<? extends GenericCostType>) newValue);
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
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__FURNISHING_ELEMENT:
			getFurnishingElement().clear();
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
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE__FURNISHING_ELEMENT:
			return furnishingElement != null && !furnishingElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CostFurnishingElementsTypeImpl
