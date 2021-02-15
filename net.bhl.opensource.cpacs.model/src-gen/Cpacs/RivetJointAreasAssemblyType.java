/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rivet Joint Areas Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RivetJointAreasAssemblyType#getRivetJointArea <em>Rivet Joint Area</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRivetJointAreasAssemblyType()
 * @model extendedMetaData="name='rivetJointAreasAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface RivetJointAreasAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rivet Joint Area</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RivetJointAreaAssemblyPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rivet Joint Area</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRivetJointAreasAssemblyType_RivetJointArea()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rivetJointArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RivetJointAreaAssemblyPositionType> getRivetJointArea();

} // RivetJointAreasAssemblyType
