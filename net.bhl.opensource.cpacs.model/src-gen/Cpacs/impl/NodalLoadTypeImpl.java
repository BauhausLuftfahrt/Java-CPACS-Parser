/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadBreakdownType;
import Cpacs.NodalLoadType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodal Load Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getFx <em>Fx</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getFy <em>Fy</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getFz <em>Fz</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getMx <em>Mx</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getMy <em>My</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getMz <em>Mz</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getLoadBreakdown <em>Load Breakdown</em>}</li>
 *   <li>{@link Cpacs.impl.NodalLoadTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodalLoadTypeImpl extends ComplexBaseTypeImpl implements NodalLoadType {
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
	 * The cached value of the '{@link #getParentUID() <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType parentUID;

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
	 * The cached value of the '{@link #getLoadBreakdown() <em>Load Breakdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBreakdown()
	 * @generated
	 * @ordered
	 */
	protected LoadBreakdownType loadBreakdown;

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
	protected NodalLoadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNodalLoadType();
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
					CpacsPackage.NODAL_LOAD_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__NAME, newName,
					newName));
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
					CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getParentUID() {
		return parentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentUID(StringUIDBaseType newParentUID, NotificationChain msgs) {
		StringUIDBaseType oldParentUID = parentUID;
		parentUID = newParentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
	public void setParentUID(StringUIDBaseType newParentUID) {
		if (newParentUID != parentUID) {
			NotificationChain msgs = null;
			if (parentUID != null)
				msgs = ((InternalEObject) parentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID,
					newParentUID, newParentUID));
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
					CpacsPackage.NODAL_LOAD_TYPE__FX, oldFx, newFx);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__FX, null, msgs);
			if (newFx != null)
				msgs = ((InternalEObject) newFx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__FX, null, msgs);
			msgs = basicSetFx(newFx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__FX, newFx, newFx));
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
					CpacsPackage.NODAL_LOAD_TYPE__FY, oldFy, newFy);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__FY, null, msgs);
			if (newFy != null)
				msgs = ((InternalEObject) newFy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__FY, null, msgs);
			msgs = basicSetFy(newFy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__FY, newFy, newFy));
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
					CpacsPackage.NODAL_LOAD_TYPE__FZ, oldFz, newFz);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__FZ, null, msgs);
			if (newFz != null)
				msgs = ((InternalEObject) newFz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__FZ, null, msgs);
			msgs = basicSetFz(newFz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__FZ, newFz, newFz));
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
					CpacsPackage.NODAL_LOAD_TYPE__MX, oldMx, newMx);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__MX, null, msgs);
			if (newMx != null)
				msgs = ((InternalEObject) newMx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__MX, null, msgs);
			msgs = basicSetMx(newMx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__MX, newMx, newMx));
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
					CpacsPackage.NODAL_LOAD_TYPE__MY, oldMy, newMy);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__MY, null, msgs);
			if (newMy != null)
				msgs = ((InternalEObject) newMy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__MY, null, msgs);
			msgs = basicSetMy(newMy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__MY, newMy, newMy));
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
					CpacsPackage.NODAL_LOAD_TYPE__MZ, oldMz, newMz);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__MZ, null, msgs);
			if (newMz != null)
				msgs = ((InternalEObject) newMz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__MZ, null, msgs);
			msgs = basicSetMz(newMz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__MZ, newMz, newMz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBreakdownType getLoadBreakdown() {
		return loadBreakdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadBreakdown(LoadBreakdownType newLoadBreakdown, NotificationChain msgs) {
		LoadBreakdownType oldLoadBreakdown = loadBreakdown;
		loadBreakdown = newLoadBreakdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN, oldLoadBreakdown, newLoadBreakdown);
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
	public void setLoadBreakdown(LoadBreakdownType newLoadBreakdown) {
		if (newLoadBreakdown != loadBreakdown) {
			NotificationChain msgs = null;
			if (loadBreakdown != null)
				msgs = ((InternalEObject) loadBreakdown).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN, null, msgs);
			if (newLoadBreakdown != null)
				msgs = ((InternalEObject) newLoadBreakdown).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN, null, msgs);
			msgs = basicSetLoadBreakdown(newLoadBreakdown, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN,
					newLoadBreakdown, newLoadBreakdown));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NODAL_LOAD_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NODAL_LOAD_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__FX:
			return basicSetFx(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__FY:
			return basicSetFy(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__FZ:
			return basicSetFz(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__MX:
			return basicSetMx(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__MY:
			return basicSetMy(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__MZ:
			return basicSetMz(null, msgs);
		case CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN:
			return basicSetLoadBreakdown(null, msgs);
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
		case CpacsPackage.NODAL_LOAD_TYPE__NAME:
			return getName();
		case CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.NODAL_LOAD_TYPE__FX:
			return getFx();
		case CpacsPackage.NODAL_LOAD_TYPE__FY:
			return getFy();
		case CpacsPackage.NODAL_LOAD_TYPE__FZ:
			return getFz();
		case CpacsPackage.NODAL_LOAD_TYPE__MX:
			return getMx();
		case CpacsPackage.NODAL_LOAD_TYPE__MY:
			return getMy();
		case CpacsPackage.NODAL_LOAD_TYPE__MZ:
			return getMz();
		case CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN:
			return getLoadBreakdown();
		case CpacsPackage.NODAL_LOAD_TYPE__UID:
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
		case CpacsPackage.NODAL_LOAD_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__FX:
			setFx((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__FY:
			setFy((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__FZ:
			setFz((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__MX:
			setMx((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__MY:
			setMy((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__MZ:
			setMz((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN:
			setLoadBreakdown((LoadBreakdownType) newValue);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__UID:
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
		case CpacsPackage.NODAL_LOAD_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__FX:
			setFx((StringVectorBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__FY:
			setFy((StringVectorBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__FZ:
			setFz((StringVectorBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__MX:
			setMx((StringVectorBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__MY:
			setMy((StringVectorBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__MZ:
			setMz((StringVectorBaseType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN:
			setLoadBreakdown((LoadBreakdownType) null);
			return;
		case CpacsPackage.NODAL_LOAD_TYPE__UID:
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
		case CpacsPackage.NODAL_LOAD_TYPE__NAME:
			return name != null;
		case CpacsPackage.NODAL_LOAD_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.NODAL_LOAD_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.NODAL_LOAD_TYPE__FX:
			return fx != null;
		case CpacsPackage.NODAL_LOAD_TYPE__FY:
			return fy != null;
		case CpacsPackage.NODAL_LOAD_TYPE__FZ:
			return fz != null;
		case CpacsPackage.NODAL_LOAD_TYPE__MX:
			return mx != null;
		case CpacsPackage.NODAL_LOAD_TYPE__MY:
			return my != null;
		case CpacsPackage.NODAL_LOAD_TYPE__MZ:
			return mz != null;
		case CpacsPackage.NODAL_LOAD_TYPE__LOAD_BREAKDOWN:
			return loadBreakdown != null;
		case CpacsPackage.NODAL_LOAD_TYPE__UID:
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

} //NodalLoadTypeImpl
