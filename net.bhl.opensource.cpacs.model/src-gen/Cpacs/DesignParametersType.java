/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DesignParametersType#getDesignParameter <em>Design Parameter</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDesignParametersType()
 * @model extendedMetaData="name='designParametersType' kind='elementOnly'"
 * @generated
 */
public interface DesignParametersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Design Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DesignParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Parameter</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDesignParametersType_DesignParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='designParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DesignParameterType> getDesignParameter();

} // DesignParametersType
