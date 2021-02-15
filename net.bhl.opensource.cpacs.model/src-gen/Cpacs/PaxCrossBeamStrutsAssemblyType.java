/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pax Cross Beam Struts Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PaxCrossBeamStrutsAssemblyType#getPaxCrossBeamStrut <em>Pax Cross Beam Strut</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPaxCrossBeamStrutsAssemblyType()
 * @model extendedMetaData="name='paxCrossBeamStrutsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface PaxCrossBeamStrutsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pax Cross Beam Strut</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CrossBeamStrutAssemblyPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Cross Beam Strut</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPaxCrossBeamStrutsAssemblyType_PaxCrossBeamStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paxCrossBeamStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CrossBeamStrutAssemblyPositionType> getPaxCrossBeamStrut();

} // PaxCrossBeamStrutsAssemblyType
