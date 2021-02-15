/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EngineFanType;
import Cpacs.EngineGeometryType;
import Cpacs.EngineMountsType;
import Cpacs.EngineSpinnerType;
import Cpacs.LinerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineGeometryTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGeometryTypeImpl#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGeometryTypeImpl#getDiameterProp <em>Diameter Prop</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGeometryTypeImpl#getChordlength <em>Chordlength</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGeometryTypeImpl#getFan <em>Fan</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGeometryTypeImpl#getSpinner <em>Spinner</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGeometryTypeImpl#getEngineMounts <em>Engine Mounts</em>}</li>
 *   <li>{@link Cpacs.impl.EngineGeometryTypeImpl#getLiner <em>Liner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineGeometryTypeImpl extends ComplexBaseTypeImpl implements EngineGeometryType {
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType length;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType diameter;

	/**
	 * The cached value of the '{@link #getDiameterProp() <em>Diameter Prop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterProp()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType diameterProp;

	/**
	 * The cached value of the '{@link #getChordlength() <em>Chordlength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChordlength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType chordlength;

	/**
	 * The cached value of the '{@link #getFan() <em>Fan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan()
	 * @generated
	 * @ordered
	 */
	protected EngineFanType fan;

	/**
	 * The cached value of the '{@link #getSpinner() <em>Spinner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinner()
	 * @generated
	 * @ordered
	 */
	protected EngineSpinnerType spinner;

	/**
	 * The cached value of the '{@link #getEngineMounts() <em>Engine Mounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineMounts()
	 * @generated
	 * @ordered
	 */
	protected EngineMountsType engineMounts;

	/**
	 * The cached value of the '{@link #getLiner() <em>Liner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiner()
	 * @generated
	 * @ordered
	 */
	protected LinerType liner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(DoubleBaseType newLength, NotificationChain msgs) {
		DoubleBaseType oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH, oldLength, newLength);
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
	public void setLength(DoubleBaseType newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject) length).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH, newLength,
					newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDiameter() {
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiameter(DoubleBaseType newDiameter, NotificationChain msgs) {
		DoubleBaseType oldDiameter = diameter;
		diameter = newDiameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER, oldDiameter, newDiameter);
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
	public void setDiameter(DoubleBaseType newDiameter) {
		if (newDiameter != diameter) {
			NotificationChain msgs = null;
			if (diameter != null)
				msgs = ((InternalEObject) diameter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER, null, msgs);
			if (newDiameter != null)
				msgs = ((InternalEObject) newDiameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER, null, msgs);
			msgs = basicSetDiameter(newDiameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER,
					newDiameter, newDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDiameterProp() {
		return diameterProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiameterProp(DoubleBaseType newDiameterProp, NotificationChain msgs) {
		DoubleBaseType oldDiameterProp = diameterProp;
		diameterProp = newDiameterProp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP, oldDiameterProp, newDiameterProp);
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
	public void setDiameterProp(DoubleBaseType newDiameterProp) {
		if (newDiameterProp != diameterProp) {
			NotificationChain msgs = null;
			if (diameterProp != null)
				msgs = ((InternalEObject) diameterProp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP, null, msgs);
			if (newDiameterProp != null)
				msgs = ((InternalEObject) newDiameterProp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP, null, msgs);
			msgs = basicSetDiameterProp(newDiameterProp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP,
					newDiameterProp, newDiameterProp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getChordlength() {
		return chordlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChordlength(DoubleBaseType newChordlength, NotificationChain msgs) {
		DoubleBaseType oldChordlength = chordlength;
		chordlength = newChordlength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH, oldChordlength, newChordlength);
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
	public void setChordlength(DoubleBaseType newChordlength) {
		if (newChordlength != chordlength) {
			NotificationChain msgs = null;
			if (chordlength != null)
				msgs = ((InternalEObject) chordlength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH, null, msgs);
			if (newChordlength != null)
				msgs = ((InternalEObject) newChordlength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH, null, msgs);
			msgs = basicSetChordlength(newChordlength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH,
					newChordlength, newChordlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineFanType getFan() {
		return fan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFan(EngineFanType newFan, NotificationChain msgs) {
		EngineFanType oldFan = fan;
		fan = newFan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN, oldFan, newFan);
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
	public void setFan(EngineFanType newFan) {
		if (newFan != fan) {
			NotificationChain msgs = null;
			if (fan != null)
				msgs = ((InternalEObject) fan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN, null, msgs);
			if (newFan != null)
				msgs = ((InternalEObject) newFan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN, null, msgs);
			msgs = basicSetFan(newFan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN, newFan,
					newFan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineSpinnerType getSpinner() {
		return spinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpinner(EngineSpinnerType newSpinner, NotificationChain msgs) {
		EngineSpinnerType oldSpinner = spinner;
		spinner = newSpinner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER, oldSpinner, newSpinner);
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
	public void setSpinner(EngineSpinnerType newSpinner) {
		if (newSpinner != spinner) {
			NotificationChain msgs = null;
			if (spinner != null)
				msgs = ((InternalEObject) spinner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER, null, msgs);
			if (newSpinner != null)
				msgs = ((InternalEObject) newSpinner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER, null, msgs);
			msgs = basicSetSpinner(newSpinner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER,
					newSpinner, newSpinner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineMountsType getEngineMounts() {
		return engineMounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineMounts(EngineMountsType newEngineMounts, NotificationChain msgs) {
		EngineMountsType oldEngineMounts = engineMounts;
		engineMounts = newEngineMounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS, oldEngineMounts, newEngineMounts);
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
	public void setEngineMounts(EngineMountsType newEngineMounts) {
		if (newEngineMounts != engineMounts) {
			NotificationChain msgs = null;
			if (engineMounts != null)
				msgs = ((InternalEObject) engineMounts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS, null, msgs);
			if (newEngineMounts != null)
				msgs = ((InternalEObject) newEngineMounts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS, null, msgs);
			msgs = basicSetEngineMounts(newEngineMounts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS,
					newEngineMounts, newEngineMounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinerType getLiner() {
		return liner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiner(LinerType newLiner, NotificationChain msgs) {
		LinerType oldLiner = liner;
		liner = newLiner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER, oldLiner, newLiner);
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
	public void setLiner(LinerType newLiner) {
		if (newLiner != liner) {
			NotificationChain msgs = null;
			if (liner != null)
				msgs = ((InternalEObject) liner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER, null, msgs);
			if (newLiner != null)
				msgs = ((InternalEObject) newLiner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER, null, msgs);
			msgs = basicSetLiner(newLiner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER, newLiner,
					newLiner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER:
			return basicSetDiameter(null, msgs);
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP:
			return basicSetDiameterProp(null, msgs);
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH:
			return basicSetChordlength(null, msgs);
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN:
			return basicSetFan(null, msgs);
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER:
			return basicSetSpinner(null, msgs);
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS:
			return basicSetEngineMounts(null, msgs);
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER:
			return basicSetLiner(null, msgs);
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
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER:
			return getDiameter();
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP:
			return getDiameterProp();
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH:
			return getChordlength();
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN:
			return getFan();
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER:
			return getSpinner();
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS:
			return getEngineMounts();
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER:
			return getLiner();
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
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER:
			setDiameter((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP:
			setDiameterProp((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH:
			setChordlength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN:
			setFan((EngineFanType) newValue);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER:
			setSpinner((EngineSpinnerType) newValue);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS:
			setEngineMounts((EngineMountsType) newValue);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER:
			setLiner((LinerType) newValue);
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
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER:
			setDiameter((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP:
			setDiameterProp((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH:
			setChordlength((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN:
			setFan((EngineFanType) null);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER:
			setSpinner((EngineSpinnerType) null);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS:
			setEngineMounts((EngineMountsType) null);
			return;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER:
			setLiner((LinerType) null);
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
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER:
			return diameter != null;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__DIAMETER_PROP:
			return diameterProp != null;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__CHORDLENGTH:
			return chordlength != null;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__FAN:
			return fan != null;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__SPINNER:
			return spinner != null;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__ENGINE_MOUNTS:
			return engineMounts != null;
		case CpacsPackage.ENGINE_GEOMETRY_TYPE__LINER:
			return liner != null;
		}
		return super.eIsSet(featureID);
	}

} //EngineGeometryTypeImpl
