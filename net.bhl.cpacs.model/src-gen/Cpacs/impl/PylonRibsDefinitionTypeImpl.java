/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PylonRibsDefinitionType;
import Cpacs.PylonRibsPositioningType;
import Cpacs.StringBaseType;
import Cpacs.WingRibCrossSectionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Ribs Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonRibsDefinitionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsDefinitionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsDefinitionTypeImpl#getRibCrossSection <em>Rib Cross Section</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsDefinitionTypeImpl#getRibsPositioning <em>Ribs Positioning</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsDefinitionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonRibsDefinitionTypeImpl extends ComplexBaseTypeImpl implements PylonRibsDefinitionType {
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
	 * The cached value of the '{@link #getRibCrossSection() <em>Rib Cross Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibCrossSection()
	 * @generated
	 * @ordered
	 */
	protected WingRibCrossSectionType ribCrossSection;

	/**
	 * The cached value of the '{@link #getRibsPositioning() <em>Ribs Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibsPositioning()
	 * @generated
	 * @ordered
	 */
	protected PylonRibsPositioningType ribsPositioning;

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
	protected PylonRibsDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonRibsDefinitionType();
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
					CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME,
					newName, newName));
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
					CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibCrossSectionType getRibCrossSection() {
		return ribCrossSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibCrossSection(WingRibCrossSectionType newRibCrossSection,
			NotificationChain msgs) {
		WingRibCrossSectionType oldRibCrossSection = ribCrossSection;
		ribCrossSection = newRibCrossSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION, oldRibCrossSection, newRibCrossSection);
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
	public void setRibCrossSection(WingRibCrossSectionType newRibCrossSection) {
		if (newRibCrossSection != ribCrossSection) {
			NotificationChain msgs = null;
			if (ribCrossSection != null)
				msgs = ((InternalEObject) ribCrossSection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION, null,
						msgs);
			if (newRibCrossSection != null)
				msgs = ((InternalEObject) newRibCrossSection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION, null,
						msgs);
			msgs = basicSetRibCrossSection(newRibCrossSection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION, newRibCrossSection,
					newRibCrossSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonRibsPositioningType getRibsPositioning() {
		return ribsPositioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibsPositioning(PylonRibsPositioningType newRibsPositioning,
			NotificationChain msgs) {
		PylonRibsPositioningType oldRibsPositioning = ribsPositioning;
		ribsPositioning = newRibsPositioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING, oldRibsPositioning, newRibsPositioning);
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
	public void setRibsPositioning(PylonRibsPositioningType newRibsPositioning) {
		if (newRibsPositioning != ribsPositioning) {
			NotificationChain msgs = null;
			if (ribsPositioning != null)
				msgs = ((InternalEObject) ribsPositioning).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING, null, msgs);
			if (newRibsPositioning != null)
				msgs = ((InternalEObject) newRibsPositioning).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING, null, msgs);
			msgs = basicSetRibsPositioning(newRibsPositioning, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING, newRibsPositioning, newRibsPositioning));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__UID, oldUID,
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
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			return basicSetRibCrossSection(null, msgs);
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			return basicSetRibsPositioning(null, msgs);
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
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME:
			return getName();
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			return getRibCrossSection();
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			return getRibsPositioning();
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__UID:
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
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			setRibCrossSection((WingRibCrossSectionType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			setRibsPositioning((PylonRibsPositioningType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__UID:
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
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			setRibCrossSection((WingRibCrossSectionType) null);
			return;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			setRibsPositioning((PylonRibsPositioningType) null);
			return;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__UID:
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
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__NAME:
			return name != null;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			return ribCrossSection != null;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			return ribsPositioning != null;
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE__UID:
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

} //PylonRibsDefinitionTypeImpl
