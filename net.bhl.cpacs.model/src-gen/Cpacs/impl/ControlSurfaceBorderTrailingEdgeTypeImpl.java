/**
 */
package Cpacs.impl;

import Cpacs.ContourReferenceType;
import Cpacs.ControlSurfaceBorderTrailingEdgeType;
import Cpacs.CpacsPackage;
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
 * An implementation of the model object '<em><b>Control Surface Border Trailing Edge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderTrailingEdgeTypeImpl#getEtaLE <em>Eta LE</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderTrailingEdgeTypeImpl#getEtaTE <em>Eta TE</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderTrailingEdgeTypeImpl#getXsiLE <em>Xsi LE</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderTrailingEdgeTypeImpl#getInnerShape <em>Inner Shape</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderTrailingEdgeTypeImpl#getLeadingEdgeShape <em>Leading Edge Shape</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceBorderTrailingEdgeTypeImpl#getAirfoil <em>Airfoil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceBorderTrailingEdgeTypeImpl extends ComplexBaseTypeImpl
		implements ControlSurfaceBorderTrailingEdgeType {
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
	 * The cached value of the '{@link #getXsiLE() <em>Xsi LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiLE()
	 * @generated
	 * @ordered
	 */
	protected XsiIsoLineType xsiLE;

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
	protected ControlSurfaceBorderTrailingEdgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceBorderTrailingEdgeType();
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
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE, oldEtaLE, newEtaLE);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE, null,
						msgs);
			if (newEtaLE != null)
				msgs = ((InternalEObject) newEtaLE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE, null,
						msgs);
			msgs = basicSetEtaLE(newEtaLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE, newEtaLE, newEtaLE));
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
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE, oldEtaTE, newEtaTE);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE, null,
						msgs);
			if (newEtaTE != null)
				msgs = ((InternalEObject) newEtaTE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE, null,
						msgs);
			msgs = basicSetEtaTE(newEtaTE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE, newEtaTE, newEtaTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XsiIsoLineType getXsiLE() {
		return xsiLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiLE(XsiIsoLineType newXsiLE, NotificationChain msgs) {
		XsiIsoLineType oldXsiLE = xsiLE;
		xsiLE = newXsiLE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE, oldXsiLE, newXsiLE);
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
	public void setXsiLE(XsiIsoLineType newXsiLE) {
		if (newXsiLE != xsiLE) {
			NotificationChain msgs = null;
			if (xsiLE != null)
				msgs = ((InternalEObject) xsiLE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE, null,
						msgs);
			if (newXsiLE != null)
				msgs = ((InternalEObject) newXsiLE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE, null,
						msgs);
			msgs = basicSetXsiLE(newXsiLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE, newXsiLE, newXsiLE));
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
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE, oldInnerShape, newInnerShape);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE,
						null, msgs);
			if (newInnerShape != null)
				msgs = ((InternalEObject) newInnerShape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE,
						null, msgs);
			msgs = basicSetInnerShape(newInnerShape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE, newInnerShape, newInnerShape));
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
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE, oldLeadingEdgeShape,
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
								- CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE,
						null, msgs);
			if (newLeadingEdgeShape != null)
				msgs = ((InternalEObject) newLeadingEdgeShape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE,
						null, msgs);
			msgs = basicSetLeadingEdgeShape(newLeadingEdgeShape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE, newLeadingEdgeShape,
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
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL, oldAirfoil, newAirfoil);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL, null,
						msgs);
			if (newAirfoil != null)
				msgs = ((InternalEObject) newAirfoil).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL, null,
						msgs);
			msgs = basicSetAirfoil(newAirfoil, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL, newAirfoil, newAirfoil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE:
			return basicSetEtaLE(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE:
			return basicSetEtaTE(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE:
			return basicSetXsiLE(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE:
			return basicSetInnerShape(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			return basicSetLeadingEdgeShape(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL:
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
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE:
			return getEtaLE();
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE:
			return getEtaTE();
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE:
			return getXsiLE();
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE:
			return getInnerShape();
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			return getLeadingEdgeShape();
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL:
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
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE:
			setEtaLE((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE:
			setEtaTE((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE:
			setXsiLE((XsiIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE:
			setInnerShape((LeadingEdgeHollowType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			setLeadingEdgeShape((LeadingEdgeShapeType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL:
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
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE:
			setEtaLE((EtaIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE:
			setEtaTE((EtaIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE:
			setXsiLE((XsiIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE:
			setInnerShape((LeadingEdgeHollowType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			setLeadingEdgeShape((LeadingEdgeShapeType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL:
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
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_LE:
			return etaLE != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__ETA_TE:
			return etaTE != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__XSI_LE:
			return xsiLE != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__INNER_SHAPE:
			return innerShape != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__LEADING_EDGE_SHAPE:
			return leadingEdgeShape != null;
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE__AIRFOIL:
			return airfoil != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceBorderTrailingEdgeTypeImpl
