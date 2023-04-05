/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MaterialDefinitionForProfileBasedType;
import Cpacs.StandardProfileSheetIDType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Definition For Profile Based Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedTypeImpl#getSheetUID <em>Sheet UID</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedTypeImpl#getStandardProfileSheetID <em>Standard Profile Sheet ID</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedTypeImpl#getCompositeUID <em>Composite UID</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedTypeImpl#getOrthotropyDirection <em>Orthotropy Direction</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedTypeImpl#getThicknessScaling <em>Thickness Scaling</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedTypeImpl#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedTypeImpl#getThickness <em>Thickness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialDefinitionForProfileBasedTypeImpl extends ComplexBaseTypeImpl
		implements MaterialDefinitionForProfileBasedType {
	/**
	 * The cached value of the '{@link #getSheetUID() <em>Sheet UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sheetUID;

	/**
	 * The cached value of the '{@link #getStandardProfileSheetID() <em>Standard Profile Sheet ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardProfileSheetID()
	 * @generated
	 * @ordered
	 */
	protected StandardProfileSheetIDType standardProfileSheetID;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType length;

	/**
	 * The cached value of the '{@link #getCompositeUID() <em>Composite UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType compositeUID;

	/**
	 * The cached value of the '{@link #getOrthotropyDirection() <em>Orthotropy Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrthotropyDirection()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType orthotropyDirection;

	/**
	 * The cached value of the '{@link #getThicknessScaling() <em>Thickness Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThicknessScaling()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thicknessScaling;

	/**
	 * The cached value of the '{@link #getMaterialUID() <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType materialUID;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thickness;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialDefinitionForProfileBasedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMaterialDefinitionForProfileBasedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSheetUID() {
		return sheetUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetUID(StringUIDBaseType newSheetUID, NotificationChain msgs) {
		StringUIDBaseType oldSheetUID = sheetUID;
		sheetUID = newSheetUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID, oldSheetUID, newSheetUID);
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
	public void setSheetUID(StringUIDBaseType newSheetUID) {
		if (newSheetUID != sheetUID) {
			NotificationChain msgs = null;
			if (sheetUID != null)
				msgs = ((InternalEObject) sheetUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID,
						null, msgs);
			if (newSheetUID != null)
				msgs = ((InternalEObject) newSheetUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID,
						null, msgs);
			msgs = basicSetSheetUID(newSheetUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID, newSheetUID, newSheetUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardProfileSheetIDType getStandardProfileSheetID() {
		return standardProfileSheetID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardProfileSheetID(StandardProfileSheetIDType newStandardProfileSheetID,
			NotificationChain msgs) {
		StandardProfileSheetIDType oldStandardProfileSheetID = standardProfileSheetID;
		standardProfileSheetID = newStandardProfileSheetID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID,
					oldStandardProfileSheetID, newStandardProfileSheetID);
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
	public void setStandardProfileSheetID(StandardProfileSheetIDType newStandardProfileSheetID) {
		if (newStandardProfileSheetID != standardProfileSheetID) {
			NotificationChain msgs = null;
			if (standardProfileSheetID != null)
				msgs = ((InternalEObject) standardProfileSheetID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID,
						null, msgs);
			if (newStandardProfileSheetID != null)
				msgs = ((InternalEObject) newStandardProfileSheetID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID,
						null, msgs);
			msgs = basicSetStandardProfileSheetID(newStandardProfileSheetID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID,
					newStandardProfileSheetID, newStandardProfileSheetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(DoubleBaseType newLength, NotificationChain msgs) {
		DoubleBaseType oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH, oldLength, newLength);
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
	public void setLength(DoubleBaseType newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject) length).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH, null,
						msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH, null,
						msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCompositeUID() {
		return compositeUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeUID(StringUIDBaseType newCompositeUID, NotificationChain msgs) {
		StringUIDBaseType oldCompositeUID = compositeUID;
		compositeUID = newCompositeUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID, oldCompositeUID,
					newCompositeUID);
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
	public void setCompositeUID(StringUIDBaseType newCompositeUID) {
		if (newCompositeUID != compositeUID) {
			NotificationChain msgs = null;
			if (compositeUID != null)
				msgs = ((InternalEObject) compositeUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID,
						null, msgs);
			if (newCompositeUID != null)
				msgs = ((InternalEObject) newCompositeUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID,
						null, msgs);
			msgs = basicSetCompositeUID(newCompositeUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID, newCompositeUID,
					newCompositeUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOrthotropyDirection() {
		return orthotropyDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrthotropyDirection(DoubleBaseType newOrthotropyDirection,
			NotificationChain msgs) {
		DoubleBaseType oldOrthotropyDirection = orthotropyDirection;
		orthotropyDirection = newOrthotropyDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION,
					oldOrthotropyDirection, newOrthotropyDirection);
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
	public void setOrthotropyDirection(DoubleBaseType newOrthotropyDirection) {
		if (newOrthotropyDirection != orthotropyDirection) {
			NotificationChain msgs = null;
			if (orthotropyDirection != null)
				msgs = ((InternalEObject) orthotropyDirection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION,
						null, msgs);
			if (newOrthotropyDirection != null)
				msgs = ((InternalEObject) newOrthotropyDirection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION,
						null, msgs);
			msgs = basicSetOrthotropyDirection(newOrthotropyDirection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION,
					newOrthotropyDirection, newOrthotropyDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThicknessScaling() {
		return thicknessScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThicknessScaling(DoubleBaseType newThicknessScaling, NotificationChain msgs) {
		DoubleBaseType oldThicknessScaling = thicknessScaling;
		thicknessScaling = newThicknessScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING, oldThicknessScaling,
					newThicknessScaling);
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
	public void setThicknessScaling(DoubleBaseType newThicknessScaling) {
		if (newThicknessScaling != thicknessScaling) {
			NotificationChain msgs = null;
			if (thicknessScaling != null)
				msgs = ((InternalEObject) thicknessScaling).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING,
						null, msgs);
			if (newThicknessScaling != null)
				msgs = ((InternalEObject) newThicknessScaling).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING,
						null, msgs);
			msgs = basicSetThicknessScaling(newThicknessScaling, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING, newThicknessScaling,
					newThicknessScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMaterialUID() {
		return materialUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialUID(StringUIDBaseType newMaterialUID, NotificationChain msgs) {
		StringUIDBaseType oldMaterialUID = materialUID;
		materialUID = newMaterialUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID, oldMaterialUID,
					newMaterialUID);
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
	public void setMaterialUID(StringUIDBaseType newMaterialUID) {
		if (newMaterialUID != materialUID) {
			NotificationChain msgs = null;
			if (materialUID != null)
				msgs = ((InternalEObject) materialUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID,
						null, msgs);
			if (newMaterialUID != null)
				msgs = ((InternalEObject) newMaterialUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID,
						null, msgs);
			msgs = basicSetMaterialUID(newMaterialUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID, newMaterialUID,
					newMaterialUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThickness(DoubleBaseType newThickness, NotificationChain msgs) {
		DoubleBaseType oldThickness = thickness;
		thickness = newThickness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS, oldThickness, newThickness);
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
	public void setThickness(DoubleBaseType newThickness) {
		if (newThickness != thickness) {
			NotificationChain msgs = null;
			if (thickness != null)
				msgs = ((InternalEObject) thickness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS,
						null, msgs);
			if (newThickness != null)
				msgs = ((InternalEObject) newThickness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS,
						null, msgs);
			msgs = basicSetThickness(newThickness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS, newThickness, newThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID:
			return basicSetSheetUID(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID:
			return basicSetStandardProfileSheetID(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID:
			return basicSetCompositeUID(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION:
			return basicSetOrthotropyDirection(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING:
			return basicSetThicknessScaling(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID:
			return basicSetMaterialUID(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS:
			return basicSetThickness(null, msgs);
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
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID:
			return getSheetUID();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID:
			return getStandardProfileSheetID();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID:
			return getCompositeUID();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION:
			return getOrthotropyDirection();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING:
			return getThicknessScaling();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID:
			return getMaterialUID();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS:
			return getThickness();
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
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID:
			setSheetUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID:
			setStandardProfileSheetID((StandardProfileSheetIDType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID:
			setCompositeUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION:
			setOrthotropyDirection((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING:
			setThicknessScaling((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS:
			setThickness((DoubleBaseType) newValue);
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
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID:
			setSheetUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID:
			setStandardProfileSheetID((StandardProfileSheetIDType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID:
			setCompositeUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION:
			setOrthotropyDirection((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING:
			setThicknessScaling((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS:
			setThickness((DoubleBaseType) null);
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
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__SHEET_UID:
			return sheetUID != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__STANDARD_PROFILE_SHEET_ID:
			return standardProfileSheetID != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__COMPOSITE_UID:
			return compositeUID != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__ORTHOTROPY_DIRECTION:
			return orthotropyDirection != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS_SCALING:
			return thicknessScaling != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__MATERIAL_UID:
			return materialUID != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE__THICKNESS:
			return thickness != null;
		}
		return super.eIsSet(featureID);
	}

} //MaterialDefinitionForProfileBasedTypeImpl
