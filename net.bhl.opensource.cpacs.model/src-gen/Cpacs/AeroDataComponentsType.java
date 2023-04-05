/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Data Components Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroDataComponentsType#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroDataComponentsType()
 * @model extendedMetaData="name='aeroDataComponentsType' kind='elementOnly'"
 * @generated
 */
public interface AeroDataComponentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AeroDataComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAeroDataComponentsType_Component()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AeroDataComponentType> getComponent();

} // AeroDataComponentsType
