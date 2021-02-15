/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceSkinCutOutBorderType;
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
 * An implementation of the model object '<em><b>Control Surface Skin Cut Out Border Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceSkinCutOutBorderTypeImpl#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceSkinCutOutBorderTypeImpl#getRibNumber <em>Rib Number</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceSkinCutOutBorderTypeImpl#getEtaLE <em>Eta LE</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceSkinCutOutBorderTypeImpl#getEtaTE <em>Eta TE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceSkinCutOutBorderTypeImpl extends ComplexBaseTypeImpl
		implements ControlSurfaceSkinCutOutBorderType {
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
	 * The cached value of the '{@link #getEtaLE() <em>Eta LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtaLE()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType etaLE;

	/**
	 * The cached value of the '{@link #getEtaTE() <em>Eta TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtaTE()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType etaTE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceSkinCutOutBorderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceSkinCutOutBorderType();
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
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID, oldRibDefinitionUID,
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
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID,
						null, msgs);
			if (newRibDefinitionUID != null)
				msgs = ((InternalEObject) newRibDefinitionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID,
						null, msgs);
			msgs = basicSetRibDefinitionUID(newRibDefinitionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID, newRibDefinitionUID,
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
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER, oldRibNumber, newRibNumber);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER,
						null, msgs);
			if (newRibNumber != null)
				msgs = ((InternalEObject) newRibNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER,
						null, msgs);
			msgs = basicSetRibNumber(newRibNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER, newRibNumber, newRibNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEtaLE() {
		return etaLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtaLE(EtaIsoLineType newEtaLE, NotificationChain msgs) {
		EtaIsoLineType oldEtaLE = etaLE;
		etaLE = newEtaLE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE, oldEtaLE, newEtaLE);
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
	public void setEtaLE(EtaIsoLineType newEtaLE) {
		if (newEtaLE != etaLE) {
			NotificationChain msgs = null;
			if (etaLE != null)
				msgs = ((InternalEObject) etaLE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE, null,
						msgs);
			if (newEtaLE != null)
				msgs = ((InternalEObject) newEtaLE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE, null,
						msgs);
			msgs = basicSetEtaLE(newEtaLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE, newEtaLE, newEtaLE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEtaTE() {
		return etaTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtaTE(EtaIsoLineType newEtaTE, NotificationChain msgs) {
		EtaIsoLineType oldEtaTE = etaTE;
		etaTE = newEtaTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE, oldEtaTE, newEtaTE);
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
	public void setEtaTE(EtaIsoLineType newEtaTE) {
		if (newEtaTE != etaTE) {
			NotificationChain msgs = null;
			if (etaTE != null)
				msgs = ((InternalEObject) etaTE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE, null,
						msgs);
			if (newEtaTE != null)
				msgs = ((InternalEObject) newEtaTE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE, null,
						msgs);
			msgs = basicSetEtaTE(newEtaTE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE, newEtaTE, newEtaTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID:
			return basicSetRibDefinitionUID(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER:
			return basicSetRibNumber(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE:
			return basicSetEtaLE(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE:
			return basicSetEtaTE(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID:
			return getRibDefinitionUID();
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER:
			return getRibNumber();
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE:
			return getEtaLE();
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE:
			return getEtaTE();
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
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE:
			setEtaLE((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE:
			setEtaTE((EtaIsoLineType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE:
			setEtaLE((EtaIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE:
			setEtaTE((EtaIsoLineType) null);
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
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_DEFINITION_UID:
			return ribDefinitionUID != null;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__RIB_NUMBER:
			return ribNumber != null;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_LE:
			return etaLE != null;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE__ETA_TE:
			return etaTE != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceSkinCutOutBorderTypeImpl
