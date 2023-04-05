/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.DragContributionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drag Contributions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DragContributionsTypeImpl#getCdPressure <em>Cd Pressure</em>}</li>
 *   <li>{@link Cpacs.impl.DragContributionsTypeImpl#getCdViscous <em>Cd Viscous</em>}</li>
 *   <li>{@link Cpacs.impl.DragContributionsTypeImpl#getCdFriction <em>Cd Friction</em>}</li>
 *   <li>{@link Cpacs.impl.DragContributionsTypeImpl#getCdInduced <em>Cd Induced</em>}</li>
 *   <li>{@link Cpacs.impl.DragContributionsTypeImpl#getCdInterference <em>Cd Interference</em>}</li>
 *   <li>{@link Cpacs.impl.DragContributionsTypeImpl#getCdWave <em>Cd Wave</em>}</li>
 *   <li>{@link Cpacs.impl.DragContributionsTypeImpl#getCdTrim <em>Cd Trim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DragContributionsTypeImpl extends ComplexBaseTypeImpl implements DragContributionsType {
	/**
	 * The cached value of the '{@link #getCdPressure() <em>Cd Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdPressure()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cdPressure;

	/**
	 * The cached value of the '{@link #getCdViscous() <em>Cd Viscous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdViscous()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cdViscous;

	/**
	 * The cached value of the '{@link #getCdFriction() <em>Cd Friction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdFriction()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cdFriction;

	/**
	 * The cached value of the '{@link #getCdInduced() <em>Cd Induced</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdInduced()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cdInduced;

	/**
	 * The cached value of the '{@link #getCdInterference() <em>Cd Interference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdInterference()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cdInterference;

	/**
	 * The cached value of the '{@link #getCdWave() <em>Cd Wave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdWave()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cdWave;

	/**
	 * The cached value of the '{@link #getCdTrim() <em>Cd Trim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdTrim()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cdTrim;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DragContributionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDragContributionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCdPressure() {
		return cdPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCdPressure(DoubleBaseType newCdPressure, NotificationChain msgs) {
		DoubleBaseType oldCdPressure = cdPressure;
		cdPressure = newCdPressure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE, oldCdPressure, newCdPressure);
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
	public void setCdPressure(DoubleBaseType newCdPressure) {
		if (newCdPressure != cdPressure) {
			NotificationChain msgs = null;
			if (cdPressure != null)
				msgs = ((InternalEObject) cdPressure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE, null, msgs);
			if (newCdPressure != null)
				msgs = ((InternalEObject) newCdPressure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE, null, msgs);
			msgs = basicSetCdPressure(newCdPressure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE,
					newCdPressure, newCdPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCdViscous() {
		return cdViscous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCdViscous(DoubleBaseType newCdViscous, NotificationChain msgs) {
		DoubleBaseType oldCdViscous = cdViscous;
		cdViscous = newCdViscous;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS, oldCdViscous, newCdViscous);
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
	public void setCdViscous(DoubleBaseType newCdViscous) {
		if (newCdViscous != cdViscous) {
			NotificationChain msgs = null;
			if (cdViscous != null)
				msgs = ((InternalEObject) cdViscous).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS, null, msgs);
			if (newCdViscous != null)
				msgs = ((InternalEObject) newCdViscous).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS, null, msgs);
			msgs = basicSetCdViscous(newCdViscous, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS,
					newCdViscous, newCdViscous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCdFriction() {
		return cdFriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCdFriction(DoubleBaseType newCdFriction, NotificationChain msgs) {
		DoubleBaseType oldCdFriction = cdFriction;
		cdFriction = newCdFriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION, oldCdFriction, newCdFriction);
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
	public void setCdFriction(DoubleBaseType newCdFriction) {
		if (newCdFriction != cdFriction) {
			NotificationChain msgs = null;
			if (cdFriction != null)
				msgs = ((InternalEObject) cdFriction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION, null, msgs);
			if (newCdFriction != null)
				msgs = ((InternalEObject) newCdFriction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION, null, msgs);
			msgs = basicSetCdFriction(newCdFriction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION,
					newCdFriction, newCdFriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCdInduced() {
		return cdInduced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCdInduced(DoubleBaseType newCdInduced, NotificationChain msgs) {
		DoubleBaseType oldCdInduced = cdInduced;
		cdInduced = newCdInduced;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED, oldCdInduced, newCdInduced);
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
	public void setCdInduced(DoubleBaseType newCdInduced) {
		if (newCdInduced != cdInduced) {
			NotificationChain msgs = null;
			if (cdInduced != null)
				msgs = ((InternalEObject) cdInduced).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED, null, msgs);
			if (newCdInduced != null)
				msgs = ((InternalEObject) newCdInduced).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED, null, msgs);
			msgs = basicSetCdInduced(newCdInduced, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED,
					newCdInduced, newCdInduced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCdInterference() {
		return cdInterference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCdInterference(DoubleBaseType newCdInterference, NotificationChain msgs) {
		DoubleBaseType oldCdInterference = cdInterference;
		cdInterference = newCdInterference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE, oldCdInterference, newCdInterference);
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
	public void setCdInterference(DoubleBaseType newCdInterference) {
		if (newCdInterference != cdInterference) {
			NotificationChain msgs = null;
			if (cdInterference != null)
				msgs = ((InternalEObject) cdInterference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE, null, msgs);
			if (newCdInterference != null)
				msgs = ((InternalEObject) newCdInterference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE, null, msgs);
			msgs = basicSetCdInterference(newCdInterference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE,
					newCdInterference, newCdInterference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCdWave() {
		return cdWave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCdWave(DoubleBaseType newCdWave, NotificationChain msgs) {
		DoubleBaseType oldCdWave = cdWave;
		cdWave = newCdWave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE, oldCdWave, newCdWave);
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
	public void setCdWave(DoubleBaseType newCdWave) {
		if (newCdWave != cdWave) {
			NotificationChain msgs = null;
			if (cdWave != null)
				msgs = ((InternalEObject) cdWave).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE, null, msgs);
			if (newCdWave != null)
				msgs = ((InternalEObject) newCdWave).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE, null, msgs);
			msgs = basicSetCdWave(newCdWave, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE,
					newCdWave, newCdWave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCdTrim() {
		return cdTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCdTrim(DoubleBaseType newCdTrim, NotificationChain msgs) {
		DoubleBaseType oldCdTrim = cdTrim;
		cdTrim = newCdTrim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM, oldCdTrim, newCdTrim);
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
	public void setCdTrim(DoubleBaseType newCdTrim) {
		if (newCdTrim != cdTrim) {
			NotificationChain msgs = null;
			if (cdTrim != null)
				msgs = ((InternalEObject) cdTrim).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM, null, msgs);
			if (newCdTrim != null)
				msgs = ((InternalEObject) newCdTrim).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM, null, msgs);
			msgs = basicSetCdTrim(newCdTrim, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM,
					newCdTrim, newCdTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE:
			return basicSetCdPressure(null, msgs);
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS:
			return basicSetCdViscous(null, msgs);
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION:
			return basicSetCdFriction(null, msgs);
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED:
			return basicSetCdInduced(null, msgs);
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE:
			return basicSetCdInterference(null, msgs);
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE:
			return basicSetCdWave(null, msgs);
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM:
			return basicSetCdTrim(null, msgs);
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
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE:
			return getCdPressure();
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS:
			return getCdViscous();
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION:
			return getCdFriction();
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED:
			return getCdInduced();
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE:
			return getCdInterference();
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE:
			return getCdWave();
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM:
			return getCdTrim();
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
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE:
			setCdPressure((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS:
			setCdViscous((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION:
			setCdFriction((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED:
			setCdInduced((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE:
			setCdInterference((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE:
			setCdWave((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM:
			setCdTrim((DoubleBaseType) newValue);
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
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE:
			setCdPressure((DoubleBaseType) null);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS:
			setCdViscous((DoubleBaseType) null);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION:
			setCdFriction((DoubleBaseType) null);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED:
			setCdInduced((DoubleBaseType) null);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE:
			setCdInterference((DoubleBaseType) null);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE:
			setCdWave((DoubleBaseType) null);
			return;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM:
			setCdTrim((DoubleBaseType) null);
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
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_PRESSURE:
			return cdPressure != null;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_VISCOUS:
			return cdViscous != null;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_FRICTION:
			return cdFriction != null;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INDUCED:
			return cdInduced != null;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_INTERFERENCE:
			return cdInterference != null;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_WAVE:
			return cdWave != null;
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE__CD_TRIM:
			return cdTrim != null;
		}
		return super.eIsSet(featureID);
	}

} //DragContributionsTypeImpl
