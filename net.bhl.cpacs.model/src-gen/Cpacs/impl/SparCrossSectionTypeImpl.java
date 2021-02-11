/**
 */
package Cpacs.impl;

import Cpacs.CapType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.SparCellsType;
import Cpacs.SparCrossSectionType;
import Cpacs.WebType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spar Cross Section Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SparCrossSectionTypeImpl#getUpperCap <em>Upper Cap</em>}</li>
 *   <li>{@link Cpacs.impl.SparCrossSectionTypeImpl#getLowerCap <em>Lower Cap</em>}</li>
 *   <li>{@link Cpacs.impl.SparCrossSectionTypeImpl#getWeb1 <em>Web1</em>}</li>
 *   <li>{@link Cpacs.impl.SparCrossSectionTypeImpl#getWeb2 <em>Web2</em>}</li>
 *   <li>{@link Cpacs.impl.SparCrossSectionTypeImpl#getSparCells <em>Spar Cells</em>}</li>
 *   <li>{@link Cpacs.impl.SparCrossSectionTypeImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparCrossSectionTypeImpl extends ComplexBaseTypeImpl implements SparCrossSectionType {
	/**
	 * The cached value of the '{@link #getUpperCap() <em>Upper Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperCap()
	 * @generated
	 * @ordered
	 */
	protected CapType upperCap;

	/**
	 * The cached value of the '{@link #getLowerCap() <em>Lower Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerCap()
	 * @generated
	 * @ordered
	 */
	protected CapType lowerCap;

	/**
	 * The cached value of the '{@link #getWeb1() <em>Web1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb1()
	 * @generated
	 * @ordered
	 */
	protected WebType web1;

	/**
	 * The cached value of the '{@link #getWeb2() <em>Web2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb2()
	 * @generated
	 * @ordered
	 */
	protected WebType web2;

	/**
	 * The cached value of the '{@link #getSparCells() <em>Spar Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparCells()
	 * @generated
	 * @ordered
	 */
	protected SparCellsType sparCells;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparCrossSectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSparCrossSectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapType getUpperCap() {
		return upperCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperCap(CapType newUpperCap, NotificationChain msgs) {
		CapType oldUpperCap = upperCap;
		upperCap = newUpperCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP, oldUpperCap, newUpperCap);
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
	public void setUpperCap(CapType newUpperCap) {
		if (newUpperCap != upperCap) {
			NotificationChain msgs = null;
			if (upperCap != null)
				msgs = ((InternalEObject) upperCap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP, null, msgs);
			if (newUpperCap != null)
				msgs = ((InternalEObject) newUpperCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP, null, msgs);
			msgs = basicSetUpperCap(newUpperCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP,
					newUpperCap, newUpperCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapType getLowerCap() {
		return lowerCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerCap(CapType newLowerCap, NotificationChain msgs) {
		CapType oldLowerCap = lowerCap;
		lowerCap = newLowerCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP, oldLowerCap, newLowerCap);
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
	public void setLowerCap(CapType newLowerCap) {
		if (newLowerCap != lowerCap) {
			NotificationChain msgs = null;
			if (lowerCap != null)
				msgs = ((InternalEObject) lowerCap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP, null, msgs);
			if (newLowerCap != null)
				msgs = ((InternalEObject) newLowerCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP, null, msgs);
			msgs = basicSetLowerCap(newLowerCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP,
					newLowerCap, newLowerCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebType getWeb1() {
		return web1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeb1(WebType newWeb1, NotificationChain msgs) {
		WebType oldWeb1 = web1;
		web1 = newWeb1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1, oldWeb1, newWeb1);
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
	public void setWeb1(WebType newWeb1) {
		if (newWeb1 != web1) {
			NotificationChain msgs = null;
			if (web1 != null)
				msgs = ((InternalEObject) web1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1, null, msgs);
			if (newWeb1 != null)
				msgs = ((InternalEObject) newWeb1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1, null, msgs);
			msgs = basicSetWeb1(newWeb1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1, newWeb1,
					newWeb1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebType getWeb2() {
		return web2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeb2(WebType newWeb2, NotificationChain msgs) {
		WebType oldWeb2 = web2;
		web2 = newWeb2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2, oldWeb2, newWeb2);
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
	public void setWeb2(WebType newWeb2) {
		if (newWeb2 != web2) {
			NotificationChain msgs = null;
			if (web2 != null)
				msgs = ((InternalEObject) web2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2, null, msgs);
			if (newWeb2 != null)
				msgs = ((InternalEObject) newWeb2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2, null, msgs);
			msgs = basicSetWeb2(newWeb2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2, newWeb2,
					newWeb2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparCellsType getSparCells() {
		return sparCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparCells(SparCellsType newSparCells, NotificationChain msgs) {
		SparCellsType oldSparCells = sparCells;
		sparCells = newSparCells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS, oldSparCells, newSparCells);
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
	public void setSparCells(SparCellsType newSparCells) {
		if (newSparCells != sparCells) {
			NotificationChain msgs = null;
			if (sparCells != null)
				msgs = ((InternalEObject) sparCells).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS, null, msgs);
			if (newSparCells != null)
				msgs = ((InternalEObject) newSparCells).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS, null, msgs);
			msgs = basicSetSparCells(newSparCells, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS,
					newSparCells, newSparCells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(DoubleBaseType newRotation, NotificationChain msgs) {
		DoubleBaseType oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION, oldRotation, newRotation);
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
	public void setRotation(DoubleBaseType newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION,
					newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP:
			return basicSetUpperCap(null, msgs);
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP:
			return basicSetLowerCap(null, msgs);
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1:
			return basicSetWeb1(null, msgs);
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2:
			return basicSetWeb2(null, msgs);
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS:
			return basicSetSparCells(null, msgs);
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION:
			return basicSetRotation(null, msgs);
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
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP:
			return getUpperCap();
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP:
			return getLowerCap();
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1:
			return getWeb1();
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2:
			return getWeb2();
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS:
			return getSparCells();
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION:
			return getRotation();
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
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP:
			setUpperCap((CapType) newValue);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP:
			setLowerCap((CapType) newValue);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1:
			setWeb1((WebType) newValue);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2:
			setWeb2((WebType) newValue);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS:
			setSparCells((SparCellsType) newValue);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION:
			setRotation((DoubleBaseType) newValue);
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
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP:
			setUpperCap((CapType) null);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP:
			setLowerCap((CapType) null);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1:
			setWeb1((WebType) null);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2:
			setWeb2((WebType) null);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS:
			setSparCells((SparCellsType) null);
			return;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION:
			setRotation((DoubleBaseType) null);
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
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__UPPER_CAP:
			return upperCap != null;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__LOWER_CAP:
			return lowerCap != null;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB1:
			return web1 != null;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__WEB2:
			return web2 != null;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__SPAR_CELLS:
			return sparCells != null;
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE__ROTATION:
			return rotation != null;
		}
		return super.eIsSet(featureID);
	}

} //SparCrossSectionTypeImpl
