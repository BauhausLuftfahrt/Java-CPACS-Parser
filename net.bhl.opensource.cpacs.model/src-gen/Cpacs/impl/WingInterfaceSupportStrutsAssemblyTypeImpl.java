/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingInterfaceSupportStrutType;
import Cpacs.WingInterfaceSupportStrutsAssemblyType;

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
 * An implementation of the model object '<em><b>Wing Interface Support Struts Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutsAssemblyTypeImpl#getWingInterfaceSupportStrut <em>Wing Interface Support Strut</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutsAssemblyTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingInterfaceSupportStrutsAssemblyTypeImpl extends ComplexBaseTypeImpl
		implements WingInterfaceSupportStrutsAssemblyType {
	/**
	 * The cached value of the '{@link #getWingInterfaceSupportStrut() <em>Wing Interface Support Strut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingInterfaceSupportStrut()
	 * @generated
	 * @ordered
	 */
	protected EList<WingInterfaceSupportStrutType> wingInterfaceSupportStrut;

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
	protected WingInterfaceSupportStrutsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingInterfaceSupportStrutsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingInterfaceSupportStrutType> getWingInterfaceSupportStrut() {
		if (wingInterfaceSupportStrut == null) {
			wingInterfaceSupportStrut = new EObjectContainmentEList<WingInterfaceSupportStrutType>(
					WingInterfaceSupportStrutType.class, this,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__WING_INTERFACE_SUPPORT_STRUT);
		}
		return wingInterfaceSupportStrut;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__WING_INTERFACE_SUPPORT_STRUT:
			return ((InternalEList<?>) getWingInterfaceSupportStrut()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__WING_INTERFACE_SUPPORT_STRUT:
			return getWingInterfaceSupportStrut();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__UID:
			return getUID();
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
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__WING_INTERFACE_SUPPORT_STRUT:
			getWingInterfaceSupportStrut().clear();
			getWingInterfaceSupportStrut().addAll((Collection<? extends WingInterfaceSupportStrutType>) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__WING_INTERFACE_SUPPORT_STRUT:
			getWingInterfaceSupportStrut().clear();
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__WING_INTERFACE_SUPPORT_STRUT:
			return wingInterfaceSupportStrut != null && !wingInterfaceSupportStrut.isEmpty();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE__UID:
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

} //WingInterfaceSupportStrutsAssemblyTypeImpl
