/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DateTimeBaseType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Time Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DateTimeBaseTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link Cpacs.impl.DateTimeBaseTypeImpl#getExternalDataDirectory <em>External Data Directory</em>}</li>
 *   <li>{@link Cpacs.impl.DateTimeBaseTypeImpl#getExternalDataNodePath <em>External Data Node Path</em>}</li>
 *   <li>{@link Cpacs.impl.DateTimeBaseTypeImpl#getExternalFileName <em>External File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateTimeBaseTypeImpl extends MinimalEObjectImpl.Container implements DateTimeBaseType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalDataDirectory() <em>External Data Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DATA_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDataDirectory() <em>External Data Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataDirectory()
	 * @generated
	 * @ordered
	 */
	protected String externalDataDirectory = EXTERNAL_DATA_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalDataNodePath() <em>External Data Node Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataNodePath()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DATA_NODE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDataNodePath() <em>External Data Node Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataNodePath()
	 * @generated
	 * @ordered
	 */
	protected String externalDataNodePath = EXTERNAL_DATA_NODE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalFileName() <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalFileName() <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFileName()
	 * @generated
	 * @ordered
	 */
	protected String externalFileName = EXTERNAL_FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDateTimeBaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(XMLGregorianCalendar newValue) {
		XMLGregorianCalendar oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DATE_TIME_BASE_TYPE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalDataDirectory() {
		return externalDataDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalDataDirectory(String newExternalDataDirectory) {
		String oldExternalDataDirectory = externalDataDirectory;
		externalDataDirectory = newExternalDataDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY, oldExternalDataDirectory,
					externalDataDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalDataNodePath() {
		return externalDataNodePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalDataNodePath(String newExternalDataNodePath) {
		String oldExternalDataNodePath = externalDataNodePath;
		externalDataNodePath = newExternalDataNodePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH, oldExternalDataNodePath,
					externalDataNodePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalFileName() {
		return externalFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalFileName(String newExternalFileName) {
		String oldExternalFileName = externalFileName;
		externalFileName = newExternalFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_FILE_NAME,
					oldExternalFileName, externalFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpacsPackage.DATE_TIME_BASE_TYPE__VALUE:
			return getValue();
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			return getExternalDataDirectory();
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			return getExternalDataNodePath();
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_FILE_NAME:
			return getExternalFileName();
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
		case CpacsPackage.DATE_TIME_BASE_TYPE__VALUE:
			setValue((XMLGregorianCalendar) newValue);
			return;
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			setExternalDataDirectory((String) newValue);
			return;
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			setExternalDataNodePath((String) newValue);
			return;
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_FILE_NAME:
			setExternalFileName((String) newValue);
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
		case CpacsPackage.DATE_TIME_BASE_TYPE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			setExternalDataDirectory(EXTERNAL_DATA_DIRECTORY_EDEFAULT);
			return;
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			setExternalDataNodePath(EXTERNAL_DATA_NODE_PATH_EDEFAULT);
			return;
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_FILE_NAME:
			setExternalFileName(EXTERNAL_FILE_NAME_EDEFAULT);
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
		case CpacsPackage.DATE_TIME_BASE_TYPE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			return EXTERNAL_DATA_DIRECTORY_EDEFAULT == null ? externalDataDirectory != null
					: !EXTERNAL_DATA_DIRECTORY_EDEFAULT.equals(externalDataDirectory);
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			return EXTERNAL_DATA_NODE_PATH_EDEFAULT == null ? externalDataNodePath != null
					: !EXTERNAL_DATA_NODE_PATH_EDEFAULT.equals(externalDataNodePath);
		case CpacsPackage.DATE_TIME_BASE_TYPE__EXTERNAL_FILE_NAME:
			return EXTERNAL_FILE_NAME_EDEFAULT == null ? externalFileName != null
					: !EXTERNAL_FILE_NAME_EDEFAULT.equals(externalFileName);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", externalDataDirectory: ");
		result.append(externalDataDirectory);
		result.append(", externalDataNodePath: ");
		result.append(externalDataNodePath);
		result.append(", externalFileName: ");
		result.append(externalFileName);
		result.append(')');
		return result.toString();
	}

} //DateTimeBaseTypeImpl
