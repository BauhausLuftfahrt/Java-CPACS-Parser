/**
 */
package Cpacs.impl;

import Cpacs.AlignmentStructMemberType;
import Cpacs.ContinuityType2;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.InterpolationType1;
import Cpacs.LongFloorBeamPositionType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Floor Beam Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LongFloorBeamPositionTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.LongFloorBeamPositionTypeImpl#getCrossBeamUID <em>Cross Beam UID</em>}</li>
 *   <li>{@link Cpacs.impl.LongFloorBeamPositionTypeImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link Cpacs.impl.LongFloorBeamPositionTypeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.impl.LongFloorBeamPositionTypeImpl#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.impl.LongFloorBeamPositionTypeImpl#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link Cpacs.impl.LongFloorBeamPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LongFloorBeamPositionTypeImpl extends ComplexBaseTypeImpl implements LongFloorBeamPositionType {
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
	 * The cached value of the '{@link #getCrossBeamUID() <em>Cross Beam UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossBeamUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType crossBeamUID;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionY;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentStructMemberType alignment;

	/**
	 * The cached value of the '{@link #getContinuity() <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuity()
	 * @generated
	 * @ordered
	 */
	protected ContinuityType2 continuity;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected InterpolationType1 interpolation;

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
	protected LongFloorBeamPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLongFloorBeamPositionType();
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
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, oldStructuralElementUID,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			if (newStructuralElementUID != null)
				msgs = ((InternalEObject) newStructuralElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			msgs = basicSetStructuralElementUID(newStructuralElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, newStructuralElementUID,
					newStructuralElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCrossBeamUID() {
		return crossBeamUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossBeamUID(StringUIDBaseType newCrossBeamUID, NotificationChain msgs) {
		StringUIDBaseType oldCrossBeamUID = crossBeamUID;
		crossBeamUID = newCrossBeamUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID, oldCrossBeamUID, newCrossBeamUID);
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
	public void setCrossBeamUID(StringUIDBaseType newCrossBeamUID) {
		if (newCrossBeamUID != crossBeamUID) {
			NotificationChain msgs = null;
			if (crossBeamUID != null)
				msgs = ((InternalEObject) crossBeamUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID, null,
						msgs);
			if (newCrossBeamUID != null)
				msgs = ((InternalEObject) newCrossBeamUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID, null,
						msgs);
			msgs = basicSetCrossBeamUID(newCrossBeamUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID, newCrossBeamUID, newCrossBeamUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionY(DoubleBaseType newPositionY, NotificationChain msgs) {
		DoubleBaseType oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y, oldPositionY, newPositionY);
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
	public void setPositionY(DoubleBaseType newPositionY) {
		if (newPositionY != positionY) {
			NotificationChain msgs = null;
			if (positionY != null)
				msgs = ((InternalEObject) positionY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y, null, msgs);
			if (newPositionY != null)
				msgs = ((InternalEObject) newPositionY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y, null, msgs);
			msgs = basicSetPositionY(newPositionY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y, newPositionY, newPositionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentStructMemberType getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlignment(AlignmentStructMemberType newAlignment, NotificationChain msgs) {
		AlignmentStructMemberType oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT, oldAlignment, newAlignment);
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
	public void setAlignment(AlignmentStructMemberType newAlignment) {
		if (newAlignment != alignment) {
			NotificationChain msgs = null;
			if (alignment != null)
				msgs = ((InternalEObject) alignment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT, null, msgs);
			if (newAlignment != null)
				msgs = ((InternalEObject) newAlignment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT, null, msgs);
			msgs = basicSetAlignment(newAlignment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT,
					newAlignment, newAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType2 getContinuity() {
		return continuity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuity(ContinuityType2 newContinuity, NotificationChain msgs) {
		ContinuityType2 oldContinuity = continuity;
		continuity = newContinuity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY, oldContinuity, newContinuity);
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
	public void setContinuity(ContinuityType2 newContinuity) {
		if (newContinuity != continuity) {
			NotificationChain msgs = null;
			if (continuity != null)
				msgs = ((InternalEObject) continuity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY, null, msgs);
			if (newContinuity != null)
				msgs = ((InternalEObject) newContinuity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY, null, msgs);
			msgs = basicSetContinuity(newContinuity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY, newContinuity, newContinuity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterpolationType1 getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpolation(InterpolationType1 newInterpolation, NotificationChain msgs) {
		InterpolationType1 oldInterpolation = interpolation;
		interpolation = newInterpolation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION, oldInterpolation, newInterpolation);
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
	public void setInterpolation(InterpolationType1 newInterpolation) {
		if (newInterpolation != interpolation) {
			NotificationChain msgs = null;
			if (interpolation != null)
				msgs = ((InternalEObject) interpolation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION, null, msgs);
			if (newInterpolation != null)
				msgs = ((InternalEObject) newInterpolation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION, null, msgs);
			msgs = basicSetInterpolation(newInterpolation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION, newInterpolation, newInterpolation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__UID,
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
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return basicSetStructuralElementUID(null, msgs);
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID:
			return basicSetCrossBeamUID(null, msgs);
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y:
			return basicSetPositionY(null, msgs);
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT:
			return basicSetAlignment(null, msgs);
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY:
			return basicSetContinuity(null, msgs);
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION:
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
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID:
			return getCrossBeamUID();
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y:
			return getPositionY();
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT:
			return getAlignment();
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY:
			return getContinuity();
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION:
			return getInterpolation();
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__UID:
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
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID:
			setCrossBeamUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y:
			setPositionY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentStructMemberType) newValue);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY:
			setContinuity((ContinuityType2) newValue);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION:
			setInterpolation((InterpolationType1) newValue);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__UID:
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
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID:
			setCrossBeamUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y:
			setPositionY((DoubleBaseType) null);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentStructMemberType) null);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY:
			setContinuity((ContinuityType2) null);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION:
			setInterpolation((InterpolationType1) null);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__UID:
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
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CROSS_BEAM_UID:
			return crossBeamUID != null;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__POSITION_Y:
			return positionY != null;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__ALIGNMENT:
			return alignment != null;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__CONTINUITY:
			return continuity != null;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__INTERPOLATION:
			return interpolation != null;
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE__UID:
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

} //LongFloorBeamPositionTypeImpl
