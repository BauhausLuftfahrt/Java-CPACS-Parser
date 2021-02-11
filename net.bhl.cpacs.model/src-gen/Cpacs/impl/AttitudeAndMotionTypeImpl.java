/**
 */
package Cpacs.impl;

import Cpacs.AttitudeAndMotionType;
import Cpacs.CpacsPackage;
import Cpacs.LoadCaseRotationType;
import Cpacs.LoadCaseTranslationType;
import Cpacs.PointXYZType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attitude And Motion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AttitudeAndMotionTypeImpl#getRefPointUID <em>Ref Point UID</em>}</li>
 *   <li>{@link Cpacs.impl.AttitudeAndMotionTypeImpl#getRefRotation <em>Ref Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.AttitudeAndMotionTypeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link Cpacs.impl.AttitudeAndMotionTypeImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttitudeAndMotionTypeImpl extends ComplexBaseTypeImpl implements AttitudeAndMotionType {
	/**
	 * The cached value of the '{@link #getRefPointUID() <em>Ref Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPointUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType refPointUID;

	/**
	 * The cached value of the '{@link #getRefRotation() <em>Ref Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRotation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType refRotation;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseTranslationType translation;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseRotationType rotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttitudeAndMotionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAttitudeAndMotionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRefPointUID() {
		return refPointUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefPointUID(StringUIDBaseType newRefPointUID, NotificationChain msgs) {
		StringUIDBaseType oldRefPointUID = refPointUID;
		refPointUID = newRefPointUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID, oldRefPointUID, newRefPointUID);
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
	public void setRefPointUID(StringUIDBaseType newRefPointUID) {
		if (newRefPointUID != refPointUID) {
			NotificationChain msgs = null;
			if (refPointUID != null)
				msgs = ((InternalEObject) refPointUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID, null, msgs);
			if (newRefPointUID != null)
				msgs = ((InternalEObject) newRefPointUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID, null, msgs);
			msgs = basicSetRefPointUID(newRefPointUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID,
					newRefPointUID, newRefPointUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getRefRotation() {
		return refRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefRotation(PointXYZType newRefRotation, NotificationChain msgs) {
		PointXYZType oldRefRotation = refRotation;
		refRotation = newRefRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION, oldRefRotation, newRefRotation);
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
	public void setRefRotation(PointXYZType newRefRotation) {
		if (newRefRotation != refRotation) {
			NotificationChain msgs = null;
			if (refRotation != null)
				msgs = ((InternalEObject) refRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION, null, msgs);
			if (newRefRotation != null)
				msgs = ((InternalEObject) newRefRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION, null, msgs);
			msgs = basicSetRefRotation(newRefRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION,
					newRefRotation, newRefRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseTranslationType getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(LoadCaseTranslationType newTranslation, NotificationChain msgs) {
		LoadCaseTranslationType oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION, oldTranslation, newTranslation);
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
	public void setTranslation(LoadCaseTranslationType newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject) translation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject) newTranslation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION,
					newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseRotationType getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(LoadCaseRotationType newRotation, NotificationChain msgs) {
		LoadCaseRotationType oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION, oldRotation, newRotation);
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
	public void setRotation(LoadCaseRotationType newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION,
					newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID:
			return basicSetRefPointUID(null, msgs);
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION:
			return basicSetRefRotation(null, msgs);
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION:
			return basicSetTranslation(null, msgs);
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION:
			return basicSetRotation(null, msgs);
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
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID:
			return getRefPointUID();
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION:
			return getRefRotation();
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION:
			return getTranslation();
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION:
			return getRotation();
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
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID:
			setRefPointUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION:
			setRefRotation((PointXYZType) newValue);
			return;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION:
			setTranslation((LoadCaseTranslationType) newValue);
			return;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION:
			setRotation((LoadCaseRotationType) newValue);
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
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID:
			setRefPointUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION:
			setRefRotation((PointXYZType) null);
			return;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION:
			setTranslation((LoadCaseTranslationType) null);
			return;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION:
			setRotation((LoadCaseRotationType) null);
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
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_POINT_UID:
			return refPointUID != null;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__REF_ROTATION:
			return refRotation != null;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__TRANSLATION:
			return translation != null;
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE__ROTATION:
			return rotation != null;
		}
		return super.eIsSet(featureID);
	}

} //AttitudeAndMotionTypeImpl
