/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MaterialDefinitionType;
import Cpacs.TrackCarType;
import Cpacs.TrackFairingType;
import Cpacs.TrackStructureType;
import Cpacs.TrackStrut1Type;
import Cpacs.TrackStrut2Type;

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
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getControlSurfaceAttachment <em>Control Surface Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getCar <em>Car</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getStrut1 <em>Strut1</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getStrut2 <em>Strut2</em>}</li>
 *   <li>{@link Cpacs.impl.TrackStructureTypeImpl#getStrut3 <em>Strut3</em>}</li>
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
	 * The cached value of the '{@link #getControlSurfaceAttachment() <em>Control Surface Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaceAttachment()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType controlSurfaceAttachment;

	/**
	 * The cached value of the '{@link #getCar() <em>Car</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected TrackCarType car;

	/**
	 * The cached value of the '{@link #getStrut1() <em>Strut1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrut1()
	 * @generated
	 * @ordered
	 */
	protected TrackStrut1Type strut1;

	/**
	 * The cached value of the '{@link #getStrut2() <em>Strut2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrut2()
	 * @generated
	 * @ordered
	 */
	protected TrackStrut2Type strut2;

	/**
	 * The cached value of the '{@link #getStrut3() <em>Strut3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrut3()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType strut3;

	/**
	 * The cached value of the '{@link #getSidePanels() <em>Side Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidePanels()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType sidePanels;

	/**
	 * The cached value of the '{@link #getUpperPanel() <em>Upper Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperPanel()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType upperPanel;

	/**
	 * The cached value of the '{@link #getLowerPanel() <em>Lower Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerPanel()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType lowerPanel;

	/**
	 * The cached value of the '{@link #getRollerTrack() <em>Roller Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollerTrack()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType rollerTrack;

	/**
	 * The cached value of the '{@link #getRibs() <em>Ribs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibs()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType ribs;

	/**
	 * The cached value of the '{@link #getFairing() <em>Fairing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFairing()
	 * @generated
	 * @ordered
	 */
	protected TrackFairingType fairing;

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
	public MaterialDefinitionType getControlSurfaceAttachment() {
		return controlSurfaceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaceAttachment(MaterialDefinitionType newControlSurfaceAttachment,
			NotificationChain msgs) {
		MaterialDefinitionType oldControlSurfaceAttachment = controlSurfaceAttachment;
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
	public void setControlSurfaceAttachment(MaterialDefinitionType newControlSurfaceAttachment) {
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
	public TrackCarType getCar() {
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCar(TrackCarType newCar, NotificationChain msgs) {
		TrackCarType oldCar = car;
		car = newCar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__CAR, oldCar, newCar);
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
	public void setCar(TrackCarType newCar) {
		if (newCar != car) {
			NotificationChain msgs = null;
			if (car != null)
				msgs = ((InternalEObject) car).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__CAR, null, msgs);
			if (newCar != null)
				msgs = ((InternalEObject) newCar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__CAR, null, msgs);
			msgs = basicSetCar(newCar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__CAR, newCar,
					newCar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackStrut1Type getStrut1() {
		return strut1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrut1(TrackStrut1Type newStrut1, NotificationChain msgs) {
		TrackStrut1Type oldStrut1 = strut1;
		strut1 = newStrut1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1, oldStrut1, newStrut1);
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
	public void setStrut1(TrackStrut1Type newStrut1) {
		if (newStrut1 != strut1) {
			NotificationChain msgs = null;
			if (strut1 != null)
				msgs = ((InternalEObject) strut1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1, null, msgs);
			if (newStrut1 != null)
				msgs = ((InternalEObject) newStrut1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1, null, msgs);
			msgs = basicSetStrut1(newStrut1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1, newStrut1,
					newStrut1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackStrut2Type getStrut2() {
		return strut2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrut2(TrackStrut2Type newStrut2, NotificationChain msgs) {
		TrackStrut2Type oldStrut2 = strut2;
		strut2 = newStrut2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2, oldStrut2, newStrut2);
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
	public void setStrut2(TrackStrut2Type newStrut2) {
		if (newStrut2 != strut2) {
			NotificationChain msgs = null;
			if (strut2 != null)
				msgs = ((InternalEObject) strut2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2, null, msgs);
			if (newStrut2 != null)
				msgs = ((InternalEObject) newStrut2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2, null, msgs);
			msgs = basicSetStrut2(newStrut2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2, newStrut2,
					newStrut2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getStrut3() {
		return strut3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrut3(MaterialDefinitionType newStrut3, NotificationChain msgs) {
		MaterialDefinitionType oldStrut3 = strut3;
		strut3 = newStrut3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3, oldStrut3, newStrut3);
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
	public void setStrut3(MaterialDefinitionType newStrut3) {
		if (newStrut3 != strut3) {
			NotificationChain msgs = null;
			if (strut3 != null)
				msgs = ((InternalEObject) strut3).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3, null, msgs);
			if (newStrut3 != null)
				msgs = ((InternalEObject) newStrut3).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3, null, msgs);
			msgs = basicSetStrut3(newStrut3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3, newStrut3,
					newStrut3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getSidePanels() {
		return sidePanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSidePanels(MaterialDefinitionType newSidePanels, NotificationChain msgs) {
		MaterialDefinitionType oldSidePanels = sidePanels;
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
	public void setSidePanels(MaterialDefinitionType newSidePanels) {
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
	public MaterialDefinitionType getUpperPanel() {
		return upperPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperPanel(MaterialDefinitionType newUpperPanel, NotificationChain msgs) {
		MaterialDefinitionType oldUpperPanel = upperPanel;
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
	public void setUpperPanel(MaterialDefinitionType newUpperPanel) {
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
	public MaterialDefinitionType getLowerPanel() {
		return lowerPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerPanel(MaterialDefinitionType newLowerPanel, NotificationChain msgs) {
		MaterialDefinitionType oldLowerPanel = lowerPanel;
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
	public void setLowerPanel(MaterialDefinitionType newLowerPanel) {
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
	public MaterialDefinitionType getRollerTrack() {
		return rollerTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollerTrack(MaterialDefinitionType newRollerTrack, NotificationChain msgs) {
		MaterialDefinitionType oldRollerTrack = rollerTrack;
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
	public void setRollerTrack(MaterialDefinitionType newRollerTrack) {
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
	public MaterialDefinitionType getRibs() {
		return ribs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibs(MaterialDefinitionType newRibs, NotificationChain msgs) {
		MaterialDefinitionType oldRibs = ribs;
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
	public void setRibs(MaterialDefinitionType newRibs) {
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
	public TrackFairingType getFairing() {
		return fairing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFairing(TrackFairingType newFairing, NotificationChain msgs) {
		TrackFairingType oldFairing = fairing;
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
	public void setFairing(TrackFairingType newFairing) {
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return basicSetControlSurfaceAttachment(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CAR:
			return basicSetCar(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1:
			return basicSetStrut1(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2:
			return basicSetStrut2(null, msgs);
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3:
			return basicSetStrut3(null, msgs);
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return getControlSurfaceAttachment();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CAR:
			return getCar();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1:
			return getStrut1();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2:
			return getStrut2();
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3:
			return getStrut3();
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			setControlSurfaceAttachment((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CAR:
			setCar((TrackCarType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1:
			setStrut1((TrackStrut1Type) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2:
			setStrut2((TrackStrut2Type) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3:
			setStrut3((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS:
			setSidePanels((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL:
			setUpperPanel((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL:
			setLowerPanel((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK:
			setRollerTrack((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS:
			setRibs((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING:
			setFairing((TrackFairingType) newValue);
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			setControlSurfaceAttachment((MaterialDefinitionType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CAR:
			setCar((TrackCarType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1:
			setStrut1((TrackStrut1Type) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2:
			setStrut2((TrackStrut2Type) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3:
			setStrut3((MaterialDefinitionType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__SIDE_PANELS:
			setSidePanels((MaterialDefinitionType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__UPPER_PANEL:
			setUpperPanel((MaterialDefinitionType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__LOWER_PANEL:
			setLowerPanel((MaterialDefinitionType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__ROLLER_TRACK:
			setRollerTrack((MaterialDefinitionType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__RIBS:
			setRibs((MaterialDefinitionType) null);
			return;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__FAIRING:
			setFairing((TrackFairingType) null);
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
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CONTROL_SURFACE_ATTACHMENT:
			return controlSurfaceAttachment != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__CAR:
			return car != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT1:
			return strut1 != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT2:
			return strut2 != null;
		case CpacsPackage.TRACK_STRUCTURE_TYPE__STRUT3:
			return strut3 != null;
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
