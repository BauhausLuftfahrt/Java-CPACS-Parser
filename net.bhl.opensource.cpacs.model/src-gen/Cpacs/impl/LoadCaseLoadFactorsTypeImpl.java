/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LoadCaseLoadFactorsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Load Factors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseLoadFactorsTypeImpl#getNX <em>NX</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseLoadFactorsTypeImpl#getNY <em>NY</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseLoadFactorsTypeImpl#getNZ <em>NZ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseLoadFactorsTypeImpl extends ComplexBaseTypeImpl implements LoadCaseLoadFactorsType {
	/**
	 * The cached value of the '{@link #getNX() <em>NX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nX;

	/**
	 * The cached value of the '{@link #getNY() <em>NY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nY;

	/**
	 * The cached value of the '{@link #getNZ() <em>NZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nZ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseLoadFactorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseLoadFactorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNX() {
		return nX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNX(DoubleBaseType newNX, NotificationChain msgs) {
		DoubleBaseType oldNX = nX;
		nX = newNX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX, oldNX, newNX);
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
	public void setNX(DoubleBaseType newNX) {
		if (newNX != nX) {
			NotificationChain msgs = null;
			if (nX != null)
				msgs = ((InternalEObject) nX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX, null, msgs);
			if (newNX != null)
				msgs = ((InternalEObject) newNX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX, null, msgs);
			msgs = basicSetNX(newNX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX, newNX,
					newNX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNY() {
		return nY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNY(DoubleBaseType newNY, NotificationChain msgs) {
		DoubleBaseType oldNY = nY;
		nY = newNY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY, oldNY, newNY);
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
	public void setNY(DoubleBaseType newNY) {
		if (newNY != nY) {
			NotificationChain msgs = null;
			if (nY != null)
				msgs = ((InternalEObject) nY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY, null, msgs);
			if (newNY != null)
				msgs = ((InternalEObject) newNY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY, null, msgs);
			msgs = basicSetNY(newNY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY, newNY,
					newNY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNZ() {
		return nZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNZ(DoubleBaseType newNZ, NotificationChain msgs) {
		DoubleBaseType oldNZ = nZ;
		nZ = newNZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ, oldNZ, newNZ);
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
	public void setNZ(DoubleBaseType newNZ) {
		if (newNZ != nZ) {
			NotificationChain msgs = null;
			if (nZ != null)
				msgs = ((InternalEObject) nZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ, null, msgs);
			if (newNZ != null)
				msgs = ((InternalEObject) newNZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ, null, msgs);
			msgs = basicSetNZ(newNZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ, newNZ,
					newNZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX:
			return basicSetNX(null, msgs);
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY:
			return basicSetNY(null, msgs);
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ:
			return basicSetNZ(null, msgs);
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
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX:
			return getNX();
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY:
			return getNY();
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ:
			return getNZ();
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
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX:
			setNX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY:
			setNY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ:
			setNZ((DoubleBaseType) newValue);
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
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX:
			setNX((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY:
			setNY((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ:
			setNZ((DoubleBaseType) null);
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
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NX:
			return nX != null;
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NY:
			return nY != null;
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE__NZ:
			return nZ != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseLoadFactorsTypeImpl
