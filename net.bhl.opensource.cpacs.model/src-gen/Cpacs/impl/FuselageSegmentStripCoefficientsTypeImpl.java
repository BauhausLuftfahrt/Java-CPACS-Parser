/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FuselageSegmentStripCoefficientsType;
import Cpacs.LoadReferenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselage Segment Strip Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageSegmentStripCoefficientsTypeImpl#getCfx <em>Cfx</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentStripCoefficientsTypeImpl#getCfy <em>Cfy</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentStripCoefficientsTypeImpl#getCfz <em>Cfz</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentStripCoefficientsTypeImpl#getCmx <em>Cmx</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentStripCoefficientsTypeImpl#getCmy <em>Cmy</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentStripCoefficientsTypeImpl#getCmz <em>Cmz</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentStripCoefficientsTypeImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageSegmentStripCoefficientsTypeImpl extends ComplexBaseTypeImpl
		implements FuselageSegmentStripCoefficientsType {
	/**
	 * The cached value of the '{@link #getCfx() <em>Cfx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfx()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cfx;

	/**
	 * The cached value of the '{@link #getCfy() <em>Cfy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfy()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cfy;

	/**
	 * The cached value of the '{@link #getCfz() <em>Cfz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfz()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cfz;

	/**
	 * The cached value of the '{@link #getCmx() <em>Cmx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmx()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cmx;

	/**
	 * The cached value of the '{@link #getCmy() <em>Cmy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmy()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cmy;

	/**
	 * The cached value of the '{@link #getCmz() <em>Cmz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmz()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cmz;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected LoadReferenceType reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuselageSegmentStripCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageSegmentStripCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCfx() {
		return cfx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfx(DoubleBaseType newCfx, NotificationChain msgs) {
		DoubleBaseType oldCfx = cfx;
		cfx = newCfx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX, oldCfx, newCfx);
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
	public void setCfx(DoubleBaseType newCfx) {
		if (newCfx != cfx) {
			NotificationChain msgs = null;
			if (cfx != null)
				msgs = ((InternalEObject) cfx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX, null,
						msgs);
			if (newCfx != null)
				msgs = ((InternalEObject) newCfx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX, null,
						msgs);
			msgs = basicSetCfx(newCfx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX, newCfx, newCfx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCfy() {
		return cfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfy(DoubleBaseType newCfy, NotificationChain msgs) {
		DoubleBaseType oldCfy = cfy;
		cfy = newCfy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY, oldCfy, newCfy);
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
	public void setCfy(DoubleBaseType newCfy) {
		if (newCfy != cfy) {
			NotificationChain msgs = null;
			if (cfy != null)
				msgs = ((InternalEObject) cfy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY, null,
						msgs);
			if (newCfy != null)
				msgs = ((InternalEObject) newCfy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY, null,
						msgs);
			msgs = basicSetCfy(newCfy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY, newCfy, newCfy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCfz() {
		return cfz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfz(DoubleBaseType newCfz, NotificationChain msgs) {
		DoubleBaseType oldCfz = cfz;
		cfz = newCfz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ, oldCfz, newCfz);
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
	public void setCfz(DoubleBaseType newCfz) {
		if (newCfz != cfz) {
			NotificationChain msgs = null;
			if (cfz != null)
				msgs = ((InternalEObject) cfz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ, null,
						msgs);
			if (newCfz != null)
				msgs = ((InternalEObject) newCfz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ, null,
						msgs);
			msgs = basicSetCfz(newCfz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ, newCfz, newCfz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCmx() {
		return cmx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmx(DoubleBaseType newCmx, NotificationChain msgs) {
		DoubleBaseType oldCmx = cmx;
		cmx = newCmx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX, oldCmx, newCmx);
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
	public void setCmx(DoubleBaseType newCmx) {
		if (newCmx != cmx) {
			NotificationChain msgs = null;
			if (cmx != null)
				msgs = ((InternalEObject) cmx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX, null,
						msgs);
			if (newCmx != null)
				msgs = ((InternalEObject) newCmx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX, null,
						msgs);
			msgs = basicSetCmx(newCmx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX, newCmx, newCmx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCmy() {
		return cmy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmy(DoubleBaseType newCmy, NotificationChain msgs) {
		DoubleBaseType oldCmy = cmy;
		cmy = newCmy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY, oldCmy, newCmy);
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
	public void setCmy(DoubleBaseType newCmy) {
		if (newCmy != cmy) {
			NotificationChain msgs = null;
			if (cmy != null)
				msgs = ((InternalEObject) cmy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY, null,
						msgs);
			if (newCmy != null)
				msgs = ((InternalEObject) newCmy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY, null,
						msgs);
			msgs = basicSetCmy(newCmy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY, newCmy, newCmy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCmz() {
		return cmz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmz(DoubleBaseType newCmz, NotificationChain msgs) {
		DoubleBaseType oldCmz = cmz;
		cmz = newCmz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ, oldCmz, newCmz);
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
	public void setCmz(DoubleBaseType newCmz) {
		if (newCmz != cmz) {
			NotificationChain msgs = null;
			if (cmz != null)
				msgs = ((InternalEObject) cmz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ, null,
						msgs);
			if (newCmz != null)
				msgs = ((InternalEObject) newCmz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ, null,
						msgs);
			msgs = basicSetCmz(newCmz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ, newCmz, newCmz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadReferenceType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(LoadReferenceType newReference, NotificationChain msgs) {
		LoadReferenceType oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE, oldReference, newReference);
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
	public void setReference(LoadReferenceType newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject) reference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE, null,
						msgs);
			if (newReference != null)
				msgs = ((InternalEObject) newReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE, null,
						msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX:
			return basicSetCfx(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY:
			return basicSetCfy(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ:
			return basicSetCfz(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX:
			return basicSetCmx(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY:
			return basicSetCmy(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ:
			return basicSetCmz(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE:
			return basicSetReference(null, msgs);
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
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX:
			return getCfx();
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY:
			return getCfy();
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ:
			return getCfz();
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX:
			return getCmx();
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY:
			return getCmy();
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ:
			return getCmz();
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE:
			return getReference();
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
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX:
			setCfx((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY:
			setCfy((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ:
			setCfz((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX:
			setCmx((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY:
			setCmy((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ:
			setCmz((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE:
			setReference((LoadReferenceType) newValue);
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
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX:
			setCfx((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY:
			setCfy((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ:
			setCfz((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX:
			setCmx((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY:
			setCmy((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ:
			setCmz((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE:
			setReference((LoadReferenceType) null);
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
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFX:
			return cfx != null;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFY:
			return cfy != null;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CFZ:
			return cfz != null;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMX:
			return cmx != null;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMY:
			return cmy != null;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__CMZ:
			return cmz != null;
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE__REFERENCE:
			return reference != null;
		}
		return super.eIsSet(featureID);
	}

} //FuselageSegmentStripCoefficientsTypeImpl
