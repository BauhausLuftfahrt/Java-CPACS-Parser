/**
 */
package Cpacs.impl;

import Cpacs.AxlesType;
import Cpacs.BogieType;
import Cpacs.CpacsPackage;
import Cpacs.GearComponentsType;
import Cpacs.MainActuatorType;
import Cpacs.PistonType;
import Cpacs.SideStrutsType;
import Cpacs.StrutType;
import Cpacs.StrutWithActuatorType;
import Cpacs.WheelsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gear Components Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getMainStrut <em>Main Strut</em>}</li>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getPiston <em>Piston</em>}</li>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getDragStrut <em>Drag Strut</em>}</li>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getPintleStrut <em>Pintle Strut</em>}</li>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getSideStruts <em>Side Struts</em>}</li>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getMainActuator <em>Main Actuator</em>}</li>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getBogie <em>Bogie</em>}</li>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getAxles <em>Axles</em>}</li>
 *   <li>{@link Cpacs.impl.GearComponentsTypeImpl#getWheels <em>Wheels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GearComponentsTypeImpl extends ComplexBaseTypeImpl implements GearComponentsType {
	/**
	 * The cached value of the '{@link #getMainStrut() <em>Main Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainStrut()
	 * @generated
	 * @ordered
	 */
	protected StrutType mainStrut;

	/**
	 * The cached value of the '{@link #getPiston() <em>Piston</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiston()
	 * @generated
	 * @ordered
	 */
	protected PistonType piston;

	/**
	 * The cached value of the '{@link #getDragStrut() <em>Drag Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDragStrut()
	 * @generated
	 * @ordered
	 */
	protected StrutWithActuatorType dragStrut;

	/**
	 * The cached value of the '{@link #getPintleStrut() <em>Pintle Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPintleStrut()
	 * @generated
	 * @ordered
	 */
	protected StrutType pintleStrut;

	/**
	 * The cached value of the '{@link #getSideStruts() <em>Side Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideStruts()
	 * @generated
	 * @ordered
	 */
	protected SideStrutsType sideStruts;

	/**
	 * The cached value of the '{@link #getMainActuator() <em>Main Actuator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainActuator()
	 * @generated
	 * @ordered
	 */
	protected MainActuatorType mainActuator;

	/**
	 * The cached value of the '{@link #getBogie() <em>Bogie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBogie()
	 * @generated
	 * @ordered
	 */
	protected BogieType bogie;

	/**
	 * The cached value of the '{@link #getAxles() <em>Axles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxles()
	 * @generated
	 * @ordered
	 */
	protected AxlesType axles;

	/**
	 * The cached value of the '{@link #getWheels() <em>Wheels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheels()
	 * @generated
	 * @ordered
	 */
	protected WheelsType wheels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GearComponentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGearComponentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutType getMainStrut() {
		return mainStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainStrut(StrutType newMainStrut, NotificationChain msgs) {
		StrutType oldMainStrut = mainStrut;
		mainStrut = newMainStrut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT, oldMainStrut, newMainStrut);
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
	public void setMainStrut(StrutType newMainStrut) {
		if (newMainStrut != mainStrut) {
			NotificationChain msgs = null;
			if (mainStrut != null)
				msgs = ((InternalEObject) mainStrut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT, null, msgs);
			if (newMainStrut != null)
				msgs = ((InternalEObject) newMainStrut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT, null, msgs);
			msgs = basicSetMainStrut(newMainStrut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT,
					newMainStrut, newMainStrut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PistonType getPiston() {
		return piston;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPiston(PistonType newPiston, NotificationChain msgs) {
		PistonType oldPiston = piston;
		piston = newPiston;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON, oldPiston, newPiston);
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
	public void setPiston(PistonType newPiston) {
		if (newPiston != piston) {
			NotificationChain msgs = null;
			if (piston != null)
				msgs = ((InternalEObject) piston).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON, null, msgs);
			if (newPiston != null)
				msgs = ((InternalEObject) newPiston).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON, null, msgs);
			msgs = basicSetPiston(newPiston, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON, newPiston,
					newPiston));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutWithActuatorType getDragStrut() {
		return dragStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDragStrut(StrutWithActuatorType newDragStrut, NotificationChain msgs) {
		StrutWithActuatorType oldDragStrut = dragStrut;
		dragStrut = newDragStrut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT, oldDragStrut, newDragStrut);
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
	public void setDragStrut(StrutWithActuatorType newDragStrut) {
		if (newDragStrut != dragStrut) {
			NotificationChain msgs = null;
			if (dragStrut != null)
				msgs = ((InternalEObject) dragStrut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT, null, msgs);
			if (newDragStrut != null)
				msgs = ((InternalEObject) newDragStrut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT, null, msgs);
			msgs = basicSetDragStrut(newDragStrut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT,
					newDragStrut, newDragStrut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutType getPintleStrut() {
		return pintleStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPintleStrut(StrutType newPintleStrut, NotificationChain msgs) {
		StrutType oldPintleStrut = pintleStrut;
		pintleStrut = newPintleStrut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT, oldPintleStrut, newPintleStrut);
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
	public void setPintleStrut(StrutType newPintleStrut) {
		if (newPintleStrut != pintleStrut) {
			NotificationChain msgs = null;
			if (pintleStrut != null)
				msgs = ((InternalEObject) pintleStrut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT, null, msgs);
			if (newPintleStrut != null)
				msgs = ((InternalEObject) newPintleStrut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT, null, msgs);
			msgs = basicSetPintleStrut(newPintleStrut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT,
					newPintleStrut, newPintleStrut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SideStrutsType getSideStruts() {
		return sideStruts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSideStruts(SideStrutsType newSideStruts, NotificationChain msgs) {
		SideStrutsType oldSideStruts = sideStruts;
		sideStruts = newSideStruts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS, oldSideStruts, newSideStruts);
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
	public void setSideStruts(SideStrutsType newSideStruts) {
		if (newSideStruts != sideStruts) {
			NotificationChain msgs = null;
			if (sideStruts != null)
				msgs = ((InternalEObject) sideStruts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS, null, msgs);
			if (newSideStruts != null)
				msgs = ((InternalEObject) newSideStruts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS, null, msgs);
			msgs = basicSetSideStruts(newSideStruts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS,
					newSideStruts, newSideStruts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainActuatorType getMainActuator() {
		return mainActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainActuator(MainActuatorType newMainActuator, NotificationChain msgs) {
		MainActuatorType oldMainActuator = mainActuator;
		mainActuator = newMainActuator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR, oldMainActuator, newMainActuator);
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
	public void setMainActuator(MainActuatorType newMainActuator) {
		if (newMainActuator != mainActuator) {
			NotificationChain msgs = null;
			if (mainActuator != null)
				msgs = ((InternalEObject) mainActuator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR, null, msgs);
			if (newMainActuator != null)
				msgs = ((InternalEObject) newMainActuator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR, null, msgs);
			msgs = basicSetMainActuator(newMainActuator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR,
					newMainActuator, newMainActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BogieType getBogie() {
		return bogie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBogie(BogieType newBogie, NotificationChain msgs) {
		BogieType oldBogie = bogie;
		bogie = newBogie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE, oldBogie, newBogie);
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
	public void setBogie(BogieType newBogie) {
		if (newBogie != bogie) {
			NotificationChain msgs = null;
			if (bogie != null)
				msgs = ((InternalEObject) bogie).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE, null, msgs);
			if (newBogie != null)
				msgs = ((InternalEObject) newBogie).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE, null, msgs);
			msgs = basicSetBogie(newBogie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE, newBogie,
					newBogie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxlesType getAxles() {
		return axles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxles(AxlesType newAxles, NotificationChain msgs) {
		AxlesType oldAxles = axles;
		axles = newAxles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES, oldAxles, newAxles);
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
	public void setAxles(AxlesType newAxles) {
		if (newAxles != axles) {
			NotificationChain msgs = null;
			if (axles != null)
				msgs = ((InternalEObject) axles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES, null, msgs);
			if (newAxles != null)
				msgs = ((InternalEObject) newAxles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES, null, msgs);
			msgs = basicSetAxles(newAxles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES, newAxles,
					newAxles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WheelsType getWheels() {
		return wheels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWheels(WheelsType newWheels, NotificationChain msgs) {
		WheelsType oldWheels = wheels;
		wheels = newWheels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS, oldWheels, newWheels);
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
	public void setWheels(WheelsType newWheels) {
		if (newWheels != wheels) {
			NotificationChain msgs = null;
			if (wheels != null)
				msgs = ((InternalEObject) wheels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS, null, msgs);
			if (newWheels != null)
				msgs = ((InternalEObject) newWheels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS, null, msgs);
			msgs = basicSetWheels(newWheels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS, newWheels,
					newWheels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT:
			return basicSetMainStrut(null, msgs);
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON:
			return basicSetPiston(null, msgs);
		case CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT:
			return basicSetDragStrut(null, msgs);
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT:
			return basicSetPintleStrut(null, msgs);
		case CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS:
			return basicSetSideStruts(null, msgs);
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR:
			return basicSetMainActuator(null, msgs);
		case CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE:
			return basicSetBogie(null, msgs);
		case CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES:
			return basicSetAxles(null, msgs);
		case CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS:
			return basicSetWheels(null, msgs);
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
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT:
			return getMainStrut();
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON:
			return getPiston();
		case CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT:
			return getDragStrut();
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT:
			return getPintleStrut();
		case CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS:
			return getSideStruts();
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR:
			return getMainActuator();
		case CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE:
			return getBogie();
		case CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES:
			return getAxles();
		case CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS:
			return getWheels();
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
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT:
			setMainStrut((StrutType) newValue);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON:
			setPiston((PistonType) newValue);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT:
			setDragStrut((StrutWithActuatorType) newValue);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT:
			setPintleStrut((StrutType) newValue);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS:
			setSideStruts((SideStrutsType) newValue);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR:
			setMainActuator((MainActuatorType) newValue);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE:
			setBogie((BogieType) newValue);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES:
			setAxles((AxlesType) newValue);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS:
			setWheels((WheelsType) newValue);
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
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT:
			setMainStrut((StrutType) null);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON:
			setPiston((PistonType) null);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT:
			setDragStrut((StrutWithActuatorType) null);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT:
			setPintleStrut((StrutType) null);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS:
			setSideStruts((SideStrutsType) null);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR:
			setMainActuator((MainActuatorType) null);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE:
			setBogie((BogieType) null);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES:
			setAxles((AxlesType) null);
			return;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS:
			setWheels((WheelsType) null);
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
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_STRUT:
			return mainStrut != null;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PISTON:
			return piston != null;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__DRAG_STRUT:
			return dragStrut != null;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__PINTLE_STRUT:
			return pintleStrut != null;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__SIDE_STRUTS:
			return sideStruts != null;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__MAIN_ACTUATOR:
			return mainActuator != null;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__BOGIE:
			return bogie != null;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__AXLES:
			return axles != null;
		case CpacsPackage.GEAR_COMPONENTS_TYPE__WHEELS:
			return wheels != null;
		}
		return super.eIsSet(featureID);
	}

} //GearComponentsTypeImpl
