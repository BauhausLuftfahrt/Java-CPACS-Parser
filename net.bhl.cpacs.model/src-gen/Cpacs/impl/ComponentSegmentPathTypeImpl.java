/**
 */
package Cpacs.impl;

import Cpacs.ComponentSegmentPathType;
import Cpacs.ComponentSegmentStepsType;
import Cpacs.CpacsPackage;
import Cpacs.EtaXsiRelHeightPointType;
import Cpacs.PointXYZType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Segment Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ComponentSegmentPathTypeImpl#getHingePoint <em>Hinge Point</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentPathTypeImpl#getHingeRotation <em>Hinge Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentPathTypeImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSegmentPathTypeImpl extends ComplexBaseTypeImpl implements ComponentSegmentPathType {
	/**
	 * The cached value of the '{@link #getHingePoint() <em>Hinge Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHingePoint()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiRelHeightPointType hingePoint;

	/**
	 * The cached value of the '{@link #getHingeRotation() <em>Hinge Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHingeRotation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType hingeRotation;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentSegmentStepsType> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSegmentPathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getComponentSegmentPathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType getHingePoint() {
		return hingePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHingePoint(EtaXsiRelHeightPointType newHingePoint, NotificationChain msgs) {
		EtaXsiRelHeightPointType oldHingePoint = hingePoint;
		hingePoint = newHingePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT, oldHingePoint, newHingePoint);
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
	public void setHingePoint(EtaXsiRelHeightPointType newHingePoint) {
		if (newHingePoint != hingePoint) {
			NotificationChain msgs = null;
			if (hingePoint != null)
				msgs = ((InternalEObject) hingePoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT, null, msgs);
			if (newHingePoint != null)
				msgs = ((InternalEObject) newHingePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT, null, msgs);
			msgs = basicSetHingePoint(newHingePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT,
					newHingePoint, newHingePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getHingeRotation() {
		return hingeRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHingeRotation(PointXYZType newHingeRotation, NotificationChain msgs) {
		PointXYZType oldHingeRotation = hingeRotation;
		hingeRotation = newHingeRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION, oldHingeRotation, newHingeRotation);
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
	public void setHingeRotation(PointXYZType newHingeRotation) {
		if (newHingeRotation != hingeRotation) {
			NotificationChain msgs = null;
			if (hingeRotation != null)
				msgs = ((InternalEObject) hingeRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION, null, msgs);
			if (newHingeRotation != null)
				msgs = ((InternalEObject) newHingeRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION, null, msgs);
			msgs = basicSetHingeRotation(newHingeRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION, newHingeRotation, newHingeRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentSegmentStepsType> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<ComponentSegmentStepsType>(ComponentSegmentStepsType.class, this,
					CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT:
			return basicSetHingePoint(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION:
			return basicSetHingeRotation(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT:
			return getHingePoint();
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION:
			return getHingeRotation();
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__STEPS:
			return getSteps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT:
			setHingePoint((EtaXsiRelHeightPointType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION:
			setHingeRotation((PointXYZType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends ComponentSegmentStepsType>) newValue);
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
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT:
			setHingePoint((EtaXsiRelHeightPointType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION:
			setHingeRotation((PointXYZType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__STEPS:
			getSteps().clear();
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
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_POINT:
			return hingePoint != null;
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__HINGE_ROTATION:
			return hingeRotation != null;
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE__STEPS:
			return steps != null && !steps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentSegmentPathTypeImpl
