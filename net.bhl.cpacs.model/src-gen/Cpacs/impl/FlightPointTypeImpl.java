/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceDeflectionVectorsType;
import Cpacs.CpacsPackage;
import Cpacs.FlightPointType;
import Cpacs.GearDeflectionVectorsType;
import Cpacs.PointListXYZVectorType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getFlightTime <em>Flight Time</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getFlightDistance <em>Flight Distance</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getGroundDistance <em>Ground Distance</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getStaticPressure <em>Static Pressure</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getTAS <em>TAS</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getAngleOfRoll <em>Angle Of Roll</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getFuelFlow <em>Fuel Flow</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getCOFlow <em>CO Flow</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getCO2Flow <em>CO2 Flow</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getNOXFlow <em>NOX Flow</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getSootFlow <em>Soot Flow</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getHCFlow <em>HC Flow</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getSO2Flow <em>SO2 Flow</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getGearDeflections <em>Gear Deflections</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getControlSurfaceDeflections <em>Control Surface Deflections</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getThrust <em>Thrust</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getN1 <em>N1</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getRefLocation <em>Ref Location</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getCurrentLocation <em>Current Location</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPointTypeImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPointTypeImpl extends ComplexBaseTypeImpl implements FlightPointType {
	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType index;

	/**
	 * The cached value of the '{@link #getSegmentUID() <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType segmentUID;

	/**
	 * The cached value of the '{@link #getFlightTime() <em>Flight Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightTime()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType flightTime;

	/**
	 * The cached value of the '{@link #getFlightDistance() <em>Flight Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightDistance()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType flightDistance;

	/**
	 * The cached value of the '{@link #getGroundDistance() <em>Ground Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundDistance()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType groundDistance;

	/**
	 * The cached value of the '{@link #getStaticPressure() <em>Static Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticPressure()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType staticPressure;

	/**
	 * The cached value of the '{@link #getTAS() <em>TAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAS()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType tAS;

	/**
	 * The cached value of the '{@link #getCAS() <em>CAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAS()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType cAS;

	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType angleOfSideslip;

	/**
	 * The cached value of the '{@link #getAngleOfRoll() <em>Angle Of Roll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfRoll()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType angleOfRoll;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mass;

	/**
	 * The cached value of the '{@link #getFuelFlow() <em>Fuel Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelFlow()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType fuelFlow;

	/**
	 * The cached value of the '{@link #getCOFlow() <em>CO Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOFlow()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType cOFlow;

	/**
	 * The cached value of the '{@link #getCO2Flow() <em>CO2 Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2Flow()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType cO2Flow;

	/**
	 * The cached value of the '{@link #getNOXFlow() <em>NOX Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOXFlow()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType nOXFlow;

	/**
	 * The cached value of the '{@link #getSootFlow() <em>Soot Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSootFlow()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType sootFlow;

	/**
	 * The cached value of the '{@link #getHCFlow() <em>HC Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHCFlow()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType hCFlow;

	/**
	 * The cached value of the '{@link #getSO2Flow() <em>SO2 Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSO2Flow()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType sO2Flow;

	/**
	 * The cached value of the '{@link #getGearDeflections() <em>Gear Deflections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGearDeflections()
	 * @generated
	 * @ordered
	 */
	protected GearDeflectionVectorsType gearDeflections;

	/**
	 * The cached value of the '{@link #getControlSurfaceDeflections() <em>Control Surface Deflections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaceDeflections()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceDeflectionVectorsType controlSurfaceDeflections;

	/**
	 * The cached value of the '{@link #getThrust() <em>Thrust</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrust()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType thrust;

	/**
	 * The cached value of the '{@link #getN1() <em>N1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN1()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType n1;

	/**
	 * The cached value of the '{@link #getRefLocation() <em>Ref Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLocation()
	 * @generated
	 * @ordered
	 */
	protected PointListXYZVectorType refLocation;

	/**
	 * The cached value of the '{@link #getCurrentLocation() <em>Current Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLocation()
	 * @generated
	 * @ordered
	 */
	protected PointListXYZVectorType currentLocation;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType latitude;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType longitude;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType altitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(StringVectorBaseType newIndex, NotificationChain msgs) {
		StringVectorBaseType oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__INDEX, oldIndex, newIndex);
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
	public void setIndex(StringVectorBaseType newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject) index).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject) newIndex).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__INDEX, newIndex,
					newIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getSegmentUID() {
		return segmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUID(StringVectorBaseType newSegmentUID, NotificationChain msgs) {
		StringVectorBaseType oldSegmentUID = segmentUID;
		segmentUID = newSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID, oldSegmentUID, newSegmentUID);
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
	public void setSegmentUID(StringVectorBaseType newSegmentUID) {
		if (newSegmentUID != segmentUID) {
			NotificationChain msgs = null;
			if (segmentUID != null)
				msgs = ((InternalEObject) segmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID, null, msgs);
			if (newSegmentUID != null)
				msgs = ((InternalEObject) newSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID, null, msgs);
			msgs = basicSetSegmentUID(newSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID,
					newSegmentUID, newSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getFlightTime() {
		return flightTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightTime(StringVectorBaseType newFlightTime, NotificationChain msgs) {
		StringVectorBaseType oldFlightTime = flightTime;
		flightTime = newFlightTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME, oldFlightTime, newFlightTime);
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
	public void setFlightTime(StringVectorBaseType newFlightTime) {
		if (newFlightTime != flightTime) {
			NotificationChain msgs = null;
			if (flightTime != null)
				msgs = ((InternalEObject) flightTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME, null, msgs);
			if (newFlightTime != null)
				msgs = ((InternalEObject) newFlightTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME, null, msgs);
			msgs = basicSetFlightTime(newFlightTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME,
					newFlightTime, newFlightTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getFlightDistance() {
		return flightDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightDistance(StringVectorBaseType newFlightDistance, NotificationChain msgs) {
		StringVectorBaseType oldFlightDistance = flightDistance;
		flightDistance = newFlightDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE, oldFlightDistance, newFlightDistance);
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
	public void setFlightDistance(StringVectorBaseType newFlightDistance) {
		if (newFlightDistance != flightDistance) {
			NotificationChain msgs = null;
			if (flightDistance != null)
				msgs = ((InternalEObject) flightDistance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE, null, msgs);
			if (newFlightDistance != null)
				msgs = ((InternalEObject) newFlightDistance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE, null, msgs);
			msgs = basicSetFlightDistance(newFlightDistance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE,
					newFlightDistance, newFlightDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getGroundDistance() {
		return groundDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundDistance(StringVectorBaseType newGroundDistance, NotificationChain msgs) {
		StringVectorBaseType oldGroundDistance = groundDistance;
		groundDistance = newGroundDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE, oldGroundDistance, newGroundDistance);
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
	public void setGroundDistance(StringVectorBaseType newGroundDistance) {
		if (newGroundDistance != groundDistance) {
			NotificationChain msgs = null;
			if (groundDistance != null)
				msgs = ((InternalEObject) groundDistance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE, null, msgs);
			if (newGroundDistance != null)
				msgs = ((InternalEObject) newGroundDistance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE, null, msgs);
			msgs = basicSetGroundDistance(newGroundDistance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE,
					newGroundDistance, newGroundDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getStaticPressure() {
		return staticPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticPressure(StringVectorBaseType newStaticPressure, NotificationChain msgs) {
		StringVectorBaseType oldStaticPressure = staticPressure;
		staticPressure = newStaticPressure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE, oldStaticPressure, newStaticPressure);
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
	public void setStaticPressure(StringVectorBaseType newStaticPressure) {
		if (newStaticPressure != staticPressure) {
			NotificationChain msgs = null;
			if (staticPressure != null)
				msgs = ((InternalEObject) staticPressure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE, null, msgs);
			if (newStaticPressure != null)
				msgs = ((InternalEObject) newStaticPressure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE, null, msgs);
			msgs = basicSetStaticPressure(newStaticPressure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE,
					newStaticPressure, newStaticPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getTAS() {
		return tAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTAS(StringVectorBaseType newTAS, NotificationChain msgs) {
		StringVectorBaseType oldTAS = tAS;
		tAS = newTAS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__TAS, oldTAS, newTAS);
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
	public void setTAS(StringVectorBaseType newTAS) {
		if (newTAS != tAS) {
			NotificationChain msgs = null;
			if (tAS != null)
				msgs = ((InternalEObject) tAS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__TAS, null, msgs);
			if (newTAS != null)
				msgs = ((InternalEObject) newTAS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__TAS, null, msgs);
			msgs = basicSetTAS(newTAS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__TAS, newTAS, newTAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getCAS() {
		return cAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCAS(StringVectorBaseType newCAS, NotificationChain msgs) {
		StringVectorBaseType oldCAS = cAS;
		cAS = newCAS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__CAS, oldCAS, newCAS);
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
	public void setCAS(StringVectorBaseType newCAS) {
		if (newCAS != cAS) {
			NotificationChain msgs = null;
			if (cAS != null)
				msgs = ((InternalEObject) cAS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CAS, null, msgs);
			if (newCAS != null)
				msgs = ((InternalEObject) newCAS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CAS, null, msgs);
			msgs = basicSetCAS(newCAS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__CAS, newCAS, newCAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(StringVectorBaseType newAngleOfAttack, NotificationChain msgs) {
		StringVectorBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
	public void setAngleOfAttack(StringVectorBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK, null, msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK, null, msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK,
					newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(StringVectorBaseType newAngleOfSideslip, NotificationChain msgs) {
		StringVectorBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip, newAngleOfSideslip);
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
	public void setAngleOfSideslip(StringVectorBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP,
					newAngleOfSideslip, newAngleOfSideslip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAngleOfRoll() {
		return angleOfRoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfRoll(StringVectorBaseType newAngleOfRoll, NotificationChain msgs) {
		StringVectorBaseType oldAngleOfRoll = angleOfRoll;
		angleOfRoll = newAngleOfRoll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL, oldAngleOfRoll, newAngleOfRoll);
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
	public void setAngleOfRoll(StringVectorBaseType newAngleOfRoll) {
		if (newAngleOfRoll != angleOfRoll) {
			NotificationChain msgs = null;
			if (angleOfRoll != null)
				msgs = ((InternalEObject) angleOfRoll).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL, null, msgs);
			if (newAngleOfRoll != null)
				msgs = ((InternalEObject) newAngleOfRoll).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL, null, msgs);
			msgs = basicSetAngleOfRoll(newAngleOfRoll, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL,
					newAngleOfRoll, newAngleOfRoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(StringVectorBaseType newMass, NotificationChain msgs) {
		StringVectorBaseType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__MASS, oldMass, newMass);
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
	public void setMass(StringVectorBaseType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__MASS, newMass,
					newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getFuelFlow() {
		return fuelFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelFlow(StringVectorBaseType newFuelFlow, NotificationChain msgs) {
		StringVectorBaseType oldFuelFlow = fuelFlow;
		fuelFlow = newFuelFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW, oldFuelFlow, newFuelFlow);
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
	public void setFuelFlow(StringVectorBaseType newFuelFlow) {
		if (newFuelFlow != fuelFlow) {
			NotificationChain msgs = null;
			if (fuelFlow != null)
				msgs = ((InternalEObject) fuelFlow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW, null, msgs);
			if (newFuelFlow != null)
				msgs = ((InternalEObject) newFuelFlow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW, null, msgs);
			msgs = basicSetFuelFlow(newFuelFlow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW,
					newFuelFlow, newFuelFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getCOFlow() {
		return cOFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCOFlow(StringVectorBaseType newCOFlow, NotificationChain msgs) {
		StringVectorBaseType oldCOFlow = cOFlow;
		cOFlow = newCOFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW, oldCOFlow, newCOFlow);
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
	public void setCOFlow(StringVectorBaseType newCOFlow) {
		if (newCOFlow != cOFlow) {
			NotificationChain msgs = null;
			if (cOFlow != null)
				msgs = ((InternalEObject) cOFlow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW, null, msgs);
			if (newCOFlow != null)
				msgs = ((InternalEObject) newCOFlow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW, null, msgs);
			msgs = basicSetCOFlow(newCOFlow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW, newCOFlow,
					newCOFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getCO2Flow() {
		return cO2Flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCO2Flow(StringVectorBaseType newCO2Flow, NotificationChain msgs) {
		StringVectorBaseType oldCO2Flow = cO2Flow;
		cO2Flow = newCO2Flow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW, oldCO2Flow, newCO2Flow);
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
	public void setCO2Flow(StringVectorBaseType newCO2Flow) {
		if (newCO2Flow != cO2Flow) {
			NotificationChain msgs = null;
			if (cO2Flow != null)
				msgs = ((InternalEObject) cO2Flow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW, null, msgs);
			if (newCO2Flow != null)
				msgs = ((InternalEObject) newCO2Flow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW, null, msgs);
			msgs = basicSetCO2Flow(newCO2Flow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW, newCO2Flow,
					newCO2Flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNOXFlow() {
		return nOXFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNOXFlow(StringVectorBaseType newNOXFlow, NotificationChain msgs) {
		StringVectorBaseType oldNOXFlow = nOXFlow;
		nOXFlow = newNOXFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW, oldNOXFlow, newNOXFlow);
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
	public void setNOXFlow(StringVectorBaseType newNOXFlow) {
		if (newNOXFlow != nOXFlow) {
			NotificationChain msgs = null;
			if (nOXFlow != null)
				msgs = ((InternalEObject) nOXFlow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW, null, msgs);
			if (newNOXFlow != null)
				msgs = ((InternalEObject) newNOXFlow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW, null, msgs);
			msgs = basicSetNOXFlow(newNOXFlow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW, newNOXFlow,
					newNOXFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getSootFlow() {
		return sootFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSootFlow(StringVectorBaseType newSootFlow, NotificationChain msgs) {
		StringVectorBaseType oldSootFlow = sootFlow;
		sootFlow = newSootFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW, oldSootFlow, newSootFlow);
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
	public void setSootFlow(StringVectorBaseType newSootFlow) {
		if (newSootFlow != sootFlow) {
			NotificationChain msgs = null;
			if (sootFlow != null)
				msgs = ((InternalEObject) sootFlow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW, null, msgs);
			if (newSootFlow != null)
				msgs = ((InternalEObject) newSootFlow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW, null, msgs);
			msgs = basicSetSootFlow(newSootFlow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW,
					newSootFlow, newSootFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getHCFlow() {
		return hCFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHCFlow(StringVectorBaseType newHCFlow, NotificationChain msgs) {
		StringVectorBaseType oldHCFlow = hCFlow;
		hCFlow = newHCFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW, oldHCFlow, newHCFlow);
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
	public void setHCFlow(StringVectorBaseType newHCFlow) {
		if (newHCFlow != hCFlow) {
			NotificationChain msgs = null;
			if (hCFlow != null)
				msgs = ((InternalEObject) hCFlow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW, null, msgs);
			if (newHCFlow != null)
				msgs = ((InternalEObject) newHCFlow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW, null, msgs);
			msgs = basicSetHCFlow(newHCFlow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW, newHCFlow,
					newHCFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getSO2Flow() {
		return sO2Flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSO2Flow(StringVectorBaseType newSO2Flow, NotificationChain msgs) {
		StringVectorBaseType oldSO2Flow = sO2Flow;
		sO2Flow = newSO2Flow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW, oldSO2Flow, newSO2Flow);
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
	public void setSO2Flow(StringVectorBaseType newSO2Flow) {
		if (newSO2Flow != sO2Flow) {
			NotificationChain msgs = null;
			if (sO2Flow != null)
				msgs = ((InternalEObject) sO2Flow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW, null, msgs);
			if (newSO2Flow != null)
				msgs = ((InternalEObject) newSO2Flow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW, null, msgs);
			msgs = basicSetSO2Flow(newSO2Flow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW, newSO2Flow,
					newSO2Flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GearDeflectionVectorsType getGearDeflections() {
		return gearDeflections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGearDeflections(GearDeflectionVectorsType newGearDeflections,
			NotificationChain msgs) {
		GearDeflectionVectorsType oldGearDeflections = gearDeflections;
		gearDeflections = newGearDeflections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS, oldGearDeflections, newGearDeflections);
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
	public void setGearDeflections(GearDeflectionVectorsType newGearDeflections) {
		if (newGearDeflections != gearDeflections) {
			NotificationChain msgs = null;
			if (gearDeflections != null)
				msgs = ((InternalEObject) gearDeflections).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS, null, msgs);
			if (newGearDeflections != null)
				msgs = ((InternalEObject) newGearDeflections).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS, null, msgs);
			msgs = basicSetGearDeflections(newGearDeflections, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS,
					newGearDeflections, newGearDeflections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceDeflectionVectorsType getControlSurfaceDeflections() {
		return controlSurfaceDeflections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaceDeflections(
			ControlSurfaceDeflectionVectorsType newControlSurfaceDeflections, NotificationChain msgs) {
		ControlSurfaceDeflectionVectorsType oldControlSurfaceDeflections = controlSurfaceDeflections;
		controlSurfaceDeflections = newControlSurfaceDeflections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS, oldControlSurfaceDeflections,
					newControlSurfaceDeflections);
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
	public void setControlSurfaceDeflections(ControlSurfaceDeflectionVectorsType newControlSurfaceDeflections) {
		if (newControlSurfaceDeflections != controlSurfaceDeflections) {
			NotificationChain msgs = null;
			if (controlSurfaceDeflections != null)
				msgs = ((InternalEObject) controlSurfaceDeflections).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS, null,
						msgs);
			if (newControlSurfaceDeflections != null)
				msgs = ((InternalEObject) newControlSurfaceDeflections).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS, null,
						msgs);
			msgs = basicSetControlSurfaceDeflections(newControlSurfaceDeflections, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS, newControlSurfaceDeflections,
					newControlSurfaceDeflections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getThrust() {
		return thrust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrust(StringVectorBaseType newThrust, NotificationChain msgs) {
		StringVectorBaseType oldThrust = thrust;
		thrust = newThrust;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__THRUST, oldThrust, newThrust);
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
	public void setThrust(StringVectorBaseType newThrust) {
		if (newThrust != thrust) {
			NotificationChain msgs = null;
			if (thrust != null)
				msgs = ((InternalEObject) thrust).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__THRUST, null, msgs);
			if (newThrust != null)
				msgs = ((InternalEObject) newThrust).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__THRUST, null, msgs);
			msgs = basicSetThrust(newThrust, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__THRUST, newThrust,
					newThrust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getN1() {
		return n1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetN1(StringVectorBaseType newN1, NotificationChain msgs) {
		StringVectorBaseType oldN1 = n1;
		n1 = newN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__N1, oldN1, newN1);
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
	public void setN1(StringVectorBaseType newN1) {
		if (newN1 != n1) {
			NotificationChain msgs = null;
			if (n1 != null)
				msgs = ((InternalEObject) n1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__N1, null, msgs);
			if (newN1 != null)
				msgs = ((InternalEObject) newN1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__N1, null, msgs);
			msgs = basicSetN1(newN1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__N1, newN1, newN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYZVectorType getRefLocation() {
		return refLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefLocation(PointListXYZVectorType newRefLocation, NotificationChain msgs) {
		PointListXYZVectorType oldRefLocation = refLocation;
		refLocation = newRefLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION, oldRefLocation, newRefLocation);
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
	public void setRefLocation(PointListXYZVectorType newRefLocation) {
		if (newRefLocation != refLocation) {
			NotificationChain msgs = null;
			if (refLocation != null)
				msgs = ((InternalEObject) refLocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION, null, msgs);
			if (newRefLocation != null)
				msgs = ((InternalEObject) newRefLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION, null, msgs);
			msgs = basicSetRefLocation(newRefLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION,
					newRefLocation, newRefLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYZVectorType getCurrentLocation() {
		return currentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentLocation(PointListXYZVectorType newCurrentLocation,
			NotificationChain msgs) {
		PointListXYZVectorType oldCurrentLocation = currentLocation;
		currentLocation = newCurrentLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION, oldCurrentLocation, newCurrentLocation);
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
	public void setCurrentLocation(PointListXYZVectorType newCurrentLocation) {
		if (newCurrentLocation != currentLocation) {
			NotificationChain msgs = null;
			if (currentLocation != null)
				msgs = ((InternalEObject) currentLocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION, null, msgs);
			if (newCurrentLocation != null)
				msgs = ((InternalEObject) newCurrentLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION, null, msgs);
			msgs = basicSetCurrentLocation(newCurrentLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION,
					newCurrentLocation, newCurrentLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatitude(StringVectorBaseType newLatitude, NotificationChain msgs) {
		StringVectorBaseType oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE, oldLatitude, newLatitude);
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
	public void setLatitude(StringVectorBaseType newLatitude) {
		if (newLatitude != latitude) {
			NotificationChain msgs = null;
			if (latitude != null)
				msgs = ((InternalEObject) latitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE, null, msgs);
			if (newLatitude != null)
				msgs = ((InternalEObject) newLatitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE, null, msgs);
			msgs = basicSetLatitude(newLatitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE, newLatitude,
					newLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongitude(StringVectorBaseType newLongitude, NotificationChain msgs) {
		StringVectorBaseType oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE, oldLongitude, newLongitude);
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
	public void setLongitude(StringVectorBaseType newLongitude) {
		if (newLongitude != longitude) {
			NotificationChain msgs = null;
			if (longitude != null)
				msgs = ((InternalEObject) longitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE, null, msgs);
			if (newLongitude != null)
				msgs = ((InternalEObject) newLongitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE, null, msgs);
			msgs = basicSetLongitude(newLongitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE,
					newLongitude, newLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(StringVectorBaseType newAltitude, NotificationChain msgs) {
		StringVectorBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(StringVectorBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE, newAltitude,
					newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_POINT_TYPE__INDEX:
			return basicSetIndex(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID:
			return basicSetSegmentUID(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME:
			return basicSetFlightTime(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE:
			return basicSetFlightDistance(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE:
			return basicSetGroundDistance(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE:
			return basicSetStaticPressure(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__TAS:
			return basicSetTAS(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__CAS:
			return basicSetCAS(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL:
			return basicSetAngleOfRoll(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW:
			return basicSetFuelFlow(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW:
			return basicSetCOFlow(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW:
			return basicSetCO2Flow(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW:
			return basicSetNOXFlow(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW:
			return basicSetSootFlow(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW:
			return basicSetHCFlow(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW:
			return basicSetSO2Flow(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS:
			return basicSetGearDeflections(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS:
			return basicSetControlSurfaceDeflections(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__THRUST:
			return basicSetThrust(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__N1:
			return basicSetN1(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION:
			return basicSetRefLocation(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION:
			return basicSetCurrentLocation(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE:
			return basicSetLatitude(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE:
			return basicSetLongitude(null, msgs);
		case CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
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
		case CpacsPackage.FLIGHT_POINT_TYPE__INDEX:
			return getIndex();
		case CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID:
			return getSegmentUID();
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME:
			return getFlightTime();
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE:
			return getFlightDistance();
		case CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE:
			return getGroundDistance();
		case CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE:
			return getStaticPressure();
		case CpacsPackage.FLIGHT_POINT_TYPE__TAS:
			return getTAS();
		case CpacsPackage.FLIGHT_POINT_TYPE__CAS:
			return getCAS();
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL:
			return getAngleOfRoll();
		case CpacsPackage.FLIGHT_POINT_TYPE__MASS:
			return getMass();
		case CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW:
			return getFuelFlow();
		case CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW:
			return getCOFlow();
		case CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW:
			return getCO2Flow();
		case CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW:
			return getNOXFlow();
		case CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW:
			return getSootFlow();
		case CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW:
			return getHCFlow();
		case CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW:
			return getSO2Flow();
		case CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS:
			return getGearDeflections();
		case CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS:
			return getControlSurfaceDeflections();
		case CpacsPackage.FLIGHT_POINT_TYPE__THRUST:
			return getThrust();
		case CpacsPackage.FLIGHT_POINT_TYPE__N1:
			return getN1();
		case CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION:
			return getRefLocation();
		case CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION:
			return getCurrentLocation();
		case CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE:
			return getLatitude();
		case CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE:
			return getLongitude();
		case CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE:
			return getAltitude();
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
		case CpacsPackage.FLIGHT_POINT_TYPE__INDEX:
			setIndex((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID:
			setSegmentUID((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME:
			setFlightTime((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE:
			setFlightDistance((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE:
			setGroundDistance((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE:
			setStaticPressure((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__TAS:
			setTAS((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CAS:
			setCAS((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL:
			setAngleOfRoll((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__MASS:
			setMass((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW:
			setFuelFlow((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW:
			setCOFlow((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW:
			setCO2Flow((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW:
			setNOXFlow((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW:
			setSootFlow((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW:
			setHCFlow((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW:
			setSO2Flow((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS:
			setGearDeflections((GearDeflectionVectorsType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS:
			setControlSurfaceDeflections((ControlSurfaceDeflectionVectorsType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__THRUST:
			setThrust((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__N1:
			setN1((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION:
			setRefLocation((PointListXYZVectorType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION:
			setCurrentLocation((PointListXYZVectorType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE:
			setLatitude((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE:
			setLongitude((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE:
			setAltitude((StringVectorBaseType) newValue);
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
		case CpacsPackage.FLIGHT_POINT_TYPE__INDEX:
			setIndex((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID:
			setSegmentUID((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME:
			setFlightTime((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE:
			setFlightDistance((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE:
			setGroundDistance((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE:
			setStaticPressure((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__TAS:
			setTAS((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CAS:
			setCAS((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL:
			setAngleOfRoll((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__MASS:
			setMass((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW:
			setFuelFlow((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW:
			setCOFlow((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW:
			setCO2Flow((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW:
			setNOXFlow((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW:
			setSootFlow((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW:
			setHCFlow((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW:
			setSO2Flow((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS:
			setGearDeflections((GearDeflectionVectorsType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS:
			setControlSurfaceDeflections((ControlSurfaceDeflectionVectorsType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__THRUST:
			setThrust((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__N1:
			setN1((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION:
			setRefLocation((PointListXYZVectorType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION:
			setCurrentLocation((PointListXYZVectorType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE:
			setLatitude((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE:
			setLongitude((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE:
			setAltitude((StringVectorBaseType) null);
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
		case CpacsPackage.FLIGHT_POINT_TYPE__INDEX:
			return index != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__SEGMENT_UID:
			return segmentUID != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_TIME:
			return flightTime != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__FLIGHT_DISTANCE:
			return flightDistance != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__GROUND_DISTANCE:
			return groundDistance != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__STATIC_PRESSURE:
			return staticPressure != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__TAS:
			return tAS != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__CAS:
			return cAS != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__ANGLE_OF_ROLL:
			return angleOfRoll != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__MASS:
			return mass != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__FUEL_FLOW:
			return fuelFlow != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__CO_FLOW:
			return cOFlow != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__CO2_FLOW:
			return cO2Flow != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__NOX_FLOW:
			return nOXFlow != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__SOOT_FLOW:
			return sootFlow != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__HC_FLOW:
			return hCFlow != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__SO2_FLOW:
			return sO2Flow != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__GEAR_DEFLECTIONS:
			return gearDeflections != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__CONTROL_SURFACE_DEFLECTIONS:
			return controlSurfaceDeflections != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__THRUST:
			return thrust != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__N1:
			return n1 != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__REF_LOCATION:
			return refLocation != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__CURRENT_LOCATION:
			return currentLocation != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__LATITUDE:
			return latitude != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__LONGITUDE:
			return longitude != null;
		case CpacsPackage.FLIGHT_POINT_TYPE__ALTITUDE:
			return altitude != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightPointTypeImpl
