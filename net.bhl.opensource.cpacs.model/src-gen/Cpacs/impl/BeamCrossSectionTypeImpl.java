/**
 */
package Cpacs.impl;

import Cpacs.BeamCrossSectionType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beam Cross Section Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BeamCrossSectionTypeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link Cpacs.impl.BeamCrossSectionTypeImpl#getXMin <em>XMin</em>}</li>
 *   <li>{@link Cpacs.impl.BeamCrossSectionTypeImpl#getXMax <em>XMax</em>}</li>
 *   <li>{@link Cpacs.impl.BeamCrossSectionTypeImpl#getYMin <em>YMin</em>}</li>
 *   <li>{@link Cpacs.impl.BeamCrossSectionTypeImpl#getYMax <em>YMax</em>}</li>
 *   <li>{@link Cpacs.impl.BeamCrossSectionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeamCrossSectionTypeImpl extends ComplexBaseTypeImpl implements BeamCrossSectionType {
	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType area;

	/**
	 * The cached value of the '{@link #getXMin() <em>XMin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMin()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xMin;

	/**
	 * The cached value of the '{@link #getXMax() <em>XMax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xMax;

	/**
	 * The cached value of the '{@link #getYMin() <em>YMin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMin()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType yMin;

	/**
	 * The cached value of the '{@link #getYMax() <em>YMax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMax()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType yMax;

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
	protected BeamCrossSectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBeamCrossSectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(DoubleBaseType newArea, NotificationChain msgs) {
		DoubleBaseType oldArea = area;
		area = newArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA, oldArea, newArea);
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
	public void setArea(DoubleBaseType newArea) {
		if (newArea != area) {
			NotificationChain msgs = null;
			if (area != null)
				msgs = ((InternalEObject) area).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA, null, msgs);
			if (newArea != null)
				msgs = ((InternalEObject) newArea).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA, null, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA, newArea,
					newArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXMin() {
		return xMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMin(DoubleBaseType newXMin, NotificationChain msgs) {
		DoubleBaseType oldXMin = xMin;
		xMin = newXMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN, oldXMin, newXMin);
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
	public void setXMin(DoubleBaseType newXMin) {
		if (newXMin != xMin) {
			NotificationChain msgs = null;
			if (xMin != null)
				msgs = ((InternalEObject) xMin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN, null, msgs);
			if (newXMin != null)
				msgs = ((InternalEObject) newXMin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN, null, msgs);
			msgs = basicSetXMin(newXMin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN, newXMin,
					newXMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXMax() {
		return xMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMax(DoubleBaseType newXMax, NotificationChain msgs) {
		DoubleBaseType oldXMax = xMax;
		xMax = newXMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX, oldXMax, newXMax);
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
	public void setXMax(DoubleBaseType newXMax) {
		if (newXMax != xMax) {
			NotificationChain msgs = null;
			if (xMax != null)
				msgs = ((InternalEObject) xMax).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX, null, msgs);
			if (newXMax != null)
				msgs = ((InternalEObject) newXMax).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX, null, msgs);
			msgs = basicSetXMax(newXMax, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX, newXMax,
					newXMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getYMin() {
		return yMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYMin(DoubleBaseType newYMin, NotificationChain msgs) {
		DoubleBaseType oldYMin = yMin;
		yMin = newYMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN, oldYMin, newYMin);
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
	public void setYMin(DoubleBaseType newYMin) {
		if (newYMin != yMin) {
			NotificationChain msgs = null;
			if (yMin != null)
				msgs = ((InternalEObject) yMin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN, null, msgs);
			if (newYMin != null)
				msgs = ((InternalEObject) newYMin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN, null, msgs);
			msgs = basicSetYMin(newYMin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN, newYMin,
					newYMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getYMax() {
		return yMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYMax(DoubleBaseType newYMax, NotificationChain msgs) {
		DoubleBaseType oldYMax = yMax;
		yMax = newYMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX, oldYMax, newYMax);
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
	public void setYMax(DoubleBaseType newYMax) {
		if (newYMax != yMax) {
			NotificationChain msgs = null;
			if (yMax != null)
				msgs = ((InternalEObject) yMax).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX, null, msgs);
			if (newYMax != null)
				msgs = ((InternalEObject) newYMax).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX, null, msgs);
			msgs = basicSetYMax(newYMax, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX, newYMax,
					newYMax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BEAM_CROSS_SECTION_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA:
			return basicSetArea(null, msgs);
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN:
			return basicSetXMin(null, msgs);
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX:
			return basicSetXMax(null, msgs);
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN:
			return basicSetYMin(null, msgs);
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX:
			return basicSetYMax(null, msgs);
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
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA:
			return getArea();
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN:
			return getXMin();
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX:
			return getXMax();
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN:
			return getYMin();
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX:
			return getYMax();
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__UID:
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
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA:
			setArea((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN:
			setXMin((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX:
			setXMax((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN:
			setYMin((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX:
			setYMax((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__UID:
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
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA:
			setArea((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN:
			setXMin((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX:
			setXMax((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN:
			setYMin((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX:
			setYMax((DoubleBaseType) null);
			return;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__UID:
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
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__AREA:
			return area != null;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMIN:
			return xMin != null;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__XMAX:
			return xMax != null;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMIN:
			return yMin != null;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__YMAX:
			return yMax != null;
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE__UID:
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

} //BeamCrossSectionTypeImpl
