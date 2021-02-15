/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cargo Cross Beam Struts Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CargoCrossBeamStrutsAssemblyType#getCargoCrossBeamStrut <em>Cargo Cross Beam Strut</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCargoCrossBeamStrutsAssemblyType()
 * @model extendedMetaData="name='cargoCrossBeamStrutsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface CargoCrossBeamStrutsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cargo Cross Beam Strut</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CrossBeamStrutAssemblyPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Cross Beam Strut</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCargoCrossBeamStrutsAssemblyType_CargoCrossBeamStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cargoCrossBeamStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CrossBeamStrutAssemblyPositionType> getCargoCrossBeamStrut();

} // CargoCrossBeamStrutsAssemblyType
