/**
 */
package Cpacs.impl;

import Cpacs.CellPositioningChordwiseType;
import Cpacs.CellPositioningSpanwiseType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MaterialDefinitionType;
import Cpacs.WingIntermediateStructureCellType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Intermediate Structure Cell Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellTypeImpl#getPositioningLeadingEdge <em>Positioning Leading Edge</em>}</li>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellTypeImpl#getPositioningTrailingEdge <em>Positioning Trailing Edge</em>}</li>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellTypeImpl#getPositioningInnerBorder <em>Positioning Inner Border</em>}</li>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellTypeImpl#getPositioningOuterBorder <em>Positioning Outer Border</em>}</li>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellTypeImpl#getRotX <em>Rot X</em>}</li>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellTypeImpl#getRotZ <em>Rot Z</em>}</li>
 *   <li>{@link Cpacs.impl.WingIntermediateStructureCellTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingIntermediateStructureCellTypeImpl extends ComplexBaseTypeImpl
		implements WingIntermediateStructureCellType {
	/**
	 * The cached value of the '{@link #getPositioningLeadingEdge() <em>Positioning Leading Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioningLeadingEdge()
	 * @generated
	 * @ordered
	 */
	protected CellPositioningChordwiseType positioningLeadingEdge;

	/**
	 * The cached value of the '{@link #getPositioningTrailingEdge() <em>Positioning Trailing Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioningTrailingEdge()
	 * @generated
	 * @ordered
	 */
	protected CellPositioningChordwiseType positioningTrailingEdge;

	/**
	 * The cached value of the '{@link #getPositioningInnerBorder() <em>Positioning Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioningInnerBorder()
	 * @generated
	 * @ordered
	 */
	protected CellPositioningSpanwiseType positioningInnerBorder;

	/**
	 * The cached value of the '{@link #getPositioningOuterBorder() <em>Positioning Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioningOuterBorder()
	 * @generated
	 * @ordered
	 */
	protected CellPositioningSpanwiseType positioningOuterBorder;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType material;

	/**
	 * The cached value of the '{@link #getRotX() <em>Rot X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rotX;

	/**
	 * The cached value of the '{@link #getRotZ() <em>Rot Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rotZ;

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
	protected WingIntermediateStructureCellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingIntermediateStructureCellType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningChordwiseType getPositioningLeadingEdge() {
		return positioningLeadingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioningLeadingEdge(CellPositioningChordwiseType newPositioningLeadingEdge,
			NotificationChain msgs) {
		CellPositioningChordwiseType oldPositioningLeadingEdge = positioningLeadingEdge;
		positioningLeadingEdge = newPositioningLeadingEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE,
					oldPositioningLeadingEdge, newPositioningLeadingEdge);
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
	public void setPositioningLeadingEdge(CellPositioningChordwiseType newPositioningLeadingEdge) {
		if (newPositioningLeadingEdge != positioningLeadingEdge) {
			NotificationChain msgs = null;
			if (positioningLeadingEdge != null)
				msgs = ((InternalEObject) positioningLeadingEdge).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE,
						null, msgs);
			if (newPositioningLeadingEdge != null)
				msgs = ((InternalEObject) newPositioningLeadingEdge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE,
						null, msgs);
			msgs = basicSetPositioningLeadingEdge(newPositioningLeadingEdge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE,
					newPositioningLeadingEdge, newPositioningLeadingEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningChordwiseType getPositioningTrailingEdge() {
		return positioningTrailingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioningTrailingEdge(CellPositioningChordwiseType newPositioningTrailingEdge,
			NotificationChain msgs) {
		CellPositioningChordwiseType oldPositioningTrailingEdge = positioningTrailingEdge;
		positioningTrailingEdge = newPositioningTrailingEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE,
					oldPositioningTrailingEdge, newPositioningTrailingEdge);
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
	public void setPositioningTrailingEdge(CellPositioningChordwiseType newPositioningTrailingEdge) {
		if (newPositioningTrailingEdge != positioningTrailingEdge) {
			NotificationChain msgs = null;
			if (positioningTrailingEdge != null)
				msgs = ((InternalEObject) positioningTrailingEdge).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE,
						null, msgs);
			if (newPositioningTrailingEdge != null)
				msgs = ((InternalEObject) newPositioningTrailingEdge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE,
						null, msgs);
			msgs = basicSetPositioningTrailingEdge(newPositioningTrailingEdge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE,
					newPositioningTrailingEdge, newPositioningTrailingEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningSpanwiseType getPositioningInnerBorder() {
		return positioningInnerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioningInnerBorder(CellPositioningSpanwiseType newPositioningInnerBorder,
			NotificationChain msgs) {
		CellPositioningSpanwiseType oldPositioningInnerBorder = positioningInnerBorder;
		positioningInnerBorder = newPositioningInnerBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER,
					oldPositioningInnerBorder, newPositioningInnerBorder);
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
	public void setPositioningInnerBorder(CellPositioningSpanwiseType newPositioningInnerBorder) {
		if (newPositioningInnerBorder != positioningInnerBorder) {
			NotificationChain msgs = null;
			if (positioningInnerBorder != null)
				msgs = ((InternalEObject) positioningInnerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER,
						null, msgs);
			if (newPositioningInnerBorder != null)
				msgs = ((InternalEObject) newPositioningInnerBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER,
						null, msgs);
			msgs = basicSetPositioningInnerBorder(newPositioningInnerBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER,
					newPositioningInnerBorder, newPositioningInnerBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningSpanwiseType getPositioningOuterBorder() {
		return positioningOuterBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioningOuterBorder(CellPositioningSpanwiseType newPositioningOuterBorder,
			NotificationChain msgs) {
		CellPositioningSpanwiseType oldPositioningOuterBorder = positioningOuterBorder;
		positioningOuterBorder = newPositioningOuterBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER,
					oldPositioningOuterBorder, newPositioningOuterBorder);
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
	public void setPositioningOuterBorder(CellPositioningSpanwiseType newPositioningOuterBorder) {
		if (newPositioningOuterBorder != positioningOuterBorder) {
			NotificationChain msgs = null;
			if (positioningOuterBorder != null)
				msgs = ((InternalEObject) positioningOuterBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER,
						null, msgs);
			if (newPositioningOuterBorder != null)
				msgs = ((InternalEObject) newPositioningOuterBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER,
						null, msgs);
			msgs = basicSetPositioningOuterBorder(newPositioningOuterBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER,
					newPositioningOuterBorder, newPositioningOuterBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(MaterialDefinitionType newMaterial, NotificationChain msgs) {
		MaterialDefinitionType oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL, oldMaterial, newMaterial);
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
	public void setMaterial(MaterialDefinitionType newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject) material).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL, null,
						msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject) newMaterial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL, null,
						msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL, newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRotX() {
		return rotX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotX(DoubleBaseType newRotX, NotificationChain msgs) {
		DoubleBaseType oldRotX = rotX;
		rotX = newRotX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X, oldRotX, newRotX);
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
	public void setRotX(DoubleBaseType newRotX) {
		if (newRotX != rotX) {
			NotificationChain msgs = null;
			if (rotX != null)
				msgs = ((InternalEObject) rotX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X, null, msgs);
			if (newRotX != null)
				msgs = ((InternalEObject) newRotX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X, null, msgs);
			msgs = basicSetRotX(newRotX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X, newRotX, newRotX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRotZ() {
		return rotZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotZ(DoubleBaseType newRotZ, NotificationChain msgs) {
		DoubleBaseType oldRotZ = rotZ;
		rotZ = newRotZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z, oldRotZ, newRotZ);
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
	public void setRotZ(DoubleBaseType newRotZ) {
		if (newRotZ != rotZ) {
			NotificationChain msgs = null;
			if (rotZ != null)
				msgs = ((InternalEObject) rotZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z, null, msgs);
			if (newRotZ != null)
				msgs = ((InternalEObject) newRotZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z, null, msgs);
			msgs = basicSetRotZ(newRotZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z, newRotZ, newRotZ));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE:
			return basicSetPositioningLeadingEdge(null, msgs);
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			return basicSetPositioningTrailingEdge(null, msgs);
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER:
			return basicSetPositioningInnerBorder(null, msgs);
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER:
			return basicSetPositioningOuterBorder(null, msgs);
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL:
			return basicSetMaterial(null, msgs);
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X:
			return basicSetRotX(null, msgs);
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z:
			return basicSetRotZ(null, msgs);
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
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE:
			return getPositioningLeadingEdge();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			return getPositioningTrailingEdge();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER:
			return getPositioningInnerBorder();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER:
			return getPositioningOuterBorder();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL:
			return getMaterial();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X:
			return getRotX();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z:
			return getRotZ();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__UID:
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
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE:
			setPositioningLeadingEdge((CellPositioningChordwiseType) newValue);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			setPositioningTrailingEdge((CellPositioningChordwiseType) newValue);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER:
			setPositioningInnerBorder((CellPositioningSpanwiseType) newValue);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER:
			setPositioningOuterBorder((CellPositioningSpanwiseType) newValue);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X:
			setRotX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z:
			setRotZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__UID:
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
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE:
			setPositioningLeadingEdge((CellPositioningChordwiseType) null);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			setPositioningTrailingEdge((CellPositioningChordwiseType) null);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER:
			setPositioningInnerBorder((CellPositioningSpanwiseType) null);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER:
			setPositioningOuterBorder((CellPositioningSpanwiseType) null);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) null);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X:
			setRotX((DoubleBaseType) null);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z:
			setRotZ((DoubleBaseType) null);
			return;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__UID:
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
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_LEADING_EDGE:
			return positioningLeadingEdge != null;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			return positioningTrailingEdge != null;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_INNER_BORDER:
			return positioningInnerBorder != null;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__POSITIONING_OUTER_BORDER:
			return positioningOuterBorder != null;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__MATERIAL:
			return material != null;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_X:
			return rotX != null;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__ROT_Z:
			return rotZ != null;
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE__UID:
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

} //WingIntermediateStructureCellTypeImpl
