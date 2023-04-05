/**
 */
package Cpacs.impl;

import Cpacs.AxleType;
import Cpacs.BogieType;
import Cpacs.CpacsPackage;
import Cpacs.LandingGearComponentAssemblyType;
import Cpacs.MainActuatorType;
import Cpacs.PintleStrutsType;
import Cpacs.PistonType;
import Cpacs.SideStrutsType;
import Cpacs.StrutAssemblyType;
import Cpacs.StrutType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Component Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearComponentAssemblyTypeImpl#getMainStrut <em>Main Strut</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearComponentAssemblyTypeImpl#getPiston <em>Piston</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearComponentAssemblyTypeImpl#getAxle <em>Axle</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearComponentAssemblyTypeImpl#getBogie <em>Bogie</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearComponentAssemblyTypeImpl#getDragStrut <em>Drag Strut</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearComponentAssemblyTypeImpl#getPintleStruts <em>Pintle Struts</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearComponentAssemblyTypeImpl#getSideStruts <em>Side Struts</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearComponentAssemblyTypeImpl#getMainActuator <em>Main Actuator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearComponentAssemblyTypeImpl extends MinimalEObjectImpl.Container
		implements LandingGearComponentAssemblyType {
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
	 * The cached value of the '{@link #getAxle() <em>Axle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxle()
	 * @generated
	 * @ordered
	 */
	protected AxleType axle;

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
	 * The cached value of the '{@link #getDragStrut() <em>Drag Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDragStrut()
	 * @generated
	 * @ordered
	 */
	protected StrutAssemblyType dragStrut;

	/**
	 * The cached value of the '{@link #getPintleStruts() <em>Pintle Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPintleStruts()
	 * @generated
	 * @ordered
	 */
	protected PintleStrutsType pintleStruts;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearComponentAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearComponentAssemblyType();
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
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT, oldMainStrut, newMainStrut);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT, null,
						msgs);
			if (newMainStrut != null)
				msgs = ((InternalEObject) newMainStrut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT, null,
						msgs);
			msgs = basicSetMainStrut(newMainStrut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT, newMainStrut, newMainStrut));
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
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON, oldPiston, newPiston);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON, null, msgs);
			if (newPiston != null)
				msgs = ((InternalEObject) newPiston).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON, null, msgs);
			msgs = basicSetPiston(newPiston, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON, newPiston, newPiston));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxleType getAxle() {
		return axle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxle(AxleType newAxle, NotificationChain msgs) {
		AxleType oldAxle = axle;
		axle = newAxle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE, oldAxle, newAxle);
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
	public void setAxle(AxleType newAxle) {
		if (newAxle != axle) {
			NotificationChain msgs = null;
			if (axle != null)
				msgs = ((InternalEObject) axle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE, null, msgs);
			if (newAxle != null)
				msgs = ((InternalEObject) newAxle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE, null, msgs);
			msgs = basicSetAxle(newAxle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE, newAxle, newAxle));
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
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE, oldBogie, newBogie);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE, null, msgs);
			if (newBogie != null)
				msgs = ((InternalEObject) newBogie).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE, null, msgs);
			msgs = basicSetBogie(newBogie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE, newBogie, newBogie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutAssemblyType getDragStrut() {
		return dragStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDragStrut(StrutAssemblyType newDragStrut, NotificationChain msgs) {
		StrutAssemblyType oldDragStrut = dragStrut;
		dragStrut = newDragStrut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT, oldDragStrut, newDragStrut);
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
	public void setDragStrut(StrutAssemblyType newDragStrut) {
		if (newDragStrut != dragStrut) {
			NotificationChain msgs = null;
			if (dragStrut != null)
				msgs = ((InternalEObject) dragStrut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT, null,
						msgs);
			if (newDragStrut != null)
				msgs = ((InternalEObject) newDragStrut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT, null,
						msgs);
			msgs = basicSetDragStrut(newDragStrut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT, newDragStrut, newDragStrut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PintleStrutsType getPintleStruts() {
		return pintleStruts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPintleStruts(PintleStrutsType newPintleStruts, NotificationChain msgs) {
		PintleStrutsType oldPintleStruts = pintleStruts;
		pintleStruts = newPintleStruts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS, oldPintleStruts, newPintleStruts);
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
	public void setPintleStruts(PintleStrutsType newPintleStruts) {
		if (newPintleStruts != pintleStruts) {
			NotificationChain msgs = null;
			if (pintleStruts != null)
				msgs = ((InternalEObject) pintleStruts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS, null,
						msgs);
			if (newPintleStruts != null)
				msgs = ((InternalEObject) newPintleStruts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS, null,
						msgs);
			msgs = basicSetPintleStruts(newPintleStruts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS, newPintleStruts,
					newPintleStruts));
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
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS, oldSideStruts, newSideStruts);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS, null,
						msgs);
			if (newSideStruts != null)
				msgs = ((InternalEObject) newSideStruts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS, null,
						msgs);
			msgs = basicSetSideStruts(newSideStruts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS, newSideStruts, newSideStruts));
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
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR, oldMainActuator, newMainActuator);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR, null,
						msgs);
			if (newMainActuator != null)
				msgs = ((InternalEObject) newMainActuator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR, null,
						msgs);
			msgs = basicSetMainActuator(newMainActuator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR, newMainActuator,
					newMainActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT:
			return basicSetMainStrut(null, msgs);
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON:
			return basicSetPiston(null, msgs);
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE:
			return basicSetAxle(null, msgs);
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE:
			return basicSetBogie(null, msgs);
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT:
			return basicSetDragStrut(null, msgs);
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS:
			return basicSetPintleStruts(null, msgs);
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS:
			return basicSetSideStruts(null, msgs);
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR:
			return basicSetMainActuator(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT:
			return getMainStrut();
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON:
			return getPiston();
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE:
			return getAxle();
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE:
			return getBogie();
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT:
			return getDragStrut();
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS:
			return getPintleStruts();
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS:
			return getSideStruts();
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR:
			return getMainActuator();
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
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT:
			setMainStrut((StrutType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON:
			setPiston((PistonType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE:
			setAxle((AxleType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE:
			setBogie((BogieType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT:
			setDragStrut((StrutAssemblyType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS:
			setPintleStruts((PintleStrutsType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS:
			setSideStruts((SideStrutsType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR:
			setMainActuator((MainActuatorType) newValue);
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
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT:
			setMainStrut((StrutType) null);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON:
			setPiston((PistonType) null);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE:
			setAxle((AxleType) null);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE:
			setBogie((BogieType) null);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT:
			setDragStrut((StrutAssemblyType) null);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS:
			setPintleStruts((PintleStrutsType) null);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS:
			setSideStruts((SideStrutsType) null);
			return;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR:
			setMainActuator((MainActuatorType) null);
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
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_STRUT:
			return mainStrut != null;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PISTON:
			return piston != null;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__AXLE:
			return axle != null;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__BOGIE:
			return bogie != null;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__DRAG_STRUT:
			return dragStrut != null;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__PINTLE_STRUTS:
			return pintleStruts != null;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__SIDE_STRUTS:
			return sideStruts != null;
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE__MAIN_ACTUATOR:
			return mainActuator != null;
		}
		return super.eIsSet(featureID);
	}

} //LandingGearComponentAssemblyTypeImpl
