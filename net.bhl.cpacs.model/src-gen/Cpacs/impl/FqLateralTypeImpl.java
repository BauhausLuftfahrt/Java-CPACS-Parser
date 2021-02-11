/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FqLateralType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Lateral Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumPhiDas <em>Num Phi Das</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumRDas <em>Num RDas</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumBetaDas <em>Num Beta Das</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumPhiDasRed <em>Num Phi Das Red</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumBetaDasRed <em>Num Beta Das Red</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumRDrp <em>Num RDrp</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumBetaDrp <em>Num Beta Drp</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumPFas <em>Num PFas</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumRFas <em>Num RFas</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumPhiFas <em>Num Phi Fas</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumBetaFas <em>Num Beta Fas</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumPFrp <em>Num PFrp</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumRFrp <em>Num RFrp</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumPhiFrp <em>Num Phi Frp</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getNumBetaFrp <em>Num Beta Frp</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getDenLat <em>Den Lat</em>}</li>
 *   <li>{@link Cpacs.impl.FqLateralTypeImpl#getDenLatRed <em>Den Lat Red</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqLateralTypeImpl extends ComplexBaseTypeImpl implements FqLateralType {
	/**
	 * The cached value of the '{@link #getNumPhiDas() <em>Num Phi Das</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPhiDas()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numPhiDas;

	/**
	 * The cached value of the '{@link #getNumRDas() <em>Num RDas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRDas()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numRDas;

	/**
	 * The cached value of the '{@link #getNumBetaDas() <em>Num Beta Das</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBetaDas()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numBetaDas;

	/**
	 * The cached value of the '{@link #getNumPhiDasRed() <em>Num Phi Das Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPhiDasRed()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numPhiDasRed;

	/**
	 * The cached value of the '{@link #getNumBetaDasRed() <em>Num Beta Das Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBetaDasRed()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numBetaDasRed;

	/**
	 * The cached value of the '{@link #getNumRDrp() <em>Num RDrp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRDrp()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numRDrp;

	/**
	 * The cached value of the '{@link #getNumBetaDrp() <em>Num Beta Drp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBetaDrp()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numBetaDrp;

	/**
	 * The cached value of the '{@link #getNumPFas() <em>Num PFas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPFas()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numPFas;

	/**
	 * The cached value of the '{@link #getNumRFas() <em>Num RFas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRFas()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numRFas;

	/**
	 * The cached value of the '{@link #getNumPhiFas() <em>Num Phi Fas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPhiFas()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numPhiFas;

	/**
	 * The cached value of the '{@link #getNumBetaFas() <em>Num Beta Fas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBetaFas()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numBetaFas;

	/**
	 * The cached value of the '{@link #getNumPFrp() <em>Num PFrp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPFrp()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numPFrp;

	/**
	 * The cached value of the '{@link #getNumRFrp() <em>Num RFrp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRFrp()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numRFrp;

	/**
	 * The cached value of the '{@link #getNumPhiFrp() <em>Num Phi Frp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPhiFrp()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numPhiFrp;

	/**
	 * The cached value of the '{@link #getNumBetaFrp() <em>Num Beta Frp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBetaFrp()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numBetaFrp;

	/**
	 * The cached value of the '{@link #getDenLat() <em>Den Lat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenLat()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType denLat;

	/**
	 * The cached value of the '{@link #getDenLatRed() <em>Den Lat Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenLatRed()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType denLatRed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqLateralTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqLateralType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumPhiDas() {
		return numPhiDas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumPhiDas(StringVectorBaseType newNumPhiDas, NotificationChain msgs) {
		StringVectorBaseType oldNumPhiDas = numPhiDas;
		numPhiDas = newNumPhiDas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS, oldNumPhiDas, newNumPhiDas);
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
	public void setNumPhiDas(StringVectorBaseType newNumPhiDas) {
		if (newNumPhiDas != numPhiDas) {
			NotificationChain msgs = null;
			if (numPhiDas != null)
				msgs = ((InternalEObject) numPhiDas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS, null, msgs);
			if (newNumPhiDas != null)
				msgs = ((InternalEObject) newNumPhiDas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS, null, msgs);
			msgs = basicSetNumPhiDas(newNumPhiDas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS,
					newNumPhiDas, newNumPhiDas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumRDas() {
		return numRDas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumRDas(StringVectorBaseType newNumRDas, NotificationChain msgs) {
		StringVectorBaseType oldNumRDas = numRDas;
		numRDas = newNumRDas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS, oldNumRDas, newNumRDas);
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
	public void setNumRDas(StringVectorBaseType newNumRDas) {
		if (newNumRDas != numRDas) {
			NotificationChain msgs = null;
			if (numRDas != null)
				msgs = ((InternalEObject) numRDas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS, null, msgs);
			if (newNumRDas != null)
				msgs = ((InternalEObject) newNumRDas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS, null, msgs);
			msgs = basicSetNumRDas(newNumRDas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS, newNumRDas,
					newNumRDas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumBetaDas() {
		return numBetaDas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumBetaDas(StringVectorBaseType newNumBetaDas, NotificationChain msgs) {
		StringVectorBaseType oldNumBetaDas = numBetaDas;
		numBetaDas = newNumBetaDas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS, oldNumBetaDas, newNumBetaDas);
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
	public void setNumBetaDas(StringVectorBaseType newNumBetaDas) {
		if (newNumBetaDas != numBetaDas) {
			NotificationChain msgs = null;
			if (numBetaDas != null)
				msgs = ((InternalEObject) numBetaDas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS, null, msgs);
			if (newNumBetaDas != null)
				msgs = ((InternalEObject) newNumBetaDas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS, null, msgs);
			msgs = basicSetNumBetaDas(newNumBetaDas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS,
					newNumBetaDas, newNumBetaDas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumPhiDasRed() {
		return numPhiDasRed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumPhiDasRed(StringVectorBaseType newNumPhiDasRed, NotificationChain msgs) {
		StringVectorBaseType oldNumPhiDasRed = numPhiDasRed;
		numPhiDasRed = newNumPhiDasRed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED, oldNumPhiDasRed, newNumPhiDasRed);
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
	public void setNumPhiDasRed(StringVectorBaseType newNumPhiDasRed) {
		if (newNumPhiDasRed != numPhiDasRed) {
			NotificationChain msgs = null;
			if (numPhiDasRed != null)
				msgs = ((InternalEObject) numPhiDasRed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED, null, msgs);
			if (newNumPhiDasRed != null)
				msgs = ((InternalEObject) newNumPhiDasRed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED, null, msgs);
			msgs = basicSetNumPhiDasRed(newNumPhiDasRed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED,
					newNumPhiDasRed, newNumPhiDasRed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumBetaDasRed() {
		return numBetaDasRed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumBetaDasRed(StringVectorBaseType newNumBetaDasRed, NotificationChain msgs) {
		StringVectorBaseType oldNumBetaDasRed = numBetaDasRed;
		numBetaDasRed = newNumBetaDasRed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED, oldNumBetaDasRed, newNumBetaDasRed);
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
	public void setNumBetaDasRed(StringVectorBaseType newNumBetaDasRed) {
		if (newNumBetaDasRed != numBetaDasRed) {
			NotificationChain msgs = null;
			if (numBetaDasRed != null)
				msgs = ((InternalEObject) numBetaDasRed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED, null, msgs);
			if (newNumBetaDasRed != null)
				msgs = ((InternalEObject) newNumBetaDasRed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED, null, msgs);
			msgs = basicSetNumBetaDasRed(newNumBetaDasRed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED,
					newNumBetaDasRed, newNumBetaDasRed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumRDrp() {
		return numRDrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumRDrp(StringVectorBaseType newNumRDrp, NotificationChain msgs) {
		StringVectorBaseType oldNumRDrp = numRDrp;
		numRDrp = newNumRDrp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP, oldNumRDrp, newNumRDrp);
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
	public void setNumRDrp(StringVectorBaseType newNumRDrp) {
		if (newNumRDrp != numRDrp) {
			NotificationChain msgs = null;
			if (numRDrp != null)
				msgs = ((InternalEObject) numRDrp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP, null, msgs);
			if (newNumRDrp != null)
				msgs = ((InternalEObject) newNumRDrp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP, null, msgs);
			msgs = basicSetNumRDrp(newNumRDrp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP, newNumRDrp,
					newNumRDrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumBetaDrp() {
		return numBetaDrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumBetaDrp(StringVectorBaseType newNumBetaDrp, NotificationChain msgs) {
		StringVectorBaseType oldNumBetaDrp = numBetaDrp;
		numBetaDrp = newNumBetaDrp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP, oldNumBetaDrp, newNumBetaDrp);
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
	public void setNumBetaDrp(StringVectorBaseType newNumBetaDrp) {
		if (newNumBetaDrp != numBetaDrp) {
			NotificationChain msgs = null;
			if (numBetaDrp != null)
				msgs = ((InternalEObject) numBetaDrp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP, null, msgs);
			if (newNumBetaDrp != null)
				msgs = ((InternalEObject) newNumBetaDrp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP, null, msgs);
			msgs = basicSetNumBetaDrp(newNumBetaDrp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP,
					newNumBetaDrp, newNumBetaDrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumPFas() {
		return numPFas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumPFas(StringVectorBaseType newNumPFas, NotificationChain msgs) {
		StringVectorBaseType oldNumPFas = numPFas;
		numPFas = newNumPFas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS, oldNumPFas, newNumPFas);
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
	public void setNumPFas(StringVectorBaseType newNumPFas) {
		if (newNumPFas != numPFas) {
			NotificationChain msgs = null;
			if (numPFas != null)
				msgs = ((InternalEObject) numPFas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS, null, msgs);
			if (newNumPFas != null)
				msgs = ((InternalEObject) newNumPFas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS, null, msgs);
			msgs = basicSetNumPFas(newNumPFas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS, newNumPFas,
					newNumPFas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumRFas() {
		return numRFas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumRFas(StringVectorBaseType newNumRFas, NotificationChain msgs) {
		StringVectorBaseType oldNumRFas = numRFas;
		numRFas = newNumRFas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS, oldNumRFas, newNumRFas);
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
	public void setNumRFas(StringVectorBaseType newNumRFas) {
		if (newNumRFas != numRFas) {
			NotificationChain msgs = null;
			if (numRFas != null)
				msgs = ((InternalEObject) numRFas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS, null, msgs);
			if (newNumRFas != null)
				msgs = ((InternalEObject) newNumRFas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS, null, msgs);
			msgs = basicSetNumRFas(newNumRFas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS, newNumRFas,
					newNumRFas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumPhiFas() {
		return numPhiFas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumPhiFas(StringVectorBaseType newNumPhiFas, NotificationChain msgs) {
		StringVectorBaseType oldNumPhiFas = numPhiFas;
		numPhiFas = newNumPhiFas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS, oldNumPhiFas, newNumPhiFas);
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
	public void setNumPhiFas(StringVectorBaseType newNumPhiFas) {
		if (newNumPhiFas != numPhiFas) {
			NotificationChain msgs = null;
			if (numPhiFas != null)
				msgs = ((InternalEObject) numPhiFas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS, null, msgs);
			if (newNumPhiFas != null)
				msgs = ((InternalEObject) newNumPhiFas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS, null, msgs);
			msgs = basicSetNumPhiFas(newNumPhiFas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS,
					newNumPhiFas, newNumPhiFas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumBetaFas() {
		return numBetaFas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumBetaFas(StringVectorBaseType newNumBetaFas, NotificationChain msgs) {
		StringVectorBaseType oldNumBetaFas = numBetaFas;
		numBetaFas = newNumBetaFas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS, oldNumBetaFas, newNumBetaFas);
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
	public void setNumBetaFas(StringVectorBaseType newNumBetaFas) {
		if (newNumBetaFas != numBetaFas) {
			NotificationChain msgs = null;
			if (numBetaFas != null)
				msgs = ((InternalEObject) numBetaFas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS, null, msgs);
			if (newNumBetaFas != null)
				msgs = ((InternalEObject) newNumBetaFas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS, null, msgs);
			msgs = basicSetNumBetaFas(newNumBetaFas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS,
					newNumBetaFas, newNumBetaFas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumPFrp() {
		return numPFrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumPFrp(StringVectorBaseType newNumPFrp, NotificationChain msgs) {
		StringVectorBaseType oldNumPFrp = numPFrp;
		numPFrp = newNumPFrp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP, oldNumPFrp, newNumPFrp);
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
	public void setNumPFrp(StringVectorBaseType newNumPFrp) {
		if (newNumPFrp != numPFrp) {
			NotificationChain msgs = null;
			if (numPFrp != null)
				msgs = ((InternalEObject) numPFrp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP, null, msgs);
			if (newNumPFrp != null)
				msgs = ((InternalEObject) newNumPFrp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP, null, msgs);
			msgs = basicSetNumPFrp(newNumPFrp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP, newNumPFrp,
					newNumPFrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumRFrp() {
		return numRFrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumRFrp(StringVectorBaseType newNumRFrp, NotificationChain msgs) {
		StringVectorBaseType oldNumRFrp = numRFrp;
		numRFrp = newNumRFrp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP, oldNumRFrp, newNumRFrp);
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
	public void setNumRFrp(StringVectorBaseType newNumRFrp) {
		if (newNumRFrp != numRFrp) {
			NotificationChain msgs = null;
			if (numRFrp != null)
				msgs = ((InternalEObject) numRFrp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP, null, msgs);
			if (newNumRFrp != null)
				msgs = ((InternalEObject) newNumRFrp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP, null, msgs);
			msgs = basicSetNumRFrp(newNumRFrp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP, newNumRFrp,
					newNumRFrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumPhiFrp() {
		return numPhiFrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumPhiFrp(StringVectorBaseType newNumPhiFrp, NotificationChain msgs) {
		StringVectorBaseType oldNumPhiFrp = numPhiFrp;
		numPhiFrp = newNumPhiFrp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP, oldNumPhiFrp, newNumPhiFrp);
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
	public void setNumPhiFrp(StringVectorBaseType newNumPhiFrp) {
		if (newNumPhiFrp != numPhiFrp) {
			NotificationChain msgs = null;
			if (numPhiFrp != null)
				msgs = ((InternalEObject) numPhiFrp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP, null, msgs);
			if (newNumPhiFrp != null)
				msgs = ((InternalEObject) newNumPhiFrp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP, null, msgs);
			msgs = basicSetNumPhiFrp(newNumPhiFrp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP,
					newNumPhiFrp, newNumPhiFrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumBetaFrp() {
		return numBetaFrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumBetaFrp(StringVectorBaseType newNumBetaFrp, NotificationChain msgs) {
		StringVectorBaseType oldNumBetaFrp = numBetaFrp;
		numBetaFrp = newNumBetaFrp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP, oldNumBetaFrp, newNumBetaFrp);
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
	public void setNumBetaFrp(StringVectorBaseType newNumBetaFrp) {
		if (newNumBetaFrp != numBetaFrp) {
			NotificationChain msgs = null;
			if (numBetaFrp != null)
				msgs = ((InternalEObject) numBetaFrp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP, null, msgs);
			if (newNumBetaFrp != null)
				msgs = ((InternalEObject) newNumBetaFrp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP, null, msgs);
			msgs = basicSetNumBetaFrp(newNumBetaFrp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP,
					newNumBetaFrp, newNumBetaFrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDenLat() {
		return denLat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenLat(StringVectorBaseType newDenLat, NotificationChain msgs) {
		StringVectorBaseType oldDenLat = denLat;
		denLat = newDenLat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT, oldDenLat, newDenLat);
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
	public void setDenLat(StringVectorBaseType newDenLat) {
		if (newDenLat != denLat) {
			NotificationChain msgs = null;
			if (denLat != null)
				msgs = ((InternalEObject) denLat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT, null, msgs);
			if (newDenLat != null)
				msgs = ((InternalEObject) newDenLat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT, null, msgs);
			msgs = basicSetDenLat(newDenLat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT, newDenLat,
					newDenLat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDenLatRed() {
		return denLatRed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenLatRed(StringVectorBaseType newDenLatRed, NotificationChain msgs) {
		StringVectorBaseType oldDenLatRed = denLatRed;
		denLatRed = newDenLatRed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED, oldDenLatRed, newDenLatRed);
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
	public void setDenLatRed(StringVectorBaseType newDenLatRed) {
		if (newDenLatRed != denLatRed) {
			NotificationChain msgs = null;
			if (denLatRed != null)
				msgs = ((InternalEObject) denLatRed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED, null, msgs);
			if (newDenLatRed != null)
				msgs = ((InternalEObject) newDenLatRed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED, null, msgs);
			msgs = basicSetDenLatRed(newDenLatRed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED,
					newDenLatRed, newDenLatRed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS:
			return basicSetNumPhiDas(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS:
			return basicSetNumRDas(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS:
			return basicSetNumBetaDas(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED:
			return basicSetNumPhiDasRed(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED:
			return basicSetNumBetaDasRed(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP:
			return basicSetNumRDrp(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP:
			return basicSetNumBetaDrp(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS:
			return basicSetNumPFas(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS:
			return basicSetNumRFas(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS:
			return basicSetNumPhiFas(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS:
			return basicSetNumBetaFas(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP:
			return basicSetNumPFrp(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP:
			return basicSetNumRFrp(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP:
			return basicSetNumPhiFrp(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP:
			return basicSetNumBetaFrp(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT:
			return basicSetDenLat(null, msgs);
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED:
			return basicSetDenLatRed(null, msgs);
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
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS:
			return getNumPhiDas();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS:
			return getNumRDas();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS:
			return getNumBetaDas();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED:
			return getNumPhiDasRed();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED:
			return getNumBetaDasRed();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP:
			return getNumRDrp();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP:
			return getNumBetaDrp();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS:
			return getNumPFas();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS:
			return getNumRFas();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS:
			return getNumPhiFas();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS:
			return getNumBetaFas();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP:
			return getNumPFrp();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP:
			return getNumRFrp();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP:
			return getNumPhiFrp();
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP:
			return getNumBetaFrp();
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT:
			return getDenLat();
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED:
			return getDenLatRed();
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
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS:
			setNumPhiDas((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS:
			setNumRDas((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS:
			setNumBetaDas((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED:
			setNumPhiDasRed((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED:
			setNumBetaDasRed((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP:
			setNumRDrp((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP:
			setNumBetaDrp((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS:
			setNumPFas((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS:
			setNumRFas((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS:
			setNumPhiFas((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS:
			setNumBetaFas((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP:
			setNumPFrp((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP:
			setNumRFrp((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP:
			setNumPhiFrp((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP:
			setNumBetaFrp((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT:
			setDenLat((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED:
			setDenLatRed((StringVectorBaseType) newValue);
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
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS:
			setNumPhiDas((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS:
			setNumRDas((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS:
			setNumBetaDas((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED:
			setNumPhiDasRed((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED:
			setNumBetaDasRed((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP:
			setNumRDrp((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP:
			setNumBetaDrp((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS:
			setNumPFas((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS:
			setNumRFas((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS:
			setNumPhiFas((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS:
			setNumBetaFas((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP:
			setNumPFrp((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP:
			setNumRFrp((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP:
			setNumPhiFrp((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP:
			setNumBetaFrp((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT:
			setDenLat((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED:
			setDenLatRed((StringVectorBaseType) null);
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
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS:
			return numPhiDas != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDAS:
			return numRDas != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS:
			return numBetaDas != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_DAS_RED:
			return numPhiDasRed != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DAS_RED:
			return numBetaDasRed != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RDRP:
			return numRDrp != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_DRP:
			return numBetaDrp != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFAS:
			return numPFas != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFAS:
			return numRFas != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FAS:
			return numPhiFas != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FAS:
			return numBetaFas != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PFRP:
			return numPFrp != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_RFRP:
			return numRFrp != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_PHI_FRP:
			return numPhiFrp != null;
		case CpacsPackage.FQ_LATERAL_TYPE__NUM_BETA_FRP:
			return numBetaFrp != null;
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT:
			return denLat != null;
		case CpacsPackage.FQ_LATERAL_TYPE__DEN_LAT_RED:
			return denLatRed != null;
		}
		return super.eIsSet(featureID);
	}

} //FqLateralTypeImpl
