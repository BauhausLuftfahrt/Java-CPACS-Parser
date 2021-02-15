/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LandingGearType;
import Cpacs.MainGearsType;
import Cpacs.NoseGearsType;
import Cpacs.SkidGearsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearTypeImpl#getNoseGears <em>Nose Gears</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearTypeImpl#getMainGears <em>Main Gears</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearTypeImpl#getSkidGears <em>Skid Gears</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearTypeImpl extends ComplexBaseTypeImpl implements LandingGearType {
	/**
	 * The cached value of the '{@link #getNoseGears() <em>Nose Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoseGears()
	 * @generated
	 * @ordered
	 */
	protected NoseGearsType noseGears;

	/**
	 * The cached value of the '{@link #getMainGears() <em>Main Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainGears()
	 * @generated
	 * @ordered
	 */
	protected MainGearsType mainGears;

	/**
	 * The cached value of the '{@link #getSkidGears() <em>Skid Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkidGears()
	 * @generated
	 * @ordered
	 */
	protected SkidGearsType skidGears;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoseGearsType getNoseGears() {
		return noseGears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoseGears(NoseGearsType newNoseGears, NotificationChain msgs) {
		NoseGearsType oldNoseGears = noseGears;
		noseGears = newNoseGears;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS, oldNoseGears, newNoseGears);
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
	public void setNoseGears(NoseGearsType newNoseGears) {
		if (newNoseGears != noseGears) {
			NotificationChain msgs = null;
			if (noseGears != null)
				msgs = ((InternalEObject) noseGears).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS, null, msgs);
			if (newNoseGears != null)
				msgs = ((InternalEObject) newNoseGears).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS, null, msgs);
			msgs = basicSetNoseGears(newNoseGears, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS,
					newNoseGears, newNoseGears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearsType getMainGears() {
		return mainGears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainGears(MainGearsType newMainGears, NotificationChain msgs) {
		MainGearsType oldMainGears = mainGears;
		mainGears = newMainGears;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS, oldMainGears, newMainGears);
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
	public void setMainGears(MainGearsType newMainGears) {
		if (newMainGears != mainGears) {
			NotificationChain msgs = null;
			if (mainGears != null)
				msgs = ((InternalEObject) mainGears).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS, null, msgs);
			if (newMainGears != null)
				msgs = ((InternalEObject) newMainGears).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS, null, msgs);
			msgs = basicSetMainGears(newMainGears, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS,
					newMainGears, newMainGears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkidGearsType getSkidGears() {
		return skidGears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkidGears(SkidGearsType newSkidGears, NotificationChain msgs) {
		SkidGearsType oldSkidGears = skidGears;
		skidGears = newSkidGears;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS, oldSkidGears, newSkidGears);
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
	public void setSkidGears(SkidGearsType newSkidGears) {
		if (newSkidGears != skidGears) {
			NotificationChain msgs = null;
			if (skidGears != null)
				msgs = ((InternalEObject) skidGears).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS, null, msgs);
			if (newSkidGears != null)
				msgs = ((InternalEObject) newSkidGears).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS, null, msgs);
			msgs = basicSetSkidGears(newSkidGears, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS,
					newSkidGears, newSkidGears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS:
			return basicSetNoseGears(null, msgs);
		case CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS:
			return basicSetMainGears(null, msgs);
		case CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS:
			return basicSetSkidGears(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS:
			return getNoseGears();
		case CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS:
			return getMainGears();
		case CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS:
			return getSkidGears();
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
		case CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS:
			setNoseGears((NoseGearsType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS:
			setMainGears((MainGearsType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS:
			setSkidGears((SkidGearsType) newValue);
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
		case CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS:
			setNoseGears((NoseGearsType) null);
			return;
		case CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS:
			setMainGears((MainGearsType) null);
			return;
		case CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS:
			setSkidGears((SkidGearsType) null);
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
		case CpacsPackage.LANDING_GEAR_TYPE__NOSE_GEARS:
			return noseGears != null;
		case CpacsPackage.LANDING_GEAR_TYPE__MAIN_GEARS:
			return mainGears != null;
		case CpacsPackage.LANDING_GEAR_TYPE__SKID_GEARS:
			return skidGears != null;
		}
		return super.eIsSet(featureID);
	}

} //LandingGearTypeImpl
