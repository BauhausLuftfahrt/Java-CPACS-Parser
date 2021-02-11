/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RotationCurveType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotationCurveTypeImpl#getReferenceSectionUID <em>Reference Section UID</em>}</li>
 *   <li>{@link Cpacs.impl.RotationCurveTypeImpl#getStartZeta <em>Start Zeta</em>}</li>
 *   <li>{@link Cpacs.impl.RotationCurveTypeImpl#getEndZeta <em>End Zeta</em>}</li>
 *   <li>{@link Cpacs.impl.RotationCurveTypeImpl#getStartZetaBlending <em>Start Zeta Blending</em>}</li>
 *   <li>{@link Cpacs.impl.RotationCurveTypeImpl#getEndZetaBlending <em>End Zeta Blending</em>}</li>
 *   <li>{@link Cpacs.impl.RotationCurveTypeImpl#getCurveProfileUID <em>Curve Profile UID</em>}</li>
 *   <li>{@link Cpacs.impl.RotationCurveTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationCurveTypeImpl extends MinimalEObjectImpl.Container implements RotationCurveType {
	/**
	 * The cached value of the '{@link #getReferenceSectionUID() <em>Reference Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSectionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType referenceSectionUID;

	/**
	 * The cached value of the '{@link #getStartZeta() <em>Start Zeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartZeta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType startZeta;

	/**
	 * The cached value of the '{@link #getEndZeta() <em>End Zeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndZeta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType endZeta;

	/**
	 * The cached value of the '{@link #getStartZetaBlending() <em>Start Zeta Blending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartZetaBlending()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType startZetaBlending;

	/**
	 * The cached value of the '{@link #getEndZetaBlending() <em>End Zeta Blending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndZetaBlending()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType endZetaBlending;

	/**
	 * The cached value of the '{@link #getCurveProfileUID() <em>Curve Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveProfileUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType curveProfileUID;

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
	protected RotationCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotationCurveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReferenceSectionUID() {
		return referenceSectionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSectionUID(StringUIDBaseType newReferenceSectionUID,
			NotificationChain msgs) {
		StringUIDBaseType oldReferenceSectionUID = referenceSectionUID;
		referenceSectionUID = newReferenceSectionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID, oldReferenceSectionUID,
					newReferenceSectionUID);
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
	public void setReferenceSectionUID(StringUIDBaseType newReferenceSectionUID) {
		if (newReferenceSectionUID != referenceSectionUID) {
			NotificationChain msgs = null;
			if (referenceSectionUID != null)
				msgs = ((InternalEObject) referenceSectionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID, null, msgs);
			if (newReferenceSectionUID != null)
				msgs = ((InternalEObject) newReferenceSectionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID, null, msgs);
			msgs = basicSetReferenceSectionUID(newReferenceSectionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID, newReferenceSectionUID,
					newReferenceSectionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStartZeta() {
		return startZeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartZeta(DoubleBaseType newStartZeta, NotificationChain msgs) {
		DoubleBaseType oldStartZeta = startZeta;
		startZeta = newStartZeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA, oldStartZeta, newStartZeta);
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
	public void setStartZeta(DoubleBaseType newStartZeta) {
		if (newStartZeta != startZeta) {
			NotificationChain msgs = null;
			if (startZeta != null)
				msgs = ((InternalEObject) startZeta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA, null, msgs);
			if (newStartZeta != null)
				msgs = ((InternalEObject) newStartZeta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA, null, msgs);
			msgs = basicSetStartZeta(newStartZeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA,
					newStartZeta, newStartZeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEndZeta() {
		return endZeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndZeta(DoubleBaseType newEndZeta, NotificationChain msgs) {
		DoubleBaseType oldEndZeta = endZeta;
		endZeta = newEndZeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA, oldEndZeta, newEndZeta);
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
	public void setEndZeta(DoubleBaseType newEndZeta) {
		if (newEndZeta != endZeta) {
			NotificationChain msgs = null;
			if (endZeta != null)
				msgs = ((InternalEObject) endZeta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA, null, msgs);
			if (newEndZeta != null)
				msgs = ((InternalEObject) newEndZeta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA, null, msgs);
			msgs = basicSetEndZeta(newEndZeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA,
					newEndZeta, newEndZeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStartZetaBlending() {
		return startZetaBlending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartZetaBlending(DoubleBaseType newStartZetaBlending, NotificationChain msgs) {
		DoubleBaseType oldStartZetaBlending = startZetaBlending;
		startZetaBlending = newStartZetaBlending;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING, oldStartZetaBlending, newStartZetaBlending);
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
	public void setStartZetaBlending(DoubleBaseType newStartZetaBlending) {
		if (newStartZetaBlending != startZetaBlending) {
			NotificationChain msgs = null;
			if (startZetaBlending != null)
				msgs = ((InternalEObject) startZetaBlending).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING, null, msgs);
			if (newStartZetaBlending != null)
				msgs = ((InternalEObject) newStartZetaBlending).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING, null, msgs);
			msgs = basicSetStartZetaBlending(newStartZetaBlending, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING,
					newStartZetaBlending, newStartZetaBlending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEndZetaBlending() {
		return endZetaBlending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndZetaBlending(DoubleBaseType newEndZetaBlending, NotificationChain msgs) {
		DoubleBaseType oldEndZetaBlending = endZetaBlending;
		endZetaBlending = newEndZetaBlending;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING, oldEndZetaBlending, newEndZetaBlending);
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
	public void setEndZetaBlending(DoubleBaseType newEndZetaBlending) {
		if (newEndZetaBlending != endZetaBlending) {
			NotificationChain msgs = null;
			if (endZetaBlending != null)
				msgs = ((InternalEObject) endZetaBlending).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING, null, msgs);
			if (newEndZetaBlending != null)
				msgs = ((InternalEObject) newEndZetaBlending).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING, null, msgs);
			msgs = basicSetEndZetaBlending(newEndZetaBlending, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING,
					newEndZetaBlending, newEndZetaBlending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCurveProfileUID() {
		return curveProfileUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveProfileUID(StringUIDBaseType newCurveProfileUID, NotificationChain msgs) {
		StringUIDBaseType oldCurveProfileUID = curveProfileUID;
		curveProfileUID = newCurveProfileUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID, oldCurveProfileUID, newCurveProfileUID);
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
	public void setCurveProfileUID(StringUIDBaseType newCurveProfileUID) {
		if (newCurveProfileUID != curveProfileUID) {
			NotificationChain msgs = null;
			if (curveProfileUID != null)
				msgs = ((InternalEObject) curveProfileUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID, null, msgs);
			if (newCurveProfileUID != null)
				msgs = ((InternalEObject) newCurveProfileUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID, null, msgs);
			msgs = basicSetCurveProfileUID(newCurveProfileUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID,
					newCurveProfileUID, newCurveProfileUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTATION_CURVE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID:
			return basicSetReferenceSectionUID(null, msgs);
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA:
			return basicSetStartZeta(null, msgs);
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA:
			return basicSetEndZeta(null, msgs);
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING:
			return basicSetStartZetaBlending(null, msgs);
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING:
			return basicSetEndZetaBlending(null, msgs);
		case CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID:
			return basicSetCurveProfileUID(null, msgs);
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
		case CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID:
			return getReferenceSectionUID();
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA:
			return getStartZeta();
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA:
			return getEndZeta();
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING:
			return getStartZetaBlending();
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING:
			return getEndZetaBlending();
		case CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID:
			return getCurveProfileUID();
		case CpacsPackage.ROTATION_CURVE_TYPE__UID:
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
		case CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID:
			setReferenceSectionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA:
			setStartZeta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA:
			setEndZeta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING:
			setStartZetaBlending((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING:
			setEndZetaBlending((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID:
			setCurveProfileUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__UID:
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
		case CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID:
			setReferenceSectionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA:
			setStartZeta((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA:
			setEndZeta((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING:
			setStartZetaBlending((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING:
			setEndZetaBlending((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID:
			setCurveProfileUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.ROTATION_CURVE_TYPE__UID:
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
		case CpacsPackage.ROTATION_CURVE_TYPE__REFERENCE_SECTION_UID:
			return referenceSectionUID != null;
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA:
			return startZeta != null;
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA:
			return endZeta != null;
		case CpacsPackage.ROTATION_CURVE_TYPE__START_ZETA_BLENDING:
			return startZetaBlending != null;
		case CpacsPackage.ROTATION_CURVE_TYPE__END_ZETA_BLENDING:
			return endZetaBlending != null;
		case CpacsPackage.ROTATION_CURVE_TYPE__CURVE_PROFILE_UID:
			return curveProfileUID != null;
		case CpacsPackage.ROTATION_CURVE_TYPE__UID:
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

} //RotationCurveTypeImpl
