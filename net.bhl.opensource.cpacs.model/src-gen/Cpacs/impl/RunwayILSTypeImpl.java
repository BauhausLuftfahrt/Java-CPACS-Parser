/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RunwayILSType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runway ILS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RunwayILSTypeImpl#getAntennaPositionLOC <em>Antenna Position LOC</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayILSTypeImpl#getAntennaPositionGS <em>Antenna Position GS</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayILSTypeImpl#getGlidePathAngle <em>Glide Path Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunwayILSTypeImpl extends ComplexBaseTypeImpl implements RunwayILSType {
	/**
	 * The cached value of the '{@link #getAntennaPositionLOC() <em>Antenna Position LOC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntennaPositionLOC()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType antennaPositionLOC;

	/**
	 * The cached value of the '{@link #getAntennaPositionGS() <em>Antenna Position GS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntennaPositionGS()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType antennaPositionGS;

	/**
	 * The cached value of the '{@link #getGlidePathAngle() <em>Glide Path Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlidePathAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType glidePathAngle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunwayILSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRunwayILSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAntennaPositionLOC() {
		return antennaPositionLOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntennaPositionLOC(DoubleBaseType newAntennaPositionLOC, NotificationChain msgs) {
		DoubleBaseType oldAntennaPositionLOC = antennaPositionLOC;
		antennaPositionLOC = newAntennaPositionLOC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC, oldAntennaPositionLOC, newAntennaPositionLOC);
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
	public void setAntennaPositionLOC(DoubleBaseType newAntennaPositionLOC) {
		if (newAntennaPositionLOC != antennaPositionLOC) {
			NotificationChain msgs = null;
			if (antennaPositionLOC != null)
				msgs = ((InternalEObject) antennaPositionLOC).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC, null, msgs);
			if (newAntennaPositionLOC != null)
				msgs = ((InternalEObject) newAntennaPositionLOC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC, null, msgs);
			msgs = basicSetAntennaPositionLOC(newAntennaPositionLOC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC,
					newAntennaPositionLOC, newAntennaPositionLOC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAntennaPositionGS() {
		return antennaPositionGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntennaPositionGS(DoubleBaseType newAntennaPositionGS, NotificationChain msgs) {
		DoubleBaseType oldAntennaPositionGS = antennaPositionGS;
		antennaPositionGS = newAntennaPositionGS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS, oldAntennaPositionGS, newAntennaPositionGS);
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
	public void setAntennaPositionGS(DoubleBaseType newAntennaPositionGS) {
		if (newAntennaPositionGS != antennaPositionGS) {
			NotificationChain msgs = null;
			if (antennaPositionGS != null)
				msgs = ((InternalEObject) antennaPositionGS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS, null, msgs);
			if (newAntennaPositionGS != null)
				msgs = ((InternalEObject) newAntennaPositionGS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS, null, msgs);
			msgs = basicSetAntennaPositionGS(newAntennaPositionGS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS,
					newAntennaPositionGS, newAntennaPositionGS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGlidePathAngle() {
		return glidePathAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlidePathAngle(DoubleBaseType newGlidePathAngle, NotificationChain msgs) {
		DoubleBaseType oldGlidePathAngle = glidePathAngle;
		glidePathAngle = newGlidePathAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE, oldGlidePathAngle, newGlidePathAngle);
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
	public void setGlidePathAngle(DoubleBaseType newGlidePathAngle) {
		if (newGlidePathAngle != glidePathAngle) {
			NotificationChain msgs = null;
			if (glidePathAngle != null)
				msgs = ((InternalEObject) glidePathAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE, null, msgs);
			if (newGlidePathAngle != null)
				msgs = ((InternalEObject) newGlidePathAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE, null, msgs);
			msgs = basicSetGlidePathAngle(newGlidePathAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE,
					newGlidePathAngle, newGlidePathAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC:
			return basicSetAntennaPositionLOC(null, msgs);
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS:
			return basicSetAntennaPositionGS(null, msgs);
		case CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE:
			return basicSetGlidePathAngle(null, msgs);
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
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC:
			return getAntennaPositionLOC();
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS:
			return getAntennaPositionGS();
		case CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE:
			return getGlidePathAngle();
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
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC:
			setAntennaPositionLOC((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS:
			setAntennaPositionGS((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE:
			setGlidePathAngle((DoubleBaseType) newValue);
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
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC:
			setAntennaPositionLOC((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS:
			setAntennaPositionGS((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE:
			setGlidePathAngle((DoubleBaseType) null);
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
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_LOC:
			return antennaPositionLOC != null;
		case CpacsPackage.RUNWAY_ILS_TYPE__ANTENNA_POSITION_GS:
			return antennaPositionGS != null;
		case CpacsPackage.RUNWAY_ILS_TYPE__GLIDE_PATH_ANGLE:
			return glidePathAngle != null;
		}
		return super.eIsSet(featureID);
	}

} //RunwayILSTypeImpl
