/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PointXYType;
import Cpacs.PointZType;
import Cpacs.Transformation2DType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation2 DType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.Transformation2DTypeImpl#getScaling <em>Scaling</em>}</li>
 *   <li>{@link Cpacs.impl.Transformation2DTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.Transformation2DTypeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link Cpacs.impl.Transformation2DTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transformation2DTypeImpl extends ComplexBaseTypeImpl implements Transformation2DType {
	/**
	 * The cached value of the '{@link #getScaling() <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaling()
	 * @generated
	 * @ordered
	 */
	protected PointXYType scaling;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected PointZType rotation;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected PointXYType translation;

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
	protected Transformation2DTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTransformation2DType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYType getScaling() {
		return scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaling(PointXYType newScaling, NotificationChain msgs) {
		PointXYType oldScaling = scaling;
		scaling = newScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSFORMATION2_DTYPE__SCALING, oldScaling, newScaling);
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
	public void setScaling(PointXYType newScaling) {
		if (newScaling != scaling) {
			NotificationChain msgs = null;
			if (scaling != null)
				msgs = ((InternalEObject) scaling).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION2_DTYPE__SCALING, null, msgs);
			if (newScaling != null)
				msgs = ((InternalEObject) newScaling).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION2_DTYPE__SCALING, null, msgs);
			msgs = basicSetScaling(newScaling, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSFORMATION2_DTYPE__SCALING,
					newScaling, newScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointZType getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(PointZType newRotation, NotificationChain msgs) {
		PointZType oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION, oldRotation, newRotation);
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
	public void setRotation(PointZType newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION,
					newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYType getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(PointXYType newTranslation, NotificationChain msgs) {
		PointXYType oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION, oldTranslation, newTranslation);
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
	public void setTranslation(PointXYType newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject) translation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject) newTranslation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRANSFORMATION2_DTYPE__UID, oldUID,
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
		case CpacsPackage.TRANSFORMATION2_DTYPE__SCALING:
			return basicSetScaling(null, msgs);
		case CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION:
			return basicSetRotation(null, msgs);
		case CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION:
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
		case CpacsPackage.TRANSFORMATION2_DTYPE__SCALING:
			return getScaling();
		case CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION:
			return getRotation();
		case CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION:
			return getTranslation();
		case CpacsPackage.TRANSFORMATION2_DTYPE__UID:
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
		case CpacsPackage.TRANSFORMATION2_DTYPE__SCALING:
			setScaling((PointXYType) newValue);
			return;
		case CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION:
			setRotation((PointZType) newValue);
			return;
		case CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION:
			setTranslation((PointXYType) newValue);
			return;
		case CpacsPackage.TRANSFORMATION2_DTYPE__UID:
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
		case CpacsPackage.TRANSFORMATION2_DTYPE__SCALING:
			setScaling((PointXYType) null);
			return;
		case CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION:
			setRotation((PointZType) null);
			return;
		case CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION:
			setTranslation((PointXYType) null);
			return;
		case CpacsPackage.TRANSFORMATION2_DTYPE__UID:
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
		case CpacsPackage.TRANSFORMATION2_DTYPE__SCALING:
			return scaling != null;
		case CpacsPackage.TRANSFORMATION2_DTYPE__ROTATION:
			return rotation != null;
		case CpacsPackage.TRANSFORMATION2_DTYPE__TRANSLATION:
			return translation != null;
		case CpacsPackage.TRANSFORMATION2_DTYPE__UID:
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

} //Transformation2DTypeImpl
