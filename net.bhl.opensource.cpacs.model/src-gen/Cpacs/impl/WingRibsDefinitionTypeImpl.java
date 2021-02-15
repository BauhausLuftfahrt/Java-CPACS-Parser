/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.WingRibCrossSectionType;
import Cpacs.WingRibExplicitPositioningType;
import Cpacs.WingRibsDefinitionType;
import Cpacs.WingRibsPositioningType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Ribs Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingRibsDefinitionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsDefinitionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsDefinitionTypeImpl#getRibsPositioning <em>Ribs Positioning</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsDefinitionTypeImpl#getRibExplicitPositioning <em>Rib Explicit Positioning</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsDefinitionTypeImpl#getRibCrossSection <em>Rib Cross Section</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsDefinitionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingRibsDefinitionTypeImpl extends ComplexBaseTypeImpl implements WingRibsDefinitionType {
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
	 * The cached value of the '{@link #getRibsPositioning() <em>Ribs Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibsPositioning()
	 * @generated
	 * @ordered
	 */
	protected WingRibsPositioningType ribsPositioning;

	/**
	 * The cached value of the '{@link #getRibExplicitPositioning() <em>Rib Explicit Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibExplicitPositioning()
	 * @generated
	 * @ordered
	 */
	protected WingRibExplicitPositioningType ribExplicitPositioning;

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
	protected WingRibsDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingRibsDefinitionType();
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
					CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME, newName,
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
					CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibsPositioningType getRibsPositioning() {
		return ribsPositioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibsPositioning(WingRibsPositioningType newRibsPositioning,
			NotificationChain msgs) {
		WingRibsPositioningType oldRibsPositioning = ribsPositioning;
		ribsPositioning = newRibsPositioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING, oldRibsPositioning, newRibsPositioning);
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
	public void setRibsPositioning(WingRibsPositioningType newRibsPositioning) {
		if (newRibsPositioning != ribsPositioning) {
			NotificationChain msgs = null;
			if (ribsPositioning != null)
				msgs = ((InternalEObject) ribsPositioning).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING, null, msgs);
			if (newRibsPositioning != null)
				msgs = ((InternalEObject) newRibsPositioning).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING, null, msgs);
			msgs = basicSetRibsPositioning(newRibsPositioning, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING, newRibsPositioning, newRibsPositioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibExplicitPositioningType getRibExplicitPositioning() {
		return ribExplicitPositioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibExplicitPositioning(WingRibExplicitPositioningType newRibExplicitPositioning,
			NotificationChain msgs) {
		WingRibExplicitPositioningType oldRibExplicitPositioning = ribExplicitPositioning;
		ribExplicitPositioning = newRibExplicitPositioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING, oldRibExplicitPositioning,
					newRibExplicitPositioning);
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
	public void setRibExplicitPositioning(WingRibExplicitPositioningType newRibExplicitPositioning) {
		if (newRibExplicitPositioning != ribExplicitPositioning) {
			NotificationChain msgs = null;
			if (ribExplicitPositioning != null)
				msgs = ((InternalEObject) ribExplicitPositioning).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING, null,
						msgs);
			if (newRibExplicitPositioning != null)
				msgs = ((InternalEObject) newRibExplicitPositioning).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING, null,
						msgs);
			msgs = basicSetRibExplicitPositioning(newRibExplicitPositioning, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING, newRibExplicitPositioning,
					newRibExplicitPositioning));
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
					CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION, oldRibCrossSection, newRibCrossSection);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION, null, msgs);
			if (newRibCrossSection != null)
				msgs = ((InternalEObject) newRibCrossSection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION, null, msgs);
			msgs = basicSetRibCrossSection(newRibCrossSection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION, newRibCrossSection, newRibCrossSection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIBS_DEFINITION_TYPE__UID, oldUID,
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
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			return basicSetRibsPositioning(null, msgs);
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING:
			return basicSetRibExplicitPositioning(null, msgs);
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			return basicSetRibCrossSection(null, msgs);
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
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME:
			return getName();
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			return getRibsPositioning();
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING:
			return getRibExplicitPositioning();
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			return getRibCrossSection();
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__UID:
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
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			setRibsPositioning((WingRibsPositioningType) newValue);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING:
			setRibExplicitPositioning((WingRibExplicitPositioningType) newValue);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			setRibCrossSection((WingRibCrossSectionType) newValue);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__UID:
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
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			setRibsPositioning((WingRibsPositioningType) null);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING:
			setRibExplicitPositioning((WingRibExplicitPositioningType) null);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			setRibCrossSection((WingRibCrossSectionType) null);
			return;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__UID:
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
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__NAME:
			return name != null;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIBS_POSITIONING:
			return ribsPositioning != null;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_EXPLICIT_POSITIONING:
			return ribExplicitPositioning != null;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__RIB_CROSS_SECTION:
			return ribCrossSection != null;
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE__UID:
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

} //WingRibsDefinitionTypeImpl
