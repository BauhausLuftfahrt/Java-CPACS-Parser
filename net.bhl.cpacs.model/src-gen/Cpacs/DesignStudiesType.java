/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Studies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DesignStudiesType#getDesignSpace <em>Design Space</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDesignStudiesType()
 * @model extendedMetaData="name='designStudiesType' kind='elementOnly'"
 * @generated
 */
public interface DesignStudiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Design Space</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DesignSpaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Space</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDesignStudiesType_DesignSpace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='designSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DesignSpaceType> getDesignSpace();

} // DesignStudiesType
