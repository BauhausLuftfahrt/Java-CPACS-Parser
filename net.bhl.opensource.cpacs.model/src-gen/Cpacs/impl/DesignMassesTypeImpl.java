/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DesignMassesType;
import Cpacs.GenericMassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Masses Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DesignMassesTypeImpl#getMTOM <em>MTOM</em>}</li>
 *   <li>{@link Cpacs.impl.DesignMassesTypeImpl#getMZFM <em>MZFM</em>}</li>
 *   <li>{@link Cpacs.impl.DesignMassesTypeImpl#getMMLM <em>MMLM</em>}</li>
 *   <li>{@link Cpacs.impl.DesignMassesTypeImpl#getMMRM <em>MMRM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignMassesTypeImpl extends ComplexBaseTypeImpl implements DesignMassesType {
	/**
	 * The cached value of the '{@link #getMTOM() <em>MTOM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTOM()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType mTOM;

	/**
	 * The cached value of the '{@link #getMZFM() <em>MZFM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMZFM()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType mZFM;

	/**
	 * The cached value of the '{@link #getMMLM() <em>MMLM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMLM()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType mMLM;

	/**
	 * The cached value of the '{@link #getMMRM() <em>MMRM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMRM()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType mMRM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignMassesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDesignMassesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMTOM() {
		return mTOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTOM(GenericMassType newMTOM, NotificationChain msgs) {
		GenericMassType oldMTOM = mTOM;
		mTOM = newMTOM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_MASSES_TYPE__MTOM, oldMTOM, newMTOM);
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
	public void setMTOM(GenericMassType newMTOM) {
		if (newMTOM != mTOM) {
			NotificationChain msgs = null;
			if (mTOM != null)
				msgs = ((InternalEObject) mTOM).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_MASSES_TYPE__MTOM, null, msgs);
			if (newMTOM != null)
				msgs = ((InternalEObject) newMTOM).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_MASSES_TYPE__MTOM, null, msgs);
			msgs = basicSetMTOM(newMTOM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_MASSES_TYPE__MTOM, newMTOM,
					newMTOM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMZFM() {
		return mZFM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMZFM(GenericMassType newMZFM, NotificationChain msgs) {
		GenericMassType oldMZFM = mZFM;
		mZFM = newMZFM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_MASSES_TYPE__MZFM, oldMZFM, newMZFM);
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
	public void setMZFM(GenericMassType newMZFM) {
		if (newMZFM != mZFM) {
			NotificationChain msgs = null;
			if (mZFM != null)
				msgs = ((InternalEObject) mZFM).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_MASSES_TYPE__MZFM, null, msgs);
			if (newMZFM != null)
				msgs = ((InternalEObject) newMZFM).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_MASSES_TYPE__MZFM, null, msgs);
			msgs = basicSetMZFM(newMZFM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_MASSES_TYPE__MZFM, newMZFM,
					newMZFM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMMLM() {
		return mMLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMLM(GenericMassType newMMLM, NotificationChain msgs) {
		GenericMassType oldMMLM = mMLM;
		mMLM = newMMLM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_MASSES_TYPE__MMLM, oldMMLM, newMMLM);
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
	public void setMMLM(GenericMassType newMMLM) {
		if (newMMLM != mMLM) {
			NotificationChain msgs = null;
			if (mMLM != null)
				msgs = ((InternalEObject) mMLM).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_MASSES_TYPE__MMLM, null, msgs);
			if (newMMLM != null)
				msgs = ((InternalEObject) newMMLM).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_MASSES_TYPE__MMLM, null, msgs);
			msgs = basicSetMMLM(newMMLM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_MASSES_TYPE__MMLM, newMMLM,
					newMMLM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMMRM() {
		return mMRM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMRM(GenericMassType newMMRM, NotificationChain msgs) {
		GenericMassType oldMMRM = mMRM;
		mMRM = newMMRM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_MASSES_TYPE__MMRM, oldMMRM, newMMRM);
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
	public void setMMRM(GenericMassType newMMRM) {
		if (newMMRM != mMRM) {
			NotificationChain msgs = null;
			if (mMRM != null)
				msgs = ((InternalEObject) mMRM).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_MASSES_TYPE__MMRM, null, msgs);
			if (newMMRM != null)
				msgs = ((InternalEObject) newMMRM).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_MASSES_TYPE__MMRM, null, msgs);
			msgs = basicSetMMRM(newMMRM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_MASSES_TYPE__MMRM, newMMRM,
					newMMRM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DESIGN_MASSES_TYPE__MTOM:
			return basicSetMTOM(null, msgs);
		case CpacsPackage.DESIGN_MASSES_TYPE__MZFM:
			return basicSetMZFM(null, msgs);
		case CpacsPackage.DESIGN_MASSES_TYPE__MMLM:
			return basicSetMMLM(null, msgs);
		case CpacsPackage.DESIGN_MASSES_TYPE__MMRM:
			return basicSetMMRM(null, msgs);
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
		case CpacsPackage.DESIGN_MASSES_TYPE__MTOM:
			return getMTOM();
		case CpacsPackage.DESIGN_MASSES_TYPE__MZFM:
			return getMZFM();
		case CpacsPackage.DESIGN_MASSES_TYPE__MMLM:
			return getMMLM();
		case CpacsPackage.DESIGN_MASSES_TYPE__MMRM:
			return getMMRM();
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
		case CpacsPackage.DESIGN_MASSES_TYPE__MTOM:
			setMTOM((GenericMassType) newValue);
			return;
		case CpacsPackage.DESIGN_MASSES_TYPE__MZFM:
			setMZFM((GenericMassType) newValue);
			return;
		case CpacsPackage.DESIGN_MASSES_TYPE__MMLM:
			setMMLM((GenericMassType) newValue);
			return;
		case CpacsPackage.DESIGN_MASSES_TYPE__MMRM:
			setMMRM((GenericMassType) newValue);
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
		case CpacsPackage.DESIGN_MASSES_TYPE__MTOM:
			setMTOM((GenericMassType) null);
			return;
		case CpacsPackage.DESIGN_MASSES_TYPE__MZFM:
			setMZFM((GenericMassType) null);
			return;
		case CpacsPackage.DESIGN_MASSES_TYPE__MMLM:
			setMMLM((GenericMassType) null);
			return;
		case CpacsPackage.DESIGN_MASSES_TYPE__MMRM:
			setMMRM((GenericMassType) null);
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
		case CpacsPackage.DESIGN_MASSES_TYPE__MTOM:
			return mTOM != null;
		case CpacsPackage.DESIGN_MASSES_TYPE__MZFM:
			return mZFM != null;
		case CpacsPackage.DESIGN_MASSES_TYPE__MMLM:
			return mMLM != null;
		case CpacsPackage.DESIGN_MASSES_TYPE__MMRM:
			return mMRM != null;
		}
		return super.eIsSet(featureID);
	}

} //DesignMassesTypeImpl
