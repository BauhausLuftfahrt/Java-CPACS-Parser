/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceHingePointType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Hinge Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceHingePointTypeImpl#getHingeXsi <em>Hinge Xsi</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceHingePointTypeImpl#getHingeRelHeight <em>Hinge Rel Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceHingePointTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceHingePointType {
	/**
	 * The cached value of the '{@link #getHingeXsi() <em>Hinge Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHingeXsi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType hingeXsi;

	/**
	 * The cached value of the '{@link #getHingeRelHeight() <em>Hinge Rel Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHingeRelHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType hingeRelHeight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceHingePointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceHingePointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHingeXsi() {
		return hingeXsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHingeXsi(DoubleBaseType newHingeXsi, NotificationChain msgs) {
		DoubleBaseType oldHingeXsi = hingeXsi;
		hingeXsi = newHingeXsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI, oldHingeXsi, newHingeXsi);
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
	public void setHingeXsi(DoubleBaseType newHingeXsi) {
		if (newHingeXsi != hingeXsi) {
			NotificationChain msgs = null;
			if (hingeXsi != null)
				msgs = ((InternalEObject) hingeXsi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI, null, msgs);
			if (newHingeXsi != null)
				msgs = ((InternalEObject) newHingeXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI, null, msgs);
			msgs = basicSetHingeXsi(newHingeXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI, newHingeXsi, newHingeXsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHingeRelHeight() {
		return hingeRelHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHingeRelHeight(DoubleBaseType newHingeRelHeight, NotificationChain msgs) {
		DoubleBaseType oldHingeRelHeight = hingeRelHeight;
		hingeRelHeight = newHingeRelHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT, oldHingeRelHeight,
					newHingeRelHeight);
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
	public void setHingeRelHeight(DoubleBaseType newHingeRelHeight) {
		if (newHingeRelHeight != hingeRelHeight) {
			NotificationChain msgs = null;
			if (hingeRelHeight != null)
				msgs = ((InternalEObject) hingeRelHeight).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT, null,
						msgs);
			if (newHingeRelHeight != null)
				msgs = ((InternalEObject) newHingeRelHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT, null,
						msgs);
			msgs = basicSetHingeRelHeight(newHingeRelHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT, newHingeRelHeight,
					newHingeRelHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI:
			return basicSetHingeXsi(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT:
			return basicSetHingeRelHeight(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI:
			return getHingeXsi();
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT:
			return getHingeRelHeight();
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
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI:
			setHingeXsi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT:
			setHingeRelHeight((DoubleBaseType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI:
			setHingeXsi((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT:
			setHingeRelHeight((DoubleBaseType) null);
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
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_XSI:
			return hingeXsi != null;
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE__HINGE_REL_HEIGHT:
			return hingeRelHeight != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceHingePointTypeImpl
