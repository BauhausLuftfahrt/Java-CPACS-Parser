/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadEnvelopeType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.UIDSequenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadEnvelopeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.LoadEnvelopeTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.LoadEnvelopeTypeImpl#getPointSetUID <em>Point Set UID</em>}</li>
 *   <li>{@link Cpacs.impl.LoadEnvelopeTypeImpl#getLoadCaseUIDs <em>Load Case UI Ds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadEnvelopeTypeImpl extends ComplexBaseTypeImpl implements LoadEnvelopeType {
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
	 * The cached value of the '{@link #getPointSetUID() <em>Point Set UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSetUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType pointSetUID;

	/**
	 * The cached value of the '{@link #getLoadCaseUIDs() <em>Load Case UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadCaseUIDs()
	 * @generated
	 * @ordered
	 */
	protected UIDSequenceType loadCaseUIDs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadEnvelopeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadEnvelopeType();
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
					CpacsPackage.LOAD_ENVELOPE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ENVELOPE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ENVELOPE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_ENVELOPE_TYPE__NAME, newName,
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
					CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPointSetUID() {
		return pointSetUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointSetUID(StringUIDBaseType newPointSetUID, NotificationChain msgs) {
		StringUIDBaseType oldPointSetUID = pointSetUID;
		pointSetUID = newPointSetUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID, oldPointSetUID, newPointSetUID);
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
	public void setPointSetUID(StringUIDBaseType newPointSetUID) {
		if (newPointSetUID != pointSetUID) {
			NotificationChain msgs = null;
			if (pointSetUID != null)
				msgs = ((InternalEObject) pointSetUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID, null, msgs);
			if (newPointSetUID != null)
				msgs = ((InternalEObject) newPointSetUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID, null, msgs);
			msgs = basicSetPointSetUID(newPointSetUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID,
					newPointSetUID, newPointSetUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDSequenceType getLoadCaseUIDs() {
		return loadCaseUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadCaseUIDs(UIDSequenceType newLoadCaseUIDs, NotificationChain msgs) {
		UIDSequenceType oldLoadCaseUIDs = loadCaseUIDs;
		loadCaseUIDs = newLoadCaseUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS, oldLoadCaseUIDs, newLoadCaseUIDs);
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
	public void setLoadCaseUIDs(UIDSequenceType newLoadCaseUIDs) {
		if (newLoadCaseUIDs != loadCaseUIDs) {
			NotificationChain msgs = null;
			if (loadCaseUIDs != null)
				msgs = ((InternalEObject) loadCaseUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS, null, msgs);
			if (newLoadCaseUIDs != null)
				msgs = ((InternalEObject) newLoadCaseUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS, null, msgs);
			msgs = basicSetLoadCaseUIDs(newLoadCaseUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS,
					newLoadCaseUIDs, newLoadCaseUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_ENVELOPE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID:
			return basicSetPointSetUID(null, msgs);
		case CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS:
			return basicSetLoadCaseUIDs(null, msgs);
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
		case CpacsPackage.LOAD_ENVELOPE_TYPE__NAME:
			return getName();
		case CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID:
			return getPointSetUID();
		case CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS:
			return getLoadCaseUIDs();
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
		case CpacsPackage.LOAD_ENVELOPE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID:
			setPointSetUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS:
			setLoadCaseUIDs((UIDSequenceType) newValue);
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
		case CpacsPackage.LOAD_ENVELOPE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID:
			setPointSetUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS:
			setLoadCaseUIDs((UIDSequenceType) null);
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
		case CpacsPackage.LOAD_ENVELOPE_TYPE__NAME:
			return name != null;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__POINT_SET_UID:
			return pointSetUID != null;
		case CpacsPackage.LOAD_ENVELOPE_TYPE__LOAD_CASE_UI_DS:
			return loadCaseUIDs != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadEnvelopeTypeImpl
