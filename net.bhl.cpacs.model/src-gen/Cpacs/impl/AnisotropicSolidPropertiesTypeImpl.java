/**
 */
package Cpacs.impl;

import Cpacs.AnisotropicSolidPropertiesType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anisotropic Solid Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC11 <em>C11</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC12 <em>C12</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC13 <em>C13</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC14 <em>C14</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC15 <em>C15</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC16 <em>C16</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC22 <em>C22</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC23 <em>C23</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC24 <em>C24</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC25 <em>C25</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC26 <em>C26</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC33 <em>C33</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC34 <em>C34</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC35 <em>C35</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC36 <em>C36</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC44 <em>C44</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC45 <em>C45</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC46 <em>C46</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC55 <em>C55</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC56 <em>C56</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getC66 <em>C66</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff3 <em>Thermal Expansion Coeff3</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff23 <em>Thermal Expansion Coeff23</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff31 <em>Thermal Expansion Coeff31</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalExpansionCoeff12 <em>Thermal Expansion Coeff12</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalConductivity1 <em>Thermal Conductivity1</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalConductivity2 <em>Thermal Conductivity2</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalConductivity3 <em>Thermal Conductivity3</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalConductivity23 <em>Thermal Conductivity23</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalConductivity31 <em>Thermal Conductivity31</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getThermalConductivity12 <em>Thermal Conductivity12</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getSig1t <em>Sig1t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getSig1c <em>Sig1c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getSig2t <em>Sig2t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getSig2c <em>Sig2c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getSig3t <em>Sig3t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getSig3c <em>Sig3c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getTau23 <em>Tau23</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getTau31 <em>Tau31</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getEps1t <em>Eps1t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getEps1c <em>Eps1c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getEps2t <em>Eps2t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getEps2c <em>Eps2c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getEps3t <em>Eps3t</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getEps3c <em>Eps3c</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getGamma23 <em>Gamma23</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getGamma31 <em>Gamma31</em>}</li>
 *   <li>{@link Cpacs.impl.AnisotropicSolidPropertiesTypeImpl#getGamma12 <em>Gamma12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnisotropicSolidPropertiesTypeImpl extends ComplexBaseTypeImpl implements AnisotropicSolidPropertiesType {
	/**
	 * The cached value of the '{@link #getC11() <em>C11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC11()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c11;

	/**
	 * The cached value of the '{@link #getC12() <em>C12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC12()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c12;

	/**
	 * The cached value of the '{@link #getC13() <em>C13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC13()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c13;

	/**
	 * The cached value of the '{@link #getC14() <em>C14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC14()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c14;

	/**
	 * The cached value of the '{@link #getC15() <em>C15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC15()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c15;

	/**
	 * The cached value of the '{@link #getC16() <em>C16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC16()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c16;

	/**
	 * The cached value of the '{@link #getC22() <em>C22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC22()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c22;

	/**
	 * The cached value of the '{@link #getC23() <em>C23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC23()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c23;

	/**
	 * The cached value of the '{@link #getC24() <em>C24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC24()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c24;

	/**
	 * The cached value of the '{@link #getC25() <em>C25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC25()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c25;

	/**
	 * The cached value of the '{@link #getC26() <em>C26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC26()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c26;

	/**
	 * The cached value of the '{@link #getC33() <em>C33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC33()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c33;

	/**
	 * The cached value of the '{@link #getC34() <em>C34</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC34()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c34;

	/**
	 * The cached value of the '{@link #getC35() <em>C35</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC35()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c35;

	/**
	 * The cached value of the '{@link #getC36() <em>C36</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC36()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c36;

	/**
	 * The cached value of the '{@link #getC44() <em>C44</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC44()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c44;

	/**
	 * The cached value of the '{@link #getC45() <em>C45</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC45()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c45;

	/**
	 * The cached value of the '{@link #getC46() <em>C46</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC46()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c46;

	/**
	 * The cached value of the '{@link #getC55() <em>C55</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC55()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c55;

	/**
	 * The cached value of the '{@link #getC56() <em>C56</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC56()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c56;

	/**
	 * The cached value of the '{@link #getC66() <em>C66</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC66()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c66;

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
	 * The cached value of the '{@link #getThermalExpansionCoeff23() <em>Thermal Expansion Coeff23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoeff23()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalExpansionCoeff23;

	/**
	 * The cached value of the '{@link #getThermalExpansionCoeff31() <em>Thermal Expansion Coeff31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoeff31()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thermalExpansionCoeff31;

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
	protected AnisotropicSolidPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAnisotropicSolidPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC11() {
		return c11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC11(DoubleBaseType newC11, NotificationChain msgs) {
		DoubleBaseType oldC11 = c11;
		c11 = newC11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11, oldC11, newC11);
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
	public void setC11(DoubleBaseType newC11) {
		if (newC11 != c11) {
			NotificationChain msgs = null;
			if (c11 != null)
				msgs = ((InternalEObject) c11).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11, null, msgs);
			if (newC11 != null)
				msgs = ((InternalEObject) newC11).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11, null, msgs);
			msgs = basicSetC11(newC11, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11,
					newC11, newC11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC12() {
		return c12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC12(DoubleBaseType newC12, NotificationChain msgs) {
		DoubleBaseType oldC12 = c12;
		c12 = newC12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12, oldC12, newC12);
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
	public void setC12(DoubleBaseType newC12) {
		if (newC12 != c12) {
			NotificationChain msgs = null;
			if (c12 != null)
				msgs = ((InternalEObject) c12).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12, null, msgs);
			if (newC12 != null)
				msgs = ((InternalEObject) newC12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12, null, msgs);
			msgs = basicSetC12(newC12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12,
					newC12, newC12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC13() {
		return c13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC13(DoubleBaseType newC13, NotificationChain msgs) {
		DoubleBaseType oldC13 = c13;
		c13 = newC13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13, oldC13, newC13);
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
	public void setC13(DoubleBaseType newC13) {
		if (newC13 != c13) {
			NotificationChain msgs = null;
			if (c13 != null)
				msgs = ((InternalEObject) c13).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13, null, msgs);
			if (newC13 != null)
				msgs = ((InternalEObject) newC13).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13, null, msgs);
			msgs = basicSetC13(newC13, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13,
					newC13, newC13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC14() {
		return c14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC14(DoubleBaseType newC14, NotificationChain msgs) {
		DoubleBaseType oldC14 = c14;
		c14 = newC14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14, oldC14, newC14);
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
	public void setC14(DoubleBaseType newC14) {
		if (newC14 != c14) {
			NotificationChain msgs = null;
			if (c14 != null)
				msgs = ((InternalEObject) c14).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14, null, msgs);
			if (newC14 != null)
				msgs = ((InternalEObject) newC14).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14, null, msgs);
			msgs = basicSetC14(newC14, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14,
					newC14, newC14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC15() {
		return c15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC15(DoubleBaseType newC15, NotificationChain msgs) {
		DoubleBaseType oldC15 = c15;
		c15 = newC15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15, oldC15, newC15);
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
	public void setC15(DoubleBaseType newC15) {
		if (newC15 != c15) {
			NotificationChain msgs = null;
			if (c15 != null)
				msgs = ((InternalEObject) c15).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15, null, msgs);
			if (newC15 != null)
				msgs = ((InternalEObject) newC15).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15, null, msgs);
			msgs = basicSetC15(newC15, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15,
					newC15, newC15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC16() {
		return c16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC16(DoubleBaseType newC16, NotificationChain msgs) {
		DoubleBaseType oldC16 = c16;
		c16 = newC16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16, oldC16, newC16);
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
	public void setC16(DoubleBaseType newC16) {
		if (newC16 != c16) {
			NotificationChain msgs = null;
			if (c16 != null)
				msgs = ((InternalEObject) c16).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16, null, msgs);
			if (newC16 != null)
				msgs = ((InternalEObject) newC16).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16, null, msgs);
			msgs = basicSetC16(newC16, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16,
					newC16, newC16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC22() {
		return c22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC22(DoubleBaseType newC22, NotificationChain msgs) {
		DoubleBaseType oldC22 = c22;
		c22 = newC22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22, oldC22, newC22);
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
	public void setC22(DoubleBaseType newC22) {
		if (newC22 != c22) {
			NotificationChain msgs = null;
			if (c22 != null)
				msgs = ((InternalEObject) c22).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22, null, msgs);
			if (newC22 != null)
				msgs = ((InternalEObject) newC22).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22, null, msgs);
			msgs = basicSetC22(newC22, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22,
					newC22, newC22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC23() {
		return c23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC23(DoubleBaseType newC23, NotificationChain msgs) {
		DoubleBaseType oldC23 = c23;
		c23 = newC23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23, oldC23, newC23);
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
	public void setC23(DoubleBaseType newC23) {
		if (newC23 != c23) {
			NotificationChain msgs = null;
			if (c23 != null)
				msgs = ((InternalEObject) c23).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23, null, msgs);
			if (newC23 != null)
				msgs = ((InternalEObject) newC23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23, null, msgs);
			msgs = basicSetC23(newC23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23,
					newC23, newC23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC24() {
		return c24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC24(DoubleBaseType newC24, NotificationChain msgs) {
		DoubleBaseType oldC24 = c24;
		c24 = newC24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24, oldC24, newC24);
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
	public void setC24(DoubleBaseType newC24) {
		if (newC24 != c24) {
			NotificationChain msgs = null;
			if (c24 != null)
				msgs = ((InternalEObject) c24).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24, null, msgs);
			if (newC24 != null)
				msgs = ((InternalEObject) newC24).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24, null, msgs);
			msgs = basicSetC24(newC24, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24,
					newC24, newC24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC25() {
		return c25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC25(DoubleBaseType newC25, NotificationChain msgs) {
		DoubleBaseType oldC25 = c25;
		c25 = newC25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25, oldC25, newC25);
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
	public void setC25(DoubleBaseType newC25) {
		if (newC25 != c25) {
			NotificationChain msgs = null;
			if (c25 != null)
				msgs = ((InternalEObject) c25).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25, null, msgs);
			if (newC25 != null)
				msgs = ((InternalEObject) newC25).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25, null, msgs);
			msgs = basicSetC25(newC25, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25,
					newC25, newC25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC26() {
		return c26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC26(DoubleBaseType newC26, NotificationChain msgs) {
		DoubleBaseType oldC26 = c26;
		c26 = newC26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26, oldC26, newC26);
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
	public void setC26(DoubleBaseType newC26) {
		if (newC26 != c26) {
			NotificationChain msgs = null;
			if (c26 != null)
				msgs = ((InternalEObject) c26).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26, null, msgs);
			if (newC26 != null)
				msgs = ((InternalEObject) newC26).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26, null, msgs);
			msgs = basicSetC26(newC26, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26,
					newC26, newC26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC33() {
		return c33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC33(DoubleBaseType newC33, NotificationChain msgs) {
		DoubleBaseType oldC33 = c33;
		c33 = newC33;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33, oldC33, newC33);
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
	public void setC33(DoubleBaseType newC33) {
		if (newC33 != c33) {
			NotificationChain msgs = null;
			if (c33 != null)
				msgs = ((InternalEObject) c33).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33, null, msgs);
			if (newC33 != null)
				msgs = ((InternalEObject) newC33).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33, null, msgs);
			msgs = basicSetC33(newC33, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33,
					newC33, newC33));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC34() {
		return c34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC34(DoubleBaseType newC34, NotificationChain msgs) {
		DoubleBaseType oldC34 = c34;
		c34 = newC34;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34, oldC34, newC34);
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
	public void setC34(DoubleBaseType newC34) {
		if (newC34 != c34) {
			NotificationChain msgs = null;
			if (c34 != null)
				msgs = ((InternalEObject) c34).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34, null, msgs);
			if (newC34 != null)
				msgs = ((InternalEObject) newC34).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34, null, msgs);
			msgs = basicSetC34(newC34, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34,
					newC34, newC34));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC35() {
		return c35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC35(DoubleBaseType newC35, NotificationChain msgs) {
		DoubleBaseType oldC35 = c35;
		c35 = newC35;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35, oldC35, newC35);
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
	public void setC35(DoubleBaseType newC35) {
		if (newC35 != c35) {
			NotificationChain msgs = null;
			if (c35 != null)
				msgs = ((InternalEObject) c35).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35, null, msgs);
			if (newC35 != null)
				msgs = ((InternalEObject) newC35).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35, null, msgs);
			msgs = basicSetC35(newC35, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35,
					newC35, newC35));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC36() {
		return c36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC36(DoubleBaseType newC36, NotificationChain msgs) {
		DoubleBaseType oldC36 = c36;
		c36 = newC36;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36, oldC36, newC36);
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
	public void setC36(DoubleBaseType newC36) {
		if (newC36 != c36) {
			NotificationChain msgs = null;
			if (c36 != null)
				msgs = ((InternalEObject) c36).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36, null, msgs);
			if (newC36 != null)
				msgs = ((InternalEObject) newC36).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36, null, msgs);
			msgs = basicSetC36(newC36, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36,
					newC36, newC36));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC44() {
		return c44;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC44(DoubleBaseType newC44, NotificationChain msgs) {
		DoubleBaseType oldC44 = c44;
		c44 = newC44;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44, oldC44, newC44);
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
	public void setC44(DoubleBaseType newC44) {
		if (newC44 != c44) {
			NotificationChain msgs = null;
			if (c44 != null)
				msgs = ((InternalEObject) c44).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44, null, msgs);
			if (newC44 != null)
				msgs = ((InternalEObject) newC44).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44, null, msgs);
			msgs = basicSetC44(newC44, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44,
					newC44, newC44));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC45() {
		return c45;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC45(DoubleBaseType newC45, NotificationChain msgs) {
		DoubleBaseType oldC45 = c45;
		c45 = newC45;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45, oldC45, newC45);
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
	public void setC45(DoubleBaseType newC45) {
		if (newC45 != c45) {
			NotificationChain msgs = null;
			if (c45 != null)
				msgs = ((InternalEObject) c45).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45, null, msgs);
			if (newC45 != null)
				msgs = ((InternalEObject) newC45).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45, null, msgs);
			msgs = basicSetC45(newC45, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45,
					newC45, newC45));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC46() {
		return c46;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC46(DoubleBaseType newC46, NotificationChain msgs) {
		DoubleBaseType oldC46 = c46;
		c46 = newC46;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46, oldC46, newC46);
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
	public void setC46(DoubleBaseType newC46) {
		if (newC46 != c46) {
			NotificationChain msgs = null;
			if (c46 != null)
				msgs = ((InternalEObject) c46).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46, null, msgs);
			if (newC46 != null)
				msgs = ((InternalEObject) newC46).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46, null, msgs);
			msgs = basicSetC46(newC46, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46,
					newC46, newC46));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC55() {
		return c55;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC55(DoubleBaseType newC55, NotificationChain msgs) {
		DoubleBaseType oldC55 = c55;
		c55 = newC55;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55, oldC55, newC55);
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
	public void setC55(DoubleBaseType newC55) {
		if (newC55 != c55) {
			NotificationChain msgs = null;
			if (c55 != null)
				msgs = ((InternalEObject) c55).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55, null, msgs);
			if (newC55 != null)
				msgs = ((InternalEObject) newC55).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55, null, msgs);
			msgs = basicSetC55(newC55, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55,
					newC55, newC55));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC56() {
		return c56;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC56(DoubleBaseType newC56, NotificationChain msgs) {
		DoubleBaseType oldC56 = c56;
		c56 = newC56;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56, oldC56, newC56);
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
	public void setC56(DoubleBaseType newC56) {
		if (newC56 != c56) {
			NotificationChain msgs = null;
			if (c56 != null)
				msgs = ((InternalEObject) c56).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56, null, msgs);
			if (newC56 != null)
				msgs = ((InternalEObject) newC56).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56, null, msgs);
			msgs = basicSetC56(newC56, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56,
					newC56, newC56));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC66() {
		return c66;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC66(DoubleBaseType newC66, NotificationChain msgs) {
		DoubleBaseType oldC66 = c66;
		c66 = newC66;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66, oldC66, newC66);
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
	public void setC66(DoubleBaseType newC66) {
		if (newC66 != c66) {
			NotificationChain msgs = null;
			if (c66 != null)
				msgs = ((InternalEObject) c66).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66, null, msgs);
			if (newC66 != null)
				msgs = ((InternalEObject) newC66).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66, null, msgs);
			msgs = basicSetC66(newC66, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66,
					newC66, newC66));
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, oldThermalExpansionCoeff1,
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
						- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, null, msgs);
			if (newThermalExpansionCoeff1 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, null, msgs);
			msgs = basicSetThermalExpansionCoeff1(newThermalExpansionCoeff1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1, newThermalExpansionCoeff1,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, oldThermalExpansionCoeff2,
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
						- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, null, msgs);
			if (newThermalExpansionCoeff2 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, null, msgs);
			msgs = basicSetThermalExpansionCoeff2(newThermalExpansionCoeff2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2, newThermalExpansionCoeff2,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3, oldThermalExpansionCoeff3,
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
						- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3, null, msgs);
			if (newThermalExpansionCoeff3 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3, null, msgs);
			msgs = basicSetThermalExpansionCoeff3(newThermalExpansionCoeff3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3, newThermalExpansionCoeff3,
					newThermalExpansionCoeff3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalExpansionCoeff23() {
		return thermalExpansionCoeff23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalExpansionCoeff23(DoubleBaseType newThermalExpansionCoeff23,
			NotificationChain msgs) {
		DoubleBaseType oldThermalExpansionCoeff23 = thermalExpansionCoeff23;
		thermalExpansionCoeff23 = newThermalExpansionCoeff23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23,
					oldThermalExpansionCoeff23, newThermalExpansionCoeff23);
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
	public void setThermalExpansionCoeff23(DoubleBaseType newThermalExpansionCoeff23) {
		if (newThermalExpansionCoeff23 != thermalExpansionCoeff23) {
			NotificationChain msgs = null;
			if (thermalExpansionCoeff23 != null)
				msgs = ((InternalEObject) thermalExpansionCoeff23).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23,
						null, msgs);
			if (newThermalExpansionCoeff23 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23,
						null, msgs);
			msgs = basicSetThermalExpansionCoeff23(newThermalExpansionCoeff23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23,
					newThermalExpansionCoeff23, newThermalExpansionCoeff23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThermalExpansionCoeff31() {
		return thermalExpansionCoeff31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalExpansionCoeff31(DoubleBaseType newThermalExpansionCoeff31,
			NotificationChain msgs) {
		DoubleBaseType oldThermalExpansionCoeff31 = thermalExpansionCoeff31;
		thermalExpansionCoeff31 = newThermalExpansionCoeff31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31,
					oldThermalExpansionCoeff31, newThermalExpansionCoeff31);
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
	public void setThermalExpansionCoeff31(DoubleBaseType newThermalExpansionCoeff31) {
		if (newThermalExpansionCoeff31 != thermalExpansionCoeff31) {
			NotificationChain msgs = null;
			if (thermalExpansionCoeff31 != null)
				msgs = ((InternalEObject) thermalExpansionCoeff31).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31,
						null, msgs);
			if (newThermalExpansionCoeff31 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31,
						null, msgs);
			msgs = basicSetThermalExpansionCoeff31(newThermalExpansionCoeff31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31,
					newThermalExpansionCoeff31, newThermalExpansionCoeff31));
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12,
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
								- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12,
						null, msgs);
			if (newThermalExpansionCoeff12 != null)
				msgs = ((InternalEObject) newThermalExpansionCoeff12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12,
						null, msgs);
			msgs = basicSetThermalExpansionCoeff12(newThermalExpansionCoeff12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1, oldThermalConductivity1,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1,
						null, msgs);
			if (newThermalConductivity1 != null)
				msgs = ((InternalEObject) newThermalConductivity1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1,
						null, msgs);
			msgs = basicSetThermalConductivity1(newThermalConductivity1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1, newThermalConductivity1,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2, oldThermalConductivity2,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2,
						null, msgs);
			if (newThermalConductivity2 != null)
				msgs = ((InternalEObject) newThermalConductivity2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2,
						null, msgs);
			msgs = basicSetThermalConductivity2(newThermalConductivity2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2, newThermalConductivity2,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3, oldThermalConductivity3,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3,
						null, msgs);
			if (newThermalConductivity3 != null)
				msgs = ((InternalEObject) newThermalConductivity3).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3,
						null, msgs);
			msgs = basicSetThermalConductivity3(newThermalConductivity3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3, newThermalConductivity3,
					newThermalConductivity3));
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23, oldThermalConductivity23,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23,
						null, msgs);
			if (newThermalConductivity23 != null)
				msgs = ((InternalEObject) newThermalConductivity23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23,
						null, msgs);
			msgs = basicSetThermalConductivity23(newThermalConductivity23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23, newThermalConductivity23,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31, oldThermalConductivity31,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31,
						null, msgs);
			if (newThermalConductivity31 != null)
				msgs = ((InternalEObject) newThermalConductivity31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31,
						null, msgs);
			msgs = basicSetThermalConductivity31(newThermalConductivity31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31, newThermalConductivity31,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12, oldThermalConductivity12,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12,
						null, msgs);
			if (newThermalConductivity12 != null)
				msgs = ((InternalEObject) newThermalConductivity12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12,
						null, msgs);
			msgs = basicSetThermalConductivity12(newThermalConductivity12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12, newThermalConductivity12,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T, oldSig1t, newSig1t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T, null, msgs);
			if (newSig1t != null)
				msgs = ((InternalEObject) newSig1t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T, null, msgs);
			msgs = basicSetSig1t(newSig1t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C, oldSig1c, newSig1c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C, null, msgs);
			if (newSig1c != null)
				msgs = ((InternalEObject) newSig1c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C, null, msgs);
			msgs = basicSetSig1c(newSig1c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T, oldSig2t, newSig2t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T, null, msgs);
			if (newSig2t != null)
				msgs = ((InternalEObject) newSig2t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T, null, msgs);
			msgs = basicSetSig2t(newSig2t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C, oldSig2c, newSig2c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C, null, msgs);
			if (newSig2c != null)
				msgs = ((InternalEObject) newSig2c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C, null, msgs);
			msgs = basicSetSig2c(newSig2c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T, oldSig3t, newSig3t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T, null, msgs);
			if (newSig3t != null)
				msgs = ((InternalEObject) newSig3t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T, null, msgs);
			msgs = basicSetSig3t(newSig3t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C, oldSig3c, newSig3c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C, null, msgs);
			if (newSig3c != null)
				msgs = ((InternalEObject) newSig3c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C, null, msgs);
			msgs = basicSetSig3c(newSig3c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23, oldTau23, newTau23);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23, null, msgs);
			if (newTau23 != null)
				msgs = ((InternalEObject) newTau23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23, null, msgs);
			msgs = basicSetTau23(newTau23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31, oldTau31, newTau31);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31, null, msgs);
			if (newTau31 != null)
				msgs = ((InternalEObject) newTau31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31, null, msgs);
			msgs = basicSetTau31(newTau31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12, oldTau12, newTau12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12, null, msgs);
			if (newTau12 != null)
				msgs = ((InternalEObject) newTau12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12, null, msgs);
			msgs = basicSetTau12(newTau12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T, oldEps1t, newEps1t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T, null, msgs);
			if (newEps1t != null)
				msgs = ((InternalEObject) newEps1t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T, null, msgs);
			msgs = basicSetEps1t(newEps1t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C, oldEps1c, newEps1c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C, null, msgs);
			if (newEps1c != null)
				msgs = ((InternalEObject) newEps1c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C, null, msgs);
			msgs = basicSetEps1c(newEps1c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T, oldEps2t, newEps2t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T, null, msgs);
			if (newEps2t != null)
				msgs = ((InternalEObject) newEps2t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T, null, msgs);
			msgs = basicSetEps2t(newEps2t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C, oldEps2c, newEps2c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C, null, msgs);
			if (newEps2c != null)
				msgs = ((InternalEObject) newEps2c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C, null, msgs);
			msgs = basicSetEps2c(newEps2c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T, oldEps3t, newEps3t);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T, null, msgs);
			if (newEps3t != null)
				msgs = ((InternalEObject) newEps3t).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T, null, msgs);
			msgs = basicSetEps3t(newEps3t, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C, oldEps3c, newEps3c);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C, null, msgs);
			if (newEps3c != null)
				msgs = ((InternalEObject) newEps3c).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C, null, msgs);
			msgs = basicSetEps3c(newEps3c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C,
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23, oldGamma23, newGamma23);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23, null, msgs);
			if (newGamma23 != null)
				msgs = ((InternalEObject) newGamma23).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23, null, msgs);
			msgs = basicSetGamma23(newGamma23, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23, newGamma23, newGamma23));
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31, oldGamma31, newGamma31);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31, null, msgs);
			if (newGamma31 != null)
				msgs = ((InternalEObject) newGamma31).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31, null, msgs);
			msgs = basicSetGamma31(newGamma31, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31, newGamma31, newGamma31));
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
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12, oldGamma12, newGamma12);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12, null, msgs);
			if (newGamma12 != null)
				msgs = ((InternalEObject) newGamma12).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12, null, msgs);
			msgs = basicSetGamma12(newGamma12, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12, newGamma12, newGamma12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11:
			return basicSetC11(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12:
			return basicSetC12(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13:
			return basicSetC13(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14:
			return basicSetC14(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15:
			return basicSetC15(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16:
			return basicSetC16(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22:
			return basicSetC22(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23:
			return basicSetC23(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24:
			return basicSetC24(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25:
			return basicSetC25(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26:
			return basicSetC26(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33:
			return basicSetC33(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34:
			return basicSetC34(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35:
			return basicSetC35(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36:
			return basicSetC36(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44:
			return basicSetC44(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45:
			return basicSetC45(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46:
			return basicSetC46(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55:
			return basicSetC55(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56:
			return basicSetC56(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66:
			return basicSetC66(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return basicSetThermalExpansionCoeff1(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return basicSetThermalExpansionCoeff2(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			return basicSetThermalExpansionCoeff3(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23:
			return basicSetThermalExpansionCoeff23(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31:
			return basicSetThermalExpansionCoeff31(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			return basicSetThermalExpansionCoeff12(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return basicSetThermalConductivity1(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return basicSetThermalConductivity2(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			return basicSetThermalConductivity3(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			return basicSetThermalConductivity23(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			return basicSetThermalConductivity31(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			return basicSetThermalConductivity12(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			return basicSetSig1t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			return basicSetSig1c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			return basicSetSig2t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			return basicSetSig2c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			return basicSetSig3t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			return basicSetSig3c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			return basicSetTau23(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			return basicSetTau31(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			return basicSetTau12(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			return basicSetEps1t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			return basicSetEps1c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			return basicSetEps2t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			return basicSetEps2c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			return basicSetEps3t(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			return basicSetEps3c(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			return basicSetGamma23(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			return basicSetGamma31(null, msgs);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11:
			return getC11();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12:
			return getC12();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13:
			return getC13();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14:
			return getC14();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15:
			return getC15();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16:
			return getC16();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22:
			return getC22();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23:
			return getC23();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24:
			return getC24();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25:
			return getC25();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26:
			return getC26();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33:
			return getC33();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34:
			return getC34();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35:
			return getC35();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36:
			return getC36();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44:
			return getC44();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45:
			return getC45();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46:
			return getC46();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55:
			return getC55();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56:
			return getC56();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66:
			return getC66();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return getThermalExpansionCoeff1();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return getThermalExpansionCoeff2();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			return getThermalExpansionCoeff3();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23:
			return getThermalExpansionCoeff23();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31:
			return getThermalExpansionCoeff31();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			return getThermalExpansionCoeff12();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return getThermalConductivity1();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return getThermalConductivity2();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			return getThermalConductivity3();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			return getThermalConductivity23();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			return getThermalConductivity31();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			return getThermalConductivity12();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			return getSig1t();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			return getSig1c();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			return getSig2t();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			return getSig2c();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			return getSig3t();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			return getSig3c();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			return getTau23();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			return getTau31();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			return getTau12();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			return getEps1t();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			return getEps1c();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			return getEps2t();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			return getEps2c();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			return getEps3t();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			return getEps3c();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			return getGamma23();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			return getGamma31();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11:
			setC11((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12:
			setC12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13:
			setC13((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14:
			setC14((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15:
			setC15((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16:
			setC16((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22:
			setC22((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23:
			setC23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24:
			setC24((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25:
			setC25((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26:
			setC26((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33:
			setC33((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34:
			setC34((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35:
			setC35((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36:
			setC36((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44:
			setC44((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45:
			setC45((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46:
			setC46((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55:
			setC55((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56:
			setC56((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66:
			setC66((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			setThermalExpansionCoeff1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			setThermalExpansionCoeff2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			setThermalExpansionCoeff3((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23:
			setThermalExpansionCoeff23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31:
			setThermalExpansionCoeff31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			setThermalExpansionCoeff12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			setThermalConductivity1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			setThermalConductivity2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			setThermalConductivity3((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			setThermalConductivity23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			setThermalConductivity31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			setThermalConductivity12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			setSig1t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			setSig1c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			setSig2t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			setSig2c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			setSig3t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			setSig3c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			setTau23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			setTau31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			setEps1t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			setEps1c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			setEps2t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			setEps2c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			setEps3t((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			setEps3c((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			setGamma23((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			setGamma31((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11:
			setC11((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12:
			setC12((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13:
			setC13((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14:
			setC14((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15:
			setC15((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16:
			setC16((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22:
			setC22((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23:
			setC23((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24:
			setC24((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25:
			setC25((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26:
			setC26((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33:
			setC33((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34:
			setC34((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35:
			setC35((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36:
			setC36((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44:
			setC44((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45:
			setC45((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46:
			setC46((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55:
			setC55((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56:
			setC56((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66:
			setC66((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			setThermalExpansionCoeff1((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			setThermalExpansionCoeff2((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			setThermalExpansionCoeff3((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23:
			setThermalExpansionCoeff23((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31:
			setThermalExpansionCoeff31((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			setThermalExpansionCoeff12((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			setThermalConductivity1((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			setThermalConductivity2((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			setThermalConductivity3((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			setThermalConductivity23((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			setThermalConductivity31((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			setThermalConductivity12((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			setSig1t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			setSig1c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			setSig2t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			setSig2c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			setSig3t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			setSig3c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			setTau23((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			setTau31((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			setTau12((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			setEps1t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			setEps1c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			setEps2t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			setEps2c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			setEps3t((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			setEps3c((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			setGamma23((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			setGamma31((DoubleBaseType) null);
			return;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
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
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C11:
			return c11 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C12:
			return c12 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C13:
			return c13 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C14:
			return c14 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C15:
			return c15 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C16:
			return c16 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C22:
			return c22 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C23:
			return c23 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C24:
			return c24 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C25:
			return c25 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C26:
			return c26 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C33:
			return c33 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C34:
			return c34 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C35:
			return c35 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C36:
			return c36 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C44:
			return c44 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C45:
			return c45 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C46:
			return c46 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C55:
			return c55 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C56:
			return c56 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__C66:
			return c66 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF1:
			return thermalExpansionCoeff1 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF2:
			return thermalExpansionCoeff2 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF3:
			return thermalExpansionCoeff3 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF23:
			return thermalExpansionCoeff23 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF31:
			return thermalExpansionCoeff31 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_EXPANSION_COEFF12:
			return thermalExpansionCoeff12 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY1:
			return thermalConductivity1 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY2:
			return thermalConductivity2 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY3:
			return thermalConductivity3 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY23:
			return thermalConductivity23 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY31:
			return thermalConductivity31 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__THERMAL_CONDUCTIVITY12:
			return thermalConductivity12 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1T:
			return sig1t != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG1C:
			return sig1c != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2T:
			return sig2t != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG2C:
			return sig2c != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3T:
			return sig3t != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__SIG3C:
			return sig3c != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU23:
			return tau23 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU31:
			return tau31 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__TAU12:
			return tau12 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1T:
			return eps1t != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS1C:
			return eps1c != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2T:
			return eps2t != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS2C:
			return eps2c != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3T:
			return eps3t != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__EPS3C:
			return eps3c != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA23:
			return gamma23 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA31:
			return gamma31 != null;
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE__GAMMA12:
			return gamma12 != null;
		}
		return super.eIsSet(featureID);
	}

} //AnisotropicSolidPropertiesTypeImpl
