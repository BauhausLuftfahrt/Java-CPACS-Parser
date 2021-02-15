/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.Cst2DType;
import Cpacs.DoubleBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cst2 DType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.Cst2DTypeImpl#getPsi <em>Psi</em>}</li>
 *   <li>{@link Cpacs.impl.Cst2DTypeImpl#getUpperN1 <em>Upper N1</em>}</li>
 *   <li>{@link Cpacs.impl.Cst2DTypeImpl#getUpperN2 <em>Upper N2</em>}</li>
 *   <li>{@link Cpacs.impl.Cst2DTypeImpl#getUpperB <em>Upper B</em>}</li>
 *   <li>{@link Cpacs.impl.Cst2DTypeImpl#getLowerN1 <em>Lower N1</em>}</li>
 *   <li>{@link Cpacs.impl.Cst2DTypeImpl#getLowerN2 <em>Lower N2</em>}</li>
 *   <li>{@link Cpacs.impl.Cst2DTypeImpl#getLowerB <em>Lower B</em>}</li>
 *   <li>{@link Cpacs.impl.Cst2DTypeImpl#getTrailingEdgeThickness <em>Trailing Edge Thickness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Cst2DTypeImpl extends ComplexBaseTypeImpl implements Cst2DType {
	/**
	 * The cached value of the '{@link #getPsi() <em>Psi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsi()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType psi;

	/**
	 * The cached value of the '{@link #getUpperN1() <em>Upper N1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperN1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType upperN1;

	/**
	 * The cached value of the '{@link #getUpperN2() <em>Upper N2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperN2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType upperN2;

	/**
	 * The cached value of the '{@link #getUpperB() <em>Upper B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperB()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType upperB;

	/**
	 * The cached value of the '{@link #getLowerN1() <em>Lower N1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerN1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType lowerN1;

	/**
	 * The cached value of the '{@link #getLowerN2() <em>Lower N2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerN2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType lowerN2;

	/**
	 * The cached value of the '{@link #getLowerB() <em>Lower B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerB()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType lowerB;

	/**
	 * The cached value of the '{@link #getTrailingEdgeThickness() <em>Trailing Edge Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailingEdgeThickness()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType trailingEdgeThickness;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cst2DTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCst2DType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getPsi() {
		return psi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPsi(StringVectorBaseType newPsi, NotificationChain msgs) {
		StringVectorBaseType oldPsi = psi;
		psi = newPsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__PSI,
					oldPsi, newPsi);
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
	public void setPsi(StringVectorBaseType newPsi) {
		if (newPsi != psi) {
			NotificationChain msgs = null;
			if (psi != null)
				msgs = ((InternalEObject) psi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__PSI, null, msgs);
			if (newPsi != null)
				msgs = ((InternalEObject) newPsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__PSI, null, msgs);
			msgs = basicSetPsi(newPsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__PSI, newPsi, newPsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getUpperN1() {
		return upperN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperN1(DoubleBaseType newUpperN1, NotificationChain msgs) {
		DoubleBaseType oldUpperN1 = upperN1;
		upperN1 = newUpperN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CST2_DTYPE__UPPER_N1, oldUpperN1, newUpperN1);
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
	public void setUpperN1(DoubleBaseType newUpperN1) {
		if (newUpperN1 != upperN1) {
			NotificationChain msgs = null;
			if (upperN1 != null)
				msgs = ((InternalEObject) upperN1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__UPPER_N1, null, msgs);
			if (newUpperN1 != null)
				msgs = ((InternalEObject) newUpperN1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__UPPER_N1, null, msgs);
			msgs = basicSetUpperN1(newUpperN1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__UPPER_N1, newUpperN1,
					newUpperN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getUpperN2() {
		return upperN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperN2(DoubleBaseType newUpperN2, NotificationChain msgs) {
		DoubleBaseType oldUpperN2 = upperN2;
		upperN2 = newUpperN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CST2_DTYPE__UPPER_N2, oldUpperN2, newUpperN2);
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
	public void setUpperN2(DoubleBaseType newUpperN2) {
		if (newUpperN2 != upperN2) {
			NotificationChain msgs = null;
			if (upperN2 != null)
				msgs = ((InternalEObject) upperN2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__UPPER_N2, null, msgs);
			if (newUpperN2 != null)
				msgs = ((InternalEObject) newUpperN2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__UPPER_N2, null, msgs);
			msgs = basicSetUpperN2(newUpperN2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__UPPER_N2, newUpperN2,
					newUpperN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getUpperB() {
		return upperB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperB(StringVectorBaseType newUpperB, NotificationChain msgs) {
		StringVectorBaseType oldUpperB = upperB;
		upperB = newUpperB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CST2_DTYPE__UPPER_B, oldUpperB, newUpperB);
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
	public void setUpperB(StringVectorBaseType newUpperB) {
		if (newUpperB != upperB) {
			NotificationChain msgs = null;
			if (upperB != null)
				msgs = ((InternalEObject) upperB).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__UPPER_B, null, msgs);
			if (newUpperB != null)
				msgs = ((InternalEObject) newUpperB).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__UPPER_B, null, msgs);
			msgs = basicSetUpperB(newUpperB, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__UPPER_B, newUpperB,
					newUpperB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLowerN1() {
		return lowerN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerN1(DoubleBaseType newLowerN1, NotificationChain msgs) {
		DoubleBaseType oldLowerN1 = lowerN1;
		lowerN1 = newLowerN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CST2_DTYPE__LOWER_N1, oldLowerN1, newLowerN1);
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
	public void setLowerN1(DoubleBaseType newLowerN1) {
		if (newLowerN1 != lowerN1) {
			NotificationChain msgs = null;
			if (lowerN1 != null)
				msgs = ((InternalEObject) lowerN1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__LOWER_N1, null, msgs);
			if (newLowerN1 != null)
				msgs = ((InternalEObject) newLowerN1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__LOWER_N1, null, msgs);
			msgs = basicSetLowerN1(newLowerN1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__LOWER_N1, newLowerN1,
					newLowerN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLowerN2() {
		return lowerN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerN2(DoubleBaseType newLowerN2, NotificationChain msgs) {
		DoubleBaseType oldLowerN2 = lowerN2;
		lowerN2 = newLowerN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CST2_DTYPE__LOWER_N2, oldLowerN2, newLowerN2);
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
	public void setLowerN2(DoubleBaseType newLowerN2) {
		if (newLowerN2 != lowerN2) {
			NotificationChain msgs = null;
			if (lowerN2 != null)
				msgs = ((InternalEObject) lowerN2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__LOWER_N2, null, msgs);
			if (newLowerN2 != null)
				msgs = ((InternalEObject) newLowerN2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__LOWER_N2, null, msgs);
			msgs = basicSetLowerN2(newLowerN2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__LOWER_N2, newLowerN2,
					newLowerN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getLowerB() {
		return lowerB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerB(StringVectorBaseType newLowerB, NotificationChain msgs) {
		StringVectorBaseType oldLowerB = lowerB;
		lowerB = newLowerB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CST2_DTYPE__LOWER_B, oldLowerB, newLowerB);
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
	public void setLowerB(StringVectorBaseType newLowerB) {
		if (newLowerB != lowerB) {
			NotificationChain msgs = null;
			if (lowerB != null)
				msgs = ((InternalEObject) lowerB).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__LOWER_B, null, msgs);
			if (newLowerB != null)
				msgs = ((InternalEObject) newLowerB).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__LOWER_B, null, msgs);
			msgs = basicSetLowerB(newLowerB, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__LOWER_B, newLowerB,
					newLowerB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTrailingEdgeThickness() {
		return trailingEdgeThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrailingEdgeThickness(DoubleBaseType newTrailingEdgeThickness,
			NotificationChain msgs) {
		DoubleBaseType oldTrailingEdgeThickness = trailingEdgeThickness;
		trailingEdgeThickness = newTrailingEdgeThickness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS, oldTrailingEdgeThickness,
					newTrailingEdgeThickness);
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
	public void setTrailingEdgeThickness(DoubleBaseType newTrailingEdgeThickness) {
		if (newTrailingEdgeThickness != trailingEdgeThickness) {
			NotificationChain msgs = null;
			if (trailingEdgeThickness != null)
				msgs = ((InternalEObject) trailingEdgeThickness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS, null, msgs);
			if (newTrailingEdgeThickness != null)
				msgs = ((InternalEObject) newTrailingEdgeThickness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS, null, msgs);
			msgs = basicSetTrailingEdgeThickness(newTrailingEdgeThickness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS,
					newTrailingEdgeThickness, newTrailingEdgeThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CST2_DTYPE__PSI:
			return basicSetPsi(null, msgs);
		case CpacsPackage.CST2_DTYPE__UPPER_N1:
			return basicSetUpperN1(null, msgs);
		case CpacsPackage.CST2_DTYPE__UPPER_N2:
			return basicSetUpperN2(null, msgs);
		case CpacsPackage.CST2_DTYPE__UPPER_B:
			return basicSetUpperB(null, msgs);
		case CpacsPackage.CST2_DTYPE__LOWER_N1:
			return basicSetLowerN1(null, msgs);
		case CpacsPackage.CST2_DTYPE__LOWER_N2:
			return basicSetLowerN2(null, msgs);
		case CpacsPackage.CST2_DTYPE__LOWER_B:
			return basicSetLowerB(null, msgs);
		case CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS:
			return basicSetTrailingEdgeThickness(null, msgs);
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
		case CpacsPackage.CST2_DTYPE__PSI:
			return getPsi();
		case CpacsPackage.CST2_DTYPE__UPPER_N1:
			return getUpperN1();
		case CpacsPackage.CST2_DTYPE__UPPER_N2:
			return getUpperN2();
		case CpacsPackage.CST2_DTYPE__UPPER_B:
			return getUpperB();
		case CpacsPackage.CST2_DTYPE__LOWER_N1:
			return getLowerN1();
		case CpacsPackage.CST2_DTYPE__LOWER_N2:
			return getLowerN2();
		case CpacsPackage.CST2_DTYPE__LOWER_B:
			return getLowerB();
		case CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS:
			return getTrailingEdgeThickness();
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
		case CpacsPackage.CST2_DTYPE__PSI:
			setPsi((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CST2_DTYPE__UPPER_N1:
			setUpperN1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CST2_DTYPE__UPPER_N2:
			setUpperN2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CST2_DTYPE__UPPER_B:
			setUpperB((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CST2_DTYPE__LOWER_N1:
			setLowerN1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CST2_DTYPE__LOWER_N2:
			setLowerN2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CST2_DTYPE__LOWER_B:
			setLowerB((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS:
			setTrailingEdgeThickness((DoubleBaseType) newValue);
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
		case CpacsPackage.CST2_DTYPE__PSI:
			setPsi((StringVectorBaseType) null);
			return;
		case CpacsPackage.CST2_DTYPE__UPPER_N1:
			setUpperN1((DoubleBaseType) null);
			return;
		case CpacsPackage.CST2_DTYPE__UPPER_N2:
			setUpperN2((DoubleBaseType) null);
			return;
		case CpacsPackage.CST2_DTYPE__UPPER_B:
			setUpperB((StringVectorBaseType) null);
			return;
		case CpacsPackage.CST2_DTYPE__LOWER_N1:
			setLowerN1((DoubleBaseType) null);
			return;
		case CpacsPackage.CST2_DTYPE__LOWER_N2:
			setLowerN2((DoubleBaseType) null);
			return;
		case CpacsPackage.CST2_DTYPE__LOWER_B:
			setLowerB((StringVectorBaseType) null);
			return;
		case CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS:
			setTrailingEdgeThickness((DoubleBaseType) null);
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
		case CpacsPackage.CST2_DTYPE__PSI:
			return psi != null;
		case CpacsPackage.CST2_DTYPE__UPPER_N1:
			return upperN1 != null;
		case CpacsPackage.CST2_DTYPE__UPPER_N2:
			return upperN2 != null;
		case CpacsPackage.CST2_DTYPE__UPPER_B:
			return upperB != null;
		case CpacsPackage.CST2_DTYPE__LOWER_N1:
			return lowerN1 != null;
		case CpacsPackage.CST2_DTYPE__LOWER_N2:
			return lowerN2 != null;
		case CpacsPackage.CST2_DTYPE__LOWER_B:
			return lowerB != null;
		case CpacsPackage.CST2_DTYPE__TRAILING_EDGE_THICKNESS:
			return trailingEdgeThickness != null;
		}
		return super.eIsSet(featureID);
	}

} //Cst2DTypeImpl
