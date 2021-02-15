/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceSkinCutOutType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Skin Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceSkinCutOutTypeImpl#getXsiInnerBorder <em>Xsi Inner Border</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceSkinCutOutTypeImpl#getXsiOuterBorder <em>Xsi Outer Border</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceSkinCutOutTypeImpl#getSparUID <em>Spar UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceSkinCutOutTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceSkinCutOutType {
	/**
	 * The cached value of the '{@link #getXsiInnerBorder() <em>Xsi Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiInnerBorder()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsiInnerBorder;

	/**
	 * The cached value of the '{@link #getXsiOuterBorder() <em>Xsi Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiOuterBorder()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsiOuterBorder;

	/**
	 * The cached value of the '{@link #getSparUID() <em>Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sparUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceSkinCutOutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceSkinCutOutType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsiInnerBorder() {
		return xsiInnerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiInnerBorder(DoubleBaseType newXsiInnerBorder, NotificationChain msgs) {
		DoubleBaseType oldXsiInnerBorder = xsiInnerBorder;
		xsiInnerBorder = newXsiInnerBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER, oldXsiInnerBorder,
					newXsiInnerBorder);
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
	public void setXsiInnerBorder(DoubleBaseType newXsiInnerBorder) {
		if (newXsiInnerBorder != xsiInnerBorder) {
			NotificationChain msgs = null;
			if (xsiInnerBorder != null)
				msgs = ((InternalEObject) xsiInnerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER, null,
						msgs);
			if (newXsiInnerBorder != null)
				msgs = ((InternalEObject) newXsiInnerBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER, null,
						msgs);
			msgs = basicSetXsiInnerBorder(newXsiInnerBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER, newXsiInnerBorder,
					newXsiInnerBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsiOuterBorder() {
		return xsiOuterBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiOuterBorder(DoubleBaseType newXsiOuterBorder, NotificationChain msgs) {
		DoubleBaseType oldXsiOuterBorder = xsiOuterBorder;
		xsiOuterBorder = newXsiOuterBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER, oldXsiOuterBorder,
					newXsiOuterBorder);
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
	public void setXsiOuterBorder(DoubleBaseType newXsiOuterBorder) {
		if (newXsiOuterBorder != xsiOuterBorder) {
			NotificationChain msgs = null;
			if (xsiOuterBorder != null)
				msgs = ((InternalEObject) xsiOuterBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER, null,
						msgs);
			if (newXsiOuterBorder != null)
				msgs = ((InternalEObject) newXsiOuterBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER, null,
						msgs);
			msgs = basicSetXsiOuterBorder(newXsiOuterBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER, newXsiOuterBorder,
					newXsiOuterBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSparUID() {
		return sparUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparUID(StringUIDBaseType newSparUID, NotificationChain msgs) {
		StringUIDBaseType oldSparUID = sparUID;
		sparUID = newSparUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID, oldSparUID, newSparUID);
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
	public void setSparUID(StringUIDBaseType newSparUID) {
		if (newSparUID != sparUID) {
			NotificationChain msgs = null;
			if (sparUID != null)
				msgs = ((InternalEObject) sparUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID, null, msgs);
			if (newSparUID != null)
				msgs = ((InternalEObject) newSparUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID, null, msgs);
			msgs = basicSetSparUID(newSparUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID, newSparUID, newSparUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER:
			return basicSetXsiInnerBorder(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER:
			return basicSetXsiOuterBorder(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID:
			return basicSetSparUID(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER:
			return getXsiInnerBorder();
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER:
			return getXsiOuterBorder();
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID:
			return getSparUID();
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
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER:
			setXsiInnerBorder((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER:
			setXsiOuterBorder((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID:
			setSparUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER:
			setXsiInnerBorder((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER:
			setXsiOuterBorder((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID:
			setSparUID((StringUIDBaseType) null);
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
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_INNER_BORDER:
			return xsiInnerBorder != null;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__XSI_OUTER_BORDER:
			return xsiOuterBorder != null;
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE__SPAR_UID:
			return sparUID != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceSkinCutOutTypeImpl
