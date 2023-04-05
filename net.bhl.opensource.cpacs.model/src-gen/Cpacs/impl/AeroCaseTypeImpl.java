/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseAeroDataType;
import Cpacs.AeroCaseSpecificationType;
import Cpacs.AeroCaseType;
import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroCaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseTypeImpl#getAeroData <em>Aero Data</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroCaseTypeImpl extends ComplexBaseTypeImpl implements AeroCaseType {
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
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected AeroCaseSpecificationType specification;

	/**
	 * The cached value of the '{@link #getAeroData() <em>Aero Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroData()
	 * @generated
	 * @ordered
	 */
	protected AeroCaseAeroDataType aeroData;

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
	protected AeroCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroCaseType();
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
					CpacsPackage.AERO_CASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_TYPE__NAME, newName, newName));
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
					CpacsPackage.AERO_CASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroCaseSpecificationType getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(AeroCaseSpecificationType newSpecification, NotificationChain msgs) {
		AeroCaseSpecificationType oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
	public void setSpecification(AeroCaseSpecificationType newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_TYPE__SPECIFICATION,
					newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroCaseAeroDataType getAeroData() {
		return aeroData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroData(AeroCaseAeroDataType newAeroData, NotificationChain msgs) {
		AeroCaseAeroDataType oldAeroData = aeroData;
		aeroData = newAeroData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_TYPE__AERO_DATA, oldAeroData, newAeroData);
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
	public void setAeroData(AeroCaseAeroDataType newAeroData) {
		if (newAeroData != aeroData) {
			NotificationChain msgs = null;
			if (aeroData != null)
				msgs = ((InternalEObject) aeroData).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_TYPE__AERO_DATA, null, msgs);
			if (newAeroData != null)
				msgs = ((InternalEObject) newAeroData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_TYPE__AERO_DATA, null, msgs);
			msgs = basicSetAeroData(newAeroData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_TYPE__AERO_DATA, newAeroData,
					newAeroData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_CASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.AERO_CASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.AERO_CASE_TYPE__SPECIFICATION:
			return basicSetSpecification(null, msgs);
		case CpacsPackage.AERO_CASE_TYPE__AERO_DATA:
			return basicSetAeroData(null, msgs);
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
		case CpacsPackage.AERO_CASE_TYPE__NAME:
			return getName();
		case CpacsPackage.AERO_CASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.AERO_CASE_TYPE__SPECIFICATION:
			return getSpecification();
		case CpacsPackage.AERO_CASE_TYPE__AERO_DATA:
			return getAeroData();
		case CpacsPackage.AERO_CASE_TYPE__UID:
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
		case CpacsPackage.AERO_CASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_TYPE__SPECIFICATION:
			setSpecification((AeroCaseSpecificationType) newValue);
			return;
		case CpacsPackage.AERO_CASE_TYPE__AERO_DATA:
			setAeroData((AeroCaseAeroDataType) newValue);
			return;
		case CpacsPackage.AERO_CASE_TYPE__UID:
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
		case CpacsPackage.AERO_CASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_TYPE__SPECIFICATION:
			setSpecification((AeroCaseSpecificationType) null);
			return;
		case CpacsPackage.AERO_CASE_TYPE__AERO_DATA:
			setAeroData((AeroCaseAeroDataType) null);
			return;
		case CpacsPackage.AERO_CASE_TYPE__UID:
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
		case CpacsPackage.AERO_CASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.AERO_CASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.AERO_CASE_TYPE__SPECIFICATION:
			return specification != null;
		case CpacsPackage.AERO_CASE_TYPE__AERO_DATA:
			return aeroData != null;
		case CpacsPackage.AERO_CASE_TYPE__UID:
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

} //AeroCaseTypeImpl
