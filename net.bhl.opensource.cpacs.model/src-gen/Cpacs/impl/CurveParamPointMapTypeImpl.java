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
 *   <li>{@link Cpacs.impl.CurveParamPointMapTypeImpl#getPointIndices <em>Point Indices</em>}</li>
 *   <li>{@link Cpacs.impl.CurveParamPointMapTypeImpl#getParamOnCurve <em>Param On Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveParamPointMapTypeImpl extends ComplexBaseTypeImpl implements CurveParamPointMapType {
	/**
	 * The cached value of the '{@link #getPointIndices() <em>Point Indices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointIndices()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType pointIndices;

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
	public StringVectorBaseType getPointIndices() {
		return pointIndices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointIndices(StringVectorBaseType newPointIndices, NotificationChain msgs) {
		StringVectorBaseType oldPointIndices = pointIndices;
		pointIndices = newPointIndices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES, oldPointIndices, newPointIndices);
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
	public void setPointIndices(StringVectorBaseType newPointIndices) {
		if (newPointIndices != pointIndices) {
			NotificationChain msgs = null;
			if (pointIndices != null)
				msgs = ((InternalEObject) pointIndices).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES, null, msgs);
			if (newPointIndices != null)
				msgs = ((InternalEObject) newPointIndices).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES, null, msgs);
			msgs = basicSetPointIndices(newPointIndices, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES, newPointIndices, newPointIndices));
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES:
			return basicSetPointIndices(null, msgs);
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES:
			return getPointIndices();
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES:
			setPointIndices((StringVectorBaseType) newValue);
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES:
			setPointIndices((StringVectorBaseType) null);
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
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__POINT_INDICES:
			return pointIndices != null;
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE__PARAM_ON_CURVE:
			return paramOnCurve != null;
		}
		return super.eIsSet(featureID);
	}

} //CurveParamPointMapTypeImpl
