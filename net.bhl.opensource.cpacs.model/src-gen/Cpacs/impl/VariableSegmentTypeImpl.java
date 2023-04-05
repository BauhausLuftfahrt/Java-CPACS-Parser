/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.VariableConditionsType;
import Cpacs.VariableSegmentType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.VariableSegmentTypeImpl#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.VariableSegmentTypeImpl#getVariableConditions <em>Variable Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableSegmentTypeImpl extends ComplexBaseTypeImpl implements VariableSegmentType {
	/**
	 * The cached value of the '{@link #getSegmentUID() <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType segmentUID;

	/**
	 * The cached value of the '{@link #getVariableConditions() <em>Variable Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableConditions()
	 * @generated
	 * @ordered
	 */
	protected VariableConditionsType variableConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getVariableSegmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSegmentUID() {
		return segmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUID(StringUIDBaseType newSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldSegmentUID = segmentUID;
		segmentUID = newSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID, oldSegmentUID, newSegmentUID);
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
	public void setSegmentUID(StringUIDBaseType newSegmentUID) {
		if (newSegmentUID != segmentUID) {
			NotificationChain msgs = null;
			if (segmentUID != null)
				msgs = ((InternalEObject) segmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID, null, msgs);
			if (newSegmentUID != null)
				msgs = ((InternalEObject) newSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID, null, msgs);
			msgs = basicSetSegmentUID(newSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID,
					newSegmentUID, newSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableConditionsType getVariableConditions() {
		return variableConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableConditions(VariableConditionsType newVariableConditions,
			NotificationChain msgs) {
		VariableConditionsType oldVariableConditions = variableConditions;
		variableConditions = newVariableConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS, oldVariableConditions,
					newVariableConditions);
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
	public void setVariableConditions(VariableConditionsType newVariableConditions) {
		if (newVariableConditions != variableConditions) {
			NotificationChain msgs = null;
			if (variableConditions != null)
				msgs = ((InternalEObject) variableConditions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS, null, msgs);
			if (newVariableConditions != null)
				msgs = ((InternalEObject) newVariableConditions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS, null, msgs);
			msgs = basicSetVariableConditions(newVariableConditions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS, newVariableConditions,
					newVariableConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID:
			return basicSetSegmentUID(null, msgs);
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS:
			return basicSetVariableConditions(null, msgs);
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
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID:
			return getSegmentUID();
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS:
			return getVariableConditions();
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
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS:
			setVariableConditions((VariableConditionsType) newValue);
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
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS:
			setVariableConditions((VariableConditionsType) null);
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
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__SEGMENT_UID:
			return segmentUID != null;
		case CpacsPackage.VARIABLE_SEGMENT_TYPE__VARIABLE_CONDITIONS:
			return variableConditions != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableSegmentTypeImpl
