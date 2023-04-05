/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EtaIsoLineType;
import Cpacs.LandingGearSupportBeamPositionType;
import Cpacs.XsiIsoLineType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Support Beam Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearSupportBeamPositionTypeImpl#getXsiInside <em>Xsi Inside</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearSupportBeamPositionTypeImpl#getEtaOutside <em>Eta Outside</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearSupportBeamPositionTypeImpl extends ComplexBaseTypeImpl
		implements LandingGearSupportBeamPositionType {
	/**
	 * The cached value of the '{@link #getXsiInside() <em>Xsi Inside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiInside()
	 * @generated
	 * @ordered
	 */
	protected XsiIsoLineType xsiInside;

	/**
	 * The cached value of the '{@link #getEtaOutside() <em>Eta Outside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtaOutside()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType etaOutside;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearSupportBeamPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearSupportBeamPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XsiIsoLineType getXsiInside() {
		return xsiInside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiInside(XsiIsoLineType newXsiInside, NotificationChain msgs) {
		XsiIsoLineType oldXsiInside = xsiInside;
		xsiInside = newXsiInside;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE, oldXsiInside, newXsiInside);
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
	public void setXsiInside(XsiIsoLineType newXsiInside) {
		if (newXsiInside != xsiInside) {
			NotificationChain msgs = null;
			if (xsiInside != null)
				msgs = ((InternalEObject) xsiInside).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE, null,
						msgs);
			if (newXsiInside != null)
				msgs = ((InternalEObject) newXsiInside).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE, null,
						msgs);
			msgs = basicSetXsiInside(newXsiInside, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE, newXsiInside, newXsiInside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEtaOutside() {
		return etaOutside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtaOutside(EtaIsoLineType newEtaOutside, NotificationChain msgs) {
		EtaIsoLineType oldEtaOutside = etaOutside;
		etaOutside = newEtaOutside;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE, oldEtaOutside, newEtaOutside);
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
	public void setEtaOutside(EtaIsoLineType newEtaOutside) {
		if (newEtaOutside != etaOutside) {
			NotificationChain msgs = null;
			if (etaOutside != null)
				msgs = ((InternalEObject) etaOutside).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE,
						null, msgs);
			if (newEtaOutside != null)
				msgs = ((InternalEObject) newEtaOutside).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE,
						null, msgs);
			msgs = basicSetEtaOutside(newEtaOutside, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE, newEtaOutside, newEtaOutside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE:
			return basicSetXsiInside(null, msgs);
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE:
			return basicSetEtaOutside(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE:
			return getXsiInside();
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE:
			return getEtaOutside();
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
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE:
			setXsiInside((XsiIsoLineType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE:
			setEtaOutside((EtaIsoLineType) newValue);
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
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE:
			setXsiInside((XsiIsoLineType) null);
			return;
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE:
			setEtaOutside((EtaIsoLineType) null);
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
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__XSI_INSIDE:
			return xsiInside != null;
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE__ETA_OUTSIDE:
			return etaOutside != null;
		}
		return super.eIsSet(featureID);
	}

} //LandingGearSupportBeamPositionTypeImpl
