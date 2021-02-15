/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SparCrossSectionType;
import Cpacs.SparPositionUIDsType;
import Cpacs.SparSegmentType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spar Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SparSegmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.SparSegmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.SparSegmentTypeImpl#getSparPositionUIDs <em>Spar Position UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.SparSegmentTypeImpl#getSparCrossSection <em>Spar Cross Section</em>}</li>
 *   <li>{@link Cpacs.impl.SparSegmentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparSegmentTypeImpl extends ComplexBaseTypeImpl implements SparSegmentType {
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
	 * The cached value of the '{@link #getSparPositionUIDs() <em>Spar Position UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparPositionUIDs()
	 * @generated
	 * @ordered
	 */
	protected SparPositionUIDsType sparPositionUIDs;

	/**
	 * The cached value of the '{@link #getSparCrossSection() <em>Spar Cross Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparCrossSection()
	 * @generated
	 * @ordered
	 */
	protected SparCrossSectionType sparCrossSection;

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
	protected SparSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSparSegmentType();
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
					CpacsPackage.SPAR_SEGMENT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_SEGMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_SEGMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_SEGMENT_TYPE__NAME, newName,
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
					CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparPositionUIDsType getSparPositionUIDs() {
		return sparPositionUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparPositionUIDs(SparPositionUIDsType newSparPositionUIDs,
			NotificationChain msgs) {
		SparPositionUIDsType oldSparPositionUIDs = sparPositionUIDs;
		sparPositionUIDs = newSparPositionUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS, oldSparPositionUIDs, newSparPositionUIDs);
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
	public void setSparPositionUIDs(SparPositionUIDsType newSparPositionUIDs) {
		if (newSparPositionUIDs != sparPositionUIDs) {
			NotificationChain msgs = null;
			if (sparPositionUIDs != null)
				msgs = ((InternalEObject) sparPositionUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS, null, msgs);
			if (newSparPositionUIDs != null)
				msgs = ((InternalEObject) newSparPositionUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS, null, msgs);
			msgs = basicSetSparPositionUIDs(newSparPositionUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS,
					newSparPositionUIDs, newSparPositionUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparCrossSectionType getSparCrossSection() {
		return sparCrossSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparCrossSection(SparCrossSectionType newSparCrossSection,
			NotificationChain msgs) {
		SparCrossSectionType oldSparCrossSection = sparCrossSection;
		sparCrossSection = newSparCrossSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION, oldSparCrossSection, newSparCrossSection);
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
	public void setSparCrossSection(SparCrossSectionType newSparCrossSection) {
		if (newSparCrossSection != sparCrossSection) {
			NotificationChain msgs = null;
			if (sparCrossSection != null)
				msgs = ((InternalEObject) sparCrossSection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION, null, msgs);
			if (newSparCrossSection != null)
				msgs = ((InternalEObject) newSparCrossSection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION, null, msgs);
			msgs = basicSetSparCrossSection(newSparCrossSection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION,
					newSparCrossSection, newSparCrossSection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_SEGMENT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPAR_SEGMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS:
			return basicSetSparPositionUIDs(null, msgs);
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION:
			return basicSetSparCrossSection(null, msgs);
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
		case CpacsPackage.SPAR_SEGMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS:
			return getSparPositionUIDs();
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION:
			return getSparCrossSection();
		case CpacsPackage.SPAR_SEGMENT_TYPE__UID:
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
		case CpacsPackage.SPAR_SEGMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS:
			setSparPositionUIDs((SparPositionUIDsType) newValue);
			return;
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION:
			setSparCrossSection((SparCrossSectionType) newValue);
			return;
		case CpacsPackage.SPAR_SEGMENT_TYPE__UID:
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
		case CpacsPackage.SPAR_SEGMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS:
			setSparPositionUIDs((SparPositionUIDsType) null);
			return;
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION:
			setSparCrossSection((SparCrossSectionType) null);
			return;
		case CpacsPackage.SPAR_SEGMENT_TYPE__UID:
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
		case CpacsPackage.SPAR_SEGMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.SPAR_SEGMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_POSITION_UI_DS:
			return sparPositionUIDs != null;
		case CpacsPackage.SPAR_SEGMENT_TYPE__SPAR_CROSS_SECTION:
			return sparCrossSection != null;
		case CpacsPackage.SPAR_SEGMENT_TYPE__UID:
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

} //SparSegmentTypeImpl
