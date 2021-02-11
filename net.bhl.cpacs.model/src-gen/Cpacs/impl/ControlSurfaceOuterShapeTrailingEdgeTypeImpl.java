/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceBorderTrailingEdgeType;
import Cpacs.ControlSurfaceContoursType;
import Cpacs.ControlSurfaceOuterShapeTrailingEdgeType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Outer Shape Trailing Edge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceOuterShapeTrailingEdgeTypeImpl#getInnerBorder <em>Inner Border</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceOuterShapeTrailingEdgeTypeImpl#getOuterBorder <em>Outer Border</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceOuterShapeTrailingEdgeTypeImpl#getIntermediateAirfoils <em>Intermediate Airfoils</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceOuterShapeTrailingEdgeTypeImpl extends ComplexBaseTypeImpl
		implements ControlSurfaceOuterShapeTrailingEdgeType {
	/**
	 * The cached value of the '{@link #getInnerBorder() <em>Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBorder()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceBorderTrailingEdgeType innerBorder;

	/**
	 * The cached value of the '{@link #getOuterBorder() <em>Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBorder()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceBorderTrailingEdgeType outerBorder;

	/**
	 * The cached value of the '{@link #getIntermediateAirfoils() <em>Intermediate Airfoils</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateAirfoils()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceContoursType intermediateAirfoils;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceOuterShapeTrailingEdgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceOuterShapeTrailingEdgeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceBorderTrailingEdgeType getInnerBorder() {
		return innerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBorder(ControlSurfaceBorderTrailingEdgeType newInnerBorder,
			NotificationChain msgs) {
		ControlSurfaceBorderTrailingEdgeType oldInnerBorder = innerBorder;
		innerBorder = newInnerBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER, oldInnerBorder,
					newInnerBorder);
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
	public void setInnerBorder(ControlSurfaceBorderTrailingEdgeType newInnerBorder) {
		if (newInnerBorder != innerBorder) {
			NotificationChain msgs = null;
			if (innerBorder != null)
				msgs = ((InternalEObject) innerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER,
						null, msgs);
			if (newInnerBorder != null)
				msgs = ((InternalEObject) newInnerBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER,
						null, msgs);
			msgs = basicSetInnerBorder(newInnerBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER, newInnerBorder,
					newInnerBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceBorderTrailingEdgeType getOuterBorder() {
		return outerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBorder(ControlSurfaceBorderTrailingEdgeType newOuterBorder,
			NotificationChain msgs) {
		ControlSurfaceBorderTrailingEdgeType oldOuterBorder = outerBorder;
		outerBorder = newOuterBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER, oldOuterBorder,
					newOuterBorder);
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
	public void setOuterBorder(ControlSurfaceBorderTrailingEdgeType newOuterBorder) {
		if (newOuterBorder != outerBorder) {
			NotificationChain msgs = null;
			if (outerBorder != null)
				msgs = ((InternalEObject) outerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER,
						null, msgs);
			if (newOuterBorder != null)
				msgs = ((InternalEObject) newOuterBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER,
						null, msgs);
			msgs = basicSetOuterBorder(newOuterBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER, newOuterBorder,
					newOuterBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceContoursType getIntermediateAirfoils() {
		return intermediateAirfoils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntermediateAirfoils(ControlSurfaceContoursType newIntermediateAirfoils,
			NotificationChain msgs) {
		ControlSurfaceContoursType oldIntermediateAirfoils = intermediateAirfoils;
		intermediateAirfoils = newIntermediateAirfoils;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS,
					oldIntermediateAirfoils, newIntermediateAirfoils);
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
	public void setIntermediateAirfoils(ControlSurfaceContoursType newIntermediateAirfoils) {
		if (newIntermediateAirfoils != intermediateAirfoils) {
			NotificationChain msgs = null;
			if (intermediateAirfoils != null)
				msgs = ((InternalEObject) intermediateAirfoils).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS,
						null, msgs);
			if (newIntermediateAirfoils != null)
				msgs = ((InternalEObject) newIntermediateAirfoils).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS,
						null, msgs);
			msgs = basicSetIntermediateAirfoils(newIntermediateAirfoils, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS,
					newIntermediateAirfoils, newIntermediateAirfoils));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER:
			return basicSetInnerBorder(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER:
			return basicSetOuterBorder(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS:
			return basicSetIntermediateAirfoils(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER:
			return getInnerBorder();
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER:
			return getOuterBorder();
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS:
			return getIntermediateAirfoils();
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
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER:
			setInnerBorder((ControlSurfaceBorderTrailingEdgeType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER:
			setOuterBorder((ControlSurfaceBorderTrailingEdgeType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS:
			setIntermediateAirfoils((ControlSurfaceContoursType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER:
			setInnerBorder((ControlSurfaceBorderTrailingEdgeType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER:
			setOuterBorder((ControlSurfaceBorderTrailingEdgeType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS:
			setIntermediateAirfoils((ControlSurfaceContoursType) null);
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
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INNER_BORDER:
			return innerBorder != null;
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__OUTER_BORDER:
			return outerBorder != null;
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE__INTERMEDIATE_AIRFOILS:
			return intermediateAirfoils != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceOuterShapeTrailingEdgeTypeImpl
