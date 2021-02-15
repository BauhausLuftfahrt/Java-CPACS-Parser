/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drive Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DriveSystemsType#getDriveSystem <em>Drive System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDriveSystemsType()
 * @model extendedMetaData="name='driveSystemsType' kind='elementOnly'"
 * @generated
 */
public interface DriveSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Drive System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DriveSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDriveSystemsType_DriveSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='driveSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DriveSystemType> getDriveSystem();

} // DriveSystemsType
