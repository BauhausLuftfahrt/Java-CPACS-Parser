/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DesignStudiesType;
import Cpacs.ParametersType;
import Cpacs.StudiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Studies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StudiesTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link Cpacs.impl.StudiesTypeImpl#getDesignStudies <em>Design Studies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudiesTypeImpl extends ComplexBaseTypeImpl implements StudiesType {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParametersType parameters;

	/**
	 * The cached value of the '{@link #getDesignStudies() <em>Design Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignStudies()
	 * @generated
	 * @ordered
	 */
	protected DesignStudiesType designStudies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStudiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersType getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
		ParametersType oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STUDIES_TYPE__PARAMETERS, oldParameters, newParameters);
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
	public void setParameters(ParametersType newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject) parameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STUDIES_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject) newParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STUDIES_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STUDIES_TYPE__PARAMETERS, newParameters,
					newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignStudiesType getDesignStudies() {
		return designStudies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignStudies(DesignStudiesType newDesignStudies, NotificationChain msgs) {
		DesignStudiesType oldDesignStudies = designStudies;
		designStudies = newDesignStudies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES, oldDesignStudies, newDesignStudies);
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
	public void setDesignStudies(DesignStudiesType newDesignStudies) {
		if (newDesignStudies != designStudies) {
			NotificationChain msgs = null;
			if (designStudies != null)
				msgs = ((InternalEObject) designStudies).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES, null, msgs);
			if (newDesignStudies != null)
				msgs = ((InternalEObject) newDesignStudies).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES, null, msgs);
			msgs = basicSetDesignStudies(newDesignStudies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES,
					newDesignStudies, newDesignStudies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STUDIES_TYPE__PARAMETERS:
			return basicSetParameters(null, msgs);
		case CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES:
			return basicSetDesignStudies(null, msgs);
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
		case CpacsPackage.STUDIES_TYPE__PARAMETERS:
			return getParameters();
		case CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES:
			return getDesignStudies();
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
		case CpacsPackage.STUDIES_TYPE__PARAMETERS:
			setParameters((ParametersType) newValue);
			return;
		case CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES:
			setDesignStudies((DesignStudiesType) newValue);
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
		case CpacsPackage.STUDIES_TYPE__PARAMETERS:
			setParameters((ParametersType) null);
			return;
		case CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES:
			setDesignStudies((DesignStudiesType) null);
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
		case CpacsPackage.STUDIES_TYPE__PARAMETERS:
			return parameters != null;
		case CpacsPackage.STUDIES_TYPE__DESIGN_STUDIES:
			return designStudies != null;
		}
		return super.eIsSet(featureID);
	}

} //StudiesTypeImpl
