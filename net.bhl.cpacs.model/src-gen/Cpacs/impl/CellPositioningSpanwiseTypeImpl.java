/**
 */
package Cpacs.impl;

import Cpacs.CellPositioningSpanwiseType;
import Cpacs.CpacsPackage;
import Cpacs.EtaIsoLineType;
import Cpacs.IntegerBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Positioning Spanwise Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CellPositioningSpanwiseTypeImpl#getEta1 <em>Eta1</em>}</li>
 *   <li>{@link Cpacs.impl.CellPositioningSpanwiseTypeImpl#getEta2 <em>Eta2</em>}</li>
 *   <li>{@link Cpacs.impl.CellPositioningSpanwiseTypeImpl#getRibNumber <em>Rib Number</em>}</li>
 *   <li>{@link Cpacs.impl.CellPositioningSpanwiseTypeImpl#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellPositioningSpanwiseTypeImpl extends ComplexBaseTypeImpl implements CellPositioningSpanwiseType {
	/**
	 * The cached value of the '{@link #getEta1() <em>Eta1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta1()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType eta1;

	/**
	 * The cached value of the '{@link #getEta2() <em>Eta2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta2()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType eta2;

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
	 * The cached value of the '{@link #getRibDefinitionUID() <em>Rib Definition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibDefinitionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType ribDefinitionUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellPositioningSpanwiseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCellPositioningSpanwiseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEta1() {
		return eta1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEta1(EtaIsoLineType newEta1, NotificationChain msgs) {
		EtaIsoLineType oldEta1 = eta1;
		eta1 = newEta1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1, oldEta1, newEta1);
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
	public void setEta1(EtaIsoLineType newEta1) {
		if (newEta1 != eta1) {
			NotificationChain msgs = null;
			if (eta1 != null)
				msgs = ((InternalEObject) eta1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1, null, msgs);
			if (newEta1 != null)
				msgs = ((InternalEObject) newEta1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1, null, msgs);
			msgs = basicSetEta1(newEta1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1,
					newEta1, newEta1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEta2() {
		return eta2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEta2(EtaIsoLineType newEta2, NotificationChain msgs) {
		EtaIsoLineType oldEta2 = eta2;
		eta2 = newEta2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2, oldEta2, newEta2);
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
	public void setEta2(EtaIsoLineType newEta2) {
		if (newEta2 != eta2) {
			NotificationChain msgs = null;
			if (eta2 != null)
				msgs = ((InternalEObject) eta2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2, null, msgs);
			if (newEta2 != null)
				msgs = ((InternalEObject) newEta2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2, null, msgs);
			msgs = basicSetEta2(newEta2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2,
					newEta2, newEta2));
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
					CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER, oldRibNumber, newRibNumber);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER, null, msgs);
			if (newRibNumber != null)
				msgs = ((InternalEObject) newRibNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER, null, msgs);
			msgs = basicSetRibNumber(newRibNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER, newRibNumber, newRibNumber));
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
					CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID, oldRibDefinitionUID,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID, null,
						msgs);
			if (newRibDefinitionUID != null)
				msgs = ((InternalEObject) newRibDefinitionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID, null,
						msgs);
			msgs = basicSetRibDefinitionUID(newRibDefinitionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID, newRibDefinitionUID,
					newRibDefinitionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1:
			return basicSetEta1(null, msgs);
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2:
			return basicSetEta2(null, msgs);
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER:
			return basicSetRibNumber(null, msgs);
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID:
			return basicSetRibDefinitionUID(null, msgs);
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
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1:
			return getEta1();
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2:
			return getEta2();
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER:
			return getRibNumber();
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID:
			return getRibDefinitionUID();
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
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1:
			setEta1((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2:
			setEta2((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) newValue);
			return;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1:
			setEta1((EtaIsoLineType) null);
			return;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2:
			setEta2((EtaIsoLineType) null);
			return;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) null);
			return;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) null);
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
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA1:
			return eta1 != null;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__ETA2:
			return eta2 != null;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_NUMBER:
			return ribNumber != null;
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE__RIB_DEFINITION_UID:
			return ribDefinitionUID != null;
		}
		return super.eIsSet(featureID);
	}

} //CellPositioningSpanwiseTypeImpl
