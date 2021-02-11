/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.IntegerBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WingFuelTankBorderType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Fuel Tank Border Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingFuelTankBorderTypeImpl#getSparUID <em>Spar UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuelTankBorderTypeImpl#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuelTankBorderTypeImpl#getRibNumber <em>Rib Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingFuelTankBorderTypeImpl extends ComplexBaseTypeImpl implements WingFuelTankBorderType {
	/**
	 * The cached value of the '{@link #getSparUID() <em>Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sparUID;

	/**
	 * The cached value of the '{@link #getRibDefinitionUID() <em>Rib Definition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibDefinitionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType ribDefinitionUID;

	/**
	 * The cached value of the '{@link #getRibNumber() <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibNumber()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType ribNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingFuelTankBorderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingFuelTankBorderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSparUID() {
		return sparUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparUID(StringUIDBaseType newSparUID, NotificationChain msgs) {
		StringUIDBaseType oldSparUID = sparUID;
		sparUID = newSparUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID, oldSparUID, newSparUID);
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
	public void setSparUID(StringUIDBaseType newSparUID) {
		if (newSparUID != sparUID) {
			NotificationChain msgs = null;
			if (sparUID != null)
				msgs = ((InternalEObject) sparUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID, null, msgs);
			if (newSparUID != null)
				msgs = ((InternalEObject) newSparUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID, null, msgs);
			msgs = basicSetSparUID(newSparUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID,
					newSparUID, newSparUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRibDefinitionUID() {
		return ribDefinitionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibDefinitionUID(StringUIDBaseType newRibDefinitionUID, NotificationChain msgs) {
		StringUIDBaseType oldRibDefinitionUID = ribDefinitionUID;
		ribDefinitionUID = newRibDefinitionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID, oldRibDefinitionUID,
					newRibDefinitionUID);
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
	public void setRibDefinitionUID(StringUIDBaseType newRibDefinitionUID) {
		if (newRibDefinitionUID != ribDefinitionUID) {
			NotificationChain msgs = null;
			if (ribDefinitionUID != null)
				msgs = ((InternalEObject) ribDefinitionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID, null,
						msgs);
			if (newRibDefinitionUID != null)
				msgs = ((InternalEObject) newRibDefinitionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID, null,
						msgs);
			msgs = basicSetRibDefinitionUID(newRibDefinitionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID, newRibDefinitionUID,
					newRibDefinitionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getRibNumber() {
		return ribNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibNumber(IntegerBaseType newRibNumber, NotificationChain msgs) {
		IntegerBaseType oldRibNumber = ribNumber;
		ribNumber = newRibNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER, oldRibNumber, newRibNumber);
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
	public void setRibNumber(IntegerBaseType newRibNumber) {
		if (newRibNumber != ribNumber) {
			NotificationChain msgs = null;
			if (ribNumber != null)
				msgs = ((InternalEObject) ribNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER, null, msgs);
			if (newRibNumber != null)
				msgs = ((InternalEObject) newRibNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER, null, msgs);
			msgs = basicSetRibNumber(newRibNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER,
					newRibNumber, newRibNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID:
			return basicSetSparUID(null, msgs);
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID:
			return basicSetRibDefinitionUID(null, msgs);
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER:
			return basicSetRibNumber(null, msgs);
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
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID:
			return getSparUID();
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID:
			return getRibDefinitionUID();
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER:
			return getRibNumber();
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
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID:
			setSparUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) newValue);
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
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID:
			setSparUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) null);
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
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__SPAR_UID:
			return sparUID != null;
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_DEFINITION_UID:
			return ribDefinitionUID != null;
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE__RIB_NUMBER:
			return ribNumber != null;
		}
		return super.eIsSet(featureID);
	}

} //WingFuelTankBorderTypeImpl
