/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseCoefficientsType;
import Cpacs.CoefficientsBreakdownSegmentType;
import Cpacs.CoefficientsBreakdownStripsType;
import Cpacs.CpacsPackage;
import Cpacs.RemainingContributionsType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coefficients Breakdown Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownSegmentTypeImpl#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownSegmentTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownSegmentTypeImpl#getStrips <em>Strips</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownSegmentTypeImpl#getRemainingContributions <em>Remaining Contributions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientsBreakdownSegmentTypeImpl extends ComplexBaseTypeImpl
		implements CoefficientsBreakdownSegmentType {
	/**
	 * The cached value of the '{@link #getSegmentUID() <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType segmentUID;

	/**
	 * The cached value of the '{@link #getCoefficients() <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficients()
	 * @generated
	 * @ordered
	 */
	protected AeroCaseCoefficientsType coefficients;

	/**
	 * The cached value of the '{@link #getStrips() <em>Strips</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrips()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsBreakdownStripsType strips;

	/**
	 * The cached value of the '{@link #getRemainingContributions() <em>Remaining Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingContributions()
	 * @generated
	 * @ordered
	 */
	protected RemainingContributionsType remainingContributions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoefficientsBreakdownSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCoefficientsBreakdownSegmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSegmentUID() {
		return segmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUID(StringUIDBaseType newSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldSegmentUID = segmentUID;
		segmentUID = newSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID, oldSegmentUID, newSegmentUID);
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
	public void setSegmentUID(StringUIDBaseType newSegmentUID) {
		if (newSegmentUID != segmentUID) {
			NotificationChain msgs = null;
			if (segmentUID != null)
				msgs = ((InternalEObject) segmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID, null,
						msgs);
			if (newSegmentUID != null)
				msgs = ((InternalEObject) newSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID, null,
						msgs);
			msgs = basicSetSegmentUID(newSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID, newSegmentUID, newSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroCaseCoefficientsType getCoefficients() {
		return coefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoefficients(AeroCaseCoefficientsType newCoefficients, NotificationChain msgs) {
		AeroCaseCoefficientsType oldCoefficients = coefficients;
		coefficients = newCoefficients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
	public void setCoefficients(AeroCaseCoefficientsType newCoefficients) {
		if (newCoefficients != coefficients) {
			NotificationChain msgs = null;
			if (coefficients != null)
				msgs = ((InternalEObject) coefficients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS, null,
						msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS, null,
						msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS, newCoefficients, newCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsBreakdownStripsType getStrips() {
		return strips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrips(CoefficientsBreakdownStripsType newStrips, NotificationChain msgs) {
		CoefficientsBreakdownStripsType oldStrips = strips;
		strips = newStrips;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS, oldStrips, newStrips);
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
	public void setStrips(CoefficientsBreakdownStripsType newStrips) {
		if (newStrips != strips) {
			NotificationChain msgs = null;
			if (strips != null)
				msgs = ((InternalEObject) strips).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS, null, msgs);
			if (newStrips != null)
				msgs = ((InternalEObject) newStrips).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS, null, msgs);
			msgs = basicSetStrips(newStrips, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS, newStrips, newStrips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemainingContributionsType getRemainingContributions() {
		return remainingContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemainingContributions(RemainingContributionsType newRemainingContributions,
			NotificationChain msgs) {
		RemainingContributionsType oldRemainingContributions = remainingContributions;
		remainingContributions = newRemainingContributions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS,
					oldRemainingContributions, newRemainingContributions);
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
	public void setRemainingContributions(RemainingContributionsType newRemainingContributions) {
		if (newRemainingContributions != remainingContributions) {
			NotificationChain msgs = null;
			if (remainingContributions != null)
				msgs = ((InternalEObject) remainingContributions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS,
						null, msgs);
			if (newRemainingContributions != null)
				msgs = ((InternalEObject) newRemainingContributions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS,
						null, msgs);
			msgs = basicSetRemainingContributions(newRemainingContributions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS,
					newRemainingContributions, newRemainingContributions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID:
			return basicSetSegmentUID(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS:
			return basicSetStrips(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS:
			return basicSetRemainingContributions(null, msgs);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID:
			return getSegmentUID();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS:
			return getCoefficients();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS:
			return getStrips();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS:
			return getRemainingContributions();
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS:
			setStrips((CoefficientsBreakdownStripsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS:
			setRemainingContributions((RemainingContributionsType) newValue);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS:
			setStrips((CoefficientsBreakdownStripsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS:
			setRemainingContributions((RemainingContributionsType) null);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__SEGMENT_UID:
			return segmentUID != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__COEFFICIENTS:
			return coefficients != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__STRIPS:
			return strips != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE__REMAINING_CONTRIBUTIONS:
			return remainingContributions != null;
		}
		return super.eIsSet(featureID);
	}

} //CoefficientsBreakdownSegmentTypeImpl
