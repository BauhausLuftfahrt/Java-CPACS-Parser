/**
 */
package Cpacs.impl;

import Cpacs.AlignmentStringFrameType;
import Cpacs.ContinuityType1;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.InterpolationType2;
import Cpacs.StringUIDBaseType;
import Cpacs.StringerFramePositionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stringer Frame Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getSectionElementUID <em>Section Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getReferenceY <em>Reference Y</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getReferenceZ <em>Reference Z</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getReferenceAngle <em>Reference Angle</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link Cpacs.impl.StringerFramePositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringerFramePositionTypeImpl extends ComplexBaseTypeImpl implements StringerFramePositionType {
	/**
	 * The cached value of the '{@link #getStructuralElementUID() <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralElementUID;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionX;

	/**
	 * The cached value of the '{@link #getSectionElementUID() <em>Section Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sectionElementUID;

	/**
	 * The cached value of the '{@link #getReferenceY() <em>Reference Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType referenceY;

	/**
	 * The cached value of the '{@link #getReferenceZ() <em>Reference Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType referenceZ;

	/**
	 * The cached value of the '{@link #getReferenceAngle() <em>Reference Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType referenceAngle;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentStringFrameType alignment;

	/**
	 * The cached value of the '{@link #getContinuity() <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuity()
	 * @generated
	 * @ordered
	 */
	protected ContinuityType1 continuity;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected InterpolationType2 interpolation;

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
	protected StringerFramePositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStringerFramePositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralElementUID() {
		return structuralElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralElementUID(StringUIDBaseType newStructuralElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralElementUID = structuralElementUID;
		structuralElementUID = newStructuralElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, oldStructuralElementUID,
					newStructuralElementUID);
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
	public void setStructuralElementUID(StringUIDBaseType newStructuralElementUID) {
		if (newStructuralElementUID != structuralElementUID) {
			NotificationChain msgs = null;
			if (structuralElementUID != null)
				msgs = ((InternalEObject) structuralElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			if (newStructuralElementUID != null)
				msgs = ((InternalEObject) newStructuralElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			msgs = basicSetStructuralElementUID(newStructuralElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, newStructuralElementUID,
					newStructuralElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionX(DoubleBaseType newPositionX, NotificationChain msgs) {
		DoubleBaseType oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X, oldPositionX, newPositionX);
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
	public void setPositionX(DoubleBaseType newPositionX) {
		if (newPositionX != positionX) {
			NotificationChain msgs = null;
			if (positionX != null)
				msgs = ((InternalEObject) positionX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X, null, msgs);
			if (newPositionX != null)
				msgs = ((InternalEObject) newPositionX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X, null, msgs);
			msgs = basicSetPositionX(newPositionX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X,
					newPositionX, newPositionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSectionElementUID() {
		return sectionElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionElementUID(StringUIDBaseType newSectionElementUID, NotificationChain msgs) {
		StringUIDBaseType oldSectionElementUID = sectionElementUID;
		sectionElementUID = newSectionElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID, oldSectionElementUID,
					newSectionElementUID);
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
	public void setSectionElementUID(StringUIDBaseType newSectionElementUID) {
		if (newSectionElementUID != sectionElementUID) {
			NotificationChain msgs = null;
			if (sectionElementUID != null)
				msgs = ((InternalEObject) sectionElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID, null,
						msgs);
			if (newSectionElementUID != null)
				msgs = ((InternalEObject) newSectionElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID, null,
						msgs);
			msgs = basicSetSectionElementUID(newSectionElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID, newSectionElementUID,
					newSectionElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReferenceY() {
		return referenceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceY(DoubleBaseType newReferenceY, NotificationChain msgs) {
		DoubleBaseType oldReferenceY = referenceY;
		referenceY = newReferenceY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y, oldReferenceY, newReferenceY);
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
	public void setReferenceY(DoubleBaseType newReferenceY) {
		if (newReferenceY != referenceY) {
			NotificationChain msgs = null;
			if (referenceY != null)
				msgs = ((InternalEObject) referenceY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y, null, msgs);
			if (newReferenceY != null)
				msgs = ((InternalEObject) newReferenceY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y, null, msgs);
			msgs = basicSetReferenceY(newReferenceY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y, newReferenceY, newReferenceY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReferenceZ() {
		return referenceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceZ(DoubleBaseType newReferenceZ, NotificationChain msgs) {
		DoubleBaseType oldReferenceZ = referenceZ;
		referenceZ = newReferenceZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z, oldReferenceZ, newReferenceZ);
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
	public void setReferenceZ(DoubleBaseType newReferenceZ) {
		if (newReferenceZ != referenceZ) {
			NotificationChain msgs = null;
			if (referenceZ != null)
				msgs = ((InternalEObject) referenceZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z, null, msgs);
			if (newReferenceZ != null)
				msgs = ((InternalEObject) newReferenceZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z, null, msgs);
			msgs = basicSetReferenceZ(newReferenceZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z, newReferenceZ, newReferenceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReferenceAngle() {
		return referenceAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceAngle(DoubleBaseType newReferenceAngle, NotificationChain msgs) {
		DoubleBaseType oldReferenceAngle = referenceAngle;
		referenceAngle = newReferenceAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE, oldReferenceAngle, newReferenceAngle);
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
	public void setReferenceAngle(DoubleBaseType newReferenceAngle) {
		if (newReferenceAngle != referenceAngle) {
			NotificationChain msgs = null;
			if (referenceAngle != null)
				msgs = ((InternalEObject) referenceAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE, null,
						msgs);
			if (newReferenceAngle != null)
				msgs = ((InternalEObject) newReferenceAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE, null,
						msgs);
			msgs = basicSetReferenceAngle(newReferenceAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE, newReferenceAngle, newReferenceAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentStringFrameType getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlignment(AlignmentStringFrameType newAlignment, NotificationChain msgs) {
		AlignmentStringFrameType oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT, oldAlignment, newAlignment);
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
	public void setAlignment(AlignmentStringFrameType newAlignment) {
		if (newAlignment != alignment) {
			NotificationChain msgs = null;
			if (alignment != null)
				msgs = ((InternalEObject) alignment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT, null, msgs);
			if (newAlignment != null)
				msgs = ((InternalEObject) newAlignment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT, null, msgs);
			msgs = basicSetAlignment(newAlignment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT,
					newAlignment, newAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType1 getContinuity() {
		return continuity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuity(ContinuityType1 newContinuity, NotificationChain msgs) {
		ContinuityType1 oldContinuity = continuity;
		continuity = newContinuity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY, oldContinuity, newContinuity);
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
	public void setContinuity(ContinuityType1 newContinuity) {
		if (newContinuity != continuity) {
			NotificationChain msgs = null;
			if (continuity != null)
				msgs = ((InternalEObject) continuity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY, null, msgs);
			if (newContinuity != null)
				msgs = ((InternalEObject) newContinuity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY, null, msgs);
			msgs = basicSetContinuity(newContinuity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY,
					newContinuity, newContinuity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterpolationType2 getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpolation(InterpolationType2 newInterpolation, NotificationChain msgs) {
		InterpolationType2 oldInterpolation = interpolation;
		interpolation = newInterpolation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION, oldInterpolation, newInterpolation);
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
	public void setInterpolation(InterpolationType2 newInterpolation) {
		if (newInterpolation != interpolation) {
			NotificationChain msgs = null;
			if (interpolation != null)
				msgs = ((InternalEObject) interpolation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION, null, msgs);
			if (newInterpolation != null)
				msgs = ((InternalEObject) newInterpolation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION, null, msgs);
			msgs = basicSetInterpolation(newInterpolation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION, newInterpolation, newInterpolation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRINGER_FRAME_POSITION_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return basicSetStructuralElementUID(null, msgs);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X:
			return basicSetPositionX(null, msgs);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID:
			return basicSetSectionElementUID(null, msgs);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y:
			return basicSetReferenceY(null, msgs);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z:
			return basicSetReferenceZ(null, msgs);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE:
			return basicSetReferenceAngle(null, msgs);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT:
			return basicSetAlignment(null, msgs);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY:
			return basicSetContinuity(null, msgs);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION:
			return basicSetInterpolation(null, msgs);
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
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X:
			return getPositionX();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID:
			return getSectionElementUID();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y:
			return getReferenceY();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z:
			return getReferenceZ();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE:
			return getReferenceAngle();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT:
			return getAlignment();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY:
			return getContinuity();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION:
			return getInterpolation();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__UID:
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
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X:
			setPositionX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID:
			setSectionElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y:
			setReferenceY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z:
			setReferenceZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE:
			setReferenceAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentStringFrameType) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY:
			setContinuity((ContinuityType1) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION:
			setInterpolation((InterpolationType2) newValue);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__UID:
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
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X:
			setPositionX((DoubleBaseType) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID:
			setSectionElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y:
			setReferenceY((DoubleBaseType) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z:
			setReferenceZ((DoubleBaseType) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE:
			setReferenceAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentStringFrameType) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY:
			setContinuity((ContinuityType1) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION:
			setInterpolation((InterpolationType2) null);
			return;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__UID:
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
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__POSITION_X:
			return positionX != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__SECTION_ELEMENT_UID:
			return sectionElementUID != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Y:
			return referenceY != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_Z:
			return referenceZ != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__REFERENCE_ANGLE:
			return referenceAngle != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__ALIGNMENT:
			return alignment != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__CONTINUITY:
			return continuity != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__INTERPOLATION:
			return interpolation != null;
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE__UID:
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

} //StringerFramePositionTypeImpl
