/**
 */
package Cpacs.impl;

import Cpacs.CompartmentsType;
import Cpacs.CpacsPackage;
import Cpacs.DecksType;
import Cpacs.FuselageCutOutsType;
import Cpacs.FuselageFuelTanksType;
import Cpacs.FuselageSectionsType;
import Cpacs.FuselageSegmentsType;
import Cpacs.FuselageStructureType;
import Cpacs.FuselageType;
import Cpacs.PositioningsType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.SymmetryXyXzYzType;
import Cpacs.TransformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getPositionings <em>Positionings</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getDecks <em>Decks</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getFuelTanks <em>Fuel Tanks</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getCutOuts <em>Cut Outs</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageTypeImpl extends ComplexBaseTypeImpl implements FuselageType {
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
	protected FuselageSectionsType sections;

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
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected FuselageSegmentsType segments;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected FuselageStructureType structure;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected CompartmentsType compartments;

	/**
	 * The cached value of the '{@link #getDecks() <em>Decks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecks()
	 * @generated
	 * @ordered
	 */
	protected DecksType decks;

	/**
	 * The cached value of the '{@link #getFuelTanks() <em>Fuel Tanks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelTanks()
	 * @generated
	 * @ordered
	 */
	protected FuselageFuelTanksType fuelTanks;

	/**
	 * The cached value of the '{@link #getCutOuts() <em>Cut Outs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOuts()
	 * @generated
	 * @ordered
	 */
	protected FuselageCutOutsType cutOuts;

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
	protected FuselageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageType();
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
					CpacsPackage.FUSELAGE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__NAME, newName, newName));
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
					CpacsPackage.FUSELAGE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__DESCRIPTION,
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
					CpacsPackage.FUSELAGE_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__PARENT_UID, newParentUID,
					newParentUID));
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
					CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION,
					newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSectionsType getSections() {
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSections(FuselageSectionsType newSections, NotificationChain msgs) {
		FuselageSectionsType oldSections = sections;
		sections = newSections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_TYPE__SECTIONS, oldSections, newSections);
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
	public void setSections(FuselageSectionsType newSections) {
		if (newSections != sections) {
			NotificationChain msgs = null;
			if (sections != null)
				msgs = ((InternalEObject) sections).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__SECTIONS, null, msgs);
			if (newSections != null)
				msgs = ((InternalEObject) newSections).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__SECTIONS, null, msgs);
			msgs = basicSetSections(newSections, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__SECTIONS, newSections,
					newSections));
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
					CpacsPackage.FUSELAGE_TYPE__POSITIONINGS, oldPositionings, newPositionings);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__POSITIONINGS, null, msgs);
			if (newPositionings != null)
				msgs = ((InternalEObject) newPositionings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__POSITIONINGS, null, msgs);
			msgs = basicSetPositionings(newPositionings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__POSITIONINGS,
					newPositionings, newPositionings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSegmentsType getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(FuselageSegmentsType newSegments, NotificationChain msgs) {
		FuselageSegmentsType oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_TYPE__SEGMENTS, oldSegments, newSegments);
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
	public void setSegments(FuselageSegmentsType newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject) segments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject) newSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__SEGMENTS, newSegments,
					newSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageStructureType getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(FuselageStructureType newStructure, NotificationChain msgs) {
		FuselageStructureType oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_TYPE__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(FuselageStructureType newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject) newStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__STRUCTURE, newStructure,
					newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentsType getCompartments() {
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartments(CompartmentsType newCompartments, NotificationChain msgs) {
		CompartmentsType oldCompartments = compartments;
		compartments = newCompartments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS, oldCompartments, newCompartments);
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
	public void setCompartments(CompartmentsType newCompartments) {
		if (newCompartments != compartments) {
			NotificationChain msgs = null;
			if (compartments != null)
				msgs = ((InternalEObject) compartments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS, null, msgs);
			if (newCompartments != null)
				msgs = ((InternalEObject) newCompartments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS, null, msgs);
			msgs = basicSetCompartments(newCompartments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS,
					newCompartments, newCompartments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecksType getDecks() {
		return decks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecks(DecksType newDecks, NotificationChain msgs) {
		DecksType oldDecks = decks;
		decks = newDecks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_TYPE__DECKS, oldDecks, newDecks);
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
	public void setDecks(DecksType newDecks) {
		if (newDecks != decks) {
			NotificationChain msgs = null;
			if (decks != null)
				msgs = ((InternalEObject) decks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__DECKS, null, msgs);
			if (newDecks != null)
				msgs = ((InternalEObject) newDecks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__DECKS, null, msgs);
			msgs = basicSetDecks(newDecks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__DECKS, newDecks,
					newDecks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageFuelTanksType getFuelTanks() {
		return fuelTanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelTanks(FuselageFuelTanksType newFuelTanks, NotificationChain msgs) {
		FuselageFuelTanksType oldFuelTanks = fuelTanks;
		fuelTanks = newFuelTanks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS, oldFuelTanks, newFuelTanks);
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
	public void setFuelTanks(FuselageFuelTanksType newFuelTanks) {
		if (newFuelTanks != fuelTanks) {
			NotificationChain msgs = null;
			if (fuelTanks != null)
				msgs = ((InternalEObject) fuelTanks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS, null, msgs);
			if (newFuelTanks != null)
				msgs = ((InternalEObject) newFuelTanks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS, null, msgs);
			msgs = basicSetFuelTanks(newFuelTanks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS, newFuelTanks,
					newFuelTanks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageCutOutsType getCutOuts() {
		return cutOuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutOuts(FuselageCutOutsType newCutOuts, NotificationChain msgs) {
		FuselageCutOutsType oldCutOuts = cutOuts;
		cutOuts = newCutOuts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_TYPE__CUT_OUTS, oldCutOuts, newCutOuts);
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
	public void setCutOuts(FuselageCutOutsType newCutOuts) {
		if (newCutOuts != cutOuts) {
			NotificationChain msgs = null;
			if (cutOuts != null)
				msgs = ((InternalEObject) cutOuts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__CUT_OUTS, null, msgs);
			if (newCutOuts != null)
				msgs = ((InternalEObject) newCutOuts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_TYPE__CUT_OUTS, null, msgs);
			msgs = basicSetCutOuts(newCutOuts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__CUT_OUTS, newCutOuts,
					newCutOuts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__SYMMETRY, oldSymmetry,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.FUSELAGE_TYPE__SYMMETRY, oldSymmetry,
					SYMMETRY_EDEFAULT, oldSymmetryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__SECTIONS:
			return basicSetSections(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__POSITIONINGS:
			return basicSetPositionings(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__SEGMENTS:
			return basicSetSegments(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__STRUCTURE:
			return basicSetStructure(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS:
			return basicSetCompartments(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__DECKS:
			return basicSetDecks(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS:
			return basicSetFuelTanks(null, msgs);
		case CpacsPackage.FUSELAGE_TYPE__CUT_OUTS:
			return basicSetCutOuts(null, msgs);
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
		case CpacsPackage.FUSELAGE_TYPE__NAME:
			return getName();
		case CpacsPackage.FUSELAGE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FUSELAGE_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.FUSELAGE_TYPE__SECTIONS:
			return getSections();
		case CpacsPackage.FUSELAGE_TYPE__POSITIONINGS:
			return getPositionings();
		case CpacsPackage.FUSELAGE_TYPE__SEGMENTS:
			return getSegments();
		case CpacsPackage.FUSELAGE_TYPE__STRUCTURE:
			return getStructure();
		case CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS:
			return getCompartments();
		case CpacsPackage.FUSELAGE_TYPE__DECKS:
			return getDecks();
		case CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS:
			return getFuelTanks();
		case CpacsPackage.FUSELAGE_TYPE__CUT_OUTS:
			return getCutOuts();
		case CpacsPackage.FUSELAGE_TYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.FUSELAGE_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__SECTIONS:
			setSections((FuselageSectionsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__POSITIONINGS:
			setPositionings((PositioningsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__SEGMENTS:
			setSegments((FuselageSegmentsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__STRUCTURE:
			setStructure((FuselageStructureType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS:
			setCompartments((CompartmentsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__DECKS:
			setDecks((DecksType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS:
			setFuelTanks((FuselageFuelTanksType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__CUT_OUTS:
			setCutOuts((FuselageCutOutsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__SYMMETRY:
			setSymmetry((SymmetryXyXzYzType) newValue);
			return;
		case CpacsPackage.FUSELAGE_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__SECTIONS:
			setSections((FuselageSectionsType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__POSITIONINGS:
			setPositionings((PositioningsType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__SEGMENTS:
			setSegments((FuselageSegmentsType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__STRUCTURE:
			setStructure((FuselageStructureType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS:
			setCompartments((CompartmentsType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__DECKS:
			setDecks((DecksType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS:
			setFuelTanks((FuselageFuelTanksType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__CUT_OUTS:
			setCutOuts((FuselageCutOutsType) null);
			return;
		case CpacsPackage.FUSELAGE_TYPE__SYMMETRY:
			unsetSymmetry();
			return;
		case CpacsPackage.FUSELAGE_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_TYPE__NAME:
			return name != null;
		case CpacsPackage.FUSELAGE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FUSELAGE_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.FUSELAGE_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.FUSELAGE_TYPE__SECTIONS:
			return sections != null;
		case CpacsPackage.FUSELAGE_TYPE__POSITIONINGS:
			return positionings != null;
		case CpacsPackage.FUSELAGE_TYPE__SEGMENTS:
			return segments != null;
		case CpacsPackage.FUSELAGE_TYPE__STRUCTURE:
			return structure != null;
		case CpacsPackage.FUSELAGE_TYPE__COMPARTMENTS:
			return compartments != null;
		case CpacsPackage.FUSELAGE_TYPE__DECKS:
			return decks != null;
		case CpacsPackage.FUSELAGE_TYPE__FUEL_TANKS:
			return fuelTanks != null;
		case CpacsPackage.FUSELAGE_TYPE__CUT_OUTS:
			return cutOuts != null;
		case CpacsPackage.FUSELAGE_TYPE__SYMMETRY:
			return isSetSymmetry();
		case CpacsPackage.FUSELAGE_TYPE__UID:
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

} //FuselageTypeImpl
