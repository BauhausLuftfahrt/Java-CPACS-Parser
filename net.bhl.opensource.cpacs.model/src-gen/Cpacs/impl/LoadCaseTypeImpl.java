/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightLoadDataType;
import Cpacs.LoadCaseSpecificationType;
import Cpacs.LoadCaseType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTypeImpl#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseTypeImpl extends ComplexBaseTypeImpl implements LoadCaseType {
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
	protected LoadCaseSpecificationType specification;

	/**
	 * The cached value of the '{@link #getLoadData() <em>Load Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadData()
	 * @generated
	 * @ordered
	 */
	protected FlightLoadDataType loadData;

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
	protected LoadCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseType();
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
					CpacsPackage.LOAD_CASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TYPE__NAME, newName, newName));
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
					CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseSpecificationType getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(LoadCaseSpecificationType newSpecification, NotificationChain msgs) {
		LoadCaseSpecificationType oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
	public void setSpecification(LoadCaseSpecificationType newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION,
					newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightLoadDataType getLoadData() {
		return loadData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadData(FlightLoadDataType newLoadData, NotificationChain msgs) {
		FlightLoadDataType oldLoadData = loadData;
		loadData = newLoadData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA, oldLoadData, newLoadData);
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
	public void setLoadData(FlightLoadDataType newLoadData) {
		if (newLoadData != loadData) {
			NotificationChain msgs = null;
			if (loadData != null)
				msgs = ((InternalEObject) loadData).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA, null, msgs);
			if (newLoadData != null)
				msgs = ((InternalEObject) newLoadData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA, null, msgs);
			msgs = basicSetLoadData(newLoadData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA, newLoadData,
					newLoadData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION:
			return basicSetSpecification(null, msgs);
		case CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA:
			return basicSetLoadData(null, msgs);
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
		case CpacsPackage.LOAD_CASE_TYPE__NAME:
			return getName();
		case CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION:
			return getSpecification();
		case CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA:
			return getLoadData();
		case CpacsPackage.LOAD_CASE_TYPE__UID:
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
		case CpacsPackage.LOAD_CASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION:
			setSpecification((LoadCaseSpecificationType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA:
			setLoadData((FlightLoadDataType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TYPE__UID:
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
		case CpacsPackage.LOAD_CASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION:
			setSpecification((LoadCaseSpecificationType) null);
			return;
		case CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA:
			setLoadData((FlightLoadDataType) null);
			return;
		case CpacsPackage.LOAD_CASE_TYPE__UID:
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
		case CpacsPackage.LOAD_CASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.LOAD_CASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.LOAD_CASE_TYPE__SPECIFICATION:
			return specification != null;
		case CpacsPackage.LOAD_CASE_TYPE__LOAD_DATA:
			return loadData != null;
		case CpacsPackage.LOAD_CASE_TYPE__UID:
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

} //LoadCaseTypeImpl
