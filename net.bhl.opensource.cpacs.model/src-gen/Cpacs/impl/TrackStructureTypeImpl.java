/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TrackJointPositionsType;
import Cpacs.TrackSecondaryStructureType;
import Cpacs.TrackStructureType;
import Cpacs.TrackStrutsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getStruts <em>Struts</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getJointPositions <em>Joint Positions</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getControlSurfaceAttachment <em>Control Surface Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getCarriage <em>Carriage</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getSidePanels <em>Side Panels</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getUpperPanel <em>Upper Panel</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getLowerPanel <em>Lower Panel</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getRollerTrack <em>Roller Track</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getRibs <em>Ribs</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getFairing <em>Fairing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackStructureTypeImpl extends ComplexBaseTypeImpl implements TrackStructureType {
	/**
	 * The cached value of the '{@link #getStruts() <em>Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruts()
	 * @generated
	 * @ordered
	 */
	protected TrackStrutsType struts;

	/**
	 * The cached value of the '{@link #getJointPositions() <em>Joint Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointPositions()
	 * @generated
	 * @ordered
	 */
	protected TrackJointPositionsType jointPositions;

	/**
	 * The cached value of the '{@link #getControlSurfaceAttachment() <em>Control Surface Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaceAttachment()
	 * @generated
	 * @ordered
	 */
	protected TrackSecondaryStructureType controlSurfaceAttachment;

	/**
	 * The cached value of the '{@link #getCarriage() <em>Carriage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriage()
	 * @generated
	 * @ordered
	 */
	protected TrackSecondaryStructureType carriage;

	/**
	 * The cached value of the '{@link #getSidePanels() <em>Side Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidePanels()
	 * @generated
	 * @ordered
	 */
	protected TrackSecondaryStructureType sidePanels;

	/**
	 * The cached value of the '{@link #getUpperPanel() <em>Upper Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperPanel()
	 * @generated
	 * @ordered
	 */
	protected TrackSecondaryStructureType upperPanel;

	/**
	 * The cached value of the '{@link #getLowerPanel() <em>Lower Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerPanel()
	 * @generated
	 * @ordered
	 */
	protected TrackSecondaryStructureType lowerPanel;

	/**
	 * The cached value of the '{@link #getRollerTrack() <em>Roller Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollerTrack()
	 * @generated
	 * @ordered
	 */
	protected TrackSecondaryStructureType rollerTrack;

	/**
	 * The cached value of the '{@link #getRibs() <em>Ribs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibs()
	 * @generated
	 * @ordered
	 */
	protected TrackSecondaryStructureType ribs;

	/**
	 * The cached value of the '{@link #getFairing() <em>Fairing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFairing()
	 * @generated
	 * @ordered
	 */
	protected TrackSecondaryStructureType fairing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrackStructureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackStrutsType getStruts() {
		return struts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruts(TrackStrutsType newStruts, NotificationChain msgs) {
		TrackStrutsType oldStruts = struts;
		struts = newStruts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS, oldStruts, newStruts);
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
	public void setStruts(TrackStrutsType newStruts) {
		if (newStruts != struts) {
			NotificationChain msgs = null;
			if (struts != null)
				msgs = ((InternalEObject) struts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS, null, msgs);
			if (newStruts != null)
				msgs = ((InternalEObject) newStruts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS, null, msgs);
			msgs = basicSetStruts(newStruts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS, newStruts,
					newStruts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackJointPositionsType getJointPositions() {
		return jointPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJointPositions(TrackJointPositionsType newJointPositions, NotificationChain msgs) {
		TrackJointPositionsType oldJointPositions = jointPositions;
		jointPositions = newJointPositions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS, oldJointPositions, newJointPositions);
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
	public void setJointPositions(TrackJointPositionsType newJointPositions) {
		if (newJointPositions != jointPositions) {
			NotificationChain msgs = null;
			if (jointPositions != null)
				msgs = ((InternalEObject) jointPositions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS, null, msgs);
			if (newJointPositions != null)
				msgs = ((InternalEObject) newJointPositions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS, null, msgs);
			msgs = basicSetJointPositions(newJointPositions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS,
					newJointPositions, newJointPositions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSecondaryStructureType getControlSurfaceAttachment() {
		return controlSurfaceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaceAttachment(TrackSecondaryStructureType newControlSurfaceAttachment,
			NotificationChain msgs) {
		TrackSecondaryStructureType oldControlSurfaceAttachment = controlSurfaceAttachment;
		controlSurfaceAttachment = newControlSurfaceAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT, oldControlSurfaceAttachment,
					newControlSurfaceAttachment);
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
	public void setControlSurfaceAttachment(TrackSecondaryStructureType newControlSurfaceAttachment) {
		if (newControlSurfaceAttachment != controlSurfaceAttachment) {
			NotificationChain msgs = null;
			if (controlSurfaceAttachment != null)
				msgs = ((InternalEObject) controlSurfaceAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT, null,
						msgs);
			if (newControlSurfaceAttachment != null)
				msgs = ((InternalEObject) newControlSurfaceAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT, null,
						msgs);
			msgs = basicSetControlSurfaceAttachment(newControlSurfaceAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT, newControlSurfaceAttachment,
					newControlSurfaceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSecondaryStructureType getCarriage() {
		return carriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarriage(TrackSecondaryStructureType newCarriage, NotificationChain msgs) {
		TrackSecondaryStructureType oldCarriage = carriage;
		carriage = newCarriage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE, oldCarriage, newCarriage);
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
	public void setCarriage(TrackSecondaryStructureType newCarriage) {
		if (newCarriage != carriage) {
			NotificationChain msgs = null;
			if (carriage != null)
				msgs = ((InternalEObject) carriage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE, null, msgs);
			if (newCarriage != null)
				msgs = ((InternalEObject) newCarriage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE, null, msgs);
			msgs = basicSetCarriage(newCarriage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE,
					newCarriage, newCarriage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSecondaryStructureType getSidePanels() {
		return sidePanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSidePanels(TrackSecondaryStructureType newSidePanels, NotificationChain msgs) {
		TrackSecondaryStructureType oldSidePanels = sidePanels;
		sidePanels = newSidePanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS, oldSidePanels, newSidePanels);
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
	public void setSidePanels(TrackSecondaryStructureType newSidePanels) {
		if (newSidePanels != sidePanels) {
			NotificationChain msgs = null;
			if (sidePanels != null)
				msgs = ((InternalEObject) sidePanels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS, null, msgs);
			if (newSidePanels != null)
				msgs = ((InternalEObject) newSidePanels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS, null, msgs);
			msgs = basicSetSidePanels(newSidePanels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS,
					newSidePanels, newSidePanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSecondaryStructureType getUpperPanel() {
		return upperPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperPanel(TrackSecondaryStructureType newUpperPanel, NotificationChain msgs) {
		TrackSecondaryStructureType oldUpperPanel = upperPanel;
		upperPanel = newUpperPanel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL, oldUpperPanel, newUpperPanel);
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
	public void setUpperPanel(TrackSecondaryStructureType newUpperPanel) {
		if (newUpperPanel != upperPanel) {
			NotificationChain msgs = null;
			if (upperPanel != null)
				msgs = ((InternalEObject) upperPanel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL, null, msgs);
			if (newUpperPanel != null)
				msgs = ((InternalEObject) newUpperPanel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL, null, msgs);
			msgs = basicSetUpperPanel(newUpperPanel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL,
					newUpperPanel, newUpperPanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSecondaryStructureType getLowerPanel() {
		return lowerPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerPanel(TrackSecondaryStructureType newLowerPanel, NotificationChain msgs) {
		TrackSecondaryStructureType oldLowerPanel = lowerPanel;
		lowerPanel = newLowerPanel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL, oldLowerPanel, newLowerPanel);
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
	public void setLowerPanel(TrackSecondaryStructureType newLowerPanel) {
		if (newLowerPanel != lowerPanel) {
			NotificationChain msgs = null;
			if (lowerPanel != null)
				msgs = ((InternalEObject) lowerPanel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL, null, msgs);
			if (newLowerPanel != null)
				msgs = ((InternalEObject) newLowerPanel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL, null, msgs);
			msgs = basicSetLowerPanel(newLowerPanel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL,
					newLowerPanel, newLowerPanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSecondaryStructureType getRollerTrack() {
		return rollerTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollerTrack(TrackSecondaryStructureType newRollerTrack, NotificationChain msgs) {
		TrackSecondaryStructureType oldRollerTrack = rollerTrack;
		rollerTrack = newRollerTrack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK, oldRollerTrack, newRollerTrack);
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
	public void setRollerTrack(TrackSecondaryStructureType newRollerTrack) {
		if (newRollerTrack != rollerTrack) {
			NotificationChain msgs = null;
			if (rollerTrack != null)
				msgs = ((InternalEObject) rollerTrack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK, null, msgs);
			if (newRollerTrack != null)
				msgs = ((InternalEObject) newRollerTrack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK, null, msgs);
			msgs = basicSetRollerTrack(newRollerTrack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK,
					newRollerTrack, newRollerTrack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSecondaryStructureType getRibs() {
		return ribs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibs(TrackSecondaryStructureType newRibs, NotificationChain msgs) {
		TrackSecondaryStructureType oldRibs = ribs;
		ribs = newRibs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS, oldRibs, newRibs);
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
	public void setRibs(TrackSecondaryStructureType newRibs) {
		if (newRibs != ribs) {
			NotificationChain msgs = null;
			if (ribs != null)
				msgs = ((InternalEObject) ribs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS, null, msgs);
			if (newRibs != null)
				msgs = ((InternalEObject) newRibs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS, null, msgs);
			msgs = basicSetRibs(newRibs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS, newRibs,
					newRibs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSecondaryStructureType getFairing() {
		return fairing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFairing(TrackSecondaryStructureType newFairing, NotificationChain msgs) {
		TrackSecondaryStructureType oldFairing = fairing;
		fairing = newFairing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING, oldFairing, newFairing);
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
	public void setFairing(TrackSecondaryStructureType newFairing) {
		if (newFairing != fairing) {
			NotificationChain msgs = null;
			if (fairing != null)
				msgs = ((InternalEObject) fairing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING, null, msgs);
			if (newFairing != null)
				msgs = ((InternalEObject) newFairing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING, null, msgs);
			msgs = basicSetFairing(newFairing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING,
					newFairing, newFairing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS:
			return basicSetStruts(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS:
			return basicSetJointPositions(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return basicSetControlSurfaceAttachment(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE:
			return basicSetCarriage(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS:
			return basicSetSidePanels(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL:
			return basicSetUpperPanel(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL:
			return basicSetLowerPanel(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK:
			return basicSetRollerTrack(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS:
			return basicSetRibs(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING:
			return basicSetFairing(null, msgs);
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS:
			return getStruts();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS:
			return getJointPositions();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return getControlSurfaceAttachment();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE:
			return getCarriage();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS:
			return getSidePanels();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL:
			return getUpperPanel();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL:
			return getLowerPanel();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK:
			return getRollerTrack();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS:
			return getRibs();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING:
			return getFairing();
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS:
			setStruts((TrackStrutsType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS:
			setJointPositions((TrackJointPositionsType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			setControlSurfaceAttachment((TrackSecondaryStructureType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE:
			setCarriage((TrackSecondaryStructureType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS:
			setSidePanels((TrackSecondaryStructureType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL:
			setUpperPanel((TrackSecondaryStructureType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL:
			setLowerPanel((TrackSecondaryStructureType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK:
			setRollerTrack((TrackSecondaryStructureType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS:
			setRibs((TrackSecondaryStructureType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING:
			setFairing((TrackSecondaryStructureType) newValue);
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS:
			setStruts((TrackStrutsType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS:
			setJointPositions((TrackJointPositionsType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			setControlSurfaceAttachment((TrackSecondaryStructureType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE:
			setCarriage((TrackSecondaryStructureType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS:
			setSidePanels((TrackSecondaryStructureType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL:
			setUpperPanel((TrackSecondaryStructureType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL:
			setLowerPanel((TrackSecondaryStructureType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK:
			setRollerTrack((TrackSecondaryStructureType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS:
			setRibs((TrackSecondaryStructureType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING:
			setFairing((TrackSecondaryStructureType) null);
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUTS:
			return struts != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__JOINT_POSITIONS:
			return jointPositions != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return controlSurfaceAttachment != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CARRIAGE:
			return carriage != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS:
			return sidePanels != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL:
			return upperPanel != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL:
			return lowerPanel != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK:
			return rollerTrack != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS:
			return ribs != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING:
			return fairing != null;
		}
		return super.eIsSet(featureID);
	}

} //TrackStructureTypeImpl
