/**
 */
package Cpacs.impl;

import Cpacs.ComponentSegmentPathType;
import Cpacs.ComponentSegmentType;
import Cpacs.ControlSurfacesType;
import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WingComponentSegmentStructureType;
import Cpacs.WingFuelTanksType;
import Cpacs.WingFuselageAttachmentsType;
import Cpacs.WingStructuralMountsType;
import Cpacs.WingWingAttachmentsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getFromElementUID <em>From Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getToElementUID <em>To Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getControlSurfaces <em>Control Surfaces</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getWingFuselageAttachments <em>Wing Fuselage Attachments</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getWingWingAttachments <em>Wing Wing Attachments</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getWingFuelTanks <em>Wing Fuel Tanks</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getWingStructuralMounts <em>Wing Structural Mounts</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSegmentTypeImpl extends ComplexBaseTypeImpl implements ComponentSegmentType {
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
	 * The cached value of the '{@link #getFromElementUID() <em>From Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromElementUID;

	/**
	 * The cached value of the '{@link #getToElementUID() <em>To Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toElementUID;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected WingComponentSegmentStructureType structure;

	/**
	 * The cached value of the '{@link #getControlSurfaces() <em>Control Surfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaces()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfacesType controlSurfaces;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected ComponentSegmentPathType path;

	/**
	 * The cached value of the '{@link #getWingFuselageAttachments() <em>Wing Fuselage Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingFuselageAttachments()
	 * @generated
	 * @ordered
	 */
	protected WingFuselageAttachmentsType wingFuselageAttachments;

	/**
	 * The cached value of the '{@link #getWingWingAttachments() <em>Wing Wing Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingWingAttachments()
	 * @generated
	 * @ordered
	 */
	protected WingWingAttachmentsType wingWingAttachments;

	/**
	 * The cached value of the '{@link #getWingFuelTanks() <em>Wing Fuel Tanks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingFuelTanks()
	 * @generated
	 * @ordered
	 */
	protected WingFuelTanksType wingFuelTanks;

	/**
	 * The cached value of the '{@link #getWingStructuralMounts() <em>Wing Structural Mounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingStructuralMounts()
	 * @generated
	 * @ordered
	 */
	protected WingStructuralMountsType wingStructuralMounts;

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
	protected ComponentSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getComponentSegmentType();
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
					CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME, newName,
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
					CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromElementUID() {
		return fromElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromElementUID(StringUIDBaseType newFromElementUID, NotificationChain msgs) {
		StringUIDBaseType oldFromElementUID = fromElementUID;
		fromElementUID = newFromElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID, oldFromElementUID, newFromElementUID);
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
	public void setFromElementUID(StringUIDBaseType newFromElementUID) {
		if (newFromElementUID != fromElementUID) {
			NotificationChain msgs = null;
			if (fromElementUID != null)
				msgs = ((InternalEObject) fromElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID, null, msgs);
			if (newFromElementUID != null)
				msgs = ((InternalEObject) newFromElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID, null, msgs);
			msgs = basicSetFromElementUID(newFromElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID,
					newFromElementUID, newFromElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToElementUID() {
		return toElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToElementUID(StringUIDBaseType newToElementUID, NotificationChain msgs) {
		StringUIDBaseType oldToElementUID = toElementUID;
		toElementUID = newToElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID, oldToElementUID, newToElementUID);
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
	public void setToElementUID(StringUIDBaseType newToElementUID) {
		if (newToElementUID != toElementUID) {
			NotificationChain msgs = null;
			if (toElementUID != null)
				msgs = ((InternalEObject) toElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID, null, msgs);
			if (newToElementUID != null)
				msgs = ((InternalEObject) newToElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID, null, msgs);
			msgs = basicSetToElementUID(newToElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID,
					newToElementUID, newToElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingComponentSegmentStructureType getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(WingComponentSegmentStructureType newStructure, NotificationChain msgs) {
		WingComponentSegmentStructureType oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(WingComponentSegmentStructureType newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject) newStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE,
					newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfacesType getControlSurfaces() {
		return controlSurfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaces(ControlSurfacesType newControlSurfaces, NotificationChain msgs) {
		ControlSurfacesType oldControlSurfaces = controlSurfaces;
		controlSurfaces = newControlSurfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES, oldControlSurfaces, newControlSurfaces);
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
	public void setControlSurfaces(ControlSurfacesType newControlSurfaces) {
		if (newControlSurfaces != controlSurfaces) {
			NotificationChain msgs = null;
			if (controlSurfaces != null)
				msgs = ((InternalEObject) controlSurfaces).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES, null, msgs);
			if (newControlSurfaces != null)
				msgs = ((InternalEObject) newControlSurfaces).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES, null, msgs);
			msgs = basicSetControlSurfaces(newControlSurfaces, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES,
					newControlSurfaces, newControlSurfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSegmentPathType getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(ComponentSegmentPathType newPath, NotificationChain msgs) {
		ComponentSegmentPathType oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH, oldPath, newPath);
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
	public void setPath(ComponentSegmentPathType newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject) path).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject) newPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH, newPath,
					newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuselageAttachmentsType getWingFuselageAttachments() {
		return wingFuselageAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingFuselageAttachments(WingFuselageAttachmentsType newWingFuselageAttachments,
			NotificationChain msgs) {
		WingFuselageAttachmentsType oldWingFuselageAttachments = wingFuselageAttachments;
		wingFuselageAttachments = newWingFuselageAttachments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS, oldWingFuselageAttachments,
					newWingFuselageAttachments);
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
	public void setWingFuselageAttachments(WingFuselageAttachmentsType newWingFuselageAttachments) {
		if (newWingFuselageAttachments != wingFuselageAttachments) {
			NotificationChain msgs = null;
			if (wingFuselageAttachments != null)
				msgs = ((InternalEObject) wingFuselageAttachments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS, null,
						msgs);
			if (newWingFuselageAttachments != null)
				msgs = ((InternalEObject) newWingFuselageAttachments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS, null,
						msgs);
			msgs = basicSetWingFuselageAttachments(newWingFuselageAttachments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS, newWingFuselageAttachments,
					newWingFuselageAttachments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingWingAttachmentsType getWingWingAttachments() {
		return wingWingAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingWingAttachments(WingWingAttachmentsType newWingWingAttachments,
			NotificationChain msgs) {
		WingWingAttachmentsType oldWingWingAttachments = wingWingAttachments;
		wingWingAttachments = newWingWingAttachments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS, oldWingWingAttachments,
					newWingWingAttachments);
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
	public void setWingWingAttachments(WingWingAttachmentsType newWingWingAttachments) {
		if (newWingWingAttachments != wingWingAttachments) {
			NotificationChain msgs = null;
			if (wingWingAttachments != null)
				msgs = ((InternalEObject) wingWingAttachments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS, null,
						msgs);
			if (newWingWingAttachments != null)
				msgs = ((InternalEObject) newWingWingAttachments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS, null,
						msgs);
			msgs = basicSetWingWingAttachments(newWingWingAttachments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS, newWingWingAttachments,
					newWingWingAttachments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuelTanksType getWingFuelTanks() {
		return wingFuelTanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingFuelTanks(WingFuelTanksType newWingFuelTanks, NotificationChain msgs) {
		WingFuelTanksType oldWingFuelTanks = wingFuelTanks;
		wingFuelTanks = newWingFuelTanks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS, oldWingFuelTanks, newWingFuelTanks);
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
	public void setWingFuelTanks(WingFuelTanksType newWingFuelTanks) {
		if (newWingFuelTanks != wingFuelTanks) {
			NotificationChain msgs = null;
			if (wingFuelTanks != null)
				msgs = ((InternalEObject) wingFuelTanks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS, null, msgs);
			if (newWingFuelTanks != null)
				msgs = ((InternalEObject) newWingFuelTanks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS, null, msgs);
			msgs = basicSetWingFuelTanks(newWingFuelTanks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS,
					newWingFuelTanks, newWingFuelTanks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingStructuralMountsType getWingStructuralMounts() {
		return wingStructuralMounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingStructuralMounts(WingStructuralMountsType newWingStructuralMounts,
			NotificationChain msgs) {
		WingStructuralMountsType oldWingStructuralMounts = wingStructuralMounts;
		wingStructuralMounts = newWingStructuralMounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS, oldWingStructuralMounts,
					newWingStructuralMounts);
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
	public void setWingStructuralMounts(WingStructuralMountsType newWingStructuralMounts) {
		if (newWingStructuralMounts != wingStructuralMounts) {
			NotificationChain msgs = null;
			if (wingStructuralMounts != null)
				msgs = ((InternalEObject) wingStructuralMounts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS, null,
						msgs);
			if (newWingStructuralMounts != null)
				msgs = ((InternalEObject) newWingStructuralMounts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS, null,
						msgs);
			msgs = basicSetWingStructuralMounts(newWingStructuralMounts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS, newWingStructuralMounts,
					newWingStructuralMounts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_TYPE__UID, oldUID,
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
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID:
			return basicSetFromElementUID(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID:
			return basicSetToElementUID(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE:
			return basicSetStructure(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES:
			return basicSetControlSurfaces(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH:
			return basicSetPath(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS:
			return basicSetWingFuselageAttachments(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS:
			return basicSetWingWingAttachments(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS:
			return basicSetWingFuelTanks(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS:
			return basicSetWingStructuralMounts(null, msgs);
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
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID:
			return getFromElementUID();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID:
			return getToElementUID();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE:
			return getStructure();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES:
			return getControlSurfaces();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH:
			return getPath();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS:
			return getWingFuselageAttachments();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS:
			return getWingWingAttachments();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS:
			return getWingFuelTanks();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS:
			return getWingStructuralMounts();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__UID:
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
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID:
			setFromElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID:
			setToElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE:
			setStructure((WingComponentSegmentStructureType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES:
			setControlSurfaces((ControlSurfacesType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH:
			setPath((ComponentSegmentPathType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS:
			setWingFuselageAttachments((WingFuselageAttachmentsType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS:
			setWingWingAttachments((WingWingAttachmentsType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS:
			setWingFuelTanks((WingFuelTanksType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS:
			setWingStructuralMounts((WingStructuralMountsType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__UID:
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
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID:
			setFromElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID:
			setToElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE:
			setStructure((WingComponentSegmentStructureType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES:
			setControlSurfaces((ControlSurfacesType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH:
			setPath((ComponentSegmentPathType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS:
			setWingFuselageAttachments((WingFuselageAttachmentsType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS:
			setWingWingAttachments((WingWingAttachmentsType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS:
			setWingFuelTanks((WingFuelTanksType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS:
			setWingStructuralMounts((WingStructuralMountsType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__UID:
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
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__FROM_ELEMENT_UID:
			return fromElementUID != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__TO_ELEMENT_UID:
			return toElementUID != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__STRUCTURE:
			return structure != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__CONTROL_SURFACES:
			return controlSurfaces != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__PATH:
			return path != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUSELAGE_ATTACHMENTS:
			return wingFuselageAttachments != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_WING_ATTACHMENTS:
			return wingWingAttachments != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_FUEL_TANKS:
			return wingFuelTanks != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__WING_STRUCTURAL_MOUNTS:
			return wingStructuralMounts != null;
		case CpacsPackage.COMPONENT_SEGMENT_TYPE__UID:
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

} //ComponentSegmentTypeImpl
