/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CurveParamPointMapType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Param Point Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CurveParamPointMapTypeImpl#getPointIndex <em>Point Index</em>}</li>
 *   <li>{@link Cpacs.impl.CurveParamPointMapTypeImpl#getParamOnCurve <em>Param On Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveParamPointMapTypeImpl extends ComplexBaseTypeImpl implements CurveParamPointMapType {
	/**
	 * The cached value of the '{@link #getPointIndex() <em>Point Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointIndex()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType pointIndex;

	/**
	 * The cached value of the '{@link #getParamOnCurve() <em>Param On Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamOnCurve()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType paramOnCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveParamPointMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCurveParamPointMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getPointIndex() {
		return pointIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointIndex(StringVectorBaseType newPointIndex, NotificationChain msgs) {
		StringVectorBaseType oldPointIndex = pointIndex;
		pointIndex = newPointIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX, oldPointIndex, newPointIndex);
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
	public void setPointIndex(StringVectorBaseType newPointIndex) {
		if (newPointIndex != pointIndex) {
			NotificationChain msgs = null;
			if (pointIndex != null)
				msgs = ((InternalEObject) pointIndex).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX, null, msgs);
			if (newPointIndex != null)
				msgs = ((InternalEObject) newPointIndex).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX, null, msgs);
			msgs = basicSetPointIndex(newPointIndex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX,
					newPointIndex, newPointIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getParamOnCurve() {
		return paramOnCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamOnCurve(StringVectorBaseType newParamOnCurve, NotificationChain msgs) {
		StringVectorBaseType oldParamOnCurve = paramOnCurve;
		paramOnCurve = newParamOnCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE, oldParamOnCurve, newParamOnCurve);
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
	public void setParamOnCurve(StringVectorBaseType newParamOnCurve) {
		if (newParamOnCurve != paramOnCurve) {
			NotificationChain msgs = null;
			if (paramOnCurve != null)
				msgs = ((InternalEObject) paramOnCurve).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE, null, msgs);
			if (newParamOnCurve != null)
				msgs = ((InternalEObject) newParamOnCurve).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE, null, msgs);
			msgs = basicSetParamOnCurve(newParamOnCurve, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE, newParamOnCurve, newParamOnCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX:
			return basicSetPointIndex(null, msgs);
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE:
			return basicSetParamOnCurve(null, msgs);
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX:
			return getPointIndex();
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE:
			return getParamOnCurve();
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX:
			setPointIndex((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE:
			setParamOnCurve((StringVectorBaseType) newValue);
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX:
			setPointIndex((StringVectorBaseType) null);
			return;
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE:
			setParamOnCurve((StringVectorBaseType) null);
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDEX:
			return pointIndex != null;
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE:
			return paramOnCurve != null;
		}
		return super.eIsSet(featureID);
	}

} //CurveParamPointMapTypeImpl
