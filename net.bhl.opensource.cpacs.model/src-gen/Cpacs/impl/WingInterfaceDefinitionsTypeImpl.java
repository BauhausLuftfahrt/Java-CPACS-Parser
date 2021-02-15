/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.WingInterfaceDefinitionsType;
import Cpacs.WingInterfaceMainFramesType;
import Cpacs.WingInterfaceSupportStrutsAssemblyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Interface Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingInterfaceDefinitionsTypeImpl#getCutoutReinfStructElemUID <em>Cutout Reinf Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceDefinitionsTypeImpl#getWingInterfaceMainFrames <em>Wing Interface Main Frames</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceDefinitionsTypeImpl#getStartStringerUID <em>Start Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceDefinitionsTypeImpl#getEndStringerUID <em>End Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceDefinitionsTypeImpl#getWingInterfaceSupportStruts <em>Wing Interface Support Struts</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceDefinitionsTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingInterfaceDefinitionsTypeImpl extends ComplexBaseTypeImpl implements WingInterfaceDefinitionsType {
	/**
	 * The cached value of the '{@link #getCutoutReinfStructElemUID() <em>Cutout Reinf Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutoutReinfStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType cutoutReinfStructElemUID;

	/**
	 * The cached value of the '{@link #getWingInterfaceMainFrames() <em>Wing Interface Main Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingInterfaceMainFrames()
	 * @generated
	 * @ordered
	 */
	protected WingInterfaceMainFramesType wingInterfaceMainFrames;

	/**
	 * The cached value of the '{@link #getStartStringerUID() <em>Start Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startStringerUID;

	/**
	 * The cached value of the '{@link #getEndStringerUID() <em>End Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endStringerUID;

	/**
	 * The cached value of the '{@link #getWingInterfaceSupportStruts() <em>Wing Interface Support Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingInterfaceSupportStruts()
	 * @generated
	 * @ordered
	 */
	protected WingInterfaceSupportStrutsAssemblyType wingInterfaceSupportStruts;

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
	protected WingInterfaceDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingInterfaceDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCutoutReinfStructElemUID() {
		return cutoutReinfStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutoutReinfStructElemUID(StringUIDBaseType newCutoutReinfStructElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldCutoutReinfStructElemUID = cutoutReinfStructElemUID;
		cutoutReinfStructElemUID = newCutoutReinfStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID,
					oldCutoutReinfStructElemUID, newCutoutReinfStructElemUID);
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
	public void setCutoutReinfStructElemUID(StringUIDBaseType newCutoutReinfStructElemUID) {
		if (newCutoutReinfStructElemUID != cutoutReinfStructElemUID) {
			NotificationChain msgs = null;
			if (cutoutReinfStructElemUID != null)
				msgs = ((InternalEObject) cutoutReinfStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID,
						null, msgs);
			if (newCutoutReinfStructElemUID != null)
				msgs = ((InternalEObject) newCutoutReinfStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetCutoutReinfStructElemUID(newCutoutReinfStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID,
					newCutoutReinfStructElemUID, newCutoutReinfStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingInterfaceMainFramesType getWingInterfaceMainFrames() {
		return wingInterfaceMainFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingInterfaceMainFrames(WingInterfaceMainFramesType newWingInterfaceMainFrames,
			NotificationChain msgs) {
		WingInterfaceMainFramesType oldWingInterfaceMainFrames = wingInterfaceMainFrames;
		wingInterfaceMainFrames = newWingInterfaceMainFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES,
					oldWingInterfaceMainFrames, newWingInterfaceMainFrames);
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
	public void setWingInterfaceMainFrames(WingInterfaceMainFramesType newWingInterfaceMainFrames) {
		if (newWingInterfaceMainFrames != wingInterfaceMainFrames) {
			NotificationChain msgs = null;
			if (wingInterfaceMainFrames != null)
				msgs = ((InternalEObject) wingInterfaceMainFrames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES, null, msgs);
			if (newWingInterfaceMainFrames != null)
				msgs = ((InternalEObject) newWingInterfaceMainFrames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES, null, msgs);
			msgs = basicSetWingInterfaceMainFrames(newWingInterfaceMainFrames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES,
					newWingInterfaceMainFrames, newWingInterfaceMainFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartStringerUID() {
		return startStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartStringerUID(StringUIDBaseType newStartStringerUID, NotificationChain msgs) {
		StringUIDBaseType oldStartStringerUID = startStringerUID;
		startStringerUID = newStartStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID, oldStartStringerUID,
					newStartStringerUID);
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
	public void setStartStringerUID(StringUIDBaseType newStartStringerUID) {
		if (newStartStringerUID != startStringerUID) {
			NotificationChain msgs = null;
			if (startStringerUID != null)
				msgs = ((InternalEObject) startStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID, null,
						msgs);
			if (newStartStringerUID != null)
				msgs = ((InternalEObject) newStartStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID, null,
						msgs);
			msgs = basicSetStartStringerUID(newStartStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID, newStartStringerUID,
					newStartStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndStringerUID() {
		return endStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndStringerUID(StringUIDBaseType newEndStringerUID, NotificationChain msgs) {
		StringUIDBaseType oldEndStringerUID = endStringerUID;
		endStringerUID = newEndStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID, oldEndStringerUID,
					newEndStringerUID);
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
	public void setEndStringerUID(StringUIDBaseType newEndStringerUID) {
		if (newEndStringerUID != endStringerUID) {
			NotificationChain msgs = null;
			if (endStringerUID != null)
				msgs = ((InternalEObject) endStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID, null,
						msgs);
			if (newEndStringerUID != null)
				msgs = ((InternalEObject) newEndStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID, null,
						msgs);
			msgs = basicSetEndStringerUID(newEndStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID, newEndStringerUID,
					newEndStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingInterfaceSupportStrutsAssemblyType getWingInterfaceSupportStruts() {
		return wingInterfaceSupportStruts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingInterfaceSupportStruts(
			WingInterfaceSupportStrutsAssemblyType newWingInterfaceSupportStruts, NotificationChain msgs) {
		WingInterfaceSupportStrutsAssemblyType oldWingInterfaceSupportStruts = wingInterfaceSupportStruts;
		wingInterfaceSupportStruts = newWingInterfaceSupportStruts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS,
					oldWingInterfaceSupportStruts, newWingInterfaceSupportStruts);
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
	public void setWingInterfaceSupportStruts(WingInterfaceSupportStrutsAssemblyType newWingInterfaceSupportStruts) {
		if (newWingInterfaceSupportStruts != wingInterfaceSupportStruts) {
			NotificationChain msgs = null;
			if (wingInterfaceSupportStruts != null)
				msgs = ((InternalEObject) wingInterfaceSupportStruts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS,
						null, msgs);
			if (newWingInterfaceSupportStruts != null)
				msgs = ((InternalEObject) newWingInterfaceSupportStruts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS,
						null, msgs);
			msgs = basicSetWingInterfaceSupportStruts(newWingInterfaceSupportStruts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS,
					newWingInterfaceSupportStruts, newWingInterfaceSupportStruts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__UID,
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
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID:
			return basicSetCutoutReinfStructElemUID(null, msgs);
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES:
			return basicSetWingInterfaceMainFrames(null, msgs);
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID:
			return basicSetStartStringerUID(null, msgs);
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID:
			return basicSetEndStringerUID(null, msgs);
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS:
			return basicSetWingInterfaceSupportStruts(null, msgs);
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
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID:
			return getCutoutReinfStructElemUID();
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES:
			return getWingInterfaceMainFrames();
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID:
			return getStartStringerUID();
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID:
			return getEndStringerUID();
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS:
			return getWingInterfaceSupportStruts();
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID:
			setCutoutReinfStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES:
			setWingInterfaceMainFrames((WingInterfaceMainFramesType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID:
			setStartStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID:
			setEndStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS:
			setWingInterfaceSupportStruts((WingInterfaceSupportStrutsAssemblyType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID:
			setCutoutReinfStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES:
			setWingInterfaceMainFrames((WingInterfaceMainFramesType) null);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID:
			setStartStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID:
			setEndStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS:
			setWingInterfaceSupportStruts((WingInterfaceSupportStrutsAssemblyType) null);
			return;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__CUTOUT_REINF_STRUCT_ELEM_UID:
			return cutoutReinfStructElemUID != null;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_MAIN_FRAMES:
			return wingInterfaceMainFrames != null;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__START_STRINGER_UID:
			return startStringerUID != null;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__END_STRINGER_UID:
			return endStringerUID != null;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__WING_INTERFACE_SUPPORT_STRUTS:
			return wingInterfaceSupportStruts != null;
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE__UID:
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

} //WingInterfaceDefinitionsTypeImpl
