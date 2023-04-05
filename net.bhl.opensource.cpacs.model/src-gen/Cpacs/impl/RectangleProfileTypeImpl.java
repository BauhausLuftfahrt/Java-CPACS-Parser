/**
 */
package Cpacs.impl;

import Cpacs.CornerRadiusType;
import Cpacs.CpacsPackage;
import Cpacs.PosExcl0DoubleBaseType;
import Cpacs.RectangleProfileType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RectangleProfileTypeImpl#getCornerRadius <em>Corner Radius</em>}</li>
 *   <li>{@link Cpacs.impl.RectangleProfileTypeImpl#getHeightToWidthRatio <em>Height To Width Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleProfileTypeImpl extends ComplexBaseTypeImpl implements RectangleProfileType {
	/**
	 * The cached value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected CornerRadiusType cornerRadius;

	/**
	 * The cached value of the '{@link #getHeightToWidthRatio() <em>Height To Width Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightToWidthRatio()
	 * @generated
	 * @ordered
	 */
	protected PosExcl0DoubleBaseType heightToWidthRatio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRectangleProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CornerRadiusType getCornerRadius() {
		return cornerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCornerRadius(CornerRadiusType newCornerRadius, NotificationChain msgs) {
		CornerRadiusType oldCornerRadius = cornerRadius;
		cornerRadius = newCornerRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS, oldCornerRadius, newCornerRadius);
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
	public void setCornerRadius(CornerRadiusType newCornerRadius) {
		if (newCornerRadius != cornerRadius) {
			NotificationChain msgs = null;
			if (cornerRadius != null)
				msgs = ((InternalEObject) cornerRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS, null, msgs);
			if (newCornerRadius != null)
				msgs = ((InternalEObject) newCornerRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS, null, msgs);
			msgs = basicSetCornerRadius(newCornerRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS,
					newCornerRadius, newCornerRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosExcl0DoubleBaseType getHeightToWidthRatio() {
		return heightToWidthRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeightToWidthRatio(PosExcl0DoubleBaseType newHeightToWidthRatio,
			NotificationChain msgs) {
		PosExcl0DoubleBaseType oldHeightToWidthRatio = heightToWidthRatio;
		heightToWidthRatio = newHeightToWidthRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO, oldHeightToWidthRatio,
					newHeightToWidthRatio);
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
	public void setHeightToWidthRatio(PosExcl0DoubleBaseType newHeightToWidthRatio) {
		if (newHeightToWidthRatio != heightToWidthRatio) {
			NotificationChain msgs = null;
			if (heightToWidthRatio != null)
				msgs = ((InternalEObject) heightToWidthRatio).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO, null,
						msgs);
			if (newHeightToWidthRatio != null)
				msgs = ((InternalEObject) newHeightToWidthRatio).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO, null,
						msgs);
			msgs = basicSetHeightToWidthRatio(newHeightToWidthRatio, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO, newHeightToWidthRatio,
					newHeightToWidthRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS:
			return basicSetCornerRadius(null, msgs);
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO:
			return basicSetHeightToWidthRatio(null, msgs);
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
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS:
			return getCornerRadius();
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO:
			return getHeightToWidthRatio();
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
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS:
			setCornerRadius((CornerRadiusType) newValue);
			return;
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO:
			setHeightToWidthRatio((PosExcl0DoubleBaseType) newValue);
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
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS:
			setCornerRadius((CornerRadiusType) null);
			return;
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO:
			setHeightToWidthRatio((PosExcl0DoubleBaseType) null);
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
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__CORNER_RADIUS:
			return cornerRadius != null;
		case CpacsPackage.RECTANGLE_PROFILE_TYPE__HEIGHT_TO_WIDTH_RATIO:
			return heightToWidthRatio != null;
		}
		return super.eIsSet(featureID);
	}

} //RectangleProfileTypeImpl
