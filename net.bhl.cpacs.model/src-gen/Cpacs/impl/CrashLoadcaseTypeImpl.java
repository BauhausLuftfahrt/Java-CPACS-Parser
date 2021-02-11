/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CrashLoadcaseType;
import Cpacs.DoubleBaseType;
import Cpacs.ImpactSurfaceDefinitionType;
import Cpacs.PointXYZType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crash Loadcase Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getCrashStartX <em>Crash Start X</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getCrashEndX <em>Crash End X</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getCrashInitialVelocity <em>Crash Initial Velocity</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getCrashInitialRotation <em>Crash Initial Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getCrashInitialRotationalVelocity <em>Crash Initial Rotational Velocity</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getReferencePointForRotation <em>Reference Point For Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getCrashAccelerationField <em>Crash Acceleration Field</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getImpactSurfaceDefinition <em>Impact Surface Definition</em>}</li>
 *   <li>{@link Cpacs.impl.CrashLoadcaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrashLoadcaseTypeImpl extends ComplexBaseTypeImpl implements CrashLoadcaseType {
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
	 * The cached value of the '{@link #getCrashStartX() <em>Crash Start X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrashStartX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType crashStartX;

	/**
	 * The cached value of the '{@link #getCrashEndX() <em>Crash End X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrashEndX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType crashEndX;

	/**
	 * The cached value of the '{@link #getCrashInitialVelocity() <em>Crash Initial Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrashInitialVelocity()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType crashInitialVelocity;

	/**
	 * The cached value of the '{@link #getCrashInitialRotation() <em>Crash Initial Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrashInitialRotation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType crashInitialRotation;

	/**
	 * The cached value of the '{@link #getCrashInitialRotationalVelocity() <em>Crash Initial Rotational Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrashInitialRotationalVelocity()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType crashInitialRotationalVelocity;

	/**
	 * The cached value of the '{@link #getReferencePointForRotation() <em>Reference Point For Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePointForRotation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType referencePointForRotation;

	/**
	 * The cached value of the '{@link #getCrashAccelerationField() <em>Crash Acceleration Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrashAccelerationField()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType crashAccelerationField;

	/**
	 * The cached value of the '{@link #getImpactSurfaceDefinition() <em>Impact Surface Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactSurfaceDefinition()
	 * @generated
	 * @ordered
	 */
	protected ImpactSurfaceDefinitionType impactSurfaceDefinition;

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
	protected CrashLoadcaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCrashLoadcaseType();
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
					CpacsPackage.CRASH_LOADCASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRASH_LOADCASE_TYPE__NAME, newName,
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
					CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCrashStartX() {
		return crashStartX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrashStartX(DoubleBaseType newCrashStartX, NotificationChain msgs) {
		DoubleBaseType oldCrashStartX = crashStartX;
		crashStartX = newCrashStartX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X, oldCrashStartX, newCrashStartX);
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
	public void setCrashStartX(DoubleBaseType newCrashStartX) {
		if (newCrashStartX != crashStartX) {
			NotificationChain msgs = null;
			if (crashStartX != null)
				msgs = ((InternalEObject) crashStartX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X, null, msgs);
			if (newCrashStartX != null)
				msgs = ((InternalEObject) newCrashStartX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X, null, msgs);
			msgs = basicSetCrashStartX(newCrashStartX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X,
					newCrashStartX, newCrashStartX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCrashEndX() {
		return crashEndX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrashEndX(DoubleBaseType newCrashEndX, NotificationChain msgs) {
		DoubleBaseType oldCrashEndX = crashEndX;
		crashEndX = newCrashEndX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X, oldCrashEndX, newCrashEndX);
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
	public void setCrashEndX(DoubleBaseType newCrashEndX) {
		if (newCrashEndX != crashEndX) {
			NotificationChain msgs = null;
			if (crashEndX != null)
				msgs = ((InternalEObject) crashEndX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X, null, msgs);
			if (newCrashEndX != null)
				msgs = ((InternalEObject) newCrashEndX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X, null, msgs);
			msgs = basicSetCrashEndX(newCrashEndX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X,
					newCrashEndX, newCrashEndX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getCrashInitialVelocity() {
		return crashInitialVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrashInitialVelocity(PointXYZType newCrashInitialVelocity,
			NotificationChain msgs) {
		PointXYZType oldCrashInitialVelocity = crashInitialVelocity;
		crashInitialVelocity = newCrashInitialVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY, oldCrashInitialVelocity,
					newCrashInitialVelocity);
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
	public void setCrashInitialVelocity(PointXYZType newCrashInitialVelocity) {
		if (newCrashInitialVelocity != crashInitialVelocity) {
			NotificationChain msgs = null;
			if (crashInitialVelocity != null)
				msgs = ((InternalEObject) crashInitialVelocity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY, null, msgs);
			if (newCrashInitialVelocity != null)
				msgs = ((InternalEObject) newCrashInitialVelocity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY, null, msgs);
			msgs = basicSetCrashInitialVelocity(newCrashInitialVelocity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY, newCrashInitialVelocity,
					newCrashInitialVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getCrashInitialRotation() {
		return crashInitialRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrashInitialRotation(PointXYZType newCrashInitialRotation,
			NotificationChain msgs) {
		PointXYZType oldCrashInitialRotation = crashInitialRotation;
		crashInitialRotation = newCrashInitialRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION, oldCrashInitialRotation,
					newCrashInitialRotation);
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
	public void setCrashInitialRotation(PointXYZType newCrashInitialRotation) {
		if (newCrashInitialRotation != crashInitialRotation) {
			NotificationChain msgs = null;
			if (crashInitialRotation != null)
				msgs = ((InternalEObject) crashInitialRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION, null, msgs);
			if (newCrashInitialRotation != null)
				msgs = ((InternalEObject) newCrashInitialRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION, null, msgs);
			msgs = basicSetCrashInitialRotation(newCrashInitialRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION, newCrashInitialRotation,
					newCrashInitialRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getCrashInitialRotationalVelocity() {
		return crashInitialRotationalVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrashInitialRotationalVelocity(PointXYZType newCrashInitialRotationalVelocity,
			NotificationChain msgs) {
		PointXYZType oldCrashInitialRotationalVelocity = crashInitialRotationalVelocity;
		crashInitialRotationalVelocity = newCrashInitialRotationalVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY,
					oldCrashInitialRotationalVelocity, newCrashInitialRotationalVelocity);
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
	public void setCrashInitialRotationalVelocity(PointXYZType newCrashInitialRotationalVelocity) {
		if (newCrashInitialRotationalVelocity != crashInitialRotationalVelocity) {
			NotificationChain msgs = null;
			if (crashInitialRotationalVelocity != null)
				msgs = ((InternalEObject) crashInitialRotationalVelocity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY,
						null, msgs);
			if (newCrashInitialRotationalVelocity != null)
				msgs = ((InternalEObject) newCrashInitialRotationalVelocity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY,
						null, msgs);
			msgs = basicSetCrashInitialRotationalVelocity(newCrashInitialRotationalVelocity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY,
					newCrashInitialRotationalVelocity, newCrashInitialRotationalVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getReferencePointForRotation() {
		return referencePointForRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencePointForRotation(PointXYZType newReferencePointForRotation,
			NotificationChain msgs) {
		PointXYZType oldReferencePointForRotation = referencePointForRotation;
		referencePointForRotation = newReferencePointForRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION, oldReferencePointForRotation,
					newReferencePointForRotation);
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
	public void setReferencePointForRotation(PointXYZType newReferencePointForRotation) {
		if (newReferencePointForRotation != referencePointForRotation) {
			NotificationChain msgs = null;
			if (referencePointForRotation != null)
				msgs = ((InternalEObject) referencePointForRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION, null,
						msgs);
			if (newReferencePointForRotation != null)
				msgs = ((InternalEObject) newReferencePointForRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION, null,
						msgs);
			msgs = basicSetReferencePointForRotation(newReferencePointForRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION, newReferencePointForRotation,
					newReferencePointForRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getCrashAccelerationField() {
		return crashAccelerationField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrashAccelerationField(PointXYZType newCrashAccelerationField,
			NotificationChain msgs) {
		PointXYZType oldCrashAccelerationField = crashAccelerationField;
		crashAccelerationField = newCrashAccelerationField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD, oldCrashAccelerationField,
					newCrashAccelerationField);
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
	public void setCrashAccelerationField(PointXYZType newCrashAccelerationField) {
		if (newCrashAccelerationField != crashAccelerationField) {
			NotificationChain msgs = null;
			if (crashAccelerationField != null)
				msgs = ((InternalEObject) crashAccelerationField).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD, null,
						msgs);
			if (newCrashAccelerationField != null)
				msgs = ((InternalEObject) newCrashAccelerationField).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD, null,
						msgs);
			msgs = basicSetCrashAccelerationField(newCrashAccelerationField, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD, newCrashAccelerationField,
					newCrashAccelerationField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactSurfaceDefinitionType getImpactSurfaceDefinition() {
		return impactSurfaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpactSurfaceDefinition(ImpactSurfaceDefinitionType newImpactSurfaceDefinition,
			NotificationChain msgs) {
		ImpactSurfaceDefinitionType oldImpactSurfaceDefinition = impactSurfaceDefinition;
		impactSurfaceDefinition = newImpactSurfaceDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION, oldImpactSurfaceDefinition,
					newImpactSurfaceDefinition);
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
	public void setImpactSurfaceDefinition(ImpactSurfaceDefinitionType newImpactSurfaceDefinition) {
		if (newImpactSurfaceDefinition != impactSurfaceDefinition) {
			NotificationChain msgs = null;
			if (impactSurfaceDefinition != null)
				msgs = ((InternalEObject) impactSurfaceDefinition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION, null,
						msgs);
			if (newImpactSurfaceDefinition != null)
				msgs = ((InternalEObject) newImpactSurfaceDefinition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION, null,
						msgs);
			msgs = basicSetImpactSurfaceDefinition(newImpactSurfaceDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION, newImpactSurfaceDefinition,
					newImpactSurfaceDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CRASH_LOADCASE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CRASH_LOADCASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X:
			return basicSetCrashStartX(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X:
			return basicSetCrashEndX(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY:
			return basicSetCrashInitialVelocity(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION:
			return basicSetCrashInitialRotation(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY:
			return basicSetCrashInitialRotationalVelocity(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION:
			return basicSetReferencePointForRotation(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD:
			return basicSetCrashAccelerationField(null, msgs);
		case CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION:
			return basicSetImpactSurfaceDefinition(null, msgs);
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
		case CpacsPackage.CRASH_LOADCASE_TYPE__NAME:
			return getName();
		case CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X:
			return getCrashStartX();
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X:
			return getCrashEndX();
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY:
			return getCrashInitialVelocity();
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION:
			return getCrashInitialRotation();
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY:
			return getCrashInitialRotationalVelocity();
		case CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION:
			return getReferencePointForRotation();
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD:
			return getCrashAccelerationField();
		case CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION:
			return getImpactSurfaceDefinition();
		case CpacsPackage.CRASH_LOADCASE_TYPE__UID:
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
		case CpacsPackage.CRASH_LOADCASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X:
			setCrashStartX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X:
			setCrashEndX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY:
			setCrashInitialVelocity((PointXYZType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION:
			setCrashInitialRotation((PointXYZType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY:
			setCrashInitialRotationalVelocity((PointXYZType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION:
			setReferencePointForRotation((PointXYZType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD:
			setCrashAccelerationField((PointXYZType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION:
			setImpactSurfaceDefinition((ImpactSurfaceDefinitionType) newValue);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__UID:
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
		case CpacsPackage.CRASH_LOADCASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X:
			setCrashStartX((DoubleBaseType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X:
			setCrashEndX((DoubleBaseType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY:
			setCrashInitialVelocity((PointXYZType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION:
			setCrashInitialRotation((PointXYZType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY:
			setCrashInitialRotationalVelocity((PointXYZType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION:
			setReferencePointForRotation((PointXYZType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD:
			setCrashAccelerationField((PointXYZType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION:
			setImpactSurfaceDefinition((ImpactSurfaceDefinitionType) null);
			return;
		case CpacsPackage.CRASH_LOADCASE_TYPE__UID:
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
		case CpacsPackage.CRASH_LOADCASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_START_X:
			return crashStartX != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_END_X:
			return crashEndX != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_VELOCITY:
			return crashInitialVelocity != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATION:
			return crashInitialRotation != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_INITIAL_ROTATIONAL_VELOCITY:
			return crashInitialRotationalVelocity != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__REFERENCE_POINT_FOR_ROTATION:
			return referencePointForRotation != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__CRASH_ACCELERATION_FIELD:
			return crashAccelerationField != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__IMPACT_SURFACE_DEFINITION:
			return impactSurfaceDefinition != null;
		case CpacsPackage.CRASH_LOADCASE_TYPE__UID:
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

} //CrashLoadcaseTypeImpl
