/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceStepType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PointType;
import Cpacs.PointXZType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceStepTypeImpl#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceStepTypeImpl#getInnerHingeTranslation <em>Inner Hinge Translation</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceStepTypeImpl#getOuterHingeTranslation <em>Outer Hinge Translation</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceStepTypeImpl#getHingeLineRotation <em>Hinge Line Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceStepTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceStepType {
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
	 * The cached value of the '{@link #getInnerHingeTranslation() <em>Inner Hinge Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerHingeTranslation()
	 * @generated
	 * @ordered
	 */
	protected PointType innerHingeTranslation;

	/**
	 * The cached value of the '{@link #getOuterHingeTranslation() <em>Outer Hinge Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterHingeTranslation()
	 * @generated
	 * @ordered
	 */
	protected PointXZType outerHingeTranslation;

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
	protected ControlSurfaceStepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceStepType();
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
					CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER, oldControlParameter,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER, null, msgs);
			if (newControlParameter != null)
				msgs = ((InternalEObject) newControlParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER, null, msgs);
			msgs = basicSetControlParameter(newControlParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER, newControlParameter,
					newControlParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getInnerHingeTranslation() {
		return innerHingeTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerHingeTranslation(PointType newInnerHingeTranslation, NotificationChain msgs) {
		PointType oldInnerHingeTranslation = innerHingeTranslation;
		innerHingeTranslation = newInnerHingeTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION, oldInnerHingeTranslation,
					newInnerHingeTranslation);
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
	public void setInnerHingeTranslation(PointType newInnerHingeTranslation) {
		if (newInnerHingeTranslation != innerHingeTranslation) {
			NotificationChain msgs = null;
			if (innerHingeTranslation != null)
				msgs = ((InternalEObject) innerHingeTranslation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION, null,
						msgs);
			if (newInnerHingeTranslation != null)
				msgs = ((InternalEObject) newInnerHingeTranslation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION, null,
						msgs);
			msgs = basicSetInnerHingeTranslation(newInnerHingeTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION, newInnerHingeTranslation,
					newInnerHingeTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXZType getOuterHingeTranslation() {
		return outerHingeTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterHingeTranslation(PointXZType newOuterHingeTranslation,
			NotificationChain msgs) {
		PointXZType oldOuterHingeTranslation = outerHingeTranslation;
		outerHingeTranslation = newOuterHingeTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION, oldOuterHingeTranslation,
					newOuterHingeTranslation);
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
	public void setOuterHingeTranslation(PointXZType newOuterHingeTranslation) {
		if (newOuterHingeTranslation != outerHingeTranslation) {
			NotificationChain msgs = null;
			if (outerHingeTranslation != null)
				msgs = ((InternalEObject) outerHingeTranslation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION, null,
						msgs);
			if (newOuterHingeTranslation != null)
				msgs = ((InternalEObject) newOuterHingeTranslation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION, null,
						msgs);
			msgs = basicSetOuterHingeTranslation(newOuterHingeTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION, newOuterHingeTranslation,
					newOuterHingeTranslation));
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
					CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION, oldHingeLineRotation,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION, null,
						msgs);
			if (newHingeLineRotation != null)
				msgs = ((InternalEObject) newHingeLineRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION, null,
						msgs);
			msgs = basicSetHingeLineRotation(newHingeLineRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION, newHingeLineRotation,
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
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER:
			return basicSetControlParameter(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION:
			return basicSetInnerHingeTranslation(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION:
			return basicSetOuterHingeTranslation(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION:
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
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER:
			return getControlParameter();
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION:
			return getInnerHingeTranslation();
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION:
			return getOuterHingeTranslation();
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION:
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
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION:
			setInnerHingeTranslation((PointType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION:
			setOuterHingeTranslation((PointXZType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION:
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
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION:
			setInnerHingeTranslation((PointType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION:
			setOuterHingeTranslation((PointXZType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION:
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
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__CONTROL_PARAMETER:
			return controlParameter != null;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__INNER_HINGE_TRANSLATION:
			return innerHingeTranslation != null;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__OUTER_HINGE_TRANSLATION:
			return outerHingeTranslation != null;
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE__HINGE_LINE_ROTATION:
			return hingeLineRotation != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceStepTypeImpl
