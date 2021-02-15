/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PylonRibsDefinitionType;
import Cpacs.PylonRibsDefinitionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Ribs Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonRibsDefinitionsTypeImpl#getRibsDefinition <em>Ribs Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonRibsDefinitionsTypeImpl extends ComplexBaseTypeImpl implements PylonRibsDefinitionsType {
	/**
	 * The cached value of the '{@link #getRibsDefinition() <em>Ribs Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibsDefinition()
	 * @generated
	 * @ordered
	 */
	protected PylonRibsDefinitionType ribsDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PylonRibsDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonRibsDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonRibsDefinitionType getRibsDefinition() {
		return ribsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibsDefinition(PylonRibsDefinitionType newRibsDefinition, NotificationChain msgs) {
		PylonRibsDefinitionType oldRibsDefinition = ribsDefinition;
		ribsDefinition = newRibsDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION, oldRibsDefinition, newRibsDefinition);
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
	public void setRibsDefinition(PylonRibsDefinitionType newRibsDefinition) {
		if (newRibsDefinition != ribsDefinition) {
			NotificationChain msgs = null;
			if (ribsDefinition != null)
				msgs = ((InternalEObject) ribsDefinition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION, null, msgs);
			if (newRibsDefinition != null)
				msgs = ((InternalEObject) newRibsDefinition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION, null, msgs);
			msgs = basicSetRibsDefinition(newRibsDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION, newRibsDefinition, newRibsDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			return basicSetRibsDefinition(null, msgs);
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
		case CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			return getRibsDefinition();
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
		case CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			setRibsDefinition((PylonRibsDefinitionType) newValue);
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
		case CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			setRibsDefinition((PylonRibsDefinitionType) null);
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
		case CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE__RIBS_DEFINITION:
			return ribsDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //PylonRibsDefinitionsTypeImpl
