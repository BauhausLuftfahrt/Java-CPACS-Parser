/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EngineAnalysisType;
import Cpacs.EngineGeometryType;
import Cpacs.EngineGlobalType;
import Cpacs.EngineNacelleType;
import Cpacs.EngineType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.EngineTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.EngineTypeImpl#getThrust00Scaling <em>Thrust00 Scaling</em>}</li>
 *   <li>{@link Cpacs.impl.EngineTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link Cpacs.impl.EngineTypeImpl#getNacelle <em>Nacelle</em>}</li>
 *   <li>{@link Cpacs.impl.EngineTypeImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.impl.EngineTypeImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link Cpacs.impl.EngineTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineTypeImpl extends ComplexBaseTypeImpl implements EngineType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getThrust00Scaling() <em>Thrust00 Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrust00Scaling()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thrust00Scaling;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected EngineGeometryType geometry;

	/**
	 * The cached value of the '{@link #getNacelle() <em>Nacelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNacelle()
	 * @generated
	 * @ordered
	 */
	protected EngineNacelleType nacelle;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected EngineGlobalType global;

	/**
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EngineAnalysisType analysis;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_TYPE__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThrust00Scaling() {
		return thrust00Scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrust00Scaling(DoubleBaseType newThrust00Scaling, NotificationChain msgs) {
		DoubleBaseType oldThrust00Scaling = thrust00Scaling;
		thrust00Scaling = newThrust00Scaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_TYPE__THRUST00_SCALING, oldThrust00Scaling, newThrust00Scaling);
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
	public void setThrust00Scaling(DoubleBaseType newThrust00Scaling) {
		if (newThrust00Scaling != thrust00Scaling) {
			NotificationChain msgs = null;
			if (thrust00Scaling != null)
				msgs = ((InternalEObject) thrust00Scaling).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__THRUST00_SCALING, null, msgs);
			if (newThrust00Scaling != null)
				msgs = ((InternalEObject) newThrust00Scaling).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__THRUST00_SCALING, null, msgs);
			msgs = basicSetThrust00Scaling(newThrust00Scaling, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_TYPE__THRUST00_SCALING,
					newThrust00Scaling, newThrust00Scaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineGeometryType getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(EngineGeometryType newGeometry, NotificationChain msgs) {
		EngineGeometryType oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_TYPE__GEOMETRY, oldGeometry, newGeometry);
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
	public void setGeometry(EngineGeometryType newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject) geometry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject) newGeometry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_TYPE__GEOMETRY, newGeometry,
					newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineNacelleType getNacelle() {
		return nacelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNacelle(EngineNacelleType newNacelle, NotificationChain msgs) {
		EngineNacelleType oldNacelle = nacelle;
		nacelle = newNacelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_TYPE__NACELLE, oldNacelle, newNacelle);
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
	public void setNacelle(EngineNacelleType newNacelle) {
		if (newNacelle != nacelle) {
			NotificationChain msgs = null;
			if (nacelle != null)
				msgs = ((InternalEObject) nacelle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__NACELLE, null, msgs);
			if (newNacelle != null)
				msgs = ((InternalEObject) newNacelle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__NACELLE, null, msgs);
			msgs = basicSetNacelle(newNacelle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_TYPE__NACELLE, newNacelle,
					newNacelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineGlobalType getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobal(EngineGlobalType newGlobal, NotificationChain msgs) {
		EngineGlobalType oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_TYPE__GLOBAL, oldGlobal, newGlobal);
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
	public void setGlobal(EngineGlobalType newGlobal) {
		if (newGlobal != global) {
			NotificationChain msgs = null;
			if (global != null)
				msgs = ((InternalEObject) global).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__GLOBAL, null, msgs);
			if (newGlobal != null)
				msgs = ((InternalEObject) newGlobal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__GLOBAL, null, msgs);
			msgs = basicSetGlobal(newGlobal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_TYPE__GLOBAL, newGlobal,
					newGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineAnalysisType getAnalysis() {
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysis(EngineAnalysisType newAnalysis, NotificationChain msgs) {
		EngineAnalysisType oldAnalysis = analysis;
		analysis = newAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_TYPE__ANALYSIS, oldAnalysis, newAnalysis);
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
	public void setAnalysis(EngineAnalysisType newAnalysis) {
		if (newAnalysis != analysis) {
			NotificationChain msgs = null;
			if (analysis != null)
				msgs = ((InternalEObject) analysis).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__ANALYSIS, null, msgs);
			if (newAnalysis != null)
				msgs = ((InternalEObject) newAnalysis).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_TYPE__ANALYSIS, null, msgs);
			msgs = basicSetAnalysis(newAnalysis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_TYPE__ANALYSIS, newAnalysis,
					newAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.ENGINE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.ENGINE_TYPE__THRUST00_SCALING:
			return basicSetThrust00Scaling(null, msgs);
		case CpacsPackage.ENGINE_TYPE__GEOMETRY:
			return basicSetGeometry(null, msgs);
		case CpacsPackage.ENGINE_TYPE__NACELLE:
			return basicSetNacelle(null, msgs);
		case CpacsPackage.ENGINE_TYPE__GLOBAL:
			return basicSetGlobal(null, msgs);
		case CpacsPackage.ENGINE_TYPE__ANALYSIS:
			return basicSetAnalysis(null, msgs);
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
		case CpacsPackage.ENGINE_TYPE__NAME:
			return getName();
		case CpacsPackage.ENGINE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.ENGINE_TYPE__THRUST00_SCALING:
			return getThrust00Scaling();
		case CpacsPackage.ENGINE_TYPE__GEOMETRY:
			return getGeometry();
		case CpacsPackage.ENGINE_TYPE__NACELLE:
			return getNacelle();
		case CpacsPackage.ENGINE_TYPE__GLOBAL:
			return getGlobal();
		case CpacsPackage.ENGINE_TYPE__ANALYSIS:
			return getAnalysis();
		case CpacsPackage.ENGINE_TYPE__UID:
			return getUID();
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
		case CpacsPackage.ENGINE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_TYPE__THRUST00_SCALING:
			setThrust00Scaling((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_TYPE__GEOMETRY:
			setGeometry((EngineGeometryType) newValue);
			return;
		case CpacsPackage.ENGINE_TYPE__NACELLE:
			setNacelle((EngineNacelleType) newValue);
			return;
		case CpacsPackage.ENGINE_TYPE__GLOBAL:
			setGlobal((EngineGlobalType) newValue);
			return;
		case CpacsPackage.ENGINE_TYPE__ANALYSIS:
			setAnalysis((EngineAnalysisType) newValue);
			return;
		case CpacsPackage.ENGINE_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.ENGINE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.ENGINE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.ENGINE_TYPE__THRUST00_SCALING:
			setThrust00Scaling((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_TYPE__GEOMETRY:
			setGeometry((EngineGeometryType) null);
			return;
		case CpacsPackage.ENGINE_TYPE__NACELLE:
			setNacelle((EngineNacelleType) null);
			return;
		case CpacsPackage.ENGINE_TYPE__GLOBAL:
			setGlobal((EngineGlobalType) null);
			return;
		case CpacsPackage.ENGINE_TYPE__ANALYSIS:
			setAnalysis((EngineAnalysisType) null);
			return;
		case CpacsPackage.ENGINE_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.ENGINE_TYPE__NAME:
			return name != null;
		case CpacsPackage.ENGINE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.ENGINE_TYPE__THRUST00_SCALING:
			return thrust00Scaling != null;
		case CpacsPackage.ENGINE_TYPE__GEOMETRY:
			return geometry != null;
		case CpacsPackage.ENGINE_TYPE__NACELLE:
			return nacelle != null;
		case CpacsPackage.ENGINE_TYPE__GLOBAL:
			return global != null;
		case CpacsPackage.ENGINE_TYPE__ANALYSIS:
			return analysis != null;
		case CpacsPackage.ENGINE_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //EngineTypeImpl
