/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.TransformationType;
import Cpacs.TransmissionShaftInputsType;
import Cpacs.TransmissionShaftOutputsType;
import Cpacs.TransmissionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TransmissionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionTypeImpl#getShaftInputs <em>Shaft Inputs</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionTypeImpl#getShaftOutputs <em>Shaft Outputs</em>}</li>
 *   <li>{@link Cpacs.impl.TransmissionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionTypeImpl extends ComplexBaseTypeImpl implements TransmissionType {
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
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected TransformationType transformation;

	/**
	 * The cached value of the '{@link #getShaftInputs() <em>Shaft Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaftInputs()
	 * @generated
	 * @ordered
	 */
	protected TransmissionShaftInputsType shaftInputs;

	/**
	 * The cached value of the '{@link #getShaftOutputs() <em>Shaft Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaftOutputs()
	 * @generated
	 * @ordered
	 */
	protected TransmissionShaftOutputsType shaftOutputs;

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
	protected TransmissionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTransmissionType();
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
					CpacsPackage.TRANSMISSION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_TYPE__NAME, newName,
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
					CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(TransformationType newTransformation, NotificationChain msgs) {
		TransformationType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
	public void setTransformation(TransformationType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION,
					newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionShaftInputsType getShaftInputs() {
		return shaftInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShaftInputs(TransmissionShaftInputsType newShaftInputs, NotificationChain msgs) {
		TransmissionShaftInputsType oldShaftInputs = shaftInputs;
		shaftInputs = newShaftInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS, oldShaftInputs, newShaftInputs);
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
	public void setShaftInputs(TransmissionShaftInputsType newShaftInputs) {
		if (newShaftInputs != shaftInputs) {
			NotificationChain msgs = null;
			if (shaftInputs != null)
				msgs = ((InternalEObject) shaftInputs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS, null, msgs);
			if (newShaftInputs != null)
				msgs = ((InternalEObject) newShaftInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS, null, msgs);
			msgs = basicSetShaftInputs(newShaftInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS,
					newShaftInputs, newShaftInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionShaftOutputsType getShaftOutputs() {
		return shaftOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShaftOutputs(TransmissionShaftOutputsType newShaftOutputs,
			NotificationChain msgs) {
		TransmissionShaftOutputsType oldShaftOutputs = shaftOutputs;
		shaftOutputs = newShaftOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS, oldShaftOutputs, newShaftOutputs);
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
	public void setShaftOutputs(TransmissionShaftOutputsType newShaftOutputs) {
		if (newShaftOutputs != shaftOutputs) {
			NotificationChain msgs = null;
			if (shaftOutputs != null)
				msgs = ((InternalEObject) shaftOutputs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS, null, msgs);
			if (newShaftOutputs != null)
				msgs = ((InternalEObject) newShaftOutputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS, null, msgs);
			msgs = basicSetShaftOutputs(newShaftOutputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS,
					newShaftOutputs, newShaftOutputs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSMISSION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRANSMISSION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS:
			return basicSetShaftInputs(null, msgs);
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS:
			return basicSetShaftOutputs(null, msgs);
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
		case CpacsPackage.TRANSMISSION_TYPE__NAME:
			return getName();
		case CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS:
			return getShaftInputs();
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS:
			return getShaftOutputs();
		case CpacsPackage.TRANSMISSION_TYPE__UID:
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
		case CpacsPackage.TRANSMISSION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS:
			setShaftInputs((TransmissionShaftInputsType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS:
			setShaftOutputs((TransmissionShaftOutputsType) newValue);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__UID:
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
		case CpacsPackage.TRANSMISSION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS:
			setShaftInputs((TransmissionShaftInputsType) null);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS:
			setShaftOutputs((TransmissionShaftOutputsType) null);
			return;
		case CpacsPackage.TRANSMISSION_TYPE__UID:
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
		case CpacsPackage.TRANSMISSION_TYPE__NAME:
			return name != null;
		case CpacsPackage.TRANSMISSION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.TRANSMISSION_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_INPUTS:
			return shaftInputs != null;
		case CpacsPackage.TRANSMISSION_TYPE__SHAFT_OUTPUTS:
			return shaftOutputs != null;
		case CpacsPackage.TRANSMISSION_TYPE__UID:
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

} //TransmissionTypeImpl
