/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutoutTypeType;
import Cpacs.DoubleBaseType;
import Cpacs.FuselageCutOutType;
import Cpacs.PointXYZType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselage Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getReferenceY <em>Reference Y</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getReferenceZ <em>Reference Z</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getReferenceAngle <em>Reference Angle</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getOrientationVector <em>Orientation Vector</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getAlignmentVector <em>Alignment Vector</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getDeltaY <em>Delta Y</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getDeltaZ <em>Delta Z</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getDeltaY1 <em>Delta Y1</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getDeltaZ1 <em>Delta Z1</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getCutoutType <em>Cutout Type</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageCutOutTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageCutOutTypeImpl extends ComplexBaseTypeImpl implements FuselageCutOutType {
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
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionX;

	/**
	 * The cached value of the '{@link #getReferenceY() <em>Reference Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType referenceY;

	/**
	 * The cached value of the '{@link #getReferenceZ() <em>Reference Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType referenceZ;

	/**
	 * The cached value of the '{@link #getReferenceAngle() <em>Reference Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType referenceAngle;

	/**
	 * The cached value of the '{@link #getOrientationVector() <em>Orientation Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationVector()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType orientationVector;

	/**
	 * The cached value of the '{@link #getAlignmentVector() <em>Alignment Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentVector()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType alignmentVector;

	/**
	 * The cached value of the '{@link #getDeltaY() <em>Delta Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaY;

	/**
	 * The cached value of the '{@link #getDeltaZ() <em>Delta Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaZ;

	/**
	 * The cached value of the '{@link #getDeltaY1() <em>Delta Y1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaY1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaY1;

	/**
	 * The cached value of the '{@link #getDeltaZ1() <em>Delta Z1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaZ1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaZ1;

	/**
	 * The cached value of the '{@link #getFilletRadius() <em>Fillet Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType filletRadius;

	/**
	 * The cached value of the '{@link #getCutoutType() <em>Cutout Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutoutType()
	 * @generated
	 * @ordered
	 */
	protected CutoutTypeType cutoutType;

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
	protected FuselageCutOutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageCutOutType();
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
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME, newName,
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
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionX(DoubleBaseType newPositionX, NotificationChain msgs) {
		DoubleBaseType oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X, oldPositionX, newPositionX);
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
	public void setPositionX(DoubleBaseType newPositionX) {
		if (newPositionX != positionX) {
			NotificationChain msgs = null;
			if (positionX != null)
				msgs = ((InternalEObject) positionX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X, null, msgs);
			if (newPositionX != null)
				msgs = ((InternalEObject) newPositionX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X, null, msgs);
			msgs = basicSetPositionX(newPositionX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X,
					newPositionX, newPositionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReferenceY() {
		return referenceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceY(DoubleBaseType newReferenceY, NotificationChain msgs) {
		DoubleBaseType oldReferenceY = referenceY;
		referenceY = newReferenceY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y, oldReferenceY, newReferenceY);
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
	public void setReferenceY(DoubleBaseType newReferenceY) {
		if (newReferenceY != referenceY) {
			NotificationChain msgs = null;
			if (referenceY != null)
				msgs = ((InternalEObject) referenceY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y, null, msgs);
			if (newReferenceY != null)
				msgs = ((InternalEObject) newReferenceY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y, null, msgs);
			msgs = basicSetReferenceY(newReferenceY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y,
					newReferenceY, newReferenceY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReferenceZ() {
		return referenceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceZ(DoubleBaseType newReferenceZ, NotificationChain msgs) {
		DoubleBaseType oldReferenceZ = referenceZ;
		referenceZ = newReferenceZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z, oldReferenceZ, newReferenceZ);
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
	public void setReferenceZ(DoubleBaseType newReferenceZ) {
		if (newReferenceZ != referenceZ) {
			NotificationChain msgs = null;
			if (referenceZ != null)
				msgs = ((InternalEObject) referenceZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z, null, msgs);
			if (newReferenceZ != null)
				msgs = ((InternalEObject) newReferenceZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z, null, msgs);
			msgs = basicSetReferenceZ(newReferenceZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z,
					newReferenceZ, newReferenceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReferenceAngle() {
		return referenceAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceAngle(DoubleBaseType newReferenceAngle, NotificationChain msgs) {
		DoubleBaseType oldReferenceAngle = referenceAngle;
		referenceAngle = newReferenceAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE, oldReferenceAngle, newReferenceAngle);
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
	public void setReferenceAngle(DoubleBaseType newReferenceAngle) {
		if (newReferenceAngle != referenceAngle) {
			NotificationChain msgs = null;
			if (referenceAngle != null)
				msgs = ((InternalEObject) referenceAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE, null, msgs);
			if (newReferenceAngle != null)
				msgs = ((InternalEObject) newReferenceAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE, null, msgs);
			msgs = basicSetReferenceAngle(newReferenceAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE,
					newReferenceAngle, newReferenceAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getOrientationVector() {
		return orientationVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationVector(PointXYZType newOrientationVector, NotificationChain msgs) {
		PointXYZType oldOrientationVector = orientationVector;
		orientationVector = newOrientationVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR, oldOrientationVector, newOrientationVector);
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
	public void setOrientationVector(PointXYZType newOrientationVector) {
		if (newOrientationVector != orientationVector) {
			NotificationChain msgs = null;
			if (orientationVector != null)
				msgs = ((InternalEObject) orientationVector).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR, null, msgs);
			if (newOrientationVector != null)
				msgs = ((InternalEObject) newOrientationVector).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR, null, msgs);
			msgs = basicSetOrientationVector(newOrientationVector, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR, newOrientationVector,
					newOrientationVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getAlignmentVector() {
		return alignmentVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlignmentVector(PointXYZType newAlignmentVector, NotificationChain msgs) {
		PointXYZType oldAlignmentVector = alignmentVector;
		alignmentVector = newAlignmentVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR, oldAlignmentVector, newAlignmentVector);
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
	public void setAlignmentVector(PointXYZType newAlignmentVector) {
		if (newAlignmentVector != alignmentVector) {
			NotificationChain msgs = null;
			if (alignmentVector != null)
				msgs = ((InternalEObject) alignmentVector).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR, null, msgs);
			if (newAlignmentVector != null)
				msgs = ((InternalEObject) newAlignmentVector).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR, null, msgs);
			msgs = basicSetAlignmentVector(newAlignmentVector, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR,
					newAlignmentVector, newAlignmentVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaY() {
		return deltaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaY(DoubleBaseType newDeltaY, NotificationChain msgs) {
		DoubleBaseType oldDeltaY = deltaY;
		deltaY = newDeltaY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y, oldDeltaY, newDeltaY);
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
	public void setDeltaY(DoubleBaseType newDeltaY) {
		if (newDeltaY != deltaY) {
			NotificationChain msgs = null;
			if (deltaY != null)
				msgs = ((InternalEObject) deltaY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y, null, msgs);
			if (newDeltaY != null)
				msgs = ((InternalEObject) newDeltaY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y, null, msgs);
			msgs = basicSetDeltaY(newDeltaY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y,
					newDeltaY, newDeltaY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaZ() {
		return deltaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaZ(DoubleBaseType newDeltaZ, NotificationChain msgs) {
		DoubleBaseType oldDeltaZ = deltaZ;
		deltaZ = newDeltaZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z, oldDeltaZ, newDeltaZ);
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
	public void setDeltaZ(DoubleBaseType newDeltaZ) {
		if (newDeltaZ != deltaZ) {
			NotificationChain msgs = null;
			if (deltaZ != null)
				msgs = ((InternalEObject) deltaZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z, null, msgs);
			if (newDeltaZ != null)
				msgs = ((InternalEObject) newDeltaZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z, null, msgs);
			msgs = basicSetDeltaZ(newDeltaZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z,
					newDeltaZ, newDeltaZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaY1() {
		return deltaY1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaY1(DoubleBaseType newDeltaY1, NotificationChain msgs) {
		DoubleBaseType oldDeltaY1 = deltaY1;
		deltaY1 = newDeltaY1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1, oldDeltaY1, newDeltaY1);
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
	public void setDeltaY1(DoubleBaseType newDeltaY1) {
		if (newDeltaY1 != deltaY1) {
			NotificationChain msgs = null;
			if (deltaY1 != null)
				msgs = ((InternalEObject) deltaY1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1, null, msgs);
			if (newDeltaY1 != null)
				msgs = ((InternalEObject) newDeltaY1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1, null, msgs);
			msgs = basicSetDeltaY1(newDeltaY1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1,
					newDeltaY1, newDeltaY1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaZ1() {
		return deltaZ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaZ1(DoubleBaseType newDeltaZ1, NotificationChain msgs) {
		DoubleBaseType oldDeltaZ1 = deltaZ1;
		deltaZ1 = newDeltaZ1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1, oldDeltaZ1, newDeltaZ1);
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
	public void setDeltaZ1(DoubleBaseType newDeltaZ1) {
		if (newDeltaZ1 != deltaZ1) {
			NotificationChain msgs = null;
			if (deltaZ1 != null)
				msgs = ((InternalEObject) deltaZ1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1, null, msgs);
			if (newDeltaZ1 != null)
				msgs = ((InternalEObject) newDeltaZ1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1, null, msgs);
			msgs = basicSetDeltaZ1(newDeltaZ1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1,
					newDeltaZ1, newDeltaZ1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFilletRadius() {
		return filletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilletRadius(DoubleBaseType newFilletRadius, NotificationChain msgs) {
		DoubleBaseType oldFilletRadius = filletRadius;
		filletRadius = newFilletRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS, oldFilletRadius, newFilletRadius);
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
	public void setFilletRadius(DoubleBaseType newFilletRadius) {
		if (newFilletRadius != filletRadius) {
			NotificationChain msgs = null;
			if (filletRadius != null)
				msgs = ((InternalEObject) filletRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS, null, msgs);
			if (newFilletRadius != null)
				msgs = ((InternalEObject) newFilletRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS, null, msgs);
			msgs = basicSetFilletRadius(newFilletRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS,
					newFilletRadius, newFilletRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutoutTypeType getCutoutType() {
		return cutoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutoutType(CutoutTypeType newCutoutType, NotificationChain msgs) {
		CutoutTypeType oldCutoutType = cutoutType;
		cutoutType = newCutoutType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE, oldCutoutType, newCutoutType);
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
	public void setCutoutType(CutoutTypeType newCutoutType) {
		if (newCutoutType != cutoutType) {
			NotificationChain msgs = null;
			if (cutoutType != null)
				msgs = ((InternalEObject) cutoutType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE, null, msgs);
			if (newCutoutType != null)
				msgs = ((InternalEObject) newCutoutType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE, null, msgs);
			msgs = basicSetCutoutType(newCutoutType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE,
					newCutoutType, newCutoutType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_CUT_OUT_TYPE__UID, oldUID,
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
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X:
			return basicSetPositionX(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y:
			return basicSetReferenceY(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z:
			return basicSetReferenceZ(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE:
			return basicSetReferenceAngle(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR:
			return basicSetOrientationVector(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR:
			return basicSetAlignmentVector(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y:
			return basicSetDeltaY(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z:
			return basicSetDeltaZ(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1:
			return basicSetDeltaY1(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1:
			return basicSetDeltaZ1(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS:
			return basicSetFilletRadius(null, msgs);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE:
			return basicSetCutoutType(null, msgs);
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
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME:
			return getName();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X:
			return getPositionX();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y:
			return getReferenceY();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z:
			return getReferenceZ();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE:
			return getReferenceAngle();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR:
			return getOrientationVector();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR:
			return getAlignmentVector();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y:
			return getDeltaY();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z:
			return getDeltaZ();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1:
			return getDeltaY1();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1:
			return getDeltaZ1();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS:
			return getFilletRadius();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE:
			return getCutoutType();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X:
			setPositionX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y:
			setReferenceY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z:
			setReferenceZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE:
			setReferenceAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR:
			setOrientationVector((PointXYZType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR:
			setAlignmentVector((PointXYZType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y:
			setDeltaY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z:
			setDeltaZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1:
			setDeltaY1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1:
			setDeltaZ1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS:
			setFilletRadius((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE:
			setCutoutType((CutoutTypeType) newValue);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X:
			setPositionX((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y:
			setReferenceY((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z:
			setReferenceZ((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE:
			setReferenceAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR:
			setOrientationVector((PointXYZType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR:
			setAlignmentVector((PointXYZType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y:
			setDeltaY((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z:
			setDeltaZ((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1:
			setDeltaY1((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1:
			setDeltaZ1((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS:
			setFilletRadius((DoubleBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE:
			setCutoutType((CutoutTypeType) null);
			return;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__NAME:
			return name != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__POSITION_X:
			return positionX != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Y:
			return referenceY != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_Z:
			return referenceZ != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__REFERENCE_ANGLE:
			return referenceAngle != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ORIENTATION_VECTOR:
			return orientationVector != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__ALIGNMENT_VECTOR:
			return alignmentVector != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y:
			return deltaY != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z:
			return deltaZ != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Y1:
			return deltaY1 != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__DELTA_Z1:
			return deltaZ1 != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__FILLET_RADIUS:
			return filletRadius != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__CUTOUT_TYPE:
			return cutoutType != null;
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE__UID:
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

} //FuselageCutOutTypeImpl
