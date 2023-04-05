/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Infos Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VersionInfosType#getVersionInfo <em>Version Info</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVersionInfosType()
 * @model extendedMetaData="name='versionInfosType' kind='elementOnly'"
 * @generated
 */
public interface VersionInfosType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Version Info</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.VersionInfoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Info</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getVersionInfosType_VersionInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='versionInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersionInfoType> getVersionInfo();

} // VersionInfosType
