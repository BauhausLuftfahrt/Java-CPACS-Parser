/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.GustShapeType;
import Cpacs.LoadCaseGustType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Gust Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseGustTypeImpl#getGustShape <em>Gust Shape</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseGustTypeImpl#getGustAngle <em>Gust Angle</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseGustTypeImpl#getGustLength <em>Gust Length</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseGustTypeImpl#getGustVelocity <em>Gust Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseGustTypeImpl extends ComplexBaseTypeImpl implements LoadCaseGustType {
	/**
	 * The cached value of the '{@link #getGustShape() <em>Gust Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGustShape()
	 * @generated
	 * @ordered
	 */
	protected GustShapeType gustShape;

	/**
	 * The cached value of the '{@link #getGustAngle() <em>Gust Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGustAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gustAngle;

	/**
	 * The cached value of the '{@link #getGustLength() <em>Gust Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGustLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gustLength;

	/**
	 * The cached value of the '{@link #getGustVelocity() <em>Gust Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGustVelocity()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gustVelocity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseGustTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseGustType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GustShapeType getGustShape() {
		return gustShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGustShape(GustShapeType newGustShape, NotificationChain msgs) {
		GustShapeType oldGustShape = gustShape;
		gustShape = newGustShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE, oldGustShape, newGustShape);
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
	public void setGustShape(GustShapeType newGustShape) {
		if (newGustShape != gustShape) {
			NotificationChain msgs = null;
			if (gustShape != null)
				msgs = ((InternalEObject) gustShape).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE, null, msgs);
			if (newGustShape != null)
				msgs = ((InternalEObject) newGustShape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE, null, msgs);
			msgs = basicSetGustShape(newGustShape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE,
					newGustShape, newGustShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGustAngle() {
		return gustAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGustAngle(DoubleBaseType newGustAngle, NotificationChain msgs) {
		DoubleBaseType oldGustAngle = gustAngle;
		gustAngle = newGustAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE, oldGustAngle, newGustAngle);
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
	public void setGustAngle(DoubleBaseType newGustAngle) {
		if (newGustAngle != gustAngle) {
			NotificationChain msgs = null;
			if (gustAngle != null)
				msgs = ((InternalEObject) gustAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE, null, msgs);
			if (newGustAngle != null)
				msgs = ((InternalEObject) newGustAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE, null, msgs);
			msgs = basicSetGustAngle(newGustAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE,
					newGustAngle, newGustAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGustLength() {
		return gustLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGustLength(DoubleBaseType newGustLength, NotificationChain msgs) {
		DoubleBaseType oldGustLength = gustLength;
		gustLength = newGustLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH, oldGustLength, newGustLength);
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
	public void setGustLength(DoubleBaseType newGustLength) {
		if (newGustLength != gustLength) {
			NotificationChain msgs = null;
			if (gustLength != null)
				msgs = ((InternalEObject) gustLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH, null, msgs);
			if (newGustLength != null)
				msgs = ((InternalEObject) newGustLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH, null, msgs);
			msgs = basicSetGustLength(newGustLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH,
					newGustLength, newGustLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGustVelocity() {
		return gustVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGustVelocity(DoubleBaseType newGustVelocity, NotificationChain msgs) {
		DoubleBaseType oldGustVelocity = gustVelocity;
		gustVelocity = newGustVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY, oldGustVelocity, newGustVelocity);
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
	public void setGustVelocity(DoubleBaseType newGustVelocity) {
		if (newGustVelocity != gustVelocity) {
			NotificationChain msgs = null;
			if (gustVelocity != null)
				msgs = ((InternalEObject) gustVelocity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY, null, msgs);
			if (newGustVelocity != null)
				msgs = ((InternalEObject) newGustVelocity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY, null, msgs);
			msgs = basicSetGustVelocity(newGustVelocity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY,
					newGustVelocity, newGustVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE:
			return basicSetGustShape(null, msgs);
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE:
			return basicSetGustAngle(null, msgs);
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH:
			return basicSetGustLength(null, msgs);
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY:
			return basicSetGustVelocity(null, msgs);
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
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE:
			return getGustShape();
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE:
			return getGustAngle();
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH:
			return getGustLength();
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY:
			return getGustVelocity();
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
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE:
			setGustShape((GustShapeType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE:
			setGustAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH:
			setGustLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY:
			setGustVelocity((DoubleBaseType) newValue);
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
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE:
			setGustShape((GustShapeType) null);
			return;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE:
			setGustAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH:
			setGustLength((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY:
			setGustVelocity((DoubleBaseType) null);
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
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_SHAPE:
			return gustShape != null;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_ANGLE:
			return gustAngle != null;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_LENGTH:
			return gustLength != null;
		case CpacsPackage.LOAD_CASE_GUST_TYPE__GUST_VELOCITY:
			return gustVelocity != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseGustTypeImpl
