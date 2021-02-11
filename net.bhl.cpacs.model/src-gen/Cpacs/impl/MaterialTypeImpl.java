/**
 */
package Cpacs.impl;

import Cpacs.AnisotropicShellPropertiesType;
import Cpacs.AnisotropicSolidPropertiesType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EmissivityMapType;
import Cpacs.IsotropicPropertiesType;
import Cpacs.MaterialType;
import Cpacs.OrthotropicShellPropertiesType;
import Cpacs.OrthotropicSolidPropertiesType;
import Cpacs.SpecificHeatMapType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getRho <em>Rho</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getIsotropicProperties <em>Isotropic Properties</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getOrthotropicShellProperties <em>Orthotropic Shell Properties</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getAnisotropicShellProperties <em>Anisotropic Shell Properties</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getOrthotropicSolidProperties <em>Orthotropic Solid Properties</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getAnisotropicSolidProperties <em>Anisotropic Solid Properties</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getReferenceTemperature <em>Reference Temperature</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getSpecificHeatMap <em>Specific Heat Map</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getEmissivityMap <em>Emissivity Map</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialTypeImpl extends ComplexBaseTypeImpl implements MaterialType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getRho() <em>Rho</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRho()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rho;

	/**
	 * The cached value of the '{@link #getIsotropicProperties() <em>Isotropic Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsotropicProperties()
	 * @generated
	 * @ordered
	 */
	protected IsotropicPropertiesType isotropicProperties;

	/**
	 * The cached value of the '{@link #getOrthotropicShellProperties() <em>Orthotropic Shell Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrthotropicShellProperties()
	 * @generated
	 * @ordered
	 */
	protected OrthotropicShellPropertiesType orthotropicShellProperties;

	/**
	 * The cached value of the '{@link #getAnisotropicShellProperties() <em>Anisotropic Shell Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnisotropicShellProperties()
	 * @generated
	 * @ordered
	 */
	protected AnisotropicShellPropertiesType anisotropicShellProperties;

	/**
	 * The cached value of the '{@link #getOrthotropicSolidProperties() <em>Orthotropic Solid Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrthotropicSolidProperties()
	 * @generated
	 * @ordered
	 */
	protected OrthotropicSolidPropertiesType orthotropicSolidProperties;

	/**
	 * The cached value of the '{@link #getAnisotropicSolidProperties() <em>Anisotropic Solid Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnisotropicSolidProperties()
	 * @generated
	 * @ordered
	 */
	protected AnisotropicSolidPropertiesType anisotropicSolidProperties;

	/**
	 * The cached value of the '{@link #getReferenceTemperature() <em>Reference Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTemperature()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType referenceTemperature;

	/**
	 * The cached value of the '{@link #getSpecificHeatMap() <em>Specific Heat Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatMap()
	 * @generated
	 * @ordered
	 */
	protected SpecificHeatMapType specificHeatMap;

	/**
	 * The cached value of the '{@link #getEmissivityMap() <em>Emissivity Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissivityMap()
	 * @generated
	 * @ordered
	 */
	protected EmissivityMapType emissivityMap;

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
	protected MaterialTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMaterialType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRho() {
		return rho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRho(DoubleBaseType newRho, NotificationChain msgs) {
		DoubleBaseType oldRho = rho;
		rho = newRho;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__RHO, oldRho, newRho);
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
	public void setRho(DoubleBaseType newRho) {
		if (newRho != rho) {
			NotificationChain msgs = null;
			if (rho != null)
				msgs = ((InternalEObject) rho).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__RHO, null, msgs);
			if (newRho != null)
				msgs = ((InternalEObject) newRho).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__RHO, null, msgs);
			msgs = basicSetRho(newRho, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_TYPE__RHO, newRho, newRho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsotropicPropertiesType getIsotropicProperties() {
		return isotropicProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsotropicProperties(IsotropicPropertiesType newIsotropicProperties,
			NotificationChain msgs) {
		IsotropicPropertiesType oldIsotropicProperties = isotropicProperties;
		isotropicProperties = newIsotropicProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES, oldIsotropicProperties, newIsotropicProperties);
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
	public void setIsotropicProperties(IsotropicPropertiesType newIsotropicProperties) {
		if (newIsotropicProperties != isotropicProperties) {
			NotificationChain msgs = null;
			if (isotropicProperties != null)
				msgs = ((InternalEObject) isotropicProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES, null, msgs);
			if (newIsotropicProperties != null)
				msgs = ((InternalEObject) newIsotropicProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES, null, msgs);
			msgs = basicSetIsotropicProperties(newIsotropicProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES,
					newIsotropicProperties, newIsotropicProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrthotropicShellPropertiesType getOrthotropicShellProperties() {
		return orthotropicShellProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrthotropicShellProperties(
			OrthotropicShellPropertiesType newOrthotropicShellProperties, NotificationChain msgs) {
		OrthotropicShellPropertiesType oldOrthotropicShellProperties = orthotropicShellProperties;
		orthotropicShellProperties = newOrthotropicShellProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES, oldOrthotropicShellProperties,
					newOrthotropicShellProperties);
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
	public void setOrthotropicShellProperties(OrthotropicShellPropertiesType newOrthotropicShellProperties) {
		if (newOrthotropicShellProperties != orthotropicShellProperties) {
			NotificationChain msgs = null;
			if (orthotropicShellProperties != null)
				msgs = ((InternalEObject) orthotropicShellProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES, null, msgs);
			if (newOrthotropicShellProperties != null)
				msgs = ((InternalEObject) newOrthotropicShellProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES, null, msgs);
			msgs = basicSetOrthotropicShellProperties(newOrthotropicShellProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES, newOrthotropicShellProperties,
					newOrthotropicShellProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnisotropicShellPropertiesType getAnisotropicShellProperties() {
		return anisotropicShellProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnisotropicShellProperties(
			AnisotropicShellPropertiesType newAnisotropicShellProperties, NotificationChain msgs) {
		AnisotropicShellPropertiesType oldAnisotropicShellProperties = anisotropicShellProperties;
		anisotropicShellProperties = newAnisotropicShellProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES, oldAnisotropicShellProperties,
					newAnisotropicShellProperties);
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
	public void setAnisotropicShellProperties(AnisotropicShellPropertiesType newAnisotropicShellProperties) {
		if (newAnisotropicShellProperties != anisotropicShellProperties) {
			NotificationChain msgs = null;
			if (anisotropicShellProperties != null)
				msgs = ((InternalEObject) anisotropicShellProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES, null, msgs);
			if (newAnisotropicShellProperties != null)
				msgs = ((InternalEObject) newAnisotropicShellProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES, null, msgs);
			msgs = basicSetAnisotropicShellProperties(newAnisotropicShellProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES, newAnisotropicShellProperties,
					newAnisotropicShellProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrthotropicSolidPropertiesType getOrthotropicSolidProperties() {
		return orthotropicSolidProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrthotropicSolidProperties(
			OrthotropicSolidPropertiesType newOrthotropicSolidProperties, NotificationChain msgs) {
		OrthotropicSolidPropertiesType oldOrthotropicSolidProperties = orthotropicSolidProperties;
		orthotropicSolidProperties = newOrthotropicSolidProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES, oldOrthotropicSolidProperties,
					newOrthotropicSolidProperties);
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
	public void setOrthotropicSolidProperties(OrthotropicSolidPropertiesType newOrthotropicSolidProperties) {
		if (newOrthotropicSolidProperties != orthotropicSolidProperties) {
			NotificationChain msgs = null;
			if (orthotropicSolidProperties != null)
				msgs = ((InternalEObject) orthotropicSolidProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES, null, msgs);
			if (newOrthotropicSolidProperties != null)
				msgs = ((InternalEObject) newOrthotropicSolidProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES, null, msgs);
			msgs = basicSetOrthotropicSolidProperties(newOrthotropicSolidProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES, newOrthotropicSolidProperties,
					newOrthotropicSolidProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnisotropicSolidPropertiesType getAnisotropicSolidProperties() {
		return anisotropicSolidProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnisotropicSolidProperties(
			AnisotropicSolidPropertiesType newAnisotropicSolidProperties, NotificationChain msgs) {
		AnisotropicSolidPropertiesType oldAnisotropicSolidProperties = anisotropicSolidProperties;
		anisotropicSolidProperties = newAnisotropicSolidProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES, oldAnisotropicSolidProperties,
					newAnisotropicSolidProperties);
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
	public void setAnisotropicSolidProperties(AnisotropicSolidPropertiesType newAnisotropicSolidProperties) {
		if (newAnisotropicSolidProperties != anisotropicSolidProperties) {
			NotificationChain msgs = null;
			if (anisotropicSolidProperties != null)
				msgs = ((InternalEObject) anisotropicSolidProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES, null, msgs);
			if (newAnisotropicSolidProperties != null)
				msgs = ((InternalEObject) newAnisotropicSolidProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES, null, msgs);
			msgs = basicSetAnisotropicSolidProperties(newAnisotropicSolidProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES, newAnisotropicSolidProperties,
					newAnisotropicSolidProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReferenceTemperature() {
		return referenceTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceTemperature(DoubleBaseType newReferenceTemperature,
			NotificationChain msgs) {
		DoubleBaseType oldReferenceTemperature = referenceTemperature;
		referenceTemperature = newReferenceTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE, oldReferenceTemperature,
					newReferenceTemperature);
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
	public void setReferenceTemperature(DoubleBaseType newReferenceTemperature) {
		if (newReferenceTemperature != referenceTemperature) {
			NotificationChain msgs = null;
			if (referenceTemperature != null)
				msgs = ((InternalEObject) referenceTemperature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE, null, msgs);
			if (newReferenceTemperature != null)
				msgs = ((InternalEObject) newReferenceTemperature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE, null, msgs);
			msgs = basicSetReferenceTemperature(newReferenceTemperature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE,
					newReferenceTemperature, newReferenceTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificHeatMapType getSpecificHeatMap() {
		return specificHeatMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificHeatMap(SpecificHeatMapType newSpecificHeatMap, NotificationChain msgs) {
		SpecificHeatMapType oldSpecificHeatMap = specificHeatMap;
		specificHeatMap = newSpecificHeatMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP, oldSpecificHeatMap, newSpecificHeatMap);
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
	public void setSpecificHeatMap(SpecificHeatMapType newSpecificHeatMap) {
		if (newSpecificHeatMap != specificHeatMap) {
			NotificationChain msgs = null;
			if (specificHeatMap != null)
				msgs = ((InternalEObject) specificHeatMap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP, null, msgs);
			if (newSpecificHeatMap != null)
				msgs = ((InternalEObject) newSpecificHeatMap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP, null, msgs);
			msgs = basicSetSpecificHeatMap(newSpecificHeatMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP,
					newSpecificHeatMap, newSpecificHeatMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmissivityMapType getEmissivityMap() {
		return emissivityMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmissivityMap(EmissivityMapType newEmissivityMap, NotificationChain msgs) {
		EmissivityMapType oldEmissivityMap = emissivityMap;
		emissivityMap = newEmissivityMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP, oldEmissivityMap, newEmissivityMap);
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
	public void setEmissivityMap(EmissivityMapType newEmissivityMap) {
		if (newEmissivityMap != emissivityMap) {
			NotificationChain msgs = null;
			if (emissivityMap != null)
				msgs = ((InternalEObject) emissivityMap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP, null, msgs);
			if (newEmissivityMap != null)
				msgs = ((InternalEObject) newEmissivityMap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP, null, msgs);
			msgs = basicSetEmissivityMap(newEmissivityMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP,
					newEmissivityMap, newEmissivityMap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MATERIAL_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__RHO:
			return basicSetRho(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES:
			return basicSetIsotropicProperties(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES:
			return basicSetOrthotropicShellProperties(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES:
			return basicSetAnisotropicShellProperties(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES:
			return basicSetOrthotropicSolidProperties(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES:
			return basicSetAnisotropicSolidProperties(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE:
			return basicSetReferenceTemperature(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP:
			return basicSetSpecificHeatMap(null, msgs);
		case CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP:
			return basicSetEmissivityMap(null, msgs);
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
		case CpacsPackage.MATERIAL_TYPE__NAME:
			return getName();
		case CpacsPackage.MATERIAL_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.MATERIAL_TYPE__RHO:
			return getRho();
		case CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES:
			return getIsotropicProperties();
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES:
			return getOrthotropicShellProperties();
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES:
			return getAnisotropicShellProperties();
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES:
			return getOrthotropicSolidProperties();
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES:
			return getAnisotropicSolidProperties();
		case CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE:
			return getReferenceTemperature();
		case CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP:
			return getSpecificHeatMap();
		case CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP:
			return getEmissivityMap();
		case CpacsPackage.MATERIAL_TYPE__UID:
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
		case CpacsPackage.MATERIAL_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__RHO:
			setRho((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES:
			setIsotropicProperties((IsotropicPropertiesType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES:
			setOrthotropicShellProperties((OrthotropicShellPropertiesType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES:
			setAnisotropicShellProperties((AnisotropicShellPropertiesType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES:
			setOrthotropicSolidProperties((OrthotropicSolidPropertiesType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES:
			setAnisotropicSolidProperties((AnisotropicSolidPropertiesType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE:
			setReferenceTemperature((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP:
			setSpecificHeatMap((SpecificHeatMapType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP:
			setEmissivityMap((EmissivityMapType) newValue);
			return;
		case CpacsPackage.MATERIAL_TYPE__UID:
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
		case CpacsPackage.MATERIAL_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__RHO:
			setRho((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES:
			setIsotropicProperties((IsotropicPropertiesType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES:
			setOrthotropicShellProperties((OrthotropicShellPropertiesType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES:
			setAnisotropicShellProperties((AnisotropicShellPropertiesType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES:
			setOrthotropicSolidProperties((OrthotropicSolidPropertiesType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES:
			setAnisotropicSolidProperties((AnisotropicSolidPropertiesType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE:
			setReferenceTemperature((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP:
			setSpecificHeatMap((SpecificHeatMapType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP:
			setEmissivityMap((EmissivityMapType) null);
			return;
		case CpacsPackage.MATERIAL_TYPE__UID:
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
		case CpacsPackage.MATERIAL_TYPE__NAME:
			return name != null;
		case CpacsPackage.MATERIAL_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.MATERIAL_TYPE__RHO:
			return rho != null;
		case CpacsPackage.MATERIAL_TYPE__ISOTROPIC_PROPERTIES:
			return isotropicProperties != null;
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SHELL_PROPERTIES:
			return orthotropicShellProperties != null;
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SHELL_PROPERTIES:
			return anisotropicShellProperties != null;
		case CpacsPackage.MATERIAL_TYPE__ORTHOTROPIC_SOLID_PROPERTIES:
			return orthotropicSolidProperties != null;
		case CpacsPackage.MATERIAL_TYPE__ANISOTROPIC_SOLID_PROPERTIES:
			return anisotropicSolidProperties != null;
		case CpacsPackage.MATERIAL_TYPE__REFERENCE_TEMPERATURE:
			return referenceTemperature != null;
		case CpacsPackage.MATERIAL_TYPE__SPECIFIC_HEAT_MAP:
			return specificHeatMap != null;
		case CpacsPackage.MATERIAL_TYPE__EMISSIVITY_MAP:
			return emissivityMap != null;
		case CpacsPackage.MATERIAL_TYPE__UID:
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

} //MaterialTypeImpl
