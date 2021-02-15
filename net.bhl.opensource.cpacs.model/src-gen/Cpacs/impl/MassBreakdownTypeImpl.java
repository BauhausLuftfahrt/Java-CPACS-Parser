/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DesignMassesType;
import Cpacs.MFuelType;
import Cpacs.MPayloadType;
import Cpacs.MassBreakdownType;
import Cpacs.OEMType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass Breakdown Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MassBreakdownTypeImpl#getDesignMasses <em>Design Masses</em>}</li>
 *   <li>{@link Cpacs.impl.MassBreakdownTypeImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link Cpacs.impl.MassBreakdownTypeImpl#getFuel <em>Fuel</em>}</li>
 *   <li>{@link Cpacs.impl.MassBreakdownTypeImpl#getMOEM <em>MOEM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MassBreakdownTypeImpl extends ComplexBaseTypeImpl implements MassBreakdownType {
	/**
	 * The cached value of the '{@link #getDesignMasses() <em>Design Masses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignMasses()
	 * @generated
	 * @ordered
	 */
	protected DesignMassesType designMasses;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected MPayloadType payload;

	/**
	 * The cached value of the '{@link #getFuel() <em>Fuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuel()
	 * @generated
	 * @ordered
	 */
	protected MFuelType fuel;

	/**
	 * The cached value of the '{@link #getMOEM() <em>MOEM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOEM()
	 * @generated
	 * @ordered
	 */
	protected OEMType mOEM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MassBreakdownTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMassBreakdownType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignMassesType getDesignMasses() {
		return designMasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignMasses(DesignMassesType newDesignMasses, NotificationChain msgs) {
		DesignMassesType oldDesignMasses = designMasses;
		designMasses = newDesignMasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES, oldDesignMasses, newDesignMasses);
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
	public void setDesignMasses(DesignMassesType newDesignMasses) {
		if (newDesignMasses != designMasses) {
			NotificationChain msgs = null;
			if (designMasses != null)
				msgs = ((InternalEObject) designMasses).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES, null, msgs);
			if (newDesignMasses != null)
				msgs = ((InternalEObject) newDesignMasses).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES, null, msgs);
			msgs = basicSetDesignMasses(newDesignMasses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES,
					newDesignMasses, newDesignMasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPayloadType getPayload() {
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayload(MPayloadType newPayload, NotificationChain msgs) {
		MPayloadType oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD, oldPayload, newPayload);
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
	public void setPayload(MPayloadType newPayload) {
		if (newPayload != payload) {
			NotificationChain msgs = null;
			if (payload != null)
				msgs = ((InternalEObject) payload).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD, null, msgs);
			if (newPayload != null)
				msgs = ((InternalEObject) newPayload).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD, null, msgs);
			msgs = basicSetPayload(newPayload, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD, newPayload,
					newPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFuelType getFuel() {
		return fuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuel(MFuelType newFuel, NotificationChain msgs) {
		MFuelType oldFuel = fuel;
		fuel = newFuel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL, oldFuel, newFuel);
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
	public void setFuel(MFuelType newFuel) {
		if (newFuel != fuel) {
			NotificationChain msgs = null;
			if (fuel != null)
				msgs = ((InternalEObject) fuel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL, null, msgs);
			if (newFuel != null)
				msgs = ((InternalEObject) newFuel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL, null, msgs);
			msgs = basicSetFuel(newFuel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL, newFuel,
					newFuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OEMType getMOEM() {
		return mOEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMOEM(OEMType newMOEM, NotificationChain msgs) {
		OEMType oldMOEM = mOEM;
		mOEM = newMOEM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM, oldMOEM, newMOEM);
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
	public void setMOEM(OEMType newMOEM) {
		if (newMOEM != mOEM) {
			NotificationChain msgs = null;
			if (mOEM != null)
				msgs = ((InternalEObject) mOEM).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM, null, msgs);
			if (newMOEM != null)
				msgs = ((InternalEObject) newMOEM).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM, null, msgs);
			msgs = basicSetMOEM(newMOEM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM, newMOEM,
					newMOEM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES:
			return basicSetDesignMasses(null, msgs);
		case CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD:
			return basicSetPayload(null, msgs);
		case CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL:
			return basicSetFuel(null, msgs);
		case CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM:
			return basicSetMOEM(null, msgs);
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
		case CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES:
			return getDesignMasses();
		case CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD:
			return getPayload();
		case CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL:
			return getFuel();
		case CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM:
			return getMOEM();
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
		case CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES:
			setDesignMasses((DesignMassesType) newValue);
			return;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD:
			setPayload((MPayloadType) newValue);
			return;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL:
			setFuel((MFuelType) newValue);
			return;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM:
			setMOEM((OEMType) newValue);
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
		case CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES:
			setDesignMasses((DesignMassesType) null);
			return;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD:
			setPayload((MPayloadType) null);
			return;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL:
			setFuel((MFuelType) null);
			return;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM:
			setMOEM((OEMType) null);
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
		case CpacsPackage.MASS_BREAKDOWN_TYPE__DESIGN_MASSES:
			return designMasses != null;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__PAYLOAD:
			return payload != null;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__FUEL:
			return fuel != null;
		case CpacsPackage.MASS_BREAKDOWN_TYPE__MOEM:
			return mOEM != null;
		}
		return super.eIsSet(featureID);
	}

} //MassBreakdownTypeImpl
