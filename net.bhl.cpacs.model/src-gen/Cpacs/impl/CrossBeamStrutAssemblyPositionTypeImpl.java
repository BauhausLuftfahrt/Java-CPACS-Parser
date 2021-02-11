/**
 */
package Cpacs.impl;

import Cpacs.AlignmentCrossBeamType;
import Cpacs.CpacsPackage;
import Cpacs.CrossBeamStrutAssemblyPositionType;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Beam Strut Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CrossBeamStrutAssemblyPositionTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamStrutAssemblyPositionTypeImpl#getFrameUID <em>Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamStrutAssemblyPositionTypeImpl#getCrossBeamUID <em>Cross Beam UID</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamStrutAssemblyPositionTypeImpl#getPositionYAtCrossBeam <em>Position YAt Cross Beam</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamStrutAssemblyPositionTypeImpl#getAngleX <em>Angle X</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamStrutAssemblyPositionTypeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamStrutAssemblyPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossBeamStrutAssemblyPositionTypeImpl extends ComplexBaseTypeImpl
		implements CrossBeamStrutAssemblyPositionType {
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
	 * The cached value of the '{@link #getFrameUID() <em>Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType frameUID;

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
	 * The cached value of the '{@link #getPositionYAtCrossBeam() <em>Position YAt Cross Beam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionYAtCrossBeam()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionYAtCrossBeam;

	/**
	 * The cached value of the '{@link #getAngleX() <em>Angle X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleX;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentCrossBeamType alignment;

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
	protected CrossBeamStrutAssemblyPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCrossBeamStrutAssemblyPositionType();
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
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
					oldStructuralElementUID, newStructuralElementUID);
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
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			if (newStructuralElementUID != null)
				msgs = ((InternalEObject) newStructuralElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			msgs = basicSetStructuralElementUID(newStructuralElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
					newStructuralElementUID, newStructuralElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFrameUID() {
		return frameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrameUID(StringUIDBaseType newFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldFrameUID = frameUID;
		frameUID = newFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID, oldFrameUID, newFrameUID);
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
	public void setFrameUID(StringUIDBaseType newFrameUID) {
		if (newFrameUID != frameUID) {
			NotificationChain msgs = null;
			if (frameUID != null)
				msgs = ((InternalEObject) frameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID, null,
						msgs);
			if (newFrameUID != null)
				msgs = ((InternalEObject) newFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID, null,
						msgs);
			msgs = basicSetFrameUID(newFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID, newFrameUID, newFrameUID));
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
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID, oldCrossBeamUID,
					newCrossBeamUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID,
						null, msgs);
			if (newCrossBeamUID != null)
				msgs = ((InternalEObject) newCrossBeamUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID,
						null, msgs);
			msgs = basicSetCrossBeamUID(newCrossBeamUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID, newCrossBeamUID,
					newCrossBeamUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionYAtCrossBeam() {
		return positionYAtCrossBeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionYAtCrossBeam(DoubleBaseType newPositionYAtCrossBeam,
			NotificationChain msgs) {
		DoubleBaseType oldPositionYAtCrossBeam = positionYAtCrossBeam;
		positionYAtCrossBeam = newPositionYAtCrossBeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM,
					oldPositionYAtCrossBeam, newPositionYAtCrossBeam);
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
	public void setPositionYAtCrossBeam(DoubleBaseType newPositionYAtCrossBeam) {
		if (newPositionYAtCrossBeam != positionYAtCrossBeam) {
			NotificationChain msgs = null;
			if (positionYAtCrossBeam != null)
				msgs = ((InternalEObject) positionYAtCrossBeam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM,
						null, msgs);
			if (newPositionYAtCrossBeam != null)
				msgs = ((InternalEObject) newPositionYAtCrossBeam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM,
						null, msgs);
			msgs = basicSetPositionYAtCrossBeam(newPositionYAtCrossBeam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM,
					newPositionYAtCrossBeam, newPositionYAtCrossBeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleX() {
		return angleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleX(DoubleBaseType newAngleX, NotificationChain msgs) {
		DoubleBaseType oldAngleX = angleX;
		angleX = newAngleX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X, oldAngleX, newAngleX);
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
	public void setAngleX(DoubleBaseType newAngleX) {
		if (newAngleX != angleX) {
			NotificationChain msgs = null;
			if (angleX != null)
				msgs = ((InternalEObject) angleX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X, null,
						msgs);
			if (newAngleX != null)
				msgs = ((InternalEObject) newAngleX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X, null,
						msgs);
			msgs = basicSetAngleX(newAngleX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X, newAngleX, newAngleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentCrossBeamType getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlignment(AlignmentCrossBeamType newAlignment, NotificationChain msgs) {
		AlignmentCrossBeamType oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT, oldAlignment, newAlignment);
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
	public void setAlignment(AlignmentCrossBeamType newAlignment) {
		if (newAlignment != alignment) {
			NotificationChain msgs = null;
			if (alignment != null)
				msgs = ((InternalEObject) alignment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT, null,
						msgs);
			if (newAlignment != null)
				msgs = ((InternalEObject) newAlignment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT, null,
						msgs);
			msgs = basicSetAlignment(newAlignment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT, newAlignment, newAlignment));
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
					CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return basicSetStructuralElementUID(null, msgs);
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return basicSetFrameUID(null, msgs);
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID:
			return basicSetCrossBeamUID(null, msgs);
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM:
			return basicSetPositionYAtCrossBeam(null, msgs);
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			return basicSetAngleX(null, msgs);
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			return basicSetAlignment(null, msgs);
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
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return getFrameUID();
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID:
			return getCrossBeamUID();
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM:
			return getPositionYAtCrossBeam();
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			return getAngleX();
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			return getAlignment();
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			setFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID:
			setCrossBeamUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM:
			setPositionYAtCrossBeam((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			setAngleX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentCrossBeamType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			setFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID:
			setCrossBeamUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM:
			setPositionYAtCrossBeam((DoubleBaseType) null);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			setAngleX((DoubleBaseType) null);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentCrossBeamType) null);
			return;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return frameUID != null;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__CROSS_BEAM_UID:
			return crossBeamUID != null;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__POSITION_YAT_CROSS_BEAM:
			return positionYAtCrossBeam != null;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ANGLE_X:
			return angleX != null;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			return alignment != null;
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE__UID:
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

} //CrossBeamStrutAssemblyPositionTypeImpl
