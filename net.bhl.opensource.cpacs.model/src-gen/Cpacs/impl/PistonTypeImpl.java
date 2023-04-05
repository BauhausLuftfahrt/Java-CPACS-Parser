/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PistonType;
import Cpacs.StrutPropertiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piston Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PistonTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.PistonTypeImpl#getStrutProperties <em>Strut Properties</em>}</li>
 *   <li>{@link Cpacs.impl.PistonTypeImpl#getMaxSpringDeflection <em>Max Spring Deflection</em>}</li>
 *   <li>{@link Cpacs.impl.PistonTypeImpl#getCompressedExternalLength <em>Compressed External Length</em>}</li>
 *   <li>{@link Cpacs.impl.PistonTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PistonTypeImpl extends ComplexBaseTypeImpl implements PistonType {
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType length;

	/**
	 * The cached value of the '{@link #getStrutProperties() <em>Strut Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrutProperties()
	 * @generated
	 * @ordered
	 */
	protected StrutPropertiesType strutProperties;

	/**
	 * The cached value of the '{@link #getMaxSpringDeflection() <em>Max Spring Deflection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpringDeflection()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType maxSpringDeflection;

	/**
	 * The cached value of the '{@link #getCompressedExternalLength() <em>Compressed External Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedExternalLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType compressedExternalLength;

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
	protected PistonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPistonType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(DoubleBaseType newLength, NotificationChain msgs) {
		DoubleBaseType oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PISTON_TYPE__LENGTH, oldLength, newLength);
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
	public void setLength(DoubleBaseType newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject) length).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PISTON_TYPE__LENGTH, newLength,
					newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutPropertiesType getStrutProperties() {
		return strutProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrutProperties(StrutPropertiesType newStrutProperties, NotificationChain msgs) {
		StrutPropertiesType oldStrutProperties = strutProperties;
		strutProperties = newStrutProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES, oldStrutProperties, newStrutProperties);
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
	public void setStrutProperties(StrutPropertiesType newStrutProperties) {
		if (newStrutProperties != strutProperties) {
			NotificationChain msgs = null;
			if (strutProperties != null)
				msgs = ((InternalEObject) strutProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES, null, msgs);
			if (newStrutProperties != null)
				msgs = ((InternalEObject) newStrutProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES, null, msgs);
			msgs = basicSetStrutProperties(newStrutProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES,
					newStrutProperties, newStrutProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMaxSpringDeflection() {
		return maxSpringDeflection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxSpringDeflection(DoubleBaseType newMaxSpringDeflection,
			NotificationChain msgs) {
		DoubleBaseType oldMaxSpringDeflection = maxSpringDeflection;
		maxSpringDeflection = newMaxSpringDeflection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION, oldMaxSpringDeflection, newMaxSpringDeflection);
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
	public void setMaxSpringDeflection(DoubleBaseType newMaxSpringDeflection) {
		if (newMaxSpringDeflection != maxSpringDeflection) {
			NotificationChain msgs = null;
			if (maxSpringDeflection != null)
				msgs = ((InternalEObject) maxSpringDeflection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION, null, msgs);
			if (newMaxSpringDeflection != null)
				msgs = ((InternalEObject) newMaxSpringDeflection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION, null, msgs);
			msgs = basicSetMaxSpringDeflection(newMaxSpringDeflection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION,
					newMaxSpringDeflection, newMaxSpringDeflection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCompressedExternalLength() {
		return compressedExternalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompressedExternalLength(DoubleBaseType newCompressedExternalLength,
			NotificationChain msgs) {
		DoubleBaseType oldCompressedExternalLength = compressedExternalLength;
		compressedExternalLength = newCompressedExternalLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH, oldCompressedExternalLength,
					newCompressedExternalLength);
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
	public void setCompressedExternalLength(DoubleBaseType newCompressedExternalLength) {
		if (newCompressedExternalLength != compressedExternalLength) {
			NotificationChain msgs = null;
			if (compressedExternalLength != null)
				msgs = ((InternalEObject) compressedExternalLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH, null, msgs);
			if (newCompressedExternalLength != null)
				msgs = ((InternalEObject) newCompressedExternalLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH, null, msgs);
			msgs = basicSetCompressedExternalLength(newCompressedExternalLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH,
					newCompressedExternalLength, newCompressedExternalLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PISTON_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PISTON_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES:
			return basicSetStrutProperties(null, msgs);
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			return basicSetMaxSpringDeflection(null, msgs);
		case CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH:
			return basicSetCompressedExternalLength(null, msgs);
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
		case CpacsPackage.PISTON_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES:
			return getStrutProperties();
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			return getMaxSpringDeflection();
		case CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH:
			return getCompressedExternalLength();
		case CpacsPackage.PISTON_TYPE__UID:
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
		case CpacsPackage.PISTON_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES:
			setStrutProperties((StrutPropertiesType) newValue);
			return;
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			setMaxSpringDeflection((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH:
			setCompressedExternalLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PISTON_TYPE__UID:
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
		case CpacsPackage.PISTON_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES:
			setStrutProperties((StrutPropertiesType) null);
			return;
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			setMaxSpringDeflection((DoubleBaseType) null);
			return;
		case CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH:
			setCompressedExternalLength((DoubleBaseType) null);
			return;
		case CpacsPackage.PISTON_TYPE__UID:
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
		case CpacsPackage.PISTON_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.PISTON_TYPE__STRUT_PROPERTIES:
			return strutProperties != null;
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			return maxSpringDeflection != null;
		case CpacsPackage.PISTON_TYPE__COMPRESSED_EXTERNAL_LENGTH:
			return compressedExternalLength != null;
		case CpacsPackage.PISTON_TYPE__UID:
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

} //PistonTypeImpl
