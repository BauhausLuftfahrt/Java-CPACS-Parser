/**
 */
package Cpacs.impl;

import Cpacs.CoefficientReferenceType;
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
 * An implementation of the model object '<em><b>Coefficient Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CoefficientReferenceTypeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientReferenceTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientReferenceTypeImpl#getGeometryPoint <em>Geometry Point</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientReferenceTypeImpl#getDeformationTranslation <em>Deformation Translation</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientReferenceTypeImpl#getDeformationRotation <em>Deformation Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientReferenceTypeImpl extends ComplexBaseTypeImpl implements CoefficientReferenceType {
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
	 * The cached value of the '{@link #getGeometryPoint() <em>Geometry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryPoint()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType geometryPoint;

	/**
	 * The cached value of the '{@link #getDeformationTranslation() <em>Deformation Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeformationTranslation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType deformationTranslation;

	/**
	 * The cached value of the '{@link #getDeformationRotation() <em>Deformation Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeformationRotation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType deformationRotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoefficientReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCoefficientReferenceType();
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
					CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA, oldArea, newArea);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA, null, msgs);
			if (newArea != null)
				msgs = ((InternalEObject) newArea).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA, null, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA,
					newArea, newArea));
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
					CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH, oldLength, newLength);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH,
					newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getGeometryPoint() {
		return geometryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryPoint(PointXYZType newGeometryPoint, NotificationChain msgs) {
		PointXYZType oldGeometryPoint = geometryPoint;
		geometryPoint = newGeometryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT, oldGeometryPoint, newGeometryPoint);
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
	public void setGeometryPoint(PointXYZType newGeometryPoint) {
		if (newGeometryPoint != geometryPoint) {
			NotificationChain msgs = null;
			if (geometryPoint != null)
				msgs = ((InternalEObject) geometryPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT, null, msgs);
			if (newGeometryPoint != null)
				msgs = ((InternalEObject) newGeometryPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT, null, msgs);
			msgs = basicSetGeometryPoint(newGeometryPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT, newGeometryPoint, newGeometryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getDeformationTranslation() {
		return deformationTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeformationTranslation(PointXYZType newDeformationTranslation,
			NotificationChain msgs) {
		PointXYZType oldDeformationTranslation = deformationTranslation;
		deformationTranslation = newDeformationTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION, oldDeformationTranslation,
					newDeformationTranslation);
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
	public void setDeformationTranslation(PointXYZType newDeformationTranslation) {
		if (newDeformationTranslation != deformationTranslation) {
			NotificationChain msgs = null;
			if (deformationTranslation != null)
				msgs = ((InternalEObject) deformationTranslation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION, null,
						msgs);
			if (newDeformationTranslation != null)
				msgs = ((InternalEObject) newDeformationTranslation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION, null,
						msgs);
			msgs = basicSetDeformationTranslation(newDeformationTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION, newDeformationTranslation,
					newDeformationTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getDeformationRotation() {
		return deformationRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeformationRotation(PointXYZType newDeformationRotation, NotificationChain msgs) {
		PointXYZType oldDeformationRotation = deformationRotation;
		deformationRotation = newDeformationRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION, oldDeformationRotation,
					newDeformationRotation);
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
	public void setDeformationRotation(PointXYZType newDeformationRotation) {
		if (newDeformationRotation != deformationRotation) {
			NotificationChain msgs = null;
			if (deformationRotation != null)
				msgs = ((InternalEObject) deformationRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION, null,
						msgs);
			if (newDeformationRotation != null)
				msgs = ((InternalEObject) newDeformationRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION, null,
						msgs);
			msgs = basicSetDeformationRotation(newDeformationRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION, newDeformationRotation,
					newDeformationRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA:
			return basicSetArea(null, msgs);
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT:
			return basicSetGeometryPoint(null, msgs);
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION:
			return basicSetDeformationTranslation(null, msgs);
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION:
			return basicSetDeformationRotation(null, msgs);
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
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA:
			return getArea();
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT:
			return getGeometryPoint();
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION:
			return getDeformationTranslation();
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION:
			return getDeformationRotation();
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
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA:
			setArea((DoubleBaseType) newValue);
			return;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT:
			setGeometryPoint((PointXYZType) newValue);
			return;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION:
			setDeformationTranslation((PointXYZType) newValue);
			return;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION:
			setDeformationRotation((PointXYZType) newValue);
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
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA:
			setArea((DoubleBaseType) null);
			return;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT:
			setGeometryPoint((PointXYZType) null);
			return;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION:
			setDeformationTranslation((PointXYZType) null);
			return;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION:
			setDeformationRotation((PointXYZType) null);
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
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__AREA:
			return area != null;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__GEOMETRY_POINT:
			return geometryPoint != null;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_TRANSLATION:
			return deformationTranslation != null;
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE__DEFORMATION_ROTATION:
			return deformationRotation != null;
		}
		return super.eIsSet(featureID);
	}

} //CoefficientReferenceTypeImpl
