/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StrutWithActuatorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strut With Actuator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StrutWithActuatorTypeImpl#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.impl.StrutWithActuatorTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.StrutWithActuatorTypeImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link Cpacs.impl.StrutWithActuatorTypeImpl#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.impl.StrutWithActuatorTypeImpl#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link Cpacs.impl.StrutWithActuatorTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrutWithActuatorTypeImpl extends ComplexBaseTypeImpl implements StrutWithActuatorType {
	/**
	 * The cached value of the '{@link #getActuatorUID() <em>Actuator UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType actuatorUID;

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
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType radius;

	/**
	 * The cached value of the '{@link #getMaterialUID() <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType materialUID;

	/**
	 * The cached value of the '{@link #getInnerRadius() <em>Inner Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType innerRadius;

	/**
	 * The cached value of the '{@link #getStructuralElementUID() <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralElementUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrutWithActuatorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStrutWithActuatorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getActuatorUID() {
		return actuatorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuatorUID(StringUIDBaseType newActuatorUID, NotificationChain msgs) {
		StringUIDBaseType oldActuatorUID = actuatorUID;
		actuatorUID = newActuatorUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID, oldActuatorUID, newActuatorUID);
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
	public void setActuatorUID(StringUIDBaseType newActuatorUID) {
		if (newActuatorUID != actuatorUID) {
			NotificationChain msgs = null;
			if (actuatorUID != null)
				msgs = ((InternalEObject) actuatorUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID, null, msgs);
			if (newActuatorUID != null)
				msgs = ((InternalEObject) newActuatorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID, null, msgs);
			msgs = basicSetActuatorUID(newActuatorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID,
					newActuatorUID, newActuatorUID));
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
					CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH, oldLength, newLength);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH,
					newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadius(DoubleBaseType newRadius, NotificationChain msgs) {
		DoubleBaseType oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS, oldRadius, newRadius);
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
	public void setRadius(DoubleBaseType newRadius) {
		if (newRadius != radius) {
			NotificationChain msgs = null;
			if (radius != null)
				msgs = ((InternalEObject) radius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS, null, msgs);
			if (newRadius != null)
				msgs = ((InternalEObject) newRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS, null, msgs);
			msgs = basicSetRadius(newRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS,
					newRadius, newRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMaterialUID() {
		return materialUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialUID(StringUIDBaseType newMaterialUID, NotificationChain msgs) {
		StringUIDBaseType oldMaterialUID = materialUID;
		materialUID = newMaterialUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID, oldMaterialUID, newMaterialUID);
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
	public void setMaterialUID(StringUIDBaseType newMaterialUID) {
		if (newMaterialUID != materialUID) {
			NotificationChain msgs = null;
			if (materialUID != null)
				msgs = ((InternalEObject) materialUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID, null, msgs);
			if (newMaterialUID != null)
				msgs = ((InternalEObject) newMaterialUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID, null, msgs);
			msgs = basicSetMaterialUID(newMaterialUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID,
					newMaterialUID, newMaterialUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getInnerRadius() {
		return innerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerRadius(DoubleBaseType newInnerRadius, NotificationChain msgs) {
		DoubleBaseType oldInnerRadius = innerRadius;
		innerRadius = newInnerRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS, oldInnerRadius, newInnerRadius);
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
	public void setInnerRadius(DoubleBaseType newInnerRadius) {
		if (newInnerRadius != innerRadius) {
			NotificationChain msgs = null;
			if (innerRadius != null)
				msgs = ((InternalEObject) innerRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS, null, msgs);
			if (newInnerRadius != null)
				msgs = ((InternalEObject) newInnerRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS, null, msgs);
			msgs = basicSetInnerRadius(newInnerRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS,
					newInnerRadius, newInnerRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralElementUID() {
		return structuralElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralElementUID(StringUIDBaseType newStructuralElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralElementUID = structuralElementUID;
		structuralElementUID = newStructuralElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID, oldStructuralElementUID,
					newStructuralElementUID);
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
	public void setStructuralElementUID(StringUIDBaseType newStructuralElementUID) {
		if (newStructuralElementUID != structuralElementUID) {
			NotificationChain msgs = null;
			if (structuralElementUID != null)
				msgs = ((InternalEObject) structuralElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID, null,
						msgs);
			if (newStructuralElementUID != null)
				msgs = ((InternalEObject) newStructuralElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID, null,
						msgs);
			msgs = basicSetStructuralElementUID(newStructuralElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID, newStructuralElementUID,
					newStructuralElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID:
			return basicSetActuatorUID(null, msgs);
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS:
			return basicSetRadius(null, msgs);
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID:
			return basicSetMaterialUID(null, msgs);
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS:
			return basicSetInnerRadius(null, msgs);
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID:
			return basicSetStructuralElementUID(null, msgs);
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
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID:
			return getActuatorUID();
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS:
			return getRadius();
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID:
			return getMaterialUID();
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS:
			return getInnerRadius();
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
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
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID:
			setActuatorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS:
			setRadius((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS:
			setInnerRadius((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID:
			setActuatorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS:
			setRadius((DoubleBaseType) null);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS:
			setInnerRadius((DoubleBaseType) null);
			return;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) null);
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
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__ACTUATOR_UID:
			return actuatorUID != null;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__RADIUS:
			return radius != null;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__MATERIAL_UID:
			return materialUID != null;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__INNER_RADIUS:
			return innerRadius != null;
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null;
		}
		return super.eIsSet(featureID);
	}

} //StrutWithActuatorTypeImpl
