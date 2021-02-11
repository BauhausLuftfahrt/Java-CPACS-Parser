/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DamTolBehaviourType;
import Cpacs.DoubleBaseType;
import Cpacs.FatigueBehaviourType;
import Cpacs.IsotropicPropertiesType;
import Cpacs.PlasticityCurvesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Isotropic Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getE <em>E</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getNu <em>Nu</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getThermalExpansionCoeff <em>Thermal Expansion Coeff</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getSigt <em>Sigt</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getSigc <em>Sigc</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getEpst <em>Epst</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getEpsc <em>Epsc</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getGamma12 <em>Gamma12</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getYieldStrengthT <em>Yield Strength T</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getYieldStrengthC <em>Yield Strength C</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getPlasticityCurves <em>Plasticity Curves</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getFatigueFactor <em>Fatigue Factor</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getFatigueBehaviour <em>Fatigue Behaviour</em>}</li>
 *   <li>{@link Cpacs.impl.IsotropicPropertiesTypeImpl#getDamageToleranceBehaviour <em>Damage Tolerance Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsotropicPropertiesTypeImpl extends ComplexBaseTypeImpl implements IsotropicPropertiesType {
	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType e;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType g;

	/**
	 * The cached value of the '{@link #getNu() <em>Nu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNu()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nu;

	/**
	 * The cached value of the '{@link #getThermalExpansionCoeff() <em>Thermal Expansion Coeff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoeff()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalExpansionCoeff;

	/**
	 * The cached value of the '{@link #getThermalConductivity() <em>Thermal Conductivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalConductivity;

	/**
	 * The cached value of the '{@link #getSigt() <em>Sigt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigt()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sigt;

	/**
	 * The cached value of the '{@link #getSigc() <em>Sigc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigc()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sigc;

	/**
	 * The cached value of the '{@link #getTau12() <em>Tau12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTau12()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType tau12;

	/**
	 * The cached value of the '{@link #getEpst() <em>Epst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpst()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType epst;

	/**
	 * The cached value of the '{@link #getEpsc() <em>Epsc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsc()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType epsc;

	/**
	 * The cached value of the '{@link #getGamma12() <em>Gamma12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma12()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gamma12;

	/**
	 * The cached value of the '{@link #getYieldStrengthT() <em>Yield Strength T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldStrengthT()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType yieldStrengthT;

	/**
	 * The cached value of the '{@link #getYieldStrengthC() <em>Yield Strength C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldStrengthC()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType yieldStrengthC;

	/**
	 * The cached value of the '{@link #getPlasticityCurves() <em>Plasticity Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticityCurves()
	 * @generated
	 * @ordered
	 */
	protected PlasticityCurvesType plasticityCurves;

	/**
	 * The cached value of the '{@link #getFatigueFactor() <em>Fatigue Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFatigueFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fatigueFactor;

	/**
	 * The cached value of the '{@link #getFatigueBehaviour() <em>Fatigue Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFatigueBehaviour()
	 * @generated
	 * @ordered
	 */
	protected FatigueBehaviourType fatigueBehaviour;

	/**
	 * The cached value of the '{@link #getDamageToleranceBehaviour() <em>Damage Tolerance Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageToleranceBehaviour()
	 * @generated
	 * @ordered
	 */
	protected DamTolBehaviourType damageToleranceBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsotropicPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getIsotropicPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getE() {
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetE(DoubleBaseType newE, NotificationChain msgs) {
		DoubleBaseType oldE = e;
		e = newE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E, oldE, newE);
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
	public void setE(DoubleBaseType newE) {
		if (newE != e) {
			NotificationChain msgs = null;
			if (e != null)
				msgs = ((InternalEObject) e).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E, null, msgs);
			if (newE != null)
				msgs = ((InternalEObject) newE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E, null, msgs);
			msgs = basicSetE(newE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E, newE,
					newE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getG() {
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetG(DoubleBaseType newG, NotificationChain msgs) {
		DoubleBaseType oldG = g;
		g = newG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G, oldG, newG);
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
	public void setG(DoubleBaseType newG) {
		if (newG != g) {
			NotificationChain msgs = null;
			if (g != null)
				msgs = ((InternalEObject) g).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G, null, msgs);
			if (newG != null)
				msgs = ((InternalEObject) newG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G, null, msgs);
			msgs = basicSetG(newG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G, newG,
					newG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNu() {
		return nu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNu(DoubleBaseType newNu, NotificationChain msgs) {
		DoubleBaseType oldNu = nu;
		nu = newNu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU, oldNu, newNu);
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
	public void setNu(DoubleBaseType newNu) {
		if (newNu != nu) {
			NotificationChain msgs = null;
			if (nu != null)
				msgs = ((InternalEObject) nu).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU, null, msgs);
			if (newNu != null)
				msgs = ((InternalEObject) newNu).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU, null, msgs);
			msgs = basicSetNu(newNu, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU, newNu,
					newNu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalExpansionCoeff() {
		return thermalExpansionCoeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalExpansionCoeff(DoubleBaseType newThermalExpansionCoeff,
			NotificationChain msgs) {
		DoubleBaseType oldThermalExpansionCoeff = thermalExpansionCoeff;
		thermalExpansionCoeff = newThermalExpansionCoeff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF, oldThermalExpansionCoeff,
					newThermalExpansionCoeff);
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
	public void setThermalExpansionCoeff(DoubleBaseType newThermalExpansionCoeff) {
		if (newThermalExpansionCoeff != thermalExpansionCoeff) {
			NotificationChain msgs = null;
			if (thermalExpansionCoeff != null)
				msgs = ((InternalEObject) thermalExpansionCoeff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF, null,
						msgs);
			if (newThermalExpansionCoeff != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF, null,
						msgs);
			msgs = basicSetThermalExpansionCoeff(newThermalExpansionCoeff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF, newThermalExpansionCoeff,
					newThermalExpansionCoeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalConductivity() {
		return thermalConductivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalConductivity(DoubleBaseType newThermalConductivity,
			NotificationChain msgs) {
		DoubleBaseType oldThermalConductivity = thermalConductivity;
		thermalConductivity = newThermalConductivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY, oldThermalConductivity,
					newThermalConductivity);
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
	public void setThermalConductivity(DoubleBaseType newThermalConductivity) {
		if (newThermalConductivity != thermalConductivity) {
			NotificationChain msgs = null;
			if (thermalConductivity != null)
				msgs = ((InternalEObject) thermalConductivity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY, null,
						msgs);
			if (newThermalConductivity != null)
				msgs = ((InternalEObject) newThermalConductivity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY, null,
						msgs);
			msgs = basicSetThermalConductivity(newThermalConductivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY, newThermalConductivity,
					newThermalConductivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSigt() {
		return sigt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSigt(DoubleBaseType newSigt, NotificationChain msgs) {
		DoubleBaseType oldSigt = sigt;
		sigt = newSigt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT, oldSigt, newSigt);
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
	public void setSigt(DoubleBaseType newSigt) {
		if (newSigt != sigt) {
			NotificationChain msgs = null;
			if (sigt != null)
				msgs = ((InternalEObject) sigt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT, null, msgs);
			if (newSigt != null)
				msgs = ((InternalEObject) newSigt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT, null, msgs);
			msgs = basicSetSigt(newSigt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT, newSigt,
					newSigt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSigc() {
		return sigc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSigc(DoubleBaseType newSigc, NotificationChain msgs) {
		DoubleBaseType oldSigc = sigc;
		sigc = newSigc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC, oldSigc, newSigc);
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
	public void setSigc(DoubleBaseType newSigc) {
		if (newSigc != sigc) {
			NotificationChain msgs = null;
			if (sigc != null)
				msgs = ((InternalEObject) sigc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC, null, msgs);
			if (newSigc != null)
				msgs = ((InternalEObject) newSigc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC, null, msgs);
			msgs = basicSetSigc(newSigc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC, newSigc,
					newSigc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTau12() {
		return tau12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTau12(DoubleBaseType newTau12, NotificationChain msgs) {
		DoubleBaseType oldTau12 = tau12;
		tau12 = newTau12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12, oldTau12, newTau12);
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
	public void setTau12(DoubleBaseType newTau12) {
		if (newTau12 != tau12) {
			NotificationChain msgs = null;
			if (tau12 != null)
				msgs = ((InternalEObject) tau12).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12, null, msgs);
			if (newTau12 != null)
				msgs = ((InternalEObject) newTau12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12, null, msgs);
			msgs = basicSetTau12(newTau12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12,
					newTau12, newTau12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEpst() {
		return epst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpst(DoubleBaseType newEpst, NotificationChain msgs) {
		DoubleBaseType oldEpst = epst;
		epst = newEpst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST, oldEpst, newEpst);
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
	public void setEpst(DoubleBaseType newEpst) {
		if (newEpst != epst) {
			NotificationChain msgs = null;
			if (epst != null)
				msgs = ((InternalEObject) epst).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST, null, msgs);
			if (newEpst != null)
				msgs = ((InternalEObject) newEpst).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST, null, msgs);
			msgs = basicSetEpst(newEpst, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST, newEpst,
					newEpst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEpsc() {
		return epsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpsc(DoubleBaseType newEpsc, NotificationChain msgs) {
		DoubleBaseType oldEpsc = epsc;
		epsc = newEpsc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC, oldEpsc, newEpsc);
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
	public void setEpsc(DoubleBaseType newEpsc) {
		if (newEpsc != epsc) {
			NotificationChain msgs = null;
			if (epsc != null)
				msgs = ((InternalEObject) epsc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC, null, msgs);
			if (newEpsc != null)
				msgs = ((InternalEObject) newEpsc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC, null, msgs);
			msgs = basicSetEpsc(newEpsc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC, newEpsc,
					newEpsc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGamma12() {
		return gamma12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGamma12(DoubleBaseType newGamma12, NotificationChain msgs) {
		DoubleBaseType oldGamma12 = gamma12;
		gamma12 = newGamma12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12, oldGamma12, newGamma12);
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
	public void setGamma12(DoubleBaseType newGamma12) {
		if (newGamma12 != gamma12) {
			NotificationChain msgs = null;
			if (gamma12 != null)
				msgs = ((InternalEObject) gamma12).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12, null, msgs);
			if (newGamma12 != null)
				msgs = ((InternalEObject) newGamma12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12, null, msgs);
			msgs = basicSetGamma12(newGamma12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12,
					newGamma12, newGamma12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getYieldStrengthT() {
		return yieldStrengthT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYieldStrengthT(DoubleBaseType newYieldStrengthT, NotificationChain msgs) {
		DoubleBaseType oldYieldStrengthT = yieldStrengthT;
		yieldStrengthT = newYieldStrengthT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T, oldYieldStrengthT, newYieldStrengthT);
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
	public void setYieldStrengthT(DoubleBaseType newYieldStrengthT) {
		if (newYieldStrengthT != yieldStrengthT) {
			NotificationChain msgs = null;
			if (yieldStrengthT != null)
				msgs = ((InternalEObject) yieldStrengthT).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T, null, msgs);
			if (newYieldStrengthT != null)
				msgs = ((InternalEObject) newYieldStrengthT).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T, null, msgs);
			msgs = basicSetYieldStrengthT(newYieldStrengthT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T, newYieldStrengthT, newYieldStrengthT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getYieldStrengthC() {
		return yieldStrengthC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYieldStrengthC(DoubleBaseType newYieldStrengthC, NotificationChain msgs) {
		DoubleBaseType oldYieldStrengthC = yieldStrengthC;
		yieldStrengthC = newYieldStrengthC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C, oldYieldStrengthC, newYieldStrengthC);
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
	public void setYieldStrengthC(DoubleBaseType newYieldStrengthC) {
		if (newYieldStrengthC != yieldStrengthC) {
			NotificationChain msgs = null;
			if (yieldStrengthC != null)
				msgs = ((InternalEObject) yieldStrengthC).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C, null, msgs);
			if (newYieldStrengthC != null)
				msgs = ((InternalEObject) newYieldStrengthC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C, null, msgs);
			msgs = basicSetYieldStrengthC(newYieldStrengthC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C, newYieldStrengthC, newYieldStrengthC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlasticityCurvesType getPlasticityCurves() {
		return plasticityCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlasticityCurves(PlasticityCurvesType newPlasticityCurves,
			NotificationChain msgs) {
		PlasticityCurvesType oldPlasticityCurves = plasticityCurves;
		plasticityCurves = newPlasticityCurves;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES, oldPlasticityCurves,
					newPlasticityCurves);
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
	public void setPlasticityCurves(PlasticityCurvesType newPlasticityCurves) {
		if (newPlasticityCurves != plasticityCurves) {
			NotificationChain msgs = null;
			if (plasticityCurves != null)
				msgs = ((InternalEObject) plasticityCurves).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES, null, msgs);
			if (newPlasticityCurves != null)
				msgs = ((InternalEObject) newPlasticityCurves).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES, null, msgs);
			msgs = basicSetPlasticityCurves(newPlasticityCurves, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES, newPlasticityCurves,
					newPlasticityCurves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFatigueFactor() {
		return fatigueFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFatigueFactor(DoubleBaseType newFatigueFactor, NotificationChain msgs) {
		DoubleBaseType oldFatigueFactor = fatigueFactor;
		fatigueFactor = newFatigueFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR, oldFatigueFactor, newFatigueFactor);
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
	public void setFatigueFactor(DoubleBaseType newFatigueFactor) {
		if (newFatigueFactor != fatigueFactor) {
			NotificationChain msgs = null;
			if (fatigueFactor != null)
				msgs = ((InternalEObject) fatigueFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR, null, msgs);
			if (newFatigueFactor != null)
				msgs = ((InternalEObject) newFatigueFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR, null, msgs);
			msgs = basicSetFatigueFactor(newFatigueFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR, newFatigueFactor, newFatigueFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FatigueBehaviourType getFatigueBehaviour() {
		return fatigueBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFatigueBehaviour(FatigueBehaviourType newFatigueBehaviour,
			NotificationChain msgs) {
		FatigueBehaviourType oldFatigueBehaviour = fatigueBehaviour;
		fatigueBehaviour = newFatigueBehaviour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR, oldFatigueBehaviour,
					newFatigueBehaviour);
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
	public void setFatigueBehaviour(FatigueBehaviourType newFatigueBehaviour) {
		if (newFatigueBehaviour != fatigueBehaviour) {
			NotificationChain msgs = null;
			if (fatigueBehaviour != null)
				msgs = ((InternalEObject) fatigueBehaviour).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR, null, msgs);
			if (newFatigueBehaviour != null)
				msgs = ((InternalEObject) newFatigueBehaviour).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR, null, msgs);
			msgs = basicSetFatigueBehaviour(newFatigueBehaviour, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR, newFatigueBehaviour,
					newFatigueBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DamTolBehaviourType getDamageToleranceBehaviour() {
		return damageToleranceBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDamageToleranceBehaviour(DamTolBehaviourType newDamageToleranceBehaviour,
			NotificationChain msgs) {
		DamTolBehaviourType oldDamageToleranceBehaviour = damageToleranceBehaviour;
		damageToleranceBehaviour = newDamageToleranceBehaviour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR, oldDamageToleranceBehaviour,
					newDamageToleranceBehaviour);
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
	public void setDamageToleranceBehaviour(DamTolBehaviourType newDamageToleranceBehaviour) {
		if (newDamageToleranceBehaviour != damageToleranceBehaviour) {
			NotificationChain msgs = null;
			if (damageToleranceBehaviour != null)
				msgs = ((InternalEObject) damageToleranceBehaviour).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR,
						null, msgs);
			if (newDamageToleranceBehaviour != null)
				msgs = ((InternalEObject) newDamageToleranceBehaviour).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR,
						null, msgs);
			msgs = basicSetDamageToleranceBehaviour(newDamageToleranceBehaviour, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR, newDamageToleranceBehaviour,
					newDamageToleranceBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E:
			return basicSetE(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G:
			return basicSetG(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU:
			return basicSetNu(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF:
			return basicSetThermalExpansionCoeff(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY:
			return basicSetThermalConductivity(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT:
			return basicSetSigt(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC:
			return basicSetSigc(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12:
			return basicSetTau12(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST:
			return basicSetEpst(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC:
			return basicSetEpsc(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12:
			return basicSetGamma12(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T:
			return basicSetYieldStrengthT(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C:
			return basicSetYieldStrengthC(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES:
			return basicSetPlasticityCurves(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR:
			return basicSetFatigueFactor(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR:
			return basicSetFatigueBehaviour(null, msgs);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR:
			return basicSetDamageToleranceBehaviour(null, msgs);
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
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E:
			return getE();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G:
			return getG();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU:
			return getNu();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF:
			return getThermalExpansionCoeff();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY:
			return getThermalConductivity();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT:
			return getSigt();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC:
			return getSigc();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12:
			return getTau12();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST:
			return getEpst();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC:
			return getEpsc();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12:
			return getGamma12();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T:
			return getYieldStrengthT();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C:
			return getYieldStrengthC();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES:
			return getPlasticityCurves();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR:
			return getFatigueFactor();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR:
			return getFatigueBehaviour();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR:
			return getDamageToleranceBehaviour();
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
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E:
			setE((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G:
			setG((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU:
			setNu((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF:
			setThermalExpansionCoeff((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY:
			setThermalConductivity((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT:
			setSigt((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC:
			setSigc((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST:
			setEpst((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC:
			setEpsc((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12:
			setGamma12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T:
			setYieldStrengthT((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C:
			setYieldStrengthC((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES:
			setPlasticityCurves((PlasticityCurvesType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR:
			setFatigueFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR:
			setFatigueBehaviour((FatigueBehaviourType) newValue);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR:
			setDamageToleranceBehaviour((DamTolBehaviourType) newValue);
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
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E:
			setE((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G:
			setG((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU:
			setNu((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF:
			setThermalExpansionCoeff((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY:
			setThermalConductivity((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT:
			setSigt((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC:
			setSigc((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST:
			setEpst((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC:
			setEpsc((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12:
			setGamma12((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T:
			setYieldStrengthT((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C:
			setYieldStrengthC((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES:
			setPlasticityCurves((PlasticityCurvesType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR:
			setFatigueFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR:
			setFatigueBehaviour((FatigueBehaviourType) null);
			return;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR:
			setDamageToleranceBehaviour((DamTolBehaviourType) null);
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
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__E:
			return e != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__G:
			return g != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__NU:
			return nu != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF:
			return thermalExpansionCoeff != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY:
			return thermalConductivity != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGT:
			return sigt != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__SIGC:
			return sigc != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__TAU12:
			return tau12 != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPST:
			return epst != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__EPSC:
			return epsc != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__GAMMA12:
			return gamma12 != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_T:
			return yieldStrengthT != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__YIELD_STRENGTH_C:
			return yieldStrengthC != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__PLASTICITY_CURVES:
			return plasticityCurves != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_FACTOR:
			return fatigueFactor != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__FATIGUE_BEHAVIOUR:
			return fatigueBehaviour != null;
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE__DAMAGE_TOLERANCE_BEHAVIOUR:
			return damageToleranceBehaviour != null;
		}
		return super.eIsSet(featureID);
	}

} //IsotropicPropertiesTypeImpl
