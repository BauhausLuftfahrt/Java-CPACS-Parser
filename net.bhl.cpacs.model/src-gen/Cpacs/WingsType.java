/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingsType#getWing <em>Wing</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingsType()
 * @model extendedMetaData="name='wingsType' kind='elementOnly'"
 * @generated
 */
public interface WingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingsType_Wing()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingType> getWing();

} // WingsType
