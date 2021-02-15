/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GeogenWingOutputOptionsType;
import Cpacs.IntegerBaseType;
import Cpacs.SectionDistributionModeType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.SymmetryType3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geogen Wing Output Options Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GeogenWingOutputOptionsTypeImpl#getDestinationWingUID <em>Destination Wing UID</em>}</li>
 *   <li>{@link Cpacs.impl.GeogenWingOutputOptionsTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.GeogenWingOutputOptionsTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.GeogenWingOutputOptionsTypeImpl#getSectionDistributionMode <em>Section Distribution Mode</em>}</li>
 *   <li>{@link Cpacs.impl.GeogenWingOutputOptionsTypeImpl#getNumberOfSections <em>Number Of Sections</em>}</li>
 *   <li>{@link Cpacs.impl.GeogenWingOutputOptionsTypeImpl#getNumberOfPointsPerSection <em>Number Of Points Per Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeogenWingOutputOptionsTypeImpl extends ComplexBaseTypeImpl implements GeogenWingOutputOptionsType {
	/**
	 * The cached value of the '{@link #getDestinationWingUID() <em>Destination Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationWingUID()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType destinationWingUID;

	/**
	 * The cached value of the '{@link #getParentUID() <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType parentUID;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryType3 symmetry;

	/**
	 * The cached value of the '{@link #getSectionDistributionMode() <em>Section Distribution Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionDistributionMode()
	 * @generated
	 * @ordered
	 */
	protected SectionDistributionModeType sectionDistributionMode;

	/**
	 * The cached value of the '{@link #getNumberOfSections() <em>Number Of Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSections()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfSections;

	/**
	 * The cached value of the '{@link #getNumberOfPointsPerSection() <em>Number Of Points Per Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPointsPerSection()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfPointsPerSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeogenWingOutputOptionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGeogenWingOutputOptionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDestinationWingUID() {
		return destinationWingUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationWingUID(StringBaseType newDestinationWingUID, NotificationChain msgs) {
		StringBaseType oldDestinationWingUID = destinationWingUID;
		destinationWingUID = newDestinationWingUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID, oldDestinationWingUID,
					newDestinationWingUID);
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
	public void setDestinationWingUID(StringBaseType newDestinationWingUID) {
		if (newDestinationWingUID != destinationWingUID) {
			NotificationChain msgs = null;
			if (destinationWingUID != null)
				msgs = ((InternalEObject) destinationWingUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID,
						null, msgs);
			if (newDestinationWingUID != null)
				msgs = ((InternalEObject) newDestinationWingUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID,
						null, msgs);
			msgs = basicSetDestinationWingUID(newDestinationWingUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID, newDestinationWingUID,
					newDestinationWingUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getParentUID() {
		return parentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentUID(StringUIDBaseType newParentUID, NotificationChain msgs) {
		StringUIDBaseType oldParentUID = parentUID;
		parentUID = newParentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
	public void setParentUID(StringUIDBaseType newParentUID) {
		if (newParentUID != parentUID) {
			NotificationChain msgs = null;
			if (parentUID != null)
				msgs = ((InternalEObject) parentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID, newParentUID, newParentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryType3 getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymmetry(SymmetryType3 newSymmetry, NotificationChain msgs) {
		SymmetryType3 oldSymmetry = symmetry;
		symmetry = newSymmetry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY, oldSymmetry, newSymmetry);
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
	public void setSymmetry(SymmetryType3 newSymmetry) {
		if (newSymmetry != symmetry) {
			NotificationChain msgs = null;
			if (symmetry != null)
				msgs = ((InternalEObject) symmetry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY, null, msgs);
			if (newSymmetry != null)
				msgs = ((InternalEObject) newSymmetry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY, null, msgs);
			msgs = basicSetSymmetry(newSymmetry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY, newSymmetry, newSymmetry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionDistributionModeType getSectionDistributionMode() {
		return sectionDistributionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionDistributionMode(SectionDistributionModeType newSectionDistributionMode,
			NotificationChain msgs) {
		SectionDistributionModeType oldSectionDistributionMode = sectionDistributionMode;
		sectionDistributionMode = newSectionDistributionMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE, oldSectionDistributionMode,
					newSectionDistributionMode);
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
	public void setSectionDistributionMode(SectionDistributionModeType newSectionDistributionMode) {
		if (newSectionDistributionMode != sectionDistributionMode) {
			NotificationChain msgs = null;
			if (sectionDistributionMode != null)
				msgs = ((InternalEObject) sectionDistributionMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE, null, msgs);
			if (newSectionDistributionMode != null)
				msgs = ((InternalEObject) newSectionDistributionMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE, null, msgs);
			msgs = basicSetSectionDistributionMode(newSectionDistributionMode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE, newSectionDistributionMode,
					newSectionDistributionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfSections() {
		return numberOfSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSections(IntegerBaseType newNumberOfSections, NotificationChain msgs) {
		IntegerBaseType oldNumberOfSections = numberOfSections;
		numberOfSections = newNumberOfSections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS, oldNumberOfSections,
					newNumberOfSections);
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
	public void setNumberOfSections(IntegerBaseType newNumberOfSections) {
		if (newNumberOfSections != numberOfSections) {
			NotificationChain msgs = null;
			if (numberOfSections != null)
				msgs = ((InternalEObject) numberOfSections).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS, null,
						msgs);
			if (newNumberOfSections != null)
				msgs = ((InternalEObject) newNumberOfSections).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS, null,
						msgs);
			msgs = basicSetNumberOfSections(newNumberOfSections, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS, newNumberOfSections,
					newNumberOfSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfPointsPerSection() {
		return numberOfPointsPerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfPointsPerSection(IntegerBaseType newNumberOfPointsPerSection,
			NotificationChain msgs) {
		IntegerBaseType oldNumberOfPointsPerSection = numberOfPointsPerSection;
		numberOfPointsPerSection = newNumberOfPointsPerSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION,
					oldNumberOfPointsPerSection, newNumberOfPointsPerSection);
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
	public void setNumberOfPointsPerSection(IntegerBaseType newNumberOfPointsPerSection) {
		if (newNumberOfPointsPerSection != numberOfPointsPerSection) {
			NotificationChain msgs = null;
			if (numberOfPointsPerSection != null)
				msgs = ((InternalEObject) numberOfPointsPerSection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION,
						null, msgs);
			if (newNumberOfPointsPerSection != null)
				msgs = ((InternalEObject) newNumberOfPointsPerSection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION,
						null, msgs);
			msgs = basicSetNumberOfPointsPerSection(newNumberOfPointsPerSection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION,
					newNumberOfPointsPerSection, newNumberOfPointsPerSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID:
			return basicSetDestinationWingUID(null, msgs);
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY:
			return basicSetSymmetry(null, msgs);
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE:
			return basicSetSectionDistributionMode(null, msgs);
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS:
			return basicSetNumberOfSections(null, msgs);
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION:
			return basicSetNumberOfPointsPerSection(null, msgs);
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
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID:
			return getDestinationWingUID();
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE:
			return getSectionDistributionMode();
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS:
			return getNumberOfSections();
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION:
			return getNumberOfPointsPerSection();
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
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID:
			setDestinationWingUID((StringBaseType) newValue);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY:
			setSymmetry((SymmetryType3) newValue);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE:
			setSectionDistributionMode((SectionDistributionModeType) newValue);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS:
			setNumberOfSections((IntegerBaseType) newValue);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION:
			setNumberOfPointsPerSection((IntegerBaseType) newValue);
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
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID:
			setDestinationWingUID((StringBaseType) null);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY:
			setSymmetry((SymmetryType3) null);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE:
			setSectionDistributionMode((SectionDistributionModeType) null);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS:
			setNumberOfSections((IntegerBaseType) null);
			return;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION:
			setNumberOfPointsPerSection((IntegerBaseType) null);
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
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__DESTINATION_WING_UID:
			return destinationWingUID != null;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SYMMETRY:
			return symmetry != null;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__SECTION_DISTRIBUTION_MODE:
			return sectionDistributionMode != null;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_SECTIONS:
			return numberOfSections != null;
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE__NUMBER_OF_POINTS_PER_SECTION:
			return numberOfPointsPerSection != null;
		}
		return super.eIsSet(featureID);
	}

} //GeogenWingOutputOptionsTypeImpl
