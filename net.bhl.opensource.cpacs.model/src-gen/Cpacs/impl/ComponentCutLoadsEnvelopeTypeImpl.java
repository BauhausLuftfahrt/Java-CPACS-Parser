/**
 */
package Cpacs.impl;

import Cpacs.ComponentCutLoadsEnvelopeType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.SubLoadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Cut Loads Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ComponentCutLoadsEnvelopeTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentCutLoadsEnvelopeTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link Cpacs.impl.ComponentCutLoadsEnvelopeTypeImpl#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentCutLoadsEnvelopeTypeImpl extends ComplexBaseTypeImpl implements ComponentCutLoadsEnvelopeType {
	/**
	 * The cached value of the '{@link #getParentUID() <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType parentUID;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected SubLoadType max;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected SubLoadType min;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentCutLoadsEnvelopeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getComponentCutLoadsEnvelopeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getParentUID() {
		return parentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentUID(StringUIDBaseType newParentUID, NotificationChain msgs) {
		StringUIDBaseType oldParentUID = parentUID;
		parentUID = newParentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
	public void setParentUID(StringUIDBaseType newParentUID) {
		if (newParentUID != parentUID) {
			NotificationChain msgs = null;
			if (parentUID != null)
				msgs = ((InternalEObject) parentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID, null,
						msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID, null,
						msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID, newParentUID, newParentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLoadType getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(SubLoadType newMax, NotificationChain msgs) {
		SubLoadType oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX, oldMax, newMax);
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
	public void setMax(SubLoadType newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject) max).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject) newMax).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX,
					newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLoadType getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(SubLoadType newMin, NotificationChain msgs) {
		SubLoadType oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN, oldMin, newMin);
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
	public void setMin(SubLoadType newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject) min).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject) newMin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN,
					newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX:
			return basicSetMax(null, msgs);
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN:
			return basicSetMin(null, msgs);
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
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX:
			return getMax();
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN:
			return getMin();
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
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX:
			setMax((SubLoadType) newValue);
			return;
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN:
			setMin((SubLoadType) newValue);
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
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX:
			setMax((SubLoadType) null);
			return;
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN:
			setMin((SubLoadType) null);
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
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MAX:
			return max != null;
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE__MIN:
			return min != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentCutLoadsEnvelopeTypeImpl
