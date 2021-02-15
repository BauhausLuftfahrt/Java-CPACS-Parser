/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WallPositionsType;
import Cpacs.WallSegmentsType;
import Cpacs.WallsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Walls Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WallsTypeImpl#getWallPositions <em>Wall Positions</em>}</li>
 *   <li>{@link Cpacs.impl.WallsTypeImpl#getWallSegments <em>Wall Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallsTypeImpl extends ComplexBaseTypeImpl implements WallsType {
	/**
	 * The cached value of the '{@link #getWallPositions() <em>Wall Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallPositions()
	 * @generated
	 * @ordered
	 */
	protected WallPositionsType wallPositions;

	/**
	 * The cached value of the '{@link #getWallSegments() <em>Wall Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallSegments()
	 * @generated
	 * @ordered
	 */
	protected WallSegmentsType wallSegments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWallsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallPositionsType getWallPositions() {
		return wallPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWallPositions(WallPositionsType newWallPositions, NotificationChain msgs) {
		WallPositionsType oldWallPositions = wallPositions;
		wallPositions = newWallPositions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALLS_TYPE__WALL_POSITIONS, oldWallPositions, newWallPositions);
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
	public void setWallPositions(WallPositionsType newWallPositions) {
		if (newWallPositions != wallPositions) {
			NotificationChain msgs = null;
			if (wallPositions != null)
				msgs = ((InternalEObject) wallPositions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALLS_TYPE__WALL_POSITIONS, null, msgs);
			if (newWallPositions != null)
				msgs = ((InternalEObject) newWallPositions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALLS_TYPE__WALL_POSITIONS, null, msgs);
			msgs = basicSetWallPositions(newWallPositions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALLS_TYPE__WALL_POSITIONS,
					newWallPositions, newWallPositions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallSegmentsType getWallSegments() {
		return wallSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWallSegments(WallSegmentsType newWallSegments, NotificationChain msgs) {
		WallSegmentsType oldWallSegments = wallSegments;
		wallSegments = newWallSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WALLS_TYPE__WALL_SEGMENTS, oldWallSegments, newWallSegments);
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
	public void setWallSegments(WallSegmentsType newWallSegments) {
		if (newWallSegments != wallSegments) {
			NotificationChain msgs = null;
			if (wallSegments != null)
				msgs = ((InternalEObject) wallSegments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALLS_TYPE__WALL_SEGMENTS, null, msgs);
			if (newWallSegments != null)
				msgs = ((InternalEObject) newWallSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WALLS_TYPE__WALL_SEGMENTS, null, msgs);
			msgs = basicSetWallSegments(newWallSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WALLS_TYPE__WALL_SEGMENTS,
					newWallSegments, newWallSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WALLS_TYPE__WALL_POSITIONS:
			return basicSetWallPositions(null, msgs);
		case CpacsPackage.WALLS_TYPE__WALL_SEGMENTS:
			return basicSetWallSegments(null, msgs);
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
		case CpacsPackage.WALLS_TYPE__WALL_POSITIONS:
			return getWallPositions();
		case CpacsPackage.WALLS_TYPE__WALL_SEGMENTS:
			return getWallSegments();
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
		case CpacsPackage.WALLS_TYPE__WALL_POSITIONS:
			setWallPositions((WallPositionsType) newValue);
			return;
		case CpacsPackage.WALLS_TYPE__WALL_SEGMENTS:
			setWallSegments((WallSegmentsType) newValue);
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
		case CpacsPackage.WALLS_TYPE__WALL_POSITIONS:
			setWallPositions((WallPositionsType) null);
			return;
		case CpacsPackage.WALLS_TYPE__WALL_SEGMENTS:
			setWallSegments((WallSegmentsType) null);
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
		case CpacsPackage.WALLS_TYPE__WALL_POSITIONS:
			return wallPositions != null;
		case CpacsPackage.WALLS_TYPE__WALL_SEGMENTS:
			return wallSegments != null;
		}
		return super.eIsSet(featureID);
	}

} //WallsTypeImpl
