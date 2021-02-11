/**
 */
package Cpacs.impl;

import Cpacs.CoefficientsType;
import Cpacs.CpacsPackage;
import Cpacs.FuselageCoefficientsType;
import Cpacs.FuselageSegmentsCoefficientsType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselage Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageCoefficientsTypeImpl#getFuselageUID <em>Fuselage UID</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCoefficientsTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCoefficientsTypeImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageCoefficientsTypeImpl extends ComplexBaseTypeImpl implements FuselageCoefficientsType {
	/**
	 * The cached value of the '{@link #getFuselageUID() <em>Fuselage UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fuselageUID;

	/**
	 * The cached value of the '{@link #getCoefficients() <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficients()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsType coefficients;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected FuselageSegmentsCoefficientsType segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuselageCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFuselageUID() {
		return fuselageUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselageUID(StringUIDBaseType newFuselageUID, NotificationChain msgs) {
		StringUIDBaseType oldFuselageUID = fuselageUID;
		fuselageUID = newFuselageUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID, oldFuselageUID, newFuselageUID);
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
	public void setFuselageUID(StringUIDBaseType newFuselageUID) {
		if (newFuselageUID != fuselageUID) {
			NotificationChain msgs = null;
			if (fuselageUID != null)
				msgs = ((InternalEObject) fuselageUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID, null, msgs);
			if (newFuselageUID != null)
				msgs = ((InternalEObject) newFuselageUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID, null, msgs);
			msgs = basicSetFuselageUID(newFuselageUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID,
					newFuselageUID, newFuselageUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsType getCoefficients() {
		return coefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoefficients(CoefficientsType newCoefficients, NotificationChain msgs) {
		CoefficientsType oldCoefficients = coefficients;
		coefficients = newCoefficients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
	public void setCoefficients(CoefficientsType newCoefficients) {
		if (newCoefficients != coefficients) {
			NotificationChain msgs = null;
			if (coefficients != null)
				msgs = ((InternalEObject) coefficients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS, null, msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS, null, msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS,
					newCoefficients, newCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSegmentsCoefficientsType getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(FuselageSegmentsCoefficientsType newSegments, NotificationChain msgs) {
		FuselageSegmentsCoefficientsType oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS, oldSegments, newSegments);
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
	public void setSegments(FuselageSegmentsCoefficientsType newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject) segments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject) newSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS,
					newSegments, newSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID:
			return basicSetFuselageUID(null, msgs);
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS:
			return basicSetSegments(null, msgs);
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
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID:
			return getFuselageUID();
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS:
			return getCoefficients();
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS:
			return getSegments();
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
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID:
			setFuselageUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS:
			setCoefficients((CoefficientsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS:
			setSegments((FuselageSegmentsCoefficientsType) newValue);
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
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID:
			setFuselageUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS:
			setCoefficients((CoefficientsType) null);
			return;
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS:
			setSegments((FuselageSegmentsCoefficientsType) null);
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
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__FUSELAGE_UID:
			return fuselageUID != null;
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__COEFFICIENTS:
			return coefficients != null;
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE__SEGMENTS:
			return segments != null;
		}
		return super.eIsSet(featureID);
	}

} //FuselageCoefficientsTypeImpl
