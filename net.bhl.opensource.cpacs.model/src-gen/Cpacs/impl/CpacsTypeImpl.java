/**
 */
package Cpacs.impl;

import Cpacs.AirlinesType;
import Cpacs.AirportsType;
import Cpacs.CpacsPackage;
import Cpacs.CpacsType;
import Cpacs.FlightsType;
import Cpacs.HeaderType;
import Cpacs.MissionDefinitionsType;
import Cpacs.StudiesType;
import Cpacs.ToolspecificType;
import Cpacs.VehiclesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CpacsTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link Cpacs.impl.CpacsTypeImpl#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link Cpacs.impl.CpacsTypeImpl#getMissionDefinitions <em>Mission Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.CpacsTypeImpl#getAirports <em>Airports</em>}</li>
 *   <li>{@link Cpacs.impl.CpacsTypeImpl#getFlights <em>Flights</em>}</li>
 *   <li>{@link Cpacs.impl.CpacsTypeImpl#getAirlines <em>Airlines</em>}</li>
 *   <li>{@link Cpacs.impl.CpacsTypeImpl#getStudies <em>Studies</em>}</li>
 *   <li>{@link Cpacs.impl.CpacsTypeImpl#getToolspecific <em>Toolspecific</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpacsTypeImpl extends MinimalEObjectImpl.Container implements CpacsType {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HeaderType header;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected VehiclesType vehicles;

	/**
	 * The cached value of the '{@link #getMissionDefinitions() <em>Mission Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected MissionDefinitionsType missionDefinitions;

	/**
	 * The cached value of the '{@link #getAirports() <em>Airports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirports()
	 * @generated
	 * @ordered
	 */
	protected AirportsType airports;

	/**
	 * The cached value of the '{@link #getFlights() <em>Flights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlights()
	 * @generated
	 * @ordered
	 */
	protected FlightsType flights;

	/**
	 * The cached value of the '{@link #getAirlines() <em>Airlines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirlines()
	 * @generated
	 * @ordered
	 */
	protected AirlinesType airlines;

	/**
	 * The cached value of the '{@link #getStudies() <em>Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudies()
	 * @generated
	 * @ordered
	 */
	protected StudiesType studies;

	/**
	 * The cached value of the '{@link #getToolspecific() <em>Toolspecific</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolspecific()
	 * @generated
	 * @ordered
	 */
	protected ToolspecificType toolspecific;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpacsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCpacsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderType getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		HeaderType oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CPACS_TYPE__HEADER, oldHeader, newHeader);
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
	public void setHeader(HeaderType newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject) header).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject) newHeader).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CPACS_TYPE__HEADER, newHeader,
					newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehiclesType getVehicles() {
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicles(VehiclesType newVehicles, NotificationChain msgs) {
		VehiclesType oldVehicles = vehicles;
		vehicles = newVehicles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CPACS_TYPE__VEHICLES, oldVehicles, newVehicles);
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
	public void setVehicles(VehiclesType newVehicles) {
		if (newVehicles != vehicles) {
			NotificationChain msgs = null;
			if (vehicles != null)
				msgs = ((InternalEObject) vehicles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__VEHICLES, null, msgs);
			if (newVehicles != null)
				msgs = ((InternalEObject) newVehicles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__VEHICLES, null, msgs);
			msgs = basicSetVehicles(newVehicles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CPACS_TYPE__VEHICLES, newVehicles,
					newVehicles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionDefinitionsType getMissionDefinitions() {
		return missionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissionDefinitions(MissionDefinitionsType newMissionDefinitions,
			NotificationChain msgs) {
		MissionDefinitionsType oldMissionDefinitions = missionDefinitions;
		missionDefinitions = newMissionDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS, oldMissionDefinitions, newMissionDefinitions);
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
	public void setMissionDefinitions(MissionDefinitionsType newMissionDefinitions) {
		if (newMissionDefinitions != missionDefinitions) {
			NotificationChain msgs = null;
			if (missionDefinitions != null)
				msgs = ((InternalEObject) missionDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS, null, msgs);
			if (newMissionDefinitions != null)
				msgs = ((InternalEObject) newMissionDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS, null, msgs);
			msgs = basicSetMissionDefinitions(newMissionDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS,
					newMissionDefinitions, newMissionDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirportsType getAirports() {
		return airports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirports(AirportsType newAirports, NotificationChain msgs) {
		AirportsType oldAirports = airports;
		airports = newAirports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CPACS_TYPE__AIRPORTS, oldAirports, newAirports);
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
	public void setAirports(AirportsType newAirports) {
		if (newAirports != airports) {
			NotificationChain msgs = null;
			if (airports != null)
				msgs = ((InternalEObject) airports).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__AIRPORTS, null, msgs);
			if (newAirports != null)
				msgs = ((InternalEObject) newAirports).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__AIRPORTS, null, msgs);
			msgs = basicSetAirports(newAirports, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CPACS_TYPE__AIRPORTS, newAirports,
					newAirports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightsType getFlights() {
		return flights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlights(FlightsType newFlights, NotificationChain msgs) {
		FlightsType oldFlights = flights;
		flights = newFlights;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CPACS_TYPE__FLIGHTS, oldFlights, newFlights);
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
	public void setFlights(FlightsType newFlights) {
		if (newFlights != flights) {
			NotificationChain msgs = null;
			if (flights != null)
				msgs = ((InternalEObject) flights).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__FLIGHTS, null, msgs);
			if (newFlights != null)
				msgs = ((InternalEObject) newFlights).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__FLIGHTS, null, msgs);
			msgs = basicSetFlights(newFlights, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CPACS_TYPE__FLIGHTS, newFlights,
					newFlights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirlinesType getAirlines() {
		return airlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirlines(AirlinesType newAirlines, NotificationChain msgs) {
		AirlinesType oldAirlines = airlines;
		airlines = newAirlines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CPACS_TYPE__AIRLINES, oldAirlines, newAirlines);
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
	public void setAirlines(AirlinesType newAirlines) {
		if (newAirlines != airlines) {
			NotificationChain msgs = null;
			if (airlines != null)
				msgs = ((InternalEObject) airlines).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__AIRLINES, null, msgs);
			if (newAirlines != null)
				msgs = ((InternalEObject) newAirlines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__AIRLINES, null, msgs);
			msgs = basicSetAirlines(newAirlines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CPACS_TYPE__AIRLINES, newAirlines,
					newAirlines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudiesType getStudies() {
		return studies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudies(StudiesType newStudies, NotificationChain msgs) {
		StudiesType oldStudies = studies;
		studies = newStudies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CPACS_TYPE__STUDIES, oldStudies, newStudies);
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
	public void setStudies(StudiesType newStudies) {
		if (newStudies != studies) {
			NotificationChain msgs = null;
			if (studies != null)
				msgs = ((InternalEObject) studies).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__STUDIES, null, msgs);
			if (newStudies != null)
				msgs = ((InternalEObject) newStudies).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__STUDIES, null, msgs);
			msgs = basicSetStudies(newStudies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CPACS_TYPE__STUDIES, newStudies,
					newStudies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolspecificType getToolspecific() {
		return toolspecific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolspecific(ToolspecificType newToolspecific, NotificationChain msgs) {
		ToolspecificType oldToolspecific = toolspecific;
		toolspecific = newToolspecific;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CPACS_TYPE__TOOLSPECIFIC, oldToolspecific, newToolspecific);
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
	public void setToolspecific(ToolspecificType newToolspecific) {
		if (newToolspecific != toolspecific) {
			NotificationChain msgs = null;
			if (toolspecific != null)
				msgs = ((InternalEObject) toolspecific).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__TOOLSPECIFIC, null, msgs);
			if (newToolspecific != null)
				msgs = ((InternalEObject) newToolspecific).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CPACS_TYPE__TOOLSPECIFIC, null, msgs);
			msgs = basicSetToolspecific(newToolspecific, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CPACS_TYPE__TOOLSPECIFIC,
					newToolspecific, newToolspecific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CPACS_TYPE__HEADER:
			return basicSetHeader(null, msgs);
		case CpacsPackage.CPACS_TYPE__VEHICLES:
			return basicSetVehicles(null, msgs);
		case CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS:
			return basicSetMissionDefinitions(null, msgs);
		case CpacsPackage.CPACS_TYPE__AIRPORTS:
			return basicSetAirports(null, msgs);
		case CpacsPackage.CPACS_TYPE__FLIGHTS:
			return basicSetFlights(null, msgs);
		case CpacsPackage.CPACS_TYPE__AIRLINES:
			return basicSetAirlines(null, msgs);
		case CpacsPackage.CPACS_TYPE__STUDIES:
			return basicSetStudies(null, msgs);
		case CpacsPackage.CPACS_TYPE__TOOLSPECIFIC:
			return basicSetToolspecific(null, msgs);
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
		case CpacsPackage.CPACS_TYPE__HEADER:
			return getHeader();
		case CpacsPackage.CPACS_TYPE__VEHICLES:
			return getVehicles();
		case CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS:
			return getMissionDefinitions();
		case CpacsPackage.CPACS_TYPE__AIRPORTS:
			return getAirports();
		case CpacsPackage.CPACS_TYPE__FLIGHTS:
			return getFlights();
		case CpacsPackage.CPACS_TYPE__AIRLINES:
			return getAirlines();
		case CpacsPackage.CPACS_TYPE__STUDIES:
			return getStudies();
		case CpacsPackage.CPACS_TYPE__TOOLSPECIFIC:
			return getToolspecific();
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
		case CpacsPackage.CPACS_TYPE__HEADER:
			setHeader((HeaderType) newValue);
			return;
		case CpacsPackage.CPACS_TYPE__VEHICLES:
			setVehicles((VehiclesType) newValue);
			return;
		case CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS:
			setMissionDefinitions((MissionDefinitionsType) newValue);
			return;
		case CpacsPackage.CPACS_TYPE__AIRPORTS:
			setAirports((AirportsType) newValue);
			return;
		case CpacsPackage.CPACS_TYPE__FLIGHTS:
			setFlights((FlightsType) newValue);
			return;
		case CpacsPackage.CPACS_TYPE__AIRLINES:
			setAirlines((AirlinesType) newValue);
			return;
		case CpacsPackage.CPACS_TYPE__STUDIES:
			setStudies((StudiesType) newValue);
			return;
		case CpacsPackage.CPACS_TYPE__TOOLSPECIFIC:
			setToolspecific((ToolspecificType) newValue);
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
		case CpacsPackage.CPACS_TYPE__HEADER:
			setHeader((HeaderType) null);
			return;
		case CpacsPackage.CPACS_TYPE__VEHICLES:
			setVehicles((VehiclesType) null);
			return;
		case CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS:
			setMissionDefinitions((MissionDefinitionsType) null);
			return;
		case CpacsPackage.CPACS_TYPE__AIRPORTS:
			setAirports((AirportsType) null);
			return;
		case CpacsPackage.CPACS_TYPE__FLIGHTS:
			setFlights((FlightsType) null);
			return;
		case CpacsPackage.CPACS_TYPE__AIRLINES:
			setAirlines((AirlinesType) null);
			return;
		case CpacsPackage.CPACS_TYPE__STUDIES:
			setStudies((StudiesType) null);
			return;
		case CpacsPackage.CPACS_TYPE__TOOLSPECIFIC:
			setToolspecific((ToolspecificType) null);
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
		case CpacsPackage.CPACS_TYPE__HEADER:
			return header != null;
		case CpacsPackage.CPACS_TYPE__VEHICLES:
			return vehicles != null;
		case CpacsPackage.CPACS_TYPE__MISSION_DEFINITIONS:
			return missionDefinitions != null;
		case CpacsPackage.CPACS_TYPE__AIRPORTS:
			return airports != null;
		case CpacsPackage.CPACS_TYPE__FLIGHTS:
			return flights != null;
		case CpacsPackage.CPACS_TYPE__AIRLINES:
			return airlines != null;
		case CpacsPackage.CPACS_TYPE__STUDIES:
			return studies != null;
		case CpacsPackage.CPACS_TYPE__TOOLSPECIFIC:
			return toolspecific != null;
		}
		return super.eIsSet(featureID);
	}

} //CpacsTypeImpl
