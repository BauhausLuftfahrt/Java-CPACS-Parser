/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FqEiglatType;
import Cpacs.FqRatingsType;
import Cpacs.FqRoloscType;
import Cpacs.FqShortPeriodType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Ratings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqRatingsTypeImpl#getPhugoid <em>Phugoid</em>}</li>
 *   <li>{@link Cpacs.impl.FqRatingsTypeImpl#getCStar <em>CStar</em>}</li>
 *   <li>{@link Cpacs.impl.FqRatingsTypeImpl#getShortPeriod <em>Short Period</em>}</li>
 *   <li>{@link Cpacs.impl.FqRatingsTypeImpl#getRolosc <em>Rolosc</em>}</li>
 *   <li>{@link Cpacs.impl.FqRatingsTypeImpl#getEiglat <em>Eiglat</em>}</li>
 *   <li>{@link Cpacs.impl.FqRatingsTypeImpl#getTreff <em>Treff</em>}</li>
 *   <li>{@link Cpacs.impl.FqRatingsTypeImpl#getRollPerf <em>Roll Perf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqRatingsTypeImpl extends ComplexBaseTypeImpl implements FqRatingsType {
	/**
	 * The cached value of the '{@link #getPhugoid() <em>Phugoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhugoid()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType phugoid;

	/**
	 * The cached value of the '{@link #getCStar() <em>CStar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCStar()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType cStar;

	/**
	 * The cached value of the '{@link #getShortPeriod() <em>Short Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortPeriod()
	 * @generated
	 * @ordered
	 */
	protected FqShortPeriodType shortPeriod;

	/**
	 * The cached value of the '{@link #getRolosc() <em>Rolosc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolosc()
	 * @generated
	 * @ordered
	 */
	protected FqRoloscType rolosc;

	/**
	 * The cached value of the '{@link #getEiglat() <em>Eiglat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEiglat()
	 * @generated
	 * @ordered
	 */
	protected FqEiglatType eiglat;

	/**
	 * The cached value of the '{@link #getTreff() <em>Treff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreff()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType treff;

	/**
	 * The cached value of the '{@link #getRollPerf() <em>Roll Perf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollPerf()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType rollPerf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqRatingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqRatingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getPhugoid() {
		return phugoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhugoid(StringBaseType newPhugoid, NotificationChain msgs) {
		StringBaseType oldPhugoid = phugoid;
		phugoid = newPhugoid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_RATINGS_TYPE__PHUGOID, oldPhugoid, newPhugoid);
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
	public void setPhugoid(StringBaseType newPhugoid) {
		if (newPhugoid != phugoid) {
			NotificationChain msgs = null;
			if (phugoid != null)
				msgs = ((InternalEObject) phugoid).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__PHUGOID, null, msgs);
			if (newPhugoid != null)
				msgs = ((InternalEObject) newPhugoid).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__PHUGOID, null, msgs);
			msgs = basicSetPhugoid(newPhugoid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_RATINGS_TYPE__PHUGOID, newPhugoid,
					newPhugoid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getCStar() {
		return cStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCStar(StringBaseType newCStar, NotificationChain msgs) {
		StringBaseType oldCStar = cStar;
		cStar = newCStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_RATINGS_TYPE__CSTAR, oldCStar, newCStar);
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
	public void setCStar(StringBaseType newCStar) {
		if (newCStar != cStar) {
			NotificationChain msgs = null;
			if (cStar != null)
				msgs = ((InternalEObject) cStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__CSTAR, null, msgs);
			if (newCStar != null)
				msgs = ((InternalEObject) newCStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__CSTAR, null, msgs);
			msgs = basicSetCStar(newCStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_RATINGS_TYPE__CSTAR, newCStar,
					newCStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqShortPeriodType getShortPeriod() {
		return shortPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortPeriod(FqShortPeriodType newShortPeriod, NotificationChain msgs) {
		FqShortPeriodType oldShortPeriod = shortPeriod;
		shortPeriod = newShortPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD, oldShortPeriod, newShortPeriod);
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
	public void setShortPeriod(FqShortPeriodType newShortPeriod) {
		if (newShortPeriod != shortPeriod) {
			NotificationChain msgs = null;
			if (shortPeriod != null)
				msgs = ((InternalEObject) shortPeriod).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD, null, msgs);
			if (newShortPeriod != null)
				msgs = ((InternalEObject) newShortPeriod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD, null, msgs);
			msgs = basicSetShortPeriod(newShortPeriod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD,
					newShortPeriod, newShortPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqRoloscType getRolosc() {
		return rolosc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolosc(FqRoloscType newRolosc, NotificationChain msgs) {
		FqRoloscType oldRolosc = rolosc;
		rolosc = newRolosc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_RATINGS_TYPE__ROLOSC, oldRolosc, newRolosc);
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
	public void setRolosc(FqRoloscType newRolosc) {
		if (newRolosc != rolosc) {
			NotificationChain msgs = null;
			if (rolosc != null)
				msgs = ((InternalEObject) rolosc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__ROLOSC, null, msgs);
			if (newRolosc != null)
				msgs = ((InternalEObject) newRolosc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__ROLOSC, null, msgs);
			msgs = basicSetRolosc(newRolosc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_RATINGS_TYPE__ROLOSC, newRolosc,
					newRolosc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqEiglatType getEiglat() {
		return eiglat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEiglat(FqEiglatType newEiglat, NotificationChain msgs) {
		FqEiglatType oldEiglat = eiglat;
		eiglat = newEiglat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_RATINGS_TYPE__EIGLAT, oldEiglat, newEiglat);
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
	public void setEiglat(FqEiglatType newEiglat) {
		if (newEiglat != eiglat) {
			NotificationChain msgs = null;
			if (eiglat != null)
				msgs = ((InternalEObject) eiglat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__EIGLAT, null, msgs);
			if (newEiglat != null)
				msgs = ((InternalEObject) newEiglat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__EIGLAT, null, msgs);
			msgs = basicSetEiglat(newEiglat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_RATINGS_TYPE__EIGLAT, newEiglat,
					newEiglat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getTreff() {
		return treff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreff(StringBaseType newTreff, NotificationChain msgs) {
		StringBaseType oldTreff = treff;
		treff = newTreff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_RATINGS_TYPE__TREFF, oldTreff, newTreff);
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
	public void setTreff(StringBaseType newTreff) {
		if (newTreff != treff) {
			NotificationChain msgs = null;
			if (treff != null)
				msgs = ((InternalEObject) treff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__TREFF, null, msgs);
			if (newTreff != null)
				msgs = ((InternalEObject) newTreff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__TREFF, null, msgs);
			msgs = basicSetTreff(newTreff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_RATINGS_TYPE__TREFF, newTreff,
					newTreff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getRollPerf() {
		return rollPerf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollPerf(StringBaseType newRollPerf, NotificationChain msgs) {
		StringBaseType oldRollPerf = rollPerf;
		rollPerf = newRollPerf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF, oldRollPerf, newRollPerf);
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
	public void setRollPerf(StringBaseType newRollPerf) {
		if (newRollPerf != rollPerf) {
			NotificationChain msgs = null;
			if (rollPerf != null)
				msgs = ((InternalEObject) rollPerf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF, null, msgs);
			if (newRollPerf != null)
				msgs = ((InternalEObject) newRollPerf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF, null, msgs);
			msgs = basicSetRollPerf(newRollPerf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF, newRollPerf,
					newRollPerf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_RATINGS_TYPE__PHUGOID:
			return basicSetPhugoid(null, msgs);
		case CpacsPackage.FQ_RATINGS_TYPE__CSTAR:
			return basicSetCStar(null, msgs);
		case CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD:
			return basicSetShortPeriod(null, msgs);
		case CpacsPackage.FQ_RATINGS_TYPE__ROLOSC:
			return basicSetRolosc(null, msgs);
		case CpacsPackage.FQ_RATINGS_TYPE__EIGLAT:
			return basicSetEiglat(null, msgs);
		case CpacsPackage.FQ_RATINGS_TYPE__TREFF:
			return basicSetTreff(null, msgs);
		case CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF:
			return basicSetRollPerf(null, msgs);
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
		case CpacsPackage.FQ_RATINGS_TYPE__PHUGOID:
			return getPhugoid();
		case CpacsPackage.FQ_RATINGS_TYPE__CSTAR:
			return getCStar();
		case CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD:
			return getShortPeriod();
		case CpacsPackage.FQ_RATINGS_TYPE__ROLOSC:
			return getRolosc();
		case CpacsPackage.FQ_RATINGS_TYPE__EIGLAT:
			return getEiglat();
		case CpacsPackage.FQ_RATINGS_TYPE__TREFF:
			return getTreff();
		case CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF:
			return getRollPerf();
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
		case CpacsPackage.FQ_RATINGS_TYPE__PHUGOID:
			setPhugoid((StringBaseType) newValue);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__CSTAR:
			setCStar((StringBaseType) newValue);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD:
			setShortPeriod((FqShortPeriodType) newValue);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__ROLOSC:
			setRolosc((FqRoloscType) newValue);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__EIGLAT:
			setEiglat((FqEiglatType) newValue);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__TREFF:
			setTreff((StringBaseType) newValue);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF:
			setRollPerf((StringBaseType) newValue);
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
		case CpacsPackage.FQ_RATINGS_TYPE__PHUGOID:
			setPhugoid((StringBaseType) null);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__CSTAR:
			setCStar((StringBaseType) null);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD:
			setShortPeriod((FqShortPeriodType) null);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__ROLOSC:
			setRolosc((FqRoloscType) null);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__EIGLAT:
			setEiglat((FqEiglatType) null);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__TREFF:
			setTreff((StringBaseType) null);
			return;
		case CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF:
			setRollPerf((StringBaseType) null);
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
		case CpacsPackage.FQ_RATINGS_TYPE__PHUGOID:
			return phugoid != null;
		case CpacsPackage.FQ_RATINGS_TYPE__CSTAR:
			return cStar != null;
		case CpacsPackage.FQ_RATINGS_TYPE__SHORT_PERIOD:
			return shortPeriod != null;
		case CpacsPackage.FQ_RATINGS_TYPE__ROLOSC:
			return rolosc != null;
		case CpacsPackage.FQ_RATINGS_TYPE__EIGLAT:
			return eiglat != null;
		case CpacsPackage.FQ_RATINGS_TYPE__TREFF:
			return treff != null;
		case CpacsPackage.FQ_RATINGS_TYPE__ROLL_PERF:
			return rollPerf != null;
		}
		return super.eIsSet(featureID);
	}

} //FqRatingsTypeImpl
