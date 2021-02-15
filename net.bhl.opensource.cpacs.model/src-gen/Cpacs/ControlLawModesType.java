/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Law Modes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlLawModesType#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlLawModesType()
 * @model extendedMetaData="name='controlLawModesType' kind='elementOnly'"
 * @generated
 */
public interface ControlLawModesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlLawModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlLawModesType_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlLawModeType> getMode();

} // ControlLawModesType
