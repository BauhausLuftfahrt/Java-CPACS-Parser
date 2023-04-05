/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleVectorBaseType;
import Cpacs.LoadBreakdownType;
import Cpacs.LoadSetType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getPointSetUID <em>Point Set UID</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getFx <em>Fx</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getFy <em>Fy</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getFz <em>Fz</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getMx <em>Mx</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getMy <em>My</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getMz <em>Mz</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getDy <em>Dy</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getDz <em>Dz</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getPhix <em>Phix</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getPhiy <em>Phiy</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getPhiz <em>Phiz</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getLoadBreakdown <em>Load Breakdown</em>}</li>
 *   <li>{@link Cpacs.impl.LoadSetTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadSetTypeImpl extends ComplexBaseTypeImpl implements LoadSetType {
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
	 * The cached value of the '{@link #getPointSetUID() <em>Point Set UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSetUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType pointSetUID;

	/**
	 * The cached value of the '{@link #getFx() <em>Fx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType fx;

	/**
	 * The cached value of the '{@link #getFy() <em>Fy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFy()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType fy;

	/**
	 * The cached value of the '{@link #getFz() <em>Fz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFz()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType fz;

	/**
	 * The cached value of the '{@link #getMx() <em>Mx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMx()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType mx;

	/**
	 * The cached value of the '{@link #getMy() <em>My</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMy()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType my;

	/**
	 * The cached value of the '{@link #getMz() <em>Mz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMz()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType mz;

	/**
	 * The cached value of the '{@link #getDx() <em>Dx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dx;

	/**
	 * The cached value of the '{@link #getDy() <em>Dy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dy;

	/**
	 * The cached value of the '{@link #getDz() <em>Dz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDz()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dz;

	/**
	 * The cached value of the '{@link #getPhix() <em>Phix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhix()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType phix;

	/**
	 * The cached value of the '{@link #getPhiy() <em>Phiy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhiy()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType phiy;

	/**
	 * The cached value of the '{@link #getPhiz() <em>Phiz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhiz()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType phiz;

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
	protected LoadSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadSetType();
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
					CpacsPackage.LOAD_SET_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPointSetUID() {
		return pointSetUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointSetUID(StringUIDBaseType newPointSetUID, NotificationChain msgs) {
		StringUIDBaseType oldPointSetUID = pointSetUID;
		pointSetUID = newPointSetUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID, oldPointSetUID, newPointSetUID);
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
	public void setPointSetUID(StringUIDBaseType newPointSetUID) {
		if (newPointSetUID != pointSetUID) {
			NotificationChain msgs = null;
			if (pointSetUID != null)
				msgs = ((InternalEObject) pointSetUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID, null, msgs);
			if (newPointSetUID != null)
				msgs = ((InternalEObject) newPointSetUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID, null, msgs);
			msgs = basicSetPointSetUID(newPointSetUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID,
					newPointSetUID, newPointSetUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getFx() {
		return fx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFx(DoubleVectorBaseType newFx, NotificationChain msgs) {
		DoubleVectorBaseType oldFx = fx;
		fx = newFx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__FX, oldFx, newFx);
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
	public void setFx(DoubleVectorBaseType newFx) {
		if (newFx != fx) {
			NotificationChain msgs = null;
			if (fx != null)
				msgs = ((InternalEObject) fx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__FX, null, msgs);
			if (newFx != null)
				msgs = ((InternalEObject) newFx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__FX, null, msgs);
			msgs = basicSetFx(newFx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__FX, newFx, newFx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getFy() {
		return fy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFy(DoubleVectorBaseType newFy, NotificationChain msgs) {
		DoubleVectorBaseType oldFy = fy;
		fy = newFy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__FY, oldFy, newFy);
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
	public void setFy(DoubleVectorBaseType newFy) {
		if (newFy != fy) {
			NotificationChain msgs = null;
			if (fy != null)
				msgs = ((InternalEObject) fy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__FY, null, msgs);
			if (newFy != null)
				msgs = ((InternalEObject) newFy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__FY, null, msgs);
			msgs = basicSetFy(newFy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__FY, newFy, newFy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getFz() {
		return fz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFz(DoubleVectorBaseType newFz, NotificationChain msgs) {
		DoubleVectorBaseType oldFz = fz;
		fz = newFz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__FZ, oldFz, newFz);
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
	public void setFz(DoubleVectorBaseType newFz) {
		if (newFz != fz) {
			NotificationChain msgs = null;
			if (fz != null)
				msgs = ((InternalEObject) fz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__FZ, null, msgs);
			if (newFz != null)
				msgs = ((InternalEObject) newFz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__FZ, null, msgs);
			msgs = basicSetFz(newFz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__FZ, newFz, newFz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getMx() {
		return mx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMx(DoubleVectorBaseType newMx, NotificationChain msgs) {
		DoubleVectorBaseType oldMx = mx;
		mx = newMx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__MX, oldMx, newMx);
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
	public void setMx(DoubleVectorBaseType newMx) {
		if (newMx != mx) {
			NotificationChain msgs = null;
			if (mx != null)
				msgs = ((InternalEObject) mx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__MX, null, msgs);
			if (newMx != null)
				msgs = ((InternalEObject) newMx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__MX, null, msgs);
			msgs = basicSetMx(newMx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__MX, newMx, newMx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getMy() {
		return my;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMy(DoubleVectorBaseType newMy, NotificationChain msgs) {
		DoubleVectorBaseType oldMy = my;
		my = newMy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__MY, oldMy, newMy);
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
	public void setMy(DoubleVectorBaseType newMy) {
		if (newMy != my) {
			NotificationChain msgs = null;
			if (my != null)
				msgs = ((InternalEObject) my).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__MY, null, msgs);
			if (newMy != null)
				msgs = ((InternalEObject) newMy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__MY, null, msgs);
			msgs = basicSetMy(newMy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__MY, newMy, newMy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getMz() {
		return mz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMz(DoubleVectorBaseType newMz, NotificationChain msgs) {
		DoubleVectorBaseType oldMz = mz;
		mz = newMz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__MZ, oldMz, newMz);
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
	public void setMz(DoubleVectorBaseType newMz) {
		if (newMz != mz) {
			NotificationChain msgs = null;
			if (mz != null)
				msgs = ((InternalEObject) mz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__MZ, null, msgs);
			if (newMz != null)
				msgs = ((InternalEObject) newMz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__MZ, null, msgs);
			msgs = basicSetMz(newMz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__MZ, newMz, newMz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDx() {
		return dx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDx(DoubleVectorBaseType newDx, NotificationChain msgs) {
		DoubleVectorBaseType oldDx = dx;
		dx = newDx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__DX, oldDx, newDx);
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
	public void setDx(DoubleVectorBaseType newDx) {
		if (newDx != dx) {
			NotificationChain msgs = null;
			if (dx != null)
				msgs = ((InternalEObject) dx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__DX, null, msgs);
			if (newDx != null)
				msgs = ((InternalEObject) newDx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__DX, null, msgs);
			msgs = basicSetDx(newDx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__DX, newDx, newDx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDy() {
		return dy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDy(DoubleVectorBaseType newDy, NotificationChain msgs) {
		DoubleVectorBaseType oldDy = dy;
		dy = newDy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__DY, oldDy, newDy);
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
	public void setDy(DoubleVectorBaseType newDy) {
		if (newDy != dy) {
			NotificationChain msgs = null;
			if (dy != null)
				msgs = ((InternalEObject) dy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__DY, null, msgs);
			if (newDy != null)
				msgs = ((InternalEObject) newDy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__DY, null, msgs);
			msgs = basicSetDy(newDy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__DY, newDy, newDy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDz() {
		return dz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDz(DoubleVectorBaseType newDz, NotificationChain msgs) {
		DoubleVectorBaseType oldDz = dz;
		dz = newDz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__DZ, oldDz, newDz);
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
	public void setDz(DoubleVectorBaseType newDz) {
		if (newDz != dz) {
			NotificationChain msgs = null;
			if (dz != null)
				msgs = ((InternalEObject) dz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__DZ, null, msgs);
			if (newDz != null)
				msgs = ((InternalEObject) newDz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__DZ, null, msgs);
			msgs = basicSetDz(newDz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__DZ, newDz, newDz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getPhix() {
		return phix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhix(DoubleVectorBaseType newPhix, NotificationChain msgs) {
		DoubleVectorBaseType oldPhix = phix;
		phix = newPhix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__PHIX, oldPhix, newPhix);
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
	public void setPhix(DoubleVectorBaseType newPhix) {
		if (newPhix != phix) {
			NotificationChain msgs = null;
			if (phix != null)
				msgs = ((InternalEObject) phix).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__PHIX, null, msgs);
			if (newPhix != null)
				msgs = ((InternalEObject) newPhix).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__PHIX, null, msgs);
			msgs = basicSetPhix(newPhix, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__PHIX, newPhix, newPhix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getPhiy() {
		return phiy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhiy(DoubleVectorBaseType newPhiy, NotificationChain msgs) {
		DoubleVectorBaseType oldPhiy = phiy;
		phiy = newPhiy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__PHIY, oldPhiy, newPhiy);
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
	public void setPhiy(DoubleVectorBaseType newPhiy) {
		if (newPhiy != phiy) {
			NotificationChain msgs = null;
			if (phiy != null)
				msgs = ((InternalEObject) phiy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__PHIY, null, msgs);
			if (newPhiy != null)
				msgs = ((InternalEObject) newPhiy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__PHIY, null, msgs);
			msgs = basicSetPhiy(newPhiy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__PHIY, newPhiy, newPhiy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getPhiz() {
		return phiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhiz(DoubleVectorBaseType newPhiz, NotificationChain msgs) {
		DoubleVectorBaseType oldPhiz = phiz;
		phiz = newPhiz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_SET_TYPE__PHIZ, oldPhiz, newPhiz);
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
	public void setPhiz(DoubleVectorBaseType newPhiz) {
		if (newPhiz != phiz) {
			NotificationChain msgs = null;
			if (phiz != null)
				msgs = ((InternalEObject) phiz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__PHIZ, null, msgs);
			if (newPhiz != null)
				msgs = ((InternalEObject) newPhiz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__PHIZ, null, msgs);
			msgs = basicSetPhiz(newPhiz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__PHIZ, newPhiz, newPhiz));
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
					CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN, oldLoadBreakdown, newLoadBreakdown);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN, null, msgs);
			if (newLoadBreakdown != null)
				msgs = ((InternalEObject) newLoadBreakdown).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN, null, msgs);
			msgs = basicSetLoadBreakdown(newLoadBreakdown, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_SET_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_SET_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID:
			return basicSetPointSetUID(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__FX:
			return basicSetFx(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__FY:
			return basicSetFy(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__FZ:
			return basicSetFz(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__MX:
			return basicSetMx(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__MY:
			return basicSetMy(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__MZ:
			return basicSetMz(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__DX:
			return basicSetDx(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__DY:
			return basicSetDy(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__DZ:
			return basicSetDz(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__PHIX:
			return basicSetPhix(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__PHIY:
			return basicSetPhiy(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__PHIZ:
			return basicSetPhiz(null, msgs);
		case CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN:
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
		case CpacsPackage.LOAD_SET_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID:
			return getPointSetUID();
		case CpacsPackage.LOAD_SET_TYPE__FX:
			return getFx();
		case CpacsPackage.LOAD_SET_TYPE__FY:
			return getFy();
		case CpacsPackage.LOAD_SET_TYPE__FZ:
			return getFz();
		case CpacsPackage.LOAD_SET_TYPE__MX:
			return getMx();
		case CpacsPackage.LOAD_SET_TYPE__MY:
			return getMy();
		case CpacsPackage.LOAD_SET_TYPE__MZ:
			return getMz();
		case CpacsPackage.LOAD_SET_TYPE__DX:
			return getDx();
		case CpacsPackage.LOAD_SET_TYPE__DY:
			return getDy();
		case CpacsPackage.LOAD_SET_TYPE__DZ:
			return getDz();
		case CpacsPackage.LOAD_SET_TYPE__PHIX:
			return getPhix();
		case CpacsPackage.LOAD_SET_TYPE__PHIY:
			return getPhiy();
		case CpacsPackage.LOAD_SET_TYPE__PHIZ:
			return getPhiz();
		case CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN:
			return getLoadBreakdown();
		case CpacsPackage.LOAD_SET_TYPE__UID:
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
		case CpacsPackage.LOAD_SET_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID:
			setPointSetUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__FX:
			setFx((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__FY:
			setFy((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__FZ:
			setFz((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__MX:
			setMx((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__MY:
			setMy((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__MZ:
			setMz((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__DX:
			setDx((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__DY:
			setDy((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__DZ:
			setDz((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__PHIX:
			setPhix((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__PHIY:
			setPhiy((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__PHIZ:
			setPhiz((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN:
			setLoadBreakdown((LoadBreakdownType) newValue);
			return;
		case CpacsPackage.LOAD_SET_TYPE__UID:
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
		case CpacsPackage.LOAD_SET_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID:
			setPointSetUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__FX:
			setFx((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__FY:
			setFy((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__FZ:
			setFz((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__MX:
			setMx((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__MY:
			setMy((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__MZ:
			setMz((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__DX:
			setDx((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__DY:
			setDy((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__DZ:
			setDz((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__PHIX:
			setPhix((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__PHIY:
			setPhiy((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__PHIZ:
			setPhiz((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN:
			setLoadBreakdown((LoadBreakdownType) null);
			return;
		case CpacsPackage.LOAD_SET_TYPE__UID:
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
		case CpacsPackage.LOAD_SET_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.LOAD_SET_TYPE__POINT_SET_UID:
			return pointSetUID != null;
		case CpacsPackage.LOAD_SET_TYPE__FX:
			return fx != null;
		case CpacsPackage.LOAD_SET_TYPE__FY:
			return fy != null;
		case CpacsPackage.LOAD_SET_TYPE__FZ:
			return fz != null;
		case CpacsPackage.LOAD_SET_TYPE__MX:
			return mx != null;
		case CpacsPackage.LOAD_SET_TYPE__MY:
			return my != null;
		case CpacsPackage.LOAD_SET_TYPE__MZ:
			return mz != null;
		case CpacsPackage.LOAD_SET_TYPE__DX:
			return dx != null;
		case CpacsPackage.LOAD_SET_TYPE__DY:
			return dy != null;
		case CpacsPackage.LOAD_SET_TYPE__DZ:
			return dz != null;
		case CpacsPackage.LOAD_SET_TYPE__PHIX:
			return phix != null;
		case CpacsPackage.LOAD_SET_TYPE__PHIY:
			return phiy != null;
		case CpacsPackage.LOAD_SET_TYPE__PHIZ:
			return phiz != null;
		case CpacsPackage.LOAD_SET_TYPE__LOAD_BREAKDOWN:
			return loadBreakdown != null;
		case CpacsPackage.LOAD_SET_TYPE__UID:
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

} //LoadSetTypeImpl
