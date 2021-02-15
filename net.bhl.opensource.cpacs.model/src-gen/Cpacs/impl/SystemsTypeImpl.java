/**
 */
package Cpacs.impl;

import Cpacs.CockpitControlsType;
import Cpacs.CommandCasesType;
import Cpacs.ControlDistributorsType;
import Cpacs.ControlLawsType;
import Cpacs.CpacsPackage;
import Cpacs.GenericSystemsType;
import Cpacs.SystemsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SystemsTypeImpl#getGenericSystems <em>Generic Systems</em>}</li>
 *   <li>{@link Cpacs.impl.SystemsTypeImpl#getCockpitControls <em>Cockpit Controls</em>}</li>
 *   <li>{@link Cpacs.impl.SystemsTypeImpl#getCommandCases <em>Command Cases</em>}</li>
 *   <li>{@link Cpacs.impl.SystemsTypeImpl#getControlDistributors <em>Control Distributors</em>}</li>
 *   <li>{@link Cpacs.impl.SystemsTypeImpl#getControlLaws <em>Control Laws</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemsTypeImpl extends ComplexBaseTypeImpl implements SystemsType {
	/**
	 * The cached value of the '{@link #getGenericSystems() <em>Generic Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericSystems()
	 * @generated
	 * @ordered
	 */
	protected GenericSystemsType genericSystems;

	/**
	 * The cached value of the '{@link #getCockpitControls() <em>Cockpit Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCockpitControls()
	 * @generated
	 * @ordered
	 */
	protected CockpitControlsType cockpitControls;

	/**
	 * The cached value of the '{@link #getCommandCases() <em>Command Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandCases()
	 * @generated
	 * @ordered
	 */
	protected CommandCasesType commandCases;

	/**
	 * The cached value of the '{@link #getControlDistributors() <em>Control Distributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDistributors()
	 * @generated
	 * @ordered
	 */
	protected ControlDistributorsType controlDistributors;

	/**
	 * The cached value of the '{@link #getControlLaws() <em>Control Laws</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlLaws()
	 * @generated
	 * @ordered
	 */
	protected ControlLawsType controlLaws;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSystemsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericSystemsType getGenericSystems() {
		return genericSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericSystems(GenericSystemsType newGenericSystems, NotificationChain msgs) {
		GenericSystemsType oldGenericSystems = genericSystems;
		genericSystems = newGenericSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS, oldGenericSystems, newGenericSystems);
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
	public void setGenericSystems(GenericSystemsType newGenericSystems) {
		if (newGenericSystems != genericSystems) {
			NotificationChain msgs = null;
			if (genericSystems != null)
				msgs = ((InternalEObject) genericSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS, null, msgs);
			if (newGenericSystems != null)
				msgs = ((InternalEObject) newGenericSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS, null, msgs);
			msgs = basicSetGenericSystems(newGenericSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS,
					newGenericSystems, newGenericSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CockpitControlsType getCockpitControls() {
		return cockpitControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCockpitControls(CockpitControlsType newCockpitControls, NotificationChain msgs) {
		CockpitControlsType oldCockpitControls = cockpitControls;
		cockpitControls = newCockpitControls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS, oldCockpitControls, newCockpitControls);
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
	public void setCockpitControls(CockpitControlsType newCockpitControls) {
		if (newCockpitControls != cockpitControls) {
			NotificationChain msgs = null;
			if (cockpitControls != null)
				msgs = ((InternalEObject) cockpitControls).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS, null, msgs);
			if (newCockpitControls != null)
				msgs = ((InternalEObject) newCockpitControls).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS, null, msgs);
			msgs = basicSetCockpitControls(newCockpitControls, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS,
					newCockpitControls, newCockpitControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCasesType getCommandCases() {
		return commandCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandCases(CommandCasesType newCommandCases, NotificationChain msgs) {
		CommandCasesType oldCommandCases = commandCases;
		commandCases = newCommandCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES, oldCommandCases, newCommandCases);
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
	public void setCommandCases(CommandCasesType newCommandCases) {
		if (newCommandCases != commandCases) {
			NotificationChain msgs = null;
			if (commandCases != null)
				msgs = ((InternalEObject) commandCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES, null, msgs);
			if (newCommandCases != null)
				msgs = ((InternalEObject) newCommandCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES, null, msgs);
			msgs = basicSetCommandCases(newCommandCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES,
					newCommandCases, newCommandCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlDistributorsType getControlDistributors() {
		return controlDistributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlDistributors(ControlDistributorsType newControlDistributors,
			NotificationChain msgs) {
		ControlDistributorsType oldControlDistributors = controlDistributors;
		controlDistributors = newControlDistributors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS, oldControlDistributors, newControlDistributors);
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
	public void setControlDistributors(ControlDistributorsType newControlDistributors) {
		if (newControlDistributors != controlDistributors) {
			NotificationChain msgs = null;
			if (controlDistributors != null)
				msgs = ((InternalEObject) controlDistributors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS, null, msgs);
			if (newControlDistributors != null)
				msgs = ((InternalEObject) newControlDistributors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS, null, msgs);
			msgs = basicSetControlDistributors(newControlDistributors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS,
					newControlDistributors, newControlDistributors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlLawsType getControlLaws() {
		return controlLaws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlLaws(ControlLawsType newControlLaws, NotificationChain msgs) {
		ControlLawsType oldControlLaws = controlLaws;
		controlLaws = newControlLaws;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS, oldControlLaws, newControlLaws);
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
	public void setControlLaws(ControlLawsType newControlLaws) {
		if (newControlLaws != controlLaws) {
			NotificationChain msgs = null;
			if (controlLaws != null)
				msgs = ((InternalEObject) controlLaws).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS, null, msgs);
			if (newControlLaws != null)
				msgs = ((InternalEObject) newControlLaws).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS, null, msgs);
			msgs = basicSetControlLaws(newControlLaws, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS,
					newControlLaws, newControlLaws));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS:
			return basicSetGenericSystems(null, msgs);
		case CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS:
			return basicSetCockpitControls(null, msgs);
		case CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES:
			return basicSetCommandCases(null, msgs);
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS:
			return basicSetControlDistributors(null, msgs);
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS:
			return basicSetControlLaws(null, msgs);
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
		case CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS:
			return getGenericSystems();
		case CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS:
			return getCockpitControls();
		case CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES:
			return getCommandCases();
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS:
			return getControlDistributors();
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS:
			return getControlLaws();
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
		case CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS:
			setGenericSystems((GenericSystemsType) newValue);
			return;
		case CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS:
			setCockpitControls((CockpitControlsType) newValue);
			return;
		case CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES:
			setCommandCases((CommandCasesType) newValue);
			return;
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS:
			setControlDistributors((ControlDistributorsType) newValue);
			return;
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS:
			setControlLaws((ControlLawsType) newValue);
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
		case CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS:
			setGenericSystems((GenericSystemsType) null);
			return;
		case CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS:
			setCockpitControls((CockpitControlsType) null);
			return;
		case CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES:
			setCommandCases((CommandCasesType) null);
			return;
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS:
			setControlDistributors((ControlDistributorsType) null);
			return;
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS:
			setControlLaws((ControlLawsType) null);
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
		case CpacsPackage.SYSTEMS_TYPE__GENERIC_SYSTEMS:
			return genericSystems != null;
		case CpacsPackage.SYSTEMS_TYPE__COCKPIT_CONTROLS:
			return cockpitControls != null;
		case CpacsPackage.SYSTEMS_TYPE__COMMAND_CASES:
			return commandCases != null;
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_DISTRIBUTORS:
			return controlDistributors != null;
		case CpacsPackage.SYSTEMS_TYPE__CONTROL_LAWS:
			return controlLaws != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemsTypeImpl
