/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingRibsDefinitionType;
import Cpacs.WingRibsDefinitionsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Ribs Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingRibsDefinitionsTypeImpl#getRibsDefinition <em>Ribs Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingRibsDefinitionsTypeImpl extends ComplexBaseTypeImpl implements WingRibsDefinitionsType {
	/**
	 * The cached value of the '{@link #getRibsDefinition() <em>Ribs Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibsDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<WingRibsDefinitionType> ribsDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingRibsDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingRibsDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingRibsDefinitionType> getRibsDefinition() {
		if (ribsDefinition == null) {
			ribsDefinition = new EObjectContainmentEList<WingRibsDefinitionType>(WingRibsDefinitionType.class, this,
					CpacsPackage.WING_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION);
		}
		return ribsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			return ((InternalEList<?>) getRibsDefinition()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			return getRibsDefinition();
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
		case CpacsPackage.WING_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			getRibsDefinition().clear();
			getRibsDefinition().addAll((Collection<? extends WingRibsDefinitionType>) newValue);
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
		case CpacsPackage.WING_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			getRibsDefinition().clear();
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
		case CpacsPackage.WING_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			return ribsDefinition != null && !ribsDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingRibsDefinitionsTypeImpl
