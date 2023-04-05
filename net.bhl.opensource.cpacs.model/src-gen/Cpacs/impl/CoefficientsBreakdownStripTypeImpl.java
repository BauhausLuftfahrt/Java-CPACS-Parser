/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseCoefficientsType;
import Cpacs.ChordwisePartsType;
import Cpacs.CoefficientReferenceType;
import Cpacs.CoefficientsBreakdownStripType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RemainingContributionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coefficients Breakdown Strip Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownStripTypeImpl#getToSegmentEta <em>To Segment Eta</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownStripTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownStripTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownStripTypeImpl#getChordwiseParts <em>Chordwise Parts</em>}</li>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownStripTypeImpl#getRemainingContributions <em>Remaining Contributions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientsBreakdownStripTypeImpl extends ComplexBaseTypeImpl implements CoefficientsBreakdownStripType {
	/**
	 * The cached value of the '{@link #getToSegmentEta() <em>To Segment Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSegmentEta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType toSegmentEta;

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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected CoefficientReferenceType reference;

	/**
	 * The cached value of the '{@link #getChordwiseParts() <em>Chordwise Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChordwiseParts()
	 * @generated
	 * @ordered
	 */
	protected ChordwisePartsType chordwiseParts;

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
	protected CoefficientsBreakdownStripTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCoefficientsBreakdownStripType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getToSegmentEta() {
		return toSegmentEta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToSegmentEta(DoubleBaseType newToSegmentEta, NotificationChain msgs) {
		DoubleBaseType oldToSegmentEta = toSegmentEta;
		toSegmentEta = newToSegmentEta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA, oldToSegmentEta, newToSegmentEta);
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
	public void setToSegmentEta(DoubleBaseType newToSegmentEta) {
		if (newToSegmentEta != toSegmentEta) {
			NotificationChain msgs = null;
			if (toSegmentEta != null)
				msgs = ((InternalEObject) toSegmentEta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA, null,
						msgs);
			if (newToSegmentEta != null)
				msgs = ((InternalEObject) newToSegmentEta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA, null,
						msgs);
			msgs = basicSetToSegmentEta(newToSegmentEta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA, newToSegmentEta, newToSegmentEta));
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
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS, null,
						msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS, null,
						msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS, newCoefficients, newCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientReferenceType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(CoefficientReferenceType newReference, NotificationChain msgs) {
		CoefficientReferenceType oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE, oldReference, newReference);
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
	public void setReference(CoefficientReferenceType newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject) reference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject) newReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChordwisePartsType getChordwiseParts() {
		return chordwiseParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChordwiseParts(ChordwisePartsType newChordwiseParts, NotificationChain msgs) {
		ChordwisePartsType oldChordwiseParts = chordwiseParts;
		chordwiseParts = newChordwiseParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS, oldChordwiseParts,
					newChordwiseParts);
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
	public void setChordwiseParts(ChordwisePartsType newChordwiseParts) {
		if (newChordwiseParts != chordwiseParts) {
			NotificationChain msgs = null;
			if (chordwiseParts != null)
				msgs = ((InternalEObject) chordwiseParts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS, null,
						msgs);
			if (newChordwiseParts != null)
				msgs = ((InternalEObject) newChordwiseParts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS, null,
						msgs);
			msgs = basicSetChordwiseParts(newChordwiseParts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS, newChordwiseParts,
					newChordwiseParts));
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
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS, oldRemainingContributions,
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
				msgs = ((InternalEObject) remainingContributions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS, null, msgs);
			if (newRemainingContributions != null)
				msgs = ((InternalEObject) newRemainingContributions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS, null, msgs);
			msgs = basicSetRemainingContributions(newRemainingContributions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS, newRemainingContributions,
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA:
			return basicSetToSegmentEta(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE:
			return basicSetReference(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS:
			return basicSetChordwiseParts(null, msgs);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS:
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA:
			return getToSegmentEta();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS:
			return getCoefficients();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE:
			return getReference();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS:
			return getChordwiseParts();
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS:
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA:
			setToSegmentEta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE:
			setReference((CoefficientReferenceType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS:
			setChordwiseParts((ChordwisePartsType) newValue);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS:
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA:
			setToSegmentEta((DoubleBaseType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE:
			setReference((CoefficientReferenceType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS:
			setChordwiseParts((ChordwisePartsType) null);
			return;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS:
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__TO_SEGMENT_ETA:
			return toSegmentEta != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__COEFFICIENTS:
			return coefficients != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REFERENCE:
			return reference != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__CHORDWISE_PARTS:
			return chordwiseParts != null;
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE__REMAINING_CONTRIBUTIONS:
			return remainingContributions != null;
		}
		return super.eIsSet(featureID);
	}

} //CoefficientsBreakdownStripTypeImpl
