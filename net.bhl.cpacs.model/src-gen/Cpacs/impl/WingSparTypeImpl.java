/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SparPositionsType;
import Cpacs.SparSegmentsType;
import Cpacs.WingSparType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Spar Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingSparTypeImpl#getSparPositions <em>Spar Positions</em>}</li>
 *   <li>{@link Cpacs.impl.WingSparTypeImpl#getSparSegments <em>Spar Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingSparTypeImpl extends ComplexBaseTypeImpl implements WingSparType {
	/**
	 * The cached value of the '{@link #getSparPositions() <em>Spar Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparPositions()
	 * @generated
	 * @ordered
	 */
	protected SparPositionsType sparPositions;

	/**
	 * The cached value of the '{@link #getSparSegments() <em>Spar Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparSegments()
	 * @generated
	 * @ordered
	 */
	protected SparSegmentsType sparSegments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingSparTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingSparType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparPositionsType getSparPositions() {
		return sparPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparPositions(SparPositionsType newSparPositions, NotificationChain msgs) {
		SparPositionsType oldSparPositions = sparPositions;
		sparPositions = newSparPositions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS, oldSparPositions, newSparPositions);
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
	public void setSparPositions(SparPositionsType newSparPositions) {
		if (newSparPositions != sparPositions) {
			NotificationChain msgs = null;
			if (sparPositions != null)
				msgs = ((InternalEObject) sparPositions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS, null, msgs);
			if (newSparPositions != null)
				msgs = ((InternalEObject) newSparPositions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS, null, msgs);
			msgs = basicSetSparPositions(newSparPositions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS,
					newSparPositions, newSparPositions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparSegmentsType getSparSegments() {
		return sparSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSparSegments(SparSegmentsType newSparSegments, NotificationChain msgs) {
		SparSegmentsType oldSparSegments = sparSegments;
		sparSegments = newSparSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS, oldSparSegments, newSparSegments);
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
	public void setSparSegments(SparSegmentsType newSparSegments) {
		if (newSparSegments != sparSegments) {
			NotificationChain msgs = null;
			if (sparSegments != null)
				msgs = ((InternalEObject) sparSegments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS, null, msgs);
			if (newSparSegments != null)
				msgs = ((InternalEObject) newSparSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS, null, msgs);
			msgs = basicSetSparSegments(newSparSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS,
					newSparSegments, newSparSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS:
			return basicSetSparPositions(null, msgs);
		case CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS:
			return basicSetSparSegments(null, msgs);
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
		case CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS:
			return getSparPositions();
		case CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS:
			return getSparSegments();
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
		case CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS:
			setSparPositions((SparPositionsType) newValue);
			return;
		case CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS:
			setSparSegments((SparSegmentsType) newValue);
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
		case CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS:
			setSparPositions((SparPositionsType) null);
			return;
		case CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS:
			setSparSegments((SparSegmentsType) null);
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
		case CpacsPackage.WING_SPAR_TYPE__SPAR_POSITIONS:
			return sparPositions != null;
		case CpacsPackage.WING_SPAR_TYPE__SPAR_SEGMENTS:
			return sparSegments != null;
		}
		return super.eIsSet(featureID);
	}

} //WingSparTypeImpl
