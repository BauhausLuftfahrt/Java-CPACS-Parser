/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LandingGearBaseType;
import Cpacs.LandingGearComponentAssemblyType;
import Cpacs.LandingGearControlType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.SymmetryXyXzYzType;
import Cpacs.TransformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getComponentAssembly <em>Component Assembly</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getTotalLength <em>Total Length</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getStaticSuspensionTravel <em>Static Suspension Travel</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getCompressedSuspensionTravel <em>Compressed Suspension Travel</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearBaseTypeImpl extends ComplexBaseTypeImpl implements LandingGearBaseType {
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
	 * The cached value of the '{@link #getParentUID() <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType parentUID;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected LandingGearControlType control;

	/**
	 * The cached value of the '{@link #getComponentAssembly() <em>Component Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentAssembly()
	 * @generated
	 * @ordered
	 */
	protected LandingGearComponentAssemblyType componentAssembly;

	/**
	 * The cached value of the '{@link #getTotalLength() <em>Total Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType totalLength;

	/**
	 * The cached value of the '{@link #getStaticSuspensionTravel() <em>Static Suspension Travel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticSuspensionTravel()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType staticSuspensionTravel;

	/**
	 * The cached value of the '{@link #getCompressedSuspensionTravel() <em>Compressed Suspension Travel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedSuspensionTravel()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType compressedSuspensionTravel;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected TransformationType transformation;

	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryXyXzYzType SYMMETRY_EDEFAULT = SymmetryXyXzYzType.NONE;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryXyXzYzType symmetry = SYMMETRY_EDEFAULT;

	/**
	 * This is true if the Symmetry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetryESet;

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
	protected LandingGearBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearBaseType();
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
					CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME, newName,
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
					CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getParentUID() {
		return parentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentUID(StringUIDBaseType newParentUID, NotificationChain msgs) {
		StringUIDBaseType oldParentUID = parentUID;
		parentUID = newParentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
	public void setParentUID(StringUIDBaseType newParentUID) {
		if (newParentUID != parentUID) {
			NotificationChain msgs = null;
			if (parentUID != null)
				msgs = ((InternalEObject) parentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID,
					newParentUID, newParentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearControlType getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(LandingGearControlType newControl, NotificationChain msgs) {
		LandingGearControlType oldControl = control;
		control = newControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL, oldControl, newControl);
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
	public void setControl(LandingGearControlType newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject) control).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject) newControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL,
					newControl, newControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearComponentAssemblyType getComponentAssembly() {
		return componentAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentAssembly(LandingGearComponentAssemblyType newComponentAssembly,
			NotificationChain msgs) {
		LandingGearComponentAssemblyType oldComponentAssembly = componentAssembly;
		componentAssembly = newComponentAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY, oldComponentAssembly,
					newComponentAssembly);
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
	public void setComponentAssembly(LandingGearComponentAssemblyType newComponentAssembly) {
		if (newComponentAssembly != componentAssembly) {
			NotificationChain msgs = null;
			if (componentAssembly != null)
				msgs = ((InternalEObject) componentAssembly).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY, null, msgs);
			if (newComponentAssembly != null)
				msgs = ((InternalEObject) newComponentAssembly).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY, null, msgs);
			msgs = basicSetComponentAssembly(newComponentAssembly, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY, newComponentAssembly,
					newComponentAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTotalLength() {
		return totalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalLength(DoubleBaseType newTotalLength, NotificationChain msgs) {
		DoubleBaseType oldTotalLength = totalLength;
		totalLength = newTotalLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH, oldTotalLength, newTotalLength);
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
	public void setTotalLength(DoubleBaseType newTotalLength) {
		if (newTotalLength != totalLength) {
			NotificationChain msgs = null;
			if (totalLength != null)
				msgs = ((InternalEObject) totalLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH, null, msgs);
			if (newTotalLength != null)
				msgs = ((InternalEObject) newTotalLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH, null, msgs);
			msgs = basicSetTotalLength(newTotalLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH,
					newTotalLength, newTotalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStaticSuspensionTravel() {
		return staticSuspensionTravel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticSuspensionTravel(DoubleBaseType newStaticSuspensionTravel,
			NotificationChain msgs) {
		DoubleBaseType oldStaticSuspensionTravel = staticSuspensionTravel;
		staticSuspensionTravel = newStaticSuspensionTravel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL, oldStaticSuspensionTravel,
					newStaticSuspensionTravel);
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
	public void setStaticSuspensionTravel(DoubleBaseType newStaticSuspensionTravel) {
		if (newStaticSuspensionTravel != staticSuspensionTravel) {
			NotificationChain msgs = null;
			if (staticSuspensionTravel != null)
				msgs = ((InternalEObject) staticSuspensionTravel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL, null,
						msgs);
			if (newStaticSuspensionTravel != null)
				msgs = ((InternalEObject) newStaticSuspensionTravel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL, null,
						msgs);
			msgs = basicSetStaticSuspensionTravel(newStaticSuspensionTravel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL, newStaticSuspensionTravel,
					newStaticSuspensionTravel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCompressedSuspensionTravel() {
		return compressedSuspensionTravel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompressedSuspensionTravel(DoubleBaseType newCompressedSuspensionTravel,
			NotificationChain msgs) {
		DoubleBaseType oldCompressedSuspensionTravel = compressedSuspensionTravel;
		compressedSuspensionTravel = newCompressedSuspensionTravel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL, oldCompressedSuspensionTravel,
					newCompressedSuspensionTravel);
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
	public void setCompressedSuspensionTravel(DoubleBaseType newCompressedSuspensionTravel) {
		if (newCompressedSuspensionTravel != compressedSuspensionTravel) {
			NotificationChain msgs = null;
			if (compressedSuspensionTravel != null)
				msgs = ((InternalEObject) compressedSuspensionTravel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL,
						null, msgs);
			if (newCompressedSuspensionTravel != null)
				msgs = ((InternalEObject) newCompressedSuspensionTravel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL,
						null, msgs);
			msgs = basicSetCompressedSuspensionTravel(newCompressedSuspensionTravel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL, newCompressedSuspensionTravel,
					newCompressedSuspensionTravel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(TransformationType newTransformation, NotificationChain msgs) {
		TransformationType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
	public void setTransformation(TransformationType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION,
					newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryXyXzYzType getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetry(SymmetryXyXzYzType newSymmetry) {
		SymmetryXyXzYzType oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BASE_TYPE__SYMMETRY,
					oldSymmetry, symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetry() {
		SymmetryXyXzYzType oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.LANDING_GEAR_BASE_TYPE__SYMMETRY,
					oldSymmetry, SYMMETRY_EDEFAULT, oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSymmetry() {
		return symmetryESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BASE_TYPE__UID, oldUID,
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
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL:
			return basicSetControl(null, msgs);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY:
			return basicSetComponentAssembly(null, msgs);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH:
			return basicSetTotalLength(null, msgs);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL:
			return basicSetStaticSuspensionTravel(null, msgs);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL:
			return basicSetCompressedSuspensionTravel(null, msgs);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME:
			return getName();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL:
			return getControl();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY:
			return getComponentAssembly();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH:
			return getTotalLength();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL:
			return getStaticSuspensionTravel();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL:
			return getCompressedSuspensionTravel();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL:
			setControl((LandingGearControlType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY:
			setComponentAssembly((LandingGearComponentAssemblyType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH:
			setTotalLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL:
			setStaticSuspensionTravel((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL:
			setCompressedSuspensionTravel((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__SYMMETRY:
			setSymmetry((SymmetryXyXzYzType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL:
			setControl((LandingGearControlType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY:
			setComponentAssembly((LandingGearComponentAssemblyType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH:
			setTotalLength((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL:
			setStaticSuspensionTravel((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL:
			setCompressedSuspensionTravel((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__SYMMETRY:
			unsetSymmetry();
			return;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__CONTROL:
			return control != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPONENT_ASSEMBLY:
			return componentAssembly != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TOTAL_LENGTH:
			return totalLength != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__STATIC_SUSPENSION_TRAVEL:
			return staticSuspensionTravel != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__COMPRESSED_SUSPENSION_TRAVEL:
			return compressedSuspensionTravel != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__SYMMETRY:
			return isSetSymmetry();
		case CpacsPackage.LANDING_GEAR_BASE_TYPE__UID:
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
		result.append(" (symmetry: ");
		if (symmetryESet)
			result.append(symmetry);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //LandingGearBaseTypeImpl
