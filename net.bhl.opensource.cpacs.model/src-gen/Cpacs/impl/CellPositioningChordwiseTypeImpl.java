/**
 */
package Cpacs.impl;

import Cpacs.CellPositioningChordwiseType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Positioning Chordwise Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CellPositioningChordwiseTypeImpl#getXsi1 <em>Xsi1</em>}</li>
 *   <li>{@link Cpacs.impl.CellPositioningChordwiseTypeImpl#getXsi2 <em>Xsi2</em>}</li>
 *   <li>{@link Cpacs.impl.CellPositioningChordwiseTypeImpl#getSparUID <em>Spar UID</em>}</li>
 *   <li>{@link Cpacs.impl.CellPositioningChordwiseTypeImpl#getContourCoordinate <em>Contour Coordinate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellPositioningChordwiseTypeImpl extends ComplexBaseTypeImpl implements CellPositioningChordwiseType {
	/**
	 * The cached value of the '{@link #getXsi1() <em>Xsi1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsi1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsi1;

	/**
	 * The cached value of the '{@link #getXsi2() <em>Xsi2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsi2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsi2;

	/**
	 * The cached value of the '{@link #getSparUID() <em>Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sparUID;

	/**
	 * The cached value of the '{@link #getContourCoordinate() <em>Contour Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContourCoordinate()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType contourCoordinate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellPositioningChordwiseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCellPositioningChordwiseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsi1() {
		return xsi1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsi1(DoubleBaseType newXsi1, NotificationChain msgs) {
		DoubleBaseType oldXsi1 = xsi1;
		xsi1 = newXsi1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1, oldXsi1, newXsi1);
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
	public void setXsi1(DoubleBaseType newXsi1) {
		if (newXsi1 != xsi1) {
			NotificationChain msgs = null;
			if (xsi1 != null)
				msgs = ((InternalEObject) xsi1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1, null, msgs);
			if (newXsi1 != null)
				msgs = ((InternalEObject) newXsi1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1, null, msgs);
			msgs = basicSetXsi1(newXsi1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1,
					newXsi1, newXsi1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsi2() {
		return xsi2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsi2(DoubleBaseType newXsi2, NotificationChain msgs) {
		DoubleBaseType oldXsi2 = xsi2;
		xsi2 = newXsi2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2, oldXsi2, newXsi2);
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
	public void setXsi2(DoubleBaseType newXsi2) {
		if (newXsi2 != xsi2) {
			NotificationChain msgs = null;
			if (xsi2 != null)
				msgs = ((InternalEObject) xsi2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2, null, msgs);
			if (newXsi2 != null)
				msgs = ((InternalEObject) newXsi2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2, null, msgs);
			msgs = basicSetXsi2(newXsi2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2,
					newXsi2, newXsi2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSparUID() {
		return sparUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparUID(StringUIDBaseType newSparUID, NotificationChain msgs) {
		StringUIDBaseType oldSparUID = sparUID;
		sparUID = newSparUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID, oldSparUID, newSparUID);
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
	public void setSparUID(StringUIDBaseType newSparUID) {
		if (newSparUID != sparUID) {
			NotificationChain msgs = null;
			if (sparUID != null)
				msgs = ((InternalEObject) sparUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID, null, msgs);
			if (newSparUID != null)
				msgs = ((InternalEObject) newSparUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID, null, msgs);
			msgs = basicSetSparUID(newSparUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID, newSparUID, newSparUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getContourCoordinate() {
		return contourCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContourCoordinate(DoubleBaseType newContourCoordinate, NotificationChain msgs) {
		DoubleBaseType oldContourCoordinate = contourCoordinate;
		contourCoordinate = newContourCoordinate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE, oldContourCoordinate,
					newContourCoordinate);
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
	public void setContourCoordinate(DoubleBaseType newContourCoordinate) {
		if (newContourCoordinate != contourCoordinate) {
			NotificationChain msgs = null;
			if (contourCoordinate != null)
				msgs = ((InternalEObject) contourCoordinate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE, null,
						msgs);
			if (newContourCoordinate != null)
				msgs = ((InternalEObject) newContourCoordinate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE, null,
						msgs);
			msgs = basicSetContourCoordinate(newContourCoordinate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE, newContourCoordinate,
					newContourCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1:
			return basicSetXsi1(null, msgs);
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2:
			return basicSetXsi2(null, msgs);
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID:
			return basicSetSparUID(null, msgs);
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE:
			return basicSetContourCoordinate(null, msgs);
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
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1:
			return getXsi1();
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2:
			return getXsi2();
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID:
			return getSparUID();
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE:
			return getContourCoordinate();
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
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1:
			setXsi1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2:
			setXsi2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID:
			setSparUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE:
			setContourCoordinate((DoubleBaseType) newValue);
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
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1:
			setXsi1((DoubleBaseType) null);
			return;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2:
			setXsi2((DoubleBaseType) null);
			return;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID:
			setSparUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE:
			setContourCoordinate((DoubleBaseType) null);
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
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI1:
			return xsi1 != null;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__XSI2:
			return xsi2 != null;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__SPAR_UID:
			return sparUID != null;
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE__CONTOUR_COORDINATE:
			return contourCoordinate != null;
		}
		return super.eIsSet(featureID);
	}

} //CellPositioningChordwiseTypeImpl
