/**
 */
package Cpacs.impl;

import Cpacs.AnisotropicShellPropertiesType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anisotropic Shell Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getQ11 <em>Q11</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getQ12 <em>Q12</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getQ13 <em>Q13</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getQ22 <em>Q22</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getQ23 <em>Q23</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getQ33 <em>Q33</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getThermalExpansionCoeff12 <em>Thermal Expansion Coeff12</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getThermalConductivity1 <em>Thermal Conductivity1</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getThermalConductivity2 <em>Thermal Conductivity2</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getThermalConductivity3 <em>Thermal Conductivity3</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getSig1t <em>Sig1t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getSig1c <em>Sig1c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getSig2t <em>Sig2t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getSig2c <em>Sig2c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getEps1t <em>Eps1t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getEps1c <em>Eps1c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getEps2t <em>Eps2t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getEps2c <em>Eps2c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicShellPropertiesTypeImpl#getGamma12 <em>Gamma12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnisotropicShellPropertiesTypeImpl extends ComplexBaseTypeImpl implements AnisotropicShellPropertiesType {
	/**
	 * The cached value of the '{@link #getQ11() <em>Q11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ11()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType q11;

	/**
	 * The cached value of the '{@link #getQ12() <em>Q12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ12()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType q12;

	/**
	 * The cached value of the '{@link #getQ13() <em>Q13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ13()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType q13;

	/**
	 * The cached value of the '{@link #getQ22() <em>Q22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ22()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType q22;

	/**
	 * The cached value of the '{@link #getQ23() <em>Q23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ23()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType q23;

	/**
	 * The cached value of the '{@link #getQ33() <em>Q33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ33()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType q33;

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
	 * The cached value of the '{@link #getThermalExpansionCoeff12() <em>Thermal Expansion Coeff12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoeff12()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalExpansionCoeff12;

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
	 * The cached value of the '{@link #getThermalConductivity3() <em>Thermal Conductivity3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity3()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalConductivity3;

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
	protected AnisotropicShellPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAnisotropicShellPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQ11() {
		return q11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ11(DoubleBaseType newQ11, NotificationChain msgs) {
		DoubleBaseType oldQ11 = q11;
		q11 = newQ11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11, oldQ11, newQ11);
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
	public void setQ11(DoubleBaseType newQ11) {
		if (newQ11 != q11) {
			NotificationChain msgs = null;
			if (q11 != null)
				msgs = ((InternalEObject) q11).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11, null, msgs);
			if (newQ11 != null)
				msgs = ((InternalEObject) newQ11).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11, null, msgs);
			msgs = basicSetQ11(newQ11, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11,
					newQ11, newQ11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQ12() {
		return q12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ12(DoubleBaseType newQ12, NotificationChain msgs) {
		DoubleBaseType oldQ12 = q12;
		q12 = newQ12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12, oldQ12, newQ12);
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
	public void setQ12(DoubleBaseType newQ12) {
		if (newQ12 != q12) {
			NotificationChain msgs = null;
			if (q12 != null)
				msgs = ((InternalEObject) q12).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12, null, msgs);
			if (newQ12 != null)
				msgs = ((InternalEObject) newQ12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12, null, msgs);
			msgs = basicSetQ12(newQ12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12,
					newQ12, newQ12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQ13() {
		return q13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ13(DoubleBaseType newQ13, NotificationChain msgs) {
		DoubleBaseType oldQ13 = q13;
		q13 = newQ13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13, oldQ13, newQ13);
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
	public void setQ13(DoubleBaseType newQ13) {
		if (newQ13 != q13) {
			NotificationChain msgs = null;
			if (q13 != null)
				msgs = ((InternalEObject) q13).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13, null, msgs);
			if (newQ13 != null)
				msgs = ((InternalEObject) newQ13).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13, null, msgs);
			msgs = basicSetQ13(newQ13, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13,
					newQ13, newQ13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQ22() {
		return q22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ22(DoubleBaseType newQ22, NotificationChain msgs) {
		DoubleBaseType oldQ22 = q22;
		q22 = newQ22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22, oldQ22, newQ22);
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
	public void setQ22(DoubleBaseType newQ22) {
		if (newQ22 != q22) {
			NotificationChain msgs = null;
			if (q22 != null)
				msgs = ((InternalEObject) q22).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22, null, msgs);
			if (newQ22 != null)
				msgs = ((InternalEObject) newQ22).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22, null, msgs);
			msgs = basicSetQ22(newQ22, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22,
					newQ22, newQ22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQ23() {
		return q23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ23(DoubleBaseType newQ23, NotificationChain msgs) {
		DoubleBaseType oldQ23 = q23;
		q23 = newQ23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23, oldQ23, newQ23);
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
	public void setQ23(DoubleBaseType newQ23) {
		if (newQ23 != q23) {
			NotificationChain msgs = null;
			if (q23 != null)
				msgs = ((InternalEObject) q23).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23, null, msgs);
			if (newQ23 != null)
				msgs = ((InternalEObject) newQ23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23, null, msgs);
			msgs = basicSetQ23(newQ23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23,
					newQ23, newQ23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQ33() {
		return q33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ33(DoubleBaseType newQ33, NotificationChain msgs) {
		DoubleBaseType oldQ33 = q33;
		q33 = newQ33;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33, oldQ33, newQ33);
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
	public void setQ33(DoubleBaseType newQ33) {
		if (newQ33 != q33) {
			NotificationChain msgs = null;
			if (q33 != null)
				msgs = ((InternalEObject) q33).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33, null, msgs);
			if (newQ33 != null)
				msgs = ((InternalEObject) newQ33).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33, null, msgs);
			msgs = basicSetQ33(newQ33, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33,
					newQ33, newQ33));
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, oldThermalExpansionCoeff1,
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
						- CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, null, msgs);
			if (newThermalExpansionCoeff1 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, null, msgs);
			msgs = basicSetThermalExpansionCoeff1(newThermalExpansionCoeff1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, newThermalExpansionCoeff1,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, oldThermalExpansionCoeff2,
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
						- CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, null, msgs);
			if (newThermalExpansionCoeff2 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, null, msgs);
			msgs = basicSetThermalExpansionCoeff2(newThermalExpansionCoeff2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, newThermalExpansionCoeff2,
					newThermalExpansionCoeff2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalExpansionCoeff12() {
		return thermalExpansionCoeff12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalExpansionCoeff12(DoubleBaseType newThermalExpansionCoeff12,
			NotificationChain msgs) {
		DoubleBaseType oldThermalExpansionCoeff12 = thermalExpansionCoeff12;
		thermalExpansionCoeff12 = newThermalExpansionCoeff12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12,
					oldThermalExpansionCoeff12, newThermalExpansionCoeff12);
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
	public void setThermalExpansionCoeff12(DoubleBaseType newThermalExpansionCoeff12) {
		if (newThermalExpansionCoeff12 != thermalExpansionCoeff12) {
			NotificationChain msgs = null;
			if (thermalExpansionCoeff12 != null)
				msgs = ((InternalEObject) thermalExpansionCoeff12).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12,
						null, msgs);
			if (newThermalExpansionCoeff12 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12,
						null, msgs);
			msgs = basicSetThermalExpansionCoeff12(newThermalExpansionCoeff12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12,
					newThermalExpansionCoeff12, newThermalExpansionCoeff12));
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1, oldThermalConductivity1,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1,
						null, msgs);
			if (newThermalConductivity1 != null)
				msgs = ((InternalEObject) newThermalConductivity1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1,
						null, msgs);
			msgs = basicSetThermalConductivity1(newThermalConductivity1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1, newThermalConductivity1,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2, oldThermalConductivity2,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2,
						null, msgs);
			if (newThermalConductivity2 != null)
				msgs = ((InternalEObject) newThermalConductivity2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2,
						null, msgs);
			msgs = basicSetThermalConductivity2(newThermalConductivity2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2, newThermalConductivity2,
					newThermalConductivity2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalConductivity3() {
		return thermalConductivity3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalConductivity3(DoubleBaseType newThermalConductivity3,
			NotificationChain msgs) {
		DoubleBaseType oldThermalConductivity3 = thermalConductivity3;
		thermalConductivity3 = newThermalConductivity3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3, oldThermalConductivity3,
					newThermalConductivity3);
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
	public void setThermalConductivity3(DoubleBaseType newThermalConductivity3) {
		if (newThermalConductivity3 != thermalConductivity3) {
			NotificationChain msgs = null;
			if (thermalConductivity3 != null)
				msgs = ((InternalEObject) thermalConductivity3).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3,
						null, msgs);
			if (newThermalConductivity3 != null)
				msgs = ((InternalEObject) newThermalConductivity3).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3,
						null, msgs);
			msgs = basicSetThermalConductivity3(newThermalConductivity3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3, newThermalConductivity3,
					newThermalConductivity3));
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T, oldSig1t, newSig1t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T, null, msgs);
			if (newSig1t != null)
				msgs = ((InternalEObject) newSig1t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T, null, msgs);
			msgs = basicSetSig1t(newSig1t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C, oldSig1c, newSig1c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C, null, msgs);
			if (newSig1c != null)
				msgs = ((InternalEObject) newSig1c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C, null, msgs);
			msgs = basicSetSig1c(newSig1c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T, oldSig2t, newSig2t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T, null, msgs);
			if (newSig2t != null)
				msgs = ((InternalEObject) newSig2t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T, null, msgs);
			msgs = basicSetSig2t(newSig2t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C, oldSig2c, newSig2c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C, null, msgs);
			if (newSig2c != null)
				msgs = ((InternalEObject) newSig2c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C, null, msgs);
			msgs = basicSetSig2c(newSig2c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12, oldTau12, newTau12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12, null, msgs);
			if (newTau12 != null)
				msgs = ((InternalEObject) newTau12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12, null, msgs);
			msgs = basicSetTau12(newTau12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T, oldEps1t, newEps1t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T, null, msgs);
			if (newEps1t != null)
				msgs = ((InternalEObject) newEps1t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T, null, msgs);
			msgs = basicSetEps1t(newEps1t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C, oldEps1c, newEps1c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C, null, msgs);
			if (newEps1c != null)
				msgs = ((InternalEObject) newEps1c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C, null, msgs);
			msgs = basicSetEps1c(newEps1c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T, oldEps2t, newEps2t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T, null, msgs);
			if (newEps2t != null)
				msgs = ((InternalEObject) newEps2t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T, null, msgs);
			msgs = basicSetEps2t(newEps2t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C, oldEps2c, newEps2c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C, null, msgs);
			if (newEps2c != null)
				msgs = ((InternalEObject) newEps2c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C, null, msgs);
			msgs = basicSetEps2c(newEps2c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C,
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
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12, oldGamma12, newGamma12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12, null, msgs);
			if (newGamma12 != null)
				msgs = ((InternalEObject) newGamma12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12, null, msgs);
			msgs = basicSetGamma12(newGamma12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12, newGamma12, newGamma12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11:
			return basicSetQ11(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12:
			return basicSetQ12(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13:
			return basicSetQ13(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22:
			return basicSetQ22(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23:
			return basicSetQ23(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33:
			return basicSetQ33(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return basicSetThermalExpansionCoeff1(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return basicSetThermalExpansionCoeff2(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			return basicSetThermalExpansionCoeff12(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return basicSetThermalConductivity1(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return basicSetThermalConductivity2(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			return basicSetThermalConductivity3(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			return basicSetSig1t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			return basicSetSig1c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			return basicSetSig2t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			return basicSetSig2c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			return basicSetTau12(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			return basicSetEps1t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			return basicSetEps1c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			return basicSetEps2t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			return basicSetEps2c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11:
			return getQ11();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12:
			return getQ12();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13:
			return getQ13();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22:
			return getQ22();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23:
			return getQ23();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33:
			return getQ33();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return getThermalExpansionCoeff1();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return getThermalExpansionCoeff2();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			return getThermalExpansionCoeff12();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return getThermalConductivity1();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return getThermalConductivity2();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			return getThermalConductivity3();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			return getSig1t();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			return getSig1c();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			return getSig2t();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			return getSig2c();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			return getTau12();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			return getEps1t();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			return getEps1c();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			return getEps2t();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			return getEps2c();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11:
			setQ11((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12:
			setQ12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13:
			setQ13((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22:
			setQ22((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23:
			setQ23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33:
			setQ33((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			setThermalExpansionCoeff1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			setThermalExpansionCoeff2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			setThermalExpansionCoeff12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			setThermalConductivity1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			setThermalConductivity2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			setThermalConductivity3((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			setSig1t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			setSig1c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			setSig2t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			setSig2c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			setEps1t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			setEps1c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			setEps2t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			setEps2c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11:
			setQ11((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12:
			setQ12((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13:
			setQ13((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22:
			setQ22((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23:
			setQ23((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33:
			setQ33((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			setThermalExpansionCoeff1((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			setThermalExpansionCoeff2((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			setThermalExpansionCoeff12((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			setThermalConductivity1((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			setThermalConductivity2((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			setThermalConductivity3((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			setSig1t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			setSig1c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			setSig2t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			setSig2c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			setEps1t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			setEps1c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			setEps2t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			setEps2c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q11:
			return q11 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q12:
			return q12 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q13:
			return q13 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q22:
			return q22 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q23:
			return q23 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__Q33:
			return q33 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return thermalExpansionCoeff1 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return thermalExpansionCoeff2 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			return thermalExpansionCoeff12 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return thermalConductivity1 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return thermalConductivity2 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			return thermalConductivity3 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1T:
			return sig1t != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG1C:
			return sig1c != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2T:
			return sig2t != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__SIG2C:
			return sig2c != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__TAU12:
			return tau12 != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1T:
			return eps1t != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS1C:
			return eps1c != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2T:
			return eps2t != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__EPS2C:
			return eps2c != null;
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE__GAMMA12:
			return gamma12 != null;
		}
		return super.eIsSet(featureID);
	}

} //AnisotropicShellPropertiesTypeImpl
