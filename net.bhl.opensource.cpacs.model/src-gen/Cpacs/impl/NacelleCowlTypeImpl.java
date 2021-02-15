/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.NacelleCowlType;
import Cpacs.NacelleGuideCurvesType;
import Cpacs.NacelleSectionsType;
import Cpacs.RotationCurveType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nacelle Cowl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NacelleCowlTypeImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleCowlTypeImpl#getGuideCurves <em>Guide Curves</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleCowlTypeImpl#getRotationCurve <em>Rotation Curve</em>}</li>
 *   <li>{@link Cpacs.impl.NacelleCowlTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NacelleCowlTypeImpl extends ComplexBaseTypeImpl implements NacelleCowlType {
	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected NacelleSectionsType sections;

	/**
	 * The cached value of the '{@link #getGuideCurves() <em>Guide Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideCurves()
	 * @generated
	 * @ordered
	 */
	protected NacelleGuideCurvesType guideCurves;

	/**
	 * The cached value of the '{@link #getRotationCurve() <em>Rotation Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationCurve()
	 * @generated
	 * @ordered
	 */
	protected RotationCurveType rotationCurve;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NacelleCowlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNacelleCowlType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleSectionsType getSections() {
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSections(NacelleSectionsType newSections, NotificationChain msgs) {
		NacelleSectionsType oldSections = sections;
		sections = newSections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_COWL_TYPE__SECTIONS, oldSections, newSections);
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
	public void setSections(NacelleSectionsType newSections) {
		if (newSections != sections) {
			NotificationChain msgs = null;
			if (sections != null)
				msgs = ((InternalEObject) sections).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_COWL_TYPE__SECTIONS, null, msgs);
			if (newSections != null)
				msgs = ((InternalEObject) newSections).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_COWL_TYPE__SECTIONS, null, msgs);
			msgs = basicSetSections(newSections, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_COWL_TYPE__SECTIONS, newSections,
					newSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleGuideCurvesType getGuideCurves() {
		return guideCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuideCurves(NacelleGuideCurvesType newGuideCurves, NotificationChain msgs) {
		NacelleGuideCurvesType oldGuideCurves = guideCurves;
		guideCurves = newGuideCurves;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES, oldGuideCurves, newGuideCurves);
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
	public void setGuideCurves(NacelleGuideCurvesType newGuideCurves) {
		if (newGuideCurves != guideCurves) {
			NotificationChain msgs = null;
			if (guideCurves != null)
				msgs = ((InternalEObject) guideCurves).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES, null, msgs);
			if (newGuideCurves != null)
				msgs = ((InternalEObject) newGuideCurves).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES, null, msgs);
			msgs = basicSetGuideCurves(newGuideCurves, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES,
					newGuideCurves, newGuideCurves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotationCurveType getRotationCurve() {
		return rotationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationCurve(RotationCurveType newRotationCurve, NotificationChain msgs) {
		RotationCurveType oldRotationCurve = rotationCurve;
		rotationCurve = newRotationCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE, oldRotationCurve, newRotationCurve);
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
	public void setRotationCurve(RotationCurveType newRotationCurve) {
		if (newRotationCurve != rotationCurve) {
			NotificationChain msgs = null;
			if (rotationCurve != null)
				msgs = ((InternalEObject) rotationCurve).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE, null, msgs);
			if (newRotationCurve != null)
				msgs = ((InternalEObject) newRotationCurve).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE, null, msgs);
			msgs = basicSetRotationCurve(newRotationCurve, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE,
					newRotationCurve, newRotationCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NACELLE_COWL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NACELLE_COWL_TYPE__SECTIONS:
			return basicSetSections(null, msgs);
		case CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES:
			return basicSetGuideCurves(null, msgs);
		case CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE:
			return basicSetRotationCurve(null, msgs);
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
		case CpacsPackage.NACELLE_COWL_TYPE__SECTIONS:
			return getSections();
		case CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES:
			return getGuideCurves();
		case CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE:
			return getRotationCurve();
		case CpacsPackage.NACELLE_COWL_TYPE__UID:
			return getUID();
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
		case CpacsPackage.NACELLE_COWL_TYPE__SECTIONS:
			setSections((NacelleSectionsType) newValue);
			return;
		case CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES:
			setGuideCurves((NacelleGuideCurvesType) newValue);
			return;
		case CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE:
			setRotationCurve((RotationCurveType) newValue);
			return;
		case CpacsPackage.NACELLE_COWL_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.NACELLE_COWL_TYPE__SECTIONS:
			setSections((NacelleSectionsType) null);
			return;
		case CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES:
			setGuideCurves((NacelleGuideCurvesType) null);
			return;
		case CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE:
			setRotationCurve((RotationCurveType) null);
			return;
		case CpacsPackage.NACELLE_COWL_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.NACELLE_COWL_TYPE__SECTIONS:
			return sections != null;
		case CpacsPackage.NACELLE_COWL_TYPE__GUIDE_CURVES:
			return guideCurves != null;
		case CpacsPackage.NACELLE_COWL_TYPE__ROTATION_CURVE:
			return rotationCurve != null;
		case CpacsPackage.NACELLE_COWL_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //NacelleCowlTypeImpl
