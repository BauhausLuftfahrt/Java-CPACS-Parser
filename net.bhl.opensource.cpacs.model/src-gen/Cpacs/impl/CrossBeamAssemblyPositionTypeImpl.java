/**
 */
package Cpacs.impl;

import Cpacs.AlignmentCrossBeamType;
import Cpacs.CpacsPackage;
import Cpacs.CrossBeamAssemblyPositionType;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Beam Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CrossBeamAssemblyPositionTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamAssemblyPositionTypeImpl#getFrameUID <em>Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamAssemblyPositionTypeImpl#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamAssemblyPositionTypeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.impl.CrossBeamAssemblyPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossBeamAssemblyPositionTypeImpl extends ComplexBaseTypeImpl implements CrossBeamAssemblyPositionType {
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
	 * The cached value of the '{@link #getPositionZ() <em>Position Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionZ;

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
	protected CrossBeamAssemblyPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCrossBeamAssemblyPositionType();
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
					CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, oldStructuralElementUID,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			if (newStructuralElementUID != null)
				msgs = ((InternalEObject) newStructuralElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			msgs = basicSetStructuralElementUID(newStructuralElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, newStructuralElementUID,
					newStructuralElementUID));
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
					CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID, oldFrameUID, newFrameUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID, null, msgs);
			if (newFrameUID != null)
				msgs = ((InternalEObject) newFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID, null, msgs);
			msgs = basicSetFrameUID(newFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID, newFrameUID, newFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionZ() {
		return positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionZ(DoubleBaseType newPositionZ, NotificationChain msgs) {
		DoubleBaseType oldPositionZ = positionZ;
		positionZ = newPositionZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z, oldPositionZ, newPositionZ);
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
	public void setPositionZ(DoubleBaseType newPositionZ) {
		if (newPositionZ != positionZ) {
			NotificationChain msgs = null;
			if (positionZ != null)
				msgs = ((InternalEObject) positionZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z, null,
						msgs);
			if (newPositionZ != null)
				msgs = ((InternalEObject) newPositionZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z, null,
						msgs);
			msgs = basicSetPositionZ(newPositionZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z, newPositionZ, newPositionZ));
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
					CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT, oldAlignment, newAlignment);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT, null, msgs);
			if (newAlignment != null)
				msgs = ((InternalEObject) newAlignment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT, null, msgs);
			msgs = basicSetAlignment(newAlignment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT, newAlignment, newAlignment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__UID,
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
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return basicSetStructuralElementUID(null, msgs);
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return basicSetFrameUID(null, msgs);
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			return basicSetPositionZ(null, msgs);
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
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
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return getFrameUID();
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			return getPositionZ();
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			return getAlignment();
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			setFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			setPositionZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentCrossBeamType) newValue);
			return;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			setFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			setPositionZ((DoubleBaseType) null);
			return;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentCrossBeamType) null);
			return;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__FRAME_UID:
			return frameUID != null;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__POSITION_Z:
			return positionZ != null;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__ALIGNMENT:
			return alignment != null;
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE__UID:
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

} //CrossBeamAssemblyPositionTypeImpl
