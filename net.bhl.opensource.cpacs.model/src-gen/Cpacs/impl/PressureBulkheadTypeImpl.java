/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.PressureBulkheadType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressure Bulkhead Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getReinforcementNumberVertical <em>Reinforcement Number Vertical</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getStructuralElementVerticalUID <em>Structural Element Vertical UID</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getReinforcementNumberHorizontal <em>Reinforcement Number Horizontal</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getStructuralElementHorizontalUID <em>Structural Element Horizontal UID</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getBulkheadCalotteRadiusAtFrame <em>Bulkhead Calotte Radius At Frame</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getMaxFlectionDepth <em>Max Flection Depth</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getReinforcementNumberRadial <em>Reinforcement Number Radial</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getStructuralElementRadialUID <em>Structural Element Radial UID</em>}</li>
 *   <li>{@link Cpacs.impl.PressureBulkheadTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PressureBulkheadTypeImpl extends ComplexBaseTypeImpl implements PressureBulkheadType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getSheetElementUID() <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sheetElementUID;

	/**
	 * The cached value of the '{@link #getReinforcementNumberVertical() <em>Reinforcement Number Vertical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementNumberVertical()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType reinforcementNumberVertical;

	/**
	 * The cached value of the '{@link #getStructuralElementVerticalUID() <em>Structural Element Vertical UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementVerticalUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralElementVerticalUID;

	/**
	 * The cached value of the '{@link #getReinforcementNumberHorizontal() <em>Reinforcement Number Horizontal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementNumberHorizontal()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType reinforcementNumberHorizontal;

	/**
	 * The cached value of the '{@link #getStructuralElementHorizontalUID() <em>Structural Element Horizontal UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementHorizontalUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralElementHorizontalUID;

	/**
	 * The cached value of the '{@link #getBulkheadCalotteRadiusAtFrame() <em>Bulkhead Calotte Radius At Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadCalotteRadiusAtFrame()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType bulkheadCalotteRadiusAtFrame;

	/**
	 * The cached value of the '{@link #getMaxFlectionDepth() <em>Max Flection Depth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFlectionDepth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType maxFlectionDepth;

	/**
	 * The cached value of the '{@link #getReinforcementNumberRadial() <em>Reinforcement Number Radial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementNumberRadial()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType reinforcementNumberRadial;

	/**
	 * The cached value of the '{@link #getStructuralElementRadialUID() <em>Structural Element Radial UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementRadialUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralElementRadialUID;

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
	protected PressureBulkheadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPressureBulkheadType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME, newName,
					newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSheetElementUID() {
		return sheetElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetElementUID(StringUIDBaseType newSheetElementUID, NotificationChain msgs) {
		StringUIDBaseType oldSheetElementUID = sheetElementUID;
		sheetElementUID = newSheetElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID, oldSheetElementUID, newSheetElementUID);
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
	public void setSheetElementUID(StringUIDBaseType newSheetElementUID) {
		if (newSheetElementUID != sheetElementUID) {
			NotificationChain msgs = null;
			if (sheetElementUID != null)
				msgs = ((InternalEObject) sheetElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID, null, msgs);
			if (newSheetElementUID != null)
				msgs = ((InternalEObject) newSheetElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID, null, msgs);
			msgs = basicSetSheetElementUID(newSheetElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID, newSheetElementUID, newSheetElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getReinforcementNumberVertical() {
		return reinforcementNumberVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReinforcementNumberVertical(IntegerBaseType newReinforcementNumberVertical,
			NotificationChain msgs) {
		IntegerBaseType oldReinforcementNumberVertical = reinforcementNumberVertical;
		reinforcementNumberVertical = newReinforcementNumberVertical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL, oldReinforcementNumberVertical,
					newReinforcementNumberVertical);
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
	public void setReinforcementNumberVertical(IntegerBaseType newReinforcementNumberVertical) {
		if (newReinforcementNumberVertical != reinforcementNumberVertical) {
			NotificationChain msgs = null;
			if (reinforcementNumberVertical != null)
				msgs = ((InternalEObject) reinforcementNumberVertical).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL,
						null, msgs);
			if (newReinforcementNumberVertical != null)
				msgs = ((InternalEObject) newReinforcementNumberVertical).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL,
						null, msgs);
			msgs = basicSetReinforcementNumberVertical(newReinforcementNumberVertical, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL, newReinforcementNumberVertical,
					newReinforcementNumberVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralElementVerticalUID() {
		return structuralElementVerticalUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralElementVerticalUID(StringUIDBaseType newStructuralElementVerticalUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralElementVerticalUID = structuralElementVerticalUID;
		structuralElementVerticalUID = newStructuralElementVerticalUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID,
					oldStructuralElementVerticalUID, newStructuralElementVerticalUID);
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
	public void setStructuralElementVerticalUID(StringUIDBaseType newStructuralElementVerticalUID) {
		if (newStructuralElementVerticalUID != structuralElementVerticalUID) {
			NotificationChain msgs = null;
			if (structuralElementVerticalUID != null)
				msgs = ((InternalEObject) structuralElementVerticalUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID,
						null, msgs);
			if (newStructuralElementVerticalUID != null)
				msgs = ((InternalEObject) newStructuralElementVerticalUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID,
						null, msgs);
			msgs = basicSetStructuralElementVerticalUID(newStructuralElementVerticalUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID,
					newStructuralElementVerticalUID, newStructuralElementVerticalUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getReinforcementNumberHorizontal() {
		return reinforcementNumberHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReinforcementNumberHorizontal(IntegerBaseType newReinforcementNumberHorizontal,
			NotificationChain msgs) {
		IntegerBaseType oldReinforcementNumberHorizontal = reinforcementNumberHorizontal;
		reinforcementNumberHorizontal = newReinforcementNumberHorizontal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL,
					oldReinforcementNumberHorizontal, newReinforcementNumberHorizontal);
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
	public void setReinforcementNumberHorizontal(IntegerBaseType newReinforcementNumberHorizontal) {
		if (newReinforcementNumberHorizontal != reinforcementNumberHorizontal) {
			NotificationChain msgs = null;
			if (reinforcementNumberHorizontal != null)
				msgs = ((InternalEObject) reinforcementNumberHorizontal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL,
						null, msgs);
			if (newReinforcementNumberHorizontal != null)
				msgs = ((InternalEObject) newReinforcementNumberHorizontal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL,
						null, msgs);
			msgs = basicSetReinforcementNumberHorizontal(newReinforcementNumberHorizontal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL,
					newReinforcementNumberHorizontal, newReinforcementNumberHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralElementHorizontalUID() {
		return structuralElementHorizontalUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralElementHorizontalUID(StringUIDBaseType newStructuralElementHorizontalUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralElementHorizontalUID = structuralElementHorizontalUID;
		structuralElementHorizontalUID = newStructuralElementHorizontalUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID,
					oldStructuralElementHorizontalUID, newStructuralElementHorizontalUID);
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
	public void setStructuralElementHorizontalUID(StringUIDBaseType newStructuralElementHorizontalUID) {
		if (newStructuralElementHorizontalUID != structuralElementHorizontalUID) {
			NotificationChain msgs = null;
			if (structuralElementHorizontalUID != null)
				msgs = ((InternalEObject) structuralElementHorizontalUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID,
						null, msgs);
			if (newStructuralElementHorizontalUID != null)
				msgs = ((InternalEObject) newStructuralElementHorizontalUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID,
						null, msgs);
			msgs = basicSetStructuralElementHorizontalUID(newStructuralElementHorizontalUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID,
					newStructuralElementHorizontalUID, newStructuralElementHorizontalUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getBulkheadCalotteRadiusAtFrame() {
		return bulkheadCalotteRadiusAtFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBulkheadCalotteRadiusAtFrame(DoubleBaseType newBulkheadCalotteRadiusAtFrame,
			NotificationChain msgs) {
		DoubleBaseType oldBulkheadCalotteRadiusAtFrame = bulkheadCalotteRadiusAtFrame;
		bulkheadCalotteRadiusAtFrame = newBulkheadCalotteRadiusAtFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME,
					oldBulkheadCalotteRadiusAtFrame, newBulkheadCalotteRadiusAtFrame);
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
	public void setBulkheadCalotteRadiusAtFrame(DoubleBaseType newBulkheadCalotteRadiusAtFrame) {
		if (newBulkheadCalotteRadiusAtFrame != bulkheadCalotteRadiusAtFrame) {
			NotificationChain msgs = null;
			if (bulkheadCalotteRadiusAtFrame != null)
				msgs = ((InternalEObject) bulkheadCalotteRadiusAtFrame).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME,
						null, msgs);
			if (newBulkheadCalotteRadiusAtFrame != null)
				msgs = ((InternalEObject) newBulkheadCalotteRadiusAtFrame).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME,
						null, msgs);
			msgs = basicSetBulkheadCalotteRadiusAtFrame(newBulkheadCalotteRadiusAtFrame, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME,
					newBulkheadCalotteRadiusAtFrame, newBulkheadCalotteRadiusAtFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMaxFlectionDepth() {
		return maxFlectionDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxFlectionDepth(DoubleBaseType newMaxFlectionDepth, NotificationChain msgs) {
		DoubleBaseType oldMaxFlectionDepth = maxFlectionDepth;
		maxFlectionDepth = newMaxFlectionDepth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH, oldMaxFlectionDepth, newMaxFlectionDepth);
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
	public void setMaxFlectionDepth(DoubleBaseType newMaxFlectionDepth) {
		if (newMaxFlectionDepth != maxFlectionDepth) {
			NotificationChain msgs = null;
			if (maxFlectionDepth != null)
				msgs = ((InternalEObject) maxFlectionDepth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH, null, msgs);
			if (newMaxFlectionDepth != null)
				msgs = ((InternalEObject) newMaxFlectionDepth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH, null, msgs);
			msgs = basicSetMaxFlectionDepth(newMaxFlectionDepth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH, newMaxFlectionDepth, newMaxFlectionDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getReinforcementNumberRadial() {
		return reinforcementNumberRadial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReinforcementNumberRadial(IntegerBaseType newReinforcementNumberRadial,
			NotificationChain msgs) {
		IntegerBaseType oldReinforcementNumberRadial = reinforcementNumberRadial;
		reinforcementNumberRadial = newReinforcementNumberRadial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL, oldReinforcementNumberRadial,
					newReinforcementNumberRadial);
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
	public void setReinforcementNumberRadial(IntegerBaseType newReinforcementNumberRadial) {
		if (newReinforcementNumberRadial != reinforcementNumberRadial) {
			NotificationChain msgs = null;
			if (reinforcementNumberRadial != null)
				msgs = ((InternalEObject) reinforcementNumberRadial).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL, null,
						msgs);
			if (newReinforcementNumberRadial != null)
				msgs = ((InternalEObject) newReinforcementNumberRadial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL, null,
						msgs);
			msgs = basicSetReinforcementNumberRadial(newReinforcementNumberRadial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL, newReinforcementNumberRadial,
					newReinforcementNumberRadial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralElementRadialUID() {
		return structuralElementRadialUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralElementRadialUID(StringUIDBaseType newStructuralElementRadialUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralElementRadialUID = structuralElementRadialUID;
		structuralElementRadialUID = newStructuralElementRadialUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID, oldStructuralElementRadialUID,
					newStructuralElementRadialUID);
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
	public void setStructuralElementRadialUID(StringUIDBaseType newStructuralElementRadialUID) {
		if (newStructuralElementRadialUID != structuralElementRadialUID) {
			NotificationChain msgs = null;
			if (structuralElementRadialUID != null)
				msgs = ((InternalEObject) structuralElementRadialUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID,
						null, msgs);
			if (newStructuralElementRadialUID != null)
				msgs = ((InternalEObject) newStructuralElementRadialUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID,
						null, msgs);
			msgs = basicSetStructuralElementRadialUID(newStructuralElementRadialUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID, newStructuralElementRadialUID,
					newStructuralElementRadialUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PRESSURE_BULKHEAD_TYPE__UID, oldUID,
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
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID:
			return basicSetSheetElementUID(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL:
			return basicSetReinforcementNumberVertical(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID:
			return basicSetStructuralElementVerticalUID(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL:
			return basicSetReinforcementNumberHorizontal(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID:
			return basicSetStructuralElementHorizontalUID(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME:
			return basicSetBulkheadCalotteRadiusAtFrame(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH:
			return basicSetMaxFlectionDepth(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL:
			return basicSetReinforcementNumberRadial(null, msgs);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID:
			return basicSetStructuralElementRadialUID(null, msgs);
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
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME:
			return getName();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID:
			return getSheetElementUID();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL:
			return getReinforcementNumberVertical();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID:
			return getStructuralElementVerticalUID();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL:
			return getReinforcementNumberHorizontal();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID:
			return getStructuralElementHorizontalUID();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME:
			return getBulkheadCalotteRadiusAtFrame();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH:
			return getMaxFlectionDepth();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL:
			return getReinforcementNumberRadial();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID:
			return getStructuralElementRadialUID();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__UID:
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
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL:
			setReinforcementNumberVertical((IntegerBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID:
			setStructuralElementVerticalUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL:
			setReinforcementNumberHorizontal((IntegerBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID:
			setStructuralElementHorizontalUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME:
			setBulkheadCalotteRadiusAtFrame((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH:
			setMaxFlectionDepth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL:
			setReinforcementNumberRadial((IntegerBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID:
			setStructuralElementRadialUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__UID:
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
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL:
			setReinforcementNumberVertical((IntegerBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID:
			setStructuralElementVerticalUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL:
			setReinforcementNumberHorizontal((IntegerBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID:
			setStructuralElementHorizontalUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME:
			setBulkheadCalotteRadiusAtFrame((DoubleBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH:
			setMaxFlectionDepth((DoubleBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL:
			setReinforcementNumberRadial((IntegerBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID:
			setStructuralElementRadialUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__UID:
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
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__NAME:
			return name != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__SHEET_ELEMENT_UID:
			return sheetElementUID != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_VERTICAL:
			return reinforcementNumberVertical != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_VERTICAL_UID:
			return structuralElementVerticalUID != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_HORIZONTAL:
			return reinforcementNumberHorizontal != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_HORIZONTAL_UID:
			return structuralElementHorizontalUID != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__BULKHEAD_CALOTTE_RADIUS_AT_FRAME:
			return bulkheadCalotteRadiusAtFrame != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__MAX_FLECTION_DEPTH:
			return maxFlectionDepth != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__REINFORCEMENT_NUMBER_RADIAL:
			return reinforcementNumberRadial != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__STRUCTURAL_ELEMENT_RADIAL_UID:
			return structuralElementRadialUID != null;
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE__UID:
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

} //PressureBulkheadTypeImpl
