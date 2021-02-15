/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.OrthotropicSolidPropertiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orthotropic Solid Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getE2 <em>E2</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getE3 <em>E3</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getG23 <em>G23</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getG31 <em>G31</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getG12 <em>G12</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getNu23 <em>Nu23</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getNu31 <em>Nu31</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getNu12 <em>Nu12</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff3 <em>Thermal Expansion Coeff3</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getThermalConductivity23 <em>Thermal Conductivity23</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getThermalConductivity31 <em>Thermal Conductivity31</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getThermalConductivity12 <em>Thermal Conductivity12</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getSig1t <em>Sig1t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getSig1c <em>Sig1c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getSig2t <em>Sig2t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getSig2c <em>Sig2c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getSig3t <em>Sig3t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getSig3c <em>Sig3c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getTau23 <em>Tau23</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getTau31 <em>Tau31</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getEps1t <em>Eps1t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getEps1c <em>Eps1c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getEps2t <em>Eps2t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getEps2c <em>Eps2c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getEps3t <em>Eps3t</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getEps3c <em>Eps3c</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getGamma23 <em>Gamma23</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getGamma31 <em>Gamma31</em>}</li>
 *   <li>{@link Cpacs.impl.OrthotropicSolidPropertiesTypeImpl#getGamma12 <em>Gamma12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrthotropicSolidPropertiesTypeImpl extends ComplexBaseTypeImpl implements OrthotropicSolidPropertiesType {
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
	 * The cached value of the '{@link #getE3() <em>E3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE3()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType e3;

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
	 * The cached value of the '{@link #getNu23() <em>Nu23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNu23()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nu23;

	/**
	 * The cached value of the '{@link #getNu31() <em>Nu31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNu31()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nu31;

	/**
	 * The cached value of the '{@link #getNu12() <em>Nu12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNu12()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nu12;

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
	 * The cached value of the '{@link #getThermalExpansionCoeff3() <em>Thermal Expansion Coeff3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoeff3()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalExpansionCoeff3;

	/**
	 * The cached value of the '{@link #getThermalConductivity23() <em>Thermal Conductivity23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity23()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalConductivity23;

	/**
	 * The cached value of the '{@link #getThermalConductivity31() <em>Thermal Conductivity31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity31()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalConductivity31;

	/**
	 * The cached value of the '{@link #getThermalConductivity12() <em>Thermal Conductivity12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity12()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalConductivity12;

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
	 * The cached value of the '{@link #getSig3t() <em>Sig3t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSig3t()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sig3t;

	/**
	 * The cached value of the '{@link #getSig3c() <em>Sig3c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSig3c()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sig3c;

	/**
	 * The cached value of the '{@link #getTau23() <em>Tau23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTau23()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType tau23;

	/**
	 * The cached value of the '{@link #getTau31() <em>Tau31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTau31()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType tau31;

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
	 * The cached value of the '{@link #getEps3t() <em>Eps3t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEps3t()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eps3t;

	/**
	 * The cached value of the '{@link #getEps3c() <em>Eps3c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEps3c()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eps3c;

	/**
	 * The cached value of the '{@link #getGamma23() <em>Gamma23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma23()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gamma23;

	/**
	 * The cached value of the '{@link #getGamma31() <em>Gamma31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma31()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gamma31;

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
	protected OrthotropicSolidPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getOrthotropicSolidPropertiesType();
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1, oldE1, newE1);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1, null, msgs);
			if (newE1 != null)
				msgs = ((InternalEObject) newE1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1, null, msgs);
			msgs = basicSetE1(newE1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2, oldE2, newE2);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2, null, msgs);
			if (newE2 != null)
				msgs = ((InternalEObject) newE2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2, null, msgs);
			msgs = basicSetE2(newE2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2,
					newE2, newE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getE3() {
		return e3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetE3(DoubleBaseType newE3, NotificationChain msgs) {
		DoubleBaseType oldE3 = e3;
		e3 = newE3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3, oldE3, newE3);
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
	public void setE3(DoubleBaseType newE3) {
		if (newE3 != e3) {
			NotificationChain msgs = null;
			if (e3 != null)
				msgs = ((InternalEObject) e3).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3, null, msgs);
			if (newE3 != null)
				msgs = ((InternalEObject) newE3).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3, null, msgs);
			msgs = basicSetE3(newE3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3,
					newE3, newE3));
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23, oldG23, newG23);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23, null, msgs);
			if (newG23 != null)
				msgs = ((InternalEObject) newG23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23, null, msgs);
			msgs = basicSetG23(newG23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31, oldG31, newG31);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31, null, msgs);
			if (newG31 != null)
				msgs = ((InternalEObject) newG31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31, null, msgs);
			msgs = basicSetG31(newG31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12, oldG12, newG12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12, null, msgs);
			if (newG12 != null)
				msgs = ((InternalEObject) newG12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12, null, msgs);
			msgs = basicSetG12(newG12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12,
					newG12, newG12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNu23() {
		return nu23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNu23(DoubleBaseType newNu23, NotificationChain msgs) {
		DoubleBaseType oldNu23 = nu23;
		nu23 = newNu23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23, oldNu23, newNu23);
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
	public void setNu23(DoubleBaseType newNu23) {
		if (newNu23 != nu23) {
			NotificationChain msgs = null;
			if (nu23 != null)
				msgs = ((InternalEObject) nu23).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23, null, msgs);
			if (newNu23 != null)
				msgs = ((InternalEObject) newNu23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23, null, msgs);
			msgs = basicSetNu23(newNu23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23,
					newNu23, newNu23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNu31() {
		return nu31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNu31(DoubleBaseType newNu31, NotificationChain msgs) {
		DoubleBaseType oldNu31 = nu31;
		nu31 = newNu31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31, oldNu31, newNu31);
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
	public void setNu31(DoubleBaseType newNu31) {
		if (newNu31 != nu31) {
			NotificationChain msgs = null;
			if (nu31 != null)
				msgs = ((InternalEObject) nu31).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31, null, msgs);
			if (newNu31 != null)
				msgs = ((InternalEObject) newNu31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31, null, msgs);
			msgs = basicSetNu31(newNu31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31,
					newNu31, newNu31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNu12() {
		return nu12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNu12(DoubleBaseType newNu12, NotificationChain msgs) {
		DoubleBaseType oldNu12 = nu12;
		nu12 = newNu12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12, oldNu12, newNu12);
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
	public void setNu12(DoubleBaseType newNu12) {
		if (newNu12 != nu12) {
			NotificationChain msgs = null;
			if (nu12 != null)
				msgs = ((InternalEObject) nu12).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12, null, msgs);
			if (newNu12 != null)
				msgs = ((InternalEObject) newNu12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12, null, msgs);
			msgs = basicSetNu12(newNu12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12,
					newNu12, newNu12));
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, oldThermalExpansionCoeff1,
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
						- CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, null, msgs);
			if (newThermalExpansionCoeff1 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, null, msgs);
			msgs = basicSetThermalExpansionCoeff1(newThermalExpansionCoeff1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, newThermalExpansionCoeff1,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, oldThermalExpansionCoeff2,
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
						- CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, null, msgs);
			if (newThermalExpansionCoeff2 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, null, msgs);
			msgs = basicSetThermalExpansionCoeff2(newThermalExpansionCoeff2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, newThermalExpansionCoeff2,
					newThermalExpansionCoeff2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalExpansionCoeff3() {
		return thermalExpansionCoeff3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalExpansionCoeff3(DoubleBaseType newThermalExpansionCoeff3,
			NotificationChain msgs) {
		DoubleBaseType oldThermalExpansionCoeff3 = thermalExpansionCoeff3;
		thermalExpansionCoeff3 = newThermalExpansionCoeff3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3, oldThermalExpansionCoeff3,
					newThermalExpansionCoeff3);
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
	public void setThermalExpansionCoeff3(DoubleBaseType newThermalExpansionCoeff3) {
		if (newThermalExpansionCoeff3 != thermalExpansionCoeff3) {
			NotificationChain msgs = null;
			if (thermalExpansionCoeff3 != null)
				msgs = ((InternalEObject) thermalExpansionCoeff3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3, null, msgs);
			if (newThermalExpansionCoeff3 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3, null, msgs);
			msgs = basicSetThermalExpansionCoeff3(newThermalExpansionCoeff3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3, newThermalExpansionCoeff3,
					newThermalExpansionCoeff3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalConductivity23() {
		return thermalConductivity23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalConductivity23(DoubleBaseType newThermalConductivity23,
			NotificationChain msgs) {
		DoubleBaseType oldThermalConductivity23 = thermalConductivity23;
		thermalConductivity23 = newThermalConductivity23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23, oldThermalConductivity23,
					newThermalConductivity23);
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
	public void setThermalConductivity23(DoubleBaseType newThermalConductivity23) {
		if (newThermalConductivity23 != thermalConductivity23) {
			NotificationChain msgs = null;
			if (thermalConductivity23 != null)
				msgs = ((InternalEObject) thermalConductivity23).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23,
						null, msgs);
			if (newThermalConductivity23 != null)
				msgs = ((InternalEObject) newThermalConductivity23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23,
						null, msgs);
			msgs = basicSetThermalConductivity23(newThermalConductivity23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23, newThermalConductivity23,
					newThermalConductivity23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalConductivity31() {
		return thermalConductivity31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalConductivity31(DoubleBaseType newThermalConductivity31,
			NotificationChain msgs) {
		DoubleBaseType oldThermalConductivity31 = thermalConductivity31;
		thermalConductivity31 = newThermalConductivity31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31, oldThermalConductivity31,
					newThermalConductivity31);
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
	public void setThermalConductivity31(DoubleBaseType newThermalConductivity31) {
		if (newThermalConductivity31 != thermalConductivity31) {
			NotificationChain msgs = null;
			if (thermalConductivity31 != null)
				msgs = ((InternalEObject) thermalConductivity31).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31,
						null, msgs);
			if (newThermalConductivity31 != null)
				msgs = ((InternalEObject) newThermalConductivity31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31,
						null, msgs);
			msgs = basicSetThermalConductivity31(newThermalConductivity31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31, newThermalConductivity31,
					newThermalConductivity31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalConductivity12() {
		return thermalConductivity12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalConductivity12(DoubleBaseType newThermalConductivity12,
			NotificationChain msgs) {
		DoubleBaseType oldThermalConductivity12 = thermalConductivity12;
		thermalConductivity12 = newThermalConductivity12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12, oldThermalConductivity12,
					newThermalConductivity12);
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
	public void setThermalConductivity12(DoubleBaseType newThermalConductivity12) {
		if (newThermalConductivity12 != thermalConductivity12) {
			NotificationChain msgs = null;
			if (thermalConductivity12 != null)
				msgs = ((InternalEObject) thermalConductivity12).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12,
						null, msgs);
			if (newThermalConductivity12 != null)
				msgs = ((InternalEObject) newThermalConductivity12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12,
						null, msgs);
			msgs = basicSetThermalConductivity12(newThermalConductivity12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12, newThermalConductivity12,
					newThermalConductivity12));
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T, oldSig1t, newSig1t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T, null, msgs);
			if (newSig1t != null)
				msgs = ((InternalEObject) newSig1t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T, null, msgs);
			msgs = basicSetSig1t(newSig1t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C, oldSig1c, newSig1c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C, null, msgs);
			if (newSig1c != null)
				msgs = ((InternalEObject) newSig1c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C, null, msgs);
			msgs = basicSetSig1c(newSig1c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T, oldSig2t, newSig2t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T, null, msgs);
			if (newSig2t != null)
				msgs = ((InternalEObject) newSig2t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T, null, msgs);
			msgs = basicSetSig2t(newSig2t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C, oldSig2c, newSig2c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C, null, msgs);
			if (newSig2c != null)
				msgs = ((InternalEObject) newSig2c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C, null, msgs);
			msgs = basicSetSig2c(newSig2c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C,
					newSig2c, newSig2c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSig3t() {
		return sig3t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSig3t(DoubleBaseType newSig3t, NotificationChain msgs) {
		DoubleBaseType oldSig3t = sig3t;
		sig3t = newSig3t;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T, oldSig3t, newSig3t);
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
	public void setSig3t(DoubleBaseType newSig3t) {
		if (newSig3t != sig3t) {
			NotificationChain msgs = null;
			if (sig3t != null)
				msgs = ((InternalEObject) sig3t).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T, null, msgs);
			if (newSig3t != null)
				msgs = ((InternalEObject) newSig3t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T, null, msgs);
			msgs = basicSetSig3t(newSig3t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T,
					newSig3t, newSig3t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSig3c() {
		return sig3c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSig3c(DoubleBaseType newSig3c, NotificationChain msgs) {
		DoubleBaseType oldSig3c = sig3c;
		sig3c = newSig3c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C, oldSig3c, newSig3c);
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
	public void setSig3c(DoubleBaseType newSig3c) {
		if (newSig3c != sig3c) {
			NotificationChain msgs = null;
			if (sig3c != null)
				msgs = ((InternalEObject) sig3c).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C, null, msgs);
			if (newSig3c != null)
				msgs = ((InternalEObject) newSig3c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C, null, msgs);
			msgs = basicSetSig3c(newSig3c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C,
					newSig3c, newSig3c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTau23() {
		return tau23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTau23(DoubleBaseType newTau23, NotificationChain msgs) {
		DoubleBaseType oldTau23 = tau23;
		tau23 = newTau23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23, oldTau23, newTau23);
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
	public void setTau23(DoubleBaseType newTau23) {
		if (newTau23 != tau23) {
			NotificationChain msgs = null;
			if (tau23 != null)
				msgs = ((InternalEObject) tau23).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23, null, msgs);
			if (newTau23 != null)
				msgs = ((InternalEObject) newTau23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23, null, msgs);
			msgs = basicSetTau23(newTau23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23,
					newTau23, newTau23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTau31() {
		return tau31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTau31(DoubleBaseType newTau31, NotificationChain msgs) {
		DoubleBaseType oldTau31 = tau31;
		tau31 = newTau31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31, oldTau31, newTau31);
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
	public void setTau31(DoubleBaseType newTau31) {
		if (newTau31 != tau31) {
			NotificationChain msgs = null;
			if (tau31 != null)
				msgs = ((InternalEObject) tau31).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31, null, msgs);
			if (newTau31 != null)
				msgs = ((InternalEObject) newTau31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31, null, msgs);
			msgs = basicSetTau31(newTau31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31,
					newTau31, newTau31));
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12, oldTau12, newTau12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12, null, msgs);
			if (newTau12 != null)
				msgs = ((InternalEObject) newTau12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12, null, msgs);
			msgs = basicSetTau12(newTau12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T, oldEps1t, newEps1t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T, null, msgs);
			if (newEps1t != null)
				msgs = ((InternalEObject) newEps1t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T, null, msgs);
			msgs = basicSetEps1t(newEps1t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C, oldEps1c, newEps1c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C, null, msgs);
			if (newEps1c != null)
				msgs = ((InternalEObject) newEps1c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C, null, msgs);
			msgs = basicSetEps1c(newEps1c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T, oldEps2t, newEps2t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T, null, msgs);
			if (newEps2t != null)
				msgs = ((InternalEObject) newEps2t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T, null, msgs);
			msgs = basicSetEps2t(newEps2t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T,
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C, oldEps2c, newEps2c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C, null, msgs);
			if (newEps2c != null)
				msgs = ((InternalEObject) newEps2c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C, null, msgs);
			msgs = basicSetEps2c(newEps2c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C,
					newEps2c, newEps2c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEps3t() {
		return eps3t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEps3t(DoubleBaseType newEps3t, NotificationChain msgs) {
		DoubleBaseType oldEps3t = eps3t;
		eps3t = newEps3t;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T, oldEps3t, newEps3t);
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
	public void setEps3t(DoubleBaseType newEps3t) {
		if (newEps3t != eps3t) {
			NotificationChain msgs = null;
			if (eps3t != null)
				msgs = ((InternalEObject) eps3t).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T, null, msgs);
			if (newEps3t != null)
				msgs = ((InternalEObject) newEps3t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T, null, msgs);
			msgs = basicSetEps3t(newEps3t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T,
					newEps3t, newEps3t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEps3c() {
		return eps3c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEps3c(DoubleBaseType newEps3c, NotificationChain msgs) {
		DoubleBaseType oldEps3c = eps3c;
		eps3c = newEps3c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C, oldEps3c, newEps3c);
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
	public void setEps3c(DoubleBaseType newEps3c) {
		if (newEps3c != eps3c) {
			NotificationChain msgs = null;
			if (eps3c != null)
				msgs = ((InternalEObject) eps3c).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C, null, msgs);
			if (newEps3c != null)
				msgs = ((InternalEObject) newEps3c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C, null, msgs);
			msgs = basicSetEps3c(newEps3c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C,
					newEps3c, newEps3c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGamma23() {
		return gamma23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGamma23(DoubleBaseType newGamma23, NotificationChain msgs) {
		DoubleBaseType oldGamma23 = gamma23;
		gamma23 = newGamma23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23, oldGamma23, newGamma23);
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
	public void setGamma23(DoubleBaseType newGamma23) {
		if (newGamma23 != gamma23) {
			NotificationChain msgs = null;
			if (gamma23 != null)
				msgs = ((InternalEObject) gamma23).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23, null, msgs);
			if (newGamma23 != null)
				msgs = ((InternalEObject) newGamma23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23, null, msgs);
			msgs = basicSetGamma23(newGamma23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23, newGamma23, newGamma23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGamma31() {
		return gamma31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGamma31(DoubleBaseType newGamma31, NotificationChain msgs) {
		DoubleBaseType oldGamma31 = gamma31;
		gamma31 = newGamma31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31, oldGamma31, newGamma31);
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
	public void setGamma31(DoubleBaseType newGamma31) {
		if (newGamma31 != gamma31) {
			NotificationChain msgs = null;
			if (gamma31 != null)
				msgs = ((InternalEObject) gamma31).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31, null, msgs);
			if (newGamma31 != null)
				msgs = ((InternalEObject) newGamma31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31, null, msgs);
			msgs = basicSetGamma31(newGamma31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31, newGamma31, newGamma31));
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
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12, oldGamma12, newGamma12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12, null, msgs);
			if (newGamma12 != null)
				msgs = ((InternalEObject) newGamma12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12, null, msgs);
			msgs = basicSetGamma12(newGamma12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12, newGamma12, newGamma12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1:
			return basicSetE1(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2:
			return basicSetE2(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3:
			return basicSetE3(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23:
			return basicSetG23(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31:
			return basicSetG31(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12:
			return basicSetG12(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23:
			return basicSetNu23(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31:
			return basicSetNu31(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12:
			return basicSetNu12(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return basicSetThermalExpansionCoeff1(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return basicSetThermalExpansionCoeff2(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			return basicSetThermalExpansionCoeff3(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			return basicSetThermalConductivity23(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			return basicSetThermalConductivity31(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			return basicSetThermalConductivity12(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			return basicSetSig1t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			return basicSetSig1c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			return basicSetSig2t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			return basicSetSig2c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			return basicSetSig3t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			return basicSetSig3c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			return basicSetTau23(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			return basicSetTau31(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			return basicSetTau12(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			return basicSetEps1t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			return basicSetEps1c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			return basicSetEps2t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			return basicSetEps2c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			return basicSetEps3t(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			return basicSetEps3c(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			return basicSetGamma23(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			return basicSetGamma31(null, msgs);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1:
			return getE1();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2:
			return getE2();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3:
			return getE3();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23:
			return getG23();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31:
			return getG31();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12:
			return getG12();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23:
			return getNu23();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31:
			return getNu31();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12:
			return getNu12();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return getThermalExpansionCoeff1();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return getThermalExpansionCoeff2();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			return getThermalExpansionCoeff3();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			return getThermalConductivity23();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			return getThermalConductivity31();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			return getThermalConductivity12();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			return getSig1t();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			return getSig1c();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			return getSig2t();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			return getSig2c();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			return getSig3t();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			return getSig3c();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			return getTau23();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			return getTau31();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			return getTau12();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			return getEps1t();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			return getEps1c();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			return getEps2t();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			return getEps2c();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			return getEps3t();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			return getEps3c();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			return getGamma23();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			return getGamma31();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1:
			setE1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2:
			setE2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3:
			setE3((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23:
			setG23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31:
			setG31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12:
			setG12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23:
			setNu23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31:
			setNu31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12:
			setNu12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			setThermalExpansionCoeff1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			setThermalExpansionCoeff2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			setThermalExpansionCoeff3((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			setThermalConductivity23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			setThermalConductivity31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			setThermalConductivity12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			setSig1t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			setSig1c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			setSig2t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			setSig2c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			setSig3t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			setSig3c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			setTau23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			setTau31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			setEps1t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			setEps1c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			setEps2t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			setEps2c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			setEps3t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			setEps3c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			setGamma23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			setGamma31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1:
			setE1((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2:
			setE2((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3:
			setE3((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23:
			setG23((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31:
			setG31((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12:
			setG12((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23:
			setNu23((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31:
			setNu31((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12:
			setNu12((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			setThermalExpansionCoeff1((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			setThermalExpansionCoeff2((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			setThermalExpansionCoeff3((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			setThermalConductivity23((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			setThermalConductivity31((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			setThermalConductivity12((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			setSig1t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			setSig1c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			setSig2t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			setSig2c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			setSig3t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			setSig3c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			setTau23((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			setTau31((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			setEps1t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			setEps1c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			setEps2t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			setEps2c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			setEps3t((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			setEps3c((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			setGamma23((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			setGamma31((DoubleBaseType) null);
			return;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E1:
			return e1 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E2:
			return e2 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__E3:
			return e3 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G23:
			return g23 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G31:
			return g31 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__G12:
			return g12 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU23:
			return nu23 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU31:
			return nu31 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__NU12:
			return nu12 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return thermalExpansionCoeff1 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return thermalExpansionCoeff2 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			return thermalExpansionCoeff3 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			return thermalConductivity23 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			return thermalConductivity31 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			return thermalConductivity12 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			return sig1t != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			return sig1c != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			return sig2t != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			return sig2c != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			return sig3t != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			return sig3c != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			return tau23 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			return tau31 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			return tau12 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			return eps1t != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			return eps1c != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			return eps2t != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			return eps2c != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			return eps3t != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			return eps3c != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			return gamma23 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			return gamma31 != null;
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
			return gamma12 != null;
		}
		return super.eIsSet(featureID);
	}

} //OrthotropicSolidPropertiesTypeImpl
