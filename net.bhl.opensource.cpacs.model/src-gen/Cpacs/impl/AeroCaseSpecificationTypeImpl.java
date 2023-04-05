/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseSpecificationType;
import Cpacs.ConfigurationType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EnvironmentType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Case Specification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getTargetCl <em>Target Cl</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getPStar <em>PStar</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getQStar <em>QStar</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getRStar <em>RStar</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseSpecificationTypeImpl#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroCaseSpecificationTypeImpl extends MinimalEObjectImpl.Container implements AeroCaseSpecificationType {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentType environment;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType altitude;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType machNumber;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleOfSideslip;

	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getTargetCl() <em>Target Cl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCl()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType targetCl;

	/**
	 * The cached value of the '{@link #getPStar() <em>PStar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType pStar;

	/**
	 * The cached value of the '{@link #getQStar() <em>QStar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType qStar;

	/**
	 * The cached value of the '{@link #getRStar() <em>RStar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rStar;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationType configuration;

	/**
	 * The cached value of the '{@link #getWeightAndBalanceUID() <em>Weight And Balance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightAndBalanceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType weightAndBalanceUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroCaseSpecificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroCaseSpecificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentType getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(EnvironmentType newEnvironment, NotificationChain msgs) {
		EnvironmentType oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT, oldEnvironment, newEnvironment);
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
	public void setEnvironment(EnvironmentType newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject) environment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleBaseType newAltitude, NotificationChain msgs) {
		DoubleBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(DoubleBaseType newMachNumber, NotificationChain msgs) {
		DoubleBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(DoubleBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER, newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(DoubleBaseType newAngleOfSideslip, NotificationChain msgs) {
		DoubleBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip,
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
	public void setAngleOfSideslip(DoubleBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP, null,
						msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP, null,
						msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP, newAngleOfSideslip,
					newAngleOfSideslip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(DoubleBaseType newAngleOfAttack, NotificationChain msgs) {
		DoubleBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
	public void setAngleOfAttack(DoubleBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK, null,
						msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK, null,
						msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK, newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTargetCl() {
		return targetCl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetCl(DoubleBaseType newTargetCl, NotificationChain msgs) {
		DoubleBaseType oldTargetCl = targetCl;
		targetCl = newTargetCl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL, oldTargetCl, newTargetCl);
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
	public void setTargetCl(DoubleBaseType newTargetCl) {
		if (newTargetCl != targetCl) {
			NotificationChain msgs = null;
			if (targetCl != null)
				msgs = ((InternalEObject) targetCl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL, null, msgs);
			if (newTargetCl != null)
				msgs = ((InternalEObject) newTargetCl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL, null, msgs);
			msgs = basicSetTargetCl(newTargetCl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL,
					newTargetCl, newTargetCl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPStar() {
		return pStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPStar(DoubleBaseType newPStar, NotificationChain msgs) {
		DoubleBaseType oldPStar = pStar;
		pStar = newPStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR, oldPStar, newPStar);
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
	public void setPStar(DoubleBaseType newPStar) {
		if (newPStar != pStar) {
			NotificationChain msgs = null;
			if (pStar != null)
				msgs = ((InternalEObject) pStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR, null, msgs);
			if (newPStar != null)
				msgs = ((InternalEObject) newPStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR, null, msgs);
			msgs = basicSetPStar(newPStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR,
					newPStar, newPStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQStar() {
		return qStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQStar(DoubleBaseType newQStar, NotificationChain msgs) {
		DoubleBaseType oldQStar = qStar;
		qStar = newQStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR, oldQStar, newQStar);
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
	public void setQStar(DoubleBaseType newQStar) {
		if (newQStar != qStar) {
			NotificationChain msgs = null;
			if (qStar != null)
				msgs = ((InternalEObject) qStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR, null, msgs);
			if (newQStar != null)
				msgs = ((InternalEObject) newQStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR, null, msgs);
			msgs = basicSetQStar(newQStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR,
					newQStar, newQStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRStar() {
		return rStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRStar(DoubleBaseType newRStar, NotificationChain msgs) {
		DoubleBaseType oldRStar = rStar;
		rStar = newRStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR, oldRStar, newRStar);
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
	public void setRStar(DoubleBaseType newRStar) {
		if (newRStar != rStar) {
			NotificationChain msgs = null;
			if (rStar != null)
				msgs = ((InternalEObject) rStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR, null, msgs);
			if (newRStar != null)
				msgs = ((InternalEObject) newRStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR, null, msgs);
			msgs = basicSetRStar(newRStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR,
					newRStar, newRStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationType getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(ConfigurationType newConfiguration, NotificationChain msgs) {
		ConfigurationType oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION, oldConfiguration, newConfiguration);
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
	public void setConfiguration(ConfigurationType newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getWeightAndBalanceUID() {
		return weightAndBalanceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeightAndBalanceUID(StringUIDBaseType newWeightAndBalanceUID,
			NotificationChain msgs) {
		StringUIDBaseType oldWeightAndBalanceUID = weightAndBalanceUID;
		weightAndBalanceUID = newWeightAndBalanceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID, oldWeightAndBalanceUID,
					newWeightAndBalanceUID);
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
	public void setWeightAndBalanceUID(StringUIDBaseType newWeightAndBalanceUID) {
		if (newWeightAndBalanceUID != weightAndBalanceUID) {
			NotificationChain msgs = null;
			if (weightAndBalanceUID != null)
				msgs = ((InternalEObject) weightAndBalanceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID,
						null, msgs);
			if (newWeightAndBalanceUID != null)
				msgs = ((InternalEObject) newWeightAndBalanceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID,
						null, msgs);
			msgs = basicSetWeightAndBalanceUID(newWeightAndBalanceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID, newWeightAndBalanceUID,
					newWeightAndBalanceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL:
			return basicSetTargetCl(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR:
			return basicSetPStar(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR:
			return basicSetQStar(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR:
			return basicSetRStar(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			return basicSetWeightAndBalanceUID(null, msgs);
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
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			return getEnvironment();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL:
			return getTargetCl();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR:
			return getPStar();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR:
			return getQStar();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR:
			return getRStar();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			return getConfiguration();
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			return getWeightAndBalanceUID();
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
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL:
			setTargetCl((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR:
			setPStar((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR:
			setQStar((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR:
			setRStar((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			setConfiguration((ConfigurationType) newValue);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			setWeightAndBalanceUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL:
			setTargetCl((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR:
			setPStar((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR:
			setQStar((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR:
			setRStar((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			setConfiguration((ConfigurationType) null);
			return;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			setWeightAndBalanceUID((StringUIDBaseType) null);
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
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ENVIRONMENT:
			return environment != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__TARGET_CL:
			return targetCl != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__PSTAR:
			return pStar != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__QSTAR:
			return qStar != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__RSTAR:
			return rStar != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__CONFIGURATION:
			return configuration != null;
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE__WEIGHT_AND_BALANCE_UID:
			return weightAndBalanceUID != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroCaseSpecificationTypeImpl
