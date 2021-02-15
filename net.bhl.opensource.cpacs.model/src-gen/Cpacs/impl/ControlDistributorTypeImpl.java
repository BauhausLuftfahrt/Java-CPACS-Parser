/**
 */
package Cpacs.impl;

import Cpacs.ControlDistributorType;
import Cpacs.ControlElementsType;
import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Distributor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlDistributorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.ControlDistributorTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.ControlDistributorTypeImpl#getCommandInputs <em>Command Inputs</em>}</li>
 *   <li>{@link Cpacs.impl.ControlDistributorTypeImpl#getControlElements <em>Control Elements</em>}</li>
 *   <li>{@link Cpacs.impl.ControlDistributorTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlDistributorTypeImpl extends ComplexBaseTypeImpl implements ControlDistributorType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getCommandInputs() <em>Command Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandInputs()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType commandInputs;

	/**
	 * The cached value of the '{@link #getControlElements() <em>Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlElements()
	 * @generated
	 * @ordered
	 */
	protected ControlElementsType controlElements;

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
	protected ControlDistributorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlDistributorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME, newName,
					newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getCommandInputs() {
		return commandInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandInputs(StringVectorBaseType newCommandInputs, NotificationChain msgs) {
		StringVectorBaseType oldCommandInputs = commandInputs;
		commandInputs = newCommandInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS, oldCommandInputs, newCommandInputs);
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
	public void setCommandInputs(StringVectorBaseType newCommandInputs) {
		if (newCommandInputs != commandInputs) {
			NotificationChain msgs = null;
			if (commandInputs != null)
				msgs = ((InternalEObject) commandInputs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS, null, msgs);
			if (newCommandInputs != null)
				msgs = ((InternalEObject) newCommandInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS, null, msgs);
			msgs = basicSetCommandInputs(newCommandInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS,
					newCommandInputs, newCommandInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlElementsType getControlElements() {
		return controlElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlElements(ControlElementsType newControlElements, NotificationChain msgs) {
		ControlElementsType oldControlElements = controlElements;
		controlElements = newControlElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS, oldControlElements, newControlElements);
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
	public void setControlElements(ControlElementsType newControlElements) {
		if (newControlElements != controlElements) {
			NotificationChain msgs = null;
			if (controlElements != null)
				msgs = ((InternalEObject) controlElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS, null, msgs);
			if (newControlElements != null)
				msgs = ((InternalEObject) newControlElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS, null, msgs);
			msgs = basicSetControlElements(newControlElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS, newControlElements, newControlElements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS:
			return basicSetCommandInputs(null, msgs);
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS:
			return basicSetControlElements(null, msgs);
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
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME:
			return getName();
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS:
			return getCommandInputs();
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS:
			return getControlElements();
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__UID:
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
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS:
			setCommandInputs((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS:
			setControlElements((ControlElementsType) newValue);
			return;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__UID:
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
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS:
			setCommandInputs((StringVectorBaseType) null);
			return;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS:
			setControlElements((ControlElementsType) null);
			return;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__UID:
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
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__NAME:
			return name != null;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__COMMAND_INPUTS:
			return commandInputs != null;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__CONTROL_ELEMENTS:
			return controlElements != null;
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE__UID:
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

} //ControlDistributorTypeImpl
