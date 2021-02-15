/**
 */
package Cpacs.impl;

import Cpacs.BooleanBaseType;
import Cpacs.CpacsPackage;
import Cpacs.InterfaceDefinitionsType;
import Cpacs.RivetJointAreasAssemblyType;
import Cpacs.TiedInterfacesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.InterfaceDefinitionsTypeImpl#getAutomaticInterfaceGeneration <em>Automatic Interface Generation</em>}</li>
 *   <li>{@link Cpacs.impl.InterfaceDefinitionsTypeImpl#getRivetJointAreas <em>Rivet Joint Areas</em>}</li>
 *   <li>{@link Cpacs.impl.InterfaceDefinitionsTypeImpl#getTiedInterfaces <em>Tied Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDefinitionsTypeImpl extends ComplexBaseTypeImpl implements InterfaceDefinitionsType {
	/**
	 * The cached value of the '{@link #getAutomaticInterfaceGeneration() <em>Automatic Interface Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticInterfaceGeneration()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType automaticInterfaceGeneration;

	/**
	 * The cached value of the '{@link #getRivetJointAreas() <em>Rivet Joint Areas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRivetJointAreas()
	 * @generated
	 * @ordered
	 */
	protected RivetJointAreasAssemblyType rivetJointAreas;

	/**
	 * The cached value of the '{@link #getTiedInterfaces() <em>Tied Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected TiedInterfacesType tiedInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getInterfaceDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getAutomaticInterfaceGeneration() {
		return automaticInterfaceGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomaticInterfaceGeneration(BooleanBaseType newAutomaticInterfaceGeneration,
			NotificationChain msgs) {
		BooleanBaseType oldAutomaticInterfaceGeneration = automaticInterfaceGeneration;
		automaticInterfaceGeneration = newAutomaticInterfaceGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION,
					oldAutomaticInterfaceGeneration, newAutomaticInterfaceGeneration);
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
	public void setAutomaticInterfaceGeneration(BooleanBaseType newAutomaticInterfaceGeneration) {
		if (newAutomaticInterfaceGeneration != automaticInterfaceGeneration) {
			NotificationChain msgs = null;
			if (automaticInterfaceGeneration != null)
				msgs = ((InternalEObject) automaticInterfaceGeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION, null, msgs);
			if (newAutomaticInterfaceGeneration != null)
				msgs = ((InternalEObject) newAutomaticInterfaceGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION, null, msgs);
			msgs = basicSetAutomaticInterfaceGeneration(newAutomaticInterfaceGeneration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION,
					newAutomaticInterfaceGeneration, newAutomaticInterfaceGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RivetJointAreasAssemblyType getRivetJointAreas() {
		return rivetJointAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRivetJointAreas(RivetJointAreasAssemblyType newRivetJointAreas,
			NotificationChain msgs) {
		RivetJointAreasAssemblyType oldRivetJointAreas = rivetJointAreas;
		rivetJointAreas = newRivetJointAreas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS, oldRivetJointAreas, newRivetJointAreas);
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
	public void setRivetJointAreas(RivetJointAreasAssemblyType newRivetJointAreas) {
		if (newRivetJointAreas != rivetJointAreas) {
			NotificationChain msgs = null;
			if (rivetJointAreas != null)
				msgs = ((InternalEObject) rivetJointAreas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS, null,
						msgs);
			if (newRivetJointAreas != null)
				msgs = ((InternalEObject) newRivetJointAreas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS, null,
						msgs);
			msgs = basicSetRivetJointAreas(newRivetJointAreas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS, newRivetJointAreas,
					newRivetJointAreas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TiedInterfacesType getTiedInterfaces() {
		return tiedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiedInterfaces(TiedInterfacesType newTiedInterfaces, NotificationChain msgs) {
		TiedInterfacesType oldTiedInterfaces = tiedInterfaces;
		tiedInterfaces = newTiedInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES, oldTiedInterfaces, newTiedInterfaces);
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
	public void setTiedInterfaces(TiedInterfacesType newTiedInterfaces) {
		if (newTiedInterfaces != tiedInterfaces) {
			NotificationChain msgs = null;
			if (tiedInterfaces != null)
				msgs = ((InternalEObject) tiedInterfaces).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES, null, msgs);
			if (newTiedInterfaces != null)
				msgs = ((InternalEObject) newTiedInterfaces).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES, null, msgs);
			msgs = basicSetTiedInterfaces(newTiedInterfaces, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES, newTiedInterfaces, newTiedInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION:
			return basicSetAutomaticInterfaceGeneration(null, msgs);
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS:
			return basicSetRivetJointAreas(null, msgs);
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES:
			return basicSetTiedInterfaces(null, msgs);
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
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION:
			return getAutomaticInterfaceGeneration();
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS:
			return getRivetJointAreas();
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES:
			return getTiedInterfaces();
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
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION:
			setAutomaticInterfaceGeneration((BooleanBaseType) newValue);
			return;
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS:
			setRivetJointAreas((RivetJointAreasAssemblyType) newValue);
			return;
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES:
			setTiedInterfaces((TiedInterfacesType) newValue);
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
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION:
			setAutomaticInterfaceGeneration((BooleanBaseType) null);
			return;
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS:
			setRivetJointAreas((RivetJointAreasAssemblyType) null);
			return;
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES:
			setTiedInterfaces((TiedInterfacesType) null);
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
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__AUTOMATIC_INTERFACE_GENERATION:
			return automaticInterfaceGeneration != null;
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__RIVET_JOINT_AREAS:
			return rivetJointAreas != null;
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE__TIED_INTERFACES:
			return tiedInterfaces != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceDefinitionsTypeImpl
