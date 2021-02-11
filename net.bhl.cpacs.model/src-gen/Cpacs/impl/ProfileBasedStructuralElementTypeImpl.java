/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GlobalBeamPropertiesType;
import Cpacs.MaterialDefinitionForProfileBasedPointType;
import Cpacs.MaterialDefinitionForProfileBasedType;
import Cpacs.ProfileBasedStructuralElementType;
import Cpacs.StandardProfileTypeType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.Transformation2DType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Based Structural Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getSheetProperties <em>Sheet Properties</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getStructuralProfileUID <em>Structural Profile UID</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getPointProperties <em>Point Properties</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getReferencePointUID <em>Reference Point UID</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getStandardProfileType <em>Standard Profile Type</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getGlobalBeamProperties <em>Global Beam Properties</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileBasedStructuralElementTypeImpl extends ComplexBaseTypeImpl
		implements ProfileBasedStructuralElementType {
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
	 * The cached value of the '{@link #getSheetProperties() <em>Sheet Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialDefinitionForProfileBasedType> sheetProperties;

	/**
	 * The cached value of the '{@link #getStructuralProfileUID() <em>Structural Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralProfileUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralProfileUID;

	/**
	 * The cached value of the '{@link #getPointProperties() <em>Point Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialDefinitionForProfileBasedPointType> pointProperties;

	/**
	 * The cached value of the '{@link #getReferencePointUID() <em>Reference Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePointUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType referencePointUID;

	/**
	 * The cached value of the '{@link #getStandardProfileType() <em>Standard Profile Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardProfileType()
	 * @generated
	 * @ordered
	 */
	protected StandardProfileTypeType standardProfileType;

	/**
	 * The cached value of the '{@link #getGlobalBeamProperties() <em>Global Beam Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalBeamProperties()
	 * @generated
	 * @ordered
	 */
	protected GlobalBeamPropertiesType globalBeamProperties;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation2DType transformation;

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
	protected ProfileBasedStructuralElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getProfileBasedStructuralElementType();
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
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME, newName, newName));
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
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION, null,
						msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION, null,
						msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MaterialDefinitionForProfileBasedType> getSheetProperties() {
		if (sheetProperties == null) {
			sheetProperties = new EObjectContainmentEList<MaterialDefinitionForProfileBasedType>(
					MaterialDefinitionForProfileBasedType.class, this,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__SHEET_PROPERTIES);
		}
		return sheetProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralProfileUID() {
		return structuralProfileUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralProfileUID(StringUIDBaseType newStructuralProfileUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralProfileUID = structuralProfileUID;
		structuralProfileUID = newStructuralProfileUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID, oldStructuralProfileUID,
					newStructuralProfileUID);
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
	public void setStructuralProfileUID(StringUIDBaseType newStructuralProfileUID) {
		if (newStructuralProfileUID != structuralProfileUID) {
			NotificationChain msgs = null;
			if (structuralProfileUID != null)
				msgs = ((InternalEObject) structuralProfileUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID,
						null, msgs);
			if (newStructuralProfileUID != null)
				msgs = ((InternalEObject) newStructuralProfileUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID,
						null, msgs);
			msgs = basicSetStructuralProfileUID(newStructuralProfileUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID, newStructuralProfileUID,
					newStructuralProfileUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MaterialDefinitionForProfileBasedPointType> getPointProperties() {
		if (pointProperties == null) {
			pointProperties = new EObjectContainmentEList<MaterialDefinitionForProfileBasedPointType>(
					MaterialDefinitionForProfileBasedPointType.class, this,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__POINT_PROPERTIES);
		}
		return pointProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReferencePointUID() {
		return referencePointUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencePointUID(StringUIDBaseType newReferencePointUID, NotificationChain msgs) {
		StringUIDBaseType oldReferencePointUID = referencePointUID;
		referencePointUID = newReferencePointUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID, oldReferencePointUID,
					newReferencePointUID);
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
	public void setReferencePointUID(StringUIDBaseType newReferencePointUID) {
		if (newReferencePointUID != referencePointUID) {
			NotificationChain msgs = null;
			if (referencePointUID != null)
				msgs = ((InternalEObject) referencePointUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID, null, msgs);
			if (newReferencePointUID != null)
				msgs = ((InternalEObject) newReferencePointUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID, null, msgs);
			msgs = basicSetReferencePointUID(newReferencePointUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID, newReferencePointUID,
					newReferencePointUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardProfileTypeType getStandardProfileType() {
		return standardProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardProfileType(StandardProfileTypeType newStandardProfileType,
			NotificationChain msgs) {
		StandardProfileTypeType oldStandardProfileType = standardProfileType;
		standardProfileType = newStandardProfileType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE, oldStandardProfileType,
					newStandardProfileType);
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
	public void setStandardProfileType(StandardProfileTypeType newStandardProfileType) {
		if (newStandardProfileType != standardProfileType) {
			NotificationChain msgs = null;
			if (standardProfileType != null)
				msgs = ((InternalEObject) standardProfileType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE,
						null, msgs);
			if (newStandardProfileType != null)
				msgs = ((InternalEObject) newStandardProfileType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE,
						null, msgs);
			msgs = basicSetStandardProfileType(newStandardProfileType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE, newStandardProfileType,
					newStandardProfileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalBeamPropertiesType getGlobalBeamProperties() {
		return globalBeamProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalBeamProperties(GlobalBeamPropertiesType newGlobalBeamProperties,
			NotificationChain msgs) {
		GlobalBeamPropertiesType oldGlobalBeamProperties = globalBeamProperties;
		globalBeamProperties = newGlobalBeamProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES, oldGlobalBeamProperties,
					newGlobalBeamProperties);
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
	public void setGlobalBeamProperties(GlobalBeamPropertiesType newGlobalBeamProperties) {
		if (newGlobalBeamProperties != globalBeamProperties) {
			NotificationChain msgs = null;
			if (globalBeamProperties != null)
				msgs = ((InternalEObject) globalBeamProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES,
						null, msgs);
			if (newGlobalBeamProperties != null)
				msgs = ((InternalEObject) newGlobalBeamProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES,
						null, msgs);
			msgs = basicSetGlobalBeamProperties(newGlobalBeamProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES, newGlobalBeamProperties,
					newGlobalBeamProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transformation2DType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation2DType newTransformation, NotificationChain msgs) {
		Transformation2DType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION, oldTransformation,
					newTransformation);
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
	public void setTransformation(Transformation2DType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION,
						null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION,
						null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION, newTransformation,
					newTransformation));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__SHEET_PROPERTIES:
			return ((InternalEList<?>) getSheetProperties()).basicRemove(otherEnd, msgs);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID:
			return basicSetStructuralProfileUID(null, msgs);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__POINT_PROPERTIES:
			return ((InternalEList<?>) getPointProperties()).basicRemove(otherEnd, msgs);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID:
			return basicSetReferencePointUID(null, msgs);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE:
			return basicSetStandardProfileType(null, msgs);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES:
			return basicSetGlobalBeamProperties(null, msgs);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
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
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__SHEET_PROPERTIES:
			return getSheetProperties();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID:
			return getStructuralProfileUID();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__POINT_PROPERTIES:
			return getPointProperties();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID:
			return getReferencePointUID();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE:
			return getStandardProfileType();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES:
			return getGlobalBeamProperties();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__UID:
			return getUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__SHEET_PROPERTIES:
			getSheetProperties().clear();
			getSheetProperties().addAll((Collection<? extends MaterialDefinitionForProfileBasedType>) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID:
			setStructuralProfileUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__POINT_PROPERTIES:
			getPointProperties().clear();
			getPointProperties().addAll((Collection<? extends MaterialDefinitionForProfileBasedPointType>) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID:
			setReferencePointUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE:
			setStandardProfileType((StandardProfileTypeType) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES:
			setGlobalBeamProperties((GlobalBeamPropertiesType) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION:
			setTransformation((Transformation2DType) newValue);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__UID:
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
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__SHEET_PROPERTIES:
			getSheetProperties().clear();
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID:
			setStructuralProfileUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__POINT_PROPERTIES:
			getPointProperties().clear();
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID:
			setReferencePointUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE:
			setStandardProfileType((StandardProfileTypeType) null);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES:
			setGlobalBeamProperties((GlobalBeamPropertiesType) null);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION:
			setTransformation((Transformation2DType) null);
			return;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__UID:
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
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__SHEET_PROPERTIES:
			return sheetProperties != null && !sheetProperties.isEmpty();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STRUCTURAL_PROFILE_UID:
			return structuralProfileUID != null;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__POINT_PROPERTIES:
			return pointProperties != null && !pointProperties.isEmpty();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__REFERENCE_POINT_UID:
			return referencePointUID != null;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__STANDARD_PROFILE_TYPE:
			return standardProfileType != null;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__GLOBAL_BEAM_PROPERTIES:
			return globalBeamProperties != null;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE__UID:
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

} //ProfileBasedStructuralElementTypeImpl
