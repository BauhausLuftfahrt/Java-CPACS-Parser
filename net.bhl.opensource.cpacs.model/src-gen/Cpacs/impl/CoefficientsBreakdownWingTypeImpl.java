/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseCoefficientsType;
import Cpacs.CoefficientsBreakdownWingSegmentsType;
import Cpacs.CoefficientsBreakdownWingType;
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
 * An implementation of the model object '<em><b>Coefficients Breakdown Wing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownWingTypeImpl#getWingUID <em>Wing UID</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownWingTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownWingTypeImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownWingTypeImpl#getRemainingContributions <em>Remaining Contributions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientsBreakdownWingTypeImpl extends ComplexBaseTypeImpl implements CoefficientsBreakdownWingType {
	/**
	 * The cached value of the '{@link #getWingUID() <em>Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType wingUID;

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
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected CoefficientsBreakdownWingSegmentsType segments;

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
	protected CoefficientsBreakdownWingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCoefficientsBreakdownWingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getWingUID() {
		return wingUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingUID(StringUIDBaseType newWingUID, NotificationChain msgs) {
		StringUIDBaseType oldWingUID = wingUID;
		wingUID = newWingUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID, oldWingUID, newWingUID);
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
	public void setWingUID(StringUIDBaseType newWingUID) {
		if (newWingUID != wingUID) {
			NotificationChain msgs = null;
			if (wingUID != null)
				msgs = ((InternalEObject) wingUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID, null, msgs);
			if (newWingUID != null)
				msgs = ((InternalEObject) newWingUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID, null, msgs);
			msgs = basicSetWingUID(newWingUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID, newWingUID, newWingUID));
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
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS, null,
						msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS, null,
						msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS, newCoefficients, newCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsBreakdownWingSegmentsType getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(CoefficientsBreakdownWingSegmentsType newSegments,
			NotificationChain msgs) {
		CoefficientsBreakdownWingSegmentsType oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS, oldSegments, newSegments);
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
	public void setSegments(CoefficientsBreakdownWingSegmentsType newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject) segments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject) newSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS, newSegments, newSegments));
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
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS, oldRemainingContributions,
					newRemainingContributions);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS,
						null, msgs);
			if (newRemainingContributions != null)
				msgs = ((InternalEObject) newRemainingContributions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS,
						null, msgs);
			msgs = basicSetRemainingContributions(newRemainingContributions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS, newRemainingContributions,
					newRemainingContributions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID:
			return basicSetWingUID(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS:
			return basicSetSegments(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS:
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID:
			return getWingUID();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS:
			return getCoefficients();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS:
			return getSegments();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS:
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID:
			setWingUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS:
			setSegments((CoefficientsBreakdownWingSegmentsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS:
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID:
			setWingUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS:
			setSegments((CoefficientsBreakdownWingSegmentsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS:
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__WING_UID:
			return wingUID != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__COEFFICIENTS:
			return coefficients != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__SEGMENTS:
			return segments != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE__REMAINING_CONTRIBUTIONS:
			return remainingContributions != null;
		}
		return super.eIsSet(featureID);
	}

} //CoefficientsBreakdownWingTypeImpl
