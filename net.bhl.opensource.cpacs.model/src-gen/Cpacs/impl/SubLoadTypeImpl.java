/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.StringVectorBaseType;
import Cpacs.SubLoadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Load Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SubLoadTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.SubLoadTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.SubLoadTypeImpl#getFx <em>Fx</em>}</li>
 *   <li>{@link Cpacs.impl.SubLoadTypeImpl#getFy <em>Fy</em>}</li>
 *   <li>{@link Cpacs.impl.SubLoadTypeImpl#getFz <em>Fz</em>}</li>
 *   <li>{@link Cpacs.impl.SubLoadTypeImpl#getMx <em>Mx</em>}</li>
 *   <li>{@link Cpacs.impl.SubLoadTypeImpl#getMy <em>My</em>}</li>
 *   <li>{@link Cpacs.impl.SubLoadTypeImpl#getMz <em>Mz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubLoadTypeImpl extends ComplexBaseTypeImpl implements SubLoadType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getFx() <em>Fx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType fx;

	/**
	 * The cached value of the '{@link #getFy() <em>Fy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFy()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType fy;

	/**
	 * The cached value of the '{@link #getFz() <em>Fz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFz()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType fz;

	/**
	 * The cached value of the '{@link #getMx() <em>Mx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMx()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mx;

	/**
	 * The cached value of the '{@link #getMy() <em>My</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMy()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType my;

	/**
	 * The cached value of the '{@link #getMz() <em>Mz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMz()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLoadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSubLoadType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUB_LOAD_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUB_LOAD_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getFx() {
		return fx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFx(StringVectorBaseType newFx, NotificationChain msgs) {
		StringVectorBaseType oldFx = fx;
		fx = newFx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUB_LOAD_TYPE__FX, oldFx, newFx);
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
	public void setFx(StringVectorBaseType newFx) {
		if (newFx != fx) {
			NotificationChain msgs = null;
			if (fx != null)
				msgs = ((InternalEObject) fx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__FX, null, msgs);
			if (newFx != null)
				msgs = ((InternalEObject) newFx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__FX, null, msgs);
			msgs = basicSetFx(newFx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUB_LOAD_TYPE__FX, newFx, newFx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getFy() {
		return fy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFy(StringVectorBaseType newFy, NotificationChain msgs) {
		StringVectorBaseType oldFy = fy;
		fy = newFy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUB_LOAD_TYPE__FY, oldFy, newFy);
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
	public void setFy(StringVectorBaseType newFy) {
		if (newFy != fy) {
			NotificationChain msgs = null;
			if (fy != null)
				msgs = ((InternalEObject) fy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__FY, null, msgs);
			if (newFy != null)
				msgs = ((InternalEObject) newFy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__FY, null, msgs);
			msgs = basicSetFy(newFy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUB_LOAD_TYPE__FY, newFy, newFy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getFz() {
		return fz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFz(StringVectorBaseType newFz, NotificationChain msgs) {
		StringVectorBaseType oldFz = fz;
		fz = newFz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUB_LOAD_TYPE__FZ, oldFz, newFz);
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
	public void setFz(StringVectorBaseType newFz) {
		if (newFz != fz) {
			NotificationChain msgs = null;
			if (fz != null)
				msgs = ((InternalEObject) fz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__FZ, null, msgs);
			if (newFz != null)
				msgs = ((InternalEObject) newFz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__FZ, null, msgs);
			msgs = basicSetFz(newFz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUB_LOAD_TYPE__FZ, newFz, newFz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMx() {
		return mx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMx(StringVectorBaseType newMx, NotificationChain msgs) {
		StringVectorBaseType oldMx = mx;
		mx = newMx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUB_LOAD_TYPE__MX, oldMx, newMx);
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
	public void setMx(StringVectorBaseType newMx) {
		if (newMx != mx) {
			NotificationChain msgs = null;
			if (mx != null)
				msgs = ((InternalEObject) mx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__MX, null, msgs);
			if (newMx != null)
				msgs = ((InternalEObject) newMx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__MX, null, msgs);
			msgs = basicSetMx(newMx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUB_LOAD_TYPE__MX, newMx, newMx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMy() {
		return my;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMy(StringVectorBaseType newMy, NotificationChain msgs) {
		StringVectorBaseType oldMy = my;
		my = newMy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUB_LOAD_TYPE__MY, oldMy, newMy);
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
	public void setMy(StringVectorBaseType newMy) {
		if (newMy != my) {
			NotificationChain msgs = null;
			if (my != null)
				msgs = ((InternalEObject) my).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__MY, null, msgs);
			if (newMy != null)
				msgs = ((InternalEObject) newMy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__MY, null, msgs);
			msgs = basicSetMy(newMy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUB_LOAD_TYPE__MY, newMy, newMy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMz() {
		return mz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMz(StringVectorBaseType newMz, NotificationChain msgs) {
		StringVectorBaseType oldMz = mz;
		mz = newMz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUB_LOAD_TYPE__MZ, oldMz, newMz);
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
	public void setMz(StringVectorBaseType newMz) {
		if (newMz != mz) {
			NotificationChain msgs = null;
			if (mz != null)
				msgs = ((InternalEObject) mz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__MZ, null, msgs);
			if (newMz != null)
				msgs = ((InternalEObject) newMz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUB_LOAD_TYPE__MZ, null, msgs);
			msgs = basicSetMz(newMz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUB_LOAD_TYPE__MZ, newMz, newMz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SUB_LOAD_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.SUB_LOAD_TYPE__FX:
			return basicSetFx(null, msgs);
		case CpacsPackage.SUB_LOAD_TYPE__FY:
			return basicSetFy(null, msgs);
		case CpacsPackage.SUB_LOAD_TYPE__FZ:
			return basicSetFz(null, msgs);
		case CpacsPackage.SUB_LOAD_TYPE__MX:
			return basicSetMx(null, msgs);
		case CpacsPackage.SUB_LOAD_TYPE__MY:
			return basicSetMy(null, msgs);
		case CpacsPackage.SUB_LOAD_TYPE__MZ:
			return basicSetMz(null, msgs);
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
		case CpacsPackage.SUB_LOAD_TYPE__NAME:
			return getName();
		case CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.SUB_LOAD_TYPE__FX:
			return getFx();
		case CpacsPackage.SUB_LOAD_TYPE__FY:
			return getFy();
		case CpacsPackage.SUB_LOAD_TYPE__FZ:
			return getFz();
		case CpacsPackage.SUB_LOAD_TYPE__MX:
			return getMx();
		case CpacsPackage.SUB_LOAD_TYPE__MY:
			return getMy();
		case CpacsPackage.SUB_LOAD_TYPE__MZ:
			return getMz();
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
		case CpacsPackage.SUB_LOAD_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__FX:
			setFx((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__FY:
			setFy((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__FZ:
			setFz((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__MX:
			setMx((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__MY:
			setMy((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__MZ:
			setMz((StringVectorBaseType) newValue);
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
		case CpacsPackage.SUB_LOAD_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__FX:
			setFx((StringVectorBaseType) null);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__FY:
			setFy((StringVectorBaseType) null);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__FZ:
			setFz((StringVectorBaseType) null);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__MX:
			setMx((StringVectorBaseType) null);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__MY:
			setMy((StringVectorBaseType) null);
			return;
		case CpacsPackage.SUB_LOAD_TYPE__MZ:
			setMz((StringVectorBaseType) null);
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
		case CpacsPackage.SUB_LOAD_TYPE__NAME:
			return name != null;
		case CpacsPackage.SUB_LOAD_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.SUB_LOAD_TYPE__FX:
			return fx != null;
		case CpacsPackage.SUB_LOAD_TYPE__FY:
			return fy != null;
		case CpacsPackage.SUB_LOAD_TYPE__FZ:
			return fz != null;
		case CpacsPackage.SUB_LOAD_TYPE__MX:
			return mx != null;
		case CpacsPackage.SUB_LOAD_TYPE__MY:
			return my != null;
		case CpacsPackage.SUB_LOAD_TYPE__MZ:
			return mz != null;
		}
		return super.eIsSet(featureID);
	}

} //SubLoadTypeImpl
