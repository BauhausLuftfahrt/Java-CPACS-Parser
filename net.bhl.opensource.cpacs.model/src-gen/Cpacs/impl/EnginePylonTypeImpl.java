/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EnginePylonType;
import Cpacs.PositioningsType;
import Cpacs.PylonStructureType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.SymmetryXyXzYzType;
import Cpacs.TransformationType;
import Cpacs.WingSectionsType;
import Cpacs.WingSegmentsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Pylon Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getPositionings <em>Positionings</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getLoadCarryingStructure <em>Load Carrying Structure</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.EnginePylonTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnginePylonTypeImpl extends ComplexBaseTypeImpl implements EnginePylonType {
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
	 * The cached value of the '{@link #getParentUID() <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType parentUID;

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
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected WingSectionsType sections;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected WingSegmentsType segments;

	/**
	 * The cached value of the '{@link #getPositionings() <em>Positionings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionings()
	 * @generated
	 * @ordered
	 */
	protected PositioningsType positionings;

	/**
	 * The cached value of the '{@link #getLoadCarryingStructure() <em>Load Carrying Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadCarryingStructure()
	 * @generated
	 * @ordered
	 */
	protected PylonStructureType loadCarryingStructure;

	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryXyXzYzType SYMMETRY_EDEFAULT = SymmetryXyXzYzType.NONE;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryXyXzYzType symmetry = SYMMETRY_EDEFAULT;

	/**
	 * This is true if the Symmetry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetryESet;

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
	protected EnginePylonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEnginePylonType();
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
					CpacsPackage.ENGINE_PYLON_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__NAME, newName,
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
					CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getParentUID() {
		return parentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentUID(StringUIDBaseType newParentUID, NotificationChain msgs) {
		StringUIDBaseType oldParentUID = parentUID;
		parentUID = newParentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
	public void setParentUID(StringUIDBaseType newParentUID) {
		if (newParentUID != parentUID) {
			NotificationChain msgs = null;
			if (parentUID != null)
				msgs = ((InternalEObject) parentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID,
					newParentUID, newParentUID));
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
					CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION,
					newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSectionsType getSections() {
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSections(WingSectionsType newSections, NotificationChain msgs) {
		WingSectionsType oldSections = sections;
		sections = newSections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS, oldSections, newSections);
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
	public void setSections(WingSectionsType newSections) {
		if (newSections != sections) {
			NotificationChain msgs = null;
			if (sections != null)
				msgs = ((InternalEObject) sections).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS, null, msgs);
			if (newSections != null)
				msgs = ((InternalEObject) newSections).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS, null, msgs);
			msgs = basicSetSections(newSections, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS, newSections,
					newSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSegmentsType getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(WingSegmentsType newSegments, NotificationChain msgs) {
		WingSegmentsType oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS, oldSegments, newSegments);
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
	public void setSegments(WingSegmentsType newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject) segments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject) newSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS, newSegments,
					newSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositioningsType getPositionings() {
		return positionings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionings(PositioningsType newPositionings, NotificationChain msgs) {
		PositioningsType oldPositionings = positionings;
		positionings = newPositionings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS, oldPositionings, newPositionings);
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
	public void setPositionings(PositioningsType newPositionings) {
		if (newPositionings != positionings) {
			NotificationChain msgs = null;
			if (positionings != null)
				msgs = ((InternalEObject) positionings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS, null, msgs);
			if (newPositionings != null)
				msgs = ((InternalEObject) newPositionings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS, null, msgs);
			msgs = basicSetPositionings(newPositionings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS,
					newPositionings, newPositionings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonStructureType getLoadCarryingStructure() {
		return loadCarryingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadCarryingStructure(PylonStructureType newLoadCarryingStructure,
			NotificationChain msgs) {
		PylonStructureType oldLoadCarryingStructure = loadCarryingStructure;
		loadCarryingStructure = newLoadCarryingStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE, oldLoadCarryingStructure,
					newLoadCarryingStructure);
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
	public void setLoadCarryingStructure(PylonStructureType newLoadCarryingStructure) {
		if (newLoadCarryingStructure != loadCarryingStructure) {
			NotificationChain msgs = null;
			if (loadCarryingStructure != null)
				msgs = ((InternalEObject) loadCarryingStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE, null, msgs);
			if (newLoadCarryingStructure != null)
				msgs = ((InternalEObject) newLoadCarryingStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE, null, msgs);
			msgs = basicSetLoadCarryingStructure(newLoadCarryingStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE, newLoadCarryingStructure,
					newLoadCarryingStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryXyXzYzType getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetry(SymmetryXyXzYzType newSymmetry) {
		SymmetryXyXzYzType oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__SYMMETRY, oldSymmetry,
					symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetry() {
		SymmetryXyXzYzType oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.ENGINE_PYLON_TYPE__SYMMETRY,
					oldSymmetry, SYMMETRY_EDEFAULT, oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSymmetry() {
		return symmetryESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_PYLON_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_PYLON_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		case CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS:
			return basicSetSections(null, msgs);
		case CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS:
			return basicSetSegments(null, msgs);
		case CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS:
			return basicSetPositionings(null, msgs);
		case CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE:
			return basicSetLoadCarryingStructure(null, msgs);
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
		case CpacsPackage.ENGINE_PYLON_TYPE__NAME:
			return getName();
		case CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS:
			return getSections();
		case CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS:
			return getSegments();
		case CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS:
			return getPositionings();
		case CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE:
			return getLoadCarryingStructure();
		case CpacsPackage.ENGINE_PYLON_TYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.ENGINE_PYLON_TYPE__UID:
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
		case CpacsPackage.ENGINE_PYLON_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS:
			setSections((WingSectionsType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS:
			setSegments((WingSegmentsType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS:
			setPositionings((PositioningsType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE:
			setLoadCarryingStructure((PylonStructureType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__SYMMETRY:
			setSymmetry((SymmetryXyXzYzType) newValue);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__UID:
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
		case CpacsPackage.ENGINE_PYLON_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS:
			setSections((WingSectionsType) null);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS:
			setSegments((WingSegmentsType) null);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS:
			setPositionings((PositioningsType) null);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE:
			setLoadCarryingStructure((PylonStructureType) null);
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__SYMMETRY:
			unsetSymmetry();
			return;
		case CpacsPackage.ENGINE_PYLON_TYPE__UID:
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
		case CpacsPackage.ENGINE_PYLON_TYPE__NAME:
			return name != null;
		case CpacsPackage.ENGINE_PYLON_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.ENGINE_PYLON_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.ENGINE_PYLON_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.ENGINE_PYLON_TYPE__SECTIONS:
			return sections != null;
		case CpacsPackage.ENGINE_PYLON_TYPE__SEGMENTS:
			return segments != null;
		case CpacsPackage.ENGINE_PYLON_TYPE__POSITIONINGS:
			return positionings != null;
		case CpacsPackage.ENGINE_PYLON_TYPE__LOAD_CARRYING_STRUCTURE:
			return loadCarryingStructure != null;
		case CpacsPackage.ENGINE_PYLON_TYPE__SYMMETRY:
			return isSetSymmetry();
		case CpacsPackage.ENGINE_PYLON_TYPE__UID:
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
		result.append(" (symmetry: ");
		if (symmetryESet)
			result.append(symmetry);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //EnginePylonTypeImpl
