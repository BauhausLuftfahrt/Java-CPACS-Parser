/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CurveProfilesType;
import Cpacs.FuselageProfilesType;
import Cpacs.GuideCurveProfilesType;
import Cpacs.NacelleProfilesType;
import Cpacs.ProfilesType;
import Cpacs.RotorAirfoilsType;
import Cpacs.StructuralProfilesType;
import Cpacs.WingAirfoilsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ProfilesTypeImpl#getFuselageProfiles <em>Fuselage Profiles</em>}</li>
 *   <li>{@link Cpacs.impl.ProfilesTypeImpl#getWingAirfoils <em>Wing Airfoils</em>}</li>
 *   <li>{@link Cpacs.impl.ProfilesTypeImpl#getGuideCurves <em>Guide Curves</em>}</li>
 *   <li>{@link Cpacs.impl.ProfilesTypeImpl#getRotorAirfoils <em>Rotor Airfoils</em>}</li>
 *   <li>{@link Cpacs.impl.ProfilesTypeImpl#getStructuralProfiles <em>Structural Profiles</em>}</li>
 *   <li>{@link Cpacs.impl.ProfilesTypeImpl#getNacelleProfiles <em>Nacelle Profiles</em>}</li>
 *   <li>{@link Cpacs.impl.ProfilesTypeImpl#getCurveProfiles <em>Curve Profiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfilesTypeImpl extends ComplexBaseTypeImpl implements ProfilesType {
	/**
	 * The cached value of the '{@link #getFuselageProfiles() <em>Fuselage Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageProfiles()
	 * @generated
	 * @ordered
	 */
	protected FuselageProfilesType fuselageProfiles;

	/**
	 * The cached value of the '{@link #getWingAirfoils() <em>Wing Airfoils</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingAirfoils()
	 * @generated
	 * @ordered
	 */
	protected WingAirfoilsType wingAirfoils;

	/**
	 * The cached value of the '{@link #getGuideCurves() <em>Guide Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideCurves()
	 * @generated
	 * @ordered
	 */
	protected GuideCurveProfilesType guideCurves;

	/**
	 * The cached value of the '{@link #getRotorAirfoils() <em>Rotor Airfoils</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotorAirfoils()
	 * @generated
	 * @ordered
	 */
	protected RotorAirfoilsType rotorAirfoils;

	/**
	 * The cached value of the '{@link #getStructuralProfiles() <em>Structural Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralProfiles()
	 * @generated
	 * @ordered
	 */
	protected StructuralProfilesType structuralProfiles;

	/**
	 * The cached value of the '{@link #getNacelleProfiles() <em>Nacelle Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNacelleProfiles()
	 * @generated
	 * @ordered
	 */
	protected NacelleProfilesType nacelleProfiles;

	/**
	 * The cached value of the '{@link #getCurveProfiles() <em>Curve Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveProfiles()
	 * @generated
	 * @ordered
	 */
	protected CurveProfilesType curveProfiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getProfilesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageProfilesType getFuselageProfiles() {
		return fuselageProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselageProfiles(FuselageProfilesType newFuselageProfiles,
			NotificationChain msgs) {
		FuselageProfilesType oldFuselageProfiles = fuselageProfiles;
		fuselageProfiles = newFuselageProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES, oldFuselageProfiles, newFuselageProfiles);
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
	public void setFuselageProfiles(FuselageProfilesType newFuselageProfiles) {
		if (newFuselageProfiles != fuselageProfiles) {
			NotificationChain msgs = null;
			if (fuselageProfiles != null)
				msgs = ((InternalEObject) fuselageProfiles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES, null, msgs);
			if (newFuselageProfiles != null)
				msgs = ((InternalEObject) newFuselageProfiles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES, null, msgs);
			msgs = basicSetFuselageProfiles(newFuselageProfiles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES,
					newFuselageProfiles, newFuselageProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingAirfoilsType getWingAirfoils() {
		return wingAirfoils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingAirfoils(WingAirfoilsType newWingAirfoils, NotificationChain msgs) {
		WingAirfoilsType oldWingAirfoils = wingAirfoils;
		wingAirfoils = newWingAirfoils;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILES_TYPE__WING_AIRFOILS, oldWingAirfoils, newWingAirfoils);
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
	public void setWingAirfoils(WingAirfoilsType newWingAirfoils) {
		if (newWingAirfoils != wingAirfoils) {
			NotificationChain msgs = null;
			if (wingAirfoils != null)
				msgs = ((InternalEObject) wingAirfoils).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__WING_AIRFOILS, null, msgs);
			if (newWingAirfoils != null)
				msgs = ((InternalEObject) newWingAirfoils).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__WING_AIRFOILS, null, msgs);
			msgs = basicSetWingAirfoils(newWingAirfoils, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILES_TYPE__WING_AIRFOILS,
					newWingAirfoils, newWingAirfoils));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuideCurveProfilesType getGuideCurves() {
		return guideCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuideCurves(GuideCurveProfilesType newGuideCurves, NotificationChain msgs) {
		GuideCurveProfilesType oldGuideCurves = guideCurves;
		guideCurves = newGuideCurves;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILES_TYPE__GUIDE_CURVES, oldGuideCurves, newGuideCurves);
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
	public void setGuideCurves(GuideCurveProfilesType newGuideCurves) {
		if (newGuideCurves != guideCurves) {
			NotificationChain msgs = null;
			if (guideCurves != null)
				msgs = ((InternalEObject) guideCurves).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__GUIDE_CURVES, null, msgs);
			if (newGuideCurves != null)
				msgs = ((InternalEObject) newGuideCurves).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__GUIDE_CURVES, null, msgs);
			msgs = basicSetGuideCurves(newGuideCurves, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILES_TYPE__GUIDE_CURVES,
					newGuideCurves, newGuideCurves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorAirfoilsType getRotorAirfoils() {
		return rotorAirfoils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotorAirfoils(RotorAirfoilsType newRotorAirfoils, NotificationChain msgs) {
		RotorAirfoilsType oldRotorAirfoils = rotorAirfoils;
		rotorAirfoils = newRotorAirfoils;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS, oldRotorAirfoils, newRotorAirfoils);
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
	public void setRotorAirfoils(RotorAirfoilsType newRotorAirfoils) {
		if (newRotorAirfoils != rotorAirfoils) {
			NotificationChain msgs = null;
			if (rotorAirfoils != null)
				msgs = ((InternalEObject) rotorAirfoils).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS, null, msgs);
			if (newRotorAirfoils != null)
				msgs = ((InternalEObject) newRotorAirfoils).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS, null, msgs);
			msgs = basicSetRotorAirfoils(newRotorAirfoils, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS,
					newRotorAirfoils, newRotorAirfoils));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralProfilesType getStructuralProfiles() {
		return structuralProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralProfiles(StructuralProfilesType newStructuralProfiles,
			NotificationChain msgs) {
		StructuralProfilesType oldStructuralProfiles = structuralProfiles;
		structuralProfiles = newStructuralProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES, oldStructuralProfiles, newStructuralProfiles);
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
	public void setStructuralProfiles(StructuralProfilesType newStructuralProfiles) {
		if (newStructuralProfiles != structuralProfiles) {
			NotificationChain msgs = null;
			if (structuralProfiles != null)
				msgs = ((InternalEObject) structuralProfiles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES, null, msgs);
			if (newStructuralProfiles != null)
				msgs = ((InternalEObject) newStructuralProfiles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES, null, msgs);
			msgs = basicSetStructuralProfiles(newStructuralProfiles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES,
					newStructuralProfiles, newStructuralProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleProfilesType getNacelleProfiles() {
		return nacelleProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNacelleProfiles(NacelleProfilesType newNacelleProfiles, NotificationChain msgs) {
		NacelleProfilesType oldNacelleProfiles = nacelleProfiles;
		nacelleProfiles = newNacelleProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES, oldNacelleProfiles, newNacelleProfiles);
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
	public void setNacelleProfiles(NacelleProfilesType newNacelleProfiles) {
		if (newNacelleProfiles != nacelleProfiles) {
			NotificationChain msgs = null;
			if (nacelleProfiles != null)
				msgs = ((InternalEObject) nacelleProfiles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES, null, msgs);
			if (newNacelleProfiles != null)
				msgs = ((InternalEObject) newNacelleProfiles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES, null, msgs);
			msgs = basicSetNacelleProfiles(newNacelleProfiles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES,
					newNacelleProfiles, newNacelleProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveProfilesType getCurveProfiles() {
		return curveProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveProfiles(CurveProfilesType newCurveProfiles, NotificationChain msgs) {
		CurveProfilesType oldCurveProfiles = curveProfiles;
		curveProfiles = newCurveProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILES_TYPE__CURVE_PROFILES, oldCurveProfiles, newCurveProfiles);
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
	public void setCurveProfiles(CurveProfilesType newCurveProfiles) {
		if (newCurveProfiles != curveProfiles) {
			NotificationChain msgs = null;
			if (curveProfiles != null)
				msgs = ((InternalEObject) curveProfiles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__CURVE_PROFILES, null, msgs);
			if (newCurveProfiles != null)
				msgs = ((InternalEObject) newCurveProfiles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILES_TYPE__CURVE_PROFILES, null, msgs);
			msgs = basicSetCurveProfiles(newCurveProfiles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILES_TYPE__CURVE_PROFILES,
					newCurveProfiles, newCurveProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES:
			return basicSetFuselageProfiles(null, msgs);
		case CpacsPackage.PROFILES_TYPE__WING_AIRFOILS:
			return basicSetWingAirfoils(null, msgs);
		case CpacsPackage.PROFILES_TYPE__GUIDE_CURVES:
			return basicSetGuideCurves(null, msgs);
		case CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS:
			return basicSetRotorAirfoils(null, msgs);
		case CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES:
			return basicSetStructuralProfiles(null, msgs);
		case CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES:
			return basicSetNacelleProfiles(null, msgs);
		case CpacsPackage.PROFILES_TYPE__CURVE_PROFILES:
			return basicSetCurveProfiles(null, msgs);
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
		case CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES:
			return getFuselageProfiles();
		case CpacsPackage.PROFILES_TYPE__WING_AIRFOILS:
			return getWingAirfoils();
		case CpacsPackage.PROFILES_TYPE__GUIDE_CURVES:
			return getGuideCurves();
		case CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS:
			return getRotorAirfoils();
		case CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES:
			return getStructuralProfiles();
		case CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES:
			return getNacelleProfiles();
		case CpacsPackage.PROFILES_TYPE__CURVE_PROFILES:
			return getCurveProfiles();
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
		case CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES:
			setFuselageProfiles((FuselageProfilesType) newValue);
			return;
		case CpacsPackage.PROFILES_TYPE__WING_AIRFOILS:
			setWingAirfoils((WingAirfoilsType) newValue);
			return;
		case CpacsPackage.PROFILES_TYPE__GUIDE_CURVES:
			setGuideCurves((GuideCurveProfilesType) newValue);
			return;
		case CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS:
			setRotorAirfoils((RotorAirfoilsType) newValue);
			return;
		case CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES:
			setStructuralProfiles((StructuralProfilesType) newValue);
			return;
		case CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES:
			setNacelleProfiles((NacelleProfilesType) newValue);
			return;
		case CpacsPackage.PROFILES_TYPE__CURVE_PROFILES:
			setCurveProfiles((CurveProfilesType) newValue);
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
		case CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES:
			setFuselageProfiles((FuselageProfilesType) null);
			return;
		case CpacsPackage.PROFILES_TYPE__WING_AIRFOILS:
			setWingAirfoils((WingAirfoilsType) null);
			return;
		case CpacsPackage.PROFILES_TYPE__GUIDE_CURVES:
			setGuideCurves((GuideCurveProfilesType) null);
			return;
		case CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS:
			setRotorAirfoils((RotorAirfoilsType) null);
			return;
		case CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES:
			setStructuralProfiles((StructuralProfilesType) null);
			return;
		case CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES:
			setNacelleProfiles((NacelleProfilesType) null);
			return;
		case CpacsPackage.PROFILES_TYPE__CURVE_PROFILES:
			setCurveProfiles((CurveProfilesType) null);
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
		case CpacsPackage.PROFILES_TYPE__FUSELAGE_PROFILES:
			return fuselageProfiles != null;
		case CpacsPackage.PROFILES_TYPE__WING_AIRFOILS:
			return wingAirfoils != null;
		case CpacsPackage.PROFILES_TYPE__GUIDE_CURVES:
			return guideCurves != null;
		case CpacsPackage.PROFILES_TYPE__ROTOR_AIRFOILS:
			return rotorAirfoils != null;
		case CpacsPackage.PROFILES_TYPE__STRUCTURAL_PROFILES:
			return structuralProfiles != null;
		case CpacsPackage.PROFILES_TYPE__NACELLE_PROFILES:
			return nacelleProfiles != null;
		case CpacsPackage.PROFILES_TYPE__CURVE_PROFILES:
			return curveProfiles != null;
		}
		return super.eIsSet(featureID);
	}

} //ProfilesTypeImpl
