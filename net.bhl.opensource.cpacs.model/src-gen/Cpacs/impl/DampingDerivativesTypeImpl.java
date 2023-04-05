/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DampingDerivativesType;
import Cpacs.DoubleVectorBaseType;

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
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcddpStar <em>Dcddp Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcddqStar <em>Dcddq Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcddrStar <em>Dcddr Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcsdpStar <em>Dcsdp Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcsdqStar <em>Dcsdq Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcsdrStar <em>Dcsdr Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcldpStar <em>Dcldp Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcldqStar <em>Dcldq Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcldrStar <em>Dcldr Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmddpStar <em>Dcmddp Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmddqStar <em>Dcmddq Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmddrStar <em>Dcmddr Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmsdpStar <em>Dcmsdp Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmsdqStar <em>Dcmsdq Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmsdrStar <em>Dcmsdr Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmldpStar <em>Dcmldp Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmldqStar <em>Dcmldq Star</em>}</li>
 *   <li>{@link Cpacs.impl.DampingDerivativesTypeImpl#getDcmldrStar <em>Dcmldr Star</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DampingDerivativesTypeImpl extends ComplexBaseTypeImpl implements DampingDerivativesType {
	/**
	 * The cached value of the '{@link #getDcddpStar() <em>Dcddp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcddpStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcddpStar;

	/**
	 * The cached value of the '{@link #getDcddqStar() <em>Dcddq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcddqStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcddqStar;

	/**
	 * The cached value of the '{@link #getDcddrStar() <em>Dcddr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcddrStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcddrStar;

	/**
	 * The cached value of the '{@link #getDcsdpStar() <em>Dcsdp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcsdpStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcsdpStar;

	/**
	 * The cached value of the '{@link #getDcsdqStar() <em>Dcsdq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcsdqStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcsdqStar;

	/**
	 * The cached value of the '{@link #getDcsdrStar() <em>Dcsdr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcsdrStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcsdrStar;

	/**
	 * The cached value of the '{@link #getDcldpStar() <em>Dcldp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcldpStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcldpStar;

	/**
	 * The cached value of the '{@link #getDcldqStar() <em>Dcldq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcldqStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcldqStar;

	/**
	 * The cached value of the '{@link #getDcldrStar() <em>Dcldr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcldrStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcldrStar;

	/**
	 * The cached value of the '{@link #getDcmddpStar() <em>Dcmddp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmddpStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmddpStar;

	/**
	 * The cached value of the '{@link #getDcmddqStar() <em>Dcmddq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmddqStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmddqStar;

	/**
	 * The cached value of the '{@link #getDcmddrStar() <em>Dcmddr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmddrStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmddrStar;

	/**
	 * The cached value of the '{@link #getDcmsdpStar() <em>Dcmsdp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmsdpStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmsdpStar;

	/**
	 * The cached value of the '{@link #getDcmsdqStar() <em>Dcmsdq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmsdqStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmsdqStar;

	/**
	 * The cached value of the '{@link #getDcmsdrStar() <em>Dcmsdr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmsdrStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmsdrStar;

	/**
	 * The cached value of the '{@link #getDcmldpStar() <em>Dcmldp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmldpStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmldpStar;

	/**
	 * The cached value of the '{@link #getDcmldqStar() <em>Dcmldq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmldqStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmldqStar;

	/**
	 * The cached value of the '{@link #getDcmldrStar() <em>Dcmldr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmldrStar()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType dcmldrStar;

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
	public DoubleVectorBaseType getDcddpStar() {
		return dcddpStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcddpStar(DoubleVectorBaseType newDcddpStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcddpStar = dcddpStar;
		dcddpStar = newDcddpStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR, oldDcddpStar, newDcddpStar);
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
	public void setDcddpStar(DoubleVectorBaseType newDcddpStar) {
		if (newDcddpStar != dcddpStar) {
			NotificationChain msgs = null;
			if (dcddpStar != null)
				msgs = ((InternalEObject) dcddpStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR, null, msgs);
			if (newDcddpStar != null)
				msgs = ((InternalEObject) newDcddpStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR, null, msgs);
			msgs = basicSetDcddpStar(newDcddpStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR,
					newDcddpStar, newDcddpStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcddqStar() {
		return dcddqStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcddqStar(DoubleVectorBaseType newDcddqStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcddqStar = dcddqStar;
		dcddqStar = newDcddqStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR, oldDcddqStar, newDcddqStar);
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
	public void setDcddqStar(DoubleVectorBaseType newDcddqStar) {
		if (newDcddqStar != dcddqStar) {
			NotificationChain msgs = null;
			if (dcddqStar != null)
				msgs = ((InternalEObject) dcddqStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR, null, msgs);
			if (newDcddqStar != null)
				msgs = ((InternalEObject) newDcddqStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR, null, msgs);
			msgs = basicSetDcddqStar(newDcddqStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR,
					newDcddqStar, newDcddqStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcddrStar() {
		return dcddrStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcddrStar(DoubleVectorBaseType newDcddrStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcddrStar = dcddrStar;
		dcddrStar = newDcddrStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR, oldDcddrStar, newDcddrStar);
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
	public void setDcddrStar(DoubleVectorBaseType newDcddrStar) {
		if (newDcddrStar != dcddrStar) {
			NotificationChain msgs = null;
			if (dcddrStar != null)
				msgs = ((InternalEObject) dcddrStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR, null, msgs);
			if (newDcddrStar != null)
				msgs = ((InternalEObject) newDcddrStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR, null, msgs);
			msgs = basicSetDcddrStar(newDcddrStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR,
					newDcddrStar, newDcddrStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcsdpStar() {
		return dcsdpStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcsdpStar(DoubleVectorBaseType newDcsdpStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcsdpStar = dcsdpStar;
		dcsdpStar = newDcsdpStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR, oldDcsdpStar, newDcsdpStar);
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
	public void setDcsdpStar(DoubleVectorBaseType newDcsdpStar) {
		if (newDcsdpStar != dcsdpStar) {
			NotificationChain msgs = null;
			if (dcsdpStar != null)
				msgs = ((InternalEObject) dcsdpStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR, null, msgs);
			if (newDcsdpStar != null)
				msgs = ((InternalEObject) newDcsdpStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR, null, msgs);
			msgs = basicSetDcsdpStar(newDcsdpStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR,
					newDcsdpStar, newDcsdpStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcsdqStar() {
		return dcsdqStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcsdqStar(DoubleVectorBaseType newDcsdqStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcsdqStar = dcsdqStar;
		dcsdqStar = newDcsdqStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR, oldDcsdqStar, newDcsdqStar);
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
	public void setDcsdqStar(DoubleVectorBaseType newDcsdqStar) {
		if (newDcsdqStar != dcsdqStar) {
			NotificationChain msgs = null;
			if (dcsdqStar != null)
				msgs = ((InternalEObject) dcsdqStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR, null, msgs);
			if (newDcsdqStar != null)
				msgs = ((InternalEObject) newDcsdqStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR, null, msgs);
			msgs = basicSetDcsdqStar(newDcsdqStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR,
					newDcsdqStar, newDcsdqStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcsdrStar() {
		return dcsdrStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcsdrStar(DoubleVectorBaseType newDcsdrStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcsdrStar = dcsdrStar;
		dcsdrStar = newDcsdrStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR, oldDcsdrStar, newDcsdrStar);
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
	public void setDcsdrStar(DoubleVectorBaseType newDcsdrStar) {
		if (newDcsdrStar != dcsdrStar) {
			NotificationChain msgs = null;
			if (dcsdrStar != null)
				msgs = ((InternalEObject) dcsdrStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR, null, msgs);
			if (newDcsdrStar != null)
				msgs = ((InternalEObject) newDcsdrStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR, null, msgs);
			msgs = basicSetDcsdrStar(newDcsdrStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR,
					newDcsdrStar, newDcsdrStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcldpStar() {
		return dcldpStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcldpStar(DoubleVectorBaseType newDcldpStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcldpStar = dcldpStar;
		dcldpStar = newDcldpStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR, oldDcldpStar, newDcldpStar);
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
	public void setDcldpStar(DoubleVectorBaseType newDcldpStar) {
		if (newDcldpStar != dcldpStar) {
			NotificationChain msgs = null;
			if (dcldpStar != null)
				msgs = ((InternalEObject) dcldpStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR, null, msgs);
			if (newDcldpStar != null)
				msgs = ((InternalEObject) newDcldpStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR, null, msgs);
			msgs = basicSetDcldpStar(newDcldpStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR,
					newDcldpStar, newDcldpStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcldqStar() {
		return dcldqStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcldqStar(DoubleVectorBaseType newDcldqStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcldqStar = dcldqStar;
		dcldqStar = newDcldqStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR, oldDcldqStar, newDcldqStar);
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
	public void setDcldqStar(DoubleVectorBaseType newDcldqStar) {
		if (newDcldqStar != dcldqStar) {
			NotificationChain msgs = null;
			if (dcldqStar != null)
				msgs = ((InternalEObject) dcldqStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR, null, msgs);
			if (newDcldqStar != null)
				msgs = ((InternalEObject) newDcldqStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR, null, msgs);
			msgs = basicSetDcldqStar(newDcldqStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR,
					newDcldqStar, newDcldqStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcldrStar() {
		return dcldrStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcldrStar(DoubleVectorBaseType newDcldrStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcldrStar = dcldrStar;
		dcldrStar = newDcldrStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR, oldDcldrStar, newDcldrStar);
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
	public void setDcldrStar(DoubleVectorBaseType newDcldrStar) {
		if (newDcldrStar != dcldrStar) {
			NotificationChain msgs = null;
			if (dcldrStar != null)
				msgs = ((InternalEObject) dcldrStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR, null, msgs);
			if (newDcldrStar != null)
				msgs = ((InternalEObject) newDcldrStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR, null, msgs);
			msgs = basicSetDcldrStar(newDcldrStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR,
					newDcldrStar, newDcldrStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmddpStar() {
		return dcmddpStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmddpStar(DoubleVectorBaseType newDcmddpStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmddpStar = dcmddpStar;
		dcmddpStar = newDcmddpStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR, oldDcmddpStar, newDcmddpStar);
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
	public void setDcmddpStar(DoubleVectorBaseType newDcmddpStar) {
		if (newDcmddpStar != dcmddpStar) {
			NotificationChain msgs = null;
			if (dcmddpStar != null)
				msgs = ((InternalEObject) dcmddpStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR, null, msgs);
			if (newDcmddpStar != null)
				msgs = ((InternalEObject) newDcmddpStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR, null, msgs);
			msgs = basicSetDcmddpStar(newDcmddpStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR,
					newDcmddpStar, newDcmddpStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmddqStar() {
		return dcmddqStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmddqStar(DoubleVectorBaseType newDcmddqStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmddqStar = dcmddqStar;
		dcmddqStar = newDcmddqStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR, oldDcmddqStar, newDcmddqStar);
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
	public void setDcmddqStar(DoubleVectorBaseType newDcmddqStar) {
		if (newDcmddqStar != dcmddqStar) {
			NotificationChain msgs = null;
			if (dcmddqStar != null)
				msgs = ((InternalEObject) dcmddqStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR, null, msgs);
			if (newDcmddqStar != null)
				msgs = ((InternalEObject) newDcmddqStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR, null, msgs);
			msgs = basicSetDcmddqStar(newDcmddqStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR,
					newDcmddqStar, newDcmddqStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmddrStar() {
		return dcmddrStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmddrStar(DoubleVectorBaseType newDcmddrStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmddrStar = dcmddrStar;
		dcmddrStar = newDcmddrStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR, oldDcmddrStar, newDcmddrStar);
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
	public void setDcmddrStar(DoubleVectorBaseType newDcmddrStar) {
		if (newDcmddrStar != dcmddrStar) {
			NotificationChain msgs = null;
			if (dcmddrStar != null)
				msgs = ((InternalEObject) dcmddrStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR, null, msgs);
			if (newDcmddrStar != null)
				msgs = ((InternalEObject) newDcmddrStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR, null, msgs);
			msgs = basicSetDcmddrStar(newDcmddrStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR,
					newDcmddrStar, newDcmddrStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmsdpStar() {
		return dcmsdpStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmsdpStar(DoubleVectorBaseType newDcmsdpStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmsdpStar = dcmsdpStar;
		dcmsdpStar = newDcmsdpStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR, oldDcmsdpStar, newDcmsdpStar);
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
	public void setDcmsdpStar(DoubleVectorBaseType newDcmsdpStar) {
		if (newDcmsdpStar != dcmsdpStar) {
			NotificationChain msgs = null;
			if (dcmsdpStar != null)
				msgs = ((InternalEObject) dcmsdpStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR, null, msgs);
			if (newDcmsdpStar != null)
				msgs = ((InternalEObject) newDcmsdpStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR, null, msgs);
			msgs = basicSetDcmsdpStar(newDcmsdpStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR,
					newDcmsdpStar, newDcmsdpStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmsdqStar() {
		return dcmsdqStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmsdqStar(DoubleVectorBaseType newDcmsdqStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmsdqStar = dcmsdqStar;
		dcmsdqStar = newDcmsdqStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR, oldDcmsdqStar, newDcmsdqStar);
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
	public void setDcmsdqStar(DoubleVectorBaseType newDcmsdqStar) {
		if (newDcmsdqStar != dcmsdqStar) {
			NotificationChain msgs = null;
			if (dcmsdqStar != null)
				msgs = ((InternalEObject) dcmsdqStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR, null, msgs);
			if (newDcmsdqStar != null)
				msgs = ((InternalEObject) newDcmsdqStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR, null, msgs);
			msgs = basicSetDcmsdqStar(newDcmsdqStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR,
					newDcmsdqStar, newDcmsdqStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmsdrStar() {
		return dcmsdrStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmsdrStar(DoubleVectorBaseType newDcmsdrStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmsdrStar = dcmsdrStar;
		dcmsdrStar = newDcmsdrStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR, oldDcmsdrStar, newDcmsdrStar);
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
	public void setDcmsdrStar(DoubleVectorBaseType newDcmsdrStar) {
		if (newDcmsdrStar != dcmsdrStar) {
			NotificationChain msgs = null;
			if (dcmsdrStar != null)
				msgs = ((InternalEObject) dcmsdrStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR, null, msgs);
			if (newDcmsdrStar != null)
				msgs = ((InternalEObject) newDcmsdrStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR, null, msgs);
			msgs = basicSetDcmsdrStar(newDcmsdrStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR,
					newDcmsdrStar, newDcmsdrStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmldpStar() {
		return dcmldpStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmldpStar(DoubleVectorBaseType newDcmldpStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmldpStar = dcmldpStar;
		dcmldpStar = newDcmldpStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR, oldDcmldpStar, newDcmldpStar);
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
	public void setDcmldpStar(DoubleVectorBaseType newDcmldpStar) {
		if (newDcmldpStar != dcmldpStar) {
			NotificationChain msgs = null;
			if (dcmldpStar != null)
				msgs = ((InternalEObject) dcmldpStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR, null, msgs);
			if (newDcmldpStar != null)
				msgs = ((InternalEObject) newDcmldpStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR, null, msgs);
			msgs = basicSetDcmldpStar(newDcmldpStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR,
					newDcmldpStar, newDcmldpStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmldqStar() {
		return dcmldqStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmldqStar(DoubleVectorBaseType newDcmldqStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmldqStar = dcmldqStar;
		dcmldqStar = newDcmldqStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR, oldDcmldqStar, newDcmldqStar);
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
	public void setDcmldqStar(DoubleVectorBaseType newDcmldqStar) {
		if (newDcmldqStar != dcmldqStar) {
			NotificationChain msgs = null;
			if (dcmldqStar != null)
				msgs = ((InternalEObject) dcmldqStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR, null, msgs);
			if (newDcmldqStar != null)
				msgs = ((InternalEObject) newDcmldqStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR, null, msgs);
			msgs = basicSetDcmldqStar(newDcmldqStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR,
					newDcmldqStar, newDcmldqStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getDcmldrStar() {
		return dcmldrStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmldrStar(DoubleVectorBaseType newDcmldrStar, NotificationChain msgs) {
		DoubleVectorBaseType oldDcmldrStar = dcmldrStar;
		dcmldrStar = newDcmldrStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR, oldDcmldrStar, newDcmldrStar);
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
	public void setDcmldrStar(DoubleVectorBaseType newDcmldrStar) {
		if (newDcmldrStar != dcmldrStar) {
			NotificationChain msgs = null;
			if (dcmldrStar != null)
				msgs = ((InternalEObject) dcmldrStar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR, null, msgs);
			if (newDcmldrStar != null)
				msgs = ((InternalEObject) newDcmldrStar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR, null, msgs);
			msgs = basicSetDcmldrStar(newDcmldrStar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR,
					newDcmldrStar, newDcmldrStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR:
			return basicSetDcddpStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR:
			return basicSetDcddqStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR:
			return basicSetDcddrStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR:
			return basicSetDcsdpStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR:
			return basicSetDcsdqStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR:
			return basicSetDcsdrStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR:
			return basicSetDcldpStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR:
			return basicSetDcldqStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR:
			return basicSetDcldrStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR:
			return basicSetDcmddpStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR:
			return basicSetDcmddqStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR:
			return basicSetDcmddrStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR:
			return basicSetDcmsdpStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR:
			return basicSetDcmsdqStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR:
			return basicSetDcmsdrStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR:
			return basicSetDcmldpStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR:
			return basicSetDcmldqStar(null, msgs);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR:
			return basicSetDcmldrStar(null, msgs);
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
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR:
			return getDcddpStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR:
			return getDcddqStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR:
			return getDcddrStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR:
			return getDcsdpStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR:
			return getDcsdqStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR:
			return getDcsdrStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR:
			return getDcldpStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR:
			return getDcldqStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR:
			return getDcldrStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR:
			return getDcmddpStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR:
			return getDcmddqStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR:
			return getDcmddrStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR:
			return getDcmsdpStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR:
			return getDcmsdqStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR:
			return getDcmsdrStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR:
			return getDcmldpStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR:
			return getDcmldqStar();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR:
			return getDcmldrStar();
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
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR:
			setDcddpStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR:
			setDcddqStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR:
			setDcddrStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR:
			setDcsdpStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR:
			setDcsdqStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR:
			setDcsdrStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR:
			setDcldpStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR:
			setDcldqStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR:
			setDcldrStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR:
			setDcmddpStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR:
			setDcmddqStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR:
			setDcmddrStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR:
			setDcmsdpStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR:
			setDcmsdqStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR:
			setDcmsdrStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR:
			setDcmldpStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR:
			setDcmldqStar((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR:
			setDcmldrStar((DoubleVectorBaseType) newValue);
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
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR:
			setDcddpStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR:
			setDcddqStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR:
			setDcddrStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR:
			setDcsdpStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR:
			setDcsdqStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR:
			setDcsdrStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR:
			setDcldpStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR:
			setDcldqStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR:
			setDcldrStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR:
			setDcmddpStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR:
			setDcmddqStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR:
			setDcmddrStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR:
			setDcmsdpStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR:
			setDcmsdqStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR:
			setDcmsdrStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR:
			setDcmldpStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR:
			setDcmldqStar((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR:
			setDcmldrStar((DoubleVectorBaseType) null);
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
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDP_STAR:
			return dcddpStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDQ_STAR:
			return dcddqStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCDDR_STAR:
			return dcddrStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDP_STAR:
			return dcsdpStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDQ_STAR:
			return dcsdqStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCSDR_STAR:
			return dcsdrStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDP_STAR:
			return dcldpStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDQ_STAR:
			return dcldqStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCLDR_STAR:
			return dcldrStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDP_STAR:
			return dcmddpStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDQ_STAR:
			return dcmddqStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMDDR_STAR:
			return dcmddrStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDP_STAR:
			return dcmsdpStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDQ_STAR:
			return dcmsdqStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMSDR_STAR:
			return dcmsdrStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDP_STAR:
			return dcmldpStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDQ_STAR:
			return dcmldqStar != null;
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE__DCMLDR_STAR:
			return dcmldrStar != null;
		}
		return super.eIsSet(featureID);
	}

} //DampingDerivativesTypeImpl
