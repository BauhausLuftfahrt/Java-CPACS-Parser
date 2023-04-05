/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlyingQualitiesCaseType;
import Cpacs.FqCharParametersType;
import Cpacs.FqLateralType;
import Cpacs.FqLongitudinalType;
import Cpacs.FqRatingsType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flying Qualities Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getLongitudinal <em>Longitudinal</em>}</li>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getLateral <em>Lateral</em>}</li>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getCharParameters <em>Char Parameters</em>}</li>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getRatings <em>Ratings</em>}</li>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlyingQualitiesCaseTypeImpl extends ComplexBaseTypeImpl implements FlyingQualitiesCaseType {
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
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType class_;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType category;

	/**
	 * The cached value of the '{@link #getLongitudinal() <em>Longitudinal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinal()
	 * @generated
	 * @ordered
	 */
	protected FqLongitudinalType longitudinal;

	/**
	 * The cached value of the '{@link #getLateral() <em>Lateral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateral()
	 * @generated
	 * @ordered
	 */
	protected FqLateralType lateral;

	/**
	 * The cached value of the '{@link #getCharParameters() <em>Char Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharParameters()
	 * @generated
	 * @ordered
	 */
	protected FqCharParametersType charParameters;

	/**
	 * The cached value of the '{@link #getRatings() <em>Ratings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected FqRatingsType ratings;

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
	protected FlyingQualitiesCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlyingQualitiesCaseType();
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
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME,
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
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(IntegerBaseType newClass, NotificationChain msgs) {
		IntegerBaseType oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS, oldClass, newClass);
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
	public void setClass(IntegerBaseType newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject) class_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject) newClass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS,
					newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(StringBaseType newCategory, NotificationChain msgs) {
		StringBaseType oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(StringBaseType newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject) category).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject) newCategory).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY,
					newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqLongitudinalType getLongitudinal() {
		return longitudinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongitudinal(FqLongitudinalType newLongitudinal, NotificationChain msgs) {
		FqLongitudinalType oldLongitudinal = longitudinal;
		longitudinal = newLongitudinal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL, oldLongitudinal, newLongitudinal);
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
	public void setLongitudinal(FqLongitudinalType newLongitudinal) {
		if (newLongitudinal != longitudinal) {
			NotificationChain msgs = null;
			if (longitudinal != null)
				msgs = ((InternalEObject) longitudinal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL, null, msgs);
			if (newLongitudinal != null)
				msgs = ((InternalEObject) newLongitudinal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL, null, msgs);
			msgs = basicSetLongitudinal(newLongitudinal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL,
					newLongitudinal, newLongitudinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqLateralType getLateral() {
		return lateral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLateral(FqLateralType newLateral, NotificationChain msgs) {
		FqLateralType oldLateral = lateral;
		lateral = newLateral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL, oldLateral, newLateral);
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
	public void setLateral(FqLateralType newLateral) {
		if (newLateral != lateral) {
			NotificationChain msgs = null;
			if (lateral != null)
				msgs = ((InternalEObject) lateral).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL, null, msgs);
			if (newLateral != null)
				msgs = ((InternalEObject) newLateral).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL, null, msgs);
			msgs = basicSetLateral(newLateral, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL,
					newLateral, newLateral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqCharParametersType getCharParameters() {
		return charParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharParameters(FqCharParametersType newCharParameters, NotificationChain msgs) {
		FqCharParametersType oldCharParameters = charParameters;
		charParameters = newCharParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS, oldCharParameters, newCharParameters);
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
	public void setCharParameters(FqCharParametersType newCharParameters) {
		if (newCharParameters != charParameters) {
			NotificationChain msgs = null;
			if (charParameters != null)
				msgs = ((InternalEObject) charParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS, null, msgs);
			if (newCharParameters != null)
				msgs = ((InternalEObject) newCharParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS, null, msgs);
			msgs = basicSetCharParameters(newCharParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS, newCharParameters, newCharParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqRatingsType getRatings() {
		return ratings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatings(FqRatingsType newRatings, NotificationChain msgs) {
		FqRatingsType oldRatings = ratings;
		ratings = newRatings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS, oldRatings, newRatings);
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
	public void setRatings(FqRatingsType newRatings) {
		if (newRatings != ratings) {
			NotificationChain msgs = null;
			if (ratings != null)
				msgs = ((InternalEObject) ratings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS, null, msgs);
			if (newRatings != null)
				msgs = ((InternalEObject) newRatings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS, null, msgs);
			msgs = basicSetRatings(newRatings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS,
					newRatings, newRatings));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLYING_QUALITIES_CASE_TYPE__UID, oldUID,
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
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS:
			return basicSetClass(null, msgs);
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY:
			return basicSetCategory(null, msgs);
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL:
			return basicSetLongitudinal(null, msgs);
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL:
			return basicSetLateral(null, msgs);
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS:
			return basicSetCharParameters(null, msgs);
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS:
			return basicSetRatings(null, msgs);
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
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME:
			return getName();
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS:
			return getClass_();
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY:
			return getCategory();
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL:
			return getLongitudinal();
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL:
			return getLateral();
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS:
			return getCharParameters();
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS:
			return getRatings();
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__UID:
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
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS:
			setClass((IntegerBaseType) newValue);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY:
			setCategory((StringBaseType) newValue);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL:
			setLongitudinal((FqLongitudinalType) newValue);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL:
			setLateral((FqLateralType) newValue);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS:
			setCharParameters((FqCharParametersType) newValue);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS:
			setRatings((FqRatingsType) newValue);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__UID:
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
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS:
			setClass((IntegerBaseType) null);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY:
			setCategory((StringBaseType) null);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL:
			setLongitudinal((FqLongitudinalType) null);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL:
			setLateral((FqLateralType) null);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS:
			setCharParameters((FqCharParametersType) null);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS:
			setRatings((FqRatingsType) null);
			return;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__UID:
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
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CLASS:
			return class_ != null;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CATEGORY:
			return category != null;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LONGITUDINAL:
			return longitudinal != null;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__LATERAL:
			return lateral != null;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__CHAR_PARAMETERS:
			return charParameters != null;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__RATINGS:
			return ratings != null;
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE__UID:
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

} //FlyingQualitiesCaseTypeImpl
