/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PointAbsRelType;
import Cpacs.PointType;
import Cpacs.TransformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TransformationTypeImpl#getScaling <em>Scaling</em>}</li>
 *   <li>{@link Cpacs.impl.TransformationTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.TransformationTypeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link Cpacs.impl.TransformationTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationTypeImpl extends ComplexBaseTypeImpl implements TransformationType {
	/**
	 * The cached value of the '{@link #getScaling() <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaling()
	 * @generated
	 * @ordered
	 */
	protected PointType scaling;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected PointType rotation;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected PointAbsRelType translation;

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
	protected TransformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTransformationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getScaling() {
		return scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaling(PointType newScaling, NotificationChain msgs) {
		PointType oldScaling = scaling;
		scaling = newScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSFORMATION_TYPE__SCALING, oldScaling, newScaling);
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
	public void setScaling(PointType newScaling) {
		if (newScaling != scaling) {
			NotificationChain msgs = null;
			if (scaling != null)
				msgs = ((InternalEObject) scaling).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION_TYPE__SCALING, null, msgs);
			if (newScaling != null)
				msgs = ((InternalEObject) newScaling).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION_TYPE__SCALING, null, msgs);
			msgs = basicSetScaling(newScaling, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSFORMATION_TYPE__SCALING, newScaling,
					newScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(PointType newRotation, NotificationChain msgs) {
		PointType oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSFORMATION_TYPE__ROTATION, oldRotation, newRotation);
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
	public void setRotation(PointType newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION_TYPE__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION_TYPE__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSFORMATION_TYPE__ROTATION,
					newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointAbsRelType getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(PointAbsRelType newTranslation, NotificationChain msgs) {
		PointAbsRelType oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION, oldTranslation, newTranslation);
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
	public void setTranslation(PointAbsRelType newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject) translation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject) newTranslation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION,
					newTranslation, newTranslation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSFORMATION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRANSFORMATION_TYPE__SCALING:
			return basicSetScaling(null, msgs);
		case CpacsPackage.TRANSFORMATION_TYPE__ROTATION:
			return basicSetRotation(null, msgs);
		case CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION:
			return basicSetTranslation(null, msgs);
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
		case CpacsPackage.TRANSFORMATION_TYPE__SCALING:
			return getScaling();
		case CpacsPackage.TRANSFORMATION_TYPE__ROTATION:
			return getRotation();
		case CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION:
			return getTranslation();
		case CpacsPackage.TRANSFORMATION_TYPE__UID:
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
		case CpacsPackage.TRANSFORMATION_TYPE__SCALING:
			setScaling((PointType) newValue);
			return;
		case CpacsPackage.TRANSFORMATION_TYPE__ROTATION:
			setRotation((PointType) newValue);
			return;
		case CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION:
			setTranslation((PointAbsRelType) newValue);
			return;
		case CpacsPackage.TRANSFORMATION_TYPE__UID:
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
		case CpacsPackage.TRANSFORMATION_TYPE__SCALING:
			setScaling((PointType) null);
			return;
		case CpacsPackage.TRANSFORMATION_TYPE__ROTATION:
			setRotation((PointType) null);
			return;
		case CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION:
			setTranslation((PointAbsRelType) null);
			return;
		case CpacsPackage.TRANSFORMATION_TYPE__UID:
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
		case CpacsPackage.TRANSFORMATION_TYPE__SCALING:
			return scaling != null;
		case CpacsPackage.TRANSFORMATION_TYPE__ROTATION:
			return rotation != null;
		case CpacsPackage.TRANSFORMATION_TYPE__TRANSLATION:
			return translation != null;
		case CpacsPackage.TRANSFORMATION_TYPE__UID:
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

} //TransformationTypeImpl
