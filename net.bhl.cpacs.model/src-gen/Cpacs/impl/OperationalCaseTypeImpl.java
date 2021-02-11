/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MassInertiaVectorType;
import Cpacs.OperationalCaseType;
import Cpacs.PointListXYZVectorType;
import Cpacs.StringBaseType;
import Cpacs.StringVectorBaseType;
import Cpacs.WeightAndBalanceFuelType;
import Cpacs.WeightAndBalancePayloadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.OperationalCaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.OperationalCaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.OperationalCaseTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.OperationalCaseTypeImpl#getCoG <em>Co G</em>}</li>
 *   <li>{@link Cpacs.impl.OperationalCaseTypeImpl#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.impl.OperationalCaseTypeImpl#getMFuel <em>MFuel</em>}</li>
 *   <li>{@link Cpacs.impl.OperationalCaseTypeImpl#getMPayload <em>MPayload</em>}</li>
 *   <li>{@link Cpacs.impl.OperationalCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalCaseTypeImpl extends ComplexBaseTypeImpl implements OperationalCaseType {
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
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mass;

	/**
	 * The cached value of the '{@link #getCoG() <em>Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoG()
	 * @generated
	 * @ordered
	 */
	protected PointListXYZVectorType coG;

	/**
	 * The cached value of the '{@link #getMassInertia() <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassInertia()
	 * @generated
	 * @ordered
	 */
	protected MassInertiaVectorType massInertia;

	/**
	 * The cached value of the '{@link #getMFuel() <em>MFuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFuel()
	 * @generated
	 * @ordered
	 */
	protected WeightAndBalanceFuelType mFuel;

	/**
	 * The cached value of the '{@link #getMPayload() <em>MPayload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPayload()
	 * @generated
	 * @ordered
	 */
	protected WeightAndBalancePayloadType mPayload;

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
	protected OperationalCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getOperationalCaseType();
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
					CpacsPackage.OPERATIONAL_CASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OPERATIONAL_CASE_TYPE__NAME, newName,
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
					CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(StringVectorBaseType newMass, NotificationChain msgs) {
		StringVectorBaseType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATIONAL_CASE_TYPE__MASS, oldMass, newMass);
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
	public void setMass(StringVectorBaseType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OPERATIONAL_CASE_TYPE__MASS, newMass,
					newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYZVectorType getCoG() {
		return coG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoG(PointListXYZVectorType newCoG, NotificationChain msgs) {
		PointListXYZVectorType oldCoG = coG;
		coG = newCoG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G, oldCoG, newCoG);
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
	public void setCoG(PointListXYZVectorType newCoG) {
		if (newCoG != coG) {
			NotificationChain msgs = null;
			if (coG != null)
				msgs = ((InternalEObject) coG).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G, null, msgs);
			if (newCoG != null)
				msgs = ((InternalEObject) newCoG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G, null, msgs);
			msgs = basicSetCoG(newCoG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G, newCoG,
					newCoG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassInertiaVectorType getMassInertia() {
		return massInertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassInertia(MassInertiaVectorType newMassInertia, NotificationChain msgs) {
		MassInertiaVectorType oldMassInertia = massInertia;
		massInertia = newMassInertia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA, oldMassInertia, newMassInertia);
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
	public void setMassInertia(MassInertiaVectorType newMassInertia) {
		if (newMassInertia != massInertia) {
			NotificationChain msgs = null;
			if (massInertia != null)
				msgs = ((InternalEObject) massInertia).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA, null, msgs);
			if (newMassInertia != null)
				msgs = ((InternalEObject) newMassInertia).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA, null, msgs);
			msgs = basicSetMassInertia(newMassInertia, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA,
					newMassInertia, newMassInertia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalanceFuelType getMFuel() {
		return mFuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFuel(WeightAndBalanceFuelType newMFuel, NotificationChain msgs) {
		WeightAndBalanceFuelType oldMFuel = mFuel;
		mFuel = newMFuel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL, oldMFuel, newMFuel);
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
	public void setMFuel(WeightAndBalanceFuelType newMFuel) {
		if (newMFuel != mFuel) {
			NotificationChain msgs = null;
			if (mFuel != null)
				msgs = ((InternalEObject) mFuel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL, null, msgs);
			if (newMFuel != null)
				msgs = ((InternalEObject) newMFuel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL, null, msgs);
			msgs = basicSetMFuel(newMFuel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL, newMFuel,
					newMFuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalancePayloadType getMPayload() {
		return mPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPayload(WeightAndBalancePayloadType newMPayload, NotificationChain msgs) {
		WeightAndBalancePayloadType oldMPayload = mPayload;
		mPayload = newMPayload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD, oldMPayload, newMPayload);
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
	public void setMPayload(WeightAndBalancePayloadType newMPayload) {
		if (newMPayload != mPayload) {
			NotificationChain msgs = null;
			if (mPayload != null)
				msgs = ((InternalEObject) mPayload).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD, null, msgs);
			if (newMPayload != null)
				msgs = ((InternalEObject) newMPayload).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD, null, msgs);
			msgs = basicSetMPayload(newMPayload, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD,
					newMPayload, newMPayload));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OPERATIONAL_CASE_TYPE__UID, oldUID,
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
		case CpacsPackage.OPERATIONAL_CASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G:
			return basicSetCoG(null, msgs);
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA:
			return basicSetMassInertia(null, msgs);
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL:
			return basicSetMFuel(null, msgs);
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD:
			return basicSetMPayload(null, msgs);
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
		case CpacsPackage.OPERATIONAL_CASE_TYPE__NAME:
			return getName();
		case CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS:
			return getMass();
		case CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G:
			return getCoG();
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA:
			return getMassInertia();
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL:
			return getMFuel();
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD:
			return getMPayload();
		case CpacsPackage.OPERATIONAL_CASE_TYPE__UID:
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
		case CpacsPackage.OPERATIONAL_CASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS:
			setMass((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G:
			setCoG((PointListXYZVectorType) newValue);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaVectorType) newValue);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL:
			setMFuel((WeightAndBalanceFuelType) newValue);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD:
			setMPayload((WeightAndBalancePayloadType) newValue);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__UID:
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
		case CpacsPackage.OPERATIONAL_CASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS:
			setMass((StringVectorBaseType) null);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G:
			setCoG((PointListXYZVectorType) null);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaVectorType) null);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL:
			setMFuel((WeightAndBalanceFuelType) null);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD:
			setMPayload((WeightAndBalancePayloadType) null);
			return;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__UID:
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
		case CpacsPackage.OPERATIONAL_CASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS:
			return mass != null;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__CO_G:
			return coG != null;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MASS_INERTIA:
			return massInertia != null;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MFUEL:
			return mFuel != null;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__MPAYLOAD:
			return mPayload != null;
		case CpacsPackage.OPERATIONAL_CASE_TYPE__UID:
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

} //OperationalCaseTypeImpl
