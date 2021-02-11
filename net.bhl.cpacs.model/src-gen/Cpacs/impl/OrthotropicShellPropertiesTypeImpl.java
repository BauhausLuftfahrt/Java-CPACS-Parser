/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.OrthotropicShellPropertiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orthotropic Shell Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getE2 <em>E2</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getG23 <em>G23</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getG31 <em>G31</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getG12 <em>G12</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getNu <em>Nu</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getThermalConductivity1 <em>Thermal Conductivity1</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getThermalConductivity2 <em>Thermal Conductivity2</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getSig1t <em>Sig1t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getSig1c <em>Sig1c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getSig2t <em>Sig2t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getSig2c <em>Sig2c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getEps1t <em>Eps1t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getEps1c <em>Eps1c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getEps2t <em>Eps2t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getEps2c <em>Eps2c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicShellPropertiesTypeImpl#getGamma12 <em>Gamma12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrthotropicShellPropertiesTypeImpl extends ComplexBaseTypeImpl implements OrthotropicShellPropertiesType {
	/**
	 * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType e1;

	/**
	 * The cached value of the '{@link #getE2() <em>E2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType e2;

	/**
	 * The cached value of the '{@link #getG23() <em>G23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG23()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType g23;

	/**
	 * The cached value of the '{@link #getG31() <em>G31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG31()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType g31;

	/**
	 * The cached value of the '{@link #getG12() <em>G12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG12()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType g12;

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
	 * The cached value of the '{@link #getThermalExpansionCoeff1() <em>Thermal Expansion Coeff1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoeff1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalExpansionCoeff1;

	/**
	 * The cached value of the '{@link #getThermalExpansionCoeff2() <em>Thermal Expansion Coeff2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoeff2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalExpansionCoeff2;

	/**
	 * The cached value of the '{@link #getThermalConductivity1() <em>Thermal Conductivity1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalConductivity1;

	/**
	 * The cached value of the '{@link #getThermalConductivity2() <em>Thermal Conductivity2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalConductivity2;

	/**
	 * The cached value of the '{@link #getSig1t() <em>Sig1t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSig1t()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sig1t;

	/**
	 * The cached value of the '{@link #getSig1c() <em>Sig1c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSig1c()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sig1c;

	/**
	 * The cached value of the '{@link #getSig2t() <em>Sig2t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSig2t()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sig2t;

	/**
	 * The cached value of the '{@link #getSig2c() <em>Sig2c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSig2c()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sig2c;

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
	 * The cached value of the '{@link #getEps1t() <em>Eps1t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEps1t()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eps1t;

	/**
	 * The cached value of the '{@link #getEps1c() <em>Eps1c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEps1c()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eps1c;

	/**
	 * The cached value of the '{@link #getEps2t() <em>Eps2t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEps2t()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eps2t;

	/**
	 * The cached value of the '{@link #getEps2c() <em>Eps2c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEps2c()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eps2c;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrthotropicShellPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getOrthotropicShellPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getE1() {
		return e1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetE1(DoubleBaseType newE1, NotificationChain msgs) {
		DoubleBaseType oldE1 = e1;
		e1 = newE1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1, oldE1, newE1);
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
	public void setE1(DoubleBaseType newE1) {
		if (newE1 != e1) {
			NotificationChain msgs = null;
			if (e1 != null)
				msgs = ((InternalEObject) e1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1, null, msgs);
			if (newE1 != null)
				msgs = ((InternalEObject) newE1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1, null, msgs);
			msgs = basicSetE1(newE1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1,
					newE1, newE1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getE2() {
		return e2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetE2(DoubleBaseType newE2, NotificationChain msgs) {
		DoubleBaseType oldE2 = e2;
		e2 = newE2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2, oldE2, newE2);
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
	public void setE2(DoubleBaseType newE2) {
		if (newE2 != e2) {
			NotificationChain msgs = null;
			if (e2 != null)
				msgs = ((InternalEObject) e2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2, null, msgs);
			if (newE2 != null)
				msgs = ((InternalEObject) newE2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2, null, msgs);
			msgs = basicSetE2(newE2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2,
					newE2, newE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getG23() {
		return g23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetG23(DoubleBaseType newG23, NotificationChain msgs) {
		DoubleBaseType oldG23 = g23;
		g23 = newG23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23, oldG23, newG23);
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
	public void setG23(DoubleBaseType newG23) {
		if (newG23 != g23) {
			NotificationChain msgs = null;
			if (g23 != null)
				msgs = ((InternalEObject) g23).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23, null, msgs);
			if (newG23 != null)
				msgs = ((InternalEObject) newG23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23, null, msgs);
			msgs = basicSetG23(newG23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23,
					newG23, newG23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getG31() {
		return g31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetG31(DoubleBaseType newG31, NotificationChain msgs) {
		DoubleBaseType oldG31 = g31;
		g31 = newG31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31, oldG31, newG31);
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
	public void setG31(DoubleBaseType newG31) {
		if (newG31 != g31) {
			NotificationChain msgs = null;
			if (g31 != null)
				msgs = ((InternalEObject) g31).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31, null, msgs);
			if (newG31 != null)
				msgs = ((InternalEObject) newG31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31, null, msgs);
			msgs = basicSetG31(newG31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31,
					newG31, newG31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getG12() {
		return g12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetG12(DoubleBaseType newG12, NotificationChain msgs) {
		DoubleBaseType oldG12 = g12;
		g12 = newG12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12, oldG12, newG12);
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
	public void setG12(DoubleBaseType newG12) {
		if (newG12 != g12) {
			NotificationChain msgs = null;
			if (g12 != null)
				msgs = ((InternalEObject) g12).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12, null, msgs);
			if (newG12 != null)
				msgs = ((InternalEObject) newG12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12, null, msgs);
			msgs = basicSetG12(newG12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12,
					newG12, newG12));
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
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU, oldNu, newNu);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU, null, msgs);
			if (newNu != null)
				msgs = ((InternalEObject) newNu).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU, null, msgs);
			msgs = basicSetNu(newNu, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU,
					newNu, newNu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalExpansionCoeff1() {
		return thermalExpansionCoeff1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalExpansionCoeff1(DoubleBaseType newThermalExpansionCoeff1,
			NotificationChain msgs) {
		DoubleBaseType oldThermalExpansionCoeff1 = thermalExpansionCoeff1;
		thermalExpansionCoeff1 = newThermalExpansionCoeff1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, oldThermalExpansionCoeff1,
					newThermalExpansionCoeff1);
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
	public void setThermalExpansionCoeff1(DoubleBaseType newThermalExpansionCoeff1) {
		if (newThermalExpansionCoeff1 != thermalExpansionCoeff1) {
			NotificationChain msgs = null;
			if (thermalExpansionCoeff1 != null)
				msgs = ((InternalEObject) thermalExpansionCoeff1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, null, msgs);
			if (newThermalExpansionCoeff1 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, null, msgs);
			msgs = basicSetThermalExpansionCoeff1(newThermalExpansionCoeff1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, newThermalExpansionCoeff1,
					newThermalExpansionCoeff1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalExpansionCoeff2() {
		return thermalExpansionCoeff2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalExpansionCoeff2(DoubleBaseType newThermalExpansionCoeff2,
			NotificationChain msgs) {
		DoubleBaseType oldThermalExpansionCoeff2 = thermalExpansionCoeff2;
		thermalExpansionCoeff2 = newThermalExpansionCoeff2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, oldThermalExpansionCoeff2,
					newThermalExpansionCoeff2);
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
	public void setThermalExpansionCoeff2(DoubleBaseType newThermalExpansionCoeff2) {
		if (newThermalExpansionCoeff2 != thermalExpansionCoeff2) {
			NotificationChain msgs = null;
			if (thermalExpansionCoeff2 != null)
				msgs = ((InternalEObject) thermalExpansionCoeff2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, null, msgs);
			if (newThermalExpansionCoeff2 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, null, msgs);
			msgs = basicSetThermalExpansionCoeff2(newThermalExpansionCoeff2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, newThermalExpansionCoeff2,
					newThermalExpansionCoeff2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalConductivity1() {
		return thermalConductivity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalConductivity1(DoubleBaseType newThermalConductivity1,
			NotificationChain msgs) {
		DoubleBaseType oldThermalConductivity1 = thermalConductivity1;
		thermalConductivity1 = newThermalConductivity1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1, oldThermalConductivity1,
					newThermalConductivity1);
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
	public void setThermalConductivity1(DoubleBaseType newThermalConductivity1) {
		if (newThermalConductivity1 != thermalConductivity1) {
			NotificationChain msgs = null;
			if (thermalConductivity1 != null)
				msgs = ((InternalEObject) thermalConductivity1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1,
						null, msgs);
			if (newThermalConductivity1 != null)
				msgs = ((InternalEObject) newThermalConductivity1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1,
						null, msgs);
			msgs = basicSetThermalConductivity1(newThermalConductivity1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1, newThermalConductivity1,
					newThermalConductivity1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalConductivity2() {
		return thermalConductivity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalConductivity2(DoubleBaseType newThermalConductivity2,
			NotificationChain msgs) {
		DoubleBaseType oldThermalConductivity2 = thermalConductivity2;
		thermalConductivity2 = newThermalConductivity2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2, oldThermalConductivity2,
					newThermalConductivity2);
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
	public void setThermalConductivity2(DoubleBaseType newThermalConductivity2) {
		if (newThermalConductivity2 != thermalConductivity2) {
			NotificationChain msgs = null;
			if (thermalConductivity2 != null)
				msgs = ((InternalEObject) thermalConductivity2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2,
						null, msgs);
			if (newThermalConductivity2 != null)
				msgs = ((InternalEObject) newThermalConductivity2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2,
						null, msgs);
			msgs = basicSetThermalConductivity2(newThermalConductivity2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2, newThermalConductivity2,
					newThermalConductivity2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSig1t() {
		return sig1t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSig1t(DoubleBaseType newSig1t, NotificationChain msgs) {
		DoubleBaseType oldSig1t = sig1t;
		sig1t = newSig1t;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T, oldSig1t, newSig1t);
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
	public void setSig1t(DoubleBaseType newSig1t) {
		if (newSig1t != sig1t) {
			NotificationChain msgs = null;
			if (sig1t != null)
				msgs = ((InternalEObject) sig1t).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T, null, msgs);
			if (newSig1t != null)
				msgs = ((InternalEObject) newSig1t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T, null, msgs);
			msgs = basicSetSig1t(newSig1t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T,
					newSig1t, newSig1t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSig1c() {
		return sig1c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSig1c(DoubleBaseType newSig1c, NotificationChain msgs) {
		DoubleBaseType oldSig1c = sig1c;
		sig1c = newSig1c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C, oldSig1c, newSig1c);
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
	public void setSig1c(DoubleBaseType newSig1c) {
		if (newSig1c != sig1c) {
			NotificationChain msgs = null;
			if (sig1c != null)
				msgs = ((InternalEObject) sig1c).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C, null, msgs);
			if (newSig1c != null)
				msgs = ((InternalEObject) newSig1c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C, null, msgs);
			msgs = basicSetSig1c(newSig1c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C,
					newSig1c, newSig1c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSig2t() {
		return sig2t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSig2t(DoubleBaseType newSig2t, NotificationChain msgs) {
		DoubleBaseType oldSig2t = sig2t;
		sig2t = newSig2t;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T, oldSig2t, newSig2t);
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
	public void setSig2t(DoubleBaseType newSig2t) {
		if (newSig2t != sig2t) {
			NotificationChain msgs = null;
			if (sig2t != null)
				msgs = ((InternalEObject) sig2t).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T, null, msgs);
			if (newSig2t != null)
				msgs = ((InternalEObject) newSig2t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T, null, msgs);
			msgs = basicSetSig2t(newSig2t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T,
					newSig2t, newSig2t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSig2c() {
		return sig2c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSig2c(DoubleBaseType newSig2c, NotificationChain msgs) {
		DoubleBaseType oldSig2c = sig2c;
		sig2c = newSig2c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C, oldSig2c, newSig2c);
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
	public void setSig2c(DoubleBaseType newSig2c) {
		if (newSig2c != sig2c) {
			NotificationChain msgs = null;
			if (sig2c != null)
				msgs = ((InternalEObject) sig2c).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C, null, msgs);
			if (newSig2c != null)
				msgs = ((InternalEObject) newSig2c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C, null, msgs);
			msgs = basicSetSig2c(newSig2c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C,
					newSig2c, newSig2c));
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
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12, oldTau12, newTau12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12, null, msgs);
			if (newTau12 != null)
				msgs = ((InternalEObject) newTau12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12, null, msgs);
			msgs = basicSetTau12(newTau12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12,
					newTau12, newTau12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEps1t() {
		return eps1t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEps1t(DoubleBaseType newEps1t, NotificationChain msgs) {
		DoubleBaseType oldEps1t = eps1t;
		eps1t = newEps1t;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T, oldEps1t, newEps1t);
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
	public void setEps1t(DoubleBaseType newEps1t) {
		if (newEps1t != eps1t) {
			NotificationChain msgs = null;
			if (eps1t != null)
				msgs = ((InternalEObject) eps1t).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T, null, msgs);
			if (newEps1t != null)
				msgs = ((InternalEObject) newEps1t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T, null, msgs);
			msgs = basicSetEps1t(newEps1t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T,
					newEps1t, newEps1t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEps1c() {
		return eps1c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEps1c(DoubleBaseType newEps1c, NotificationChain msgs) {
		DoubleBaseType oldEps1c = eps1c;
		eps1c = newEps1c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C, oldEps1c, newEps1c);
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
	public void setEps1c(DoubleBaseType newEps1c) {
		if (newEps1c != eps1c) {
			NotificationChain msgs = null;
			if (eps1c != null)
				msgs = ((InternalEObject) eps1c).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C, null, msgs);
			if (newEps1c != null)
				msgs = ((InternalEObject) newEps1c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C, null, msgs);
			msgs = basicSetEps1c(newEps1c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C,
					newEps1c, newEps1c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEps2t() {
		return eps2t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEps2t(DoubleBaseType newEps2t, NotificationChain msgs) {
		DoubleBaseType oldEps2t = eps2t;
		eps2t = newEps2t;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T, oldEps2t, newEps2t);
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
	public void setEps2t(DoubleBaseType newEps2t) {
		if (newEps2t != eps2t) {
			NotificationChain msgs = null;
			if (eps2t != null)
				msgs = ((InternalEObject) eps2t).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T, null, msgs);
			if (newEps2t != null)
				msgs = ((InternalEObject) newEps2t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T, null, msgs);
			msgs = basicSetEps2t(newEps2t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T,
					newEps2t, newEps2t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEps2c() {
		return eps2c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEps2c(DoubleBaseType newEps2c, NotificationChain msgs) {
		DoubleBaseType oldEps2c = eps2c;
		eps2c = newEps2c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C, oldEps2c, newEps2c);
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
	public void setEps2c(DoubleBaseType newEps2c) {
		if (newEps2c != eps2c) {
			NotificationChain msgs = null;
			if (eps2c != null)
				msgs = ((InternalEObject) eps2c).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C, null, msgs);
			if (newEps2c != null)
				msgs = ((InternalEObject) newEps2c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C, null, msgs);
			msgs = basicSetEps2c(newEps2c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C,
					newEps2c, newEps2c));
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
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12, oldGamma12, newGamma12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12, null, msgs);
			if (newGamma12 != null)
				msgs = ((InternalEObject) newGamma12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12, null, msgs);
			msgs = basicSetGamma12(newGamma12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12, newGamma12, newGamma12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1:
			return basicSetE1(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2:
			return basicSetE2(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23:
			return basicSetG23(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31:
			return basicSetG31(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12:
			return basicSetG12(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU:
			return basicSetNu(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return basicSetThermalExpansionCoeff1(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return basicSetThermalExpansionCoeff2(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return basicSetThermalConductivity1(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return basicSetThermalConductivity2(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			return basicSetSig1t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			return basicSetSig1c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			return basicSetSig2t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			return basicSetSig2c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			return basicSetTau12(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			return basicSetEps1t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			return basicSetEps1c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			return basicSetEps2t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			return basicSetEps2c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
			return basicSetGamma12(null, msgs);
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
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1:
			return getE1();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2:
			return getE2();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23:
			return getG23();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31:
			return getG31();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12:
			return getG12();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU:
			return getNu();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return getThermalExpansionCoeff1();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return getThermalExpansionCoeff2();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return getThermalConductivity1();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return getThermalConductivity2();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			return getSig1t();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			return getSig1c();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			return getSig2t();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			return getSig2c();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			return getTau12();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			return getEps1t();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			return getEps1c();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			return getEps2t();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			return getEps2c();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
			return getGamma12();
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
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1:
			setE1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2:
			setE2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23:
			setG23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31:
			setG31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12:
			setG12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU:
			setNu((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			setThermalExpansionCoeff1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			setThermalExpansionCoeff2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			setThermalConductivity1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			setThermalConductivity2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			setSig1t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			setSig1c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			setSig2t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			setSig2c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			setEps1t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			setEps1c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			setEps2t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			setEps2c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
			setGamma12((DoubleBaseType) newValue);
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
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1:
			setE1((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2:
			setE2((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23:
			setG23((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31:
			setG31((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12:
			setG12((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU:
			setNu((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			setThermalExpansionCoeff1((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			setThermalExpansionCoeff2((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			setThermalConductivity1((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			setThermalConductivity2((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			setSig1t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			setSig1c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			setSig2t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			setSig2c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			setEps1t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			setEps1c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			setEps2t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			setEps2c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
			setGamma12((DoubleBaseType) null);
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
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E1:
			return e1 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__E2:
			return e2 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G23:
			return g23 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G31:
			return g31 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__G12:
			return g12 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__NU:
			return nu != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return thermalExpansionCoeff1 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return thermalExpansionCoeff2 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return thermalConductivity1 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return thermalConductivity2 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			return sig1t != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			return sig1c != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			return sig2t != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			return sig2c != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			return tau12 != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			return eps1t != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			return eps1c != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			return eps2t != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			return eps2c != null;
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
			return gamma12 != null;
		}
		return super.eIsSet(featureID);
	}

} //OrthotropicShellPropertiesTypeImpl
