/**
 */
package Cpacs.impl;

import Cpacs.ComponentSegmentStepType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PointXYZType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Segment Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ComponentSegmentStepTypeImpl#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentStepTypeImpl#getHingeTranslation <em>Hinge Translation</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentSegmentStepTypeImpl#getHingeLineRotation <em>Hinge Line Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSegmentStepTypeImpl extends ComplexBaseTypeImpl implements ComponentSegmentStepType {
	/**
	 * The cached value of the '{@link #getControlParameter() <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameter()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType controlParameter;

	/**
	 * The cached value of the '{@link #getHingeTranslation() <em>Hinge Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHingeTranslation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType hingeTranslation;

	/**
	 * The cached value of the '{@link #getHingeLineRotation() <em>Hinge Line Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHingeLineRotation()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType hingeLineRotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSegmentStepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getComponentSegmentStepType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getControlParameter() {
		return controlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameter(DoubleBaseType newControlParameter, NotificationChain msgs) {
		DoubleBaseType oldControlParameter = controlParameter;
		controlParameter = newControlParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER, oldControlParameter,
					newControlParameter);
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
	public void setControlParameter(DoubleBaseType newControlParameter) {
		if (newControlParameter != controlParameter) {
			NotificationChain msgs = null;
			if (controlParameter != null)
				msgs = ((InternalEObject) controlParameter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER, null,
						msgs);
			if (newControlParameter != null)
				msgs = ((InternalEObject) newControlParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER, null,
						msgs);
			msgs = basicSetControlParameter(newControlParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER, newControlParameter,
					newControlParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getHingeTranslation() {
		return hingeTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHingeTranslation(PointXYZType newHingeTranslation, NotificationChain msgs) {
		PointXYZType oldHingeTranslation = hingeTranslation;
		hingeTranslation = newHingeTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION, oldHingeTranslation,
					newHingeTranslation);
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
	public void setHingeTranslation(PointXYZType newHingeTranslation) {
		if (newHingeTranslation != hingeTranslation) {
			NotificationChain msgs = null;
			if (hingeTranslation != null)
				msgs = ((InternalEObject) hingeTranslation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION, null,
						msgs);
			if (newHingeTranslation != null)
				msgs = ((InternalEObject) newHingeTranslation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION, null,
						msgs);
			msgs = basicSetHingeTranslation(newHingeTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION, newHingeTranslation,
					newHingeTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHingeLineRotation() {
		return hingeLineRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHingeLineRotation(DoubleBaseType newHingeLineRotation, NotificationChain msgs) {
		DoubleBaseType oldHingeLineRotation = hingeLineRotation;
		hingeLineRotation = newHingeLineRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION, oldHingeLineRotation,
					newHingeLineRotation);
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
	public void setHingeLineRotation(DoubleBaseType newHingeLineRotation) {
		if (newHingeLineRotation != hingeLineRotation) {
			NotificationChain msgs = null;
			if (hingeLineRotation != null)
				msgs = ((InternalEObject) hingeLineRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION, null,
						msgs);
			if (newHingeLineRotation != null)
				msgs = ((InternalEObject) newHingeLineRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION, null,
						msgs);
			msgs = basicSetHingeLineRotation(newHingeLineRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION, newHingeLineRotation,
					newHingeLineRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER:
			return basicSetControlParameter(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION:
			return basicSetHingeTranslation(null, msgs);
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION:
			return basicSetHingeLineRotation(null, msgs);
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
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER:
			return getControlParameter();
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION:
			return getHingeTranslation();
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION:
			return getHingeLineRotation();
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
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION:
			setHingeTranslation((PointXYZType) newValue);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION:
			setHingeLineRotation((DoubleBaseType) newValue);
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
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION:
			setHingeTranslation((PointXYZType) null);
			return;
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION:
			setHingeLineRotation((DoubleBaseType) null);
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
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__CONTROL_PARAMETER:
			return controlParameter != null;
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_TRANSLATION:
			return hingeTranslation != null;
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE__HINGE_LINE_ROTATION:
			return hingeLineRotation != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentSegmentStepTypeImpl
