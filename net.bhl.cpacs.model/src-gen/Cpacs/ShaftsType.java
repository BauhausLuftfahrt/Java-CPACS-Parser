/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shafts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ShaftsType#getShaft <em>Shaft</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getShaftsType()
 * @model extendedMetaData="name='shaftsType' kind='elementOnly'"
 * @generated
 */
public interface ShaftsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Shaft</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ShaftType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getShaftsType_Shaft()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='shaft' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShaftType> getShaft();

} // ShaftsType
