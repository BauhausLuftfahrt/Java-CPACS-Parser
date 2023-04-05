/**
 */
package Cpacs.impl;

import Cpacs.BeamCrossSectionType;
import Cpacs.BeamStiffnessType;
import Cpacs.BooleanBaseType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.GlobalBeamPropertiesType;
import Cpacs.PointXYType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Beam Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getConsistency <em>Consistency</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getBeamCrossSection <em>Beam Cross Section</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getBeamCOG <em>Beam COG</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getBeamShearCenter <em>Beam Shear Center</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getBeamStiffness <em>Beam Stiffness</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getBeamSpecificMass <em>Beam Specific Mass</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalBeamPropertiesTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalBeamPropertiesTypeImpl extends ComplexBaseTypeImpl implements GlobalBeamPropertiesType {
	/**
	 * The cached value of the '{@link #getMaterialUID() <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType materialUID;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType source;

	/**
	 * The cached value of the '{@link #getConsistency() <em>Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistency()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType consistency;

	/**
	 * The cached value of the '{@link #getBeamCrossSection() <em>Beam Cross Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamCrossSection()
	 * @generated
	 * @ordered
	 */
	protected BeamCrossSectionType beamCrossSection;

	/**
	 * The cached value of the '{@link #getBeamCOG() <em>Beam COG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamCOG()
	 * @generated
	 * @ordered
	 */
	protected PointXYType beamCOG;

	/**
	 * The cached value of the '{@link #getBeamShearCenter() <em>Beam Shear Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamShearCenter()
	 * @generated
	 * @ordered
	 */
	protected PointXYType beamShearCenter;

	/**
	 * The cached value of the '{@link #getBeamStiffness() <em>Beam Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamStiffness()
	 * @generated
	 * @ordered
	 */
	protected BeamStiffnessType beamStiffness;

	/**
	 * The cached value of the '{@link #getBeamSpecificMass() <em>Beam Specific Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamSpecificMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType beamSpecificMass;

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
	protected GlobalBeamPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGlobalBeamPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMaterialUID() {
		return materialUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialUID(StringUIDBaseType newMaterialUID, NotificationChain msgs) {
		StringUIDBaseType oldMaterialUID = materialUID;
		materialUID = newMaterialUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID, oldMaterialUID, newMaterialUID);
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
	public void setMaterialUID(StringUIDBaseType newMaterialUID) {
		if (newMaterialUID != materialUID) {
			NotificationChain msgs = null;
			if (materialUID != null)
				msgs = ((InternalEObject) materialUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID, null, msgs);
			if (newMaterialUID != null)
				msgs = ((InternalEObject) newMaterialUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID, null, msgs);
			msgs = basicSetMaterialUID(newMaterialUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID, newMaterialUID, newMaterialUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(StringBaseType newSource, NotificationChain msgs) {
		StringBaseType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE, oldSource, newSource);
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
	public void setSource(StringBaseType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE,
					newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getConsistency() {
		return consistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsistency(BooleanBaseType newConsistency, NotificationChain msgs) {
		BooleanBaseType oldConsistency = consistency;
		consistency = newConsistency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY, oldConsistency, newConsistency);
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
	public void setConsistency(BooleanBaseType newConsistency) {
		if (newConsistency != consistency) {
			NotificationChain msgs = null;
			if (consistency != null)
				msgs = ((InternalEObject) consistency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY, null, msgs);
			if (newConsistency != null)
				msgs = ((InternalEObject) newConsistency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY, null, msgs);
			msgs = basicSetConsistency(newConsistency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY,
					newConsistency, newConsistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeamCrossSectionType getBeamCrossSection() {
		return beamCrossSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeamCrossSection(BeamCrossSectionType newBeamCrossSection,
			NotificationChain msgs) {
		BeamCrossSectionType oldBeamCrossSection = beamCrossSection;
		beamCrossSection = newBeamCrossSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION, oldBeamCrossSection,
					newBeamCrossSection);
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
	public void setBeamCrossSection(BeamCrossSectionType newBeamCrossSection) {
		if (newBeamCrossSection != beamCrossSection) {
			NotificationChain msgs = null;
			if (beamCrossSection != null)
				msgs = ((InternalEObject) beamCrossSection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION, null,
						msgs);
			if (newBeamCrossSection != null)
				msgs = ((InternalEObject) newBeamCrossSection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION, null,
						msgs);
			msgs = basicSetBeamCrossSection(newBeamCrossSection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION, newBeamCrossSection,
					newBeamCrossSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYType getBeamCOG() {
		return beamCOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeamCOG(PointXYType newBeamCOG, NotificationChain msgs) {
		PointXYType oldBeamCOG = beamCOG;
		beamCOG = newBeamCOG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG, oldBeamCOG, newBeamCOG);
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
	public void setBeamCOG(PointXYType newBeamCOG) {
		if (newBeamCOG != beamCOG) {
			NotificationChain msgs = null;
			if (beamCOG != null)
				msgs = ((InternalEObject) beamCOG).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG, null, msgs);
			if (newBeamCOG != null)
				msgs = ((InternalEObject) newBeamCOG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG, null, msgs);
			msgs = basicSetBeamCOG(newBeamCOG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG,
					newBeamCOG, newBeamCOG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYType getBeamShearCenter() {
		return beamShearCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeamShearCenter(PointXYType newBeamShearCenter, NotificationChain msgs) {
		PointXYType oldBeamShearCenter = beamShearCenter;
		beamShearCenter = newBeamShearCenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER, oldBeamShearCenter,
					newBeamShearCenter);
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
	public void setBeamShearCenter(PointXYType newBeamShearCenter) {
		if (newBeamShearCenter != beamShearCenter) {
			NotificationChain msgs = null;
			if (beamShearCenter != null)
				msgs = ((InternalEObject) beamShearCenter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER, null,
						msgs);
			if (newBeamShearCenter != null)
				msgs = ((InternalEObject) newBeamShearCenter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER, null,
						msgs);
			msgs = basicSetBeamShearCenter(newBeamShearCenter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER, newBeamShearCenter,
					newBeamShearCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeamStiffnessType getBeamStiffness() {
		return beamStiffness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeamStiffness(BeamStiffnessType newBeamStiffness, NotificationChain msgs) {
		BeamStiffnessType oldBeamStiffness = beamStiffness;
		beamStiffness = newBeamStiffness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS, oldBeamStiffness, newBeamStiffness);
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
	public void setBeamStiffness(BeamStiffnessType newBeamStiffness) {
		if (newBeamStiffness != beamStiffness) {
			NotificationChain msgs = null;
			if (beamStiffness != null)
				msgs = ((InternalEObject) beamStiffness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS, null, msgs);
			if (newBeamStiffness != null)
				msgs = ((InternalEObject) newBeamStiffness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS, null, msgs);
			msgs = basicSetBeamStiffness(newBeamStiffness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS, newBeamStiffness, newBeamStiffness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getBeamSpecificMass() {
		return beamSpecificMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeamSpecificMass(DoubleBaseType newBeamSpecificMass, NotificationChain msgs) {
		DoubleBaseType oldBeamSpecificMass = beamSpecificMass;
		beamSpecificMass = newBeamSpecificMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS, oldBeamSpecificMass,
					newBeamSpecificMass);
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
	public void setBeamSpecificMass(DoubleBaseType newBeamSpecificMass) {
		if (newBeamSpecificMass != beamSpecificMass) {
			NotificationChain msgs = null;
			if (beamSpecificMass != null)
				msgs = ((InternalEObject) beamSpecificMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS, null,
						msgs);
			if (newBeamSpecificMass != null)
				msgs = ((InternalEObject) newBeamSpecificMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS, null,
						msgs);
			msgs = basicSetBeamSpecificMass(newBeamSpecificMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS, newBeamSpecificMass,
					newBeamSpecificMass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID:
			return basicSetMaterialUID(null, msgs);
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE:
			return basicSetSource(null, msgs);
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY:
			return basicSetConsistency(null, msgs);
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION:
			return basicSetBeamCrossSection(null, msgs);
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG:
			return basicSetBeamCOG(null, msgs);
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER:
			return basicSetBeamShearCenter(null, msgs);
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS:
			return basicSetBeamStiffness(null, msgs);
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS:
			return basicSetBeamSpecificMass(null, msgs);
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
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID:
			return getMaterialUID();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE:
			return getSource();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY:
			return getConsistency();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION:
			return getBeamCrossSection();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG:
			return getBeamCOG();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER:
			return getBeamShearCenter();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS:
			return getBeamStiffness();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS:
			return getBeamSpecificMass();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__UID:
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
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE:
			setSource((StringBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY:
			setConsistency((BooleanBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION:
			setBeamCrossSection((BeamCrossSectionType) newValue);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG:
			setBeamCOG((PointXYType) newValue);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER:
			setBeamShearCenter((PointXYType) newValue);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS:
			setBeamStiffness((BeamStiffnessType) newValue);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS:
			setBeamSpecificMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__UID:
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
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE:
			setSource((StringBaseType) null);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY:
			setConsistency((BooleanBaseType) null);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION:
			setBeamCrossSection((BeamCrossSectionType) null);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG:
			setBeamCOG((PointXYType) null);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER:
			setBeamShearCenter((PointXYType) null);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS:
			setBeamStiffness((BeamStiffnessType) null);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS:
			setBeamSpecificMass((DoubleBaseType) null);
			return;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__UID:
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
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__MATERIAL_UID:
			return materialUID != null;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__SOURCE:
			return source != null;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__CONSISTENCY:
			return consistency != null;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_CROSS_SECTION:
			return beamCrossSection != null;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_COG:
			return beamCOG != null;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SHEAR_CENTER:
			return beamShearCenter != null;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_STIFFNESS:
			return beamStiffness != null;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__BEAM_SPECIFIC_MASS:
			return beamSpecificMass != null;
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE__UID:
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

} //GlobalBeamPropertiesTypeImpl
