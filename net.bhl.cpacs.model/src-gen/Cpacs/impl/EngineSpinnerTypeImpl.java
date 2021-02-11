/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EngineSpinnerType;
import Cpacs.PointXType;
import Cpacs.PointYType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Spinner Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineSpinnerTypeImpl#getNosePos <em>Nose Pos</em>}</li>
 *   <li>{@link Cpacs.impl.EngineSpinnerTypeImpl#getBasePos <em>Base Pos</em>}</li>
 *   <li>{@link Cpacs.impl.EngineSpinnerTypeImpl#getBaseRadius <em>Base Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineSpinnerTypeImpl extends ComplexBaseTypeImpl implements EngineSpinnerType {
	/**
	 * The cached value of the '{@link #getNosePos() <em>Nose Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNosePos()
	 * @generated
	 * @ordered
	 */
	protected PointXType nosePos;

	/**
	 * The cached value of the '{@link #getBasePos() <em>Base Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePos()
	 * @generated
	 * @ordered
	 */
	protected PointXType basePos;

	/**
	 * The cached value of the '{@link #getBaseRadius() <em>Base Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseRadius()
	 * @generated
	 * @ordered
	 */
	protected PointYType baseRadius;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineSpinnerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineSpinnerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXType getNosePos() {
		return nosePos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNosePos(PointXType newNosePos, NotificationChain msgs) {
		PointXType oldNosePos = nosePos;
		nosePos = newNosePos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS, oldNosePos, newNosePos);
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
	public void setNosePos(PointXType newNosePos) {
		if (newNosePos != nosePos) {
			NotificationChain msgs = null;
			if (nosePos != null)
				msgs = ((InternalEObject) nosePos).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS, null, msgs);
			if (newNosePos != null)
				msgs = ((InternalEObject) newNosePos).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS, null, msgs);
			msgs = basicSetNosePos(newNosePos, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS,
					newNosePos, newNosePos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXType getBasePos() {
		return basePos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasePos(PointXType newBasePos, NotificationChain msgs) {
		PointXType oldBasePos = basePos;
		basePos = newBasePos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS, oldBasePos, newBasePos);
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
	public void setBasePos(PointXType newBasePos) {
		if (newBasePos != basePos) {
			NotificationChain msgs = null;
			if (basePos != null)
				msgs = ((InternalEObject) basePos).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS, null, msgs);
			if (newBasePos != null)
				msgs = ((InternalEObject) newBasePos).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS, null, msgs);
			msgs = basicSetBasePos(newBasePos, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS,
					newBasePos, newBasePos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointYType getBaseRadius() {
		return baseRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseRadius(PointYType newBaseRadius, NotificationChain msgs) {
		PointYType oldBaseRadius = baseRadius;
		baseRadius = newBaseRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS, oldBaseRadius, newBaseRadius);
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
	public void setBaseRadius(PointYType newBaseRadius) {
		if (newBaseRadius != baseRadius) {
			NotificationChain msgs = null;
			if (baseRadius != null)
				msgs = ((InternalEObject) baseRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS, null, msgs);
			if (newBaseRadius != null)
				msgs = ((InternalEObject) newBaseRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS, null, msgs);
			msgs = basicSetBaseRadius(newBaseRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS,
					newBaseRadius, newBaseRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS:
			return basicSetNosePos(null, msgs);
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS:
			return basicSetBasePos(null, msgs);
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS:
			return basicSetBaseRadius(null, msgs);
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
		case CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS:
			return getNosePos();
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS:
			return getBasePos();
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS:
			return getBaseRadius();
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
		case CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS:
			setNosePos((PointXType) newValue);
			return;
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS:
			setBasePos((PointXType) newValue);
			return;
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS:
			setBaseRadius((PointYType) newValue);
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
		case CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS:
			setNosePos((PointXType) null);
			return;
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS:
			setBasePos((PointXType) null);
			return;
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS:
			setBaseRadius((PointYType) null);
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
		case CpacsPackage.ENGINE_SPINNER_TYPE__NOSE_POS:
			return nosePos != null;
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_POS:
			return basePos != null;
		case CpacsPackage.ENGINE_SPINNER_TYPE__BASE_RADIUS:
			return baseRadius != null;
		}
		return super.eIsSet(featureID);
	}

} //EngineSpinnerTypeImpl
