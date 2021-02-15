/**
 */
package Cpacs.impl;

import Cpacs.AlignmentStructMemberType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alignment Struct Member Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AlignmentStructMemberTypeImpl#getOffsetLocX <em>Offset Loc X</em>}</li>
 *   <li>{@link Cpacs.impl.AlignmentStructMemberTypeImpl#getRotationLocX <em>Rotation Loc X</em>}</li>
 *   <li>{@link Cpacs.impl.AlignmentStructMemberTypeImpl#getTranslationLocY <em>Translation Loc Y</em>}</li>
 *   <li>{@link Cpacs.impl.AlignmentStructMemberTypeImpl#getTranslationLocZ <em>Translation Loc Z</em>}</li>
 *   <li>{@link Cpacs.impl.AlignmentStructMemberTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlignmentStructMemberTypeImpl extends ComplexBaseTypeImpl implements AlignmentStructMemberType {
	/**
	 * The cached value of the '{@link #getOffsetLocX() <em>Offset Loc X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetLocX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType offsetLocX;

	/**
	 * The cached value of the '{@link #getRotationLocX() <em>Rotation Loc X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationLocX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rotationLocX;

	/**
	 * The cached value of the '{@link #getTranslationLocY() <em>Translation Loc Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationLocY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType translationLocY;

	/**
	 * The cached value of the '{@link #getTranslationLocZ() <em>Translation Loc Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationLocZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType translationLocZ;

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
	protected AlignmentStructMemberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAlignmentStructMemberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOffsetLocX() {
		return offsetLocX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetLocX(DoubleBaseType newOffsetLocX, NotificationChain msgs) {
		DoubleBaseType oldOffsetLocX = offsetLocX;
		offsetLocX = newOffsetLocX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X, oldOffsetLocX, newOffsetLocX);
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
	public void setOffsetLocX(DoubleBaseType newOffsetLocX) {
		if (newOffsetLocX != offsetLocX) {
			NotificationChain msgs = null;
			if (offsetLocX != null)
				msgs = ((InternalEObject) offsetLocX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X, null, msgs);
			if (newOffsetLocX != null)
				msgs = ((InternalEObject) newOffsetLocX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X, null, msgs);
			msgs = basicSetOffsetLocX(newOffsetLocX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X, newOffsetLocX, newOffsetLocX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRotationLocX() {
		return rotationLocX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationLocX(DoubleBaseType newRotationLocX, NotificationChain msgs) {
		DoubleBaseType oldRotationLocX = rotationLocX;
		rotationLocX = newRotationLocX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X, oldRotationLocX, newRotationLocX);
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
	public void setRotationLocX(DoubleBaseType newRotationLocX) {
		if (newRotationLocX != rotationLocX) {
			NotificationChain msgs = null;
			if (rotationLocX != null)
				msgs = ((InternalEObject) rotationLocX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X, null, msgs);
			if (newRotationLocX != null)
				msgs = ((InternalEObject) newRotationLocX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X, null, msgs);
			msgs = basicSetRotationLocX(newRotationLocX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X, newRotationLocX, newRotationLocX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTranslationLocY() {
		return translationLocY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslationLocY(DoubleBaseType newTranslationLocY, NotificationChain msgs) {
		DoubleBaseType oldTranslationLocY = translationLocY;
		translationLocY = newTranslationLocY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y, oldTranslationLocY,
					newTranslationLocY);
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
	public void setTranslationLocY(DoubleBaseType newTranslationLocY) {
		if (newTranslationLocY != translationLocY) {
			NotificationChain msgs = null;
			if (translationLocY != null)
				msgs = ((InternalEObject) translationLocY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y, null,
						msgs);
			if (newTranslationLocY != null)
				msgs = ((InternalEObject) newTranslationLocY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y, null,
						msgs);
			msgs = basicSetTranslationLocY(newTranslationLocY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y, newTranslationLocY,
					newTranslationLocY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTranslationLocZ() {
		return translationLocZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslationLocZ(DoubleBaseType newTranslationLocZ, NotificationChain msgs) {
		DoubleBaseType oldTranslationLocZ = translationLocZ;
		translationLocZ = newTranslationLocZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z, oldTranslationLocZ,
					newTranslationLocZ);
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
	public void setTranslationLocZ(DoubleBaseType newTranslationLocZ) {
		if (newTranslationLocZ != translationLocZ) {
			NotificationChain msgs = null;
			if (translationLocZ != null)
				msgs = ((InternalEObject) translationLocZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z, null,
						msgs);
			if (newTranslationLocZ != null)
				msgs = ((InternalEObject) newTranslationLocZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z, null,
						msgs);
			msgs = basicSetTranslationLocZ(newTranslationLocZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z, newTranslationLocZ,
					newTranslationLocZ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__UID,
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
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X:
			return basicSetOffsetLocX(null, msgs);
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X:
			return basicSetRotationLocX(null, msgs);
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y:
			return basicSetTranslationLocY(null, msgs);
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z:
			return basicSetTranslationLocZ(null, msgs);
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
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X:
			return getOffsetLocX();
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X:
			return getRotationLocX();
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y:
			return getTranslationLocY();
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z:
			return getTranslationLocZ();
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__UID:
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
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X:
			setOffsetLocX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X:
			setRotationLocX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y:
			setTranslationLocY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z:
			setTranslationLocZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__UID:
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
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X:
			setOffsetLocX((DoubleBaseType) null);
			return;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X:
			setRotationLocX((DoubleBaseType) null);
			return;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y:
			setTranslationLocY((DoubleBaseType) null);
			return;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z:
			setTranslationLocZ((DoubleBaseType) null);
			return;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__UID:
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
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__OFFSET_LOC_X:
			return offsetLocX != null;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__ROTATION_LOC_X:
			return rotationLocX != null;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Y:
			return translationLocY != null;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__TRANSLATION_LOC_Z:
			return translationLocZ != null;
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE__UID:
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

} //AlignmentStructMemberTypeImpl
