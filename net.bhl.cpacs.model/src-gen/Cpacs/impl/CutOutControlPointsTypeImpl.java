/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutOutControlPointType;
import Cpacs.CutOutControlPointsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cut Out Control Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CutOutControlPointsTypeImpl#getInnerBorder <em>Inner Border</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutControlPointsTypeImpl#getOuterBorder <em>Outer Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CutOutControlPointsTypeImpl extends ComplexBaseTypeImpl implements CutOutControlPointsType {
	/**
	 * The cached value of the '{@link #getInnerBorder() <em>Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBorder()
	 * @generated
	 * @ordered
	 */
	protected CutOutControlPointType innerBorder;

	/**
	 * The cached value of the '{@link #getOuterBorder() <em>Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBorder()
	 * @generated
	 * @ordered
	 */
	protected CutOutControlPointType outerBorder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CutOutControlPointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCutOutControlPointsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutControlPointType getInnerBorder() {
		return innerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBorder(CutOutControlPointType newInnerBorder, NotificationChain msgs) {
		CutOutControlPointType oldInnerBorder = innerBorder;
		innerBorder = newInnerBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER, oldInnerBorder, newInnerBorder);
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
	public void setInnerBorder(CutOutControlPointType newInnerBorder) {
		if (newInnerBorder != innerBorder) {
			NotificationChain msgs = null;
			if (innerBorder != null)
				msgs = ((InternalEObject) innerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER, null, msgs);
			if (newInnerBorder != null)
				msgs = ((InternalEObject) newInnerBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER, null, msgs);
			msgs = basicSetInnerBorder(newInnerBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER, newInnerBorder, newInnerBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutControlPointType getOuterBorder() {
		return outerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBorder(CutOutControlPointType newOuterBorder, NotificationChain msgs) {
		CutOutControlPointType oldOuterBorder = outerBorder;
		outerBorder = newOuterBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER, oldOuterBorder, newOuterBorder);
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
	public void setOuterBorder(CutOutControlPointType newOuterBorder) {
		if (newOuterBorder != outerBorder) {
			NotificationChain msgs = null;
			if (outerBorder != null)
				msgs = ((InternalEObject) outerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER, null, msgs);
			if (newOuterBorder != null)
				msgs = ((InternalEObject) newOuterBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER, null, msgs);
			msgs = basicSetOuterBorder(newOuterBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER, newOuterBorder, newOuterBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER:
			return basicSetInnerBorder(null, msgs);
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER:
			return basicSetOuterBorder(null, msgs);
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
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER:
			return getInnerBorder();
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER:
			return getOuterBorder();
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
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER:
			setInnerBorder((CutOutControlPointType) newValue);
			return;
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER:
			setOuterBorder((CutOutControlPointType) newValue);
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
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER:
			setInnerBorder((CutOutControlPointType) null);
			return;
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER:
			setOuterBorder((CutOutControlPointType) null);
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
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__INNER_BORDER:
			return innerBorder != null;
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE__OUTER_BORDER:
			return outerBorder != null;
		}
		return super.eIsSet(featureID);
	}

} //CutOutControlPointsTypeImpl
