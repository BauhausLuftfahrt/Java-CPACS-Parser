/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.PointYType;
import Cpacs.PylonRibsPositioningType;
import Cpacs.RibCrossingBehaviourType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Ribs Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonRibsPositioningTypeImpl#getRelDepthStart <em>Rel Depth Start</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsPositioningTypeImpl#getRelDepthEnd <em>Rel Depth End</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsPositioningTypeImpl#getRibRotation <em>Rib Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsPositioningTypeImpl#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsPositioningTypeImpl#getNumberOfRibs <em>Number Of Ribs</em>}</li>
 *   <li>{@link Cpacs.impl.PylonRibsPositioningTypeImpl#getRibCrossingBehaviour <em>Rib Crossing Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonRibsPositioningTypeImpl extends ComplexBaseTypeImpl implements PylonRibsPositioningType {
	/**
	 * The cached value of the '{@link #getRelDepthStart() <em>Rel Depth Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelDepthStart()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType relDepthStart;

	/**
	 * The cached value of the '{@link #getRelDepthEnd() <em>Rel Depth End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelDepthEnd()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType relDepthEnd;

	/**
	 * The cached value of the '{@link #getRibRotation() <em>Rib Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibRotation()
	 * @generated
	 * @ordered
	 */
	protected PointYType ribRotation;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType spacing;

	/**
	 * The cached value of the '{@link #getNumberOfRibs() <em>Number Of Ribs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRibs()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfRibs;

	/**
	 * The cached value of the '{@link #getRibCrossingBehaviour() <em>Rib Crossing Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibCrossingBehaviour()
	 * @generated
	 * @ordered
	 */
	protected RibCrossingBehaviourType ribCrossingBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PylonRibsPositioningTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonRibsPositioningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRelDepthStart() {
		return relDepthStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelDepthStart(DoubleBaseType newRelDepthStart, NotificationChain msgs) {
		DoubleBaseType oldRelDepthStart = relDepthStart;
		relDepthStart = newRelDepthStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START, oldRelDepthStart, newRelDepthStart);
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
	public void setRelDepthStart(DoubleBaseType newRelDepthStart) {
		if (newRelDepthStart != relDepthStart) {
			NotificationChain msgs = null;
			if (relDepthStart != null)
				msgs = ((InternalEObject) relDepthStart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START, null, msgs);
			if (newRelDepthStart != null)
				msgs = ((InternalEObject) newRelDepthStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START, null, msgs);
			msgs = basicSetRelDepthStart(newRelDepthStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START, newRelDepthStart, newRelDepthStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRelDepthEnd() {
		return relDepthEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelDepthEnd(DoubleBaseType newRelDepthEnd, NotificationChain msgs) {
		DoubleBaseType oldRelDepthEnd = relDepthEnd;
		relDepthEnd = newRelDepthEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END, oldRelDepthEnd, newRelDepthEnd);
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
	public void setRelDepthEnd(DoubleBaseType newRelDepthEnd) {
		if (newRelDepthEnd != relDepthEnd) {
			NotificationChain msgs = null;
			if (relDepthEnd != null)
				msgs = ((InternalEObject) relDepthEnd).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END, null, msgs);
			if (newRelDepthEnd != null)
				msgs = ((InternalEObject) newRelDepthEnd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END, null, msgs);
			msgs = basicSetRelDepthEnd(newRelDepthEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END, newRelDepthEnd, newRelDepthEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointYType getRibRotation() {
		return ribRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibRotation(PointYType newRibRotation, NotificationChain msgs) {
		PointYType oldRibRotation = ribRotation;
		ribRotation = newRibRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION, oldRibRotation, newRibRotation);
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
	public void setRibRotation(PointYType newRibRotation) {
		if (newRibRotation != ribRotation) {
			NotificationChain msgs = null;
			if (ribRotation != null)
				msgs = ((InternalEObject) ribRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION, null, msgs);
			if (newRibRotation != null)
				msgs = ((InternalEObject) newRibRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION, null, msgs);
			msgs = basicSetRibRotation(newRibRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION, newRibRotation, newRibRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpacing(DoubleBaseType newSpacing, NotificationChain msgs) {
		DoubleBaseType oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING, oldSpacing, newSpacing);
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
	public void setSpacing(DoubleBaseType newSpacing) {
		if (newSpacing != spacing) {
			NotificationChain msgs = null;
			if (spacing != null)
				msgs = ((InternalEObject) spacing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING, null, msgs);
			if (newSpacing != null)
				msgs = ((InternalEObject) newSpacing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING, null, msgs);
			msgs = basicSetSpacing(newSpacing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING,
					newSpacing, newSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfRibs() {
		return numberOfRibs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfRibs(IntegerBaseType newNumberOfRibs, NotificationChain msgs) {
		IntegerBaseType oldNumberOfRibs = numberOfRibs;
		numberOfRibs = newNumberOfRibs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS, oldNumberOfRibs, newNumberOfRibs);
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
	public void setNumberOfRibs(IntegerBaseType newNumberOfRibs) {
		if (newNumberOfRibs != numberOfRibs) {
			NotificationChain msgs = null;
			if (numberOfRibs != null)
				msgs = ((InternalEObject) numberOfRibs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS, null, msgs);
			if (newNumberOfRibs != null)
				msgs = ((InternalEObject) newNumberOfRibs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS, null, msgs);
			msgs = basicSetNumberOfRibs(newNumberOfRibs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS, newNumberOfRibs, newNumberOfRibs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibCrossingBehaviourType getRibCrossingBehaviour() {
		return ribCrossingBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibCrossingBehaviour(RibCrossingBehaviourType newRibCrossingBehaviour,
			NotificationChain msgs) {
		RibCrossingBehaviourType oldRibCrossingBehaviour = ribCrossingBehaviour;
		ribCrossingBehaviour = newRibCrossingBehaviour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR, oldRibCrossingBehaviour,
					newRibCrossingBehaviour);
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
	public void setRibCrossingBehaviour(RibCrossingBehaviourType newRibCrossingBehaviour) {
		if (newRibCrossingBehaviour != ribCrossingBehaviour) {
			NotificationChain msgs = null;
			if (ribCrossingBehaviour != null)
				msgs = ((InternalEObject) ribCrossingBehaviour).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR, null,
						msgs);
			if (newRibCrossingBehaviour != null)
				msgs = ((InternalEObject) newRibCrossingBehaviour).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR, null,
						msgs);
			msgs = basicSetRibCrossingBehaviour(newRibCrossingBehaviour, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR, newRibCrossingBehaviour,
					newRibCrossingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START:
			return basicSetRelDepthStart(null, msgs);
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END:
			return basicSetRelDepthEnd(null, msgs);
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			return basicSetRibRotation(null, msgs);
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING:
			return basicSetSpacing(null, msgs);
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			return basicSetNumberOfRibs(null, msgs);
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			return basicSetRibCrossingBehaviour(null, msgs);
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
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START:
			return getRelDepthStart();
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END:
			return getRelDepthEnd();
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			return getRibRotation();
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING:
			return getSpacing();
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			return getNumberOfRibs();
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			return getRibCrossingBehaviour();
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
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START:
			setRelDepthStart((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END:
			setRelDepthEnd((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			setRibRotation((PointYType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING:
			setSpacing((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			setNumberOfRibs((IntegerBaseType) newValue);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			setRibCrossingBehaviour((RibCrossingBehaviourType) newValue);
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
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START:
			setRelDepthStart((DoubleBaseType) null);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END:
			setRelDepthEnd((DoubleBaseType) null);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			setRibRotation((PointYType) null);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING:
			setSpacing((DoubleBaseType) null);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			setNumberOfRibs((IntegerBaseType) null);
			return;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			setRibCrossingBehaviour((RibCrossingBehaviourType) null);
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
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_START:
			return relDepthStart != null;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__REL_DEPTH_END:
			return relDepthEnd != null;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			return ribRotation != null;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__SPACING:
			return spacing != null;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			return numberOfRibs != null;
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			return ribCrossingBehaviour != null;
		}
		return super.eIsSet(featureID);
	}

} //PylonRibsPositioningTypeImpl
