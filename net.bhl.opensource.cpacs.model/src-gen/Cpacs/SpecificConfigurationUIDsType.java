/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Configuration UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpecificConfigurationUIDsType#getSpecificConfigurationsUID <em>Specific Configurations UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpecificConfigurationUIDsType()
 * @model extendedMetaData="name='specificConfigurationUIDsType' kind='elementOnly'"
 * @generated
 */
public interface SpecificConfigurationUIDsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Specific Configurations UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SpecificConfigurationUIDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Configurations UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSpecificConfigurationUIDsType_SpecificConfigurationsUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specificConfigurationsUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecificConfigurationUIDType> getSpecificConfigurationsUID();

} // SpecificConfigurationUIDsType
