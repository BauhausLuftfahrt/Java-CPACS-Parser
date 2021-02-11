/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.NacelleGuideCurveType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nacelle Guide Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NacelleGuideCurveTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleGuideCurveTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleGuideCurveTypeImpl#getGuideCurveProfileUID <em>Guide Curve Profile UID</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleGuideCurveTypeImpl#getStartSectionUID <em>Start Section UID</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleGuideCurveTypeImpl#getFromZeta <em>From Zeta</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleGuideCurveTypeImpl#getToZeta <em>To Zeta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NacelleGuideCurveTypeImpl extends ComplexBaseTypeImpl implements NacelleGuideCurveType {
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
	 * The cached value of the '{@link #getGuideCurveProfileUID() <em>Guide Curve Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideCurveProfileUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType guideCurveProfileUID;

	/**
	 * The cached value of the '{@link #getStartSectionUID() <em>Start Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSectionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startSectionUID;

	/**
	 * The cached value of the '{@link #getFromZeta() <em>From Zeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromZeta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fromZeta;

	/**
	 * The cached value of the '{@link #getToZeta() <em>To Zeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToZeta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType toZeta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NacelleGuideCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNacelleGuideCurveType();
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
					CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME, newName,
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
					CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getGuideCurveProfileUID() {
		return guideCurveProfileUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuideCurveProfileUID(StringUIDBaseType newGuideCurveProfileUID,
			NotificationChain msgs) {
		StringUIDBaseType oldGuideCurveProfileUID = guideCurveProfileUID;
		guideCurveProfileUID = newGuideCurveProfileUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID, oldGuideCurveProfileUID,
					newGuideCurveProfileUID);
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
	public void setGuideCurveProfileUID(StringUIDBaseType newGuideCurveProfileUID) {
		if (newGuideCurveProfileUID != guideCurveProfileUID) {
			NotificationChain msgs = null;
			if (guideCurveProfileUID != null)
				msgs = ((InternalEObject) guideCurveProfileUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID, null,
						msgs);
			if (newGuideCurveProfileUID != null)
				msgs = ((InternalEObject) newGuideCurveProfileUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID, null,
						msgs);
			msgs = basicSetGuideCurveProfileUID(newGuideCurveProfileUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID, newGuideCurveProfileUID,
					newGuideCurveProfileUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartSectionUID() {
		return startSectionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSectionUID(StringUIDBaseType newStartSectionUID, NotificationChain msgs) {
		StringUIDBaseType oldStartSectionUID = startSectionUID;
		startSectionUID = newStartSectionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID, oldStartSectionUID, newStartSectionUID);
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
	public void setStartSectionUID(StringUIDBaseType newStartSectionUID) {
		if (newStartSectionUID != startSectionUID) {
			NotificationChain msgs = null;
			if (startSectionUID != null)
				msgs = ((InternalEObject) startSectionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID, null, msgs);
			if (newStartSectionUID != null)
				msgs = ((InternalEObject) newStartSectionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID, null, msgs);
			msgs = basicSetStartSectionUID(newStartSectionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID, newStartSectionUID, newStartSectionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFromZeta() {
		return fromZeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromZeta(DoubleBaseType newFromZeta, NotificationChain msgs) {
		DoubleBaseType oldFromZeta = fromZeta;
		fromZeta = newFromZeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA, oldFromZeta, newFromZeta);
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
	public void setFromZeta(DoubleBaseType newFromZeta) {
		if (newFromZeta != fromZeta) {
			NotificationChain msgs = null;
			if (fromZeta != null)
				msgs = ((InternalEObject) fromZeta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA, null, msgs);
			if (newFromZeta != null)
				msgs = ((InternalEObject) newFromZeta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA, null, msgs);
			msgs = basicSetFromZeta(newFromZeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA,
					newFromZeta, newFromZeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getToZeta() {
		return toZeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToZeta(DoubleBaseType newToZeta, NotificationChain msgs) {
		DoubleBaseType oldToZeta = toZeta;
		toZeta = newToZeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA, oldToZeta, newToZeta);
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
	public void setToZeta(DoubleBaseType newToZeta) {
		if (newToZeta != toZeta) {
			NotificationChain msgs = null;
			if (toZeta != null)
				msgs = ((InternalEObject) toZeta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA, null, msgs);
			if (newToZeta != null)
				msgs = ((InternalEObject) newToZeta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA, null, msgs);
			msgs = basicSetToZeta(newToZeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA,
					newToZeta, newToZeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			return basicSetGuideCurveProfileUID(null, msgs);
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID:
			return basicSetStartSectionUID(null, msgs);
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA:
			return basicSetFromZeta(null, msgs);
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA:
			return basicSetToZeta(null, msgs);
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
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME:
			return getName();
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			return getGuideCurveProfileUID();
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID:
			return getStartSectionUID();
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA:
			return getFromZeta();
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA:
			return getToZeta();
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
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			setGuideCurveProfileUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID:
			setStartSectionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA:
			setFromZeta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA:
			setToZeta((DoubleBaseType) newValue);
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
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			setGuideCurveProfileUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID:
			setStartSectionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA:
			setFromZeta((DoubleBaseType) null);
			return;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA:
			setToZeta((DoubleBaseType) null);
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
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__NAME:
			return name != null;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			return guideCurveProfileUID != null;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__START_SECTION_UID:
			return startSectionUID != null;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__FROM_ZETA:
			return fromZeta != null;
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE__TO_ZETA:
			return toZeta != null;
		}
		return super.eIsSet(featureID);
	}

} //NacelleGuideCurveTypeImpl
