/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingComponentSegmentStructureType;
import Cpacs.WingIntermediateStructureCellsType;
import Cpacs.WingRibsDefinitionsType;
import Cpacs.WingShellType;
import Cpacs.WingSparType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Component Segment Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingComponentSegmentStructureTypeImpl#getUpperShell <em>Upper Shell</em>}</li>
 *   <li>{@link Cpacs.impl.WingComponentSegmentStructureTypeImpl#getLowerShell <em>Lower Shell</em>}</li>
 *   <li>{@link Cpacs.impl.WingComponentSegmentStructureTypeImpl#getIntermediateStructure <em>Intermediate Structure</em>}</li>
 *   <li>{@link Cpacs.impl.WingComponentSegmentStructureTypeImpl#getRibsDefinitions <em>Ribs Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.WingComponentSegmentStructureTypeImpl#getSpars <em>Spars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingComponentSegmentStructureTypeImpl extends ComplexBaseTypeImpl
		implements WingComponentSegmentStructureType {
	/**
	 * The cached value of the '{@link #getUpperShell() <em>Upper Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperShell()
	 * @generated
	 * @ordered
	 */
	protected WingShellType upperShell;

	/**
	 * The cached value of the '{@link #getLowerShell() <em>Lower Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerShell()
	 * @generated
	 * @ordered
	 */
	protected WingShellType lowerShell;

	/**
	 * The cached value of the '{@link #getIntermediateStructure() <em>Intermediate Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateStructure()
	 * @generated
	 * @ordered
	 */
	protected WingIntermediateStructureCellsType intermediateStructure;

	/**
	 * The cached value of the '{@link #getRibsDefinitions() <em>Ribs Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibsDefinitions()
	 * @generated
	 * @ordered
	 */
	protected WingRibsDefinitionsType ribsDefinitions;

	/**
	 * The cached value of the '{@link #getSpars() <em>Spars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpars()
	 * @generated
	 * @ordered
	 */
	protected WingSparType spars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingComponentSegmentStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingComponentSegmentStructureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingShellType getUpperShell() {
		return upperShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperShell(WingShellType newUpperShell, NotificationChain msgs) {
		WingShellType oldUpperShell = upperShell;
		upperShell = newUpperShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL, oldUpperShell, newUpperShell);
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
	public void setUpperShell(WingShellType newUpperShell) {
		if (newUpperShell != upperShell) {
			NotificationChain msgs = null;
			if (upperShell != null)
				msgs = ((InternalEObject) upperShell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL, null,
						msgs);
			if (newUpperShell != null)
				msgs = ((InternalEObject) newUpperShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL, null,
						msgs);
			msgs = basicSetUpperShell(newUpperShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL, newUpperShell, newUpperShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingShellType getLowerShell() {
		return lowerShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerShell(WingShellType newLowerShell, NotificationChain msgs) {
		WingShellType oldLowerShell = lowerShell;
		lowerShell = newLowerShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL, oldLowerShell, newLowerShell);
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
	public void setLowerShell(WingShellType newLowerShell) {
		if (newLowerShell != lowerShell) {
			NotificationChain msgs = null;
			if (lowerShell != null)
				msgs = ((InternalEObject) lowerShell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL, null,
						msgs);
			if (newLowerShell != null)
				msgs = ((InternalEObject) newLowerShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL, null,
						msgs);
			msgs = basicSetLowerShell(newLowerShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL, newLowerShell, newLowerShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingIntermediateStructureCellsType getIntermediateStructure() {
		return intermediateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntermediateStructure(WingIntermediateStructureCellsType newIntermediateStructure,
			NotificationChain msgs) {
		WingIntermediateStructureCellsType oldIntermediateStructure = intermediateStructure;
		intermediateStructure = newIntermediateStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE,
					oldIntermediateStructure, newIntermediateStructure);
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
	public void setIntermediateStructure(WingIntermediateStructureCellsType newIntermediateStructure) {
		if (newIntermediateStructure != intermediateStructure) {
			NotificationChain msgs = null;
			if (intermediateStructure != null)
				msgs = ((InternalEObject) intermediateStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE,
						null, msgs);
			if (newIntermediateStructure != null)
				msgs = ((InternalEObject) newIntermediateStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE,
						null, msgs);
			msgs = basicSetIntermediateStructure(newIntermediateStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE,
					newIntermediateStructure, newIntermediateStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibsDefinitionsType getRibsDefinitions() {
		return ribsDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibsDefinitions(WingRibsDefinitionsType newRibsDefinitions,
			NotificationChain msgs) {
		WingRibsDefinitionsType oldRibsDefinitions = ribsDefinitions;
		ribsDefinitions = newRibsDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS, oldRibsDefinitions,
					newRibsDefinitions);
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
	public void setRibsDefinitions(WingRibsDefinitionsType newRibsDefinitions) {
		if (newRibsDefinitions != ribsDefinitions) {
			NotificationChain msgs = null;
			if (ribsDefinitions != null)
				msgs = ((InternalEObject) ribsDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS,
						null, msgs);
			if (newRibsDefinitions != null)
				msgs = ((InternalEObject) newRibsDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS,
						null, msgs);
			msgs = basicSetRibsDefinitions(newRibsDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS, newRibsDefinitions,
					newRibsDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSparType getSpars() {
		return spars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpars(WingSparType newSpars, NotificationChain msgs) {
		WingSparType oldSpars = spars;
		spars = newSpars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS, oldSpars, newSpars);
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
	public void setSpars(WingSparType newSpars) {
		if (newSpars != spars) {
			NotificationChain msgs = null;
			if (spars != null)
				msgs = ((InternalEObject) spars).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS, null, msgs);
			if (newSpars != null)
				msgs = ((InternalEObject) newSpars).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS, null, msgs);
			msgs = basicSetSpars(newSpars, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS, newSpars, newSpars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL:
			return basicSetUpperShell(null, msgs);
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL:
			return basicSetLowerShell(null, msgs);
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE:
			return basicSetIntermediateStructure(null, msgs);
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS:
			return basicSetRibsDefinitions(null, msgs);
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS:
			return basicSetSpars(null, msgs);
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
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL:
			return getUpperShell();
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL:
			return getLowerShell();
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE:
			return getIntermediateStructure();
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS:
			return getRibsDefinitions();
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS:
			return getSpars();
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
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL:
			setUpperShell((WingShellType) newValue);
			return;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL:
			setLowerShell((WingShellType) newValue);
			return;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE:
			setIntermediateStructure((WingIntermediateStructureCellsType) newValue);
			return;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS:
			setRibsDefinitions((WingRibsDefinitionsType) newValue);
			return;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS:
			setSpars((WingSparType) newValue);
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
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL:
			setUpperShell((WingShellType) null);
			return;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL:
			setLowerShell((WingShellType) null);
			return;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE:
			setIntermediateStructure((WingIntermediateStructureCellsType) null);
			return;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS:
			setRibsDefinitions((WingRibsDefinitionsType) null);
			return;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS:
			setSpars((WingSparType) null);
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
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__UPPER_SHELL:
			return upperShell != null;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__LOWER_SHELL:
			return lowerShell != null;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__INTERMEDIATE_STRUCTURE:
			return intermediateStructure != null;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__RIBS_DEFINITIONS:
			return ribsDefinitions != null;
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE__SPARS:
			return spars != null;
		}
		return super.eIsSet(featureID);
	}

} //WingComponentSegmentStructureTypeImpl
