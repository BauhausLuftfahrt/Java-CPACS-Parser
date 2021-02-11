/**
 */
package Cpacs.impl;

import Cpacs.ContourReferenceType;
import Cpacs.ControlSurfaceBorderLeadingEdgeType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EtaIsoLineType;
import Cpacs.LeadingEdgeHollowType;
import Cpacs.LeadingEdgeShapeType;
import Cpacs.XsiIsoLineType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Border Leading Edge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderLeadingEdgeTypeImpl#getEtaLE <em>Eta LE</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderLeadingEdgeTypeImpl#getEtaTE <em>Eta TE</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderLeadingEdgeTypeImpl#getXsiTE <em>Xsi TE</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderLeadingEdgeTypeImpl#getXsiTEUpper <em>Xsi TE Upper</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderLeadingEdgeTypeImpl#getXsiTELower <em>Xsi TE Lower</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderLeadingEdgeTypeImpl#getInnerShape <em>Inner Shape</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderLeadingEdgeTypeImpl#getLeadingEdgeShape <em>Leading Edge Shape</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderLeadingEdgeTypeImpl#getAirfoil <em>Airfoil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceBorderLeadingEdgeTypeImpl extends ComplexBaseTypeImpl
		implements ControlSurfaceBorderLeadingEdgeType {
	/**
	 * The cached value of the '{@link #getEtaLE() <em>Eta LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtaLE()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType etaLE;

	/**
	 * The cached value of the '{@link #getEtaTE() <em>Eta TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtaTE()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType etaTE;

	/**
	 * The cached value of the '{@link #getXsiTE() <em>Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiTE()
	 * @generated
	 * @ordered
	 */
	protected XsiIsoLineType xsiTE;

	/**
	 * The cached value of the '{@link #getXsiTEUpper() <em>Xsi TE Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiTEUpper()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsiTEUpper;

	/**
	 * The cached value of the '{@link #getXsiTELower() <em>Xsi TE Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiTELower()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsiTELower;

	/**
	 * The cached value of the '{@link #getInnerShape() <em>Inner Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerShape()
	 * @generated
	 * @ordered
	 */
	protected LeadingEdgeHollowType innerShape;

	/**
	 * The cached value of the '{@link #getLeadingEdgeShape() <em>Leading Edge Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadingEdgeShape()
	 * @generated
	 * @ordered
	 */
	protected LeadingEdgeShapeType leadingEdgeShape;

	/**
	 * The cached value of the '{@link #getAirfoil() <em>Airfoil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirfoil()
	 * @generated
	 * @ordered
	 */
	protected ContourReferenceType airfoil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceBorderLeadingEdgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceBorderLeadingEdgeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEtaLE() {
		return etaLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtaLE(EtaIsoLineType newEtaLE, NotificationChain msgs) {
		EtaIsoLineType oldEtaLE = etaLE;
		etaLE = newEtaLE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE, oldEtaLE, newEtaLE);
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
	public void setEtaLE(EtaIsoLineType newEtaLE) {
		if (newEtaLE != etaLE) {
			NotificationChain msgs = null;
			if (etaLE != null)
				msgs = ((InternalEObject) etaLE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE, null,
						msgs);
			if (newEtaLE != null)
				msgs = ((InternalEObject) newEtaLE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE, null,
						msgs);
			msgs = basicSetEtaLE(newEtaLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE, newEtaLE, newEtaLE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEtaTE() {
		return etaTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtaTE(EtaIsoLineType newEtaTE, NotificationChain msgs) {
		EtaIsoLineType oldEtaTE = etaTE;
		etaTE = newEtaTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE, oldEtaTE, newEtaTE);
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
	public void setEtaTE(EtaIsoLineType newEtaTE) {
		if (newEtaTE != etaTE) {
			NotificationChain msgs = null;
			if (etaTE != null)
				msgs = ((InternalEObject) etaTE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE, null,
						msgs);
			if (newEtaTE != null)
				msgs = ((InternalEObject) newEtaTE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE, null,
						msgs);
			msgs = basicSetEtaTE(newEtaTE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE, newEtaTE, newEtaTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XsiIsoLineType getXsiTE() {
		return xsiTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiTE(XsiIsoLineType newXsiTE, NotificationChain msgs) {
		XsiIsoLineType oldXsiTE = xsiTE;
		xsiTE = newXsiTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE, oldXsiTE, newXsiTE);
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
	public void setXsiTE(XsiIsoLineType newXsiTE) {
		if (newXsiTE != xsiTE) {
			NotificationChain msgs = null;
			if (xsiTE != null)
				msgs = ((InternalEObject) xsiTE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE, null,
						msgs);
			if (newXsiTE != null)
				msgs = ((InternalEObject) newXsiTE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE, null,
						msgs);
			msgs = basicSetXsiTE(newXsiTE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE, newXsiTE, newXsiTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsiTEUpper() {
		return xsiTEUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiTEUpper(DoubleBaseType newXsiTEUpper, NotificationChain msgs) {
		DoubleBaseType oldXsiTEUpper = xsiTEUpper;
		xsiTEUpper = newXsiTEUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER, oldXsiTEUpper, newXsiTEUpper);
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
	public void setXsiTEUpper(DoubleBaseType newXsiTEUpper) {
		if (newXsiTEUpper != xsiTEUpper) {
			NotificationChain msgs = null;
			if (xsiTEUpper != null)
				msgs = ((InternalEObject) xsiTEUpper).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER,
						null, msgs);
			if (newXsiTEUpper != null)
				msgs = ((InternalEObject) newXsiTEUpper).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER,
						null, msgs);
			msgs = basicSetXsiTEUpper(newXsiTEUpper, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER, newXsiTEUpper, newXsiTEUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsiTELower() {
		return xsiTELower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiTELower(DoubleBaseType newXsiTELower, NotificationChain msgs) {
		DoubleBaseType oldXsiTELower = xsiTELower;
		xsiTELower = newXsiTELower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER, oldXsiTELower, newXsiTELower);
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
	public void setXsiTELower(DoubleBaseType newXsiTELower) {
		if (newXsiTELower != xsiTELower) {
			NotificationChain msgs = null;
			if (xsiTELower != null)
				msgs = ((InternalEObject) xsiTELower).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER,
						null, msgs);
			if (newXsiTELower != null)
				msgs = ((InternalEObject) newXsiTELower).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER,
						null, msgs);
			msgs = basicSetXsiTELower(newXsiTELower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER, newXsiTELower, newXsiTELower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeadingEdgeHollowType getInnerShape() {
		return innerShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerShape(LeadingEdgeHollowType newInnerShape, NotificationChain msgs) {
		LeadingEdgeHollowType oldInnerShape = innerShape;
		innerShape = newInnerShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE, oldInnerShape, newInnerShape);
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
	public void setInnerShape(LeadingEdgeHollowType newInnerShape) {
		if (newInnerShape != innerShape) {
			NotificationChain msgs = null;
			if (innerShape != null)
				msgs = ((InternalEObject) innerShape).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE,
						null, msgs);
			if (newInnerShape != null)
				msgs = ((InternalEObject) newInnerShape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE,
						null, msgs);
			msgs = basicSetInnerShape(newInnerShape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE, newInnerShape, newInnerShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeadingEdgeShapeType getLeadingEdgeShape() {
		return leadingEdgeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeadingEdgeShape(LeadingEdgeShapeType newLeadingEdgeShape,
			NotificationChain msgs) {
		LeadingEdgeShapeType oldLeadingEdgeShape = leadingEdgeShape;
		leadingEdgeShape = newLeadingEdgeShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE, oldLeadingEdgeShape,
					newLeadingEdgeShape);
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
	public void setLeadingEdgeShape(LeadingEdgeShapeType newLeadingEdgeShape) {
		if (newLeadingEdgeShape != leadingEdgeShape) {
			NotificationChain msgs = null;
			if (leadingEdgeShape != null)
				msgs = ((InternalEObject) leadingEdgeShape).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE,
						null, msgs);
			if (newLeadingEdgeShape != null)
				msgs = ((InternalEObject) newLeadingEdgeShape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE,
						null, msgs);
			msgs = basicSetLeadingEdgeShape(newLeadingEdgeShape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE, newLeadingEdgeShape,
					newLeadingEdgeShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContourReferenceType getAirfoil() {
		return airfoil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirfoil(ContourReferenceType newAirfoil, NotificationChain msgs) {
		ContourReferenceType oldAirfoil = airfoil;
		airfoil = newAirfoil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL, oldAirfoil, newAirfoil);
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
	public void setAirfoil(ContourReferenceType newAirfoil) {
		if (newAirfoil != airfoil) {
			NotificationChain msgs = null;
			if (airfoil != null)
				msgs = ((InternalEObject) airfoil).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL, null,
						msgs);
			if (newAirfoil != null)
				msgs = ((InternalEObject) newAirfoil).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL, null,
						msgs);
			msgs = basicSetAirfoil(newAirfoil, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL, newAirfoil, newAirfoil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE:
			return basicSetEtaLE(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE:
			return basicSetEtaTE(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE:
			return basicSetXsiTE(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER:
			return basicSetXsiTEUpper(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER:
			return basicSetXsiTELower(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE:
			return basicSetInnerShape(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			return basicSetLeadingEdgeShape(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL:
			return basicSetAirfoil(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE:
			return getEtaLE();
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE:
			return getEtaTE();
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE:
			return getXsiTE();
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER:
			return getXsiTEUpper();
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER:
			return getXsiTELower();
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE:
			return getInnerShape();
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			return getLeadingEdgeShape();
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL:
			return getAirfoil();
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
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE:
			setEtaLE((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE:
			setEtaTE((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE:
			setXsiTE((XsiIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER:
			setXsiTEUpper((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER:
			setXsiTELower((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE:
			setInnerShape((LeadingEdgeHollowType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			setLeadingEdgeShape((LeadingEdgeShapeType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL:
			setAirfoil((ContourReferenceType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE:
			setEtaLE((EtaIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE:
			setEtaTE((EtaIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE:
			setXsiTE((XsiIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER:
			setXsiTEUpper((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER:
			setXsiTELower((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE:
			setInnerShape((LeadingEdgeHollowType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			setLeadingEdgeShape((LeadingEdgeShapeType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL:
			setAirfoil((ContourReferenceType) null);
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
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_LE:
			return etaLE != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__ETA_TE:
			return etaTE != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE:
			return xsiTE != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_UPPER:
			return xsiTEUpper != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__XSI_TE_LOWER:
			return xsiTELower != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__INNER_SHAPE:
			return innerShape != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			return leadingEdgeShape != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE__AIRFOIL:
			return airfoil != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceBorderLeadingEdgeTypeImpl
