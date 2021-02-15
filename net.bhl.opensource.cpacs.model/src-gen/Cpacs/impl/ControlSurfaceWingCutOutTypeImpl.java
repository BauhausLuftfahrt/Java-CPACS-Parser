/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceSkinCutOutBorderType;
import Cpacs.ControlSurfaceSkinCutOutType;
import Cpacs.ControlSurfaceWingCutOutType;
import Cpacs.CpacsPackage;
import Cpacs.CutOutControlPointsType;
import Cpacs.CutOutProfilesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Wing Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceWingCutOutTypeImpl#getUpperSkin <em>Upper Skin</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceWingCutOutTypeImpl#getLowerSkin <em>Lower Skin</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceWingCutOutTypeImpl#getCutOutProfileControlPoint <em>Cut Out Profile Control Point</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceWingCutOutTypeImpl#getCutOutProfiles <em>Cut Out Profiles</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceWingCutOutTypeImpl#getInnerBorder <em>Inner Border</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceWingCutOutTypeImpl#getOuterBorder <em>Outer Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceWingCutOutTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceWingCutOutType {
	/**
	 * The cached value of the '{@link #getUpperSkin() <em>Upper Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperSkin()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceSkinCutOutType upperSkin;

	/**
	 * The cached value of the '{@link #getLowerSkin() <em>Lower Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerSkin()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceSkinCutOutType lowerSkin;

	/**
	 * The cached value of the '{@link #getCutOutProfileControlPoint() <em>Cut Out Profile Control Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutProfileControlPoint()
	 * @generated
	 * @ordered
	 */
	protected CutOutControlPointsType cutOutProfileControlPoint;

	/**
	 * The cached value of the '{@link #getCutOutProfiles() <em>Cut Out Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutProfiles()
	 * @generated
	 * @ordered
	 */
	protected CutOutProfilesType cutOutProfiles;

	/**
	 * The cached value of the '{@link #getInnerBorder() <em>Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBorder()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceSkinCutOutBorderType innerBorder;

	/**
	 * The cached value of the '{@link #getOuterBorder() <em>Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBorder()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceSkinCutOutBorderType outerBorder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceWingCutOutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceWingCutOutType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceSkinCutOutType getUpperSkin() {
		return upperSkin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperSkin(ControlSurfaceSkinCutOutType newUpperSkin, NotificationChain msgs) {
		ControlSurfaceSkinCutOutType oldUpperSkin = upperSkin;
		upperSkin = newUpperSkin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN, oldUpperSkin, newUpperSkin);
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
	public void setUpperSkin(ControlSurfaceSkinCutOutType newUpperSkin) {
		if (newUpperSkin != upperSkin) {
			NotificationChain msgs = null;
			if (upperSkin != null)
				msgs = ((InternalEObject) upperSkin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN, null,
						msgs);
			if (newUpperSkin != null)
				msgs = ((InternalEObject) newUpperSkin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN, null,
						msgs);
			msgs = basicSetUpperSkin(newUpperSkin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN, newUpperSkin, newUpperSkin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceSkinCutOutType getLowerSkin() {
		return lowerSkin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerSkin(ControlSurfaceSkinCutOutType newLowerSkin, NotificationChain msgs) {
		ControlSurfaceSkinCutOutType oldLowerSkin = lowerSkin;
		lowerSkin = newLowerSkin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN, oldLowerSkin, newLowerSkin);
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
	public void setLowerSkin(ControlSurfaceSkinCutOutType newLowerSkin) {
		if (newLowerSkin != lowerSkin) {
			NotificationChain msgs = null;
			if (lowerSkin != null)
				msgs = ((InternalEObject) lowerSkin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN, null,
						msgs);
			if (newLowerSkin != null)
				msgs = ((InternalEObject) newLowerSkin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN, null,
						msgs);
			msgs = basicSetLowerSkin(newLowerSkin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN, newLowerSkin, newLowerSkin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutControlPointsType getCutOutProfileControlPoint() {
		return cutOutProfileControlPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutOutProfileControlPoint(CutOutControlPointsType newCutOutProfileControlPoint,
			NotificationChain msgs) {
		CutOutControlPointsType oldCutOutProfileControlPoint = cutOutProfileControlPoint;
		cutOutProfileControlPoint = newCutOutProfileControlPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT,
					oldCutOutProfileControlPoint, newCutOutProfileControlPoint);
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
	public void setCutOutProfileControlPoint(CutOutControlPointsType newCutOutProfileControlPoint) {
		if (newCutOutProfileControlPoint != cutOutProfileControlPoint) {
			NotificationChain msgs = null;
			if (cutOutProfileControlPoint != null)
				msgs = ((InternalEObject) cutOutProfileControlPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT,
						null, msgs);
			if (newCutOutProfileControlPoint != null)
				msgs = ((InternalEObject) newCutOutProfileControlPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT,
						null, msgs);
			msgs = basicSetCutOutProfileControlPoint(newCutOutProfileControlPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT,
					newCutOutProfileControlPoint, newCutOutProfileControlPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutProfilesType getCutOutProfiles() {
		return cutOutProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutOutProfiles(CutOutProfilesType newCutOutProfiles, NotificationChain msgs) {
		CutOutProfilesType oldCutOutProfiles = cutOutProfiles;
		cutOutProfiles = newCutOutProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES, oldCutOutProfiles,
					newCutOutProfiles);
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
	public void setCutOutProfiles(CutOutProfilesType newCutOutProfiles) {
		if (newCutOutProfiles != cutOutProfiles) {
			NotificationChain msgs = null;
			if (cutOutProfiles != null)
				msgs = ((InternalEObject) cutOutProfiles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES, null,
						msgs);
			if (newCutOutProfiles != null)
				msgs = ((InternalEObject) newCutOutProfiles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES, null,
						msgs);
			msgs = basicSetCutOutProfiles(newCutOutProfiles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES, newCutOutProfiles,
					newCutOutProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceSkinCutOutBorderType getInnerBorder() {
		return innerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBorder(ControlSurfaceSkinCutOutBorderType newInnerBorder,
			NotificationChain msgs) {
		ControlSurfaceSkinCutOutBorderType oldInnerBorder = innerBorder;
		innerBorder = newInnerBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER, oldInnerBorder, newInnerBorder);
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
	public void setInnerBorder(ControlSurfaceSkinCutOutBorderType newInnerBorder) {
		if (newInnerBorder != innerBorder) {
			NotificationChain msgs = null;
			if (innerBorder != null)
				msgs = ((InternalEObject) innerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER, null,
						msgs);
			if (newInnerBorder != null)
				msgs = ((InternalEObject) newInnerBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER, null,
						msgs);
			msgs = basicSetInnerBorder(newInnerBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER, newInnerBorder, newInnerBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceSkinCutOutBorderType getOuterBorder() {
		return outerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBorder(ControlSurfaceSkinCutOutBorderType newOuterBorder,
			NotificationChain msgs) {
		ControlSurfaceSkinCutOutBorderType oldOuterBorder = outerBorder;
		outerBorder = newOuterBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER, oldOuterBorder, newOuterBorder);
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
	public void setOuterBorder(ControlSurfaceSkinCutOutBorderType newOuterBorder) {
		if (newOuterBorder != outerBorder) {
			NotificationChain msgs = null;
			if (outerBorder != null)
				msgs = ((InternalEObject) outerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER, null,
						msgs);
			if (newOuterBorder != null)
				msgs = ((InternalEObject) newOuterBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER, null,
						msgs);
			msgs = basicSetOuterBorder(newOuterBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER, newOuterBorder, newOuterBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN:
			return basicSetUpperSkin(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN:
			return basicSetLowerSkin(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT:
			return basicSetCutOutProfileControlPoint(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES:
			return basicSetCutOutProfiles(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER:
			return basicSetInnerBorder(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER:
			return basicSetOuterBorder(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN:
			return getUpperSkin();
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN:
			return getLowerSkin();
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT:
			return getCutOutProfileControlPoint();
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES:
			return getCutOutProfiles();
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER:
			return getInnerBorder();
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER:
			return getOuterBorder();
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
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN:
			setUpperSkin((ControlSurfaceSkinCutOutType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN:
			setLowerSkin((ControlSurfaceSkinCutOutType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT:
			setCutOutProfileControlPoint((CutOutControlPointsType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES:
			setCutOutProfiles((CutOutProfilesType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER:
			setInnerBorder((ControlSurfaceSkinCutOutBorderType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER:
			setOuterBorder((ControlSurfaceSkinCutOutBorderType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN:
			setUpperSkin((ControlSurfaceSkinCutOutType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN:
			setLowerSkin((ControlSurfaceSkinCutOutType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT:
			setCutOutProfileControlPoint((CutOutControlPointsType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES:
			setCutOutProfiles((CutOutProfilesType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER:
			setInnerBorder((ControlSurfaceSkinCutOutBorderType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER:
			setOuterBorder((ControlSurfaceSkinCutOutBorderType) null);
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
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__UPPER_SKIN:
			return upperSkin != null;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__LOWER_SKIN:
			return lowerSkin != null;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILE_CONTROL_POINT:
			return cutOutProfileControlPoint != null;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__CUT_OUT_PROFILES:
			return cutOutProfiles != null;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__INNER_BORDER:
			return innerBorder != null;
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE__OUTER_BORDER:
			return outerBorder != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceWingCutOutTypeImpl
