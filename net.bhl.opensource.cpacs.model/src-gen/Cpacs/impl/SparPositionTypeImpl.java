/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CurvePointType;
import Cpacs.EtaXsiPointType;
import Cpacs.SparPositionType;
import Cpacs.WingRibPointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spar Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SparPositionTypeImpl#getSparPositionRib <em>Spar Position Rib</em>}</li>
 *   <li>{@link Cpacs.impl.SparPositionTypeImpl#getSparPositionEtaXsi <em>Spar Position Eta Xsi</em>}</li>
 *   <li>{@link Cpacs.impl.SparPositionTypeImpl#getSparPositionCurve <em>Spar Position Curve</em>}</li>
 *   <li>{@link Cpacs.impl.SparPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparPositionTypeImpl extends ComplexBaseTypeImpl implements SparPositionType {
	/**
	 * The cached value of the '{@link #getSparPositionRib() <em>Spar Position Rib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparPositionRib()
	 * @generated
	 * @ordered
	 */
	protected WingRibPointType sparPositionRib;

	/**
	 * The cached value of the '{@link #getSparPositionEtaXsi() <em>Spar Position Eta Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparPositionEtaXsi()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiPointType sparPositionEtaXsi;

	/**
	 * The cached value of the '{@link #getSparPositionCurve() <em>Spar Position Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparPositionCurve()
	 * @generated
	 * @ordered
	 */
	protected CurvePointType sparPositionCurve;

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
	protected SparPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSparPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibPointType getSparPositionRib() {
		return sparPositionRib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparPositionRib(WingRibPointType newSparPositionRib, NotificationChain msgs) {
		WingRibPointType oldSparPositionRib = sparPositionRib;
		sparPositionRib = newSparPositionRib;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB, oldSparPositionRib, newSparPositionRib);
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
	public void setSparPositionRib(WingRibPointType newSparPositionRib) {
		if (newSparPositionRib != sparPositionRib) {
			NotificationChain msgs = null;
			if (sparPositionRib != null)
				msgs = ((InternalEObject) sparPositionRib).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB, null, msgs);
			if (newSparPositionRib != null)
				msgs = ((InternalEObject) newSparPositionRib).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB, null, msgs);
			msgs = basicSetSparPositionRib(newSparPositionRib, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB,
					newSparPositionRib, newSparPositionRib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiPointType getSparPositionEtaXsi() {
		return sparPositionEtaXsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparPositionEtaXsi(EtaXsiPointType newSparPositionEtaXsi, NotificationChain msgs) {
		EtaXsiPointType oldSparPositionEtaXsi = sparPositionEtaXsi;
		sparPositionEtaXsi = newSparPositionEtaXsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI, oldSparPositionEtaXsi,
					newSparPositionEtaXsi);
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
	public void setSparPositionEtaXsi(EtaXsiPointType newSparPositionEtaXsi) {
		if (newSparPositionEtaXsi != sparPositionEtaXsi) {
			NotificationChain msgs = null;
			if (sparPositionEtaXsi != null)
				msgs = ((InternalEObject) sparPositionEtaXsi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI, null, msgs);
			if (newSparPositionEtaXsi != null)
				msgs = ((InternalEObject) newSparPositionEtaXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI, null, msgs);
			msgs = basicSetSparPositionEtaXsi(newSparPositionEtaXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI, newSparPositionEtaXsi,
					newSparPositionEtaXsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePointType getSparPositionCurve() {
		return sparPositionCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparPositionCurve(CurvePointType newSparPositionCurve, NotificationChain msgs) {
		CurvePointType oldSparPositionCurve = sparPositionCurve;
		sparPositionCurve = newSparPositionCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE, oldSparPositionCurve, newSparPositionCurve);
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
	public void setSparPositionCurve(CurvePointType newSparPositionCurve) {
		if (newSparPositionCurve != sparPositionCurve) {
			NotificationChain msgs = null;
			if (sparPositionCurve != null)
				msgs = ((InternalEObject) sparPositionCurve).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE, null, msgs);
			if (newSparPositionCurve != null)
				msgs = ((InternalEObject) newSparPositionCurve).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE, null, msgs);
			msgs = basicSetSparPositionCurve(newSparPositionCurve, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE,
					newSparPositionCurve, newSparPositionCurve));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_POSITION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB:
			return basicSetSparPositionRib(null, msgs);
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI:
			return basicSetSparPositionEtaXsi(null, msgs);
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE:
			return basicSetSparPositionCurve(null, msgs);
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
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB:
			return getSparPositionRib();
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI:
			return getSparPositionEtaXsi();
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE:
			return getSparPositionCurve();
		case CpacsPackage.SPAR_POSITION_TYPE__UID:
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
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB:
			setSparPositionRib((WingRibPointType) newValue);
			return;
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI:
			setSparPositionEtaXsi((EtaXsiPointType) newValue);
			return;
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE:
			setSparPositionCurve((CurvePointType) newValue);
			return;
		case CpacsPackage.SPAR_POSITION_TYPE__UID:
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
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB:
			setSparPositionRib((WingRibPointType) null);
			return;
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI:
			setSparPositionEtaXsi((EtaXsiPointType) null);
			return;
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE:
			setSparPositionCurve((CurvePointType) null);
			return;
		case CpacsPackage.SPAR_POSITION_TYPE__UID:
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
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_RIB:
			return sparPositionRib != null;
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_ETA_XSI:
			return sparPositionEtaXsi != null;
		case CpacsPackage.SPAR_POSITION_TYPE__SPAR_POSITION_CURVE:
			return sparPositionCurve != null;
		case CpacsPackage.SPAR_POSITION_TYPE__UID:
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

} //SparPositionTypeImpl
