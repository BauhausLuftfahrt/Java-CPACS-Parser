/**
 */
package Cpacs.impl;

import Cpacs.BeamStiffnessType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beam Stiffness Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BeamStiffnessTypeImpl#getEA <em>EA</em>}</li>
 *   <li>{@link Cpacs.impl.BeamStiffnessTypeImpl#getEIxx <em>EIxx</em>}</li>
 *   <li>{@link Cpacs.impl.BeamStiffnessTypeImpl#getEIyy <em>EIyy</em>}</li>
 *   <li>{@link Cpacs.impl.BeamStiffnessTypeImpl#getEIxy <em>EIxy</em>}</li>
 *   <li>{@link Cpacs.impl.BeamStiffnessTypeImpl#getGIt <em>GIt</em>}</li>
 *   <li>{@link Cpacs.impl.BeamStiffnessTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link Cpacs.impl.BeamStiffnessTypeImpl#getIt <em>It</em>}</li>
 *   <li>{@link Cpacs.impl.BeamStiffnessTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeamStiffnessTypeImpl extends ComplexBaseTypeImpl implements BeamStiffnessType {
	/**
	 * The cached value of the '{@link #getEA() <em>EA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEA()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eA;

	/**
	 * The cached value of the '{@link #getEIxx() <em>EIxx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIxx()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eIxx;

	/**
	 * The cached value of the '{@link #getEIyy() <em>EIyy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIyy()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eIyy;

	/**
	 * The cached value of the '{@link #getEIxy() <em>EIxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIxy()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eIxy;

	/**
	 * The cached value of the '{@link #getGIt() <em>GIt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGIt()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gIt;

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
	 * The cached value of the '{@link #getIt() <em>It</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIt()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType it;

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
	protected BeamStiffnessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBeamStiffnessType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEA() {
		return eA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEA(DoubleBaseType newEA, NotificationChain msgs) {
		DoubleBaseType oldEA = eA;
		eA = newEA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_STIFFNESS_TYPE__EA, oldEA, newEA);
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
	public void setEA(DoubleBaseType newEA) {
		if (newEA != eA) {
			NotificationChain msgs = null;
			if (eA != null)
				msgs = ((InternalEObject) eA).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__EA, null, msgs);
			if (newEA != null)
				msgs = ((InternalEObject) newEA).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__EA, null, msgs);
			msgs = basicSetEA(newEA, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_STIFFNESS_TYPE__EA, newEA, newEA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEIxx() {
		return eIxx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIxx(DoubleBaseType newEIxx, NotificationChain msgs) {
		DoubleBaseType oldEIxx = eIxx;
		eIxx = newEIxx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX, oldEIxx, newEIxx);
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
	public void setEIxx(DoubleBaseType newEIxx) {
		if (newEIxx != eIxx) {
			NotificationChain msgs = null;
			if (eIxx != null)
				msgs = ((InternalEObject) eIxx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX, null, msgs);
			if (newEIxx != null)
				msgs = ((InternalEObject) newEIxx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX, null, msgs);
			msgs = basicSetEIxx(newEIxx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX, newEIxx,
					newEIxx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEIyy() {
		return eIyy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIyy(DoubleBaseType newEIyy, NotificationChain msgs) {
		DoubleBaseType oldEIyy = eIyy;
		eIyy = newEIyy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY, oldEIyy, newEIyy);
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
	public void setEIyy(DoubleBaseType newEIyy) {
		if (newEIyy != eIyy) {
			NotificationChain msgs = null;
			if (eIyy != null)
				msgs = ((InternalEObject) eIyy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY, null, msgs);
			if (newEIyy != null)
				msgs = ((InternalEObject) newEIyy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY, null, msgs);
			msgs = basicSetEIyy(newEIyy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY, newEIyy,
					newEIyy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEIxy() {
		return eIxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIxy(DoubleBaseType newEIxy, NotificationChain msgs) {
		DoubleBaseType oldEIxy = eIxy;
		eIxy = newEIxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY, oldEIxy, newEIxy);
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
	public void setEIxy(DoubleBaseType newEIxy) {
		if (newEIxy != eIxy) {
			NotificationChain msgs = null;
			if (eIxy != null)
				msgs = ((InternalEObject) eIxy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY, null, msgs);
			if (newEIxy != null)
				msgs = ((InternalEObject) newEIxy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY, null, msgs);
			msgs = basicSetEIxy(newEIxy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY, newEIxy,
					newEIxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGIt() {
		return gIt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGIt(DoubleBaseType newGIt, NotificationChain msgs) {
		DoubleBaseType oldGIt = gIt;
		gIt = newGIt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_STIFFNESS_TYPE__GIT, oldGIt, newGIt);
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
	public void setGIt(DoubleBaseType newGIt) {
		if (newGIt != gIt) {
			NotificationChain msgs = null;
			if (gIt != null)
				msgs = ((InternalEObject) gIt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__GIT, null, msgs);
			if (newGIt != null)
				msgs = ((InternalEObject) newGIt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__GIT, null, msgs);
			msgs = basicSetGIt(newGIt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_STIFFNESS_TYPE__GIT, newGIt,
					newGIt));
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
					CpacsPackage.BEAM_STIFFNESS_TYPE__G, oldG, newG);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__G, null, msgs);
			if (newG != null)
				msgs = ((InternalEObject) newG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__G, null, msgs);
			msgs = basicSetG(newG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_STIFFNESS_TYPE__G, newG, newG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getIt() {
		return it;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIt(DoubleBaseType newIt, NotificationChain msgs) {
		DoubleBaseType oldIt = it;
		it = newIt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_STIFFNESS_TYPE__IT, oldIt, newIt);
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
	public void setIt(DoubleBaseType newIt) {
		if (newIt != it) {
			NotificationChain msgs = null;
			if (it != null)
				msgs = ((InternalEObject) it).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__IT, null, msgs);
			if (newIt != null)
				msgs = ((InternalEObject) newIt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_STIFFNESS_TYPE__IT, null, msgs);
			msgs = basicSetIt(newIt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_STIFFNESS_TYPE__IT, newIt, newIt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_STIFFNESS_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EA:
			return basicSetEA(null, msgs);
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX:
			return basicSetEIxx(null, msgs);
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY:
			return basicSetEIyy(null, msgs);
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY:
			return basicSetEIxy(null, msgs);
		case CpacsPackage.BEAM_STIFFNESS_TYPE__GIT:
			return basicSetGIt(null, msgs);
		case CpacsPackage.BEAM_STIFFNESS_TYPE__G:
			return basicSetG(null, msgs);
		case CpacsPackage.BEAM_STIFFNESS_TYPE__IT:
			return basicSetIt(null, msgs);
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
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EA:
			return getEA();
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX:
			return getEIxx();
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY:
			return getEIyy();
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY:
			return getEIxy();
		case CpacsPackage.BEAM_STIFFNESS_TYPE__GIT:
			return getGIt();
		case CpacsPackage.BEAM_STIFFNESS_TYPE__G:
			return getG();
		case CpacsPackage.BEAM_STIFFNESS_TYPE__IT:
			return getIt();
		case CpacsPackage.BEAM_STIFFNESS_TYPE__UID:
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
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EA:
			setEA((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX:
			setEIxx((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY:
			setEIyy((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY:
			setEIxy((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__GIT:
			setGIt((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__G:
			setG((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__IT:
			setIt((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__UID:
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
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EA:
			setEA((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX:
			setEIxx((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY:
			setEIyy((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY:
			setEIxy((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__GIT:
			setGIt((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__G:
			setG((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__IT:
			setIt((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__UID:
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
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EA:
			return eA != null;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXX:
			return eIxx != null;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIYY:
			return eIyy != null;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__EIXY:
			return eIxy != null;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__GIT:
			return gIt != null;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__G:
			return g != null;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__IT:
			return it != null;
		case CpacsPackage.BEAM_STIFFNESS_TYPE__UID:
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

} //BeamStiffnessTypeImpl
