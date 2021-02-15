/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeltaTemperatureType;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Temperature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeltaTemperatureTypeImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link Cpacs.impl.DeltaTemperatureTypeImpl#getCO2 <em>CO2</em>}</li>
 *   <li>{@link Cpacs.impl.DeltaTemperatureTypeImpl#getH2O <em>H2O</em>}</li>
 *   <li>{@link Cpacs.impl.DeltaTemperatureTypeImpl#getO3 <em>O3</em>}</li>
 *   <li>{@link Cpacs.impl.DeltaTemperatureTypeImpl#getCH4 <em>CH4</em>}</li>
 *   <li>{@link Cpacs.impl.DeltaTemperatureTypeImpl#getCont <em>Cont</em>}</li>
 *   <li>{@link Cpacs.impl.DeltaTemperatureTypeImpl#getPmo <em>Pmo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaTemperatureTypeImpl extends ComplexBaseTypeImpl implements DeltaTemperatureType {
	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType total;

	/**
	 * The cached value of the '{@link #getCO2() <em>CO2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cO2;

	/**
	 * The cached value of the '{@link #getH2O() <em>H2O</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH2O()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType h2O;

	/**
	 * The cached value of the '{@link #getO3() <em>O3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getO3()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType o3;

	/**
	 * The cached value of the '{@link #getCH4() <em>CH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCH4()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cH4;

	/**
	 * The cached value of the '{@link #getCont() <em>Cont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCont()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cont;

	/**
	 * The cached value of the '{@link #getPmo() <em>Pmo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPmo()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType pmo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaTemperatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeltaTemperatureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotal(DoubleBaseType newTotal, NotificationChain msgs) {
		DoubleBaseType oldTotal = total;
		total = newTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL, oldTotal, newTotal);
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
	public void setTotal(DoubleBaseType newTotal) {
		if (newTotal != total) {
			NotificationChain msgs = null;
			if (total != null)
				msgs = ((InternalEObject) total).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL, null, msgs);
			if (newTotal != null)
				msgs = ((InternalEObject) newTotal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL, null, msgs);
			msgs = basicSetTotal(newTotal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL, newTotal,
					newTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCO2() {
		return cO2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCO2(DoubleBaseType newCO2, NotificationChain msgs) {
		DoubleBaseType oldCO2 = cO2;
		cO2 = newCO2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2, oldCO2, newCO2);
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
	public void setCO2(DoubleBaseType newCO2) {
		if (newCO2 != cO2) {
			NotificationChain msgs = null;
			if (cO2 != null)
				msgs = ((InternalEObject) cO2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2, null, msgs);
			if (newCO2 != null)
				msgs = ((InternalEObject) newCO2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2, null, msgs);
			msgs = basicSetCO2(newCO2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2, newCO2,
					newCO2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getH2O() {
		return h2O;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH2O(DoubleBaseType newH2O, NotificationChain msgs) {
		DoubleBaseType oldH2O = h2O;
		h2O = newH2O;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O, oldH2O, newH2O);
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
	public void setH2O(DoubleBaseType newH2O) {
		if (newH2O != h2O) {
			NotificationChain msgs = null;
			if (h2O != null)
				msgs = ((InternalEObject) h2O).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O, null, msgs);
			if (newH2O != null)
				msgs = ((InternalEObject) newH2O).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O, null, msgs);
			msgs = basicSetH2O(newH2O, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O, newH2O,
					newH2O));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getO3() {
		return o3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetO3(DoubleBaseType newO3, NotificationChain msgs) {
		DoubleBaseType oldO3 = o3;
		o3 = newO3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DELTA_TEMPERATURE_TYPE__O3, oldO3, newO3);
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
	public void setO3(DoubleBaseType newO3) {
		if (newO3 != o3) {
			NotificationChain msgs = null;
			if (o3 != null)
				msgs = ((InternalEObject) o3).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__O3, null, msgs);
			if (newO3 != null)
				msgs = ((InternalEObject) newO3).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__O3, null, msgs);
			msgs = basicSetO3(newO3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DELTA_TEMPERATURE_TYPE__O3, newO3,
					newO3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCH4() {
		return cH4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCH4(DoubleBaseType newCH4, NotificationChain msgs) {
		DoubleBaseType oldCH4 = cH4;
		cH4 = newCH4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4, oldCH4, newCH4);
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
	public void setCH4(DoubleBaseType newCH4) {
		if (newCH4 != cH4) {
			NotificationChain msgs = null;
			if (cH4 != null)
				msgs = ((InternalEObject) cH4).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4, null, msgs);
			if (newCH4 != null)
				msgs = ((InternalEObject) newCH4).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4, null, msgs);
			msgs = basicSetCH4(newCH4, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4, newCH4,
					newCH4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCont() {
		return cont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCont(DoubleBaseType newCont, NotificationChain msgs) {
		DoubleBaseType oldCont = cont;
		cont = newCont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT, oldCont, newCont);
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
	public void setCont(DoubleBaseType newCont) {
		if (newCont != cont) {
			NotificationChain msgs = null;
			if (cont != null)
				msgs = ((InternalEObject) cont).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT, null, msgs);
			if (newCont != null)
				msgs = ((InternalEObject) newCont).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT, null, msgs);
			msgs = basicSetCont(newCont, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT, newCont,
					newCont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPmo() {
		return pmo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPmo(DoubleBaseType newPmo, NotificationChain msgs) {
		DoubleBaseType oldPmo = pmo;
		pmo = newPmo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO, oldPmo, newPmo);
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
	public void setPmo(DoubleBaseType newPmo) {
		if (newPmo != pmo) {
			NotificationChain msgs = null;
			if (pmo != null)
				msgs = ((InternalEObject) pmo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO, null, msgs);
			if (newPmo != null)
				msgs = ((InternalEObject) newPmo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO, null, msgs);
			msgs = basicSetPmo(newPmo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO, newPmo,
					newPmo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL:
			return basicSetTotal(null, msgs);
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2:
			return basicSetCO2(null, msgs);
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O:
			return basicSetH2O(null, msgs);
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__O3:
			return basicSetO3(null, msgs);
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4:
			return basicSetCH4(null, msgs);
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT:
			return basicSetCont(null, msgs);
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO:
			return basicSetPmo(null, msgs);
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
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL:
			return getTotal();
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2:
			return getCO2();
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O:
			return getH2O();
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__O3:
			return getO3();
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4:
			return getCH4();
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT:
			return getCont();
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO:
			return getPmo();
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
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL:
			setTotal((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2:
			setCO2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O:
			setH2O((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__O3:
			setO3((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4:
			setCH4((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT:
			setCont((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO:
			setPmo((DoubleBaseType) newValue);
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
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL:
			setTotal((DoubleBaseType) null);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2:
			setCO2((DoubleBaseType) null);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O:
			setH2O((DoubleBaseType) null);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__O3:
			setO3((DoubleBaseType) null);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4:
			setCH4((DoubleBaseType) null);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT:
			setCont((DoubleBaseType) null);
			return;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO:
			setPmo((DoubleBaseType) null);
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
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__TOTAL:
			return total != null;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CO2:
			return cO2 != null;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__H2_O:
			return h2O != null;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__O3:
			return o3 != null;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CH4:
			return cH4 != null;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__CONT:
			return cont != null;
		case CpacsPackage.DELTA_TEMPERATURE_TYPE__PMO:
			return pmo != null;
		}
		return super.eIsSet(featureID);
	}

} //DeltaTemperatureTypeImpl
