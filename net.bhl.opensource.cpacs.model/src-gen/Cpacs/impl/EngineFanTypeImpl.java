/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EngineFanType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Fan Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineFanTypeImpl#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link Cpacs.impl.EngineFanTypeImpl#getOuterRadius <em>Outer Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineFanTypeImpl extends ComplexBaseTypeImpl implements EngineFanType {
	/**
	 * The cached value of the '{@link #getInnerRadius() <em>Inner Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType innerRadius;

	/**
	 * The cached value of the '{@link #getOuterRadius() <em>Outer Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType outerRadius;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineFanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineFanType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getInnerRadius() {
		return innerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerRadius(DoubleBaseType newInnerRadius, NotificationChain msgs) {
		DoubleBaseType oldInnerRadius = innerRadius;
		innerRadius = newInnerRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS, oldInnerRadius, newInnerRadius);
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
	public void setInnerRadius(DoubleBaseType newInnerRadius) {
		if (newInnerRadius != innerRadius) {
			NotificationChain msgs = null;
			if (innerRadius != null)
				msgs = ((InternalEObject) innerRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS, null, msgs);
			if (newInnerRadius != null)
				msgs = ((InternalEObject) newInnerRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS, null, msgs);
			msgs = basicSetInnerRadius(newInnerRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS,
					newInnerRadius, newInnerRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOuterRadius() {
		return outerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterRadius(DoubleBaseType newOuterRadius, NotificationChain msgs) {
		DoubleBaseType oldOuterRadius = outerRadius;
		outerRadius = newOuterRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS, oldOuterRadius, newOuterRadius);
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
	public void setOuterRadius(DoubleBaseType newOuterRadius) {
		if (newOuterRadius != outerRadius) {
			NotificationChain msgs = null;
			if (outerRadius != null)
				msgs = ((InternalEObject) outerRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS, null, msgs);
			if (newOuterRadius != null)
				msgs = ((InternalEObject) newOuterRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS, null, msgs);
			msgs = basicSetOuterRadius(newOuterRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS,
					newOuterRadius, newOuterRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS:
			return basicSetInnerRadius(null, msgs);
		case CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS:
			return basicSetOuterRadius(null, msgs);
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
		case CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS:
			return getInnerRadius();
		case CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS:
			return getOuterRadius();
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
		case CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS:
			setInnerRadius((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS:
			setOuterRadius((DoubleBaseType) newValue);
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
		case CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS:
			setInnerRadius((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS:
			setOuterRadius((DoubleBaseType) null);
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
		case CpacsPackage.ENGINE_FAN_TYPE__INNER_RADIUS:
			return innerRadius != null;
		case CpacsPackage.ENGINE_FAN_TYPE__OUTER_RADIUS:
			return outerRadius != null;
		}
		return super.eIsSet(featureID);
	}

} //EngineFanTypeImpl
