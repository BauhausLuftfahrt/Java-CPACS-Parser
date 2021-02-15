/**
 */
package Cpacs.impl;

import Cpacs.CoefficientsType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.WingCoefficientsType;
import Cpacs.WingSegmentsCoefficientsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingCoefficientsTypeImpl#getWingUID <em>Wing UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingCoefficientsTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.WingCoefficientsTypeImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingCoefficientsTypeImpl extends ComplexBaseTypeImpl implements WingCoefficientsType {
	/**
	 * The cached value of the '{@link #getWingUID() <em>Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType wingUID;

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
	protected WingSegmentsCoefficientsType segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getWingUID() {
		return wingUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingUID(StringUIDBaseType newWingUID, NotificationChain msgs) {
		StringUIDBaseType oldWingUID = wingUID;
		wingUID = newWingUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID, oldWingUID, newWingUID);
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
	public void setWingUID(StringUIDBaseType newWingUID) {
		if (newWingUID != wingUID) {
			NotificationChain msgs = null;
			if (wingUID != null)
				msgs = ((InternalEObject) wingUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID, null, msgs);
			if (newWingUID != null)
				msgs = ((InternalEObject) newWingUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID, null, msgs);
			msgs = basicSetWingUID(newWingUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID,
					newWingUID, newWingUID));
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
					CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS, null, msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS, null, msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS,
					newCoefficients, newCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSegmentsCoefficientsType getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(WingSegmentsCoefficientsType newSegments, NotificationChain msgs) {
		WingSegmentsCoefficientsType oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS, oldSegments, newSegments);
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
	public void setSegments(WingSegmentsCoefficientsType newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject) segments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject) newSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS,
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
		case CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID:
			return basicSetWingUID(null, msgs);
		case CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
		case CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS:
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
		case CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID:
			return getWingUID();
		case CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS:
			return getCoefficients();
		case CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS:
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
		case CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID:
			setWingUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS:
			setCoefficients((CoefficientsType) newValue);
			return;
		case CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS:
			setSegments((WingSegmentsCoefficientsType) newValue);
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
		case CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID:
			setWingUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS:
			setCoefficients((CoefficientsType) null);
			return;
		case CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS:
			setSegments((WingSegmentsCoefficientsType) null);
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
		case CpacsPackage.WING_COEFFICIENTS_TYPE__WING_UID:
			return wingUID != null;
		case CpacsPackage.WING_COEFFICIENTS_TYPE__COEFFICIENTS:
			return coefficients != null;
		case CpacsPackage.WING_COEFFICIENTS_TYPE__SEGMENTS:
			return segments != null;
		}
		return super.eIsSet(featureID);
	}

} //WingCoefficientsTypeImpl
