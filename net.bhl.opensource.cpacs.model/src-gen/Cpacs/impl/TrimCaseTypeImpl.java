/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightDynamicsLinearModelType;
import Cpacs.FlightDynamicsTrimResultType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TrimCaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trim Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrimCaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.TrimCaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.TrimCaseTypeImpl#getTrimReqUID <em>Trim Req UID</em>}</li>
 *   <li>{@link Cpacs.impl.TrimCaseTypeImpl#getTrimResult <em>Trim Result</em>}</li>
 *   <li>{@link Cpacs.impl.TrimCaseTypeImpl#getLinearModel <em>Linear Model</em>}</li>
 *   <li>{@link Cpacs.impl.TrimCaseTypeImpl#getLinearModelDescription <em>Linear Model Description</em>}</li>
 *   <li>{@link Cpacs.impl.TrimCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrimCaseTypeImpl extends ComplexBaseTypeImpl implements TrimCaseType {
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
	 * The cached value of the '{@link #getTrimReqUID() <em>Trim Req UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimReqUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType trimReqUID;

	/**
	 * The cached value of the '{@link #getTrimResult() <em>Trim Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimResult()
	 * @generated
	 * @ordered
	 */
	protected FlightDynamicsTrimResultType trimResult;

	/**
	 * The cached value of the '{@link #getLinearModel() <em>Linear Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearModel()
	 * @generated
	 * @ordered
	 */
	protected FlightDynamicsLinearModelType linearModel;

	/**
	 * The cached value of the '{@link #getLinearModelDescription() <em>Linear Model Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearModelDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType linearModelDescription;

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
	protected TrimCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrimCaseType();
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
					CpacsPackage.TRIM_CASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_CASE_TYPE__NAME, newName, newName));
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
					CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getTrimReqUID() {
		return trimReqUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrimReqUID(StringUIDBaseType newTrimReqUID, NotificationChain msgs) {
		StringUIDBaseType oldTrimReqUID = trimReqUID;
		trimReqUID = newTrimReqUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID, oldTrimReqUID, newTrimReqUID);
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
	public void setTrimReqUID(StringUIDBaseType newTrimReqUID) {
		if (newTrimReqUID != trimReqUID) {
			NotificationChain msgs = null;
			if (trimReqUID != null)
				msgs = ((InternalEObject) trimReqUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID, null, msgs);
			if (newTrimReqUID != null)
				msgs = ((InternalEObject) newTrimReqUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID, null, msgs);
			msgs = basicSetTrimReqUID(newTrimReqUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID,
					newTrimReqUID, newTrimReqUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsTrimResultType getTrimResult() {
		return trimResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrimResult(FlightDynamicsTrimResultType newTrimResult, NotificationChain msgs) {
		FlightDynamicsTrimResultType oldTrimResult = trimResult;
		trimResult = newTrimResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT, oldTrimResult, newTrimResult);
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
	public void setTrimResult(FlightDynamicsTrimResultType newTrimResult) {
		if (newTrimResult != trimResult) {
			NotificationChain msgs = null;
			if (trimResult != null)
				msgs = ((InternalEObject) trimResult).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT, null, msgs);
			if (newTrimResult != null)
				msgs = ((InternalEObject) newTrimResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT, null, msgs);
			msgs = basicSetTrimResult(newTrimResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT,
					newTrimResult, newTrimResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsLinearModelType getLinearModel() {
		return linearModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearModel(FlightDynamicsLinearModelType newLinearModel, NotificationChain msgs) {
		FlightDynamicsLinearModelType oldLinearModel = linearModel;
		linearModel = newLinearModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL, oldLinearModel, newLinearModel);
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
	public void setLinearModel(FlightDynamicsLinearModelType newLinearModel) {
		if (newLinearModel != linearModel) {
			NotificationChain msgs = null;
			if (linearModel != null)
				msgs = ((InternalEObject) linearModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL, null, msgs);
			if (newLinearModel != null)
				msgs = ((InternalEObject) newLinearModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL, null, msgs);
			msgs = basicSetLinearModel(newLinearModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL,
					newLinearModel, newLinearModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getLinearModelDescription() {
		return linearModelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearModelDescription(StringBaseType newLinearModelDescription,
			NotificationChain msgs) {
		StringBaseType oldLinearModelDescription = linearModelDescription;
		linearModelDescription = newLinearModelDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION, oldLinearModelDescription,
					newLinearModelDescription);
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
	public void setLinearModelDescription(StringBaseType newLinearModelDescription) {
		if (newLinearModelDescription != linearModelDescription) {
			NotificationChain msgs = null;
			if (linearModelDescription != null)
				msgs = ((InternalEObject) linearModelDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION, null, msgs);
			if (newLinearModelDescription != null)
				msgs = ((InternalEObject) newLinearModelDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION, null, msgs);
			msgs = basicSetLinearModelDescription(newLinearModelDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION,
					newLinearModelDescription, newLinearModelDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_CASE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRIM_CASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID:
			return basicSetTrimReqUID(null, msgs);
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT:
			return basicSetTrimResult(null, msgs);
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL:
			return basicSetLinearModel(null, msgs);
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION:
			return basicSetLinearModelDescription(null, msgs);
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
		case CpacsPackage.TRIM_CASE_TYPE__NAME:
			return getName();
		case CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID:
			return getTrimReqUID();
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT:
			return getTrimResult();
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL:
			return getLinearModel();
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION:
			return getLinearModelDescription();
		case CpacsPackage.TRIM_CASE_TYPE__UID:
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
		case CpacsPackage.TRIM_CASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID:
			setTrimReqUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT:
			setTrimResult((FlightDynamicsTrimResultType) newValue);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL:
			setLinearModel((FlightDynamicsLinearModelType) newValue);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION:
			setLinearModelDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__UID:
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
		case CpacsPackage.TRIM_CASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID:
			setTrimReqUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT:
			setTrimResult((FlightDynamicsTrimResultType) null);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL:
			setLinearModel((FlightDynamicsLinearModelType) null);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION:
			setLinearModelDescription((StringBaseType) null);
			return;
		case CpacsPackage.TRIM_CASE_TYPE__UID:
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
		case CpacsPackage.TRIM_CASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.TRIM_CASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_REQ_UID:
			return trimReqUID != null;
		case CpacsPackage.TRIM_CASE_TYPE__TRIM_RESULT:
			return trimResult != null;
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL:
			return linearModel != null;
		case CpacsPackage.TRIM_CASE_TYPE__LINEAR_MODEL_DESCRIPTION:
			return linearModelDescription != null;
		case CpacsPackage.TRIM_CASE_TYPE__UID:
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

} //TrimCaseTypeImpl
