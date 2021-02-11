/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DampingDerivativesType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Damping Derivatives Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcddpstar <em>Dcddpstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcddqstar <em>Dcddqstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcddrstar <em>Dcddrstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcsdpstar <em>Dcsdpstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcsdqstar <em>Dcsdqstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcsdrstar <em>Dcsdrstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcldpstar <em>Dcldpstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcldqstar <em>Dcldqstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcldrstar <em>Dcldrstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmddpstar <em>Dcmddpstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmddqstar <em>Dcmddqstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmddrstar <em>Dcmddrstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmsdpstar <em>Dcmsdpstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmsdqstar <em>Dcmsdqstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmsdrstar <em>Dcmsdrstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmldpstar <em>Dcmldpstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmldqstar <em>Dcmldqstar</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmldrstar <em>Dcmldrstar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DampingDerivativesTypeImpl extends ComplexBaseTypeImpl implements DampingDerivativesType {
	/**
	 * The cached value of the '{@link #getDcddpstar() <em>Dcddpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcddpstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcddpstar;

	/**
	 * The cached value of the '{@link #getDcddqstar() <em>Dcddqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcddqstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcddqstar;

	/**
	 * The cached value of the '{@link #getDcddrstar() <em>Dcddrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcddrstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcddrstar;

	/**
	 * The cached value of the '{@link #getDcsdpstar() <em>Dcsdpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcsdpstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcsdpstar;

	/**
	 * The cached value of the '{@link #getDcsdqstar() <em>Dcsdqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcsdqstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcsdqstar;

	/**
	 * The cached value of the '{@link #getDcsdrstar() <em>Dcsdrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcsdrstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcsdrstar;

	/**
	 * The cached value of the '{@link #getDcldpstar() <em>Dcldpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcldpstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcldpstar;

	/**
	 * The cached value of the '{@link #getDcldqstar() <em>Dcldqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcldqstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcldqstar;

	/**
	 * The cached value of the '{@link #getDcldrstar() <em>Dcldrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcldrstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcldrstar;

	/**
	 * The cached value of the '{@link #getDcmddpstar() <em>Dcmddpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmddpstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmddpstar;

	/**
	 * The cached value of the '{@link #getDcmddqstar() <em>Dcmddqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmddqstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmddqstar;

	/**
	 * The cached value of the '{@link #getDcmddrstar() <em>Dcmddrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmddrstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmddrstar;

	/**
	 * The cached value of the '{@link #getDcmsdpstar() <em>Dcmsdpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmsdpstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmsdpstar;

	/**
	 * The cached value of the '{@link #getDcmsdqstar() <em>Dcmsdqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmsdqstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmsdqstar;

	/**
	 * The cached value of the '{@link #getDcmsdrstar() <em>Dcmsdrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmsdrstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmsdrstar;

	/**
	 * The cached value of the '{@link #getDcmldpstar() <em>Dcmldpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmldpstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmldpstar;

	/**
	 * The cached value of the '{@link #getDcmldqstar() <em>Dcmldqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmldqstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmldqstar;

	/**
	 * The cached value of the '{@link #getDcmldrstar() <em>Dcmldrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmldrstar()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dcmldrstar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DampingDerivativesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDampingDerivativesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcddpstar() {
		return dcddpstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcddpstar(StringVectorBaseType newDcddpstar, NotificationChain msgs) {
		StringVectorBaseType oldDcddpstar = dcddpstar;
		dcddpstar = newDcddpstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR, oldDcddpstar, newDcddpstar);
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
	public void setDcddpstar(StringVectorBaseType newDcddpstar) {
		if (newDcddpstar != dcddpstar) {
			NotificationChain msgs = null;
			if (dcddpstar != null)
				msgs = ((InternalEObject) dcddpstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR, null, msgs);
			if (newDcddpstar != null)
				msgs = ((InternalEObject) newDcddpstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR, null, msgs);
			msgs = basicSetDcddpstar(newDcddpstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR,
					newDcddpstar, newDcddpstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcddqstar() {
		return dcddqstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcddqstar(StringVectorBaseType newDcddqstar, NotificationChain msgs) {
		StringVectorBaseType oldDcddqstar = dcddqstar;
		dcddqstar = newDcddqstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR, oldDcddqstar, newDcddqstar);
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
	public void setDcddqstar(StringVectorBaseType newDcddqstar) {
		if (newDcddqstar != dcddqstar) {
			NotificationChain msgs = null;
			if (dcddqstar != null)
				msgs = ((InternalEObject) dcddqstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR, null, msgs);
			if (newDcddqstar != null)
				msgs = ((InternalEObject) newDcddqstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR, null, msgs);
			msgs = basicSetDcddqstar(newDcddqstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR,
					newDcddqstar, newDcddqstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcddrstar() {
		return dcddrstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcddrstar(StringVectorBaseType newDcddrstar, NotificationChain msgs) {
		StringVectorBaseType oldDcddrstar = dcddrstar;
		dcddrstar = newDcddrstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR, oldDcddrstar, newDcddrstar);
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
	public void setDcddrstar(StringVectorBaseType newDcddrstar) {
		if (newDcddrstar != dcddrstar) {
			NotificationChain msgs = null;
			if (dcddrstar != null)
				msgs = ((InternalEObject) dcddrstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR, null, msgs);
			if (newDcddrstar != null)
				msgs = ((InternalEObject) newDcddrstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR, null, msgs);
			msgs = basicSetDcddrstar(newDcddrstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR,
					newDcddrstar, newDcddrstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcsdpstar() {
		return dcsdpstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcsdpstar(StringVectorBaseType newDcsdpstar, NotificationChain msgs) {
		StringVectorBaseType oldDcsdpstar = dcsdpstar;
		dcsdpstar = newDcsdpstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR, oldDcsdpstar, newDcsdpstar);
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
	public void setDcsdpstar(StringVectorBaseType newDcsdpstar) {
		if (newDcsdpstar != dcsdpstar) {
			NotificationChain msgs = null;
			if (dcsdpstar != null)
				msgs = ((InternalEObject) dcsdpstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR, null, msgs);
			if (newDcsdpstar != null)
				msgs = ((InternalEObject) newDcsdpstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR, null, msgs);
			msgs = basicSetDcsdpstar(newDcsdpstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR,
					newDcsdpstar, newDcsdpstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcsdqstar() {
		return dcsdqstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcsdqstar(StringVectorBaseType newDcsdqstar, NotificationChain msgs) {
		StringVectorBaseType oldDcsdqstar = dcsdqstar;
		dcsdqstar = newDcsdqstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR, oldDcsdqstar, newDcsdqstar);
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
	public void setDcsdqstar(StringVectorBaseType newDcsdqstar) {
		if (newDcsdqstar != dcsdqstar) {
			NotificationChain msgs = null;
			if (dcsdqstar != null)
				msgs = ((InternalEObject) dcsdqstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR, null, msgs);
			if (newDcsdqstar != null)
				msgs = ((InternalEObject) newDcsdqstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR, null, msgs);
			msgs = basicSetDcsdqstar(newDcsdqstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR,
					newDcsdqstar, newDcsdqstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcsdrstar() {
		return dcsdrstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcsdrstar(StringVectorBaseType newDcsdrstar, NotificationChain msgs) {
		StringVectorBaseType oldDcsdrstar = dcsdrstar;
		dcsdrstar = newDcsdrstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR, oldDcsdrstar, newDcsdrstar);
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
	public void setDcsdrstar(StringVectorBaseType newDcsdrstar) {
		if (newDcsdrstar != dcsdrstar) {
			NotificationChain msgs = null;
			if (dcsdrstar != null)
				msgs = ((InternalEObject) dcsdrstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR, null, msgs);
			if (newDcsdrstar != null)
				msgs = ((InternalEObject) newDcsdrstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR, null, msgs);
			msgs = basicSetDcsdrstar(newDcsdrstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR,
					newDcsdrstar, newDcsdrstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcldpstar() {
		return dcldpstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcldpstar(StringVectorBaseType newDcldpstar, NotificationChain msgs) {
		StringVectorBaseType oldDcldpstar = dcldpstar;
		dcldpstar = newDcldpstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR, oldDcldpstar, newDcldpstar);
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
	public void setDcldpstar(StringVectorBaseType newDcldpstar) {
		if (newDcldpstar != dcldpstar) {
			NotificationChain msgs = null;
			if (dcldpstar != null)
				msgs = ((InternalEObject) dcldpstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR, null, msgs);
			if (newDcldpstar != null)
				msgs = ((InternalEObject) newDcldpstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR, null, msgs);
			msgs = basicSetDcldpstar(newDcldpstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR,
					newDcldpstar, newDcldpstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcldqstar() {
		return dcldqstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcldqstar(StringVectorBaseType newDcldqstar, NotificationChain msgs) {
		StringVectorBaseType oldDcldqstar = dcldqstar;
		dcldqstar = newDcldqstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR, oldDcldqstar, newDcldqstar);
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
	public void setDcldqstar(StringVectorBaseType newDcldqstar) {
		if (newDcldqstar != dcldqstar) {
			NotificationChain msgs = null;
			if (dcldqstar != null)
				msgs = ((InternalEObject) dcldqstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR, null, msgs);
			if (newDcldqstar != null)
				msgs = ((InternalEObject) newDcldqstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR, null, msgs);
			msgs = basicSetDcldqstar(newDcldqstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR,
					newDcldqstar, newDcldqstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcldrstar() {
		return dcldrstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcldrstar(StringVectorBaseType newDcldrstar, NotificationChain msgs) {
		StringVectorBaseType oldDcldrstar = dcldrstar;
		dcldrstar = newDcldrstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR, oldDcldrstar, newDcldrstar);
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
	public void setDcldrstar(StringVectorBaseType newDcldrstar) {
		if (newDcldrstar != dcldrstar) {
			NotificationChain msgs = null;
			if (dcldrstar != null)
				msgs = ((InternalEObject) dcldrstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR, null, msgs);
			if (newDcldrstar != null)
				msgs = ((InternalEObject) newDcldrstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR, null, msgs);
			msgs = basicSetDcldrstar(newDcldrstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR,
					newDcldrstar, newDcldrstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmddpstar() {
		return dcmddpstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmddpstar(StringVectorBaseType newDcmddpstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmddpstar = dcmddpstar;
		dcmddpstar = newDcmddpstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR, oldDcmddpstar, newDcmddpstar);
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
	public void setDcmddpstar(StringVectorBaseType newDcmddpstar) {
		if (newDcmddpstar != dcmddpstar) {
			NotificationChain msgs = null;
			if (dcmddpstar != null)
				msgs = ((InternalEObject) dcmddpstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR, null, msgs);
			if (newDcmddpstar != null)
				msgs = ((InternalEObject) newDcmddpstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR, null, msgs);
			msgs = basicSetDcmddpstar(newDcmddpstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR,
					newDcmddpstar, newDcmddpstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmddqstar() {
		return dcmddqstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmddqstar(StringVectorBaseType newDcmddqstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmddqstar = dcmddqstar;
		dcmddqstar = newDcmddqstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR, oldDcmddqstar, newDcmddqstar);
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
	public void setDcmddqstar(StringVectorBaseType newDcmddqstar) {
		if (newDcmddqstar != dcmddqstar) {
			NotificationChain msgs = null;
			if (dcmddqstar != null)
				msgs = ((InternalEObject) dcmddqstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR, null, msgs);
			if (newDcmddqstar != null)
				msgs = ((InternalEObject) newDcmddqstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR, null, msgs);
			msgs = basicSetDcmddqstar(newDcmddqstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR,
					newDcmddqstar, newDcmddqstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmddrstar() {
		return dcmddrstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmddrstar(StringVectorBaseType newDcmddrstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmddrstar = dcmddrstar;
		dcmddrstar = newDcmddrstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR, oldDcmddrstar, newDcmddrstar);
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
	public void setDcmddrstar(StringVectorBaseType newDcmddrstar) {
		if (newDcmddrstar != dcmddrstar) {
			NotificationChain msgs = null;
			if (dcmddrstar != null)
				msgs = ((InternalEObject) dcmddrstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR, null, msgs);
			if (newDcmddrstar != null)
				msgs = ((InternalEObject) newDcmddrstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR, null, msgs);
			msgs = basicSetDcmddrstar(newDcmddrstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR,
					newDcmddrstar, newDcmddrstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmsdpstar() {
		return dcmsdpstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmsdpstar(StringVectorBaseType newDcmsdpstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmsdpstar = dcmsdpstar;
		dcmsdpstar = newDcmsdpstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR, oldDcmsdpstar, newDcmsdpstar);
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
	public void setDcmsdpstar(StringVectorBaseType newDcmsdpstar) {
		if (newDcmsdpstar != dcmsdpstar) {
			NotificationChain msgs = null;
			if (dcmsdpstar != null)
				msgs = ((InternalEObject) dcmsdpstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR, null, msgs);
			if (newDcmsdpstar != null)
				msgs = ((InternalEObject) newDcmsdpstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR, null, msgs);
			msgs = basicSetDcmsdpstar(newDcmsdpstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR,
					newDcmsdpstar, newDcmsdpstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmsdqstar() {
		return dcmsdqstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmsdqstar(StringVectorBaseType newDcmsdqstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmsdqstar = dcmsdqstar;
		dcmsdqstar = newDcmsdqstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR, oldDcmsdqstar, newDcmsdqstar);
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
	public void setDcmsdqstar(StringVectorBaseType newDcmsdqstar) {
		if (newDcmsdqstar != dcmsdqstar) {
			NotificationChain msgs = null;
			if (dcmsdqstar != null)
				msgs = ((InternalEObject) dcmsdqstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR, null, msgs);
			if (newDcmsdqstar != null)
				msgs = ((InternalEObject) newDcmsdqstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR, null, msgs);
			msgs = basicSetDcmsdqstar(newDcmsdqstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR,
					newDcmsdqstar, newDcmsdqstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmsdrstar() {
		return dcmsdrstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmsdrstar(StringVectorBaseType newDcmsdrstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmsdrstar = dcmsdrstar;
		dcmsdrstar = newDcmsdrstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR, oldDcmsdrstar, newDcmsdrstar);
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
	public void setDcmsdrstar(StringVectorBaseType newDcmsdrstar) {
		if (newDcmsdrstar != dcmsdrstar) {
			NotificationChain msgs = null;
			if (dcmsdrstar != null)
				msgs = ((InternalEObject) dcmsdrstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR, null, msgs);
			if (newDcmsdrstar != null)
				msgs = ((InternalEObject) newDcmsdrstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR, null, msgs);
			msgs = basicSetDcmsdrstar(newDcmsdrstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR,
					newDcmsdrstar, newDcmsdrstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmldpstar() {
		return dcmldpstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmldpstar(StringVectorBaseType newDcmldpstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmldpstar = dcmldpstar;
		dcmldpstar = newDcmldpstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR, oldDcmldpstar, newDcmldpstar);
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
	public void setDcmldpstar(StringVectorBaseType newDcmldpstar) {
		if (newDcmldpstar != dcmldpstar) {
			NotificationChain msgs = null;
			if (dcmldpstar != null)
				msgs = ((InternalEObject) dcmldpstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR, null, msgs);
			if (newDcmldpstar != null)
				msgs = ((InternalEObject) newDcmldpstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR, null, msgs);
			msgs = basicSetDcmldpstar(newDcmldpstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR,
					newDcmldpstar, newDcmldpstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmldqstar() {
		return dcmldqstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmldqstar(StringVectorBaseType newDcmldqstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmldqstar = dcmldqstar;
		dcmldqstar = newDcmldqstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR, oldDcmldqstar, newDcmldqstar);
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
	public void setDcmldqstar(StringVectorBaseType newDcmldqstar) {
		if (newDcmldqstar != dcmldqstar) {
			NotificationChain msgs = null;
			if (dcmldqstar != null)
				msgs = ((InternalEObject) dcmldqstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR, null, msgs);
			if (newDcmldqstar != null)
				msgs = ((InternalEObject) newDcmldqstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR, null, msgs);
			msgs = basicSetDcmldqstar(newDcmldqstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR,
					newDcmldqstar, newDcmldqstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDcmldrstar() {
		return dcmldrstar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmldrstar(StringVectorBaseType newDcmldrstar, NotificationChain msgs) {
		StringVectorBaseType oldDcmldrstar = dcmldrstar;
		dcmldrstar = newDcmldrstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR, oldDcmldrstar, newDcmldrstar);
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
	public void setDcmldrstar(StringVectorBaseType newDcmldrstar) {
		if (newDcmldrstar != dcmldrstar) {
			NotificationChain msgs = null;
			if (dcmldrstar != null)
				msgs = ((InternalEObject) dcmldrstar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR, null, msgs);
			if (newDcmldrstar != null)
				msgs = ((InternalEObject) newDcmldrstar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR, null, msgs);
			msgs = basicSetDcmldrstar(newDcmldrstar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR,
					newDcmldrstar, newDcmldrstar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR:
			return basicSetDcddpstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR:
			return basicSetDcddqstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR:
			return basicSetDcddrstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR:
			return basicSetDcsdpstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR:
			return basicSetDcsdqstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR:
			return basicSetDcsdrstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR:
			return basicSetDcldpstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR:
			return basicSetDcldqstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR:
			return basicSetDcldrstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR:
			return basicSetDcmddpstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR:
			return basicSetDcmddqstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR:
			return basicSetDcmddrstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR:
			return basicSetDcmsdpstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR:
			return basicSetDcmsdqstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR:
			return basicSetDcmsdrstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR:
			return basicSetDcmldpstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR:
			return basicSetDcmldqstar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR:
			return basicSetDcmldrstar(null, msgs);
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
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR:
			return getDcddpstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR:
			return getDcddqstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR:
			return getDcddrstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR:
			return getDcsdpstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR:
			return getDcsdqstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR:
			return getDcsdrstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR:
			return getDcldpstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR:
			return getDcldqstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR:
			return getDcldrstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR:
			return getDcmddpstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR:
			return getDcmddqstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR:
			return getDcmddrstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR:
			return getDcmsdpstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR:
			return getDcmsdqstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR:
			return getDcmsdrstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR:
			return getDcmldpstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR:
			return getDcmldqstar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR:
			return getDcmldrstar();
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
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR:
			setDcddpstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR:
			setDcddqstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR:
			setDcddrstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR:
			setDcsdpstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR:
			setDcsdqstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR:
			setDcsdrstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR:
			setDcldpstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR:
			setDcldqstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR:
			setDcldrstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR:
			setDcmddpstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR:
			setDcmddqstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR:
			setDcmddrstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR:
			setDcmsdpstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR:
			setDcmsdqstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR:
			setDcmsdrstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR:
			setDcmldpstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR:
			setDcmldqstar((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR:
			setDcmldrstar((StringVectorBaseType) newValue);
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
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR:
			setDcddpstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR:
			setDcddqstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR:
			setDcddrstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR:
			setDcsdpstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR:
			setDcsdqstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR:
			setDcsdrstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR:
			setDcldpstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR:
			setDcldqstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR:
			setDcldrstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR:
			setDcmddpstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR:
			setDcmddqstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR:
			setDcmddrstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR:
			setDcmsdpstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR:
			setDcmsdqstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR:
			setDcmsdrstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR:
			setDcmldpstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR:
			setDcmldqstar((StringVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR:
			setDcmldrstar((StringVectorBaseType) null);
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
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDPSTAR:
			return dcddpstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQSTAR:
			return dcddqstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDRSTAR:
			return dcddrstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDPSTAR:
			return dcsdpstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQSTAR:
			return dcsdqstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDRSTAR:
			return dcsdrstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDPSTAR:
			return dcldpstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQSTAR:
			return dcldqstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDRSTAR:
			return dcldrstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDPSTAR:
			return dcmddpstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQSTAR:
			return dcmddqstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDRSTAR:
			return dcmddrstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDPSTAR:
			return dcmsdpstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQSTAR:
			return dcmsdqstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDRSTAR:
			return dcmsdrstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDPSTAR:
			return dcmldpstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQSTAR:
			return dcmldqstar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDRSTAR:
			return dcmldrstar != null;
		}
		return super.eIsSet(featureID);
	}

} //DampingDerivativesTypeImpl
