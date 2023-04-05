/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseCoefficientsType;
import Cpacs.CpacsPackage;
import Cpacs.RemainingContributionType;
import Cpacs.StringBaseType;
import Cpacs.TypeType4;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remaining Contribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RemainingContributionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.RemainingContributionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.RemainingContributionTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.impl.RemainingContributionTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.RemainingContributionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemainingContributionTypeImpl extends ComplexBaseTypeImpl implements RemainingContributionType {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType4 type;

	/**
	 * The cached value of the '{@link #getCoefficients() <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficients()
	 * @generated
	 * @ordered
	 */
	protected AeroCaseCoefficientsType coefficients;

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
	protected RemainingContributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRemainingContributionType();
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
					CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME,
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
					CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType4 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeType4 newType, NotificationChain msgs) {
		TypeType4 oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE, oldType, newType);
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
	public void setType(TypeType4 newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE,
					newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroCaseCoefficientsType getCoefficients() {
		return coefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoefficients(AeroCaseCoefficientsType newCoefficients, NotificationChain msgs) {
		AeroCaseCoefficientsType oldCoefficients = coefficients;
		coefficients = newCoefficients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
	public void setCoefficients(AeroCaseCoefficientsType newCoefficients) {
		if (newCoefficients != coefficients) {
			NotificationChain msgs = null;
			if (coefficients != null)
				msgs = ((InternalEObject) coefficients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS, null, msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS, null, msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS, newCoefficients, newCoefficients));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.REMAINING_CONTRIBUTION_TYPE__UID, oldUID,
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
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE:
			return basicSetType(null, msgs);
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
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
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME:
			return getName();
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE:
			return getType();
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS:
			return getCoefficients();
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__UID:
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
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE:
			setType((TypeType4) newValue);
			return;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) newValue);
			return;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__UID:
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
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE:
			setType((TypeType4) null);
			return;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) null);
			return;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__UID:
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
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__NAME:
			return name != null;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__TYPE:
			return type != null;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__COEFFICIENTS:
			return coefficients != null;
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE__UID:
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

} //RemainingContributionTypeImpl
