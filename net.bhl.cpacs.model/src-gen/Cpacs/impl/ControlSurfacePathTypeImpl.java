/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceHingePointType;
import Cpacs.ControlSurfacePathType;
import Cpacs.ControlSurfaceStepsType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfacePathTypeImpl#getInnerHingePoint <em>Inner Hinge Point</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePathTypeImpl#getOuterHingePoint <em>Outer Hinge Point</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePathTypeImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfacePathTypeImpl extends ComplexBaseTypeImpl implements ControlSurfacePathType {
	/**
	 * The cached value of the '{@link #getInnerHingePoint() <em>Inner Hinge Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerHingePoint()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceHingePointType innerHingePoint;

	/**
	 * The cached value of the '{@link #getOuterHingePoint() <em>Outer Hinge Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterHingePoint()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceHingePointType outerHingePoint;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceStepsType steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfacePathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfacePathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceHingePointType getInnerHingePoint() {
		return innerHingePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerHingePoint(ControlSurfaceHingePointType newInnerHingePoint,
			NotificationChain msgs) {
		ControlSurfaceHingePointType oldInnerHingePoint = innerHingePoint;
		innerHingePoint = newInnerHingePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT, oldInnerHingePoint, newInnerHingePoint);
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
	public void setInnerHingePoint(ControlSurfaceHingePointType newInnerHingePoint) {
		if (newInnerHingePoint != innerHingePoint) {
			NotificationChain msgs = null;
			if (innerHingePoint != null)
				msgs = ((InternalEObject) innerHingePoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT, null, msgs);
			if (newInnerHingePoint != null)
				msgs = ((InternalEObject) newInnerHingePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT, null, msgs);
			msgs = basicSetInnerHingePoint(newInnerHingePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT, newInnerHingePoint, newInnerHingePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceHingePointType getOuterHingePoint() {
		return outerHingePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterHingePoint(ControlSurfaceHingePointType newOuterHingePoint,
			NotificationChain msgs) {
		ControlSurfaceHingePointType oldOuterHingePoint = outerHingePoint;
		outerHingePoint = newOuterHingePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT, oldOuterHingePoint, newOuterHingePoint);
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
	public void setOuterHingePoint(ControlSurfaceHingePointType newOuterHingePoint) {
		if (newOuterHingePoint != outerHingePoint) {
			NotificationChain msgs = null;
			if (outerHingePoint != null)
				msgs = ((InternalEObject) outerHingePoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT, null, msgs);
			if (newOuterHingePoint != null)
				msgs = ((InternalEObject) newOuterHingePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT, null, msgs);
			msgs = basicSetOuterHingePoint(newOuterHingePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT, newOuterHingePoint, newOuterHingePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceStepsType getSteps() {
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteps(ControlSurfaceStepsType newSteps, NotificationChain msgs) {
		ControlSurfaceStepsType oldSteps = steps;
		steps = newSteps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS, oldSteps, newSteps);
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
	public void setSteps(ControlSurfaceStepsType newSteps) {
		if (newSteps != steps) {
			NotificationChain msgs = null;
			if (steps != null)
				msgs = ((InternalEObject) steps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS, null, msgs);
			if (newSteps != null)
				msgs = ((InternalEObject) newSteps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS, null, msgs);
			msgs = basicSetSteps(newSteps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS,
					newSteps, newSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT:
			return basicSetInnerHingePoint(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT:
			return basicSetOuterHingePoint(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS:
			return basicSetSteps(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT:
			return getInnerHingePoint();
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT:
			return getOuterHingePoint();
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS:
			return getSteps();
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
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT:
			setInnerHingePoint((ControlSurfaceHingePointType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT:
			setOuterHingePoint((ControlSurfaceHingePointType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS:
			setSteps((ControlSurfaceStepsType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT:
			setInnerHingePoint((ControlSurfaceHingePointType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT:
			setOuterHingePoint((ControlSurfaceHingePointType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS:
			setSteps((ControlSurfaceStepsType) null);
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
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__INNER_HINGE_POINT:
			return innerHingePoint != null;
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__OUTER_HINGE_POINT:
			return outerHingePoint != null;
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE__STEPS:
			return steps != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfacePathTypeImpl
