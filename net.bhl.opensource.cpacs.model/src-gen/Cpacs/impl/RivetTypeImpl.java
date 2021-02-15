/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RivetType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rivet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RivetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.RivetTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.RivetTypeImpl#getTensileStrength <em>Tensile Strength</em>}</li>
 *   <li>{@link Cpacs.impl.RivetTypeImpl#getShearStrength <em>Shear Strength</em>}</li>
 *   <li>{@link Cpacs.impl.RivetTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RivetTypeImpl extends ComplexBaseTypeImpl implements RivetType {
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
	 * The cached value of the '{@link #getTensileStrength() <em>Tensile Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensileStrength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType tensileStrength;

	/**
	 * The cached value of the '{@link #getShearStrength() <em>Shear Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearStrength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType shearStrength;

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
	protected RivetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRivetType();
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
					CpacsPackage.RIVET_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RIVET_TYPE__NAME, newName, newName));
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
					CpacsPackage.RIVET_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RIVET_TYPE__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTensileStrength() {
		return tensileStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTensileStrength(DoubleBaseType newTensileStrength, NotificationChain msgs) {
		DoubleBaseType oldTensileStrength = tensileStrength;
		tensileStrength = newTensileStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH, oldTensileStrength, newTensileStrength);
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
	public void setTensileStrength(DoubleBaseType newTensileStrength) {
		if (newTensileStrength != tensileStrength) {
			NotificationChain msgs = null;
			if (tensileStrength != null)
				msgs = ((InternalEObject) tensileStrength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH, null, msgs);
			if (newTensileStrength != null)
				msgs = ((InternalEObject) newTensileStrength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH, null, msgs);
			msgs = basicSetTensileStrength(newTensileStrength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH,
					newTensileStrength, newTensileStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getShearStrength() {
		return shearStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShearStrength(DoubleBaseType newShearStrength, NotificationChain msgs) {
		DoubleBaseType oldShearStrength = shearStrength;
		shearStrength = newShearStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH, oldShearStrength, newShearStrength);
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
	public void setShearStrength(DoubleBaseType newShearStrength) {
		if (newShearStrength != shearStrength) {
			NotificationChain msgs = null;
			if (shearStrength != null)
				msgs = ((InternalEObject) shearStrength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH, null, msgs);
			if (newShearStrength != null)
				msgs = ((InternalEObject) newShearStrength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH, null, msgs);
			msgs = basicSetShearStrength(newShearStrength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH,
					newShearStrength, newShearStrength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RIVET_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RIVET_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.RIVET_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH:
			return basicSetTensileStrength(null, msgs);
		case CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH:
			return basicSetShearStrength(null, msgs);
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
		case CpacsPackage.RIVET_TYPE__NAME:
			return getName();
		case CpacsPackage.RIVET_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH:
			return getTensileStrength();
		case CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH:
			return getShearStrength();
		case CpacsPackage.RIVET_TYPE__UID:
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
		case CpacsPackage.RIVET_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.RIVET_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH:
			setTensileStrength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH:
			setShearStrength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RIVET_TYPE__UID:
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
		case CpacsPackage.RIVET_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.RIVET_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH:
			setTensileStrength((DoubleBaseType) null);
			return;
		case CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH:
			setShearStrength((DoubleBaseType) null);
			return;
		case CpacsPackage.RIVET_TYPE__UID:
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
		case CpacsPackage.RIVET_TYPE__NAME:
			return name != null;
		case CpacsPackage.RIVET_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.RIVET_TYPE__TENSILE_STRENGTH:
			return tensileStrength != null;
		case CpacsPackage.RIVET_TYPE__SHEAR_STRENGTH:
			return shearStrength != null;
		case CpacsPackage.RIVET_TYPE__UID:
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

} //RivetTypeImpl
