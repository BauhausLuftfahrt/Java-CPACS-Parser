/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceMapRCType;
import Cpacs.AtmosphericModelOldType;
import Cpacs.CpacsPackage;
import Cpacs.DampingDerivativesRatesArrayType;
import Cpacs.IntegerBaseType;
import Cpacs.StringArrayBaseType;
import Cpacs.StringVectorBaseType;
import Cpacs.ToolType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Performance Map RC Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getAtmosphericModel <em>Atmospheric Model</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getAnalysisTool <em>Analysis Tool</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getAnalysisLevel <em>Analysis Level</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getCfx <em>Cfx</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getCfy <em>Cfy</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getCfz <em>Cfz</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getCmx <em>Cmx</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getCmy <em>Cmy</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getCmz <em>Cmz</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapRCTypeImpl#getDampingDerivatives <em>Damping Derivatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroPerformanceMapRCTypeImpl extends ComplexBaseTypeImpl implements AeroPerformanceMapRCType {
	/**
	 * The cached value of the '{@link #getAtmosphericModel() <em>Atmospheric Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtmosphericModel()
	 * @generated
	 * @ordered
	 */
	protected AtmosphericModelOldType atmosphericModel;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType machNumber;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType altitude;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType angleOfSideslip;

	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getAnalysisTool() <em>Analysis Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisTool()
	 * @generated
	 * @ordered
	 */
	protected ToolType analysisTool;

	/**
	 * The cached value of the '{@link #getAnalysisLevel() <em>Analysis Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisLevel()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType analysisLevel;

	/**
	 * The cached value of the '{@link #getCfx() <em>Cfx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfx()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType cfx;

	/**
	 * The cached value of the '{@link #getCfy() <em>Cfy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfy()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType cfy;

	/**
	 * The cached value of the '{@link #getCfz() <em>Cfz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfz()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType cfz;

	/**
	 * The cached value of the '{@link #getCmx() <em>Cmx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmx()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType cmx;

	/**
	 * The cached value of the '{@link #getCmy() <em>Cmy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmy()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType cmy;

	/**
	 * The cached value of the '{@link #getCmz() <em>Cmz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmz()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType cmz;

	/**
	 * The cached value of the '{@link #getDampingDerivatives() <em>Damping Derivatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDampingDerivatives()
	 * @generated
	 * @ordered
	 */
	protected DampingDerivativesRatesArrayType dampingDerivatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroPerformanceMapRCTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroPerformanceMapRCType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosphericModelOldType getAtmosphericModel() {
		return atmosphericModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtmosphericModel(AtmosphericModelOldType newAtmosphericModel,
			NotificationChain msgs) {
		AtmosphericModelOldType oldAtmosphericModel = atmosphericModel;
		atmosphericModel = newAtmosphericModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL, oldAtmosphericModel,
					newAtmosphericModel);
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
	public void setAtmosphericModel(AtmosphericModelOldType newAtmosphericModel) {
		if (newAtmosphericModel != atmosphericModel) {
			NotificationChain msgs = null;
			if (atmosphericModel != null)
				msgs = ((InternalEObject) atmosphericModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL, null,
						msgs);
			if (newAtmosphericModel != null)
				msgs = ((InternalEObject) newAtmosphericModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL, null,
						msgs);
			msgs = basicSetAtmosphericModel(newAtmosphericModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL, newAtmosphericModel,
					newAtmosphericModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(StringVectorBaseType newMachNumber, NotificationChain msgs) {
		StringVectorBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(StringVectorBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER, newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(StringVectorBaseType newAltitude, NotificationChain msgs) {
		StringVectorBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(StringVectorBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(StringVectorBaseType newAngleOfSideslip, NotificationChain msgs) {
		StringVectorBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip,
					newAngleOfSideslip);
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
	public void setAngleOfSideslip(StringVectorBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP, null,
						msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP, null,
						msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP, newAngleOfSideslip,
					newAngleOfSideslip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(StringVectorBaseType newAngleOfAttack, NotificationChain msgs) {
		StringVectorBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
	public void setAngleOfAttack(StringVectorBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK, null,
						msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK, null,
						msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK, newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolType getAnalysisTool() {
		return analysisTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisTool(ToolType newAnalysisTool, NotificationChain msgs) {
		ToolType oldAnalysisTool = analysisTool;
		analysisTool = newAnalysisTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL, oldAnalysisTool, newAnalysisTool);
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
	public void setAnalysisTool(ToolType newAnalysisTool) {
		if (newAnalysisTool != analysisTool) {
			NotificationChain msgs = null;
			if (analysisTool != null)
				msgs = ((InternalEObject) analysisTool).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL, null, msgs);
			if (newAnalysisTool != null)
				msgs = ((InternalEObject) newAnalysisTool).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL, null, msgs);
			msgs = basicSetAnalysisTool(newAnalysisTool, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL, newAnalysisTool, newAnalysisTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getAnalysisLevel() {
		return analysisLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisLevel(IntegerBaseType newAnalysisLevel, NotificationChain msgs) {
		IntegerBaseType oldAnalysisLevel = analysisLevel;
		analysisLevel = newAnalysisLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL, oldAnalysisLevel, newAnalysisLevel);
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
	public void setAnalysisLevel(IntegerBaseType newAnalysisLevel) {
		if (newAnalysisLevel != analysisLevel) {
			NotificationChain msgs = null;
			if (analysisLevel != null)
				msgs = ((InternalEObject) analysisLevel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL, null, msgs);
			if (newAnalysisLevel != null)
				msgs = ((InternalEObject) newAnalysisLevel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL, null, msgs);
			msgs = basicSetAnalysisLevel(newAnalysisLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL, newAnalysisLevel, newAnalysisLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getCfx() {
		return cfx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfx(StringArrayBaseType newCfx, NotificationChain msgs) {
		StringArrayBaseType oldCfx = cfx;
		cfx = newCfx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX, oldCfx, newCfx);
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
	public void setCfx(StringArrayBaseType newCfx) {
		if (newCfx != cfx) {
			NotificationChain msgs = null;
			if (cfx != null)
				msgs = ((InternalEObject) cfx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX, null, msgs);
			if (newCfx != null)
				msgs = ((InternalEObject) newCfx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX, null, msgs);
			msgs = basicSetCfx(newCfx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX,
					newCfx, newCfx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getCfy() {
		return cfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfy(StringArrayBaseType newCfy, NotificationChain msgs) {
		StringArrayBaseType oldCfy = cfy;
		cfy = newCfy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY, oldCfy, newCfy);
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
	public void setCfy(StringArrayBaseType newCfy) {
		if (newCfy != cfy) {
			NotificationChain msgs = null;
			if (cfy != null)
				msgs = ((InternalEObject) cfy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY, null, msgs);
			if (newCfy != null)
				msgs = ((InternalEObject) newCfy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY, null, msgs);
			msgs = basicSetCfy(newCfy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY,
					newCfy, newCfy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getCfz() {
		return cfz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfz(StringArrayBaseType newCfz, NotificationChain msgs) {
		StringArrayBaseType oldCfz = cfz;
		cfz = newCfz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ, oldCfz, newCfz);
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
	public void setCfz(StringArrayBaseType newCfz) {
		if (newCfz != cfz) {
			NotificationChain msgs = null;
			if (cfz != null)
				msgs = ((InternalEObject) cfz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ, null, msgs);
			if (newCfz != null)
				msgs = ((InternalEObject) newCfz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ, null, msgs);
			msgs = basicSetCfz(newCfz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ,
					newCfz, newCfz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getCmx() {
		return cmx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmx(StringArrayBaseType newCmx, NotificationChain msgs) {
		StringArrayBaseType oldCmx = cmx;
		cmx = newCmx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX, oldCmx, newCmx);
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
	public void setCmx(StringArrayBaseType newCmx) {
		if (newCmx != cmx) {
			NotificationChain msgs = null;
			if (cmx != null)
				msgs = ((InternalEObject) cmx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX, null, msgs);
			if (newCmx != null)
				msgs = ((InternalEObject) newCmx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX, null, msgs);
			msgs = basicSetCmx(newCmx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX,
					newCmx, newCmx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getCmy() {
		return cmy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmy(StringArrayBaseType newCmy, NotificationChain msgs) {
		StringArrayBaseType oldCmy = cmy;
		cmy = newCmy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY, oldCmy, newCmy);
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
	public void setCmy(StringArrayBaseType newCmy) {
		if (newCmy != cmy) {
			NotificationChain msgs = null;
			if (cmy != null)
				msgs = ((InternalEObject) cmy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY, null, msgs);
			if (newCmy != null)
				msgs = ((InternalEObject) newCmy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY, null, msgs);
			msgs = basicSetCmy(newCmy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY,
					newCmy, newCmy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getCmz() {
		return cmz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmz(StringArrayBaseType newCmz, NotificationChain msgs) {
		StringArrayBaseType oldCmz = cmz;
		cmz = newCmz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ, oldCmz, newCmz);
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
	public void setCmz(StringArrayBaseType newCmz) {
		if (newCmz != cmz) {
			NotificationChain msgs = null;
			if (cmz != null)
				msgs = ((InternalEObject) cmz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ, null, msgs);
			if (newCmz != null)
				msgs = ((InternalEObject) newCmz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ, null, msgs);
			msgs = basicSetCmz(newCmz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ,
					newCmz, newCmz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DampingDerivativesRatesArrayType getDampingDerivatives() {
		return dampingDerivatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDampingDerivatives(DampingDerivativesRatesArrayType newDampingDerivatives,
			NotificationChain msgs) {
		DampingDerivativesRatesArrayType oldDampingDerivatives = dampingDerivatives;
		dampingDerivatives = newDampingDerivatives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES, oldDampingDerivatives,
					newDampingDerivatives);
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
	public void setDampingDerivatives(DampingDerivativesRatesArrayType newDampingDerivatives) {
		if (newDampingDerivatives != dampingDerivatives) {
			NotificationChain msgs = null;
			if (dampingDerivatives != null)
				msgs = ((InternalEObject) dampingDerivatives).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES, null,
						msgs);
			if (newDampingDerivatives != null)
				msgs = ((InternalEObject) newDampingDerivatives).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES, null,
						msgs);
			msgs = basicSetDampingDerivatives(newDampingDerivatives, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES, newDampingDerivatives,
					newDampingDerivatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL:
			return basicSetAtmosphericModel(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL:
			return basicSetAnalysisTool(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL:
			return basicSetAnalysisLevel(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX:
			return basicSetCfx(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY:
			return basicSetCfy(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ:
			return basicSetCfz(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX:
			return basicSetCmx(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY:
			return basicSetCmy(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ:
			return basicSetCmz(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES:
			return basicSetDampingDerivatives(null, msgs);
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
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL:
			return getAtmosphericModel();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL:
			return getAnalysisTool();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL:
			return getAnalysisLevel();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX:
			return getCfx();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY:
			return getCfy();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ:
			return getCfz();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX:
			return getCmx();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY:
			return getCmy();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ:
			return getCmz();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES:
			return getDampingDerivatives();
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
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL:
			setAtmosphericModel((AtmosphericModelOldType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER:
			setMachNumber((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE:
			setAltitude((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL:
			setAnalysisTool((ToolType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL:
			setAnalysisLevel((IntegerBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX:
			setCfx((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY:
			setCfy((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ:
			setCfz((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX:
			setCmx((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY:
			setCmy((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ:
			setCmz((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES:
			setDampingDerivatives((DampingDerivativesRatesArrayType) newValue);
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
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL:
			setAtmosphericModel((AtmosphericModelOldType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER:
			setMachNumber((StringVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE:
			setAltitude((StringVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((StringVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((StringVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL:
			setAnalysisTool((ToolType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL:
			setAnalysisLevel((IntegerBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX:
			setCfx((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY:
			setCfy((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ:
			setCfz((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX:
			setCmx((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY:
			setCmy((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ:
			setCmz((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES:
			setDampingDerivatives((DampingDerivativesRatesArrayType) null);
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
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ATMOSPHERIC_MODEL:
			return atmosphericModel != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_TOOL:
			return analysisTool != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__ANALYSIS_LEVEL:
			return analysisLevel != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFX:
			return cfx != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFY:
			return cfy != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CFZ:
			return cfz != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMX:
			return cmx != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMY:
			return cmy != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__CMZ:
			return cmz != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE__DAMPING_DERIVATIVES:
			return dampingDerivatives != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroPerformanceMapRCTypeImpl
