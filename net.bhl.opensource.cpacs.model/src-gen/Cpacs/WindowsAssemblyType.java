/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Windows Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WindowsAssemblyType#getWindow <em>Window</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWindowsAssemblyType()
 * @model extendedMetaData="name='windowsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface WindowsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Window</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WindowAssemblyPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWindowsAssemblyType_Window()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='window' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WindowAssemblyPositionType> getWindow();

} // WindowsAssemblyType
