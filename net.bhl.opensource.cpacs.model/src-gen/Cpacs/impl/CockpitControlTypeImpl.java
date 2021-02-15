/**
 */
package Cpacs.impl;

import Cpacs.CockpitControlType;
import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

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
 * An implementation of the model object '<em><b>Cockpit Control Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CockpitControlTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CockpitControlTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CockpitControlTypeImpl#getCommandCaseUID <em>Command Case UID</em>}</li>
 *   <li>{@link Cpacs.impl.CockpitControlTypeImpl#getPilotInput <em>Pilot Input</em>}</li>
 *   <li>{@link Cpacs.impl.CockpitControlTypeImpl#getCommandOutput <em>Command Output</em>}</li>
 *   <li>{@link Cpacs.impl.CockpitControlTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CockpitControlTypeImpl extends ComplexBaseTypeImpl implements CockpitControlType {
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
	 * The cached value of the '{@link #getCommandCaseUID() <em>Command Case UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandCaseUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> commandCaseUID;

	/**
	 * The cached value of the '{@link #getPilotInput() <em>Pilot Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPilotInput()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType pilotInput;

	/**
	 * The cached value of the '{@link #getCommandOutput() <em>Command Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandOutput()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType commandOutput;

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
	protected CockpitControlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCockpitControlType();
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
					CpacsPackage.COCKPIT_CONTROL_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROL_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROL_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COCKPIT_CONTROL_TYPE__NAME, newName,
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
					CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getCommandCaseUID() {
		if (commandCaseUID == null) {
			commandCaseUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_CASE_UID);
		}
		return commandCaseUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getPilotInput() {
		return pilotInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPilotInput(StringVectorBaseType newPilotInput, NotificationChain msgs) {
		StringVectorBaseType oldPilotInput = pilotInput;
		pilotInput = newPilotInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT, oldPilotInput, newPilotInput);
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
	public void setPilotInput(StringVectorBaseType newPilotInput) {
		if (newPilotInput != pilotInput) {
			NotificationChain msgs = null;
			if (pilotInput != null)
				msgs = ((InternalEObject) pilotInput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT, null, msgs);
			if (newPilotInput != null)
				msgs = ((InternalEObject) newPilotInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT, null, msgs);
			msgs = basicSetPilotInput(newPilotInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT,
					newPilotInput, newPilotInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getCommandOutput() {
		return commandOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandOutput(StringVectorBaseType newCommandOutput, NotificationChain msgs) {
		StringVectorBaseType oldCommandOutput = commandOutput;
		commandOutput = newCommandOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT, oldCommandOutput, newCommandOutput);
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
	public void setCommandOutput(StringVectorBaseType newCommandOutput) {
		if (newCommandOutput != commandOutput) {
			NotificationChain msgs = null;
			if (commandOutput != null)
				msgs = ((InternalEObject) commandOutput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT, null, msgs);
			if (newCommandOutput != null)
				msgs = ((InternalEObject) newCommandOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT, null, msgs);
			msgs = basicSetCommandOutput(newCommandOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT,
					newCommandOutput, newCommandOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COCKPIT_CONTROL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COCKPIT_CONTROL_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_CASE_UID:
			return ((InternalEList<?>) getCommandCaseUID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT:
			return basicSetPilotInput(null, msgs);
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT:
			return basicSetCommandOutput(null, msgs);
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
		case CpacsPackage.COCKPIT_CONTROL_TYPE__NAME:
			return getName();
		case CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_CASE_UID:
			return getCommandCaseUID();
		case CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT:
			return getPilotInput();
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT:
			return getCommandOutput();
		case CpacsPackage.COCKPIT_CONTROL_TYPE__UID:
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
		case CpacsPackage.COCKPIT_CONTROL_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_CASE_UID:
			getCommandCaseUID().clear();
			getCommandCaseUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT:
			setPilotInput((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT:
			setCommandOutput((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__UID:
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
		case CpacsPackage.COCKPIT_CONTROL_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_CASE_UID:
			getCommandCaseUID().clear();
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT:
			setPilotInput((StringVectorBaseType) null);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT:
			setCommandOutput((StringVectorBaseType) null);
			return;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__UID:
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
		case CpacsPackage.COCKPIT_CONTROL_TYPE__NAME:
			return name != null;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_CASE_UID:
			return commandCaseUID != null && !commandCaseUID.isEmpty();
		case CpacsPackage.COCKPIT_CONTROL_TYPE__PILOT_INPUT:
			return pilotInput != null;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__COMMAND_OUTPUT:
			return commandOutput != null;
		case CpacsPackage.COCKPIT_CONTROL_TYPE__UID:
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

} //CockpitControlTypeImpl
