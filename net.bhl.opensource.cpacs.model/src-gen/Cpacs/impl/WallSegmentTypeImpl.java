/**
 */
package Cpacs.impl;

import Cpacs.BooleanBaseType;
import Cpacs.BoundingElementUIDsType;
import Cpacs.CpacsPackage;
import Cpacs.PhiType;
import Cpacs.StringUIDBaseType;
import Cpacs.WallPositionUIDsType;
import Cpacs.WallSegmentType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WallSegmentTypeImpl#getPhi <em>Phi</em>}</li>
 *   <li>{@link Cpacs.impl.WallSegmentTypeImpl#getDoubleSidedExtrusion <em>Double Sided Extrusion</em>}</li>
 *   <li>{@link Cpacs.impl.WallSegmentTypeImpl#getFlushConnectionStart <em>Flush Connection Start</em>}</li>
 *   <li>{@link Cpacs.impl.WallSegmentTypeImpl#getFlushConnectionEnd <em>Flush Connection End</em>}</li>
 *   <li>{@link Cpacs.impl.WallSegmentTypeImpl#getBoundingElementUIDs <em>Bounding Element UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.WallSegmentTypeImpl#getStructuralWallElementUID <em>Structural Wall Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.WallSegmentTypeImpl#getWallPositionUIDs <em>Wall Position UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.WallSegmentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallSegmentTypeImpl extends MinimalEObjectImpl.Container implements WallSegmentType {
	/**
	 * The cached value of the '{@link #getPhi() <em>Phi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected PhiType phi;

	/**
	 * The cached value of the '{@link #getDoubleSidedExtrusion() <em>Double Sided Extrusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleSidedExtrusion()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType doubleSidedExtrusion;

	/**
	 * The cached value of the '{@link #getFlushConnectionStart() <em>Flush Connection Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushConnectionStart()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType flushConnectionStart;

	/**
	 * The cached value of the '{@link #getFlushConnectionEnd() <em>Flush Connection End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushConnectionEnd()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType flushConnectionEnd;

	/**
	 * The cached value of the '{@link #getBoundingElementUIDs() <em>Bounding Element UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingElementUIDs()
	 * @generated
	 * @ordered
	 */
	protected BoundingElementUIDsType boundingElementUIDs;

	/**
	 * The cached value of the '{@link #getStructuralWallElementUID() <em>Structural Wall Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralWallElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralWallElementUID;

	/**
	 * The cached value of the '{@link #getWallPositionUIDs() <em>Wall Position UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallPositionUIDs()
	 * @generated
	 * @ordered
	 */
	protected WallPositionUIDsType wallPositionUIDs;

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
	protected WallSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWallSegmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhiType getPhi() {
		return phi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhi(PhiType newPhi, NotificationChain msgs) {
		PhiType oldPhi = phi;
		phi = newPhi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__PHI, oldPhi, newPhi);
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
	public void setPhi(PhiType newPhi) {
		if (newPhi != phi) {
			NotificationChain msgs = null;
			if (phi != null)
				msgs = ((InternalEObject) phi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__PHI, null, msgs);
			if (newPhi != null)
				msgs = ((InternalEObject) newPhi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__PHI, null, msgs);
			msgs = basicSetPhi(newPhi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_SEGMENT_TYPE__PHI, newPhi, newPhi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getDoubleSidedExtrusion() {
		return doubleSidedExtrusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoubleSidedExtrusion(BooleanBaseType newDoubleSidedExtrusion,
			NotificationChain msgs) {
		BooleanBaseType oldDoubleSidedExtrusion = doubleSidedExtrusion;
		doubleSidedExtrusion = newDoubleSidedExtrusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION, oldDoubleSidedExtrusion,
					newDoubleSidedExtrusion);
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
	public void setDoubleSidedExtrusion(BooleanBaseType newDoubleSidedExtrusion) {
		if (newDoubleSidedExtrusion != doubleSidedExtrusion) {
			NotificationChain msgs = null;
			if (doubleSidedExtrusion != null)
				msgs = ((InternalEObject) doubleSidedExtrusion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION, null, msgs);
			if (newDoubleSidedExtrusion != null)
				msgs = ((InternalEObject) newDoubleSidedExtrusion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION, null, msgs);
			msgs = basicSetDoubleSidedExtrusion(newDoubleSidedExtrusion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION, newDoubleSidedExtrusion,
					newDoubleSidedExtrusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getFlushConnectionStart() {
		return flushConnectionStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlushConnectionStart(BooleanBaseType newFlushConnectionStart,
			NotificationChain msgs) {
		BooleanBaseType oldFlushConnectionStart = flushConnectionStart;
		flushConnectionStart = newFlushConnectionStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START, oldFlushConnectionStart,
					newFlushConnectionStart);
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
	public void setFlushConnectionStart(BooleanBaseType newFlushConnectionStart) {
		if (newFlushConnectionStart != flushConnectionStart) {
			NotificationChain msgs = null;
			if (flushConnectionStart != null)
				msgs = ((InternalEObject) flushConnectionStart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START, null, msgs);
			if (newFlushConnectionStart != null)
				msgs = ((InternalEObject) newFlushConnectionStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START, null, msgs);
			msgs = basicSetFlushConnectionStart(newFlushConnectionStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START, newFlushConnectionStart,
					newFlushConnectionStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getFlushConnectionEnd() {
		return flushConnectionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlushConnectionEnd(BooleanBaseType newFlushConnectionEnd, NotificationChain msgs) {
		BooleanBaseType oldFlushConnectionEnd = flushConnectionEnd;
		flushConnectionEnd = newFlushConnectionEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END, oldFlushConnectionEnd, newFlushConnectionEnd);
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
	public void setFlushConnectionEnd(BooleanBaseType newFlushConnectionEnd) {
		if (newFlushConnectionEnd != flushConnectionEnd) {
			NotificationChain msgs = null;
			if (flushConnectionEnd != null)
				msgs = ((InternalEObject) flushConnectionEnd).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END, null, msgs);
			if (newFlushConnectionEnd != null)
				msgs = ((InternalEObject) newFlushConnectionEnd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END, null, msgs);
			msgs = basicSetFlushConnectionEnd(newFlushConnectionEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END,
					newFlushConnectionEnd, newFlushConnectionEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingElementUIDsType getBoundingElementUIDs() {
		return boundingElementUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingElementUIDs(BoundingElementUIDsType newBoundingElementUIDs,
			NotificationChain msgs) {
		BoundingElementUIDsType oldBoundingElementUIDs = boundingElementUIDs;
		boundingElementUIDs = newBoundingElementUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS, oldBoundingElementUIDs,
					newBoundingElementUIDs);
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
	public void setBoundingElementUIDs(BoundingElementUIDsType newBoundingElementUIDs) {
		if (newBoundingElementUIDs != boundingElementUIDs) {
			NotificationChain msgs = null;
			if (boundingElementUIDs != null)
				msgs = ((InternalEObject) boundingElementUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS, null, msgs);
			if (newBoundingElementUIDs != null)
				msgs = ((InternalEObject) newBoundingElementUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS, null, msgs);
			msgs = basicSetBoundingElementUIDs(newBoundingElementUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS, newBoundingElementUIDs,
					newBoundingElementUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralWallElementUID() {
		return structuralWallElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralWallElementUID(StringUIDBaseType newStructuralWallElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralWallElementUID = structuralWallElementUID;
		structuralWallElementUID = newStructuralWallElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID, oldStructuralWallElementUID,
					newStructuralWallElementUID);
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
	public void setStructuralWallElementUID(StringUIDBaseType newStructuralWallElementUID) {
		if (newStructuralWallElementUID != structuralWallElementUID) {
			NotificationChain msgs = null;
			if (structuralWallElementUID != null)
				msgs = ((InternalEObject) structuralWallElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID, null,
						msgs);
			if (newStructuralWallElementUID != null)
				msgs = ((InternalEObject) newStructuralWallElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID, null,
						msgs);
			msgs = basicSetStructuralWallElementUID(newStructuralWallElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID, newStructuralWallElementUID,
					newStructuralWallElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallPositionUIDsType getWallPositionUIDs() {
		return wallPositionUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWallPositionUIDs(WallPositionUIDsType newWallPositionUIDs,
			NotificationChain msgs) {
		WallPositionUIDsType oldWallPositionUIDs = wallPositionUIDs;
		wallPositionUIDs = newWallPositionUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS, oldWallPositionUIDs, newWallPositionUIDs);
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
	public void setWallPositionUIDs(WallPositionUIDsType newWallPositionUIDs) {
		if (newWallPositionUIDs != wallPositionUIDs) {
			NotificationChain msgs = null;
			if (wallPositionUIDs != null)
				msgs = ((InternalEObject) wallPositionUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS, null, msgs);
			if (newWallPositionUIDs != null)
				msgs = ((InternalEObject) newWallPositionUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS, null, msgs);
			msgs = basicSetWallPositionUIDs(newWallPositionUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS,
					newWallPositionUIDs, newWallPositionUIDs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALL_SEGMENT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WALL_SEGMENT_TYPE__PHI:
			return basicSetPhi(null, msgs);
		case CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION:
			return basicSetDoubleSidedExtrusion(null, msgs);
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START:
			return basicSetFlushConnectionStart(null, msgs);
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END:
			return basicSetFlushConnectionEnd(null, msgs);
		case CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS:
			return basicSetBoundingElementUIDs(null, msgs);
		case CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID:
			return basicSetStructuralWallElementUID(null, msgs);
		case CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS:
			return basicSetWallPositionUIDs(null, msgs);
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
		case CpacsPackage.WALL_SEGMENT_TYPE__PHI:
			return getPhi();
		case CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION:
			return getDoubleSidedExtrusion();
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START:
			return getFlushConnectionStart();
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END:
			return getFlushConnectionEnd();
		case CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS:
			return getBoundingElementUIDs();
		case CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID:
			return getStructuralWallElementUID();
		case CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS:
			return getWallPositionUIDs();
		case CpacsPackage.WALL_SEGMENT_TYPE__UID:
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
		case CpacsPackage.WALL_SEGMENT_TYPE__PHI:
			setPhi((PhiType) newValue);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION:
			setDoubleSidedExtrusion((BooleanBaseType) newValue);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START:
			setFlushConnectionStart((BooleanBaseType) newValue);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END:
			setFlushConnectionEnd((BooleanBaseType) newValue);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS:
			setBoundingElementUIDs((BoundingElementUIDsType) newValue);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID:
			setStructuralWallElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS:
			setWallPositionUIDs((WallPositionUIDsType) newValue);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__UID:
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
		case CpacsPackage.WALL_SEGMENT_TYPE__PHI:
			setPhi((PhiType) null);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION:
			setDoubleSidedExtrusion((BooleanBaseType) null);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START:
			setFlushConnectionStart((BooleanBaseType) null);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END:
			setFlushConnectionEnd((BooleanBaseType) null);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS:
			setBoundingElementUIDs((BoundingElementUIDsType) null);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID:
			setStructuralWallElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS:
			setWallPositionUIDs((WallPositionUIDsType) null);
			return;
		case CpacsPackage.WALL_SEGMENT_TYPE__UID:
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
		case CpacsPackage.WALL_SEGMENT_TYPE__PHI:
			return phi != null;
		case CpacsPackage.WALL_SEGMENT_TYPE__DOUBLE_SIDED_EXTRUSION:
			return doubleSidedExtrusion != null;
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_START:
			return flushConnectionStart != null;
		case CpacsPackage.WALL_SEGMENT_TYPE__FLUSH_CONNECTION_END:
			return flushConnectionEnd != null;
		case CpacsPackage.WALL_SEGMENT_TYPE__BOUNDING_ELEMENT_UI_DS:
			return boundingElementUIDs != null;
		case CpacsPackage.WALL_SEGMENT_TYPE__STRUCTURAL_WALL_ELEMENT_UID:
			return structuralWallElementUID != null;
		case CpacsPackage.WALL_SEGMENT_TYPE__WALL_POSITION_UI_DS:
			return wallPositionUIDs != null;
		case CpacsPackage.WALL_SEGMENT_TYPE__UID:
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

} //WallSegmentTypeImpl
