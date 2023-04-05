/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseCoefficientsType;
import Cpacs.ChordwisePartType;
import Cpacs.CoefficientReferenceType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chordwise Part Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ChordwisePartTypeImpl#getInnerBorderToSegmentXsi <em>Inner Border To Segment Xsi</em>}</li>
 *   <li>{@link Cpacs.impl.ChordwisePartTypeImpl#getOuterBorderToSegmentXsi <em>Outer Border To Segment Xsi</em>}</li>
 *   <li>{@link Cpacs.impl.ChordwisePartTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.impl.ChordwisePartTypeImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChordwisePartTypeImpl extends ComplexBaseTypeImpl implements ChordwisePartType {
	/**
	 * The cached value of the '{@link #getInnerBorderToSegmentXsi() <em>Inner Border To Segment Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBorderToSegmentXsi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType innerBorderToSegmentXsi;

	/**
	 * The cached value of the '{@link #getOuterBorderToSegmentXsi() <em>Outer Border To Segment Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBorderToSegmentXsi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType outerBorderToSegmentXsi;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChordwisePartTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getChordwisePartType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getInnerBorderToSegmentXsi() {
		return innerBorderToSegmentXsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBorderToSegmentXsi(DoubleBaseType newInnerBorderToSegmentXsi,
			NotificationChain msgs) {
		DoubleBaseType oldInnerBorderToSegmentXsi = innerBorderToSegmentXsi;
		innerBorderToSegmentXsi = newInnerBorderToSegmentXsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI, oldInnerBorderToSegmentXsi,
					newInnerBorderToSegmentXsi);
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
	public void setInnerBorderToSegmentXsi(DoubleBaseType newInnerBorderToSegmentXsi) {
		if (newInnerBorderToSegmentXsi != innerBorderToSegmentXsi) {
			NotificationChain msgs = null;
			if (innerBorderToSegmentXsi != null)
				msgs = ((InternalEObject) innerBorderToSegmentXsi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI, null,
						msgs);
			if (newInnerBorderToSegmentXsi != null)
				msgs = ((InternalEObject) newInnerBorderToSegmentXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI, null,
						msgs);
			msgs = basicSetInnerBorderToSegmentXsi(newInnerBorderToSegmentXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI, newInnerBorderToSegmentXsi,
					newInnerBorderToSegmentXsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOuterBorderToSegmentXsi() {
		return outerBorderToSegmentXsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBorderToSegmentXsi(DoubleBaseType newOuterBorderToSegmentXsi,
			NotificationChain msgs) {
		DoubleBaseType oldOuterBorderToSegmentXsi = outerBorderToSegmentXsi;
		outerBorderToSegmentXsi = newOuterBorderToSegmentXsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI, oldOuterBorderToSegmentXsi,
					newOuterBorderToSegmentXsi);
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
	public void setOuterBorderToSegmentXsi(DoubleBaseType newOuterBorderToSegmentXsi) {
		if (newOuterBorderToSegmentXsi != outerBorderToSegmentXsi) {
			NotificationChain msgs = null;
			if (outerBorderToSegmentXsi != null)
				msgs = ((InternalEObject) outerBorderToSegmentXsi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI, null,
						msgs);
			if (newOuterBorderToSegmentXsi != null)
				msgs = ((InternalEObject) newOuterBorderToSegmentXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI, null,
						msgs);
			msgs = basicSetOuterBorderToSegmentXsi(newOuterBorderToSegmentXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI, newOuterBorderToSegmentXsi,
					newOuterBorderToSegmentXsi));
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
					CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS, null, msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS, null, msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS,
					newCoefficients, newCoefficients));
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
					CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE, oldReference, newReference);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject) newReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE,
					newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI:
			return basicSetInnerBorderToSegmentXsi(null, msgs);
		case CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI:
			return basicSetOuterBorderToSegmentXsi(null, msgs);
		case CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
		case CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE:
			return basicSetReference(null, msgs);
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
		case CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI:
			return getInnerBorderToSegmentXsi();
		case CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI:
			return getOuterBorderToSegmentXsi();
		case CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS:
			return getCoefficients();
		case CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE:
			return getReference();
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
		case CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI:
			setInnerBorderToSegmentXsi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI:
			setOuterBorderToSegmentXsi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) newValue);
			return;
		case CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE:
			setReference((CoefficientReferenceType) newValue);
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
		case CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI:
			setInnerBorderToSegmentXsi((DoubleBaseType) null);
			return;
		case CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI:
			setOuterBorderToSegmentXsi((DoubleBaseType) null);
			return;
		case CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) null);
			return;
		case CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE:
			setReference((CoefficientReferenceType) null);
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
		case CpacsPackage.CHORDWISE_PART_TYPE__INNER_BORDER_TO_SEGMENT_XSI:
			return innerBorderToSegmentXsi != null;
		case CpacsPackage.CHORDWISE_PART_TYPE__OUTER_BORDER_TO_SEGMENT_XSI:
			return outerBorderToSegmentXsi != null;
		case CpacsPackage.CHORDWISE_PART_TYPE__COEFFICIENTS:
			return coefficients != null;
		case CpacsPackage.CHORDWISE_PART_TYPE__REFERENCE:
			return reference != null;
		}
		return super.eIsSet(featureID);
	}

} //ChordwisePartTypeImpl
