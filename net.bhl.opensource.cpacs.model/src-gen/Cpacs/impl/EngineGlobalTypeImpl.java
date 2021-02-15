/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EngineConceptType;
import Cpacs.EngineGlobalType;
import Cpacs.IntegerBaseType;
import Cpacs.RotDirectionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineGlobalTypeImpl#getEngineConcept <em>Engine Concept</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGlobalTypeImpl#getCertificationYear <em>Certification Year</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGlobalTypeImpl#getRotDirection <em>Rot Direction</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGlobalTypeImpl#getH2tR <em>H2t R</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGlobalTypeImpl#getNoBla <em>No Bla</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGlobalTypeImpl#getNoOGV <em>No OGV</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGlobalTypeImpl#getRSS <em>RSS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineGlobalTypeImpl extends ComplexBaseTypeImpl implements EngineGlobalType {
	/**
	 * The cached value of the '{@link #getEngineConcept() <em>Engine Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineConcept()
	 * @generated
	 * @ordered
	 */
	protected EngineConceptType engineConcept;

	/**
	 * The cached value of the '{@link #getCertificationYear() <em>Certification Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificationYear()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType certificationYear;

	/**
	 * The cached value of the '{@link #getRotDirection() <em>Rot Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotDirection()
	 * @generated
	 * @ordered
	 */
	protected RotDirectionType rotDirection;

	/**
	 * The cached value of the '{@link #getH2tR() <em>H2t R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH2tR()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType h2tR;

	/**
	 * The cached value of the '{@link #getNoBla() <em>No Bla</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoBla()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType noBla;

	/**
	 * The cached value of the '{@link #getNoOGV() <em>No OGV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOGV()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType noOGV;

	/**
	 * The cached value of the '{@link #getRSS() <em>RSS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSS()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rSS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineConceptType getEngineConcept() {
		return engineConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineConcept(EngineConceptType newEngineConcept, NotificationChain msgs) {
		EngineConceptType oldEngineConcept = engineConcept;
		engineConcept = newEngineConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT, oldEngineConcept, newEngineConcept);
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
	public void setEngineConcept(EngineConceptType newEngineConcept) {
		if (newEngineConcept != engineConcept) {
			NotificationChain msgs = null;
			if (engineConcept != null)
				msgs = ((InternalEObject) engineConcept).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT, null, msgs);
			if (newEngineConcept != null)
				msgs = ((InternalEObject) newEngineConcept).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT, null, msgs);
			msgs = basicSetEngineConcept(newEngineConcept, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT,
					newEngineConcept, newEngineConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getCertificationYear() {
		return certificationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificationYear(IntegerBaseType newCertificationYear, NotificationChain msgs) {
		IntegerBaseType oldCertificationYear = certificationYear;
		certificationYear = newCertificationYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR, oldCertificationYear, newCertificationYear);
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
	public void setCertificationYear(IntegerBaseType newCertificationYear) {
		if (newCertificationYear != certificationYear) {
			NotificationChain msgs = null;
			if (certificationYear != null)
				msgs = ((InternalEObject) certificationYear).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR, null, msgs);
			if (newCertificationYear != null)
				msgs = ((InternalEObject) newCertificationYear).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR, null, msgs);
			msgs = basicSetCertificationYear(newCertificationYear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR,
					newCertificationYear, newCertificationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotDirectionType getRotDirection() {
		return rotDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotDirection(RotDirectionType newRotDirection, NotificationChain msgs) {
		RotDirectionType oldRotDirection = rotDirection;
		rotDirection = newRotDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION, oldRotDirection, newRotDirection);
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
	public void setRotDirection(RotDirectionType newRotDirection) {
		if (newRotDirection != rotDirection) {
			NotificationChain msgs = null;
			if (rotDirection != null)
				msgs = ((InternalEObject) rotDirection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION, null, msgs);
			if (newRotDirection != null)
				msgs = ((InternalEObject) newRotDirection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION, null, msgs);
			msgs = basicSetRotDirection(newRotDirection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION,
					newRotDirection, newRotDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getH2tR() {
		return h2tR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH2tR(DoubleBaseType newH2tR, NotificationChain msgs) {
		DoubleBaseType oldH2tR = h2tR;
		h2tR = newH2tR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R, oldH2tR, newH2tR);
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
	public void setH2tR(DoubleBaseType newH2tR) {
		if (newH2tR != h2tR) {
			NotificationChain msgs = null;
			if (h2tR != null)
				msgs = ((InternalEObject) h2tR).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R, null, msgs);
			if (newH2tR != null)
				msgs = ((InternalEObject) newH2tR).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R, null, msgs);
			msgs = basicSetH2tR(newH2tR, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R, newH2tR,
					newH2tR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNoBla() {
		return noBla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoBla(DoubleBaseType newNoBla, NotificationChain msgs) {
		DoubleBaseType oldNoBla = noBla;
		noBla = newNoBla;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA, oldNoBla, newNoBla);
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
	public void setNoBla(DoubleBaseType newNoBla) {
		if (newNoBla != noBla) {
			NotificationChain msgs = null;
			if (noBla != null)
				msgs = ((InternalEObject) noBla).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA, null, msgs);
			if (newNoBla != null)
				msgs = ((InternalEObject) newNoBla).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA, null, msgs);
			msgs = basicSetNoBla(newNoBla, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA, newNoBla,
					newNoBla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNoOGV() {
		return noOGV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoOGV(DoubleBaseType newNoOGV, NotificationChain msgs) {
		DoubleBaseType oldNoOGV = noOGV;
		noOGV = newNoOGV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV, oldNoOGV, newNoOGV);
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
	public void setNoOGV(DoubleBaseType newNoOGV) {
		if (newNoOGV != noOGV) {
			NotificationChain msgs = null;
			if (noOGV != null)
				msgs = ((InternalEObject) noOGV).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV, null, msgs);
			if (newNoOGV != null)
				msgs = ((InternalEObject) newNoOGV).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV, null, msgs);
			msgs = basicSetNoOGV(newNoOGV, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV, newNoOGV,
					newNoOGV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRSS() {
		return rSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSS(DoubleBaseType newRSS, NotificationChain msgs) {
		DoubleBaseType oldRSS = rSS;
		rSS = newRSS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GLOBAL_TYPE__RSS, oldRSS, newRSS);
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
	public void setRSS(DoubleBaseType newRSS) {
		if (newRSS != rSS) {
			NotificationChain msgs = null;
			if (rSS != null)
				msgs = ((InternalEObject) rSS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__RSS, null, msgs);
			if (newRSS != null)
				msgs = ((InternalEObject) newRSS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GLOBAL_TYPE__RSS, null, msgs);
			msgs = basicSetRSS(newRSS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GLOBAL_TYPE__RSS, newRSS,
					newRSS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT:
			return basicSetEngineConcept(null, msgs);
		case CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR:
			return basicSetCertificationYear(null, msgs);
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION:
			return basicSetRotDirection(null, msgs);
		case CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R:
			return basicSetH2tR(null, msgs);
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA:
			return basicSetNoBla(null, msgs);
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV:
			return basicSetNoOGV(null, msgs);
		case CpacsPackage.ENGINE_GLOBAL_TYPE__RSS:
			return basicSetRSS(null, msgs);
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
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT:
			return getEngineConcept();
		case CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR:
			return getCertificationYear();
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION:
			return getRotDirection();
		case CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R:
			return getH2tR();
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA:
			return getNoBla();
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV:
			return getNoOGV();
		case CpacsPackage.ENGINE_GLOBAL_TYPE__RSS:
			return getRSS();
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
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT:
			setEngineConcept((EngineConceptType) newValue);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR:
			setCertificationYear((IntegerBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION:
			setRotDirection((RotDirectionType) newValue);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R:
			setH2tR((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA:
			setNoBla((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV:
			setNoOGV((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__RSS:
			setRSS((DoubleBaseType) newValue);
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
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT:
			setEngineConcept((EngineConceptType) null);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR:
			setCertificationYear((IntegerBaseType) null);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION:
			setRotDirection((RotDirectionType) null);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R:
			setH2tR((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA:
			setNoBla((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV:
			setNoOGV((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__RSS:
			setRSS((DoubleBaseType) null);
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
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ENGINE_CONCEPT:
			return engineConcept != null;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__CERTIFICATION_YEAR:
			return certificationYear != null;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__ROT_DIRECTION:
			return rotDirection != null;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__H2T_R:
			return h2tR != null;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_BLA:
			return noBla != null;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__NO_OGV:
			return noOGV != null;
		case CpacsPackage.ENGINE_GLOBAL_TYPE__RSS:
			return rSS != null;
		}
		return super.eIsSet(featureID);
	}

} //EngineGlobalTypeImpl
