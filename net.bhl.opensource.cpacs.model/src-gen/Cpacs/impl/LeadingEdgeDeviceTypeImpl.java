/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceActuatorsType;
import Cpacs.ControlSurfaceOuterShapeLeadingEdgeType;
import Cpacs.ControlSurfacePathType;
import Cpacs.ControlSurfaceTracksType;
import Cpacs.ControlSurfaceWingCutOutType;
import Cpacs.CpacsPackage;
import Cpacs.LeadingEdgeDeviceType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WingComponentSegmentStructureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leading Edge Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getOuterShape <em>Outer Shape</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getWingCutOut <em>Wing Cut Out</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getActuators <em>Actuators</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeDeviceTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeadingEdgeDeviceTypeImpl extends ComplexBaseTypeImpl implements LeadingEdgeDeviceType {
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
	 * The cached value of the '{@link #getOuterShape() <em>Outer Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterShape()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceOuterShapeLeadingEdgeType outerShape;

	/**
	 * The cached value of the '{@link #getWingCutOut() <em>Wing Cut Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingCutOut()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceWingCutOutType wingCutOut;

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
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfacePathType path;

	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceTracksType tracks;

	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceActuatorsType actuators;

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
	protected LeadingEdgeDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLeadingEdgeDeviceType();
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
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME, newName,
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
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION,
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
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID,
					newParentUID, newParentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceOuterShapeLeadingEdgeType getOuterShape() {
		return outerShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterShape(ControlSurfaceOuterShapeLeadingEdgeType newOuterShape,
			NotificationChain msgs) {
		ControlSurfaceOuterShapeLeadingEdgeType oldOuterShape = outerShape;
		outerShape = newOuterShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE, oldOuterShape, newOuterShape);
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
	public void setOuterShape(ControlSurfaceOuterShapeLeadingEdgeType newOuterShape) {
		if (newOuterShape != outerShape) {
			NotificationChain msgs = null;
			if (outerShape != null)
				msgs = ((InternalEObject) outerShape).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE, null, msgs);
			if (newOuterShape != null)
				msgs = ((InternalEObject) newOuterShape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE, null, msgs);
			msgs = basicSetOuterShape(newOuterShape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE,
					newOuterShape, newOuterShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceWingCutOutType getWingCutOut() {
		return wingCutOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingCutOut(ControlSurfaceWingCutOutType newWingCutOut, NotificationChain msgs) {
		ControlSurfaceWingCutOutType oldWingCutOut = wingCutOut;
		wingCutOut = newWingCutOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT, oldWingCutOut, newWingCutOut);
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
	public void setWingCutOut(ControlSurfaceWingCutOutType newWingCutOut) {
		if (newWingCutOut != wingCutOut) {
			NotificationChain msgs = null;
			if (wingCutOut != null)
				msgs = ((InternalEObject) wingCutOut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT, null, msgs);
			if (newWingCutOut != null)
				msgs = ((InternalEObject) newWingCutOut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT, null, msgs);
			msgs = basicSetWingCutOut(newWingCutOut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT,
					newWingCutOut, newWingCutOut));
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
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE, oldStructure, newStructure);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject) newStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE,
					newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfacePathType getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(ControlSurfacePathType newPath, NotificationChain msgs) {
		ControlSurfacePathType oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH, oldPath, newPath);
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
	public void setPath(ControlSurfacePathType newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject) path).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject) newPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH, newPath,
					newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceTracksType getTracks() {
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTracks(ControlSurfaceTracksType newTracks, NotificationChain msgs) {
		ControlSurfaceTracksType oldTracks = tracks;
		tracks = newTracks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS, oldTracks, newTracks);
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
	public void setTracks(ControlSurfaceTracksType newTracks) {
		if (newTracks != tracks) {
			NotificationChain msgs = null;
			if (tracks != null)
				msgs = ((InternalEObject) tracks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS, null, msgs);
			if (newTracks != null)
				msgs = ((InternalEObject) newTracks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS, null, msgs);
			msgs = basicSetTracks(newTracks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS,
					newTracks, newTracks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceActuatorsType getActuators() {
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuators(ControlSurfaceActuatorsType newActuators, NotificationChain msgs) {
		ControlSurfaceActuatorsType oldActuators = actuators;
		actuators = newActuators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS, oldActuators, newActuators);
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
	public void setActuators(ControlSurfaceActuatorsType newActuators) {
		if (newActuators != actuators) {
			NotificationChain msgs = null;
			if (actuators != null)
				msgs = ((InternalEObject) actuators).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS, null, msgs);
			if (newActuators != null)
				msgs = ((InternalEObject) newActuators).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS, null, msgs);
			msgs = basicSetActuators(newActuators, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS,
					newActuators, newActuators));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_DEVICE_TYPE__UID, oldUID,
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
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE:
			return basicSetOuterShape(null, msgs);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT:
			return basicSetWingCutOut(null, msgs);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE:
			return basicSetStructure(null, msgs);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH:
			return basicSetPath(null, msgs);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS:
			return basicSetTracks(null, msgs);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS:
			return basicSetActuators(null, msgs);
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
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME:
			return getName();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE:
			return getOuterShape();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT:
			return getWingCutOut();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE:
			return getStructure();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH:
			return getPath();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS:
			return getTracks();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS:
			return getActuators();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__UID:
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
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE:
			setOuterShape((ControlSurfaceOuterShapeLeadingEdgeType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT:
			setWingCutOut((ControlSurfaceWingCutOutType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE:
			setStructure((WingComponentSegmentStructureType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH:
			setPath((ControlSurfacePathType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS:
			setTracks((ControlSurfaceTracksType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS:
			setActuators((ControlSurfaceActuatorsType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__UID:
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
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE:
			setOuterShape((ControlSurfaceOuterShapeLeadingEdgeType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT:
			setWingCutOut((ControlSurfaceWingCutOutType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE:
			setStructure((WingComponentSegmentStructureType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH:
			setPath((ControlSurfacePathType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS:
			setTracks((ControlSurfaceTracksType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS:
			setActuators((ControlSurfaceActuatorsType) null);
			return;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__UID:
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
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__NAME:
			return name != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__OUTER_SHAPE:
			return outerShape != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__WING_CUT_OUT:
			return wingCutOut != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__STRUCTURE:
			return structure != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__PATH:
			return path != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__TRACKS:
			return tracks != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__ACTUATORS:
			return actuators != null;
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE__UID:
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

} //LeadingEdgeDeviceTypeImpl
