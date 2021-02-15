/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LoadReferenceType;
import Cpacs.PointXYZType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadReferenceTypeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferenceTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferenceTypeImpl#getJigShapePoint <em>Jig Shape Point</em>}</li>
 *   <li>{@link Cpacs.impl.LoadReferenceTypeImpl#getFlightShapePoint <em>Flight Shape Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadReferenceTypeImpl extends ComplexBaseTypeImpl implements LoadReferenceType {
	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType area;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType length;

	/**
	 * The cached value of the '{@link #getJigShapePoint() <em>Jig Shape Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJigShapePoint()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType jigShapePoint;

	/**
	 * The cached value of the '{@link #getFlightShapePoint() <em>Flight Shape Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightShapePoint()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType flightShapePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadReferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(DoubleBaseType newArea, NotificationChain msgs) {
		DoubleBaseType oldArea = area;
		area = newArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_TYPE__AREA, oldArea, newArea);
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
	public void setArea(DoubleBaseType newArea) {
		if (newArea != area) {
			NotificationChain msgs = null;
			if (area != null)
				msgs = ((InternalEObject) area).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_TYPE__AREA, null, msgs);
			if (newArea != null)
				msgs = ((InternalEObject) newArea).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_TYPE__AREA, null, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_TYPE__AREA, newArea,
					newArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(DoubleBaseType newLength, NotificationChain msgs) {
		DoubleBaseType oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH, oldLength, newLength);
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
	public void setLength(DoubleBaseType newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject) length).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH, newLength,
					newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getJigShapePoint() {
		return jigShapePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJigShapePoint(PointXYZType newJigShapePoint, NotificationChain msgs) {
		PointXYZType oldJigShapePoint = jigShapePoint;
		jigShapePoint = newJigShapePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT, oldJigShapePoint, newJigShapePoint);
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
	public void setJigShapePoint(PointXYZType newJigShapePoint) {
		if (newJigShapePoint != jigShapePoint) {
			NotificationChain msgs = null;
			if (jigShapePoint != null)
				msgs = ((InternalEObject) jigShapePoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT, null, msgs);
			if (newJigShapePoint != null)
				msgs = ((InternalEObject) newJigShapePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT, null, msgs);
			msgs = basicSetJigShapePoint(newJigShapePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT,
					newJigShapePoint, newJigShapePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getFlightShapePoint() {
		return flightShapePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightShapePoint(PointXYZType newFlightShapePoint, NotificationChain msgs) {
		PointXYZType oldFlightShapePoint = flightShapePoint;
		flightShapePoint = newFlightShapePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT, oldFlightShapePoint, newFlightShapePoint);
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
	public void setFlightShapePoint(PointXYZType newFlightShapePoint) {
		if (newFlightShapePoint != flightShapePoint) {
			NotificationChain msgs = null;
			if (flightShapePoint != null)
				msgs = ((InternalEObject) flightShapePoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT, null, msgs);
			if (newFlightShapePoint != null)
				msgs = ((InternalEObject) newFlightShapePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT, null, msgs);
			msgs = basicSetFlightShapePoint(newFlightShapePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT,
					newFlightShapePoint, newFlightShapePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_REFERENCE_TYPE__AREA:
			return basicSetArea(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT:
			return basicSetJigShapePoint(null, msgs);
		case CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT:
			return basicSetFlightShapePoint(null, msgs);
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
		case CpacsPackage.LOAD_REFERENCE_TYPE__AREA:
			return getArea();
		case CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT:
			return getJigShapePoint();
		case CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT:
			return getFlightShapePoint();
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
		case CpacsPackage.LOAD_REFERENCE_TYPE__AREA:
			setArea((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT:
			setJigShapePoint((PointXYZType) newValue);
			return;
		case CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT:
			setFlightShapePoint((PointXYZType) newValue);
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
		case CpacsPackage.LOAD_REFERENCE_TYPE__AREA:
			setArea((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT:
			setJigShapePoint((PointXYZType) null);
			return;
		case CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT:
			setFlightShapePoint((PointXYZType) null);
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
		case CpacsPackage.LOAD_REFERENCE_TYPE__AREA:
			return area != null;
		case CpacsPackage.LOAD_REFERENCE_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.LOAD_REFERENCE_TYPE__JIG_SHAPE_POINT:
			return jigShapePoint != null;
		case CpacsPackage.LOAD_REFERENCE_TYPE__FLIGHT_SHAPE_POINT:
			return flightShapePoint != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadReferenceTypeImpl
