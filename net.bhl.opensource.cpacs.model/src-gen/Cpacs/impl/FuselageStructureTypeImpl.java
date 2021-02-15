/**
 */
package Cpacs.impl;

import Cpacs.CargoCrossBeamStrutsAssemblyType;
import Cpacs.CargoCrossBeamsAssemblyType;
import Cpacs.CargoDoorsAssemblyType;
import Cpacs.CenterFuselageAreasAssemblyType;
import Cpacs.CpacsPackage;
import Cpacs.FloorPanelsType;
import Cpacs.FramesAssemblyType;
import Cpacs.FuselageStructureType;
import Cpacs.GeneralStructuralMembersAssemblyType;
import Cpacs.IntercostalsAssemblyType;
import Cpacs.InterfaceDefinitionsType;
import Cpacs.LongFloorBeamsAssemblyType;
import Cpacs.PaxCrossBeamStrutsAssemblyType;
import Cpacs.PaxCrossBeamsAssemblyType;
import Cpacs.PaxDoorsAssemblyType;
import Cpacs.PressureBulkheadAssemblyType;
import Cpacs.SkinType;
import Cpacs.StringersAssemblyType;
import Cpacs.TailplaneAttachmentAreaType;
import Cpacs.UIDGroupDefinitionsType;
import Cpacs.WallsType;
import Cpacs.WindowsAssemblyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselage Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getStringers <em>Stringers</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getPaxCrossBeams <em>Pax Cross Beams</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getPaxCrossBeamStruts <em>Pax Cross Beam Struts</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getCargoCrossBeams <em>Cargo Cross Beams</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getCargoCrossBeamStruts <em>Cargo Cross Beam Struts</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getLongFloorBeams <em>Long Floor Beams</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getGeneralStructuralMembers <em>General Structural Members</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getFloorPanels <em>Floor Panels</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getPressureBulkheads <em>Pressure Bulkheads</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getWalls <em>Walls</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getPaxDoors <em>Pax Doors</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getCargoDoors <em>Cargo Doors</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getIntercostals <em>Intercostals</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getCenterFuselageAreas <em>Center Fuselage Areas</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getTailplaneAttachmentArea <em>Tailplane Attachment Area</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getInterfaceDefinitions <em>Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageStructureTypeImpl#getUIDGroupDefinitions <em>UID Group Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageStructureTypeImpl extends ComplexBaseTypeImpl implements FuselageStructureType {
	/**
	 * The cached value of the '{@link #getSkin() <em>Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkin()
	 * @generated
	 * @ordered
	 */
	protected SkinType skin;

	/**
	 * The cached value of the '{@link #getStringers() <em>Stringers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringers()
	 * @generated
	 * @ordered
	 */
	protected StringersAssemblyType stringers;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected FramesAssemblyType frames;

	/**
	 * The cached value of the '{@link #getPaxCrossBeams() <em>Pax Cross Beams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxCrossBeams()
	 * @generated
	 * @ordered
	 */
	protected PaxCrossBeamsAssemblyType paxCrossBeams;

	/**
	 * The cached value of the '{@link #getPaxCrossBeamStruts() <em>Pax Cross Beam Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxCrossBeamStruts()
	 * @generated
	 * @ordered
	 */
	protected PaxCrossBeamStrutsAssemblyType paxCrossBeamStruts;

	/**
	 * The cached value of the '{@link #getCargoCrossBeams() <em>Cargo Cross Beams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoCrossBeams()
	 * @generated
	 * @ordered
	 */
	protected CargoCrossBeamsAssemblyType cargoCrossBeams;

	/**
	 * The cached value of the '{@link #getCargoCrossBeamStruts() <em>Cargo Cross Beam Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoCrossBeamStruts()
	 * @generated
	 * @ordered
	 */
	protected CargoCrossBeamStrutsAssemblyType cargoCrossBeamStruts;

	/**
	 * The cached value of the '{@link #getLongFloorBeams() <em>Long Floor Beams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFloorBeams()
	 * @generated
	 * @ordered
	 */
	protected LongFloorBeamsAssemblyType longFloorBeams;

	/**
	 * The cached value of the '{@link #getGeneralStructuralMembers() <em>General Structural Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStructuralMembers()
	 * @generated
	 * @ordered
	 */
	protected GeneralStructuralMembersAssemblyType generalStructuralMembers;

	/**
	 * The cached value of the '{@link #getFloorPanels() <em>Floor Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloorPanels()
	 * @generated
	 * @ordered
	 */
	protected FloorPanelsType floorPanels;

	/**
	 * The cached value of the '{@link #getPressureBulkheads() <em>Pressure Bulkheads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureBulkheads()
	 * @generated
	 * @ordered
	 */
	protected PressureBulkheadAssemblyType pressureBulkheads;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected WindowsAssemblyType windows;

	/**
	 * The cached value of the '{@link #getWalls() <em>Walls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalls()
	 * @generated
	 * @ordered
	 */
	protected WallsType walls;

	/**
	 * The cached value of the '{@link #getPaxDoors() <em>Pax Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxDoors()
	 * @generated
	 * @ordered
	 */
	protected PaxDoorsAssemblyType paxDoors;

	/**
	 * The cached value of the '{@link #getCargoDoors() <em>Cargo Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoDoors()
	 * @generated
	 * @ordered
	 */
	protected CargoDoorsAssemblyType cargoDoors;

	/**
	 * The cached value of the '{@link #getIntercostals() <em>Intercostals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercostals()
	 * @generated
	 * @ordered
	 */
	protected IntercostalsAssemblyType intercostals;

	/**
	 * The cached value of the '{@link #getCenterFuselageAreas() <em>Center Fuselage Areas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageAreas()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselageAreasAssemblyType centerFuselageAreas;

	/**
	 * The cached value of the '{@link #getTailplaneAttachmentArea() <em>Tailplane Attachment Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailplaneAttachmentArea()
	 * @generated
	 * @ordered
	 */
	protected TailplaneAttachmentAreaType tailplaneAttachmentArea;

	/**
	 * The cached value of the '{@link #getInterfaceDefinitions() <em>Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDefinitionsType interfaceDefinitions;

	/**
	 * The cached value of the '{@link #getUIDGroupDefinitions() <em>UID Group Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIDGroupDefinitions()
	 * @generated
	 * @ordered
	 */
	protected UIDGroupDefinitionsType uIDGroupDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuselageStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageStructureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkinType getSkin() {
		return skin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkin(SkinType newSkin, NotificationChain msgs) {
		SkinType oldSkin = skin;
		skin = newSkin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN, oldSkin, newSkin);
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
	public void setSkin(SkinType newSkin) {
		if (newSkin != skin) {
			NotificationChain msgs = null;
			if (skin != null)
				msgs = ((InternalEObject) skin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN, null, msgs);
			if (newSkin != null)
				msgs = ((InternalEObject) newSkin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN, null, msgs);
			msgs = basicSetSkin(newSkin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN, newSkin,
					newSkin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringersAssemblyType getStringers() {
		return stringers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringers(StringersAssemblyType newStringers, NotificationChain msgs) {
		StringersAssemblyType oldStringers = stringers;
		stringers = newStringers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS, oldStringers, newStringers);
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
	public void setStringers(StringersAssemblyType newStringers) {
		if (newStringers != stringers) {
			NotificationChain msgs = null;
			if (stringers != null)
				msgs = ((InternalEObject) stringers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS, null, msgs);
			if (newStringers != null)
				msgs = ((InternalEObject) newStringers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS, null, msgs);
			msgs = basicSetStringers(newStringers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS,
					newStringers, newStringers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramesAssemblyType getFrames() {
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrames(FramesAssemblyType newFrames, NotificationChain msgs) {
		FramesAssemblyType oldFrames = frames;
		frames = newFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES, oldFrames, newFrames);
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
	public void setFrames(FramesAssemblyType newFrames) {
		if (newFrames != frames) {
			NotificationChain msgs = null;
			if (frames != null)
				msgs = ((InternalEObject) frames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES, null, msgs);
			if (newFrames != null)
				msgs = ((InternalEObject) newFrames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES, null, msgs);
			msgs = basicSetFrames(newFrames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES,
					newFrames, newFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaxCrossBeamsAssemblyType getPaxCrossBeams() {
		return paxCrossBeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaxCrossBeams(PaxCrossBeamsAssemblyType newPaxCrossBeams, NotificationChain msgs) {
		PaxCrossBeamsAssemblyType oldPaxCrossBeams = paxCrossBeams;
		paxCrossBeams = newPaxCrossBeams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS, oldPaxCrossBeams, newPaxCrossBeams);
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
	public void setPaxCrossBeams(PaxCrossBeamsAssemblyType newPaxCrossBeams) {
		if (newPaxCrossBeams != paxCrossBeams) {
			NotificationChain msgs = null;
			if (paxCrossBeams != null)
				msgs = ((InternalEObject) paxCrossBeams).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS, null, msgs);
			if (newPaxCrossBeams != null)
				msgs = ((InternalEObject) newPaxCrossBeams).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS, null, msgs);
			msgs = basicSetPaxCrossBeams(newPaxCrossBeams, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS,
					newPaxCrossBeams, newPaxCrossBeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaxCrossBeamStrutsAssemblyType getPaxCrossBeamStruts() {
		return paxCrossBeamStruts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaxCrossBeamStruts(PaxCrossBeamStrutsAssemblyType newPaxCrossBeamStruts,
			NotificationChain msgs) {
		PaxCrossBeamStrutsAssemblyType oldPaxCrossBeamStruts = paxCrossBeamStruts;
		paxCrossBeamStruts = newPaxCrossBeamStruts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS, oldPaxCrossBeamStruts,
					newPaxCrossBeamStruts);
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
	public void setPaxCrossBeamStruts(PaxCrossBeamStrutsAssemblyType newPaxCrossBeamStruts) {
		if (newPaxCrossBeamStruts != paxCrossBeamStruts) {
			NotificationChain msgs = null;
			if (paxCrossBeamStruts != null)
				msgs = ((InternalEObject) paxCrossBeamStruts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS, null,
						msgs);
			if (newPaxCrossBeamStruts != null)
				msgs = ((InternalEObject) newPaxCrossBeamStruts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS, null,
						msgs);
			msgs = basicSetPaxCrossBeamStruts(newPaxCrossBeamStruts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS, newPaxCrossBeamStruts,
					newPaxCrossBeamStruts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargoCrossBeamsAssemblyType getCargoCrossBeams() {
		return cargoCrossBeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCargoCrossBeams(CargoCrossBeamsAssemblyType newCargoCrossBeams,
			NotificationChain msgs) {
		CargoCrossBeamsAssemblyType oldCargoCrossBeams = cargoCrossBeams;
		cargoCrossBeams = newCargoCrossBeams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS, oldCargoCrossBeams, newCargoCrossBeams);
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
	public void setCargoCrossBeams(CargoCrossBeamsAssemblyType newCargoCrossBeams) {
		if (newCargoCrossBeams != cargoCrossBeams) {
			NotificationChain msgs = null;
			if (cargoCrossBeams != null)
				msgs = ((InternalEObject) cargoCrossBeams).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS, null, msgs);
			if (newCargoCrossBeams != null)
				msgs = ((InternalEObject) newCargoCrossBeams).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS, null, msgs);
			msgs = basicSetCargoCrossBeams(newCargoCrossBeams, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS, newCargoCrossBeams, newCargoCrossBeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargoCrossBeamStrutsAssemblyType getCargoCrossBeamStruts() {
		return cargoCrossBeamStruts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCargoCrossBeamStruts(CargoCrossBeamStrutsAssemblyType newCargoCrossBeamStruts,
			NotificationChain msgs) {
		CargoCrossBeamStrutsAssemblyType oldCargoCrossBeamStruts = cargoCrossBeamStruts;
		cargoCrossBeamStruts = newCargoCrossBeamStruts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS, oldCargoCrossBeamStruts,
					newCargoCrossBeamStruts);
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
	public void setCargoCrossBeamStruts(CargoCrossBeamStrutsAssemblyType newCargoCrossBeamStruts) {
		if (newCargoCrossBeamStruts != cargoCrossBeamStruts) {
			NotificationChain msgs = null;
			if (cargoCrossBeamStruts != null)
				msgs = ((InternalEObject) cargoCrossBeamStruts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS, null,
						msgs);
			if (newCargoCrossBeamStruts != null)
				msgs = ((InternalEObject) newCargoCrossBeamStruts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS, null,
						msgs);
			msgs = basicSetCargoCrossBeamStruts(newCargoCrossBeamStruts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS, newCargoCrossBeamStruts,
					newCargoCrossBeamStruts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongFloorBeamsAssemblyType getLongFloorBeams() {
		return longFloorBeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongFloorBeams(LongFloorBeamsAssemblyType newLongFloorBeams,
			NotificationChain msgs) {
		LongFloorBeamsAssemblyType oldLongFloorBeams = longFloorBeams;
		longFloorBeams = newLongFloorBeams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS, oldLongFloorBeams, newLongFloorBeams);
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
	public void setLongFloorBeams(LongFloorBeamsAssemblyType newLongFloorBeams) {
		if (newLongFloorBeams != longFloorBeams) {
			NotificationChain msgs = null;
			if (longFloorBeams != null)
				msgs = ((InternalEObject) longFloorBeams).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS, null, msgs);
			if (newLongFloorBeams != null)
				msgs = ((InternalEObject) newLongFloorBeams).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS, null, msgs);
			msgs = basicSetLongFloorBeams(newLongFloorBeams, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS, newLongFloorBeams, newLongFloorBeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralStructuralMembersAssemblyType getGeneralStructuralMembers() {
		return generalStructuralMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralStructuralMembers(
			GeneralStructuralMembersAssemblyType newGeneralStructuralMembers, NotificationChain msgs) {
		GeneralStructuralMembersAssemblyType oldGeneralStructuralMembers = generalStructuralMembers;
		generalStructuralMembers = newGeneralStructuralMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS, oldGeneralStructuralMembers,
					newGeneralStructuralMembers);
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
	public void setGeneralStructuralMembers(GeneralStructuralMembersAssemblyType newGeneralStructuralMembers) {
		if (newGeneralStructuralMembers != generalStructuralMembers) {
			NotificationChain msgs = null;
			if (generalStructuralMembers != null)
				msgs = ((InternalEObject) generalStructuralMembers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS, null,
						msgs);
			if (newGeneralStructuralMembers != null)
				msgs = ((InternalEObject) newGeneralStructuralMembers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS, null,
						msgs);
			msgs = basicSetGeneralStructuralMembers(newGeneralStructuralMembers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS, newGeneralStructuralMembers,
					newGeneralStructuralMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloorPanelsType getFloorPanels() {
		return floorPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloorPanels(FloorPanelsType newFloorPanels, NotificationChain msgs) {
		FloorPanelsType oldFloorPanels = floorPanels;
		floorPanels = newFloorPanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS, oldFloorPanels, newFloorPanels);
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
	public void setFloorPanels(FloorPanelsType newFloorPanels) {
		if (newFloorPanels != floorPanels) {
			NotificationChain msgs = null;
			if (floorPanels != null)
				msgs = ((InternalEObject) floorPanels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS, null, msgs);
			if (newFloorPanels != null)
				msgs = ((InternalEObject) newFloorPanels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS, null, msgs);
			msgs = basicSetFloorPanels(newFloorPanels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS,
					newFloorPanels, newFloorPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureBulkheadAssemblyType getPressureBulkheads() {
		return pressureBulkheads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPressureBulkheads(PressureBulkheadAssemblyType newPressureBulkheads,
			NotificationChain msgs) {
		PressureBulkheadAssemblyType oldPressureBulkheads = pressureBulkheads;
		pressureBulkheads = newPressureBulkheads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS, oldPressureBulkheads,
					newPressureBulkheads);
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
	public void setPressureBulkheads(PressureBulkheadAssemblyType newPressureBulkheads) {
		if (newPressureBulkheads != pressureBulkheads) {
			NotificationChain msgs = null;
			if (pressureBulkheads != null)
				msgs = ((InternalEObject) pressureBulkheads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS, null, msgs);
			if (newPressureBulkheads != null)
				msgs = ((InternalEObject) newPressureBulkheads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS, null, msgs);
			msgs = basicSetPressureBulkheads(newPressureBulkheads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS, newPressureBulkheads,
					newPressureBulkheads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowsAssemblyType getWindows() {
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindows(WindowsAssemblyType newWindows, NotificationChain msgs) {
		WindowsAssemblyType oldWindows = windows;
		windows = newWindows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS, oldWindows, newWindows);
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
	public void setWindows(WindowsAssemblyType newWindows) {
		if (newWindows != windows) {
			NotificationChain msgs = null;
			if (windows != null)
				msgs = ((InternalEObject) windows).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS, null, msgs);
			if (newWindows != null)
				msgs = ((InternalEObject) newWindows).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS, null, msgs);
			msgs = basicSetWindows(newWindows, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS,
					newWindows, newWindows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallsType getWalls() {
		return walls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWalls(WallsType newWalls, NotificationChain msgs) {
		WallsType oldWalls = walls;
		walls = newWalls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS, oldWalls, newWalls);
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
	public void setWalls(WallsType newWalls) {
		if (newWalls != walls) {
			NotificationChain msgs = null;
			if (walls != null)
				msgs = ((InternalEObject) walls).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS, null, msgs);
			if (newWalls != null)
				msgs = ((InternalEObject) newWalls).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS, null, msgs);
			msgs = basicSetWalls(newWalls, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS, newWalls,
					newWalls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaxDoorsAssemblyType getPaxDoors() {
		return paxDoors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaxDoors(PaxDoorsAssemblyType newPaxDoors, NotificationChain msgs) {
		PaxDoorsAssemblyType oldPaxDoors = paxDoors;
		paxDoors = newPaxDoors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS, oldPaxDoors, newPaxDoors);
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
	public void setPaxDoors(PaxDoorsAssemblyType newPaxDoors) {
		if (newPaxDoors != paxDoors) {
			NotificationChain msgs = null;
			if (paxDoors != null)
				msgs = ((InternalEObject) paxDoors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS, null, msgs);
			if (newPaxDoors != null)
				msgs = ((InternalEObject) newPaxDoors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS, null, msgs);
			msgs = basicSetPaxDoors(newPaxDoors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS,
					newPaxDoors, newPaxDoors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargoDoorsAssemblyType getCargoDoors() {
		return cargoDoors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCargoDoors(CargoDoorsAssemblyType newCargoDoors, NotificationChain msgs) {
		CargoDoorsAssemblyType oldCargoDoors = cargoDoors;
		cargoDoors = newCargoDoors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS, oldCargoDoors, newCargoDoors);
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
	public void setCargoDoors(CargoDoorsAssemblyType newCargoDoors) {
		if (newCargoDoors != cargoDoors) {
			NotificationChain msgs = null;
			if (cargoDoors != null)
				msgs = ((InternalEObject) cargoDoors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS, null, msgs);
			if (newCargoDoors != null)
				msgs = ((InternalEObject) newCargoDoors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS, null, msgs);
			msgs = basicSetCargoDoors(newCargoDoors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS,
					newCargoDoors, newCargoDoors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntercostalsAssemblyType getIntercostals() {
		return intercostals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntercostals(IntercostalsAssemblyType newIntercostals, NotificationChain msgs) {
		IntercostalsAssemblyType oldIntercostals = intercostals;
		intercostals = newIntercostals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS, oldIntercostals, newIntercostals);
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
	public void setIntercostals(IntercostalsAssemblyType newIntercostals) {
		if (newIntercostals != intercostals) {
			NotificationChain msgs = null;
			if (intercostals != null)
				msgs = ((InternalEObject) intercostals).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS, null, msgs);
			if (newIntercostals != null)
				msgs = ((InternalEObject) newIntercostals).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS, null, msgs);
			msgs = basicSetIntercostals(newIntercostals, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS,
					newIntercostals, newIntercostals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageAreasAssemblyType getCenterFuselageAreas() {
		return centerFuselageAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselageAreas(CenterFuselageAreasAssemblyType newCenterFuselageAreas,
			NotificationChain msgs) {
		CenterFuselageAreasAssemblyType oldCenterFuselageAreas = centerFuselageAreas;
		centerFuselageAreas = newCenterFuselageAreas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS, oldCenterFuselageAreas,
					newCenterFuselageAreas);
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
	public void setCenterFuselageAreas(CenterFuselageAreasAssemblyType newCenterFuselageAreas) {
		if (newCenterFuselageAreas != centerFuselageAreas) {
			NotificationChain msgs = null;
			if (centerFuselageAreas != null)
				msgs = ((InternalEObject) centerFuselageAreas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS, null,
						msgs);
			if (newCenterFuselageAreas != null)
				msgs = ((InternalEObject) newCenterFuselageAreas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS, null,
						msgs);
			msgs = basicSetCenterFuselageAreas(newCenterFuselageAreas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS, newCenterFuselageAreas,
					newCenterFuselageAreas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TailplaneAttachmentAreaType getTailplaneAttachmentArea() {
		return tailplaneAttachmentArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTailplaneAttachmentArea(TailplaneAttachmentAreaType newTailplaneAttachmentArea,
			NotificationChain msgs) {
		TailplaneAttachmentAreaType oldTailplaneAttachmentArea = tailplaneAttachmentArea;
		tailplaneAttachmentArea = newTailplaneAttachmentArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA, oldTailplaneAttachmentArea,
					newTailplaneAttachmentArea);
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
	public void setTailplaneAttachmentArea(TailplaneAttachmentAreaType newTailplaneAttachmentArea) {
		if (newTailplaneAttachmentArea != tailplaneAttachmentArea) {
			NotificationChain msgs = null;
			if (tailplaneAttachmentArea != null)
				msgs = ((InternalEObject) tailplaneAttachmentArea).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA, null,
						msgs);
			if (newTailplaneAttachmentArea != null)
				msgs = ((InternalEObject) newTailplaneAttachmentArea).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA, null,
						msgs);
			msgs = basicSetTailplaneAttachmentArea(newTailplaneAttachmentArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA, newTailplaneAttachmentArea,
					newTailplaneAttachmentArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDefinitionsType getInterfaceDefinitions() {
		return interfaceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceDefinitions(InterfaceDefinitionsType newInterfaceDefinitions,
			NotificationChain msgs) {
		InterfaceDefinitionsType oldInterfaceDefinitions = interfaceDefinitions;
		interfaceDefinitions = newInterfaceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS, oldInterfaceDefinitions,
					newInterfaceDefinitions);
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
	public void setInterfaceDefinitions(InterfaceDefinitionsType newInterfaceDefinitions) {
		if (newInterfaceDefinitions != interfaceDefinitions) {
			NotificationChain msgs = null;
			if (interfaceDefinitions != null)
				msgs = ((InternalEObject) interfaceDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS, null,
						msgs);
			if (newInterfaceDefinitions != null)
				msgs = ((InternalEObject) newInterfaceDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS, null,
						msgs);
			msgs = basicSetInterfaceDefinitions(newInterfaceDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS, newInterfaceDefinitions,
					newInterfaceDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDGroupDefinitionsType getUIDGroupDefinitions() {
		return uIDGroupDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUIDGroupDefinitions(UIDGroupDefinitionsType newUIDGroupDefinitions,
			NotificationChain msgs) {
		UIDGroupDefinitionsType oldUIDGroupDefinitions = uIDGroupDefinitions;
		uIDGroupDefinitions = newUIDGroupDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS, oldUIDGroupDefinitions,
					newUIDGroupDefinitions);
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
	public void setUIDGroupDefinitions(UIDGroupDefinitionsType newUIDGroupDefinitions) {
		if (newUIDGroupDefinitions != uIDGroupDefinitions) {
			NotificationChain msgs = null;
			if (uIDGroupDefinitions != null)
				msgs = ((InternalEObject) uIDGroupDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS, null,
						msgs);
			if (newUIDGroupDefinitions != null)
				msgs = ((InternalEObject) newUIDGroupDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS, null,
						msgs);
			msgs = basicSetUIDGroupDefinitions(newUIDGroupDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS, newUIDGroupDefinitions,
					newUIDGroupDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN:
			return basicSetSkin(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS:
			return basicSetStringers(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES:
			return basicSetFrames(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS:
			return basicSetPaxCrossBeams(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS:
			return basicSetPaxCrossBeamStruts(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS:
			return basicSetCargoCrossBeams(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS:
			return basicSetCargoCrossBeamStruts(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS:
			return basicSetLongFloorBeams(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS:
			return basicSetGeneralStructuralMembers(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS:
			return basicSetFloorPanels(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS:
			return basicSetPressureBulkheads(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS:
			return basicSetWindows(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS:
			return basicSetWalls(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS:
			return basicSetPaxDoors(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS:
			return basicSetCargoDoors(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS:
			return basicSetIntercostals(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS:
			return basicSetCenterFuselageAreas(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA:
			return basicSetTailplaneAttachmentArea(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS:
			return basicSetInterfaceDefinitions(null, msgs);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS:
			return basicSetUIDGroupDefinitions(null, msgs);
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
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN:
			return getSkin();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS:
			return getStringers();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES:
			return getFrames();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS:
			return getPaxCrossBeams();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS:
			return getPaxCrossBeamStruts();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS:
			return getCargoCrossBeams();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS:
			return getCargoCrossBeamStruts();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS:
			return getLongFloorBeams();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS:
			return getGeneralStructuralMembers();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS:
			return getFloorPanels();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS:
			return getPressureBulkheads();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS:
			return getWindows();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS:
			return getWalls();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS:
			return getPaxDoors();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS:
			return getCargoDoors();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS:
			return getIntercostals();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS:
			return getCenterFuselageAreas();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA:
			return getTailplaneAttachmentArea();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS:
			return getInterfaceDefinitions();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS:
			return getUIDGroupDefinitions();
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
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN:
			setSkin((SkinType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS:
			setStringers((StringersAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES:
			setFrames((FramesAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS:
			setPaxCrossBeams((PaxCrossBeamsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS:
			setPaxCrossBeamStruts((PaxCrossBeamStrutsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS:
			setCargoCrossBeams((CargoCrossBeamsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS:
			setCargoCrossBeamStruts((CargoCrossBeamStrutsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS:
			setLongFloorBeams((LongFloorBeamsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS:
			setGeneralStructuralMembers((GeneralStructuralMembersAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS:
			setFloorPanels((FloorPanelsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS:
			setPressureBulkheads((PressureBulkheadAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS:
			setWindows((WindowsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS:
			setWalls((WallsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS:
			setPaxDoors((PaxDoorsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS:
			setCargoDoors((CargoDoorsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS:
			setIntercostals((IntercostalsAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS:
			setCenterFuselageAreas((CenterFuselageAreasAssemblyType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA:
			setTailplaneAttachmentArea((TailplaneAttachmentAreaType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS:
			setInterfaceDefinitions((InterfaceDefinitionsType) newValue);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS:
			setUIDGroupDefinitions((UIDGroupDefinitionsType) newValue);
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
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN:
			setSkin((SkinType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS:
			setStringers((StringersAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES:
			setFrames((FramesAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS:
			setPaxCrossBeams((PaxCrossBeamsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS:
			setPaxCrossBeamStruts((PaxCrossBeamStrutsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS:
			setCargoCrossBeams((CargoCrossBeamsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS:
			setCargoCrossBeamStruts((CargoCrossBeamStrutsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS:
			setLongFloorBeams((LongFloorBeamsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS:
			setGeneralStructuralMembers((GeneralStructuralMembersAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS:
			setFloorPanels((FloorPanelsType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS:
			setPressureBulkheads((PressureBulkheadAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS:
			setWindows((WindowsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS:
			setWalls((WallsType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS:
			setPaxDoors((PaxDoorsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS:
			setCargoDoors((CargoDoorsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS:
			setIntercostals((IntercostalsAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS:
			setCenterFuselageAreas((CenterFuselageAreasAssemblyType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA:
			setTailplaneAttachmentArea((TailplaneAttachmentAreaType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS:
			setInterfaceDefinitions((InterfaceDefinitionsType) null);
			return;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS:
			setUIDGroupDefinitions((UIDGroupDefinitionsType) null);
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
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__SKIN:
			return skin != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__STRINGERS:
			return stringers != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FRAMES:
			return frames != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAMS:
			return paxCrossBeams != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_CROSS_BEAM_STRUTS:
			return paxCrossBeamStruts != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAMS:
			return cargoCrossBeams != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_CROSS_BEAM_STRUTS:
			return cargoCrossBeamStruts != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__LONG_FLOOR_BEAMS:
			return longFloorBeams != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__GENERAL_STRUCTURAL_MEMBERS:
			return generalStructuralMembers != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__FLOOR_PANELS:
			return floorPanels != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PRESSURE_BULKHEADS:
			return pressureBulkheads != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WINDOWS:
			return windows != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__WALLS:
			return walls != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__PAX_DOORS:
			return paxDoors != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CARGO_DOORS:
			return cargoDoors != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERCOSTALS:
			return intercostals != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__CENTER_FUSELAGE_AREAS:
			return centerFuselageAreas != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__TAILPLANE_ATTACHMENT_AREA:
			return tailplaneAttachmentArea != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__INTERFACE_DEFINITIONS:
			return interfaceDefinitions != null;
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE__UID_GROUP_DEFINITIONS:
			return uIDGroupDefinitions != null;
		}
		return super.eIsSet(featureID);
	}

} //FuselageStructureTypeImpl
